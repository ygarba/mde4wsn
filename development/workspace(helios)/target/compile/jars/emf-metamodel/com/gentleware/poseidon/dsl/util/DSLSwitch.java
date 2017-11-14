/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.gentleware.poseidon.dsl.util;

import com.gentleware.poseidon.dsl.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.gentleware.poseidon.dsl.DSLPackage
 * @generated
 */
public class DSLSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DSLPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSLSwitch() {
		if (modelPackage == null) {
			modelPackage = DSLPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DSLPackage.POSEIDON_CORE_ELEMENT: {
				PoseidonCoreElement poseidonCoreElement = (PoseidonCoreElement)theEObject;
				T result = casePoseidonCoreElement(poseidonCoreElement);
				if (result == null) result = caseMetamodelElementWrapper(poseidonCoreElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DSLPackage.JPROPERTY: {
				J_Property j_Property = (J_Property)theEObject;
				T result = caseJ_Property(j_Property);
				if (result == null) result = casePoseidonCoreElement(j_Property);
				if (result == null) result = caseMetamodelElementWrapper(j_Property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DSLPackage.JFIGURE: {
				J_Figure j_Figure = (J_Figure)theEObject;
				T result = caseJ_Figure(j_Figure);
				if (result == null) result = caseJ_FigureContainer(j_Figure);
				if (result == null) result = casePoseidonCoreElement(j_Figure);
				if (result == null) result = caseMetamodelElementWrapper(j_Figure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DSLPackage.JFIGURE_CONTAINER: {
				J_FigureContainer j_FigureContainer = (J_FigureContainer)theEObject;
				T result = caseJ_FigureContainer(j_FigureContainer);
				if (result == null) result = casePoseidonCoreElement(j_FigureContainer);
				if (result == null) result = caseMetamodelElementWrapper(j_FigureContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DSLPackage.JDIAGRAM: {
				J_Diagram j_Diagram = (J_Diagram)theEObject;
				T result = caseJ_Diagram(j_Diagram);
				if (result == null) result = caseJ_FigureContainer(j_Diagram);
				if (result == null) result = casePoseidonCoreElement(j_Diagram);
				if (result == null) result = caseMetamodelElementWrapper(j_Diagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DSLPackage.JDIAGRAM_HOLDER: {
				J_DiagramHolder j_DiagramHolder = (J_DiagramHolder)theEObject;
				T result = caseJ_DiagramHolder(j_DiagramHolder);
				if (result == null) result = casePoseidonCoreElement(j_DiagramHolder);
				if (result == null) result = caseMetamodelElementWrapper(j_DiagramHolder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DSLPackage.POSEIDON_CORE_ROOT_ELEMENT: {
				PoseidonCoreRootElement poseidonCoreRootElement = (PoseidonCoreRootElement)theEObject;
				T result = casePoseidonCoreRootElement(poseidonCoreRootElement);
				if (result == null) result = casePoseidonCoreElement(poseidonCoreRootElement);
				if (result == null) result = caseMetamodelElementWrapper(poseidonCoreRootElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DSLPackage.METAMODEL_ELEMENT_WRAPPER: {
				MetamodelElementWrapper metamodelElementWrapper = (MetamodelElementWrapper)theEObject;
				T result = caseMetamodelElementWrapper(metamodelElementWrapper);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Poseidon Core Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Poseidon Core Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePoseidonCoreElement(PoseidonCoreElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JProperty</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JProperty</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJ_Property(J_Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JFigure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JFigure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJ_Figure(J_Figure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JFigure Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JFigure Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJ_FigureContainer(J_FigureContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JDiagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JDiagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJ_Diagram(J_Diagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JDiagram Holder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JDiagram Holder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJ_DiagramHolder(J_DiagramHolder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Poseidon Core Root Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Poseidon Core Root Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePoseidonCoreRootElement(PoseidonCoreRootElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metamodel Element Wrapper</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metamodel Element Wrapper</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetamodelElementWrapper(MetamodelElementWrapper object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //DSLSwitch
