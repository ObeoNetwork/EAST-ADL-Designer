/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model;

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
 * This package contains entities of the VFM artifact.
 * <!-- end-model-doc -->
 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.Vehicle_feature_modelFactory
 * @model kind="package"
 * @generated
 */
public interface Vehicle_feature_modelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "vehicle_feature_model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.topcased.org/0.11.0/east_adl/structure/vehicle_feature_model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "vehicle_feature_model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Vehicle_feature_modelPackage eINSTANCE = org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.Vehicle_feature_modelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.VehicleFeatureModelImpl <em>Vehicle Feature Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.VehicleFeatureModelImpl
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.Vehicle_feature_modelPackageImpl#getVehicleFeatureModel()
	 * @generated
	 */
	int VEHICLE_FEATURE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_FEATURE_MODEL__NAME = CorePackage.EASTADL_ARTIFACT__NAME;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_FEATURE_MODEL__REQUIREMENTS = CorePackage.EASTADL_ARTIFACT__REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_FEATURE_MODEL__MODEL = CorePackage.EASTADL_ARTIFACT__MODEL;

	/**
	 * The feature id for the '<em><b>Support Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_FEATURE_MODEL__SUPPORT_ENTITIES = CorePackage.EASTADL_ARTIFACT__SUPPORT_ENTITIES;

	/**
	 * The feature id for the '<em><b>Validation Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_FEATURE_MODEL__VALIDATION_ENTITIES = CorePackage.EASTADL_ARTIFACT__VALIDATION_ENTITIES;

	/**
	 * The feature id for the '<em><b>Vehicle Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_FEATURE_MODEL__VEHICLE_PARAMETERS = CorePackage.EASTADL_ARTIFACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vehicle Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_FEATURE_MODEL__VEHICLE_SETS = CorePackage.EASTADL_ARTIFACT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Analysis Architecture</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_FEATURE_MODEL__ANALYSIS_ARCHITECTURE = CorePackage.EASTADL_ARTIFACT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Design Architecture</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_FEATURE_MODEL__DESIGN_ARCHITECTURE = CorePackage.EASTADL_ARTIFACT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Electronic Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_FEATURE_MODEL__ELECTRONIC_FEATURES = CorePackage.EASTADL_ARTIFACT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Vehicle Feature Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_FEATURE_MODEL_FEATURE_COUNT = CorePackage.EASTADL_ARTIFACT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.VehicleParameterImpl <em>Vehicle Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.VehicleParameterImpl
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.Vehicle_feature_modelPackageImpl#getVehicleParameter()
	 * @generated
	 */
	int VEHICLE_PARAMETER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_PARAMETER__NAME = CorePackage.EASTADL_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Passive Assignments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_PARAMETER__PASSIVE_ASSIGNMENTS = CorePackage.EASTADL_ENTITY__PASSIVE_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Assigned Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_PARAMETER__ASSIGNED_REQUIREMENTS = CorePackage.EASTADL_ENTITY__ASSIGNED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Customer Choice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_PARAMETER__CUSTOMER_CHOICE = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_PARAMETER__TYPE = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owning Artifact</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_PARAMETER__OWNING_ARTIFACT = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Vehicle Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_PARAMETER_FEATURE_COUNT = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.VehicleSetImpl <em>Vehicle Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.VehicleSetImpl
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.Vehicle_feature_modelPackageImpl#getVehicleSet()
	 * @generated
	 */
	int VEHICLE_SET = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_SET__NAME = CorePackage.EASTADL_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Passive Assignments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_SET__PASSIVE_ASSIGNMENTS = CorePackage.EASTADL_ENTITY__PASSIVE_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Assigned Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_SET__ASSIGNED_REQUIREMENTS = CorePackage.EASTADL_ENTITY__ASSIGNED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Inclusions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_SET__INCLUSIONS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vehicle Inclusion Criterion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_SET__VEHICLE_INCLUSION_CRITERION = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owning Artifact</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_SET__OWNING_ARTIFACT = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Included EFeatures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_SET__INCLUDED_EFEATURES = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Vehicle Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_SET_FEATURE_COUNT = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.InclusionImpl <em>Inclusion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.InclusionImpl
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.Vehicle_feature_modelPackageImpl#getInclusion()
	 * @generated
	 */
	int INCLUSION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSION__NAME = CorePackage.EASTADL_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Electronic Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSION__ELECTRONIC_FEATURE = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vehicle Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSION__VEHICLE_SET = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Inclusion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSION_FEATURE_COUNT = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.EFeatureImpl <em>EFeature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.EFeatureImpl
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.Vehicle_feature_modelPackageImpl#getEFeature()
	 * @generated
	 */
	int EFEATURE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFEATURE__NAME = CorePackage.EASTADL_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Passive Assignments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFEATURE__PASSIVE_ASSIGNMENTS = CorePackage.EASTADL_ENTITY__PASSIVE_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Assigned Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFEATURE__ASSIGNED_REQUIREMENTS = CorePackage.EASTADL_ENTITY__ASSIGNED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Passive Realizations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFEATURE__PASSIVE_REALIZATIONS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Realized By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFEATURE__REALIZED_BY = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Allocation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFEATURE__ALLOCATION = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Allocation Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFEATURE__ALLOCATION_TARGET = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Archive Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFEATURE__ARCHIVE_DESCRIPTION = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Version Archive</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFEATURE__VERSION_ARCHIVE = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Null Variant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFEATURE__NULL_VARIANT = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFEATURE__COMPLETE = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Active Variations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFEATURE__ACTIVE_VARIATIONS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Active Selections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFEATURE__ACTIVE_SELECTIONS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Active Exclusions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFEATURE__ACTIVE_EXCLUSIONS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Passive Variation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFEATURE__PASSIVE_VARIATION = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Passive Selections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFEATURE__PASSIVE_SELECTIONS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Passive Exclusions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFEATURE__PASSIVE_EXCLUSIONS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Variation Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFEATURE__VARIATION_POINT = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFEATURE__VARIANTS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Selectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFEATURE__SELECTORS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFEATURE__SELECTED = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Excluders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFEATURE__EXCLUDERS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Excluded</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFEATURE__EXCLUDED = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Selection Criterion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFEATURE__SELECTION_CRITERION = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFEATURE__VALIDATORS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFEATURE__OPTIONAL = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Visible By Customer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFEATURE__VISIBLE_BY_CUSTOMER = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Passive Specifications</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFEATURE__PASSIVE_SPECIFICATIONS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Passive Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFEATURE__PASSIVE_CONSTRAINTS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Specifying Functional Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFEATURE__SPECIFYING_FUNCTIONAL_REQUIREMENTS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Constraining Design Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFEATURE__CONSTRAINING_DESIGN_CONSTRAINTS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Inclusions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFEATURE__INCLUSIONS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Including Vehicle Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFEATURE__INCLUDING_VEHICLE_SETS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Sub Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFEATURE__SUB_FEATURES = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFEATURE__DESCRIPTION = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 31;

	/**
	 * The number of structural features of the '<em>EFeature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFEATURE_FEATURE_COUNT = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 32;


	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleFeatureModel <em>Vehicle Feature Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vehicle Feature Model</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleFeatureModel
	 * @generated
	 */
	EClass getVehicleFeatureModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleFeatureModel#getVehicleParameters <em>Vehicle Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vehicle Parameters</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleFeatureModel#getVehicleParameters()
	 * @see #getVehicleFeatureModel()
	 * @generated
	 */
	EReference getVehicleFeatureModel_VehicleParameters();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleFeatureModel#getVehicleSets <em>Vehicle Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vehicle Sets</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleFeatureModel#getVehicleSets()
	 * @see #getVehicleFeatureModel()
	 * @generated
	 */
	EReference getVehicleFeatureModel_VehicleSets();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleFeatureModel#getAnalysisArchitecture <em>Analysis Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Analysis Architecture</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleFeatureModel#getAnalysisArchitecture()
	 * @see #getVehicleFeatureModel()
	 * @generated
	 */
	EReference getVehicleFeatureModel_AnalysisArchitecture();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleFeatureModel#getDesignArchitecture <em>Design Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Design Architecture</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleFeatureModel#getDesignArchitecture()
	 * @see #getVehicleFeatureModel()
	 * @generated
	 */
	EReference getVehicleFeatureModel_DesignArchitecture();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleFeatureModel#getElectronicFeatures <em>Electronic Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Electronic Features</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleFeatureModel#getElectronicFeatures()
	 * @see #getVehicleFeatureModel()
	 * @generated
	 */
	EReference getVehicleFeatureModel_ElectronicFeatures();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleParameter <em>Vehicle Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vehicle Parameter</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleParameter
	 * @generated
	 */
	EClass getVehicleParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleParameter#isCustomerChoice <em>Customer Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customer Choice</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleParameter#isCustomerChoice()
	 * @see #getVehicleParameter()
	 * @generated
	 */
	EAttribute getVehicleParameter_CustomerChoice();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleParameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleParameter#getType()
	 * @see #getVehicleParameter()
	 * @generated
	 */
	EAttribute getVehicleParameter_Type();

	/**
	 * Returns the meta object for the container reference '{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleParameter#getOwningArtifact <em>Owning Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Artifact</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleParameter#getOwningArtifact()
	 * @see #getVehicleParameter()
	 * @generated
	 */
	EReference getVehicleParameter_OwningArtifact();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleSet <em>Vehicle Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vehicle Set</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleSet
	 * @generated
	 */
	EClass getVehicleSet();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleSet#getInclusions <em>Inclusions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inclusions</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleSet#getInclusions()
	 * @see #getVehicleSet()
	 * @generated
	 */
	EReference getVehicleSet_Inclusions();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleSet#getVehicleInclusionCriterion <em>Vehicle Inclusion Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vehicle Inclusion Criterion</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleSet#getVehicleInclusionCriterion()
	 * @see #getVehicleSet()
	 * @generated
	 */
	EAttribute getVehicleSet_VehicleInclusionCriterion();

	/**
	 * Returns the meta object for the container reference '{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleSet#getOwningArtifact <em>Owning Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Artifact</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleSet#getOwningArtifact()
	 * @see #getVehicleSet()
	 * @generated
	 */
	EReference getVehicleSet_OwningArtifact();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleSet#getIncludedEFeatures <em>Included EFeatures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Included EFeatures</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleSet#getIncludedEFeatures()
	 * @see #getVehicleSet()
	 * @generated
	 */
	EReference getVehicleSet_IncludedEFeatures();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.Inclusion <em>Inclusion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inclusion</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.Inclusion
	 * @generated
	 */
	EClass getInclusion();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.Inclusion#getElectronicFeature <em>Electronic Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Electronic Feature</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.Inclusion#getElectronicFeature()
	 * @see #getInclusion()
	 * @generated
	 */
	EReference getInclusion_ElectronicFeature();

	/**
	 * Returns the meta object for the container reference '{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.Inclusion#getVehicleSet <em>Vehicle Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Vehicle Set</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.Inclusion#getVehicleSet()
	 * @see #getInclusion()
	 * @generated
	 */
	EReference getInclusion_VehicleSet();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.EFeature <em>EFeature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EFeature</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.EFeature
	 * @generated
	 */
	EClass getEFeature();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.EFeature#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.EFeature#isOptional()
	 * @see #getEFeature()
	 * @generated
	 */
	EAttribute getEFeature_Optional();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.EFeature#isVisibleByCustomer <em>Visible By Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible By Customer</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.EFeature#isVisibleByCustomer()
	 * @see #getEFeature()
	 * @generated
	 */
	EAttribute getEFeature_VisibleByCustomer();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.EFeature#getPassiveSpecifications <em>Passive Specifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Passive Specifications</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.EFeature#getPassiveSpecifications()
	 * @see #getEFeature()
	 * @generated
	 */
	EReference getEFeature_PassiveSpecifications();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.EFeature#getPassiveConstraints <em>Passive Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Passive Constraints</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.EFeature#getPassiveConstraints()
	 * @see #getEFeature()
	 * @generated
	 */
	EReference getEFeature_PassiveConstraints();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.EFeature#getSpecifyingFunctionalRequirements <em>Specifying Functional Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Specifying Functional Requirements</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.EFeature#getSpecifyingFunctionalRequirements()
	 * @see #getEFeature()
	 * @generated
	 */
	EReference getEFeature_SpecifyingFunctionalRequirements();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.EFeature#getConstrainingDesignConstraints <em>Constraining Design Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Constraining Design Constraints</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.EFeature#getConstrainingDesignConstraints()
	 * @see #getEFeature()
	 * @generated
	 */
	EReference getEFeature_ConstrainingDesignConstraints();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.EFeature#getInclusions <em>Inclusions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inclusions</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.EFeature#getInclusions()
	 * @see #getEFeature()
	 * @generated
	 */
	EReference getEFeature_Inclusions();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.EFeature#getIncludingVehicleSets <em>Including Vehicle Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Including Vehicle Sets</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.EFeature#getIncludingVehicleSets()
	 * @see #getEFeature()
	 * @generated
	 */
	EReference getEFeature_IncludingVehicleSets();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.EFeature#getSubFeatures <em>Sub Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Features</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.EFeature#getSubFeatures()
	 * @see #getEFeature()
	 * @generated
	 */
	EReference getEFeature_SubFeatures();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.EFeature#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.EFeature#getDescription()
	 * @see #getEFeature()
	 * @generated
	 */
	EAttribute getEFeature_Description();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Vehicle_feature_modelFactory getVehicle_feature_modelFactory();

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
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.VehicleFeatureModelImpl <em>Vehicle Feature Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.VehicleFeatureModelImpl
		 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.Vehicle_feature_modelPackageImpl#getVehicleFeatureModel()
		 * @generated
		 */
		EClass VEHICLE_FEATURE_MODEL = eINSTANCE.getVehicleFeatureModel();

		/**
		 * The meta object literal for the '<em><b>Vehicle Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VEHICLE_FEATURE_MODEL__VEHICLE_PARAMETERS = eINSTANCE.getVehicleFeatureModel_VehicleParameters();

		/**
		 * The meta object literal for the '<em><b>Vehicle Sets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VEHICLE_FEATURE_MODEL__VEHICLE_SETS = eINSTANCE.getVehicleFeatureModel_VehicleSets();

		/**
		 * The meta object literal for the '<em><b>Analysis Architecture</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VEHICLE_FEATURE_MODEL__ANALYSIS_ARCHITECTURE = eINSTANCE.getVehicleFeatureModel_AnalysisArchitecture();

		/**
		 * The meta object literal for the '<em><b>Design Architecture</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VEHICLE_FEATURE_MODEL__DESIGN_ARCHITECTURE = eINSTANCE.getVehicleFeatureModel_DesignArchitecture();

		/**
		 * The meta object literal for the '<em><b>Electronic Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VEHICLE_FEATURE_MODEL__ELECTRONIC_FEATURES = eINSTANCE.getVehicleFeatureModel_ElectronicFeatures();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.VehicleParameterImpl <em>Vehicle Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.VehicleParameterImpl
		 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.Vehicle_feature_modelPackageImpl#getVehicleParameter()
		 * @generated
		 */
		EClass VEHICLE_PARAMETER = eINSTANCE.getVehicleParameter();

		/**
		 * The meta object literal for the '<em><b>Customer Choice</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE_PARAMETER__CUSTOMER_CHOICE = eINSTANCE.getVehicleParameter_CustomerChoice();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE_PARAMETER__TYPE = eINSTANCE.getVehicleParameter_Type();

		/**
		 * The meta object literal for the '<em><b>Owning Artifact</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VEHICLE_PARAMETER__OWNING_ARTIFACT = eINSTANCE.getVehicleParameter_OwningArtifact();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.VehicleSetImpl <em>Vehicle Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.VehicleSetImpl
		 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.Vehicle_feature_modelPackageImpl#getVehicleSet()
		 * @generated
		 */
		EClass VEHICLE_SET = eINSTANCE.getVehicleSet();

		/**
		 * The meta object literal for the '<em><b>Inclusions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VEHICLE_SET__INCLUSIONS = eINSTANCE.getVehicleSet_Inclusions();

		/**
		 * The meta object literal for the '<em><b>Vehicle Inclusion Criterion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE_SET__VEHICLE_INCLUSION_CRITERION = eINSTANCE.getVehicleSet_VehicleInclusionCriterion();

		/**
		 * The meta object literal for the '<em><b>Owning Artifact</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VEHICLE_SET__OWNING_ARTIFACT = eINSTANCE.getVehicleSet_OwningArtifact();

		/**
		 * The meta object literal for the '<em><b>Included EFeatures</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VEHICLE_SET__INCLUDED_EFEATURES = eINSTANCE.getVehicleSet_IncludedEFeatures();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.InclusionImpl <em>Inclusion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.InclusionImpl
		 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.Vehicle_feature_modelPackageImpl#getInclusion()
		 * @generated
		 */
		EClass INCLUSION = eINSTANCE.getInclusion();

		/**
		 * The meta object literal for the '<em><b>Electronic Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCLUSION__ELECTRONIC_FEATURE = eINSTANCE.getInclusion_ElectronicFeature();

		/**
		 * The meta object literal for the '<em><b>Vehicle Set</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCLUSION__VEHICLE_SET = eINSTANCE.getInclusion_VehicleSet();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.EFeatureImpl <em>EFeature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.EFeatureImpl
		 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.Vehicle_feature_modelPackageImpl#getEFeature()
		 * @generated
		 */
		EClass EFEATURE = eINSTANCE.getEFeature();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFEATURE__OPTIONAL = eINSTANCE.getEFeature_Optional();

		/**
		 * The meta object literal for the '<em><b>Visible By Customer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFEATURE__VISIBLE_BY_CUSTOMER = eINSTANCE.getEFeature_VisibleByCustomer();

		/**
		 * The meta object literal for the '<em><b>Passive Specifications</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EFEATURE__PASSIVE_SPECIFICATIONS = eINSTANCE.getEFeature_PassiveSpecifications();

		/**
		 * The meta object literal for the '<em><b>Passive Constraints</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EFEATURE__PASSIVE_CONSTRAINTS = eINSTANCE.getEFeature_PassiveConstraints();

		/**
		 * The meta object literal for the '<em><b>Specifying Functional Requirements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EFEATURE__SPECIFYING_FUNCTIONAL_REQUIREMENTS = eINSTANCE.getEFeature_SpecifyingFunctionalRequirements();

		/**
		 * The meta object literal for the '<em><b>Constraining Design Constraints</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EFEATURE__CONSTRAINING_DESIGN_CONSTRAINTS = eINSTANCE.getEFeature_ConstrainingDesignConstraints();

		/**
		 * The meta object literal for the '<em><b>Inclusions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EFEATURE__INCLUSIONS = eINSTANCE.getEFeature_Inclusions();

		/**
		 * The meta object literal for the '<em><b>Including Vehicle Sets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EFEATURE__INCLUDING_VEHICLE_SETS = eINSTANCE.getEFeature_IncludingVehicleSets();

		/**
		 * The meta object literal for the '<em><b>Sub Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EFEATURE__SUB_FEATURES = eINSTANCE.getEFeature_SubFeatures();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFEATURE__DESCRIPTION = eINSTANCE.getEFeature_Description();

	}

} //Vehicle_feature_modelPackage
