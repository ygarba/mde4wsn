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
 * A representation of the model object '<em><b>Aspect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.Aspect#getPointcut <em>Pointcut</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.Aspect#getAdvice <em>Advice</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.gentleware.poseidon.dsl.wsn.USERPackage#getAspect()
 * @model
 * @generated
 */
public interface Aspect extends EObject {
	/**
	 * Returns the value of the '<em><b>Pointcut</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pointcut</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pointcut</em>' containment reference.
	 * @see #setPointcut(Pointcut)
	 * @see com.gentleware.poseidon.dsl.wsn.USERPackage#getAspect_Pointcut()
	 * @model containment="true"
	 * @generated
	 */
	Pointcut getPointcut();

	/**
	 * Sets the value of the '{@link com.gentleware.poseidon.dsl.wsn.Aspect#getPointcut <em>Pointcut</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pointcut</em>' containment reference.
	 * @see #getPointcut()
	 * @generated
	 */
	void setPointcut(Pointcut value);

	/**
	 * Returns the value of the '<em><b>Advice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Advice</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Advice</em>' containment reference.
	 * @see #setAdvice(Advice)
	 * @see com.gentleware.poseidon.dsl.wsn.USERPackage#getAspect_Advice()
	 * @model containment="true"
	 * @generated
	 */
	Advice getAdvice();

	/**
	 * Sets the value of the '{@link com.gentleware.poseidon.dsl.wsn.Aspect#getAdvice <em>Advice</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Advice</em>' containment reference.
	 * @see #getAdvice()
	 * @generated
	 */
	void setAdvice(Advice value);

} // Aspect
