/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.gentleware.poseidon.dsl.wsn.impl;

import com.gentleware.poseidon.dsl.wsn.Battery;
import com.gentleware.poseidon.dsl.wsn.USERPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Battery</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.impl.BatteryImpl#getFull <em>Full</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.impl.BatteryImpl#getEmpty <em>Empty</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BatteryImpl extends EnergySourceImpl implements Battery {
	/**
	 * The default value of the '{@link #getFull() <em>Full</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFull()
	 * @generated
	 * @ordered
	 */
	protected static final float FULL_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getFull() <em>Full</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFull()
	 * @generated
	 * @ordered
	 */
	protected float full = FULL_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmpty() <em>Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmpty()
	 * @generated
	 * @ordered
	 */
	protected static final float EMPTY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getEmpty() <em>Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmpty()
	 * @generated
	 * @ordered
	 */
	protected float empty = EMPTY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BatteryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return USERPackage.Literals.BATTERY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getFull() {
		return full;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFull(float newFull) {
		float oldFull = full;
		full = newFull;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, USERPackage.BATTERY__FULL, oldFull, full));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getEmpty() {
		return empty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmpty(float newEmpty) {
		float oldEmpty = empty;
		empty = newEmpty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, USERPackage.BATTERY__EMPTY, oldEmpty, empty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case USERPackage.BATTERY__FULL:
				return getFull();
			case USERPackage.BATTERY__EMPTY:
				return getEmpty();
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
			case USERPackage.BATTERY__FULL:
				setFull((Float)newValue);
				return;
			case USERPackage.BATTERY__EMPTY:
				setEmpty((Float)newValue);
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
			case USERPackage.BATTERY__FULL:
				setFull(FULL_EDEFAULT);
				return;
			case USERPackage.BATTERY__EMPTY:
				setEmpty(EMPTY_EDEFAULT);
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
			case USERPackage.BATTERY__FULL:
				return full != FULL_EDEFAULT;
			case USERPackage.BATTERY__EMPTY:
				return empty != EMPTY_EDEFAULT;
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
		result.append(" (full: ");
		result.append(full);
		result.append(", empty: ");
		result.append(empty);
		result.append(')');
		return result.toString();
	}

} //BatteryImpl
