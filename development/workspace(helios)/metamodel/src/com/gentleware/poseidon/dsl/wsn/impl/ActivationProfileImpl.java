/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.gentleware.poseidon.dsl.wsn.impl;

import com.gentleware.poseidon.dsl.wsn.ActivationProfile;
import com.gentleware.poseidon.dsl.wsn.ActivationType;
import com.gentleware.poseidon.dsl.wsn.USERPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activation Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.impl.ActivationProfileImpl#getSensor <em>Sensor</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.impl.ActivationProfileImpl#getActuator <em>Actuator</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.impl.ActivationProfileImpl#getDongle <em>Dongle</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.impl.ActivationProfileImpl#getBattery <em>Battery</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.impl.ActivationProfileImpl#getNeighbors <em>Neighbors</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.impl.ActivationProfileImpl#getSpecific <em>Specific</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.impl.ActivationProfileImpl#getValue <em>Value</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.impl.ActivationProfileImpl#getCh <em>Ch</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivationProfileImpl extends EObjectImpl implements ActivationProfile {
	/**
	 * The default value of the '{@link #getSensor() <em>Sensor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensor()
	 * @generated
	 * @ordered
	 */
	protected static final ActivationType SENSOR_EDEFAULT = ActivationType.DONT_CARE;

	/**
	 * The cached value of the '{@link #getSensor() <em>Sensor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensor()
	 * @generated
	 * @ordered
	 */
	protected ActivationType sensor = SENSOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getActuator() <em>Actuator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuator()
	 * @generated
	 * @ordered
	 */
	protected static final ActivationType ACTUATOR_EDEFAULT = ActivationType.DONT_CARE;

	/**
	 * The cached value of the '{@link #getActuator() <em>Actuator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuator()
	 * @generated
	 * @ordered
	 */
	protected ActivationType actuator = ACTUATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getDongle() <em>Dongle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDongle()
	 * @generated
	 * @ordered
	 */
	protected static final ActivationType DONGLE_EDEFAULT = ActivationType.DONT_CARE;

	/**
	 * The cached value of the '{@link #getDongle() <em>Dongle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDongle()
	 * @generated
	 * @ordered
	 */
	protected ActivationType dongle = DONGLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBattery() <em>Battery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBattery()
	 * @generated
	 * @ordered
	 */
	protected static final ActivationType BATTERY_EDEFAULT = ActivationType.DONT_CARE;

	/**
	 * The cached value of the '{@link #getBattery() <em>Battery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBattery()
	 * @generated
	 * @ordered
	 */
	protected ActivationType battery = BATTERY_EDEFAULT;

	/**
	 * The default value of the '{@link #getNeighbors() <em>Neighbors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeighbors()
	 * @generated
	 * @ordered
	 */
	protected static final ActivationType NEIGHBORS_EDEFAULT = ActivationType.DONT_CARE;

	/**
	 * The cached value of the '{@link #getNeighbors() <em>Neighbors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeighbors()
	 * @generated
	 * @ordered
	 */
	protected ActivationType neighbors = NEIGHBORS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpecific() <em>Specific</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecific()
	 * @generated
	 * @ordered
	 */
	protected static final ActivationType SPECIFIC_EDEFAULT = ActivationType.DONT_CARE;

	/**
	 * The cached value of the '{@link #getSpecific() <em>Specific</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecific()
	 * @generated
	 * @ordered
	 */
	protected ActivationType specific = SPECIFIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final int VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected int value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCh() <em>Ch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCh()
	 * @generated
	 * @ordered
	 */
	protected static final ActivationType CH_EDEFAULT = ActivationType.DONT_CARE;

	/**
	 * The cached value of the '{@link #getCh() <em>Ch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCh()
	 * @generated
	 * @ordered
	 */
	protected ActivationType ch = CH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivationProfileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return USERPackage.Literals.ACTIVATION_PROFILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivationType getSensor() {
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSensor(ActivationType newSensor) {
		ActivationType oldSensor = sensor;
		sensor = newSensor == null ? SENSOR_EDEFAULT : newSensor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, USERPackage.ACTIVATION_PROFILE__SENSOR, oldSensor, sensor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivationType getActuator() {
		return actuator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActuator(ActivationType newActuator) {
		ActivationType oldActuator = actuator;
		actuator = newActuator == null ? ACTUATOR_EDEFAULT : newActuator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, USERPackage.ACTIVATION_PROFILE__ACTUATOR, oldActuator, actuator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivationType getDongle() {
		return dongle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDongle(ActivationType newDongle) {
		ActivationType oldDongle = dongle;
		dongle = newDongle == null ? DONGLE_EDEFAULT : newDongle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, USERPackage.ACTIVATION_PROFILE__DONGLE, oldDongle, dongle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivationType getBattery() {
		return battery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBattery(ActivationType newBattery) {
		ActivationType oldBattery = battery;
		battery = newBattery == null ? BATTERY_EDEFAULT : newBattery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, USERPackage.ACTIVATION_PROFILE__BATTERY, oldBattery, battery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivationType getNeighbors() {
		return neighbors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeighbors(ActivationType newNeighbors) {
		ActivationType oldNeighbors = neighbors;
		neighbors = newNeighbors == null ? NEIGHBORS_EDEFAULT : newNeighbors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, USERPackage.ACTIVATION_PROFILE__NEIGHBORS, oldNeighbors, neighbors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivationType getSpecific() {
		return specific;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecific(ActivationType newSpecific) {
		ActivationType oldSpecific = specific;
		specific = newSpecific == null ? SPECIFIC_EDEFAULT : newSpecific;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, USERPackage.ACTIVATION_PROFILE__SPECIFIC, oldSpecific, specific));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(int newValue) {
		int oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, USERPackage.ACTIVATION_PROFILE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivationType getCh() {
		return ch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCh(ActivationType newCh) {
		ActivationType oldCh = ch;
		ch = newCh == null ? CH_EDEFAULT : newCh;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, USERPackage.ACTIVATION_PROFILE__CH, oldCh, ch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case USERPackage.ACTIVATION_PROFILE__SENSOR:
				return getSensor();
			case USERPackage.ACTIVATION_PROFILE__ACTUATOR:
				return getActuator();
			case USERPackage.ACTIVATION_PROFILE__DONGLE:
				return getDongle();
			case USERPackage.ACTIVATION_PROFILE__BATTERY:
				return getBattery();
			case USERPackage.ACTIVATION_PROFILE__NEIGHBORS:
				return getNeighbors();
			case USERPackage.ACTIVATION_PROFILE__SPECIFIC:
				return getSpecific();
			case USERPackage.ACTIVATION_PROFILE__VALUE:
				return getValue();
			case USERPackage.ACTIVATION_PROFILE__CH:
				return getCh();
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
			case USERPackage.ACTIVATION_PROFILE__SENSOR:
				setSensor((ActivationType)newValue);
				return;
			case USERPackage.ACTIVATION_PROFILE__ACTUATOR:
				setActuator((ActivationType)newValue);
				return;
			case USERPackage.ACTIVATION_PROFILE__DONGLE:
				setDongle((ActivationType)newValue);
				return;
			case USERPackage.ACTIVATION_PROFILE__BATTERY:
				setBattery((ActivationType)newValue);
				return;
			case USERPackage.ACTIVATION_PROFILE__NEIGHBORS:
				setNeighbors((ActivationType)newValue);
				return;
			case USERPackage.ACTIVATION_PROFILE__SPECIFIC:
				setSpecific((ActivationType)newValue);
				return;
			case USERPackage.ACTIVATION_PROFILE__VALUE:
				setValue((Integer)newValue);
				return;
			case USERPackage.ACTIVATION_PROFILE__CH:
				setCh((ActivationType)newValue);
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
			case USERPackage.ACTIVATION_PROFILE__SENSOR:
				setSensor(SENSOR_EDEFAULT);
				return;
			case USERPackage.ACTIVATION_PROFILE__ACTUATOR:
				setActuator(ACTUATOR_EDEFAULT);
				return;
			case USERPackage.ACTIVATION_PROFILE__DONGLE:
				setDongle(DONGLE_EDEFAULT);
				return;
			case USERPackage.ACTIVATION_PROFILE__BATTERY:
				setBattery(BATTERY_EDEFAULT);
				return;
			case USERPackage.ACTIVATION_PROFILE__NEIGHBORS:
				setNeighbors(NEIGHBORS_EDEFAULT);
				return;
			case USERPackage.ACTIVATION_PROFILE__SPECIFIC:
				setSpecific(SPECIFIC_EDEFAULT);
				return;
			case USERPackage.ACTIVATION_PROFILE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case USERPackage.ACTIVATION_PROFILE__CH:
				setCh(CH_EDEFAULT);
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
			case USERPackage.ACTIVATION_PROFILE__SENSOR:
				return sensor != SENSOR_EDEFAULT;
			case USERPackage.ACTIVATION_PROFILE__ACTUATOR:
				return actuator != ACTUATOR_EDEFAULT;
			case USERPackage.ACTIVATION_PROFILE__DONGLE:
				return dongle != DONGLE_EDEFAULT;
			case USERPackage.ACTIVATION_PROFILE__BATTERY:
				return battery != BATTERY_EDEFAULT;
			case USERPackage.ACTIVATION_PROFILE__NEIGHBORS:
				return neighbors != NEIGHBORS_EDEFAULT;
			case USERPackage.ACTIVATION_PROFILE__SPECIFIC:
				return specific != SPECIFIC_EDEFAULT;
			case USERPackage.ACTIVATION_PROFILE__VALUE:
				return value != VALUE_EDEFAULT;
			case USERPackage.ACTIVATION_PROFILE__CH:
				return ch != CH_EDEFAULT;
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
		result.append(" (sensor: ");
		result.append(sensor);
		result.append(", actuator: ");
		result.append(actuator);
		result.append(", dongle: ");
		result.append(dongle);
		result.append(", battery: ");
		result.append(battery);
		result.append(", neighbors: ");
		result.append(neighbors);
		result.append(", specific: ");
		result.append(specific);
		result.append(", value: ");
		result.append(value);
		result.append(", ch: ");
		result.append(ch);
		result.append(')');
		return result.toString();
	}

} //ActivationProfileImpl
