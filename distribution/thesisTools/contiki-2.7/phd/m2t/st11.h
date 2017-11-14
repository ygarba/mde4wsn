#ifndef __ST11_H__
#define __ST11_H__
#include <stdio.h>
//#include "i2cmaster.h"

#if WSNSIM == 0				//if != 1
#include "dev/sht11.h"
#endif

void ST11_Configure(void);
void ST11_Get(int16_t*);

/* -------------------------------------------------------------------------- */
#endif /* ifndef __ST11_H__ */



