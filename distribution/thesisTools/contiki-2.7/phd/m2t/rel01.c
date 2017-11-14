#include "contiki.h"
uint8_t status;
/*----------------------------- Yau's Interface -----------------------------*/
void REL01_Configure(void)
{
    status = 0;
#if WSNSIM == 0
	//actuation on P2.1
    P2SEL &= ~(1<<1);	//select as gpio
	P2DIR |= (1<<1);	//output
	P2OUT &= ~(1<<1); 	//off
#endif
}

void REL01_Set(uint8_t val)
{
    status = val;
#if WSNSIM == 0
	if (val != 0){
        P2OUT |= (1<<1); 	//on
        status = 1;
    } else {
        P2OUT &= ~(1<<1); 	//off
        status = 0;
    }
#endif
}

uint8_t REL01_Get()
{
    return status;
}
/*---------------------------------------------------------------------------*/
