package com.gentleware.poseidon.dsldeltaengine.gen;

import com.gentleware.poseidon.deltaengine.base.DEObject;
import com.gentleware.poseidon.dsldeltaengine.DSLDeltaEngine;
import com.gentleware.poseidon.dsldeltaengine.DSLNamespace;
import com.gentleware.poseidon.dsl.wsn.impl.*;
import com.gentleware.poseidon.model.wrapper.impl.*;
import com.gentleware.poseidon.repository.SemanticElementManager;
import org.eclipse.emf.ecore.EObject;
import com.gentleware.poseidon.diagrams.gen.base.DslGenElementRoles;

/*
 * This code is generated. All the hand-written changes will be lost.
 */

public class DslGenDSLDeltaEngine extends DSLDeltaEngine {

	@Override
	public DEObject locateObject(Object repositoryObject,
			boolean forceFeaturedElement) {
		DEObject convert = converted.get(repositoryObject);
		if (convert != null) {
			return convert;
		}
		java.lang.Class<?> cls = repositoryObject.getClass();
		SemanticElementManager semanticManager = SemanticElementManager
				.getInstance();
		if (convert == null
				&& (cls == WrappedObjectivesImpl.class || cls == ObjectivesImpl.class)) {
			if (convert == null) {
				convert = new DslGenObjectivesDEFeaturedComponent(
						(EObject) repositoryObject);
			}
		}

		if (convert == null
				&& (cls == WrappedSensorImpl.class || cls == SensorImpl.class)) {
			if (convert == null) {
				convert = new DslGenSensorDEFeaturedComponent(
						(EObject) repositoryObject);
			}
		}

		if (convert == null
				&& (cls == WrappedActuatorImpl.class || cls == ActuatorImpl.class)) {
			if (convert == null) {
				convert = new DslGenActuatorDEFeaturedComponent(
						(EObject) repositoryObject);
			}
		}

		if (convert == null
				&& (cls == WrappedTaskImpl.class || cls == TaskImpl.class)) {
			if (convert == null) {
				convert = new DslGenTaskDEFeaturedComponent(
						(EObject) repositoryObject);
			}
		}

		if (convert == null
				&& (cls == WrappedDataImpl.class || cls == DataImpl.class)) {
			if (convert == null) {
				convert = new DslGenDataDEFeaturedComponent(
						(EObject) repositoryObject);
			}
		}

		if (convert == null
				&& (cls == WrappedStateImpl.class || cls == StateImpl.class)) {
			if (convert == null) {
				convert = new DslGenStateDEFeaturedComponent(
						(EObject) repositoryObject);
			}
		}

		if (convert == null
				&& (cls == WrappedInitialStateImpl.class || cls == InitialStateImpl.class)) {
			if (convert == null) {
				convert = new DslGenInitialStateDEFeaturedComponent(
						(EObject) repositoryObject);
			}
		}

		if (convert == null
				&& (cls == WrappedFinalStateImpl.class || cls == FinalStateImpl.class)) {
			if (convert == null) {
				convert = new DslGenFinalStateDEFeaturedComponent(
						(EObject) repositoryObject);
			}
		}

		if (convert == null
				&& (cls == WrappedClusterImpl.class || cls == ClusterImpl.class)) {
			if (convert == null) {
				convert = new DslGenClusterDEFeaturedComponent(
						(EObject) repositoryObject);
			}
		}

		if (convert == null
				&& (cls == WrappedActivityImpl.class || cls == ActivityImpl.class)) {
			if (convert == null) {
				convert = new DslGenActivityDEFeaturedComponent(
						(EObject) repositoryObject);
			}
		}

		if (convert == null
				&& (cls == WrappedStateMachineImpl.class || cls == StateMachineImpl.class)) {
			if (convert == null) {
				convert = new DslGenStateMachineDEFeaturedComponent(
						(EObject) repositoryObject);
			}
		}

		if (convert == null
				&& (cls == WrappedTimerImpl.class || cls == TimerImpl.class)) {
			if (convert == null) {
				convert = new DslGenTimerDEFeaturedComponent(
						(EObject) repositoryObject);
			}
		}

		if (convert == null
				&& (cls == WrappedResourcesImpl.class || cls == ResourcesImpl.class)) {
			if (convert == null) {
				convert = new DslGenResourcesDEFeaturedComponent(
						(EObject) repositoryObject);
			}
		}

		if (convert == null
				&& (cls == WrappedParametersImpl.class || cls == ParametersImpl.class)) {
			if (convert == null) {
				convert = new DslGenParametersDEFeaturedComponent(
						(EObject) repositoryObject);
			}
		}

		if (convert == null
				&& (cls == WrappedBatteryImpl.class || cls == BatteryImpl.class)) {
			if (convert == null) {
				convert = new DslGenBatteryDEFeaturedComponent(
						(EObject) repositoryObject);
			}
		}

		if (convert == null
				&& (cls == WrappedAspectImpl.class || cls == AspectImpl.class)) {
			if (convert == null) {
				convert = new DslGenAspectDEFeaturedComponent(
						(EObject) repositoryObject);
			}
		}

		if (convert == null
				&& (cls == WrappedPointcutImpl.class || cls == PointcutImpl.class)) {
			if (convert == null) {
				convert = new DslGenPointcutDEFeaturedComponent(
						(EObject) repositoryObject);
			}
		}

		if (convert == null
				&& (cls == WrappedAdviceImpl.class || cls == AdviceImpl.class)) {
			if (convert == null) {
				convert = new DslGenAdviceDEFeaturedComponent(
						(EObject) repositoryObject);
			}
		}

		if (convert == null
				&& (cls == WrappedInitialNodeImpl.class || cls == InitialNodeImpl.class)) {
			if (convert == null) {
				convert = new DslGenInitialNodeDEFeaturedComponent(
						(EObject) repositoryObject);
			}
		}

		if (convert == null
				&& (cls == WrappedFinalNodeImpl.class || cls == FinalNodeImpl.class)) {
			if (convert == null) {
				convert = new DslGenFinalNodeDEFeaturedComponent(
						(EObject) repositoryObject);
			}
		}

		if (convert == null
				&& (cls == WrappedDecisionNodeImpl.class || cls == DecisionNodeImpl.class)) {
			if (convert == null) {
				convert = new DslGenDecisionNodeDEFeaturedComponent(
						(EObject) repositoryObject);
			}
		}

		if (convert == null
				&& (cls == WrappedMergeNodeImpl.class || cls == MergeNodeImpl.class)) {
			if (convert == null) {
				convert = new DslGenMergeNodeDEFeaturedComponent(
						(EObject) repositoryObject);
			}
		}

		if (convert == null
				&& (cls == WrappedOpaqueActionImpl.class || cls == OpaqueActionImpl.class)) {
			if (convert == null) {
				convert = new DslGenOpaqueActionDEFeaturedComponent(
						(EObject) repositoryObject);
			}
		}

		if (convert == null
				&& (cls == WrappedSensingActionImpl.class || cls == SensingActionImpl.class)) {
			if (convert == null) {
				convert = new DslGenSensingActionDEFeaturedComponent(
						(EObject) repositoryObject);
			}
		}

		if (convert == null
				&& (cls == WrappedActuatingActionImpl.class || cls == ActuatingActionImpl.class)) {
			if (convert == null) {
				convert = new DslGenActuatingActionDEFeaturedComponent(
						(EObject) repositoryObject);
			}
		}

		if (convert == null
				&& (cls == WrappedTimingActionImpl.class || cls == TimingActionImpl.class)) {
			if (convert == null) {
				convert = new DslGenTimingActionDEFeaturedComponent(
						(EObject) repositoryObject);
			}
		}

		if (convert == null
				&& (cls == WrappedVariableImpl.class || cls == VariableImpl.class)) {
			Object container = ((EObject) repositoryObject).eContainer();
			if (!forceFeaturedElement) {
				if (container instanceof EObject) {
					String containerRole = semanticManager
							.getRole((EObject) container);
					if (DslGenElementRoles.DATA.equals(containerRole)) {
						convert = new DslGenVariableDEFeatureComponent(
								(EObject) repositoryObject);
					}
				}
			}
			if (convert == null) {
				convert = new DslGenVariableDEFeaturedComponent(
						(EObject) repositoryObject);
			}
		}

		if (convert == null
				&& (cls == WrappedUpdatePoolActionImpl.class || cls == UpdatePoolActionImpl.class)) {
			if (convert == null) {
				convert = new DslGenUpdatePoolActionDEFeaturedComponent(
						(EObject) repositoryObject);
			}
		}

		if (convert == null
				&& (cls == WrappedGetNodeActionImpl.class || cls == GetNodeActionImpl.class)) {
			if (convert == null) {
				convert = new DslGenGetNodeActionDEFeaturedComponent(
						(EObject) repositoryObject);
			}
		}

		if (convert == null
				&& (cls == WrappedRemoteTriggerActionImpl.class || cls == RemoteTriggerActionImpl.class)) {
			if (convert == null) {
				convert = new DslGenRemoteTriggerActionDEFeaturedComponent(
						(EObject) repositoryObject);
			}
		}

		if (convert == null
				&& (cls == WrappedGetDataActionImpl.class || cls == GetDataActionImpl.class)) {
			if (convert == null) {
				convert = new DslGenGetDataActionDEFeaturedComponent(
						(EObject) repositoryObject);
			}
		}

		if (convert == null
				&& (cls == WrappedActivationProfileImpl.class || cls == ActivationProfileImpl.class)) {
			if (convert == null) {
				convert = new DslGenActivationProfileDEFeaturedComponent(
						(EObject) repositoryObject);
			}
		}

		if (convert == null
				&& (cls == WrappedRuntimeImpl.class || cls == RuntimeImpl.class)) {
			if (convert == null) {
				convert = new DslGenRuntimeDEFeaturedComponent(
						(EObject) repositoryObject);
			}
		}

		if (convert == null
				&& (cls == WrappedPlatformSlotImpl.class || cls == PlatformSlotImpl.class)) {
			if (convert == null) {
				convert = new DslGenPlatformSlotDEFeaturedComponent(
						(EObject) repositoryObject);
			}
		}

		if (convert == null
				&& semanticManager
						.isElementANamespace((EObject) repositoryObject)) {
			convert = new DSLNamespace((EObject) repositoryObject);
		}

		if (convert != null) {
			converted.put(repositoryObject, convert);
			uuidConverted.put(
					semanticManager.getId((EObject) repositoryObject), convert);
		}
		return convert;
	}

}
