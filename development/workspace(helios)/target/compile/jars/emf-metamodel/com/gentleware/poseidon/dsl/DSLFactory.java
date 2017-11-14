/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.gentleware.poseidon.dsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.gentleware.poseidon.dsl.DSLPackage
 * @generated
 */
public interface DSLFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DSLFactory eINSTANCE = com.gentleware.poseidon.dsl.impl.DSLFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Poseidon Core Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Poseidon Core Element</em>'.
	 * @generated
	 */
	PoseidonCoreElement createPoseidonCoreElement();

	/**
	 * Returns a new object of class '<em>JProperty</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JProperty</em>'.
	 * @generated
	 */
	J_Property createJ_Property();

	/**
	 * Returns a new object of class '<em>JFigure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JFigure</em>'.
	 * @generated
	 */
	J_Figure createJ_Figure();

	/**
	 * Returns a new object of class '<em>JFigure Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JFigure Container</em>'.
	 * @generated
	 */
	J_FigureContainer createJ_FigureContainer();

	/**
	 * Returns a new object of class '<em>JDiagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JDiagram</em>'.
	 * @generated
	 */
	J_Diagram createJ_Diagram();

	/**
	 * Returns a new object of class '<em>JDiagram Holder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JDiagram Holder</em>'.
	 * @generated
	 */
	J_DiagramHolder createJ_DiagramHolder();

	/**
	 * Returns a new object of class '<em>Poseidon Core Root Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Poseidon Core Root Element</em>'.
	 * @generated
	 */
	PoseidonCoreRootElement createPoseidonCoreRootElement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DSLPackage getDSLPackage();

} //DSLFactory
