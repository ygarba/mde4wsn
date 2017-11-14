package com.gentleware.poseidon.gui.palette.main;

import static com.gentleware.poseidon.idraw.foundation.palette.RichPaletteCategoryMode.MAXIMIZED;
import static com.gentleware.poseidon.idraw.foundation.palette.RichPaletteCategoryMode.MINIMIZED;

import com.gentleware.poseidon.idraw.arcfacilities.creation.ArcCreateToolGem;
import com.gentleware.poseidon.gui.palette.PaletteManagerGem;
import com.gentleware.poseidon.gui.palette.main.DslGenMainPaletteResourceBundle;
import com.gentleware.poseidon.idraw.foundation.palette.RichPalette;
import com.gentleware.poseidon.idraw.foundation.palette.RichPaletteCategory;
import com.gentleware.poseidon.repositorybase.CommonRepositoryFunctions;

import com.gentleware.poseidon.diagrams.gen.node.*;
import com.gentleware.poseidon.diagrams.gen.edge.*;

/*
 * This code is generated. All the hand-written changes will be lost.
 */

public class DslGenMainPaletteManagerGem extends PaletteManagerGem {

	public RichPalette createPalette() {
		RichPalette tools = super.createPalette();

		{
			RichPaletteCategory palette = new RichPaletteCategory(
					loadScaledImage("category-default"),
					getLocalizedString(DslGenMainPaletteResourceBundle.NodesCategory),
					MINIMIZED);

			palette
					.addEntry(makeEntry(
							true,
							"task_16x16",
							getLocalizedString(DslGenMainPaletteResourceBundle.Task),
							makeNodeCreateTool(retrieveNodeRecreator(DslGenTaskCreatorGem.NAME)),
							getAllowedDiagramTypes(DslGenTaskCreatorGem.NAME)

							, "", "", DslGenTaskCreatorGem.NAME));

			palette
					.addEntry(makeEntry(
							true,
							"profile_16x16",
							getLocalizedString(DslGenMainPaletteResourceBundle.ActivationProfile),
							makeNodeCreateTool(retrieveNodeRecreator(DslGenActivationProfileCreatorGem.NAME)),
							getAllowedDiagramTypes(DslGenActivationProfileCreatorGem.NAME)

							, "", "", DslGenActivationProfileCreatorGem.NAME));

			palette
					.addEntry(makeEntry(
							true,
							"data_16x16",
							getLocalizedString(DslGenMainPaletteResourceBundle.Data),
							makeNodeCreateTool(retrieveNodeRecreator(DslGenDataCreatorGem.NAME)),
							getAllowedDiagramTypes(DslGenDataCreatorGem.NAME)

							, "", "data", DslGenDataCreatorGem.NAME));

			palette
					.addEntry(makeEntry(
							true,
							"sensor_16x16",
							getLocalizedString(DslGenMainPaletteResourceBundle.Sensor),
							makeNodeCreateTool(retrieveNodeRecreator(DslGenSensorCreatorGem.NAME)),
							getAllowedDiagramTypes(DslGenSensorCreatorGem.NAME)

							, "", "", DslGenSensorCreatorGem.NAME));

			palette
					.addEntry(makeEntry(
							true,
							"actuator_16x16",
							getLocalizedString(DslGenMainPaletteResourceBundle.Actuator),
							makeNodeCreateTool(retrieveNodeRecreator(DslGenActuatorCreatorGem.NAME)),
							getAllowedDiagramTypes(DslGenActuatorCreatorGem.NAME)

							, "", "", DslGenActuatorCreatorGem.NAME));

			palette
					.addEntry(makeEntry(
							true,
							"timer_16x16",
							getLocalizedString(DslGenMainPaletteResourceBundle.Timer),
							makeNodeCreateTool(retrieveNodeRecreator(DslGenTimerCreatorGem.NAME)),
							getAllowedDiagramTypes(DslGenTimerCreatorGem.NAME)

							, "", "", DslGenTimerCreatorGem.NAME));

			palette
					.addEntry(makeEntry(
							true,
							"cluster_16x16",
							getLocalizedString(DslGenMainPaletteResourceBundle.Cluster),
							makeNodeCreateTool(retrieveNodeRecreator(DslGenClusterCreatorGem.NAME)),
							getAllowedDiagramTypes(DslGenClusterCreatorGem.NAME)

							, "", "", DslGenClusterCreatorGem.NAME));

			palette
					.addEntry(makeEntry(
							true,
							"objectives_16x16",
							getLocalizedString(DslGenMainPaletteResourceBundle.Objectives),
							makeNodeCreateTool(retrieveNodeRecreator(DslGenObjectivesCreatorGem.NAME)),
							getAllowedDiagramTypes(DslGenObjectivesCreatorGem.NAME)

							, "", "", DslGenObjectivesCreatorGem.NAME));

			palette
					.addEntry(makeEntry(
							false,
							"data_edge_16x16",
							getLocalizedString(DslGenMainPaletteResourceBundle.DataLink),
							makeArcCreateTool(retrieveArcRecreator(DslGenDataLinkCreatorGem.NAME)),
							getAllowedDiagramTypes(DslGenDataLinkCreatorGem.NAME)

							, "", "", DslGenDataLinkCreatorGem.NAME));

			palette
					.addEntry(makeEntry(
							false,
							"sensor_edge_16x16",
							getLocalizedString(DslGenMainPaletteResourceBundle.Sensing),
							makeArcCreateTool(retrieveArcRecreator(DslGenSensingCreatorGem.NAME)),
							getAllowedDiagramTypes(DslGenSensingCreatorGem.NAME)

							, "", "", DslGenSensingCreatorGem.NAME));

			palette
					.addEntry(makeEntry(
							false,
							"actuator_edge_16x16",
							getLocalizedString(DslGenMainPaletteResourceBundle.Actuating),
							makeArcCreateTool(retrieveArcRecreator(DslGenActuatingCreatorGem.NAME)),
							getAllowedDiagramTypes(DslGenActuatingCreatorGem.NAME)

							, "", "", DslGenActuatingCreatorGem.NAME));

			palette
					.addEntry(makeEntry(
							false,
							"timer_edge_16x16",
							getLocalizedString(DslGenMainPaletteResourceBundle.Timing),
							makeArcCreateTool(retrieveArcRecreator(DslGenTimingCreatorGem.NAME)),
							getAllowedDiagramTypes(DslGenTimingCreatorGem.NAME)

							, "", "", DslGenTimingCreatorGem.NAME));

			tools.addCategory(palette);
		}

		{
			RichPaletteCategory palette = new RichPaletteCategory(
					loadScaledImage("category-default"),
					getLocalizedString(DslGenMainPaletteResourceBundle.StateMachineCategory),
					MINIMIZED);

			palette
					.addEntry(makeEntry(
							true,
							"state",
							getLocalizedString(DslGenMainPaletteResourceBundle.StateMachine),
							makeNodeCreateTool(retrieveNodeRecreator(DslGenStateMachineCreatorGem.NAME)),
							getAllowedDiagramTypes(DslGenStateMachineCreatorGem.NAME)

							, "", "", DslGenStateMachineCreatorGem.NAME));

			palette
					.addEntry(makeEntry(
							true,
							"state",
							getLocalizedString(DslGenMainPaletteResourceBundle.State),
							makeNodeCreateTool(retrieveNodeRecreator(DslGenStateCreatorGem.NAME)),
							getAllowedDiagramTypes(DslGenStateCreatorGem.NAME)

							, "", "_state", DslGenStateCreatorGem.NAME));

			palette
					.addEntry(makeEntry(
							true,
							"initial-state",
							getLocalizedString(DslGenMainPaletteResourceBundle.InitialState),
							makeNodeCreateTool(retrieveNodeRecreator(DslGenInitialStateCreatorGem.NAME)),
							getAllowedDiagramTypes(DslGenInitialStateCreatorGem.NAME)

							, "", "", DslGenInitialStateCreatorGem.NAME));

			palette
					.addEntry(makeEntry(
							true,
							"final-state",
							getLocalizedString(DslGenMainPaletteResourceBundle.FinalState),
							makeNodeCreateTool(retrieveNodeRecreator(DslGenFinalStateCreatorGem.NAME)),
							getAllowedDiagramTypes(DslGenFinalStateCreatorGem.NAME)

							, "", "", DslGenFinalStateCreatorGem.NAME));

			palette
					.addEntry(makeEntry(
							false,
							"transition",
							getLocalizedString(DslGenMainPaletteResourceBundle.Transition),
							makeArcCreateTool(retrieveArcRecreator(DslGenTransitionCreatorGem.NAME)),
							getAllowedDiagramTypes(DslGenTransitionCreatorGem.NAME)

							, "", "", DslGenTransitionCreatorGem.NAME));

			tools.addCategory(palette);
		}

		{
			RichPaletteCategory palette = new RichPaletteCategory(
					loadScaledImage("category-default"),
					getLocalizedString(DslGenMainPaletteResourceBundle.ActivityCategory),
					MINIMIZED);

			palette
					.addEntry(makeEntry(
							true,
							"state",
							getLocalizedString(DslGenMainPaletteResourceBundle.Activity),
							makeNodeCreateTool(retrieveNodeRecreator(DslGenActivityCreatorGem.NAME)),
							getAllowedDiagramTypes(DslGenActivityCreatorGem.NAME)

							, "", "", DslGenActivityCreatorGem.NAME));

			palette
					.addEntry(makeEntry(
							true,
							"initial-state",
							getLocalizedString(DslGenMainPaletteResourceBundle.InitialNode),
							makeNodeCreateTool(retrieveNodeRecreator(DslGenInitialNodeCreatorGem.NAME)),
							getAllowedDiagramTypes(DslGenInitialNodeCreatorGem.NAME)

							, "", "", DslGenInitialNodeCreatorGem.NAME));

			palette
					.addEntry(makeEntry(
							true,
							"final-state",
							getLocalizedString(DslGenMainPaletteResourceBundle.FinalNode),
							makeNodeCreateTool(retrieveNodeRecreator(DslGenFinalNodeCreatorGem.NAME)),
							getAllowedDiagramTypes(DslGenFinalNodeCreatorGem.NAME)

							, "", "", DslGenFinalNodeCreatorGem.NAME));

			palette
					.addEntry(makeEntry(
							true,
							"decision-node",
							getLocalizedString(DslGenMainPaletteResourceBundle.DecisionNode),
							makeNodeCreateTool(retrieveNodeRecreator(DslGenDecisionNodeCreatorGem.NAME)),
							getAllowedDiagramTypes(DslGenDecisionNodeCreatorGem.NAME)

							, "", "", DslGenDecisionNodeCreatorGem.NAME));

			palette
					.addEntry(makeEntry(
							true,
							"merge-node",
							getLocalizedString(DslGenMainPaletteResourceBundle.MergeNode),
							makeNodeCreateTool(retrieveNodeRecreator(DslGenMergeNodeCreatorGem.NAME)),
							getAllowedDiagramTypes(DslGenMergeNodeCreatorGem.NAME)

							, "", "", DslGenMergeNodeCreatorGem.NAME));

			palette
					.addEntry(makeEntry(
							true,
							"call-action",
							getLocalizedString(DslGenMainPaletteResourceBundle.SensingAction),
							makeNodeCreateTool(retrieveNodeRecreator(DslGenSensingActionCreatorGem.NAME)),
							getAllowedDiagramTypes(DslGenSensingActionCreatorGem.NAME)

							, "", "", DslGenSensingActionCreatorGem.NAME));

			palette
					.addEntry(makeEntry(
							true,
							"call-action",
							getLocalizedString(DslGenMainPaletteResourceBundle.ActuatingAction),
							makeNodeCreateTool(retrieveNodeRecreator(DslGenActuatingActionCreatorGem.NAME)),
							getAllowedDiagramTypes(DslGenActuatingActionCreatorGem.NAME)

							, "", "", DslGenActuatingActionCreatorGem.NAME));

			palette
					.addEntry(makeEntry(
							true,
							"call-action",
							getLocalizedString(DslGenMainPaletteResourceBundle.TimingAction),
							makeNodeCreateTool(retrieveNodeRecreator(DslGenTimingActionCreatorGem.NAME)),
							getAllowedDiagramTypes(DslGenTimingActionCreatorGem.NAME)

							, "", "", DslGenTimingActionCreatorGem.NAME));

			palette
					.addEntry(makeEntry(
							true,
							"call-action",
							getLocalizedString(DslGenMainPaletteResourceBundle.UpdatePoolAction),
							makeNodeCreateTool(retrieveNodeRecreator(DslGenUpdatePoolActionCreatorGem.NAME)),
							getAllowedDiagramTypes(DslGenUpdatePoolActionCreatorGem.NAME)

							, "", "", DslGenUpdatePoolActionCreatorGem.NAME));

			palette
					.addEntry(makeEntry(
							true,
							"call-action",
							getLocalizedString(DslGenMainPaletteResourceBundle.GetNodeAction),
							makeNodeCreateTool(retrieveNodeRecreator(DslGenGetNodeActionCreatorGem.NAME)),
							getAllowedDiagramTypes(DslGenGetNodeActionCreatorGem.NAME)

							, "", "", DslGenGetNodeActionCreatorGem.NAME));

			palette
					.addEntry(makeEntry(
							true,
							"call-action",
							getLocalizedString(DslGenMainPaletteResourceBundle.GetDataAction),
							makeNodeCreateTool(retrieveNodeRecreator(DslGenGetDataActionCreatorGem.NAME)),
							getAllowedDiagramTypes(DslGenGetDataActionCreatorGem.NAME)

							, "", "", DslGenGetDataActionCreatorGem.NAME));

			palette
					.addEntry(makeEntry(
							true,
							"call-action",
							getLocalizedString(DslGenMainPaletteResourceBundle.RemoteTriggerAction),
							makeNodeCreateTool(retrieveNodeRecreator(DslGenRemoteTriggerActionCreatorGem.NAME)),
							getAllowedDiagramTypes(DslGenRemoteTriggerActionCreatorGem.NAME)

							, "", "", DslGenRemoteTriggerActionCreatorGem.NAME));

			palette
					.addEntry(makeEntry(
							true,
							"call-action",
							getLocalizedString(DslGenMainPaletteResourceBundle.OpaqueAction),
							makeNodeCreateTool(retrieveNodeRecreator(DslGenOpaqueActionCreatorGem.NAME)),
							getAllowedDiagramTypes(DslGenOpaqueActionCreatorGem.NAME)

							, "", "", DslGenOpaqueActionCreatorGem.NAME));

			palette
					.addEntry(makeEntry(
							false,
							"association-right",
							getLocalizedString(DslGenMainPaletteResourceBundle.ActivityEdge),
							makeArcCreateTool(retrieveArcRecreator(DslGenActivityEdgeCreatorGem.NAME)),
							getAllowedDiagramTypes(DslGenActivityEdgeCreatorGem.NAME)

							, "", "", DslGenActivityEdgeCreatorGem.NAME));

			tools.addCategory(palette);
		}

		{
			RichPaletteCategory palette = new RichPaletteCategory(
					loadScaledImage("category-default"),
					getLocalizedString(DslGenMainPaletteResourceBundle.PlatformCategory),
					MINIMIZED);

			palette
					.addEntry(makeEntry(
							true,
							"state",
							getLocalizedString(DslGenMainPaletteResourceBundle.Aspect),
							makeNodeCreateTool(retrieveNodeRecreator(DslGenAspectCreatorGem.NAME)),
							getAllowedDiagramTypes(DslGenAspectCreatorGem.NAME)

							, "", "_aspects", DslGenAspectCreatorGem.NAME));

			palette
					.addEntry(makeEntry(
							true,
							"pointcut_16x16",
							getLocalizedString(DslGenMainPaletteResourceBundle.Pointcut),
							makeNodeCreateTool(retrieveNodeRecreator(DslGenPointcutCreatorGem.NAME)),
							getAllowedDiagramTypes(DslGenPointcutCreatorGem.NAME),
							"element,_aspects,", "",
							DslGenPointcutCreatorGem.NAME));

			palette
					.addEntry(makeEntry(
							true,
							"state",
							getLocalizedString(DslGenMainPaletteResourceBundle.Advice),
							makeNodeCreateTool(retrieveNodeRecreator(DslGenAdviceCreatorGem.NAME)),
							getAllowedDiagramTypes(DslGenAdviceCreatorGem.NAME),
							"element,_aspects,", "_advices",
							DslGenAdviceCreatorGem.NAME));

			palette
					.addEntry(makeEntry(
							true,
							"state",
							getLocalizedString(DslGenMainPaletteResourceBundle.PlatformSlot),
							makeNodeCreateTool(retrieveNodeRecreator(DslGenPlatformSlotCreatorGem.NAME)),
							getAllowedDiagramTypes(DslGenPlatformSlotCreatorGem.NAME)

							, "", "_slot", DslGenPlatformSlotCreatorGem.NAME));

			palette
					.addEntry(makeEntry(
							true,
							"parameter_16x16",
							getLocalizedString(DslGenMainPaletteResourceBundle.Parameters),
							makeNodeCreateTool(retrieveNodeRecreator(DslGenParametersCreatorGem.NAME)),
							getAllowedDiagramTypes(DslGenParametersCreatorGem.NAME),
							"element,_slot,", "",
							DslGenParametersCreatorGem.NAME));

			palette
					.addEntry(makeEntry(
							true,
							"runtime_16x16",
							getLocalizedString(DslGenMainPaletteResourceBundle.Runtime),
							makeNodeCreateTool(retrieveNodeRecreator(DslGenRuntimeCreatorGem.NAME)),
							getAllowedDiagramTypes(DslGenRuntimeCreatorGem.NAME),
							"element,_slot,", "", DslGenRuntimeCreatorGem.NAME));

			palette
					.addEntry(makeEntry(
							true,
							"resource_16x16",
							getLocalizedString(DslGenMainPaletteResourceBundle.Resources),
							makeNodeCreateTool(retrieveNodeRecreator(DslGenResourcesCreatorGem.NAME)),
							getAllowedDiagramTypes(DslGenResourcesCreatorGem.NAME),
							"element,_slot,", "",
							DslGenResourcesCreatorGem.NAME));

			palette
					.addEntry(makeEntry(
							true,
							"battery_16x16",
							getLocalizedString(DslGenMainPaletteResourceBundle.Battery),
							makeNodeCreateTool(retrieveNodeRecreator(DslGenBatteryCreatorGem.NAME)),
							getAllowedDiagramTypes(DslGenBatteryCreatorGem.NAME),
							"element,_slot,", "", DslGenBatteryCreatorGem.NAME));

			tools.addCategory(palette);
		}
		return tools;
	}
}
