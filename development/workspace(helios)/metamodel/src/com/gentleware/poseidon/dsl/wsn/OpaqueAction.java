/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.gentleware.poseidon.dsl.wsn;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Opaque Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.OpaqueAction#getLanguage <em>Language</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.OpaqueAction#getType <em>Type</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.OpaqueAction#getCode <em>Code</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.OpaqueAction#getFile <em>File</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.gentleware.poseidon.dsl.wsn.USERPackage#getOpaqueAction()
 * @model
 * @generated
 */
public interface OpaqueAction extends Action {
	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * The literals are from the enumeration {@link com.gentleware.poseidon.dsl.wsn.Languages}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see com.gentleware.poseidon.dsl.wsn.Languages
	 * @see #setLanguage(Languages)
	 * @see com.gentleware.poseidon.dsl.wsn.USERPackage#getOpaqueAction_Language()
	 * @model
	 * @generated
	 */
	Languages getLanguage();

	/**
	 * Sets the value of the '{@link com.gentleware.poseidon.dsl.wsn.OpaqueAction#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see com.gentleware.poseidon.dsl.wsn.Languages
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(Languages value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.gentleware.poseidon.dsl.wsn.OpaqueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see com.gentleware.poseidon.dsl.wsn.OpaqueType
	 * @see #setType(OpaqueType)
	 * @see com.gentleware.poseidon.dsl.wsn.USERPackage#getOpaqueAction_Type()
	 * @model
	 * @generated
	 */
	OpaqueType getType();

	/**
	 * Sets the value of the '{@link com.gentleware.poseidon.dsl.wsn.OpaqueAction#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see com.gentleware.poseidon.dsl.wsn.OpaqueType
	 * @see #getType()
	 * @generated
	 */
	void setType(OpaqueType value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see com.gentleware.poseidon.dsl.wsn.USERPackage#getOpaqueAction_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link com.gentleware.poseidon.dsl.wsn.OpaqueAction#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File</em>' attribute.
	 * @see #setFile(String)
	 * @see com.gentleware.poseidon.dsl.wsn.USERPackage#getOpaqueAction_File()
	 * @model
	 * @generated
	 */
	String getFile();

	/**
	 * Sets the value of the '{@link com.gentleware.poseidon.dsl.wsn.OpaqueAction#getFile <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File</em>' attribute.
	 * @see #getFile()
	 * @generated
	 */
	void setFile(String value);

} // OpaqueAction
