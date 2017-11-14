/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.gentleware.poseidon.dsl.wsn.impl;

import com.gentleware.poseidon.dsl.wsn.Event;
import com.gentleware.poseidon.dsl.wsn.EventType;
import com.gentleware.poseidon.dsl.wsn.State;
import com.gentleware.poseidon.dsl.wsn.Transition;
import com.gentleware.poseidon.dsl.wsn.USERPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.impl.TransitionImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.impl.TransitionImpl#getTriggerevent <em>Triggerevent</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.impl.TransitionImpl#getTransitionFrom <em>Transition From</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.impl.TransitionImpl#getTransitionTo <em>Transition To</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.impl.TransitionImpl#getTrigger <em>Trigger</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionImpl extends EObjectImpl implements Transition {
	/**
	 * The default value of the '{@link #getGuard() <em>Guard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuard() <em>Guard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard()
	 * @generated
	 * @ordered
	 */
	protected String guard = GUARD_EDEFAULT;

	/**
	 * The default value of the '{@link #getTriggerevent() <em>Triggerevent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerevent()
	 * @generated
	 * @ordered
	 */
	protected static final EventType TRIGGEREVENT_EDEFAULT = EventType.NONE;

	/**
	 * The cached value of the '{@link #getTriggerevent() <em>Triggerevent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerevent()
	 * @generated
	 * @ordered
	 */
	protected EventType triggerevent = TRIGGEREVENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTransitionFrom() <em>Transition From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionFrom()
	 * @generated
	 * @ordered
	 */
	protected State transitionFrom;

	/**
	 * The cached value of the '{@link #getTransitionTo() <em>Transition To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionTo()
	 * @generated
	 * @ordered
	 */
	protected State transitionTo;

	/**
	 * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected Event trigger;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return USERPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuard() {
		return guard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuard(String newGuard) {
		String oldGuard = guard;
		guard = newGuard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, USERPackage.TRANSITION__GUARD, oldGuard, guard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventType getTriggerevent() {
		return triggerevent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTriggerevent(EventType newTriggerevent) {
		EventType oldTriggerevent = triggerevent;
		triggerevent = newTriggerevent == null ? TRIGGEREVENT_EDEFAULT : newTriggerevent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, USERPackage.TRANSITION__TRIGGEREVENT, oldTriggerevent, triggerevent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getTransitionFrom() {
		if (transitionFrom != null && transitionFrom.eIsProxy()) {
			InternalEObject oldTransitionFrom = (InternalEObject)transitionFrom;
			transitionFrom = (State)eResolveProxy(oldTransitionFrom);
			if (transitionFrom != oldTransitionFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, USERPackage.TRANSITION__TRANSITION_FROM, oldTransitionFrom, transitionFrom));
			}
		}
		return transitionFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetTransitionFrom() {
		return transitionFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransitionFrom(State newTransitionFrom) {
		State oldTransitionFrom = transitionFrom;
		transitionFrom = newTransitionFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, USERPackage.TRANSITION__TRANSITION_FROM, oldTransitionFrom, transitionFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getTransitionTo() {
		if (transitionTo != null && transitionTo.eIsProxy()) {
			InternalEObject oldTransitionTo = (InternalEObject)transitionTo;
			transitionTo = (State)eResolveProxy(oldTransitionTo);
			if (transitionTo != oldTransitionTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, USERPackage.TRANSITION__TRANSITION_TO, oldTransitionTo, transitionTo));
			}
		}
		return transitionTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetTransitionTo() {
		return transitionTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransitionTo(State newTransitionTo) {
		State oldTransitionTo = transitionTo;
		transitionTo = newTransitionTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, USERPackage.TRANSITION__TRANSITION_TO, oldTransitionTo, transitionTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event getTrigger() {
		if (trigger != null && trigger.eIsProxy()) {
			InternalEObject oldTrigger = (InternalEObject)trigger;
			trigger = (Event)eResolveProxy(oldTrigger);
			if (trigger != oldTrigger) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, USERPackage.TRANSITION__TRIGGER, oldTrigger, trigger));
			}
		}
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event basicGetTrigger() {
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrigger(Event newTrigger) {
		Event oldTrigger = trigger;
		trigger = newTrigger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, USERPackage.TRANSITION__TRIGGER, oldTrigger, trigger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case USERPackage.TRANSITION__GUARD:
				return getGuard();
			case USERPackage.TRANSITION__TRIGGEREVENT:
				return getTriggerevent();
			case USERPackage.TRANSITION__TRANSITION_FROM:
				if (resolve) return getTransitionFrom();
				return basicGetTransitionFrom();
			case USERPackage.TRANSITION__TRANSITION_TO:
				if (resolve) return getTransitionTo();
				return basicGetTransitionTo();
			case USERPackage.TRANSITION__TRIGGER:
				if (resolve) return getTrigger();
				return basicGetTrigger();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case USERPackage.TRANSITION__GUARD:
				setGuard((String)newValue);
				return;
			case USERPackage.TRANSITION__TRIGGEREVENT:
				setTriggerevent((EventType)newValue);
				return;
			case USERPackage.TRANSITION__TRANSITION_FROM:
				setTransitionFrom((State)newValue);
				return;
			case USERPackage.TRANSITION__TRANSITION_TO:
				setTransitionTo((State)newValue);
				return;
			case USERPackage.TRANSITION__TRIGGER:
				setTrigger((Event)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case USERPackage.TRANSITION__GUARD:
				setGuard(GUARD_EDEFAULT);
				return;
			case USERPackage.TRANSITION__TRIGGEREVENT:
				setTriggerevent(TRIGGEREVENT_EDEFAULT);
				return;
			case USERPackage.TRANSITION__TRANSITION_FROM:
				setTransitionFrom((State)null);
				return;
			case USERPackage.TRANSITION__TRANSITION_TO:
				setTransitionTo((State)null);
				return;
			case USERPackage.TRANSITION__TRIGGER:
				setTrigger((Event)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case USERPackage.TRANSITION__GUARD:
				return GUARD_EDEFAULT == null ? guard != null : !GUARD_EDEFAULT.equals(guard);
			case USERPackage.TRANSITION__TRIGGEREVENT:
				return triggerevent != TRIGGEREVENT_EDEFAULT;
			case USERPackage.TRANSITION__TRANSITION_FROM:
				return transitionFrom != null;
			case USERPackage.TRANSITION__TRANSITION_TO:
				return transitionTo != null;
			case USERPackage.TRANSITION__TRIGGER:
				return trigger != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (guard: ");
		result.append(guard);
		result.append(", triggerevent: ");
		result.append(triggerevent);
		result.append(')');
		return result.toString();
	}

} //TransitionImpl
