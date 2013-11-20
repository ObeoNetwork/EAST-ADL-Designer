/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.hardware_architecture;

import org.obeonetwork.dsl.east_adl.core.EASTADLEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wire</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is a specialization of a channel for electrical links. It represents a physical link between several pins of sensors, actuators, ECUs, etc.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Wire#getSource <em>Source</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Wire#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Wire#getOwningArtifact <em>Owning Artifact</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage#getWire()
 * @model
 * @generated
 */
public interface Wire extends EASTADLEntity {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Pin#getOutgoingWires <em>Outgoing Wires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the source of this wire.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Pin)
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage#getWire_Source()
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Pin#getOutgoingWires
	 * @model opposite="outgoingWires"
	 * @generated
	 */
	Pin getSource();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Wire#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Pin value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Pin#getIncomingWires <em>Incoming Wires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the destination of this wire.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Destination</em>' reference.
	 * @see #setDestination(Pin)
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage#getWire_Destination()
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Pin#getIncomingWires
	 * @model opposite="incomingWires"
	 * @generated
	 */
	Pin getDestination();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Wire#getDestination <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(Pin value);

	/**
	 * Returns the value of the '<em><b>Owning Artifact</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.HardwareArchitecture#getWires <em>Wires</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Artifact</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Artifact</em>' container reference.
	 * @see #setOwningArtifact(HardwareArchitecture)
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage#getWire_OwningArtifact()
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.HardwareArchitecture#getWires
	 * @model opposite="wires" required="true" transient="false"
	 * @generated
	 */
	HardwareArchitecture getOwningArtifact();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Wire#getOwningArtifact <em>Owning Artifact</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Artifact</em>' container reference.
	 * @see #getOwningArtifact()
	 * @generated
	 */
	void setOwningArtifact(HardwareArchitecture value);

} // Wire
