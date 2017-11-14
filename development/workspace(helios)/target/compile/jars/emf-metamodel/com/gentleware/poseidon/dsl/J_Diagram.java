/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.gentleware.poseidon.dsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JDiagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.gentleware.poseidon.dsl.J_Diagram#getLastFigureId <em>Last Figure Id</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.J_Diagram#getSaveTime <em>Save Time</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.J_Diagram#getSavedBy <em>Saved By</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.J_Diagram#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.gentleware.poseidon.dsl.DSLPackage#getJ_Diagram()
 * @model
 * @generated
 */
public interface J_Diagram extends J_FigureContainer {
	/**
	 * Returns the value of the '<em><b>Last Figure Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Figure Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Figure Id</em>' attribute.
	 * @see #setLastFigureId(int)
	 * @see com.gentleware.poseidon.dsl.DSLPackage#getJ_Diagram_LastFigureId()
	 * @model
	 * @generated
	 */
	int getLastFigureId();

	/**
	 * Sets the value of the '{@link com.gentleware.poseidon.dsl.J_Diagram#getLastFigureId <em>Last Figure Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Figure Id</em>' attribute.
	 * @see #getLastFigureId()
	 * @generated
	 */
	void setLastFigureId(int value);

	/**
	 * Returns the value of the '<em><b>Save Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Save Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Save Time</em>' attribute.
	 * @see #setSaveTime(String)
	 * @see com.gentleware.poseidon.dsl.DSLPackage#getJ_Diagram_SaveTime()
	 * @model
	 * @generated
	 */
	String getSaveTime();

	/**
	 * Sets the value of the '{@link com.gentleware.poseidon.dsl.J_Diagram#getSaveTime <em>Save Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Save Time</em>' attribute.
	 * @see #getSaveTime()
	 * @generated
	 */
	void setSaveTime(String value);

	/**
	 * Returns the value of the '<em><b>Saved By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Saved By</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Saved By</em>' attribute.
	 * @see #setSavedBy(String)
	 * @see com.gentleware.poseidon.dsl.DSLPackage#getJ_Diagram_SavedBy()
	 * @model
	 * @generated
	 */
	String getSavedBy();

	/**
	 * Sets the value of the '{@link com.gentleware.poseidon.dsl.J_Diagram#getSavedBy <em>Saved By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Saved By</em>' attribute.
	 * @see #getSavedBy()
	 * @generated
	 */
	void setSavedBy(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see com.gentleware.poseidon.dsl.DSLPackage#getJ_Diagram_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link com.gentleware.poseidon.dsl.J_Diagram#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // J_Diagram
