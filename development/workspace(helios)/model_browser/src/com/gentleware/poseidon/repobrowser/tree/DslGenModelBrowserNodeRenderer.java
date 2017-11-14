package com.gentleware.poseidon.repobrowser.tree;

import com.gentleware.poseidon.repobrowser.DSLNodeRenderer;
import com.gentleware.poseidon.deltaengine.errorchecking.ErrorRegister;
import com.gentleware.poseidon.repobrowser.ShortCutType;
import com.gentleware.poseidon.dsl.wsn.impl.*;
import com.gentleware.poseidon.model.wrapper.impl.*;
import com.gentleware.poseidon.repositorybase.CommonRepositoryFunctions;

/*
 * This code is generated. All the hand-written changes will be lost.
 */

public abstract class DslGenModelBrowserNodeRenderer extends DSLNodeRenderer {

	public DslGenModelBrowserNodeRenderer(ErrorRegister errors) {
		super(errors);
	}

	@Override
	protected void setUpIcons() {
		super.setUpIcons();
		addIcon(ClusterImpl.class, null, ShortCutType.NONE, "diagram-modified",
				null);
		addIcon(WrappedClusterImpl.class, null, ShortCutType.NONE,
				"diagram-modified", null);
		addIcon(ClusterImpl.class, null, ShortCutType.NORMAL,
				"diagram-modified", null);
		addIcon(WrappedClusterImpl.class, null, ShortCutType.NORMAL,
				"diagram-modified", null);
		addIcon(ObjectivesImpl.class, null, ShortCutType.NONE, "class", null);
		addIcon(WrappedObjectivesImpl.class, null, ShortCutType.NONE, "class",
				null);
		addIcon(ObjectivesImpl.class, null, ShortCutType.NORMAL, "class", null);
		addIcon(WrappedObjectivesImpl.class, null, ShortCutType.NORMAL,
				"class", null);
		addIcon(TaskImpl.class, null, ShortCutType.NONE, "class", null);
		addIcon(WrappedTaskImpl.class, null, ShortCutType.NONE, "class", null);
		addIcon(TaskImpl.class, null, ShortCutType.NORMAL, "class", null);
		addIcon(WrappedTaskImpl.class, null, ShortCutType.NORMAL, "class", null);
		addIcon(ActivationProfileImpl.class, null, ShortCutType.NONE,
				"artifact", null);
		addIcon(WrappedActivationProfileImpl.class, null, ShortCutType.NONE,
				"artifact", null);
		addIcon(ActivationProfileImpl.class, null, ShortCutType.NORMAL,
				"artifact", null);
		addIcon(WrappedActivationProfileImpl.class, null, ShortCutType.NORMAL,
				"artifact", null);
		addIcon(DataImpl.class, null, ShortCutType.NONE, "artifact", null);
		addIcon(WrappedDataImpl.class, null, ShortCutType.NONE, "artifact",
				null);
		addIcon(DataImpl.class, null, ShortCutType.NORMAL, "artifact", null);
		addIcon(WrappedDataImpl.class, null, ShortCutType.NORMAL, "artifact",
				null);
		addIcon(VariableImpl.class, null, ShortCutType.NONE, "class", null);
		addIcon(WrappedVariableImpl.class, null, ShortCutType.NONE, "class",
				null);
		addIcon(VariableImpl.class, null, ShortCutType.NORMAL, "class", null);
		addIcon(WrappedVariableImpl.class, null, ShortCutType.NORMAL, "class",
				null);
		addIcon(SensorImpl.class, null, ShortCutType.NONE, "class", null);
		addIcon(WrappedSensorImpl.class, null, ShortCutType.NONE, "class", null);
		addIcon(SensorImpl.class, null, ShortCutType.NORMAL, "class", null);
		addIcon(WrappedSensorImpl.class, null, ShortCutType.NORMAL, "class",
				null);
		addIcon(ActuatorImpl.class, null, ShortCutType.NONE, "class", null);
		addIcon(WrappedActuatorImpl.class, null, ShortCutType.NONE, "class",
				null);
		addIcon(ActuatorImpl.class, null, ShortCutType.NORMAL, "class", null);
		addIcon(WrappedActuatorImpl.class, null, ShortCutType.NORMAL, "class",
				null);
		addIcon(TimerImpl.class, null, ShortCutType.NONE, "hourglass", null);
		addIcon(WrappedTimerImpl.class, null, ShortCutType.NONE, "hourglass",
				null);
		addIcon(TimerImpl.class, null, ShortCutType.NORMAL, "hourglass", null);
		addIcon(WrappedTimerImpl.class, null, ShortCutType.NORMAL, "hourglass",
				null);
		addIcon(StateMachineImpl.class, null, ShortCutType.NONE, "state", null);
		addIcon(WrappedStateMachineImpl.class, null, ShortCutType.NONE,
				"state", null);
		addIcon(StateMachineImpl.class, null, ShortCutType.NORMAL, "state",
				null);
		addIcon(WrappedStateMachineImpl.class, null, ShortCutType.NORMAL,
				"state", null);
		addIcon(StateImpl.class, null, ShortCutType.NONE, "state", null);
		addIcon(WrappedStateImpl.class, null, ShortCutType.NONE, "state", null);
		addIcon(StateImpl.class, null, ShortCutType.NORMAL, "state", null);
		addIcon(WrappedStateImpl.class, null, ShortCutType.NORMAL, "state",
				null);
		addIcon(InitialStateImpl.class, null, ShortCutType.NONE,
				"initial-state", null);
		addIcon(WrappedInitialStateImpl.class, null, ShortCutType.NONE,
				"initial-state", null);
		addIcon(InitialStateImpl.class, null, ShortCutType.NORMAL,
				"initial-state", null);
		addIcon(WrappedInitialStateImpl.class, null, ShortCutType.NORMAL,
				"initial-state", null);
		addIcon(FinalStateImpl.class, null, ShortCutType.NONE, "final-state",
				null);
		addIcon(WrappedFinalStateImpl.class, null, ShortCutType.NONE,
				"final-state", null);
		addIcon(FinalStateImpl.class, null, ShortCutType.NORMAL, "final-state",
				null);
		addIcon(WrappedFinalStateImpl.class, null, ShortCutType.NORMAL,
				"final-state", null);
		addIcon(ActivityImpl.class, null, ShortCutType.NONE, "state", null);
		addIcon(WrappedActivityImpl.class, null, ShortCutType.NONE, "state",
				null);
		addIcon(ActivityImpl.class, null, ShortCutType.NORMAL, "state", null);
		addIcon(WrappedActivityImpl.class, null, ShortCutType.NORMAL, "state",
				null);
		addIcon(InitialNodeImpl.class, null, ShortCutType.NONE,
				"initial-state", null);
		addIcon(WrappedInitialNodeImpl.class, null, ShortCutType.NONE,
				"initial-state", null);
		addIcon(InitialNodeImpl.class, null, ShortCutType.NORMAL,
				"initial-state", null);
		addIcon(WrappedInitialNodeImpl.class, null, ShortCutType.NORMAL,
				"initial-state", null);
		addIcon(FinalNodeImpl.class, null, ShortCutType.NONE, "final-state",
				null);
		addIcon(WrappedFinalNodeImpl.class, null, ShortCutType.NONE,
				"final-state", null);
		addIcon(FinalNodeImpl.class, null, ShortCutType.NORMAL, "final-state",
				null);
		addIcon(WrappedFinalNodeImpl.class, null, ShortCutType.NORMAL,
				"final-state", null);
		addIcon(DecisionNodeImpl.class, null, ShortCutType.NONE,
				"decision-node", null);
		addIcon(WrappedDecisionNodeImpl.class, null, ShortCutType.NONE,
				"decision-node", null);
		addIcon(DecisionNodeImpl.class, null, ShortCutType.NORMAL,
				"decision-node", null);
		addIcon(WrappedDecisionNodeImpl.class, null, ShortCutType.NORMAL,
				"decision-node", null);
		addIcon(MergeNodeImpl.class, null, ShortCutType.NONE, "merge-node",
				null);
		addIcon(WrappedMergeNodeImpl.class, null, ShortCutType.NONE,
				"merge-node", null);
		addIcon(MergeNodeImpl.class, null, ShortCutType.NORMAL, "merge-node",
				null);
		addIcon(WrappedMergeNodeImpl.class, null, ShortCutType.NORMAL,
				"merge-node", null);
		addIcon(SensingActionImpl.class, null, ShortCutType.NONE,
				"call-action", null);
		addIcon(WrappedSensingActionImpl.class, null, ShortCutType.NONE,
				"call-action", null);
		addIcon(SensingActionImpl.class, null, ShortCutType.NORMAL,
				"call-action", null);
		addIcon(WrappedSensingActionImpl.class, null, ShortCutType.NORMAL,
				"call-action", null);
		addIcon(ActuatingActionImpl.class, null, ShortCutType.NONE,
				"call-action", null);
		addIcon(WrappedActuatingActionImpl.class, null, ShortCutType.NONE,
				"call-action", null);
		addIcon(ActuatingActionImpl.class, null, ShortCutType.NORMAL,
				"call-action", null);
		addIcon(WrappedActuatingActionImpl.class, null, ShortCutType.NORMAL,
				"call-action", null);
		addIcon(TimingActionImpl.class, null, ShortCutType.NONE, "call-action",
				null);
		addIcon(WrappedTimingActionImpl.class, null, ShortCutType.NONE,
				"call-action", null);
		addIcon(TimingActionImpl.class, null, ShortCutType.NORMAL,
				"call-action", null);
		addIcon(WrappedTimingActionImpl.class, null, ShortCutType.NORMAL,
				"call-action", null);
		addIcon(UpdatePoolActionImpl.class, null, ShortCutType.NONE,
				"call-action", null);
		addIcon(WrappedUpdatePoolActionImpl.class, null, ShortCutType.NONE,
				"call-action", null);
		addIcon(UpdatePoolActionImpl.class, null, ShortCutType.NORMAL,
				"call-action", null);
		addIcon(WrappedUpdatePoolActionImpl.class, null, ShortCutType.NORMAL,
				"call-action", null);
		addIcon(GetNodeActionImpl.class, null, ShortCutType.NONE,
				"call-action", null);
		addIcon(WrappedGetNodeActionImpl.class, null, ShortCutType.NONE,
				"call-action", null);
		addIcon(GetNodeActionImpl.class, null, ShortCutType.NORMAL,
				"call-action", null);
		addIcon(WrappedGetNodeActionImpl.class, null, ShortCutType.NORMAL,
				"call-action", null);
		addIcon(GetDataActionImpl.class, null, ShortCutType.NONE,
				"call-action", null);
		addIcon(WrappedGetDataActionImpl.class, null, ShortCutType.NONE,
				"call-action", null);
		addIcon(GetDataActionImpl.class, null, ShortCutType.NORMAL,
				"call-action", null);
		addIcon(WrappedGetDataActionImpl.class, null, ShortCutType.NORMAL,
				"call-action", null);
		addIcon(RemoteTriggerActionImpl.class, null, ShortCutType.NONE,
				"call-action", null);
		addIcon(WrappedRemoteTriggerActionImpl.class, null, ShortCutType.NONE,
				"call-action", null);
		addIcon(RemoteTriggerActionImpl.class, null, ShortCutType.NORMAL,
				"call-action", null);
		addIcon(WrappedRemoteTriggerActionImpl.class, null,
				ShortCutType.NORMAL, "call-action", null);
		addIcon(OpaqueActionImpl.class, null, ShortCutType.NONE, "call-action",
				null);
		addIcon(WrappedOpaqueActionImpl.class, null, ShortCutType.NONE,
				"call-action", null);
		addIcon(OpaqueActionImpl.class, null, ShortCutType.NORMAL,
				"call-action", null);
		addIcon(WrappedOpaqueActionImpl.class, null, ShortCutType.NORMAL,
				"call-action", null);
		addIcon(AspectImpl.class, null, ShortCutType.NONE, "class", null);
		addIcon(WrappedAspectImpl.class, null, ShortCutType.NONE, "class", null);
		addIcon(AspectImpl.class, null, ShortCutType.NORMAL, "class", null);
		addIcon(WrappedAspectImpl.class, null, ShortCutType.NORMAL, "class",
				null);
		addIcon(PointcutImpl.class, null, ShortCutType.NONE, "class", null);
		addIcon(WrappedPointcutImpl.class, null, ShortCutType.NONE, "class",
				null);
		addIcon(PointcutImpl.class, null, ShortCutType.NORMAL, "class", null);
		addIcon(WrappedPointcutImpl.class, null, ShortCutType.NORMAL, "class",
				null);
		addIcon(AdviceImpl.class, null, ShortCutType.NONE, "state", null);
		addIcon(WrappedAdviceImpl.class, null, ShortCutType.NONE, "state", null);
		addIcon(AdviceImpl.class, null, ShortCutType.NORMAL, "state", null);
		addIcon(WrappedAdviceImpl.class, null, ShortCutType.NORMAL, "state",
				null);
		addIcon(PlatformSlotImpl.class, null, ShortCutType.NONE, "class", null);
		addIcon(WrappedPlatformSlotImpl.class, null, ShortCutType.NONE,
				"class", null);
		addIcon(PlatformSlotImpl.class, null, ShortCutType.NORMAL, "class",
				null);
		addIcon(WrappedPlatformSlotImpl.class, null, ShortCutType.NORMAL,
				"class", null);
		addIcon(ParametersImpl.class, null, ShortCutType.NONE, "class", null);
		addIcon(WrappedParametersImpl.class, null, ShortCutType.NONE, "class",
				null);
		addIcon(ParametersImpl.class, null, ShortCutType.NORMAL, "class", null);
		addIcon(WrappedParametersImpl.class, null, ShortCutType.NORMAL,
				"class", null);
		addIcon(RuntimeImpl.class, null, ShortCutType.NONE, "class", null);
		addIcon(WrappedRuntimeImpl.class, null, ShortCutType.NONE, "class",
				null);
		addIcon(RuntimeImpl.class, null, ShortCutType.NORMAL, "class", null);
		addIcon(WrappedRuntimeImpl.class, null, ShortCutType.NORMAL, "class",
				null);
		addIcon(ResourcesImpl.class, null, ShortCutType.NONE, "class", null);
		addIcon(WrappedResourcesImpl.class, null, ShortCutType.NONE, "class",
				null);
		addIcon(ResourcesImpl.class, null, ShortCutType.NORMAL, "class", null);
		addIcon(WrappedResourcesImpl.class, null, ShortCutType.NORMAL, "class",
				null);
		addIcon(BatteryImpl.class, null, ShortCutType.NONE, "class", null);
		addIcon(WrappedBatteryImpl.class, null, ShortCutType.NONE, "class",
				null);
		addIcon(BatteryImpl.class, null, ShortCutType.NORMAL, "class", null);
		addIcon(WrappedBatteryImpl.class, null, ShortCutType.NORMAL, "class",
				null);
		addIcon(DataLinkImpl.class, null, ShortCutType.NONE,
				"association-right", null);
		addIcon(WrappedDataLinkImpl.class, null, ShortCutType.NONE,
				"association-right", null);
		addIcon(DataLinkImpl.class, null, ShortCutType.NORMAL,
				"association-right", null);
		addIcon(WrappedDataLinkImpl.class, null, ShortCutType.NORMAL,
				"association-right", null);
		addIcon(SensingImpl.class, null, ShortCutType.NONE,
				"association-right", null);
		addIcon(WrappedSensingImpl.class, null, ShortCutType.NONE,
				"association-right", null);
		addIcon(SensingImpl.class, null, ShortCutType.NORMAL,
				"association-right", null);
		addIcon(WrappedSensingImpl.class, null, ShortCutType.NORMAL,
				"association-right", null);
		addIcon(ActuatingImpl.class, null, ShortCutType.NONE,
				"association-right", null);
		addIcon(WrappedActuatingImpl.class, null, ShortCutType.NONE,
				"association-right", null);
		addIcon(ActuatingImpl.class, null, ShortCutType.NORMAL,
				"association-right", null);
		addIcon(WrappedActuatingImpl.class, null, ShortCutType.NORMAL,
				"association-right", null);
		addIcon(TimingImpl.class, null, ShortCutType.NONE, "association-right",
				null);
		addIcon(WrappedTimingImpl.class, null, ShortCutType.NONE,
				"association-right", null);
		addIcon(TimingImpl.class, null, ShortCutType.NORMAL,
				"association-right", null);
		addIcon(WrappedTimingImpl.class, null, ShortCutType.NORMAL,
				"association-right", null);
		addIcon(TransitionImpl.class, null, ShortCutType.NONE, "transition",
				null);
		addIcon(WrappedTransitionImpl.class, null, ShortCutType.NONE,
				"transition", null);
		addIcon(TransitionImpl.class, null, ShortCutType.NORMAL, "transition",
				null);
		addIcon(WrappedTransitionImpl.class, null, ShortCutType.NORMAL,
				"transition", null);
		addIcon(ActivityEdgeImpl.class, null, ShortCutType.NONE,
				"association-right", null);
		addIcon(WrappedActivityEdgeImpl.class, null, ShortCutType.NONE,
				"association-right", null);
		addIcon(ActivityEdgeImpl.class, null, ShortCutType.NORMAL,
				"association-right", null);
		addIcon(WrappedActivityEdgeImpl.class, null, ShortCutType.NORMAL,
				"association-right", null);
	}

}
