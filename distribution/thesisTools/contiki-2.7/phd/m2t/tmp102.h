#ifndef __TMP102_H__
#define __TMP102_H__
#include <stdio.h>
#include "i2cmaster.h"

/*
*	Data format is defined here. It will be used to cast the returned
* 	void pointer from configure
*/

/*
struct TMP102_data {
	int16_t temperature;
}; */

/*
* Get temp here. Pass as argument a pointer to the data buffer
*/
//void  TMP102_Get(void *);
void TMP102_Get(int16_t*);

/* -------------------------------------------------------------------------- */
/* Init the temperature sensor and create buffer for result
*/
void  TMP102_Configure(void);

/* Write to a register.
    args:
      reg       register to write to
      val       value to write
*/
void    tmp102_write_reg(uint8_t reg, uint16_t val);

/* Read one register.
    args:
      reg       what register to read
    returns the value of the read register
*/
uint16_t tmp102_read_reg(uint8_t reg);

/* Read temperature in raw format
    no args needed
*/
uint16_t tmp102_read_temp_raw();

/* Read only integer part of the temperature in 1deg. precision.
    no args needed
*/
int8_t tmp102_read_temp_simple();

/* Read only integer part of the temperature in 1deg. precision.
    no args needed
*/
int16_t tmp102_read_temp_x100();

/* -------------------------------------------------------------------------- */
/* Reference definitions */
/* TMP102 slave address */
#define TMP102_ADDR           0x48

/* TMP102 registers */
#define TMP102_TEMP           0x00    // read only
#define TMP102_CONF           0x01    
#define TMP102_TLOW           0x02    
#define TMP102_THIGH          0x03   

/* TMP102 Ports */
/* Accelerometer hardware ports, pins and registers on the msp430 µC */
#define TMP102_PWR_DIR        P5DIR
#define TMP102_PWR_SEL        P5SEL
#define TMP102_PWR_SEL2       P5SEL2
#define TMP102_PWR_REN        P5REN
#define TMP102_PWR_OUT        P5OUT
#define TMP102_PWR_PIN        (1<<0)          // P5.0
//#define TMP102_INT_PIN      (1<<7)          // P1.7


/* -------------------------------------------------------------------------- */
#endif /* ifndef __TMP102_H__ */



