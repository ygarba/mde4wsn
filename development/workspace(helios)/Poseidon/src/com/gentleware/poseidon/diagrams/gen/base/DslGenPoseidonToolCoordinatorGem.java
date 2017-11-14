package com.gentleware.poseidon.diagrams.gen.base;

import com.gentleware.poseidon.diagrams.gen.node.*;
import com.gentleware.poseidon.diagrams.gen.edge.*;
import com.gentleware.poseidon.diagrams.node.FeatureCompartmentCreatorGem;
import com.gentleware.poseidon.diagrams.gen.bundle.DslGenDiagramResourceBundle;

/*
 * This code is generated. All the hand-written changes will be lost.
 */

public class DslGenPoseidonToolCoordinatorGem extends
		DslGenPaletteToolCoordinatorGem {

	@Override
	public void registerRecreators() {
		super.registerRecreators();
		registerRecreatorBySemanticElement(new DslGenClusterCreatorGem()
				.getNodeCreateFacet());
		registerRecreatorBySemanticElement(new DslGenObjectivesCreatorGem()
				.getNodeCreateFacet());
		registerRecreatorBySemanticElement(new DslGenTaskCreatorGem()
				.getNodeCreateFacet());
		registerRecreatorBySemanticElement(new DslGenActivationProfileCreatorGem()
				.getNodeCreateFacet());
		registerRecreatorBySemanticElement(new DslGenDataCreatorGem()
				.getNodeCreateFacet());
		registerRecreatorBySemanticElement(new DslGenVariableCreatorGem()
				.getNodeCreateFacet());
		registerRecreatorBySemanticElement(new DslGenSensorCreatorGem()
				.getNodeCreateFacet());
		registerRecreatorBySemanticElement(new DslGenActuatorCreatorGem()
				.getNodeCreateFacet());
		registerRecreatorBySemanticElement(new DslGenTimerCreatorGem()
				.getNodeCreateFacet());
		registerRecreatorBySemanticElement(new DslGenStateMachineCreatorGem()
				.getNodeCreateFacet());
		registerRecreatorBySemanticElement(new DslGenStateCreatorGem()
				.getNodeCreateFacet());
		registerRecreatorBySemanticElement(new DslGenInitialStateCreatorGem()
				.getNodeCreateFacet());
		registerRecreatorBySemanticElement(new DslGenFinalStateCreatorGem()
				.getNodeCreateFacet());
		registerRecreatorBySemanticElement(new DslGenActivityCreatorGem()
				.getNodeCreateFacet());
		registerRecreatorBySemanticElement(new DslGenInitialNodeCreatorGem()
				.getNodeCreateFacet());
		registerRecreatorBySemanticElement(new DslGenFinalNodeCreatorGem()
				.getNodeCreateFacet());
		registerRecreatorBySemanticElement(new DslGenDecisionNodeCreatorGem()
				.getNodeCreateFacet());
		registerRecreatorBySemanticElement(new DslGenMergeNodeCreatorGem()
				.getNodeCreateFacet());
		registerRecreatorBySemanticElement(new DslGenSensingActionCreatorGem()
				.getNodeCreateFacet());
		registerRecreatorBySemanticElement(new DslGenActuatingActionCreatorGem()
				.getNodeCreateFacet());
		registerRecreatorBySemanticElement(new DslGenTimingActionCreatorGem()
				.getNodeCreateFacet());
		registerRecreatorBySemanticElement(new DslGenUpdatePoolActionCreatorGem()
				.getNodeCreateFacet());
		registerRecreatorBySemanticElement(new DslGenGetNodeActionCreatorGem()
				.getNodeCreateFacet());
		registerRecreatorBySemanticElement(new DslGenGetDataActionCreatorGem()
				.getNodeCreateFacet());
		registerRecreatorBySemanticElement(new DslGenRemoteTriggerActionCreatorGem()
				.getNodeCreateFacet());
		registerRecreatorBySemanticElement(new DslGenOpaqueActionCreatorGem()
				.getNodeCreateFacet());
		registerRecreatorBySemanticElement(new DslGenAspectCreatorGem()
				.getNodeCreateFacet());
		registerRecreatorBySemanticElement(new DslGenPointcutCreatorGem()
				.getNodeCreateFacet());
		registerRecreatorBySemanticElement(new DslGenAdviceCreatorGem()
				.getNodeCreateFacet());
		registerRecreatorBySemanticElement(new DslGenPlatformSlotCreatorGem()
				.getNodeCreateFacet());
		registerRecreatorBySemanticElement(new DslGenParametersCreatorGem()
				.getNodeCreateFacet());
		registerRecreatorBySemanticElement(new DslGenRuntimeCreatorGem()
				.getNodeCreateFacet());
		registerRecreatorBySemanticElement(new DslGenResourcesCreatorGem()
				.getNodeCreateFacet());
		registerRecreatorBySemanticElement(new DslGenBatteryCreatorGem()
				.getNodeCreateFacet());
		registerRecreatorBySemanticElement(new DslGenDataLinkCreatorGem()
				.getArcCreateFacet());
		registerRecreatorBySemanticElement(new DslGenSensingCreatorGem()
				.getArcCreateFacet());
		registerRecreatorBySemanticElement(new DslGenActuatingCreatorGem()
				.getArcCreateFacet());
		registerRecreatorBySemanticElement(new DslGenTimingCreatorGem()
				.getArcCreateFacet());
		registerRecreatorBySemanticElement(new DslGenTransitionCreatorGem()
				.getArcCreateFacet());
		registerRecreatorBySemanticElement(new DslGenActivityEdgeCreatorGem()
				.getArcCreateFacet());
		registerRecreator(new FeatureCompartmentCreatorGem(
				DslGenDiagramResourceBundle.Cluster, "Clusters", true)
				.getNodeCreateFacet());
		registerRecreator(new FeatureCompartmentCreatorGem(
				DslGenDiagramResourceBundle.Objectives, "Objectivess", true)
				.getNodeCreateFacet());
		registerRecreator(new FeatureCompartmentCreatorGem(
				DslGenDiagramResourceBundle.Task, "Tasks", true)
				.getNodeCreateFacet());
		registerRecreator(new FeatureCompartmentCreatorGem(
				DslGenDiagramResourceBundle.ActivationProfile,
				"ActivationProfiles", true).getNodeCreateFacet());
		registerRecreator(new FeatureCompartmentCreatorGem(
				DslGenDiagramResourceBundle.Data, "Datas", true)
				.getNodeCreateFacet());
		registerRecreator(new FeatureCompartmentCreatorGem(
				DslGenDiagramResourceBundle.Variable, "Variables", true)
				.getNodeCreateFacet());
		registerRecreator(new FeatureCompartmentCreatorGem(
				DslGenDiagramResourceBundle.Sensor, "Sensors", true)
				.getNodeCreateFacet());
		registerRecreator(new FeatureCompartmentCreatorGem(
				DslGenDiagramResourceBundle.Actuator, "Actuators", true)
				.getNodeCreateFacet());
		registerRecreator(new FeatureCompartmentCreatorGem(
				DslGenDiagramResourceBundle.Timer, "Timers", true)
				.getNodeCreateFacet());
		registerRecreator(new FeatureCompartmentCreatorGem(
				DslGenDiagramResourceBundle.StateMachine, "StateMachines", true)
				.getNodeCreateFacet());
		registerRecreator(new FeatureCompartmentCreatorGem(
				DslGenDiagramResourceBundle.State, "States", true)
				.getNodeCreateFacet());
		registerRecreator(new FeatureCompartmentCreatorGem(
				DslGenDiagramResourceBundle.InitialState, "InitialStates", true)
				.getNodeCreateFacet());
		registerRecreator(new FeatureCompartmentCreatorGem(
				DslGenDiagramResourceBundle.FinalState, "FinalStates", true)
				.getNodeCreateFacet());
		registerRecreator(new FeatureCompartmentCreatorGem(
				DslGenDiagramResourceBundle.Activity, "Activitys", true)
				.getNodeCreateFacet());
		registerRecreator(new FeatureCompartmentCreatorGem(
				DslGenDiagramResourceBundle.InitialNode, "InitialNodes", true)
				.getNodeCreateFacet());
		registerRecreator(new FeatureCompartmentCreatorGem(
				DslGenDiagramResourceBundle.FinalNode, "FinalNodes", true)
				.getNodeCreateFacet());
		registerRecreator(new FeatureCompartmentCreatorGem(
				DslGenDiagramResourceBundle.DecisionNode, "DecisionNodes", true)
				.getNodeCreateFacet());
		registerRecreator(new FeatureCompartmentCreatorGem(
				DslGenDiagramResourceBundle.MergeNode, "MergeNodes", true)
				.getNodeCreateFacet());
		registerRecreator(new FeatureCompartmentCreatorGem(
				DslGenDiagramResourceBundle.SensingAction, "SensingActions",
				true).getNodeCreateFacet());
		registerRecreator(new FeatureCompartmentCreatorGem(
				DslGenDiagramResourceBundle.ActuatingAction,
				"ActuatingActions", true).getNodeCreateFacet());
		registerRecreator(new FeatureCompartmentCreatorGem(
				DslGenDiagramResourceBundle.TimingAction, "TimingActions", true)
				.getNodeCreateFacet());
		registerRecreator(new FeatureCompartmentCreatorGem(
				DslGenDiagramResourceBundle.UpdatePoolAction,
				"UpdatePoolActions", true).getNodeCreateFacet());
		registerRecreator(new FeatureCompartmentCreatorGem(
				DslGenDiagramResourceBundle.GetNodeAction, "GetNodeActions",
				true).getNodeCreateFacet());
		registerRecreator(new FeatureCompartmentCreatorGem(
				DslGenDiagramResourceBundle.GetDataAction, "GetDataActions",
				true).getNodeCreateFacet());
		registerRecreator(new FeatureCompartmentCreatorGem(
				DslGenDiagramResourceBundle.RemoteTriggerAction,
				"RemoteTriggerActions", true).getNodeCreateFacet());
		registerRecreator(new FeatureCompartmentCreatorGem(
				DslGenDiagramResourceBundle.OpaqueAction, "OpaqueActions", true)
				.getNodeCreateFacet());
		registerRecreator(new FeatureCompartmentCreatorGem(
				DslGenDiagramResourceBundle.Aspect, "Aspects", true)
				.getNodeCreateFacet());
		registerRecreator(new FeatureCompartmentCreatorGem(
				DslGenDiagramResourceBundle.Pointcut, "Pointcuts", true)
				.getNodeCreateFacet());
		registerRecreator(new FeatureCompartmentCreatorGem(
				DslGenDiagramResourceBundle.Advice, "Advices", true)
				.getNodeCreateFacet());
		registerRecreator(new FeatureCompartmentCreatorGem(
				DslGenDiagramResourceBundle.PlatformSlot, "PlatformSlots", true)
				.getNodeCreateFacet());
		registerRecreator(new FeatureCompartmentCreatorGem(
				DslGenDiagramResourceBundle.Parameters, "Parameterss", true)
				.getNodeCreateFacet());
		registerRecreator(new FeatureCompartmentCreatorGem(
				DslGenDiagramResourceBundle.Runtime, "Runtimes", true)
				.getNodeCreateFacet());
		registerRecreator(new FeatureCompartmentCreatorGem(
				DslGenDiagramResourceBundle.Resources, "Resourcess", true)
				.getNodeCreateFacet());
		registerRecreator(new FeatureCompartmentCreatorGem(
				DslGenDiagramResourceBundle.Battery, "Batterys", true)
				.getNodeCreateFacet());
	}
}
