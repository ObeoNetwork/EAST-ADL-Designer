/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.hardware_architecture;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Digital Signal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is the analogic specialization of the electrical signal.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.DigitalSignal#getMinimumMaximumVoltage <em>Minimum Maximum Voltage</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.DigitalSignal#getMaximumMinimumVoltage <em>Maximum Minimum Voltage</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage#getDigitalSignal()
 * @model
 * @generated
 */
public interface DigitalSignal extends ElectricalSignal {
	/**
	 * Returns the value of the '<em><b>Minimum Maximum Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the minimum voltage that may represent a logical value of 1.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Minimum Maximum Voltage</em>' attribute.
	 * @see #setMinimumMaximumVoltage(double)
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage#getDigitalSignal_MinimumMaximumVoltage()
	 * @model
	 * @generated
	 */
	double getMinimumMaximumVoltage();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.DigitalSignal#getMinimumMaximumVoltage <em>Minimum Maximum Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Maximum Voltage</em>' attribute.
	 * @see #getMinimumMaximumVoltage()
	 * @generated
	 */
	void setMinimumMaximumVoltage(double value);

	/**
	 * Returns the value of the '<em><b>Maximum Minimum Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the maximum voltage that may represent a logical value of 0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Minimum Voltage</em>' attribute.
	 * @see #setMaximumMinimumVoltage(double)
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage#getDigitalSignal_MaximumMinimumVoltage()
	 * @model
	 * @generated
	 */
	double getMaximumMinimumVoltage();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.DigitalSignal#getMaximumMinimumVoltage <em>Maximum Minimum Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Minimum Voltage</em>' attribute.
	 * @see #getMaximumMinimumVoltage()
	 * @generated
	 */
	void setMaximumMinimumVoltage(double value);

} // DigitalSignal
