/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.gentleware.poseidon.dsl.wsn.impl;

import com.gentleware.poseidon.dsl.wsn.Activity;
import com.gentleware.poseidon.dsl.wsn.ActivityEdge;
import com.gentleware.poseidon.dsl.wsn.ActivityNode;
import com.gentleware.poseidon.dsl.wsn.USERPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.impl.ActivityImpl#getIn <em>In</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.impl.ActivityImpl#getOut <em>Out</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.impl.ActivityImpl#isIsJointPoint <em>Is Joint Point</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.impl.ActivityImpl#getId <em>Id</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.impl.ActivityImpl#getInitialNode <em>Initial Node</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.wsn.impl.ActivityImpl#getEdges <em>Edges</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityImpl extends EObjectImpl implements Activity {
	/**
	 * The default value of the '{@link #getIn() <em>In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected static final String IN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIn() <em>In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected String in = IN_EDEFAULT;

	/**
	 * The default value of the '{@link #getOut() <em>Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOut()
	 * @generated
	 * @ordered
	 */
	protected static final String OUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOut() <em>Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOut()
	 * @generated
	 * @ordered
	 */
	protected String out = OUT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsJointPoint() <em>Is Joint Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsJointPoint()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_JOINT_POINT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsJointPoint() <em>Is Joint Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsJointPoint()
	 * @generated
	 * @ordered
	 */
	protected boolean isJointPoint = IS_JOINT_POINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInitialNode() <em>Initial Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialNode()
	 * @generated
	 * @ordered
	 */
	protected ActivityNode initialNode;

	/**
	 * The cached value of the '{@link #getEdges() <em>Edges</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdges()
	 * @generated
	 * @ordered
	 */
	protected ActivityEdge edges;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return USERPackage.Literals.ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIn() {
		return in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIn(String newIn) {
		String oldIn = in;
		in = newIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, USERPackage.ACTIVITY__IN, oldIn, in));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOut() {
		return out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOut(String newOut) {
		String oldOut = out;
		out = newOut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, USERPackage.ACTIVITY__OUT, oldOut, out));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsJointPoint() {
		return isJointPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsJointPoint(boolean newIsJointPoint) {
		boolean oldIsJointPoint = isJointPoint;
		isJointPoint = newIsJointPoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, USERPackage.ACTIVITY__IS_JOINT_POINT, oldIsJointPoint, isJointPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, USERPackage.ACTIVITY__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode getInitialNode() {
		return initialNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialNode(ActivityNode newInitialNode, NotificationChain msgs) {
		ActivityNode oldInitialNode = initialNode;
		initialNode = newInitialNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, USERPackage.ACTIVITY__INITIAL_NODE, oldInitialNode, newInitialNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialNode(ActivityNode newInitialNode) {
		if (newInitialNode != initialNode) {
			NotificationChain msgs = null;
			if (initialNode != null)
				msgs = ((InternalEObject)initialNode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - USERPackage.ACTIVITY__INITIAL_NODE, null, msgs);
			if (newInitialNode != null)
				msgs = ((InternalEObject)newInitialNode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - USERPackage.ACTIVITY__INITIAL_NODE, null, msgs);
			msgs = basicSetInitialNode(newInitialNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, USERPackage.ACTIVITY__INITIAL_NODE, newInitialNode, newInitialNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdge getEdges() {
		return edges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEdges(ActivityEdge newEdges, NotificationChain msgs) {
		ActivityEdge oldEdges = edges;
		edges = newEdges;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, USERPackage.ACTIVITY__EDGES, oldEdges, newEdges);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdges(ActivityEdge newEdges) {
		if (newEdges != edges) {
			NotificationChain msgs = null;
			if (edges != null)
				msgs = ((InternalEObject)edges).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - USERPackage.ACTIVITY__EDGES, null, msgs);
			if (newEdges != null)
				msgs = ((InternalEObject)newEdges).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - USERPackage.ACTIVITY__EDGES, null, msgs);
			msgs = basicSetEdges(newEdges, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, USERPackage.ACTIVITY__EDGES, newEdges, newEdges));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case USERPackage.ACTIVITY__INITIAL_NODE:
				return basicSetInitialNode(null, msgs);
			case USERPackage.ACTIVITY__EDGES:
				return basicSetEdges(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case USERPackage.ACTIVITY__IN:
				return getIn();
			case USERPackage.ACTIVITY__OUT:
				return getOut();
			case USERPackage.ACTIVITY__IS_JOINT_POINT:
				return isIsJointPoint();
			case USERPackage.ACTIVITY__ID:
				return getId();
			case USERPackage.ACTIVITY__INITIAL_NODE:
				return getInitialNode();
			case USERPackage.ACTIVITY__EDGES:
				return getEdges();
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
			case USERPackage.ACTIVITY__IN:
				setIn((String)newValue);
				return;
			case USERPackage.ACTIVITY__OUT:
				setOut((String)newValue);
				return;
			case USERPackage.ACTIVITY__IS_JOINT_POINT:
				setIsJointPoint((Boolean)newValue);
				return;
			case USERPackage.ACTIVITY__ID:
				setId((String)newValue);
				return;
			case USERPackage.ACTIVITY__INITIAL_NODE:
				setInitialNode((ActivityNode)newValue);
				return;
			case USERPackage.ACTIVITY__EDGES:
				setEdges((ActivityEdge)newValue);
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
			case USERPackage.ACTIVITY__IN:
				setIn(IN_EDEFAULT);
				return;
			case USERPackage.ACTIVITY__OUT:
				setOut(OUT_EDEFAULT);
				return;
			case USERPackage.ACTIVITY__IS_JOINT_POINT:
				setIsJointPoint(IS_JOINT_POINT_EDEFAULT);
				return;
			case USERPackage.ACTIVITY__ID:
				setId(ID_EDEFAULT);
				return;
			case USERPackage.ACTIVITY__INITIAL_NODE:
				setInitialNode((ActivityNode)null);
				return;
			case USERPackage.ACTIVITY__EDGES:
				setEdges((ActivityEdge)null);
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
			case USERPackage.ACTIVITY__IN:
				return IN_EDEFAULT == null ? in != null : !IN_EDEFAULT.equals(in);
			case USERPackage.ACTIVITY__OUT:
				return OUT_EDEFAULT == null ? out != null : !OUT_EDEFAULT.equals(out);
			case USERPackage.ACTIVITY__IS_JOINT_POINT:
				return isJointPoint != IS_JOINT_POINT_EDEFAULT;
			case USERPackage.ACTIVITY__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case USERPackage.ACTIVITY__INITIAL_NODE:
				return initialNode != null;
			case USERPackage.ACTIVITY__EDGES:
				return edges != null;
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
		result.append(" (in: ");
		result.append(in);
		result.append(", out: ");
		result.append(out);
		result.append(", isJointPoint: ");
		result.append(isJointPoint);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //ActivityImpl
