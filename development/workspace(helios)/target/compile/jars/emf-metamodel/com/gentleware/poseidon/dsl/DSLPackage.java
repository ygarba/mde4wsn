/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.gentleware.poseidon.dsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.gentleware.poseidon.dsl.DSLFactory
 * @model kind="package"
 * @generated
 */
public interface DSLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dsl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.gentleware.com/poseidon/dsl/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dsl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DSLPackage eINSTANCE = com.gentleware.poseidon.dsl.impl.DSLPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.gentleware.poseidon.dsl.MetamodelElementWrapper <em>Metamodel Element Wrapper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.MetamodelElementWrapper
	 * @see com.gentleware.poseidon.dsl.impl.DSLPackageImpl#getMetamodelElementWrapper()
	 * @generated
	 */
	int METAMODEL_ELEMENT_WRAPPER = 7;

	/**
	 * The feature id for the '<em><b>uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_ELEMENT_WRAPPER__UUID = 0;

	/**
	 * The feature id for the '<em><b>Jdeleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_ELEMENT_WRAPPER__JDELETED = 1;

	/**
	 * The feature id for the '<em><b>Jdiagram Holder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_ELEMENT_WRAPPER__JDIAGRAM_HOLDER = 2;

	/**
	 * The feature id for the '<em><b>read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_ELEMENT_WRAPPER__READ_ONLY = 3;

	/**
	 * The feature id for the '<em><b>poseidon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_ELEMENT_WRAPPER__POSEIDON_NAME = 4;

	/**
	 * The feature id for the '<em><b>poseidon Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_ELEMENT_WRAPPER__POSEIDON_NAMESPACE = 5;

	/**
	 * The feature id for the '<em><b>owned Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_ELEMENT_WRAPPER__OWNED_MEMBER = 6;

	/**
	 * The feature id for the '<em><b>source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_ELEMENT_WRAPPER__SOURCE = 7;

	/**
	 * The feature id for the '<em><b>target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_ELEMENT_WRAPPER__TARGET = 8;

	/**
	 * The feature id for the '<em><b>poseidon Edge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_ELEMENT_WRAPPER__POSEIDON_EDGE = 9;

	/**
	 * The feature id for the '<em><b>poseidon Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_ELEMENT_WRAPPER__POSEIDON_ROLE = 10;

	/**
	 * The number of structural features of the '<em>Metamodel Element Wrapper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_ELEMENT_WRAPPER_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link com.gentleware.poseidon.dsl.impl.PoseidonCoreElementImpl <em>Poseidon Core Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.impl.PoseidonCoreElementImpl
	 * @see com.gentleware.poseidon.dsl.impl.DSLPackageImpl#getPoseidonCoreElement()
	 * @generated
	 */
	int POSEIDON_CORE_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSEIDON_CORE_ELEMENT__UUID = METAMODEL_ELEMENT_WRAPPER__UUID;

	/**
	 * The feature id for the '<em><b>Jdeleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSEIDON_CORE_ELEMENT__JDELETED = METAMODEL_ELEMENT_WRAPPER__JDELETED;

	/**
	 * The feature id for the '<em><b>Jdiagram Holder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSEIDON_CORE_ELEMENT__JDIAGRAM_HOLDER = METAMODEL_ELEMENT_WRAPPER__JDIAGRAM_HOLDER;

	/**
	 * The feature id for the '<em><b>read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSEIDON_CORE_ELEMENT__READ_ONLY = METAMODEL_ELEMENT_WRAPPER__READ_ONLY;

	/**
	 * The feature id for the '<em><b>poseidon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSEIDON_CORE_ELEMENT__POSEIDON_NAME = METAMODEL_ELEMENT_WRAPPER__POSEIDON_NAME;

	/**
	 * The feature id for the '<em><b>poseidon Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSEIDON_CORE_ELEMENT__POSEIDON_NAMESPACE = METAMODEL_ELEMENT_WRAPPER__POSEIDON_NAMESPACE;

	/**
	 * The feature id for the '<em><b>owned Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSEIDON_CORE_ELEMENT__OWNED_MEMBER = METAMODEL_ELEMENT_WRAPPER__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSEIDON_CORE_ELEMENT__SOURCE = METAMODEL_ELEMENT_WRAPPER__SOURCE;

	/**
	 * The feature id for the '<em><b>target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSEIDON_CORE_ELEMENT__TARGET = METAMODEL_ELEMENT_WRAPPER__TARGET;

	/**
	 * The feature id for the '<em><b>poseidon Edge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSEIDON_CORE_ELEMENT__POSEIDON_EDGE = METAMODEL_ELEMENT_WRAPPER__POSEIDON_EDGE;

	/**
	 * The feature id for the '<em><b>poseidon Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSEIDON_CORE_ELEMENT__POSEIDON_ROLE = METAMODEL_ELEMENT_WRAPPER__POSEIDON_ROLE;

	/**
	 * The number of structural features of the '<em>Poseidon Core Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSEIDON_CORE_ELEMENT_FEATURE_COUNT = METAMODEL_ELEMENT_WRAPPER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.gentleware.poseidon.dsl.impl.J_PropertyImpl <em>JProperty</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.impl.J_PropertyImpl
	 * @see com.gentleware.poseidon.dsl.impl.DSLPackageImpl#getJ_Property()
	 * @generated
	 */
	int JPROPERTY = 1;

	/**
	 * The feature id for the '<em><b>uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPROPERTY__UUID = POSEIDON_CORE_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Jdeleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPROPERTY__JDELETED = POSEIDON_CORE_ELEMENT__JDELETED;

	/**
	 * The feature id for the '<em><b>Jdiagram Holder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPROPERTY__JDIAGRAM_HOLDER = POSEIDON_CORE_ELEMENT__JDIAGRAM_HOLDER;

	/**
	 * The feature id for the '<em><b>read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPROPERTY__READ_ONLY = POSEIDON_CORE_ELEMENT__READ_ONLY;

	/**
	 * The feature id for the '<em><b>poseidon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPROPERTY__POSEIDON_NAME = POSEIDON_CORE_ELEMENT__POSEIDON_NAME;

	/**
	 * The feature id for the '<em><b>poseidon Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPROPERTY__POSEIDON_NAMESPACE = POSEIDON_CORE_ELEMENT__POSEIDON_NAMESPACE;

	/**
	 * The feature id for the '<em><b>owned Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPROPERTY__OWNED_MEMBER = POSEIDON_CORE_ELEMENT__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPROPERTY__SOURCE = POSEIDON_CORE_ELEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPROPERTY__TARGET = POSEIDON_CORE_ELEMENT__TARGET;

	/**
	 * The feature id for the '<em><b>poseidon Edge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPROPERTY__POSEIDON_EDGE = POSEIDON_CORE_ELEMENT__POSEIDON_EDGE;

	/**
	 * The feature id for the '<em><b>poseidon Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPROPERTY__POSEIDON_ROLE = POSEIDON_CORE_ELEMENT__POSEIDON_ROLE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPROPERTY__VALUE = POSEIDON_CORE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPROPERTY__NAME = POSEIDON_CORE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>JProperty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPROPERTY_FEATURE_COUNT = POSEIDON_CORE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.gentleware.poseidon.dsl.impl.J_FigureContainerImpl <em>JFigure Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.impl.J_FigureContainerImpl
	 * @see com.gentleware.poseidon.dsl.impl.DSLPackageImpl#getJ_FigureContainer()
	 * @generated
	 */
	int JFIGURE_CONTAINER = 3;

	/**
	 * The feature id for the '<em><b>uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIGURE_CONTAINER__UUID = POSEIDON_CORE_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Jdeleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIGURE_CONTAINER__JDELETED = POSEIDON_CORE_ELEMENT__JDELETED;

	/**
	 * The feature id for the '<em><b>Jdiagram Holder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIGURE_CONTAINER__JDIAGRAM_HOLDER = POSEIDON_CORE_ELEMENT__JDIAGRAM_HOLDER;

	/**
	 * The feature id for the '<em><b>read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIGURE_CONTAINER__READ_ONLY = POSEIDON_CORE_ELEMENT__READ_ONLY;

	/**
	 * The feature id for the '<em><b>poseidon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIGURE_CONTAINER__POSEIDON_NAME = POSEIDON_CORE_ELEMENT__POSEIDON_NAME;

	/**
	 * The feature id for the '<em><b>poseidon Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIGURE_CONTAINER__POSEIDON_NAMESPACE = POSEIDON_CORE_ELEMENT__POSEIDON_NAMESPACE;

	/**
	 * The feature id for the '<em><b>owned Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIGURE_CONTAINER__OWNED_MEMBER = POSEIDON_CORE_ELEMENT__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIGURE_CONTAINER__SOURCE = POSEIDON_CORE_ELEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIGURE_CONTAINER__TARGET = POSEIDON_CORE_ELEMENT__TARGET;

	/**
	 * The feature id for the '<em><b>poseidon Edge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIGURE_CONTAINER__POSEIDON_EDGE = POSEIDON_CORE_ELEMENT__POSEIDON_EDGE;

	/**
	 * The feature id for the '<em><b>poseidon Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIGURE_CONTAINER__POSEIDON_ROLE = POSEIDON_CORE_ELEMENT__POSEIDON_ROLE;

	/**
	 * The feature id for the '<em><b>Figures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIGURE_CONTAINER__FIGURES = POSEIDON_CORE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIGURE_CONTAINER__PROPERTIES = POSEIDON_CORE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>JFigure Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIGURE_CONTAINER_FEATURE_COUNT = POSEIDON_CORE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.gentleware.poseidon.dsl.impl.J_FigureImpl <em>JFigure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.impl.J_FigureImpl
	 * @see com.gentleware.poseidon.dsl.impl.DSLPackageImpl#getJ_Figure()
	 * @generated
	 */
	int JFIGURE = 2;

	/**
	 * The feature id for the '<em><b>uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIGURE__UUID = JFIGURE_CONTAINER__UUID;

	/**
	 * The feature id for the '<em><b>Jdeleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIGURE__JDELETED = JFIGURE_CONTAINER__JDELETED;

	/**
	 * The feature id for the '<em><b>Jdiagram Holder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIGURE__JDIAGRAM_HOLDER = JFIGURE_CONTAINER__JDIAGRAM_HOLDER;

	/**
	 * The feature id for the '<em><b>read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIGURE__READ_ONLY = JFIGURE_CONTAINER__READ_ONLY;

	/**
	 * The feature id for the '<em><b>poseidon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIGURE__POSEIDON_NAME = JFIGURE_CONTAINER__POSEIDON_NAME;

	/**
	 * The feature id for the '<em><b>poseidon Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIGURE__POSEIDON_NAMESPACE = JFIGURE_CONTAINER__POSEIDON_NAMESPACE;

	/**
	 * The feature id for the '<em><b>owned Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIGURE__OWNED_MEMBER = JFIGURE_CONTAINER__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIGURE__SOURCE = JFIGURE_CONTAINER__SOURCE;

	/**
	 * The feature id for the '<em><b>target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIGURE__TARGET = JFIGURE_CONTAINER__TARGET;

	/**
	 * The feature id for the '<em><b>poseidon Edge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIGURE__POSEIDON_EDGE = JFIGURE_CONTAINER__POSEIDON_EDGE;

	/**
	 * The feature id for the '<em><b>poseidon Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIGURE__POSEIDON_ROLE = JFIGURE_CONTAINER__POSEIDON_ROLE;

	/**
	 * The feature id for the '<em><b>Figures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIGURE__FIGURES = JFIGURE_CONTAINER__FIGURES;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIGURE__PROPERTIES = JFIGURE_CONTAINER__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIGURE__ID = JFIGURE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Recreator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIGURE__RECREATOR = JFIGURE_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Anchor1 Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIGURE__ANCHOR1_ID = JFIGURE_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Anchor2 Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIGURE__ANCHOR2_ID = JFIGURE_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Contained Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIGURE__CONTAINED_NAME = JFIGURE_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIGURE__TEXT = JFIGURE_CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Virtual Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIGURE__VIRTUAL_POINT = JFIGURE_CONTAINER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIGURE__POINTS = JFIGURE_CONTAINER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Br Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIGURE__BR_OFFSET = JFIGURE_CONTAINER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Tl Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIGURE__TL_OFFSET = JFIGURE_CONTAINER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIGURE__SHOW = JFIGURE_CONTAINER_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Autosized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIGURE__AUTOSIZED = JFIGURE_CONTAINER_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIGURE__ICON = JFIGURE_CONTAINER_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIGURE__POINT = JFIGURE_CONTAINER_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIGURE__DIMENSIONS = JFIGURE_CONTAINER_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Suppress Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIGURE__SUPPRESS_ATTRIBUTES = JFIGURE_CONTAINER_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Suppress Operations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIGURE__SUPPRESS_OPERATIONS = JFIGURE_CONTAINER_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Suppress Contents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIGURE__SUPPRESS_CONTENTS = JFIGURE_CONTAINER_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIGURE__OFFSET = JFIGURE_CONTAINER_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIGURE__MIN = JFIGURE_CONTAINER_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Accessibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIGURE__ACCESSIBILITY = JFIGURE_CONTAINER_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Classifier Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIGURE__CLASSIFIER_SCOPE = JFIGURE_CONTAINER_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIGURE__TYPE = JFIGURE_CONTAINER_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIGURE__SUBJECT = JFIGURE_CONTAINER_FEATURE_COUNT + 23;

	/**
	 * The number of structural features of the '<em>JFigure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIGURE_FEATURE_COUNT = JFIGURE_CONTAINER_FEATURE_COUNT + 24;

	/**
	 * The meta object id for the '{@link com.gentleware.poseidon.dsl.impl.J_DiagramImpl <em>JDiagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.impl.J_DiagramImpl
	 * @see com.gentleware.poseidon.dsl.impl.DSLPackageImpl#getJ_Diagram()
	 * @generated
	 */
	int JDIAGRAM = 4;

	/**
	 * The feature id for the '<em><b>uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDIAGRAM__UUID = JFIGURE_CONTAINER__UUID;

	/**
	 * The feature id for the '<em><b>Jdeleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDIAGRAM__JDELETED = JFIGURE_CONTAINER__JDELETED;

	/**
	 * The feature id for the '<em><b>Jdiagram Holder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDIAGRAM__JDIAGRAM_HOLDER = JFIGURE_CONTAINER__JDIAGRAM_HOLDER;

	/**
	 * The feature id for the '<em><b>read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDIAGRAM__READ_ONLY = JFIGURE_CONTAINER__READ_ONLY;

	/**
	 * The feature id for the '<em><b>poseidon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDIAGRAM__POSEIDON_NAME = JFIGURE_CONTAINER__POSEIDON_NAME;

	/**
	 * The feature id for the '<em><b>poseidon Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDIAGRAM__POSEIDON_NAMESPACE = JFIGURE_CONTAINER__POSEIDON_NAMESPACE;

	/**
	 * The feature id for the '<em><b>owned Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDIAGRAM__OWNED_MEMBER = JFIGURE_CONTAINER__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDIAGRAM__SOURCE = JFIGURE_CONTAINER__SOURCE;

	/**
	 * The feature id for the '<em><b>target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDIAGRAM__TARGET = JFIGURE_CONTAINER__TARGET;

	/**
	 * The feature id for the '<em><b>poseidon Edge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDIAGRAM__POSEIDON_EDGE = JFIGURE_CONTAINER__POSEIDON_EDGE;

	/**
	 * The feature id for the '<em><b>poseidon Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDIAGRAM__POSEIDON_ROLE = JFIGURE_CONTAINER__POSEIDON_ROLE;

	/**
	 * The feature id for the '<em><b>Figures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDIAGRAM__FIGURES = JFIGURE_CONTAINER__FIGURES;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDIAGRAM__PROPERTIES = JFIGURE_CONTAINER__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Last Figure Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDIAGRAM__LAST_FIGURE_ID = JFIGURE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Save Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDIAGRAM__SAVE_TIME = JFIGURE_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Saved By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDIAGRAM__SAVED_BY = JFIGURE_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDIAGRAM__TYPE = JFIGURE_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>JDiagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDIAGRAM_FEATURE_COUNT = JFIGURE_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link com.gentleware.poseidon.dsl.impl.J_DiagramHolderImpl <em>JDiagram Holder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.impl.J_DiagramHolderImpl
	 * @see com.gentleware.poseidon.dsl.impl.DSLPackageImpl#getJ_DiagramHolder()
	 * @generated
	 */
	int JDIAGRAM_HOLDER = 5;

	/**
	 * The feature id for the '<em><b>uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDIAGRAM_HOLDER__UUID = POSEIDON_CORE_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Jdeleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDIAGRAM_HOLDER__JDELETED = POSEIDON_CORE_ELEMENT__JDELETED;

	/**
	 * The feature id for the '<em><b>Jdiagram Holder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDIAGRAM_HOLDER__JDIAGRAM_HOLDER = POSEIDON_CORE_ELEMENT__JDIAGRAM_HOLDER;

	/**
	 * The feature id for the '<em><b>read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDIAGRAM_HOLDER__READ_ONLY = POSEIDON_CORE_ELEMENT__READ_ONLY;

	/**
	 * The feature id for the '<em><b>poseidon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDIAGRAM_HOLDER__POSEIDON_NAME = POSEIDON_CORE_ELEMENT__POSEIDON_NAME;

	/**
	 * The feature id for the '<em><b>poseidon Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDIAGRAM_HOLDER__POSEIDON_NAMESPACE = POSEIDON_CORE_ELEMENT__POSEIDON_NAMESPACE;

	/**
	 * The feature id for the '<em><b>owned Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDIAGRAM_HOLDER__OWNED_MEMBER = POSEIDON_CORE_ELEMENT__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDIAGRAM_HOLDER__SOURCE = POSEIDON_CORE_ELEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDIAGRAM_HOLDER__TARGET = POSEIDON_CORE_ELEMENT__TARGET;

	/**
	 * The feature id for the '<em><b>poseidon Edge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDIAGRAM_HOLDER__POSEIDON_EDGE = POSEIDON_CORE_ELEMENT__POSEIDON_EDGE;

	/**
	 * The feature id for the '<em><b>poseidon Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDIAGRAM_HOLDER__POSEIDON_ROLE = POSEIDON_CORE_ELEMENT__POSEIDON_ROLE;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDIAGRAM_HOLDER__DIAGRAM = POSEIDON_CORE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>JDiagram Holder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDIAGRAM_HOLDER_FEATURE_COUNT = POSEIDON_CORE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.gentleware.poseidon.dsl.impl.PoseidonCoreRootElementImpl <em>Poseidon Core Root Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.impl.PoseidonCoreRootElementImpl
	 * @see com.gentleware.poseidon.dsl.impl.DSLPackageImpl#getPoseidonCoreRootElement()
	 * @generated
	 */
	int POSEIDON_CORE_ROOT_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSEIDON_CORE_ROOT_ELEMENT__UUID = POSEIDON_CORE_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Jdeleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSEIDON_CORE_ROOT_ELEMENT__JDELETED = POSEIDON_CORE_ELEMENT__JDELETED;

	/**
	 * The feature id for the '<em><b>Jdiagram Holder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSEIDON_CORE_ROOT_ELEMENT__JDIAGRAM_HOLDER = POSEIDON_CORE_ELEMENT__JDIAGRAM_HOLDER;

	/**
	 * The feature id for the '<em><b>read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSEIDON_CORE_ROOT_ELEMENT__READ_ONLY = POSEIDON_CORE_ELEMENT__READ_ONLY;

	/**
	 * The feature id for the '<em><b>poseidon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSEIDON_CORE_ROOT_ELEMENT__POSEIDON_NAME = POSEIDON_CORE_ELEMENT__POSEIDON_NAME;

	/**
	 * The feature id for the '<em><b>poseidon Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSEIDON_CORE_ROOT_ELEMENT__POSEIDON_NAMESPACE = POSEIDON_CORE_ELEMENT__POSEIDON_NAMESPACE;

	/**
	 * The feature id for the '<em><b>owned Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSEIDON_CORE_ROOT_ELEMENT__OWNED_MEMBER = POSEIDON_CORE_ELEMENT__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSEIDON_CORE_ROOT_ELEMENT__SOURCE = POSEIDON_CORE_ELEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSEIDON_CORE_ROOT_ELEMENT__TARGET = POSEIDON_CORE_ELEMENT__TARGET;

	/**
	 * The feature id for the '<em><b>poseidon Edge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSEIDON_CORE_ROOT_ELEMENT__POSEIDON_EDGE = POSEIDON_CORE_ELEMENT__POSEIDON_EDGE;

	/**
	 * The feature id for the '<em><b>poseidon Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSEIDON_CORE_ROOT_ELEMENT__POSEIDON_ROLE = POSEIDON_CORE_ELEMENT__POSEIDON_ROLE;

	/**
	 * The number of structural features of the '<em>Poseidon Core Root Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSEIDON_CORE_ROOT_ELEMENT_FEATURE_COUNT = POSEIDON_CORE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '<em>String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.gentleware.poseidon.dsl.impl.DSLPackageImpl#getString()
	 * @generated
	 */
	int STRING = 8;

	/**
	 * The meta object id for the '<em>Boolean</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.impl.DSLPackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 9;

	/**
	 * The meta object id for the '<em>Integer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gentleware.poseidon.dsl.impl.DSLPackageImpl#getInteger()
	 * @generated
	 */
	int INTEGER = 10;


	/**
	 * Returns the meta object for class '{@link com.gentleware.poseidon.dsl.PoseidonCoreElement <em>Poseidon Core Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Poseidon Core Element</em>'.
	 * @see com.gentleware.poseidon.dsl.PoseidonCoreElement
	 * @generated
	 */
	EClass getPoseidonCoreElement();

	/**
	 * Returns the meta object for class '{@link com.gentleware.poseidon.dsl.J_Property <em>JProperty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JProperty</em>'.
	 * @see com.gentleware.poseidon.dsl.J_Property
	 * @generated
	 */
	EClass getJ_Property();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.J_Property#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.gentleware.poseidon.dsl.J_Property#getValue()
	 * @see #getJ_Property()
	 * @generated
	 */
	EAttribute getJ_Property_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.J_Property#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.gentleware.poseidon.dsl.J_Property#getName()
	 * @see #getJ_Property()
	 * @generated
	 */
	EAttribute getJ_Property_Name();

	/**
	 * Returns the meta object for class '{@link com.gentleware.poseidon.dsl.J_Figure <em>JFigure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JFigure</em>'.
	 * @see com.gentleware.poseidon.dsl.J_Figure
	 * @generated
	 */
	EClass getJ_Figure();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.J_Figure#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.gentleware.poseidon.dsl.J_Figure#getId()
	 * @see #getJ_Figure()
	 * @generated
	 */
	EAttribute getJ_Figure_Id();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.J_Figure#getRecreator <em>Recreator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recreator</em>'.
	 * @see com.gentleware.poseidon.dsl.J_Figure#getRecreator()
	 * @see #getJ_Figure()
	 * @generated
	 */
	EAttribute getJ_Figure_Recreator();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.J_Figure#getAnchor1Id <em>Anchor1 Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anchor1 Id</em>'.
	 * @see com.gentleware.poseidon.dsl.J_Figure#getAnchor1Id()
	 * @see #getJ_Figure()
	 * @generated
	 */
	EAttribute getJ_Figure_Anchor1Id();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.J_Figure#getAnchor2Id <em>Anchor2 Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anchor2 Id</em>'.
	 * @see com.gentleware.poseidon.dsl.J_Figure#getAnchor2Id()
	 * @see #getJ_Figure()
	 * @generated
	 */
	EAttribute getJ_Figure_Anchor2Id();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.J_Figure#getContainedName <em>Contained Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contained Name</em>'.
	 * @see com.gentleware.poseidon.dsl.J_Figure#getContainedName()
	 * @see #getJ_Figure()
	 * @generated
	 */
	EAttribute getJ_Figure_ContainedName();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.J_Figure#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see com.gentleware.poseidon.dsl.J_Figure#getText()
	 * @see #getJ_Figure()
	 * @generated
	 */
	EAttribute getJ_Figure_Text();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.J_Figure#getVirtualPoint <em>Virtual Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Virtual Point</em>'.
	 * @see com.gentleware.poseidon.dsl.J_Figure#getVirtualPoint()
	 * @see #getJ_Figure()
	 * @generated
	 */
	EAttribute getJ_Figure_VirtualPoint();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.J_Figure#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Points</em>'.
	 * @see com.gentleware.poseidon.dsl.J_Figure#getPoints()
	 * @see #getJ_Figure()
	 * @generated
	 */
	EAttribute getJ_Figure_Points();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.J_Figure#getBrOffset <em>Br Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Br Offset</em>'.
	 * @see com.gentleware.poseidon.dsl.J_Figure#getBrOffset()
	 * @see #getJ_Figure()
	 * @generated
	 */
	EAttribute getJ_Figure_BrOffset();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.J_Figure#getTlOffset <em>Tl Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tl Offset</em>'.
	 * @see com.gentleware.poseidon.dsl.J_Figure#getTlOffset()
	 * @see #getJ_Figure()
	 * @generated
	 */
	EAttribute getJ_Figure_TlOffset();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.J_Figure#getShow <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show</em>'.
	 * @see com.gentleware.poseidon.dsl.J_Figure#getShow()
	 * @see #getJ_Figure()
	 * @generated
	 */
	EAttribute getJ_Figure_Show();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.J_Figure#getAutosized <em>Autosized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Autosized</em>'.
	 * @see com.gentleware.poseidon.dsl.J_Figure#getAutosized()
	 * @see #getJ_Figure()
	 * @generated
	 */
	EAttribute getJ_Figure_Autosized();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.J_Figure#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see com.gentleware.poseidon.dsl.J_Figure#getIcon()
	 * @see #getJ_Figure()
	 * @generated
	 */
	EAttribute getJ_Figure_Icon();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.J_Figure#getPoint <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Point</em>'.
	 * @see com.gentleware.poseidon.dsl.J_Figure#getPoint()
	 * @see #getJ_Figure()
	 * @generated
	 */
	EAttribute getJ_Figure_Point();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.J_Figure#getDimensions <em>Dimensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dimensions</em>'.
	 * @see com.gentleware.poseidon.dsl.J_Figure#getDimensions()
	 * @see #getJ_Figure()
	 * @generated
	 */
	EAttribute getJ_Figure_Dimensions();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.J_Figure#getSuppressAttributes <em>Suppress Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suppress Attributes</em>'.
	 * @see com.gentleware.poseidon.dsl.J_Figure#getSuppressAttributes()
	 * @see #getJ_Figure()
	 * @generated
	 */
	EAttribute getJ_Figure_SuppressAttributes();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.J_Figure#getSuppressOperations <em>Suppress Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suppress Operations</em>'.
	 * @see com.gentleware.poseidon.dsl.J_Figure#getSuppressOperations()
	 * @see #getJ_Figure()
	 * @generated
	 */
	EAttribute getJ_Figure_SuppressOperations();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.J_Figure#getSuppressContents <em>Suppress Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suppress Contents</em>'.
	 * @see com.gentleware.poseidon.dsl.J_Figure#getSuppressContents()
	 * @see #getJ_Figure()
	 * @generated
	 */
	EAttribute getJ_Figure_SuppressContents();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.J_Figure#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see com.gentleware.poseidon.dsl.J_Figure#getOffset()
	 * @see #getJ_Figure()
	 * @generated
	 */
	EAttribute getJ_Figure_Offset();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.J_Figure#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see com.gentleware.poseidon.dsl.J_Figure#getMin()
	 * @see #getJ_Figure()
	 * @generated
	 */
	EAttribute getJ_Figure_Min();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.J_Figure#getAccessibility <em>Accessibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accessibility</em>'.
	 * @see com.gentleware.poseidon.dsl.J_Figure#getAccessibility()
	 * @see #getJ_Figure()
	 * @generated
	 */
	EAttribute getJ_Figure_Accessibility();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.J_Figure#getClassifierScope <em>Classifier Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classifier Scope</em>'.
	 * @see com.gentleware.poseidon.dsl.J_Figure#getClassifierScope()
	 * @see #getJ_Figure()
	 * @generated
	 */
	EAttribute getJ_Figure_ClassifierScope();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.J_Figure#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.gentleware.poseidon.dsl.J_Figure#getType()
	 * @see #getJ_Figure()
	 * @generated
	 */
	EAttribute getJ_Figure_Type();

	/**
	 * Returns the meta object for the reference '{@link com.gentleware.poseidon.dsl.J_Figure#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subject</em>'.
	 * @see com.gentleware.poseidon.dsl.J_Figure#getSubject()
	 * @see #getJ_Figure()
	 * @generated
	 */
	EReference getJ_Figure_Subject();

	/**
	 * Returns the meta object for class '{@link com.gentleware.poseidon.dsl.J_FigureContainer <em>JFigure Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JFigure Container</em>'.
	 * @see com.gentleware.poseidon.dsl.J_FigureContainer
	 * @generated
	 */
	EClass getJ_FigureContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link com.gentleware.poseidon.dsl.J_FigureContainer#getFigures <em>Figures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Figures</em>'.
	 * @see com.gentleware.poseidon.dsl.J_FigureContainer#getFigures()
	 * @see #getJ_FigureContainer()
	 * @generated
	 */
	EReference getJ_FigureContainer_Figures();

	/**
	 * Returns the meta object for the containment reference list '{@link com.gentleware.poseidon.dsl.J_FigureContainer#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see com.gentleware.poseidon.dsl.J_FigureContainer#getProperties()
	 * @see #getJ_FigureContainer()
	 * @generated
	 */
	EReference getJ_FigureContainer_Properties();

	/**
	 * Returns the meta object for class '{@link com.gentleware.poseidon.dsl.J_Diagram <em>JDiagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JDiagram</em>'.
	 * @see com.gentleware.poseidon.dsl.J_Diagram
	 * @generated
	 */
	EClass getJ_Diagram();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.J_Diagram#getLastFigureId <em>Last Figure Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Figure Id</em>'.
	 * @see com.gentleware.poseidon.dsl.J_Diagram#getLastFigureId()
	 * @see #getJ_Diagram()
	 * @generated
	 */
	EAttribute getJ_Diagram_LastFigureId();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.J_Diagram#getSaveTime <em>Save Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Save Time</em>'.
	 * @see com.gentleware.poseidon.dsl.J_Diagram#getSaveTime()
	 * @see #getJ_Diagram()
	 * @generated
	 */
	EAttribute getJ_Diagram_SaveTime();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.J_Diagram#getSavedBy <em>Saved By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Saved By</em>'.
	 * @see com.gentleware.poseidon.dsl.J_Diagram#getSavedBy()
	 * @see #getJ_Diagram()
	 * @generated
	 */
	EAttribute getJ_Diagram_SavedBy();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.J_Diagram#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.gentleware.poseidon.dsl.J_Diagram#getType()
	 * @see #getJ_Diagram()
	 * @generated
	 */
	EAttribute getJ_Diagram_Type();

	/**
	 * Returns the meta object for class '{@link com.gentleware.poseidon.dsl.J_DiagramHolder <em>JDiagram Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JDiagram Holder</em>'.
	 * @see com.gentleware.poseidon.dsl.J_DiagramHolder
	 * @generated
	 */
	EClass getJ_DiagramHolder();

	/**
	 * Returns the meta object for the containment reference list '{@link com.gentleware.poseidon.dsl.J_DiagramHolder#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diagram</em>'.
	 * @see com.gentleware.poseidon.dsl.J_DiagramHolder#getDiagram()
	 * @see #getJ_DiagramHolder()
	 * @generated
	 */
	EReference getJ_DiagramHolder_Diagram();

	/**
	 * Returns the meta object for class '{@link com.gentleware.poseidon.dsl.PoseidonCoreRootElement <em>Poseidon Core Root Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Poseidon Core Root Element</em>'.
	 * @see com.gentleware.poseidon.dsl.PoseidonCoreRootElement
	 * @generated
	 */
	EClass getPoseidonCoreRootElement();

	/**
	 * Returns the meta object for class '{@link com.gentleware.poseidon.dsl.MetamodelElementWrapper <em>Metamodel Element Wrapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metamodel Element Wrapper</em>'.
	 * @see com.gentleware.poseidon.dsl.MetamodelElementWrapper
	 * @generated
	 */
	EClass getMetamodelElementWrapper();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.MetamodelElementWrapper#get__uuid <em>uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>uuid</em>'.
	 * @see com.gentleware.poseidon.dsl.MetamodelElementWrapper#get__uuid()
	 * @see #getMetamodelElementWrapper()
	 * @generated
	 */
	EAttribute getMetamodelElementWrapper___uuid();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.MetamodelElementWrapper#getJ_deleted <em>Jdeleted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jdeleted</em>'.
	 * @see com.gentleware.poseidon.dsl.MetamodelElementWrapper#getJ_deleted()
	 * @see #getMetamodelElementWrapper()
	 * @generated
	 */
	EAttribute getMetamodelElementWrapper_J_deleted();

	/**
	 * Returns the meta object for the containment reference '{@link com.gentleware.poseidon.dsl.MetamodelElementWrapper#getJ_diagramHolder <em>Jdiagram Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Jdiagram Holder</em>'.
	 * @see com.gentleware.poseidon.dsl.MetamodelElementWrapper#getJ_diagramHolder()
	 * @see #getMetamodelElementWrapper()
	 * @generated
	 */
	EReference getMetamodelElementWrapper_J_diagramHolder();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.MetamodelElementWrapper#is__readOnly <em>read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>read Only</em>'.
	 * @see com.gentleware.poseidon.dsl.MetamodelElementWrapper#is__readOnly()
	 * @see #getMetamodelElementWrapper()
	 * @generated
	 */
	EAttribute getMetamodelElementWrapper___readOnly();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.MetamodelElementWrapper#get__poseidonName <em>poseidon Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>poseidon Name</em>'.
	 * @see com.gentleware.poseidon.dsl.MetamodelElementWrapper#get__poseidonName()
	 * @see #getMetamodelElementWrapper()
	 * @generated
	 */
	EAttribute getMetamodelElementWrapper___poseidonName();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.MetamodelElementWrapper#is__poseidonNamespace <em>poseidon Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>poseidon Namespace</em>'.
	 * @see com.gentleware.poseidon.dsl.MetamodelElementWrapper#is__poseidonNamespace()
	 * @see #getMetamodelElementWrapper()
	 * @generated
	 */
	EAttribute getMetamodelElementWrapper___poseidonNamespace();

	/**
	 * Returns the meta object for the containment reference list '{@link com.gentleware.poseidon.dsl.MetamodelElementWrapper#get__ownedMember <em>owned Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>owned Member</em>'.
	 * @see com.gentleware.poseidon.dsl.MetamodelElementWrapper#get__ownedMember()
	 * @see #getMetamodelElementWrapper()
	 * @generated
	 */
	EReference getMetamodelElementWrapper___ownedMember();

	/**
	 * Returns the meta object for the reference '{@link com.gentleware.poseidon.dsl.MetamodelElementWrapper#get__source <em>source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>source</em>'.
	 * @see com.gentleware.poseidon.dsl.MetamodelElementWrapper#get__source()
	 * @see #getMetamodelElementWrapper()
	 * @generated
	 */
	EReference getMetamodelElementWrapper___source();

	/**
	 * Returns the meta object for the reference '{@link com.gentleware.poseidon.dsl.MetamodelElementWrapper#get__target <em>target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>target</em>'.
	 * @see com.gentleware.poseidon.dsl.MetamodelElementWrapper#get__target()
	 * @see #getMetamodelElementWrapper()
	 * @generated
	 */
	EReference getMetamodelElementWrapper___target();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.MetamodelElementWrapper#is__poseidonEdge <em>poseidon Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>poseidon Edge</em>'.
	 * @see com.gentleware.poseidon.dsl.MetamodelElementWrapper#is__poseidonEdge()
	 * @see #getMetamodelElementWrapper()
	 * @generated
	 */
	EAttribute getMetamodelElementWrapper___poseidonEdge();

	/**
	 * Returns the meta object for the attribute '{@link com.gentleware.poseidon.dsl.MetamodelElementWrapper#get__poseidonRole <em>poseidon Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>poseidon Role</em>'.
	 * @see com.gentleware.poseidon.dsl.MetamodelElementWrapper#get__poseidonRole()
	 * @see #getMetamodelElementWrapper()
	 * @generated
	 */
	EAttribute getMetamodelElementWrapper___poseidonRole();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>String</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getString();

	/**
	 * Returns the meta object for data type '<em>Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Boolean</em>'.
	 * @model instanceClass="boolean"
	 * @generated
	 */
	EDataType getBoolean();

	/**
	 * Returns the meta object for data type '<em>Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Integer</em>'.
	 * @model instanceClass="int"
	 * @generated
	 */
	EDataType getInteger();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DSLFactory getDSLFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.gentleware.poseidon.dsl.impl.PoseidonCoreElementImpl <em>Poseidon Core Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.impl.PoseidonCoreElementImpl
		 * @see com.gentleware.poseidon.dsl.impl.DSLPackageImpl#getPoseidonCoreElement()
		 * @generated
		 */
		EClass POSEIDON_CORE_ELEMENT = eINSTANCE.getPoseidonCoreElement();

		/**
		 * The meta object literal for the '{@link com.gentleware.poseidon.dsl.impl.J_PropertyImpl <em>JProperty</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.impl.J_PropertyImpl
		 * @see com.gentleware.poseidon.dsl.impl.DSLPackageImpl#getJ_Property()
		 * @generated
		 */
		EClass JPROPERTY = eINSTANCE.getJ_Property();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JPROPERTY__VALUE = eINSTANCE.getJ_Property_Value();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JPROPERTY__NAME = eINSTANCE.getJ_Property_Name();

		/**
		 * The meta object literal for the '{@link com.gentleware.poseidon.dsl.impl.J_FigureImpl <em>JFigure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.impl.J_FigureImpl
		 * @see com.gentleware.poseidon.dsl.impl.DSLPackageImpl#getJ_Figure()
		 * @generated
		 */
		EClass JFIGURE = eINSTANCE.getJ_Figure();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JFIGURE__ID = eINSTANCE.getJ_Figure_Id();

		/**
		 * The meta object literal for the '<em><b>Recreator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JFIGURE__RECREATOR = eINSTANCE.getJ_Figure_Recreator();

		/**
		 * The meta object literal for the '<em><b>Anchor1 Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JFIGURE__ANCHOR1_ID = eINSTANCE.getJ_Figure_Anchor1Id();

		/**
		 * The meta object literal for the '<em><b>Anchor2 Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JFIGURE__ANCHOR2_ID = eINSTANCE.getJ_Figure_Anchor2Id();

		/**
		 * The meta object literal for the '<em><b>Contained Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JFIGURE__CONTAINED_NAME = eINSTANCE.getJ_Figure_ContainedName();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JFIGURE__TEXT = eINSTANCE.getJ_Figure_Text();

		/**
		 * The meta object literal for the '<em><b>Virtual Point</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JFIGURE__VIRTUAL_POINT = eINSTANCE.getJ_Figure_VirtualPoint();

		/**
		 * The meta object literal for the '<em><b>Points</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JFIGURE__POINTS = eINSTANCE.getJ_Figure_Points();

		/**
		 * The meta object literal for the '<em><b>Br Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JFIGURE__BR_OFFSET = eINSTANCE.getJ_Figure_BrOffset();

		/**
		 * The meta object literal for the '<em><b>Tl Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JFIGURE__TL_OFFSET = eINSTANCE.getJ_Figure_TlOffset();

		/**
		 * The meta object literal for the '<em><b>Show</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JFIGURE__SHOW = eINSTANCE.getJ_Figure_Show();

		/**
		 * The meta object literal for the '<em><b>Autosized</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JFIGURE__AUTOSIZED = eINSTANCE.getJ_Figure_Autosized();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JFIGURE__ICON = eINSTANCE.getJ_Figure_Icon();

		/**
		 * The meta object literal for the '<em><b>Point</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JFIGURE__POINT = eINSTANCE.getJ_Figure_Point();

		/**
		 * The meta object literal for the '<em><b>Dimensions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JFIGURE__DIMENSIONS = eINSTANCE.getJ_Figure_Dimensions();

		/**
		 * The meta object literal for the '<em><b>Suppress Attributes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JFIGURE__SUPPRESS_ATTRIBUTES = eINSTANCE.getJ_Figure_SuppressAttributes();

		/**
		 * The meta object literal for the '<em><b>Suppress Operations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JFIGURE__SUPPRESS_OPERATIONS = eINSTANCE.getJ_Figure_SuppressOperations();

		/**
		 * The meta object literal for the '<em><b>Suppress Contents</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JFIGURE__SUPPRESS_CONTENTS = eINSTANCE.getJ_Figure_SuppressContents();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JFIGURE__OFFSET = eINSTANCE.getJ_Figure_Offset();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JFIGURE__MIN = eINSTANCE.getJ_Figure_Min();

		/**
		 * The meta object literal for the '<em><b>Accessibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JFIGURE__ACCESSIBILITY = eINSTANCE.getJ_Figure_Accessibility();

		/**
		 * The meta object literal for the '<em><b>Classifier Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JFIGURE__CLASSIFIER_SCOPE = eINSTANCE.getJ_Figure_ClassifierScope();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JFIGURE__TYPE = eINSTANCE.getJ_Figure_Type();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JFIGURE__SUBJECT = eINSTANCE.getJ_Figure_Subject();

		/**
		 * The meta object literal for the '{@link com.gentleware.poseidon.dsl.impl.J_FigureContainerImpl <em>JFigure Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.impl.J_FigureContainerImpl
		 * @see com.gentleware.poseidon.dsl.impl.DSLPackageImpl#getJ_FigureContainer()
		 * @generated
		 */
		EClass JFIGURE_CONTAINER = eINSTANCE.getJ_FigureContainer();

		/**
		 * The meta object literal for the '<em><b>Figures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JFIGURE_CONTAINER__FIGURES = eINSTANCE.getJ_FigureContainer_Figures();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JFIGURE_CONTAINER__PROPERTIES = eINSTANCE.getJ_FigureContainer_Properties();

		/**
		 * The meta object literal for the '{@link com.gentleware.poseidon.dsl.impl.J_DiagramImpl <em>JDiagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.impl.J_DiagramImpl
		 * @see com.gentleware.poseidon.dsl.impl.DSLPackageImpl#getJ_Diagram()
		 * @generated
		 */
		EClass JDIAGRAM = eINSTANCE.getJ_Diagram();

		/**
		 * The meta object literal for the '<em><b>Last Figure Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JDIAGRAM__LAST_FIGURE_ID = eINSTANCE.getJ_Diagram_LastFigureId();

		/**
		 * The meta object literal for the '<em><b>Save Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JDIAGRAM__SAVE_TIME = eINSTANCE.getJ_Diagram_SaveTime();

		/**
		 * The meta object literal for the '<em><b>Saved By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JDIAGRAM__SAVED_BY = eINSTANCE.getJ_Diagram_SavedBy();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JDIAGRAM__TYPE = eINSTANCE.getJ_Diagram_Type();

		/**
		 * The meta object literal for the '{@link com.gentleware.poseidon.dsl.impl.J_DiagramHolderImpl <em>JDiagram Holder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.impl.J_DiagramHolderImpl
		 * @see com.gentleware.poseidon.dsl.impl.DSLPackageImpl#getJ_DiagramHolder()
		 * @generated
		 */
		EClass JDIAGRAM_HOLDER = eINSTANCE.getJ_DiagramHolder();

		/**
		 * The meta object literal for the '<em><b>Diagram</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JDIAGRAM_HOLDER__DIAGRAM = eINSTANCE.getJ_DiagramHolder_Diagram();

		/**
		 * The meta object literal for the '{@link com.gentleware.poseidon.dsl.impl.PoseidonCoreRootElementImpl <em>Poseidon Core Root Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.impl.PoseidonCoreRootElementImpl
		 * @see com.gentleware.poseidon.dsl.impl.DSLPackageImpl#getPoseidonCoreRootElement()
		 * @generated
		 */
		EClass POSEIDON_CORE_ROOT_ELEMENT = eINSTANCE.getPoseidonCoreRootElement();

		/**
		 * The meta object literal for the '{@link com.gentleware.poseidon.dsl.MetamodelElementWrapper <em>Metamodel Element Wrapper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.MetamodelElementWrapper
		 * @see com.gentleware.poseidon.dsl.impl.DSLPackageImpl#getMetamodelElementWrapper()
		 * @generated
		 */
		EClass METAMODEL_ELEMENT_WRAPPER = eINSTANCE.getMetamodelElementWrapper();

		/**
		 * The meta object literal for the '<em><b>uuid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METAMODEL_ELEMENT_WRAPPER__UUID = eINSTANCE.getMetamodelElementWrapper___uuid();

		/**
		 * The meta object literal for the '<em><b>Jdeleted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METAMODEL_ELEMENT_WRAPPER__JDELETED = eINSTANCE.getMetamodelElementWrapper_J_deleted();

		/**
		 * The meta object literal for the '<em><b>Jdiagram Holder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METAMODEL_ELEMENT_WRAPPER__JDIAGRAM_HOLDER = eINSTANCE.getMetamodelElementWrapper_J_diagramHolder();

		/**
		 * The meta object literal for the '<em><b>read Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METAMODEL_ELEMENT_WRAPPER__READ_ONLY = eINSTANCE.getMetamodelElementWrapper___readOnly();

		/**
		 * The meta object literal for the '<em><b>poseidon Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METAMODEL_ELEMENT_WRAPPER__POSEIDON_NAME = eINSTANCE.getMetamodelElementWrapper___poseidonName();

		/**
		 * The meta object literal for the '<em><b>poseidon Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METAMODEL_ELEMENT_WRAPPER__POSEIDON_NAMESPACE = eINSTANCE.getMetamodelElementWrapper___poseidonNamespace();

		/**
		 * The meta object literal for the '<em><b>owned Member</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METAMODEL_ELEMENT_WRAPPER__OWNED_MEMBER = eINSTANCE.getMetamodelElementWrapper___ownedMember();

		/**
		 * The meta object literal for the '<em><b>source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METAMODEL_ELEMENT_WRAPPER__SOURCE = eINSTANCE.getMetamodelElementWrapper___source();

		/**
		 * The meta object literal for the '<em><b>target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METAMODEL_ELEMENT_WRAPPER__TARGET = eINSTANCE.getMetamodelElementWrapper___target();

		/**
		 * The meta object literal for the '<em><b>poseidon Edge</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METAMODEL_ELEMENT_WRAPPER__POSEIDON_EDGE = eINSTANCE.getMetamodelElementWrapper___poseidonEdge();

		/**
		 * The meta object literal for the '<em><b>poseidon Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METAMODEL_ELEMENT_WRAPPER__POSEIDON_ROLE = eINSTANCE.getMetamodelElementWrapper___poseidonRole();

		/**
		 * The meta object literal for the '<em>String</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.gentleware.poseidon.dsl.impl.DSLPackageImpl#getString()
		 * @generated
		 */
		EDataType STRING = eINSTANCE.getString();

		/**
		 * The meta object literal for the '<em>Boolean</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.impl.DSLPackageImpl#getBoolean()
		 * @generated
		 */
		EDataType BOOLEAN = eINSTANCE.getBoolean();

		/**
		 * The meta object literal for the '<em>Integer</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gentleware.poseidon.dsl.impl.DSLPackageImpl#getInteger()
		 * @generated
		 */
		EDataType INTEGER = eINSTANCE.getInteger();

	}

} //DSLPackage
