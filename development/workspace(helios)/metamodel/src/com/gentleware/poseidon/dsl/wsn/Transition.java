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
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.Transition#getGuard <em>Guard</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.Transition#getTriggerevent <em>Triggerevent</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.Transition#getTransitionFrom <em>Transition From</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.Transition#getTransitionTo <em>Transition To</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.Transition#getTrigger <em>Trigger</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.gentleware.poseidon.dsl.wsn.USERPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>Guard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard</em>' attribute.
	 * @see #setGuard(String)
	 * @see com.gentleware.poseidon.dsl.wsn.USERPackage#getTransition_Guard()
	 * @model
	 * @generated
	 */
	String getGuard();

	/**
	 * Sets the value of the '{@link com.gentleware.poseidon.dsl.wsn.Transition#getGuard <em>Guard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' attribute.
	 * @see #getGuard()
	 * @generated
	 */
	void setGuard(String value);

	/**
	 * Returns the value of the '<em><b>Triggerevent</b></em>' attribute.
	 * The literals are from the enumeration {@link com.gentleware.poseidon.dsl.wsn.EventType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triggerevent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggerevent</em>' attribute.
	 * @see com.gentleware.poseidon.dsl.wsn.EventType
	 * @see #setTriggerevent(EventType)
	 * @see com.gentleware.poseidon.dsl.wsn.USERPackage#getTransition_Triggerevent()
	 * @model
	 * @generated
	 */
	EventType getTriggerevent();

	/**
	 * Sets the value of the '{@link com.gentleware.poseidon.dsl.wsn.Transition#getTriggerevent <em>Triggerevent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Triggerevent</em>' attribute.
	 * @see com.gentleware.poseidon.dsl.wsn.EventType
	 * @see #getTriggerevent()
	 * @generated
	 */
	void setTriggerevent(EventType value);

	/**
	 * Returns the value of the '<em><b>Transition From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition From</em>' reference.
	 * @see #setTransitionFrom(State)
	 * @see com.gentleware.poseidon.dsl.wsn.USERPackage#getTransition_TransitionFrom()
	 * @model
	 * @generated
	 */
	State getTransitionFrom();

	/**
	 * Sets the value of the '{@link com.gentleware.poseidon.dsl.wsn.Transition#getTransitionFrom <em>Transition From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition From</em>' reference.
	 * @see #getTransitionFrom()
	 * @generated
	 */
	void setTransitionFrom(State value);

	/**
	 * Returns the value of the '<em><b>Transition To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition To</em>' reference.
	 * @see #setTransitionTo(State)
	 * @see com.gentleware.poseidon.dsl.wsn.USERPackage#getTransition_TransitionTo()
	 * @model
	 * @generated
	 */
	State getTransitionTo();

	/**
	 * Sets the value of the '{@link com.gentleware.poseidon.dsl.wsn.Transition#getTransitionTo <em>Transition To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition To</em>' reference.
	 * @see #getTransitionTo()
	 * @generated
	 */
	void setTransitionTo(State value);

	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' reference.
	 * @see #setTrigger(Event)
	 * @see com.gentleware.poseidon.dsl.wsn.USERPackage#getTransition_Trigger()
	 * @model
	 * @generated
	 */
	Event getTrigger();

	/**
	 * Sets the value of the '{@link com.gentleware.poseidon.dsl.wsn.Transition#getTrigger <em>Trigger</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger</em>' reference.
	 * @see #getTrigger()
	 * @generated
	 */
	void setTrigger(Event value);

} // Transition
