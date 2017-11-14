#ifndef __SH11_H__
#define __SH11_H__
#include <stdio.h>

#if WSNSIM == 0
#include "i2cmaster.h"
#include "dev/sht11.h"
#endif

void SH11_Configure(void);
void SH11_Get(int16_t*);

/* -------------------------------------------------------------------------- */
#endif /* ifndef __SH11_H__ */



