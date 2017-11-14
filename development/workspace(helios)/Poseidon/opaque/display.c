uint16_t hum = ((struct sharedData*) (me->data))->sensorVals.humidity;
int16_t temp = ((struct sharedData*) (me->data))->sensorVals.temperature;
printf("%u.%u ", ((struct sharedData*) (me->data))->addr.u8[0], ((struct sharedData*) (me->data))->addr.u8[1]);
printf("%u ", me->code);
printf("%u ",
       (unsigned) (-39.60 + 0.01 * temp));
printf("%u\n",
       (unsigned) (-4 + 0.0405*hum - 2.8e-6*(hum*hum)));