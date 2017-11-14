// DO NOT MODIFY THIS FILE! This code is generated.

package com.gentleware.poseidon.model.wrapper.impl;

import java.util.Collection;
import java.util.Collections;

import com.gentleware.poseidon.dsl.DSLPackage;
import com.gentleware.poseidon.dsl.J_DiagramHolder;
import com.gentleware.poseidon.dsl.MetamodelElementWrapper;

import com.gentleware.poseidon.dsl.impl.DSLPackageImpl;
import com.gentleware.poseidon.dsl.wsn.impl.ActivationProfileImpl;

import com.gentleware.poseidon.emf.notifications.GlobalNotifier;
import com.gentleware.poseidon.emf.notifications.GlobalUUIDGenerator;

import com.gentleware.poseidon.model.wrapper.WrappedActivationProfile;
import com.gentleware.poseidon.model.wrapper.WrapperPackage;
import com.gentleware.poseidon.model.wrapper.util.CrossReferenceAdapter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;



public class WrappedActivationProfileImpl extends ActivationProfileImpl implements WrappedActivationProfile {

	protected static final String _UUID_EDEFAULT = null;

	protected String __uuid = _UUID_EDEFAULT;

	protected static final int JDELETED_EDEFAULT = 0;

	protected int j_deleted = JDELETED_EDEFAULT;

	protected J_DiagramHolder j_diagramHolder;

	protected static final boolean _READ_ONLY_EDEFAULT = false;

	protected boolean __readOnly = _READ_ONLY_EDEFAULT;

	protected static final String _POSEIDON_NAME_EDEFAULT = null;

	protected String __poseidonName = _POSEIDON_NAME_EDEFAULT;

	protected boolean __poseidonNameESet;

	protected static final boolean _POSEIDON_NAMESPACE_EDEFAULT = false;

	protected boolean __poseidonNamespace = _POSEIDON_NAMESPACE_EDEFAULT;

	protected EList<EObject> __ownedMember;

	protected EObject __source;

	protected EObject __target;
	
	protected static final boolean _POSEIDON_EDGE_EDEFAULT = false;

	protected boolean __poseidonEdge = _POSEIDON_EDGE_EDEFAULT;	
	
	protected static final String _POSEIDON_ROLE_EDEFAULT = null;

	protected String __poseidonRole = _POSEIDON_ROLE_EDEFAULT;


	protected WrappedActivationProfileImpl() {
		super();
        if (GlobalUUIDGenerator.GlOBAL_UUID_GENERATOR != null){
            __uuid = GlobalUUIDGenerator.GlOBAL_UUID_GENERATOR.generateUUID(this);
        }
        CrossReferenceAdapter.getInstance().adapt(this);
        eAdapters().add(GlobalNotifier.getSingleton());
	}

	@Override
	protected EClass eStaticClass() {
		return WrapperPackage.Literals.WRAPPED_ACTIVATIONPROFILE;
	}

	public String get__uuid() {
		return __uuid;
	}

	public void set__uuid(String new__uuid) {
		String old__uuid = __uuid;
		__uuid = new__uuid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WrapperPackage.WRAPPED_ACTIVATIONPROFILE__UUID, old__uuid, __uuid));
	}

	public int getJ_deleted() {
		return j_deleted;
	}

	public void setJ_deleted(int newJ_deleted) {
		int oldJ_deleted = j_deleted;
		j_deleted = newJ_deleted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WrapperPackage.WRAPPED_ACTIVATIONPROFILE__JDELETED, oldJ_deleted, j_deleted));
	}

	public J_DiagramHolder getJ_diagramHolder() {
		return j_diagramHolder;
	}

	public NotificationChain basicSetJ_diagramHolder(J_DiagramHolder newJ_diagramHolder, NotificationChain msgs) {
		J_DiagramHolder oldJ_diagramHolder = j_diagramHolder;
		j_diagramHolder = newJ_diagramHolder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WrapperPackage.WRAPPED_ACTIVATIONPROFILE__JDIAGRAM_HOLDER, oldJ_diagramHolder, newJ_diagramHolder);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	public void setJ_diagramHolder(J_DiagramHolder newJ_diagramHolder) {
		if (newJ_diagramHolder != j_diagramHolder) {
			NotificationChain msgs = null;
			if (j_diagramHolder != null)
				msgs = ((InternalEObject)j_diagramHolder).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WrapperPackage.WRAPPED_ACTIVATIONPROFILE__JDIAGRAM_HOLDER, null, msgs);
			if (newJ_diagramHolder != null)
				msgs = ((InternalEObject)newJ_diagramHolder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WrapperPackage.WRAPPED_ACTIVATIONPROFILE__JDIAGRAM_HOLDER, null, msgs);
			msgs = basicSetJ_diagramHolder(newJ_diagramHolder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WrapperPackage.WRAPPED_ACTIVATIONPROFILE__JDIAGRAM_HOLDER, newJ_diagramHolder, newJ_diagramHolder));
	}

	public boolean is__readOnly() {
		return __readOnly;
	}

	public void set__readOnly(boolean new__readOnly) {
		boolean old__readOnly = __readOnly;
		__readOnly = new__readOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WrapperPackage.WRAPPED_ACTIVATIONPROFILE__READ_ONLY, old__readOnly, __readOnly));
	}

	public String get__poseidonName() {
		return __poseidonName;
	}

	public void set__poseidonName(String new__poseidonName) {
		String old__poseidonName = __poseidonName;
		__poseidonName = new__poseidonName;
		boolean old__poseidonNameESet = __poseidonNameESet;
		__poseidonNameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WrapperPackage.WRAPPED_ACTIVATIONPROFILE__POSEIDON_NAME, old__poseidonName, __poseidonName, !old__poseidonNameESet));
	}

	public void unset__poseidonName() {
		String old__poseidonName = __poseidonName;
		boolean old__poseidonNameESet = __poseidonNameESet;
		__poseidonName = _POSEIDON_NAME_EDEFAULT;
		__poseidonNameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, WrapperPackage.WRAPPED_ACTIVATIONPROFILE__POSEIDON_NAME, old__poseidonName, _POSEIDON_NAME_EDEFAULT, old__poseidonNameESet));
	}

	public boolean isSet__poseidonName() {
		return __poseidonNameESet;
	}

	public boolean is__poseidonNamespace() {
		return __poseidonNamespace;
	}

	public void set__poseidonNamespace(boolean new__poseidonNamespace) {
		boolean old__poseidonNamespace = __poseidonNamespace;
		__poseidonNamespace = new__poseidonNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WrapperPackage.WRAPPED_ACTIVATIONPROFILE__POSEIDON_NAMESPACE, old__poseidonNamespace, __poseidonNamespace));
	}

	public EList<EObject> get__ownedMember() {
		if (__ownedMember == null) {
			__ownedMember = new EObjectContainmentEList<EObject>(EObject.class, this, WrapperPackage.WRAPPED_ACTIVATIONPROFILE__OWNED_MEMBER);
		}
		return __ownedMember;
	}	

	public EObject get__source() {
		if (__source != null && __source.eIsProxy()) {
			InternalEObject old__source = (InternalEObject)__source;
			__source = (EObject)eResolveProxy(old__source);
			if (__source != old__source) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WrapperPackage.WRAPPED_ACTIVATIONPROFILE__SOURCE, old__source, __source));
			}
		}
		return __source;
	}

	public EObject basicGet__source() {
		return __source;
	}

	public void set__source(EObject new__source) {
		EObject old__source = __source;
		__source = new__source;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WrapperPackage.WRAPPED_ACTIVATIONPROFILE__SOURCE, old__source, __source));
	}

	public EObject get__target() {
		if (__target != null && __target.eIsProxy()) {
			InternalEObject old__target = (InternalEObject)__target;
			__target = (EObject)eResolveProxy(old__target);
			if (__target != old__target) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WrapperPackage.WRAPPED_ACTIVATIONPROFILE__TARGET, old__target, __target));
			}
		}
		return __target;
	}

	public EObject basicGet__target() {
		return __target;
	}

	public void set__target(EObject new__target) {
		EObject old__target = __target;
		__target = new__target;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WrapperPackage.WRAPPED_ACTIVATIONPROFILE__TARGET, old__target, __target));
	}
	
	public boolean is__poseidonEdge() {
		return __poseidonEdge;
	}

	public void set__poseidonEdge(boolean new__poseidonEdge) {
		boolean old__poseidonEdge = __poseidonEdge;
		__poseidonEdge = new__poseidonEdge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WrapperPackage.WRAPPED_ACTIVATIONPROFILE__POSEIDON_EDGE, old__poseidonEdge, __poseidonEdge));
	}
	
	public String get__poseidonRole() {
		return __poseidonRole;
	}

	public void set__poseidonRole(String new__poseidonRole) {
		String old__poseidonRole = __poseidonRole;
		__poseidonRole = new__poseidonRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WrapperPackage.WRAPPED_ACTIVATIONPROFILE__POSEIDON_ROLE, old__poseidonRole, __poseidonRole));
	}	



	/**
	 * @generated not
	 */
	public EList<EObject> get__outgoingRelationships() {
		EList<EObject> outgoings = new UniqueEList.FastCompare<EObject>();

		for (EStructuralFeature.Setting setting : getNonNavigableInverseReferences(this)) {

			if (setting.getEStructuralFeature() == DSLPackage.Literals.METAMODEL_ELEMENT_WRAPPER__SOURCE) {
				outgoings.add(setting.getEObject());
			}
		}

		return outgoings;
	}

	/**
	 * @generated not
	 */	
	public EList<EObject> get__incomingRelationships() {
		EList<EObject> incomings = new UniqueEList.FastCompare<EObject>();

		for (EStructuralFeature.Setting setting : getNonNavigableInverseReferences(this)) {

			if (setting.getEStructuralFeature() == DSLPackage.Literals.METAMODEL_ELEMENT_WRAPPER__TARGET) {
				incomings.add(setting.getEObject());
			}
		}
		return incomings;
	}
	
	public Collection<EStructuralFeature.Setting> getNonNavigableInverseReferences(
			EObject eObject) {
		ECrossReferenceAdapter crossReferenceAdapter = ECrossReferenceAdapter
				.getCrossReferenceAdapter(eObject);
		return crossReferenceAdapter == null ? Collections.<EStructuralFeature.Setting> emptyList()
				: crossReferenceAdapter.getNonNavigableInverseReferences(eObject);
	}	

	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		if (featureID == WrapperPackage.WRAPPED_ACTIVATIONPROFILE__JDIAGRAM_HOLDER) {
			return basicSetJ_diagramHolder(null, msgs);
		}
		if (featureID == WrapperPackage.WRAPPED_ACTIVATIONPROFILE__OWNED_MEMBER) {
			return ((InternalEList<?>)get__ownedMember()).basicRemove(otherEnd, msgs);
		}	
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		if (featureID == WrapperPackage.WRAPPED_ACTIVATIONPROFILE__UUID) {
			return get__uuid();
		}	
		if (featureID == WrapperPackage.WRAPPED_ACTIVATIONPROFILE__JDELETED) {
			return getJ_deleted();
		}
		if (featureID == WrapperPackage.WRAPPED_ACTIVATIONPROFILE__JDIAGRAM_HOLDER) {
			return getJ_diagramHolder();
		}
		if (featureID == WrapperPackage.WRAPPED_ACTIVATIONPROFILE__READ_ONLY) {
			return is__readOnly();
		}	
		if (featureID == WrapperPackage.WRAPPED_ACTIVATIONPROFILE__POSEIDON_NAME) {
			return get__poseidonName();
		}
		if (featureID == WrapperPackage.WRAPPED_ACTIVATIONPROFILE__POSEIDON_NAMESPACE) {
			return is__poseidonNamespace();
		}
		if (featureID == WrapperPackage.WRAPPED_ACTIVATIONPROFILE__OWNED_MEMBER) {
			return get__ownedMember();
		}	
		if (featureID == WrapperPackage.WRAPPED_ACTIVATIONPROFILE__SOURCE) {
			if (resolve) return get__source();
			return basicGet__source();
		}	
		if (featureID == WrapperPackage.WRAPPED_ACTIVATIONPROFILE__TARGET) {
			if (resolve) return get__target();
			return basicGet__target();
		}
		if (featureID == WrapperPackage.WRAPPED_ACTIVATIONPROFILE__POSEIDON_EDGE) {
			return is__poseidonEdge();
		}
		if (featureID == WrapperPackage.WRAPPED_ACTIVATIONPROFILE__POSEIDON_ROLE) {					
			return get__poseidonRole();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	@Override
	public void eSet(int featureID, Object newValue) {
		if (featureID == WrapperPackage.WRAPPED_ACTIVATIONPROFILE__UUID) {
			set__uuid((String)newValue);
			return;
		}	
		if (featureID == WrapperPackage.WRAPPED_ACTIVATIONPROFILE__JDELETED) {
			setJ_deleted((Integer)newValue);
			return;
		}	
		if (featureID == WrapperPackage.WRAPPED_ACTIVATIONPROFILE__JDIAGRAM_HOLDER) {
			setJ_diagramHolder((J_DiagramHolder)newValue);
			return;
		}	
		if (featureID == WrapperPackage.WRAPPED_ACTIVATIONPROFILE__READ_ONLY) {
			set__readOnly((Boolean)newValue);
			return;
		}	
		if (featureID == WrapperPackage.WRAPPED_ACTIVATIONPROFILE__POSEIDON_NAME) {
			set__poseidonName((String)newValue);
			return;
		}	
		if (featureID == WrapperPackage.WRAPPED_ACTIVATIONPROFILE__POSEIDON_NAMESPACE) {
			set__poseidonNamespace((Boolean)newValue);
			return;
		}	
		if (featureID == WrapperPackage.WRAPPED_ACTIVATIONPROFILE__SOURCE) {
			set__source((MetamodelElementWrapper)newValue);
			return;
		}	
		if (featureID == WrapperPackage.WRAPPED_ACTIVATIONPROFILE__TARGET) {
			set__target((MetamodelElementWrapper)newValue);
			return;
		}
		if (featureID == WrapperPackage.WRAPPED_ACTIVATIONPROFILE__POSEIDON_EDGE) {
				set__poseidonEdge((Boolean)newValue);
				return;
		}		
		if (featureID == WrapperPackage.WRAPPED_ACTIVATIONPROFILE__POSEIDON_ROLE) {			
				set__poseidonRole((String)newValue);
				return;
		}
						
		super.eSet(featureID, newValue);
	}

	@Override
	public void eUnset(int featureID) {
		if (featureID == WrapperPackage.WRAPPED_ACTIVATIONPROFILE__UUID) {
			set__uuid(_UUID_EDEFAULT);
			return;
		}	
		if (featureID == WrapperPackage.WRAPPED_ACTIVATIONPROFILE__JDELETED) {
			setJ_deleted(JDELETED_EDEFAULT);
			return;
		}	
		if (featureID == WrapperPackage.WRAPPED_ACTIVATIONPROFILE__JDIAGRAM_HOLDER) {
			setJ_diagramHolder((J_DiagramHolder)null);
			return;
		}	
		if (featureID == WrapperPackage.WRAPPED_ACTIVATIONPROFILE__READ_ONLY) {
			set__readOnly(_READ_ONLY_EDEFAULT);
			return;
		}	
		if (featureID == WrapperPackage.WRAPPED_ACTIVATIONPROFILE__POSEIDON_NAME) {
			unset__poseidonName();
			return;
		}	
		if (featureID == WrapperPackage.WRAPPED_ACTIVATIONPROFILE__POSEIDON_NAMESPACE) {
			set__poseidonNamespace(_POSEIDON_NAMESPACE_EDEFAULT);
			return;
		}	
		if (featureID == WrapperPackage.WRAPPED_ACTIVATIONPROFILE__SOURCE) {
			set__source((MetamodelElementWrapper)null);
			return;
		}	
		if (featureID == WrapperPackage.WRAPPED_ACTIVATIONPROFILE__TARGET) {
			set__target((MetamodelElementWrapper)null);
			return;
		}
		if (featureID == WrapperPackage.WRAPPED_ACTIVATIONPROFILE__POSEIDON_EDGE) {
			set__poseidonEdge(_POSEIDON_EDGE_EDEFAULT);
			return;
		}
		if (featureID == WrapperPackage.WRAPPED_ACTIVATIONPROFILE__POSEIDON_ROLE) {			
				set__poseidonRole(_POSEIDON_ROLE_EDEFAULT);
				return;
		}
			
		super.eUnset(featureID);
	}

	@Override
	public boolean eIsSet(int featureID) {
		if (featureID == WrapperPackage.WRAPPED_ACTIVATIONPROFILE__UUID) {
			return _UUID_EDEFAULT == null ? __uuid != null : !_UUID_EDEFAULT.equals(__uuid);
		}
		if (featureID == WrapperPackage.WRAPPED_ACTIVATIONPROFILE__JDELETED) {
			return j_deleted != JDELETED_EDEFAULT;
		}	
		if (featureID == WrapperPackage.WRAPPED_ACTIVATIONPROFILE__JDIAGRAM_HOLDER) {
			return j_diagramHolder != null;
		}	
		if (featureID == WrapperPackage.WRAPPED_ACTIVATIONPROFILE__READ_ONLY) {
			return __readOnly != _READ_ONLY_EDEFAULT;
		}	
		if (featureID == WrapperPackage.WRAPPED_ACTIVATIONPROFILE__POSEIDON_NAME) {
			return isSet__poseidonName();
		}	
		if (featureID == WrapperPackage.WRAPPED_ACTIVATIONPROFILE__POSEIDON_NAMESPACE) {
			return __poseidonNamespace != _POSEIDON_NAMESPACE_EDEFAULT;
		}	
		if (featureID == WrapperPackage.WRAPPED_ACTIVATIONPROFILE__OWNED_MEMBER) {
			return __ownedMember != null && !__ownedMember.isEmpty();
		}	
		if (featureID == WrapperPackage.WRAPPED_ACTIVATIONPROFILE__SOURCE) {
			return __source != null;
		}	
		if (featureID == WrapperPackage.WRAPPED_ACTIVATIONPROFILE__TARGET) {
			return __target != null;
		}		
		if (featureID == WrapperPackage.WRAPPED_ACTIVATIONPROFILE__POSEIDON_EDGE) {
			return __poseidonEdge != _POSEIDON_EDGE_EDEFAULT;
		}		
		if (featureID == WrapperPackage.WRAPPED_ACTIVATIONPROFILE__POSEIDON_ROLE) {			
			return _POSEIDON_ROLE_EDEFAULT == null ? __poseidonRole != null : !_POSEIDON_ROLE_EDEFAULT.equals(__poseidonRole);		
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public boolean eIsSet(EStructuralFeature eFeature) {
		if (isFeatureOfWrappedElement(eFeature)){
			return eIsSet(eDerivedStructuralFeatureID(eFeature));
		}
		return super.eIsSet(eFeature);
	}
	
	@Override
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		if (isFeatureOfWrappedElement(eFeature)){
			return eGet(eDerivedStructuralFeatureID(eFeature), resolve, true);
		}
		return super.eGet(eFeature, resolve);
	}
	
	@Override
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		if (isFeatureOfWrappedElement(eFeature)){
			eSet(eDerivedStructuralFeatureID(eFeature), newValue);
			return;
		}
		super.eSet(eFeature, newValue);
	}
	
	@Override
	public void eUnset(EStructuralFeature eFeature) {
		if (isFeatureOfWrappedElement(eFeature)){
			eUnset(eDerivedStructuralFeatureID(eFeature));
			return;
		}
		super.eUnset(eFeature);
	}	
	
	private boolean isFeatureOfWrappedElement(EStructuralFeature eFeature){
		if (eFeature != null) {
			int eDerivedStructuralFeatureID = eDerivedStructuralFeatureID(eFeature);
			EList<EClass> eSuperTypes = eClass().getESuperTypes();
			if (eSuperTypes.size() == 2) {
				int featureCount = eSuperTypes.get(0).getFeatureCount();
				if (eDerivedStructuralFeatureID >= featureCount) {
					return true;
				}
			}
		}
		return false;
	}	

	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == MetamodelElementWrapper.class) {
			if (derivedFeatureID == WrapperPackage.WRAPPED_ACTIVATIONPROFILE__UUID) return DSLPackage.METAMODEL_ELEMENT_WRAPPER__UUID;
			if (derivedFeatureID == WrapperPackage.WRAPPED_ACTIVATIONPROFILE__JDELETED) return DSLPackage.METAMODEL_ELEMENT_WRAPPER__JDELETED;
			if (derivedFeatureID == WrapperPackage.WRAPPED_ACTIVATIONPROFILE__JDIAGRAM_HOLDER) return DSLPackage.METAMODEL_ELEMENT_WRAPPER__JDIAGRAM_HOLDER;
			if (derivedFeatureID == WrapperPackage.WRAPPED_ACTIVATIONPROFILE__READ_ONLY) return DSLPackage.METAMODEL_ELEMENT_WRAPPER__READ_ONLY;
			if (derivedFeatureID == WrapperPackage.WRAPPED_ACTIVATIONPROFILE__POSEIDON_NAME) return DSLPackage.METAMODEL_ELEMENT_WRAPPER__POSEIDON_NAME;
			if (derivedFeatureID == WrapperPackage.WRAPPED_ACTIVATIONPROFILE__POSEIDON_NAMESPACE) return DSLPackage.METAMODEL_ELEMENT_WRAPPER__POSEIDON_NAMESPACE;
			if (derivedFeatureID == WrapperPackage.WRAPPED_ACTIVATIONPROFILE__OWNED_MEMBER) return DSLPackage.METAMODEL_ELEMENT_WRAPPER__OWNED_MEMBER;
			if (derivedFeatureID == WrapperPackage.WRAPPED_ACTIVATIONPROFILE__SOURCE) return DSLPackage.METAMODEL_ELEMENT_WRAPPER__SOURCE;
			if (derivedFeatureID == WrapperPackage.WRAPPED_ACTIVATIONPROFILE__TARGET) return DSLPackage.METAMODEL_ELEMENT_WRAPPER__TARGET;
			if (derivedFeatureID == WrapperPackage.WRAPPED_ACTIVATIONPROFILE__POSEIDON_EDGE) return DSLPackage.METAMODEL_ELEMENT_WRAPPER__POSEIDON_EDGE;
			if (derivedFeatureID == WrapperPackage.WRAPPED_ACTIVATIONPROFILE__POSEIDON_ROLE) return DSLPackage.METAMODEL_ELEMENT_WRAPPER__POSEIDON_ROLE;			
			return -1;			
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == MetamodelElementWrapper.class) {
			switch (baseFeatureID) {
				case DSLPackage.METAMODEL_ELEMENT_WRAPPER__UUID: return WrapperPackage.WRAPPED_ACTIVATIONPROFILE__UUID;
				case DSLPackage.METAMODEL_ELEMENT_WRAPPER__JDELETED: return WrapperPackage.WRAPPED_ACTIVATIONPROFILE__JDELETED;
				case DSLPackage.METAMODEL_ELEMENT_WRAPPER__JDIAGRAM_HOLDER: return WrapperPackage.WRAPPED_ACTIVATIONPROFILE__JDIAGRAM_HOLDER;
				case DSLPackage.METAMODEL_ELEMENT_WRAPPER__READ_ONLY: return WrapperPackage.WRAPPED_ACTIVATIONPROFILE__READ_ONLY;
				case DSLPackage.METAMODEL_ELEMENT_WRAPPER__POSEIDON_NAME: return WrapperPackage.WRAPPED_ACTIVATIONPROFILE__POSEIDON_NAME;
				case DSLPackage.METAMODEL_ELEMENT_WRAPPER__POSEIDON_NAMESPACE: return WrapperPackage.WRAPPED_ACTIVATIONPROFILE__POSEIDON_NAMESPACE;
				case DSLPackage.METAMODEL_ELEMENT_WRAPPER__OWNED_MEMBER: return WrapperPackage.WRAPPED_ACTIVATIONPROFILE__OWNED_MEMBER;
				case DSLPackage.METAMODEL_ELEMENT_WRAPPER__SOURCE: return WrapperPackage.WRAPPED_ACTIVATIONPROFILE__SOURCE;
				case DSLPackage.METAMODEL_ELEMENT_WRAPPER__TARGET: return WrapperPackage.WRAPPED_ACTIVATIONPROFILE__TARGET;
				case DSLPackage.METAMODEL_ELEMENT_WRAPPER__POSEIDON_EDGE: return WrapperPackage.WRAPPED_ACTIVATIONPROFILE__POSEIDON_EDGE;
				case DSLPackage.METAMODEL_ELEMENT_WRAPPER__POSEIDON_ROLE: return WrapperPackage.WRAPPED_ACTIVATIONPROFILE__POSEIDON_ROLE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

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

}


