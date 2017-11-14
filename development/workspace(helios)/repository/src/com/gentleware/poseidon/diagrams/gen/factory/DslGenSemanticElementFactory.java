package com.gentleware.poseidon.diagrams.gen.factory;

import org.eclipse.emf.ecore.*;
import com.gentleware.poseidon.dsl.*;
import com.gentleware.poseidon.custom.diagrams.factory.impl.SemanticElementFactoryImpl;
import com.gentleware.poseidon.diagrams.factory.AbstractSemanticElementFactory;
import com.gentleware.poseidon.repository.SemanticElementManager;
import com.gentleware.poseidon.model.wrapper.WrapperFactory;
import com.gentleware.poseidon.model.wrapper.WrapperPackage;
import com.gentleware.poseidon.diagrams.gen.base.DslGenElementRoles;
import org.eclipse.emf.common.util.EList;

/*
 * This code is generated. All the hand-written changes will be lost.
 */

public abstract class DslGenSemanticElementFactory extends
		AbstractSemanticElementFactory {
	private static SemanticElementFactoryImpl instance = new SemanticElementFactoryImpl();

	public static synchronized SemanticElementFactoryImpl getInstance() {
		return instance;
	}

	public EObject createClusterSemanticElement(EObject owner) {
		MetamodelElementWrapper element = null;
		element = (MetamodelElementWrapper) WrapperFactory.eINSTANCE
				.create(WrapperPackage.eINSTANCE.getWrappedCluster());

		semanticManager.setRole(element, DslGenElementRoles.CLUSTER);

		semanticManager.addSemanticElementToOwner(element, owner);
		addModelAdapters(element);
		return element;
	}

	public EObject createObjectivesSemanticElement(EObject owner) {
		MetamodelElementWrapper element = null;
		element = (MetamodelElementWrapper) WrapperFactory.eINSTANCE
				.create(WrapperPackage.eINSTANCE.getWrappedObjectives());

		semanticManager.setRole(element, DslGenElementRoles.OBJECTIVES);

		semanticManager.addSemanticElementToOwner(element, owner);
		addModelAdapters(element);
		return element;
	}

	public EObject createTaskSemanticElement(EObject owner) {
		MetamodelElementWrapper element = null;
		element = (MetamodelElementWrapper) WrapperFactory.eINSTANCE
				.create(WrapperPackage.eINSTANCE.getWrappedTask());

		semanticManager.setRole(element, DslGenElementRoles.TASK);

		semanticManager.addSemanticElementToOwner(element, owner);
		addModelAdapters(element);
		return element;
	}

	public EObject createActivationProfileSemanticElement(EObject owner) {
		MetamodelElementWrapper element = null;
		element = (MetamodelElementWrapper) WrapperFactory.eINSTANCE
				.create(WrapperPackage.eINSTANCE.getWrappedActivationProfile());

		semanticManager.setRole(element, DslGenElementRoles.ACTIVATIONPROFILE);

		semanticManager.addSemanticElementToOwner(element, owner);
		addModelAdapters(element);
		return element;
	}

	public EObject createDataSemanticElement(EObject owner) {
		MetamodelElementWrapper element = null;
		element = (MetamodelElementWrapper) WrapperFactory.eINSTANCE
				.create(WrapperPackage.eINSTANCE.getWrappedData());

		semanticManager.setRole(element, DslGenElementRoles.DATA);

		if (element instanceof MetamodelElementWrapper) {
			((MetamodelElementWrapper) element).set__poseidonNamespace(true);
		}

		semanticManager.addSemanticElementToOwner(element, owner);
		addModelAdapters(element);
		return element;
	}

	public EObject createVariableSemanticElement(EObject owner) {
		MetamodelElementWrapper element = null;
		element = (MetamodelElementWrapper) WrapperFactory.eINSTANCE
				.create(WrapperPackage.eINSTANCE.getWrappedVariable());

		semanticManager.setRole(element, DslGenElementRoles.VARIABLE);

		semanticManager.addSemanticElementToOwner(element, owner);
		addModelAdapters(element);
		return element;
	}

	public EObject createSensorSemanticElement(EObject owner) {
		MetamodelElementWrapper element = null;
		element = (MetamodelElementWrapper) WrapperFactory.eINSTANCE
				.create(WrapperPackage.eINSTANCE.getWrappedSensor());

		semanticManager.setRole(element, DslGenElementRoles.SENSOR);

		semanticManager.addSemanticElementToOwner(element, owner);
		addModelAdapters(element);
		return element;
	}

	public EObject createActuatorSemanticElement(EObject owner) {
		MetamodelElementWrapper element = null;
		element = (MetamodelElementWrapper) WrapperFactory.eINSTANCE
				.create(WrapperPackage.eINSTANCE.getWrappedActuator());

		semanticManager.setRole(element, DslGenElementRoles.ACTUATOR);

		semanticManager.addSemanticElementToOwner(element, owner);
		addModelAdapters(element);
		return element;
	}

	public EObject createTimerSemanticElement(EObject owner) {
		MetamodelElementWrapper element = null;
		element = (MetamodelElementWrapper) WrapperFactory.eINSTANCE
				.create(WrapperPackage.eINSTANCE.getWrappedTimer());

		semanticManager.setRole(element, DslGenElementRoles.TIMER);

		semanticManager.addSemanticElementToOwner(element, owner);
		addModelAdapters(element);
		return element;
	}

	public EObject createStateMachineSemanticElement(EObject owner) {
		MetamodelElementWrapper element = null;
		element = (MetamodelElementWrapper) WrapperFactory.eINSTANCE
				.create(WrapperPackage.eINSTANCE.getWrappedStateMachine());

		semanticManager.setRole(element, DslGenElementRoles.STATEMACHINE);

		if (element instanceof MetamodelElementWrapper) {
			((MetamodelElementWrapper) element).set__poseidonNamespace(true);
		}

		semanticManager.addSemanticElementToOwner(element, owner);
		addModelAdapters(element);
		return element;
	}

	public EObject createStateSemanticElement(EObject owner) {
		MetamodelElementWrapper element = null;
		element = (MetamodelElementWrapper) WrapperFactory.eINSTANCE
				.create(WrapperPackage.eINSTANCE.getWrappedState());

		semanticManager.setRole(element, DslGenElementRoles.STATE);

		semanticManager.addSemanticElementToOwner(element, owner);
		addModelAdapters(element);
		return element;
	}

	public EObject createInitialStateSemanticElement(EObject owner) {
		MetamodelElementWrapper element = null;
		element = (MetamodelElementWrapper) WrapperFactory.eINSTANCE
				.create(WrapperPackage.eINSTANCE.getWrappedInitialState());

		semanticManager.setRole(element, DslGenElementRoles.INITIALSTATE);

		semanticManager.addSemanticElementToOwner(element, owner);
		addModelAdapters(element);
		return element;
	}

	public EObject createFinalStateSemanticElement(EObject owner) {
		MetamodelElementWrapper element = null;
		element = (MetamodelElementWrapper) WrapperFactory.eINSTANCE
				.create(WrapperPackage.eINSTANCE.getWrappedFinalState());

		semanticManager.setRole(element, DslGenElementRoles.FINALSTATE);

		semanticManager.addSemanticElementToOwner(element, owner);
		addModelAdapters(element);
		return element;
	}

	public EObject createActivitySemanticElement(EObject owner) {
		MetamodelElementWrapper element = null;
		element = (MetamodelElementWrapper) WrapperFactory.eINSTANCE
				.create(WrapperPackage.eINSTANCE.getWrappedActivity());

		semanticManager.setRole(element, DslGenElementRoles.ACTIVITY);

		if (element instanceof MetamodelElementWrapper) {
			((MetamodelElementWrapper) element).set__poseidonNamespace(true);
		}

		semanticManager.addSemanticElementToOwner(element, owner);
		addModelAdapters(element);
		return element;
	}

	public EObject createInitialNodeSemanticElement(EObject owner) {
		MetamodelElementWrapper element = null;
		element = (MetamodelElementWrapper) WrapperFactory.eINSTANCE
				.create(WrapperPackage.eINSTANCE.getWrappedInitialNode());

		semanticManager.setRole(element, DslGenElementRoles.INITIALNODE);

		semanticManager.addSemanticElementToOwner(element, owner);
		addModelAdapters(element);
		return element;
	}

	public EObject createFinalNodeSemanticElement(EObject owner) {
		MetamodelElementWrapper element = null;
		element = (MetamodelElementWrapper) WrapperFactory.eINSTANCE
				.create(WrapperPackage.eINSTANCE.getWrappedFinalNode());

		semanticManager.setRole(element, DslGenElementRoles.FINALNODE);

		semanticManager.addSemanticElementToOwner(element, owner);
		addModelAdapters(element);
		return element;
	}

	public EObject createDecisionNodeSemanticElement(EObject owner) {
		MetamodelElementWrapper element = null;
		element = (MetamodelElementWrapper) WrapperFactory.eINSTANCE
				.create(WrapperPackage.eINSTANCE.getWrappedDecisionNode());

		semanticManager.setRole(element, DslGenElementRoles.DECISIONNODE);

		semanticManager.addSemanticElementToOwner(element, owner);
		addModelAdapters(element);
		return element;
	}

	public EObject createMergeNodeSemanticElement(EObject owner) {
		MetamodelElementWrapper element = null;
		element = (MetamodelElementWrapper) WrapperFactory.eINSTANCE
				.create(WrapperPackage.eINSTANCE.getWrappedMergeNode());

		semanticManager.setRole(element, DslGenElementRoles.MERGENODE);

		semanticManager.addSemanticElementToOwner(element, owner);
		addModelAdapters(element);
		return element;
	}

	public EObject createSensingActionSemanticElement(EObject owner) {
		MetamodelElementWrapper element = null;
		element = (MetamodelElementWrapper) WrapperFactory.eINSTANCE
				.create(WrapperPackage.eINSTANCE.getWrappedSensingAction());

		semanticManager.setRole(element, DslGenElementRoles.SENSINGACTION);

		semanticManager.addSemanticElementToOwner(element, owner);
		addModelAdapters(element);
		return element;
	}

	public EObject createActuatingActionSemanticElement(EObject owner) {
		MetamodelElementWrapper element = null;
		element = (MetamodelElementWrapper) WrapperFactory.eINSTANCE
				.create(WrapperPackage.eINSTANCE.getWrappedActuatingAction());

		semanticManager.setRole(element, DslGenElementRoles.ACTUATINGACTION);

		semanticManager.addSemanticElementToOwner(element, owner);
		addModelAdapters(element);
		return element;
	}

	public EObject createTimingActionSemanticElement(EObject owner) {
		MetamodelElementWrapper element = null;
		element = (MetamodelElementWrapper) WrapperFactory.eINSTANCE
				.create(WrapperPackage.eINSTANCE.getWrappedTimingAction());

		semanticManager.setRole(element, DslGenElementRoles.TIMINGACTION);

		semanticManager.addSemanticElementToOwner(element, owner);
		addModelAdapters(element);
		return element;
	}

	public EObject createUpdatePoolActionSemanticElement(EObject owner) {
		MetamodelElementWrapper element = null;
		element = (MetamodelElementWrapper) WrapperFactory.eINSTANCE
				.create(WrapperPackage.eINSTANCE.getWrappedUpdatePoolAction());

		semanticManager.setRole(element, DslGenElementRoles.UPDATEPOOLACTION);

		semanticManager.addSemanticElementToOwner(element, owner);
		addModelAdapters(element);
		return element;
	}

	public EObject createGetNodeActionSemanticElement(EObject owner) {
		MetamodelElementWrapper element = null;
		element = (MetamodelElementWrapper) WrapperFactory.eINSTANCE
				.create(WrapperPackage.eINSTANCE.getWrappedGetNodeAction());

		semanticManager.setRole(element, DslGenElementRoles.GETNODEACTION);

		semanticManager.addSemanticElementToOwner(element, owner);
		addModelAdapters(element);
		return element;
	}

	public EObject createGetDataActionSemanticElement(EObject owner) {
		MetamodelElementWrapper element = null;
		element = (MetamodelElementWrapper) WrapperFactory.eINSTANCE
				.create(WrapperPackage.eINSTANCE.getWrappedGetDataAction());

		semanticManager.setRole(element, DslGenElementRoles.GETDATAACTION);

		semanticManager.addSemanticElementToOwner(element, owner);
		addModelAdapters(element);
		return element;
	}

	public EObject createRemoteTriggerActionSemanticElement(EObject owner) {
		MetamodelElementWrapper element = null;
		element = (MetamodelElementWrapper) WrapperFactory.eINSTANCE
				.create(WrapperPackage.eINSTANCE
						.getWrappedRemoteTriggerAction());

		semanticManager
				.setRole(element, DslGenElementRoles.REMOTETRIGGERACTION);

		semanticManager.addSemanticElementToOwner(element, owner);
		addModelAdapters(element);
		return element;
	}

	public EObject createOpaqueActionSemanticElement(EObject owner) {
		MetamodelElementWrapper element = null;
		element = (MetamodelElementWrapper) WrapperFactory.eINSTANCE
				.create(WrapperPackage.eINSTANCE.getWrappedOpaqueAction());

		semanticManager.setRole(element, DslGenElementRoles.OPAQUEACTION);

		semanticManager.addSemanticElementToOwner(element, owner);
		addModelAdapters(element);
		return element;
	}

	public EObject createAspectSemanticElement(EObject owner) {
		MetamodelElementWrapper element = null;
		element = (MetamodelElementWrapper) WrapperFactory.eINSTANCE
				.create(WrapperPackage.eINSTANCE.getWrappedAspect());

		semanticManager.setRole(element, DslGenElementRoles.ASPECT);

		if (element instanceof MetamodelElementWrapper) {
			((MetamodelElementWrapper) element).set__poseidonNamespace(true);
		}

		semanticManager.addSemanticElementToOwner(element, owner);
		addModelAdapters(element);
		return element;
	}

	public EObject createPointcutSemanticElement(EObject owner) {
		MetamodelElementWrapper element = null;
		element = (MetamodelElementWrapper) WrapperFactory.eINSTANCE
				.create(WrapperPackage.eINSTANCE.getWrappedPointcut());

		semanticManager.setRole(element, DslGenElementRoles.POINTCUT);

		semanticManager.addSemanticElementToOwner(element, owner);
		addModelAdapters(element);
		return element;
	}

	public EObject createAdviceSemanticElement(EObject owner) {
		MetamodelElementWrapper element = null;
		element = (MetamodelElementWrapper) WrapperFactory.eINSTANCE
				.create(WrapperPackage.eINSTANCE.getWrappedAdvice());

		semanticManager.setRole(element, DslGenElementRoles.ADVICE);

		if (element instanceof MetamodelElementWrapper) {
			((MetamodelElementWrapper) element).set__poseidonNamespace(true);
		}

		semanticManager.addSemanticElementToOwner(element, owner);
		addModelAdapters(element);
		return element;
	}

	public EObject createPlatformSlotSemanticElement(EObject owner) {
		MetamodelElementWrapper element = null;
		element = (MetamodelElementWrapper) WrapperFactory.eINSTANCE
				.create(WrapperPackage.eINSTANCE.getWrappedPlatformSlot());

		semanticManager.setRole(element, DslGenElementRoles.PLATFORMSLOT);

		if (element instanceof MetamodelElementWrapper) {
			((MetamodelElementWrapper) element).set__poseidonNamespace(true);
		}

		semanticManager.addSemanticElementToOwner(element, owner);
		addModelAdapters(element);
		return element;
	}

	public EObject createParametersSemanticElement(EObject owner) {
		MetamodelElementWrapper element = null;
		element = (MetamodelElementWrapper) WrapperFactory.eINSTANCE
				.create(WrapperPackage.eINSTANCE.getWrappedParameters());

		semanticManager.setRole(element, DslGenElementRoles.PARAMETERS);

		semanticManager.addSemanticElementToOwner(element, owner);
		addModelAdapters(element);
		return element;
	}

	public EObject createRuntimeSemanticElement(EObject owner) {
		MetamodelElementWrapper element = null;
		element = (MetamodelElementWrapper) WrapperFactory.eINSTANCE
				.create(WrapperPackage.eINSTANCE.getWrappedRuntime());

		semanticManager.setRole(element, DslGenElementRoles.RUNTIME);

		semanticManager.addSemanticElementToOwner(element, owner);
		addModelAdapters(element);
		return element;
	}

	public EObject createResourcesSemanticElement(EObject owner) {
		MetamodelElementWrapper element = null;
		element = (MetamodelElementWrapper) WrapperFactory.eINSTANCE
				.create(WrapperPackage.eINSTANCE.getWrappedResources());

		semanticManager.setRole(element, DslGenElementRoles.RESOURCES);

		semanticManager.addSemanticElementToOwner(element, owner);
		addModelAdapters(element);
		return element;
	}

	public EObject createBatterySemanticElement(EObject owner) {
		MetamodelElementWrapper element = null;
		element = (MetamodelElementWrapper) WrapperFactory.eINSTANCE
				.create(WrapperPackage.eINSTANCE.getWrappedBattery());

		semanticManager.setRole(element, DslGenElementRoles.BATTERY);

		semanticManager.addSemanticElementToOwner(element, owner);
		addModelAdapters(element);
		return element;
	}

	public EObject createDataLinkSemanticElement(EObject source, EObject target) {
		MetamodelElementWrapper edge = null;
		EObject owner = source.eContainer();
		if (semanticManager.isElementANamespace(owner)) {
			final MetamodelElementWrapper namespace = (MetamodelElementWrapper) owner;
			edge = (MetamodelElementWrapper) WrapperFactory.eINSTANCE
					.create(WrapperPackage.eINSTANCE.getWrappedDataLink());

			if (edge instanceof MetamodelElementWrapper) {
				((MetamodelElementWrapper) edge).set__poseidonEdge(true);
				((MetamodelElementWrapper) edge)
						.set__poseidonRole(DslGenElementRoles.DATALINK);
			}

			semanticManager.addSemanticElementToOwner(edge, namespace);
			semanticManager.setSourceForEdge(edge, source);
			semanticManager.setTargetForEdge(edge, target);
			addModelAdapters(edge);
		}
		return edge;
	}

	public EObject createSensingSemanticElement(EObject source, EObject target) {
		MetamodelElementWrapper edge = null;
		EObject owner = source.eContainer();
		if (semanticManager.isElementANamespace(owner)) {
			final MetamodelElementWrapper namespace = (MetamodelElementWrapper) owner;
			edge = (MetamodelElementWrapper) WrapperFactory.eINSTANCE
					.create(WrapperPackage.eINSTANCE.getWrappedSensing());

			if (edge instanceof MetamodelElementWrapper) {
				((MetamodelElementWrapper) edge).set__poseidonEdge(true);
				((MetamodelElementWrapper) edge)
						.set__poseidonRole(DslGenElementRoles.SENSING);
			}

			semanticManager.addSemanticElementToOwner(edge, namespace);
			semanticManager.setSourceForEdge(edge, source);
			semanticManager.setTargetForEdge(edge, target);
			addModelAdapters(edge);
		}
		return edge;
	}

	public EObject createActuatingSemanticElement(EObject source, EObject target) {
		MetamodelElementWrapper edge = null;
		EObject owner = source.eContainer();
		if (semanticManager.isElementANamespace(owner)) {
			final MetamodelElementWrapper namespace = (MetamodelElementWrapper) owner;
			edge = (MetamodelElementWrapper) WrapperFactory.eINSTANCE
					.create(WrapperPackage.eINSTANCE.getWrappedActuating());

			if (edge instanceof MetamodelElementWrapper) {
				((MetamodelElementWrapper) edge).set__poseidonEdge(true);
				((MetamodelElementWrapper) edge)
						.set__poseidonRole(DslGenElementRoles.ACTUATING);
			}

			semanticManager.addSemanticElementToOwner(edge, namespace);
			semanticManager.setSourceForEdge(edge, source);
			semanticManager.setTargetForEdge(edge, target);
			addModelAdapters(edge);
		}
		return edge;
	}

	public EObject createTimingSemanticElement(EObject source, EObject target) {
		MetamodelElementWrapper edge = null;
		EObject owner = source.eContainer();
		if (semanticManager.isElementANamespace(owner)) {
			final MetamodelElementWrapper namespace = (MetamodelElementWrapper) owner;
			edge = (MetamodelElementWrapper) WrapperFactory.eINSTANCE
					.create(WrapperPackage.eINSTANCE.getWrappedTiming());

			if (edge instanceof MetamodelElementWrapper) {
				((MetamodelElementWrapper) edge).set__poseidonEdge(true);
				((MetamodelElementWrapper) edge)
						.set__poseidonRole(DslGenElementRoles.TIMING);
			}

			semanticManager.addSemanticElementToOwner(edge, namespace);
			semanticManager.setSourceForEdge(edge, source);
			semanticManager.setTargetForEdge(edge, target);
			addModelAdapters(edge);
		}
		return edge;
	}

	public EObject createTransitionSemanticElement(EObject source,
			EObject target) {
		MetamodelElementWrapper edge = null;
		EObject owner = source.eContainer();
		if (semanticManager.isElementANamespace(owner)) {
			final MetamodelElementWrapper namespace = (MetamodelElementWrapper) owner;
			edge = (MetamodelElementWrapper) WrapperFactory.eINSTANCE
					.create(WrapperPackage.eINSTANCE.getWrappedTransition());

			if (edge instanceof MetamodelElementWrapper) {
				((MetamodelElementWrapper) edge).set__poseidonEdge(true);
				((MetamodelElementWrapper) edge)
						.set__poseidonRole(DslGenElementRoles.TRANSITION);
			}

			semanticManager.addSemanticElementToOwner(edge, namespace);
			semanticManager.setSourceForEdge(edge, source);
			semanticManager.setTargetForEdge(edge, target);
			addModelAdapters(edge);
		}
		return edge;
	}

	public EObject createActivityEdgeSemanticElement(EObject source,
			EObject target) {
		MetamodelElementWrapper edge = null;
		EObject owner = source.eContainer();
		if (semanticManager.isElementANamespace(owner)) {
			final MetamodelElementWrapper namespace = (MetamodelElementWrapper) owner;
			edge = (MetamodelElementWrapper) WrapperFactory.eINSTANCE
					.create(WrapperPackage.eINSTANCE.getWrappedActivityEdge());

			if (edge instanceof MetamodelElementWrapper) {
				((MetamodelElementWrapper) edge).set__poseidonEdge(true);
				((MetamodelElementWrapper) edge)
						.set__poseidonRole(DslGenElementRoles.ACTIVITYEDGE);
			}

			semanticManager.addSemanticElementToOwner(edge, namespace);
			semanticManager.setSourceForEdge(edge, source);
			semanticManager.setTargetForEdge(edge, target);
			addModelAdapters(edge);
		}
		return edge;
	}

}
