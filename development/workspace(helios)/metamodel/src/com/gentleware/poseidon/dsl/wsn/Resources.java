/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.gentleware.poseidon.dsl.wsn;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resources</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.Resources#getMemory <em>Memory</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.Resources#getFlash <em>Flash</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.gentleware.poseidon.dsl.wsn.USERPackage#getResources()
 * @model
 * @generated
 */
public interface Resources extends PlatformElement {
	/**
	 * Returns the value of the '<em><b>Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory</em>' attribute.
	 * @see #setMemory(int)
	 * @see com.gentleware.poseidon.dsl.wsn.USERPackage#getResources_Memory()
	 * @model
	 * @generated
	 */
	int getMemory();

	/**
	 * Sets the value of the '{@link com.gentleware.poseidon.dsl.wsn.Resources#getMemory <em>Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory</em>' attribute.
	 * @see #getMemory()
	 * @generated
	 */
	void setMemory(int value);

	/**
	 * Returns the value of the '<em><b>Flash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flash</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flash</em>' attribute.
	 * @see #setFlash(int)
	 * @see com.gentleware.poseidon.dsl.wsn.USERPackage#getResources_Flash()
	 * @model
	 * @generated
	 */
	int getFlash();

	/**
	 * Sets the value of the '{@link com.gentleware.poseidon.dsl.wsn.Resources#getFlash <em>Flash</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flash</em>' attribute.
	 * @see #getFlash()
	 * @generated
	 */
	void setFlash(int value);

} // Resources
