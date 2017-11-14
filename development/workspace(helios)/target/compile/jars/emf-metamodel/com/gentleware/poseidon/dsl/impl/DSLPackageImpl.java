/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.gentleware.poseidon.dsl.impl;

import com.gentleware.poseidon.dsl.DSLFactory;
import com.gentleware.poseidon.dsl.DSLPackage;
import com.gentleware.poseidon.dsl.J_Diagram;
import com.gentleware.poseidon.dsl.J_DiagramHolder;
import com.gentleware.poseidon.dsl.J_Figure;
import com.gentleware.poseidon.dsl.J_FigureContainer;
import com.gentleware.poseidon.dsl.J_Property;
import com.gentleware.poseidon.dsl.MetamodelElementWrapper;
import com.gentleware.poseidon.dsl.PoseidonCoreElement;
import com.gentleware.poseidon.dsl.PoseidonCoreRootElement;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DSLPackageImpl extends EPackageImpl implements DSLPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass poseidonCoreElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass j_PropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass j_FigureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass j_FigureContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass j_DiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass j_DiagramHolderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass poseidonCoreRootElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metamodelElementWrapperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stringEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType booleanEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType integerEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.gentleware.poseidon.dsl.DSLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DSLPackageImpl() {
		super(eNS_URI, DSLFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DSLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DSLPackage init() {
		if (isInited) return (DSLPackage)EPackage.Registry.INSTANCE.getEPackage(DSLPackage.eNS_URI);

		// Obtain or create and register package
		DSLPackageImpl theDSLPackage = (DSLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DSLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DSLPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theDSLPackage.createPackageContents();

		// Initialize created meta-data
		theDSLPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDSLPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DSLPackage.eNS_URI, theDSLPackage);
		return theDSLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPoseidonCoreElement() {
		return poseidonCoreElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJ_Property() {
		return j_PropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJ_Property_Value() {
		return (EAttribute)j_PropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJ_Property_Name() {
		return (EAttribute)j_PropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJ_Figure() {
		return j_FigureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJ_Figure_Id() {
		return (EAttribute)j_FigureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJ_Figure_Recreator() {
		return (EAttribute)j_FigureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJ_Figure_Anchor1Id() {
		return (EAttribute)j_FigureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJ_Figure_Anchor2Id() {
		return (EAttribute)j_FigureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJ_Figure_ContainedName() {
		return (EAttribute)j_FigureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJ_Figure_Text() {
		return (EAttribute)j_FigureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJ_Figure_VirtualPoint() {
		return (EAttribute)j_FigureEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJ_Figure_Points() {
		return (EAttribute)j_FigureEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJ_Figure_BrOffset() {
		return (EAttribute)j_FigureEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJ_Figure_TlOffset() {
		return (EAttribute)j_FigureEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJ_Figure_Show() {
		return (EAttribute)j_FigureEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJ_Figure_Autosized() {
		return (EAttribute)j_FigureEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJ_Figure_Icon() {
		return (EAttribute)j_FigureEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJ_Figure_Point() {
		return (EAttribute)j_FigureEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJ_Figure_Dimensions() {
		return (EAttribute)j_FigureEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJ_Figure_SuppressAttributes() {
		return (EAttribute)j_FigureEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJ_Figure_SuppressOperations() {
		return (EAttribute)j_FigureEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJ_Figure_SuppressContents() {
		return (EAttribute)j_FigureEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJ_Figure_Offset() {
		return (EAttribute)j_FigureEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJ_Figure_Min() {
		return (EAttribute)j_FigureEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJ_Figure_Accessibility() {
		return (EAttribute)j_FigureEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJ_Figure_ClassifierScope() {
		return (EAttribute)j_FigureEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJ_Figure_Type() {
		return (EAttribute)j_FigureEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJ_Figure_Subject() {
		return (EReference)j_FigureEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJ_FigureContainer() {
		return j_FigureContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJ_FigureContainer_Figures() {
		return (EReference)j_FigureContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJ_FigureContainer_Properties() {
		return (EReference)j_FigureContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJ_Diagram() {
		return j_DiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJ_Diagram_LastFigureId() {
		return (EAttribute)j_DiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJ_Diagram_SaveTime() {
		return (EAttribute)j_DiagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJ_Diagram_SavedBy() {
		return (EAttribute)j_DiagramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJ_Diagram_Type() {
		return (EAttribute)j_DiagramEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJ_DiagramHolder() {
		return j_DiagramHolderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJ_DiagramHolder_Diagram() {
		return (EReference)j_DiagramHolderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPoseidonCoreRootElement() {
		return poseidonCoreRootElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetamodelElementWrapper() {
		return metamodelElementWrapperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetamodelElementWrapper___uuid() {
		return (EAttribute)metamodelElementWrapperEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetamodelElementWrapper_J_deleted() {
		return (EAttribute)metamodelElementWrapperEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetamodelElementWrapper_J_diagramHolder() {
		return (EReference)metamodelElementWrapperEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetamodelElementWrapper___readOnly() {
		return (EAttribute)metamodelElementWrapperEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetamodelElementWrapper___poseidonName() {
		return (EAttribute)metamodelElementWrapperEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetamodelElementWrapper___poseidonNamespace() {
		return (EAttribute)metamodelElementWrapperEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetamodelElementWrapper___ownedMember() {
		return (EReference)metamodelElementWrapperEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetamodelElementWrapper___source() {
		return (EReference)metamodelElementWrapperEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetamodelElementWrapper___target() {
		return (EReference)metamodelElementWrapperEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetamodelElementWrapper___poseidonEdge() {
		return (EAttribute)metamodelElementWrapperEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetamodelElementWrapper___poseidonRole() {
		return (EAttribute)metamodelElementWrapperEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getString() {
		return stringEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBoolean() {
		return booleanEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInteger() {
		return integerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSLFactory getDSLFactory() {
		return (DSLFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		poseidonCoreElementEClass = createEClass(POSEIDON_CORE_ELEMENT);

		j_PropertyEClass = createEClass(JPROPERTY);
		createEAttribute(j_PropertyEClass, JPROPERTY__VALUE);
		createEAttribute(j_PropertyEClass, JPROPERTY__NAME);

		j_FigureEClass = createEClass(JFIGURE);
		createEAttribute(j_FigureEClass, JFIGURE__ID);
		createEAttribute(j_FigureEClass, JFIGURE__RECREATOR);
		createEAttribute(j_FigureEClass, JFIGURE__ANCHOR1_ID);
		createEAttribute(j_FigureEClass, JFIGURE__ANCHOR2_ID);
		createEAttribute(j_FigureEClass, JFIGURE__CONTAINED_NAME);
		createEAttribute(j_FigureEClass, JFIGURE__TEXT);
		createEAttribute(j_FigureEClass, JFIGURE__VIRTUAL_POINT);
		createEAttribute(j_FigureEClass, JFIGURE__POINTS);
		createEAttribute(j_FigureEClass, JFIGURE__BR_OFFSET);
		createEAttribute(j_FigureEClass, JFIGURE__TL_OFFSET);
		createEAttribute(j_FigureEClass, JFIGURE__SHOW);
		createEAttribute(j_FigureEClass, JFIGURE__AUTOSIZED);
		createEAttribute(j_FigureEClass, JFIGURE__ICON);
		createEAttribute(j_FigureEClass, JFIGURE__POINT);
		createEAttribute(j_FigureEClass, JFIGURE__DIMENSIONS);
		createEAttribute(j_FigureEClass, JFIGURE__SUPPRESS_ATTRIBUTES);
		createEAttribute(j_FigureEClass, JFIGURE__SUPPRESS_OPERATIONS);
		createEAttribute(j_FigureEClass, JFIGURE__SUPPRESS_CONTENTS);
		createEAttribute(j_FigureEClass, JFIGURE__OFFSET);
		createEAttribute(j_FigureEClass, JFIGURE__MIN);
		createEAttribute(j_FigureEClass, JFIGURE__ACCESSIBILITY);
		createEAttribute(j_FigureEClass, JFIGURE__CLASSIFIER_SCOPE);
		createEAttribute(j_FigureEClass, JFIGURE__TYPE);
		createEReference(j_FigureEClass, JFIGURE__SUBJECT);

		j_FigureContainerEClass = createEClass(JFIGURE_CONTAINER);
		createEReference(j_FigureContainerEClass, JFIGURE_CONTAINER__FIGURES);
		createEReference(j_FigureContainerEClass, JFIGURE_CONTAINER__PROPERTIES);

		j_DiagramEClass = createEClass(JDIAGRAM);
		createEAttribute(j_DiagramEClass, JDIAGRAM__LAST_FIGURE_ID);
		createEAttribute(j_DiagramEClass, JDIAGRAM__SAVE_TIME);
		createEAttribute(j_DiagramEClass, JDIAGRAM__SAVED_BY);
		createEAttribute(j_DiagramEClass, JDIAGRAM__TYPE);

		j_DiagramHolderEClass = createEClass(JDIAGRAM_HOLDER);
		createEReference(j_DiagramHolderEClass, JDIAGRAM_HOLDER__DIAGRAM);

		poseidonCoreRootElementEClass = createEClass(POSEIDON_CORE_ROOT_ELEMENT);

		metamodelElementWrapperEClass = createEClass(METAMODEL_ELEMENT_WRAPPER);
		createEAttribute(metamodelElementWrapperEClass, METAMODEL_ELEMENT_WRAPPER__UUID);
		createEAttribute(metamodelElementWrapperEClass, METAMODEL_ELEMENT_WRAPPER__JDELETED);
		createEReference(metamodelElementWrapperEClass, METAMODEL_ELEMENT_WRAPPER__JDIAGRAM_HOLDER);
		createEAttribute(metamodelElementWrapperEClass, METAMODEL_ELEMENT_WRAPPER__READ_ONLY);
		createEAttribute(metamodelElementWrapperEClass, METAMODEL_ELEMENT_WRAPPER__POSEIDON_NAME);
		createEAttribute(metamodelElementWrapperEClass, METAMODEL_ELEMENT_WRAPPER__POSEIDON_NAMESPACE);
		createEReference(metamodelElementWrapperEClass, METAMODEL_ELEMENT_WRAPPER__OWNED_MEMBER);
		createEReference(metamodelElementWrapperEClass, METAMODEL_ELEMENT_WRAPPER__SOURCE);
		createEReference(metamodelElementWrapperEClass, METAMODEL_ELEMENT_WRAPPER__TARGET);
		createEAttribute(metamodelElementWrapperEClass, METAMODEL_ELEMENT_WRAPPER__POSEIDON_EDGE);
		createEAttribute(metamodelElementWrapperEClass, METAMODEL_ELEMENT_WRAPPER__POSEIDON_ROLE);

		// Create data types
		stringEDataType = createEDataType(STRING);
		booleanEDataType = createEDataType(BOOLEAN);
		integerEDataType = createEDataType(INTEGER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		poseidonCoreElementEClass.getESuperTypes().add(this.getMetamodelElementWrapper());
		j_PropertyEClass.getESuperTypes().add(this.getPoseidonCoreElement());
		j_FigureEClass.getESuperTypes().add(this.getJ_FigureContainer());
		j_FigureContainerEClass.getESuperTypes().add(this.getPoseidonCoreElement());
		j_DiagramEClass.getESuperTypes().add(this.getJ_FigureContainer());
		j_DiagramHolderEClass.getESuperTypes().add(this.getPoseidonCoreElement());
		poseidonCoreRootElementEClass.getESuperTypes().add(this.getPoseidonCoreElement());

		// Initialize classes and features; add operations and parameters
		initEClass(poseidonCoreElementEClass, PoseidonCoreElement.class, "PoseidonCoreElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(j_PropertyEClass, J_Property.class, "J_Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJ_Property_Value(), ecorePackage.getEString(), "value", null, 0, 1, J_Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJ_Property_Name(), ecorePackage.getEString(), "name", null, 0, 1, J_Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(j_FigureEClass, J_Figure.class, "J_Figure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJ_Figure_Id(), ecorePackage.getEString(), "id", null, 0, 1, J_Figure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJ_Figure_Recreator(), ecorePackage.getEString(), "recreator", null, 0, 1, J_Figure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJ_Figure_Anchor1Id(), ecorePackage.getEString(), "anchor1Id", null, 0, 1, J_Figure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJ_Figure_Anchor2Id(), ecorePackage.getEString(), "anchor2Id", null, 0, 1, J_Figure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJ_Figure_ContainedName(), ecorePackage.getEString(), "containedName", null, 0, 1, J_Figure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJ_Figure_Text(), ecorePackage.getEString(), "text", null, 0, 1, J_Figure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJ_Figure_VirtualPoint(), ecorePackage.getEString(), "virtualPoint", null, 0, 1, J_Figure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJ_Figure_Points(), ecorePackage.getEString(), "points", null, 0, 1, J_Figure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJ_Figure_BrOffset(), ecorePackage.getEString(), "brOffset", null, 0, 1, J_Figure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJ_Figure_TlOffset(), ecorePackage.getEString(), "tlOffset", null, 0, 1, J_Figure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJ_Figure_Show(), ecorePackage.getEString(), "show", null, 0, 1, J_Figure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJ_Figure_Autosized(), ecorePackage.getEString(), "autosized", null, 0, 1, J_Figure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJ_Figure_Icon(), ecorePackage.getEString(), "icon", null, 0, 1, J_Figure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJ_Figure_Point(), ecorePackage.getEString(), "point", null, 0, 1, J_Figure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJ_Figure_Dimensions(), ecorePackage.getEString(), "dimensions", null, 0, 1, J_Figure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJ_Figure_SuppressAttributes(), ecorePackage.getEString(), "suppressAttributes", null, 0, 1, J_Figure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJ_Figure_SuppressOperations(), ecorePackage.getEString(), "suppressOperations", null, 0, 1, J_Figure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJ_Figure_SuppressContents(), ecorePackage.getEString(), "suppressContents", null, 0, 1, J_Figure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJ_Figure_Offset(), ecorePackage.getEString(), "offset", null, 0, 1, J_Figure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJ_Figure_Min(), ecorePackage.getEString(), "min", null, 0, 1, J_Figure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJ_Figure_Accessibility(), ecorePackage.getEString(), "accessibility", null, 0, 1, J_Figure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJ_Figure_ClassifierScope(), ecorePackage.getEString(), "classifierScope", null, 0, 1, J_Figure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJ_Figure_Type(), ecorePackage.getEString(), "type", null, 0, 1, J_Figure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJ_Figure_Subject(), ecorePackage.getEObject(), null, "subject", null, 0, 1, J_Figure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(j_FigureContainerEClass, J_FigureContainer.class, "J_FigureContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJ_FigureContainer_Figures(), this.getJ_Figure(), null, "figures", null, 0, -1, J_FigureContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJ_FigureContainer_Properties(), this.getJ_Property(), null, "properties", null, 0, -1, J_FigureContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(j_DiagramEClass, J_Diagram.class, "J_Diagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJ_Diagram_LastFigureId(), ecorePackage.getEInt(), "lastFigureId", null, 0, 1, J_Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJ_Diagram_SaveTime(), ecorePackage.getEString(), "saveTime", null, 0, 1, J_Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJ_Diagram_SavedBy(), ecorePackage.getEString(), "savedBy", null, 0, 1, J_Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJ_Diagram_Type(), ecorePackage.getEString(), "type", null, 0, 1, J_Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(j_DiagramHolderEClass, J_DiagramHolder.class, "J_DiagramHolder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJ_DiagramHolder_Diagram(), this.getJ_Diagram(), null, "diagram", null, 0, -1, J_DiagramHolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(poseidonCoreRootElementEClass, PoseidonCoreRootElement.class, "PoseidonCoreRootElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(metamodelElementWrapperEClass, MetamodelElementWrapper.class, "MetamodelElementWrapper", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetamodelElementWrapper___uuid(), ecorePackage.getEString(), "__uuid", null, 0, 1, MetamodelElementWrapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetamodelElementWrapper_J_deleted(), ecorePackage.getEInt(), "j_deleted", null, 0, 1, MetamodelElementWrapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetamodelElementWrapper_J_diagramHolder(), this.getJ_DiagramHolder(), null, "j_diagramHolder", null, 0, 1, MetamodelElementWrapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetamodelElementWrapper___readOnly(), ecorePackage.getEBoolean(), "__readOnly", null, 0, 1, MetamodelElementWrapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetamodelElementWrapper___poseidonName(), ecorePackage.getEString(), "__poseidonName", null, 0, 1, MetamodelElementWrapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMetamodelElementWrapper___poseidonNamespace(), ecorePackage.getEBoolean(), "__poseidonNamespace", null, 0, 1, MetamodelElementWrapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetamodelElementWrapper___ownedMember(), ecorePackage.getEObject(), null, "__ownedMember", null, 0, -1, MetamodelElementWrapper.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMetamodelElementWrapper___source(), ecorePackage.getEObject(), null, "__source", null, 1, 1, MetamodelElementWrapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMetamodelElementWrapper___target(), ecorePackage.getEObject(), null, "__target", null, 1, 1, MetamodelElementWrapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMetamodelElementWrapper___poseidonEdge(), ecorePackage.getEBoolean(), "__poseidonEdge", null, 0, 1, MetamodelElementWrapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetamodelElementWrapper___poseidonRole(), ecorePackage.getEString(), "__poseidonRole", null, 0, 1, MetamodelElementWrapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(stringEDataType, String.class, "String", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(booleanEDataType, boolean.class, "Boolean", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(integerEDataType, int.class, "Integer", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// subsets
		createSubsetsAnnotations();
	}

	/**
	 * Initializes the annotations for <b>subsets</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createSubsetsAnnotations() {
		String source = "subsets";					
		addAnnotation
		  (getMetamodelElementWrapper___source(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getMetamodelElementWrapper___target(), 
		   source, 
		   new String[] {
		   });
	}

} //DSLPackageImpl
