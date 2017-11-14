// DO NOT MODIFY THIS FILE! This code is generated.

package com.gentleware.poseidon.model.wrapper;

import com.gentleware.poseidon.dsl.DSLPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

public interface WrapperPackage extends EPackage {

	String eNAME = "wrapper";

	String eNS_URI = "http://www.gentleware.com/poseidon/dsl/wrapper/1.0";

	String eNS_PREFIX = "wrapper";

	WrapperPackage eINSTANCE = com.gentleware.poseidon.model.wrapper.impl.WrapperPackageImpl.init();
	
	int WRAPPED_OBJECTIVES = 0;

	int WRAPPED_OBJECTIVES__UUID = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getObjectives().getFeatureCount() + 0;

	int WRAPPED_OBJECTIVES__JDELETED = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getObjectives().getFeatureCount() + 1;

	int WRAPPED_OBJECTIVES__JDIAGRAM_HOLDER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getObjectives().getFeatureCount() + 2;

	int WRAPPED_OBJECTIVES__READ_ONLY = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getObjectives().getFeatureCount() + 3;

	int WRAPPED_OBJECTIVES__POSEIDON_NAME = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getObjectives().getFeatureCount() + 4;

	int WRAPPED_OBJECTIVES__POSEIDON_NAMESPACE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getObjectives().getFeatureCount() + 5;

	int WRAPPED_OBJECTIVES__OWNED_MEMBER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getObjectives().getFeatureCount() + 6;

	int WRAPPED_OBJECTIVES__SOURCE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getObjectives().getFeatureCount() + 7;

	int WRAPPED_OBJECTIVES__TARGET = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getObjectives().getFeatureCount() + 8;
	
	int WRAPPED_OBJECTIVES__POSEIDON_EDGE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getObjectives().getFeatureCount() + 9;
	
	int WRAPPED_OBJECTIVES__POSEIDON_ROLE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getObjectives().getFeatureCount() + 10;

	int WRAPPED_OBJECTIVES_FEATURE_COUNT = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getObjectives().getFeatureCount() + 11;
	
	int WRAPPED_SENSOR = 1;

	int WRAPPED_SENSOR__UUID = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getSensor().getFeatureCount() + 0;

	int WRAPPED_SENSOR__JDELETED = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getSensor().getFeatureCount() + 1;

	int WRAPPED_SENSOR__JDIAGRAM_HOLDER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getSensor().getFeatureCount() + 2;

	int WRAPPED_SENSOR__READ_ONLY = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getSensor().getFeatureCount() + 3;

	int WRAPPED_SENSOR__POSEIDON_NAME = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getSensor().getFeatureCount() + 4;

	int WRAPPED_SENSOR__POSEIDON_NAMESPACE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getSensor().getFeatureCount() + 5;

	int WRAPPED_SENSOR__OWNED_MEMBER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getSensor().getFeatureCount() + 6;

	int WRAPPED_SENSOR__SOURCE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getSensor().getFeatureCount() + 7;

	int WRAPPED_SENSOR__TARGET = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getSensor().getFeatureCount() + 8;
	
	int WRAPPED_SENSOR__POSEIDON_EDGE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getSensor().getFeatureCount() + 9;
	
	int WRAPPED_SENSOR__POSEIDON_ROLE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getSensor().getFeatureCount() + 10;

	int WRAPPED_SENSOR_FEATURE_COUNT = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getSensor().getFeatureCount() + 11;
	
	int WRAPPED_ACTUATOR = 2;

	int WRAPPED_ACTUATOR__UUID = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActuator().getFeatureCount() + 0;

	int WRAPPED_ACTUATOR__JDELETED = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActuator().getFeatureCount() + 1;

	int WRAPPED_ACTUATOR__JDIAGRAM_HOLDER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActuator().getFeatureCount() + 2;

	int WRAPPED_ACTUATOR__READ_ONLY = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActuator().getFeatureCount() + 3;

	int WRAPPED_ACTUATOR__POSEIDON_NAME = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActuator().getFeatureCount() + 4;

	int WRAPPED_ACTUATOR__POSEIDON_NAMESPACE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActuator().getFeatureCount() + 5;

	int WRAPPED_ACTUATOR__OWNED_MEMBER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActuator().getFeatureCount() + 6;

	int WRAPPED_ACTUATOR__SOURCE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActuator().getFeatureCount() + 7;

	int WRAPPED_ACTUATOR__TARGET = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActuator().getFeatureCount() + 8;
	
	int WRAPPED_ACTUATOR__POSEIDON_EDGE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActuator().getFeatureCount() + 9;
	
	int WRAPPED_ACTUATOR__POSEIDON_ROLE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActuator().getFeatureCount() + 10;

	int WRAPPED_ACTUATOR_FEATURE_COUNT = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActuator().getFeatureCount() + 11;
	
	int WRAPPED_ACTUATING = 3;

	int WRAPPED_ACTUATING__UUID = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActuating().getFeatureCount() + 0;

	int WRAPPED_ACTUATING__JDELETED = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActuating().getFeatureCount() + 1;

	int WRAPPED_ACTUATING__JDIAGRAM_HOLDER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActuating().getFeatureCount() + 2;

	int WRAPPED_ACTUATING__READ_ONLY = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActuating().getFeatureCount() + 3;

	int WRAPPED_ACTUATING__POSEIDON_NAME = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActuating().getFeatureCount() + 4;

	int WRAPPED_ACTUATING__POSEIDON_NAMESPACE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActuating().getFeatureCount() + 5;

	int WRAPPED_ACTUATING__OWNED_MEMBER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActuating().getFeatureCount() + 6;

	int WRAPPED_ACTUATING__SOURCE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActuating().getFeatureCount() + 7;

	int WRAPPED_ACTUATING__TARGET = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActuating().getFeatureCount() + 8;
	
	int WRAPPED_ACTUATING__POSEIDON_EDGE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActuating().getFeatureCount() + 9;
	
	int WRAPPED_ACTUATING__POSEIDON_ROLE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActuating().getFeatureCount() + 10;

	int WRAPPED_ACTUATING_FEATURE_COUNT = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActuating().getFeatureCount() + 11;
	
	int WRAPPED_TASK = 4;

	int WRAPPED_TASK__UUID = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getTask().getFeatureCount() + 0;

	int WRAPPED_TASK__JDELETED = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getTask().getFeatureCount() + 1;

	int WRAPPED_TASK__JDIAGRAM_HOLDER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getTask().getFeatureCount() + 2;

	int WRAPPED_TASK__READ_ONLY = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getTask().getFeatureCount() + 3;

	int WRAPPED_TASK__POSEIDON_NAME = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getTask().getFeatureCount() + 4;

	int WRAPPED_TASK__POSEIDON_NAMESPACE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getTask().getFeatureCount() + 5;

	int WRAPPED_TASK__OWNED_MEMBER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getTask().getFeatureCount() + 6;

	int WRAPPED_TASK__SOURCE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getTask().getFeatureCount() + 7;

	int WRAPPED_TASK__TARGET = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getTask().getFeatureCount() + 8;
	
	int WRAPPED_TASK__POSEIDON_EDGE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getTask().getFeatureCount() + 9;
	
	int WRAPPED_TASK__POSEIDON_ROLE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getTask().getFeatureCount() + 10;

	int WRAPPED_TASK_FEATURE_COUNT = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getTask().getFeatureCount() + 11;
	
	int WRAPPED_SENSING = 5;

	int WRAPPED_SENSING__UUID = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getSensing().getFeatureCount() + 0;

	int WRAPPED_SENSING__JDELETED = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getSensing().getFeatureCount() + 1;

	int WRAPPED_SENSING__JDIAGRAM_HOLDER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getSensing().getFeatureCount() + 2;

	int WRAPPED_SENSING__READ_ONLY = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getSensing().getFeatureCount() + 3;

	int WRAPPED_SENSING__POSEIDON_NAME = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getSensing().getFeatureCount() + 4;

	int WRAPPED_SENSING__POSEIDON_NAMESPACE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getSensing().getFeatureCount() + 5;

	int WRAPPED_SENSING__OWNED_MEMBER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getSensing().getFeatureCount() + 6;

	int WRAPPED_SENSING__SOURCE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getSensing().getFeatureCount() + 7;

	int WRAPPED_SENSING__TARGET = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getSensing().getFeatureCount() + 8;
	
	int WRAPPED_SENSING__POSEIDON_EDGE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getSensing().getFeatureCount() + 9;
	
	int WRAPPED_SENSING__POSEIDON_ROLE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getSensing().getFeatureCount() + 10;

	int WRAPPED_SENSING_FEATURE_COUNT = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getSensing().getFeatureCount() + 11;
	
	int WRAPPED_NODE = 6;

	int WRAPPED_NODE__UUID = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getNode().getFeatureCount() + 0;

	int WRAPPED_NODE__JDELETED = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getNode().getFeatureCount() + 1;

	int WRAPPED_NODE__JDIAGRAM_HOLDER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getNode().getFeatureCount() + 2;

	int WRAPPED_NODE__READ_ONLY = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getNode().getFeatureCount() + 3;

	int WRAPPED_NODE__POSEIDON_NAME = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getNode().getFeatureCount() + 4;

	int WRAPPED_NODE__POSEIDON_NAMESPACE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getNode().getFeatureCount() + 5;

	int WRAPPED_NODE__OWNED_MEMBER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getNode().getFeatureCount() + 6;

	int WRAPPED_NODE__SOURCE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getNode().getFeatureCount() + 7;

	int WRAPPED_NODE__TARGET = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getNode().getFeatureCount() + 8;
	
	int WRAPPED_NODE__POSEIDON_EDGE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getNode().getFeatureCount() + 9;
	
	int WRAPPED_NODE__POSEIDON_ROLE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getNode().getFeatureCount() + 10;

	int WRAPPED_NODE_FEATURE_COUNT = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getNode().getFeatureCount() + 11;
	
	int WRAPPED_EVENT = 7;

	int WRAPPED_EVENT__UUID = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getEvent().getFeatureCount() + 0;

	int WRAPPED_EVENT__JDELETED = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getEvent().getFeatureCount() + 1;

	int WRAPPED_EVENT__JDIAGRAM_HOLDER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getEvent().getFeatureCount() + 2;

	int WRAPPED_EVENT__READ_ONLY = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getEvent().getFeatureCount() + 3;

	int WRAPPED_EVENT__POSEIDON_NAME = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getEvent().getFeatureCount() + 4;

	int WRAPPED_EVENT__POSEIDON_NAMESPACE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getEvent().getFeatureCount() + 5;

	int WRAPPED_EVENT__OWNED_MEMBER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getEvent().getFeatureCount() + 6;

	int WRAPPED_EVENT__SOURCE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getEvent().getFeatureCount() + 7;

	int WRAPPED_EVENT__TARGET = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getEvent().getFeatureCount() + 8;
	
	int WRAPPED_EVENT__POSEIDON_EDGE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getEvent().getFeatureCount() + 9;
	
	int WRAPPED_EVENT__POSEIDON_ROLE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getEvent().getFeatureCount() + 10;

	int WRAPPED_EVENT_FEATURE_COUNT = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getEvent().getFeatureCount() + 11;
	
	int WRAPPED_NETWORK = 8;

	int WRAPPED_NETWORK__UUID = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getNetwork().getFeatureCount() + 0;

	int WRAPPED_NETWORK__JDELETED = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getNetwork().getFeatureCount() + 1;

	int WRAPPED_NETWORK__JDIAGRAM_HOLDER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getNetwork().getFeatureCount() + 2;

	int WRAPPED_NETWORK__READ_ONLY = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getNetwork().getFeatureCount() + 3;

	int WRAPPED_NETWORK__POSEIDON_NAME = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getNetwork().getFeatureCount() + 4;

	int WRAPPED_NETWORK__POSEIDON_NAMESPACE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getNetwork().getFeatureCount() + 5;

	int WRAPPED_NETWORK__OWNED_MEMBER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getNetwork().getFeatureCount() + 6;

	int WRAPPED_NETWORK__SOURCE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getNetwork().getFeatureCount() + 7;

	int WRAPPED_NETWORK__TARGET = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getNetwork().getFeatureCount() + 8;
	
	int WRAPPED_NETWORK__POSEIDON_EDGE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getNetwork().getFeatureCount() + 9;
	
	int WRAPPED_NETWORK__POSEIDON_ROLE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getNetwork().getFeatureCount() + 10;

	int WRAPPED_NETWORK_FEATURE_COUNT = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getNetwork().getFeatureCount() + 11;
	
	int WRAPPED_COMMUNICATION = 9;

	int WRAPPED_COMMUNICATION__UUID = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getCommunication().getFeatureCount() + 0;

	int WRAPPED_COMMUNICATION__JDELETED = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getCommunication().getFeatureCount() + 1;

	int WRAPPED_COMMUNICATION__JDIAGRAM_HOLDER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getCommunication().getFeatureCount() + 2;

	int WRAPPED_COMMUNICATION__READ_ONLY = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getCommunication().getFeatureCount() + 3;

	int WRAPPED_COMMUNICATION__POSEIDON_NAME = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getCommunication().getFeatureCount() + 4;

	int WRAPPED_COMMUNICATION__POSEIDON_NAMESPACE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getCommunication().getFeatureCount() + 5;

	int WRAPPED_COMMUNICATION__OWNED_MEMBER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getCommunication().getFeatureCount() + 6;

	int WRAPPED_COMMUNICATION__SOURCE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getCommunication().getFeatureCount() + 7;

	int WRAPPED_COMMUNICATION__TARGET = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getCommunication().getFeatureCount() + 8;
	
	int WRAPPED_COMMUNICATION__POSEIDON_EDGE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getCommunication().getFeatureCount() + 9;
	
	int WRAPPED_COMMUNICATION__POSEIDON_ROLE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getCommunication().getFeatureCount() + 10;

	int WRAPPED_COMMUNICATION_FEATURE_COUNT = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getCommunication().getFeatureCount() + 11;
	
	int WRAPPED_DATA = 10;

	int WRAPPED_DATA__UUID = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getData().getFeatureCount() + 0;

	int WRAPPED_DATA__JDELETED = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getData().getFeatureCount() + 1;

	int WRAPPED_DATA__JDIAGRAM_HOLDER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getData().getFeatureCount() + 2;

	int WRAPPED_DATA__READ_ONLY = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getData().getFeatureCount() + 3;

	int WRAPPED_DATA__POSEIDON_NAME = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getData().getFeatureCount() + 4;

	int WRAPPED_DATA__POSEIDON_NAMESPACE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getData().getFeatureCount() + 5;

	int WRAPPED_DATA__OWNED_MEMBER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getData().getFeatureCount() + 6;

	int WRAPPED_DATA__SOURCE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getData().getFeatureCount() + 7;

	int WRAPPED_DATA__TARGET = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getData().getFeatureCount() + 8;
	
	int WRAPPED_DATA__POSEIDON_EDGE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getData().getFeatureCount() + 9;
	
	int WRAPPED_DATA__POSEIDON_ROLE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getData().getFeatureCount() + 10;

	int WRAPPED_DATA_FEATURE_COUNT = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getData().getFeatureCount() + 11;
	
	int WRAPPED_STATE = 11;

	int WRAPPED_STATE__UUID = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getState().getFeatureCount() + 0;

	int WRAPPED_STATE__JDELETED = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getState().getFeatureCount() + 1;

	int WRAPPED_STATE__JDIAGRAM_HOLDER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getState().getFeatureCount() + 2;

	int WRAPPED_STATE__READ_ONLY = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getState().getFeatureCount() + 3;

	int WRAPPED_STATE__POSEIDON_NAME = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getState().getFeatureCount() + 4;

	int WRAPPED_STATE__POSEIDON_NAMESPACE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getState().getFeatureCount() + 5;

	int WRAPPED_STATE__OWNED_MEMBER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getState().getFeatureCount() + 6;

	int WRAPPED_STATE__SOURCE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getState().getFeatureCount() + 7;

	int WRAPPED_STATE__TARGET = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getState().getFeatureCount() + 8;
	
	int WRAPPED_STATE__POSEIDON_EDGE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getState().getFeatureCount() + 9;
	
	int WRAPPED_STATE__POSEIDON_ROLE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getState().getFeatureCount() + 10;

	int WRAPPED_STATE_FEATURE_COUNT = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getState().getFeatureCount() + 11;
	
	int WRAPPED_TRANSITION = 12;

	int WRAPPED_TRANSITION__UUID = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getTransition().getFeatureCount() + 0;

	int WRAPPED_TRANSITION__JDELETED = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getTransition().getFeatureCount() + 1;

	int WRAPPED_TRANSITION__JDIAGRAM_HOLDER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getTransition().getFeatureCount() + 2;

	int WRAPPED_TRANSITION__READ_ONLY = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getTransition().getFeatureCount() + 3;

	int WRAPPED_TRANSITION__POSEIDON_NAME = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getTransition().getFeatureCount() + 4;

	int WRAPPED_TRANSITION__POSEIDON_NAMESPACE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getTransition().getFeatureCount() + 5;

	int WRAPPED_TRANSITION__OWNED_MEMBER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getTransition().getFeatureCount() + 6;

	int WRAPPED_TRANSITION__SOURCE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getTransition().getFeatureCount() + 7;

	int WRAPPED_TRANSITION__TARGET = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getTransition().getFeatureCount() + 8;
	
	int WRAPPED_TRANSITION__POSEIDON_EDGE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getTransition().getFeatureCount() + 9;
	
	int WRAPPED_TRANSITION__POSEIDON_ROLE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getTransition().getFeatureCount() + 10;

	int WRAPPED_TRANSITION_FEATURE_COUNT = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getTransition().getFeatureCount() + 11;
	
	int WRAPPED_INITIALSTATE = 13;

	int WRAPPED_INITIALSTATE__UUID = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getInitialState().getFeatureCount() + 0;

	int WRAPPED_INITIALSTATE__JDELETED = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getInitialState().getFeatureCount() + 1;

	int WRAPPED_INITIALSTATE__JDIAGRAM_HOLDER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getInitialState().getFeatureCount() + 2;

	int WRAPPED_INITIALSTATE__READ_ONLY = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getInitialState().getFeatureCount() + 3;

	int WRAPPED_INITIALSTATE__POSEIDON_NAME = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getInitialState().getFeatureCount() + 4;

	int WRAPPED_INITIALSTATE__POSEIDON_NAMESPACE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getInitialState().getFeatureCount() + 5;

	int WRAPPED_INITIALSTATE__OWNED_MEMBER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getInitialState().getFeatureCount() + 6;

	int WRAPPED_INITIALSTATE__SOURCE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getInitialState().getFeatureCount() + 7;

	int WRAPPED_INITIALSTATE__TARGET = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getInitialState().getFeatureCount() + 8;
	
	int WRAPPED_INITIALSTATE__POSEIDON_EDGE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getInitialState().getFeatureCount() + 9;
	
	int WRAPPED_INITIALSTATE__POSEIDON_ROLE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getInitialState().getFeatureCount() + 10;

	int WRAPPED_INITIALSTATE_FEATURE_COUNT = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getInitialState().getFeatureCount() + 11;
	
	int WRAPPED_FINALSTATE = 14;

	int WRAPPED_FINALSTATE__UUID = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getFinalState().getFeatureCount() + 0;

	int WRAPPED_FINALSTATE__JDELETED = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getFinalState().getFeatureCount() + 1;

	int WRAPPED_FINALSTATE__JDIAGRAM_HOLDER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getFinalState().getFeatureCount() + 2;

	int WRAPPED_FINALSTATE__READ_ONLY = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getFinalState().getFeatureCount() + 3;

	int WRAPPED_FINALSTATE__POSEIDON_NAME = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getFinalState().getFeatureCount() + 4;

	int WRAPPED_FINALSTATE__POSEIDON_NAMESPACE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getFinalState().getFeatureCount() + 5;

	int WRAPPED_FINALSTATE__OWNED_MEMBER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getFinalState().getFeatureCount() + 6;

	int WRAPPED_FINALSTATE__SOURCE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getFinalState().getFeatureCount() + 7;

	int WRAPPED_FINALSTATE__TARGET = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getFinalState().getFeatureCount() + 8;
	
	int WRAPPED_FINALSTATE__POSEIDON_EDGE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getFinalState().getFeatureCount() + 9;
	
	int WRAPPED_FINALSTATE__POSEIDON_ROLE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getFinalState().getFeatureCount() + 10;

	int WRAPPED_FINALSTATE_FEATURE_COUNT = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getFinalState().getFeatureCount() + 11;
	
	int WRAPPED_CLUSTER = 15;

	int WRAPPED_CLUSTER__UUID = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getCluster().getFeatureCount() + 0;

	int WRAPPED_CLUSTER__JDELETED = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getCluster().getFeatureCount() + 1;

	int WRAPPED_CLUSTER__JDIAGRAM_HOLDER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getCluster().getFeatureCount() + 2;

	int WRAPPED_CLUSTER__READ_ONLY = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getCluster().getFeatureCount() + 3;

	int WRAPPED_CLUSTER__POSEIDON_NAME = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getCluster().getFeatureCount() + 4;

	int WRAPPED_CLUSTER__POSEIDON_NAMESPACE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getCluster().getFeatureCount() + 5;

	int WRAPPED_CLUSTER__OWNED_MEMBER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getCluster().getFeatureCount() + 6;

	int WRAPPED_CLUSTER__SOURCE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getCluster().getFeatureCount() + 7;

	int WRAPPED_CLUSTER__TARGET = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getCluster().getFeatureCount() + 8;
	
	int WRAPPED_CLUSTER__POSEIDON_EDGE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getCluster().getFeatureCount() + 9;
	
	int WRAPPED_CLUSTER__POSEIDON_ROLE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getCluster().getFeatureCount() + 10;

	int WRAPPED_CLUSTER_FEATURE_COUNT = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getCluster().getFeatureCount() + 11;
	
	int WRAPPED_CLUSTERHEAD = 16;

	int WRAPPED_CLUSTERHEAD__UUID = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getClusterHead().getFeatureCount() + 0;

	int WRAPPED_CLUSTERHEAD__JDELETED = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getClusterHead().getFeatureCount() + 1;

	int WRAPPED_CLUSTERHEAD__JDIAGRAM_HOLDER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getClusterHead().getFeatureCount() + 2;

	int WRAPPED_CLUSTERHEAD__READ_ONLY = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getClusterHead().getFeatureCount() + 3;

	int WRAPPED_CLUSTERHEAD__POSEIDON_NAME = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getClusterHead().getFeatureCount() + 4;

	int WRAPPED_CLUSTERHEAD__POSEIDON_NAMESPACE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getClusterHead().getFeatureCount() + 5;

	int WRAPPED_CLUSTERHEAD__OWNED_MEMBER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getClusterHead().getFeatureCount() + 6;

	int WRAPPED_CLUSTERHEAD__SOURCE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getClusterHead().getFeatureCount() + 7;

	int WRAPPED_CLUSTERHEAD__TARGET = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getClusterHead().getFeatureCount() + 8;
	
	int WRAPPED_CLUSTERHEAD__POSEIDON_EDGE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getClusterHead().getFeatureCount() + 9;
	
	int WRAPPED_CLUSTERHEAD__POSEIDON_ROLE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getClusterHead().getFeatureCount() + 10;

	int WRAPPED_CLUSTERHEAD_FEATURE_COUNT = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getClusterHead().getFeatureCount() + 11;
	
	int WRAPPED_SINK = 17;

	int WRAPPED_SINK__UUID = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getSink().getFeatureCount() + 0;

	int WRAPPED_SINK__JDELETED = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getSink().getFeatureCount() + 1;

	int WRAPPED_SINK__JDIAGRAM_HOLDER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getSink().getFeatureCount() + 2;

	int WRAPPED_SINK__READ_ONLY = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getSink().getFeatureCount() + 3;

	int WRAPPED_SINK__POSEIDON_NAME = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getSink().getFeatureCount() + 4;

	int WRAPPED_SINK__POSEIDON_NAMESPACE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getSink().getFeatureCount() + 5;

	int WRAPPED_SINK__OWNED_MEMBER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getSink().getFeatureCount() + 6;

	int WRAPPED_SINK__SOURCE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getSink().getFeatureCount() + 7;

	int WRAPPED_SINK__TARGET = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getSink().getFeatureCount() + 8;
	
	int WRAPPED_SINK__POSEIDON_EDGE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getSink().getFeatureCount() + 9;
	
	int WRAPPED_SINK__POSEIDON_ROLE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getSink().getFeatureCount() + 10;

	int WRAPPED_SINK_FEATURE_COUNT = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getSink().getFeatureCount() + 11;
	
	int WRAPPED_ACTIVITY = 18;

	int WRAPPED_ACTIVITY__UUID = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActivity().getFeatureCount() + 0;

	int WRAPPED_ACTIVITY__JDELETED = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActivity().getFeatureCount() + 1;

	int WRAPPED_ACTIVITY__JDIAGRAM_HOLDER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActivity().getFeatureCount() + 2;

	int WRAPPED_ACTIVITY__READ_ONLY = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActivity().getFeatureCount() + 3;

	int WRAPPED_ACTIVITY__POSEIDON_NAME = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActivity().getFeatureCount() + 4;

	int WRAPPED_ACTIVITY__POSEIDON_NAMESPACE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActivity().getFeatureCount() + 5;

	int WRAPPED_ACTIVITY__OWNED_MEMBER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActivity().getFeatureCount() + 6;

	int WRAPPED_ACTIVITY__SOURCE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActivity().getFeatureCount() + 7;

	int WRAPPED_ACTIVITY__TARGET = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActivity().getFeatureCount() + 8;
	
	int WRAPPED_ACTIVITY__POSEIDON_EDGE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActivity().getFeatureCount() + 9;
	
	int WRAPPED_ACTIVITY__POSEIDON_ROLE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActivity().getFeatureCount() + 10;

	int WRAPPED_ACTIVITY_FEATURE_COUNT = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActivity().getFeatureCount() + 11;
	
	int WRAPPED_STATEMACHINE = 19;

	int WRAPPED_STATEMACHINE__UUID = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getStateMachine().getFeatureCount() + 0;

	int WRAPPED_STATEMACHINE__JDELETED = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getStateMachine().getFeatureCount() + 1;

	int WRAPPED_STATEMACHINE__JDIAGRAM_HOLDER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getStateMachine().getFeatureCount() + 2;

	int WRAPPED_STATEMACHINE__READ_ONLY = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getStateMachine().getFeatureCount() + 3;

	int WRAPPED_STATEMACHINE__POSEIDON_NAME = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getStateMachine().getFeatureCount() + 4;

	int WRAPPED_STATEMACHINE__POSEIDON_NAMESPACE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getStateMachine().getFeatureCount() + 5;

	int WRAPPED_STATEMACHINE__OWNED_MEMBER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getStateMachine().getFeatureCount() + 6;

	int WRAPPED_STATEMACHINE__SOURCE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getStateMachine().getFeatureCount() + 7;

	int WRAPPED_STATEMACHINE__TARGET = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getStateMachine().getFeatureCount() + 8;
	
	int WRAPPED_STATEMACHINE__POSEIDON_EDGE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getStateMachine().getFeatureCount() + 9;
	
	int WRAPPED_STATEMACHINE__POSEIDON_ROLE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getStateMachine().getFeatureCount() + 10;

	int WRAPPED_STATEMACHINE_FEATURE_COUNT = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getStateMachine().getFeatureCount() + 11;
	
	int WRAPPED_TIMING = 20;

	int WRAPPED_TIMING__UUID = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getTiming().getFeatureCount() + 0;

	int WRAPPED_TIMING__JDELETED = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getTiming().getFeatureCount() + 1;

	int WRAPPED_TIMING__JDIAGRAM_HOLDER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getTiming().getFeatureCount() + 2;

	int WRAPPED_TIMING__READ_ONLY = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getTiming().getFeatureCount() + 3;

	int WRAPPED_TIMING__POSEIDON_NAME = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getTiming().getFeatureCount() + 4;

	int WRAPPED_TIMING__POSEIDON_NAMESPACE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getTiming().getFeatureCount() + 5;

	int WRAPPED_TIMING__OWNED_MEMBER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getTiming().getFeatureCount() + 6;

	int WRAPPED_TIMING__SOURCE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getTiming().getFeatureCount() + 7;

	int WRAPPED_TIMING__TARGET = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getTiming().getFeatureCount() + 8;
	
	int WRAPPED_TIMING__POSEIDON_EDGE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getTiming().getFeatureCount() + 9;
	
	int WRAPPED_TIMING__POSEIDON_ROLE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getTiming().getFeatureCount() + 10;

	int WRAPPED_TIMING_FEATURE_COUNT = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getTiming().getFeatureCount() + 11;
	
	int WRAPPED_TIMER = 21;

	int WRAPPED_TIMER__UUID = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getTimer().getFeatureCount() + 0;

	int WRAPPED_TIMER__JDELETED = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getTimer().getFeatureCount() + 1;

	int WRAPPED_TIMER__JDIAGRAM_HOLDER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getTimer().getFeatureCount() + 2;

	int WRAPPED_TIMER__READ_ONLY = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getTimer().getFeatureCount() + 3;

	int WRAPPED_TIMER__POSEIDON_NAME = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getTimer().getFeatureCount() + 4;

	int WRAPPED_TIMER__POSEIDON_NAMESPACE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getTimer().getFeatureCount() + 5;

	int WRAPPED_TIMER__OWNED_MEMBER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getTimer().getFeatureCount() + 6;

	int WRAPPED_TIMER__SOURCE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getTimer().getFeatureCount() + 7;

	int WRAPPED_TIMER__TARGET = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getTimer().getFeatureCount() + 8;
	
	int WRAPPED_TIMER__POSEIDON_EDGE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getTimer().getFeatureCount() + 9;
	
	int WRAPPED_TIMER__POSEIDON_ROLE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getTimer().getFeatureCount() + 10;

	int WRAPPED_TIMER_FEATURE_COUNT = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getTimer().getFeatureCount() + 11;
	
	int WRAPPED_PLATFORM = 22;

	int WRAPPED_PLATFORM__UUID = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getPlatform().getFeatureCount() + 0;

	int WRAPPED_PLATFORM__JDELETED = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getPlatform().getFeatureCount() + 1;

	int WRAPPED_PLATFORM__JDIAGRAM_HOLDER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getPlatform().getFeatureCount() + 2;

	int WRAPPED_PLATFORM__READ_ONLY = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getPlatform().getFeatureCount() + 3;

	int WRAPPED_PLATFORM__POSEIDON_NAME = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getPlatform().getFeatureCount() + 4;

	int WRAPPED_PLATFORM__POSEIDON_NAMESPACE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getPlatform().getFeatureCount() + 5;

	int WRAPPED_PLATFORM__OWNED_MEMBER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getPlatform().getFeatureCount() + 6;

	int WRAPPED_PLATFORM__SOURCE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getPlatform().getFeatureCount() + 7;

	int WRAPPED_PLATFORM__TARGET = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getPlatform().getFeatureCount() + 8;
	
	int WRAPPED_PLATFORM__POSEIDON_EDGE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getPlatform().getFeatureCount() + 9;
	
	int WRAPPED_PLATFORM__POSEIDON_ROLE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getPlatform().getFeatureCount() + 10;

	int WRAPPED_PLATFORM_FEATURE_COUNT = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getPlatform().getFeatureCount() + 11;
	
	int WRAPPED_RESOURCES = 23;

	int WRAPPED_RESOURCES__UUID = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getResources().getFeatureCount() + 0;

	int WRAPPED_RESOURCES__JDELETED = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getResources().getFeatureCount() + 1;

	int WRAPPED_RESOURCES__JDIAGRAM_HOLDER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getResources().getFeatureCount() + 2;

	int WRAPPED_RESOURCES__READ_ONLY = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getResources().getFeatureCount() + 3;

	int WRAPPED_RESOURCES__POSEIDON_NAME = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getResources().getFeatureCount() + 4;

	int WRAPPED_RESOURCES__POSEIDON_NAMESPACE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getResources().getFeatureCount() + 5;

	int WRAPPED_RESOURCES__OWNED_MEMBER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getResources().getFeatureCount() + 6;

	int WRAPPED_RESOURCES__SOURCE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getResources().getFeatureCount() + 7;

	int WRAPPED_RESOURCES__TARGET = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getResources().getFeatureCount() + 8;
	
	int WRAPPED_RESOURCES__POSEIDON_EDGE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getResources().getFeatureCount() + 9;
	
	int WRAPPED_RESOURCES__POSEIDON_ROLE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getResources().getFeatureCount() + 10;

	int WRAPPED_RESOURCES_FEATURE_COUNT = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getResources().getFeatureCount() + 11;
	
	int WRAPPED_PARAMETERS = 24;

	int WRAPPED_PARAMETERS__UUID = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getParameters().getFeatureCount() + 0;

	int WRAPPED_PARAMETERS__JDELETED = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getParameters().getFeatureCount() + 1;

	int WRAPPED_PARAMETERS__JDIAGRAM_HOLDER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getParameters().getFeatureCount() + 2;

	int WRAPPED_PARAMETERS__READ_ONLY = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getParameters().getFeatureCount() + 3;

	int WRAPPED_PARAMETERS__POSEIDON_NAME = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getParameters().getFeatureCount() + 4;

	int WRAPPED_PARAMETERS__POSEIDON_NAMESPACE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getParameters().getFeatureCount() + 5;

	int WRAPPED_PARAMETERS__OWNED_MEMBER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getParameters().getFeatureCount() + 6;

	int WRAPPED_PARAMETERS__SOURCE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getParameters().getFeatureCount() + 7;

	int WRAPPED_PARAMETERS__TARGET = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getParameters().getFeatureCount() + 8;
	
	int WRAPPED_PARAMETERS__POSEIDON_EDGE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getParameters().getFeatureCount() + 9;
	
	int WRAPPED_PARAMETERS__POSEIDON_ROLE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getParameters().getFeatureCount() + 10;

	int WRAPPED_PARAMETERS_FEATURE_COUNT = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getParameters().getFeatureCount() + 11;
	
	int WRAPPED_HARVESTER = 25;

	int WRAPPED_HARVESTER__UUID = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getHarvester().getFeatureCount() + 0;

	int WRAPPED_HARVESTER__JDELETED = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getHarvester().getFeatureCount() + 1;

	int WRAPPED_HARVESTER__JDIAGRAM_HOLDER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getHarvester().getFeatureCount() + 2;

	int WRAPPED_HARVESTER__READ_ONLY = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getHarvester().getFeatureCount() + 3;

	int WRAPPED_HARVESTER__POSEIDON_NAME = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getHarvester().getFeatureCount() + 4;

	int WRAPPED_HARVESTER__POSEIDON_NAMESPACE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getHarvester().getFeatureCount() + 5;

	int WRAPPED_HARVESTER__OWNED_MEMBER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getHarvester().getFeatureCount() + 6;

	int WRAPPED_HARVESTER__SOURCE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getHarvester().getFeatureCount() + 7;

	int WRAPPED_HARVESTER__TARGET = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getHarvester().getFeatureCount() + 8;
	
	int WRAPPED_HARVESTER__POSEIDON_EDGE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getHarvester().getFeatureCount() + 9;
	
	int WRAPPED_HARVESTER__POSEIDON_ROLE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getHarvester().getFeatureCount() + 10;

	int WRAPPED_HARVESTER_FEATURE_COUNT = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getHarvester().getFeatureCount() + 11;
	
	int WRAPPED_BATTERY = 26;

	int WRAPPED_BATTERY__UUID = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getBattery().getFeatureCount() + 0;

	int WRAPPED_BATTERY__JDELETED = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getBattery().getFeatureCount() + 1;

	int WRAPPED_BATTERY__JDIAGRAM_HOLDER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getBattery().getFeatureCount() + 2;

	int WRAPPED_BATTERY__READ_ONLY = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getBattery().getFeatureCount() + 3;

	int WRAPPED_BATTERY__POSEIDON_NAME = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getBattery().getFeatureCount() + 4;

	int WRAPPED_BATTERY__POSEIDON_NAMESPACE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getBattery().getFeatureCount() + 5;

	int WRAPPED_BATTERY__OWNED_MEMBER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getBattery().getFeatureCount() + 6;

	int WRAPPED_BATTERY__SOURCE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getBattery().getFeatureCount() + 7;

	int WRAPPED_BATTERY__TARGET = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getBattery().getFeatureCount() + 8;
	
	int WRAPPED_BATTERY__POSEIDON_EDGE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getBattery().getFeatureCount() + 9;
	
	int WRAPPED_BATTERY__POSEIDON_ROLE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getBattery().getFeatureCount() + 10;

	int WRAPPED_BATTERY_FEATURE_COUNT = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getBattery().getFeatureCount() + 11;
	
	int WRAPPED_ASPECT = 27;

	int WRAPPED_ASPECT__UUID = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getAspect().getFeatureCount() + 0;

	int WRAPPED_ASPECT__JDELETED = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getAspect().getFeatureCount() + 1;

	int WRAPPED_ASPECT__JDIAGRAM_HOLDER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getAspect().getFeatureCount() + 2;

	int WRAPPED_ASPECT__READ_ONLY = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getAspect().getFeatureCount() + 3;

	int WRAPPED_ASPECT__POSEIDON_NAME = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getAspect().getFeatureCount() + 4;

	int WRAPPED_ASPECT__POSEIDON_NAMESPACE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getAspect().getFeatureCount() + 5;

	int WRAPPED_ASPECT__OWNED_MEMBER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getAspect().getFeatureCount() + 6;

	int WRAPPED_ASPECT__SOURCE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getAspect().getFeatureCount() + 7;

	int WRAPPED_ASPECT__TARGET = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getAspect().getFeatureCount() + 8;
	
	int WRAPPED_ASPECT__POSEIDON_EDGE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getAspect().getFeatureCount() + 9;
	
	int WRAPPED_ASPECT__POSEIDON_ROLE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getAspect().getFeatureCount() + 10;

	int WRAPPED_ASPECT_FEATURE_COUNT = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getAspect().getFeatureCount() + 11;
	
	int WRAPPED_POINTCUT = 28;

	int WRAPPED_POINTCUT__UUID = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getPointcut().getFeatureCount() + 0;

	int WRAPPED_POINTCUT__JDELETED = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getPointcut().getFeatureCount() + 1;

	int WRAPPED_POINTCUT__JDIAGRAM_HOLDER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getPointcut().getFeatureCount() + 2;

	int WRAPPED_POINTCUT__READ_ONLY = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getPointcut().getFeatureCount() + 3;

	int WRAPPED_POINTCUT__POSEIDON_NAME = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getPointcut().getFeatureCount() + 4;

	int WRAPPED_POINTCUT__POSEIDON_NAMESPACE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getPointcut().getFeatureCount() + 5;

	int WRAPPED_POINTCUT__OWNED_MEMBER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getPointcut().getFeatureCount() + 6;

	int WRAPPED_POINTCUT__SOURCE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getPointcut().getFeatureCount() + 7;

	int WRAPPED_POINTCUT__TARGET = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getPointcut().getFeatureCount() + 8;
	
	int WRAPPED_POINTCUT__POSEIDON_EDGE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getPointcut().getFeatureCount() + 9;
	
	int WRAPPED_POINTCUT__POSEIDON_ROLE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getPointcut().getFeatureCount() + 10;

	int WRAPPED_POINTCUT_FEATURE_COUNT = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getPointcut().getFeatureCount() + 11;
	
	int WRAPPED_ADVICE = 29;

	int WRAPPED_ADVICE__UUID = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getAdvice().getFeatureCount() + 0;

	int WRAPPED_ADVICE__JDELETED = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getAdvice().getFeatureCount() + 1;

	int WRAPPED_ADVICE__JDIAGRAM_HOLDER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getAdvice().getFeatureCount() + 2;

	int WRAPPED_ADVICE__READ_ONLY = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getAdvice().getFeatureCount() + 3;

	int WRAPPED_ADVICE__POSEIDON_NAME = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getAdvice().getFeatureCount() + 4;

	int WRAPPED_ADVICE__POSEIDON_NAMESPACE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getAdvice().getFeatureCount() + 5;

	int WRAPPED_ADVICE__OWNED_MEMBER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getAdvice().getFeatureCount() + 6;

	int WRAPPED_ADVICE__SOURCE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getAdvice().getFeatureCount() + 7;

	int WRAPPED_ADVICE__TARGET = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getAdvice().getFeatureCount() + 8;
	
	int WRAPPED_ADVICE__POSEIDON_EDGE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getAdvice().getFeatureCount() + 9;
	
	int WRAPPED_ADVICE__POSEIDON_ROLE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getAdvice().getFeatureCount() + 10;

	int WRAPPED_ADVICE_FEATURE_COUNT = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getAdvice().getFeatureCount() + 11;
	
	int WRAPPED_ACTIVITYNODE = 30;

	int WRAPPED_ACTIVITYNODE__UUID = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActivityNode().getFeatureCount() + 0;

	int WRAPPED_ACTIVITYNODE__JDELETED = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActivityNode().getFeatureCount() + 1;

	int WRAPPED_ACTIVITYNODE__JDIAGRAM_HOLDER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActivityNode().getFeatureCount() + 2;

	int WRAPPED_ACTIVITYNODE__READ_ONLY = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActivityNode().getFeatureCount() + 3;

	int WRAPPED_ACTIVITYNODE__POSEIDON_NAME = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActivityNode().getFeatureCount() + 4;

	int WRAPPED_ACTIVITYNODE__POSEIDON_NAMESPACE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActivityNode().getFeatureCount() + 5;

	int WRAPPED_ACTIVITYNODE__OWNED_MEMBER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActivityNode().getFeatureCount() + 6;

	int WRAPPED_ACTIVITYNODE__SOURCE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActivityNode().getFeatureCount() + 7;

	int WRAPPED_ACTIVITYNODE__TARGET = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActivityNode().getFeatureCount() + 8;
	
	int WRAPPED_ACTIVITYNODE__POSEIDON_EDGE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActivityNode().getFeatureCount() + 9;
	
	int WRAPPED_ACTIVITYNODE__POSEIDON_ROLE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActivityNode().getFeatureCount() + 10;

	int WRAPPED_ACTIVITYNODE_FEATURE_COUNT = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActivityNode().getFeatureCount() + 11;
	
	int WRAPPED_INITIALNODE = 31;

	int WRAPPED_INITIALNODE__UUID = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getInitialNode().getFeatureCount() + 0;

	int WRAPPED_INITIALNODE__JDELETED = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getInitialNode().getFeatureCount() + 1;

	int WRAPPED_INITIALNODE__JDIAGRAM_HOLDER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getInitialNode().getFeatureCount() + 2;

	int WRAPPED_INITIALNODE__READ_ONLY = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getInitialNode().getFeatureCount() + 3;

	int WRAPPED_INITIALNODE__POSEIDON_NAME = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getInitialNode().getFeatureCount() + 4;

	int WRAPPED_INITIALNODE__POSEIDON_NAMESPACE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getInitialNode().getFeatureCount() + 5;

	int WRAPPED_INITIALNODE__OWNED_MEMBER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getInitialNode().getFeatureCount() + 6;

	int WRAPPED_INITIALNODE__SOURCE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getInitialNode().getFeatureCount() + 7;

	int WRAPPED_INITIALNODE__TARGET = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getInitialNode().getFeatureCount() + 8;
	
	int WRAPPED_INITIALNODE__POSEIDON_EDGE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getInitialNode().getFeatureCount() + 9;
	
	int WRAPPED_INITIALNODE__POSEIDON_ROLE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getInitialNode().getFeatureCount() + 10;

	int WRAPPED_INITIALNODE_FEATURE_COUNT = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getInitialNode().getFeatureCount() + 11;
	
	int WRAPPED_FINALNODE = 32;

	int WRAPPED_FINALNODE__UUID = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getFinalNode().getFeatureCount() + 0;

	int WRAPPED_FINALNODE__JDELETED = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getFinalNode().getFeatureCount() + 1;

	int WRAPPED_FINALNODE__JDIAGRAM_HOLDER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getFinalNode().getFeatureCount() + 2;

	int WRAPPED_FINALNODE__READ_ONLY = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getFinalNode().getFeatureCount() + 3;

	int WRAPPED_FINALNODE__POSEIDON_NAME = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getFinalNode().getFeatureCount() + 4;

	int WRAPPED_FINALNODE__POSEIDON_NAMESPACE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getFinalNode().getFeatureCount() + 5;

	int WRAPPED_FINALNODE__OWNED_MEMBER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getFinalNode().getFeatureCount() + 6;

	int WRAPPED_FINALNODE__SOURCE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getFinalNode().getFeatureCount() + 7;

	int WRAPPED_FINALNODE__TARGET = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getFinalNode().getFeatureCount() + 8;
	
	int WRAPPED_FINALNODE__POSEIDON_EDGE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getFinalNode().getFeatureCount() + 9;
	
	int WRAPPED_FINALNODE__POSEIDON_ROLE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getFinalNode().getFeatureCount() + 10;

	int WRAPPED_FINALNODE_FEATURE_COUNT = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getFinalNode().getFeatureCount() + 11;
	
	int WRAPPED_DECISIONNODE = 33;

	int WRAPPED_DECISIONNODE__UUID = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getDecisionNode().getFeatureCount() + 0;

	int WRAPPED_DECISIONNODE__JDELETED = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getDecisionNode().getFeatureCount() + 1;

	int WRAPPED_DECISIONNODE__JDIAGRAM_HOLDER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getDecisionNode().getFeatureCount() + 2;

	int WRAPPED_DECISIONNODE__READ_ONLY = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getDecisionNode().getFeatureCount() + 3;

	int WRAPPED_DECISIONNODE__POSEIDON_NAME = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getDecisionNode().getFeatureCount() + 4;

	int WRAPPED_DECISIONNODE__POSEIDON_NAMESPACE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getDecisionNode().getFeatureCount() + 5;

	int WRAPPED_DECISIONNODE__OWNED_MEMBER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getDecisionNode().getFeatureCount() + 6;

	int WRAPPED_DECISIONNODE__SOURCE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getDecisionNode().getFeatureCount() + 7;

	int WRAPPED_DECISIONNODE__TARGET = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getDecisionNode().getFeatureCount() + 8;
	
	int WRAPPED_DECISIONNODE__POSEIDON_EDGE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getDecisionNode().getFeatureCount() + 9;
	
	int WRAPPED_DECISIONNODE__POSEIDON_ROLE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getDecisionNode().getFeatureCount() + 10;

	int WRAPPED_DECISIONNODE_FEATURE_COUNT = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getDecisionNode().getFeatureCount() + 11;
	
	int WRAPPED_MERGENODE = 34;

	int WRAPPED_MERGENODE__UUID = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getMergeNode().getFeatureCount() + 0;

	int WRAPPED_MERGENODE__JDELETED = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getMergeNode().getFeatureCount() + 1;

	int WRAPPED_MERGENODE__JDIAGRAM_HOLDER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getMergeNode().getFeatureCount() + 2;

	int WRAPPED_MERGENODE__READ_ONLY = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getMergeNode().getFeatureCount() + 3;

	int WRAPPED_MERGENODE__POSEIDON_NAME = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getMergeNode().getFeatureCount() + 4;

	int WRAPPED_MERGENODE__POSEIDON_NAMESPACE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getMergeNode().getFeatureCount() + 5;

	int WRAPPED_MERGENODE__OWNED_MEMBER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getMergeNode().getFeatureCount() + 6;

	int WRAPPED_MERGENODE__SOURCE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getMergeNode().getFeatureCount() + 7;

	int WRAPPED_MERGENODE__TARGET = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getMergeNode().getFeatureCount() + 8;
	
	int WRAPPED_MERGENODE__POSEIDON_EDGE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getMergeNode().getFeatureCount() + 9;
	
	int WRAPPED_MERGENODE__POSEIDON_ROLE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getMergeNode().getFeatureCount() + 10;

	int WRAPPED_MERGENODE_FEATURE_COUNT = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getMergeNode().getFeatureCount() + 11;
	
	int WRAPPED_ACTIVITYEDGE = 35;

	int WRAPPED_ACTIVITYEDGE__UUID = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActivityEdge().getFeatureCount() + 0;

	int WRAPPED_ACTIVITYEDGE__JDELETED = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActivityEdge().getFeatureCount() + 1;

	int WRAPPED_ACTIVITYEDGE__JDIAGRAM_HOLDER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActivityEdge().getFeatureCount() + 2;

	int WRAPPED_ACTIVITYEDGE__READ_ONLY = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActivityEdge().getFeatureCount() + 3;

	int WRAPPED_ACTIVITYEDGE__POSEIDON_NAME = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActivityEdge().getFeatureCount() + 4;

	int WRAPPED_ACTIVITYEDGE__POSEIDON_NAMESPACE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActivityEdge().getFeatureCount() + 5;

	int WRAPPED_ACTIVITYEDGE__OWNED_MEMBER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActivityEdge().getFeatureCount() + 6;

	int WRAPPED_ACTIVITYEDGE__SOURCE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActivityEdge().getFeatureCount() + 7;

	int WRAPPED_ACTIVITYEDGE__TARGET = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActivityEdge().getFeatureCount() + 8;
	
	int WRAPPED_ACTIVITYEDGE__POSEIDON_EDGE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActivityEdge().getFeatureCount() + 9;
	
	int WRAPPED_ACTIVITYEDGE__POSEIDON_ROLE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActivityEdge().getFeatureCount() + 10;

	int WRAPPED_ACTIVITYEDGE_FEATURE_COUNT = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActivityEdge().getFeatureCount() + 11;
	
	int WRAPPED_OPAQUEACTION = 36;

	int WRAPPED_OPAQUEACTION__UUID = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getOpaqueAction().getFeatureCount() + 0;

	int WRAPPED_OPAQUEACTION__JDELETED = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getOpaqueAction().getFeatureCount() + 1;

	int WRAPPED_OPAQUEACTION__JDIAGRAM_HOLDER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getOpaqueAction().getFeatureCount() + 2;

	int WRAPPED_OPAQUEACTION__READ_ONLY = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getOpaqueAction().getFeatureCount() + 3;

	int WRAPPED_OPAQUEACTION__POSEIDON_NAME = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getOpaqueAction().getFeatureCount() + 4;

	int WRAPPED_OPAQUEACTION__POSEIDON_NAMESPACE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getOpaqueAction().getFeatureCount() + 5;

	int WRAPPED_OPAQUEACTION__OWNED_MEMBER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getOpaqueAction().getFeatureCount() + 6;

	int WRAPPED_OPAQUEACTION__SOURCE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getOpaqueAction().getFeatureCount() + 7;

	int WRAPPED_OPAQUEACTION__TARGET = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getOpaqueAction().getFeatureCount() + 8;
	
	int WRAPPED_OPAQUEACTION__POSEIDON_EDGE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getOpaqueAction().getFeatureCount() + 9;
	
	int WRAPPED_OPAQUEACTION__POSEIDON_ROLE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getOpaqueAction().getFeatureCount() + 10;

	int WRAPPED_OPAQUEACTION_FEATURE_COUNT = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getOpaqueAction().getFeatureCount() + 11;
	
	int WRAPPED_SENSINGACTION = 37;

	int WRAPPED_SENSINGACTION__UUID = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getSensingAction().getFeatureCount() + 0;

	int WRAPPED_SENSINGACTION__JDELETED = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getSensingAction().getFeatureCount() + 1;

	int WRAPPED_SENSINGACTION__JDIAGRAM_HOLDER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getSensingAction().getFeatureCount() + 2;

	int WRAPPED_SENSINGACTION__READ_ONLY = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getSensingAction().getFeatureCount() + 3;

	int WRAPPED_SENSINGACTION__POSEIDON_NAME = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getSensingAction().getFeatureCount() + 4;

	int WRAPPED_SENSINGACTION__POSEIDON_NAMESPACE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getSensingAction().getFeatureCount() + 5;

	int WRAPPED_SENSINGACTION__OWNED_MEMBER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getSensingAction().getFeatureCount() + 6;

	int WRAPPED_SENSINGACTION__SOURCE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getSensingAction().getFeatureCount() + 7;

	int WRAPPED_SENSINGACTION__TARGET = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getSensingAction().getFeatureCount() + 8;
	
	int WRAPPED_SENSINGACTION__POSEIDON_EDGE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getSensingAction().getFeatureCount() + 9;
	
	int WRAPPED_SENSINGACTION__POSEIDON_ROLE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getSensingAction().getFeatureCount() + 10;

	int WRAPPED_SENSINGACTION_FEATURE_COUNT = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getSensingAction().getFeatureCount() + 11;
	
	int WRAPPED_ACTUATINGACTION = 38;

	int WRAPPED_ACTUATINGACTION__UUID = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActuatingAction().getFeatureCount() + 0;

	int WRAPPED_ACTUATINGACTION__JDELETED = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActuatingAction().getFeatureCount() + 1;

	int WRAPPED_ACTUATINGACTION__JDIAGRAM_HOLDER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActuatingAction().getFeatureCount() + 2;

	int WRAPPED_ACTUATINGACTION__READ_ONLY = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActuatingAction().getFeatureCount() + 3;

	int WRAPPED_ACTUATINGACTION__POSEIDON_NAME = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActuatingAction().getFeatureCount() + 4;

	int WRAPPED_ACTUATINGACTION__POSEIDON_NAMESPACE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActuatingAction().getFeatureCount() + 5;

	int WRAPPED_ACTUATINGACTION__OWNED_MEMBER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActuatingAction().getFeatureCount() + 6;

	int WRAPPED_ACTUATINGACTION__SOURCE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActuatingAction().getFeatureCount() + 7;

	int WRAPPED_ACTUATINGACTION__TARGET = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActuatingAction().getFeatureCount() + 8;
	
	int WRAPPED_ACTUATINGACTION__POSEIDON_EDGE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActuatingAction().getFeatureCount() + 9;
	
	int WRAPPED_ACTUATINGACTION__POSEIDON_ROLE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActuatingAction().getFeatureCount() + 10;

	int WRAPPED_ACTUATINGACTION_FEATURE_COUNT = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActuatingAction().getFeatureCount() + 11;
	
	int WRAPPED_TIMINGACTION = 39;

	int WRAPPED_TIMINGACTION__UUID = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getTimingAction().getFeatureCount() + 0;

	int WRAPPED_TIMINGACTION__JDELETED = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getTimingAction().getFeatureCount() + 1;

	int WRAPPED_TIMINGACTION__JDIAGRAM_HOLDER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getTimingAction().getFeatureCount() + 2;

	int WRAPPED_TIMINGACTION__READ_ONLY = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getTimingAction().getFeatureCount() + 3;

	int WRAPPED_TIMINGACTION__POSEIDON_NAME = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getTimingAction().getFeatureCount() + 4;

	int WRAPPED_TIMINGACTION__POSEIDON_NAMESPACE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getTimingAction().getFeatureCount() + 5;

	int WRAPPED_TIMINGACTION__OWNED_MEMBER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getTimingAction().getFeatureCount() + 6;

	int WRAPPED_TIMINGACTION__SOURCE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getTimingAction().getFeatureCount() + 7;

	int WRAPPED_TIMINGACTION__TARGET = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getTimingAction().getFeatureCount() + 8;
	
	int WRAPPED_TIMINGACTION__POSEIDON_EDGE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getTimingAction().getFeatureCount() + 9;
	
	int WRAPPED_TIMINGACTION__POSEIDON_ROLE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getTimingAction().getFeatureCount() + 10;

	int WRAPPED_TIMINGACTION_FEATURE_COUNT = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getTimingAction().getFeatureCount() + 11;
	
	int WRAPPED_VARIABLE = 40;

	int WRAPPED_VARIABLE__UUID = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getVariable().getFeatureCount() + 0;

	int WRAPPED_VARIABLE__JDELETED = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getVariable().getFeatureCount() + 1;

	int WRAPPED_VARIABLE__JDIAGRAM_HOLDER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getVariable().getFeatureCount() + 2;

	int WRAPPED_VARIABLE__READ_ONLY = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getVariable().getFeatureCount() + 3;

	int WRAPPED_VARIABLE__POSEIDON_NAME = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getVariable().getFeatureCount() + 4;

	int WRAPPED_VARIABLE__POSEIDON_NAMESPACE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getVariable().getFeatureCount() + 5;

	int WRAPPED_VARIABLE__OWNED_MEMBER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getVariable().getFeatureCount() + 6;

	int WRAPPED_VARIABLE__SOURCE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getVariable().getFeatureCount() + 7;

	int WRAPPED_VARIABLE__TARGET = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getVariable().getFeatureCount() + 8;
	
	int WRAPPED_VARIABLE__POSEIDON_EDGE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getVariable().getFeatureCount() + 9;
	
	int WRAPPED_VARIABLE__POSEIDON_ROLE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getVariable().getFeatureCount() + 10;

	int WRAPPED_VARIABLE_FEATURE_COUNT = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getVariable().getFeatureCount() + 11;
	
	int WRAPPED_DATALINK = 41;

	int WRAPPED_DATALINK__UUID = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getDataLink().getFeatureCount() + 0;

	int WRAPPED_DATALINK__JDELETED = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getDataLink().getFeatureCount() + 1;

	int WRAPPED_DATALINK__JDIAGRAM_HOLDER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getDataLink().getFeatureCount() + 2;

	int WRAPPED_DATALINK__READ_ONLY = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getDataLink().getFeatureCount() + 3;

	int WRAPPED_DATALINK__POSEIDON_NAME = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getDataLink().getFeatureCount() + 4;

	int WRAPPED_DATALINK__POSEIDON_NAMESPACE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getDataLink().getFeatureCount() + 5;

	int WRAPPED_DATALINK__OWNED_MEMBER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getDataLink().getFeatureCount() + 6;

	int WRAPPED_DATALINK__SOURCE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getDataLink().getFeatureCount() + 7;

	int WRAPPED_DATALINK__TARGET = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getDataLink().getFeatureCount() + 8;
	
	int WRAPPED_DATALINK__POSEIDON_EDGE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getDataLink().getFeatureCount() + 9;
	
	int WRAPPED_DATALINK__POSEIDON_ROLE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getDataLink().getFeatureCount() + 10;

	int WRAPPED_DATALINK_FEATURE_COUNT = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getDataLink().getFeatureCount() + 11;
	
	int WRAPPED_UPDATEPOOLACTION = 42;

	int WRAPPED_UPDATEPOOLACTION__UUID = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getUpdatePoolAction().getFeatureCount() + 0;

	int WRAPPED_UPDATEPOOLACTION__JDELETED = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getUpdatePoolAction().getFeatureCount() + 1;

	int WRAPPED_UPDATEPOOLACTION__JDIAGRAM_HOLDER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getUpdatePoolAction().getFeatureCount() + 2;

	int WRAPPED_UPDATEPOOLACTION__READ_ONLY = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getUpdatePoolAction().getFeatureCount() + 3;

	int WRAPPED_UPDATEPOOLACTION__POSEIDON_NAME = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getUpdatePoolAction().getFeatureCount() + 4;

	int WRAPPED_UPDATEPOOLACTION__POSEIDON_NAMESPACE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getUpdatePoolAction().getFeatureCount() + 5;

	int WRAPPED_UPDATEPOOLACTION__OWNED_MEMBER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getUpdatePoolAction().getFeatureCount() + 6;

	int WRAPPED_UPDATEPOOLACTION__SOURCE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getUpdatePoolAction().getFeatureCount() + 7;

	int WRAPPED_UPDATEPOOLACTION__TARGET = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getUpdatePoolAction().getFeatureCount() + 8;
	
	int WRAPPED_UPDATEPOOLACTION__POSEIDON_EDGE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getUpdatePoolAction().getFeatureCount() + 9;
	
	int WRAPPED_UPDATEPOOLACTION__POSEIDON_ROLE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getUpdatePoolAction().getFeatureCount() + 10;

	int WRAPPED_UPDATEPOOLACTION_FEATURE_COUNT = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getUpdatePoolAction().getFeatureCount() + 11;
	
	int WRAPPED_GETNODEACTION = 43;

	int WRAPPED_GETNODEACTION__UUID = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getGetNodeAction().getFeatureCount() + 0;

	int WRAPPED_GETNODEACTION__JDELETED = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getGetNodeAction().getFeatureCount() + 1;

	int WRAPPED_GETNODEACTION__JDIAGRAM_HOLDER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getGetNodeAction().getFeatureCount() + 2;

	int WRAPPED_GETNODEACTION__READ_ONLY = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getGetNodeAction().getFeatureCount() + 3;

	int WRAPPED_GETNODEACTION__POSEIDON_NAME = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getGetNodeAction().getFeatureCount() + 4;

	int WRAPPED_GETNODEACTION__POSEIDON_NAMESPACE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getGetNodeAction().getFeatureCount() + 5;

	int WRAPPED_GETNODEACTION__OWNED_MEMBER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getGetNodeAction().getFeatureCount() + 6;

	int WRAPPED_GETNODEACTION__SOURCE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getGetNodeAction().getFeatureCount() + 7;

	int WRAPPED_GETNODEACTION__TARGET = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getGetNodeAction().getFeatureCount() + 8;
	
	int WRAPPED_GETNODEACTION__POSEIDON_EDGE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getGetNodeAction().getFeatureCount() + 9;
	
	int WRAPPED_GETNODEACTION__POSEIDON_ROLE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getGetNodeAction().getFeatureCount() + 10;

	int WRAPPED_GETNODEACTION_FEATURE_COUNT = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getGetNodeAction().getFeatureCount() + 11;
	
	int WRAPPED_REMOTETRIGGERACTION = 44;

	int WRAPPED_REMOTETRIGGERACTION__UUID = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getRemoteTriggerAction().getFeatureCount() + 0;

	int WRAPPED_REMOTETRIGGERACTION__JDELETED = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getRemoteTriggerAction().getFeatureCount() + 1;

	int WRAPPED_REMOTETRIGGERACTION__JDIAGRAM_HOLDER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getRemoteTriggerAction().getFeatureCount() + 2;

	int WRAPPED_REMOTETRIGGERACTION__READ_ONLY = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getRemoteTriggerAction().getFeatureCount() + 3;

	int WRAPPED_REMOTETRIGGERACTION__POSEIDON_NAME = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getRemoteTriggerAction().getFeatureCount() + 4;

	int WRAPPED_REMOTETRIGGERACTION__POSEIDON_NAMESPACE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getRemoteTriggerAction().getFeatureCount() + 5;

	int WRAPPED_REMOTETRIGGERACTION__OWNED_MEMBER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getRemoteTriggerAction().getFeatureCount() + 6;

	int WRAPPED_REMOTETRIGGERACTION__SOURCE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getRemoteTriggerAction().getFeatureCount() + 7;

	int WRAPPED_REMOTETRIGGERACTION__TARGET = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getRemoteTriggerAction().getFeatureCount() + 8;
	
	int WRAPPED_REMOTETRIGGERACTION__POSEIDON_EDGE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getRemoteTriggerAction().getFeatureCount() + 9;
	
	int WRAPPED_REMOTETRIGGERACTION__POSEIDON_ROLE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getRemoteTriggerAction().getFeatureCount() + 10;

	int WRAPPED_REMOTETRIGGERACTION_FEATURE_COUNT = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getRemoteTriggerAction().getFeatureCount() + 11;
	
	int WRAPPED_GETDATAACTION = 45;

	int WRAPPED_GETDATAACTION__UUID = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getGetDataAction().getFeatureCount() + 0;

	int WRAPPED_GETDATAACTION__JDELETED = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getGetDataAction().getFeatureCount() + 1;

	int WRAPPED_GETDATAACTION__JDIAGRAM_HOLDER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getGetDataAction().getFeatureCount() + 2;

	int WRAPPED_GETDATAACTION__READ_ONLY = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getGetDataAction().getFeatureCount() + 3;

	int WRAPPED_GETDATAACTION__POSEIDON_NAME = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getGetDataAction().getFeatureCount() + 4;

	int WRAPPED_GETDATAACTION__POSEIDON_NAMESPACE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getGetDataAction().getFeatureCount() + 5;

	int WRAPPED_GETDATAACTION__OWNED_MEMBER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getGetDataAction().getFeatureCount() + 6;

	int WRAPPED_GETDATAACTION__SOURCE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getGetDataAction().getFeatureCount() + 7;

	int WRAPPED_GETDATAACTION__TARGET = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getGetDataAction().getFeatureCount() + 8;
	
	int WRAPPED_GETDATAACTION__POSEIDON_EDGE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getGetDataAction().getFeatureCount() + 9;
	
	int WRAPPED_GETDATAACTION__POSEIDON_ROLE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getGetDataAction().getFeatureCount() + 10;

	int WRAPPED_GETDATAACTION_FEATURE_COUNT = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getGetDataAction().getFeatureCount() + 11;
	
	int WRAPPED_ACTIVATIONPROFILE = 46;

	int WRAPPED_ACTIVATIONPROFILE__UUID = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActivationProfile().getFeatureCount() + 0;

	int WRAPPED_ACTIVATIONPROFILE__JDELETED = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActivationProfile().getFeatureCount() + 1;

	int WRAPPED_ACTIVATIONPROFILE__JDIAGRAM_HOLDER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActivationProfile().getFeatureCount() + 2;

	int WRAPPED_ACTIVATIONPROFILE__READ_ONLY = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActivationProfile().getFeatureCount() + 3;

	int WRAPPED_ACTIVATIONPROFILE__POSEIDON_NAME = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActivationProfile().getFeatureCount() + 4;

	int WRAPPED_ACTIVATIONPROFILE__POSEIDON_NAMESPACE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActivationProfile().getFeatureCount() + 5;

	int WRAPPED_ACTIVATIONPROFILE__OWNED_MEMBER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActivationProfile().getFeatureCount() + 6;

	int WRAPPED_ACTIVATIONPROFILE__SOURCE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActivationProfile().getFeatureCount() + 7;

	int WRAPPED_ACTIVATIONPROFILE__TARGET = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActivationProfile().getFeatureCount() + 8;
	
	int WRAPPED_ACTIVATIONPROFILE__POSEIDON_EDGE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActivationProfile().getFeatureCount() + 9;
	
	int WRAPPED_ACTIVATIONPROFILE__POSEIDON_ROLE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActivationProfile().getFeatureCount() + 10;

	int WRAPPED_ACTIVATIONPROFILE_FEATURE_COUNT = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getActivationProfile().getFeatureCount() + 11;
	
	int WRAPPED_RUNTIME = 47;

	int WRAPPED_RUNTIME__UUID = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getRuntime().getFeatureCount() + 0;

	int WRAPPED_RUNTIME__JDELETED = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getRuntime().getFeatureCount() + 1;

	int WRAPPED_RUNTIME__JDIAGRAM_HOLDER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getRuntime().getFeatureCount() + 2;

	int WRAPPED_RUNTIME__READ_ONLY = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getRuntime().getFeatureCount() + 3;

	int WRAPPED_RUNTIME__POSEIDON_NAME = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getRuntime().getFeatureCount() + 4;

	int WRAPPED_RUNTIME__POSEIDON_NAMESPACE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getRuntime().getFeatureCount() + 5;

	int WRAPPED_RUNTIME__OWNED_MEMBER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getRuntime().getFeatureCount() + 6;

	int WRAPPED_RUNTIME__SOURCE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getRuntime().getFeatureCount() + 7;

	int WRAPPED_RUNTIME__TARGET = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getRuntime().getFeatureCount() + 8;
	
	int WRAPPED_RUNTIME__POSEIDON_EDGE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getRuntime().getFeatureCount() + 9;
	
	int WRAPPED_RUNTIME__POSEIDON_ROLE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getRuntime().getFeatureCount() + 10;

	int WRAPPED_RUNTIME_FEATURE_COUNT = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getRuntime().getFeatureCount() + 11;
	
	int WRAPPED_PLATFORMSLOT = 48;

	int WRAPPED_PLATFORMSLOT__UUID = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getPlatformSlot().getFeatureCount() + 0;

	int WRAPPED_PLATFORMSLOT__JDELETED = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getPlatformSlot().getFeatureCount() + 1;

	int WRAPPED_PLATFORMSLOT__JDIAGRAM_HOLDER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getPlatformSlot().getFeatureCount() + 2;

	int WRAPPED_PLATFORMSLOT__READ_ONLY = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getPlatformSlot().getFeatureCount() + 3;

	int WRAPPED_PLATFORMSLOT__POSEIDON_NAME = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getPlatformSlot().getFeatureCount() + 4;

	int WRAPPED_PLATFORMSLOT__POSEIDON_NAMESPACE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getPlatformSlot().getFeatureCount() + 5;

	int WRAPPED_PLATFORMSLOT__OWNED_MEMBER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getPlatformSlot().getFeatureCount() + 6;

	int WRAPPED_PLATFORMSLOT__SOURCE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getPlatformSlot().getFeatureCount() + 7;

	int WRAPPED_PLATFORMSLOT__TARGET = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getPlatformSlot().getFeatureCount() + 8;
	
	int WRAPPED_PLATFORMSLOT__POSEIDON_EDGE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getPlatformSlot().getFeatureCount() + 9;
	
	int WRAPPED_PLATFORMSLOT__POSEIDON_ROLE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getPlatformSlot().getFeatureCount() + 10;

	int WRAPPED_PLATFORMSLOT_FEATURE_COUNT = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getPlatformSlot().getFeatureCount() + 11;
	
	int WRAPPED_PLATFORMELEMENT = 49;

	int WRAPPED_PLATFORMELEMENT__UUID = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getPlatformElement().getFeatureCount() + 0;

	int WRAPPED_PLATFORMELEMENT__JDELETED = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getPlatformElement().getFeatureCount() + 1;

	int WRAPPED_PLATFORMELEMENT__JDIAGRAM_HOLDER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getPlatformElement().getFeatureCount() + 2;

	int WRAPPED_PLATFORMELEMENT__READ_ONLY = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getPlatformElement().getFeatureCount() + 3;

	int WRAPPED_PLATFORMELEMENT__POSEIDON_NAME = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getPlatformElement().getFeatureCount() + 4;

	int WRAPPED_PLATFORMELEMENT__POSEIDON_NAMESPACE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getPlatformElement().getFeatureCount() + 5;

	int WRAPPED_PLATFORMELEMENT__OWNED_MEMBER = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getPlatformElement().getFeatureCount() + 6;

	int WRAPPED_PLATFORMELEMENT__SOURCE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getPlatformElement().getFeatureCount() + 7;

	int WRAPPED_PLATFORMELEMENT__TARGET = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getPlatformElement().getFeatureCount() + 8;
	
	int WRAPPED_PLATFORMELEMENT__POSEIDON_EDGE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getPlatformElement().getFeatureCount() + 9;
	
	int WRAPPED_PLATFORMELEMENT__POSEIDON_ROLE = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getPlatformElement().getFeatureCount() + 10;

	int WRAPPED_PLATFORMELEMENT_FEATURE_COUNT = com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE.getPlatformElement().getFeatureCount() + 11;
	int WRAPPED_METAMODELELEMENTSUB = 50;

	int WRAPPED_METAMODELELEMENTSUB__UUID = DSLPackage.METAMODEL_ELEMENT_WRAPPER__UUID;

	int WRAPPED_METAMODELELEMENTSUB__JDELETED = DSLPackage.METAMODEL_ELEMENT_WRAPPER__JDELETED;

	int WRAPPED_METAMODELELEMENTSUB__JDIAGRAM_HOLDER = DSLPackage.METAMODEL_ELEMENT_WRAPPER__JDIAGRAM_HOLDER;

	int WRAPPED_METAMODELELEMENTSUB__READ_ONLY = DSLPackage.METAMODEL_ELEMENT_WRAPPER__READ_ONLY;

	int WRAPPED_METAMODELELEMENTSUB__POSEIDON_NAME = DSLPackage.METAMODEL_ELEMENT_WRAPPER__POSEIDON_NAME;

	int WRAPPED_METAMODELELEMENTSUB__POSEIDON_NAMESPACE = DSLPackage.METAMODEL_ELEMENT_WRAPPER__POSEIDON_NAMESPACE;

	int WRAPPED_METAMODELELEMENTSUB__OWNED_MEMBER = DSLPackage.METAMODEL_ELEMENT_WRAPPER__OWNED_MEMBER;

	int WRAPPED_METAMODELELEMENTSUB__SOURCE = DSLPackage.METAMODEL_ELEMENT_WRAPPER__SOURCE;

	int WRAPPED_METAMODELELEMENTSUB__TARGET = DSLPackage.METAMODEL_ELEMENT_WRAPPER__TARGET;
	
	int WRAPPED_METAMODELELEMENTSUB__POSEIDON_EDGE = DSLPackage.METAMODEL_ELEMENT_WRAPPER__POSEIDON_EDGE;
	
	int WRAPPED_METAMODELELEMENTSUB__POSEIDON_ROLE = DSLPackage.METAMODEL_ELEMENT_WRAPPER__POSEIDON_ROLE;
		
	int WRAPPED_METAMODELELEMENTSUB__SUBSTITUTES = DSLPackage.METAMODEL_ELEMENT_WRAPPER_FEATURE_COUNT + 0;

	int WRAPPED_METAMODELELEMENTSUB_FEATURE_COUNT = DSLPackage.METAMODEL_ELEMENT_WRAPPER_FEATURE_COUNT + 1;

	EClass getWrappedObjectives();

	EClass getWrappedSensor();

	EClass getWrappedActuator();

	EClass getWrappedActuating();

	EClass getWrappedTask();

	EClass getWrappedSensing();

	EClass getWrappedNode();

	EClass getWrappedEvent();

	EClass getWrappedNetwork();

	EClass getWrappedCommunication();

	EClass getWrappedData();

	EClass getWrappedState();

	EClass getWrappedTransition();

	EClass getWrappedInitialState();

	EClass getWrappedFinalState();

	EClass getWrappedCluster();

	EClass getWrappedClusterHead();

	EClass getWrappedSink();

	EClass getWrappedActivity();

	EClass getWrappedStateMachine();

	EClass getWrappedTiming();

	EClass getWrappedTimer();

	EClass getWrappedPlatform();

	EClass getWrappedResources();

	EClass getWrappedParameters();

	EClass getWrappedHarvester();

	EClass getWrappedBattery();

	EClass getWrappedAspect();

	EClass getWrappedPointcut();

	EClass getWrappedAdvice();

	EClass getWrappedActivityNode();

	EClass getWrappedInitialNode();

	EClass getWrappedFinalNode();

	EClass getWrappedDecisionNode();

	EClass getWrappedMergeNode();

	EClass getWrappedActivityEdge();

	EClass getWrappedOpaqueAction();

	EClass getWrappedSensingAction();

	EClass getWrappedActuatingAction();

	EClass getWrappedTimingAction();

	EClass getWrappedVariable();

	EClass getWrappedDataLink();

	EClass getWrappedUpdatePoolAction();

	EClass getWrappedGetNodeAction();

	EClass getWrappedRemoteTriggerAction();

	EClass getWrappedGetDataAction();

	EClass getWrappedActivationProfile();

	EClass getWrappedRuntime();

	EClass getWrappedPlatformSlot();

	EClass getWrappedPlatformElement();

	EClass getWrappedMetamodelElementSub();
	
	EReference getWrappedMetamodelElementSub_Substitutes();
	
	WrapperFactory getWrapperFactory();
	
	EPackage getUserPackage();
	
	EPackageImpl getUserPackageImpl();
	
	String getUserPackageNsUri();

	interface Literals {
		EClass WRAPPED_OBJECTIVES = eINSTANCE.getWrappedObjectives();	
		EClass WRAPPED_SENSOR = eINSTANCE.getWrappedSensor();	
		EClass WRAPPED_ACTUATOR = eINSTANCE.getWrappedActuator();	
		EClass WRAPPED_ACTUATING = eINSTANCE.getWrappedActuating();	
		EClass WRAPPED_TASK = eINSTANCE.getWrappedTask();	
		EClass WRAPPED_SENSING = eINSTANCE.getWrappedSensing();	
		EClass WRAPPED_NODE = eINSTANCE.getWrappedNode();	
		EClass WRAPPED_EVENT = eINSTANCE.getWrappedEvent();	
		EClass WRAPPED_NETWORK = eINSTANCE.getWrappedNetwork();	
		EClass WRAPPED_COMMUNICATION = eINSTANCE.getWrappedCommunication();	
		EClass WRAPPED_DATA = eINSTANCE.getWrappedData();	
		EClass WRAPPED_STATE = eINSTANCE.getWrappedState();	
		EClass WRAPPED_TRANSITION = eINSTANCE.getWrappedTransition();	
		EClass WRAPPED_INITIALSTATE = eINSTANCE.getWrappedInitialState();	
		EClass WRAPPED_FINALSTATE = eINSTANCE.getWrappedFinalState();	
		EClass WRAPPED_CLUSTER = eINSTANCE.getWrappedCluster();	
		EClass WRAPPED_CLUSTERHEAD = eINSTANCE.getWrappedClusterHead();	
		EClass WRAPPED_SINK = eINSTANCE.getWrappedSink();	
		EClass WRAPPED_ACTIVITY = eINSTANCE.getWrappedActivity();	
		EClass WRAPPED_STATEMACHINE = eINSTANCE.getWrappedStateMachine();	
		EClass WRAPPED_TIMING = eINSTANCE.getWrappedTiming();	
		EClass WRAPPED_TIMER = eINSTANCE.getWrappedTimer();	
		EClass WRAPPED_PLATFORM = eINSTANCE.getWrappedPlatform();	
		EClass WRAPPED_RESOURCES = eINSTANCE.getWrappedResources();	
		EClass WRAPPED_PARAMETERS = eINSTANCE.getWrappedParameters();	
		EClass WRAPPED_HARVESTER = eINSTANCE.getWrappedHarvester();	
		EClass WRAPPED_BATTERY = eINSTANCE.getWrappedBattery();	
		EClass WRAPPED_ASPECT = eINSTANCE.getWrappedAspect();	
		EClass WRAPPED_POINTCUT = eINSTANCE.getWrappedPointcut();	
		EClass WRAPPED_ADVICE = eINSTANCE.getWrappedAdvice();	
		EClass WRAPPED_ACTIVITYNODE = eINSTANCE.getWrappedActivityNode();	
		EClass WRAPPED_INITIALNODE = eINSTANCE.getWrappedInitialNode();	
		EClass WRAPPED_FINALNODE = eINSTANCE.getWrappedFinalNode();	
		EClass WRAPPED_DECISIONNODE = eINSTANCE.getWrappedDecisionNode();	
		EClass WRAPPED_MERGENODE = eINSTANCE.getWrappedMergeNode();	
		EClass WRAPPED_ACTIVITYEDGE = eINSTANCE.getWrappedActivityEdge();	
		EClass WRAPPED_OPAQUEACTION = eINSTANCE.getWrappedOpaqueAction();	
		EClass WRAPPED_SENSINGACTION = eINSTANCE.getWrappedSensingAction();	
		EClass WRAPPED_ACTUATINGACTION = eINSTANCE.getWrappedActuatingAction();	
		EClass WRAPPED_TIMINGACTION = eINSTANCE.getWrappedTimingAction();	
		EClass WRAPPED_VARIABLE = eINSTANCE.getWrappedVariable();	
		EClass WRAPPED_DATALINK = eINSTANCE.getWrappedDataLink();	
		EClass WRAPPED_UPDATEPOOLACTION = eINSTANCE.getWrappedUpdatePoolAction();	
		EClass WRAPPED_GETNODEACTION = eINSTANCE.getWrappedGetNodeAction();	
		EClass WRAPPED_REMOTETRIGGERACTION = eINSTANCE.getWrappedRemoteTriggerAction();	
		EClass WRAPPED_GETDATAACTION = eINSTANCE.getWrappedGetDataAction();	
		EClass WRAPPED_ACTIVATIONPROFILE = eINSTANCE.getWrappedActivationProfile();	
		EClass WRAPPED_RUNTIME = eINSTANCE.getWrappedRuntime();	
		EClass WRAPPED_PLATFORMSLOT = eINSTANCE.getWrappedPlatformSlot();	
		EClass WRAPPED_PLATFORMELEMENT = eINSTANCE.getWrappedPlatformElement();	
		EClass WRAPPED_METAMODELELEMENTSUB = eINSTANCE.getWrappedMetamodelElementSub();
		EReference WRAPPED_METAMODELELEMENTSUB__SUBSTITUTES = eINSTANCE.getWrappedMetamodelElementSub_Substitutes();
	}

} //WrapperPackage

