
/****************************************************
* Generated code for task -> Actuate 
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

enum ActuateSMEvents {
    OFFSET_EVT = Q_USER_SIG,
    OFFSET2_EVT = 150,
	RUNTIME_EVENT_TIMER = PROCESS_EVENT_TIMER, 
	RUNTIME_EVENT_UPDATEPOOL = 250,
	RUNTIME_EVENT_REMOTETRIGGER,
    RUNTIME_EVENT_NONE				//for automatic transition after entry action completion
};

typedef struct ACTUATESMTag {
    QFsm super;
    void *data;	//data extracted from event and passed to SM
    uint8_t code;	//code for remote trig
} ActuateSM;		//derived from QFsm

ActuateSM actuatesm;		//SM object

/*---------------- Process Declaration -------------------*/
PROCESS(Actuate_process, "Actuate");
//AUTOSTART_PROCESSES(&Actuate_process);
/*--------------------------------------------------------*/

/*------------------- helper functions -------------------*/
//Timers declare
static struct etimer actuate_tm;
void Start_Actuate_Timer(uint16_t time)
{
   PROCESS_CONTEXT_BEGIN(&Actuate_process);
   etimer_set(&actuate_tm, CLOCK_SECOND*time);
   PROCESS_CONTEXT_END(&Actuate_process);
}

/*--------------------------------------------------------*/

//SM prototypes
void ActuateSM_ctor(ActuateSM *me);
static QState ActuateSM_initial(ActuateSM *me);

static QState ActuateSM_Ready(ActuateSM *me);
static QState ActuateSM_Actuate(ActuateSM *me);

//State Definations
void ActuateSM_ctor(ActuateSM *me){
    QFsm_ctor(&me->super, (QStateHandler)&ActuateSM_initial);
}

QState ActuateSM_initial(ActuateSM *me){ 
    return Q_TRAN(&ActuateSM_Ready);
}

QState ActuateSM_Ready(ActuateSM *me){
	switch (Q_SIG(me)) {
	        case Q_ENTRY_SIG: {
	        	
				Start_Actuate_Timer(30);
		   
	            return Q_HANDLED();
	        }
	        case Q_EXIT_SIG: {	           
	        	
	        		        		            
	            return Q_HANDLED();
	        }
	        case RUNTIME_EVENT_TIMER: {
	            return Q_TRAN(&ActuateSM_Actuate);
	        }    
	    }
    return Q_IGNORED(); 
}
QState ActuateSM_Actuate(ActuateSM *me){
	switch (Q_SIG(me)) {
	        case Q_ENTRY_SIG: {
	        	
				uint16_t setPoint = 6760;   //28 deg. cel
				data_GetData_Temperature(MEAN, 0);	//get a neighbor node id based on the query and store it in the global var 'remoteNodeId'
                printf("mean temp=%d\n", sensorVals.temperature);
				if (sensorVals.temperature > setPoint) {
					REL01_Set(1);
				} else {
					REL01_Set(0);
				}
			
	        	Q_SIG(&actuatesm) = RUNTIME_EVENT_NONE;
	            
	            return Q_HANDLED();
	        }
	        case Q_EXIT_SIG: {	           
	        	
	        		        		            
	            return Q_HANDLED();
	        }
	        case RUNTIME_EVENT_NONE: {
	            return Q_TRAN(&ActuateSM_Ready);
	        }    
	    }
    return Q_IGNORED(); 
}

/*------------------ Process Def -------------------------*/
PROCESS_THREAD(Actuate_process, ev, evtData)
{
	PROCESS_BEGIN();
	void* data;
	uint8_t code;
	
	REL01_Configure();	//actuator activated
  	ActuateSM_ctor(&actuatesm);
  	QFsm_init((QFsm *)&actuatesm); //trigger initial transistion in this object
   
    //******************* where to put this?????????????????????
    rimeaddr_copy(&(sharedData.addr), &rimeaddr_node_addr);
    sensorVals.temperature = 0.0;
    sensorVals.humidity = 0.0;
    sharedData.sensorVals = sensorVals;
    remoteTrig.sharedData = sharedData;
    //******************* where to put this?????????????????????
  	printf("\nactuator...\n");
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
		
		//printf("Actuate event dispatched ...\n\r");
		(&actuatesm)->data = data;	//insert event data pointer in sm object
		(&actuatesm)->code = code;
		Q_SIG(&actuatesm) = ev;
		QFsm_dispatch((QFsm *)&actuatesm);
		
		/*
		* The reason for this secondary dispatch is for NONE event.
		* The number of if's detetmines the length of chain of NONE events possible. Now two!
		*/
		if (Q_SIG(&actuatesm) == RUNTIME_EVENT_NONE) { //means completion of entry action automatically triggers transition, i.e. NULL event
		  QFsm_dispatch((QFsm *)&actuatesm);
		}
		
		if (Q_SIG(&actuatesm) == RUNTIME_EVENT_NONE) { //means completion of entry action automatically triggers transition, i.e. NULL event
		  QFsm_dispatch((QFsm *)&actuatesm);
		}
  }

  PROCESS_END();
}
/*--------------------------------------------------------*/
