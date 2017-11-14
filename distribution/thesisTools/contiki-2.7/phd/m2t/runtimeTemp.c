
#include "contiki.h"
#include "lib/list.h"
#include "lib/memb.h"
#include "lib/random.h"
#include "net/rime.h"

#include <stdio.h>
#include "wsn.h"
#include "runtime.h"

#define DEBUG 1
#if DEBUG
#include <stdio.h>
#define PRINTF(...) printf(__VA_ARGS__)
#else
#define PRINTF(...)
#endif

#define SENSOR_ACTIVATION_MASK (1<<2)			//bit2 on P4
#define ACTUATOR_ACTIVATION_MASK 0x00			//bit0
#define DONGLE_ACTIVATION_MASK (1<<3)			//bit3 on P4

uint8_t runtime_activating_profile;

enum RuntimeEvents {			//this set of events is same everywhere. Might be moved to wsn.h
    //OFFSET_EVT = Q_USER_SIG,
    //OFFSET2_EVT = 150,
	//RUNTIME_EVENT_TIMER = PROCESS_EVENT_TIMER,
	RUNTIME_EVENT_UPDATEPOOL = 250,
	RUNTIME_EVENT_REMOTETRIGGER
    //RUNTIME_EVENT_NONE				//for automatic transition after entry action completion
};

struct activation {
	struct activiation *next;
	void* task;
	uint8_t profile;
	uint8_t specific;
};

#define MAX_APP_TASKS 1
MEMB(activation_memb, struct activation, MAX_APP_TASKS);
LIST(activation_list);

//these are app processes declared in the different task files
extern struct process Sim_process;

void init_Activation() {

	struct activation* n;
	
	/* for task Sim */
	n = memb_alloc(&activation_memb);
	if(n == NULL) {
		PRINTF("\nCannot allocated memory!\n\n");
		return;
	}

	//Init values
	n->task = &Sim_process;	
	n->profile = 0b00000000;	//sensor,actuator,dongle,battery,neighbors,0,0,specific
	n->specific = 0;	//value must be matched by runtime to activate this task
	list_add(activation_list, n);	//add to list
	
}

struct remoteTrig ucData; //this is made global instead of auto to ensure the data is not destroyed after the func exits. //ToDo: make it better
//the possibility of this data getting corrupt is high. While the event is waiting to be scheduled, another incoming data
//may overwrite the data. ToDo: find a fix!
/*---------------------------------------------------------------------------*/
static void
recv_uc(struct unicast_conn *c, const rimeaddr_t *from)
{
  //once remote trig request received, pass it on to all tasks.
  //Those interested will catch it

	memcpy(&ucData, packetbuf_dataptr(), packetbuf_datalen());

	process_post(PROCESS_BROADCAST, RUNTIME_EVENT_REMOTETRIGGER, &ucData);	//post event for the data pool update
	//what to do with the data??????

//	printf("Remote triggering detected...\n");
//	printf("code = %u and origin %u.%u, temp %u\n",
//			ucData.code, ucData.sharedData.addr.u8[0], ucData.sharedData.addr.u8[1], ucData.sharedData.senseData.temperature);
}
static const struct unicast_callbacks unicast_callbacks = {recv_uc};
static struct unicast_conn uc;
/*---------------------------------------------------------------------------*/
PROCESS(runtime_process, "Runtime process");
/*----------------------------- interfaces -----------------------------------*/
void runtime_UpdatePool()//(void* data)
{
	//update before sending. We ain't using pointers, so the sense data must be copied
// THIS SHOULD BE AUTOGEN	
	sharedData.senseData = senseData;
	//sharedData.dist2Sink = dist2Sink;
	sharedData.addr = rimeaddr_node_addr;

	data_updateDataPool(&rimeaddr_node_addr, &sharedData);	//update local data pool. rimeaddr_node_addr is my local addr
	data_shareData(&sharedData); //send it to 1-hop neighbors
}

void runtime_RemoteTrigger(uint8_t code, void* shared)
{
// THIS SHOULD BE AUTOGEN
	sharedData.senseData = senseData;
	
	remoteTrig.code = code;
	remoteTrig.sharedData = *((struct sharedData*)shared);

	PROCESS_CONTEXT_BEGIN(&runtime_process);
	packetbuf_copyfrom(&remoteTrig, sizeof(struct remoteTrig));
	unicast_send(&uc, &targetAddr);			//remoteNodeId is obtained by exec getNodeID. So call it first
	PROCESS_CONTEXT_END(&runtime_process);

	PRINTF("Remote trig dispatched to %u.%u. Data: code %u, origin %u.%u\n", targetAddr.u8[0], targetAddr.u8[1], remoteTrig.code, remoteTrig.sharedData.addr.u8[0], remoteTrig.sharedData.addr.u8[1]);
}

void runtime_UpdateActivation()
{
	//sensor,actuator,dongle,battery,neighbors,0,0,specifi
#if WSNSIM == 1
	if ( (P4IN & SENSOR_ACTIVATION_MASK) == SENSOR_ACTIVATION_MASK) {		//high, not available
		runtime_activating_profile &= ~(1 << 7);
	} else {
		runtime_activating_profile |= (1 << 7);
		PRINTF("Sensor available\n");
	}

	if ( (P2IN & ACTUATOR_ACTIVATION_MASK) == ACTUATOR_ACTIVATION_MASK) {	//high, not available
		runtime_activating_profile &= ~(1 << 6);
	} else {
		runtime_activating_profile |= (1 << 6);
		PRINTF("Actuator available\n");
	}

	if ( (P4IN & DONGLE_ACTIVATION_MASK) == DONGLE_ACTIVATION_MASK) {		//high, not available
		runtime_activating_profile &= ~(1 << 5);
	} else {
		runtime_activating_profile |= (1 << 5);
		PRINTF("Dongle available\n");
	}
#else
;
#endif
	if ( self_battery > 270) {						
		runtime_activating_profile |= (1 << 4);
		PRINTF("Good battery level\n");
	} else {
		runtime_activating_profile &= ~(1 << 4);
	}

	if ( self_neighbors > 1) {					
		runtime_activating_profile |= (1 << 3);
		PRINTF("More than 1 neighbor\n");
	} else {
		runtime_activating_profile &= ~(1 << 3);
	}
}

void runtime_TaskActivation()
{
	struct activation* s;

	for(s = list_head(activation_list);
	  s != NULL;
	  s = list_item_next(s)) {
		if (s->profile & (1<<0)) {	//if specific bit (bit 0) is true, the specific must match runtime_activation_specific
			if (s->specific == runtime_activating_specific) {
				process_start(s->task, NULL);
			} else {
				process_exit(s->task);
			}
		} else {
			if (s->profile == (runtime_activating_profile & s->profile)) {	//runtime provides required activation profile for task to run
				process_start(s->task, NULL);
			} else {
			 	 process_exit(s->task);
			}
		}
	  }
}
/*---------------------------------------------------------------------------*/
PROCESS_THREAD(runtime_process, ev, data)
{
  //PROCESS_EXITHANDLER(unicast_close(&unicast);)
    
  PROCESS_BEGIN();
  static struct etimer runtimer;
  
  unicast_open(&uc, 146, &unicast_callbacks);
  init_Activation();
  runtime_activating_profile = 0b111000;	//ToDo: get it based on node's state and hardware
  
  PRINTF("runtime process started .....\n\r");
  while(1) {
    
    etimer_set(&runtimer, CLOCK_SECOND*3);
    PROCESS_WAIT_EVENT_UNTIL(etimer_expired(&runtimer));

	runtime_UpdateActivation();
	runtime_TaskActivation();
    //PRINTF("runtime housekeeping .....\n\r");
  }

  PROCESS_END();
}
/*---------------------------------------------------------------------------*/
void runtime_init() {
	
	//setup activation pins P2.7, P2.0, P2.1 for sensor, actuator and dongle respectively
#if WSNSIM == 1
	//sensor
	P4SEL &= ~(1<<2);	//select as gpio
	P4DIR &= ~(1<<2);	//input
	P4REN |= (1<<2);	//setup pull resistors enabled
	P4OUT |= (1<<2); 	//now pull up

	//actuator
	P2SEL &= ~(1<<4);	//select as gpio
	P2DIR &= ~(1<<4);	//input
	P2REN |= 1<<4;	//pull-up resistor enabled
	P2OUT |= (1<<4); 	//now pull up

	//dongle
	P4SEL &= ~(1<<3);	//select as gpio
	P4DIR &= ~(1<<3);	//input
	P4REN |= 1<<3;	//pull-up resistor enabled
	P4OUT |= (1<<3); 	//now pull up
#endif

	runtime_activating_profile = 0x00;
	runtime_activating_specific = 0;
	
	process_start(&runtime_process, NULL);
	nfacts_start();	//neighbor and keeper processes
	ndata_start();
}
