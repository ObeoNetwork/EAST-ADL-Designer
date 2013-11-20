/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.platform_model;

import org.obeonetwork.dsl.east_adl.core.EASTADLEntity;

import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Peripheral;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor;

import org.obeonetwork.dsl.east_adl.verification_validation.ValidatedEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IO Driver</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity represents a low level software component that serves as an interface to an external piece of sensor or actuator hardware. It corresponds to a hardware which is explicitely used from the FDA through local device manages and hardware abstraction functions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.platform_model.IODriver#getConfigurationData <em>Configuration Data</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.platform_model.IODriver#getOwningArtifact <em>Owning Artifact</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.platform_model.IODriver#getAbstraction <em>Abstraction</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.platform_model.IODriver#getProcessor <em>Processor</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.platform_model.IODriver#getPeripheral <em>Peripheral</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.Platform_modelPackage#getIODriver()
 * @model
 * @generated
 */
public interface IODriver extends EASTADLEntity, ValidatedEntity {
	/**
	 * Returns the value of the '<em><b>Configuration Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute provides the configuration information on the driver.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Configuration Data</em>' attribute.
	 * @see #setConfigurationData(String)
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.Platform_modelPackage#getIODriver_ConfigurationData()
	 * @model
	 * @generated
	 */
	String getConfigurationData();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.IODriver#getConfigurationData <em>Configuration Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration Data</em>' attribute.
	 * @see #getConfigurationData()
	 * @generated
	 */
	void setConfigurationData(String value);

	/**
	 * Returns the value of the '<em><b>Owning Artifact</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel#getIODrivers <em>IO Drivers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the artifact to which this driver belongs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Artifact</em>' container reference.
	 * @see #setOwningArtifact(PlatformModel)
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.Platform_modelPackage#getIODriver_OwningArtifact()
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel#getIODrivers
	 * @model opposite="IODrivers" required="true" transient="false"
	 * @generated
	 */
	PlatformModel getOwningArtifact();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.IODriver#getOwningArtifact <em>Owning Artifact</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Artifact</em>' container reference.
	 * @see #getOwningArtifact()
	 * @generated
	 */
	void setOwningArtifact(PlatformModel value);

	/**
	 * Returns the value of the '<em><b>Abstraction</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.HardwareAbstractionFunction#getDriver <em>Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the function providing access to the driver for the application layer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstraction</em>' reference.
	 * @see #setAbstraction(HardwareAbstractionFunction)
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.Platform_modelPackage#getIODriver_Abstraction()
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.HardwareAbstractionFunction#getDriver
	 * @model opposite="driver"
	 * @generated
	 */
	HardwareAbstractionFunction getAbstraction();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.IODriver#getAbstraction <em>Abstraction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstraction</em>' reference.
	 * @see #getAbstraction()
	 * @generated
	 */
	void setAbstraction(HardwareAbstractionFunction value);

	/**
	 * Returns the value of the '<em><b>Processor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor#getIODrivers <em>IO Drivers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These is the processor on which this driver is running.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Processor</em>' reference.
	 * @see #setProcessor(Processor)
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.Platform_modelPackage#getIODriver_Processor()
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor#getIODrivers
	 * @model opposite="IODrivers"
	 * @generated
	 */
	Processor getProcessor();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.IODriver#getProcessor <em>Processor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processor</em>' reference.
	 * @see #getProcessor()
	 * @generated
	 */
	void setProcessor(Processor value);

	/**
	 * Returns the value of the '<em><b>Peripheral</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Peripheral#getIODrivers <em>IO Drivers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Peripheral</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Peripheral</em>' reference.
	 * @see #setPeripheral(Peripheral)
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.Platform_modelPackage#getIODriver_Peripheral()
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Peripheral#getIODrivers
	 * @model opposite="IODrivers"
	 * @generated
	 */
	Peripheral getPeripheral();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.IODriver#getPeripheral <em>Peripheral</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Peripheral</em>' reference.
	 * @see #getPeripheral()
	 * @generated
	 */
	void setPeripheral(Peripheral value);

} // IODriver
