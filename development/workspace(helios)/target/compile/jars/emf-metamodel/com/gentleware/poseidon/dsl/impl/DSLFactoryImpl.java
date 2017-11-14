/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.gentleware.poseidon.dsl.impl;

import com.gentleware.poseidon.dsl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DSLFactoryImpl extends EFactoryImpl implements DSLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DSLFactory init() {
		try {
			DSLFactory theDSLFactory = (DSLFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.gentleware.com/poseidon/dsl/1.0"); 
			if (theDSLFactory != null) {
				return theDSLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DSLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSLFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DSLPackage.POSEIDON_CORE_ELEMENT: return createPoseidonCoreElement();
			case DSLPackage.JPROPERTY: return createJ_Property();
			case DSLPackage.JFIGURE: return createJ_Figure();
			case DSLPackage.JFIGURE_CONTAINER: return createJ_FigureContainer();
			case DSLPackage.JDIAGRAM: return createJ_Diagram();
			case DSLPackage.JDIAGRAM_HOLDER: return createJ_DiagramHolder();
			case DSLPackage.POSEIDON_CORE_ROOT_ELEMENT: return createPoseidonCoreRootElement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case DSLPackage.STRING:
				return createStringFromString(eDataType, initialValue);
			case DSLPackage.BOOLEAN:
				return createBooleanFromString(eDataType, initialValue);
			case DSLPackage.INTEGER:
				return createIntegerFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case DSLPackage.STRING:
				return convertStringToString(eDataType, instanceValue);
			case DSLPackage.BOOLEAN:
				return convertBooleanToString(eDataType, instanceValue);
			case DSLPackage.INTEGER:
				return convertIntegerToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PoseidonCoreElement createPoseidonCoreElement() {
		PoseidonCoreElementImpl poseidonCoreElement = new PoseidonCoreElementImpl();
		return poseidonCoreElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public J_Property createJ_Property() {
		J_PropertyImpl j_Property = new J_PropertyImpl();
		return j_Property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public J_Figure createJ_Figure() {
		J_FigureImpl j_Figure = new J_FigureImpl();
		return j_Figure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public J_FigureContainer createJ_FigureContainer() {
		J_FigureContainerImpl j_FigureContainer = new J_FigureContainerImpl();
		return j_FigureContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public J_Diagram createJ_Diagram() {
		J_DiagramImpl j_Diagram = new J_DiagramImpl();
		return j_Diagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public J_DiagramHolder createJ_DiagramHolder() {
		J_DiagramHolderImpl j_DiagramHolder = new J_DiagramHolderImpl();
		return j_DiagramHolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PoseidonCoreRootElement createPoseidonCoreRootElement() {
		PoseidonCoreRootElementImpl poseidonCoreRootElement = new PoseidonCoreRootElementImpl();
		return poseidonCoreRootElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStringFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStringToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createBooleanFromString(EDataType eDataType, String initialValue) {
		return (Boolean)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createIntegerFromString(EDataType eDataType, String initialValue) {
		return (Integer)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntegerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSLPackage getDSLPackage() {
		return (DSLPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DSLPackage getPackage() {
		return DSLPackage.eINSTANCE;
	}

} //DSLFactoryImpl
