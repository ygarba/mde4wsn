
#include <stdio.h>
#include "dev/leds.h"

#include "z1led.h"

/*----------------------------- Yau's Interface -----------------------------*/
void Z1LED_Configure()
{
  leds_off(LEDS_RED);
  leds_off(LEDS_GREEN);
  leds_off(LEDS_BLUE);
}

void Z1LED_Set(void* datum)
{
	/*
	uint8_t* data;
	data = (struct ledData*)datum;

	if (data->red == FALSE){
		leds_off(LEDS_RED);
	}else {
		leds_on(LEDS_RED);
	}
	
	if (data->green == FALSE){
		leds_off(LEDS_GREEN);
	}else {
		leds_on(LEDS_GREEN);
	}
	
	if (data->blue == FALSE){
		leds_off(LEDS_BLUE);
	}else {
		leds_on(LEDS_BLUE);
	}
	*/
}
