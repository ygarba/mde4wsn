/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.gentleware.poseidon.dsl.wsn;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Battery</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.Battery#getFull <em>Full</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.Battery#getEmpty <em>Empty</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.gentleware.poseidon.dsl.wsn.USERPackage#getBattery()
 * @model
 * @generated
 */
public interface Battery extends EnergySource {
	/**
	 * Returns the value of the '<em><b>Full</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Full</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Full</em>' attribute.
	 * @see #setFull(float)
	 * @see com.gentleware.poseidon.dsl.wsn.USERPackage#getBattery_Full()
	 * @model
	 * @generated
	 */
	float getFull();

	/**
	 * Sets the value of the '{@link com.gentleware.poseidon.dsl.wsn.Battery#getFull <em>Full</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Full</em>' attribute.
	 * @see #getFull()
	 * @generated
	 */
	void setFull(float value);

	/**
	 * Returns the value of the '<em><b>Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Empty</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Empty</em>' attribute.
	 * @see #setEmpty(float)
	 * @see com.gentleware.poseidon.dsl.wsn.USERPackage#getBattery_Empty()
	 * @model
	 * @generated
	 */
	float getEmpty();

	/**
	 * Sets the value of the '{@link com.gentleware.poseidon.dsl.wsn.Battery#getEmpty <em>Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Empty</em>' attribute.
	 * @see #getEmpty()
	 * @generated
	 */
	void setEmpty(float value);

} // Battery
