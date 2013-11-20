/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.platform_model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.obeonetwork.dsl.east_adl.core.CorePackage;

import org.obeonetwork.dsl.east_adl.structure.common.CommonPackage;

import org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Functional_design_architecturePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * This package contains the entities of the PM artifact (or TA - Technical Architecture). The goal here is to provide a software view of the hardware architecture.
 * <!-- end-model-doc -->
 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.Platform_modelFactory
 * @model kind="package"
 * @generated
 */
public interface Platform_modelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "platform_model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.topcased.org/0.11.0/east_adl/structure/platform_model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "platform_model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Platform_modelPackage eINSTANCE = org.obeonetwork.dsl.east_adl.structure.platform_model.impl.Platform_modelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.impl.PlatformModelImpl <em>Platform Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.impl.PlatformModelImpl
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.impl.Platform_modelPackageImpl#getPlatformModel()
	 * @generated
	 */
	int PLATFORM_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_MODEL__NAME = CorePackage.EASTADL_ARTIFACT__NAME;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_MODEL__REQUIREMENTS = CorePackage.EASTADL_ARTIFACT__REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_MODEL__MODEL = CorePackage.EASTADL_ARTIFACT__MODEL;

	/**
	 * The feature id for the '<em><b>Support Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_MODEL__SUPPORT_ENTITIES = CorePackage.EASTADL_ARTIFACT__SUPPORT_ENTITIES;

	/**
	 * The feature id for the '<em><b>Validation Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_MODEL__VALIDATION_ENTITIES = CorePackage.EASTADL_ARTIFACT__VALIDATION_ENTITIES;

	/**
	 * The feature id for the '<em><b>Allocation Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_MODEL__ALLOCATION_MODEL = CorePackage.EASTADL_ARTIFACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hardware Architecture</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_MODEL__HARDWARE_ARCHITECTURE = CorePackage.EASTADL_ARTIFACT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Device Drivers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_MODEL__DEVICE_DRIVERS = CorePackage.EASTADL_ARTIFACT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>IO Drivers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_MODEL__IO_DRIVERS = CorePackage.EASTADL_ARTIFACT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Abstract Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_MODEL__ABSTRACT_FUNCTIONS = CorePackage.EASTADL_ARTIFACT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Frameworks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_MODEL__FRAMEWORKS = CorePackage.EASTADL_ARTIFACT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Operating Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_MODEL__OPERATING_SYSTEMS = CorePackage.EASTADL_ARTIFACT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Composite Software Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_MODEL__COMPOSITE_SOFTWARE_FUNCTIONS = CorePackage.EASTADL_ARTIFACT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Elementary Software Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_MODEL__ELEMENTARY_SOFTWARE_FUNCTIONS = CorePackage.EASTADL_ARTIFACT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>IPC Exchangers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_MODEL__IPC_EXCHANGERS = CorePackage.EASTADL_ARTIFACT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Design Data Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_MODEL__DESIGN_DATA_TYPES = CorePackage.EASTADL_ARTIFACT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Implementation Data Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_MODEL__IMPLEMENTATION_DATA_TYPES = CorePackage.EASTADL_ARTIFACT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Type Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_MODEL__TYPE_ASSOCIATIONS = CorePackage.EASTADL_ARTIFACT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Connector Signals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_MODEL__CONNECTOR_SIGNALS = CorePackage.EASTADL_ARTIFACT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Operation Calls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_MODEL__OPERATION_CALLS = CorePackage.EASTADL_ARTIFACT_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Platform Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_MODEL_FEATURE_COUNT = CorePackage.EASTADL_ARTIFACT_FEATURE_COUNT + 15;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.impl.DeviceDriverImpl <em>Device Driver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.impl.DeviceDriverImpl
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.impl.Platform_modelPackageImpl#getDeviceDriver()
	 * @generated
	 */
	int DEVICE_DRIVER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DRIVER__NAME = CorePackage.EASTADL_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Passive Assignments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DRIVER__PASSIVE_ASSIGNMENTS = CorePackage.EASTADL_ENTITY__PASSIVE_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Assigned Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DRIVER__ASSIGNED_REQUIREMENTS = CorePackage.EASTADL_ENTITY__ASSIGNED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DRIVER__VALIDATORS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Configuration Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DRIVER__CONFIGURATION_DATA = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owning Artifact</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DRIVER__OWNING_ARTIFACT = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Processor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DRIVER__PROCESSOR = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Peripheral</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DRIVER__PERIPHERAL = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Device Driver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_DRIVER_FEATURE_COUNT = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.impl.IODriverImpl <em>IO Driver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.impl.IODriverImpl
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.impl.Platform_modelPackageImpl#getIODriver()
	 * @generated
	 */
	int IO_DRIVER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_DRIVER__NAME = CorePackage.EASTADL_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Passive Assignments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_DRIVER__PASSIVE_ASSIGNMENTS = CorePackage.EASTADL_ENTITY__PASSIVE_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Assigned Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_DRIVER__ASSIGNED_REQUIREMENTS = CorePackage.EASTADL_ENTITY__ASSIGNED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_DRIVER__VALIDATORS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Configuration Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_DRIVER__CONFIGURATION_DATA = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owning Artifact</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_DRIVER__OWNING_ARTIFACT = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Abstraction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_DRIVER__ABSTRACTION = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Processor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_DRIVER__PROCESSOR = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Peripheral</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_DRIVER__PERIPHERAL = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>IO Driver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_DRIVER_FEATURE_COUNT = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.impl.HardwareAbstractionFunctionImpl <em>Hardware Abstraction Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.impl.HardwareAbstractionFunctionImpl
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.impl.Platform_modelPackageImpl#getHardwareAbstractionFunction()
	 * @generated
	 */
	int HARDWARE_ABSTRACTION_FUNCTION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ABSTRACTION_FUNCTION__NAME = CorePackage.EASTADL_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Passive Assignments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ABSTRACTION_FUNCTION__PASSIVE_ASSIGNMENTS = CorePackage.EASTADL_ENTITY__PASSIVE_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Assigned Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ABSTRACTION_FUNCTION__ASSIGNED_REQUIREMENTS = CorePackage.EASTADL_ENTITY__ASSIGNED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ABSTRACTION_FUNCTION__VALIDATORS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Artifact</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ABSTRACTION_FUNCTION__OWNING_ARTIFACT = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Driver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ABSTRACTION_FUNCTION__DRIVER = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Provided Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ABSTRACTION_FUNCTION__PROVIDED_PORT = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Required Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ABSTRACTION_FUNCTION__REQUIRED_PORT = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Accessible Pins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ABSTRACTION_FUNCTION__ACCESSIBLE_PINS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Processor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ABSTRACTION_FUNCTION__PROCESSOR = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Hardware Abstraction Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ABSTRACTION_FUNCTION_FEATURE_COUNT = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.impl.OperatingSystemImpl <em>Operating System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.impl.OperatingSystemImpl
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.impl.Platform_modelPackageImpl#getOperatingSystem()
	 * @generated
	 */
	int OPERATING_SYSTEM = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM__NAME = CorePackage.EASTADL_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Passive Assignments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM__PASSIVE_ASSIGNMENTS = CorePackage.EASTADL_ENTITY__PASSIVE_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Assigned Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM__ASSIGNED_REQUIREMENTS = CorePackage.EASTADL_ENTITY__ASSIGNED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM__TYPE = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Execution Model Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM__EXECUTION_MODEL_TYPE = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Blocking Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM__BLOCKING_FACTOR = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Task Switch Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM__TASK_SWITCH_TIME = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owning Artifact</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM__OWNING_ARTIFACT = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Processor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM__PROCESSOR = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Operating System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM_FEATURE_COUNT = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.impl.FrameworkImpl <em>Framework</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.impl.FrameworkImpl
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.impl.Platform_modelPackageImpl#getFramework()
	 * @generated
	 */
	int FRAMEWORK = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAMEWORK__NAME = CorePackage.EASTADL_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Passive Assignments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAMEWORK__PASSIVE_ASSIGNMENTS = CorePackage.EASTADL_ENTITY__PASSIVE_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Assigned Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAMEWORK__ASSIGNED_REQUIREMENTS = CorePackage.EASTADL_ENTITY__ASSIGNED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Configuration Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAMEWORK__CONFIGURATION_DATA = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Artifact</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAMEWORK__OWNING_ARTIFACT = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Processor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAMEWORK__PROCESSOR = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Framework</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAMEWORK_FEATURE_COUNT = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.impl.MWCompositeSoftwareFunctionImpl <em>MW Composite Software Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.impl.MWCompositeSoftwareFunctionImpl
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.impl.Platform_modelPackageImpl#getMWCompositeSoftwareFunction()
	 * @generated
	 */
	int MW_COMPOSITE_SOFTWARE_FUNCTION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_COMPOSITE_SOFTWARE_FUNCTION__NAME = Functional_design_architecturePackage.COMPOSITE_SOFTWARE_FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Passive Assignments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_COMPOSITE_SOFTWARE_FUNCTION__PASSIVE_ASSIGNMENTS = Functional_design_architecturePackage.COMPOSITE_SOFTWARE_FUNCTION__PASSIVE_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Assigned Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_COMPOSITE_SOFTWARE_FUNCTION__ASSIGNED_REQUIREMENTS = Functional_design_architecturePackage.COMPOSITE_SOFTWARE_FUNCTION__ASSIGNED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Allocation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_COMPOSITE_SOFTWARE_FUNCTION__ALLOCATION = Functional_design_architecturePackage.COMPOSITE_SOFTWARE_FUNCTION__ALLOCATION;

	/**
	 * The feature id for the '<em><b>Allocation Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_COMPOSITE_SOFTWARE_FUNCTION__ALLOCATION_TARGET = Functional_design_architecturePackage.COMPOSITE_SOFTWARE_FUNCTION__ALLOCATION_TARGET;

	/**
	 * The feature id for the '<em><b>Active Realizations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_COMPOSITE_SOFTWARE_FUNCTION__ACTIVE_REALIZATIONS = Functional_design_architecturePackage.COMPOSITE_SOFTWARE_FUNCTION__ACTIVE_REALIZATIONS;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_COMPOSITE_SOFTWARE_FUNCTION__REALIZES = Functional_design_architecturePackage.COMPOSITE_SOFTWARE_FUNCTION__REALIZES;

	/**
	 * The feature id for the '<em><b>Null Variant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_COMPOSITE_SOFTWARE_FUNCTION__NULL_VARIANT = Functional_design_architecturePackage.COMPOSITE_SOFTWARE_FUNCTION__NULL_VARIANT;

	/**
	 * The feature id for the '<em><b>Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_COMPOSITE_SOFTWARE_FUNCTION__COMPLETE = Functional_design_architecturePackage.COMPOSITE_SOFTWARE_FUNCTION__COMPLETE;

	/**
	 * The feature id for the '<em><b>Active Variations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_COMPOSITE_SOFTWARE_FUNCTION__ACTIVE_VARIATIONS = Functional_design_architecturePackage.COMPOSITE_SOFTWARE_FUNCTION__ACTIVE_VARIATIONS;

	/**
	 * The feature id for the '<em><b>Active Selections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_COMPOSITE_SOFTWARE_FUNCTION__ACTIVE_SELECTIONS = Functional_design_architecturePackage.COMPOSITE_SOFTWARE_FUNCTION__ACTIVE_SELECTIONS;

	/**
	 * The feature id for the '<em><b>Active Exclusions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_COMPOSITE_SOFTWARE_FUNCTION__ACTIVE_EXCLUSIONS = Functional_design_architecturePackage.COMPOSITE_SOFTWARE_FUNCTION__ACTIVE_EXCLUSIONS;

	/**
	 * The feature id for the '<em><b>Passive Variation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_COMPOSITE_SOFTWARE_FUNCTION__PASSIVE_VARIATION = Functional_design_architecturePackage.COMPOSITE_SOFTWARE_FUNCTION__PASSIVE_VARIATION;

	/**
	 * The feature id for the '<em><b>Passive Selections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_COMPOSITE_SOFTWARE_FUNCTION__PASSIVE_SELECTIONS = Functional_design_architecturePackage.COMPOSITE_SOFTWARE_FUNCTION__PASSIVE_SELECTIONS;

	/**
	 * The feature id for the '<em><b>Passive Exclusions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_COMPOSITE_SOFTWARE_FUNCTION__PASSIVE_EXCLUSIONS = Functional_design_architecturePackage.COMPOSITE_SOFTWARE_FUNCTION__PASSIVE_EXCLUSIONS;

	/**
	 * The feature id for the '<em><b>Variation Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_COMPOSITE_SOFTWARE_FUNCTION__VARIATION_POINT = Functional_design_architecturePackage.COMPOSITE_SOFTWARE_FUNCTION__VARIATION_POINT;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_COMPOSITE_SOFTWARE_FUNCTION__VARIANTS = Functional_design_architecturePackage.COMPOSITE_SOFTWARE_FUNCTION__VARIANTS;

	/**
	 * The feature id for the '<em><b>Selectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_COMPOSITE_SOFTWARE_FUNCTION__SELECTORS = Functional_design_architecturePackage.COMPOSITE_SOFTWARE_FUNCTION__SELECTORS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_COMPOSITE_SOFTWARE_FUNCTION__SELECTED = Functional_design_architecturePackage.COMPOSITE_SOFTWARE_FUNCTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Excluders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_COMPOSITE_SOFTWARE_FUNCTION__EXCLUDERS = Functional_design_architecturePackage.COMPOSITE_SOFTWARE_FUNCTION__EXCLUDERS;

	/**
	 * The feature id for the '<em><b>Excluded</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_COMPOSITE_SOFTWARE_FUNCTION__EXCLUDED = Functional_design_architecturePackage.COMPOSITE_SOFTWARE_FUNCTION__EXCLUDED;

	/**
	 * The feature id for the '<em><b>Selection Criterion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_COMPOSITE_SOFTWARE_FUNCTION__SELECTION_CRITERION = Functional_design_architecturePackage.COMPOSITE_SOFTWARE_FUNCTION__SELECTION_CRITERION;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_COMPOSITE_SOFTWARE_FUNCTION__VALIDATORS = Functional_design_architecturePackage.COMPOSITE_SOFTWARE_FUNCTION__VALIDATORS;

	/**
	 * The feature id for the '<em><b>Elementary Software Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_COMPOSITE_SOFTWARE_FUNCTION__ELEMENTARY_SOFTWARE_FUNCTIONS = Functional_design_architecturePackage.COMPOSITE_SOFTWARE_FUNCTION__ELEMENTARY_SOFTWARE_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Composite Software Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_COMPOSITE_SOFTWARE_FUNCTION__COMPOSITE_SOFTWARE_FUNCTIONS = Functional_design_architecturePackage.COMPOSITE_SOFTWARE_FUNCTION__COMPOSITE_SOFTWARE_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_COMPOSITE_SOFTWARE_FUNCTION__PORTS = Functional_design_architecturePackage.COMPOSITE_SOFTWARE_FUNCTION__PORTS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_COMPOSITE_SOFTWARE_FUNCTION__PARAMETERS = Functional_design_architecturePackage.COMPOSITE_SOFTWARE_FUNCTION__PARAMETERS;

	/**
	 * The number of structural features of the '<em>MW Composite Software Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_COMPOSITE_SOFTWARE_FUNCTION_FEATURE_COUNT = Functional_design_architecturePackage.COMPOSITE_SOFTWARE_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.impl.MWElementarySoftwareFunctionImpl <em>MW Elementary Software Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.impl.MWElementarySoftwareFunctionImpl
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.impl.Platform_modelPackageImpl#getMWElementarySoftwareFunction()
	 * @generated
	 */
	int MW_ELEMENTARY_SOFTWARE_FUNCTION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_ELEMENTARY_SOFTWARE_FUNCTION__NAME = Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Passive Assignments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_ELEMENTARY_SOFTWARE_FUNCTION__PASSIVE_ASSIGNMENTS = Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__PASSIVE_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Assigned Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_ELEMENTARY_SOFTWARE_FUNCTION__ASSIGNED_REQUIREMENTS = Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__ASSIGNED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Active Realizations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_ELEMENTARY_SOFTWARE_FUNCTION__ACTIVE_REALIZATIONS = Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__ACTIVE_REALIZATIONS;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_ELEMENTARY_SOFTWARE_FUNCTION__REALIZES = Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__REALIZES;

	/**
	 * The feature id for the '<em><b>Null Variant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_ELEMENTARY_SOFTWARE_FUNCTION__NULL_VARIANT = Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__NULL_VARIANT;

	/**
	 * The feature id for the '<em><b>Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_ELEMENTARY_SOFTWARE_FUNCTION__COMPLETE = Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__COMPLETE;

	/**
	 * The feature id for the '<em><b>Active Variations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_ELEMENTARY_SOFTWARE_FUNCTION__ACTIVE_VARIATIONS = Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__ACTIVE_VARIATIONS;

	/**
	 * The feature id for the '<em><b>Active Selections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_ELEMENTARY_SOFTWARE_FUNCTION__ACTIVE_SELECTIONS = Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__ACTIVE_SELECTIONS;

	/**
	 * The feature id for the '<em><b>Active Exclusions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_ELEMENTARY_SOFTWARE_FUNCTION__ACTIVE_EXCLUSIONS = Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__ACTIVE_EXCLUSIONS;

	/**
	 * The feature id for the '<em><b>Passive Variation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_ELEMENTARY_SOFTWARE_FUNCTION__PASSIVE_VARIATION = Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__PASSIVE_VARIATION;

	/**
	 * The feature id for the '<em><b>Passive Selections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_ELEMENTARY_SOFTWARE_FUNCTION__PASSIVE_SELECTIONS = Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__PASSIVE_SELECTIONS;

	/**
	 * The feature id for the '<em><b>Passive Exclusions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_ELEMENTARY_SOFTWARE_FUNCTION__PASSIVE_EXCLUSIONS = Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__PASSIVE_EXCLUSIONS;

	/**
	 * The feature id for the '<em><b>Variation Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_ELEMENTARY_SOFTWARE_FUNCTION__VARIATION_POINT = Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__VARIATION_POINT;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_ELEMENTARY_SOFTWARE_FUNCTION__VARIANTS = Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__VARIANTS;

	/**
	 * The feature id for the '<em><b>Selectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_ELEMENTARY_SOFTWARE_FUNCTION__SELECTORS = Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__SELECTORS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_ELEMENTARY_SOFTWARE_FUNCTION__SELECTED = Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Excluders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_ELEMENTARY_SOFTWARE_FUNCTION__EXCLUDERS = Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__EXCLUDERS;

	/**
	 * The feature id for the '<em><b>Excluded</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_ELEMENTARY_SOFTWARE_FUNCTION__EXCLUDED = Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__EXCLUDED;

	/**
	 * The feature id for the '<em><b>Selection Criterion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_ELEMENTARY_SOFTWARE_FUNCTION__SELECTION_CRITERION = Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__SELECTION_CRITERION;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_ELEMENTARY_SOFTWARE_FUNCTION__VALIDATORS = Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__VALIDATORS;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_ELEMENTARY_SOFTWARE_FUNCTION__PORTS = Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__PORTS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_ELEMENTARY_SOFTWARE_FUNCTION__PARAMETERS = Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_ELEMENTARY_SOFTWARE_FUNCTION__INSTANCES = Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__INSTANCES;

	/**
	 * The feature id for the '<em><b>Trigger Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_ELEMENTARY_SOFTWARE_FUNCTION__TRIGGER_TYPE = Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__TRIGGER_TYPE;

	/**
	 * The feature id for the '<em><b>Trigger Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_ELEMENTARY_SOFTWARE_FUNCTION__TRIGGER_EVENT = Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__TRIGGER_EVENT;

	/**
	 * The feature id for the '<em><b>Trigger Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_ELEMENTARY_SOFTWARE_FUNCTION__TRIGGER_CONDITION = Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__TRIGGER_CONDITION;

	/**
	 * The feature id for the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_ELEMENTARY_SOFTWARE_FUNCTION__PERIOD = Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__PERIOD;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_ELEMENTARY_SOFTWARE_FUNCTION__OFFSET = Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__OFFSET;

	/**
	 * The feature id for the '<em><b>Execution Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_ELEMENTARY_SOFTWARE_FUNCTION__EXECUTION_TIME = Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__EXECUTION_TIME;

	/**
	 * The feature id for the '<em><b>Specifation Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_ELEMENTARY_SOFTWARE_FUNCTION__SPECIFATION_BEHAVIOR = Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__SPECIFATION_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Implementation Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_ELEMENTARY_SOFTWARE_FUNCTION__IMPLEMENTATION_BEHAVIOR = Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__IMPLEMENTATION_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Active Precedencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_ELEMENTARY_SOFTWARE_FUNCTION__ACTIVE_PRECEDENCIES = Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__ACTIVE_PRECEDENCIES;

	/**
	 * The feature id for the '<em><b>Passive Precedencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_ELEMENTARY_SOFTWARE_FUNCTION__PASSIVE_PRECEDENCIES = Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__PASSIVE_PRECEDENCIES;

	/**
	 * The feature id for the '<em><b>Predecessors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_ELEMENTARY_SOFTWARE_FUNCTION__PREDECESSORS = Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__PREDECESSORS;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_ELEMENTARY_SOFTWARE_FUNCTION__SUCCESSORS = Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__SUCCESSORS;

	/**
	 * The number of structural features of the '<em>MW Elementary Software Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_ELEMENTARY_SOFTWARE_FUNCTION_FEATURE_COUNT = Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.impl.SystemPortImpl <em>System Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.impl.SystemPortImpl
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.impl.Platform_modelPackageImpl#getSystemPort()
	 * @generated
	 */
	int SYSTEM_PORT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_PORT__NAME = CommonPackage.OPERATION_FUNCTION_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Passive Assignments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_PORT__PASSIVE_ASSIGNMENTS = CommonPackage.OPERATION_FUNCTION_PORT__PASSIVE_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Assigned Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_PORT__ASSIGNED_REQUIREMENTS = CommonPackage.OPERATION_FUNCTION_PORT__ASSIGNED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Provided</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_PORT__PROVIDED = CommonPackage.OPERATION_FUNCTION_PORT__PROVIDED;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_PORT__INTERFACE = CommonPackage.OPERATION_FUNCTION_PORT__INTERFACE;

	/**
	 * The feature id for the '<em><b>From Delay</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_PORT__FROM_DELAY = CommonPackage.OPERATION_FUNCTION_PORT__FROM_DELAY;

	/**
	 * The feature id for the '<em><b>Until Delay</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_PORT__UNTIL_DELAY = CommonPackage.OPERATION_FUNCTION_PORT__UNTIL_DELAY;

	/**
	 * The feature id for the '<em><b>Period Restriction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_PORT__PERIOD_RESTRICTION = CommonPackage.OPERATION_FUNCTION_PORT__PERIOD_RESTRICTION;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_PORT__OWNER = CommonPackage.OPERATION_FUNCTION_PORT__OWNER;

	/**
	 * The feature id for the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_PORT__PERIOD = CommonPackage.OPERATION_FUNCTION_PORT__PERIOD;

	/**
	 * The feature id for the '<em><b>Transfer Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_PORT__TRANSFER_TIME = CommonPackage.OPERATION_FUNCTION_PORT__TRANSFER_TIME;

	/**
	 * The number of structural features of the '<em>System Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_PORT_FEATURE_COUNT = CommonPackage.OPERATION_FUNCTION_PORT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.impl.MWLocalPortImpl <em>MW Local Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.impl.MWLocalPortImpl
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.impl.Platform_modelPackageImpl#getMWLocalPort()
	 * @generated
	 */
	int MW_LOCAL_PORT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_LOCAL_PORT__NAME = CommonPackage.SIGNAL_FUNCTION_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Passive Assignments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_LOCAL_PORT__PASSIVE_ASSIGNMENTS = CommonPackage.SIGNAL_FUNCTION_PORT__PASSIVE_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Assigned Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_LOCAL_PORT__ASSIGNED_REQUIREMENTS = CommonPackage.SIGNAL_FUNCTION_PORT__ASSIGNED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Provided</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_LOCAL_PORT__PROVIDED = CommonPackage.SIGNAL_FUNCTION_PORT__PROVIDED;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_LOCAL_PORT__INTERFACE = CommonPackage.SIGNAL_FUNCTION_PORT__INTERFACE;

	/**
	 * The feature id for the '<em><b>From Delay</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_LOCAL_PORT__FROM_DELAY = CommonPackage.SIGNAL_FUNCTION_PORT__FROM_DELAY;

	/**
	 * The feature id for the '<em><b>Until Delay</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_LOCAL_PORT__UNTIL_DELAY = CommonPackage.SIGNAL_FUNCTION_PORT__UNTIL_DELAY;

	/**
	 * The feature id for the '<em><b>Period Restriction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_LOCAL_PORT__PERIOD_RESTRICTION = CommonPackage.SIGNAL_FUNCTION_PORT__PERIOD_RESTRICTION;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_LOCAL_PORT__OWNER = CommonPackage.SIGNAL_FUNCTION_PORT__OWNER;

	/**
	 * The feature id for the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_LOCAL_PORT__PERIOD = CommonPackage.SIGNAL_FUNCTION_PORT__PERIOD;

	/**
	 * The feature id for the '<em><b>Transfer Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_LOCAL_PORT__TRANSFER_TIME = CommonPackage.SIGNAL_FUNCTION_PORT__TRANSFER_TIME;

	/**
	 * The number of structural features of the '<em>MW Local Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_LOCAL_PORT_FEATURE_COUNT = CommonPackage.SIGNAL_FUNCTION_PORT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.impl.MWRemotePortImpl <em>MW Remote Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.impl.MWRemotePortImpl
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.impl.Platform_modelPackageImpl#getMWRemotePort()
	 * @generated
	 */
	int MW_REMOTE_PORT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_REMOTE_PORT__NAME = CommonPackage.SIGNAL_FUNCTION_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Passive Assignments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_REMOTE_PORT__PASSIVE_ASSIGNMENTS = CommonPackage.SIGNAL_FUNCTION_PORT__PASSIVE_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Assigned Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_REMOTE_PORT__ASSIGNED_REQUIREMENTS = CommonPackage.SIGNAL_FUNCTION_PORT__ASSIGNED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Provided</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_REMOTE_PORT__PROVIDED = CommonPackage.SIGNAL_FUNCTION_PORT__PROVIDED;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_REMOTE_PORT__INTERFACE = CommonPackage.SIGNAL_FUNCTION_PORT__INTERFACE;

	/**
	 * The feature id for the '<em><b>From Delay</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_REMOTE_PORT__FROM_DELAY = CommonPackage.SIGNAL_FUNCTION_PORT__FROM_DELAY;

	/**
	 * The feature id for the '<em><b>Until Delay</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_REMOTE_PORT__UNTIL_DELAY = CommonPackage.SIGNAL_FUNCTION_PORT__UNTIL_DELAY;

	/**
	 * The feature id for the '<em><b>Period Restriction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_REMOTE_PORT__PERIOD_RESTRICTION = CommonPackage.SIGNAL_FUNCTION_PORT__PERIOD_RESTRICTION;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_REMOTE_PORT__OWNER = CommonPackage.SIGNAL_FUNCTION_PORT__OWNER;

	/**
	 * The feature id for the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_REMOTE_PORT__PERIOD = CommonPackage.SIGNAL_FUNCTION_PORT__PERIOD;

	/**
	 * The feature id for the '<em><b>Transfer Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_REMOTE_PORT__TRANSFER_TIME = CommonPackage.SIGNAL_FUNCTION_PORT__TRANSFER_TIME;

	/**
	 * The number of structural features of the '<em>MW Remote Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MW_REMOTE_PORT_FEATURE_COUNT = CommonPackage.SIGNAL_FUNCTION_PORT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.impl.IPCExchangerImpl <em>IPC Exchanger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.impl.IPCExchangerImpl
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.impl.Platform_modelPackageImpl#getIPCExchanger()
	 * @generated
	 */
	int IPC_EXCHANGER = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPC_EXCHANGER__NAME = CorePackage.EASTADL_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Passive Assignments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPC_EXCHANGER__PASSIVE_ASSIGNMENTS = CorePackage.EASTADL_ENTITY__PASSIVE_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Assigned Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPC_EXCHANGER__ASSIGNED_REQUIREMENTS = CorePackage.EASTADL_ENTITY__ASSIGNED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPC_EXCHANGER__SOURCE = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPC_EXCHANGER__DESTINATION = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owning Artifact</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPC_EXCHANGER__OWNING_ARTIFACT = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>IPC Exchanger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPC_EXCHANGER_FEATURE_COUNT = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.ExecutionModelKind <em>Execution Model Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.ExecutionModelKind
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.impl.Platform_modelPackageImpl#getExecutionModelKind()
	 * @generated
	 */
	int EXECUTION_MODEL_KIND = 12;


	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel <em>Platform Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Platform Model</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel
	 * @generated
	 */
	EClass getPlatformModel();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel#getAllocationModel <em>Allocation Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Allocation Model</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel#getAllocationModel()
	 * @see #getPlatformModel()
	 * @generated
	 */
	EReference getPlatformModel_AllocationModel();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel#getHardwareArchitecture <em>Hardware Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hardware Architecture</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel#getHardwareArchitecture()
	 * @see #getPlatformModel()
	 * @generated
	 */
	EReference getPlatformModel_HardwareArchitecture();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel#getDeviceDrivers <em>Device Drivers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Device Drivers</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel#getDeviceDrivers()
	 * @see #getPlatformModel()
	 * @generated
	 */
	EReference getPlatformModel_DeviceDrivers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel#getIODrivers <em>IO Drivers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>IO Drivers</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel#getIODrivers()
	 * @see #getPlatformModel()
	 * @generated
	 */
	EReference getPlatformModel_IODrivers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel#getAbstractFunctions <em>Abstract Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Functions</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel#getAbstractFunctions()
	 * @see #getPlatformModel()
	 * @generated
	 */
	EReference getPlatformModel_AbstractFunctions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel#getFrameworks <em>Frameworks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Frameworks</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel#getFrameworks()
	 * @see #getPlatformModel()
	 * @generated
	 */
	EReference getPlatformModel_Frameworks();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel#getOperatingSystems <em>Operating Systems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operating Systems</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel#getOperatingSystems()
	 * @see #getPlatformModel()
	 * @generated
	 */
	EReference getPlatformModel_OperatingSystems();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel#getCompositeSoftwareFunctions <em>Composite Software Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composite Software Functions</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel#getCompositeSoftwareFunctions()
	 * @see #getPlatformModel()
	 * @generated
	 */
	EReference getPlatformModel_CompositeSoftwareFunctions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel#getElementarySoftwareFunctions <em>Elementary Software Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elementary Software Functions</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel#getElementarySoftwareFunctions()
	 * @see #getPlatformModel()
	 * @generated
	 */
	EReference getPlatformModel_ElementarySoftwareFunctions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel#getIPCExchangers <em>IPC Exchangers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>IPC Exchangers</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel#getIPCExchangers()
	 * @see #getPlatformModel()
	 * @generated
	 */
	EReference getPlatformModel_IPCExchangers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel#getDesignDataTypes <em>Design Data Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Design Data Types</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel#getDesignDataTypes()
	 * @see #getPlatformModel()
	 * @generated
	 */
	EReference getPlatformModel_DesignDataTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel#getImplementationDataTypes <em>Implementation Data Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Implementation Data Types</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel#getImplementationDataTypes()
	 * @see #getPlatformModel()
	 * @generated
	 */
	EReference getPlatformModel_ImplementationDataTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel#getTypeAssociations <em>Type Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type Associations</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel#getTypeAssociations()
	 * @see #getPlatformModel()
	 * @generated
	 */
	EReference getPlatformModel_TypeAssociations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel#getConnectorSignals <em>Connector Signals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connector Signals</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel#getConnectorSignals()
	 * @see #getPlatformModel()
	 * @generated
	 */
	EReference getPlatformModel_ConnectorSignals();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel#getOperationCalls <em>Operation Calls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation Calls</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel#getOperationCalls()
	 * @see #getPlatformModel()
	 * @generated
	 */
	EReference getPlatformModel_OperationCalls();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.DeviceDriver <em>Device Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Driver</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.DeviceDriver
	 * @generated
	 */
	EClass getDeviceDriver();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.DeviceDriver#getConfigurationData <em>Configuration Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Configuration Data</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.DeviceDriver#getConfigurationData()
	 * @see #getDeviceDriver()
	 * @generated
	 */
	EAttribute getDeviceDriver_ConfigurationData();

	/**
	 * Returns the meta object for the container reference '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.DeviceDriver#getOwningArtifact <em>Owning Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Artifact</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.DeviceDriver#getOwningArtifact()
	 * @see #getDeviceDriver()
	 * @generated
	 */
	EReference getDeviceDriver_OwningArtifact();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.DeviceDriver#getProcessor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Processor</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.DeviceDriver#getProcessor()
	 * @see #getDeviceDriver()
	 * @generated
	 */
	EReference getDeviceDriver_Processor();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.DeviceDriver#getPeripheral <em>Peripheral</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Peripheral</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.DeviceDriver#getPeripheral()
	 * @see #getDeviceDriver()
	 * @generated
	 */
	EReference getDeviceDriver_Peripheral();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.IODriver <em>IO Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IO Driver</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.IODriver
	 * @generated
	 */
	EClass getIODriver();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.IODriver#getConfigurationData <em>Configuration Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Configuration Data</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.IODriver#getConfigurationData()
	 * @see #getIODriver()
	 * @generated
	 */
	EAttribute getIODriver_ConfigurationData();

	/**
	 * Returns the meta object for the container reference '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.IODriver#getOwningArtifact <em>Owning Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Artifact</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.IODriver#getOwningArtifact()
	 * @see #getIODriver()
	 * @generated
	 */
	EReference getIODriver_OwningArtifact();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.IODriver#getAbstraction <em>Abstraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Abstraction</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.IODriver#getAbstraction()
	 * @see #getIODriver()
	 * @generated
	 */
	EReference getIODriver_Abstraction();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.IODriver#getProcessor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Processor</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.IODriver#getProcessor()
	 * @see #getIODriver()
	 * @generated
	 */
	EReference getIODriver_Processor();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.IODriver#getPeripheral <em>Peripheral</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Peripheral</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.IODriver#getPeripheral()
	 * @see #getIODriver()
	 * @generated
	 */
	EReference getIODriver_Peripheral();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.HardwareAbstractionFunction <em>Hardware Abstraction Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Abstraction Function</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.HardwareAbstractionFunction
	 * @generated
	 */
	EClass getHardwareAbstractionFunction();

	/**
	 * Returns the meta object for the container reference '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.HardwareAbstractionFunction#getOwningArtifact <em>Owning Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Artifact</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.HardwareAbstractionFunction#getOwningArtifact()
	 * @see #getHardwareAbstractionFunction()
	 * @generated
	 */
	EReference getHardwareAbstractionFunction_OwningArtifact();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.HardwareAbstractionFunction#getDriver <em>Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Driver</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.HardwareAbstractionFunction#getDriver()
	 * @see #getHardwareAbstractionFunction()
	 * @generated
	 */
	EReference getHardwareAbstractionFunction_Driver();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.HardwareAbstractionFunction#getProvidedPort <em>Provided Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Provided Port</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.HardwareAbstractionFunction#getProvidedPort()
	 * @see #getHardwareAbstractionFunction()
	 * @generated
	 */
	EReference getHardwareAbstractionFunction_ProvidedPort();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.HardwareAbstractionFunction#getRequiredPort <em>Required Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Required Port</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.HardwareAbstractionFunction#getRequiredPort()
	 * @see #getHardwareAbstractionFunction()
	 * @generated
	 */
	EReference getHardwareAbstractionFunction_RequiredPort();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.HardwareAbstractionFunction#getAccessiblePins <em>Accessible Pins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Accessible Pins</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.HardwareAbstractionFunction#getAccessiblePins()
	 * @see #getHardwareAbstractionFunction()
	 * @generated
	 */
	EReference getHardwareAbstractionFunction_AccessiblePins();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.HardwareAbstractionFunction#getProcessor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Processor</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.HardwareAbstractionFunction#getProcessor()
	 * @see #getHardwareAbstractionFunction()
	 * @generated
	 */
	EReference getHardwareAbstractionFunction_Processor();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.OperatingSystem <em>Operating System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operating System</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.OperatingSystem
	 * @generated
	 */
	EClass getOperatingSystem();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.OperatingSystem#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.OperatingSystem#getType()
	 * @see #getOperatingSystem()
	 * @generated
	 */
	EAttribute getOperatingSystem_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.OperatingSystem#getExecutionModelType <em>Execution Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Model Type</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.OperatingSystem#getExecutionModelType()
	 * @see #getOperatingSystem()
	 * @generated
	 */
	EAttribute getOperatingSystem_ExecutionModelType();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.OperatingSystem#getBlockingFactor <em>Blocking Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Blocking Factor</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.OperatingSystem#getBlockingFactor()
	 * @see #getOperatingSystem()
	 * @generated
	 */
	EReference getOperatingSystem_BlockingFactor();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.OperatingSystem#getTaskSwitchTime <em>Task Switch Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Task Switch Time</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.OperatingSystem#getTaskSwitchTime()
	 * @see #getOperatingSystem()
	 * @generated
	 */
	EReference getOperatingSystem_TaskSwitchTime();

	/**
	 * Returns the meta object for the container reference '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.OperatingSystem#getOwningArtifact <em>Owning Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Artifact</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.OperatingSystem#getOwningArtifact()
	 * @see #getOperatingSystem()
	 * @generated
	 */
	EReference getOperatingSystem_OwningArtifact();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.OperatingSystem#getProcessor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Processor</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.OperatingSystem#getProcessor()
	 * @see #getOperatingSystem()
	 * @generated
	 */
	EReference getOperatingSystem_Processor();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.Framework <em>Framework</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Framework</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.Framework
	 * @generated
	 */
	EClass getFramework();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.Framework#getConfigurationData <em>Configuration Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Configuration Data</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.Framework#getConfigurationData()
	 * @see #getFramework()
	 * @generated
	 */
	EAttribute getFramework_ConfigurationData();

	/**
	 * Returns the meta object for the container reference '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.Framework#getOwningArtifact <em>Owning Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Artifact</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.Framework#getOwningArtifact()
	 * @see #getFramework()
	 * @generated
	 */
	EReference getFramework_OwningArtifact();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.Framework#getProcessor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Processor</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.Framework#getProcessor()
	 * @see #getFramework()
	 * @generated
	 */
	EReference getFramework_Processor();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.MWCompositeSoftwareFunction <em>MW Composite Software Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MW Composite Software Function</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.MWCompositeSoftwareFunction
	 * @generated
	 */
	EClass getMWCompositeSoftwareFunction();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.MWElementarySoftwareFunction <em>MW Elementary Software Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MW Elementary Software Function</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.MWElementarySoftwareFunction
	 * @generated
	 */
	EClass getMWElementarySoftwareFunction();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.SystemPort <em>System Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Port</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.SystemPort
	 * @generated
	 */
	EClass getSystemPort();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.MWLocalPort <em>MW Local Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MW Local Port</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.MWLocalPort
	 * @generated
	 */
	EClass getMWLocalPort();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.MWRemotePort <em>MW Remote Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MW Remote Port</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.MWRemotePort
	 * @generated
	 */
	EClass getMWRemotePort();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.IPCExchanger <em>IPC Exchanger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IPC Exchanger</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.IPCExchanger
	 * @generated
	 */
	EClass getIPCExchanger();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.IPCExchanger#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.IPCExchanger#getSource()
	 * @see #getIPCExchanger()
	 * @generated
	 */
	EReference getIPCExchanger_Source();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.IPCExchanger#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.IPCExchanger#getDestination()
	 * @see #getIPCExchanger()
	 * @generated
	 */
	EReference getIPCExchanger_Destination();

	/**
	 * Returns the meta object for the container reference '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.IPCExchanger#getOwningArtifact <em>Owning Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Artifact</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.IPCExchanger#getOwningArtifact()
	 * @see #getIPCExchanger()
	 * @generated
	 */
	EReference getIPCExchanger_OwningArtifact();

	/**
	 * Returns the meta object for enum '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.ExecutionModelKind <em>Execution Model Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Execution Model Kind</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.ExecutionModelKind
	 * @generated
	 */
	EEnum getExecutionModelKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Platform_modelFactory getPlatform_modelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.impl.PlatformModelImpl <em>Platform Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.impl.PlatformModelImpl
		 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.impl.Platform_modelPackageImpl#getPlatformModel()
		 * @generated
		 */
		EClass PLATFORM_MODEL = eINSTANCE.getPlatformModel();

		/**
		 * The meta object literal for the '<em><b>Allocation Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM_MODEL__ALLOCATION_MODEL = eINSTANCE.getPlatformModel_AllocationModel();

		/**
		 * The meta object literal for the '<em><b>Hardware Architecture</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM_MODEL__HARDWARE_ARCHITECTURE = eINSTANCE.getPlatformModel_HardwareArchitecture();

		/**
		 * The meta object literal for the '<em><b>Device Drivers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM_MODEL__DEVICE_DRIVERS = eINSTANCE.getPlatformModel_DeviceDrivers();

		/**
		 * The meta object literal for the '<em><b>IO Drivers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM_MODEL__IO_DRIVERS = eINSTANCE.getPlatformModel_IODrivers();

		/**
		 * The meta object literal for the '<em><b>Abstract Functions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM_MODEL__ABSTRACT_FUNCTIONS = eINSTANCE.getPlatformModel_AbstractFunctions();

		/**
		 * The meta object literal for the '<em><b>Frameworks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM_MODEL__FRAMEWORKS = eINSTANCE.getPlatformModel_Frameworks();

		/**
		 * The meta object literal for the '<em><b>Operating Systems</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM_MODEL__OPERATING_SYSTEMS = eINSTANCE.getPlatformModel_OperatingSystems();

		/**
		 * The meta object literal for the '<em><b>Composite Software Functions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM_MODEL__COMPOSITE_SOFTWARE_FUNCTIONS = eINSTANCE.getPlatformModel_CompositeSoftwareFunctions();

		/**
		 * The meta object literal for the '<em><b>Elementary Software Functions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM_MODEL__ELEMENTARY_SOFTWARE_FUNCTIONS = eINSTANCE.getPlatformModel_ElementarySoftwareFunctions();

		/**
		 * The meta object literal for the '<em><b>IPC Exchangers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM_MODEL__IPC_EXCHANGERS = eINSTANCE.getPlatformModel_IPCExchangers();

		/**
		 * The meta object literal for the '<em><b>Design Data Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM_MODEL__DESIGN_DATA_TYPES = eINSTANCE.getPlatformModel_DesignDataTypes();

		/**
		 * The meta object literal for the '<em><b>Implementation Data Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM_MODEL__IMPLEMENTATION_DATA_TYPES = eINSTANCE.getPlatformModel_ImplementationDataTypes();

		/**
		 * The meta object literal for the '<em><b>Type Associations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM_MODEL__TYPE_ASSOCIATIONS = eINSTANCE.getPlatformModel_TypeAssociations();

		/**
		 * The meta object literal for the '<em><b>Connector Signals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM_MODEL__CONNECTOR_SIGNALS = eINSTANCE.getPlatformModel_ConnectorSignals();

		/**
		 * The meta object literal for the '<em><b>Operation Calls</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM_MODEL__OPERATION_CALLS = eINSTANCE.getPlatformModel_OperationCalls();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.impl.DeviceDriverImpl <em>Device Driver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.impl.DeviceDriverImpl
		 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.impl.Platform_modelPackageImpl#getDeviceDriver()
		 * @generated
		 */
		EClass DEVICE_DRIVER = eINSTANCE.getDeviceDriver();

		/**
		 * The meta object literal for the '<em><b>Configuration Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_DRIVER__CONFIGURATION_DATA = eINSTANCE.getDeviceDriver_ConfigurationData();

		/**
		 * The meta object literal for the '<em><b>Owning Artifact</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_DRIVER__OWNING_ARTIFACT = eINSTANCE.getDeviceDriver_OwningArtifact();

		/**
		 * The meta object literal for the '<em><b>Processor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_DRIVER__PROCESSOR = eINSTANCE.getDeviceDriver_Processor();

		/**
		 * The meta object literal for the '<em><b>Peripheral</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_DRIVER__PERIPHERAL = eINSTANCE.getDeviceDriver_Peripheral();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.impl.IODriverImpl <em>IO Driver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.impl.IODriverImpl
		 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.impl.Platform_modelPackageImpl#getIODriver()
		 * @generated
		 */
		EClass IO_DRIVER = eINSTANCE.getIODriver();

		/**
		 * The meta object literal for the '<em><b>Configuration Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IO_DRIVER__CONFIGURATION_DATA = eINSTANCE.getIODriver_ConfigurationData();

		/**
		 * The meta object literal for the '<em><b>Owning Artifact</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IO_DRIVER__OWNING_ARTIFACT = eINSTANCE.getIODriver_OwningArtifact();

		/**
		 * The meta object literal for the '<em><b>Abstraction</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IO_DRIVER__ABSTRACTION = eINSTANCE.getIODriver_Abstraction();

		/**
		 * The meta object literal for the '<em><b>Processor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IO_DRIVER__PROCESSOR = eINSTANCE.getIODriver_Processor();

		/**
		 * The meta object literal for the '<em><b>Peripheral</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IO_DRIVER__PERIPHERAL = eINSTANCE.getIODriver_Peripheral();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.impl.HardwareAbstractionFunctionImpl <em>Hardware Abstraction Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.impl.HardwareAbstractionFunctionImpl
		 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.impl.Platform_modelPackageImpl#getHardwareAbstractionFunction()
		 * @generated
		 */
		EClass HARDWARE_ABSTRACTION_FUNCTION = eINSTANCE.getHardwareAbstractionFunction();

		/**
		 * The meta object literal for the '<em><b>Owning Artifact</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_ABSTRACTION_FUNCTION__OWNING_ARTIFACT = eINSTANCE.getHardwareAbstractionFunction_OwningArtifact();

		/**
		 * The meta object literal for the '<em><b>Driver</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_ABSTRACTION_FUNCTION__DRIVER = eINSTANCE.getHardwareAbstractionFunction_Driver();

		/**
		 * The meta object literal for the '<em><b>Provided Port</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_ABSTRACTION_FUNCTION__PROVIDED_PORT = eINSTANCE.getHardwareAbstractionFunction_ProvidedPort();

		/**
		 * The meta object literal for the '<em><b>Required Port</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_ABSTRACTION_FUNCTION__REQUIRED_PORT = eINSTANCE.getHardwareAbstractionFunction_RequiredPort();

		/**
		 * The meta object literal for the '<em><b>Accessible Pins</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_ABSTRACTION_FUNCTION__ACCESSIBLE_PINS = eINSTANCE.getHardwareAbstractionFunction_AccessiblePins();

		/**
		 * The meta object literal for the '<em><b>Processor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_ABSTRACTION_FUNCTION__PROCESSOR = eINSTANCE.getHardwareAbstractionFunction_Processor();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.impl.OperatingSystemImpl <em>Operating System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.impl.OperatingSystemImpl
		 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.impl.Platform_modelPackageImpl#getOperatingSystem()
		 * @generated
		 */
		EClass OPERATING_SYSTEM = eINSTANCE.getOperatingSystem();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATING_SYSTEM__TYPE = eINSTANCE.getOperatingSystem_Type();

		/**
		 * The meta object literal for the '<em><b>Execution Model Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATING_SYSTEM__EXECUTION_MODEL_TYPE = eINSTANCE.getOperatingSystem_ExecutionModelType();

		/**
		 * The meta object literal for the '<em><b>Blocking Factor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATING_SYSTEM__BLOCKING_FACTOR = eINSTANCE.getOperatingSystem_BlockingFactor();

		/**
		 * The meta object literal for the '<em><b>Task Switch Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATING_SYSTEM__TASK_SWITCH_TIME = eINSTANCE.getOperatingSystem_TaskSwitchTime();

		/**
		 * The meta object literal for the '<em><b>Owning Artifact</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATING_SYSTEM__OWNING_ARTIFACT = eINSTANCE.getOperatingSystem_OwningArtifact();

		/**
		 * The meta object literal for the '<em><b>Processor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATING_SYSTEM__PROCESSOR = eINSTANCE.getOperatingSystem_Processor();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.impl.FrameworkImpl <em>Framework</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.impl.FrameworkImpl
		 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.impl.Platform_modelPackageImpl#getFramework()
		 * @generated
		 */
		EClass FRAMEWORK = eINSTANCE.getFramework();

		/**
		 * The meta object literal for the '<em><b>Configuration Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRAMEWORK__CONFIGURATION_DATA = eINSTANCE.getFramework_ConfigurationData();

		/**
		 * The meta object literal for the '<em><b>Owning Artifact</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRAMEWORK__OWNING_ARTIFACT = eINSTANCE.getFramework_OwningArtifact();

		/**
		 * The meta object literal for the '<em><b>Processor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRAMEWORK__PROCESSOR = eINSTANCE.getFramework_Processor();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.impl.MWCompositeSoftwareFunctionImpl <em>MW Composite Software Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.impl.MWCompositeSoftwareFunctionImpl
		 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.impl.Platform_modelPackageImpl#getMWCompositeSoftwareFunction()
		 * @generated
		 */
		EClass MW_COMPOSITE_SOFTWARE_FUNCTION = eINSTANCE.getMWCompositeSoftwareFunction();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.impl.MWElementarySoftwareFunctionImpl <em>MW Elementary Software Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.impl.MWElementarySoftwareFunctionImpl
		 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.impl.Platform_modelPackageImpl#getMWElementarySoftwareFunction()
		 * @generated
		 */
		EClass MW_ELEMENTARY_SOFTWARE_FUNCTION = eINSTANCE.getMWElementarySoftwareFunction();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.impl.SystemPortImpl <em>System Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.impl.SystemPortImpl
		 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.impl.Platform_modelPackageImpl#getSystemPort()
		 * @generated
		 */
		EClass SYSTEM_PORT = eINSTANCE.getSystemPort();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.impl.MWLocalPortImpl <em>MW Local Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.impl.MWLocalPortImpl
		 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.impl.Platform_modelPackageImpl#getMWLocalPort()
		 * @generated
		 */
		EClass MW_LOCAL_PORT = eINSTANCE.getMWLocalPort();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.impl.MWRemotePortImpl <em>MW Remote Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.impl.MWRemotePortImpl
		 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.impl.Platform_modelPackageImpl#getMWRemotePort()
		 * @generated
		 */
		EClass MW_REMOTE_PORT = eINSTANCE.getMWRemotePort();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.impl.IPCExchangerImpl <em>IPC Exchanger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.impl.IPCExchangerImpl
		 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.impl.Platform_modelPackageImpl#getIPCExchanger()
		 * @generated
		 */
		EClass IPC_EXCHANGER = eINSTANCE.getIPCExchanger();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IPC_EXCHANGER__SOURCE = eINSTANCE.getIPCExchanger_Source();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IPC_EXCHANGER__DESTINATION = eINSTANCE.getIPCExchanger_Destination();

		/**
		 * The meta object literal for the '<em><b>Owning Artifact</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IPC_EXCHANGER__OWNING_ARTIFACT = eINSTANCE.getIPCExchanger_OwningArtifact();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.ExecutionModelKind <em>Execution Model Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.ExecutionModelKind
		 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.impl.Platform_modelPackageImpl#getExecutionModelKind()
		 * @generated
		 */
		EEnum EXECUTION_MODEL_KIND = eINSTANCE.getExecutionModelKind();

	}

} //Platform_modelPackage
