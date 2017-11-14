
/****************************************************
* Generated code for task -> Routing 
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

enum RoutingSMEvents {
    OFFSET_EVT = Q_USER_SIG,
    OFFSET2_EVT = 150,
	RUNTIME_EVENT_TIMER = PROCESS_EVENT_TIMER, 
	RUNTIME_EVENT_UPDATEPOOL = 250,
	RUNTIME_EVENT_REMOTETRIGGER,
    RUNTIME_EVENT_NONE				//for automatic transition after entry action completion
};

typedef struct ROUTINGSMTag {
    QFsm super;
    void *data;	//data extracted from event and passed to SM
    uint8_t code;	//code for remote trig
} RoutingSM;		//derived from QFsm

RoutingSM routingsm;		//SM object

/*---------------- Process Declaration -------------------*/
PROCESS(Routing_process, "Routing");
//AUTOSTART_PROCESSES(&Routing_process);
/*--------------------------------------------------------*/

/*------------------- helper functions -------------------*/
//Timers declare
static struct etimer Timer_3;
void Start_Routing_Timer(uint16_t time)
{
   PROCESS_CONTEXT_BEGIN(&Routing_process);
   etimer_set(&Timer_3, CLOCK_SECOND*time);
   PROCESS_CONTEXT_END(&Routing_process);
}

/*--------------------------------------------------------*/

//SM prototypes
void RoutingSM_ctor(RoutingSM *me);
static QState RoutingSM_initial(RoutingSM *me);

static QState RoutingSM_Ready(RoutingSM *me);
static QState RoutingSM_Relay(RoutingSM *me);
static QState RoutingSM_SetHop(RoutingSM *me);

//State Definations
void RoutingSM_ctor(RoutingSM *me){
    QFsm_ctor(&me->super, (QStateHandler)&RoutingSM_initial);
}

QState RoutingSM_initial(RoutingSM *me){ 
    return Q_TRAN(&RoutingSM_Ready);
}

QState RoutingSM_Ready(RoutingSM *me){
	switch (Q_SIG(me)) {
	        case Q_ENTRY_SIG: {
	        	
				Start_Routing_Timer(30);
		            
	            return Q_HANDLED();
	        }
	        case Q_EXIT_SIG: {	           
	        	
	        		        		            
	            return Q_HANDLED();
	        }
	        case RUNTIME_EVENT_REMOTETRIGGER: {
	            return Q_TRAN(&RoutingSM_Relay);
	        }    
	        case RUNTIME_EVENT_TIMER: {
	            return Q_TRAN(&RoutingSM_SetHop);
	        }    
	    }
    return Q_IGNORED(); 
}
QState RoutingSM_Relay(RoutingSM *me){
	switch (Q_SIG(me)) {
	        case Q_ENTRY_SIG: {
	        	
				facts_GetNode_Hop(MIN, 0);	
				runtime_RemoteTrigger(33, me->data);		//sending remote event to -> 'targetAddr'. Call GetNode (query) prior to this call				
			
	        	Q_SIG(&routingsm) = RUNTIME_EVENT_NONE;
	            
	            return Q_HANDLED();
	        }
	        case Q_EXIT_SIG: {	           
	        	
	        		        		            
	            return Q_HANDLED();
	        }
	        case RUNTIME_EVENT_NONE: {
	            return Q_TRAN(&RoutingSM_Ready);
	        }    
	    }
    return Q_IGNORED(); 
}
QState RoutingSM_SetHop(RoutingSM *me){
	switch (Q_SIG(me)) {
	        case Q_ENTRY_SIG: {
	        	
				facts_GetNode_Hop(MIN, 0);								
				self_hop=hop+1;
			
	        	Q_SIG(&routingsm) = RUNTIME_EVENT_NONE;
	            
	            return Q_HANDLED();
	        }
	        case Q_EXIT_SIG: {	           
	        	
	        		        		            
	            return Q_HANDLED();
	        }
	        case RUNTIME_EVENT_NONE: {
	            return Q_TRAN(&RoutingSM_Ready);
	        }    
	    }
    return Q_IGNORED(); 
}

/*------------------ Process Def -------------------------*/
PROCESS_THREAD(Routing_process, ev, evtData)
{
	PROCESS_BEGIN();
	void* data;
	uint8_t code;
	
  	RoutingSM_ctor(&routingsm);
  	QFsm_init((QFsm *)&routingsm); //trigger initial transistion in this object
   
    //******************* where to put this?????????????????????
    rimeaddr_copy(&(sharedData.addr), &rimeaddr_node_addr);
    sensorVals.temperature = 0.0;
    sensorVals.humidity = 0.0;
    sharedData.sensorVals = sensorVals;
    remoteTrig.sharedData = sharedData;
    //******************* where to put this?????????????????????
  	
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
		
		//printf("Routing event dispatched ...\n\r");
		(&routingsm)->data = data;	//insert event data pointer in sm object
		(&routingsm)->code = code;
		Q_SIG(&routingsm) = ev;
		QFsm_dispatch((QFsm *)&routingsm);
		
		/*
		* The reason for this secondary dispatch is for NONE event.
		* The number of if's detetmines the length of chain of NONE events possible. Now two!
		*/
		if (Q_SIG(&routingsm) == RUNTIME_EVENT_NONE) { //means completion of entry action automatically triggers transition, i.e. NULL event
		  QFsm_dispatch((QFsm *)&routingsm);
		}
		
		if (Q_SIG(&routingsm) == RUNTIME_EVENT_NONE) { //means completion of entry action automatically triggers transition, i.e. NULL event
		  QFsm_dispatch((QFsm *)&routingsm);
		}
  }

  PROCESS_END();
}
/*--------------------------------------------------------*/
