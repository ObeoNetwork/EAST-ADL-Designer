/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.platform_model;

import org.eclipse.emf.common.util.EList;

import org.obeonetwork.dsl.east_adl.core.EASTADLArtifact;

import org.obeonetwork.dsl.east_adl.structure.allocation_model.AllocationModel;

import org.obeonetwork.dsl.east_adl.structure.common.ConnectorSignal;
import org.obeonetwork.dsl.east_adl.structure.common.DesignDataType;
import org.obeonetwork.dsl.east_adl.structure.common.ImplementationDataType;
import org.obeonetwork.dsl.east_adl.structure.common.OperationCall;
import org.obeonetwork.dsl.east_adl.structure.common.TypeAssociation;

import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.HardwareArchitecture;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Platform Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity is used in the context of a certain hardware architecture to provide a software view.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel#getAllocationModel <em>Allocation Model</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel#getHardwareArchitecture <em>Hardware Architecture</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel#getDeviceDrivers <em>Device Drivers</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel#getIODrivers <em>IO Drivers</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel#getAbstractFunctions <em>Abstract Functions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel#getFrameworks <em>Frameworks</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel#getOperatingSystems <em>Operating Systems</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel#getCompositeSoftwareFunctions <em>Composite Software Functions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel#getElementarySoftwareFunctions <em>Elementary Software Functions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel#getIPCExchangers <em>IPC Exchangers</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel#getDesignDataTypes <em>Design Data Types</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel#getImplementationDataTypes <em>Implementation Data Types</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel#getTypeAssociations <em>Type Associations</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel#getConnectorSignals <em>Connector Signals</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel#getOperationCalls <em>Operation Calls</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.Platform_modelPackage#getPlatformModel()
 * @model
 * @generated
 */
public interface PlatformModel extends EASTADLArtifact {
	/**
	 * Returns the value of the '<em><b>Allocation Model</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.AllocationModel#getPlatformModel <em>Platform Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the allocation model to which platform entities are allocated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allocation Model</em>' reference.
	 * @see #setAllocationModel(AllocationModel)
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.Platform_modelPackage#getPlatformModel_AllocationModel()
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.AllocationModel#getPlatformModel
	 * @model opposite="platformModel"
	 * @generated
	 */
	AllocationModel getAllocationModel();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel#getAllocationModel <em>Allocation Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allocation Model</em>' reference.
	 * @see #getAllocationModel()
	 * @generated
	 */
	void setAllocationModel(AllocationModel value);

	/**
	 * Returns the value of the '<em><b>Hardware Architecture</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.HardwareArchitecture#getPlatformModel <em>Platform Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the hardware architecture this model is defined for.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hardware Architecture</em>' reference.
	 * @see #setHardwareArchitecture(HardwareArchitecture)
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.Platform_modelPackage#getPlatformModel_HardwareArchitecture()
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.HardwareArchitecture#getPlatformModel
	 * @model opposite="platformModel"
	 * @generated
	 */
	HardwareArchitecture getHardwareArchitecture();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel#getHardwareArchitecture <em>Hardware Architecture</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hardware Architecture</em>' reference.
	 * @see #getHardwareArchitecture()
	 * @generated
	 */
	void setHardwareArchitecture(HardwareArchitecture value);

	/**
	 * Returns the value of the '<em><b>Device Drivers</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.platform_model.DeviceDriver}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.DeviceDriver#getOwningArtifact <em>Owning Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are device drivers of this platform model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Drivers</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.Platform_modelPackage#getPlatformModel_DeviceDrivers()
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.DeviceDriver#getOwningArtifact
	 * @model opposite="owningArtifact" containment="true"
	 * @generated
	 */
	EList<DeviceDriver> getDeviceDrivers();

	/**
	 * Returns the value of the '<em><b>IO Drivers</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.platform_model.IODriver}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.IODriver#getOwningArtifact <em>Owning Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are input/output drivers of this platform model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IO Drivers</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.Platform_modelPackage#getPlatformModel_IODrivers()
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.IODriver#getOwningArtifact
	 * @model opposite="owningArtifact" containment="true"
	 * @generated
	 */
	EList<IODriver> getIODrivers();

	/**
	 * Returns the value of the '<em><b>Abstract Functions</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.platform_model.HardwareAbstractionFunction}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.HardwareAbstractionFunction#getOwningArtifact <em>Owning Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are hardware abstraction functions of this platform model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Functions</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.Platform_modelPackage#getPlatformModel_AbstractFunctions()
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.HardwareAbstractionFunction#getOwningArtifact
	 * @model opposite="owningArtifact" containment="true"
	 * @generated
	 */
	EList<HardwareAbstractionFunction> getAbstractFunctions();

	/**
	 * Returns the value of the '<em><b>Frameworks</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.platform_model.Framework}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.Framework#getOwningArtifact <em>Owning Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are EAST-ADL frameworks of this platform model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Frameworks</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.Platform_modelPackage#getPlatformModel_Frameworks()
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.Framework#getOwningArtifact
	 * @model opposite="owningArtifact" containment="true"
	 * @generated
	 */
	EList<Framework> getFrameworks();

	/**
	 * Returns the value of the '<em><b>Operating Systems</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.platform_model.OperatingSystem}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.OperatingSystem#getOwningArtifact <em>Owning Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are operating systems of this platform model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operating Systems</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.Platform_modelPackage#getPlatformModel_OperatingSystems()
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.OperatingSystem#getOwningArtifact
	 * @model opposite="owningArtifact" containment="true"
	 * @generated
	 */
	EList<OperatingSystem> getOperatingSystems();

	/**
	 * Returns the value of the '<em><b>Composite Software Functions</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.platform_model.MWCompositeSoftwareFunction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are composite software functions of this model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Composite Software Functions</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.Platform_modelPackage#getPlatformModel_CompositeSoftwareFunctions()
	 * @model containment="true"
	 * @generated
	 */
	EList<MWCompositeSoftwareFunction> getCompositeSoftwareFunctions();

	/**
	 * Returns the value of the '<em><b>Elementary Software Functions</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.platform_model.MWElementarySoftwareFunction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are elementary software functions of this model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elementary Software Functions</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.Platform_modelPackage#getPlatformModel_ElementarySoftwareFunctions()
	 * @model containment="true"
	 * @generated
	 */
	EList<MWElementarySoftwareFunction> getElementarySoftwareFunctions();

	/**
	 * Returns the value of the '<em><b>IPC Exchangers</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.platform_model.IPCExchanger}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.IPCExchanger#getOwningArtifact <em>Owning Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are the exchangers of this platform model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IPC Exchangers</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.Platform_modelPackage#getPlatformModel_IPCExchangers()
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.IPCExchanger#getOwningArtifact
	 * @model opposite="owningArtifact" containment="true"
	 * @generated
	 */
	EList<IPCExchanger> getIPCExchangers();

	/**
	 * Returns the value of the '<em><b>Design Data Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.common.DesignDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are the design data types used for the platform model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Design Data Types</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.Platform_modelPackage#getPlatformModel_DesignDataTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<DesignDataType> getDesignDataTypes();

	/**
	 * Returns the value of the '<em><b>Implementation Data Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.common.ImplementationDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are the implementation data types used for the platform model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Implementation Data Types</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.Platform_modelPackage#getPlatformModel_ImplementationDataTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImplementationDataType> getImplementationDataTypes();

	/**
	 * Returns the value of the '<em><b>Type Associations</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.common.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Associations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Associations</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.Platform_modelPackage#getPlatformModel_TypeAssociations()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeAssociation> getTypeAssociations();

	/**
	 * Returns the value of the '<em><b>Connector Signals</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.common.ConnectorSignal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector Signals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector Signals</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.Platform_modelPackage#getPlatformModel_ConnectorSignals()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConnectorSignal> getConnectorSignals();

	/**
	 * Returns the value of the '<em><b>Operation Calls</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.common.OperationCall}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Calls</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Calls</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.Platform_modelPackage#getPlatformModel_OperationCalls()
	 * @model containment="true"
	 * @generated
	 */
	EList<OperationCall> getOperationCalls();

} // PlatformModel
