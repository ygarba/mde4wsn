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
 * A representation of the model object '<em><b>Communication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.Communication#getCommSource <em>Comm Source</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.Communication#getCommDestination <em>Comm Destination</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.gentleware.poseidon.dsl.wsn.USERPackage#getCommunication()
 * @model
 * @generated
 */
public interface Communication extends EObject {
	/**
	 * Returns the value of the '<em><b>Comm Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comm Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comm Source</em>' reference.
	 * @see #setCommSource(Node)
	 * @see com.gentleware.poseidon.dsl.wsn.USERPackage#getCommunication_CommSource()
	 * @model
	 * @generated
	 */
	Node getCommSource();

	/**
	 * Sets the value of the '{@link com.gentleware.poseidon.dsl.wsn.Communication#getCommSource <em>Comm Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comm Source</em>' reference.
	 * @see #getCommSource()
	 * @generated
	 */
	void setCommSource(Node value);

	/**
	 * Returns the value of the '<em><b>Comm Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comm Destination</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comm Destination</em>' reference.
	 * @see #setCommDestination(Node)
	 * @see com.gentleware.poseidon.dsl.wsn.USERPackage#getCommunication_CommDestination()
	 * @model
	 * @generated
	 */
	Node getCommDestination();

	/**
	 * Sets the value of the '{@link com.gentleware.poseidon.dsl.wsn.Communication#getCommDestination <em>Comm Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comm Destination</em>' reference.
	 * @see #getCommDestination()
	 * @generated
	 */
	void setCommDestination(Node value);

} // Communication
