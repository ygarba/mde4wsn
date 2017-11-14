// DO NOT MODIFY THIS FILE! This code is generated.

package com.gentleware.poseidon.model.wrapper.util;

import com.gentleware.poseidon.dsl.MetamodelElementWrapper;

import com.gentleware.poseidon.dsl.wsn.Objectives;
import com.gentleware.poseidon.dsl.wsn.Sensor;
import com.gentleware.poseidon.dsl.wsn.Actuator;
import com.gentleware.poseidon.dsl.wsn.Actuating;
import com.gentleware.poseidon.dsl.wsn.Task;
import com.gentleware.poseidon.dsl.wsn.Sensing;
import com.gentleware.poseidon.dsl.wsn.Node;
import com.gentleware.poseidon.dsl.wsn.Event;
import com.gentleware.poseidon.dsl.wsn.Network;
import com.gentleware.poseidon.dsl.wsn.Communication;
import com.gentleware.poseidon.dsl.wsn.Data;
import com.gentleware.poseidon.dsl.wsn.State;
import com.gentleware.poseidon.dsl.wsn.Transition;
import com.gentleware.poseidon.dsl.wsn.InitialState;
import com.gentleware.poseidon.dsl.wsn.FinalState;
import com.gentleware.poseidon.dsl.wsn.Cluster;
import com.gentleware.poseidon.dsl.wsn.ClusterHead;
import com.gentleware.poseidon.dsl.wsn.Sink;
import com.gentleware.poseidon.dsl.wsn.Activity;
import com.gentleware.poseidon.dsl.wsn.StateMachine;
import com.gentleware.poseidon.dsl.wsn.Timing;
import com.gentleware.poseidon.dsl.wsn.Timer;
import com.gentleware.poseidon.dsl.wsn.Platform;
import com.gentleware.poseidon.dsl.wsn.Resources;
import com.gentleware.poseidon.dsl.wsn.Parameters;
import com.gentleware.poseidon.dsl.wsn.Harvester;
import com.gentleware.poseidon.dsl.wsn.Battery;
import com.gentleware.poseidon.dsl.wsn.Aspect;
import com.gentleware.poseidon.dsl.wsn.Pointcut;
import com.gentleware.poseidon.dsl.wsn.Advice;
import com.gentleware.poseidon.dsl.wsn.ActivityNode;
import com.gentleware.poseidon.dsl.wsn.InitialNode;
import com.gentleware.poseidon.dsl.wsn.FinalNode;
import com.gentleware.poseidon.dsl.wsn.DecisionNode;
import com.gentleware.poseidon.dsl.wsn.MergeNode;
import com.gentleware.poseidon.dsl.wsn.ActivityEdge;
import com.gentleware.poseidon.dsl.wsn.OpaqueAction;
import com.gentleware.poseidon.dsl.wsn.SensingAction;
import com.gentleware.poseidon.dsl.wsn.ActuatingAction;
import com.gentleware.poseidon.dsl.wsn.TimingAction;
import com.gentleware.poseidon.dsl.wsn.Variable;
import com.gentleware.poseidon.dsl.wsn.DataLink;
import com.gentleware.poseidon.dsl.wsn.UpdatePoolAction;
import com.gentleware.poseidon.dsl.wsn.GetNodeAction;
import com.gentleware.poseidon.dsl.wsn.RemoteTriggerAction;
import com.gentleware.poseidon.dsl.wsn.GetDataAction;
import com.gentleware.poseidon.dsl.wsn.ActivationProfile;
import com.gentleware.poseidon.dsl.wsn.Runtime;
import com.gentleware.poseidon.dsl.wsn.PlatformSlot;
import com.gentleware.poseidon.dsl.wsn.PlatformElement;

import com.gentleware.poseidon.model.wrapper.*;

import com.gentleware.poseidon.model.wrapper.impl.WrapperPackageImpl;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

public class WrapperSwitch<T> {

	protected static WrapperPackage modelPackage;

	public WrapperSwitch() {
		if (modelPackage == null) {
			modelPackage = WrapperPackage.eINSTANCE;
		}
	}

	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		
		
			case WrapperPackage.WRAPPED_OBJECTIVES: {
				WrappedObjectives wrappedObjectives = (WrappedObjectives)theEObject;
				T result = caseWrappedObjectives(wrappedObjectives);
				if (result == null) result = caseObjectives(wrappedObjectives);
				if (result == null) result = caseMetamodelElementWrapper(wrappedObjectives);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WrapperPackage.WRAPPED_SENSOR: {
				WrappedSensor wrappedSensor = (WrappedSensor)theEObject;
				T result = caseWrappedSensor(wrappedSensor);
				if (result == null) result = caseSensor(wrappedSensor);
				if (result == null) result = caseMetamodelElementWrapper(wrappedSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WrapperPackage.WRAPPED_ACTUATOR: {
				WrappedActuator wrappedActuator = (WrappedActuator)theEObject;
				T result = caseWrappedActuator(wrappedActuator);
				if (result == null) result = caseActuator(wrappedActuator);
				if (result == null) result = caseMetamodelElementWrapper(wrappedActuator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WrapperPackage.WRAPPED_ACTUATING: {
				WrappedActuating wrappedActuating = (WrappedActuating)theEObject;
				T result = caseWrappedActuating(wrappedActuating);
				if (result == null) result = caseActuating(wrappedActuating);
				if (result == null) result = caseMetamodelElementWrapper(wrappedActuating);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WrapperPackage.WRAPPED_TASK: {
				WrappedTask wrappedTask = (WrappedTask)theEObject;
				T result = caseWrappedTask(wrappedTask);
				if (result == null) result = caseTask(wrappedTask);
				if (result == null) result = caseMetamodelElementWrapper(wrappedTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WrapperPackage.WRAPPED_SENSING: {
				WrappedSensing wrappedSensing = (WrappedSensing)theEObject;
				T result = caseWrappedSensing(wrappedSensing);
				if (result == null) result = caseSensing(wrappedSensing);
				if (result == null) result = caseMetamodelElementWrapper(wrappedSensing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WrapperPackage.WRAPPED_NODE: {
				WrappedNode wrappedNode = (WrappedNode)theEObject;
				T result = caseWrappedNode(wrappedNode);
				if (result == null) result = caseNode(wrappedNode);
				if (result == null) result = caseMetamodelElementWrapper(wrappedNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WrapperPackage.WRAPPED_EVENT: {
				WrappedEvent wrappedEvent = (WrappedEvent)theEObject;
				T result = caseWrappedEvent(wrappedEvent);
				if (result == null) result = caseEvent(wrappedEvent);
				if (result == null) result = caseMetamodelElementWrapper(wrappedEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WrapperPackage.WRAPPED_NETWORK: {
				WrappedNetwork wrappedNetwork = (WrappedNetwork)theEObject;
				T result = caseWrappedNetwork(wrappedNetwork);
				if (result == null) result = caseNetwork(wrappedNetwork);
				if (result == null) result = caseMetamodelElementWrapper(wrappedNetwork);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WrapperPackage.WRAPPED_COMMUNICATION: {
				WrappedCommunication wrappedCommunication = (WrappedCommunication)theEObject;
				T result = caseWrappedCommunication(wrappedCommunication);
				if (result == null) result = caseCommunication(wrappedCommunication);
				if (result == null) result = caseMetamodelElementWrapper(wrappedCommunication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WrapperPackage.WRAPPED_DATA: {
				WrappedData wrappedData = (WrappedData)theEObject;
				T result = caseWrappedData(wrappedData);
				if (result == null) result = caseData(wrappedData);
				if (result == null) result = caseMetamodelElementWrapper(wrappedData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WrapperPackage.WRAPPED_STATE: {
				WrappedState wrappedState = (WrappedState)theEObject;
				T result = caseWrappedState(wrappedState);
				if (result == null) result = caseState(wrappedState);
				if (result == null) result = caseMetamodelElementWrapper(wrappedState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WrapperPackage.WRAPPED_TRANSITION: {
				WrappedTransition wrappedTransition = (WrappedTransition)theEObject;
				T result = caseWrappedTransition(wrappedTransition);
				if (result == null) result = caseTransition(wrappedTransition);
				if (result == null) result = caseMetamodelElementWrapper(wrappedTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WrapperPackage.WRAPPED_INITIALSTATE: {
				WrappedInitialState wrappedInitialState = (WrappedInitialState)theEObject;
				T result = caseWrappedInitialState(wrappedInitialState);
				if (result == null) result = caseInitialState(wrappedInitialState);
				if (result == null) result = caseMetamodelElementWrapper(wrappedInitialState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WrapperPackage.WRAPPED_FINALSTATE: {
				WrappedFinalState wrappedFinalState = (WrappedFinalState)theEObject;
				T result = caseWrappedFinalState(wrappedFinalState);
				if (result == null) result = caseFinalState(wrappedFinalState);
				if (result == null) result = caseMetamodelElementWrapper(wrappedFinalState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WrapperPackage.WRAPPED_CLUSTER: {
				WrappedCluster wrappedCluster = (WrappedCluster)theEObject;
				T result = caseWrappedCluster(wrappedCluster);
				if (result == null) result = caseCluster(wrappedCluster);
				if (result == null) result = caseMetamodelElementWrapper(wrappedCluster);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WrapperPackage.WRAPPED_CLUSTERHEAD: {
				WrappedClusterHead wrappedClusterHead = (WrappedClusterHead)theEObject;
				T result = caseWrappedClusterHead(wrappedClusterHead);
				if (result == null) result = caseClusterHead(wrappedClusterHead);
				if (result == null) result = caseMetamodelElementWrapper(wrappedClusterHead);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WrapperPackage.WRAPPED_SINK: {
				WrappedSink wrappedSink = (WrappedSink)theEObject;
				T result = caseWrappedSink(wrappedSink);
				if (result == null) result = caseSink(wrappedSink);
				if (result == null) result = caseMetamodelElementWrapper(wrappedSink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WrapperPackage.WRAPPED_ACTIVITY: {
				WrappedActivity wrappedActivity = (WrappedActivity)theEObject;
				T result = caseWrappedActivity(wrappedActivity);
				if (result == null) result = caseActivity(wrappedActivity);
				if (result == null) result = caseMetamodelElementWrapper(wrappedActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WrapperPackage.WRAPPED_STATEMACHINE: {
				WrappedStateMachine wrappedStateMachine = (WrappedStateMachine)theEObject;
				T result = caseWrappedStateMachine(wrappedStateMachine);
				if (result == null) result = caseStateMachine(wrappedStateMachine);
				if (result == null) result = caseMetamodelElementWrapper(wrappedStateMachine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WrapperPackage.WRAPPED_TIMING: {
				WrappedTiming wrappedTiming = (WrappedTiming)theEObject;
				T result = caseWrappedTiming(wrappedTiming);
				if (result == null) result = caseTiming(wrappedTiming);
				if (result == null) result = caseMetamodelElementWrapper(wrappedTiming);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WrapperPackage.WRAPPED_TIMER: {
				WrappedTimer wrappedTimer = (WrappedTimer)theEObject;
				T result = caseWrappedTimer(wrappedTimer);
				if (result == null) result = caseTimer(wrappedTimer);
				if (result == null) result = caseMetamodelElementWrapper(wrappedTimer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WrapperPackage.WRAPPED_PLATFORM: {
				WrappedPlatform wrappedPlatform = (WrappedPlatform)theEObject;
				T result = caseWrappedPlatform(wrappedPlatform);
				if (result == null) result = casePlatform(wrappedPlatform);
				if (result == null) result = caseMetamodelElementWrapper(wrappedPlatform);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WrapperPackage.WRAPPED_RESOURCES: {
				WrappedResources wrappedResources = (WrappedResources)theEObject;
				T result = caseWrappedResources(wrappedResources);
				if (result == null) result = caseResources(wrappedResources);
				if (result == null) result = caseMetamodelElementWrapper(wrappedResources);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WrapperPackage.WRAPPED_PARAMETERS: {
				WrappedParameters wrappedParameters = (WrappedParameters)theEObject;
				T result = caseWrappedParameters(wrappedParameters);
				if (result == null) result = caseParameters(wrappedParameters);
				if (result == null) result = caseMetamodelElementWrapper(wrappedParameters);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WrapperPackage.WRAPPED_HARVESTER: {
				WrappedHarvester wrappedHarvester = (WrappedHarvester)theEObject;
				T result = caseWrappedHarvester(wrappedHarvester);
				if (result == null) result = caseHarvester(wrappedHarvester);
				if (result == null) result = caseMetamodelElementWrapper(wrappedHarvester);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WrapperPackage.WRAPPED_BATTERY: {
				WrappedBattery wrappedBattery = (WrappedBattery)theEObject;
				T result = caseWrappedBattery(wrappedBattery);
				if (result == null) result = caseBattery(wrappedBattery);
				if (result == null) result = caseMetamodelElementWrapper(wrappedBattery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WrapperPackage.WRAPPED_ASPECT: {
				WrappedAspect wrappedAspect = (WrappedAspect)theEObject;
				T result = caseWrappedAspect(wrappedAspect);
				if (result == null) result = caseAspect(wrappedAspect);
				if (result == null) result = caseMetamodelElementWrapper(wrappedAspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WrapperPackage.WRAPPED_POINTCUT: {
				WrappedPointcut wrappedPointcut = (WrappedPointcut)theEObject;
				T result = caseWrappedPointcut(wrappedPointcut);
				if (result == null) result = casePointcut(wrappedPointcut);
				if (result == null) result = caseMetamodelElementWrapper(wrappedPointcut);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WrapperPackage.WRAPPED_ADVICE: {
				WrappedAdvice wrappedAdvice = (WrappedAdvice)theEObject;
				T result = caseWrappedAdvice(wrappedAdvice);
				if (result == null) result = caseAdvice(wrappedAdvice);
				if (result == null) result = caseMetamodelElementWrapper(wrappedAdvice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WrapperPackage.WRAPPED_ACTIVITYNODE: {
				WrappedActivityNode wrappedActivityNode = (WrappedActivityNode)theEObject;
				T result = caseWrappedActivityNode(wrappedActivityNode);
				if (result == null) result = caseActivityNode(wrappedActivityNode);
				if (result == null) result = caseMetamodelElementWrapper(wrappedActivityNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WrapperPackage.WRAPPED_INITIALNODE: {
				WrappedInitialNode wrappedInitialNode = (WrappedInitialNode)theEObject;
				T result = caseWrappedInitialNode(wrappedInitialNode);
				if (result == null) result = caseInitialNode(wrappedInitialNode);
				if (result == null) result = caseMetamodelElementWrapper(wrappedInitialNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WrapperPackage.WRAPPED_FINALNODE: {
				WrappedFinalNode wrappedFinalNode = (WrappedFinalNode)theEObject;
				T result = caseWrappedFinalNode(wrappedFinalNode);
				if (result == null) result = caseFinalNode(wrappedFinalNode);
				if (result == null) result = caseMetamodelElementWrapper(wrappedFinalNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WrapperPackage.WRAPPED_DECISIONNODE: {
				WrappedDecisionNode wrappedDecisionNode = (WrappedDecisionNode)theEObject;
				T result = caseWrappedDecisionNode(wrappedDecisionNode);
				if (result == null) result = caseDecisionNode(wrappedDecisionNode);
				if (result == null) result = caseMetamodelElementWrapper(wrappedDecisionNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WrapperPackage.WRAPPED_MERGENODE: {
				WrappedMergeNode wrappedMergeNode = (WrappedMergeNode)theEObject;
				T result = caseWrappedMergeNode(wrappedMergeNode);
				if (result == null) result = caseMergeNode(wrappedMergeNode);
				if (result == null) result = caseMetamodelElementWrapper(wrappedMergeNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WrapperPackage.WRAPPED_ACTIVITYEDGE: {
				WrappedActivityEdge wrappedActivityEdge = (WrappedActivityEdge)theEObject;
				T result = caseWrappedActivityEdge(wrappedActivityEdge);
				if (result == null) result = caseActivityEdge(wrappedActivityEdge);
				if (result == null) result = caseMetamodelElementWrapper(wrappedActivityEdge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WrapperPackage.WRAPPED_OPAQUEACTION: {
				WrappedOpaqueAction wrappedOpaqueAction = (WrappedOpaqueAction)theEObject;
				T result = caseWrappedOpaqueAction(wrappedOpaqueAction);
				if (result == null) result = caseOpaqueAction(wrappedOpaqueAction);
				if (result == null) result = caseMetamodelElementWrapper(wrappedOpaqueAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WrapperPackage.WRAPPED_SENSINGACTION: {
				WrappedSensingAction wrappedSensingAction = (WrappedSensingAction)theEObject;
				T result = caseWrappedSensingAction(wrappedSensingAction);
				if (result == null) result = caseSensingAction(wrappedSensingAction);
				if (result == null) result = caseMetamodelElementWrapper(wrappedSensingAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WrapperPackage.WRAPPED_ACTUATINGACTION: {
				WrappedActuatingAction wrappedActuatingAction = (WrappedActuatingAction)theEObject;
				T result = caseWrappedActuatingAction(wrappedActuatingAction);
				if (result == null) result = caseActuatingAction(wrappedActuatingAction);
				if (result == null) result = caseMetamodelElementWrapper(wrappedActuatingAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WrapperPackage.WRAPPED_TIMINGACTION: {
				WrappedTimingAction wrappedTimingAction = (WrappedTimingAction)theEObject;
				T result = caseWrappedTimingAction(wrappedTimingAction);
				if (result == null) result = caseTimingAction(wrappedTimingAction);
				if (result == null) result = caseMetamodelElementWrapper(wrappedTimingAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WrapperPackage.WRAPPED_VARIABLE: {
				WrappedVariable wrappedVariable = (WrappedVariable)theEObject;
				T result = caseWrappedVariable(wrappedVariable);
				if (result == null) result = caseVariable(wrappedVariable);
				if (result == null) result = caseMetamodelElementWrapper(wrappedVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WrapperPackage.WRAPPED_DATALINK: {
				WrappedDataLink wrappedDataLink = (WrappedDataLink)theEObject;
				T result = caseWrappedDataLink(wrappedDataLink);
				if (result == null) result = caseDataLink(wrappedDataLink);
				if (result == null) result = caseMetamodelElementWrapper(wrappedDataLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WrapperPackage.WRAPPED_UPDATEPOOLACTION: {
				WrappedUpdatePoolAction wrappedUpdatePoolAction = (WrappedUpdatePoolAction)theEObject;
				T result = caseWrappedUpdatePoolAction(wrappedUpdatePoolAction);
				if (result == null) result = caseUpdatePoolAction(wrappedUpdatePoolAction);
				if (result == null) result = caseMetamodelElementWrapper(wrappedUpdatePoolAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WrapperPackage.WRAPPED_GETNODEACTION: {
				WrappedGetNodeAction wrappedGetNodeAction = (WrappedGetNodeAction)theEObject;
				T result = caseWrappedGetNodeAction(wrappedGetNodeAction);
				if (result == null) result = caseGetNodeAction(wrappedGetNodeAction);
				if (result == null) result = caseMetamodelElementWrapper(wrappedGetNodeAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WrapperPackage.WRAPPED_REMOTETRIGGERACTION: {
				WrappedRemoteTriggerAction wrappedRemoteTriggerAction = (WrappedRemoteTriggerAction)theEObject;
				T result = caseWrappedRemoteTriggerAction(wrappedRemoteTriggerAction);
				if (result == null) result = caseRemoteTriggerAction(wrappedRemoteTriggerAction);
				if (result == null) result = caseMetamodelElementWrapper(wrappedRemoteTriggerAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WrapperPackage.WRAPPED_GETDATAACTION: {
				WrappedGetDataAction wrappedGetDataAction = (WrappedGetDataAction)theEObject;
				T result = caseWrappedGetDataAction(wrappedGetDataAction);
				if (result == null) result = caseGetDataAction(wrappedGetDataAction);
				if (result == null) result = caseMetamodelElementWrapper(wrappedGetDataAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WrapperPackage.WRAPPED_ACTIVATIONPROFILE: {
				WrappedActivationProfile wrappedActivationProfile = (WrappedActivationProfile)theEObject;
				T result = caseWrappedActivationProfile(wrappedActivationProfile);
				if (result == null) result = caseActivationProfile(wrappedActivationProfile);
				if (result == null) result = caseMetamodelElementWrapper(wrappedActivationProfile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WrapperPackage.WRAPPED_RUNTIME: {
				WrappedRuntime wrappedRuntime = (WrappedRuntime)theEObject;
				T result = caseWrappedRuntime(wrappedRuntime);
				if (result == null) result = caseRuntime(wrappedRuntime);
				if (result == null) result = caseMetamodelElementWrapper(wrappedRuntime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WrapperPackage.WRAPPED_PLATFORMSLOT: {
				WrappedPlatformSlot wrappedPlatformSlot = (WrappedPlatformSlot)theEObject;
				T result = caseWrappedPlatformSlot(wrappedPlatformSlot);
				if (result == null) result = casePlatformSlot(wrappedPlatformSlot);
				if (result == null) result = caseMetamodelElementWrapper(wrappedPlatformSlot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WrapperPackage.WRAPPED_PLATFORMELEMENT: {
				WrappedPlatformElement wrappedPlatformElement = (WrappedPlatformElement)theEObject;
				T result = caseWrappedPlatformElement(wrappedPlatformElement);
				if (result == null) result = casePlatformElement(wrappedPlatformElement);
				if (result == null) result = caseMetamodelElementWrapper(wrappedPlatformElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}


	public T caseWrappedObjectives(WrappedObjectives object) {
		return null;
	}
	
	public T caseObjectives(Objectives object) {
		return null;
	}	

	public T caseWrappedSensor(WrappedSensor object) {
		return null;
	}
	
	public T caseSensor(Sensor object) {
		return null;
	}	

	public T caseWrappedActuator(WrappedActuator object) {
		return null;
	}
	
	public T caseActuator(Actuator object) {
		return null;
	}	

	public T caseWrappedActuating(WrappedActuating object) {
		return null;
	}
	
	public T caseActuating(Actuating object) {
		return null;
	}	

	public T caseWrappedTask(WrappedTask object) {
		return null;
	}
	
	public T caseTask(Task object) {
		return null;
	}	

	public T caseWrappedSensing(WrappedSensing object) {
		return null;
	}
	
	public T caseSensing(Sensing object) {
		return null;
	}	

	public T caseWrappedNode(WrappedNode object) {
		return null;
	}
	
	public T caseNode(Node object) {
		return null;
	}	

	public T caseWrappedEvent(WrappedEvent object) {
		return null;
	}
	
	public T caseEvent(Event object) {
		return null;
	}	

	public T caseWrappedNetwork(WrappedNetwork object) {
		return null;
	}
	
	public T caseNetwork(Network object) {
		return null;
	}	

	public T caseWrappedCommunication(WrappedCommunication object) {
		return null;
	}
	
	public T caseCommunication(Communication object) {
		return null;
	}	

	public T caseWrappedData(WrappedData object) {
		return null;
	}
	
	public T caseData(Data object) {
		return null;
	}	

	public T caseWrappedState(WrappedState object) {
		return null;
	}
	
	public T caseState(State object) {
		return null;
	}	

	public T caseWrappedTransition(WrappedTransition object) {
		return null;
	}
	
	public T caseTransition(Transition object) {
		return null;
	}	

	public T caseWrappedInitialState(WrappedInitialState object) {
		return null;
	}
	
	public T caseInitialState(InitialState object) {
		return null;
	}	

	public T caseWrappedFinalState(WrappedFinalState object) {
		return null;
	}
	
	public T caseFinalState(FinalState object) {
		return null;
	}	

	public T caseWrappedCluster(WrappedCluster object) {
		return null;
	}
	
	public T caseCluster(Cluster object) {
		return null;
	}	

	public T caseWrappedClusterHead(WrappedClusterHead object) {
		return null;
	}
	
	public T caseClusterHead(ClusterHead object) {
		return null;
	}	

	public T caseWrappedSink(WrappedSink object) {
		return null;
	}
	
	public T caseSink(Sink object) {
		return null;
	}	

	public T caseWrappedActivity(WrappedActivity object) {
		return null;
	}
	
	public T caseActivity(Activity object) {
		return null;
	}	

	public T caseWrappedStateMachine(WrappedStateMachine object) {
		return null;
	}
	
	public T caseStateMachine(StateMachine object) {
		return null;
	}	

	public T caseWrappedTiming(WrappedTiming object) {
		return null;
	}
	
	public T caseTiming(Timing object) {
		return null;
	}	

	public T caseWrappedTimer(WrappedTimer object) {
		return null;
	}
	
	public T caseTimer(Timer object) {
		return null;
	}	

	public T caseWrappedPlatform(WrappedPlatform object) {
		return null;
	}
	
	public T casePlatform(Platform object) {
		return null;
	}	

	public T caseWrappedResources(WrappedResources object) {
		return null;
	}
	
	public T caseResources(Resources object) {
		return null;
	}	

	public T caseWrappedParameters(WrappedParameters object) {
		return null;
	}
	
	public T caseParameters(Parameters object) {
		return null;
	}	

	public T caseWrappedHarvester(WrappedHarvester object) {
		return null;
	}
	
	public T caseHarvester(Harvester object) {
		return null;
	}	

	public T caseWrappedBattery(WrappedBattery object) {
		return null;
	}
	
	public T caseBattery(Battery object) {
		return null;
	}	

	public T caseWrappedAspect(WrappedAspect object) {
		return null;
	}
	
	public T caseAspect(Aspect object) {
		return null;
	}	

	public T caseWrappedPointcut(WrappedPointcut object) {
		return null;
	}
	
	public T casePointcut(Pointcut object) {
		return null;
	}	

	public T caseWrappedAdvice(WrappedAdvice object) {
		return null;
	}
	
	public T caseAdvice(Advice object) {
		return null;
	}	

	public T caseWrappedActivityNode(WrappedActivityNode object) {
		return null;
	}
	
	public T caseActivityNode(ActivityNode object) {
		return null;
	}	

	public T caseWrappedInitialNode(WrappedInitialNode object) {
		return null;
	}
	
	public T caseInitialNode(InitialNode object) {
		return null;
	}	

	public T caseWrappedFinalNode(WrappedFinalNode object) {
		return null;
	}
	
	public T caseFinalNode(FinalNode object) {
		return null;
	}	

	public T caseWrappedDecisionNode(WrappedDecisionNode object) {
		return null;
	}
	
	public T caseDecisionNode(DecisionNode object) {
		return null;
	}	

	public T caseWrappedMergeNode(WrappedMergeNode object) {
		return null;
	}
	
	public T caseMergeNode(MergeNode object) {
		return null;
	}	

	public T caseWrappedActivityEdge(WrappedActivityEdge object) {
		return null;
	}
	
	public T caseActivityEdge(ActivityEdge object) {
		return null;
	}	

	public T caseWrappedOpaqueAction(WrappedOpaqueAction object) {
		return null;
	}
	
	public T caseOpaqueAction(OpaqueAction object) {
		return null;
	}	

	public T caseWrappedSensingAction(WrappedSensingAction object) {
		return null;
	}
	
	public T caseSensingAction(SensingAction object) {
		return null;
	}	

	public T caseWrappedActuatingAction(WrappedActuatingAction object) {
		return null;
	}
	
	public T caseActuatingAction(ActuatingAction object) {
		return null;
	}	

	public T caseWrappedTimingAction(WrappedTimingAction object) {
		return null;
	}
	
	public T caseTimingAction(TimingAction object) {
		return null;
	}	

	public T caseWrappedVariable(WrappedVariable object) {
		return null;
	}
	
	public T caseVariable(Variable object) {
		return null;
	}	

	public T caseWrappedDataLink(WrappedDataLink object) {
		return null;
	}
	
	public T caseDataLink(DataLink object) {
		return null;
	}	

	public T caseWrappedUpdatePoolAction(WrappedUpdatePoolAction object) {
		return null;
	}
	
	public T caseUpdatePoolAction(UpdatePoolAction object) {
		return null;
	}	

	public T caseWrappedGetNodeAction(WrappedGetNodeAction object) {
		return null;
	}
	
	public T caseGetNodeAction(GetNodeAction object) {
		return null;
	}	

	public T caseWrappedRemoteTriggerAction(WrappedRemoteTriggerAction object) {
		return null;
	}
	
	public T caseRemoteTriggerAction(RemoteTriggerAction object) {
		return null;
	}	

	public T caseWrappedGetDataAction(WrappedGetDataAction object) {
		return null;
	}
	
	public T caseGetDataAction(GetDataAction object) {
		return null;
	}	

	public T caseWrappedActivationProfile(WrappedActivationProfile object) {
		return null;
	}
	
	public T caseActivationProfile(ActivationProfile object) {
		return null;
	}	

	public T caseWrappedRuntime(WrappedRuntime object) {
		return null;
	}
	
	public T caseRuntime(Runtime object) {
		return null;
	}	

	public T caseWrappedPlatformSlot(WrappedPlatformSlot object) {
		return null;
	}
	
	public T casePlatformSlot(PlatformSlot object) {
		return null;
	}	

	public T caseWrappedPlatformElement(WrappedPlatformElement object) {
		return null;
	}
	
	public T casePlatformElement(PlatformElement object) {
		return null;
	}	

	public T caseMetamodelElementWrapper(MetamodelElementWrapper object) {
		return null;
	}

	public T defaultCase(EObject object) {
		return null;
	}

} //WrapperSwitch

