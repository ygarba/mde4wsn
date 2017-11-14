#include "contiki.h"
#include "powertrace.h"
#include <stdio.h>
#include <string.h>
#include "net/rime.h"
#include "net/rime/collect.h"

static struct collect_conn tc;

#define LOGGING_COUNT 5	//which is the # of pckts sent since pckt send rate is 1pckt/sec

PROCESS(optimization_process, "Optimization process");
/*---------------------------------------------------------------------------*/
uint16_t all_total_received = 0;

/*
static void
broadcast_recv(struct broadcast_conn *c, const rimeaddr_t *from)
{
  rimeaddr_t sink_addr;
  sink_addr.u8[0] = 1;
  sink_addr.u8[1] = 0;
  if (!rimeaddr_cmp(&sink_addr, &rimeaddr_node_addr)) {	//if am not sink
	 return;
  }
  
  all_total_received++;
  printf("packet received from %d.%d, total received (all) %d\n", from->u8[0], from->u8[1], all_total_received);
}

static const struct broadcast_callbacks broadcast_call = {broadcast_recv};
static struct broadcast_conn broadcast;
*/
static void
recv(const rimeaddr_t *originator, uint8_t seqno, uint8_t hops)
{
	all_total_received++;
	printf("Received packet count: %d\n", all_total_received);
	//printf("packet received from %d.%d, total received (all) %d\n", from->u8[0], from->u8[1], all_total_received);
}
static const struct collect_callbacks callbacks = { recv };
/*---------------------------------------------------------------------------*/

PROCESS_THREAD(optimization_process, ev, data)
{
  static struct etimer et;
  //static struct etimer periodic;
  static uint16_t seqno = 0;
  rimeaddr_t addr;

  //PROCESS_EXITHANDLER(broadcast_close(&broadcast);)

  PROCESS_BEGIN();
  //broadcast_open(&broadcast, 159, &broadcast_call);
  collect_open(&tc, 159, COLLECT_ROUTER, &callbacks);

  if(rimeaddr_node_addr.u8[0] == 1 && rimeaddr_node_addr.u8[1] == 0) {
	  printf("I am optimization sink...\n");
	  collect_set_sink(&tc, 1);
  }

  /* Allow some time for the network to settle. */
  printf("Optimization: waiting for network to settle..\n");
  etimer_set(&et, 30 * CLOCK_SECOND);	//was 60 * CLOCK_SECOND
  PROCESS_WAIT_UNTIL(etimer_expired(&et));
  powertrace_start(CLOCK_SECOND*2);
  while(1) {

    #define NEW_CLOCK_SECOND CLOCK_SECOND
	etimer_set(&et, NEW_CLOCK_SECOND + (random_rand() % (NEW_CLOCK_SECOND)));

    PROCESS_WAIT_EVENT_UNTIL(etimer_expired(&et));
    
    seqno++;
	
	//packetbuf_copyfrom("Hello", 6);
	addr.u8[0] = 1;
	addr.u8[1] = 0;
	if (rimeaddr_cmp(&addr, &rimeaddr_node_addr) == 0) {	//if am not sink

		if (seqno <= LOGGING_COUNT) {
			//broadcast_send(&broadcast);;
			packetbuf_clear();
			packetbuf_set_datalen(sprintf(packetbuf_dataptr(), "%s", "Hello") + 1);
			collect_send(&tc, 15);
			//printf("Packet sent to sink..\n");
		}
		
		if (seqno == LOGGING_COUNT) {
			powertrace_stop();
			printf("pckts_transmitted:%d\n", seqno);
			printf("Done...\n\n");
		}

	} else	{	//sink

		if (seqno > LOGGING_COUNT + 5) {	//greater than is used to ensure that the every sender sends his last pckt
			powertrace_stop();
			printf("Total pckts_received:%d\n", all_total_received);
			printf("Done...\n\n");
			
			//Delay to allow all nodes to finish 
			etimer_set(&et, CLOCK_SECOND*10);	// * 2 + random_rand() % (CLOCK_SECOND * 2));
			PROCESS_WAIT_EVENT_UNTIL(etimer_expired(&et));
			printf("simulation ends\n");
		}
	}
  }//while

  PROCESS_END();
}
/*---------------------------------------------------------------------------*/
void optimization_start()
{
	process_start(&optimization_process, NULL);
}
