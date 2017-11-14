
/****************************************************
* Generated code for task -> Route 
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

enum RouteSMEvents {
    OFFSET_EVT = Q_USER_SIG,
    OFFSET2_EVT = 150,
	RUNTIME_EVENT_TIMER = PROCESS_EVENT_TIMER, 
	RUNTIME_EVENT_UPDATEPOOL = 250,
	RUNTIME_EVENT_REMOTETRIGGER,
    RUNTIME_EVENT_NONE				//for automatic transition after entry action completion
};

typedef struct ROUTESMTag {
    QFsm super;
    void *data;	//data extracted from event and passed to SM
    uint8_t code;	//code for remote trig
} RouteSM;		//derived from QFsm

RouteSM routesm;		//SM object

/*---------------- Process Declaration -------------------*/
PROCESS(Route_process, "Route");
//AUTOSTART_PROCESSES(&Route_process);
/*--------------------------------------------------------*/

/*------------------- helper functions -------------------*/
//Timers declare
static struct etimer Timer_2;
void Start_Route_Timer(uint16_t time)
{
   PROCESS_CONTEXT_BEGIN(&Route_process);
   etimer_set(&Timer_2, CLOCK_SECOND*time);
   PROCESS_CONTEXT_END(&Route_process);
}

/*--------------------------------------------------------*/

//SM prototypes
void RouteSM_ctor(RouteSM *me);
static QState RouteSM_initial(RouteSM *me);

static QState RouteSM_Wait(RouteSM *me);
static QState RouteSM_Route(RouteSM *me);
static QState RouteSM_Hop(RouteSM *me);

//State Definations
void RouteSM_ctor(RouteSM *me){
    QFsm_ctor(&me->super, (QStateHandler)&RouteSM_initial);
}

QState RouteSM_initial(RouteSM *me){ 
    return Q_TRAN(&RouteSM_Wait);
}

QState RouteSM_Wait(RouteSM *me){
	switch (Q_SIG(me)) {
	        case Q_ENTRY_SIG: {
	        	
				Start_Route_Timer(30);
		            
	            return Q_HANDLED();
	        }
	        case Q_EXIT_SIG: {	           
	        	
	        		        		            
	            return Q_HANDLED();
	        }
	        case RUNTIME_EVENT_REMOTETRIGGER: {
	            return Q_TRAN(&RouteSM_Route);
	        }    
	        case RUNTIME_EVENT_TIMER: {
	            return Q_TRAN(&RouteSM_Hop);
	        }    
	    }
    return Q_IGNORED(); 
}
QState RouteSM_Route(RouteSM *me){
	switch (Q_SIG(me)) {
	        case Q_ENTRY_SIG: {
	        	
				facts_GetNode_Hop(MIN, 0);	
				runtime_RemoteTrigger(33, me->data);		//sending remote event to -> 'targetAddr'. Call GetNode (query) prior to this call				
			
	        	Q_SIG(&routesm) = RUNTIME_EVENT_NONE;
	            
	            return Q_HANDLED();
	        }
	        case Q_EXIT_SIG: {	           
	        	
	        		        		            
	            return Q_HANDLED();
	        }
	        case RUNTIME_EVENT_NONE: {
	            return Q_TRAN(&RouteSM_Wait);
	        }    
	    }
    return Q_IGNORED(); 
}
QState RouteSM_Hop(RouteSM *me){
	switch (Q_SIG(me)) {
	        case Q_ENTRY_SIG: {
	        	
				facts_GetNode_Hop(MIN, 0);	
				self_hop=hop+1;
												
	        	Q_SIG(&routesm) = RUNTIME_EVENT_NONE;
	            
	            return Q_HANDLED();
	        }
	        case Q_EXIT_SIG: {	           
	        	
	        		        		            
	            return Q_HANDLED();
	        }
	        case RUNTIME_EVENT_NONE: {
	            return Q_TRAN(&RouteSM_Wait);
	        }    
	    }
    return Q_IGNORED(); 
}

/*------------------ Process Def -------------------------*/
PROCESS_THREAD(Route_process, ev, evtData)
{
	PROCESS_BEGIN();
	void* data;
	uint8_t code;
	
  	RouteSM_ctor(&routesm);
  	QFsm_init((QFsm *)&routesm); //trigger initial transistion in this object
   
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
		
		//printf("Route event dispatched ...\n\r");
		(&routesm)->data = data;	//insert event data pointer in sm object
		(&routesm)->code = code;
		Q_SIG(&routesm) = ev;
		QFsm_dispatch((QFsm *)&routesm);
		
		/*
		* The reason for this secondary dispatch is for NONE event.
		* The number of if's detetmines the length of chain of NONE events possible. Now two!
		*/
		if (Q_SIG(&routesm) == RUNTIME_EVENT_NONE) { //means completion of entry action automatically triggers transition, i.e. NULL event
		  QFsm_dispatch((QFsm *)&routesm);
		}
		
		if (Q_SIG(&routesm) == RUNTIME_EVENT_NONE) { //means completion of entry action automatically triggers transition, i.e. NULL event
		  QFsm_dispatch((QFsm *)&routesm);
		}
  }

  PROCESS_END();
}
/*--------------------------------------------------------*/
