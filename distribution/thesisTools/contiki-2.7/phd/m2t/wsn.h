
#ifndef __WSN_H__
#define __WSN_H__

//Sensor and Actuator headers
#include "st11.h"
#include "sh11.h"
#include "rel01.h"

#ifndef WSNSIM
#define WSNSIM 0
#endif

#ifndef WSNOPT
#define WSNOPT 0
#endif

//cluster prototype
void cluster_start(void);

typedef uint8_t bool;
#define false 0;
#define true 1;

//for searching facts and data list
typedef enum {
	EQUAL,
	MAX,
	MIN,
	MEAN,
	SELF
}SearchCriteria_t;

//data search prototypes
void data_GetData_Temperature(SearchCriteria_t, int);
void data_GetData_Humidity(SearchCriteria_t, int);

//Data
struct sensorVals {
	int16_t temperature;
	int16_t humidity;
};
struct sensorVals sensorVals;	//declare 

struct sharedData {
	rimeaddr_t addr;
	struct sensorVals sensorVals; 
}; 
struct sharedData sharedData;

struct remoteTrig {	//remote trigger message carries the exec code and the shared data
	uint8_t code;
	struct sharedData sharedData;
};
struct remoteTrig remoteTrig;

/* Globals variables. Available to developer */
rimeaddr_t targetAddr;
//Self Data
uint8_t runtime_activating_specific;	//to be deprecated
uint16_t self_battery;
uint8_t self_hop;
bool self_ch;
rimeaddr_t my_ch_addr;
uint8_t self_cm;
uint8_t self_neighbors;
int16_t self_temperature;
int16_t self_humidity;
int16_t temperature;
int16_t humidity;
uint16_t battery;
uint16_t link;
uint8_t hop;
uint8_t neighbors;
bool ch;

/******** non gen *************/
void runtime_GetNodeId(void *data);
void runtime_UpdatePool();
void runtime_RemoteTrigger(uint8_t, void*);

void facts_GetNode_Battery(SearchCriteria_t, int);
void facts_GetNode_Link(SearchCriteria_t, int);
void facts_GetNode_Hop(SearchCriteria_t, int);
void facts_GetNode_Ch(SearchCriteria_t, int);
uint8_t facts_GetNeighbors(void);
uint16_t facts_GetBattery(void);
bool facts_AnyCH(void);

void data_shareData(struct sharedData* shared);
void data_updateDataPool(const rimeaddr_t *from, struct sharedData* m);

//process start
void runtime_init(void);
void nfacts_start(void);
void ndata_start(void);

//housekeeping
rimeaddr_t facts_purge(void);
void data_purge(rimeaddr_t);

#endif /* ifndef __WSN_H__ */
