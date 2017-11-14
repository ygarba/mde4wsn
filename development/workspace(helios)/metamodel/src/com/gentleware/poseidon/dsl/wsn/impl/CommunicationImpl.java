/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.gentleware.poseidon.dsl.wsn.impl;

import com.gentleware.poseidon.dsl.wsn.Communication;
import com.gentleware.poseidon.dsl.wsn.Node;
import com.gentleware.poseidon.dsl.wsn.USERPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.impl.CommunicationImpl#getCommSource <em>Comm Source</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.impl.CommunicationImpl#getCommDestination <em>Comm Destination</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommunicationImpl extends EObjectImpl implements Communication {
	/**
	 * The cached value of the '{@link #getCommSource() <em>Comm Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommSource()
	 * @generated
	 * @ordered
	 */
	protected Node commSource;

	/**
	 * The cached value of the '{@link #getCommDestination() <em>Comm Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommDestination()
	 * @generated
	 * @ordered
	 */
	protected Node commDestination;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return USERPackage.Literals.COMMUNICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getCommSource() {
		if (commSource != null && commSource.eIsProxy()) {
			InternalEObject oldCommSource = (InternalEObject)commSource;
			commSource = (Node)eResolveProxy(oldCommSource);
			if (commSource != oldCommSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, USERPackage.COMMUNICATION__COMM_SOURCE, oldCommSource, commSource));
			}
		}
		return commSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetCommSource() {
		return commSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommSource(Node newCommSource) {
		Node oldCommSource = commSource;
		commSource = newCommSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, USERPackage.COMMUNICATION__COMM_SOURCE, oldCommSource, commSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getCommDestination() {
		if (commDestination != null && commDestination.eIsProxy()) {
			InternalEObject oldCommDestination = (InternalEObject)commDestination;
			commDestination = (Node)eResolveProxy(oldCommDestination);
			if (commDestination != oldCommDestination) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, USERPackage.COMMUNICATION__COMM_DESTINATION, oldCommDestination, commDestination));
			}
		}
		return commDestination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetCommDestination() {
		return commDestination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommDestination(Node newCommDestination) {
		Node oldCommDestination = commDestination;
		commDestination = newCommDestination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, USERPackage.COMMUNICATION__COMM_DESTINATION, oldCommDestination, commDestination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case USERPackage.COMMUNICATION__COMM_SOURCE:
				if (resolve) return getCommSource();
				return basicGetCommSource();
			case USERPackage.COMMUNICATION__COMM_DESTINATION:
				if (resolve) return getCommDestination();
				return basicGetCommDestination();
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
			case USERPackage.COMMUNICATION__COMM_SOURCE:
				setCommSource((Node)newValue);
				return;
			case USERPackage.COMMUNICATION__COMM_DESTINATION:
				setCommDestination((Node)newValue);
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
			case USERPackage.COMMUNICATION__COMM_SOURCE:
				setCommSource((Node)null);
				return;
			case USERPackage.COMMUNICATION__COMM_DESTINATION:
				setCommDestination((Node)null);
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
			case USERPackage.COMMUNICATION__COMM_SOURCE:
				return commSource != null;
			case USERPackage.COMMUNICATION__COMM_DESTINATION:
				return commDestination != null;
		}
		return super.eIsSet(featureID);
	}

} //CommunicationImpl
