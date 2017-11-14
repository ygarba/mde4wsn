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
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

public class WrapperAdapterFactory extends AdapterFactoryImpl {

	protected static WrapperPackage modelPackage;

	public WrapperAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = WrapperPackage.eINSTANCE;
		}
	}

	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	protected WrapperSwitch<Adapter> modelSwitch =
		new WrapperSwitch<Adapter>() {
			@Override
			public Adapter caseWrappedObjectives(WrappedObjectives object) {
				return createWrappedObjectivesAdapter();
			}
			
			@Override
			public Adapter caseObjectives(Objectives object) {
				return createObjectivesAdapter();
			}
			@Override
			public Adapter caseWrappedSensor(WrappedSensor object) {
				return createWrappedSensorAdapter();
			}
			
			@Override
			public Adapter caseSensor(Sensor object) {
				return createSensorAdapter();
			}
			@Override
			public Adapter caseWrappedActuator(WrappedActuator object) {
				return createWrappedActuatorAdapter();
			}
			
			@Override
			public Adapter caseActuator(Actuator object) {
				return createActuatorAdapter();
			}
			@Override
			public Adapter caseWrappedActuating(WrappedActuating object) {
				return createWrappedActuatingAdapter();
			}
			
			@Override
			public Adapter caseActuating(Actuating object) {
				return createActuatingAdapter();
			}
			@Override
			public Adapter caseWrappedTask(WrappedTask object) {
				return createWrappedTaskAdapter();
			}
			
			@Override
			public Adapter caseTask(Task object) {
				return createTaskAdapter();
			}
			@Override
			public Adapter caseWrappedSensing(WrappedSensing object) {
				return createWrappedSensingAdapter();
			}
			
			@Override
			public Adapter caseSensing(Sensing object) {
				return createSensingAdapter();
			}
			@Override
			public Adapter caseWrappedNode(WrappedNode object) {
				return createWrappedNodeAdapter();
			}
			
			@Override
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
			}
			@Override
			public Adapter caseWrappedEvent(WrappedEvent object) {
				return createWrappedEventAdapter();
			}
			
			@Override
			public Adapter caseEvent(Event object) {
				return createEventAdapter();
			}
			@Override
			public Adapter caseWrappedNetwork(WrappedNetwork object) {
				return createWrappedNetworkAdapter();
			}
			
			@Override
			public Adapter caseNetwork(Network object) {
				return createNetworkAdapter();
			}
			@Override
			public Adapter caseWrappedCommunication(WrappedCommunication object) {
				return createWrappedCommunicationAdapter();
			}
			
			@Override
			public Adapter caseCommunication(Communication object) {
				return createCommunicationAdapter();
			}
			@Override
			public Adapter caseWrappedData(WrappedData object) {
				return createWrappedDataAdapter();
			}
			
			@Override
			public Adapter caseData(Data object) {
				return createDataAdapter();
			}
			@Override
			public Adapter caseWrappedState(WrappedState object) {
				return createWrappedStateAdapter();
			}
			
			@Override
			public Adapter caseState(State object) {
				return createStateAdapter();
			}
			@Override
			public Adapter caseWrappedTransition(WrappedTransition object) {
				return createWrappedTransitionAdapter();
			}
			
			@Override
			public Adapter caseTransition(Transition object) {
				return createTransitionAdapter();
			}
			@Override
			public Adapter caseWrappedInitialState(WrappedInitialState object) {
				return createWrappedInitialStateAdapter();
			}
			
			@Override
			public Adapter caseInitialState(InitialState object) {
				return createInitialStateAdapter();
			}
			@Override
			public Adapter caseWrappedFinalState(WrappedFinalState object) {
				return createWrappedFinalStateAdapter();
			}
			
			@Override
			public Adapter caseFinalState(FinalState object) {
				return createFinalStateAdapter();
			}
			@Override
			public Adapter caseWrappedCluster(WrappedCluster object) {
				return createWrappedClusterAdapter();
			}
			
			@Override
			public Adapter caseCluster(Cluster object) {
				return createClusterAdapter();
			}
			@Override
			public Adapter caseWrappedClusterHead(WrappedClusterHead object) {
				return createWrappedClusterHeadAdapter();
			}
			
			@Override
			public Adapter caseClusterHead(ClusterHead object) {
				return createClusterHeadAdapter();
			}
			@Override
			public Adapter caseWrappedSink(WrappedSink object) {
				return createWrappedSinkAdapter();
			}
			
			@Override
			public Adapter caseSink(Sink object) {
				return createSinkAdapter();
			}
			@Override
			public Adapter caseWrappedActivity(WrappedActivity object) {
				return createWrappedActivityAdapter();
			}
			
			@Override
			public Adapter caseActivity(Activity object) {
				return createActivityAdapter();
			}
			@Override
			public Adapter caseWrappedStateMachine(WrappedStateMachine object) {
				return createWrappedStateMachineAdapter();
			}
			
			@Override
			public Adapter caseStateMachine(StateMachine object) {
				return createStateMachineAdapter();
			}
			@Override
			public Adapter caseWrappedTiming(WrappedTiming object) {
				return createWrappedTimingAdapter();
			}
			
			@Override
			public Adapter caseTiming(Timing object) {
				return createTimingAdapter();
			}
			@Override
			public Adapter caseWrappedTimer(WrappedTimer object) {
				return createWrappedTimerAdapter();
			}
			
			@Override
			public Adapter caseTimer(Timer object) {
				return createTimerAdapter();
			}
			@Override
			public Adapter caseWrappedPlatform(WrappedPlatform object) {
				return createWrappedPlatformAdapter();
			}
			
			@Override
			public Adapter casePlatform(Platform object) {
				return createPlatformAdapter();
			}
			@Override
			public Adapter caseWrappedResources(WrappedResources object) {
				return createWrappedResourcesAdapter();
			}
			
			@Override
			public Adapter caseResources(Resources object) {
				return createResourcesAdapter();
			}
			@Override
			public Adapter caseWrappedParameters(WrappedParameters object) {
				return createWrappedParametersAdapter();
			}
			
			@Override
			public Adapter caseParameters(Parameters object) {
				return createParametersAdapter();
			}
			@Override
			public Adapter caseWrappedHarvester(WrappedHarvester object) {
				return createWrappedHarvesterAdapter();
			}
			
			@Override
			public Adapter caseHarvester(Harvester object) {
				return createHarvesterAdapter();
			}
			@Override
			public Adapter caseWrappedBattery(WrappedBattery object) {
				return createWrappedBatteryAdapter();
			}
			
			@Override
			public Adapter caseBattery(Battery object) {
				return createBatteryAdapter();
			}
			@Override
			public Adapter caseWrappedAspect(WrappedAspect object) {
				return createWrappedAspectAdapter();
			}
			
			@Override
			public Adapter caseAspect(Aspect object) {
				return createAspectAdapter();
			}
			@Override
			public Adapter caseWrappedPointcut(WrappedPointcut object) {
				return createWrappedPointcutAdapter();
			}
			
			@Override
			public Adapter casePointcut(Pointcut object) {
				return createPointcutAdapter();
			}
			@Override
			public Adapter caseWrappedAdvice(WrappedAdvice object) {
				return createWrappedAdviceAdapter();
			}
			
			@Override
			public Adapter caseAdvice(Advice object) {
				return createAdviceAdapter();
			}
			@Override
			public Adapter caseWrappedActivityNode(WrappedActivityNode object) {
				return createWrappedActivityNodeAdapter();
			}
			
			@Override
			public Adapter caseActivityNode(ActivityNode object) {
				return createActivityNodeAdapter();
			}
			@Override
			public Adapter caseWrappedInitialNode(WrappedInitialNode object) {
				return createWrappedInitialNodeAdapter();
			}
			
			@Override
			public Adapter caseInitialNode(InitialNode object) {
				return createInitialNodeAdapter();
			}
			@Override
			public Adapter caseWrappedFinalNode(WrappedFinalNode object) {
				return createWrappedFinalNodeAdapter();
			}
			
			@Override
			public Adapter caseFinalNode(FinalNode object) {
				return createFinalNodeAdapter();
			}
			@Override
			public Adapter caseWrappedDecisionNode(WrappedDecisionNode object) {
				return createWrappedDecisionNodeAdapter();
			}
			
			@Override
			public Adapter caseDecisionNode(DecisionNode object) {
				return createDecisionNodeAdapter();
			}
			@Override
			public Adapter caseWrappedMergeNode(WrappedMergeNode object) {
				return createWrappedMergeNodeAdapter();
			}
			
			@Override
			public Adapter caseMergeNode(MergeNode object) {
				return createMergeNodeAdapter();
			}
			@Override
			public Adapter caseWrappedActivityEdge(WrappedActivityEdge object) {
				return createWrappedActivityEdgeAdapter();
			}
			
			@Override
			public Adapter caseActivityEdge(ActivityEdge object) {
				return createActivityEdgeAdapter();
			}
			@Override
			public Adapter caseWrappedOpaqueAction(WrappedOpaqueAction object) {
				return createWrappedOpaqueActionAdapter();
			}
			
			@Override
			public Adapter caseOpaqueAction(OpaqueAction object) {
				return createOpaqueActionAdapter();
			}
			@Override
			public Adapter caseWrappedSensingAction(WrappedSensingAction object) {
				return createWrappedSensingActionAdapter();
			}
			
			@Override
			public Adapter caseSensingAction(SensingAction object) {
				return createSensingActionAdapter();
			}
			@Override
			public Adapter caseWrappedActuatingAction(WrappedActuatingAction object) {
				return createWrappedActuatingActionAdapter();
			}
			
			@Override
			public Adapter caseActuatingAction(ActuatingAction object) {
				return createActuatingActionAdapter();
			}
			@Override
			public Adapter caseWrappedTimingAction(WrappedTimingAction object) {
				return createWrappedTimingActionAdapter();
			}
			
			@Override
			public Adapter caseTimingAction(TimingAction object) {
				return createTimingActionAdapter();
			}
			@Override
			public Adapter caseWrappedVariable(WrappedVariable object) {
				return createWrappedVariableAdapter();
			}
			
			@Override
			public Adapter caseVariable(Variable object) {
				return createVariableAdapter();
			}
			@Override
			public Adapter caseWrappedDataLink(WrappedDataLink object) {
				return createWrappedDataLinkAdapter();
			}
			
			@Override
			public Adapter caseDataLink(DataLink object) {
				return createDataLinkAdapter();
			}
			@Override
			public Adapter caseWrappedUpdatePoolAction(WrappedUpdatePoolAction object) {
				return createWrappedUpdatePoolActionAdapter();
			}
			
			@Override
			public Adapter caseUpdatePoolAction(UpdatePoolAction object) {
				return createUpdatePoolActionAdapter();
			}
			@Override
			public Adapter caseWrappedGetNodeAction(WrappedGetNodeAction object) {
				return createWrappedGetNodeActionAdapter();
			}
			
			@Override
			public Adapter caseGetNodeAction(GetNodeAction object) {
				return createGetNodeActionAdapter();
			}
			@Override
			public Adapter caseWrappedRemoteTriggerAction(WrappedRemoteTriggerAction object) {
				return createWrappedRemoteTriggerActionAdapter();
			}
			
			@Override
			public Adapter caseRemoteTriggerAction(RemoteTriggerAction object) {
				return createRemoteTriggerActionAdapter();
			}
			@Override
			public Adapter caseWrappedGetDataAction(WrappedGetDataAction object) {
				return createWrappedGetDataActionAdapter();
			}
			
			@Override
			public Adapter caseGetDataAction(GetDataAction object) {
				return createGetDataActionAdapter();
			}
			@Override
			public Adapter caseWrappedActivationProfile(WrappedActivationProfile object) {
				return createWrappedActivationProfileAdapter();
			}
			
			@Override
			public Adapter caseActivationProfile(ActivationProfile object) {
				return createActivationProfileAdapter();
			}
			@Override
			public Adapter caseWrappedRuntime(WrappedRuntime object) {
				return createWrappedRuntimeAdapter();
			}
			
			@Override
			public Adapter caseRuntime(Runtime object) {
				return createRuntimeAdapter();
			}
			@Override
			public Adapter caseWrappedPlatformSlot(WrappedPlatformSlot object) {
				return createWrappedPlatformSlotAdapter();
			}
			
			@Override
			public Adapter casePlatformSlot(PlatformSlot object) {
				return createPlatformSlotAdapter();
			}
			@Override
			public Adapter caseWrappedPlatformElement(WrappedPlatformElement object) {
				return createWrappedPlatformElementAdapter();
			}
			
			@Override
			public Adapter casePlatformElement(PlatformElement object) {
				return createPlatformElementAdapter();
			}

			@Override
			public Adapter caseMetamodelElementWrapper(MetamodelElementWrapper object) {
				return createMetamodelElementWrapperAdapter();
			}

			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}

	public Adapter createWrappedObjectivesAdapter() {
		return null;
	}
	
	public Adapter createObjectivesAdapter() {
		return null;
	}
	public Adapter createWrappedSensorAdapter() {
		return null;
	}
	
	public Adapter createSensorAdapter() {
		return null;
	}
	public Adapter createWrappedActuatorAdapter() {
		return null;
	}
	
	public Adapter createActuatorAdapter() {
		return null;
	}
	public Adapter createWrappedActuatingAdapter() {
		return null;
	}
	
	public Adapter createActuatingAdapter() {
		return null;
	}
	public Adapter createWrappedTaskAdapter() {
		return null;
	}
	
	public Adapter createTaskAdapter() {
		return null;
	}
	public Adapter createWrappedSensingAdapter() {
		return null;
	}
	
	public Adapter createSensingAdapter() {
		return null;
	}
	public Adapter createWrappedNodeAdapter() {
		return null;
	}
	
	public Adapter createNodeAdapter() {
		return null;
	}
	public Adapter createWrappedEventAdapter() {
		return null;
	}
	
	public Adapter createEventAdapter() {
		return null;
	}
	public Adapter createWrappedNetworkAdapter() {
		return null;
	}
	
	public Adapter createNetworkAdapter() {
		return null;
	}
	public Adapter createWrappedCommunicationAdapter() {
		return null;
	}
	
	public Adapter createCommunicationAdapter() {
		return null;
	}
	public Adapter createWrappedDataAdapter() {
		return null;
	}
	
	public Adapter createDataAdapter() {
		return null;
	}
	public Adapter createWrappedStateAdapter() {
		return null;
	}
	
	public Adapter createStateAdapter() {
		return null;
	}
	public Adapter createWrappedTransitionAdapter() {
		return null;
	}
	
	public Adapter createTransitionAdapter() {
		return null;
	}
	public Adapter createWrappedInitialStateAdapter() {
		return null;
	}
	
	public Adapter createInitialStateAdapter() {
		return null;
	}
	public Adapter createWrappedFinalStateAdapter() {
		return null;
	}
	
	public Adapter createFinalStateAdapter() {
		return null;
	}
	public Adapter createWrappedClusterAdapter() {
		return null;
	}
	
	public Adapter createClusterAdapter() {
		return null;
	}
	public Adapter createWrappedClusterHeadAdapter() {
		return null;
	}
	
	public Adapter createClusterHeadAdapter() {
		return null;
	}
	public Adapter createWrappedSinkAdapter() {
		return null;
	}
	
	public Adapter createSinkAdapter() {
		return null;
	}
	public Adapter createWrappedActivityAdapter() {
		return null;
	}
	
	public Adapter createActivityAdapter() {
		return null;
	}
	public Adapter createWrappedStateMachineAdapter() {
		return null;
	}
	
	public Adapter createStateMachineAdapter() {
		return null;
	}
	public Adapter createWrappedTimingAdapter() {
		return null;
	}
	
	public Adapter createTimingAdapter() {
		return null;
	}
	public Adapter createWrappedTimerAdapter() {
		return null;
	}
	
	public Adapter createTimerAdapter() {
		return null;
	}
	public Adapter createWrappedPlatformAdapter() {
		return null;
	}
	
	public Adapter createPlatformAdapter() {
		return null;
	}
	public Adapter createWrappedResourcesAdapter() {
		return null;
	}
	
	public Adapter createResourcesAdapter() {
		return null;
	}
	public Adapter createWrappedParametersAdapter() {
		return null;
	}
	
	public Adapter createParametersAdapter() {
		return null;
	}
	public Adapter createWrappedHarvesterAdapter() {
		return null;
	}
	
	public Adapter createHarvesterAdapter() {
		return null;
	}
	public Adapter createWrappedBatteryAdapter() {
		return null;
	}
	
	public Adapter createBatteryAdapter() {
		return null;
	}
	public Adapter createWrappedAspectAdapter() {
		return null;
	}
	
	public Adapter createAspectAdapter() {
		return null;
	}
	public Adapter createWrappedPointcutAdapter() {
		return null;
	}
	
	public Adapter createPointcutAdapter() {
		return null;
	}
	public Adapter createWrappedAdviceAdapter() {
		return null;
	}
	
	public Adapter createAdviceAdapter() {
		return null;
	}
	public Adapter createWrappedActivityNodeAdapter() {
		return null;
	}
	
	public Adapter createActivityNodeAdapter() {
		return null;
	}
	public Adapter createWrappedInitialNodeAdapter() {
		return null;
	}
	
	public Adapter createInitialNodeAdapter() {
		return null;
	}
	public Adapter createWrappedFinalNodeAdapter() {
		return null;
	}
	
	public Adapter createFinalNodeAdapter() {
		return null;
	}
	public Adapter createWrappedDecisionNodeAdapter() {
		return null;
	}
	
	public Adapter createDecisionNodeAdapter() {
		return null;
	}
	public Adapter createWrappedMergeNodeAdapter() {
		return null;
	}
	
	public Adapter createMergeNodeAdapter() {
		return null;
	}
	public Adapter createWrappedActivityEdgeAdapter() {
		return null;
	}
	
	public Adapter createActivityEdgeAdapter() {
		return null;
	}
	public Adapter createWrappedOpaqueActionAdapter() {
		return null;
	}
	
	public Adapter createOpaqueActionAdapter() {
		return null;
	}
	public Adapter createWrappedSensingActionAdapter() {
		return null;
	}
	
	public Adapter createSensingActionAdapter() {
		return null;
	}
	public Adapter createWrappedActuatingActionAdapter() {
		return null;
	}
	
	public Adapter createActuatingActionAdapter() {
		return null;
	}
	public Adapter createWrappedTimingActionAdapter() {
		return null;
	}
	
	public Adapter createTimingActionAdapter() {
		return null;
	}
	public Adapter createWrappedVariableAdapter() {
		return null;
	}
	
	public Adapter createVariableAdapter() {
		return null;
	}
	public Adapter createWrappedDataLinkAdapter() {
		return null;
	}
	
	public Adapter createDataLinkAdapter() {
		return null;
	}
	public Adapter createWrappedUpdatePoolActionAdapter() {
		return null;
	}
	
	public Adapter createUpdatePoolActionAdapter() {
		return null;
	}
	public Adapter createWrappedGetNodeActionAdapter() {
		return null;
	}
	
	public Adapter createGetNodeActionAdapter() {
		return null;
	}
	public Adapter createWrappedRemoteTriggerActionAdapter() {
		return null;
	}
	
	public Adapter createRemoteTriggerActionAdapter() {
		return null;
	}
	public Adapter createWrappedGetDataActionAdapter() {
		return null;
	}
	
	public Adapter createGetDataActionAdapter() {
		return null;
	}
	public Adapter createWrappedActivationProfileAdapter() {
		return null;
	}
	
	public Adapter createActivationProfileAdapter() {
		return null;
	}
	public Adapter createWrappedRuntimeAdapter() {
		return null;
	}
	
	public Adapter createRuntimeAdapter() {
		return null;
	}
	public Adapter createWrappedPlatformSlotAdapter() {
		return null;
	}
	
	public Adapter createPlatformSlotAdapter() {
		return null;
	}
	public Adapter createWrappedPlatformElementAdapter() {
		return null;
	}
	
	public Adapter createPlatformElementAdapter() {
		return null;
	}

	public Adapter createMetamodelElementWrapperAdapter() {
		return null;
	}

	public Adapter createEObjectAdapter() {
		return null;
	}
} //WrapperAdapterFactory

