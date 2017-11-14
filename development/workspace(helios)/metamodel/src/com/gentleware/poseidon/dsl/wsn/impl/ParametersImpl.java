/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.gentleware.poseidon.dsl.wsn.impl;

import com.gentleware.poseidon.dsl.wsn.Parameters;
import com.gentleware.poseidon.dsl.wsn.USERPackage;
import com.gentleware.poseidon.dsl.wsn.macType;
import com.gentleware.poseidon.dsl.wsn.netType;
import com.gentleware.poseidon.dsl.wsn.rdcType;
import com.gentleware.poseidon.dsl.wsn.sleepType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameters</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.impl.ParametersImpl#getNetwork <em>Network</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.impl.ParametersImpl#getMac <em>Mac</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.impl.ParametersImpl#getRadioduty <em>Radioduty</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.impl.ParametersImpl#getSleep <em>Sleep</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParametersImpl extends PlatformElementImpl implements Parameters {
	/**
	 * The default value of the '{@link #getNetwork() <em>Network</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetwork()
	 * @generated
	 * @ordered
	 */
	protected static final netType NETWORK_EDEFAULT = netType.RIME;

	/**
	 * The cached value of the '{@link #getNetwork() <em>Network</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetwork()
	 * @generated
	 * @ordered
	 */
	protected netType network = NETWORK_EDEFAULT;

	/**
	 * The default value of the '{@link #getMac() <em>Mac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMac()
	 * @generated
	 * @ordered
	 */
	protected static final macType MAC_EDEFAULT = macType.NONE;

	/**
	 * The cached value of the '{@link #getMac() <em>Mac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMac()
	 * @generated
	 * @ordered
	 */
	protected macType mac = MAC_EDEFAULT;

	/**
	 * The default value of the '{@link #getRadioduty() <em>Radioduty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadioduty()
	 * @generated
	 * @ordered
	 */
	protected static final rdcType RADIODUTY_EDEFAULT = rdcType.NONE;

	/**
	 * The cached value of the '{@link #getRadioduty() <em>Radioduty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadioduty()
	 * @generated
	 * @ordered
	 */
	protected rdcType radioduty = RADIODUTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSleep() <em>Sleep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSleep()
	 * @generated
	 * @ordered
	 */
	protected static final sleepType SLEEP_EDEFAULT = sleepType.NONE;

	/**
	 * The cached value of the '{@link #getSleep() <em>Sleep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSleep()
	 * @generated
	 * @ordered
	 */
	protected sleepType sleep = SLEEP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParametersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return USERPackage.Literals.PARAMETERS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public netType getNetwork() {
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetwork(netType newNetwork) {
		netType oldNetwork = network;
		network = newNetwork == null ? NETWORK_EDEFAULT : newNetwork;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, USERPackage.PARAMETERS__NETWORK, oldNetwork, network));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public macType getMac() {
		return mac;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMac(macType newMac) {
		macType oldMac = mac;
		mac = newMac == null ? MAC_EDEFAULT : newMac;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, USERPackage.PARAMETERS__MAC, oldMac, mac));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public rdcType getRadioduty() {
		return radioduty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRadioduty(rdcType newRadioduty) {
		rdcType oldRadioduty = radioduty;
		radioduty = newRadioduty == null ? RADIODUTY_EDEFAULT : newRadioduty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, USERPackage.PARAMETERS__RADIODUTY, oldRadioduty, radioduty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public sleepType getSleep() {
		return sleep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSleep(sleepType newSleep) {
		sleepType oldSleep = sleep;
		sleep = newSleep == null ? SLEEP_EDEFAULT : newSleep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, USERPackage.PARAMETERS__SLEEP, oldSleep, sleep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case USERPackage.PARAMETERS__NETWORK:
				return getNetwork();
			case USERPackage.PARAMETERS__MAC:
				return getMac();
			case USERPackage.PARAMETERS__RADIODUTY:
				return getRadioduty();
			case USERPackage.PARAMETERS__SLEEP:
				return getSleep();
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
			case USERPackage.PARAMETERS__NETWORK:
				setNetwork((netType)newValue);
				return;
			case USERPackage.PARAMETERS__MAC:
				setMac((macType)newValue);
				return;
			case USERPackage.PARAMETERS__RADIODUTY:
				setRadioduty((rdcType)newValue);
				return;
			case USERPackage.PARAMETERS__SLEEP:
				setSleep((sleepType)newValue);
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
			case USERPackage.PARAMETERS__NETWORK:
				setNetwork(NETWORK_EDEFAULT);
				return;
			case USERPackage.PARAMETERS__MAC:
				setMac(MAC_EDEFAULT);
				return;
			case USERPackage.PARAMETERS__RADIODUTY:
				setRadioduty(RADIODUTY_EDEFAULT);
				return;
			case USERPackage.PARAMETERS__SLEEP:
				setSleep(SLEEP_EDEFAULT);
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
			case USERPackage.PARAMETERS__NETWORK:
				return network != NETWORK_EDEFAULT;
			case USERPackage.PARAMETERS__MAC:
				return mac != MAC_EDEFAULT;
			case USERPackage.PARAMETERS__RADIODUTY:
				return radioduty != RADIODUTY_EDEFAULT;
			case USERPackage.PARAMETERS__SLEEP:
				return sleep != SLEEP_EDEFAULT;
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
		result.append(" (network: ");
		result.append(network);
		result.append(", mac: ");
		result.append(mac);
		result.append(", radioduty: ");
		result.append(radioduty);
		result.append(", sleep: ");
		result.append(sleep);
		result.append(')');
		return result.toString();
	}

} //ParametersImpl
