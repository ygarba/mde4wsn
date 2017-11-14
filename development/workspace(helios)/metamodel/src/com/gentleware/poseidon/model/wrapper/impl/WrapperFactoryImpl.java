// DO NOT MODIFY THIS FILE! This code is generated.

package com.gentleware.poseidon.model.wrapper.impl;

import com.gentleware.poseidon.model.wrapper.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

public class WrapperFactoryImpl extends EFactoryImpl implements WrapperFactory {

	public static WrapperFactory init() {
		try {
			WrapperFactory theWrapperFactory = (WrapperFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.gentleware.com/poseidon/dsl/wrapper/1.0"); 
			if (theWrapperFactory != null) {
				return theWrapperFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WrapperFactoryImpl();
	}

	public WrapperFactoryImpl() {
		super();
	}

	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case WrapperPackage.WRAPPED_OBJECTIVES: return createWrappedObjectives();			
			case WrapperPackage.WRAPPED_SENSOR: return createWrappedSensor();			
			case WrapperPackage.WRAPPED_ACTUATOR: return createWrappedActuator();			
			case WrapperPackage.WRAPPED_ACTUATING: return createWrappedActuating();			
			case WrapperPackage.WRAPPED_TASK: return createWrappedTask();			
			case WrapperPackage.WRAPPED_SENSING: return createWrappedSensing();			
			case WrapperPackage.WRAPPED_NODE: return createWrappedNode();			
			case WrapperPackage.WRAPPED_EVENT: return createWrappedEvent();			
			case WrapperPackage.WRAPPED_NETWORK: return createWrappedNetwork();			
			case WrapperPackage.WRAPPED_COMMUNICATION: return createWrappedCommunication();			
			case WrapperPackage.WRAPPED_DATA: return createWrappedData();			
			case WrapperPackage.WRAPPED_STATE: return createWrappedState();			
			case WrapperPackage.WRAPPED_TRANSITION: return createWrappedTransition();			
			case WrapperPackage.WRAPPED_INITIALSTATE: return createWrappedInitialState();			
			case WrapperPackage.WRAPPED_FINALSTATE: return createWrappedFinalState();			
			case WrapperPackage.WRAPPED_CLUSTER: return createWrappedCluster();			
			case WrapperPackage.WRAPPED_CLUSTERHEAD: return createWrappedClusterHead();			
			case WrapperPackage.WRAPPED_SINK: return createWrappedSink();			
			case WrapperPackage.WRAPPED_ACTIVITY: return createWrappedActivity();			
			case WrapperPackage.WRAPPED_STATEMACHINE: return createWrappedStateMachine();			
			case WrapperPackage.WRAPPED_TIMING: return createWrappedTiming();			
			case WrapperPackage.WRAPPED_TIMER: return createWrappedTimer();			
			case WrapperPackage.WRAPPED_PLATFORM: return createWrappedPlatform();			
			case WrapperPackage.WRAPPED_RESOURCES: return createWrappedResources();			
			case WrapperPackage.WRAPPED_PARAMETERS: return createWrappedParameters();			
			case WrapperPackage.WRAPPED_HARVESTER: return createWrappedHarvester();			
			case WrapperPackage.WRAPPED_BATTERY: return createWrappedBattery();			
			case WrapperPackage.WRAPPED_ASPECT: return createWrappedAspect();			
			case WrapperPackage.WRAPPED_POINTCUT: return createWrappedPointcut();			
			case WrapperPackage.WRAPPED_ADVICE: return createWrappedAdvice();			
			case WrapperPackage.WRAPPED_ACTIVITYNODE: return createWrappedActivityNode();			
			case WrapperPackage.WRAPPED_INITIALNODE: return createWrappedInitialNode();			
			case WrapperPackage.WRAPPED_FINALNODE: return createWrappedFinalNode();			
			case WrapperPackage.WRAPPED_DECISIONNODE: return createWrappedDecisionNode();			
			case WrapperPackage.WRAPPED_MERGENODE: return createWrappedMergeNode();			
			case WrapperPackage.WRAPPED_ACTIVITYEDGE: return createWrappedActivityEdge();			
			case WrapperPackage.WRAPPED_OPAQUEACTION: return createWrappedOpaqueAction();			
			case WrapperPackage.WRAPPED_SENSINGACTION: return createWrappedSensingAction();			
			case WrapperPackage.WRAPPED_ACTUATINGACTION: return createWrappedActuatingAction();			
			case WrapperPackage.WRAPPED_TIMINGACTION: return createWrappedTimingAction();			
			case WrapperPackage.WRAPPED_VARIABLE: return createWrappedVariable();			
			case WrapperPackage.WRAPPED_DATALINK: return createWrappedDataLink();			
			case WrapperPackage.WRAPPED_UPDATEPOOLACTION: return createWrappedUpdatePoolAction();			
			case WrapperPackage.WRAPPED_GETNODEACTION: return createWrappedGetNodeAction();			
			case WrapperPackage.WRAPPED_REMOTETRIGGERACTION: return createWrappedRemoteTriggerAction();			
			case WrapperPackage.WRAPPED_GETDATAACTION: return createWrappedGetDataAction();			
			case WrapperPackage.WRAPPED_ACTIVATIONPROFILE: return createWrappedActivationProfile();			
			case WrapperPackage.WRAPPED_RUNTIME: return createWrappedRuntime();			
			case WrapperPackage.WRAPPED_PLATFORMSLOT: return createWrappedPlatformSlot();			
			case WrapperPackage.WRAPPED_PLATFORMELEMENT: return createWrappedPlatformElement();			
			case WrapperPackage.WRAPPED_METAMODELELEMENTSUB: return createWrappedMetamodelElementSub();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}
	
	public WrappedObjectives createWrappedObjectives() {
		WrappedObjectivesImpl wrappedObjectives = new WrappedObjectivesImpl();
		return wrappedObjectives;
	}
	public WrappedSensor createWrappedSensor() {
		WrappedSensorImpl wrappedSensor = new WrappedSensorImpl();
		return wrappedSensor;
	}
	public WrappedActuator createWrappedActuator() {
		WrappedActuatorImpl wrappedActuator = new WrappedActuatorImpl();
		return wrappedActuator;
	}
	public WrappedActuating createWrappedActuating() {
		WrappedActuatingImpl wrappedActuating = new WrappedActuatingImpl();
		return wrappedActuating;
	}
	public WrappedTask createWrappedTask() {
		WrappedTaskImpl wrappedTask = new WrappedTaskImpl();
		return wrappedTask;
	}
	public WrappedSensing createWrappedSensing() {
		WrappedSensingImpl wrappedSensing = new WrappedSensingImpl();
		return wrappedSensing;
	}
	public WrappedNode createWrappedNode() {
		WrappedNodeImpl wrappedNode = new WrappedNodeImpl();
		return wrappedNode;
	}
	public WrappedEvent createWrappedEvent() {
		WrappedEventImpl wrappedEvent = new WrappedEventImpl();
		return wrappedEvent;
	}
	public WrappedNetwork createWrappedNetwork() {
		WrappedNetworkImpl wrappedNetwork = new WrappedNetworkImpl();
		return wrappedNetwork;
	}
	public WrappedCommunication createWrappedCommunication() {
		WrappedCommunicationImpl wrappedCommunication = new WrappedCommunicationImpl();
		return wrappedCommunication;
	}
	public WrappedData createWrappedData() {
		WrappedDataImpl wrappedData = new WrappedDataImpl();
		return wrappedData;
	}
	public WrappedState createWrappedState() {
		WrappedStateImpl wrappedState = new WrappedStateImpl();
		return wrappedState;
	}
	public WrappedTransition createWrappedTransition() {
		WrappedTransitionImpl wrappedTransition = new WrappedTransitionImpl();
		return wrappedTransition;
	}
	public WrappedInitialState createWrappedInitialState() {
		WrappedInitialStateImpl wrappedInitialState = new WrappedInitialStateImpl();
		return wrappedInitialState;
	}
	public WrappedFinalState createWrappedFinalState() {
		WrappedFinalStateImpl wrappedFinalState = new WrappedFinalStateImpl();
		return wrappedFinalState;
	}
	public WrappedCluster createWrappedCluster() {
		WrappedClusterImpl wrappedCluster = new WrappedClusterImpl();
		return wrappedCluster;
	}
	public WrappedClusterHead createWrappedClusterHead() {
		WrappedClusterHeadImpl wrappedClusterHead = new WrappedClusterHeadImpl();
		return wrappedClusterHead;
	}
	public WrappedSink createWrappedSink() {
		WrappedSinkImpl wrappedSink = new WrappedSinkImpl();
		return wrappedSink;
	}
	public WrappedActivity createWrappedActivity() {
		WrappedActivityImpl wrappedActivity = new WrappedActivityImpl();
		return wrappedActivity;
	}
	public WrappedStateMachine createWrappedStateMachine() {
		WrappedStateMachineImpl wrappedStateMachine = new WrappedStateMachineImpl();
		return wrappedStateMachine;
	}
	public WrappedTiming createWrappedTiming() {
		WrappedTimingImpl wrappedTiming = new WrappedTimingImpl();
		return wrappedTiming;
	}
	public WrappedTimer createWrappedTimer() {
		WrappedTimerImpl wrappedTimer = new WrappedTimerImpl();
		return wrappedTimer;
	}
	public WrappedPlatform createWrappedPlatform() {
		WrappedPlatformImpl wrappedPlatform = new WrappedPlatformImpl();
		return wrappedPlatform;
	}
	public WrappedResources createWrappedResources() {
		WrappedResourcesImpl wrappedResources = new WrappedResourcesImpl();
		return wrappedResources;
	}
	public WrappedParameters createWrappedParameters() {
		WrappedParametersImpl wrappedParameters = new WrappedParametersImpl();
		return wrappedParameters;
	}
	public WrappedHarvester createWrappedHarvester() {
		WrappedHarvesterImpl wrappedHarvester = new WrappedHarvesterImpl();
		return wrappedHarvester;
	}
	public WrappedBattery createWrappedBattery() {
		WrappedBatteryImpl wrappedBattery = new WrappedBatteryImpl();
		return wrappedBattery;
	}
	public WrappedAspect createWrappedAspect() {
		WrappedAspectImpl wrappedAspect = new WrappedAspectImpl();
		return wrappedAspect;
	}
	public WrappedPointcut createWrappedPointcut() {
		WrappedPointcutImpl wrappedPointcut = new WrappedPointcutImpl();
		return wrappedPointcut;
	}
	public WrappedAdvice createWrappedAdvice() {
		WrappedAdviceImpl wrappedAdvice = new WrappedAdviceImpl();
		return wrappedAdvice;
	}
	public WrappedActivityNode createWrappedActivityNode() {
		WrappedActivityNodeImpl wrappedActivityNode = new WrappedActivityNodeImpl();
		return wrappedActivityNode;
	}
	public WrappedInitialNode createWrappedInitialNode() {
		WrappedInitialNodeImpl wrappedInitialNode = new WrappedInitialNodeImpl();
		return wrappedInitialNode;
	}
	public WrappedFinalNode createWrappedFinalNode() {
		WrappedFinalNodeImpl wrappedFinalNode = new WrappedFinalNodeImpl();
		return wrappedFinalNode;
	}
	public WrappedDecisionNode createWrappedDecisionNode() {
		WrappedDecisionNodeImpl wrappedDecisionNode = new WrappedDecisionNodeImpl();
		return wrappedDecisionNode;
	}
	public WrappedMergeNode createWrappedMergeNode() {
		WrappedMergeNodeImpl wrappedMergeNode = new WrappedMergeNodeImpl();
		return wrappedMergeNode;
	}
	public WrappedActivityEdge createWrappedActivityEdge() {
		WrappedActivityEdgeImpl wrappedActivityEdge = new WrappedActivityEdgeImpl();
		return wrappedActivityEdge;
	}
	public WrappedOpaqueAction createWrappedOpaqueAction() {
		WrappedOpaqueActionImpl wrappedOpaqueAction = new WrappedOpaqueActionImpl();
		return wrappedOpaqueAction;
	}
	public WrappedSensingAction createWrappedSensingAction() {
		WrappedSensingActionImpl wrappedSensingAction = new WrappedSensingActionImpl();
		return wrappedSensingAction;
	}
	public WrappedActuatingAction createWrappedActuatingAction() {
		WrappedActuatingActionImpl wrappedActuatingAction = new WrappedActuatingActionImpl();
		return wrappedActuatingAction;
	}
	public WrappedTimingAction createWrappedTimingAction() {
		WrappedTimingActionImpl wrappedTimingAction = new WrappedTimingActionImpl();
		return wrappedTimingAction;
	}
	public WrappedVariable createWrappedVariable() {
		WrappedVariableImpl wrappedVariable = new WrappedVariableImpl();
		return wrappedVariable;
	}
	public WrappedDataLink createWrappedDataLink() {
		WrappedDataLinkImpl wrappedDataLink = new WrappedDataLinkImpl();
		return wrappedDataLink;
	}
	public WrappedUpdatePoolAction createWrappedUpdatePoolAction() {
		WrappedUpdatePoolActionImpl wrappedUpdatePoolAction = new WrappedUpdatePoolActionImpl();
		return wrappedUpdatePoolAction;
	}
	public WrappedGetNodeAction createWrappedGetNodeAction() {
		WrappedGetNodeActionImpl wrappedGetNodeAction = new WrappedGetNodeActionImpl();
		return wrappedGetNodeAction;
	}
	public WrappedRemoteTriggerAction createWrappedRemoteTriggerAction() {
		WrappedRemoteTriggerActionImpl wrappedRemoteTriggerAction = new WrappedRemoteTriggerActionImpl();
		return wrappedRemoteTriggerAction;
	}
	public WrappedGetDataAction createWrappedGetDataAction() {
		WrappedGetDataActionImpl wrappedGetDataAction = new WrappedGetDataActionImpl();
		return wrappedGetDataAction;
	}
	public WrappedActivationProfile createWrappedActivationProfile() {
		WrappedActivationProfileImpl wrappedActivationProfile = new WrappedActivationProfileImpl();
		return wrappedActivationProfile;
	}
	public WrappedRuntime createWrappedRuntime() {
		WrappedRuntimeImpl wrappedRuntime = new WrappedRuntimeImpl();
		return wrappedRuntime;
	}
	public WrappedPlatformSlot createWrappedPlatformSlot() {
		WrappedPlatformSlotImpl wrappedPlatformSlot = new WrappedPlatformSlotImpl();
		return wrappedPlatformSlot;
	}
	public WrappedPlatformElement createWrappedPlatformElement() {
		WrappedPlatformElementImpl wrappedPlatformElement = new WrappedPlatformElementImpl();
		return wrappedPlatformElement;
	}

	public WrappedMetamodelElementSub createWrappedMetamodelElementSub() {
		WrappedMetamodelElementSubImpl metamodelElementSub = new WrappedMetamodelElementSubImpl();
		return metamodelElementSub;
	}	

	public WrapperPackage getWrapperPackage() {
		return (WrapperPackage)getEPackage();
	}

	@Deprecated
	public static WrapperPackage getPackage() {
		return WrapperPackage.eINSTANCE;
	}

} //WrapperFactoryImpl



