/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.gentleware.poseidon.dsl.wsn;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remote Trigger Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.RemoteTriggerAction#getCode <em>Code</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.RemoteTriggerAction#getData <em>Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.gentleware.poseidon.dsl.wsn.USERPackage#getRemoteTriggerAction()
 * @model
 * @generated
 */
public interface RemoteTriggerAction extends Action {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(int)
	 * @see com.gentleware.poseidon.dsl.wsn.USERPackage#getRemoteTriggerAction_Code()
	 * @model default="0"
	 * @generated
	 */
	int getCode();

	/**
	 * Sets the value of the '{@link com.gentleware.poseidon.dsl.wsn.RemoteTriggerAction#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(int value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' attribute.
	 * The literals are from the enumeration {@link com.gentleware.poseidon.dsl.wsn.RemoteTriggerDataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' attribute.
	 * @see com.gentleware.poseidon.dsl.wsn.RemoteTriggerDataType
	 * @see #setData(RemoteTriggerDataType)
	 * @see com.gentleware.poseidon.dsl.wsn.USERPackage#getRemoteTriggerAction_Data()
	 * @model
	 * @generated
	 */
	RemoteTriggerDataType getData();

	/**
	 * Sets the value of the '{@link com.gentleware.poseidon.dsl.wsn.RemoteTriggerAction#getData <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' attribute.
	 * @see com.gentleware.poseidon.dsl.wsn.RemoteTriggerDataType
	 * @see #getData()
	 * @generated
	 */
	void setData(RemoteTriggerDataType value);

} // RemoteTriggerAction
