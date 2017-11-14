# ~/.bashrc: executed by bash(1) for non-login shells.
# see /usr/share/doc/bash/examples/startup-files (in the package bash-doc)
# for examples
#This will force bash to ignore carriage return (\r) characters used in Windows line separators.
(set -o igncr) 2>/dev/null && set -o igncr; # this comment is needed
#! /bin/bash

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


cd $WSN_HOME/contiki-2.7/phd/m2t
rm COOJA.log
rm COOJA.testlog
make TARGET=z1 clean
make TARGET=cooja clean
java -Xmx512M -jar ../../tools/cooja/dist/cooja.jar -quickstart='wsnopt.csc' -contiki='../..'
