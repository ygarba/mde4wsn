/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.gentleware.poseidon.dsl.impl;

import com.gentleware.poseidon.dsl.DSLPackage;
import com.gentleware.poseidon.dsl.J_DiagramHolder;
import com.gentleware.poseidon.dsl.PoseidonCoreElement;
import org.eclipse.emf.common.notify.Notification;
import com.gentleware.poseidon.emf.notifications.GlobalNotifier;
import com.gentleware.poseidon.emf.notifications.GlobalUUIDGenerator;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Poseidon Core Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.gentleware.poseidon.dsl.impl.PoseidonCoreElementImpl#get__uuid <em>uuid</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.impl.PoseidonCoreElementImpl#getJ_deleted <em>Jdeleted</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.impl.PoseidonCoreElementImpl#getJ_diagramHolder <em>Jdiagram Holder</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.impl.PoseidonCoreElementImpl#is__readOnly <em>read Only</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.impl.PoseidonCoreElementImpl#get__poseidonName <em>poseidon Name</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.impl.PoseidonCoreElementImpl#is__poseidonNamespace <em>poseidon Namespace</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.impl.PoseidonCoreElementImpl#get__ownedMember <em>owned Member</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.impl.PoseidonCoreElementImpl#get__source <em>source</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.impl.PoseidonCoreElementImpl#get__target <em>target</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.impl.PoseidonCoreElementImpl#is__poseidonEdge <em>poseidon Edge</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.impl.PoseidonCoreElementImpl#get__poseidonRole <em>poseidon Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PoseidonCoreElementImpl extends EObjectImpl implements PoseidonCoreElement {
	/**
	 * The default value of the '{@link #get__uuid() <em>uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get__uuid()
	 * @generated
	 * @ordered
	 */
	protected static final String _UUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #get__uuid() <em>uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get__uuid()
	 * @generated
	 * @ordered
	 */
	protected String __uuid = _UUID_EDEFAULT;

	/**
	 * The default value of the '{@link #getJ_deleted() <em>Jdeleted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJ_deleted()
	 * @generated
	 * @ordered
	 */
	protected static final int JDELETED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getJ_deleted() <em>Jdeleted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJ_deleted()
	 * @generated
	 * @ordered
	 */
	protected int j_deleted = JDELETED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getJ_diagramHolder() <em>Jdiagram Holder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJ_diagramHolder()
	 * @generated
	 * @ordered
	 */
	protected J_DiagramHolder j_diagramHolder;

	/**
	 * The default value of the '{@link #is__readOnly() <em>read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #is__readOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean _READ_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #is__readOnly() <em>read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #is__readOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean __readOnly = _READ_ONLY_EDEFAULT;

	/**
	 * The default value of the '{@link #get__poseidonName() <em>poseidon Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get__poseidonName()
	 * @generated
	 * @ordered
	 */
	protected static final String _POSEIDON_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #get__poseidonName() <em>poseidon Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get__poseidonName()
	 * @generated
	 * @ordered
	 */
	protected String __poseidonName = _POSEIDON_NAME_EDEFAULT;

	/**
	 * This is true if the poseidon Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean __poseidonNameESet;

	/**
	 * The default value of the '{@link #is__poseidonNamespace() <em>poseidon Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #is__poseidonNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final boolean _POSEIDON_NAMESPACE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #is__poseidonNamespace() <em>poseidon Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #is__poseidonNamespace()
	 * @generated
	 * @ordered
	 */
	protected boolean __poseidonNamespace = _POSEIDON_NAMESPACE_EDEFAULT;

	/**
	 * The cached value of the '{@link #get__ownedMember() <em>owned Member</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get__ownedMember()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> __ownedMember;

	/**
	 * The cached value of the '{@link #get__source() <em>source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get__source()
	 * @generated
	 * @ordered
	 */
	protected EObject __source;

	/**
	 * The cached value of the '{@link #get__target() <em>target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get__target()
	 * @generated
	 * @ordered
	 */
	protected EObject __target;

	/**
	 * The default value of the '{@link #is__poseidonEdge() <em>poseidon Edge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #is__poseidonEdge()
	 * @generated
	 * @ordered
	 */
	protected static final boolean _POSEIDON_EDGE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #is__poseidonEdge() <em>poseidon Edge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #is__poseidonEdge()
	 * @generated
	 * @ordered
	 */
	protected boolean __poseidonEdge = _POSEIDON_EDGE_EDEFAULT;

	/**
	 * The default value of the '{@link #get__poseidonRole() <em>poseidon Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get__poseidonRole()
	 * @generated
	 * @ordered
	 */
	protected static final String _POSEIDON_ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #get__poseidonRole() <em>poseidon Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get__poseidonRole()
	 * @generated
	 * @ordered
	 */
	protected String __poseidonRole = _POSEIDON_ROLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	protected PoseidonCoreElementImpl() {
		super();
        if (GlobalUUIDGenerator.GlOBAL_UUID_GENERATOR != null)
            set__uuid(GlobalUUIDGenerator.GlOBAL_UUID_GENERATOR.generateUUID(this));        
//            CacheAdapter.INSTANCE.adapt(this);
            eAdapters().add(GlobalNotifier.getSingleton());		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DSLPackage.Literals.POSEIDON_CORE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String get__uuid() {
		return __uuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set__uuid(String new__uuid) {
		String old__uuid = __uuid;
		__uuid = new__uuid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.POSEIDON_CORE_ELEMENT__UUID, old__uuid, __uuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getJ_deleted() {
		return j_deleted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJ_deleted(int newJ_deleted) {
		int oldJ_deleted = j_deleted;
		j_deleted = newJ_deleted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.POSEIDON_CORE_ELEMENT__JDELETED, oldJ_deleted, j_deleted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public J_DiagramHolder getJ_diagramHolder() {
		return j_diagramHolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJ_diagramHolder(J_DiagramHolder newJ_diagramHolder, NotificationChain msgs) {
		J_DiagramHolder oldJ_diagramHolder = j_diagramHolder;
		j_diagramHolder = newJ_diagramHolder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DSLPackage.POSEIDON_CORE_ELEMENT__JDIAGRAM_HOLDER, oldJ_diagramHolder, newJ_diagramHolder);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJ_diagramHolder(J_DiagramHolder newJ_diagramHolder) {
		if (newJ_diagramHolder != j_diagramHolder) {
			NotificationChain msgs = null;
			if (j_diagramHolder != null)
				msgs = ((InternalEObject)j_diagramHolder).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DSLPackage.POSEIDON_CORE_ELEMENT__JDIAGRAM_HOLDER, null, msgs);
			if (newJ_diagramHolder != null)
				msgs = ((InternalEObject)newJ_diagramHolder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DSLPackage.POSEIDON_CORE_ELEMENT__JDIAGRAM_HOLDER, null, msgs);
			msgs = basicSetJ_diagramHolder(newJ_diagramHolder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.POSEIDON_CORE_ELEMENT__JDIAGRAM_HOLDER, newJ_diagramHolder, newJ_diagramHolder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean is__readOnly() {
		return __readOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set__readOnly(boolean new__readOnly) {
		boolean old__readOnly = __readOnly;
		__readOnly = new__readOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.POSEIDON_CORE_ELEMENT__READ_ONLY, old__readOnly, __readOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String get__poseidonName() {
		return __poseidonName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set__poseidonName(String new__poseidonName) {
		String old__poseidonName = __poseidonName;
		__poseidonName = new__poseidonName;
		boolean old__poseidonNameESet = __poseidonNameESet;
		__poseidonNameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.POSEIDON_CORE_ELEMENT__POSEIDON_NAME, old__poseidonName, __poseidonName, !old__poseidonNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unset__poseidonName() {
		String old__poseidonName = __poseidonName;
		boolean old__poseidonNameESet = __poseidonNameESet;
		__poseidonName = _POSEIDON_NAME_EDEFAULT;
		__poseidonNameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DSLPackage.POSEIDON_CORE_ELEMENT__POSEIDON_NAME, old__poseidonName, _POSEIDON_NAME_EDEFAULT, old__poseidonNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSet__poseidonName() {
		return __poseidonNameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean is__poseidonNamespace() {
		return __poseidonNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set__poseidonNamespace(boolean new__poseidonNamespace) {
		boolean old__poseidonNamespace = __poseidonNamespace;
		__poseidonNamespace = new__poseidonNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.POSEIDON_CORE_ELEMENT__POSEIDON_NAMESPACE, old__poseidonNamespace, __poseidonNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EObject> get__ownedMember() {
		if (__ownedMember == null) {
			__ownedMember = new EObjectContainmentEList<EObject>(EObject.class, this, DSLPackage.POSEIDON_CORE_ELEMENT__OWNED_MEMBER);
		}
		return __ownedMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject get__source() {
		if (__source != null && __source.eIsProxy()) {
			InternalEObject old__source = (InternalEObject)__source;
			__source = eResolveProxy(old__source);
			if (__source != old__source) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DSLPackage.POSEIDON_CORE_ELEMENT__SOURCE, old__source, __source));
			}
		}
		return __source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGet__source() {
		return __source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set__source(EObject new__source) {
		EObject old__source = __source;
		__source = new__source;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.POSEIDON_CORE_ELEMENT__SOURCE, old__source, __source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject get__target() {
		if (__target != null && __target.eIsProxy()) {
			InternalEObject old__target = (InternalEObject)__target;
			__target = eResolveProxy(old__target);
			if (__target != old__target) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DSLPackage.POSEIDON_CORE_ELEMENT__TARGET, old__target, __target));
			}
		}
		return __target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGet__target() {
		return __target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set__target(EObject new__target) {
		EObject old__target = __target;
		__target = new__target;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.POSEIDON_CORE_ELEMENT__TARGET, old__target, __target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean is__poseidonEdge() {
		return __poseidonEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set__poseidonEdge(boolean new__poseidonEdge) {
		boolean old__poseidonEdge = __poseidonEdge;
		__poseidonEdge = new__poseidonEdge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.POSEIDON_CORE_ELEMENT__POSEIDON_EDGE, old__poseidonEdge, __poseidonEdge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String get__poseidonRole() {
		return __poseidonRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set__poseidonRole(String new__poseidonRole) {
		String old__poseidonRole = __poseidonRole;
		__poseidonRole = new__poseidonRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.POSEIDON_CORE_ELEMENT__POSEIDON_ROLE, old__poseidonRole, __poseidonRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DSLPackage.POSEIDON_CORE_ELEMENT__JDIAGRAM_HOLDER:
				return basicSetJ_diagramHolder(null, msgs);
			case DSLPackage.POSEIDON_CORE_ELEMENT__OWNED_MEMBER:
				return ((InternalEList<?>)get__ownedMember()).basicRemove(otherEnd, msgs);
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
			case DSLPackage.POSEIDON_CORE_ELEMENT__UUID:
				return get__uuid();
			case DSLPackage.POSEIDON_CORE_ELEMENT__JDELETED:
				return getJ_deleted();
			case DSLPackage.POSEIDON_CORE_ELEMENT__JDIAGRAM_HOLDER:
				return getJ_diagramHolder();
			case DSLPackage.POSEIDON_CORE_ELEMENT__READ_ONLY:
				return is__readOnly();
			case DSLPackage.POSEIDON_CORE_ELEMENT__POSEIDON_NAME:
				return get__poseidonName();
			case DSLPackage.POSEIDON_CORE_ELEMENT__POSEIDON_NAMESPACE:
				return is__poseidonNamespace();
			case DSLPackage.POSEIDON_CORE_ELEMENT__OWNED_MEMBER:
				return get__ownedMember();
			case DSLPackage.POSEIDON_CORE_ELEMENT__SOURCE:
				if (resolve) return get__source();
				return basicGet__source();
			case DSLPackage.POSEIDON_CORE_ELEMENT__TARGET:
				if (resolve) return get__target();
				return basicGet__target();
			case DSLPackage.POSEIDON_CORE_ELEMENT__POSEIDON_EDGE:
				return is__poseidonEdge();
			case DSLPackage.POSEIDON_CORE_ELEMENT__POSEIDON_ROLE:
				return get__poseidonRole();
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
			case DSLPackage.POSEIDON_CORE_ELEMENT__UUID:
				set__uuid((String)newValue);
				return;
			case DSLPackage.POSEIDON_CORE_ELEMENT__JDELETED:
				setJ_deleted((Integer)newValue);
				return;
			case DSLPackage.POSEIDON_CORE_ELEMENT__JDIAGRAM_HOLDER:
				setJ_diagramHolder((J_DiagramHolder)newValue);
				return;
			case DSLPackage.POSEIDON_CORE_ELEMENT__READ_ONLY:
				set__readOnly((Boolean)newValue);
				return;
			case DSLPackage.POSEIDON_CORE_ELEMENT__POSEIDON_NAME:
				set__poseidonName((String)newValue);
				return;
			case DSLPackage.POSEIDON_CORE_ELEMENT__POSEIDON_NAMESPACE:
				set__poseidonNamespace((Boolean)newValue);
				return;
			case DSLPackage.POSEIDON_CORE_ELEMENT__SOURCE:
				set__source((EObject)newValue);
				return;
			case DSLPackage.POSEIDON_CORE_ELEMENT__TARGET:
				set__target((EObject)newValue);
				return;
			case DSLPackage.POSEIDON_CORE_ELEMENT__POSEIDON_EDGE:
				set__poseidonEdge((Boolean)newValue);
				return;
			case DSLPackage.POSEIDON_CORE_ELEMENT__POSEIDON_ROLE:
				set__poseidonRole((String)newValue);
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
			case DSLPackage.POSEIDON_CORE_ELEMENT__UUID:
				set__uuid(_UUID_EDEFAULT);
				return;
			case DSLPackage.POSEIDON_CORE_ELEMENT__JDELETED:
				setJ_deleted(JDELETED_EDEFAULT);
				return;
			case DSLPackage.POSEIDON_CORE_ELEMENT__JDIAGRAM_HOLDER:
				setJ_diagramHolder((J_DiagramHolder)null);
				return;
			case DSLPackage.POSEIDON_CORE_ELEMENT__READ_ONLY:
				set__readOnly(_READ_ONLY_EDEFAULT);
				return;
			case DSLPackage.POSEIDON_CORE_ELEMENT__POSEIDON_NAME:
				unset__poseidonName();
				return;
			case DSLPackage.POSEIDON_CORE_ELEMENT__POSEIDON_NAMESPACE:
				set__poseidonNamespace(_POSEIDON_NAMESPACE_EDEFAULT);
				return;
			case DSLPackage.POSEIDON_CORE_ELEMENT__SOURCE:
				set__source((EObject)null);
				return;
			case DSLPackage.POSEIDON_CORE_ELEMENT__TARGET:
				set__target((EObject)null);
				return;
			case DSLPackage.POSEIDON_CORE_ELEMENT__POSEIDON_EDGE:
				set__poseidonEdge(_POSEIDON_EDGE_EDEFAULT);
				return;
			case DSLPackage.POSEIDON_CORE_ELEMENT__POSEIDON_ROLE:
				set__poseidonRole(_POSEIDON_ROLE_EDEFAULT);
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
			case DSLPackage.POSEIDON_CORE_ELEMENT__UUID:
				return _UUID_EDEFAULT == null ? __uuid != null : !_UUID_EDEFAULT.equals(__uuid);
			case DSLPackage.POSEIDON_CORE_ELEMENT__JDELETED:
				return j_deleted != JDELETED_EDEFAULT;
			case DSLPackage.POSEIDON_CORE_ELEMENT__JDIAGRAM_HOLDER:
				return j_diagramHolder != null;
			case DSLPackage.POSEIDON_CORE_ELEMENT__READ_ONLY:
				return __readOnly != _READ_ONLY_EDEFAULT;
			case DSLPackage.POSEIDON_CORE_ELEMENT__POSEIDON_NAME:
				return isSet__poseidonName();
			case DSLPackage.POSEIDON_CORE_ELEMENT__POSEIDON_NAMESPACE:
				return __poseidonNamespace != _POSEIDON_NAMESPACE_EDEFAULT;
			case DSLPackage.POSEIDON_CORE_ELEMENT__OWNED_MEMBER:
				return __ownedMember != null && !__ownedMember.isEmpty();
			case DSLPackage.POSEIDON_CORE_ELEMENT__SOURCE:
				return __source != null;
			case DSLPackage.POSEIDON_CORE_ELEMENT__TARGET:
				return __target != null;
			case DSLPackage.POSEIDON_CORE_ELEMENT__POSEIDON_EDGE:
				return __poseidonEdge != _POSEIDON_EDGE_EDEFAULT;
			case DSLPackage.POSEIDON_CORE_ELEMENT__POSEIDON_ROLE:
				return _POSEIDON_ROLE_EDEFAULT == null ? __poseidonRole != null : !_POSEIDON_ROLE_EDEFAULT.equals(__poseidonRole);
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
		result.append(" (__uuid: ");
		result.append(__uuid);
		result.append(", j_deleted: ");
		result.append(j_deleted);
		result.append(", __readOnly: ");
		result.append(__readOnly);
		result.append(", __poseidonName: ");
		if (__poseidonNameESet) result.append(__poseidonName); else result.append("<unset>");
		result.append(", __poseidonNamespace: ");
		result.append(__poseidonNamespace);
		result.append(", __poseidonEdge: ");
		result.append(__poseidonEdge);
		result.append(", __poseidonRole: ");
		result.append(__poseidonRole);
		result.append(')');
		return result.toString();
	}

} //PoseidonCoreElementImpl
