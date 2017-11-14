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
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.Task#getBehaviorName <em>Behavior Name</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.Task#getActivationProfile <em>Activation Profile</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.Task#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.Task#getProfile <em>Profile</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.gentleware.poseidon.dsl.wsn.USERPackage#getTask()
 * @model
 * @generated
 */
public interface Task extends EObject {
	/**
	 * Returns the value of the '<em><b>Behavior Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavior Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior Name</em>' attribute.
	 * @see #setBehaviorName(String)
	 * @see com.gentleware.poseidon.dsl.wsn.USERPackage#getTask_BehaviorName()
	 * @model
	 * @generated
	 */
	String getBehaviorName();

	/**
	 * Sets the value of the '{@link com.gentleware.poseidon.dsl.wsn.Task#getBehaviorName <em>Behavior Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavior Name</em>' attribute.
	 * @see #getBehaviorName()
	 * @generated
	 */
	void setBehaviorName(String value);

	/**
	 * Returns the value of the '<em><b>Activation Profile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activation Profile</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activation Profile</em>' attribute.
	 * @see #setActivationProfile(String)
	 * @see com.gentleware.poseidon.dsl.wsn.USERPackage#getTask_ActivationProfile()
	 * @model
	 * @generated
	 */
	String getActivationProfile();

	/**
	 * Sets the value of the '{@link com.gentleware.poseidon.dsl.wsn.Task#getActivationProfile <em>Activation Profile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activation Profile</em>' attribute.
	 * @see #getActivationProfile()
	 * @generated
	 */
	void setActivationProfile(String value);

	/**
	 * Returns the value of the '<em><b>Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavior</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior</em>' containment reference.
	 * @see #setBehavior(StateMachine)
	 * @see com.gentleware.poseidon.dsl.wsn.USERPackage#getTask_Behavior()
	 * @model containment="true" required="true"
	 * @generated
	 */
	StateMachine getBehavior();

	/**
	 * Sets the value of the '{@link com.gentleware.poseidon.dsl.wsn.Task#getBehavior <em>Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavior</em>' containment reference.
	 * @see #getBehavior()
	 * @generated
	 */
	void setBehavior(StateMachine value);

	/**
	 * Returns the value of the '<em><b>Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profile</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile</em>' reference.
	 * @see #setProfile(ActivationProfile)
	 * @see com.gentleware.poseidon.dsl.wsn.USERPackage#getTask_Profile()
	 * @model
	 * @generated
	 */
	ActivationProfile getProfile();

	/**
	 * Sets the value of the '{@link com.gentleware.poseidon.dsl.wsn.Task#getProfile <em>Profile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile</em>' reference.
	 * @see #getProfile()
	 * @generated
	 */
	void setProfile(ActivationProfile value);

} // Task
