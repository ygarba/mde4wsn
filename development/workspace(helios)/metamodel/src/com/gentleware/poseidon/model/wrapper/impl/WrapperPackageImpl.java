// DO NOT MODIFY THIS FILE! This code is generated.

package com.gentleware.poseidon.model.wrapper.impl;

import com.gentleware.poseidon.dsl.DSLPackage;

import com.gentleware.poseidon.dsl.impl.DSLPackageImpl;

import com.gentleware.poseidon.model.wrapper.WrappedObjectives;
import com.gentleware.poseidon.model.wrapper.WrappedSensor;
import com.gentleware.poseidon.model.wrapper.WrappedActuator;
import com.gentleware.poseidon.model.wrapper.WrappedActuating;
import com.gentleware.poseidon.model.wrapper.WrappedTask;
import com.gentleware.poseidon.model.wrapper.WrappedSensing;
import com.gentleware.poseidon.model.wrapper.WrappedNode;
import com.gentleware.poseidon.model.wrapper.WrappedEvent;
import com.gentleware.poseidon.model.wrapper.WrappedNetwork;
import com.gentleware.poseidon.model.wrapper.WrappedCommunication;
import com.gentleware.poseidon.model.wrapper.WrappedData;
import com.gentleware.poseidon.model.wrapper.WrappedState;
import com.gentleware.poseidon.model.wrapper.WrappedTransition;
import com.gentleware.poseidon.model.wrapper.WrappedInitialState;
import com.gentleware.poseidon.model.wrapper.WrappedFinalState;
import com.gentleware.poseidon.model.wrapper.WrappedCluster;
import com.gentleware.poseidon.model.wrapper.WrappedClusterHead;
import com.gentleware.poseidon.model.wrapper.WrappedSink;
import com.gentleware.poseidon.model.wrapper.WrappedActivity;
import com.gentleware.poseidon.model.wrapper.WrappedStateMachine;
import com.gentleware.poseidon.model.wrapper.WrappedTiming;
import com.gentleware.poseidon.model.wrapper.WrappedTimer;
import com.gentleware.poseidon.model.wrapper.WrappedPlatform;
import com.gentleware.poseidon.model.wrapper.WrappedResources;
import com.gentleware.poseidon.model.wrapper.WrappedParameters;
import com.gentleware.poseidon.model.wrapper.WrappedHarvester;
import com.gentleware.poseidon.model.wrapper.WrappedBattery;
import com.gentleware.poseidon.model.wrapper.WrappedAspect;
import com.gentleware.poseidon.model.wrapper.WrappedPointcut;
import com.gentleware.poseidon.model.wrapper.WrappedAdvice;
import com.gentleware.poseidon.model.wrapper.WrappedActivityNode;
import com.gentleware.poseidon.model.wrapper.WrappedInitialNode;
import com.gentleware.poseidon.model.wrapper.WrappedFinalNode;
import com.gentleware.poseidon.model.wrapper.WrappedDecisionNode;
import com.gentleware.poseidon.model.wrapper.WrappedMergeNode;
import com.gentleware.poseidon.model.wrapper.WrappedActivityEdge;
import com.gentleware.poseidon.model.wrapper.WrappedOpaqueAction;
import com.gentleware.poseidon.model.wrapper.WrappedSensingAction;
import com.gentleware.poseidon.model.wrapper.WrappedActuatingAction;
import com.gentleware.poseidon.model.wrapper.WrappedTimingAction;
import com.gentleware.poseidon.model.wrapper.WrappedVariable;
import com.gentleware.poseidon.model.wrapper.WrappedDataLink;
import com.gentleware.poseidon.model.wrapper.WrappedUpdatePoolAction;
import com.gentleware.poseidon.model.wrapper.WrappedGetNodeAction;
import com.gentleware.poseidon.model.wrapper.WrappedRemoteTriggerAction;
import com.gentleware.poseidon.model.wrapper.WrappedGetDataAction;
import com.gentleware.poseidon.model.wrapper.WrappedActivationProfile;
import com.gentleware.poseidon.model.wrapper.WrappedRuntime;
import com.gentleware.poseidon.model.wrapper.WrappedPlatformSlot;
import com.gentleware.poseidon.model.wrapper.WrappedPlatformElement;
import com.gentleware.poseidon.model.wrapper.WrappedMetamodelElementSub;
import com.gentleware.poseidon.model.wrapper.WrapperFactory;
import com.gentleware.poseidon.model.wrapper.WrapperPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

public class WrapperPackageImpl extends EPackageImpl implements WrapperPackage {

	private EClass wrappedObjectivesEClass = null;
	private EClass wrappedSensorEClass = null;
	private EClass wrappedActuatorEClass = null;
	private EClass wrappedActuatingEClass = null;
	private EClass wrappedTaskEClass = null;
	private EClass wrappedSensingEClass = null;
	private EClass wrappedNodeEClass = null;
	private EClass wrappedEventEClass = null;
	private EClass wrappedNetworkEClass = null;
	private EClass wrappedCommunicationEClass = null;
	private EClass wrappedDataEClass = null;
	private EClass wrappedStateEClass = null;
	private EClass wrappedTransitionEClass = null;
	private EClass wrappedInitialStateEClass = null;
	private EClass wrappedFinalStateEClass = null;
	private EClass wrappedClusterEClass = null;
	private EClass wrappedClusterHeadEClass = null;
	private EClass wrappedSinkEClass = null;
	private EClass wrappedActivityEClass = null;
	private EClass wrappedStateMachineEClass = null;
	private EClass wrappedTimingEClass = null;
	private EClass wrappedTimerEClass = null;
	private EClass wrappedPlatformEClass = null;
	private EClass wrappedResourcesEClass = null;
	private EClass wrappedParametersEClass = null;
	private EClass wrappedHarvesterEClass = null;
	private EClass wrappedBatteryEClass = null;
	private EClass wrappedAspectEClass = null;
	private EClass wrappedPointcutEClass = null;
	private EClass wrappedAdviceEClass = null;
	private EClass wrappedActivityNodeEClass = null;
	private EClass wrappedInitialNodeEClass = null;
	private EClass wrappedFinalNodeEClass = null;
	private EClass wrappedDecisionNodeEClass = null;
	private EClass wrappedMergeNodeEClass = null;
	private EClass wrappedActivityEdgeEClass = null;
	private EClass wrappedOpaqueActionEClass = null;
	private EClass wrappedSensingActionEClass = null;
	private EClass wrappedActuatingActionEClass = null;
	private EClass wrappedTimingActionEClass = null;
	private EClass wrappedVariableEClass = null;
	private EClass wrappedDataLinkEClass = null;
	private EClass wrappedUpdatePoolActionEClass = null;
	private EClass wrappedGetNodeActionEClass = null;
	private EClass wrappedRemoteTriggerActionEClass = null;
	private EClass wrappedGetDataActionEClass = null;
	private EClass wrappedActivationProfileEClass = null;
	private EClass wrappedRuntimeEClass = null;
	private EClass wrappedPlatformSlotEClass = null;
	private EClass wrappedPlatformElementEClass = null;
	private EClass wrappedMetamodelElementSubEClass = null;

	private WrapperPackageImpl() {
		super(eNS_URI, WrapperFactory.eINSTANCE);
	}

	private static boolean isInited = false;

	public static WrapperPackage init() {
		if (isInited) return (WrapperPackage)EPackage.Registry.INSTANCE.getEPackage(WrapperPackage.eNS_URI);

		// Obtain or create and register package
		WrapperPackageImpl theWrapperPackage = (WrapperPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof WrapperPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new WrapperPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		DSLPackageImpl theDSLPackage = (DSLPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DSLPackage.eNS_URI) instanceof DSLPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DSLPackage.eNS_URI) : DSLPackage.eINSTANCE);
		com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl theUSERPackage = (com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl) theWrapperPackage.getUserPackageImpl();

		// Initialize packages
		theWrapperPackage.createPackageContents();
		theWrapperPackage.initializePackageContents();
		theDSLPackage.init();
		theUSERPackage.init();

		// Mark meta-data to indicate it can't be changed
		theWrapperPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WrapperPackage.eNS_URI, theWrapperPackage);
		return theWrapperPackage;
	}

	public EClass getWrappedObjectives() {
		return wrappedObjectivesEClass;
	}
	public EClass getWrappedSensor() {
		return wrappedSensorEClass;
	}
	public EClass getWrappedActuator() {
		return wrappedActuatorEClass;
	}
	public EClass getWrappedActuating() {
		return wrappedActuatingEClass;
	}
	public EClass getWrappedTask() {
		return wrappedTaskEClass;
	}
	public EClass getWrappedSensing() {
		return wrappedSensingEClass;
	}
	public EClass getWrappedNode() {
		return wrappedNodeEClass;
	}
	public EClass getWrappedEvent() {
		return wrappedEventEClass;
	}
	public EClass getWrappedNetwork() {
		return wrappedNetworkEClass;
	}
	public EClass getWrappedCommunication() {
		return wrappedCommunicationEClass;
	}
	public EClass getWrappedData() {
		return wrappedDataEClass;
	}
	public EClass getWrappedState() {
		return wrappedStateEClass;
	}
	public EClass getWrappedTransition() {
		return wrappedTransitionEClass;
	}
	public EClass getWrappedInitialState() {
		return wrappedInitialStateEClass;
	}
	public EClass getWrappedFinalState() {
		return wrappedFinalStateEClass;
	}
	public EClass getWrappedCluster() {
		return wrappedClusterEClass;
	}
	public EClass getWrappedClusterHead() {
		return wrappedClusterHeadEClass;
	}
	public EClass getWrappedSink() {
		return wrappedSinkEClass;
	}
	public EClass getWrappedActivity() {
		return wrappedActivityEClass;
	}
	public EClass getWrappedStateMachine() {
		return wrappedStateMachineEClass;
	}
	public EClass getWrappedTiming() {
		return wrappedTimingEClass;
	}
	public EClass getWrappedTimer() {
		return wrappedTimerEClass;
	}
	public EClass getWrappedPlatform() {
		return wrappedPlatformEClass;
	}
	public EClass getWrappedResources() {
		return wrappedResourcesEClass;
	}
	public EClass getWrappedParameters() {
		return wrappedParametersEClass;
	}
	public EClass getWrappedHarvester() {
		return wrappedHarvesterEClass;
	}
	public EClass getWrappedBattery() {
		return wrappedBatteryEClass;
	}
	public EClass getWrappedAspect() {
		return wrappedAspectEClass;
	}
	public EClass getWrappedPointcut() {
		return wrappedPointcutEClass;
	}
	public EClass getWrappedAdvice() {
		return wrappedAdviceEClass;
	}
	public EClass getWrappedActivityNode() {
		return wrappedActivityNodeEClass;
	}
	public EClass getWrappedInitialNode() {
		return wrappedInitialNodeEClass;
	}
	public EClass getWrappedFinalNode() {
		return wrappedFinalNodeEClass;
	}
	public EClass getWrappedDecisionNode() {
		return wrappedDecisionNodeEClass;
	}
	public EClass getWrappedMergeNode() {
		return wrappedMergeNodeEClass;
	}
	public EClass getWrappedActivityEdge() {
		return wrappedActivityEdgeEClass;
	}
	public EClass getWrappedOpaqueAction() {
		return wrappedOpaqueActionEClass;
	}
	public EClass getWrappedSensingAction() {
		return wrappedSensingActionEClass;
	}
	public EClass getWrappedActuatingAction() {
		return wrappedActuatingActionEClass;
	}
	public EClass getWrappedTimingAction() {
		return wrappedTimingActionEClass;
	}
	public EClass getWrappedVariable() {
		return wrappedVariableEClass;
	}
	public EClass getWrappedDataLink() {
		return wrappedDataLinkEClass;
	}
	public EClass getWrappedUpdatePoolAction() {
		return wrappedUpdatePoolActionEClass;
	}
	public EClass getWrappedGetNodeAction() {
		return wrappedGetNodeActionEClass;
	}
	public EClass getWrappedRemoteTriggerAction() {
		return wrappedRemoteTriggerActionEClass;
	}
	public EClass getWrappedGetDataAction() {
		return wrappedGetDataActionEClass;
	}
	public EClass getWrappedActivationProfile() {
		return wrappedActivationProfileEClass;
	}
	public EClass getWrappedRuntime() {
		return wrappedRuntimeEClass;
	}
	public EClass getWrappedPlatformSlot() {
		return wrappedPlatformSlotEClass;
	}
	public EClass getWrappedPlatformElement() {
		return wrappedPlatformElementEClass;
	}

	public EClass getWrappedMetamodelElementSub() {
		return wrappedMetamodelElementSubEClass;
	}
	
	public EReference getWrappedMetamodelElementSub_Substitutes() {
		return (EReference)wrappedMetamodelElementSubEClass.getEStructuralFeatures().get(0);
	}

	public WrapperFactory getWrapperFactory() {
		return (WrapperFactory)getEFactoryInstance();
	}
	
	public EPackage getUserPackage() {
		return com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE;
	}
	
	public EPackageImpl getUserPackageImpl() {
		return (com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(com.gentleware.poseidon.dsl.wsn.USERPackage.eNS_URI) instanceof com.gentleware.poseidon.dsl.wsn.impl.USERPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(com.gentleware.poseidon.dsl.wsn.USERPackage.eNS_URI) : com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE);
	}
	
	public String getUserPackageNsUri(){
		return com.gentleware.poseidon.dsl.wsn.USERPackage.eNS_URI;	
	}

	private boolean isCreated = false;

	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;
		// Create classes and their features
		wrappedObjectivesEClass = createEClass(WrapperPackage.WRAPPED_OBJECTIVES);
		wrappedSensorEClass = createEClass(WrapperPackage.WRAPPED_SENSOR);
		wrappedActuatorEClass = createEClass(WrapperPackage.WRAPPED_ACTUATOR);
		wrappedActuatingEClass = createEClass(WrapperPackage.WRAPPED_ACTUATING);
		wrappedTaskEClass = createEClass(WrapperPackage.WRAPPED_TASK);
		wrappedSensingEClass = createEClass(WrapperPackage.WRAPPED_SENSING);
		wrappedNodeEClass = createEClass(WrapperPackage.WRAPPED_NODE);
		wrappedEventEClass = createEClass(WrapperPackage.WRAPPED_EVENT);
		wrappedNetworkEClass = createEClass(WrapperPackage.WRAPPED_NETWORK);
		wrappedCommunicationEClass = createEClass(WrapperPackage.WRAPPED_COMMUNICATION);
		wrappedDataEClass = createEClass(WrapperPackage.WRAPPED_DATA);
		wrappedStateEClass = createEClass(WrapperPackage.WRAPPED_STATE);
		wrappedTransitionEClass = createEClass(WrapperPackage.WRAPPED_TRANSITION);
		wrappedInitialStateEClass = createEClass(WrapperPackage.WRAPPED_INITIALSTATE);
		wrappedFinalStateEClass = createEClass(WrapperPackage.WRAPPED_FINALSTATE);
		wrappedClusterEClass = createEClass(WrapperPackage.WRAPPED_CLUSTER);
		wrappedClusterHeadEClass = createEClass(WrapperPackage.WRAPPED_CLUSTERHEAD);
		wrappedSinkEClass = createEClass(WrapperPackage.WRAPPED_SINK);
		wrappedActivityEClass = createEClass(WrapperPackage.WRAPPED_ACTIVITY);
		wrappedStateMachineEClass = createEClass(WrapperPackage.WRAPPED_STATEMACHINE);
		wrappedTimingEClass = createEClass(WrapperPackage.WRAPPED_TIMING);
		wrappedTimerEClass = createEClass(WrapperPackage.WRAPPED_TIMER);
		wrappedPlatformEClass = createEClass(WrapperPackage.WRAPPED_PLATFORM);
		wrappedResourcesEClass = createEClass(WrapperPackage.WRAPPED_RESOURCES);
		wrappedParametersEClass = createEClass(WrapperPackage.WRAPPED_PARAMETERS);
		wrappedHarvesterEClass = createEClass(WrapperPackage.WRAPPED_HARVESTER);
		wrappedBatteryEClass = createEClass(WrapperPackage.WRAPPED_BATTERY);
		wrappedAspectEClass = createEClass(WrapperPackage.WRAPPED_ASPECT);
		wrappedPointcutEClass = createEClass(WrapperPackage.WRAPPED_POINTCUT);
		wrappedAdviceEClass = createEClass(WrapperPackage.WRAPPED_ADVICE);
		wrappedActivityNodeEClass = createEClass(WrapperPackage.WRAPPED_ACTIVITYNODE);
		wrappedInitialNodeEClass = createEClass(WrapperPackage.WRAPPED_INITIALNODE);
		wrappedFinalNodeEClass = createEClass(WrapperPackage.WRAPPED_FINALNODE);
		wrappedDecisionNodeEClass = createEClass(WrapperPackage.WRAPPED_DECISIONNODE);
		wrappedMergeNodeEClass = createEClass(WrapperPackage.WRAPPED_MERGENODE);
		wrappedActivityEdgeEClass = createEClass(WrapperPackage.WRAPPED_ACTIVITYEDGE);
		wrappedOpaqueActionEClass = createEClass(WrapperPackage.WRAPPED_OPAQUEACTION);
		wrappedSensingActionEClass = createEClass(WrapperPackage.WRAPPED_SENSINGACTION);
		wrappedActuatingActionEClass = createEClass(WrapperPackage.WRAPPED_ACTUATINGACTION);
		wrappedTimingActionEClass = createEClass(WrapperPackage.WRAPPED_TIMINGACTION);
		wrappedVariableEClass = createEClass(WrapperPackage.WRAPPED_VARIABLE);
		wrappedDataLinkEClass = createEClass(WrapperPackage.WRAPPED_DATALINK);
		wrappedUpdatePoolActionEClass = createEClass(WrapperPackage.WRAPPED_UPDATEPOOLACTION);
		wrappedGetNodeActionEClass = createEClass(WrapperPackage.WRAPPED_GETNODEACTION);
		wrappedRemoteTriggerActionEClass = createEClass(WrapperPackage.WRAPPED_REMOTETRIGGERACTION);
		wrappedGetDataActionEClass = createEClass(WrapperPackage.WRAPPED_GETDATAACTION);
		wrappedActivationProfileEClass = createEClass(WrapperPackage.WRAPPED_ACTIVATIONPROFILE);
		wrappedRuntimeEClass = createEClass(WrapperPackage.WRAPPED_RUNTIME);
		wrappedPlatformSlotEClass = createEClass(WrapperPackage.WRAPPED_PLATFORMSLOT);
		wrappedPlatformElementEClass = createEClass(WrapperPackage.WRAPPED_PLATFORMELEMENT);
		wrappedMetamodelElementSubEClass = createEClass(WRAPPED_METAMODELELEMENTSUB);
		createEReference(wrappedMetamodelElementSubEClass, WRAPPED_METAMODELELEMENTSUB__SUBSTITUTES);
	}

	private boolean isInitialized = false;

	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		com.gentleware.poseidon.dsl.wsn.USERPackage theUSERPackage = (com.gentleware.poseidon.dsl.wsn.USERPackage)EPackage.Registry.INSTANCE.getEPackage(com.gentleware.poseidon.dsl.wsn.USERPackage.eNS_URI);
		DSLPackage theDSLPackage = (DSLPackage)EPackage.Registry.INSTANCE.getEPackage(DSLPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		wrappedObjectivesEClass.getESuperTypes().add(theUSERPackage.getObjectives());
		wrappedObjectivesEClass.getESuperTypes().add(theDSLPackage.getMetamodelElementWrapper());
		wrappedSensorEClass.getESuperTypes().add(theUSERPackage.getSensor());
		wrappedSensorEClass.getESuperTypes().add(theDSLPackage.getMetamodelElementWrapper());
		wrappedActuatorEClass.getESuperTypes().add(theUSERPackage.getActuator());
		wrappedActuatorEClass.getESuperTypes().add(theDSLPackage.getMetamodelElementWrapper());
		wrappedActuatingEClass.getESuperTypes().add(theUSERPackage.getActuating());
		wrappedActuatingEClass.getESuperTypes().add(theDSLPackage.getMetamodelElementWrapper());
		wrappedTaskEClass.getESuperTypes().add(theUSERPackage.getTask());
		wrappedTaskEClass.getESuperTypes().add(theDSLPackage.getMetamodelElementWrapper());
		wrappedSensingEClass.getESuperTypes().add(theUSERPackage.getSensing());
		wrappedSensingEClass.getESuperTypes().add(theDSLPackage.getMetamodelElementWrapper());
		wrappedNodeEClass.getESuperTypes().add(theUSERPackage.getNode());
		wrappedNodeEClass.getESuperTypes().add(theDSLPackage.getMetamodelElementWrapper());
		wrappedEventEClass.getESuperTypes().add(theUSERPackage.getEvent());
		wrappedEventEClass.getESuperTypes().add(theDSLPackage.getMetamodelElementWrapper());
		wrappedNetworkEClass.getESuperTypes().add(theUSERPackage.getNetwork());
		wrappedNetworkEClass.getESuperTypes().add(theDSLPackage.getMetamodelElementWrapper());
		wrappedCommunicationEClass.getESuperTypes().add(theUSERPackage.getCommunication());
		wrappedCommunicationEClass.getESuperTypes().add(theDSLPackage.getMetamodelElementWrapper());
		wrappedDataEClass.getESuperTypes().add(theUSERPackage.getData());
		wrappedDataEClass.getESuperTypes().add(theDSLPackage.getMetamodelElementWrapper());
		wrappedStateEClass.getESuperTypes().add(theUSERPackage.getState());
		wrappedStateEClass.getESuperTypes().add(theDSLPackage.getMetamodelElementWrapper());
		wrappedTransitionEClass.getESuperTypes().add(theUSERPackage.getTransition());
		wrappedTransitionEClass.getESuperTypes().add(theDSLPackage.getMetamodelElementWrapper());
		wrappedInitialStateEClass.getESuperTypes().add(theUSERPackage.getInitialState());
		wrappedInitialStateEClass.getESuperTypes().add(theDSLPackage.getMetamodelElementWrapper());
		wrappedFinalStateEClass.getESuperTypes().add(theUSERPackage.getFinalState());
		wrappedFinalStateEClass.getESuperTypes().add(theDSLPackage.getMetamodelElementWrapper());
		wrappedClusterEClass.getESuperTypes().add(theUSERPackage.getCluster());
		wrappedClusterEClass.getESuperTypes().add(theDSLPackage.getMetamodelElementWrapper());
		wrappedClusterHeadEClass.getESuperTypes().add(theUSERPackage.getClusterHead());
		wrappedClusterHeadEClass.getESuperTypes().add(theDSLPackage.getMetamodelElementWrapper());
		wrappedSinkEClass.getESuperTypes().add(theUSERPackage.getSink());
		wrappedSinkEClass.getESuperTypes().add(theDSLPackage.getMetamodelElementWrapper());
		wrappedActivityEClass.getESuperTypes().add(theUSERPackage.getActivity());
		wrappedActivityEClass.getESuperTypes().add(theDSLPackage.getMetamodelElementWrapper());
		wrappedStateMachineEClass.getESuperTypes().add(theUSERPackage.getStateMachine());
		wrappedStateMachineEClass.getESuperTypes().add(theDSLPackage.getMetamodelElementWrapper());
		wrappedTimingEClass.getESuperTypes().add(theUSERPackage.getTiming());
		wrappedTimingEClass.getESuperTypes().add(theDSLPackage.getMetamodelElementWrapper());
		wrappedTimerEClass.getESuperTypes().add(theUSERPackage.getTimer());
		wrappedTimerEClass.getESuperTypes().add(theDSLPackage.getMetamodelElementWrapper());
		wrappedPlatformEClass.getESuperTypes().add(theUSERPackage.getPlatform());
		wrappedPlatformEClass.getESuperTypes().add(theDSLPackage.getMetamodelElementWrapper());
		wrappedResourcesEClass.getESuperTypes().add(theUSERPackage.getResources());
		wrappedResourcesEClass.getESuperTypes().add(theDSLPackage.getMetamodelElementWrapper());
		wrappedParametersEClass.getESuperTypes().add(theUSERPackage.getParameters());
		wrappedParametersEClass.getESuperTypes().add(theDSLPackage.getMetamodelElementWrapper());
		wrappedHarvesterEClass.getESuperTypes().add(theUSERPackage.getHarvester());
		wrappedHarvesterEClass.getESuperTypes().add(theDSLPackage.getMetamodelElementWrapper());
		wrappedBatteryEClass.getESuperTypes().add(theUSERPackage.getBattery());
		wrappedBatteryEClass.getESuperTypes().add(theDSLPackage.getMetamodelElementWrapper());
		wrappedAspectEClass.getESuperTypes().add(theUSERPackage.getAspect());
		wrappedAspectEClass.getESuperTypes().add(theDSLPackage.getMetamodelElementWrapper());
		wrappedPointcutEClass.getESuperTypes().add(theUSERPackage.getPointcut());
		wrappedPointcutEClass.getESuperTypes().add(theDSLPackage.getMetamodelElementWrapper());
		wrappedAdviceEClass.getESuperTypes().add(theUSERPackage.getAdvice());
		wrappedAdviceEClass.getESuperTypes().add(theDSLPackage.getMetamodelElementWrapper());
		wrappedActivityNodeEClass.getESuperTypes().add(theUSERPackage.getActivityNode());
		wrappedActivityNodeEClass.getESuperTypes().add(theDSLPackage.getMetamodelElementWrapper());
		wrappedInitialNodeEClass.getESuperTypes().add(theUSERPackage.getInitialNode());
		wrappedInitialNodeEClass.getESuperTypes().add(theDSLPackage.getMetamodelElementWrapper());
		wrappedFinalNodeEClass.getESuperTypes().add(theUSERPackage.getFinalNode());
		wrappedFinalNodeEClass.getESuperTypes().add(theDSLPackage.getMetamodelElementWrapper());
		wrappedDecisionNodeEClass.getESuperTypes().add(theUSERPackage.getDecisionNode());
		wrappedDecisionNodeEClass.getESuperTypes().add(theDSLPackage.getMetamodelElementWrapper());
		wrappedMergeNodeEClass.getESuperTypes().add(theUSERPackage.getMergeNode());
		wrappedMergeNodeEClass.getESuperTypes().add(theDSLPackage.getMetamodelElementWrapper());
		wrappedActivityEdgeEClass.getESuperTypes().add(theUSERPackage.getActivityEdge());
		wrappedActivityEdgeEClass.getESuperTypes().add(theDSLPackage.getMetamodelElementWrapper());
		wrappedOpaqueActionEClass.getESuperTypes().add(theUSERPackage.getOpaqueAction());
		wrappedOpaqueActionEClass.getESuperTypes().add(theDSLPackage.getMetamodelElementWrapper());
		wrappedSensingActionEClass.getESuperTypes().add(theUSERPackage.getSensingAction());
		wrappedSensingActionEClass.getESuperTypes().add(theDSLPackage.getMetamodelElementWrapper());
		wrappedActuatingActionEClass.getESuperTypes().add(theUSERPackage.getActuatingAction());
		wrappedActuatingActionEClass.getESuperTypes().add(theDSLPackage.getMetamodelElementWrapper());
		wrappedTimingActionEClass.getESuperTypes().add(theUSERPackage.getTimingAction());
		wrappedTimingActionEClass.getESuperTypes().add(theDSLPackage.getMetamodelElementWrapper());
		wrappedVariableEClass.getESuperTypes().add(theUSERPackage.getVariable());
		wrappedVariableEClass.getESuperTypes().add(theDSLPackage.getMetamodelElementWrapper());
		wrappedDataLinkEClass.getESuperTypes().add(theUSERPackage.getDataLink());
		wrappedDataLinkEClass.getESuperTypes().add(theDSLPackage.getMetamodelElementWrapper());
		wrappedUpdatePoolActionEClass.getESuperTypes().add(theUSERPackage.getUpdatePoolAction());
		wrappedUpdatePoolActionEClass.getESuperTypes().add(theDSLPackage.getMetamodelElementWrapper());
		wrappedGetNodeActionEClass.getESuperTypes().add(theUSERPackage.getGetNodeAction());
		wrappedGetNodeActionEClass.getESuperTypes().add(theDSLPackage.getMetamodelElementWrapper());
		wrappedRemoteTriggerActionEClass.getESuperTypes().add(theUSERPackage.getRemoteTriggerAction());
		wrappedRemoteTriggerActionEClass.getESuperTypes().add(theDSLPackage.getMetamodelElementWrapper());
		wrappedGetDataActionEClass.getESuperTypes().add(theUSERPackage.getGetDataAction());
		wrappedGetDataActionEClass.getESuperTypes().add(theDSLPackage.getMetamodelElementWrapper());
		wrappedActivationProfileEClass.getESuperTypes().add(theUSERPackage.getActivationProfile());
		wrappedActivationProfileEClass.getESuperTypes().add(theDSLPackage.getMetamodelElementWrapper());
		wrappedRuntimeEClass.getESuperTypes().add(theUSERPackage.getRuntime());
		wrappedRuntimeEClass.getESuperTypes().add(theDSLPackage.getMetamodelElementWrapper());
		wrappedPlatformSlotEClass.getESuperTypes().add(theUSERPackage.getPlatformSlot());
		wrappedPlatformSlotEClass.getESuperTypes().add(theDSLPackage.getMetamodelElementWrapper());
		wrappedPlatformElementEClass.getESuperTypes().add(theUSERPackage.getPlatformElement());
		wrappedPlatformElementEClass.getESuperTypes().add(theDSLPackage.getMetamodelElementWrapper());
		wrappedMetamodelElementSubEClass.getESuperTypes().add(theDSLPackage.getMetamodelElementWrapper());
		
		// Initialize classes and features; add operations and parameters
		initEClass(wrappedObjectivesEClass, WrappedObjectives.class, "WrappedObjectives", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(wrappedSensorEClass, WrappedSensor.class, "WrappedSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(wrappedActuatorEClass, WrappedActuator.class, "WrappedActuator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(wrappedActuatingEClass, WrappedActuating.class, "WrappedActuating", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(wrappedTaskEClass, WrappedTask.class, "WrappedTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(wrappedSensingEClass, WrappedSensing.class, "WrappedSensing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(wrappedNodeEClass, WrappedNode.class, "WrappedNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(wrappedEventEClass, WrappedEvent.class, "WrappedEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(wrappedNetworkEClass, WrappedNetwork.class, "WrappedNetwork", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(wrappedCommunicationEClass, WrappedCommunication.class, "WrappedCommunication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(wrappedDataEClass, WrappedData.class, "WrappedData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(wrappedStateEClass, WrappedState.class, "WrappedState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(wrappedTransitionEClass, WrappedTransition.class, "WrappedTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(wrappedInitialStateEClass, WrappedInitialState.class, "WrappedInitialState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(wrappedFinalStateEClass, WrappedFinalState.class, "WrappedFinalState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(wrappedClusterEClass, WrappedCluster.class, "WrappedCluster", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(wrappedClusterHeadEClass, WrappedClusterHead.class, "WrappedClusterHead", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(wrappedSinkEClass, WrappedSink.class, "WrappedSink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(wrappedActivityEClass, WrappedActivity.class, "WrappedActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(wrappedStateMachineEClass, WrappedStateMachine.class, "WrappedStateMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(wrappedTimingEClass, WrappedTiming.class, "WrappedTiming", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(wrappedTimerEClass, WrappedTimer.class, "WrappedTimer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(wrappedPlatformEClass, WrappedPlatform.class, "WrappedPlatform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(wrappedResourcesEClass, WrappedResources.class, "WrappedResources", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(wrappedParametersEClass, WrappedParameters.class, "WrappedParameters", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(wrappedHarvesterEClass, WrappedHarvester.class, "WrappedHarvester", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(wrappedBatteryEClass, WrappedBattery.class, "WrappedBattery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(wrappedAspectEClass, WrappedAspect.class, "WrappedAspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(wrappedPointcutEClass, WrappedPointcut.class, "WrappedPointcut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(wrappedAdviceEClass, WrappedAdvice.class, "WrappedAdvice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(wrappedActivityNodeEClass, WrappedActivityNode.class, "WrappedActivityNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(wrappedInitialNodeEClass, WrappedInitialNode.class, "WrappedInitialNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(wrappedFinalNodeEClass, WrappedFinalNode.class, "WrappedFinalNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(wrappedDecisionNodeEClass, WrappedDecisionNode.class, "WrappedDecisionNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(wrappedMergeNodeEClass, WrappedMergeNode.class, "WrappedMergeNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(wrappedActivityEdgeEClass, WrappedActivityEdge.class, "WrappedActivityEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(wrappedOpaqueActionEClass, WrappedOpaqueAction.class, "WrappedOpaqueAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(wrappedSensingActionEClass, WrappedSensingAction.class, "WrappedSensingAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(wrappedActuatingActionEClass, WrappedActuatingAction.class, "WrappedActuatingAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(wrappedTimingActionEClass, WrappedTimingAction.class, "WrappedTimingAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(wrappedVariableEClass, WrappedVariable.class, "WrappedVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(wrappedDataLinkEClass, WrappedDataLink.class, "WrappedDataLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(wrappedUpdatePoolActionEClass, WrappedUpdatePoolAction.class, "WrappedUpdatePoolAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(wrappedGetNodeActionEClass, WrappedGetNodeAction.class, "WrappedGetNodeAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(wrappedRemoteTriggerActionEClass, WrappedRemoteTriggerAction.class, "WrappedRemoteTriggerAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(wrappedGetDataActionEClass, WrappedGetDataAction.class, "WrappedGetDataAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(wrappedActivationProfileEClass, WrappedActivationProfile.class, "WrappedActivationProfile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(wrappedRuntimeEClass, WrappedRuntime.class, "WrappedRuntime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(wrappedPlatformSlotEClass, WrappedPlatformSlot.class, "WrappedPlatformSlot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(wrappedPlatformElementEClass, WrappedPlatformElement.class, "WrappedPlatformElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEClass(wrappedMetamodelElementSubEClass, WrappedMetamodelElementSub.class, "WrappedMetamodelElementSub", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWrappedMetamodelElementSub_Substitutes(), ecorePackage.getEObject(), null, "substitutes", null, 0, 1, WrappedMetamodelElementSub.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}
} //WrapperPackageImpl

