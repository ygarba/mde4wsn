
ifndef TARGET
TARGET=z1
endif

CONTIKI_PROJECT = wsnApp

CONTIKI_SOURCEFILES += qepn.c runtime.c wsn.c neighbors_facts.c neighbors_data.c
#tasks
CONTIKI_SOURCEFILES += task_Chead.c
CONTIKI_SOURCEFILES += task_Sense.c
CONTIKI_SOURCEFILES += task_Sink.c
CONTIKI_SOURCEFILES += task_Routing.c
CONTIKI_SOURCEFILES += task_Actuate.c
#sensor drivers
CONTIKI_SOURCEFILES += st11.c
CONTIKI_SOURCEFILES += sh11.c
#actuator drivers
CONTIKI_SOURCEFILES += rel01.c
 CONTIKI_SOURCEFILES += cluster.c	#add clustering src (only if cluster is modeled)

ifeq ($(opt), 1)
    CONTIKI_SOURCEFILES += optimization.c
 	APPS+=powertrace
endif

all: $(CONTIKI_PROJECT)

CONTIKI = ../..
CFLAGS += -DPROJECT_CONF_H=\"project-conf.h\"
CFLAGS += -DWSNSIM=$(sim)
CFLAGS += -DWSNOPT=$(opt)

include $(CONTIKI)/Makefile.include
