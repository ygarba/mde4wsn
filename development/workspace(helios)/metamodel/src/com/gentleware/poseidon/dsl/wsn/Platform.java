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
 * A representation of the model object '<em><b>Platform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.Platform#getAspect <em>Aspect</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.Platform#getSlot <em>Slot</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.gentleware.poseidon.dsl.wsn.USERPackage#getPlatform()
 * @model
 * @generated
 */
public interface Platform extends EObject {
	/**
	 * Returns the value of the '<em><b>Aspect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aspect</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aspect</em>' containment reference.
	 * @see #setAspect(Aspect)
	 * @see com.gentleware.poseidon.dsl.wsn.USERPackage#getPlatform_Aspect()
	 * @model containment="true"
	 * @generated
	 */
	Aspect getAspect();

	/**
	 * Sets the value of the '{@link com.gentleware.poseidon.dsl.wsn.Platform#getAspect <em>Aspect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aspect</em>' containment reference.
	 * @see #getAspect()
	 * @generated
	 */
	void setAspect(Aspect value);

	/**
	 * Returns the value of the '<em><b>Slot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slot</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slot</em>' containment reference.
	 * @see #setSlot(PlatformSlot)
	 * @see com.gentleware.poseidon.dsl.wsn.USERPackage#getPlatform_Slot()
	 * @model containment="true"
	 * @generated
	 */
	PlatformSlot getSlot();

	/**
	 * Sets the value of the '{@link com.gentleware.poseidon.dsl.wsn.Platform#getSlot <em>Slot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slot</em>' containment reference.
	 * @see #getSlot()
	 * @generated
	 */
	void setSlot(PlatformSlot value);

} // Platform
