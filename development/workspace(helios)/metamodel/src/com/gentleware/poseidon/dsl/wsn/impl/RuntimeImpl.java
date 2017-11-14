/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.gentleware.poseidon.dsl.wsn.impl;

import com.gentleware.poseidon.dsl.wsn.EnvironmentType;
import com.gentleware.poseidon.dsl.wsn.MoteType;
import com.gentleware.poseidon.dsl.wsn.USERPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Runtime</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.impl.RuntimeImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.impl.RuntimeImpl#getMote <em>Mote</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuntimeImpl extends PlatformElementImpl implements com.gentleware.poseidon.dsl.wsn.Runtime {
	/**
	 * The default value of the '{@link #getEnvironment() <em>Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironment()
	 * @generated
	 * @ordered
	 */
	protected static final EnvironmentType ENVIRONMENT_EDEFAULT = EnvironmentType.CONTIKI;

	/**
	 * The cached value of the '{@link #getEnvironment() <em>Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironment()
	 * @generated
	 * @ordered
	 */
	protected EnvironmentType environment = ENVIRONMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMote() <em>Mote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMote()
	 * @generated
	 * @ordered
	 */
	protected static final MoteType MOTE_EDEFAULT = MoteType.Z1;

	/**
	 * The cached value of the '{@link #getMote() <em>Mote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMote()
	 * @generated
	 * @ordered
	 */
	protected MoteType mote = MOTE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuntimeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return USERPackage.Literals.RUNTIME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvironmentType getEnvironment() {
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvironment(EnvironmentType newEnvironment) {
		EnvironmentType oldEnvironment = environment;
		environment = newEnvironment == null ? ENVIRONMENT_EDEFAULT : newEnvironment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, USERPackage.RUNTIME__ENVIRONMENT, oldEnvironment, environment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoteType getMote() {
		return mote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMote(MoteType newMote) {
		MoteType oldMote = mote;
		mote = newMote == null ? MOTE_EDEFAULT : newMote;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, USERPackage.RUNTIME__MOTE, oldMote, mote));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case USERPackage.RUNTIME__ENVIRONMENT:
				return getEnvironment();
			case USERPackage.RUNTIME__MOTE:
				return getMote();
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
			case USERPackage.RUNTIME__ENVIRONMENT:
				setEnvironment((EnvironmentType)newValue);
				return;
			case USERPackage.RUNTIME__MOTE:
				setMote((MoteType)newValue);
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
			case USERPackage.RUNTIME__ENVIRONMENT:
				setEnvironment(ENVIRONMENT_EDEFAULT);
				return;
			case USERPackage.RUNTIME__MOTE:
				setMote(MOTE_EDEFAULT);
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
			case USERPackage.RUNTIME__ENVIRONMENT:
				return environment != ENVIRONMENT_EDEFAULT;
			case USERPackage.RUNTIME__MOTE:
				return mote != MOTE_EDEFAULT;
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
		result.append(" (environment: ");
		result.append(environment);
		result.append(", mote: ");
		result.append(mote);
		result.append(')');
		return result.toString();
	}

} //RuntimeImpl
