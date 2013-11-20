/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.hardware_architecture;

import org.eclipse.emf.common.util.EList;

import org.obeonetwork.dsl.east_adl.core.EASTADLEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Electrical Signal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity is used to specify electrical characteristics of a pin.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ElectricalSignal#getMinimumVoltage <em>Minimum Voltage</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ElectricalSignal#getMaximumVoltage <em>Maximum Voltage</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ElectricalSignal#getTypedPins <em>Typed Pins</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ElectricalSignal#getOwningArtifact <em>Owning Artifact</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage#getElectricalSignal()
 * @model
 * @generated
 */
public interface ElectricalSignal extends EASTADLEntity {
	/**
	 * Returns the value of the '<em><b>Minimum Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The meaning is explicit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Minimum Voltage</em>' attribute.
	 * @see #setMinimumVoltage(double)
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage#getElectricalSignal_MinimumVoltage()
	 * @model
	 * @generated
	 */
	double getMinimumVoltage();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ElectricalSignal#getMinimumVoltage <em>Minimum Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Voltage</em>' attribute.
	 * @see #getMinimumVoltage()
	 * @generated
	 */
	void setMinimumVoltage(double value);

	/**
	 * Returns the value of the '<em><b>Maximum Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The meaning is explicit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Voltage</em>' attribute.
	 * @see #setMaximumVoltage(double)
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage#getElectricalSignal_MaximumVoltage()
	 * @model
	 * @generated
	 */
	double getMaximumVoltage();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ElectricalSignal#getMaximumVoltage <em>Maximum Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Voltage</em>' attribute.
	 * @see #getMaximumVoltage()
	 * @generated
	 */
	void setMaximumVoltage(double value);

	/**
	 * Returns the value of the '<em><b>Typed Pins</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Pin}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Pin#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are the pins using this signal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Typed Pins</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage#getElectricalSignal_TypedPins()
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Pin#getType
	 * @model opposite="type"
	 * @generated
	 */
	EList<Pin> getTypedPins();

	/**
	 * Returns the value of the '<em><b>Owning Artifact</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.HardwareArchitecture#getElectricalSignals <em>Electrical Signals</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Artifact</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Artifact</em>' container reference.
	 * @see #setOwningArtifact(HardwareArchitecture)
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage#getElectricalSignal_OwningArtifact()
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.HardwareArchitecture#getElectricalSignals
	 * @model opposite="electricalSignals" required="true" transient="false"
	 * @generated
	 */
	HardwareArchitecture getOwningArtifact();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ElectricalSignal#getOwningArtifact <em>Owning Artifact</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Artifact</em>' container reference.
	 * @see #getOwningArtifact()
	 * @generated
	 */
	void setOwningArtifact(HardwareArchitecture value);

} // ElectricalSignal
