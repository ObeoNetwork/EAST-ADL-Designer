/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.hardware_architecture;

import org.eclipse.emf.common.util.EList;

import org.obeonetwork.dsl.east_adl.core.EASTADLEntity;

import org.obeonetwork.dsl.east_adl.structure.common.DirectionKind;

import org.obeonetwork.dsl.east_adl.structure.platform_model.HardwareAbstractionFunction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity corresponds to an electrical hardware pin of a peripheral, sensor, actuator, etc. It is used to model connections in order to correctly configure middleware or hardware abstraction functions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Pin#getOutgoingWires <em>Outgoing Wires</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Pin#getIncomingWires <em>Incoming Wires</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Pin#getPhysicalMeaning <em>Physical Meaning</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Pin#getDirectionType <em>Direction Type</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Pin#getType <em>Type</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Pin#getOwningHardware <em>Owning Hardware</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Pin#getAbstractInterfaces <em>Abstract Interfaces</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage#getPin()
 * @model
 * @generated
 */
public interface Pin extends EASTADLEntity {
	/**
	 * Returns the value of the '<em><b>Outgoing Wires</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Wire}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Wire#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are the wires outgoing from this pin.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outgoing Wires</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage#getPin_OutgoingWires()
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Wire#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Wire> getOutgoingWires();

	/**
	 * Returns the value of the '<em><b>Incoming Wires</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Wire}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Wire#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are the wires incoming to this pin.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Incoming Wires</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage#getPin_IncomingWires()
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Wire#getDestination
	 * @model opposite="destination"
	 * @generated
	 */
	EList<Wire> getIncomingWires();

	/**
	 * Returns the value of the '<em><b>Physical Meaning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the description of the meaning of this pin.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Physical Meaning</em>' attribute.
	 * @see #setPhysicalMeaning(String)
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage#getPin_PhysicalMeaning()
	 * @model
	 * @generated
	 */
	String getPhysicalMeaning();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Pin#getPhysicalMeaning <em>Physical Meaning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical Meaning</em>' attribute.
	 * @see #getPhysicalMeaning()
	 * @generated
	 */
	void setPhysicalMeaning(String value);

	/**
	 * Returns the value of the '<em><b>Direction Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.obeonetwork.dsl.east_adl.structure.common.DirectionKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This specifies the direction : in out or in-out.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Direction Type</em>' attribute.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.DirectionKind
	 * @see #setDirectionType(DirectionKind)
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage#getPin_DirectionType()
	 * @model
	 * @generated
	 */
	DirectionKind getDirectionType();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Pin#getDirectionType <em>Direction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction Type</em>' attribute.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.DirectionKind
	 * @see #getDirectionType()
	 * @generated
	 */
	void setDirectionType(DirectionKind value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ElectricalSignal#getTypedPins <em>Typed Pins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the electrical signal that types this pin.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(ElectricalSignal)
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage#getPin_Type()
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ElectricalSignal#getTypedPins
	 * @model opposite="typedPins"
	 * @generated
	 */
	ElectricalSignal getType();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Pin#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ElectricalSignal value);

	/**
	 * Returns the value of the '<em><b>Owning Hardware</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is a derived property used to describe the hardware containing this pin.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Hardware</em>' reference.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage#getPin_OwningHardware()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	HardwareEntity getOwningHardware();

	/**
	 * Returns the value of the '<em><b>Abstract Interfaces</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.platform_model.HardwareAbstractionFunction}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.HardwareAbstractionFunction#getAccessiblePins <em>Accessible Pins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are the hardware abstraction functions accessing this pin.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Interfaces</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage#getPin_AbstractInterfaces()
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.HardwareAbstractionFunction#getAccessiblePins
	 * @model opposite="accessiblePins"
	 * @generated
	 */
	EList<HardwareAbstractionFunction> getAbstractInterfaces();

} // Pin
