/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture;

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
 * This package contains the entities of the FAA artifact. The goal here is to answer the question "what does the system do".
 * <!-- end-model-doc -->
 * @see org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.Functional_analysis_architectureFactory
 * @model kind="package"
 * @generated
 */
public interface Functional_analysis_architecturePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "functional_analysis_architecture";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.topcased.org/0.11.0/east_adl/structure/functional_analysis_architecture";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "functional_analysis_architecture";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Functional_analysis_architecturePackage eINSTANCE = org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl.Functional_analysis_architecturePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl.FunctionalAnalysisArchitectureImpl <em>Functional Analysis Architecture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl.FunctionalAnalysisArchitectureImpl
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl.Functional_analysis_architecturePackageImpl#getFunctionalAnalysisArchitecture()
	 * @generated
	 */
	int FUNCTIONAL_ANALYSIS_ARCHITECTURE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_ANALYSIS_ARCHITECTURE__NAME = CorePackage.EASTADL_ARTIFACT__NAME;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_ANALYSIS_ARCHITECTURE__REQUIREMENTS = CorePackage.EASTADL_ARTIFACT__REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_ANALYSIS_ARCHITECTURE__MODEL = CorePackage.EASTADL_ARTIFACT__MODEL;

	/**
	 * The feature id for the '<em><b>Support Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_ANALYSIS_ARCHITECTURE__SUPPORT_ENTITIES = CorePackage.EASTADL_ARTIFACT__SUPPORT_ENTITIES;

	/**
	 * The feature id for the '<em><b>Validation Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_ANALYSIS_ARCHITECTURE__VALIDATION_ENTITIES = CorePackage.EASTADL_ARTIFACT__VALIDATION_ENTITIES;

	/**
	 * The feature id for the '<em><b>Analysis Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_ANALYSIS_ARCHITECTURE__ANALYSIS_FUNCTIONS = CorePackage.EASTADL_ARTIFACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Functional Devices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_ANALYSIS_ARCHITECTURE__FUNCTIONAL_DEVICES = CorePackage.EASTADL_ARTIFACT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Vehicle Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_ANALYSIS_ARCHITECTURE__VEHICLE_MODEL = CorePackage.EASTADL_ARTIFACT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Design Architecture</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_ANALYSIS_ARCHITECTURE__DESIGN_ARCHITECTURE = CorePackage.EASTADL_ARTIFACT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Design Data Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_ANALYSIS_ARCHITECTURE__DESIGN_DATA_TYPES = CorePackage.EASTADL_ARTIFACT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Connector Signals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_ANALYSIS_ARCHITECTURE__CONNECTOR_SIGNALS = CorePackage.EASTADL_ARTIFACT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Operation Calls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_ANALYSIS_ARCHITECTURE__OPERATION_CALLS = CorePackage.EASTADL_ARTIFACT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Type Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_ANALYSIS_ARCHITECTURE__TYPE_ASSOCIATIONS = CorePackage.EASTADL_ARTIFACT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Implementation Data Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_ANALYSIS_ARCHITECTURE__IMPLEMENTATION_DATA_TYPES = CorePackage.EASTADL_ARTIFACT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Functional Analysis Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_ANALYSIS_ARCHITECTURE_FEATURE_COUNT = CorePackage.EASTADL_ARTIFACT_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl.AnalysisFunctionImpl <em>Analysis Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl.AnalysisFunctionImpl
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl.Functional_analysis_architecturePackageImpl#getAnalysisFunction()
	 * @generated
	 */
	int ANALYSIS_FUNCTION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FUNCTION__NAME = CorePackage.EASTADL_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Passive Assignments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FUNCTION__PASSIVE_ASSIGNMENTS = CorePackage.EASTADL_ENTITY__PASSIVE_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Assigned Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FUNCTION__ASSIGNED_REQUIREMENTS = CorePackage.EASTADL_ENTITY__ASSIGNED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Null Variant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FUNCTION__NULL_VARIANT = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FUNCTION__COMPLETE = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Active Variations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FUNCTION__ACTIVE_VARIATIONS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Active Selections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FUNCTION__ACTIVE_SELECTIONS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Active Exclusions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FUNCTION__ACTIVE_EXCLUSIONS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Passive Variation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FUNCTION__PASSIVE_VARIATION = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Passive Selections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FUNCTION__PASSIVE_SELECTIONS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Passive Exclusions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FUNCTION__PASSIVE_EXCLUSIONS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Variation Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FUNCTION__VARIATION_POINT = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FUNCTION__VARIANTS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Selectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FUNCTION__SELECTORS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FUNCTION__SELECTED = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Excluders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FUNCTION__EXCLUDERS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Excluded</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FUNCTION__EXCLUDED = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Selection Criterion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FUNCTION__SELECTION_CRITERION = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Passive Realizations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FUNCTION__PASSIVE_REALIZATIONS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Realized By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FUNCTION__REALIZED_BY = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Active Realizations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FUNCTION__ACTIVE_REALIZATIONS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FUNCTION__REALIZES = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Allocation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FUNCTION__ALLOCATION = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Allocation Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FUNCTION__ALLOCATION_TARGET = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FUNCTION__VALIDATORS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FUNCTION__PARAMETERS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FUNCTION__PORTS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Sub Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FUNCTION__SUB_FUNCTIONS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Analysis Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FUNCTION__ANALYSIS_BEHAVIOR = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Functional Devices</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FUNCTION__FUNCTIONAL_DEVICES = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 26;

	/**
	 * The number of structural features of the '<em>Analysis Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FUNCTION_FEATURE_COUNT = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 27;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl.FunctionalDeviceImpl <em>Functional Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl.FunctionalDeviceImpl
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl.Functional_analysis_architecturePackageImpl#getFunctionalDevice()
	 * @generated
	 */
	int FUNCTIONAL_DEVICE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DEVICE__NAME = CorePackage.EASTADL_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Passive Assignments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DEVICE__PASSIVE_ASSIGNMENTS = CorePackage.EASTADL_ENTITY__PASSIVE_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Assigned Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DEVICE__ASSIGNED_REQUIREMENTS = CorePackage.EASTADL_ENTITY__ASSIGNED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Passive Realizations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DEVICE__PASSIVE_REALIZATIONS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Realized By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DEVICE__REALIZED_BY = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DEVICE__VALIDATORS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owning Artifact</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DEVICE__OWNING_ARTIFACT = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DEVICE__PARAMETERS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DEVICE__PORTS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Owning Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DEVICE__OWNING_FUNCTION = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Functional Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DEVICE_FEATURE_COUNT = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl.EnvironmentFunctionImpl <em>Environment Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl.EnvironmentFunctionImpl
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl.Functional_analysis_architecturePackageImpl#getEnvironmentFunction()
	 * @generated
	 */
	int ENVIRONMENT_FUNCTION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FUNCTION__NAME = ANALYSIS_FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Passive Assignments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FUNCTION__PASSIVE_ASSIGNMENTS = ANALYSIS_FUNCTION__PASSIVE_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Assigned Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FUNCTION__ASSIGNED_REQUIREMENTS = ANALYSIS_FUNCTION__ASSIGNED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Null Variant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FUNCTION__NULL_VARIANT = ANALYSIS_FUNCTION__NULL_VARIANT;

	/**
	 * The feature id for the '<em><b>Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FUNCTION__COMPLETE = ANALYSIS_FUNCTION__COMPLETE;

	/**
	 * The feature id for the '<em><b>Active Variations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FUNCTION__ACTIVE_VARIATIONS = ANALYSIS_FUNCTION__ACTIVE_VARIATIONS;

	/**
	 * The feature id for the '<em><b>Active Selections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FUNCTION__ACTIVE_SELECTIONS = ANALYSIS_FUNCTION__ACTIVE_SELECTIONS;

	/**
	 * The feature id for the '<em><b>Active Exclusions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FUNCTION__ACTIVE_EXCLUSIONS = ANALYSIS_FUNCTION__ACTIVE_EXCLUSIONS;

	/**
	 * The feature id for the '<em><b>Passive Variation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FUNCTION__PASSIVE_VARIATION = ANALYSIS_FUNCTION__PASSIVE_VARIATION;

	/**
	 * The feature id for the '<em><b>Passive Selections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FUNCTION__PASSIVE_SELECTIONS = ANALYSIS_FUNCTION__PASSIVE_SELECTIONS;

	/**
	 * The feature id for the '<em><b>Passive Exclusions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FUNCTION__PASSIVE_EXCLUSIONS = ANALYSIS_FUNCTION__PASSIVE_EXCLUSIONS;

	/**
	 * The feature id for the '<em><b>Variation Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FUNCTION__VARIATION_POINT = ANALYSIS_FUNCTION__VARIATION_POINT;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FUNCTION__VARIANTS = ANALYSIS_FUNCTION__VARIANTS;

	/**
	 * The feature id for the '<em><b>Selectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FUNCTION__SELECTORS = ANALYSIS_FUNCTION__SELECTORS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FUNCTION__SELECTED = ANALYSIS_FUNCTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Excluders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FUNCTION__EXCLUDERS = ANALYSIS_FUNCTION__EXCLUDERS;

	/**
	 * The feature id for the '<em><b>Excluded</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FUNCTION__EXCLUDED = ANALYSIS_FUNCTION__EXCLUDED;

	/**
	 * The feature id for the '<em><b>Selection Criterion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FUNCTION__SELECTION_CRITERION = ANALYSIS_FUNCTION__SELECTION_CRITERION;

	/**
	 * The feature id for the '<em><b>Passive Realizations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FUNCTION__PASSIVE_REALIZATIONS = ANALYSIS_FUNCTION__PASSIVE_REALIZATIONS;

	/**
	 * The feature id for the '<em><b>Realized By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FUNCTION__REALIZED_BY = ANALYSIS_FUNCTION__REALIZED_BY;

	/**
	 * The feature id for the '<em><b>Active Realizations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FUNCTION__ACTIVE_REALIZATIONS = ANALYSIS_FUNCTION__ACTIVE_REALIZATIONS;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FUNCTION__REALIZES = ANALYSIS_FUNCTION__REALIZES;

	/**
	 * The feature id for the '<em><b>Allocation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FUNCTION__ALLOCATION = ANALYSIS_FUNCTION__ALLOCATION;

	/**
	 * The feature id for the '<em><b>Allocation Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FUNCTION__ALLOCATION_TARGET = ANALYSIS_FUNCTION__ALLOCATION_TARGET;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FUNCTION__VALIDATORS = ANALYSIS_FUNCTION__VALIDATORS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FUNCTION__PARAMETERS = ANALYSIS_FUNCTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FUNCTION__PORTS = ANALYSIS_FUNCTION__PORTS;

	/**
	 * The feature id for the '<em><b>Sub Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FUNCTION__SUB_FUNCTIONS = ANALYSIS_FUNCTION__SUB_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Analysis Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FUNCTION__ANALYSIS_BEHAVIOR = ANALYSIS_FUNCTION__ANALYSIS_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Functional Devices</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FUNCTION__FUNCTIONAL_DEVICES = ANALYSIS_FUNCTION__FUNCTIONAL_DEVICES;

	/**
	 * The feature id for the '<em><b>Actuators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FUNCTION__ACTUATORS = ANALYSIS_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sensors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FUNCTION__SENSORS = ANALYSIS_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Environment Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FUNCTION_FEATURE_COUNT = ANALYSIS_FUNCTION_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.FunctionalAnalysisArchitecture <em>Functional Analysis Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional Analysis Architecture</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.FunctionalAnalysisArchitecture
	 * @generated
	 */
	EClass getFunctionalAnalysisArchitecture();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.FunctionalAnalysisArchitecture#getAnalysisFunctions <em>Analysis Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Analysis Functions</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.FunctionalAnalysisArchitecture#getAnalysisFunctions()
	 * @see #getFunctionalAnalysisArchitecture()
	 * @generated
	 */
	EReference getFunctionalAnalysisArchitecture_AnalysisFunctions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.FunctionalAnalysisArchitecture#getFunctionalDevices <em>Functional Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Functional Devices</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.FunctionalAnalysisArchitecture#getFunctionalDevices()
	 * @see #getFunctionalAnalysisArchitecture()
	 * @generated
	 */
	EReference getFunctionalAnalysisArchitecture_FunctionalDevices();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.FunctionalAnalysisArchitecture#getVehicleModel <em>Vehicle Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vehicle Model</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.FunctionalAnalysisArchitecture#getVehicleModel()
	 * @see #getFunctionalAnalysisArchitecture()
	 * @generated
	 */
	EReference getFunctionalAnalysisArchitecture_VehicleModel();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.FunctionalAnalysisArchitecture#getDesignArchitecture <em>Design Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Design Architecture</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.FunctionalAnalysisArchitecture#getDesignArchitecture()
	 * @see #getFunctionalAnalysisArchitecture()
	 * @generated
	 */
	EReference getFunctionalAnalysisArchitecture_DesignArchitecture();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.FunctionalAnalysisArchitecture#getDesignDataTypes <em>Design Data Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Design Data Types</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.FunctionalAnalysisArchitecture#getDesignDataTypes()
	 * @see #getFunctionalAnalysisArchitecture()
	 * @generated
	 */
	EReference getFunctionalAnalysisArchitecture_DesignDataTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.FunctionalAnalysisArchitecture#getConnectorSignals <em>Connector Signals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connector Signals</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.FunctionalAnalysisArchitecture#getConnectorSignals()
	 * @see #getFunctionalAnalysisArchitecture()
	 * @generated
	 */
	EReference getFunctionalAnalysisArchitecture_ConnectorSignals();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.FunctionalAnalysisArchitecture#getOperationCalls <em>Operation Calls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation Calls</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.FunctionalAnalysisArchitecture#getOperationCalls()
	 * @see #getFunctionalAnalysisArchitecture()
	 * @generated
	 */
	EReference getFunctionalAnalysisArchitecture_OperationCalls();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.FunctionalAnalysisArchitecture#getTypeAssociations <em>Type Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type Associations</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.FunctionalAnalysisArchitecture#getTypeAssociations()
	 * @see #getFunctionalAnalysisArchitecture()
	 * @generated
	 */
	EReference getFunctionalAnalysisArchitecture_TypeAssociations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.FunctionalAnalysisArchitecture#getImplementationDataTypes <em>Implementation Data Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Implementation Data Types</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.FunctionalAnalysisArchitecture#getImplementationDataTypes()
	 * @see #getFunctionalAnalysisArchitecture()
	 * @generated
	 */
	EReference getFunctionalAnalysisArchitecture_ImplementationDataTypes();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.AnalysisFunction <em>Analysis Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analysis Function</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.AnalysisFunction
	 * @generated
	 */
	EClass getAnalysisFunction();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.AnalysisFunction#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.AnalysisFunction#getParameters()
	 * @see #getAnalysisFunction()
	 * @generated
	 */
	EReference getAnalysisFunction_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.AnalysisFunction#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.AnalysisFunction#getPorts()
	 * @see #getAnalysisFunction()
	 * @generated
	 */
	EReference getAnalysisFunction_Ports();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.AnalysisFunction#getSubFunctions <em>Sub Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Functions</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.AnalysisFunction#getSubFunctions()
	 * @see #getAnalysisFunction()
	 * @generated
	 */
	EReference getAnalysisFunction_SubFunctions();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.AnalysisFunction#getAnalysisBehavior <em>Analysis Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Analysis Behavior</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.AnalysisFunction#getAnalysisBehavior()
	 * @see #getAnalysisFunction()
	 * @generated
	 */
	EReference getAnalysisFunction_AnalysisBehavior();

	/**
	 * Returns the meta object for the container reference '{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.AnalysisFunction#getFunctionalDevices <em>Functional Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Functional Devices</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.AnalysisFunction#getFunctionalDevices()
	 * @see #getAnalysisFunction()
	 * @generated
	 */
	EReference getAnalysisFunction_FunctionalDevices();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.FunctionalDevice <em>Functional Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional Device</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.FunctionalDevice
	 * @generated
	 */
	EClass getFunctionalDevice();

	/**
	 * Returns the meta object for the container reference '{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.FunctionalDevice#getOwningArtifact <em>Owning Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Artifact</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.FunctionalDevice#getOwningArtifact()
	 * @see #getFunctionalDevice()
	 * @generated
	 */
	EReference getFunctionalDevice_OwningArtifact();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.FunctionalDevice#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.FunctionalDevice#getParameters()
	 * @see #getFunctionalDevice()
	 * @generated
	 */
	EReference getFunctionalDevice_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.FunctionalDevice#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.FunctionalDevice#getPorts()
	 * @see #getFunctionalDevice()
	 * @generated
	 */
	EReference getFunctionalDevice_Ports();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.FunctionalDevice#getOwningFunction <em>Owning Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owning Function</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.FunctionalDevice#getOwningFunction()
	 * @see #getFunctionalDevice()
	 * @generated
	 */
	EReference getFunctionalDevice_OwningFunction();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.EnvironmentFunction <em>Environment Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment Function</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.EnvironmentFunction
	 * @generated
	 */
	EClass getEnvironmentFunction();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.EnvironmentFunction#getActuators <em>Actuators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actuators</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.EnvironmentFunction#getActuators()
	 * @see #getEnvironmentFunction()
	 * @generated
	 */
	EReference getEnvironmentFunction_Actuators();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.EnvironmentFunction#getSensors <em>Sensors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sensors</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.EnvironmentFunction#getSensors()
	 * @see #getEnvironmentFunction()
	 * @generated
	 */
	EReference getEnvironmentFunction_Sensors();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Functional_analysis_architectureFactory getFunctional_analysis_architectureFactory();

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
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl.FunctionalAnalysisArchitectureImpl <em>Functional Analysis Architecture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl.FunctionalAnalysisArchitectureImpl
		 * @see org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl.Functional_analysis_architecturePackageImpl#getFunctionalAnalysisArchitecture()
		 * @generated
		 */
		EClass FUNCTIONAL_ANALYSIS_ARCHITECTURE = eINSTANCE.getFunctionalAnalysisArchitecture();

		/**
		 * The meta object literal for the '<em><b>Analysis Functions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_ANALYSIS_ARCHITECTURE__ANALYSIS_FUNCTIONS = eINSTANCE.getFunctionalAnalysisArchitecture_AnalysisFunctions();

		/**
		 * The meta object literal for the '<em><b>Functional Devices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_ANALYSIS_ARCHITECTURE__FUNCTIONAL_DEVICES = eINSTANCE.getFunctionalAnalysisArchitecture_FunctionalDevices();

		/**
		 * The meta object literal for the '<em><b>Vehicle Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_ANALYSIS_ARCHITECTURE__VEHICLE_MODEL = eINSTANCE.getFunctionalAnalysisArchitecture_VehicleModel();

		/**
		 * The meta object literal for the '<em><b>Design Architecture</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_ANALYSIS_ARCHITECTURE__DESIGN_ARCHITECTURE = eINSTANCE.getFunctionalAnalysisArchitecture_DesignArchitecture();

		/**
		 * The meta object literal for the '<em><b>Design Data Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_ANALYSIS_ARCHITECTURE__DESIGN_DATA_TYPES = eINSTANCE.getFunctionalAnalysisArchitecture_DesignDataTypes();

		/**
		 * The meta object literal for the '<em><b>Connector Signals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_ANALYSIS_ARCHITECTURE__CONNECTOR_SIGNALS = eINSTANCE.getFunctionalAnalysisArchitecture_ConnectorSignals();

		/**
		 * The meta object literal for the '<em><b>Operation Calls</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_ANALYSIS_ARCHITECTURE__OPERATION_CALLS = eINSTANCE.getFunctionalAnalysisArchitecture_OperationCalls();

		/**
		 * The meta object literal for the '<em><b>Type Associations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_ANALYSIS_ARCHITECTURE__TYPE_ASSOCIATIONS = eINSTANCE.getFunctionalAnalysisArchitecture_TypeAssociations();

		/**
		 * The meta object literal for the '<em><b>Implementation Data Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_ANALYSIS_ARCHITECTURE__IMPLEMENTATION_DATA_TYPES = eINSTANCE.getFunctionalAnalysisArchitecture_ImplementationDataTypes();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl.AnalysisFunctionImpl <em>Analysis Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl.AnalysisFunctionImpl
		 * @see org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl.Functional_analysis_architecturePackageImpl#getAnalysisFunction()
		 * @generated
		 */
		EClass ANALYSIS_FUNCTION = eINSTANCE.getAnalysisFunction();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS_FUNCTION__PARAMETERS = eINSTANCE.getAnalysisFunction_Parameters();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS_FUNCTION__PORTS = eINSTANCE.getAnalysisFunction_Ports();

		/**
		 * The meta object literal for the '<em><b>Sub Functions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS_FUNCTION__SUB_FUNCTIONS = eINSTANCE.getAnalysisFunction_SubFunctions();

		/**
		 * The meta object literal for the '<em><b>Analysis Behavior</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS_FUNCTION__ANALYSIS_BEHAVIOR = eINSTANCE.getAnalysisFunction_AnalysisBehavior();

		/**
		 * The meta object literal for the '<em><b>Functional Devices</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS_FUNCTION__FUNCTIONAL_DEVICES = eINSTANCE.getAnalysisFunction_FunctionalDevices();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl.FunctionalDeviceImpl <em>Functional Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl.FunctionalDeviceImpl
		 * @see org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl.Functional_analysis_architecturePackageImpl#getFunctionalDevice()
		 * @generated
		 */
		EClass FUNCTIONAL_DEVICE = eINSTANCE.getFunctionalDevice();

		/**
		 * The meta object literal for the '<em><b>Owning Artifact</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_DEVICE__OWNING_ARTIFACT = eINSTANCE.getFunctionalDevice_OwningArtifact();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_DEVICE__PARAMETERS = eINSTANCE.getFunctionalDevice_Parameters();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_DEVICE__PORTS = eINSTANCE.getFunctionalDevice_Ports();

		/**
		 * The meta object literal for the '<em><b>Owning Function</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_DEVICE__OWNING_FUNCTION = eINSTANCE.getFunctionalDevice_OwningFunction();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl.EnvironmentFunctionImpl <em>Environment Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl.EnvironmentFunctionImpl
		 * @see org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl.Functional_analysis_architecturePackageImpl#getEnvironmentFunction()
		 * @generated
		 */
		EClass ENVIRONMENT_FUNCTION = eINSTANCE.getEnvironmentFunction();

		/**
		 * The meta object literal for the '<em><b>Actuators</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT_FUNCTION__ACTUATORS = eINSTANCE.getEnvironmentFunction_Actuators();

		/**
		 * The meta object literal for the '<em><b>Sensors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT_FUNCTION__SENSORS = eINSTANCE.getEnvironmentFunction_Sensors();

	}

} //Functional_analysis_architecturePackage
