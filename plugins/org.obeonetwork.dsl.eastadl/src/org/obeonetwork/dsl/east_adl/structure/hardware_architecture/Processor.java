/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.hardware_architecture;

import org.eclipse.emf.common.util.EList;

import org.obeonetwork.dsl.east_adl.structure.allocation_model.OSTask;

import org.obeonetwork.dsl.east_adl.structure.common.TypeAssociation;

import org.obeonetwork.dsl.east_adl.structure.platform_model.DeviceDriver;
import org.obeonetwork.dsl.east_adl.structure.platform_model.Framework;
import org.obeonetwork.dsl.east_adl.structure.platform_model.HardwareAbstractionFunction;
import org.obeonetwork.dsl.east_adl.structure.platform_model.IODriver;
import org.obeonetwork.dsl.east_adl.structure.platform_model.OperatingSystem;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity represents a computing element. It may be either microprocessors, controllers or programmable logic such as FPGAs or ASICs.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor#getType <em>Type</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor#getFrequencyUnit <em>Frequency Unit</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor#getOwningECU <em>Owning ECU</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor#getUsedMemory <em>Used Memory</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor#getTasks <em>Tasks</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor#getIODrivers <em>IO Drivers</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor#getDeviceDrivers <em>Device Drivers</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor#getFrameworks <em>Frameworks</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor#getOperatingSystems <em>Operating Systems</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor#getTypeAssociations <em>Type Associations</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor#getHardwareAbstractions <em>Hardware Abstractions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor#getPeripherals <em>Peripherals</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage#getProcessor()
 * @model
 * @generated
 */
public interface Processor extends HardwareEntity {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the type of the processor : CPU, MCU etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage#getProcessor_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the frequency of the processor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Frequency</em>' attribute.
	 * @see #setFrequency(int)
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage#getProcessor_Frequency()
	 * @model
	 * @generated
	 */
	int getFrequency();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor#getFrequency <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency</em>' attribute.
	 * @see #getFrequency()
	 * @generated
	 */
	void setFrequency(int value);

	/**
	 * Returns the value of the '<em><b>Frequency Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the unit of the frequency (Mhz, Khz, etc).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Frequency Unit</em>' attribute.
	 * @see #setFrequencyUnit(String)
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage#getProcessor_FrequencyUnit()
	 * @model
	 * @generated
	 */
	String getFrequencyUnit();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor#getFrequencyUnit <em>Frequency Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency Unit</em>' attribute.
	 * @see #getFrequencyUnit()
	 * @generated
	 */
	void setFrequencyUnit(String value);

	/**
	 * Returns the value of the '<em><b>Owning ECU</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ECU#getProcessors <em>Processors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the ECU owning this processor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning ECU</em>' container reference.
	 * @see #setOwningECU(ECU)
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage#getProcessor_OwningECU()
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ECU#getProcessors
	 * @model opposite="processors" required="true" transient="false"
	 * @generated
	 */
	ECU getOwningECU();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor#getOwningECU <em>Owning ECU</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning ECU</em>' container reference.
	 * @see #getOwningECU()
	 * @generated
	 */
	void setOwningECU(ECU value);

	/**
	 * Returns the value of the '<em><b>Used Memory</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Memory}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Memory#getUsingProcessors <em>Using Processors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This are the memory blocks used by this processor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Used Memory</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage#getProcessor_UsedMemory()
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Memory#getUsingProcessors
	 * @model opposite="usingProcessors"
	 * @generated
	 */
	EList<Memory> getUsedMemory();

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.allocation_model.OSTask}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.OSTask#getExecutingProcessor <em>Executing Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are the tasks executed by the processor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tasks</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage#getProcessor_Tasks()
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.OSTask#getExecutingProcessor
	 * @model opposite="executingProcessor"
	 * @generated
	 */
	EList<OSTask> getTasks();

	/**
	 * Returns the value of the '<em><b>IO Drivers</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.platform_model.IODriver}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.IODriver#getProcessor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are i/o drivers running on this processor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IO Drivers</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage#getProcessor_IODrivers()
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.IODriver#getProcessor
	 * @model opposite="processor"
	 * @generated
	 */
	EList<IODriver> getIODrivers();

	/**
	 * Returns the value of the '<em><b>Device Drivers</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.platform_model.DeviceDriver}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.DeviceDriver#getProcessor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are device drivers running on this processor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Drivers</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage#getProcessor_DeviceDrivers()
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.DeviceDriver#getProcessor
	 * @model opposite="processor"
	 * @generated
	 */
	EList<DeviceDriver> getDeviceDrivers();

	/**
	 * Returns the value of the '<em><b>Frameworks</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.platform_model.Framework}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.Framework#getProcessor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are the frameworks running on this processor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Frameworks</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage#getProcessor_Frameworks()
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.Framework#getProcessor
	 * @model opposite="processor"
	 * @generated
	 */
	EList<Framework> getFrameworks();

	/**
	 * Returns the value of the '<em><b>Operating Systems</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.platform_model.OperatingSystem}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.OperatingSystem#getProcessor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are operating systems running on this processor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operating Systems</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage#getProcessor_OperatingSystems()
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.OperatingSystem#getProcessor
	 * @model opposite="processor"
	 * @generated
	 */
	EList<OperatingSystem> getOperatingSystems();

	/**
	 * Returns the value of the '<em><b>Type Associations</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.common.TypeAssociation}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.common.TypeAssociation#getProcessor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are all type associations
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Associations</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage#getProcessor_TypeAssociations()
	 * @see org.obeonetwork.dsl.east_adl.structure.common.TypeAssociation#getProcessor
	 * @model opposite="processor"
	 * @generated
	 */
	EList<TypeAssociation> getTypeAssociations();

	/**
	 * Returns the value of the '<em><b>Hardware Abstractions</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.platform_model.HardwareAbstractionFunction}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.HardwareAbstractionFunction#getProcessor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hardware Abstractions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardware Abstractions</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage#getProcessor_HardwareAbstractions()
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.HardwareAbstractionFunction#getProcessor
	 * @model opposite="processor"
	 * @generated
	 */
	EList<HardwareAbstractionFunction> getHardwareAbstractions();

	/**
	 * Returns the value of the '<em><b>Peripherals</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Peripheral}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Peripheral#getProcessors <em>Processors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Peripherals</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Peripherals</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage#getProcessor_Peripherals()
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Peripheral#getProcessors
	 * @model opposite="processors"
	 * @generated
	 */
	EList<Peripheral> getPeripherals();

} // Processor
