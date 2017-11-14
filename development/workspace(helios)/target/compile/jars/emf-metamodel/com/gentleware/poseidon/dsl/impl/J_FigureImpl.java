/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.gentleware.poseidon.dsl.impl;

import com.gentleware.poseidon.dsl.DSLPackage;
import com.gentleware.poseidon.dsl.J_Figure;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JFigure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.gentleware.poseidon.dsl.impl.J_FigureImpl#getId <em>Id</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.impl.J_FigureImpl#getRecreator <em>Recreator</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.impl.J_FigureImpl#getAnchor1Id <em>Anchor1 Id</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.impl.J_FigureImpl#getAnchor2Id <em>Anchor2 Id</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.impl.J_FigureImpl#getContainedName <em>Contained Name</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.impl.J_FigureImpl#getText <em>Text</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.impl.J_FigureImpl#getVirtualPoint <em>Virtual Point</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.impl.J_FigureImpl#getPoints <em>Points</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.impl.J_FigureImpl#getBrOffset <em>Br Offset</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.impl.J_FigureImpl#getTlOffset <em>Tl Offset</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.impl.J_FigureImpl#getShow <em>Show</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.impl.J_FigureImpl#getAutosized <em>Autosized</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.impl.J_FigureImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.impl.J_FigureImpl#getPoint <em>Point</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.impl.J_FigureImpl#getDimensions <em>Dimensions</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.impl.J_FigureImpl#getSuppressAttributes <em>Suppress Attributes</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.impl.J_FigureImpl#getSuppressOperations <em>Suppress Operations</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.impl.J_FigureImpl#getSuppressContents <em>Suppress Contents</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.impl.J_FigureImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.impl.J_FigureImpl#getMin <em>Min</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.impl.J_FigureImpl#getAccessibility <em>Accessibility</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.impl.J_FigureImpl#getClassifierScope <em>Classifier Scope</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.impl.J_FigureImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.gentleware.poseidon.dsl.impl.J_FigureImpl#getSubject <em>Subject</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class J_FigureImpl extends J_FigureContainerImpl implements J_Figure {
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
	 * The default value of the '{@link #getRecreator() <em>Recreator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecreator()
	 * @generated
	 * @ordered
	 */
	protected static final String RECREATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecreator() <em>Recreator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecreator()
	 * @generated
	 * @ordered
	 */
	protected String recreator = RECREATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getAnchor1Id() <em>Anchor1 Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnchor1Id()
	 * @generated
	 * @ordered
	 */
	protected static final String ANCHOR1_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnchor1Id() <em>Anchor1 Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnchor1Id()
	 * @generated
	 * @ordered
	 */
	protected String anchor1Id = ANCHOR1_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAnchor2Id() <em>Anchor2 Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnchor2Id()
	 * @generated
	 * @ordered
	 */
	protected static final String ANCHOR2_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnchor2Id() <em>Anchor2 Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnchor2Id()
	 * @generated
	 * @ordered
	 */
	protected String anchor2Id = ANCHOR2_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getContainedName() <em>Contained Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedName()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTAINED_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContainedName() <em>Contained Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedName()
	 * @generated
	 * @ordered
	 */
	protected String containedName = CONTAINED_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getVirtualPoint() <em>Virtual Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualPoint()
	 * @generated
	 * @ordered
	 */
	protected static final String VIRTUAL_POINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVirtualPoint() <em>Virtual Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualPoint()
	 * @generated
	 * @ordered
	 */
	protected String virtualPoint = VIRTUAL_POINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPoints() <em>Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoints()
	 * @generated
	 * @ordered
	 */
	protected static final String POINTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPoints() <em>Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoints()
	 * @generated
	 * @ordered
	 */
	protected String points = POINTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getBrOffset() <em>Br Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrOffset()
	 * @generated
	 * @ordered
	 */
	protected static final String BR_OFFSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBrOffset() <em>Br Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrOffset()
	 * @generated
	 * @ordered
	 */
	protected String brOffset = BR_OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getTlOffset() <em>Tl Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTlOffset()
	 * @generated
	 * @ordered
	 */
	protected static final String TL_OFFSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTlOffset() <em>Tl Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTlOffset()
	 * @generated
	 * @ordered
	 */
	protected String tlOffset = TL_OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getShow() <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShow()
	 * @generated
	 * @ordered
	 */
	protected static final String SHOW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShow() <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShow()
	 * @generated
	 * @ordered
	 */
	protected String show = SHOW_EDEFAULT;

	/**
	 * The default value of the '{@link #getAutosized() <em>Autosized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutosized()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTOSIZED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutosized() <em>Autosized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutosized()
	 * @generated
	 * @ordered
	 */
	protected String autosized = AUTOSIZED_EDEFAULT;

	/**
	 * The default value of the '{@link #getIcon() <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected static final String ICON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIcon() <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected String icon = ICON_EDEFAULT;

	/**
	 * The default value of the '{@link #getPoint() <em>Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoint()
	 * @generated
	 * @ordered
	 */
	protected static final String POINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPoint() <em>Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoint()
	 * @generated
	 * @ordered
	 */
	protected String point = POINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDimensions() <em>Dimensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensions()
	 * @generated
	 * @ordered
	 */
	protected static final String DIMENSIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDimensions() <em>Dimensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensions()
	 * @generated
	 * @ordered
	 */
	protected String dimensions = DIMENSIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSuppressAttributes() <em>Suppress Attributes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuppressAttributes()
	 * @generated
	 * @ordered
	 */
	protected static final String SUPPRESS_ATTRIBUTES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSuppressAttributes() <em>Suppress Attributes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuppressAttributes()
	 * @generated
	 * @ordered
	 */
	protected String suppressAttributes = SUPPRESS_ATTRIBUTES_EDEFAULT;

	/**
	 * The default value of the '{@link #getSuppressOperations() <em>Suppress Operations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuppressOperations()
	 * @generated
	 * @ordered
	 */
	protected static final String SUPPRESS_OPERATIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSuppressOperations() <em>Suppress Operations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuppressOperations()
	 * @generated
	 * @ordered
	 */
	protected String suppressOperations = SUPPRESS_OPERATIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSuppressContents() <em>Suppress Contents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuppressContents()
	 * @generated
	 * @ordered
	 */
	protected static final String SUPPRESS_CONTENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSuppressContents() <em>Suppress Contents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuppressContents()
	 * @generated
	 * @ordered
	 */
	protected String suppressContents = SUPPRESS_CONTENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected static final String OFFSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected String offset = OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected static final String MIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected String min = MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccessibility() <em>Accessibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessibility()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESSIBILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessibility() <em>Accessibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessibility()
	 * @generated
	 * @ordered
	 */
	protected String accessibility = ACCESSIBILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getClassifierScope() <em>Classifier Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifierScope()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASSIFIER_SCOPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassifierScope() <em>Classifier Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifierScope()
	 * @generated
	 * @ordered
	 */
	protected String classifierScope = CLASSIFIER_SCOPE_EDEFAULT;

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
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected EObject subject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected J_FigureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DSLPackage.Literals.JFIGURE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.JFIGURE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRecreator() {
		return recreator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecreator(String newRecreator) {
		String oldRecreator = recreator;
		recreator = newRecreator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.JFIGURE__RECREATOR, oldRecreator, recreator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAnchor1Id() {
		return anchor1Id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnchor1Id(String newAnchor1Id) {
		String oldAnchor1Id = anchor1Id;
		anchor1Id = newAnchor1Id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.JFIGURE__ANCHOR1_ID, oldAnchor1Id, anchor1Id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAnchor2Id() {
		return anchor2Id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnchor2Id(String newAnchor2Id) {
		String oldAnchor2Id = anchor2Id;
		anchor2Id = newAnchor2Id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.JFIGURE__ANCHOR2_ID, oldAnchor2Id, anchor2Id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContainedName() {
		return containedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainedName(String newContainedName) {
		String oldContainedName = containedName;
		containedName = newContainedName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.JFIGURE__CONTAINED_NAME, oldContainedName, containedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.JFIGURE__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVirtualPoint() {
		return virtualPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVirtualPoint(String newVirtualPoint) {
		String oldVirtualPoint = virtualPoint;
		virtualPoint = newVirtualPoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.JFIGURE__VIRTUAL_POINT, oldVirtualPoint, virtualPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPoints() {
		return points;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoints(String newPoints) {
		String oldPoints = points;
		points = newPoints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.JFIGURE__POINTS, oldPoints, points));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBrOffset() {
		return brOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBrOffset(String newBrOffset) {
		String oldBrOffset = brOffset;
		brOffset = newBrOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.JFIGURE__BR_OFFSET, oldBrOffset, brOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTlOffset() {
		return tlOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTlOffset(String newTlOffset) {
		String oldTlOffset = tlOffset;
		tlOffset = newTlOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.JFIGURE__TL_OFFSET, oldTlOffset, tlOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShow() {
		return show;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShow(String newShow) {
		String oldShow = show;
		show = newShow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.JFIGURE__SHOW, oldShow, show));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAutosized() {
		return autosized;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutosized(String newAutosized) {
		String oldAutosized = autosized;
		autosized = newAutosized;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.JFIGURE__AUTOSIZED, oldAutosized, autosized));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIcon() {
		return icon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIcon(String newIcon) {
		String oldIcon = icon;
		icon = newIcon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.JFIGURE__ICON, oldIcon, icon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPoint() {
		return point;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoint(String newPoint) {
		String oldPoint = point;
		point = newPoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.JFIGURE__POINT, oldPoint, point));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDimensions() {
		return dimensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDimensions(String newDimensions) {
		String oldDimensions = dimensions;
		dimensions = newDimensions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.JFIGURE__DIMENSIONS, oldDimensions, dimensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSuppressAttributes() {
		return suppressAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuppressAttributes(String newSuppressAttributes) {
		String oldSuppressAttributes = suppressAttributes;
		suppressAttributes = newSuppressAttributes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.JFIGURE__SUPPRESS_ATTRIBUTES, oldSuppressAttributes, suppressAttributes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSuppressOperations() {
		return suppressOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuppressOperations(String newSuppressOperations) {
		String oldSuppressOperations = suppressOperations;
		suppressOperations = newSuppressOperations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.JFIGURE__SUPPRESS_OPERATIONS, oldSuppressOperations, suppressOperations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSuppressContents() {
		return suppressContents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuppressContents(String newSuppressContents) {
		String oldSuppressContents = suppressContents;
		suppressContents = newSuppressContents;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.JFIGURE__SUPPRESS_CONTENTS, oldSuppressContents, suppressContents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOffset() {
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffset(String newOffset) {
		String oldOffset = offset;
		offset = newOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.JFIGURE__OFFSET, oldOffset, offset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMin() {
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin(String newMin) {
		String oldMin = min;
		min = newMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.JFIGURE__MIN, oldMin, min));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccessibility() {
		return accessibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessibility(String newAccessibility) {
		String oldAccessibility = accessibility;
		accessibility = newAccessibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.JFIGURE__ACCESSIBILITY, oldAccessibility, accessibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassifierScope() {
		return classifierScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassifierScope(String newClassifierScope) {
		String oldClassifierScope = classifierScope;
		classifierScope = newClassifierScope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.JFIGURE__CLASSIFIER_SCOPE, oldClassifierScope, classifierScope));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.JFIGURE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getSubject() {
		if (subject != null && subject.eIsProxy()) {
			InternalEObject oldSubject = (InternalEObject)subject;
			subject = eResolveProxy(oldSubject);
			if (subject != oldSubject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DSLPackage.JFIGURE__SUBJECT, oldSubject, subject));
			}
		}
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubject(EObject newSubject) {
		EObject oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.JFIGURE__SUBJECT, oldSubject, subject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DSLPackage.JFIGURE__ID:
				return getId();
			case DSLPackage.JFIGURE__RECREATOR:
				return getRecreator();
			case DSLPackage.JFIGURE__ANCHOR1_ID:
				return getAnchor1Id();
			case DSLPackage.JFIGURE__ANCHOR2_ID:
				return getAnchor2Id();
			case DSLPackage.JFIGURE__CONTAINED_NAME:
				return getContainedName();
			case DSLPackage.JFIGURE__TEXT:
				return getText();
			case DSLPackage.JFIGURE__VIRTUAL_POINT:
				return getVirtualPoint();
			case DSLPackage.JFIGURE__POINTS:
				return getPoints();
			case DSLPackage.JFIGURE__BR_OFFSET:
				return getBrOffset();
			case DSLPackage.JFIGURE__TL_OFFSET:
				return getTlOffset();
			case DSLPackage.JFIGURE__SHOW:
				return getShow();
			case DSLPackage.JFIGURE__AUTOSIZED:
				return getAutosized();
			case DSLPackage.JFIGURE__ICON:
				return getIcon();
			case DSLPackage.JFIGURE__POINT:
				return getPoint();
			case DSLPackage.JFIGURE__DIMENSIONS:
				return getDimensions();
			case DSLPackage.JFIGURE__SUPPRESS_ATTRIBUTES:
				return getSuppressAttributes();
			case DSLPackage.JFIGURE__SUPPRESS_OPERATIONS:
				return getSuppressOperations();
			case DSLPackage.JFIGURE__SUPPRESS_CONTENTS:
				return getSuppressContents();
			case DSLPackage.JFIGURE__OFFSET:
				return getOffset();
			case DSLPackage.JFIGURE__MIN:
				return getMin();
			case DSLPackage.JFIGURE__ACCESSIBILITY:
				return getAccessibility();
			case DSLPackage.JFIGURE__CLASSIFIER_SCOPE:
				return getClassifierScope();
			case DSLPackage.JFIGURE__TYPE:
				return getType();
			case DSLPackage.JFIGURE__SUBJECT:
				if (resolve) return getSubject();
				return basicGetSubject();
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
			case DSLPackage.JFIGURE__ID:
				setId((String)newValue);
				return;
			case DSLPackage.JFIGURE__RECREATOR:
				setRecreator((String)newValue);
				return;
			case DSLPackage.JFIGURE__ANCHOR1_ID:
				setAnchor1Id((String)newValue);
				return;
			case DSLPackage.JFIGURE__ANCHOR2_ID:
				setAnchor2Id((String)newValue);
				return;
			case DSLPackage.JFIGURE__CONTAINED_NAME:
				setContainedName((String)newValue);
				return;
			case DSLPackage.JFIGURE__TEXT:
				setText((String)newValue);
				return;
			case DSLPackage.JFIGURE__VIRTUAL_POINT:
				setVirtualPoint((String)newValue);
				return;
			case DSLPackage.JFIGURE__POINTS:
				setPoints((String)newValue);
				return;
			case DSLPackage.JFIGURE__BR_OFFSET:
				setBrOffset((String)newValue);
				return;
			case DSLPackage.JFIGURE__TL_OFFSET:
				setTlOffset((String)newValue);
				return;
			case DSLPackage.JFIGURE__SHOW:
				setShow((String)newValue);
				return;
			case DSLPackage.JFIGURE__AUTOSIZED:
				setAutosized((String)newValue);
				return;
			case DSLPackage.JFIGURE__ICON:
				setIcon((String)newValue);
				return;
			case DSLPackage.JFIGURE__POINT:
				setPoint((String)newValue);
				return;
			case DSLPackage.JFIGURE__DIMENSIONS:
				setDimensions((String)newValue);
				return;
			case DSLPackage.JFIGURE__SUPPRESS_ATTRIBUTES:
				setSuppressAttributes((String)newValue);
				return;
			case DSLPackage.JFIGURE__SUPPRESS_OPERATIONS:
				setSuppressOperations((String)newValue);
				return;
			case DSLPackage.JFIGURE__SUPPRESS_CONTENTS:
				setSuppressContents((String)newValue);
				return;
			case DSLPackage.JFIGURE__OFFSET:
				setOffset((String)newValue);
				return;
			case DSLPackage.JFIGURE__MIN:
				setMin((String)newValue);
				return;
			case DSLPackage.JFIGURE__ACCESSIBILITY:
				setAccessibility((String)newValue);
				return;
			case DSLPackage.JFIGURE__CLASSIFIER_SCOPE:
				setClassifierScope((String)newValue);
				return;
			case DSLPackage.JFIGURE__TYPE:
				setType((String)newValue);
				return;
			case DSLPackage.JFIGURE__SUBJECT:
				setSubject((EObject)newValue);
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
			case DSLPackage.JFIGURE__ID:
				setId(ID_EDEFAULT);
				return;
			case DSLPackage.JFIGURE__RECREATOR:
				setRecreator(RECREATOR_EDEFAULT);
				return;
			case DSLPackage.JFIGURE__ANCHOR1_ID:
				setAnchor1Id(ANCHOR1_ID_EDEFAULT);
				return;
			case DSLPackage.JFIGURE__ANCHOR2_ID:
				setAnchor2Id(ANCHOR2_ID_EDEFAULT);
				return;
			case DSLPackage.JFIGURE__CONTAINED_NAME:
				setContainedName(CONTAINED_NAME_EDEFAULT);
				return;
			case DSLPackage.JFIGURE__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case DSLPackage.JFIGURE__VIRTUAL_POINT:
				setVirtualPoint(VIRTUAL_POINT_EDEFAULT);
				return;
			case DSLPackage.JFIGURE__POINTS:
				setPoints(POINTS_EDEFAULT);
				return;
			case DSLPackage.JFIGURE__BR_OFFSET:
				setBrOffset(BR_OFFSET_EDEFAULT);
				return;
			case DSLPackage.JFIGURE__TL_OFFSET:
				setTlOffset(TL_OFFSET_EDEFAULT);
				return;
			case DSLPackage.JFIGURE__SHOW:
				setShow(SHOW_EDEFAULT);
				return;
			case DSLPackage.JFIGURE__AUTOSIZED:
				setAutosized(AUTOSIZED_EDEFAULT);
				return;
			case DSLPackage.JFIGURE__ICON:
				setIcon(ICON_EDEFAULT);
				return;
			case DSLPackage.JFIGURE__POINT:
				setPoint(POINT_EDEFAULT);
				return;
			case DSLPackage.JFIGURE__DIMENSIONS:
				setDimensions(DIMENSIONS_EDEFAULT);
				return;
			case DSLPackage.JFIGURE__SUPPRESS_ATTRIBUTES:
				setSuppressAttributes(SUPPRESS_ATTRIBUTES_EDEFAULT);
				return;
			case DSLPackage.JFIGURE__SUPPRESS_OPERATIONS:
				setSuppressOperations(SUPPRESS_OPERATIONS_EDEFAULT);
				return;
			case DSLPackage.JFIGURE__SUPPRESS_CONTENTS:
				setSuppressContents(SUPPRESS_CONTENTS_EDEFAULT);
				return;
			case DSLPackage.JFIGURE__OFFSET:
				setOffset(OFFSET_EDEFAULT);
				return;
			case DSLPackage.JFIGURE__MIN:
				setMin(MIN_EDEFAULT);
				return;
			case DSLPackage.JFIGURE__ACCESSIBILITY:
				setAccessibility(ACCESSIBILITY_EDEFAULT);
				return;
			case DSLPackage.JFIGURE__CLASSIFIER_SCOPE:
				setClassifierScope(CLASSIFIER_SCOPE_EDEFAULT);
				return;
			case DSLPackage.JFIGURE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case DSLPackage.JFIGURE__SUBJECT:
				setSubject((EObject)null);
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
			case DSLPackage.JFIGURE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case DSLPackage.JFIGURE__RECREATOR:
				return RECREATOR_EDEFAULT == null ? recreator != null : !RECREATOR_EDEFAULT.equals(recreator);
			case DSLPackage.JFIGURE__ANCHOR1_ID:
				return ANCHOR1_ID_EDEFAULT == null ? anchor1Id != null : !ANCHOR1_ID_EDEFAULT.equals(anchor1Id);
			case DSLPackage.JFIGURE__ANCHOR2_ID:
				return ANCHOR2_ID_EDEFAULT == null ? anchor2Id != null : !ANCHOR2_ID_EDEFAULT.equals(anchor2Id);
			case DSLPackage.JFIGURE__CONTAINED_NAME:
				return CONTAINED_NAME_EDEFAULT == null ? containedName != null : !CONTAINED_NAME_EDEFAULT.equals(containedName);
			case DSLPackage.JFIGURE__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case DSLPackage.JFIGURE__VIRTUAL_POINT:
				return VIRTUAL_POINT_EDEFAULT == null ? virtualPoint != null : !VIRTUAL_POINT_EDEFAULT.equals(virtualPoint);
			case DSLPackage.JFIGURE__POINTS:
				return POINTS_EDEFAULT == null ? points != null : !POINTS_EDEFAULT.equals(points);
			case DSLPackage.JFIGURE__BR_OFFSET:
				return BR_OFFSET_EDEFAULT == null ? brOffset != null : !BR_OFFSET_EDEFAULT.equals(brOffset);
			case DSLPackage.JFIGURE__TL_OFFSET:
				return TL_OFFSET_EDEFAULT == null ? tlOffset != null : !TL_OFFSET_EDEFAULT.equals(tlOffset);
			case DSLPackage.JFIGURE__SHOW:
				return SHOW_EDEFAULT == null ? show != null : !SHOW_EDEFAULT.equals(show);
			case DSLPackage.JFIGURE__AUTOSIZED:
				return AUTOSIZED_EDEFAULT == null ? autosized != null : !AUTOSIZED_EDEFAULT.equals(autosized);
			case DSLPackage.JFIGURE__ICON:
				return ICON_EDEFAULT == null ? icon != null : !ICON_EDEFAULT.equals(icon);
			case DSLPackage.JFIGURE__POINT:
				return POINT_EDEFAULT == null ? point != null : !POINT_EDEFAULT.equals(point);
			case DSLPackage.JFIGURE__DIMENSIONS:
				return DIMENSIONS_EDEFAULT == null ? dimensions != null : !DIMENSIONS_EDEFAULT.equals(dimensions);
			case DSLPackage.JFIGURE__SUPPRESS_ATTRIBUTES:
				return SUPPRESS_ATTRIBUTES_EDEFAULT == null ? suppressAttributes != null : !SUPPRESS_ATTRIBUTES_EDEFAULT.equals(suppressAttributes);
			case DSLPackage.JFIGURE__SUPPRESS_OPERATIONS:
				return SUPPRESS_OPERATIONS_EDEFAULT == null ? suppressOperations != null : !SUPPRESS_OPERATIONS_EDEFAULT.equals(suppressOperations);
			case DSLPackage.JFIGURE__SUPPRESS_CONTENTS:
				return SUPPRESS_CONTENTS_EDEFAULT == null ? suppressContents != null : !SUPPRESS_CONTENTS_EDEFAULT.equals(suppressContents);
			case DSLPackage.JFIGURE__OFFSET:
				return OFFSET_EDEFAULT == null ? offset != null : !OFFSET_EDEFAULT.equals(offset);
			case DSLPackage.JFIGURE__MIN:
				return MIN_EDEFAULT == null ? min != null : !MIN_EDEFAULT.equals(min);
			case DSLPackage.JFIGURE__ACCESSIBILITY:
				return ACCESSIBILITY_EDEFAULT == null ? accessibility != null : !ACCESSIBILITY_EDEFAULT.equals(accessibility);
			case DSLPackage.JFIGURE__CLASSIFIER_SCOPE:
				return CLASSIFIER_SCOPE_EDEFAULT == null ? classifierScope != null : !CLASSIFIER_SCOPE_EDEFAULT.equals(classifierScope);
			case DSLPackage.JFIGURE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case DSLPackage.JFIGURE__SUBJECT:
				return subject != null;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", recreator: ");
		result.append(recreator);
		result.append(", anchor1Id: ");
		result.append(anchor1Id);
		result.append(", anchor2Id: ");
		result.append(anchor2Id);
		result.append(", containedName: ");
		result.append(containedName);
		result.append(", text: ");
		result.append(text);
		result.append(", virtualPoint: ");
		result.append(virtualPoint);
		result.append(", points: ");
		result.append(points);
		result.append(", brOffset: ");
		result.append(brOffset);
		result.append(", tlOffset: ");
		result.append(tlOffset);
		result.append(", show: ");
		result.append(show);
		result.append(", autosized: ");
		result.append(autosized);
		result.append(", icon: ");
		result.append(icon);
		result.append(", point: ");
		result.append(point);
		result.append(", dimensions: ");
		result.append(dimensions);
		result.append(", suppressAttributes: ");
		result.append(suppressAttributes);
		result.append(", suppressOperations: ");
		result.append(suppressOperations);
		result.append(", suppressContents: ");
		result.append(suppressContents);
		result.append(", offset: ");
		result.append(offset);
		result.append(", min: ");
		result.append(min);
		result.append(", accessibility: ");
		result.append(accessibility);
		result.append(", classifierScope: ");
		result.append(classifierScope);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //J_FigureImpl
