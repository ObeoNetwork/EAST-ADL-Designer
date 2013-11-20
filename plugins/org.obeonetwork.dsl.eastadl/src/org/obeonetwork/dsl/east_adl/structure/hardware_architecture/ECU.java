/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.hardware_architecture;

import org.eclipse.emf.common.util.EList;

import org.obeonetwork.dsl.east_adl.structure.common.AllocatableEntity;
import org.obeonetwork.dsl.east_adl.structure.common.AllocationConstraint;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ECU</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity models the computer nodes of the embedded system.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ECU#getProcessors <em>Processors</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ECU#getMemory <em>Memory</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ECU#getChannels <em>Channels</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ECU#getPeripherals <em>Peripherals</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ECU#getPins <em>Pins</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ECU#getAllocations <em>Allocations</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ECU#getAllocatedEntities <em>Allocated Entities</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage#getECU()
 * @model
 * @generated
 */
public interface ECU extends HardwareEntity {
	/**
	 * Returns the value of the '<em><b>Processors</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor#getOwningECU <em>Owning ECU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are the processors contained within this ECU.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Processors</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage#getECU_Processors()
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor#getOwningECU
	 * @model opposite="owningECU" containment="true"
	 * @generated
	 */
	EList<Processor> getProcessors();

	/**
	 * Returns the value of the '<em><b>Memory</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Memory}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Memory#getOwningECU <em>Owning ECU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is all the memory contained within this ECU.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Memory</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage#getECU_Memory()
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Memory#getOwningECU
	 * @model opposite="owningECU" containment="true"
	 * @generated
	 */
	EList<Memory> getMemory();

	/**
	 * Returns the value of the '<em><b>Channels</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Channel}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Channel#getConnectedECUs <em>Connected EC Us</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are channels to which this ECU is connected.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Channels</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage#getECU_Channels()
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Channel#getConnectedECUs
	 * @model opposite="connectedECUs"
	 * @generated
	 */
	EList<Channel> getChannels();

	/**
	 * Returns the value of the '<em><b>Peripherals</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Peripheral}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Peripheral#getOwningECU <em>Owning ECU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are the peripherals contained within this ECU.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Peripherals</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage#getECU_Peripherals()
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Peripheral#getOwningECU
	 * @model opposite="owningECU" containment="true"
	 * @generated
	 */
	EList<Peripheral> getPeripherals();

	/**
	 * Returns the value of the '<em><b>Pins</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Pin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are the pins of which the hardware interface of this ECU is composed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pins</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage#getECU_Pins()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pin> getPins();

	/**
	 * Returns the value of the '<em><b>Allocations</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.common.AllocationConstraint}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.common.AllocationConstraint#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are all allocated entities.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allocations</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage#getECU_Allocations()
	 * @see org.obeonetwork.dsl.east_adl.structure.common.AllocationConstraint#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<AllocationConstraint> getAllocations();

	/**
	 * Returns the value of the '<em><b>Allocated Entities</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.common.AllocatableEntity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is a derived property used to show all allocated properties instead of the corresponding constraints.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allocated Entities</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage#getECU_AllocatedEntities()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<AllocatableEntity> getAllocatedEntities();

} // ECU
