
#include <stdio.h>
#include <stdlib.h>	//for malloc
#include "contiki.h"

#if WSNSIM == 0
#include "i2cmaster.h"
#include "sh11.h"
#else
#include "random.h"
#endif


/*----------------------------- Yau's Interface -----------------------------*/
void SH11_Configure(void)
{
#if WSNSIM == 0
	i2c_disable();
	sht11_init();
#endif
}

void SH11_Get(int16_t* tempVar)
{
#if WSNSIM == 0
	i2c_disable();		//disable it now because bit-bang protocol is used and sht11 is not completely i2c compliant. Enable it later
//	watchdog_start();
	*tempVar = sht11_humidity();
//	watchdog_start();
	i2c_enable();
#else
	//*tempVar = 1400;	//for humidity = 52%
	*tempVar = 1400 + random_rand()%200;
#endif
}

/*---------------------------------------------------------------------------*/
