
/****************************************************
* Generated code for task -> Sense 
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

enum SenseSMEvents {
    OFFSET_EVT = Q_USER_SIG,
    OFFSET2_EVT = 150,
	RUNTIME_EVENT_TIMER = PROCESS_EVENT_TIMER, 
	RUNTIME_EVENT_UPDATEPOOL = 250,
	RUNTIME_EVENT_REMOTETRIGGER,
    RUNTIME_EVENT_NONE				//for automatic transition after entry action completion
};

typedef struct SENSESMTag {
    QFsm super;
    void *data;	//data extracted from event and passed to SM
    uint8_t code;	//code for remote trig
} SenseSM;		//derived from QFsm

SenseSM sensesm;		//SM object

/*---------------- Process Declaration -------------------*/
PROCESS(Sense_process, "Sense");
//AUTOSTART_PROCESSES(&Sense_process);
/*--------------------------------------------------------*/

/*------------------- helper functions -------------------*/
//Timers declare
static struct etimer Timer_2;
void Start_Sense_Timer(uint16_t time)
{
   PROCESS_CONTEXT_BEGIN(&Sense_process);
   etimer_set(&Timer_2, CLOCK_SECOND*time);
   PROCESS_CONTEXT_END(&Sense_process);
}

/*--------------------------------------------------------*/

//SM prototypes
void SenseSM_ctor(SenseSM *me);
static QState SenseSM_initial(SenseSM *me);

static QState SenseSM_Ready(SenseSM *me);
static QState SenseSM_Sense(SenseSM *me);

//State Definations
void SenseSM_ctor(SenseSM *me){
    QFsm_ctor(&me->super, (QStateHandler)&SenseSM_initial);
}

QState SenseSM_initial(SenseSM *me){ 
    return Q_TRAN(&SenseSM_Ready);
}

QState SenseSM_Ready(SenseSM *me){
	switch (Q_SIG(me)) {
	        case Q_ENTRY_SIG: {
	        	
				Start_Sense_Timer(60);
		            
	            return Q_HANDLED();
	        }
	        case Q_EXIT_SIG: {	           
	        	
	        		        		            
	            return Q_HANDLED();
	        }
	        case RUNTIME_EVENT_TIMER: {
	            return Q_TRAN(&SenseSM_Sense);
	        }    
	    }
    return Q_IGNORED(); 
}
QState SenseSM_Sense(SenseSM *me){
	switch (Q_SIG(me)) {
	        case Q_ENTRY_SIG: {
	        									
				SH11_Get(&sensorVals.humidity);	//sensor asked to get new data and place it in buffer
				ST11_Get(&sensorVals.temperature);	//sensor asked to get new data and place it in buffer
				runtime_UpdatePool();
				
	        	Q_SIG(&sensesm) = RUNTIME_EVENT_NONE;
	            
	            return Q_HANDLED();
	        }
	        case Q_EXIT_SIG: {	           
	        	
	        		        		            
	            return Q_HANDLED();
	        }
	        case RUNTIME_EVENT_NONE: {
	            return Q_TRAN(&SenseSM_Ready);
	        }    
	    }
    return Q_IGNORED(); 
}

/*------------------ Process Def -------------------------*/
PROCESS_THREAD(Sense_process, ev, evtData)
{
	PROCESS_BEGIN();
	void* data;
	uint8_t code;
	
	ST11_Configure();	//sensor activated
	SH11_Configure();	//sensor activated
  	SenseSM_ctor(&sensesm);
  	QFsm_init((QFsm *)&sensesm); //trigger initial transistion in this object
    printf("\nsensor...\n");
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
		
		//printf("Sense event dispatched ...\n\r");
		(&sensesm)->data = data;	//insert event data pointer in sm object
		(&sensesm)->code = code;
		Q_SIG(&sensesm) = ev;
		QFsm_dispatch((QFsm *)&sensesm);
		
		/*
		* The reason for this secondary dispatch is for NONE event.
		* The number of if's detetmines the length of chain of NONE events possible. Now two!
		*/
		if (Q_SIG(&sensesm) == RUNTIME_EVENT_NONE) { //means completion of entry action automatically triggers transition, i.e. NULL event
		  QFsm_dispatch((QFsm *)&sensesm);
		}
		
		if (Q_SIG(&sensesm) == RUNTIME_EVENT_NONE) { //means completion of entry action automatically triggers transition, i.e. NULL event
		  QFsm_dispatch((QFsm *)&sensesm);
		}
  }

  PROCESS_END();
}
/*--------------------------------------------------------*/
