package com.gentleware.poseidon.diagrams.gen.base;

import org.eclipse.emf.ecore.*;
import com.gentleware.poseidon.dsl.*;
import com.gentleware.poseidon.repository.SemanticElementManager;
import com.gentleware.poseidon.model.wrapper.WrapperFactory;
import com.gentleware.poseidon.model.wrapper.WrapperPackage;
import com.gentleware.poseidon.diagrams.gen.base.DslGenElementRoles;
import org.eclipse.emf.common.util.EList;
import com.gentleware.poseidon.model.wrapper.WrappedMetamodelElementSub;
import java.util.List;
import java.util.ArrayList;
import com.gentleware.poseidon.dsl.wsn.*;
import org.eclipse.emf.common.util.UniqueEList;

/*
 * This code is generated. All the hand-written changes will be lost.
 */

public class DslGenSemanticElementManager extends SemanticElementManager {

	@Override
	public boolean addSemanticElementToOwner(EObject childElement,
			EObject ownerElement) {

		String ownerElementRole = getRole(ownerElement);
		String childElementRole = getRole(childElement);

		if (DslGenElementRoles.DATA.equals(ownerElementRole)) {

			if (DslGenElementRoles.VARIABLE.equals(childElementRole)) {

				if (ownerElement instanceof com.gentleware.poseidon.dsl.wsn.Data
						&& childElement instanceof com.gentleware.poseidon.dsl.wsn.Variable) {

					EList<Variable> childrenList = ((com.gentleware.poseidon.dsl.wsn.Data) ownerElement)
							.getVariable();
					return childrenList.add((Variable) childElement);

				}
			}

		}

		if (DslGenElementRoles.STATEMACHINE.equals(ownerElementRole)) {

		}

		if (DslGenElementRoles.ACTIVITY.equals(ownerElementRole)) {

			if (DslGenElementRoles.INITIALNODE.equals(childElementRole)) {

				if (ownerElement instanceof com.gentleware.poseidon.dsl.wsn.Activity
						&& childElement instanceof com.gentleware.poseidon.dsl.wsn.ActivityNode) {

					((com.gentleware.poseidon.dsl.wsn.Activity) ownerElement)
							.setInitialNode((ActivityNode) childElement);
					return true;

				}
			}

		}

		if (DslGenElementRoles.ASPECT.equals(ownerElementRole)) {

		}

		if (DslGenElementRoles.ADVICE.equals(ownerElementRole)) {

			if (DslGenElementRoles.INITIALNODE.equals(childElementRole)) {

				if (ownerElement instanceof com.gentleware.poseidon.dsl.wsn.Activity
						&& childElement instanceof com.gentleware.poseidon.dsl.wsn.ActivityNode) {

					((com.gentleware.poseidon.dsl.wsn.Activity) ownerElement)
							.setInitialNode((ActivityNode) childElement);
					return true;

				}
			}

		}

		if (DslGenElementRoles.PLATFORMSLOT.equals(ownerElementRole)) {

		}

		if (isElementANamespace(ownerElement)) {
			return ((MetamodelElementWrapper) ownerElement).get__ownedMember()
					.add(childElement);
		}
		return false;
	}

	@Override
	public boolean removeSemanticElementFromOwner(EObject childElement,
			EObject ownerElement) {

		String ownerElementRole = getRole(ownerElement);
		String childElementRole = getRole(childElement);

		if (DslGenElementRoles.DATA.equals(ownerElementRole)) {

			if (DslGenElementRoles.VARIABLE.equals(childElementRole)) {

				if (ownerElement instanceof com.gentleware.poseidon.dsl.wsn.Data
						&& childElement instanceof com.gentleware.poseidon.dsl.wsn.Variable) {

					EList<Variable> childrenList = ((com.gentleware.poseidon.dsl.wsn.Data) ownerElement)
							.getVariable();
					return childrenList.remove((Variable) childElement);

				}
			}

		}

		if (DslGenElementRoles.STATEMACHINE.equals(ownerElementRole)) {

		}

		if (DslGenElementRoles.ACTIVITY.equals(ownerElementRole)) {

			if (DslGenElementRoles.INITIALNODE.equals(childElementRole)) {

				if (ownerElement instanceof com.gentleware.poseidon.dsl.wsn.Activity
						&& childElement instanceof com.gentleware.poseidon.dsl.wsn.ActivityNode) {

					((com.gentleware.poseidon.dsl.wsn.Activity) ownerElement)
							.setInitialNode(null);
					return true;

				}
			}

		}

		if (DslGenElementRoles.ASPECT.equals(ownerElementRole)) {

		}

		if (DslGenElementRoles.ADVICE.equals(ownerElementRole)) {

			if (DslGenElementRoles.INITIALNODE.equals(childElementRole)) {

				if (ownerElement instanceof com.gentleware.poseidon.dsl.wsn.Activity
						&& childElement instanceof com.gentleware.poseidon.dsl.wsn.ActivityNode) {

					((com.gentleware.poseidon.dsl.wsn.Activity) ownerElement)
							.setInitialNode(null);
					return true;

				}
			}

		}

		if (DslGenElementRoles.PLATFORMSLOT.equals(ownerElementRole)) {

		}

		if (isElementANamespace(ownerElement)) {
			return ((MetamodelElementWrapper) ownerElement).get__ownedMember()
					.remove(childElement);
		}
		return false;
	}

	@Override
	public EObject getSourceForEdge(EObject edge) {
		if (edge == null) {
			return null;
		}
		String edgeRole = getRole(edge);

		if (DslGenElementRoles.DATALINK.equals(edgeRole)) {
			if (edge instanceof DataLink) {
				return ((DataLink) edge).getTask();
			}
		}

		if (DslGenElementRoles.SENSING.equals(edgeRole)) {
			if (edge instanceof Sensing) {
				return ((Sensing) edge).getTask();
			}
		}

		if (DslGenElementRoles.ACTUATING.equals(edgeRole)) {
			if (edge instanceof Actuating) {
				return ((Actuating) edge).getTask();
			}
		}

		if (DslGenElementRoles.TIMING.equals(edgeRole)) {
			if (edge instanceof Timing) {
				return ((Timing) edge).getTask();
			}
		}

		if (DslGenElementRoles.TRANSITION.equals(edgeRole)) {
			if (edge instanceof Transition) {
				return ((Transition) edge).getTransitionFrom();
			}
		}

		if (DslGenElementRoles.ACTIVITYEDGE.equals(edgeRole)) {
			if (edge instanceof ActivityEdge) {
				return ((ActivityEdge) edge).getSource();
			}
		}

		if (edge instanceof MetamodelElementWrapper
				&& ((MetamodelElementWrapper) edge).is__poseidonEdge()) {
			MetamodelElementWrapper poseidonEdge = (MetamodelElementWrapper) edge;
			return poseidonEdge.get__source();
		} else if (!(edge instanceof MetamodelElementWrapper)) {
			MetamodelElementWrapper elementSub = getElementSub(edge);
			if (elementSub != null) {
				return elementSub.get__source();
			}
		}
		return null;
	}

	@Override
	public EObject getTargetForEdge(EObject edge) {
		if (edge == null) {
			return null;
		}
		String edgeRole = getRole(edge);

		if (DslGenElementRoles.DATALINK.equals(edgeRole)) {
			if (edge instanceof DataLink) {
				return ((DataLink) edge).getData();
			}
		}

		if (DslGenElementRoles.SENSING.equals(edgeRole)) {
			if (edge instanceof Sensing) {
				return ((Sensing) edge).getSensor();
			}
		}

		if (DslGenElementRoles.ACTUATING.equals(edgeRole)) {
			if (edge instanceof Actuating) {
				return ((Actuating) edge).getActuator();
			}
		}

		if (DslGenElementRoles.TIMING.equals(edgeRole)) {
			if (edge instanceof Timing) {
				return ((Timing) edge).getTimer();
			}
		}

		if (DslGenElementRoles.TRANSITION.equals(edgeRole)) {
			if (edge instanceof Transition) {
				return ((Transition) edge).getTransitionTo();
			}
		}

		if (DslGenElementRoles.ACTIVITYEDGE.equals(edgeRole)) {
			if (edge instanceof ActivityEdge) {
				return ((ActivityEdge) edge).getTarget();
			}
		}

		if (edge instanceof MetamodelElementWrapper
				&& ((MetamodelElementWrapper) edge).is__poseidonEdge()) {
			MetamodelElementWrapper poseidonEdge = (MetamodelElementWrapper) edge;
			return poseidonEdge.get__target();
		} else if (!(edge instanceof MetamodelElementWrapper)) {
			MetamodelElementWrapper elementSub = getElementSub(edge);
			if (elementSub != null) {
				return elementSub.get__target();
			}
		}
		return null;
	}

	@Override
	public boolean setSourceForEdge(EObject edge, EObject source) {
		if (edge == null || source == null) {
			return false;
		}
		String edgeRole = getRole(edge);

		if (DslGenElementRoles.DATALINK.equals(edgeRole)) {
			if (edge instanceof DataLink && source instanceof Task) {
				((DataLink) edge).setTask((Task) source);
				return true;
			}
		}

		if (DslGenElementRoles.SENSING.equals(edgeRole)) {
			if (edge instanceof Sensing && source instanceof Task) {
				((Sensing) edge).setTask((Task) source);
				return true;
			}
		}

		if (DslGenElementRoles.ACTUATING.equals(edgeRole)) {
			if (edge instanceof Actuating && source instanceof Task) {
				((Actuating) edge).setTask((Task) source);
				return true;
			}
		}

		if (DslGenElementRoles.TIMING.equals(edgeRole)) {
			if (edge instanceof Timing && source instanceof Task) {
				((Timing) edge).setTask((Task) source);
				return true;
			}
		}

		if (DslGenElementRoles.TRANSITION.equals(edgeRole)) {
			if (edge instanceof Transition && source instanceof State) {
				((Transition) edge).setTransitionFrom((State) source);
				return true;
			}
		}

		if (DslGenElementRoles.ACTIVITYEDGE.equals(edgeRole)) {
			if (edge instanceof ActivityEdge && source instanceof ActivityNode) {
				((ActivityEdge) edge).setSource((ActivityNode) source);
				return true;
			}
		}

		if (edge instanceof MetamodelElementWrapper
				&& ((MetamodelElementWrapper) edge).is__poseidonEdge()) {
			MetamodelElementWrapper poseidonEdge = (MetamodelElementWrapper) edge;
			poseidonEdge.set__source(source);
			return true;
		} else if (!(edge instanceof MetamodelElementWrapper)) {
			MetamodelElementWrapper elementSub = getElementSub(edge);
			if (elementSub != null) {
				elementSub.set__source(source);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean setTargetForEdge(EObject edge, EObject target) {
		if (edge == null || target == null) {
			return false;
		}
		String edgeRole = getRole(edge);

		if (DslGenElementRoles.DATALINK.equals(edgeRole)) {
			if (edge instanceof DataLink && target instanceof Data) {
				((DataLink) edge).setData((Data) target);
				return true;
			}
		}

		if (DslGenElementRoles.SENSING.equals(edgeRole)) {
			if (edge instanceof Sensing && target instanceof Sensor) {
				((Sensing) edge).setSensor((Sensor) target);
				return true;
			}
		}

		if (DslGenElementRoles.ACTUATING.equals(edgeRole)) {
			if (edge instanceof Actuating && target instanceof Actuator) {
				((Actuating) edge).setActuator((Actuator) target);
				return true;
			}
		}

		if (DslGenElementRoles.TIMING.equals(edgeRole)) {
			if (edge instanceof Timing && target instanceof Timer) {
				((Timing) edge).setTimer((Timer) target);
				return true;
			}
		}

		if (DslGenElementRoles.TRANSITION.equals(edgeRole)) {
			if (edge instanceof Transition && target instanceof State) {
				((Transition) edge).setTransitionTo((State) target);
				return true;
			}
		}

		if (DslGenElementRoles.ACTIVITYEDGE.equals(edgeRole)) {
			if (edge instanceof ActivityEdge && target instanceof ActivityNode) {
				((ActivityEdge) edge).setTarget((ActivityNode) target);
				return true;
			}
		}

		if (edge instanceof MetamodelElementWrapper
				&& ((MetamodelElementWrapper) edge).is__poseidonEdge()) {
			MetamodelElementWrapper poseidonEdge = (MetamodelElementWrapper) edge;
			poseidonEdge.set__target(target);
			return true;
		} else if (!(edge instanceof MetamodelElementWrapper)) {
			MetamodelElementWrapper elementSub = getElementSub(edge);
			if (elementSub != null) {
				elementSub.set__target(target);
				return true;
			}
		}
		return false;
	}

	@Override
	public String getName(EObject element) {
		if (element == null) {
			return null;
		}
		String elementRole = getRole(element);

		if (element instanceof MetamodelElementWrapper) {
			MetamodelElementWrapper poseidonElement = (MetamodelElementWrapper) element;
			return poseidonElement.get__poseidonName();
		} else {
			MetamodelElementWrapper elementSub = getElementSub(element);
			if (elementSub != null) {
				return elementSub.get__poseidonName();
			}
		}
		return null;
	}

	@Override
	public void setName(EObject element, String newName) {
		if (element == null) {
			return;
		}
		String elementRole = getRole(element);

		if (element instanceof MetamodelElementWrapper) {
			MetamodelElementWrapper poseidonElement = (MetamodelElementWrapper) element;
			poseidonElement.set__poseidonName(newName);
			return;
		} else {
			MetamodelElementWrapper elementSub = getElementSub(element);
			if (elementSub != null) {
				elementSub.set__poseidonName(newName);
			}
		}
		return;
	}

	public List getOwnedElements(EObject element) {
		List result = new ArrayList();

		String elementRole = getRole(element);
		if (DslGenElementRoles.DATA.equals(elementRole)) {

			if (element instanceof com.gentleware.poseidon.dsl.wsn.Data) {

				EList<Variable> childrenList = ((com.gentleware.poseidon.dsl.wsn.Data) element)
						.getVariable();
				result.addAll(childrenList);

			}
		}
		if (DslGenElementRoles.STATEMACHINE.equals(elementRole)) {
		}
		if (DslGenElementRoles.ACTIVITY.equals(elementRole)) {

			if (element instanceof com.gentleware.poseidon.dsl.wsn.Activity) {

				ActivityNode child = ((com.gentleware.poseidon.dsl.wsn.Activity) element)
						.getInitialNode();
				result.add(child);

			}
		}
		if (DslGenElementRoles.ASPECT.equals(elementRole)) {
		}
		if (DslGenElementRoles.ADVICE.equals(elementRole)) {

			if (element instanceof com.gentleware.poseidon.dsl.wsn.Activity) {

				ActivityNode child = ((com.gentleware.poseidon.dsl.wsn.Activity) element)
						.getInitialNode();
				result.add(child);

			}
		}
		if (DslGenElementRoles.PLATFORMSLOT.equals(elementRole)) {
		}

		if (element instanceof MetamodelElementWrapper) {
			result.addAll(((MetamodelElementWrapper) element)
					.get__ownedMember());
		} else {
			MetamodelElementWrapper elementSub = getElementSub(element);
			if (elementSub != null) {
				result.addAll(elementSub.get__ownedMember());
			}
		}
		return result;
	}

	@Override
	public EList<EObject> getOutgoingRelationships(EObject eObject,
			boolean includeDeleted) {
		MetamodelElementWrapper element = null;
		if (eObject instanceof MetamodelElementWrapper) {
			element = (MetamodelElementWrapper) eObject;
		} else {
			element = getElementSub(element);
		}
		EList<EObject> outgoings = new UniqueEList.FastCompare<EObject>();
		String role = getRole(element);
		if (element == null) {
			return outgoings;
		}
		if (role.equals(DslGenElementRoles.TASK)) {
			for (EStructuralFeature.Setting setting : getNonNavigableInverseReferences(element)) {
				EStructuralFeature eStructuralFeature = setting
						.getEStructuralFeature();
				if (eStructuralFeature == DSLPackage.Literals.METAMODEL_ELEMENT_WRAPPER__SOURCE
						|| eStructuralFeature == com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE
								.getDataLink_Task()
						|| eStructuralFeature == com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE
								.getSensing_Task()
						|| eStructuralFeature == com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE
								.getActuating_Task()
						|| eStructuralFeature == com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE
								.getTiming_Task()) {
					EObject addCandidate = setting.getEObject();
					if (includeDeleted
							|| (!includeDeleted && !isElementDeleted(addCandidate))) {
						outgoings.add(addCandidate);
					}
				}
			}
			return outgoings;
		}
		if (role.equals(DslGenElementRoles.STATE)) {
			for (EStructuralFeature.Setting setting : getNonNavigableInverseReferences(element)) {
				EStructuralFeature eStructuralFeature = setting
						.getEStructuralFeature();
				if (eStructuralFeature == DSLPackage.Literals.METAMODEL_ELEMENT_WRAPPER__SOURCE
						|| eStructuralFeature == com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE
								.getTransition_TransitionFrom()) {
					EObject addCandidate = setting.getEObject();
					if (includeDeleted
							|| (!includeDeleted && !isElementDeleted(addCandidate))) {
						outgoings.add(addCandidate);
					}
				}
			}
			return outgoings;
		}
		if (role.equals(DslGenElementRoles.INITIALSTATE)) {
			for (EStructuralFeature.Setting setting : getNonNavigableInverseReferences(element)) {
				EStructuralFeature eStructuralFeature = setting
						.getEStructuralFeature();
				if (eStructuralFeature == DSLPackage.Literals.METAMODEL_ELEMENT_WRAPPER__SOURCE
						|| eStructuralFeature == com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE
								.getTransition_TransitionFrom()) {
					EObject addCandidate = setting.getEObject();
					if (includeDeleted
							|| (!includeDeleted && !isElementDeleted(addCandidate))) {
						outgoings.add(addCandidate);
					}
				}
			}
			return outgoings;
		}
		if (role.equals(DslGenElementRoles.INITIALNODE)) {
			for (EStructuralFeature.Setting setting : getNonNavigableInverseReferences(element)) {
				EStructuralFeature eStructuralFeature = setting
						.getEStructuralFeature();
				if (eStructuralFeature == DSLPackage.Literals.METAMODEL_ELEMENT_WRAPPER__SOURCE
						|| eStructuralFeature == com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE
								.getActivityEdge_Source()) {
					EObject addCandidate = setting.getEObject();
					if (includeDeleted
							|| (!includeDeleted && !isElementDeleted(addCandidate))) {
						outgoings.add(addCandidate);
					}
				}
			}
			return outgoings;
		}
		if (role.equals(DslGenElementRoles.DECISIONNODE)) {
			for (EStructuralFeature.Setting setting : getNonNavigableInverseReferences(element)) {
				EStructuralFeature eStructuralFeature = setting
						.getEStructuralFeature();
				if (eStructuralFeature == DSLPackage.Literals.METAMODEL_ELEMENT_WRAPPER__SOURCE
						|| eStructuralFeature == com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE
								.getActivityEdge_Source()) {
					EObject addCandidate = setting.getEObject();
					if (includeDeleted
							|| (!includeDeleted && !isElementDeleted(addCandidate))) {
						outgoings.add(addCandidate);
					}
				}
			}
			return outgoings;
		}
		if (role.equals(DslGenElementRoles.MERGENODE)) {
			for (EStructuralFeature.Setting setting : getNonNavigableInverseReferences(element)) {
				EStructuralFeature eStructuralFeature = setting
						.getEStructuralFeature();
				if (eStructuralFeature == DSLPackage.Literals.METAMODEL_ELEMENT_WRAPPER__SOURCE
						|| eStructuralFeature == com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE
								.getActivityEdge_Source()) {
					EObject addCandidate = setting.getEObject();
					if (includeDeleted
							|| (!includeDeleted && !isElementDeleted(addCandidate))) {
						outgoings.add(addCandidate);
					}
				}
			}
			return outgoings;
		}
		if (role.equals(DslGenElementRoles.SENSINGACTION)) {
			for (EStructuralFeature.Setting setting : getNonNavigableInverseReferences(element)) {
				EStructuralFeature eStructuralFeature = setting
						.getEStructuralFeature();
				if (eStructuralFeature == DSLPackage.Literals.METAMODEL_ELEMENT_WRAPPER__SOURCE
						|| eStructuralFeature == com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE
								.getActivityEdge_Source()) {
					EObject addCandidate = setting.getEObject();
					if (includeDeleted
							|| (!includeDeleted && !isElementDeleted(addCandidate))) {
						outgoings.add(addCandidate);
					}
				}
			}
			return outgoings;
		}
		if (role.equals(DslGenElementRoles.ACTUATINGACTION)) {
			for (EStructuralFeature.Setting setting : getNonNavigableInverseReferences(element)) {
				EStructuralFeature eStructuralFeature = setting
						.getEStructuralFeature();
				if (eStructuralFeature == DSLPackage.Literals.METAMODEL_ELEMENT_WRAPPER__SOURCE
						|| eStructuralFeature == com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE
								.getActivityEdge_Source()) {
					EObject addCandidate = setting.getEObject();
					if (includeDeleted
							|| (!includeDeleted && !isElementDeleted(addCandidate))) {
						outgoings.add(addCandidate);
					}
				}
			}
			return outgoings;
		}
		if (role.equals(DslGenElementRoles.TIMINGACTION)) {
			for (EStructuralFeature.Setting setting : getNonNavigableInverseReferences(element)) {
				EStructuralFeature eStructuralFeature = setting
						.getEStructuralFeature();
				if (eStructuralFeature == DSLPackage.Literals.METAMODEL_ELEMENT_WRAPPER__SOURCE
						|| eStructuralFeature == com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE
								.getActivityEdge_Source()) {
					EObject addCandidate = setting.getEObject();
					if (includeDeleted
							|| (!includeDeleted && !isElementDeleted(addCandidate))) {
						outgoings.add(addCandidate);
					}
				}
			}
			return outgoings;
		}
		if (role.equals(DslGenElementRoles.UPDATEPOOLACTION)) {
			for (EStructuralFeature.Setting setting : getNonNavigableInverseReferences(element)) {
				EStructuralFeature eStructuralFeature = setting
						.getEStructuralFeature();
				if (eStructuralFeature == DSLPackage.Literals.METAMODEL_ELEMENT_WRAPPER__SOURCE
						|| eStructuralFeature == com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE
								.getActivityEdge_Source()) {
					EObject addCandidate = setting.getEObject();
					if (includeDeleted
							|| (!includeDeleted && !isElementDeleted(addCandidate))) {
						outgoings.add(addCandidate);
					}
				}
			}
			return outgoings;
		}
		if (role.equals(DslGenElementRoles.GETNODEACTION)) {
			for (EStructuralFeature.Setting setting : getNonNavigableInverseReferences(element)) {
				EStructuralFeature eStructuralFeature = setting
						.getEStructuralFeature();
				if (eStructuralFeature == DSLPackage.Literals.METAMODEL_ELEMENT_WRAPPER__SOURCE
						|| eStructuralFeature == com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE
								.getActivityEdge_Source()) {
					EObject addCandidate = setting.getEObject();
					if (includeDeleted
							|| (!includeDeleted && !isElementDeleted(addCandidate))) {
						outgoings.add(addCandidate);
					}
				}
			}
			return outgoings;
		}
		if (role.equals(DslGenElementRoles.GETDATAACTION)) {
			for (EStructuralFeature.Setting setting : getNonNavigableInverseReferences(element)) {
				EStructuralFeature eStructuralFeature = setting
						.getEStructuralFeature();
				if (eStructuralFeature == DSLPackage.Literals.METAMODEL_ELEMENT_WRAPPER__SOURCE
						|| eStructuralFeature == com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE
								.getActivityEdge_Source()) {
					EObject addCandidate = setting.getEObject();
					if (includeDeleted
							|| (!includeDeleted && !isElementDeleted(addCandidate))) {
						outgoings.add(addCandidate);
					}
				}
			}
			return outgoings;
		}
		if (role.equals(DslGenElementRoles.REMOTETRIGGERACTION)) {
			for (EStructuralFeature.Setting setting : getNonNavigableInverseReferences(element)) {
				EStructuralFeature eStructuralFeature = setting
						.getEStructuralFeature();
				if (eStructuralFeature == DSLPackage.Literals.METAMODEL_ELEMENT_WRAPPER__SOURCE
						|| eStructuralFeature == com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE
								.getActivityEdge_Source()) {
					EObject addCandidate = setting.getEObject();
					if (includeDeleted
							|| (!includeDeleted && !isElementDeleted(addCandidate))) {
						outgoings.add(addCandidate);
					}
				}
			}
			return outgoings;
		}
		if (role.equals(DslGenElementRoles.OPAQUEACTION)) {
			for (EStructuralFeature.Setting setting : getNonNavigableInverseReferences(element)) {
				EStructuralFeature eStructuralFeature = setting
						.getEStructuralFeature();
				if (eStructuralFeature == DSLPackage.Literals.METAMODEL_ELEMENT_WRAPPER__SOURCE
						|| eStructuralFeature == com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE
								.getActivityEdge_Source()) {
					EObject addCandidate = setting.getEObject();
					if (includeDeleted
							|| (!includeDeleted && !isElementDeleted(addCandidate))) {
						outgoings.add(addCandidate);
					}
				}
			}
			return outgoings;
		}
		return super.getOutgoingRelationships(eObject, includeDeleted);
	}

	@Override
	public EList<EObject> getIncomingRelationships(EObject eObject,
			boolean includeDeleted) {
		MetamodelElementWrapper element = null;
		if (eObject instanceof MetamodelElementWrapper) {
			element = (MetamodelElementWrapper) eObject;
		} else {
			element = getElementSub(element);
		}
		EList<EObject> incomings = new UniqueEList.FastCompare<EObject>();
		String role = getRole(element);
		if (element == null) {
			return incomings;
		}
		if (role.equals(DslGenElementRoles.TASK)) {
			for (EStructuralFeature.Setting setting : getNonNavigableInverseReferences(element)) {
				EStructuralFeature eStructuralFeature = setting
						.getEStructuralFeature();
				if (eStructuralFeature == DSLPackage.Literals.METAMODEL_ELEMENT_WRAPPER__TARGET
						|| eStructuralFeature == com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE
								.getDataLink_Data()
						|| eStructuralFeature == com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE
								.getSensing_Sensor()
						|| eStructuralFeature == com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE
								.getActuating_Actuator()
						|| eStructuralFeature == com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE
								.getTiming_Timer()) {
					EObject addCandidate = setting.getEObject();
					if (includeDeleted
							|| (!includeDeleted && !isElementDeleted(addCandidate))) {
						incomings.add(addCandidate);
					}
				}
			}
			return incomings;
		}
		if (role.equals(DslGenElementRoles.STATE)) {
			for (EStructuralFeature.Setting setting : getNonNavigableInverseReferences(element)) {
				EStructuralFeature eStructuralFeature = setting
						.getEStructuralFeature();
				if (eStructuralFeature == DSLPackage.Literals.METAMODEL_ELEMENT_WRAPPER__TARGET
						|| eStructuralFeature == com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE
								.getTransition_TransitionTo()) {
					EObject addCandidate = setting.getEObject();
					if (includeDeleted
							|| (!includeDeleted && !isElementDeleted(addCandidate))) {
						incomings.add(addCandidate);
					}
				}
			}
			return incomings;
		}
		if (role.equals(DslGenElementRoles.INITIALSTATE)) {
			for (EStructuralFeature.Setting setting : getNonNavigableInverseReferences(element)) {
				EStructuralFeature eStructuralFeature = setting
						.getEStructuralFeature();
				if (eStructuralFeature == DSLPackage.Literals.METAMODEL_ELEMENT_WRAPPER__TARGET
						|| eStructuralFeature == com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE
								.getTransition_TransitionTo()) {
					EObject addCandidate = setting.getEObject();
					if (includeDeleted
							|| (!includeDeleted && !isElementDeleted(addCandidate))) {
						incomings.add(addCandidate);
					}
				}
			}
			return incomings;
		}
		if (role.equals(DslGenElementRoles.INITIALNODE)) {
			for (EStructuralFeature.Setting setting : getNonNavigableInverseReferences(element)) {
				EStructuralFeature eStructuralFeature = setting
						.getEStructuralFeature();
				if (eStructuralFeature == DSLPackage.Literals.METAMODEL_ELEMENT_WRAPPER__TARGET
						|| eStructuralFeature == com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE
								.getActivityEdge_Target()) {
					EObject addCandidate = setting.getEObject();
					if (includeDeleted
							|| (!includeDeleted && !isElementDeleted(addCandidate))) {
						incomings.add(addCandidate);
					}
				}
			}
			return incomings;
		}
		if (role.equals(DslGenElementRoles.DECISIONNODE)) {
			for (EStructuralFeature.Setting setting : getNonNavigableInverseReferences(element)) {
				EStructuralFeature eStructuralFeature = setting
						.getEStructuralFeature();
				if (eStructuralFeature == DSLPackage.Literals.METAMODEL_ELEMENT_WRAPPER__TARGET
						|| eStructuralFeature == com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE
								.getActivityEdge_Target()) {
					EObject addCandidate = setting.getEObject();
					if (includeDeleted
							|| (!includeDeleted && !isElementDeleted(addCandidate))) {
						incomings.add(addCandidate);
					}
				}
			}
			return incomings;
		}
		if (role.equals(DslGenElementRoles.MERGENODE)) {
			for (EStructuralFeature.Setting setting : getNonNavigableInverseReferences(element)) {
				EStructuralFeature eStructuralFeature = setting
						.getEStructuralFeature();
				if (eStructuralFeature == DSLPackage.Literals.METAMODEL_ELEMENT_WRAPPER__TARGET
						|| eStructuralFeature == com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE
								.getActivityEdge_Target()) {
					EObject addCandidate = setting.getEObject();
					if (includeDeleted
							|| (!includeDeleted && !isElementDeleted(addCandidate))) {
						incomings.add(addCandidate);
					}
				}
			}
			return incomings;
		}
		if (role.equals(DslGenElementRoles.SENSINGACTION)) {
			for (EStructuralFeature.Setting setting : getNonNavigableInverseReferences(element)) {
				EStructuralFeature eStructuralFeature = setting
						.getEStructuralFeature();
				if (eStructuralFeature == DSLPackage.Literals.METAMODEL_ELEMENT_WRAPPER__TARGET
						|| eStructuralFeature == com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE
								.getActivityEdge_Target()) {
					EObject addCandidate = setting.getEObject();
					if (includeDeleted
							|| (!includeDeleted && !isElementDeleted(addCandidate))) {
						incomings.add(addCandidate);
					}
				}
			}
			return incomings;
		}
		if (role.equals(DslGenElementRoles.ACTUATINGACTION)) {
			for (EStructuralFeature.Setting setting : getNonNavigableInverseReferences(element)) {
				EStructuralFeature eStructuralFeature = setting
						.getEStructuralFeature();
				if (eStructuralFeature == DSLPackage.Literals.METAMODEL_ELEMENT_WRAPPER__TARGET
						|| eStructuralFeature == com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE
								.getActivityEdge_Target()) {
					EObject addCandidate = setting.getEObject();
					if (includeDeleted
							|| (!includeDeleted && !isElementDeleted(addCandidate))) {
						incomings.add(addCandidate);
					}
				}
			}
			return incomings;
		}
		if (role.equals(DslGenElementRoles.TIMINGACTION)) {
			for (EStructuralFeature.Setting setting : getNonNavigableInverseReferences(element)) {
				EStructuralFeature eStructuralFeature = setting
						.getEStructuralFeature();
				if (eStructuralFeature == DSLPackage.Literals.METAMODEL_ELEMENT_WRAPPER__TARGET
						|| eStructuralFeature == com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE
								.getActivityEdge_Target()) {
					EObject addCandidate = setting.getEObject();
					if (includeDeleted
							|| (!includeDeleted && !isElementDeleted(addCandidate))) {
						incomings.add(addCandidate);
					}
				}
			}
			return incomings;
		}
		if (role.equals(DslGenElementRoles.UPDATEPOOLACTION)) {
			for (EStructuralFeature.Setting setting : getNonNavigableInverseReferences(element)) {
				EStructuralFeature eStructuralFeature = setting
						.getEStructuralFeature();
				if (eStructuralFeature == DSLPackage.Literals.METAMODEL_ELEMENT_WRAPPER__TARGET
						|| eStructuralFeature == com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE
								.getActivityEdge_Target()) {
					EObject addCandidate = setting.getEObject();
					if (includeDeleted
							|| (!includeDeleted && !isElementDeleted(addCandidate))) {
						incomings.add(addCandidate);
					}
				}
			}
			return incomings;
		}
		if (role.equals(DslGenElementRoles.GETNODEACTION)) {
			for (EStructuralFeature.Setting setting : getNonNavigableInverseReferences(element)) {
				EStructuralFeature eStructuralFeature = setting
						.getEStructuralFeature();
				if (eStructuralFeature == DSLPackage.Literals.METAMODEL_ELEMENT_WRAPPER__TARGET
						|| eStructuralFeature == com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE
								.getActivityEdge_Target()) {
					EObject addCandidate = setting.getEObject();
					if (includeDeleted
							|| (!includeDeleted && !isElementDeleted(addCandidate))) {
						incomings.add(addCandidate);
					}
				}
			}
			return incomings;
		}
		if (role.equals(DslGenElementRoles.GETDATAACTION)) {
			for (EStructuralFeature.Setting setting : getNonNavigableInverseReferences(element)) {
				EStructuralFeature eStructuralFeature = setting
						.getEStructuralFeature();
				if (eStructuralFeature == DSLPackage.Literals.METAMODEL_ELEMENT_WRAPPER__TARGET
						|| eStructuralFeature == com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE
								.getActivityEdge_Target()) {
					EObject addCandidate = setting.getEObject();
					if (includeDeleted
							|| (!includeDeleted && !isElementDeleted(addCandidate))) {
						incomings.add(addCandidate);
					}
				}
			}
			return incomings;
		}
		if (role.equals(DslGenElementRoles.REMOTETRIGGERACTION)) {
			for (EStructuralFeature.Setting setting : getNonNavigableInverseReferences(element)) {
				EStructuralFeature eStructuralFeature = setting
						.getEStructuralFeature();
				if (eStructuralFeature == DSLPackage.Literals.METAMODEL_ELEMENT_WRAPPER__TARGET
						|| eStructuralFeature == com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE
								.getActivityEdge_Target()) {
					EObject addCandidate = setting.getEObject();
					if (includeDeleted
							|| (!includeDeleted && !isElementDeleted(addCandidate))) {
						incomings.add(addCandidate);
					}
				}
			}
			return incomings;
		}
		if (role.equals(DslGenElementRoles.OPAQUEACTION)) {
			for (EStructuralFeature.Setting setting : getNonNavigableInverseReferences(element)) {
				EStructuralFeature eStructuralFeature = setting
						.getEStructuralFeature();
				if (eStructuralFeature == DSLPackage.Literals.METAMODEL_ELEMENT_WRAPPER__TARGET
						|| eStructuralFeature == com.gentleware.poseidon.dsl.wsn.USERPackage.eINSTANCE
								.getActivityEdge_Target()) {
					EObject addCandidate = setting.getEObject();
					if (includeDeleted
							|| (!includeDeleted && !isElementDeleted(addCandidate))) {
						incomings.add(addCandidate);
					}
				}
			}
			return incomings;
		}
		return super.getIncomingRelationships(eObject, includeDeleted);
	}

}
