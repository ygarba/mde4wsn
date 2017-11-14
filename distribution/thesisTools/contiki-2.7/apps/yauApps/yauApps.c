

#include "contiki.h"
#include "contiki-lib.h"
#include "sys/compower.h"
#include "yauApps.h"
#include "net/rime.h"

#include <stdio.h>
#include <string.h>

PROCESS(yau_process, "Yau App Test");
/*---------------------------------------------------------------------------*/

/*---------------------------------------------------------------------------*/
PROCESS_THREAD(yau_process, ev, data)
{
  static struct etimer periodic;
 
  PROCESS_BEGIN();

  

  while(1) {
	etimer_set(&periodic, CLOCK_SECOND*4);
    PROCESS_WAIT_UNTIL(etimer_expired(&periodic));
    etimer_reset(&periodic);
    printf("Yau app at work\n\r");
  }

  PROCESS_END();
}
/*---------------------------------------------------------------------------*/
void
yauApps_start()
{
  process_start(&yau_process, NULL);
}
/*---------------------------------------------------------------------------*/
