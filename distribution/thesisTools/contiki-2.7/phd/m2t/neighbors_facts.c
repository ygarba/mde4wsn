#include "contiki.h"
#include "lib/list.h"
#include "lib/memb.h"
#include "lib/random.h"
#include "net/rime.h"

#define DEBUG 0
#if DEBUG
#include <stdio.h>
#define PRINTF(...) printf(__VA_ARGS__)
#else
#define PRINTF(...)
#endif

#if WSNSIM == 0
#include "dev/battery-sensor.h"
#endif

#include <stdio.h>
#include <string.h>

#include "wsn.h"
//#include "runtime.h"

//rimeaddr_t bestNodes[2];

struct neighbors_beacon {
  uint16_t seqno;
  uint16_t battery;	
  uint8_t hop;
  uint8_t neighbors;
  bool ch;
};

struct facts {
  struct neighbor *next;	//for Contiki list
  rimeaddr_t addr;
  uint16_t rssi;
  uint16_t lqi;
  uint16_t battery;
  uint16_t last_seqno; 
  uint16_t avg_seqno_gap;
  uint8_t link;
  uint32_t epoch;
  uint8_t hop;
  uint8_t neighbors;
  bool ch;
};

#define MAX_NEIGHBORS 20

/* This MEMB() definition defines a memory pool from which we allocate
   neighbor entries. */
MEMB(neighbors_memb, struct facts, MAX_NEIGHBORS);

/* The neighbors_list is a Contiki list that holds the neighbors we
   have seen thus far. */
LIST(neighbors_list);

static struct broadcast_conn broadcast;

/* These two defines are used for computing the moving average for the
   broadcast sequence number gaps. */
#define SEQNO_EWMA_UNITY 0x100
#define SEQNO_EWMA_ALPHA 0x040

/*---------------------------------------------------------------------------*/
/* We first declare our two processes. */
PROCESS(nfacts_process, "Neighbors facts process");
PROCESS(nkeeper_process, "Neighbors keeper process");
/*---------------------------------------------------------------------------*/
/* This function is called whenever a broadcast message is received. */
static void
broadcast_recv(struct broadcast_conn *c, const rimeaddr_t *from)
{
  struct  facts *n;
  struct neighbors_beacon mm;   //here the mem is declared
  struct neighbors_beacon *m;
  uint8_t seqno_gap;

  memcpy(&mm, packetbuf_dataptr(), packetbuf_datalen());
  m = &mm;  //just grab the pointer here
  //m = packetbuf_dataptr();  //  -> NEVER DO THIS!!!!
  
  /* Check if we already know this neighbor. */
  for(n = list_head(neighbors_list); n != NULL; n = list_item_next(n)) {

    /* We break out of the loop if the address of the neighbor matches
       the address of the neighbor from which we received this
       broadcast message. */
    if(rimeaddr_cmp(&n->addr, from)) {
      break;
    }
  }

  /* If n is NULL, this neighbor was not found in our list, and we
     allocate a new struct neighbor from the neighbors_memb memory
     pool. */
  if(n == NULL) {
    n = memb_alloc(&neighbors_memb);
    /* If we could not allocate a new neighbor entry, we give up. We
       could have reused an old neighbor entry, but we do not do this
       for now. */
    if(n == NULL) {
    	PRINTF("\nCannot allocated memory!\n\n");
      return;
    }

    /* Initialize the fields. */
    rimeaddr_copy(&n->addr, from);
    n->last_seqno = m->seqno - 1;
    n->avg_seqno_gap = SEQNO_EWMA_UNITY;
    n->battery = m->battery;
    n->hop = m->hop;
    n->ch = m->ch;
    n->neighbors = m->neighbors;
    n->epoch = clock_seconds();
    n->link = n->avg_seqno_gap;	//ToDo: link estimate shld be calculated from some formula....

    /* Place the neighbor on the neighbor list. */
    list_add(neighbors_list, n);
  }

  /* We can now fill in the fields in our known neighbor entry. */
  n->rssi = packetbuf_attr(PACKETBUF_ATTR_RSSI);
  n->lqi = packetbuf_attr(PACKETBUF_ATTR_LINK_QUALITY);
  n->battery = m->battery;
  n->hop = m->hop;
  n->ch = m->ch;
  n->neighbors = m->neighbors;
  n->epoch = clock_seconds();
  n->link = n->avg_seqno_gap;	//ToDo: link estimate shld be calculated from some formula....

  /* Compute the average sequence number gap we have seen from this neighbor. */
  seqno_gap = m->seqno - n->last_seqno;
  n->avg_seqno_gap = (((uint32_t)seqno_gap * SEQNO_EWMA_UNITY) *
                      SEQNO_EWMA_ALPHA) / SEQNO_EWMA_UNITY +
                      ((uint32_t)n->avg_seqno_gap * (SEQNO_EWMA_UNITY -
                                                     SEQNO_EWMA_ALPHA)) / SEQNO_EWMA_UNITY;

  /* Remember last seqno we heard. */
  n->last_seqno = m->seqno;
}

static const struct broadcast_callbacks broadcast_call = {broadcast_recv};

/*----------------------------- interfaces -----------------------------------*/
void facts_GetNode_Battery(SearchCriteria_t criterion, int comparator) {

	if (list_length(neighbors_list) < 1) {
			return;
	}

	uint16_t tempVar;
	struct facts *s;

	s = list_head(neighbors_list);
	tempVar = s->battery;
	rimeaddr_copy(&targetAddr, &(s->addr));
	switch(criterion) {
		case(EQUAL): {
			for(s = list_head(neighbors_list);
				  s != NULL;
				  s = list_item_next(s)) {
						if (s->battery == comparator) {
							tempVar = s->battery;
							//battery = s->battery;
							rimeaddr_copy(&targetAddr, &(s->addr));
							break;
						} else {
							targetAddr.u8[0] = 0; targetAddr.u8[1] = 0;
						}
				  }
			PRINTF("Batt equals %u\n", tempVar);
			break;
		}
		case(MAX): {
			for(s = list_head(neighbors_list);
				  s != NULL;
				  s = list_item_next(s)) {
						if (s->battery > tempVar) {
							tempVar = s->battery;
							//battery = s->battery;
							rimeaddr_copy(&targetAddr, &(s->addr));
						}
				  }
			PRINTF("Max batt is %u\n", tempVar);
			break;
		}
		case(MIN): {
			for(s = list_head(neighbors_list);
				  s != NULL;
				  s = list_item_next(s)) {
						if (s->battery < tempVar) {
							tempVar = s->battery;
							//battery = s->battery;
							rimeaddr_copy(&targetAddr, &(s->addr));
						}
				  }
			PRINTF("Min batt is %u\n", tempVar);
			break;
		}
		case(SELF): {
			for(s = list_head(neighbors_list);
				s != NULL;
				s = list_item_next(s)) {
					if (rimeaddr_cmp(&(s->addr), &rimeaddr_node_addr)) {
						tempVar = s->battery;
						self_battery = s->battery;
						rimeaddr_copy(&targetAddr, &(s->addr));
						break;
					} else {
						targetAddr.u8[0] = 0; targetAddr.u8[1] = 0;
					}
			}
			PRINTF("Self battery %u\n", tempVar);
			break;
		}
		default: {;}
	}//switch
	battery = tempVar;
}

void facts_GetNode_Link(SearchCriteria_t criterion, int comparator) {

	if (list_length(neighbors_list) < 1) {
				return;
	}

	uint16_t tempVar;
	struct facts *s;

	s = list_head(neighbors_list);
	tempVar = s->link;
	rimeaddr_copy(&targetAddr, &(s->addr));
	switch(criterion) {
		case(EQUAL): {
			for(s = list_head(neighbors_list);
				  s != NULL;
				  s = list_item_next(s)) {
						if (s->link == comparator) {
							tempVar = s->link;
							//link = s->link;
							rimeaddr_copy(&targetAddr, &(s->addr));
							break;
						} else {
							targetAddr.u8[0] = 0; targetAddr.u8[1] = 0;
						}
				  }
			PRINTF("Link equals %u\n", tempVar);
			break;
		}
		case(MAX): {
			for(s = list_head(neighbors_list);
				  s != NULL;
				  s = list_item_next(s)) {
						if (s->link > tempVar) {
							tempVar = s->link;
							//link = s->link;
							rimeaddr_copy(&targetAddr, &(s->addr));
						}
				  }
			PRINTF("Max link is %u\n", link);
			break;
		}
		case(MIN): {
			for(s = list_head(neighbors_list);
				  s != NULL;
				  s = list_item_next(s)) {
						if (s->link < tempVar) {
							tempVar = s->link;
							//link = s->link;
							rimeaddr_copy(&targetAddr, &(s->addr));
						}
				  }
			PRINTF("Min link is %u\n", tempVar);
			break;
		}
		case(SELF): {
			for(s = list_head(neighbors_list);
				s != NULL;
				s = list_item_next(s)) {
					if (rimeaddr_cmp(&(s->addr), &rimeaddr_node_addr)) {
						tempVar = s->link;
						//self_link = s->link;
						rimeaddr_copy(&targetAddr, &(s->addr));
						break;
					} else {
						targetAddr.u8[0] = 0; targetAddr.u8[1] = 0;
					}
			}
			PRINTF("Self link %u\n", tempVar);
			break;
		}
		default: {;}
	}//switch
	link = tempVar;
}

void facts_GetNode_Hop(SearchCriteria_t criterion, int comparator) {

	if (list_length(neighbors_list) < 1) {
				return;
	}

	uint16_t tempVar;
	struct facts *s;

	s = list_head(neighbors_list);
	tempVar = s->hop;
	rimeaddr_copy(&targetAddr, &(s->addr));
	switch(criterion) {
		case(EQUAL): {
			for(s = list_head(neighbors_list);
				  s != NULL;
				  s = list_item_next(s)) {
						if (s->hop == comparator) {
							tempVar = s->hop;
							//hop = s->hop;
							rimeaddr_copy(&targetAddr, &(s->addr));
							break;
						} else {
							targetAddr.u8[0] = 0; targetAddr.u8[1] = 0;
						}
				  }
			PRINTF("Hop equals %u\n", tempVar);
			break;
		}
		case(MAX): {
			for(s = list_head(neighbors_list);
				  s != NULL;
				  s = list_item_next(s)) {
						if (s->hop > tempVar) {
							tempVar = s->hop;
							//hop = s->hop;
							rimeaddr_copy(&targetAddr, &(s->addr));
						}
				  }
			PRINTF("Max hop is %u\n", tempVar);
			break;
		}
		case(MIN): {
			for(s = list_head(neighbors_list);
				  s != NULL;
				  s = list_item_next(s)) {
					if (s->hop < tempVar) {
							tempVar = s->hop;
							//hop = s->hop;
							rimeaddr_copy(&targetAddr, &(s->addr));
					}
				  }
			PRINTF("Min hop is %u\n", tempVar);
			break;
		}
		case(SELF): {
			for(s = list_head(neighbors_list);
				s != NULL;
				s = list_item_next(s)) {
					if (rimeaddr_cmp(&(s->addr), &rimeaddr_node_addr)) {
						tempVar = s->hop;
						self_hop = s->hop;
						rimeaddr_copy(&targetAddr, &(s->addr));
						break;
					} else {
							targetAddr.u8[0] = 0; targetAddr.u8[1] = 0;
						}
						  }
			PRINTF("Self hop %u\n", tempVar);
			break;
		}
		default: {;}
	}//switch
	hop = tempVar;
}

void facts_GetNode_Ch(SearchCriteria_t criterion, int comparator) {

	if (list_length(neighbors_list) < 1) {
				return;
	}

	uint16_t tempVar;
	struct facts *s;

	s = list_head(neighbors_list);
	tempVar = s->ch;
	rimeaddr_copy(&targetAddr, &(s->addr));
	switch(criterion) {
		case(EQUAL): {
			for(s = list_head(neighbors_list);
				  s != NULL;
				  s = list_item_next(s)) {
						if (s->ch == comparator) {
							tempVar = s->ch;
							//ch = s->ch;
							rimeaddr_copy(&targetAddr, &(s->addr));
							break;
						} else {
							targetAddr.u8[0] = 0; targetAddr.u8[1] = 0;
						}
				  }
			PRINTF("CH equals %u\n", tempVar);
			break;
		}
		case(SELF): {
			for(s = list_head(neighbors_list);
				s != NULL;
				s = list_item_next(s)) {
					if (rimeaddr_cmp(&(s->addr), &rimeaddr_node_addr)) {
						tempVar = s->ch;
						self_ch = s->ch;
						rimeaddr_copy(&targetAddr, &(s->addr));
						break;
					} else {
							targetAddr.u8[0] = 0; targetAddr.u8[1] = 0;
						}
						  }
			PRINTF("Self CH %u\n", tempVar);
			break;
		}
		default: {;}
	}//switch
	ch = tempVar;
}

void facts_GetNode_Neighbors(SearchCriteria_t criterion, int comparator) {

	if (list_length(neighbors_list) < 1) {
				return;
	}

	uint16_t tempVar;
	struct facts *s;

	s = list_head(neighbors_list);
	tempVar = s->neighbors;
	rimeaddr_copy(&targetAddr, &(s->addr));
	switch(criterion) {
		case(EQUAL): {
			for(s = list_head(neighbors_list);
				  s != NULL;
				  s = list_item_next(s)) {
						if (s->neighbors == comparator) {
							tempVar = s->neighbors;
							//hop = s->neighbors;
							rimeaddr_copy(&targetAddr, &(s->addr));
							break;
						} else {
							targetAddr.u8[0] = 0; targetAddr.u8[1] = 0;
						}
				  }
			PRINTF("Neighbors equals %u\n", tempVar);
			break;
		}
		case(MAX): {
			for(s = list_head(neighbors_list);
				  s != NULL;
				  s = list_item_next(s)) {
						if (s->neighbors > tempVar) {
							tempVar = s->neighbors;
							//neighbors = s->hop;
							rimeaddr_copy(&targetAddr, &(s->addr));
						}
				  }
			PRINTF("Max neighbors is %u\n", tempVar);
			break;
		}
		case(MIN): {
			for(s = list_head(neighbors_list);
				  s != NULL;
				  s = list_item_next(s)) {
					if (s->neighbors < tempVar) {
							tempVar = s->neighbors;
							//neighbors = s->neighbors;
							rimeaddr_copy(&targetAddr, &(s->addr));
					}
				  }
			PRINTF("Min neighbors is %u\n", tempVar);
			break;
		}
		case(SELF): {
			for(s = list_head(neighbors_list);
				s != NULL;
				s = list_item_next(s)) {
					if (rimeaddr_cmp(&(s->addr), &rimeaddr_node_addr)) {
						tempVar = s->neighbors;
						self_neighbors = s->neighbors;
						rimeaddr_copy(&targetAddr, &(s->addr));
						break;
					} else {
							targetAddr.u8[0] = 0; targetAddr.u8[1] = 0;
						}
						  }
			PRINTF("Self neighbors %u\n", tempVar);
			break;
		}
		default: {;}
	}//switch
	neighbors = tempVar;
}

bool facts_AnyCH(void)
{
	struct facts *s;
	bool ret = false;

	for(s = list_head(neighbors_list); s != NULL; s = list_item_next(s)) {
		if (s->ch != 0) {
			ret =  true;
			break;
		} else {
			ret = false;
		}
	}

	return ret;
}
/*---------------------------------------------------------------------------*/
PROCESS_THREAD(nfacts_process, ev, data)
{
  static struct etimer et;
  static uint16_t seqno = 0;
  static struct neighbors_beacon beacon;
  static struct facts *s;

  PROCESS_EXITHANDLER(broadcast_close(&broadcast);)

  PROCESS_BEGIN();
#if WSNSIM == 0
  SENSORS_ACTIVATE(battery_sensor);
#endif
  broadcast_open(&broadcast, 129, &broadcast_call);
  self_hop = 255; //init
  self_ch = false; //init
  self_neighbors = 0;

  PRINTF("neighbors facts process started .....\n\r");
  //create me in neighbor list
  s = memb_alloc(&neighbors_memb);
  rimeaddr_copy(&(s->addr), &rimeaddr_node_addr);

  list_add(neighbors_list, s);
  while(1) {

		etimer_set(&et, CLOCK_SECOND * 10 + random_rand() % (CLOCK_SECOND * 10 ));

		PROCESS_WAIT_EVENT_UNTIL(etimer_expired(&et));

		beacon.seqno = seqno;

#if WSNSIM == 0
		beacon.battery = (battery_sensor.value(0)*250L)>>11;  //divide by 100 to get actual value
#else
		beacon.battery = (250 + rand()%(300-250));	//generate random # between 250 and 300
#endif

		beacon.hop = self_hop;
		beacon.ch = self_ch;
		beacon.neighbors = list_length(neighbors_list);

		//assign to self - value for internal use
		self_battery = beacon.battery;
		//self_hop = beacon.hop;
		//self_ch = beacon.ch;
		self_neighbors = beacon.neighbors;
		//printf("battery = %u\n", (beacon.battery*250L)>>11);
		//printf("Self->seq# = %u, Self->batt = %u Epoch = %u\n", beacon.seqno, beacon.battery, clock_seconds());
		packetbuf_copyfrom(&beacon, sizeof(struct neighbors_beacon));
		broadcast_send(&broadcast);
		seqno++;

		//update me in my own neighbor list
		for(s = list_head(neighbors_list); s != NULL; s = list_item_next(s)) {
		    if(rimeaddr_cmp(&(s->addr), &rimeaddr_node_addr)) {
		    	//rimeaddr_copy(&(s->addr), &rimeaddr_node_addr);
		    	s->last_seqno = beacon.seqno;
		    	s->avg_seqno_gap = 0;
		    	s->battery = beacon.battery;
		    	s->epoch = clock_seconds();
		    	s->hop = self_hop;
		    	s->neighbors = self_neighbors;
		    	s->ch = self_ch;
		    	s->link = 0;
		    	break;
		    }
		 }//for list


		//dev
		PRINTF("=======================\n");
		PRINTF("Neighbor count = %u \nTheir details:\n", list_length(neighbors_list));
		for(s = list_head(neighbors_list);
		  s != NULL;
		  s = list_item_next(s)) {
			PRINTF("Node %u.%u, batt %u, avg seq gap %u, epoch %lu, age %u, ", s->addr.u8[0], s->addr.u8[1],
				s->battery, s->avg_seqno_gap, s->epoch, clock_seconds()-(s->epoch));
			PRINTF("hop %u, ch %u, neighbors %u\n", s->hop, s->ch, s->neighbors);
		  }
		PRINTF("=======================\n");
    }//while


  PROCESS_END();
}
/*---------------------------------------------------------------------------*/
PROCESS_THREAD(nkeeper_process, ev, data)
{
  //PROCESS_EXITHANDLER(unicast_close(&unicast);)

  PROCESS_BEGIN();
  static struct etimer runtimer;
  static struct facts *neighb;
  //rimeaddr_t purgedNode;

  PRINTF("neighborskeeper started .....\n\r");
  while(1) {

    etimer_set(&runtimer, CLOCK_SECOND*10);
    PROCESS_WAIT_EVENT_UNTIL(etimer_expired(&runtimer));

//	purgedNode = facts_purge();
//	//if (purgedNode != (rimeaddr_t)0) {
//	if (1==0) {
//		data_purge(purgedNode);
//	}

    //PRINTF("neighbors housekeeping .....\n\r");

    //purging stale neighbor
    for(neighb = list_head(neighbors_list);
    		neighb != NULL;
    		neighb = list_item_next(neighb)) {

    		if (clock_seconds()-(neighb->epoch) > 90) {	//neighbor is too old
    			 list_remove(neighbors_list, neighb);	//remove from the list
    			 memb_free(&neighbors_memb, neighb);	//free the mem
    			 PRINTF("Node %u.%u, removed!!!\n", neighb->addr.u8[0], neighb->addr.u8[1]);

    			 //also ask data to be removed
    			 data_purge(neighb->addr);
    		}
    }
  }//while

  PROCESS_END();
}
/*---------------------------------------------------------------------------*/
void nfacts_start() {
	process_start(&nfacts_process, NULL); 
	process_start(&nkeeper_process, NULL);
}
