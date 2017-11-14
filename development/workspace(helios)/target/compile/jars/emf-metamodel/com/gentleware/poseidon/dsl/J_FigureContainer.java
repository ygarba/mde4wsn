/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.gentleware.poseidon.dsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JFigure Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.gentleware.poseidon.dsl.J_FigureContainer#getFigures <em>Figures</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.J_FigureContainer#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.gentleware.poseidon.dsl.DSLPackage#getJ_FigureContainer()
 * @model
 * @generated
 */
public interface J_FigureContainer extends PoseidonCoreElement {
	/**
	 * Returns the value of the '<em><b>Figures</b></em>' containment reference list.
	 * The list contents are of type {@link com.gentleware.poseidon.dsl.J_Figure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Figures</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Figures</em>' containment reference list.
	 * @see com.gentleware.poseidon.dsl.DSLPackage#getJ_FigureContainer_Figures()
	 * @model containment="true"
	 * @generated
	 */
	EList<J_Figure> getFigures();

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link com.gentleware.poseidon.dsl.J_Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see com.gentleware.poseidon.dsl.DSLPackage#getJ_FigureContainer_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<J_Property> getProperties();

} // J_FigureContainer
