/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.gentleware.poseidon.dsl.impl;

import com.gentleware.poseidon.dsl.DSLPackage;
import com.gentleware.poseidon.dsl.J_Diagram;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JDiagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.gentleware.poseidon.dsl.impl.J_DiagramImpl#getLastFigureId <em>Last Figure Id</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.impl.J_DiagramImpl#getSaveTime <em>Save Time</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.impl.J_DiagramImpl#getSavedBy <em>Saved By</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.impl.J_DiagramImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class J_DiagramImpl extends J_FigureContainerImpl implements J_Diagram {
	/**
	 * The default value of the '{@link #getLastFigureId() <em>Last Figure Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastFigureId()
	 * @generated
	 * @ordered
	 */
	protected static final int LAST_FIGURE_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLastFigureId() <em>Last Figure Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastFigureId()
	 * @generated
	 * @ordered
	 */
	protected int lastFigureId = LAST_FIGURE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSaveTime() <em>Save Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSaveTime()
	 * @generated
	 * @ordered
	 */
	protected static final String SAVE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSaveTime() <em>Save Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSaveTime()
	 * @generated
	 * @ordered
	 */
	protected String saveTime = SAVE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSavedBy() <em>Saved By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSavedBy()
	 * @generated
	 * @ordered
	 */
	protected static final String SAVED_BY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSavedBy() <em>Saved By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSavedBy()
	 * @generated
	 * @ordered
	 */
	protected String savedBy = SAVED_BY_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected J_DiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DSLPackage.Literals.JDIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLastFigureId() {
		return lastFigureId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastFigureId(int newLastFigureId) {
		int oldLastFigureId = lastFigureId;
		lastFigureId = newLastFigureId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.JDIAGRAM__LAST_FIGURE_ID, oldLastFigureId, lastFigureId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSaveTime() {
		return saveTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSaveTime(String newSaveTime) {
		String oldSaveTime = saveTime;
		saveTime = newSaveTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.JDIAGRAM__SAVE_TIME, oldSaveTime, saveTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSavedBy() {
		return savedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSavedBy(String newSavedBy) {
		String oldSavedBy = savedBy;
		savedBy = newSavedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.JDIAGRAM__SAVED_BY, oldSavedBy, savedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.JDIAGRAM__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DSLPackage.JDIAGRAM__LAST_FIGURE_ID:
				return getLastFigureId();
			case DSLPackage.JDIAGRAM__SAVE_TIME:
				return getSaveTime();
			case DSLPackage.JDIAGRAM__SAVED_BY:
				return getSavedBy();
			case DSLPackage.JDIAGRAM__TYPE:
				return getType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DSLPackage.JDIAGRAM__LAST_FIGURE_ID:
				setLastFigureId((Integer)newValue);
				return;
			case DSLPackage.JDIAGRAM__SAVE_TIME:
				setSaveTime((String)newValue);
				return;
			case DSLPackage.JDIAGRAM__SAVED_BY:
				setSavedBy((String)newValue);
				return;
			case DSLPackage.JDIAGRAM__TYPE:
				setType((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DSLPackage.JDIAGRAM__LAST_FIGURE_ID:
				setLastFigureId(LAST_FIGURE_ID_EDEFAULT);
				return;
			case DSLPackage.JDIAGRAM__SAVE_TIME:
				setSaveTime(SAVE_TIME_EDEFAULT);
				return;
			case DSLPackage.JDIAGRAM__SAVED_BY:
				setSavedBy(SAVED_BY_EDEFAULT);
				return;
			case DSLPackage.JDIAGRAM__TYPE:
				setType(TYPE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DSLPackage.JDIAGRAM__LAST_FIGURE_ID:
				return lastFigureId != LAST_FIGURE_ID_EDEFAULT;
			case DSLPackage.JDIAGRAM__SAVE_TIME:
				return SAVE_TIME_EDEFAULT == null ? saveTime != null : !SAVE_TIME_EDEFAULT.equals(saveTime);
			case DSLPackage.JDIAGRAM__SAVED_BY:
				return SAVED_BY_EDEFAULT == null ? savedBy != null : !SAVED_BY_EDEFAULT.equals(savedBy);
			case DSLPackage.JDIAGRAM__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (lastFigureId: ");
		result.append(lastFigureId);
		result.append(", saveTime: ");
		result.append(saveTime);
		result.append(", savedBy: ");
		result.append(savedBy);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //J_DiagramImpl
