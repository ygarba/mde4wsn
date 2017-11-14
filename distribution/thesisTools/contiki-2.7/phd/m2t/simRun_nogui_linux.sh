#!/bin/bash

#ToDo: Get rid of the hardcoded path
#cd /cygdrive/d/Dropbox/thesisTools/contiki-2.7/phd/m2t
cd $WSN_HOME/contiki-2.7/phd/m2t
pwd
rm COOJA.log
rm COOJA.testlog
#make TARGET=z1 clean
#make TARGET=cooja clean
java -Xmx512M -jar ../../tools/cooja/dist/cooja.jar -nogui='wsnopt.csc' -contiki='../..'
