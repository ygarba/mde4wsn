# ~/.bashrc: executed by bash(1) for non-login shells.
# see /usr/share/doc/bash/examples/startup-files (in the package bash-doc)
# for examples
#This will force bash to ignore carriage return (\r) characters used in Windows line separators.
(set -o igncr) 2>/dev/null && set -o igncr; # this comment is needed
#!/bin/bash

#ToDo: Get rid of the hardcoded path
#cd /cygdrive/d/Dropbox/thesisTools/contiki-2.7/phd/m2t
echo "simulation script started..."
cd $WSN_HOME/contiki-2.7/phd/m2t
rm COOJA.log
rm COOJA.testlog
#make TARGET=z1 clean
#make TARGET=cooja clean
java -Xmx512M -jar ../../tools/cooja/dist/cooja.jar -nogui='wsnopt.csc' -contiki='../..'

