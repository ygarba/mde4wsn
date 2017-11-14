#!/bin/bash
# script to run cooja headless
#Creating the simulation:
#javascript: Timeout must be 300000 (5mins)
# TIMEOUT(200000);
# while (true) {
#  	log.log(time + ":" + id + ":" + msg + "\n");
#  	YIELD();
# }

#Plugins:
#Script runner
#LogListener
#SimControl
#Visualizer


#ToDo: get rid of path hardcode...
cd $WSN_HOME/contiki-2.7/phd/m2t
java -jar ../../tools/cooja/dist/cooja.jar -quickstart='wsnopt.csc' -contiki='../..'
