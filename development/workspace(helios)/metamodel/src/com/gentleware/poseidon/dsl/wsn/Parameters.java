/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.gentleware.poseidon.dsl.wsn;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.Parameters#getNetwork <em>Network</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.Parameters#getMac <em>Mac</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.Parameters#getRadioduty <em>Radioduty</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.Parameters#getSleep <em>Sleep</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.gentleware.poseidon.dsl.wsn.USERPackage#getParameters()
 * @model
 * @generated
 */
public interface Parameters extends PlatformElement {
	/**
	 * Returns the value of the '<em><b>Network</b></em>' attribute.
	 * The literals are from the enumeration {@link com.gentleware.poseidon.dsl.wsn.netType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network</em>' attribute.
	 * @see com.gentleware.poseidon.dsl.wsn.netType
	 * @see #setNetwork(netType)
	 * @see com.gentleware.poseidon.dsl.wsn.USERPackage#getParameters_Network()
	 * @model
	 * @generated
	 */
	netType getNetwork();

	/**
	 * Sets the value of the '{@link com.gentleware.poseidon.dsl.wsn.Parameters#getNetwork <em>Network</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network</em>' attribute.
	 * @see com.gentleware.poseidon.dsl.wsn.netType
	 * @see #getNetwork()
	 * @generated
	 */
	void setNetwork(netType value);

	/**
	 * Returns the value of the '<em><b>Mac</b></em>' attribute.
	 * The literals are from the enumeration {@link com.gentleware.poseidon.dsl.wsn.macType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mac</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mac</em>' attribute.
	 * @see com.gentleware.poseidon.dsl.wsn.macType
	 * @see #setMac(macType)
	 * @see com.gentleware.poseidon.dsl.wsn.USERPackage#getParameters_Mac()
	 * @model
	 * @generated
	 */
	macType getMac();

	/**
	 * Sets the value of the '{@link com.gentleware.poseidon.dsl.wsn.Parameters#getMac <em>Mac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mac</em>' attribute.
	 * @see com.gentleware.poseidon.dsl.wsn.macType
	 * @see #getMac()
	 * @generated
	 */
	void setMac(macType value);

	/**
	 * Returns the value of the '<em><b>Radioduty</b></em>' attribute.
	 * The literals are from the enumeration {@link com.gentleware.poseidon.dsl.wsn.rdcType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Radioduty</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radioduty</em>' attribute.
	 * @see com.gentleware.poseidon.dsl.wsn.rdcType
	 * @see #setRadioduty(rdcType)
	 * @see com.gentleware.poseidon.dsl.wsn.USERPackage#getParameters_Radioduty()
	 * @model
	 * @generated
	 */
	rdcType getRadioduty();

	/**
	 * Sets the value of the '{@link com.gentleware.poseidon.dsl.wsn.Parameters#getRadioduty <em>Radioduty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radioduty</em>' attribute.
	 * @see com.gentleware.poseidon.dsl.wsn.rdcType
	 * @see #getRadioduty()
	 * @generated
	 */
	void setRadioduty(rdcType value);

	/**
	 * Returns the value of the '<em><b>Sleep</b></em>' attribute.
	 * The literals are from the enumeration {@link com.gentleware.poseidon.dsl.wsn.sleepType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sleep</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sleep</em>' attribute.
	 * @see com.gentleware.poseidon.dsl.wsn.sleepType
	 * @see #setSleep(sleepType)
	 * @see com.gentleware.poseidon.dsl.wsn.USERPackage#getParameters_Sleep()
	 * @model
	 * @generated
	 */
	sleepType getSleep();

	/**
	 * Sets the value of the '{@link com.gentleware.poseidon.dsl.wsn.Parameters#getSleep <em>Sleep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sleep</em>' attribute.
	 * @see com.gentleware.poseidon.dsl.wsn.sleepType
	 * @see #getSleep()
	 * @generated
	 */
	void setSleep(sleepType value);

} // Parameters
