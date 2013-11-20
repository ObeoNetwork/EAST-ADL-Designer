/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.platform_model;

import org.eclipse.emf.common.util.EList;

import org.obeonetwork.dsl.east_adl.core.EASTADLEntity;

import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Pin;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor;

import org.obeonetwork.dsl.east_adl.verification_validation.ValidatedEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hardware Abstraction Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity is used to make the pins of a peripheral's hardware interface accessible  from the application layer over a standard software interface.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.platform_model.HardwareAbstractionFunction#getOwningArtifact <em>Owning Artifact</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.platform_model.HardwareAbstractionFunction#getDriver <em>Driver</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.platform_model.HardwareAbstractionFunction#getProvidedPort <em>Provided Port</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.platform_model.HardwareAbstractionFunction#getRequiredPort <em>Required Port</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.platform_model.HardwareAbstractionFunction#getAccessiblePins <em>Accessible Pins</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.platform_model.HardwareAbstractionFunction#getProcessor <em>Processor</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.Platform_modelPackage#getHardwareAbstractionFunction()
 * @model
 * @generated
 */
public interface HardwareAbstractionFunction extends EASTADLEntity, ValidatedEntity {
	/**
	 * Returns the value of the '<em><b>Owning Artifact</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel#getAbstractFunctions <em>Abstract Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the artifact to which this hardware function belongs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Artifact</em>' container reference.
	 * @see #setOwningArtifact(PlatformModel)
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.Platform_modelPackage#getHardwareAbstractionFunction_OwningArtifact()
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel#getAbstractFunctions
	 * @model opposite="abstractFunctions" required="true" transient="false"
	 * @generated
	 */
	PlatformModel getOwningArtifact();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.HardwareAbstractionFunction#getOwningArtifact <em>Owning Artifact</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Artifact</em>' container reference.
	 * @see #getOwningArtifact()
	 * @generated
	 */
	void setOwningArtifact(PlatformModel value);

	/**
	 * Returns the value of the '<em><b>Driver</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.IODriver#getAbstraction <em>Abstraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the i/o driver that uses this abstraction function.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Driver</em>' reference.
	 * @see #setDriver(IODriver)
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.Platform_modelPackage#getHardwareAbstractionFunction_Driver()
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.IODriver#getAbstraction
	 * @model opposite="abstraction"
	 * @generated
	 */
	IODriver getDriver();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.HardwareAbstractionFunction#getDriver <em>Driver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Driver</em>' reference.
	 * @see #getDriver()
	 * @generated
	 */
	void setDriver(IODriver value);

	/**
	 * Returns the value of the '<em><b>Provided Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the port provided by this hardware abstraction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provided Port</em>' containment reference.
	 * @see #setProvidedPort(SystemPort)
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.Platform_modelPackage#getHardwareAbstractionFunction_ProvidedPort()
	 * @model containment="true"
	 * @generated
	 */
	SystemPort getProvidedPort();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.HardwareAbstractionFunction#getProvidedPort <em>Provided Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provided Port</em>' containment reference.
	 * @see #getProvidedPort()
	 * @generated
	 */
	void setProvidedPort(SystemPort value);

	/**
	 * Returns the value of the '<em><b>Required Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the port required by this hardware abstraction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required Port</em>' containment reference.
	 * @see #setRequiredPort(SystemPort)
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.Platform_modelPackage#getHardwareAbstractionFunction_RequiredPort()
	 * @model containment="true"
	 * @generated
	 */
	SystemPort getRequiredPort();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.HardwareAbstractionFunction#getRequiredPort <em>Required Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Port</em>' containment reference.
	 * @see #getRequiredPort()
	 * @generated
	 */
	void setRequiredPort(SystemPort value);

	/**
	 * Returns the value of the '<em><b>Accessible Pins</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Pin}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Pin#getAbstractInterfaces <em>Abstract Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are the pins that can be accessed through this abstraction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Accessible Pins</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.Platform_modelPackage#getHardwareAbstractionFunction_AccessiblePins()
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Pin#getAbstractInterfaces
	 * @model opposite="abstractInterfaces"
	 * @generated
	 */
	EList<Pin> getAccessiblePins();

	/**
	 * Returns the value of the '<em><b>Processor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor#getHardwareAbstractions <em>Hardware Abstractions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processor</em>' reference.
	 * @see #setProcessor(Processor)
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.Platform_modelPackage#getHardwareAbstractionFunction_Processor()
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor#getHardwareAbstractions
	 * @model opposite="hardwareAbstractions"
	 * @generated
	 */
	Processor getProcessor();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.HardwareAbstractionFunction#getProcessor <em>Processor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processor</em>' reference.
	 * @see #getProcessor()
	 * @generated
	 */
	void setProcessor(Processor value);

} // HardwareAbstractionFunction
