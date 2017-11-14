/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.gentleware.poseidon.dsl.wsn.impl;

import com.gentleware.poseidon.dsl.wsn.Objectives;
import com.gentleware.poseidon.dsl.wsn.USERPackage;
import com.gentleware.poseidon.dsl.wsn.optimizationLevel;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Objectives</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.impl.ObjectivesImpl#getPower <em>Power</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.impl.ObjectivesImpl#getMemory <em>Memory</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.impl.ObjectivesImpl#getPacketloss <em>Packetloss</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectivesImpl extends EObjectImpl implements Objectives {
	/**
	 * The default value of the '{@link #getPower() <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower()
	 * @generated
	 * @ordered
	 */
	protected static final optimizationLevel POWER_EDEFAULT = optimizationLevel.DONT_CARE;

	/**
	 * The cached value of the '{@link #getPower() <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower()
	 * @generated
	 * @ordered
	 */
	protected optimizationLevel power = POWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getMemory() <em>Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory()
	 * @generated
	 * @ordered
	 */
	protected static final optimizationLevel MEMORY_EDEFAULT = optimizationLevel.DONT_CARE;

	/**
	 * The cached value of the '{@link #getMemory() <em>Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory()
	 * @generated
	 * @ordered
	 */
	protected optimizationLevel memory = MEMORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPacketloss() <em>Packetloss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPacketloss()
	 * @generated
	 * @ordered
	 */
	protected static final optimizationLevel PACKETLOSS_EDEFAULT = optimizationLevel.DONT_CARE;

	/**
	 * The cached value of the '{@link #getPacketloss() <em>Packetloss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPacketloss()
	 * @generated
	 * @ordered
	 */
	protected optimizationLevel packetloss = PACKETLOSS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectivesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return USERPackage.Literals.OBJECTIVES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public optimizationLevel getPower() {
		return power;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower(optimizationLevel newPower) {
		optimizationLevel oldPower = power;
		power = newPower == null ? POWER_EDEFAULT : newPower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, USERPackage.OBJECTIVES__POWER, oldPower, power));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public optimizationLevel getMemory() {
		return memory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemory(optimizationLevel newMemory) {
		optimizationLevel oldMemory = memory;
		memory = newMemory == null ? MEMORY_EDEFAULT : newMemory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, USERPackage.OBJECTIVES__MEMORY, oldMemory, memory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public optimizationLevel getPacketloss() {
		return packetloss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPacketloss(optimizationLevel newPacketloss) {
		optimizationLevel oldPacketloss = packetloss;
		packetloss = newPacketloss == null ? PACKETLOSS_EDEFAULT : newPacketloss;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, USERPackage.OBJECTIVES__PACKETLOSS, oldPacketloss, packetloss));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case USERPackage.OBJECTIVES__POWER:
				return getPower();
			case USERPackage.OBJECTIVES__MEMORY:
				return getMemory();
			case USERPackage.OBJECTIVES__PACKETLOSS:
				return getPacketloss();
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
			case USERPackage.OBJECTIVES__POWER:
				setPower((optimizationLevel)newValue);
				return;
			case USERPackage.OBJECTIVES__MEMORY:
				setMemory((optimizationLevel)newValue);
				return;
			case USERPackage.OBJECTIVES__PACKETLOSS:
				setPacketloss((optimizationLevel)newValue);
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
			case USERPackage.OBJECTIVES__POWER:
				setPower(POWER_EDEFAULT);
				return;
			case USERPackage.OBJECTIVES__MEMORY:
				setMemory(MEMORY_EDEFAULT);
				return;
			case USERPackage.OBJECTIVES__PACKETLOSS:
				setPacketloss(PACKETLOSS_EDEFAULT);
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
			case USERPackage.OBJECTIVES__POWER:
				return power != POWER_EDEFAULT;
			case USERPackage.OBJECTIVES__MEMORY:
				return memory != MEMORY_EDEFAULT;
			case USERPackage.OBJECTIVES__PACKETLOSS:
				return packetloss != PACKETLOSS_EDEFAULT;
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
		result.append(" (power: ");
		result.append(power);
		result.append(", memory: ");
		result.append(memory);
		result.append(", packetloss: ");
		result.append(packetloss);
		result.append(')');
		return result.toString();
	}

} //ObjectivesImpl
