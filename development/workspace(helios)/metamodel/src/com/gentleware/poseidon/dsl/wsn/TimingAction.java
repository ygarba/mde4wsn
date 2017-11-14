/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.gentleware.poseidon.dsl.wsn;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timing Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.TimingAction#getTime <em>Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.gentleware.poseidon.dsl.wsn.USERPackage#getTimingAction()
 * @model
 * @generated
 */
public interface TimingAction extends Action {
	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(int)
	 * @see com.gentleware.poseidon.dsl.wsn.USERPackage#getTimingAction_Time()
	 * @model
	 * @generated
	 */
	int getTime();

	/**
	 * Sets the value of the '{@link com.gentleware.poseidon.dsl.wsn.TimingAction#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(int value);

} // TimingAction
