#ifndef __Z1LED_H__
#define __Z1LED_H__
#include <stdio.h>

struct Z1LED_data {
	uint8_t red;
	uint8_t green;
	uint8_t blue;
};

/* -------------------------------------------------------------------------- */
/* Init the actuator
*/
void  Z1LED_Configure();

/*
* Set actuating here. 
*/
void  Z1LED_Set(void*);

#define TRUE 1
#define FALSE 0
/* -------------------------------------------------------------------------- */
#endif /* ifndef __TMP102_H__ */



