
#include <stdio.h>
#include <stdlib.h>	//for malloc
#include "contiki.h"

#if WSNSIM == 0
#include "i2cmaster.h"
#include "st11.h"
#else
#include "random.h"
#endif

/*----------------------------- Yau's Interface -----------------------------*/
void ST11_Configure(void)
{
#if WSNSIM == 0
	i2c_disable();
	sht11_init();
#endif
}

void ST11_Get(int16_t* tempVar)
{
#if WSNSIM == 0
	i2c_disable();		//disable it now because bit-bang protocol is used and sht11 is not completely i2c compliant. Enable it later
//	watchdog_start();
	*tempVar = sht11_temp();
//	watchdog_start();
	i2c_enable();
#else
	//*tempVar = 6522;	//for temperature = 25 deg. cel
	*tempVar = 6522 + random_rand()%500;
#endif
}

/*---------------------------------------------------------------------------*/
