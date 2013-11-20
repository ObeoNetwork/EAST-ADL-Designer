/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.hardware_architecture;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Channel Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * This enumeration is used to list different sort of channels.
 * <!-- end-model-doc -->
 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage#getChannelKind()
 * @model
 * @generated
 */
public enum ChannelKind implements Enumerator {
	/**
	 * The '<em><b>MOST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOST_VALUE
	 * @generated
	 * @ordered
	 */
	MOST(0, "MOST", "MOST"),

	/**
	 * The '<em><b>CAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAN_VALUE
	 * @generated
	 * @ordered
	 */
	CAN(1, "CAN", "CAN"),

	/**
	 * The '<em><b>Flex Ray</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLEX_RAY_VALUE
	 * @generated
	 * @ordered
	 */
	FLEX_RAY(2, "FlexRay", "FlexRay"),

	/**
	 * The '<em><b>TTP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TTP_VALUE
	 * @generated
	 * @ordered
	 */
	TTP(3, "TTP", "TTP"),

	/**
	 * The '<em><b>LIN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIN_VALUE
	 * @generated
	 * @ordered
	 */
	LIN(4, "LIN", "LIN"),

	/**
	 * The '<em><b>Electrical</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELECTRICAL_VALUE
	 * @generated
	 * @ordered
	 */
	ELECTRICAL(0, "Electrical", "Electrical");

	/**
	 * The '<em><b>MOST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MOST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MOST_VALUE = 0;

	/**
	 * The '<em><b>CAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CAN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CAN_VALUE = 1;

	/**
	 * The '<em><b>Flex Ray</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Flex Ray</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLEX_RAY
	 * @model name="FlexRay"
	 * @generated
	 * @ordered
	 */
	public static final int FLEX_RAY_VALUE = 2;

	/**
	 * The '<em><b>TTP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TTP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TTP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TTP_VALUE = 3;

	/**
	 * The '<em><b>LIN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LIN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LIN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LIN_VALUE = 4;

	/**
	 * The '<em><b>Electrical</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Electrical</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ELECTRICAL
	 * @model name="Electrical"
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRICAL_VALUE = 0;

	/**
	 * An array of all the '<em><b>Channel Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ChannelKind[] VALUES_ARRAY =
		new ChannelKind[] {
			MOST,
			CAN,
			FLEX_RAY,
			TTP,
			LIN,
			ELECTRICAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Channel Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ChannelKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Channel Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ChannelKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ChannelKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Channel Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ChannelKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ChannelKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Channel Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ChannelKind get(int value) {
		switch (value) {
			case MOST_VALUE: return MOST;
			case CAN_VALUE: return CAN;
			case FLEX_RAY_VALUE: return FLEX_RAY;
			case TTP_VALUE: return TTP;
			case LIN_VALUE: return LIN;
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
	private ChannelKind(int value, String name, String literal) {
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
	
} //ChannelKind
