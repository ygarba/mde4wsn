
/****************************************************
* Generated code for task -> Sink 
*****************************************************/	
#include "contiki.h"
#include <stdio.h>
#include "net/netstack.h"
#include "net/rime.h"

#include "wsn.h"
//#include "runtime.h"	//included by wsn.h already
#include "qepn.h"
#include "dev/leds.h"
//#include "qpn_port.h"
//#include "bsp.h"

#define DEBUG 0
#if DEBUG
#include <stdio.h>
#define PRINTF(...) printf(__VA_ARGS__)
#else
#define PRINTF(...)
#endif

enum SinkSMEvents {
    OFFSET_EVT = Q_USER_SIG,
    OFFSET2_EVT = 150,
	RUNTIME_EVENT_TIMER = PROCESS_EVENT_TIMER, 
	RUNTIME_EVENT_UPDATEPOOL = 250,
	RUNTIME_EVENT_REMOTETRIGGER,
    RUNTIME_EVENT_NONE				//for automatic transition after entry action completion
};

typedef struct SINKSMTag {
    QFsm super;
    void *data;	//data extracted from event and passed to SM
    uint8_t code;	//code for remote trig
} SinkSM;		//derived from QFsm

SinkSM sinksm;		//SM object

/*---------------- Process Declaration -------------------*/
PROCESS(Sink_process, "Sink");
//AUTOSTART_PROCESSES(&Sink_process);
/*--------------------------------------------------------*/

/*------------------- helper functions -------------------*/
//Timers declare

/*--------------------------------------------------------*/

//SM prototypes
void SinkSM_ctor(SinkSM *me);
static QState SinkSM_initial(SinkSM *me);

static QState SinkSM_Ready(SinkSM *me);
static QState SinkSM_Relay2PC(SinkSM *me);

//State Definations
void SinkSM_ctor(SinkSM *me){
    QFsm_ctor(&me->super, (QStateHandler)&SinkSM_initial);
}

QState SinkSM_initial(SinkSM *me){ 
    return Q_TRAN(&SinkSM_Ready);
}

QState SinkSM_Ready(SinkSM *me){
	switch (Q_SIG(me)) {
	        case Q_ENTRY_SIG: {
	        				
				self_hop=0;
					      
	            return Q_HANDLED();
	        }
	        case Q_EXIT_SIG: {	           
	        	
	        		        		            
	            return Q_HANDLED();
	        }
	        case RUNTIME_EVENT_REMOTETRIGGER: {
	            return Q_TRAN(&SinkSM_Relay2PC);
	        }    
	    }
    return Q_IGNORED(); 
}
QState SinkSM_Relay2PC(SinkSM *me){
	switch (Q_SIG(me)) {
	        case Q_ENTRY_SIG: {
	        	
				uint16_t hum = ((struct sharedData*) (me->data))->sensorVals.humidity;
				int16_t temp = ((struct sharedData*) (me->data))->sensorVals.temperature;
				printf("%u.%u ", ((struct sharedData*) (me->data))->addr.u8[0], ((struct sharedData*) (me->data))->addr.u8[1]);
				printf("%u ", me->code);
				printf("%u ",
				       (unsigned) (-39.60 + 0.01 * temp));
				printf("%u\n",
				       (unsigned) (-4 + 0.0405*hum - 2.8e-6*(hum*hum)));
			
	        	Q_SIG(&sinksm) = RUNTIME_EVENT_NONE;
	            
	            return Q_HANDLED();
	        }
	        case Q_EXIT_SIG: {	           
	        	
	        		        		            
	            return Q_HANDLED();
	        }
	        case RUNTIME_EVENT_NONE: {
	            return Q_TRAN(&SinkSM_Ready);
	        }    
	    }
    return Q_IGNORED(); 
}

/*------------------ Process Def -------------------------*/
PROCESS_THREAD(Sink_process, ev, evtData)
{
	PROCESS_BEGIN();
	void* data;
	uint8_t code;
	
  	SinkSM_ctor(&sinksm);
  	QFsm_init((QFsm *)&sinksm); //trigger initial transistion in this object
   
    //******************* where to put this?????????????????????
    rimeaddr_copy(&(sharedData.addr), &rimeaddr_node_addr);
    sensorVals.temperature = 0.0;
    sensorVals.humidity = 0.0;
    sharedData.sensorVals = sensorVals;
    remoteTrig.sharedData = sharedData;
    //******************* where to put this?????????????????????
  	printf("\ndongle...\n");
  	while(1){
		PROCESS_WAIT_EVENT();
		
		//check whether it is remote trig event. If yes, then split data for code and shareddata
		if (ev == RUNTIME_EVENT_REMOTETRIGGER) {
			code = ((struct remoteTrig*)evtData)->code;
			data = &(((struct remoteTrig*)evtData)->sharedData);
		}
		else
		{
			data = evtData;
			code = 0;		//means non remote trig exec
		}
		
		//printf("Sink event dispatched ...\n\r");
		(&sinksm)->data = data;	//insert event data pointer in sm object
		(&sinksm)->code = code;
		Q_SIG(&sinksm) = ev;
		QFsm_dispatch((QFsm *)&sinksm);
		
		/*
		* The reason for this secondary dispatch is for NONE event.
		* The number of if's detetmines the length of chain of NONE events possible. Now two!
		*/
		if (Q_SIG(&sinksm) == RUNTIME_EVENT_NONE) { //means completion of entry action automatically triggers transition, i.e. NULL event
		  QFsm_dispatch((QFsm *)&sinksm);
		}
		
		if (Q_SIG(&sinksm) == RUNTIME_EVENT_NONE) { //means completion of entry action automatically triggers transition, i.e. NULL event
		  QFsm_dispatch((QFsm *)&sinksm);
		}
  }

  PROCESS_END();
}
/*--------------------------------------------------------*/
