/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.gentleware.poseidon.dsl.wsn;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.Network#getObjectives <em>Objectives</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.Network#getNodes <em>Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.gentleware.poseidon.dsl.wsn.USERPackage#getNetwork()
 * @model
 * @generated
 */
public interface Network extends EObject {
	/**
	 * Returns the value of the '<em><b>Objectives</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objectives</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objectives</em>' reference.
	 * @see #setObjectives(Objectives)
	 * @see com.gentleware.poseidon.dsl.wsn.USERPackage#getNetwork_Objectives()
	 * @model
	 * @generated
	 */
	Objectives getObjectives();

	/**
	 * Sets the value of the '{@link com.gentleware.poseidon.dsl.wsn.Network#getObjectives <em>Objectives</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objectives</em>' reference.
	 * @see #getObjectives()
	 * @generated
	 */
	void setObjectives(Objectives value);

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link com.gentleware.poseidon.dsl.wsn.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see com.gentleware.poseidon.dsl.wsn.USERPackage#getNetwork_Nodes()
	 * @model containment="true" upper="10"
	 * @generated
	 */
	EList<Node> getNodes();

} // Network
