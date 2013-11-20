/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.functional_design_architecture;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * This package contains the entities of the FDA artifact. The goal here is to answer the question "how does the system does it".
 * <!-- end-model-doc -->
 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Functional_design_architectureFactory
 * @model kind="package"
 * @generated
 */
public interface Functional_design_architecturePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "functional_design_architecture";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.topcased.org/0.11.0/east_adl/structure/functional_design_architecture";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "functional_design_architecture";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Functional_design_architecturePackage eINSTANCE = org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.Functional_design_architecturePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.FunctionalDesignArchitectureImpl <em>Functional Design Architecture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.FunctionalDesignArchitectureImpl
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.Functional_design_architecturePackageImpl#getFunctionalDesignArchitecture()
	 * @generated
	 */
	int FUNCTIONAL_DESIGN_ARCHITECTURE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DESIGN_ARCHITECTURE__NAME = CorePackage.EASTADL_ARTIFACT__NAME;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DESIGN_ARCHITECTURE__REQUIREMENTS = CorePackage.EASTADL_ARTIFACT__REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DESIGN_ARCHITECTURE__MODEL = CorePackage.EASTADL_ARTIFACT__MODEL;

	/**
	 * The feature id for the '<em><b>Support Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DESIGN_ARCHITECTURE__SUPPORT_ENTITIES = CorePackage.EASTADL_ARTIFACT__SUPPORT_ENTITIES;

	/**
	 * The feature id for the '<em><b>Validation Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DESIGN_ARCHITECTURE__VALIDATION_ENTITIES = CorePackage.EASTADL_ARTIFACT__VALIDATION_ENTITIES;

	/**
	 * The feature id for the '<em><b>Elementary Software Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DESIGN_ARCHITECTURE__ELEMENTARY_SOFTWARE_FUNCTIONS = CorePackage.EASTADL_ARTIFACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Composite Software Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DESIGN_ARCHITECTURE__COMPOSITE_SOFTWARE_FUNCTIONS = CorePackage.EASTADL_ARTIFACT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Analysis Architecture</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DESIGN_ARCHITECTURE__ANALYSIS_ARCHITECTURE = CorePackage.EASTADL_ARTIFACT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Vehicle Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DESIGN_ARCHITECTURE__VEHICLE_MODEL = CorePackage.EASTADL_ARTIFACT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Instance Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DESIGN_ARCHITECTURE__INSTANCE_MODEL = CorePackage.EASTADL_ARTIFACT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Type Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DESIGN_ARCHITECTURE__TYPE_ASSOCIATIONS = CorePackage.EASTADL_ARTIFACT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Implementation Data Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DESIGN_ARCHITECTURE__IMPLEMENTATION_DATA_TYPES = CorePackage.EASTADL_ARTIFACT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Design Data Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DESIGN_ARCHITECTURE__DESIGN_DATA_TYPES = CorePackage.EASTADL_ARTIFACT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Connector Signals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DESIGN_ARCHITECTURE__CONNECTOR_SIGNALS = CorePackage.EASTADL_ARTIFACT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Operation Calls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DESIGN_ARCHITECTURE__OPERATION_CALLS = CorePackage.EASTADL_ARTIFACT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Hardware Architecture</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DESIGN_ARCHITECTURE__HARDWARE_ARCHITECTURE = CorePackage.EASTADL_ARTIFACT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Functional Design Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DESIGN_ARCHITECTURE_FEATURE_COUNT = CorePackage.EASTADL_ARTIFACT_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.ElementarySoftwareFunctionImpl <em>Elementary Software Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.ElementarySoftwareFunctionImpl
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.Functional_design_architecturePackageImpl#getElementarySoftwareFunction()
	 * @generated
	 */
	int ELEMENTARY_SOFTWARE_FUNCTION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_SOFTWARE_FUNCTION__NAME = CorePackage.EASTADL_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Passive Assignments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_SOFTWARE_FUNCTION__PASSIVE_ASSIGNMENTS = CorePackage.EASTADL_ENTITY__PASSIVE_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Assigned Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_SOFTWARE_FUNCTION__ASSIGNED_REQUIREMENTS = CorePackage.EASTADL_ENTITY__ASSIGNED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Active Realizations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_SOFTWARE_FUNCTION__ACTIVE_REALIZATIONS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_SOFTWARE_FUNCTION__REALIZES = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Null Variant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_SOFTWARE_FUNCTION__NULL_VARIANT = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_SOFTWARE_FUNCTION__COMPLETE = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Active Variations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_SOFTWARE_FUNCTION__ACTIVE_VARIATIONS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Active Selections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_SOFTWARE_FUNCTION__ACTIVE_SELECTIONS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Active Exclusions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_SOFTWARE_FUNCTION__ACTIVE_EXCLUSIONS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Passive Variation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_SOFTWARE_FUNCTION__PASSIVE_VARIATION = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Passive Selections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_SOFTWARE_FUNCTION__PASSIVE_SELECTIONS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Passive Exclusions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_SOFTWARE_FUNCTION__PASSIVE_EXCLUSIONS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Variation Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_SOFTWARE_FUNCTION__VARIATION_POINT = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_SOFTWARE_FUNCTION__VARIANTS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Selectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_SOFTWARE_FUNCTION__SELECTORS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_SOFTWARE_FUNCTION__SELECTED = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Excluders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_SOFTWARE_FUNCTION__EXCLUDERS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Excluded</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_SOFTWARE_FUNCTION__EXCLUDED = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Selection Criterion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_SOFTWARE_FUNCTION__SELECTION_CRITERION = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_SOFTWARE_FUNCTION__VALIDATORS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_SOFTWARE_FUNCTION__PORTS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_SOFTWARE_FUNCTION__PARAMETERS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_SOFTWARE_FUNCTION__INSTANCES = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Trigger Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_SOFTWARE_FUNCTION__TRIGGER_TYPE = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Trigger Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_SOFTWARE_FUNCTION__TRIGGER_EVENT = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Trigger Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_SOFTWARE_FUNCTION__TRIGGER_CONDITION = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_SOFTWARE_FUNCTION__PERIOD = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_SOFTWARE_FUNCTION__OFFSET = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Execution Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_SOFTWARE_FUNCTION__EXECUTION_TIME = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Specifation Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_SOFTWARE_FUNCTION__SPECIFATION_BEHAVIOR = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Implementation Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_SOFTWARE_FUNCTION__IMPLEMENTATION_BEHAVIOR = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Active Precedencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_SOFTWARE_FUNCTION__ACTIVE_PRECEDENCIES = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Passive Precedencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_SOFTWARE_FUNCTION__PASSIVE_PRECEDENCIES = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Predecessors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_SOFTWARE_FUNCTION__PREDECESSORS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_SOFTWARE_FUNCTION__SUCCESSORS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 32;

	/**
	 * The number of structural features of the '<em>Elementary Software Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_SOFTWARE_FUNCTION_FEATURE_COUNT = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 33;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.CompositeSoftwareFunctionImpl <em>Composite Software Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.CompositeSoftwareFunctionImpl
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.Functional_design_architecturePackageImpl#getCompositeSoftwareFunction()
	 * @generated
	 */
	int COMPOSITE_SOFTWARE_FUNCTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SOFTWARE_FUNCTION__NAME = CorePackage.EASTADL_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Passive Assignments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SOFTWARE_FUNCTION__PASSIVE_ASSIGNMENTS = CorePackage.EASTADL_ENTITY__PASSIVE_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Assigned Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SOFTWARE_FUNCTION__ASSIGNED_REQUIREMENTS = CorePackage.EASTADL_ENTITY__ASSIGNED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Allocation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SOFTWARE_FUNCTION__ALLOCATION = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Allocation Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SOFTWARE_FUNCTION__ALLOCATION_TARGET = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Active Realizations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SOFTWARE_FUNCTION__ACTIVE_REALIZATIONS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SOFTWARE_FUNCTION__REALIZES = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Null Variant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SOFTWARE_FUNCTION__NULL_VARIANT = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SOFTWARE_FUNCTION__COMPLETE = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Active Variations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SOFTWARE_FUNCTION__ACTIVE_VARIATIONS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Active Selections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SOFTWARE_FUNCTION__ACTIVE_SELECTIONS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Active Exclusions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SOFTWARE_FUNCTION__ACTIVE_EXCLUSIONS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Passive Variation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SOFTWARE_FUNCTION__PASSIVE_VARIATION = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Passive Selections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SOFTWARE_FUNCTION__PASSIVE_SELECTIONS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Passive Exclusions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SOFTWARE_FUNCTION__PASSIVE_EXCLUSIONS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Variation Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SOFTWARE_FUNCTION__VARIATION_POINT = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SOFTWARE_FUNCTION__VARIANTS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Selectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SOFTWARE_FUNCTION__SELECTORS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SOFTWARE_FUNCTION__SELECTED = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Excluders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SOFTWARE_FUNCTION__EXCLUDERS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Excluded</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SOFTWARE_FUNCTION__EXCLUDED = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Selection Criterion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SOFTWARE_FUNCTION__SELECTION_CRITERION = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SOFTWARE_FUNCTION__VALIDATORS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Elementary Software Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SOFTWARE_FUNCTION__ELEMENTARY_SOFTWARE_FUNCTIONS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Composite Software Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SOFTWARE_FUNCTION__COMPOSITE_SOFTWARE_FUNCTIONS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SOFTWARE_FUNCTION__PORTS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SOFTWARE_FUNCTION__PARAMETERS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 23;

	/**
	 * The number of structural features of the '<em>Composite Software Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SOFTWARE_FUNCTION_FEATURE_COUNT = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 24;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.LocalDeviceManagerImpl <em>Local Device Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.LocalDeviceManagerImpl
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.Functional_design_architecturePackageImpl#getLocalDeviceManager()
	 * @generated
	 */
	int LOCAL_DEVICE_MANAGER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DEVICE_MANAGER__NAME = ELEMENTARY_SOFTWARE_FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Passive Assignments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DEVICE_MANAGER__PASSIVE_ASSIGNMENTS = ELEMENTARY_SOFTWARE_FUNCTION__PASSIVE_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Assigned Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DEVICE_MANAGER__ASSIGNED_REQUIREMENTS = ELEMENTARY_SOFTWARE_FUNCTION__ASSIGNED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Active Realizations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DEVICE_MANAGER__ACTIVE_REALIZATIONS = ELEMENTARY_SOFTWARE_FUNCTION__ACTIVE_REALIZATIONS;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DEVICE_MANAGER__REALIZES = ELEMENTARY_SOFTWARE_FUNCTION__REALIZES;

	/**
	 * The feature id for the '<em><b>Null Variant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DEVICE_MANAGER__NULL_VARIANT = ELEMENTARY_SOFTWARE_FUNCTION__NULL_VARIANT;

	/**
	 * The feature id for the '<em><b>Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DEVICE_MANAGER__COMPLETE = ELEMENTARY_SOFTWARE_FUNCTION__COMPLETE;

	/**
	 * The feature id for the '<em><b>Active Variations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DEVICE_MANAGER__ACTIVE_VARIATIONS = ELEMENTARY_SOFTWARE_FUNCTION__ACTIVE_VARIATIONS;

	/**
	 * The feature id for the '<em><b>Active Selections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DEVICE_MANAGER__ACTIVE_SELECTIONS = ELEMENTARY_SOFTWARE_FUNCTION__ACTIVE_SELECTIONS;

	/**
	 * The feature id for the '<em><b>Active Exclusions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DEVICE_MANAGER__ACTIVE_EXCLUSIONS = ELEMENTARY_SOFTWARE_FUNCTION__ACTIVE_EXCLUSIONS;

	/**
	 * The feature id for the '<em><b>Passive Variation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DEVICE_MANAGER__PASSIVE_VARIATION = ELEMENTARY_SOFTWARE_FUNCTION__PASSIVE_VARIATION;

	/**
	 * The feature id for the '<em><b>Passive Selections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DEVICE_MANAGER__PASSIVE_SELECTIONS = ELEMENTARY_SOFTWARE_FUNCTION__PASSIVE_SELECTIONS;

	/**
	 * The feature id for the '<em><b>Passive Exclusions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DEVICE_MANAGER__PASSIVE_EXCLUSIONS = ELEMENTARY_SOFTWARE_FUNCTION__PASSIVE_EXCLUSIONS;

	/**
	 * The feature id for the '<em><b>Variation Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DEVICE_MANAGER__VARIATION_POINT = ELEMENTARY_SOFTWARE_FUNCTION__VARIATION_POINT;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DEVICE_MANAGER__VARIANTS = ELEMENTARY_SOFTWARE_FUNCTION__VARIANTS;

	/**
	 * The feature id for the '<em><b>Selectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DEVICE_MANAGER__SELECTORS = ELEMENTARY_SOFTWARE_FUNCTION__SELECTORS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DEVICE_MANAGER__SELECTED = ELEMENTARY_SOFTWARE_FUNCTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Excluders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DEVICE_MANAGER__EXCLUDERS = ELEMENTARY_SOFTWARE_FUNCTION__EXCLUDERS;

	/**
	 * The feature id for the '<em><b>Excluded</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DEVICE_MANAGER__EXCLUDED = ELEMENTARY_SOFTWARE_FUNCTION__EXCLUDED;

	/**
	 * The feature id for the '<em><b>Selection Criterion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DEVICE_MANAGER__SELECTION_CRITERION = ELEMENTARY_SOFTWARE_FUNCTION__SELECTION_CRITERION;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DEVICE_MANAGER__VALIDATORS = ELEMENTARY_SOFTWARE_FUNCTION__VALIDATORS;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DEVICE_MANAGER__PORTS = ELEMENTARY_SOFTWARE_FUNCTION__PORTS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DEVICE_MANAGER__PARAMETERS = ELEMENTARY_SOFTWARE_FUNCTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DEVICE_MANAGER__INSTANCES = ELEMENTARY_SOFTWARE_FUNCTION__INSTANCES;

	/**
	 * The feature id for the '<em><b>Trigger Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DEVICE_MANAGER__TRIGGER_TYPE = ELEMENTARY_SOFTWARE_FUNCTION__TRIGGER_TYPE;

	/**
	 * The feature id for the '<em><b>Trigger Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DEVICE_MANAGER__TRIGGER_EVENT = ELEMENTARY_SOFTWARE_FUNCTION__TRIGGER_EVENT;

	/**
	 * The feature id for the '<em><b>Trigger Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DEVICE_MANAGER__TRIGGER_CONDITION = ELEMENTARY_SOFTWARE_FUNCTION__TRIGGER_CONDITION;

	/**
	 * The feature id for the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DEVICE_MANAGER__PERIOD = ELEMENTARY_SOFTWARE_FUNCTION__PERIOD;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DEVICE_MANAGER__OFFSET = ELEMENTARY_SOFTWARE_FUNCTION__OFFSET;

	/**
	 * The feature id for the '<em><b>Execution Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DEVICE_MANAGER__EXECUTION_TIME = ELEMENTARY_SOFTWARE_FUNCTION__EXECUTION_TIME;

	/**
	 * The feature id for the '<em><b>Specifation Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DEVICE_MANAGER__SPECIFATION_BEHAVIOR = ELEMENTARY_SOFTWARE_FUNCTION__SPECIFATION_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Implementation Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DEVICE_MANAGER__IMPLEMENTATION_BEHAVIOR = ELEMENTARY_SOFTWARE_FUNCTION__IMPLEMENTATION_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Active Precedencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DEVICE_MANAGER__ACTIVE_PRECEDENCIES = ELEMENTARY_SOFTWARE_FUNCTION__ACTIVE_PRECEDENCIES;

	/**
	 * The feature id for the '<em><b>Passive Precedencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DEVICE_MANAGER__PASSIVE_PRECEDENCIES = ELEMENTARY_SOFTWARE_FUNCTION__PASSIVE_PRECEDENCIES;

	/**
	 * The feature id for the '<em><b>Predecessors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DEVICE_MANAGER__PREDECESSORS = ELEMENTARY_SOFTWARE_FUNCTION__PREDECESSORS;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DEVICE_MANAGER__SUCCESSORS = ELEMENTARY_SOFTWARE_FUNCTION__SUCCESSORS;

	/**
	 * The number of structural features of the '<em>Local Device Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DEVICE_MANAGER_FEATURE_COUNT = ELEMENTARY_SOFTWARE_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.PrecedenceImpl <em>Precedence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.PrecedenceImpl
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.Functional_design_architecturePackageImpl#getPrecedence()
	 * @generated
	 */
	int PRECEDENCE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE__NAME = CorePackage.EASTADL_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Predecessor</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE__PREDECESSOR = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Successor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE__SUCCESSOR = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Precedence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_FEATURE_COUNT = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.FunctionalDesignArchitecture <em>Functional Design Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional Design Architecture</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.FunctionalDesignArchitecture
	 * @generated
	 */
	EClass getFunctionalDesignArchitecture();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.FunctionalDesignArchitecture#getElementarySoftwareFunctions <em>Elementary Software Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elementary Software Functions</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.FunctionalDesignArchitecture#getElementarySoftwareFunctions()
	 * @see #getFunctionalDesignArchitecture()
	 * @generated
	 */
	EReference getFunctionalDesignArchitecture_ElementarySoftwareFunctions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.FunctionalDesignArchitecture#getCompositeSoftwareFunctions <em>Composite Software Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composite Software Functions</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.FunctionalDesignArchitecture#getCompositeSoftwareFunctions()
	 * @see #getFunctionalDesignArchitecture()
	 * @generated
	 */
	EReference getFunctionalDesignArchitecture_CompositeSoftwareFunctions();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.FunctionalDesignArchitecture#getAnalysisArchitecture <em>Analysis Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Analysis Architecture</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.FunctionalDesignArchitecture#getAnalysisArchitecture()
	 * @see #getFunctionalDesignArchitecture()
	 * @generated
	 */
	EReference getFunctionalDesignArchitecture_AnalysisArchitecture();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.FunctionalDesignArchitecture#getVehicleModel <em>Vehicle Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vehicle Model</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.FunctionalDesignArchitecture#getVehicleModel()
	 * @see #getFunctionalDesignArchitecture()
	 * @generated
	 */
	EReference getFunctionalDesignArchitecture_VehicleModel();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.FunctionalDesignArchitecture#getInstanceModel <em>Instance Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instance Model</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.FunctionalDesignArchitecture#getInstanceModel()
	 * @see #getFunctionalDesignArchitecture()
	 * @generated
	 */
	EReference getFunctionalDesignArchitecture_InstanceModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.FunctionalDesignArchitecture#getTypeAssociations <em>Type Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type Associations</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.FunctionalDesignArchitecture#getTypeAssociations()
	 * @see #getFunctionalDesignArchitecture()
	 * @generated
	 */
	EReference getFunctionalDesignArchitecture_TypeAssociations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.FunctionalDesignArchitecture#getImplementationDataTypes <em>Implementation Data Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Implementation Data Types</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.FunctionalDesignArchitecture#getImplementationDataTypes()
	 * @see #getFunctionalDesignArchitecture()
	 * @generated
	 */
	EReference getFunctionalDesignArchitecture_ImplementationDataTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.FunctionalDesignArchitecture#getDesignDataTypes <em>Design Data Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Design Data Types</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.FunctionalDesignArchitecture#getDesignDataTypes()
	 * @see #getFunctionalDesignArchitecture()
	 * @generated
	 */
	EReference getFunctionalDesignArchitecture_DesignDataTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.FunctionalDesignArchitecture#getConnectorSignals <em>Connector Signals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connector Signals</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.FunctionalDesignArchitecture#getConnectorSignals()
	 * @see #getFunctionalDesignArchitecture()
	 * @generated
	 */
	EReference getFunctionalDesignArchitecture_ConnectorSignals();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.FunctionalDesignArchitecture#getOperationCalls <em>Operation Calls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation Calls</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.FunctionalDesignArchitecture#getOperationCalls()
	 * @see #getFunctionalDesignArchitecture()
	 * @generated
	 */
	EReference getFunctionalDesignArchitecture_OperationCalls();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.FunctionalDesignArchitecture#getHardwareArchitecture <em>Hardware Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hardware Architecture</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.FunctionalDesignArchitecture#getHardwareArchitecture()
	 * @see #getFunctionalDesignArchitecture()
	 * @generated
	 */
	EReference getFunctionalDesignArchitecture_HardwareArchitecture();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction <em>Elementary Software Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elementary Software Function</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction
	 * @generated
	 */
	EClass getElementarySoftwareFunction();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction#getPorts()
	 * @see #getElementarySoftwareFunction()
	 * @generated
	 */
	EReference getElementarySoftwareFunction_Ports();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction#getParameters()
	 * @see #getElementarySoftwareFunction()
	 * @generated
	 */
	EReference getElementarySoftwareFunction_Parameters();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instances</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction#getInstances()
	 * @see #getElementarySoftwareFunction()
	 * @generated
	 */
	EReference getElementarySoftwareFunction_Instances();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction#getTriggerType <em>Trigger Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trigger Type</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction#getTriggerType()
	 * @see #getElementarySoftwareFunction()
	 * @generated
	 */
	EAttribute getElementarySoftwareFunction_TriggerType();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction#getTriggerEvent <em>Trigger Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trigger Event</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction#getTriggerEvent()
	 * @see #getElementarySoftwareFunction()
	 * @generated
	 */
	EAttribute getElementarySoftwareFunction_TriggerEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction#getTriggerCondition <em>Trigger Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trigger Condition</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction#getTriggerCondition()
	 * @see #getElementarySoftwareFunction()
	 * @generated
	 */
	EAttribute getElementarySoftwareFunction_TriggerCondition();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Period</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction#getPeriod()
	 * @see #getElementarySoftwareFunction()
	 * @generated
	 */
	EReference getElementarySoftwareFunction_Period();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Offset</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction#getOffset()
	 * @see #getElementarySoftwareFunction()
	 * @generated
	 */
	EReference getElementarySoftwareFunction_Offset();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction#getExecutionTime <em>Execution Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Execution Time</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction#getExecutionTime()
	 * @see #getElementarySoftwareFunction()
	 * @generated
	 */
	EReference getElementarySoftwareFunction_ExecutionTime();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction#getSpecifationBehavior <em>Specifation Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specifation Behavior</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction#getSpecifationBehavior()
	 * @see #getElementarySoftwareFunction()
	 * @generated
	 */
	EReference getElementarySoftwareFunction_SpecifationBehavior();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction#getImplementationBehavior <em>Implementation Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Implementation Behavior</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction#getImplementationBehavior()
	 * @see #getElementarySoftwareFunction()
	 * @generated
	 */
	EReference getElementarySoftwareFunction_ImplementationBehavior();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction#getActivePrecedencies <em>Active Precedencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Active Precedencies</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction#getActivePrecedencies()
	 * @see #getElementarySoftwareFunction()
	 * @generated
	 */
	EReference getElementarySoftwareFunction_ActivePrecedencies();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction#getPassivePrecedencies <em>Passive Precedencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Passive Precedencies</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction#getPassivePrecedencies()
	 * @see #getElementarySoftwareFunction()
	 * @generated
	 */
	EReference getElementarySoftwareFunction_PassivePrecedencies();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction#getPredecessors <em>Predecessors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Predecessors</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction#getPredecessors()
	 * @see #getElementarySoftwareFunction()
	 * @generated
	 */
	EReference getElementarySoftwareFunction_Predecessors();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction#getSuccessors <em>Successors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Successors</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction#getSuccessors()
	 * @see #getElementarySoftwareFunction()
	 * @generated
	 */
	EReference getElementarySoftwareFunction_Successors();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.CompositeSoftwareFunction <em>Composite Software Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Software Function</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.CompositeSoftwareFunction
	 * @generated
	 */
	EClass getCompositeSoftwareFunction();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.CompositeSoftwareFunction#getElementarySoftwareFunctions <em>Elementary Software Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elementary Software Functions</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.CompositeSoftwareFunction#getElementarySoftwareFunctions()
	 * @see #getCompositeSoftwareFunction()
	 * @generated
	 */
	EReference getCompositeSoftwareFunction_ElementarySoftwareFunctions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.CompositeSoftwareFunction#getCompositeSoftwareFunctions <em>Composite Software Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composite Software Functions</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.CompositeSoftwareFunction#getCompositeSoftwareFunctions()
	 * @see #getCompositeSoftwareFunction()
	 * @generated
	 */
	EReference getCompositeSoftwareFunction_CompositeSoftwareFunctions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.CompositeSoftwareFunction#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.CompositeSoftwareFunction#getPorts()
	 * @see #getCompositeSoftwareFunction()
	 * @generated
	 */
	EReference getCompositeSoftwareFunction_Ports();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.CompositeSoftwareFunction#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.CompositeSoftwareFunction#getParameters()
	 * @see #getCompositeSoftwareFunction()
	 * @generated
	 */
	EReference getCompositeSoftwareFunction_Parameters();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.LocalDeviceManager <em>Local Device Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Device Manager</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.LocalDeviceManager
	 * @generated
	 */
	EClass getLocalDeviceManager();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Precedence <em>Precedence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Precedence</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Precedence
	 * @generated
	 */
	EClass getPrecedence();

	/**
	 * Returns the meta object for the container reference '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Precedence#getPredecessor <em>Predecessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Predecessor</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Precedence#getPredecessor()
	 * @see #getPrecedence()
	 * @generated
	 */
	EReference getPrecedence_Predecessor();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Precedence#getSuccessor <em>Successor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Successor</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Precedence#getSuccessor()
	 * @see #getPrecedence()
	 * @generated
	 */
	EReference getPrecedence_Successor();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Functional_design_architectureFactory getFunctional_design_architectureFactory();

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
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.FunctionalDesignArchitectureImpl <em>Functional Design Architecture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.FunctionalDesignArchitectureImpl
		 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.Functional_design_architecturePackageImpl#getFunctionalDesignArchitecture()
		 * @generated
		 */
		EClass FUNCTIONAL_DESIGN_ARCHITECTURE = eINSTANCE.getFunctionalDesignArchitecture();

		/**
		 * The meta object literal for the '<em><b>Elementary Software Functions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_DESIGN_ARCHITECTURE__ELEMENTARY_SOFTWARE_FUNCTIONS = eINSTANCE.getFunctionalDesignArchitecture_ElementarySoftwareFunctions();

		/**
		 * The meta object literal for the '<em><b>Composite Software Functions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_DESIGN_ARCHITECTURE__COMPOSITE_SOFTWARE_FUNCTIONS = eINSTANCE.getFunctionalDesignArchitecture_CompositeSoftwareFunctions();

		/**
		 * The meta object literal for the '<em><b>Analysis Architecture</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_DESIGN_ARCHITECTURE__ANALYSIS_ARCHITECTURE = eINSTANCE.getFunctionalDesignArchitecture_AnalysisArchitecture();

		/**
		 * The meta object literal for the '<em><b>Vehicle Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_DESIGN_ARCHITECTURE__VEHICLE_MODEL = eINSTANCE.getFunctionalDesignArchitecture_VehicleModel();

		/**
		 * The meta object literal for the '<em><b>Instance Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_DESIGN_ARCHITECTURE__INSTANCE_MODEL = eINSTANCE.getFunctionalDesignArchitecture_InstanceModel();

		/**
		 * The meta object literal for the '<em><b>Type Associations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_DESIGN_ARCHITECTURE__TYPE_ASSOCIATIONS = eINSTANCE.getFunctionalDesignArchitecture_TypeAssociations();

		/**
		 * The meta object literal for the '<em><b>Implementation Data Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_DESIGN_ARCHITECTURE__IMPLEMENTATION_DATA_TYPES = eINSTANCE.getFunctionalDesignArchitecture_ImplementationDataTypes();

		/**
		 * The meta object literal for the '<em><b>Design Data Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_DESIGN_ARCHITECTURE__DESIGN_DATA_TYPES = eINSTANCE.getFunctionalDesignArchitecture_DesignDataTypes();

		/**
		 * The meta object literal for the '<em><b>Connector Signals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_DESIGN_ARCHITECTURE__CONNECTOR_SIGNALS = eINSTANCE.getFunctionalDesignArchitecture_ConnectorSignals();

		/**
		 * The meta object literal for the '<em><b>Operation Calls</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_DESIGN_ARCHITECTURE__OPERATION_CALLS = eINSTANCE.getFunctionalDesignArchitecture_OperationCalls();

		/**
		 * The meta object literal for the '<em><b>Hardware Architecture</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_DESIGN_ARCHITECTURE__HARDWARE_ARCHITECTURE = eINSTANCE.getFunctionalDesignArchitecture_HardwareArchitecture();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.ElementarySoftwareFunctionImpl <em>Elementary Software Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.ElementarySoftwareFunctionImpl
		 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.Functional_design_architecturePackageImpl#getElementarySoftwareFunction()
		 * @generated
		 */
		EClass ELEMENTARY_SOFTWARE_FUNCTION = eINSTANCE.getElementarySoftwareFunction();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENTARY_SOFTWARE_FUNCTION__PORTS = eINSTANCE.getElementarySoftwareFunction_Ports();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENTARY_SOFTWARE_FUNCTION__PARAMETERS = eINSTANCE.getElementarySoftwareFunction_Parameters();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENTARY_SOFTWARE_FUNCTION__INSTANCES = eINSTANCE.getElementarySoftwareFunction_Instances();

		/**
		 * The meta object literal for the '<em><b>Trigger Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENTARY_SOFTWARE_FUNCTION__TRIGGER_TYPE = eINSTANCE.getElementarySoftwareFunction_TriggerType();

		/**
		 * The meta object literal for the '<em><b>Trigger Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENTARY_SOFTWARE_FUNCTION__TRIGGER_EVENT = eINSTANCE.getElementarySoftwareFunction_TriggerEvent();

		/**
		 * The meta object literal for the '<em><b>Trigger Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENTARY_SOFTWARE_FUNCTION__TRIGGER_CONDITION = eINSTANCE.getElementarySoftwareFunction_TriggerCondition();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENTARY_SOFTWARE_FUNCTION__PERIOD = eINSTANCE.getElementarySoftwareFunction_Period();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENTARY_SOFTWARE_FUNCTION__OFFSET = eINSTANCE.getElementarySoftwareFunction_Offset();

		/**
		 * The meta object literal for the '<em><b>Execution Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENTARY_SOFTWARE_FUNCTION__EXECUTION_TIME = eINSTANCE.getElementarySoftwareFunction_ExecutionTime();

		/**
		 * The meta object literal for the '<em><b>Specifation Behavior</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENTARY_SOFTWARE_FUNCTION__SPECIFATION_BEHAVIOR = eINSTANCE.getElementarySoftwareFunction_SpecifationBehavior();

		/**
		 * The meta object literal for the '<em><b>Implementation Behavior</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENTARY_SOFTWARE_FUNCTION__IMPLEMENTATION_BEHAVIOR = eINSTANCE.getElementarySoftwareFunction_ImplementationBehavior();

		/**
		 * The meta object literal for the '<em><b>Active Precedencies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENTARY_SOFTWARE_FUNCTION__ACTIVE_PRECEDENCIES = eINSTANCE.getElementarySoftwareFunction_ActivePrecedencies();

		/**
		 * The meta object literal for the '<em><b>Passive Precedencies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENTARY_SOFTWARE_FUNCTION__PASSIVE_PRECEDENCIES = eINSTANCE.getElementarySoftwareFunction_PassivePrecedencies();

		/**
		 * The meta object literal for the '<em><b>Predecessors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENTARY_SOFTWARE_FUNCTION__PREDECESSORS = eINSTANCE.getElementarySoftwareFunction_Predecessors();

		/**
		 * The meta object literal for the '<em><b>Successors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENTARY_SOFTWARE_FUNCTION__SUCCESSORS = eINSTANCE.getElementarySoftwareFunction_Successors();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.CompositeSoftwareFunctionImpl <em>Composite Software Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.CompositeSoftwareFunctionImpl
		 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.Functional_design_architecturePackageImpl#getCompositeSoftwareFunction()
		 * @generated
		 */
		EClass COMPOSITE_SOFTWARE_FUNCTION = eINSTANCE.getCompositeSoftwareFunction();

		/**
		 * The meta object literal for the '<em><b>Elementary Software Functions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_SOFTWARE_FUNCTION__ELEMENTARY_SOFTWARE_FUNCTIONS = eINSTANCE.getCompositeSoftwareFunction_ElementarySoftwareFunctions();

		/**
		 * The meta object literal for the '<em><b>Composite Software Functions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_SOFTWARE_FUNCTION__COMPOSITE_SOFTWARE_FUNCTIONS = eINSTANCE.getCompositeSoftwareFunction_CompositeSoftwareFunctions();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_SOFTWARE_FUNCTION__PORTS = eINSTANCE.getCompositeSoftwareFunction_Ports();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_SOFTWARE_FUNCTION__PARAMETERS = eINSTANCE.getCompositeSoftwareFunction_Parameters();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.LocalDeviceManagerImpl <em>Local Device Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.LocalDeviceManagerImpl
		 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.Functional_design_architecturePackageImpl#getLocalDeviceManager()
		 * @generated
		 */
		EClass LOCAL_DEVICE_MANAGER = eINSTANCE.getLocalDeviceManager();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.PrecedenceImpl <em>Precedence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.PrecedenceImpl
		 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.Functional_design_architecturePackageImpl#getPrecedence()
		 * @generated
		 */
		EClass PRECEDENCE = eINSTANCE.getPrecedence();

		/**
		 * The meta object literal for the '<em><b>Predecessor</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRECEDENCE__PREDECESSOR = eINSTANCE.getPrecedence_Predecessor();

		/**
		 * The meta object literal for the '<em><b>Successor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRECEDENCE__SUCCESSOR = eINSTANCE.getPrecedence_Successor();

	}

} //Functional_design_architecturePackage
