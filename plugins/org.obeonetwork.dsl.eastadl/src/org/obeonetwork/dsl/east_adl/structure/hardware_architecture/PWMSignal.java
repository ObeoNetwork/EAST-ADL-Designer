/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.hardware_architecture;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PWM Signal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is a special form of an electrical signal. The pin is supposed to transmit a value by changing the voltage over time.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.PWMSignal#getMinimumFrequency <em>Minimum Frequency</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.PWMSignal#getMaximumFrequency <em>Maximum Frequency</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.PWMSignal#getMinimumWidth <em>Minimum Width</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.PWMSignal#getMaximumWidth <em>Maximum Width</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage#getPWMSignal()
 * @model
 * @generated
 */
public interface PWMSignal extends ElectricalSignal {
	/**
	 * Returns the value of the '<em><b>Minimum Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the reciprocal of the maximum period length in seconds.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Minimum Frequency</em>' attribute.
	 * @see #setMinimumFrequency(double)
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage#getPWMSignal_MinimumFrequency()
	 * @model
	 * @generated
	 */
	double getMinimumFrequency();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.PWMSignal#getMinimumFrequency <em>Minimum Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Frequency</em>' attribute.
	 * @see #getMinimumFrequency()
	 * @generated
	 */
	void setMinimumFrequency(double value);

	/**
	 * Returns the value of the '<em><b>Maximum Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the reciprocal of the minimum period length in seconds.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Frequency</em>' attribute.
	 * @see #setMaximumFrequency(double)
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage#getPWMSignal_MaximumFrequency()
	 * @model
	 * @generated
	 */
	double getMaximumFrequency();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.PWMSignal#getMaximumFrequency <em>Maximum Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Frequency</em>' attribute.
	 * @see #getMaximumFrequency()
	 * @generated
	 */
	void setMaximumFrequency(double value);

	/**
	 * Returns the value of the '<em><b>Minimum Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the minimum width of a bit in percent of the period length.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Minimum Width</em>' attribute.
	 * @see #setMinimumWidth(double)
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage#getPWMSignal_MinimumWidth()
	 * @model
	 * @generated
	 */
	double getMinimumWidth();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.PWMSignal#getMinimumWidth <em>Minimum Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Width</em>' attribute.
	 * @see #getMinimumWidth()
	 * @generated
	 */
	void setMinimumWidth(double value);

	/**
	 * Returns the value of the '<em><b>Maximum Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the maximum width of a bit in percent of the period length.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Width</em>' attribute.
	 * @see #setMaximumWidth(double)
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage#getPWMSignal_MaximumWidth()
	 * @model
	 * @generated
	 */
	double getMaximumWidth();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.PWMSignal#getMaximumWidth <em>Maximum Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Width</em>' attribute.
	 * @see #getMaximumWidth()
	 * @generated
	 */
	void setMaximumWidth(double value);

} // PWMSignal
