
#include <stdio.h>
#include <stdlib.h>	//for malloc
#include "contiki.h"
#include "i2cmaster.h"
#include "tmp102.h"


//void * dataPointer;

/* Bitmasks and bit flag variable for keeping track of tmp102 status. */
enum TMP102_STATUSTYPES
{
  /* must be a bit and not more, not using 0x00. */
  INITED = 0x01,
  RUNNING = 0x02,
  STOPPED = 0x04,
  LOW_POWER = 0x08,
  AAA = 0x10,			// available to extend this...
  BBB = 0x20,			// available to extend this...
  CCC = 0x40,			// available to extend this...
  DDD = 0x80 			// available to extend this...
};
static enum TMP102_STATUSTYPES _TMP102_STATUS = 0x00;


/*---------------------------------------------------------------------------*/
//PROCESS(tmp102_process, "Temperature Sensor process");

/*----------------------------- Yau's Interface -----------------------------*/
void TMP102_Configure(void)
{
  //dataPointer = malloc(sizeof(struct TMP102_data));
  
  if (!(_TMP102_STATUS & INITED))
    {
      PRINTFDEBUG ("TMP102 init\n");
      _TMP102_STATUS |= INITED;
      /* Power Up TMP102 via pin */
      TMP102_PWR_DIR |= TMP102_PWR_PIN;
      TMP102_PWR_SEL &= ~TMP102_PWR_SEL;
      TMP102_PWR_SEL2 &= ~TMP102_PWR_SEL;
      TMP102_PWR_REN &= ~TMP102_PWR_SEL;
      TMP102_PWR_OUT |= TMP102_PWR_PIN;

      /* Set up ports and pins for I2C communication */
      i2c_enable ();
   }
   
   //return dataPointer;
}

//void TMP102_Get(void *data)
void TMP102_Get(int16_t* tempVar)
{
	//int16_t temp;

	*tempVar = tmp102_read_temp_x100();
	//((struct TMP102_data*)data)->temperature = temp;
	//data->temperature = temp;
}


/*---------------------------------------------------------------------------*/
/* Write to a 16-bit register.
    args:
      reg       register to write to
      val       value to write
*/

void
tmp102_write_reg (uint8_t reg, uint16_t val)
{
  uint8_t tx_buf[] = { reg, 0x00, 0x00 };

  tx_buf[1] = (uint8_t) (val >> 8);
  tx_buf[2] = (uint8_t) (val & 0x00FF);

  i2c_transmitinit (TMP102_ADDR);
  while (i2c_busy ());
  PRINTFDEBUG ("I2C Ready to TX\n");

  i2c_transmit_n (3, tx_buf);
  while (i2c_busy ());
  PRINTFDEBUG ("WRITE_REG 0x%04X @ reg 0x%02X\n", val, reg);
}

/*---------------------------------------------------------------------------*/
/* Read register.
    args:
      reg       what register to read
    returns the value of the read register type uint16_t
*/

uint16_t
tmp102_read_reg (uint8_t reg)
{
  uint8_t buf[] = { 0x00, 0x00 };
  uint16_t retVal = 0;
  uint8_t rtx = reg;
  PRINTFDEBUG ("READ_REG 0x%02X\n", reg);

  // transmit the register to read 
  i2c_transmitinit (TMP102_ADDR);
  while (i2c_busy ());
  i2c_transmit_n (1, &rtx);
  while (i2c_busy ());

  // receive the data 
  i2c_receiveinit (TMP102_ADDR);
  while (i2c_busy ());
  i2c_receive_n (2, &buf[0]);
  while (i2c_busy ());

  retVal = (uint16_t) (buf[0] << 8 | (buf[1]));

  return retVal;
}

/*---------------------------------------------------------------------------*/
/* Read temperature in a raw format. Further processing will be needed
   to make an interpretation of these 12 or 13-bit data, depending on configuration
*/

uint16_t
tmp102_read_temp_raw (void)
{
  uint16_t rd = 0;

  rd = tmp102_read_reg (TMP102_TEMP);

  return rd;
}

int16_t
tmp102_read_temp_x100(void)
{
  int16_t raw = 0;
  int8_t rd = 0;
  int16_t sign = 1;
  int16_t abstemp, temp_int;

  raw = (int16_t) tmp102_read_reg (TMP102_TEMP);
  if(raw < 0) {
    abstemp = (raw ^ 0xFFFF) + 1;
    sign = -1;
  } else {
    abstemp = raw;
  }

  /* Integer part of the temperature value and percents*/
  temp_int = (abstemp >> 8) * sign * 100;
  temp_int += ((abstemp & 0xff) * 100) / 0x100;
  
  /* See test-tmp102.c on how to print values of temperature with decimals 
     fractional part in 1/10000 of degree 
     temp_frac = ((abstemp >>4) % 16) * 625; 
     Data could be multiplied by 63 to have less bit-growth and 1/1000 precision 
     Data could be multiplied by 64 (<< 6) to trade-off precision for speed 
  */

  return temp_int;
}

/*---------------------------------------------------------------------------*/
/* Simple Read temperature. Return is an integer with temperature in 1deg. precision 
   Return value is a signed 8 bit integer.
*/

int8_t
tmp102_read_temp_simple (void)
{
  return (int8_t) tmp102_read_temp_x100() / 100;
}
