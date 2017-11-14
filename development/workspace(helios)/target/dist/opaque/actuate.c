if (sensorVals.temperature > setpoint) {
	REL01_Set(1);
} else {
	REL01_Set(0);
}