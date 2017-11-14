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
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.Activity#getIn <em>In</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.Activity#getOut <em>Out</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.Activity#isIsJointPoint <em>Is Joint Point</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.Activity#getId <em>Id</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.Activity#getInitialNode <em>Initial Node</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.Activity#getEdges <em>Edges</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.gentleware.poseidon.dsl.wsn.USERPackage#getActivity()
 * @model
 * @generated
 */
public interface Activity extends EObject {
	/**
	 * Returns the value of the '<em><b>In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' attribute.
	 * @see #setIn(String)
	 * @see com.gentleware.poseidon.dsl.wsn.USERPackage#getActivity_In()
	 * @model
	 * @generated
	 */
	String getIn();

	/**
	 * Sets the value of the '{@link com.gentleware.poseidon.dsl.wsn.Activity#getIn <em>In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In</em>' attribute.
	 * @see #getIn()
	 * @generated
	 */
	void setIn(String value);

	/**
	 * Returns the value of the '<em><b>Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out</em>' attribute.
	 * @see #setOut(String)
	 * @see com.gentleware.poseidon.dsl.wsn.USERPackage#getActivity_Out()
	 * @model
	 * @generated
	 */
	String getOut();

	/**
	 * Sets the value of the '{@link com.gentleware.poseidon.dsl.wsn.Activity#getOut <em>Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out</em>' attribute.
	 * @see #getOut()
	 * @generated
	 */
	void setOut(String value);

	/**
	 * Returns the value of the '<em><b>Is Joint Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Joint Point</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Joint Point</em>' attribute.
	 * @see #setIsJointPoint(boolean)
	 * @see com.gentleware.poseidon.dsl.wsn.USERPackage#getActivity_IsJointPoint()
	 * @model
	 * @generated
	 */
	boolean isIsJointPoint();

	/**
	 * Sets the value of the '{@link com.gentleware.poseidon.dsl.wsn.Activity#isIsJointPoint <em>Is Joint Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Joint Point</em>' attribute.
	 * @see #isIsJointPoint()
	 * @generated
	 */
	void setIsJointPoint(boolean value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see com.gentleware.poseidon.dsl.wsn.USERPackage#getActivity_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link com.gentleware.poseidon.dsl.wsn.Activity#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Initial Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Node</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Node</em>' containment reference.
	 * @see #setInitialNode(ActivityNode)
	 * @see com.gentleware.poseidon.dsl.wsn.USERPackage#getActivity_InitialNode()
	 * @model containment="true"
	 * @generated
	 */
	ActivityNode getInitialNode();

	/**
	 * Sets the value of the '{@link com.gentleware.poseidon.dsl.wsn.Activity#getInitialNode <em>Initial Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Node</em>' containment reference.
	 * @see #getInitialNode()
	 * @generated
	 */
	void setInitialNode(ActivityNode value);

	/**
	 * Returns the value of the '<em><b>Edges</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edges</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edges</em>' containment reference.
	 * @see #setEdges(ActivityEdge)
	 * @see com.gentleware.poseidon.dsl.wsn.USERPackage#getActivity_Edges()
	 * @model containment="true"
	 * @generated
	 */
	ActivityEdge getEdges();

	/**
	 * Sets the value of the '{@link com.gentleware.poseidon.dsl.wsn.Activity#getEdges <em>Edges</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edges</em>' containment reference.
	 * @see #getEdges()
	 * @generated
	 */
	void setEdges(ActivityEdge value);

} // Activity
