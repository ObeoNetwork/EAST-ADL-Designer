/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.requirements;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Quality Requirement Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage#getQualityRequirementKind()
 * @model
 * @generated
 */
public enum QualityRequirementKind implements Enumerator {
	/**
	 * The '<em><b>Performance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERFORMANCE_VALUE
	 * @generated
	 * @ordered
	 */
	PERFORMANCE(0, "Performance", "Performance"),

	/**
	 * The '<em><b>HMI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HMI_VALUE
	 * @generated
	 * @ordered
	 */
	HMI(1, "HMI", "HMI"),

	/**
	 * The '<em><b>Dependability</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPENDABILITY_VALUE
	 * @generated
	 * @ordered
	 */
	DEPENDABILITY(6, "Dependability", "Dependability"),

	/**
	 * The '<em><b>Configurability</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFIGURABILITY_VALUE
	 * @generated
	 * @ordered
	 */
	CONFIGURABILITY(2, "Configurability", "Configurability"),

	/**
	 * The '<em><b>Ergonomy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERGONOMY_VALUE
	 * @generated
	 * @ordered
	 */
	ERGONOMY(6, "Ergonomy", "Ergonomy"),

	/**
	 * The '<em><b>Safety</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAFETY_VALUE
	 * @generated
	 * @ordered
	 */
	SAFETY(3, "Safety", "Safety"),

	/**
	 * The '<em><b>Security</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECURITY_VALUE
	 * @generated
	 * @ordered
	 */
	SECURITY(4, "Security", "Security"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(5, "Other", "Other");

	/**
	 * The '<em><b>Performance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Performance</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PERFORMANCE
	 * @model name="Performance"
	 * @generated
	 * @ordered
	 */
	public static final int PERFORMANCE_VALUE = 0;

	/**
	 * The '<em><b>HMI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HMI</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HMI
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HMI_VALUE = 1;

	/**
	 * The '<em><b>Dependability</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dependability</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEPENDABILITY
	 * @model name="Dependability"
	 * @generated
	 * @ordered
	 */
	public static final int DEPENDABILITY_VALUE = 6;

	/**
	 * The '<em><b>Configurability</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Configurability</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONFIGURABILITY
	 * @model name="Configurability"
	 * @generated
	 * @ordered
	 */
	public static final int CONFIGURABILITY_VALUE = 2;

	/**
	 * The '<em><b>Ergonomy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ergonomy</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ERGONOMY
	 * @model name="Ergonomy"
	 * @generated
	 * @ordered
	 */
	public static final int ERGONOMY_VALUE = 6;

	/**
	 * The '<em><b>Safety</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Safety</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SAFETY
	 * @model name="Safety"
	 * @generated
	 * @ordered
	 */
	public static final int SAFETY_VALUE = 3;

	/**
	 * The '<em><b>Security</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Security</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SECURITY
	 * @model name="Security"
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_VALUE = 4;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Other</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model name="Other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 5;

	/**
	 * An array of all the '<em><b>Quality Requirement Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final QualityRequirementKind[] VALUES_ARRAY =
		new QualityRequirementKind[] {
			PERFORMANCE,
			HMI,
			DEPENDABILITY,
			CONFIGURABILITY,
			ERGONOMY,
			SAFETY,
			SECURITY,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Quality Requirement Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<QualityRequirementKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Quality Requirement Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QualityRequirementKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			QualityRequirementKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Quality Requirement Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QualityRequirementKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			QualityRequirementKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Quality Requirement Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QualityRequirementKind get(int value) {
		switch (value) {
			case PERFORMANCE_VALUE: return PERFORMANCE;
			case HMI_VALUE: return HMI;
			case DEPENDABILITY_VALUE: return DEPENDABILITY;
			case CONFIGURABILITY_VALUE: return CONFIGURABILITY;
			case SAFETY_VALUE: return SAFETY;
			case SECURITY_VALUE: return SECURITY;
			case OTHER_VALUE: return OTHER;
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
	private QualityRequirementKind(int value, String name, String literal) {
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
	
} //QualityRequirementKind
