/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.gentleware.poseidon.dsl.wsn;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activation Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.ActivationProfile#getSensor <em>Sensor</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.ActivationProfile#getActuator <em>Actuator</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.ActivationProfile#getDongle <em>Dongle</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.ActivationProfile#getBattery <em>Battery</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.ActivationProfile#getNeighbors <em>Neighbors</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.ActivationProfile#getSpecific <em>Specific</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.ActivationProfile#getValue <em>Value</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.ActivationProfile#getCh <em>Ch</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.gentleware.poseidon.dsl.wsn.USERPackage#getActivationProfile()
 * @model
 * @generated
 */
public interface ActivationProfile extends EObject {
	/**
	 * Returns the value of the '<em><b>Sensor</b></em>' attribute.
	 * The literals are from the enumeration {@link com.gentleware.poseidon.dsl.wsn.ActivationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor</em>' attribute.
	 * @see com.gentleware.poseidon.dsl.wsn.ActivationType
	 * @see #setSensor(ActivationType)
	 * @see com.gentleware.poseidon.dsl.wsn.USERPackage#getActivationProfile_Sensor()
	 * @model
	 * @generated
	 */
	ActivationType getSensor();

	/**
	 * Sets the value of the '{@link com.gentleware.poseidon.dsl.wsn.ActivationProfile#getSensor <em>Sensor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor</em>' attribute.
	 * @see com.gentleware.poseidon.dsl.wsn.ActivationType
	 * @see #getSensor()
	 * @generated
	 */
	void setSensor(ActivationType value);

	/**
	 * Returns the value of the '<em><b>Actuator</b></em>' attribute.
	 * The literals are from the enumeration {@link com.gentleware.poseidon.dsl.wsn.ActivationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actuator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuator</em>' attribute.
	 * @see com.gentleware.poseidon.dsl.wsn.ActivationType
	 * @see #setActuator(ActivationType)
	 * @see com.gentleware.poseidon.dsl.wsn.USERPackage#getActivationProfile_Actuator()
	 * @model
	 * @generated
	 */
	ActivationType getActuator();

	/**
	 * Sets the value of the '{@link com.gentleware.poseidon.dsl.wsn.ActivationProfile#getActuator <em>Actuator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actuator</em>' attribute.
	 * @see com.gentleware.poseidon.dsl.wsn.ActivationType
	 * @see #getActuator()
	 * @generated
	 */
	void setActuator(ActivationType value);

	/**
	 * Returns the value of the '<em><b>Dongle</b></em>' attribute.
	 * The literals are from the enumeration {@link com.gentleware.poseidon.dsl.wsn.ActivationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dongle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dongle</em>' attribute.
	 * @see com.gentleware.poseidon.dsl.wsn.ActivationType
	 * @see #setDongle(ActivationType)
	 * @see com.gentleware.poseidon.dsl.wsn.USERPackage#getActivationProfile_Dongle()
	 * @model
	 * @generated
	 */
	ActivationType getDongle();

	/**
	 * Sets the value of the '{@link com.gentleware.poseidon.dsl.wsn.ActivationProfile#getDongle <em>Dongle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dongle</em>' attribute.
	 * @see com.gentleware.poseidon.dsl.wsn.ActivationType
	 * @see #getDongle()
	 * @generated
	 */
	void setDongle(ActivationType value);

	/**
	 * Returns the value of the '<em><b>Battery</b></em>' attribute.
	 * The literals are from the enumeration {@link com.gentleware.poseidon.dsl.wsn.ActivationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Battery</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Battery</em>' attribute.
	 * @see com.gentleware.poseidon.dsl.wsn.ActivationType
	 * @see #setBattery(ActivationType)
	 * @see com.gentleware.poseidon.dsl.wsn.USERPackage#getActivationProfile_Battery()
	 * @model
	 * @generated
	 */
	ActivationType getBattery();

	/**
	 * Sets the value of the '{@link com.gentleware.poseidon.dsl.wsn.ActivationProfile#getBattery <em>Battery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Battery</em>' attribute.
	 * @see com.gentleware.poseidon.dsl.wsn.ActivationType
	 * @see #getBattery()
	 * @generated
	 */
	void setBattery(ActivationType value);

	/**
	 * Returns the value of the '<em><b>Neighbors</b></em>' attribute.
	 * The literals are from the enumeration {@link com.gentleware.poseidon.dsl.wsn.ActivationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Neighbors</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neighbors</em>' attribute.
	 * @see com.gentleware.poseidon.dsl.wsn.ActivationType
	 * @see #setNeighbors(ActivationType)
	 * @see com.gentleware.poseidon.dsl.wsn.USERPackage#getActivationProfile_Neighbors()
	 * @model
	 * @generated
	 */
	ActivationType getNeighbors();

	/**
	 * Sets the value of the '{@link com.gentleware.poseidon.dsl.wsn.ActivationProfile#getNeighbors <em>Neighbors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neighbors</em>' attribute.
	 * @see com.gentleware.poseidon.dsl.wsn.ActivationType
	 * @see #getNeighbors()
	 * @generated
	 */
	void setNeighbors(ActivationType value);

	/**
	 * Returns the value of the '<em><b>Specific</b></em>' attribute.
	 * The literals are from the enumeration {@link com.gentleware.poseidon.dsl.wsn.ActivationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specific</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specific</em>' attribute.
	 * @see com.gentleware.poseidon.dsl.wsn.ActivationType
	 * @see #setSpecific(ActivationType)
	 * @see com.gentleware.poseidon.dsl.wsn.USERPackage#getActivationProfile_Specific()
	 * @model
	 * @generated
	 */
	ActivationType getSpecific();

	/**
	 * Sets the value of the '{@link com.gentleware.poseidon.dsl.wsn.ActivationProfile#getSpecific <em>Specific</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specific</em>' attribute.
	 * @see com.gentleware.poseidon.dsl.wsn.ActivationType
	 * @see #getSpecific()
	 * @generated
	 */
	void setSpecific(ActivationType value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see com.gentleware.poseidon.dsl.wsn.USERPackage#getActivationProfile_Value()
	 * @model
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link com.gentleware.poseidon.dsl.wsn.ActivationProfile#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

	/**
	 * Returns the value of the '<em><b>Ch</b></em>' attribute.
	 * The literals are from the enumeration {@link com.gentleware.poseidon.dsl.wsn.ActivationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ch</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ch</em>' attribute.
	 * @see com.gentleware.poseidon.dsl.wsn.ActivationType
	 * @see #setCh(ActivationType)
	 * @see com.gentleware.poseidon.dsl.wsn.USERPackage#getActivationProfile_Ch()
	 * @model
	 * @generated
	 */
	ActivationType getCh();

	/**
	 * Sets the value of the '{@link com.gentleware.poseidon.dsl.wsn.ActivationProfile#getCh <em>Ch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ch</em>' attribute.
	 * @see com.gentleware.poseidon.dsl.wsn.ActivationType
	 * @see #getCh()
	 * @generated
	 */
	void setCh(ActivationType value);

} // ActivationProfile
