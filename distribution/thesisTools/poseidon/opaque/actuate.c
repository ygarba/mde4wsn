if (sensorVals.temperature > setPoint) {
	REL01_Set(1);
} else {
	REL01_Set(0);
}