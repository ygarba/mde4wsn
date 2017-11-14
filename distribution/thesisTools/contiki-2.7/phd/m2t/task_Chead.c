
/****************************************************
* Generated code for task -> Chead 
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

enum CheadSMEvents {
    OFFSET_EVT = Q_USER_SIG,
    OFFSET2_EVT = 150,
	RUNTIME_EVENT_TIMER = PROCESS_EVENT_TIMER, 
	RUNTIME_EVENT_UPDATEPOOL = 250,
	RUNTIME_EVENT_REMOTETRIGGER,
    RUNTIME_EVENT_NONE				//for automatic transition after entry action completion
};

typedef struct CHEADSMTag {
    QFsm super;
    void *data;	//data extracted from event and passed to SM
    uint8_t code;	//code for remote trig
} CheadSM;		//derived from QFsm

CheadSM cheadsm;		//SM object

/*---------------- Process Declaration -------------------*/
PROCESS(Chead_process, "Chead");
//AUTOSTART_PROCESSES(&Chead_process);
/*--------------------------------------------------------*/

/*------------------- helper functions -------------------*/
//Timers declare
static struct etimer Timer_1;
void Start_Chead_Timer(uint16_t time)
{
   PROCESS_CONTEXT_BEGIN(&Chead_process);
   etimer_set(&Timer_1, CLOCK_SECOND*time);
   PROCESS_CONTEXT_END(&Chead_process);
}

/*--------------------------------------------------------*/

//SM prototypes
void CheadSM_ctor(CheadSM *me);
static QState CheadSM_initial(CheadSM *me);

static QState CheadSM_Ready(CheadSM *me);
static QState CheadSM_Average(CheadSM *me);

//State Definations
void CheadSM_ctor(CheadSM *me){
    QFsm_ctor(&me->super, (QStateHandler)&CheadSM_initial);
}

QState CheadSM_initial(CheadSM *me){ 
    return Q_TRAN(&CheadSM_Ready);
}

QState CheadSM_Ready(CheadSM *me){
	switch (Q_SIG(me)) {
	        case Q_ENTRY_SIG: {
	        	
				Start_Chead_Timer(90);
		           
	            return Q_HANDLED();
	        }
	        case Q_EXIT_SIG: {	           
	        	
	        		        		            
	            return Q_HANDLED();
	        }
	        case RUNTIME_EVENT_TIMER: {
	            return Q_TRAN(&CheadSM_Average);
	        }    
	    }
    return Q_IGNORED(); 
}
QState CheadSM_Average(CheadSM *me){
	switch (Q_SIG(me)) {
	        case Q_ENTRY_SIG: {
	        	
				data_GetData_Humidity(MEAN, 0);	//get a neighbor node id based on the query and store it in the global var 'remoteNodeId'
				data_GetData_Temperature(MEAN, 0);	//get a neighbor node id based on the query and store it in the global var 'remoteNodeId'
                
                facts_GetNode_Hop(MIN, 0);	
                runtime_RemoteTrigger(11, &sharedData);
                
	        	Q_SIG(&cheadsm) = RUNTIME_EVENT_NONE;
	            
	            return Q_HANDLED();
	        }
	        case Q_EXIT_SIG: {	           
	        	
	        		        		            
	            return Q_HANDLED();
	        }
	        case RUNTIME_EVENT_NONE: {
	            return Q_TRAN(&CheadSM_Ready);
	        }    
	    }
    return Q_IGNORED(); 
}

/*------------------ Process Def -------------------------*/
PROCESS_THREAD(Chead_process, ev, evtData)
{
	PROCESS_BEGIN();
	void* data;
	uint8_t code;
	
  	CheadSM_ctor(&cheadsm);
  	QFsm_init((QFsm *)&cheadsm); //trigger initial transistion in this object
   
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
		
		//printf("Chead event dispatched ...\n\r");
		(&cheadsm)->data = data;	//insert event data pointer in sm object
		(&cheadsm)->code = code;
		Q_SIG(&cheadsm) = ev;
		QFsm_dispatch((QFsm *)&cheadsm);
		
		/*
		* The reason for this secondary dispatch is for NONE event.
		* The number of if's detetmines the length of chain of NONE events possible. Now two!
		*/
		if (Q_SIG(&cheadsm) == RUNTIME_EVENT_NONE) { //means completion of entry action automatically triggers transition, i.e. NULL event
		  QFsm_dispatch((QFsm *)&cheadsm);
		}
		
		if (Q_SIG(&cheadsm) == RUNTIME_EVENT_NONE) { //means completion of entry action automatically triggers transition, i.e. NULL event
		  QFsm_dispatch((QFsm *)&cheadsm);
		}
  }

  PROCESS_END();
}
/*--------------------------------------------------------*/
