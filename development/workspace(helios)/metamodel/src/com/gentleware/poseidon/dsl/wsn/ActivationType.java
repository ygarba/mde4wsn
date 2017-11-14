/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.gentleware.poseidon.dsl.wsn;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Activation Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.gentleware.poseidon.dsl.wsn.USERPackage#getActivationType()
 * @model
 * @generated
 */
public enum ActivationType implements Enumerator {
	/**
	 * The '<em><b>Dont Care</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DONT_CARE_VALUE
	 * @generated
	 * @ordered
	 */
	DONT_CARE(0, "dontCare", "dontCare"),

	/**
	 * The '<em><b>Enable On</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENABLE_ON_VALUE
	 * @generated
	 * @ordered
	 */
	ENABLE_ON(1, "enableOn", "enableOn"),

	/**
	 * The '<em><b>Disable On</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISABLE_ON_VALUE
	 * @generated
	 * @ordered
	 */
	DISABLE_ON(2, "disableOn", "disableOn");

	/**
	 * The '<em><b>Dont Care</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dont Care</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DONT_CARE
	 * @model name="dontCare"
	 * @generated
	 * @ordered
	 */
	public static final int DONT_CARE_VALUE = 0;

	/**
	 * The '<em><b>Enable On</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Enable On</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENABLE_ON
	 * @model name="enableOn"
	 * @generated
	 * @ordered
	 */
	public static final int ENABLE_ON_VALUE = 1;

	/**
	 * The '<em><b>Disable On</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Disable On</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISABLE_ON
	 * @model name="disableOn"
	 * @generated
	 * @ordered
	 */
	public static final int DISABLE_ON_VALUE = 2;

	/**
	 * An array of all the '<em><b>Activation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ActivationType[] VALUES_ARRAY =
		new ActivationType[] {
			DONT_CARE,
			ENABLE_ON,
			DISABLE_ON,
		};

	/**
	 * A public read-only list of all the '<em><b>Activation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ActivationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Activation Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActivationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActivationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Activation Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActivationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActivationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Activation Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActivationType get(int value) {
		switch (value) {
			case DONT_CARE_VALUE: return DONT_CARE;
			case ENABLE_ON_VALUE: return ENABLE_ON;
			case DISABLE_ON_VALUE: return DISABLE_ON;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ActivationType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ActivationType
