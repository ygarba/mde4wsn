# ~/.bashrc: executed by bash(1) for non-login shells.
# see /usr/share/doc/bash/examples/startup-files (in the package bash-doc)
# for examples
#This will force bash to ignore carriage return (\r) characters used in Windows line separators.
(set -o igncr) 2>/dev/null && set -o igncr; # this comment is needed
#!/bin/bash

#Script to get memory usage
#ToDo: Get rid of the hardcoded path
#cd /cygdrive/d/Dropbox/thesisTools/contiki-2.7/phd/m2t
cd $WSN_HOME/contiki-2.7/phd/m2t
/cygdrive/c/msp430-gcc/bin/msp430-size -A -t wsn.z1 | grep "Total" | awk '{print $2}'


