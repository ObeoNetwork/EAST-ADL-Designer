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
 * A representation of the literals of the enumeration '<em><b>ICU Measurement Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage#getICUMeasurementKind()
 * @model
 * @generated
 */
public enum ICUMeasurementKind implements Enumerator {
	/**
	 * The '<em><b>Signal Edge Detection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGNAL_EDGE_DETECTION_VALUE
	 * @generated
	 * @ordered
	 */
	SIGNAL_EDGE_DETECTION(0, "SignalEdgeDetection", "SignalEdgeDetection"),

	/**
	 * The '<em><b>Signal Measurement</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGNAL_MEASUREMENT_VALUE
	 * @generated
	 * @ordered
	 */
	SIGNAL_MEASUREMENT(1, "SignalMeasurement", "SignalMeasurement"),

	/**
	 * The '<em><b>Timestamp</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIMESTAMP_VALUE
	 * @generated
	 * @ordered
	 */
	TIMESTAMP(2, "Timestamp", "Timestamp"),

	/**
	 * The '<em><b>Edge Counter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDGE_COUNTER_VALUE
	 * @generated
	 * @ordered
	 */
	EDGE_COUNTER(3, "EdgeCounter", "EdgeCounter");

	/**
	 * The '<em><b>Signal Edge Detection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Signal Edge Detection</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SIGNAL_EDGE_DETECTION
	 * @model name="SignalEdgeDetection"
	 * @generated
	 * @ordered
	 */
	public static final int SIGNAL_EDGE_DETECTION_VALUE = 0;

	/**
	 * The '<em><b>Signal Measurement</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Signal Measurement</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SIGNAL_MEASUREMENT
	 * @model name="SignalMeasurement"
	 * @generated
	 * @ordered
	 */
	public static final int SIGNAL_MEASUREMENT_VALUE = 1;

	/**
	 * The '<em><b>Timestamp</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Timestamp</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIMESTAMP
	 * @model name="Timestamp"
	 * @generated
	 * @ordered
	 */
	public static final int TIMESTAMP_VALUE = 2;

	/**
	 * The '<em><b>Edge Counter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Edge Counter</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EDGE_COUNTER
	 * @model name="EdgeCounter"
	 * @generated
	 * @ordered
	 */
	public static final int EDGE_COUNTER_VALUE = 3;

	/**
	 * An array of all the '<em><b>ICU Measurement Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ICUMeasurementKind[] VALUES_ARRAY =
		new ICUMeasurementKind[] {
			SIGNAL_EDGE_DETECTION,
			SIGNAL_MEASUREMENT,
			TIMESTAMP,
			EDGE_COUNTER,
		};

	/**
	 * A public read-only list of all the '<em><b>ICU Measurement Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ICUMeasurementKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ICU Measurement Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ICUMeasurementKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ICUMeasurementKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ICU Measurement Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ICUMeasurementKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ICUMeasurementKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ICU Measurement Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ICUMeasurementKind get(int value) {
		switch (value) {
			case SIGNAL_EDGE_DETECTION_VALUE: return SIGNAL_EDGE_DETECTION;
			case SIGNAL_MEASUREMENT_VALUE: return SIGNAL_MEASUREMENT;
			case TIMESTAMP_VALUE: return TIMESTAMP;
			case EDGE_COUNTER_VALUE: return EDGE_COUNTER;
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
	private ICUMeasurementKind(int value, String name, String literal) {
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
	
} //ICUMeasurementKind
