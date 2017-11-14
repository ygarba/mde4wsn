/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.gentleware.poseidon.dsl.wsn;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actuating Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.ActuatingAction#getActuatorId <em>Actuator Id</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.ActuatingAction#getData <em>Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.gentleware.poseidon.dsl.wsn.USERPackage#getActuatingAction()
 * @model
 * @generated
 */
public interface ActuatingAction extends Action {
	/**
	 * Returns the value of the '<em><b>Actuator Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actuator Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuator Id</em>' attribute.
	 * @see #setActuatorId(String)
	 * @see com.gentleware.poseidon.dsl.wsn.USERPackage#getActuatingAction_ActuatorId()
	 * @model
	 * @generated
	 */
	String getActuatorId();

	/**
	 * Sets the value of the '{@link com.gentleware.poseidon.dsl.wsn.ActuatingAction#getActuatorId <em>Actuator Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actuator Id</em>' attribute.
	 * @see #getActuatorId()
	 * @generated
	 */
	void setActuatorId(String value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' attribute.
	 * @see #setData(String)
	 * @see com.gentleware.poseidon.dsl.wsn.USERPackage#getActuatingAction_Data()
	 * @model
	 * @generated
	 */
	String getData();

	/**
	 * Sets the value of the '{@link com.gentleware.poseidon.dsl.wsn.ActuatingAction#getData <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' attribute.
	 * @see #getData()
	 * @generated
	 */
	void setData(String value);

} // ActuatingAction
