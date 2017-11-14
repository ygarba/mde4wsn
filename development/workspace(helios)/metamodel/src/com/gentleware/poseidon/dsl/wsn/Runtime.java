/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.gentleware.poseidon.dsl.wsn;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Runtime</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.Runtime#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.Runtime#getMote <em>Mote</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.gentleware.poseidon.dsl.wsn.USERPackage#getRuntime()
 * @model
 * @generated
 */
public interface Runtime extends PlatformElement {
	/**
	 * Returns the value of the '<em><b>Environment</b></em>' attribute.
	 * The literals are from the enumeration {@link com.gentleware.poseidon.dsl.wsn.EnvironmentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Environment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' attribute.
	 * @see com.gentleware.poseidon.dsl.wsn.EnvironmentType
	 * @see #setEnvironment(EnvironmentType)
	 * @see com.gentleware.poseidon.dsl.wsn.USERPackage#getRuntime_Environment()
	 * @model
	 * @generated
	 */
	EnvironmentType getEnvironment();

	/**
	 * Sets the value of the '{@link com.gentleware.poseidon.dsl.wsn.Runtime#getEnvironment <em>Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' attribute.
	 * @see com.gentleware.poseidon.dsl.wsn.EnvironmentType
	 * @see #getEnvironment()
	 * @generated
	 */
	void setEnvironment(EnvironmentType value);

	/**
	 * Returns the value of the '<em><b>Mote</b></em>' attribute.
	 * The literals are from the enumeration {@link com.gentleware.poseidon.dsl.wsn.MoteType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mote</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mote</em>' attribute.
	 * @see com.gentleware.poseidon.dsl.wsn.MoteType
	 * @see #setMote(MoteType)
	 * @see com.gentleware.poseidon.dsl.wsn.USERPackage#getRuntime_Mote()
	 * @model
	 * @generated
	 */
	MoteType getMote();

	/**
	 * Sets the value of the '{@link com.gentleware.poseidon.dsl.wsn.Runtime#getMote <em>Mote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mote</em>' attribute.
	 * @see com.gentleware.poseidon.dsl.wsn.MoteType
	 * @see #getMote()
	 * @generated
	 */
	void setMote(MoteType value);

} // Runtime
