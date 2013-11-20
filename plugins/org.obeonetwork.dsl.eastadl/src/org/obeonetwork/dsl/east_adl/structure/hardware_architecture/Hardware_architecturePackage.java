/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.hardware_architecture;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.obeonetwork.dsl.east_adl.core.CorePackage;

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
 * This package contains the entities of the HWA artifact. The goal here is to describe physical entities of the embedded system.
 * <!-- end-model-doc -->
 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architectureFactory
 * @model kind="package"
 * @generated
 */
public interface Hardware_architecturePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "hardware_architecture";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.topcased.org/0.11.0/east_adl/structure/hardware_architecture";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hardware_architecture";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Hardware_architecturePackage eINSTANCE = org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.Hardware_architecturePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.HardwareArchitectureImpl <em>Hardware Architecture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.HardwareArchitectureImpl
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.Hardware_architecturePackageImpl#getHardwareArchitecture()
	 * @generated
	 */
	int HARDWARE_ARCHITECTURE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ARCHITECTURE__NAME = CorePackage.EASTADL_ARTIFACT__NAME;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ARCHITECTURE__REQUIREMENTS = CorePackage.EASTADL_ARTIFACT__REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ARCHITECTURE__MODEL = CorePackage.EASTADL_ARTIFACT__MODEL;

	/**
	 * The feature id for the '<em><b>Support Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ARCHITECTURE__SUPPORT_ENTITIES = CorePackage.EASTADL_ARTIFACT__SUPPORT_ENTITIES;

	/**
	 * The feature id for the '<em><b>Validation Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ARCHITECTURE__VALIDATION_ENTITIES = CorePackage.EASTADL_ARTIFACT__VALIDATION_ENTITIES;

	/**
	 * The feature id for the '<em><b>Platform Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ARCHITECTURE__PLATFORM_MODEL = CorePackage.EASTADL_ARTIFACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hardware Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ARCHITECTURE__HARDWARE_ENTITIES = CorePackage.EASTADL_ARTIFACT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Electrical Signals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ARCHITECTURE__ELECTRICAL_SIGNALS = CorePackage.EASTADL_ARTIFACT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Wires</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ARCHITECTURE__WIRES = CorePackage.EASTADL_ARTIFACT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Design Architecture</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ARCHITECTURE__DESIGN_ARCHITECTURE = CorePackage.EASTADL_ARTIFACT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Hardware Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ARCHITECTURE_FEATURE_COUNT = CorePackage.EASTADL_ARTIFACT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.HardwareEntityImpl <em>Hardware Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.HardwareEntityImpl
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.Hardware_architecturePackageImpl#getHardwareEntity()
	 * @generated
	 */
	int HARDWARE_ENTITY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ENTITY__NAME = CorePackage.EASTADL_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Passive Assignments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ENTITY__PASSIVE_ASSIGNMENTS = CorePackage.EASTADL_ENTITY__PASSIVE_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Assigned Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ENTITY__ASSIGNED_REQUIREMENTS = CorePackage.EASTADL_ENTITY__ASSIGNED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ENTITY__VALIDATORS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ENTITY__DESCRIPTION = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Technical Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ENTITY__TECHNICAL_SPECIFICATION = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Hardware Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_ENTITY_FEATURE_COUNT = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.ECUImpl <em>ECU</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.ECUImpl
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.Hardware_architecturePackageImpl#getECU()
	 * @generated
	 */
	int ECU = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU__NAME = HARDWARE_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Passive Assignments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU__PASSIVE_ASSIGNMENTS = HARDWARE_ENTITY__PASSIVE_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Assigned Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU__ASSIGNED_REQUIREMENTS = HARDWARE_ENTITY__ASSIGNED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU__VALIDATORS = HARDWARE_ENTITY__VALIDATORS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU__DESCRIPTION = HARDWARE_ENTITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Technical Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU__TECHNICAL_SPECIFICATION = HARDWARE_ENTITY__TECHNICAL_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Processors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU__PROCESSORS = HARDWARE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU__MEMORY = HARDWARE_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Channels</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU__CHANNELS = HARDWARE_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Peripherals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU__PERIPHERALS = HARDWARE_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU__PINS = HARDWARE_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Allocations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU__ALLOCATIONS = HARDWARE_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Allocated Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU__ALLOCATED_ENTITIES = HARDWARE_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>ECU</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU_FEATURE_COUNT = HARDWARE_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.ProcessorImpl <em>Processor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.ProcessorImpl
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.Hardware_architecturePackageImpl#getProcessor()
	 * @generated
	 */
	int PROCESSOR = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__NAME = HARDWARE_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Passive Assignments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__PASSIVE_ASSIGNMENTS = HARDWARE_ENTITY__PASSIVE_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Assigned Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__ASSIGNED_REQUIREMENTS = HARDWARE_ENTITY__ASSIGNED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__VALIDATORS = HARDWARE_ENTITY__VALIDATORS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__DESCRIPTION = HARDWARE_ENTITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Technical Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__TECHNICAL_SPECIFICATION = HARDWARE_ENTITY__TECHNICAL_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__TYPE = HARDWARE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__FREQUENCY = HARDWARE_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Frequency Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__FREQUENCY_UNIT = HARDWARE_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owning ECU</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__OWNING_ECU = HARDWARE_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Used Memory</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__USED_MEMORY = HARDWARE_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__TASKS = HARDWARE_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>IO Drivers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__IO_DRIVERS = HARDWARE_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Device Drivers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__DEVICE_DRIVERS = HARDWARE_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Frameworks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__FRAMEWORKS = HARDWARE_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Operating Systems</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__OPERATING_SYSTEMS = HARDWARE_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Type Associations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__TYPE_ASSOCIATIONS = HARDWARE_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Hardware Abstractions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__HARDWARE_ABSTRACTIONS = HARDWARE_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Peripherals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__PERIPHERALS = HARDWARE_ENTITY_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_FEATURE_COUNT = HARDWARE_ENTITY_FEATURE_COUNT + 13;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.MemoryImpl <em>Memory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.MemoryImpl
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.Hardware_architecturePackageImpl#getMemory()
	 * @generated
	 */
	int MEMORY = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__NAME = HARDWARE_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Passive Assignments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__PASSIVE_ASSIGNMENTS = HARDWARE_ENTITY__PASSIVE_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Assigned Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__ASSIGNED_REQUIREMENTS = HARDWARE_ENTITY__ASSIGNED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__VALIDATORS = HARDWARE_ENTITY__VALIDATORS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__DESCRIPTION = HARDWARE_ENTITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Technical Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__TECHNICAL_SPECIFICATION = HARDWARE_ENTITY__TECHNICAL_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Memory Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__MEMORY_TYPE = HARDWARE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__SIZE = HARDWARE_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owning ECU</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__OWNING_ECU = HARDWARE_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Using Processors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__USING_PROCESSORS = HARDWARE_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Memory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_FEATURE_COUNT = HARDWARE_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.PeripheralImpl <em>Peripheral</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.PeripheralImpl
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.Hardware_architecturePackageImpl#getPeripheral()
	 * @generated
	 */
	int PERIPHERAL = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIPHERAL__NAME = HARDWARE_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Passive Assignments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIPHERAL__PASSIVE_ASSIGNMENTS = HARDWARE_ENTITY__PASSIVE_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Assigned Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIPHERAL__ASSIGNED_REQUIREMENTS = HARDWARE_ENTITY__ASSIGNED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIPHERAL__VALIDATORS = HARDWARE_ENTITY__VALIDATORS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIPHERAL__DESCRIPTION = HARDWARE_ENTITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Technical Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIPHERAL__TECHNICAL_SPECIFICATION = HARDWARE_ENTITY__TECHNICAL_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIPHERAL__TYPE = HARDWARE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning ECU</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIPHERAL__OWNING_ECU = HARDWARE_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIPHERAL__PINS = HARDWARE_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Device Drivers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIPHERAL__DEVICE_DRIVERS = HARDWARE_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>IO Drivers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIPHERAL__IO_DRIVERS = HARDWARE_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Processors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIPHERAL__PROCESSORS = HARDWARE_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Peripheral</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIPHERAL_FEATURE_COUNT = HARDWARE_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.ElectricalSignalImpl <em>Electrical Signal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.ElectricalSignalImpl
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.Hardware_architecturePackageImpl#getElectricalSignal()
	 * @generated
	 */
	int ELECTRICAL_SIGNAL = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_SIGNAL__NAME = CorePackage.EASTADL_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Passive Assignments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_SIGNAL__PASSIVE_ASSIGNMENTS = CorePackage.EASTADL_ENTITY__PASSIVE_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Assigned Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_SIGNAL__ASSIGNED_REQUIREMENTS = CorePackage.EASTADL_ENTITY__ASSIGNED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Minimum Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_SIGNAL__MINIMUM_VOLTAGE = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Maximum Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_SIGNAL__MAXIMUM_VOLTAGE = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Typed Pins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_SIGNAL__TYPED_PINS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owning Artifact</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_SIGNAL__OWNING_ARTIFACT = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Electrical Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_SIGNAL_FEATURE_COUNT = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.DigitalSignalImpl <em>Digital Signal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.DigitalSignalImpl
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.Hardware_architecturePackageImpl#getDigitalSignal()
	 * @generated
	 */
	int DIGITAL_SIGNAL = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_SIGNAL__NAME = ELECTRICAL_SIGNAL__NAME;

	/**
	 * The feature id for the '<em><b>Passive Assignments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_SIGNAL__PASSIVE_ASSIGNMENTS = ELECTRICAL_SIGNAL__PASSIVE_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Assigned Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_SIGNAL__ASSIGNED_REQUIREMENTS = ELECTRICAL_SIGNAL__ASSIGNED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Minimum Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_SIGNAL__MINIMUM_VOLTAGE = ELECTRICAL_SIGNAL__MINIMUM_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Maximum Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_SIGNAL__MAXIMUM_VOLTAGE = ELECTRICAL_SIGNAL__MAXIMUM_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Typed Pins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_SIGNAL__TYPED_PINS = ELECTRICAL_SIGNAL__TYPED_PINS;

	/**
	 * The feature id for the '<em><b>Owning Artifact</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_SIGNAL__OWNING_ARTIFACT = ELECTRICAL_SIGNAL__OWNING_ARTIFACT;

	/**
	 * The feature id for the '<em><b>Minimum Maximum Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_SIGNAL__MINIMUM_MAXIMUM_VOLTAGE = ELECTRICAL_SIGNAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Maximum Minimum Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_SIGNAL__MAXIMUM_MINIMUM_VOLTAGE = ELECTRICAL_SIGNAL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Digital Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_SIGNAL_FEATURE_COUNT = ELECTRICAL_SIGNAL_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.AnalogSignalImpl <em>Analog Signal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.AnalogSignalImpl
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.Hardware_architecturePackageImpl#getAnalogSignal()
	 * @generated
	 */
	int ANALOG_SIGNAL = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_SIGNAL__NAME = ELECTRICAL_SIGNAL__NAME;

	/**
	 * The feature id for the '<em><b>Passive Assignments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_SIGNAL__PASSIVE_ASSIGNMENTS = ELECTRICAL_SIGNAL__PASSIVE_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Assigned Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_SIGNAL__ASSIGNED_REQUIREMENTS = ELECTRICAL_SIGNAL__ASSIGNED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Minimum Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_SIGNAL__MINIMUM_VOLTAGE = ELECTRICAL_SIGNAL__MINIMUM_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Maximum Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_SIGNAL__MAXIMUM_VOLTAGE = ELECTRICAL_SIGNAL__MAXIMUM_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Typed Pins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_SIGNAL__TYPED_PINS = ELECTRICAL_SIGNAL__TYPED_PINS;

	/**
	 * The feature id for the '<em><b>Owning Artifact</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_SIGNAL__OWNING_ARTIFACT = ELECTRICAL_SIGNAL__OWNING_ARTIFACT;

	/**
	 * The number of structural features of the '<em>Analog Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_SIGNAL_FEATURE_COUNT = ELECTRICAL_SIGNAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.PWMSignalImpl <em>PWM Signal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.PWMSignalImpl
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.Hardware_architecturePackageImpl#getPWMSignal()
	 * @generated
	 */
	int PWM_SIGNAL = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PWM_SIGNAL__NAME = ELECTRICAL_SIGNAL__NAME;

	/**
	 * The feature id for the '<em><b>Passive Assignments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PWM_SIGNAL__PASSIVE_ASSIGNMENTS = ELECTRICAL_SIGNAL__PASSIVE_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Assigned Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PWM_SIGNAL__ASSIGNED_REQUIREMENTS = ELECTRICAL_SIGNAL__ASSIGNED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Minimum Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PWM_SIGNAL__MINIMUM_VOLTAGE = ELECTRICAL_SIGNAL__MINIMUM_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Maximum Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PWM_SIGNAL__MAXIMUM_VOLTAGE = ELECTRICAL_SIGNAL__MAXIMUM_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Typed Pins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PWM_SIGNAL__TYPED_PINS = ELECTRICAL_SIGNAL__TYPED_PINS;

	/**
	 * The feature id for the '<em><b>Owning Artifact</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PWM_SIGNAL__OWNING_ARTIFACT = ELECTRICAL_SIGNAL__OWNING_ARTIFACT;

	/**
	 * The feature id for the '<em><b>Minimum Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PWM_SIGNAL__MINIMUM_FREQUENCY = ELECTRICAL_SIGNAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Maximum Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PWM_SIGNAL__MAXIMUM_FREQUENCY = ELECTRICAL_SIGNAL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Minimum Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PWM_SIGNAL__MINIMUM_WIDTH = ELECTRICAL_SIGNAL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Maximum Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PWM_SIGNAL__MAXIMUM_WIDTH = ELECTRICAL_SIGNAL_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>PWM Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PWM_SIGNAL_FEATURE_COUNT = ELECTRICAL_SIGNAL_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.ChannelImpl <em>Channel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.ChannelImpl
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.Hardware_architecturePackageImpl#getChannel()
	 * @generated
	 */
	int CHANNEL = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__NAME = HARDWARE_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Passive Assignments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__PASSIVE_ASSIGNMENTS = HARDWARE_ENTITY__PASSIVE_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Assigned Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__ASSIGNED_REQUIREMENTS = HARDWARE_ENTITY__ASSIGNED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__VALIDATORS = HARDWARE_ENTITY__VALIDATORS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__DESCRIPTION = HARDWARE_ENTITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Technical Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__TECHNICAL_SPECIFICATION = HARDWARE_ENTITY__TECHNICAL_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__PROTOCOL = HARDWARE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Channel Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__CHANNEL_TYPE = HARDWARE_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Connected Sensors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__CONNECTED_SENSORS = HARDWARE_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Connected Actuators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__CONNECTED_ACTUATORS = HARDWARE_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Connected EC Us</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__CONNECTED_EC_US = HARDWARE_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Frames</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__FRAMES = HARDWARE_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_FEATURE_COUNT = HARDWARE_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.WireImpl <em>Wire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.WireImpl
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.Hardware_architecturePackageImpl#getWire()
	 * @generated
	 */
	int WIRE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE__NAME = CorePackage.EASTADL_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Passive Assignments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE__PASSIVE_ASSIGNMENTS = CorePackage.EASTADL_ENTITY__PASSIVE_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Assigned Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE__ASSIGNED_REQUIREMENTS = CorePackage.EASTADL_ENTITY__ASSIGNED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE__SOURCE = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE__DESTINATION = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owning Artifact</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE__OWNING_ARTIFACT = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Wire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_FEATURE_COUNT = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.PinImpl <em>Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.PinImpl
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.Hardware_architecturePackageImpl#getPin()
	 * @generated
	 */
	int PIN = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__NAME = CorePackage.EASTADL_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Passive Assignments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__PASSIVE_ASSIGNMENTS = CorePackage.EASTADL_ENTITY__PASSIVE_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Assigned Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__ASSIGNED_REQUIREMENTS = CorePackage.EASTADL_ENTITY__ASSIGNED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Outgoing Wires</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__OUTGOING_WIRES = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Incoming Wires</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__INCOMING_WIRES = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Physical Meaning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__PHYSICAL_MEANING = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Direction Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__DIRECTION_TYPE = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__TYPE = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Owning Hardware</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__OWNING_HARDWARE = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Abstract Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__ABSTRACT_INTERFACES = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_FEATURE_COUNT = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.SensorImpl
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.Hardware_architecturePackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__NAME = HARDWARE_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Passive Assignments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__PASSIVE_ASSIGNMENTS = HARDWARE_ENTITY__PASSIVE_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Assigned Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__ASSIGNED_REQUIREMENTS = HARDWARE_ENTITY__ASSIGNED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__VALIDATORS = HARDWARE_ENTITY__VALIDATORS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__DESCRIPTION = HARDWARE_ENTITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Technical Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__TECHNICAL_SPECIFICATION = HARDWARE_ENTITY__TECHNICAL_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Active Realizations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__ACTIVE_REALIZATIONS = HARDWARE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__REALIZES = HARDWARE_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__QUANTITY = HARDWARE_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Channels</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__CHANNELS = HARDWARE_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sensor Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__SENSOR_MODEL = HARDWARE_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__PINS = HARDWARE_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = HARDWARE_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.ActuatorImpl <em>Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.ActuatorImpl
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.Hardware_architecturePackageImpl#getActuator()
	 * @generated
	 */
	int ACTUATOR = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__NAME = HARDWARE_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Passive Assignments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__PASSIVE_ASSIGNMENTS = HARDWARE_ENTITY__PASSIVE_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Assigned Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__ASSIGNED_REQUIREMENTS = HARDWARE_ENTITY__ASSIGNED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__VALIDATORS = HARDWARE_ENTITY__VALIDATORS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__DESCRIPTION = HARDWARE_ENTITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Technical Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__TECHNICAL_SPECIFICATION = HARDWARE_ENTITY__TECHNICAL_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Active Realizations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__ACTIVE_REALIZATIONS = HARDWARE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__REALIZES = HARDWARE_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__QUANTITY = HARDWARE_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Channels</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__CHANNELS = HARDWARE_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Actuator Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__ACTUATOR_MODEL = HARDWARE_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__PINS = HARDWARE_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_FEATURE_COUNT = HARDWARE_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.ICUSignalImpl <em>ICU Signal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.ICUSignalImpl
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.Hardware_architecturePackageImpl#getICUSignal()
	 * @generated
	 */
	int ICU_SIGNAL = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICU_SIGNAL__NAME = PWM_SIGNAL__NAME;

	/**
	 * The feature id for the '<em><b>Passive Assignments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICU_SIGNAL__PASSIVE_ASSIGNMENTS = PWM_SIGNAL__PASSIVE_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Assigned Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICU_SIGNAL__ASSIGNED_REQUIREMENTS = PWM_SIGNAL__ASSIGNED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Minimum Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICU_SIGNAL__MINIMUM_VOLTAGE = PWM_SIGNAL__MINIMUM_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Maximum Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICU_SIGNAL__MAXIMUM_VOLTAGE = PWM_SIGNAL__MAXIMUM_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Typed Pins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICU_SIGNAL__TYPED_PINS = PWM_SIGNAL__TYPED_PINS;

	/**
	 * The feature id for the '<em><b>Owning Artifact</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICU_SIGNAL__OWNING_ARTIFACT = PWM_SIGNAL__OWNING_ARTIFACT;

	/**
	 * The feature id for the '<em><b>Minimum Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICU_SIGNAL__MINIMUM_FREQUENCY = PWM_SIGNAL__MINIMUM_FREQUENCY;

	/**
	 * The feature id for the '<em><b>Maximum Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICU_SIGNAL__MAXIMUM_FREQUENCY = PWM_SIGNAL__MAXIMUM_FREQUENCY;

	/**
	 * The feature id for the '<em><b>Minimum Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICU_SIGNAL__MINIMUM_WIDTH = PWM_SIGNAL__MINIMUM_WIDTH;

	/**
	 * The feature id for the '<em><b>Maximum Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICU_SIGNAL__MAXIMUM_WIDTH = PWM_SIGNAL__MAXIMUM_WIDTH;

	/**
	 * The feature id for the '<em><b>Measurement Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICU_SIGNAL__MEASUREMENT_MODE = PWM_SIGNAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Start Edge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICU_SIGNAL__DEFAULT_START_EDGE = PWM_SIGNAL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Additional Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICU_SIGNAL__ADDITIONAL_DATA = PWM_SIGNAL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>ICU Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICU_SIGNAL_FEATURE_COUNT = PWM_SIGNAL_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.MemoryKind <em>Memory Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.MemoryKind
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.Hardware_architecturePackageImpl#getMemoryKind()
	 * @generated
	 */
	int MEMORY_KIND = 16;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ChannelKind <em>Channel Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ChannelKind
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.Hardware_architecturePackageImpl#getChannelKind()
	 * @generated
	 */
	int CHANNEL_KIND = 17;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ICUMeasurementKind <em>ICU Measurement Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ICUMeasurementKind
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.Hardware_architecturePackageImpl#getICUMeasurementKind()
	 * @generated
	 */
	int ICU_MEASUREMENT_KIND = 18;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.EdgeKind <em>Edge Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.EdgeKind
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.Hardware_architecturePackageImpl#getEdgeKind()
	 * @generated
	 */
	int EDGE_KIND = 19;


	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.HardwareArchitecture <em>Hardware Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Architecture</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.HardwareArchitecture
	 * @generated
	 */
	EClass getHardwareArchitecture();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.HardwareArchitecture#getPlatformModel <em>Platform Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Platform Model</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.HardwareArchitecture#getPlatformModel()
	 * @see #getHardwareArchitecture()
	 * @generated
	 */
	EReference getHardwareArchitecture_PlatformModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.HardwareArchitecture#getHardwareEntities <em>Hardware Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hardware Entities</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.HardwareArchitecture#getHardwareEntities()
	 * @see #getHardwareArchitecture()
	 * @generated
	 */
	EReference getHardwareArchitecture_HardwareEntities();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.HardwareArchitecture#getElectricalSignals <em>Electrical Signals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Electrical Signals</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.HardwareArchitecture#getElectricalSignals()
	 * @see #getHardwareArchitecture()
	 * @generated
	 */
	EReference getHardwareArchitecture_ElectricalSignals();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.HardwareArchitecture#getWires <em>Wires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Wires</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.HardwareArchitecture#getWires()
	 * @see #getHardwareArchitecture()
	 * @generated
	 */
	EReference getHardwareArchitecture_Wires();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.HardwareArchitecture#getDesignArchitecture <em>Design Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Design Architecture</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.HardwareArchitecture#getDesignArchitecture()
	 * @see #getHardwareArchitecture()
	 * @generated
	 */
	EReference getHardwareArchitecture_DesignArchitecture();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.HardwareEntity <em>Hardware Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Entity</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.HardwareEntity
	 * @generated
	 */
	EClass getHardwareEntity();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.HardwareEntity#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.HardwareEntity#getDescription()
	 * @see #getHardwareEntity()
	 * @generated
	 */
	EAttribute getHardwareEntity_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.HardwareEntity#getTechnicalSpecification <em>Technical Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Technical Specification</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.HardwareEntity#getTechnicalSpecification()
	 * @see #getHardwareEntity()
	 * @generated
	 */
	EAttribute getHardwareEntity_TechnicalSpecification();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ECU <em>ECU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ECU</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ECU
	 * @generated
	 */
	EClass getECU();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ECU#getProcessors <em>Processors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Processors</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ECU#getProcessors()
	 * @see #getECU()
	 * @generated
	 */
	EReference getECU_Processors();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ECU#getMemory <em>Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Memory</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ECU#getMemory()
	 * @see #getECU()
	 * @generated
	 */
	EReference getECU_Memory();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ECU#getChannels <em>Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Channels</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ECU#getChannels()
	 * @see #getECU()
	 * @generated
	 */
	EReference getECU_Channels();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ECU#getPeripherals <em>Peripherals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Peripherals</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ECU#getPeripherals()
	 * @see #getECU()
	 * @generated
	 */
	EReference getECU_Peripherals();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ECU#getPins <em>Pins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pins</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ECU#getPins()
	 * @see #getECU()
	 * @generated
	 */
	EReference getECU_Pins();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ECU#getAllocations <em>Allocations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allocations</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ECU#getAllocations()
	 * @see #getECU()
	 * @generated
	 */
	EReference getECU_Allocations();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ECU#getAllocatedEntities <em>Allocated Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allocated Entities</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ECU#getAllocatedEntities()
	 * @see #getECU()
	 * @generated
	 */
	EReference getECU_AllocatedEntities();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processor</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor
	 * @generated
	 */
	EClass getProcessor();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor#getType()
	 * @see #getProcessor()
	 * @generated
	 */
	EAttribute getProcessor_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frequency</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor#getFrequency()
	 * @see #getProcessor()
	 * @generated
	 */
	EAttribute getProcessor_Frequency();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor#getFrequencyUnit <em>Frequency Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frequency Unit</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor#getFrequencyUnit()
	 * @see #getProcessor()
	 * @generated
	 */
	EAttribute getProcessor_FrequencyUnit();

	/**
	 * Returns the meta object for the container reference '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor#getOwningECU <em>Owning ECU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning ECU</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor#getOwningECU()
	 * @see #getProcessor()
	 * @generated
	 */
	EReference getProcessor_OwningECU();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor#getUsedMemory <em>Used Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Used Memory</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor#getUsedMemory()
	 * @see #getProcessor()
	 * @generated
	 */
	EReference getProcessor_UsedMemory();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tasks</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor#getTasks()
	 * @see #getProcessor()
	 * @generated
	 */
	EReference getProcessor_Tasks();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor#getIODrivers <em>IO Drivers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>IO Drivers</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor#getIODrivers()
	 * @see #getProcessor()
	 * @generated
	 */
	EReference getProcessor_IODrivers();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor#getDeviceDrivers <em>Device Drivers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Device Drivers</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor#getDeviceDrivers()
	 * @see #getProcessor()
	 * @generated
	 */
	EReference getProcessor_DeviceDrivers();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor#getFrameworks <em>Frameworks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Frameworks</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor#getFrameworks()
	 * @see #getProcessor()
	 * @generated
	 */
	EReference getProcessor_Frameworks();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor#getOperatingSystems <em>Operating Systems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Operating Systems</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor#getOperatingSystems()
	 * @see #getProcessor()
	 * @generated
	 */
	EReference getProcessor_OperatingSystems();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor#getTypeAssociations <em>Type Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Type Associations</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor#getTypeAssociations()
	 * @see #getProcessor()
	 * @generated
	 */
	EReference getProcessor_TypeAssociations();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor#getHardwareAbstractions <em>Hardware Abstractions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Hardware Abstractions</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor#getHardwareAbstractions()
	 * @see #getProcessor()
	 * @generated
	 */
	EReference getProcessor_HardwareAbstractions();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor#getPeripherals <em>Peripherals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Peripherals</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor#getPeripherals()
	 * @see #getProcessor()
	 * @generated
	 */
	EReference getProcessor_Peripherals();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Memory <em>Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Memory
	 * @generated
	 */
	EClass getMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Memory#getMemoryType <em>Memory Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory Type</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Memory#getMemoryType()
	 * @see #getMemory()
	 * @generated
	 */
	EAttribute getMemory_MemoryType();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Memory#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Memory#getSize()
	 * @see #getMemory()
	 * @generated
	 */
	EAttribute getMemory_Size();

	/**
	 * Returns the meta object for the container reference '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Memory#getOwningECU <em>Owning ECU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning ECU</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Memory#getOwningECU()
	 * @see #getMemory()
	 * @generated
	 */
	EReference getMemory_OwningECU();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Memory#getUsingProcessors <em>Using Processors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Using Processors</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Memory#getUsingProcessors()
	 * @see #getMemory()
	 * @generated
	 */
	EReference getMemory_UsingProcessors();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Peripheral <em>Peripheral</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Peripheral</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Peripheral
	 * @generated
	 */
	EClass getPeripheral();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Peripheral#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Peripheral#getType()
	 * @see #getPeripheral()
	 * @generated
	 */
	EAttribute getPeripheral_Type();

	/**
	 * Returns the meta object for the container reference '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Peripheral#getOwningECU <em>Owning ECU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning ECU</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Peripheral#getOwningECU()
	 * @see #getPeripheral()
	 * @generated
	 */
	EReference getPeripheral_OwningECU();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Peripheral#getPins <em>Pins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pins</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Peripheral#getPins()
	 * @see #getPeripheral()
	 * @generated
	 */
	EReference getPeripheral_Pins();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Peripheral#getDeviceDrivers <em>Device Drivers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Device Drivers</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Peripheral#getDeviceDrivers()
	 * @see #getPeripheral()
	 * @generated
	 */
	EReference getPeripheral_DeviceDrivers();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Peripheral#getIODrivers <em>IO Drivers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>IO Drivers</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Peripheral#getIODrivers()
	 * @see #getPeripheral()
	 * @generated
	 */
	EReference getPeripheral_IODrivers();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Peripheral#getProcessors <em>Processors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Processors</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Peripheral#getProcessors()
	 * @see #getPeripheral()
	 * @generated
	 */
	EReference getPeripheral_Processors();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ElectricalSignal <em>Electrical Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Electrical Signal</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ElectricalSignal
	 * @generated
	 */
	EClass getElectricalSignal();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ElectricalSignal#getMinimumVoltage <em>Minimum Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Voltage</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ElectricalSignal#getMinimumVoltage()
	 * @see #getElectricalSignal()
	 * @generated
	 */
	EAttribute getElectricalSignal_MinimumVoltage();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ElectricalSignal#getMaximumVoltage <em>Maximum Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Voltage</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ElectricalSignal#getMaximumVoltage()
	 * @see #getElectricalSignal()
	 * @generated
	 */
	EAttribute getElectricalSignal_MaximumVoltage();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ElectricalSignal#getTypedPins <em>Typed Pins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Typed Pins</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ElectricalSignal#getTypedPins()
	 * @see #getElectricalSignal()
	 * @generated
	 */
	EReference getElectricalSignal_TypedPins();

	/**
	 * Returns the meta object for the container reference '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ElectricalSignal#getOwningArtifact <em>Owning Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Artifact</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ElectricalSignal#getOwningArtifact()
	 * @see #getElectricalSignal()
	 * @generated
	 */
	EReference getElectricalSignal_OwningArtifact();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.DigitalSignal <em>Digital Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Digital Signal</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.DigitalSignal
	 * @generated
	 */
	EClass getDigitalSignal();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.DigitalSignal#getMinimumMaximumVoltage <em>Minimum Maximum Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Maximum Voltage</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.DigitalSignal#getMinimumMaximumVoltage()
	 * @see #getDigitalSignal()
	 * @generated
	 */
	EAttribute getDigitalSignal_MinimumMaximumVoltage();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.DigitalSignal#getMaximumMinimumVoltage <em>Maximum Minimum Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Minimum Voltage</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.DigitalSignal#getMaximumMinimumVoltage()
	 * @see #getDigitalSignal()
	 * @generated
	 */
	EAttribute getDigitalSignal_MaximumMinimumVoltage();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.AnalogSignal <em>Analog Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analog Signal</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.AnalogSignal
	 * @generated
	 */
	EClass getAnalogSignal();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.PWMSignal <em>PWM Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PWM Signal</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.PWMSignal
	 * @generated
	 */
	EClass getPWMSignal();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.PWMSignal#getMinimumFrequency <em>Minimum Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Frequency</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.PWMSignal#getMinimumFrequency()
	 * @see #getPWMSignal()
	 * @generated
	 */
	EAttribute getPWMSignal_MinimumFrequency();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.PWMSignal#getMaximumFrequency <em>Maximum Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Frequency</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.PWMSignal#getMaximumFrequency()
	 * @see #getPWMSignal()
	 * @generated
	 */
	EAttribute getPWMSignal_MaximumFrequency();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.PWMSignal#getMinimumWidth <em>Minimum Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Width</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.PWMSignal#getMinimumWidth()
	 * @see #getPWMSignal()
	 * @generated
	 */
	EAttribute getPWMSignal_MinimumWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.PWMSignal#getMaximumWidth <em>Maximum Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Width</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.PWMSignal#getMaximumWidth()
	 * @see #getPWMSignal()
	 * @generated
	 */
	EAttribute getPWMSignal_MaximumWidth();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Channel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Channel</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Channel
	 * @generated
	 */
	EClass getChannel();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Channel#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Channel#getProtocol()
	 * @see #getChannel()
	 * @generated
	 */
	EAttribute getChannel_Protocol();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Channel#getChannelType <em>Channel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Channel Type</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Channel#getChannelType()
	 * @see #getChannel()
	 * @generated
	 */
	EAttribute getChannel_ChannelType();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Channel#getConnectedSensors <em>Connected Sensors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connected Sensors</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Channel#getConnectedSensors()
	 * @see #getChannel()
	 * @generated
	 */
	EReference getChannel_ConnectedSensors();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Channel#getConnectedActuators <em>Connected Actuators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connected Actuators</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Channel#getConnectedActuators()
	 * @see #getChannel()
	 * @generated
	 */
	EReference getChannel_ConnectedActuators();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Channel#getConnectedECUs <em>Connected EC Us</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connected EC Us</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Channel#getConnectedECUs()
	 * @see #getChannel()
	 * @generated
	 */
	EReference getChannel_ConnectedECUs();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Channel#getFrames <em>Frames</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Frames</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Channel#getFrames()
	 * @see #getChannel()
	 * @generated
	 */
	EReference getChannel_Frames();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Wire <em>Wire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wire</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Wire
	 * @generated
	 */
	EClass getWire();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Wire#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Wire#getSource()
	 * @see #getWire()
	 * @generated
	 */
	EReference getWire_Source();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Wire#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Wire#getDestination()
	 * @see #getWire()
	 * @generated
	 */
	EReference getWire_Destination();

	/**
	 * Returns the meta object for the container reference '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Wire#getOwningArtifact <em>Owning Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Artifact</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Wire#getOwningArtifact()
	 * @see #getWire()
	 * @generated
	 */
	EReference getWire_OwningArtifact();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Pin <em>Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pin</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Pin
	 * @generated
	 */
	EClass getPin();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Pin#getOutgoingWires <em>Outgoing Wires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Wires</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Pin#getOutgoingWires()
	 * @see #getPin()
	 * @generated
	 */
	EReference getPin_OutgoingWires();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Pin#getIncomingWires <em>Incoming Wires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Wires</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Pin#getIncomingWires()
	 * @see #getPin()
	 * @generated
	 */
	EReference getPin_IncomingWires();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Pin#getPhysicalMeaning <em>Physical Meaning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Physical Meaning</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Pin#getPhysicalMeaning()
	 * @see #getPin()
	 * @generated
	 */
	EAttribute getPin_PhysicalMeaning();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Pin#getDirectionType <em>Direction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction Type</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Pin#getDirectionType()
	 * @see #getPin()
	 * @generated
	 */
	EAttribute getPin_DirectionType();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Pin#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Pin#getType()
	 * @see #getPin()
	 * @generated
	 */
	EReference getPin_Type();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Pin#getOwningHardware <em>Owning Hardware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owning Hardware</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Pin#getOwningHardware()
	 * @see #getPin()
	 * @generated
	 */
	EReference getPin_OwningHardware();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Pin#getAbstractInterfaces <em>Abstract Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Abstract Interfaces</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Pin#getAbstractInterfaces()
	 * @see #getPin()
	 * @generated
	 */
	EReference getPin_AbstractInterfaces();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Sensor#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Sensor#getQuantity()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Quantity();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Sensor#getChannels <em>Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Channels</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Sensor#getChannels()
	 * @see #getSensor()
	 * @generated
	 */
	EReference getSensor_Channels();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Sensor#getSensorModel <em>Sensor Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sensor Model</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Sensor#getSensorModel()
	 * @see #getSensor()
	 * @generated
	 */
	EReference getSensor_SensorModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Sensor#getPins <em>Pins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pins</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Sensor#getPins()
	 * @see #getSensor()
	 * @generated
	 */
	EReference getSensor_Pins();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Actuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuator</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Actuator
	 * @generated
	 */
	EClass getActuator();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Actuator#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Actuator#getQuantity()
	 * @see #getActuator()
	 * @generated
	 */
	EAttribute getActuator_Quantity();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Actuator#getChannels <em>Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Channels</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Actuator#getChannels()
	 * @see #getActuator()
	 * @generated
	 */
	EReference getActuator_Channels();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Actuator#getActuatorModel <em>Actuator Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actuator Model</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Actuator#getActuatorModel()
	 * @see #getActuator()
	 * @generated
	 */
	EReference getActuator_ActuatorModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Actuator#getPins <em>Pins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pins</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Actuator#getPins()
	 * @see #getActuator()
	 * @generated
	 */
	EReference getActuator_Pins();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ICUSignal <em>ICU Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ICU Signal</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ICUSignal
	 * @generated
	 */
	EClass getICUSignal();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ICUSignal#getMeasurementMode <em>Measurement Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Measurement Mode</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ICUSignal#getMeasurementMode()
	 * @see #getICUSignal()
	 * @generated
	 */
	EAttribute getICUSignal_MeasurementMode();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ICUSignal#getDefaultStartEdge <em>Default Start Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Start Edge</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ICUSignal#getDefaultStartEdge()
	 * @see #getICUSignal()
	 * @generated
	 */
	EAttribute getICUSignal_DefaultStartEdge();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ICUSignal#getAdditionalData <em>Additional Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Data</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ICUSignal#getAdditionalData()
	 * @see #getICUSignal()
	 * @generated
	 */
	EAttribute getICUSignal_AdditionalData();

	/**
	 * Returns the meta object for enum '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.MemoryKind <em>Memory Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Memory Kind</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.MemoryKind
	 * @generated
	 */
	EEnum getMemoryKind();

	/**
	 * Returns the meta object for enum '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ChannelKind <em>Channel Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Channel Kind</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ChannelKind
	 * @generated
	 */
	EEnum getChannelKind();

	/**
	 * Returns the meta object for enum '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ICUMeasurementKind <em>ICU Measurement Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ICU Measurement Kind</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ICUMeasurementKind
	 * @generated
	 */
	EEnum getICUMeasurementKind();

	/**
	 * Returns the meta object for enum '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.EdgeKind <em>Edge Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Edge Kind</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.EdgeKind
	 * @generated
	 */
	EEnum getEdgeKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Hardware_architectureFactory getHardware_architectureFactory();

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
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.HardwareArchitectureImpl <em>Hardware Architecture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.HardwareArchitectureImpl
		 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.Hardware_architecturePackageImpl#getHardwareArchitecture()
		 * @generated
		 */
		EClass HARDWARE_ARCHITECTURE = eINSTANCE.getHardwareArchitecture();

		/**
		 * The meta object literal for the '<em><b>Platform Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_ARCHITECTURE__PLATFORM_MODEL = eINSTANCE.getHardwareArchitecture_PlatformModel();

		/**
		 * The meta object literal for the '<em><b>Hardware Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_ARCHITECTURE__HARDWARE_ENTITIES = eINSTANCE.getHardwareArchitecture_HardwareEntities();

		/**
		 * The meta object literal for the '<em><b>Electrical Signals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_ARCHITECTURE__ELECTRICAL_SIGNALS = eINSTANCE.getHardwareArchitecture_ElectricalSignals();

		/**
		 * The meta object literal for the '<em><b>Wires</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_ARCHITECTURE__WIRES = eINSTANCE.getHardwareArchitecture_Wires();

		/**
		 * The meta object literal for the '<em><b>Design Architecture</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_ARCHITECTURE__DESIGN_ARCHITECTURE = eINSTANCE.getHardwareArchitecture_DesignArchitecture();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.HardwareEntityImpl <em>Hardware Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.HardwareEntityImpl
		 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.Hardware_architecturePackageImpl#getHardwareEntity()
		 * @generated
		 */
		EClass HARDWARE_ENTITY = eINSTANCE.getHardwareEntity();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_ENTITY__DESCRIPTION = eINSTANCE.getHardwareEntity_Description();

		/**
		 * The meta object literal for the '<em><b>Technical Specification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_ENTITY__TECHNICAL_SPECIFICATION = eINSTANCE.getHardwareEntity_TechnicalSpecification();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.ECUImpl <em>ECU</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.ECUImpl
		 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.Hardware_architecturePackageImpl#getECU()
		 * @generated
		 */
		EClass ECU = eINSTANCE.getECU();

		/**
		 * The meta object literal for the '<em><b>Processors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECU__PROCESSORS = eINSTANCE.getECU_Processors();

		/**
		 * The meta object literal for the '<em><b>Memory</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECU__MEMORY = eINSTANCE.getECU_Memory();

		/**
		 * The meta object literal for the '<em><b>Channels</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECU__CHANNELS = eINSTANCE.getECU_Channels();

		/**
		 * The meta object literal for the '<em><b>Peripherals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECU__PERIPHERALS = eINSTANCE.getECU_Peripherals();

		/**
		 * The meta object literal for the '<em><b>Pins</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECU__PINS = eINSTANCE.getECU_Pins();

		/**
		 * The meta object literal for the '<em><b>Allocations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECU__ALLOCATIONS = eINSTANCE.getECU_Allocations();

		/**
		 * The meta object literal for the '<em><b>Allocated Entities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECU__ALLOCATED_ENTITIES = eINSTANCE.getECU_AllocatedEntities();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.ProcessorImpl <em>Processor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.ProcessorImpl
		 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.Hardware_architecturePackageImpl#getProcessor()
		 * @generated
		 */
		EClass PROCESSOR = eINSTANCE.getProcessor();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR__TYPE = eINSTANCE.getProcessor_Type();

		/**
		 * The meta object literal for the '<em><b>Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR__FREQUENCY = eINSTANCE.getProcessor_Frequency();

		/**
		 * The meta object literal for the '<em><b>Frequency Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR__FREQUENCY_UNIT = eINSTANCE.getProcessor_FrequencyUnit();

		/**
		 * The meta object literal for the '<em><b>Owning ECU</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSOR__OWNING_ECU = eINSTANCE.getProcessor_OwningECU();

		/**
		 * The meta object literal for the '<em><b>Used Memory</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSOR__USED_MEMORY = eINSTANCE.getProcessor_UsedMemory();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSOR__TASKS = eINSTANCE.getProcessor_Tasks();

		/**
		 * The meta object literal for the '<em><b>IO Drivers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSOR__IO_DRIVERS = eINSTANCE.getProcessor_IODrivers();

		/**
		 * The meta object literal for the '<em><b>Device Drivers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSOR__DEVICE_DRIVERS = eINSTANCE.getProcessor_DeviceDrivers();

		/**
		 * The meta object literal for the '<em><b>Frameworks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSOR__FRAMEWORKS = eINSTANCE.getProcessor_Frameworks();

		/**
		 * The meta object literal for the '<em><b>Operating Systems</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSOR__OPERATING_SYSTEMS = eINSTANCE.getProcessor_OperatingSystems();

		/**
		 * The meta object literal for the '<em><b>Type Associations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSOR__TYPE_ASSOCIATIONS = eINSTANCE.getProcessor_TypeAssociations();

		/**
		 * The meta object literal for the '<em><b>Hardware Abstractions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSOR__HARDWARE_ABSTRACTIONS = eINSTANCE.getProcessor_HardwareAbstractions();

		/**
		 * The meta object literal for the '<em><b>Peripherals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSOR__PERIPHERALS = eINSTANCE.getProcessor_Peripherals();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.MemoryImpl <em>Memory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.MemoryImpl
		 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.Hardware_architecturePackageImpl#getMemory()
		 * @generated
		 */
		EClass MEMORY = eINSTANCE.getMemory();

		/**
		 * The meta object literal for the '<em><b>Memory Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY__MEMORY_TYPE = eINSTANCE.getMemory_MemoryType();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY__SIZE = eINSTANCE.getMemory_Size();

		/**
		 * The meta object literal for the '<em><b>Owning ECU</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMORY__OWNING_ECU = eINSTANCE.getMemory_OwningECU();

		/**
		 * The meta object literal for the '<em><b>Using Processors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMORY__USING_PROCESSORS = eINSTANCE.getMemory_UsingProcessors();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.PeripheralImpl <em>Peripheral</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.PeripheralImpl
		 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.Hardware_architecturePackageImpl#getPeripheral()
		 * @generated
		 */
		EClass PERIPHERAL = eINSTANCE.getPeripheral();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIPHERAL__TYPE = eINSTANCE.getPeripheral_Type();

		/**
		 * The meta object literal for the '<em><b>Owning ECU</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERIPHERAL__OWNING_ECU = eINSTANCE.getPeripheral_OwningECU();

		/**
		 * The meta object literal for the '<em><b>Pins</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERIPHERAL__PINS = eINSTANCE.getPeripheral_Pins();

		/**
		 * The meta object literal for the '<em><b>Device Drivers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERIPHERAL__DEVICE_DRIVERS = eINSTANCE.getPeripheral_DeviceDrivers();

		/**
		 * The meta object literal for the '<em><b>IO Drivers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERIPHERAL__IO_DRIVERS = eINSTANCE.getPeripheral_IODrivers();

		/**
		 * The meta object literal for the '<em><b>Processors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERIPHERAL__PROCESSORS = eINSTANCE.getPeripheral_Processors();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.ElectricalSignalImpl <em>Electrical Signal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.ElectricalSignalImpl
		 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.Hardware_architecturePackageImpl#getElectricalSignal()
		 * @generated
		 */
		EClass ELECTRICAL_SIGNAL = eINSTANCE.getElectricalSignal();

		/**
		 * The meta object literal for the '<em><b>Minimum Voltage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELECTRICAL_SIGNAL__MINIMUM_VOLTAGE = eINSTANCE.getElectricalSignal_MinimumVoltage();

		/**
		 * The meta object literal for the '<em><b>Maximum Voltage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELECTRICAL_SIGNAL__MAXIMUM_VOLTAGE = eINSTANCE.getElectricalSignal_MaximumVoltage();

		/**
		 * The meta object literal for the '<em><b>Typed Pins</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELECTRICAL_SIGNAL__TYPED_PINS = eINSTANCE.getElectricalSignal_TypedPins();

		/**
		 * The meta object literal for the '<em><b>Owning Artifact</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELECTRICAL_SIGNAL__OWNING_ARTIFACT = eINSTANCE.getElectricalSignal_OwningArtifact();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.DigitalSignalImpl <em>Digital Signal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.DigitalSignalImpl
		 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.Hardware_architecturePackageImpl#getDigitalSignal()
		 * @generated
		 */
		EClass DIGITAL_SIGNAL = eINSTANCE.getDigitalSignal();

		/**
		 * The meta object literal for the '<em><b>Minimum Maximum Voltage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIGITAL_SIGNAL__MINIMUM_MAXIMUM_VOLTAGE = eINSTANCE.getDigitalSignal_MinimumMaximumVoltage();

		/**
		 * The meta object literal for the '<em><b>Maximum Minimum Voltage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIGITAL_SIGNAL__MAXIMUM_MINIMUM_VOLTAGE = eINSTANCE.getDigitalSignal_MaximumMinimumVoltage();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.AnalogSignalImpl <em>Analog Signal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.AnalogSignalImpl
		 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.Hardware_architecturePackageImpl#getAnalogSignal()
		 * @generated
		 */
		EClass ANALOG_SIGNAL = eINSTANCE.getAnalogSignal();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.PWMSignalImpl <em>PWM Signal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.PWMSignalImpl
		 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.Hardware_architecturePackageImpl#getPWMSignal()
		 * @generated
		 */
		EClass PWM_SIGNAL = eINSTANCE.getPWMSignal();

		/**
		 * The meta object literal for the '<em><b>Minimum Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PWM_SIGNAL__MINIMUM_FREQUENCY = eINSTANCE.getPWMSignal_MinimumFrequency();

		/**
		 * The meta object literal for the '<em><b>Maximum Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PWM_SIGNAL__MAXIMUM_FREQUENCY = eINSTANCE.getPWMSignal_MaximumFrequency();

		/**
		 * The meta object literal for the '<em><b>Minimum Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PWM_SIGNAL__MINIMUM_WIDTH = eINSTANCE.getPWMSignal_MinimumWidth();

		/**
		 * The meta object literal for the '<em><b>Maximum Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PWM_SIGNAL__MAXIMUM_WIDTH = eINSTANCE.getPWMSignal_MaximumWidth();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.ChannelImpl <em>Channel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.ChannelImpl
		 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.Hardware_architecturePackageImpl#getChannel()
		 * @generated
		 */
		EClass CHANNEL = eINSTANCE.getChannel();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL__PROTOCOL = eINSTANCE.getChannel_Protocol();

		/**
		 * The meta object literal for the '<em><b>Channel Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL__CHANNEL_TYPE = eINSTANCE.getChannel_ChannelType();

		/**
		 * The meta object literal for the '<em><b>Connected Sensors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL__CONNECTED_SENSORS = eINSTANCE.getChannel_ConnectedSensors();

		/**
		 * The meta object literal for the '<em><b>Connected Actuators</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL__CONNECTED_ACTUATORS = eINSTANCE.getChannel_ConnectedActuators();

		/**
		 * The meta object literal for the '<em><b>Connected EC Us</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL__CONNECTED_EC_US = eINSTANCE.getChannel_ConnectedECUs();

		/**
		 * The meta object literal for the '<em><b>Frames</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL__FRAMES = eINSTANCE.getChannel_Frames();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.WireImpl <em>Wire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.WireImpl
		 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.Hardware_architecturePackageImpl#getWire()
		 * @generated
		 */
		EClass WIRE = eINSTANCE.getWire();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIRE__SOURCE = eINSTANCE.getWire_Source();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIRE__DESTINATION = eINSTANCE.getWire_Destination();

		/**
		 * The meta object literal for the '<em><b>Owning Artifact</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIRE__OWNING_ARTIFACT = eINSTANCE.getWire_OwningArtifact();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.PinImpl <em>Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.PinImpl
		 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.Hardware_architecturePackageImpl#getPin()
		 * @generated
		 */
		EClass PIN = eINSTANCE.getPin();

		/**
		 * The meta object literal for the '<em><b>Outgoing Wires</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIN__OUTGOING_WIRES = eINSTANCE.getPin_OutgoingWires();

		/**
		 * The meta object literal for the '<em><b>Incoming Wires</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIN__INCOMING_WIRES = eINSTANCE.getPin_IncomingWires();

		/**
		 * The meta object literal for the '<em><b>Physical Meaning</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIN__PHYSICAL_MEANING = eINSTANCE.getPin_PhysicalMeaning();

		/**
		 * The meta object literal for the '<em><b>Direction Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIN__DIRECTION_TYPE = eINSTANCE.getPin_DirectionType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIN__TYPE = eINSTANCE.getPin_Type();

		/**
		 * The meta object literal for the '<em><b>Owning Hardware</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIN__OWNING_HARDWARE = eINSTANCE.getPin_OwningHardware();

		/**
		 * The meta object literal for the '<em><b>Abstract Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIN__ABSTRACT_INTERFACES = eINSTANCE.getPin_AbstractInterfaces();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.SensorImpl
		 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.Hardware_architecturePackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__QUANTITY = eINSTANCE.getSensor_Quantity();

		/**
		 * The meta object literal for the '<em><b>Channels</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR__CHANNELS = eINSTANCE.getSensor_Channels();

		/**
		 * The meta object literal for the '<em><b>Sensor Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR__SENSOR_MODEL = eINSTANCE.getSensor_SensorModel();

		/**
		 * The meta object literal for the '<em><b>Pins</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR__PINS = eINSTANCE.getSensor_Pins();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.ActuatorImpl <em>Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.ActuatorImpl
		 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.Hardware_architecturePackageImpl#getActuator()
		 * @generated
		 */
		EClass ACTUATOR = eINSTANCE.getActuator();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTUATOR__QUANTITY = eINSTANCE.getActuator_Quantity();

		/**
		 * The meta object literal for the '<em><b>Channels</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUATOR__CHANNELS = eINSTANCE.getActuator_Channels();

		/**
		 * The meta object literal for the '<em><b>Actuator Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUATOR__ACTUATOR_MODEL = eINSTANCE.getActuator_ActuatorModel();

		/**
		 * The meta object literal for the '<em><b>Pins</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUATOR__PINS = eINSTANCE.getActuator_Pins();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.ICUSignalImpl <em>ICU Signal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.ICUSignalImpl
		 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.Hardware_architecturePackageImpl#getICUSignal()
		 * @generated
		 */
		EClass ICU_SIGNAL = eINSTANCE.getICUSignal();

		/**
		 * The meta object literal for the '<em><b>Measurement Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ICU_SIGNAL__MEASUREMENT_MODE = eINSTANCE.getICUSignal_MeasurementMode();

		/**
		 * The meta object literal for the '<em><b>Default Start Edge</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ICU_SIGNAL__DEFAULT_START_EDGE = eINSTANCE.getICUSignal_DefaultStartEdge();

		/**
		 * The meta object literal for the '<em><b>Additional Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ICU_SIGNAL__ADDITIONAL_DATA = eINSTANCE.getICUSignal_AdditionalData();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.MemoryKind <em>Memory Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.MemoryKind
		 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.Hardware_architecturePackageImpl#getMemoryKind()
		 * @generated
		 */
		EEnum MEMORY_KIND = eINSTANCE.getMemoryKind();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ChannelKind <em>Channel Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ChannelKind
		 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.Hardware_architecturePackageImpl#getChannelKind()
		 * @generated
		 */
		EEnum CHANNEL_KIND = eINSTANCE.getChannelKind();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ICUMeasurementKind <em>ICU Measurement Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ICUMeasurementKind
		 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.Hardware_architecturePackageImpl#getICUMeasurementKind()
		 * @generated
		 */
		EEnum ICU_MEASUREMENT_KIND = eINSTANCE.getICUMeasurementKind();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.EdgeKind <em>Edge Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.EdgeKind
		 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.Hardware_architecturePackageImpl#getEdgeKind()
		 * @generated
		 */
		EEnum EDGE_KIND = eINSTANCE.getEdgeKind();

	}

} //Hardware_architecturePackage
