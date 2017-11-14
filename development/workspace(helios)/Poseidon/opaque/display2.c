uint16_t hum = ((struct sharedData*) (me->data))->sensorVals.humidity;
int16_t temp = ((struct sharedData*) (me->data))->sensorVals.temperature;
printf("Sensor data in..\n");
printf("Code %u, ", me->code);
printf("Origin: %u.%u\n", ((struct sharedData*) (me->data))->addr.u8[0], ((struct sharedData*) (me->data))->addr.u8[1]);
//printf("Raws: temp = %u, hum = %u\n", temp, hum);
printf("Temperature: %u deg cel\n",
       (unsigned) (-39.60 + 0.01 * temp));
printf("Humidity: %u%%\n",
       (unsigned) (-4 + 0.0405*hum - 2.8e-6*(hum*hum)));