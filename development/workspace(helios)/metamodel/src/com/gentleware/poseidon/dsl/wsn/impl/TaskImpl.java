/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.gentleware.poseidon.dsl.wsn.impl;

import com.gentleware.poseidon.dsl.wsn.ActivationProfile;
import com.gentleware.poseidon.dsl.wsn.StateMachine;
import com.gentleware.poseidon.dsl.wsn.Task;
import com.gentleware.poseidon.dsl.wsn.USERPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.impl.TaskImpl#getBehaviorName <em>Behavior Name</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.impl.TaskImpl#getActivationProfile <em>Activation Profile</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.impl.TaskImpl#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.impl.TaskImpl#getProfile <em>Profile</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaskImpl extends EObjectImpl implements Task {
	/**
	 * The default value of the '{@link #getBehaviorName() <em>Behavior Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviorName()
	 * @generated
	 * @ordered
	 */
	protected static final String BEHAVIOR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBehaviorName() <em>Behavior Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviorName()
	 * @generated
	 * @ordered
	 */
	protected String behaviorName = BEHAVIOR_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getActivationProfile() <em>Activation Profile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivationProfile()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTIVATION_PROFILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActivationProfile() <em>Activation Profile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivationProfile()
	 * @generated
	 * @ordered
	 */
	protected String activationProfile = ACTIVATION_PROFILE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBehavior() <em>Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavior()
	 * @generated
	 * @ordered
	 */
	protected StateMachine behavior;

	/**
	 * The cached value of the '{@link #getProfile() <em>Profile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfile()
	 * @generated
	 * @ordered
	 */
	protected ActivationProfile profile;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return USERPackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBehaviorName() {
		return behaviorName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehaviorName(String newBehaviorName) {
		String oldBehaviorName = behaviorName;
		behaviorName = newBehaviorName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, USERPackage.TASK__BEHAVIOR_NAME, oldBehaviorName, behaviorName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActivationProfile() {
		return activationProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivationProfile(String newActivationProfile) {
		String oldActivationProfile = activationProfile;
		activationProfile = newActivationProfile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, USERPackage.TASK__ACTIVATION_PROFILE, oldActivationProfile, activationProfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine getBehavior() {
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBehavior(StateMachine newBehavior, NotificationChain msgs) {
		StateMachine oldBehavior = behavior;
		behavior = newBehavior;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, USERPackage.TASK__BEHAVIOR, oldBehavior, newBehavior);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehavior(StateMachine newBehavior) {
		if (newBehavior != behavior) {
			NotificationChain msgs = null;
			if (behavior != null)
				msgs = ((InternalEObject)behavior).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - USERPackage.TASK__BEHAVIOR, null, msgs);
			if (newBehavior != null)
				msgs = ((InternalEObject)newBehavior).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - USERPackage.TASK__BEHAVIOR, null, msgs);
			msgs = basicSetBehavior(newBehavior, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, USERPackage.TASK__BEHAVIOR, newBehavior, newBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivationProfile getProfile() {
		if (profile != null && profile.eIsProxy()) {
			InternalEObject oldProfile = (InternalEObject)profile;
			profile = (ActivationProfile)eResolveProxy(oldProfile);
			if (profile != oldProfile) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, USERPackage.TASK__PROFILE, oldProfile, profile));
			}
		}
		return profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivationProfile basicGetProfile() {
		return profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfile(ActivationProfile newProfile) {
		ActivationProfile oldProfile = profile;
		profile = newProfile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, USERPackage.TASK__PROFILE, oldProfile, profile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case USERPackage.TASK__BEHAVIOR:
				return basicSetBehavior(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case USERPackage.TASK__BEHAVIOR_NAME:
				return getBehaviorName();
			case USERPackage.TASK__ACTIVATION_PROFILE:
				return getActivationProfile();
			case USERPackage.TASK__BEHAVIOR:
				return getBehavior();
			case USERPackage.TASK__PROFILE:
				if (resolve) return getProfile();
				return basicGetProfile();
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
			case USERPackage.TASK__BEHAVIOR_NAME:
				setBehaviorName((String)newValue);
				return;
			case USERPackage.TASK__ACTIVATION_PROFILE:
				setActivationProfile((String)newValue);
				return;
			case USERPackage.TASK__BEHAVIOR:
				setBehavior((StateMachine)newValue);
				return;
			case USERPackage.TASK__PROFILE:
				setProfile((ActivationProfile)newValue);
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
			case USERPackage.TASK__BEHAVIOR_NAME:
				setBehaviorName(BEHAVIOR_NAME_EDEFAULT);
				return;
			case USERPackage.TASK__ACTIVATION_PROFILE:
				setActivationProfile(ACTIVATION_PROFILE_EDEFAULT);
				return;
			case USERPackage.TASK__BEHAVIOR:
				setBehavior((StateMachine)null);
				return;
			case USERPackage.TASK__PROFILE:
				setProfile((ActivationProfile)null);
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
			case USERPackage.TASK__BEHAVIOR_NAME:
				return BEHAVIOR_NAME_EDEFAULT == null ? behaviorName != null : !BEHAVIOR_NAME_EDEFAULT.equals(behaviorName);
			case USERPackage.TASK__ACTIVATION_PROFILE:
				return ACTIVATION_PROFILE_EDEFAULT == null ? activationProfile != null : !ACTIVATION_PROFILE_EDEFAULT.equals(activationProfile);
			case USERPackage.TASK__BEHAVIOR:
				return behavior != null;
			case USERPackage.TASK__PROFILE:
				return profile != null;
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
		result.append(" (behaviorName: ");
		result.append(behaviorName);
		result.append(", activationProfile: ");
		result.append(activationProfile);
		result.append(')');
		return result.toString();
	}

} //TaskImpl
