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
 * A representation of the model object '<em><b>Objectives</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.Objectives#getPower <em>Power</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.Objectives#getMemory <em>Memory</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.Objectives#getPacketloss <em>Packetloss</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.gentleware.poseidon.dsl.wsn.USERPackage#getObjectives()
 * @model
 * @generated
 */
public interface Objectives extends EObject {
	/**
	 * Returns the value of the '<em><b>Power</b></em>' attribute.
	 * The literals are from the enumeration {@link com.gentleware.poseidon.dsl.wsn.optimizationLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power</em>' attribute.
	 * @see com.gentleware.poseidon.dsl.wsn.optimizationLevel
	 * @see #setPower(optimizationLevel)
	 * @see com.gentleware.poseidon.dsl.wsn.USERPackage#getObjectives_Power()
	 * @model
	 * @generated
	 */
	optimizationLevel getPower();

	/**
	 * Sets the value of the '{@link com.gentleware.poseidon.dsl.wsn.Objectives#getPower <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power</em>' attribute.
	 * @see com.gentleware.poseidon.dsl.wsn.optimizationLevel
	 * @see #getPower()
	 * @generated
	 */
	void setPower(optimizationLevel value);

	/**
	 * Returns the value of the '<em><b>Memory</b></em>' attribute.
	 * The literals are from the enumeration {@link com.gentleware.poseidon.dsl.wsn.optimizationLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory</em>' attribute.
	 * @see com.gentleware.poseidon.dsl.wsn.optimizationLevel
	 * @see #setMemory(optimizationLevel)
	 * @see com.gentleware.poseidon.dsl.wsn.USERPackage#getObjectives_Memory()
	 * @model
	 * @generated
	 */
	optimizationLevel getMemory();

	/**
	 * Sets the value of the '{@link com.gentleware.poseidon.dsl.wsn.Objectives#getMemory <em>Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory</em>' attribute.
	 * @see com.gentleware.poseidon.dsl.wsn.optimizationLevel
	 * @see #getMemory()
	 * @generated
	 */
	void setMemory(optimizationLevel value);

	/**
	 * Returns the value of the '<em><b>Packetloss</b></em>' attribute.
	 * The literals are from the enumeration {@link com.gentleware.poseidon.dsl.wsn.optimizationLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packetloss</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packetloss</em>' attribute.
	 * @see com.gentleware.poseidon.dsl.wsn.optimizationLevel
	 * @see #setPacketloss(optimizationLevel)
	 * @see com.gentleware.poseidon.dsl.wsn.USERPackage#getObjectives_Packetloss()
	 * @model
	 * @generated
	 */
	optimizationLevel getPacketloss();

	/**
	 * Sets the value of the '{@link com.gentleware.poseidon.dsl.wsn.Objectives#getPacketloss <em>Packetloss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packetloss</em>' attribute.
	 * @see com.gentleware.poseidon.dsl.wsn.optimizationLevel
	 * @see #getPacketloss()
	 * @generated
	 */
	void setPacketloss(optimizationLevel value);

} // Objectives
