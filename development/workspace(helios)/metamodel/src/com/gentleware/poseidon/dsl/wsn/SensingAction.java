/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.gentleware.poseidon.dsl.wsn;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensing Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.SensingAction#getSensorId <em>Sensor Id</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.SensingAction#getData <em>Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.gentleware.poseidon.dsl.wsn.USERPackage#getSensingAction()
 * @model
 * @generated
 */
public interface SensingAction extends Action {
	/**
	 * Returns the value of the '<em><b>Sensor Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensor Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor Id</em>' attribute.
	 * @see #setSensorId(String)
	 * @see com.gentleware.poseidon.dsl.wsn.USERPackage#getSensingAction_SensorId()
	 * @model
	 * @generated
	 */
	String getSensorId();

	/**
	 * Sets the value of the '{@link com.gentleware.poseidon.dsl.wsn.SensingAction#getSensorId <em>Sensor Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor Id</em>' attribute.
	 * @see #getSensorId()
	 * @generated
	 */
	void setSensorId(String value);

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
	 * @see com.gentleware.poseidon.dsl.wsn.USERPackage#getSensingAction_Data()
	 * @model
	 * @generated
	 */
	String getData();

	/**
	 * Sets the value of the '{@link com.gentleware.poseidon.dsl.wsn.SensingAction#getData <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' attribute.
	 * @see #getData()
	 * @generated
	 */
	void setData(String value);

} // SensingAction
