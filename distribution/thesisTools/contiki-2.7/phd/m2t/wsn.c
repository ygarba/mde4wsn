
/******************************************************
* first process responsible for starting other process
******************************************************/	
#include "contiki.h"
#include <stdio.h>
#include "net/netstack.h"

#include "runtime.h"
#include "wsn.h"

/*---------------- Process Declaration -------------------*/
PROCESS(wsn_process, "WSN Process");
AUTOSTART_PROCESSES(&wsn_process);
/*--------------------------------------------------------*/

/*------------------ Process Def -------------------------*/
PROCESS_THREAD(wsn_process, ev, data)
{
	PROCESS_BEGIN();
	runtime_init();
	
	printf("runtime started. Am exiting...\n\r");
	PROCESS_END();
}
/*--------------------------------------------------------*/
