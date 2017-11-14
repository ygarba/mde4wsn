/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.gentleware.poseidon.dsl;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metamodel Element Wrapper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.gentleware.poseidon.dsl.MetamodelElementWrapper#get__uuid <em>uuid</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.MetamodelElementWrapper#getJ_deleted <em>Jdeleted</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.MetamodelElementWrapper#getJ_diagramHolder <em>Jdiagram Holder</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.MetamodelElementWrapper#is__readOnly <em>read Only</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.MetamodelElementWrapper#get__poseidonName <em>poseidon Name</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.MetamodelElementWrapper#is__poseidonNamespace <em>poseidon Namespace</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.MetamodelElementWrapper#get__ownedMember <em>owned Member</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.MetamodelElementWrapper#get__source <em>source</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.MetamodelElementWrapper#get__target <em>target</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.MetamodelElementWrapper#is__poseidonEdge <em>poseidon Edge</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.MetamodelElementWrapper#get__poseidonRole <em>poseidon Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.gentleware.poseidon.dsl.DSLPackage#getMetamodelElementWrapper()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface MetamodelElementWrapper extends EObject {
	/**
	 * Returns the value of the '<em><b>uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>uuid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>uuid</em>' attribute.
	 * @see #set__uuid(String)
	 * @see com.gentleware.poseidon.dsl.DSLPackage#getMetamodelElementWrapper___uuid()
	 * @model
	 * @generated
	 */
	String get__uuid();

	/**
	 * Sets the value of the '{@link com.gentleware.poseidon.dsl.MetamodelElementWrapper#get__uuid <em>uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>uuid</em>' attribute.
	 * @see #get__uuid()
	 * @generated
	 */
	void set__uuid(String value);

	/**
	 * Returns the value of the '<em><b>Jdeleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jdeleted</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jdeleted</em>' attribute.
	 * @see #setJ_deleted(int)
	 * @see com.gentleware.poseidon.dsl.DSLPackage#getMetamodelElementWrapper_J_deleted()
	 * @model
	 * @generated
	 */
	int getJ_deleted();

	/**
	 * Sets the value of the '{@link com.gentleware.poseidon.dsl.MetamodelElementWrapper#getJ_deleted <em>Jdeleted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jdeleted</em>' attribute.
	 * @see #getJ_deleted()
	 * @generated
	 */
	void setJ_deleted(int value);

	/**
	 * Returns the value of the '<em><b>Jdiagram Holder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jdiagram Holder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jdiagram Holder</em>' containment reference.
	 * @see #setJ_diagramHolder(J_DiagramHolder)
	 * @see com.gentleware.poseidon.dsl.DSLPackage#getMetamodelElementWrapper_J_diagramHolder()
	 * @model containment="true"
	 * @generated
	 */
	J_DiagramHolder getJ_diagramHolder();

	/**
	 * Sets the value of the '{@link com.gentleware.poseidon.dsl.MetamodelElementWrapper#getJ_diagramHolder <em>Jdiagram Holder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jdiagram Holder</em>' containment reference.
	 * @see #getJ_diagramHolder()
	 * @generated
	 */
	void setJ_diagramHolder(J_DiagramHolder value);

	/**
	 * Returns the value of the '<em><b>read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>read Only</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>read Only</em>' attribute.
	 * @see #set__readOnly(boolean)
	 * @see com.gentleware.poseidon.dsl.DSLPackage#getMetamodelElementWrapper___readOnly()
	 * @model
	 * @generated
	 */
	boolean is__readOnly();

	/**
	 * Sets the value of the '{@link com.gentleware.poseidon.dsl.MetamodelElementWrapper#is__readOnly <em>read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>read Only</em>' attribute.
	 * @see #is__readOnly()
	 * @generated
	 */
	void set__readOnly(boolean value);

	/**
	 * Returns the value of the '<em><b>poseidon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>poseidon Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>poseidon Name</em>' attribute.
	 * @see #isSet__poseidonName()
	 * @see #unset__poseidonName()
	 * @see #set__poseidonName(String)
	 * @see com.gentleware.poseidon.dsl.DSLPackage#getMetamodelElementWrapper___poseidonName()
	 * @model unsettable="true" ordered="false"
	 * @generated
	 */
	String get__poseidonName();

	/**
	 * Sets the value of the '{@link com.gentleware.poseidon.dsl.MetamodelElementWrapper#get__poseidonName <em>poseidon Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>poseidon Name</em>' attribute.
	 * @see #isSet__poseidonName()
	 * @see #unset__poseidonName()
	 * @see #get__poseidonName()
	 * @generated
	 */
	void set__poseidonName(String value);

	/**
	 * Unsets the value of the '{@link com.gentleware.poseidon.dsl.MetamodelElementWrapper#get__poseidonName <em>poseidon Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSet__poseidonName()
	 * @see #get__poseidonName()
	 * @see #set__poseidonName(String)
	 * @generated
	 */
	void unset__poseidonName();

	/**
	 * Returns whether the value of the '{@link com.gentleware.poseidon.dsl.MetamodelElementWrapper#get__poseidonName <em>poseidon Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>poseidon Name</em>' attribute is set.
	 * @see #unset__poseidonName()
	 * @see #get__poseidonName()
	 * @see #set__poseidonName(String)
	 * @generated
	 */
	boolean isSet__poseidonName();

	/**
	 * Returns the value of the '<em><b>poseidon Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>poseidon Namespace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>poseidon Namespace</em>' attribute.
	 * @see #set__poseidonNamespace(boolean)
	 * @see com.gentleware.poseidon.dsl.DSLPackage#getMetamodelElementWrapper___poseidonNamespace()
	 * @model
	 * @generated
	 */
	boolean is__poseidonNamespace();

	/**
	 * Sets the value of the '{@link com.gentleware.poseidon.dsl.MetamodelElementWrapper#is__poseidonNamespace <em>poseidon Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>poseidon Namespace</em>' attribute.
	 * @see #is__poseidonNamespace()
	 * @generated
	 */
	void set__poseidonNamespace(boolean value);

	/**
	 * Returns the value of the '<em><b>owned Member</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>owned Member</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>owned Member</em>' containment reference list.
	 * @see com.gentleware.poseidon.dsl.DSLPackage#getMetamodelElementWrapper___ownedMember()
	 * @model containment="true" changeable="false" ordered="false"
	 * @generated
	 */
	EList<EObject> get__ownedMember();

	/**
	 * Returns the value of the '<em><b>source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>source</em>' reference.
	 * @see #set__source(EObject)
	 * @see com.gentleware.poseidon.dsl.DSLPackage#getMetamodelElementWrapper___source()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EObject get__source();

	/**
	 * Sets the value of the '{@link com.gentleware.poseidon.dsl.MetamodelElementWrapper#get__source <em>source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>source</em>' reference.
	 * @see #get__source()
	 * @generated
	 */
	void set__source(EObject value);

	/**
	 * Returns the value of the '<em><b>target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>target</em>' reference.
	 * @see #set__target(EObject)
	 * @see com.gentleware.poseidon.dsl.DSLPackage#getMetamodelElementWrapper___target()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EObject get__target();

	/**
	 * Sets the value of the '{@link com.gentleware.poseidon.dsl.MetamodelElementWrapper#get__target <em>target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>target</em>' reference.
	 * @see #get__target()
	 * @generated
	 */
	void set__target(EObject value);

	/**
	 * Returns the value of the '<em><b>poseidon Edge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>poseidon Edge</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>poseidon Edge</em>' attribute.
	 * @see #set__poseidonEdge(boolean)
	 * @see com.gentleware.poseidon.dsl.DSLPackage#getMetamodelElementWrapper___poseidonEdge()
	 * @model
	 * @generated
	 */
	boolean is__poseidonEdge();

	/**
	 * Sets the value of the '{@link com.gentleware.poseidon.dsl.MetamodelElementWrapper#is__poseidonEdge <em>poseidon Edge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>poseidon Edge</em>' attribute.
	 * @see #is__poseidonEdge()
	 * @generated
	 */
	void set__poseidonEdge(boolean value);

	/**
	 * Returns the value of the '<em><b>poseidon Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>poseidon Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>poseidon Role</em>' attribute.
	 * @see #set__poseidonRole(String)
	 * @see com.gentleware.poseidon.dsl.DSLPackage#getMetamodelElementWrapper___poseidonRole()
	 * @model
	 * @generated
	 */
	String get__poseidonRole();

	/**
	 * Sets the value of the '{@link com.gentleware.poseidon.dsl.MetamodelElementWrapper#get__poseidonRole <em>poseidon Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>poseidon Role</em>' attribute.
	 * @see #get__poseidonRole()
	 * @generated
	 */
	void set__poseidonRole(String value);

} // MetamodelElementWrapper
