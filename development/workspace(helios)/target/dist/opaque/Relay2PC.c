int16_t temp = ((struct sharedData*) (me->data))->SenseData.temperature;
				
printf("%u.%u: ", 
	((struct sharedData*) (me->data))->addr.u8[0], ((struct sharedData*) (me->data))->addr.u8[1]);
				
printf("t = [%u] C\n",
	(unsigned) (-39.60 + 0.01 * temp));