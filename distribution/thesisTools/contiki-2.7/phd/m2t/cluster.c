#include "contiki.h"
#include "net/rime.h"
#include "random.h"
#include "sys/ctimer.h"
#include <stdio.h>

#include "wsn.h"
//#include "runtime.h"

#define DEBUG 0
#if DEBUG
#include <stdio.h>
#define PRINTF(...) printf(__VA_ARGS__)
#else
#define PRINTF(...)
#endif

#define CLUSTER_MEMBER_MAX 10
#define MIN_NEIGHBORS 3
typedef enum  {
    CH_ELECTION,
    CH_RESIGNATION,
    CM_JOIN_REQUEST,
    CM_JOIN_ACCEPT,
	CM_JOIN_DECLINE
} cluster_msg_t;

struct clusterMsg {
	cluster_msg_t msg;
	uint16_t votes;
	rimeaddr_t ch;
	rimeaddr_t cm;
};

uint16_t self_votes;
struct clusterMsg clusterMsg;
uint8_t cluster_cm_count = 0;

struct ctimer electionTm;
struct ctimer tenureTm;
struct ctimer joinTm;

/*---------------------------------------------------------------------------*/
PROCESS(cluster_process, "Clustering");
static struct broadcast_conn broadcast;
/*---------------------------------------------------------------------------*/
static void
tenureExpired_callback(void *in)
{
	self_ch = 0;

#if WSNSIM == 1
	printf("#A color=WHITE\n");
	printf("#A ch\n");				//remove attribute
#endif

	clusterMsg.msg = CH_RESIGNATION;
	PROCESS_CONTEXT_BEGIN(&cluster_process);
	packetbuf_copyfrom(&clusterMsg, sizeof(clusterMsg));
	broadcast_send(&broadcast);
	PROCESS_CONTEXT_END(&cluster_process);

	PRINTF("Am resigning...\n");
}

static void
electionTm_callback(void *in)
{
    self_ch = 1;
    cluster_cm_count = 0;
    ctimer_set(&tenureTm, CLOCK_SECOND*3600, tenureExpired_callback, (void*)NULL);	//start tenure

    PRINTF("Won election! Am CH...\n");

#if WSNSIM == 1
    printf("#A cm\n");	//remove attribute
    printf("#A color=GREEN\n");
    printf("#A ch=me\n");
#endif
}

static void
joinTm_callback(void *in)
{
	cluster_join();
}

uint8_t getVotes()
{
	return (3*self_battery + 100*self_neighbors);
}
/*----------------------------- cluster interface ---------------------------*/
void cluster_init()
{
	if (facts_AnyCH() == 1 && self_ch == 0 && self_cm == 0) {	//if there's ch and is not me and have no cluster membership, then I shd ask for cm
		PRINTF("CH available, request membership\n");
		ctimer_set(&joinTm, CLOCK_SECOND*5, joinTm_callback, (void*)NULL);
		return;	//initiate join
	//} else if (facts_AnyCH() == 0 && self_ch == 0) {	//no ch and am not ch, hence initiate election
	} else if (facts_AnyCH() == 0 && self_ch == 0 && self_neighbors > MIN_NEIGHBORS) {	//no ch and am not ch and I have at least 2 neighbors, hence initiate election

		clusterMsg.msg = CH_ELECTION;
		clusterMsg.votes = getVotes();
		PROCESS_CONTEXT_BEGIN(&cluster_process);
		packetbuf_copyfrom(&clusterMsg, sizeof(clusterMsg));
		broadcast_send(&broadcast);
		PROCESS_CONTEXT_END(&cluster_process);

		ctimer_set(&electionTm, CLOCK_SECOND*2, electionTm_callback, (void*)NULL);
	}
}

void cluster_join()
{
	clusterMsg.msg = CM_JOIN_REQUEST;
	PROCESS_CONTEXT_BEGIN(&cluster_process);
	packetbuf_copyfrom(&clusterMsg, sizeof(clusterMsg));
	broadcast_send(&broadcast);
	PROCESS_CONTEXT_END(&cluster_process);
}
/*---------------------------------------------------------------------------*/
static void
broadcast_recv(struct broadcast_conn *c, const rimeaddr_t *from)
{
	memcpy(&clusterMsg, packetbuf_dataptr(), packetbuf_datalen());

	PRINTF("Cluster message from %d.%d: type = %u\n",
	         from->u8[0], from->u8[1], clusterMsg.msg);

	if (clusterMsg.msg == CH_ELECTION) {

		if (getVotes() < clusterMsg.votes) {	//lost election?
			ctimer_stop(&electionTm);
			self_ch = 0;
			PRINTF("I lost the election!....\n");
#if WSNSIM == 1
			printf("#A ch\n");
			printf("#A color=WHITE\n");
#endif
		} else if (getVotes() == clusterMsg.votes && rimeaddr_node_addr.u8[0] < from->u8[0]) {	//tie in election but lost due to id. ToDo: merge for first "if"
			ctimer_stop(&electionTm);
			self_ch = 0;
			PRINTF("I lost the election under tie breaker!....\n");
#if WSNSIM == 1
			printf("#A ch\n");
			printf("#A color=WHITE\n");
#endif
		//} else {				//I could win this election, so send my votes
		} else if (self_neighbors > MIN_NEIGHBORS) {				//and am eligible (> 2 neighbors) I could win this election, so send my votes
			clusterMsg.votes = getVotes();
			clusterMsg.msg = CH_ELECTION;
			packetbuf_copyfrom(&clusterMsg, sizeof(clusterMsg));
			broadcast_send(&broadcast);
			ctimer_set(&electionTm, CLOCK_SECOND*2, electionTm_callback, (void*)NULL);
		}
	} else if (clusterMsg.msg == CM_JOIN_REQUEST && self_ch == 1) {	//I must be the ch to entertain join request

		if (cluster_cm_count <= CLUSTER_MEMBER_MAX) {
			clusterMsg.msg = CM_JOIN_ACCEPT;
			cluster_cm_count++;
		} else {
			clusterMsg.msg = CM_JOIN_DECLINE;
		}

		rimeaddr_copy(&clusterMsg.ch, &rimeaddr_node_addr);		//let the requester know the ch. ?? what about "from" on the requester side
		rimeaddr_copy(&clusterMsg.cm, from);					//to ensure that only the node requesting join use this msg
		packetbuf_copyfrom(&clusterMsg, sizeof(clusterMsg));
		broadcast_send(&broadcast);

	} else if (clusterMsg.msg == CH_RESIGNATION) {

		if (rimeaddr_cmp(from, &my_ch_addr) != 0) {						//my ch is resigning, so I gat to move on
			self_cm = 0;
			cluster_init();
#if WSNSIM == 1
			printf("#A cm\n");
#endif
		}

	} else if (clusterMsg.msg == CM_JOIN_ACCEPT) {

		if (rimeaddr_cmp(&clusterMsg.cm, &rimeaddr_node_addr) != 0) {	//join acceptance for me
			self_cm = (clusterMsg.ch).u8[0];
			rimeaddr_copy(&my_ch_addr, from);
#if WSNSIM == 1
			printf("#A ch\n");
			printf("#A cm\n");
			printf("#A cm=node(%u);BLUE\n", self_cm);
#endif
		}

	} else if (clusterMsg.msg == CM_JOIN_DECLINE) {
		self_cm = 0;
		ctimer_set(&joinTm, CLOCK_SECOND*5, joinTm_callback, (void*)NULL); //try again after x time. Start a timer here
	}
}
static const struct broadcast_callbacks broadcast_call = {broadcast_recv};

/*---------------------------------------------------------------------------*/
PROCESS_THREAD(cluster_process, ev, data)
{
  static struct etimer et;

  PROCESS_EXITHANDLER(broadcast_close(&broadcast);)

  PROCESS_BEGIN();
  broadcast_open(&broadcast, 131, &broadcast_call);

  while(1) {

    etimer_set(&et, CLOCK_SECOND * 30 + random_rand() % (CLOCK_SECOND * 60));
    PROCESS_WAIT_EVENT_UNTIL(etimer_expired(&et));

    cluster_init();	//check whether we still have a ch

    PRINTF("Joined cluster = %u, with cluster head %u.%u\n", self_cm, my_ch_addr.u8[0], my_ch_addr.u8[1]);

  }

  PROCESS_END();
}
/*---------------------------------------------------------------------------*/
void cluster_start() {
	process_start(&cluster_process, NULL);
}
