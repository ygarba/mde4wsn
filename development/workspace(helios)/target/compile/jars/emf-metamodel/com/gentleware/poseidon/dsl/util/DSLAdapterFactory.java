/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.gentleware.poseidon.dsl.util;

import com.gentleware.poseidon.dsl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.gentleware.poseidon.dsl.DSLPackage
 * @generated
 */
public class DSLAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DSLPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSLAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DSLPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DSLSwitch<Adapter> modelSwitch =
		new DSLSwitch<Adapter>() {
			@Override
			public Adapter casePoseidonCoreElement(PoseidonCoreElement object) {
				return createPoseidonCoreElementAdapter();
			}
			@Override
			public Adapter caseJ_Property(J_Property object) {
				return createJ_PropertyAdapter();
			}
			@Override
			public Adapter caseJ_Figure(J_Figure object) {
				return createJ_FigureAdapter();
			}
			@Override
			public Adapter caseJ_FigureContainer(J_FigureContainer object) {
				return createJ_FigureContainerAdapter();
			}
			@Override
			public Adapter caseJ_Diagram(J_Diagram object) {
				return createJ_DiagramAdapter();
			}
			@Override
			public Adapter caseJ_DiagramHolder(J_DiagramHolder object) {
				return createJ_DiagramHolderAdapter();
			}
			@Override
			public Adapter casePoseidonCoreRootElement(PoseidonCoreRootElement object) {
				return createPoseidonCoreRootElementAdapter();
			}
			@Override
			public Adapter caseMetamodelElementWrapper(MetamodelElementWrapper object) {
				return createMetamodelElementWrapperAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.gentleware.poseidon.dsl.PoseidonCoreElement <em>Poseidon Core Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.gentleware.poseidon.dsl.PoseidonCoreElement
	 * @generated
	 */
	public Adapter createPoseidonCoreElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.gentleware.poseidon.dsl.J_Property <em>JProperty</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.gentleware.poseidon.dsl.J_Property
	 * @generated
	 */
	public Adapter createJ_PropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.gentleware.poseidon.dsl.J_Figure <em>JFigure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.gentleware.poseidon.dsl.J_Figure
	 * @generated
	 */
	public Adapter createJ_FigureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.gentleware.poseidon.dsl.J_FigureContainer <em>JFigure Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.gentleware.poseidon.dsl.J_FigureContainer
	 * @generated
	 */
	public Adapter createJ_FigureContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.gentleware.poseidon.dsl.J_Diagram <em>JDiagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.gentleware.poseidon.dsl.J_Diagram
	 * @generated
	 */
	public Adapter createJ_DiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.gentleware.poseidon.dsl.J_DiagramHolder <em>JDiagram Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.gentleware.poseidon.dsl.J_DiagramHolder
	 * @generated
	 */
	public Adapter createJ_DiagramHolderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.gentleware.poseidon.dsl.PoseidonCoreRootElement <em>Poseidon Core Root Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.gentleware.poseidon.dsl.PoseidonCoreRootElement
	 * @generated
	 */
	public Adapter createPoseidonCoreRootElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.gentleware.poseidon.dsl.MetamodelElementWrapper <em>Metamodel Element Wrapper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.gentleware.poseidon.dsl.MetamodelElementWrapper
	 * @generated
	 */
	public Adapter createMetamodelElementWrapperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DSLAdapterFactory
