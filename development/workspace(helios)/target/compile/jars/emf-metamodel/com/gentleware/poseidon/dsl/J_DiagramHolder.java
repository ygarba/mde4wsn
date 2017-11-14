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
 * A representation of the model object '<em><b>JDiagram Holder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.gentleware.poseidon.dsl.J_DiagramHolder#getDiagram <em>Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.gentleware.poseidon.dsl.DSLPackage#getJ_DiagramHolder()
 * @model
 * @generated
 */
public interface J_DiagramHolder extends PoseidonCoreElement {
	/**
	 * Returns the value of the '<em><b>Diagram</b></em>' containment reference list.
	 * The list contents are of type {@link com.gentleware.poseidon.dsl.J_Diagram}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram</em>' containment reference list.
	 * @see com.gentleware.poseidon.dsl.DSLPackage#getJ_DiagramHolder_Diagram()
	 * @model containment="true"
	 * @generated
	 */
	EList<J_Diagram> getDiagram();

} // J_DiagramHolder
