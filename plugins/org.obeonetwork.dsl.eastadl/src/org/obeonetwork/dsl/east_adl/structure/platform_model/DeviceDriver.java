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
 * A representation of the model object '<em><b>Device Driver</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity represents a low level software component that serves as an interface to an external piece of hardware, in most cases communication hardware. It corresponds to hardware which is implicitely used on the FDA level.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.platform_model.DeviceDriver#getConfigurationData <em>Configuration Data</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.platform_model.DeviceDriver#getOwningArtifact <em>Owning Artifact</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.platform_model.DeviceDriver#getProcessor <em>Processor</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.platform_model.DeviceDriver#getPeripheral <em>Peripheral</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.Platform_modelPackage#getDeviceDriver()
 * @model
 * @generated
 */
public interface DeviceDriver extends EASTADLEntity, ValidatedEntity {
	/**
	 * Returns the value of the '<em><b>Configuration Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute provides the configuration information on the driver.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Configuration Data</em>' attribute.
	 * @see #setConfigurationData(String)
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.Platform_modelPackage#getDeviceDriver_ConfigurationData()
	 * @model
	 * @generated
	 */
	String getConfigurationData();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.DeviceDriver#getConfigurationData <em>Configuration Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration Data</em>' attribute.
	 * @see #getConfigurationData()
	 * @generated
	 */
	void setConfigurationData(String value);

	/**
	 * Returns the value of the '<em><b>Owning Artifact</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel#getDeviceDrivers <em>Device Drivers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the artifact to which this driver belongs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Artifact</em>' container reference.
	 * @see #setOwningArtifact(PlatformModel)
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.Platform_modelPackage#getDeviceDriver_OwningArtifact()
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel#getDeviceDrivers
	 * @model opposite="deviceDrivers" required="true" transient="false"
	 * @generated
	 */
	PlatformModel getOwningArtifact();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.DeviceDriver#getOwningArtifact <em>Owning Artifact</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Artifact</em>' container reference.
	 * @see #getOwningArtifact()
	 * @generated
	 */
	void setOwningArtifact(PlatformModel value);

	/**
	 * Returns the value of the '<em><b>Processor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor#getDeviceDrivers <em>Device Drivers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the processor on which this driver is running.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Processor</em>' reference.
	 * @see #setProcessor(Processor)
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.Platform_modelPackage#getDeviceDriver_Processor()
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor#getDeviceDrivers
	 * @model opposite="deviceDrivers"
	 * @generated
	 */
	Processor getProcessor();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.DeviceDriver#getProcessor <em>Processor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processor</em>' reference.
	 * @see #getProcessor()
	 * @generated
	 */
	void setProcessor(Processor value);

	/**
	 * Returns the value of the '<em><b>Peripheral</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Peripheral#getDeviceDrivers <em>Device Drivers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Peripheral</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Peripheral</em>' reference.
	 * @see #setPeripheral(Peripheral)
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.Platform_modelPackage#getDeviceDriver_Peripheral()
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Peripheral#getDeviceDrivers
	 * @model opposite="deviceDrivers"
	 * @generated
	 */
	Peripheral getPeripheral();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.DeviceDriver#getPeripheral <em>Peripheral</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Peripheral</em>' reference.
	 * @see #getPeripheral()
	 * @generated
	 */
	void setPeripheral(Peripheral value);

} // DeviceDriver
