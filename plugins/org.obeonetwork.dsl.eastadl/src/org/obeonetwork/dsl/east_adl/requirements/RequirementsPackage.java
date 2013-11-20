/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.requirements;

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
 * This package contains requirement entitites.
 * <!-- end-model-doc -->
 * @see org.obeonetwork.dsl.east_adl.requirements.RequirementsFactory
 * @model kind="package"
 * @generated
 */
public interface RequirementsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "requirements";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.topcased.org/0.11.0/east_adl/requirements";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "requirements";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RequirementsPackage eINSTANCE = org.obeonetwork.dsl.east_adl.requirements.impl.RequirementsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.requirements.impl.RequirementImpl <em>Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.requirements.impl.RequirementImpl
	 * @see org.obeonetwork.dsl.east_adl.requirements.impl.RequirementsPackageImpl#getRequirement()
	 * @generated
	 */
	int REQUIREMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__NAME = CorePackage.EASTADL_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Archive Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ARCHIVE_DESCRIPTION = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Version Archive</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__VERSION_ARCHIVE = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Null Variant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__NULL_VARIANT = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__COMPLETE = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Active Variations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ACTIVE_VARIATIONS = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Active Selections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ACTIVE_SELECTIONS = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Active Exclusions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ACTIVE_EXCLUSIONS = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Passive Variation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__PASSIVE_VARIATION = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Passive Selections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__PASSIVE_SELECTIONS = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Passive Exclusions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__PASSIVE_EXCLUSIONS = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Variation Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__VARIATION_POINT = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__VARIANTS = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Selectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__SELECTORS = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__SELECTED = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Excluders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__EXCLUDERS = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Excluded</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__EXCLUDED = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Selection Criterion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__SELECTION_CRITERION = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__VALIDATORS = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__IDENTIFIER = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>External Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__EXTERNAL_DESCRIPTIONS = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__STATUS = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Maturity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__MATURITY = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Acceptance Criterion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ACCEPTANCE_CRITERION = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__CRITICALITY = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__DESCRIPTION = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Active Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ACTIVE_TRACES = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Passive Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__PASSIVE_TRACES = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Derived Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__DERIVED_REQUIREMENTS = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Source Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__SOURCE_REQUIREMENTS = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Sub Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__SUB_REQUIREMENTS = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Verification Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__VERIFICATION_METHODS = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Active Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ACTIVE_ASSIGNMENTS = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Assigned Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ASSIGNED_ENTITIES = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 32;

	/**
	 * The number of structural features of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FEATURE_COUNT = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 33;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.requirements.impl.RequirementDescriptionImpl <em>Requirement Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.requirements.impl.RequirementDescriptionImpl
	 * @see org.obeonetwork.dsl.east_adl.requirements.impl.RequirementsPackageImpl#getRequirementDescription()
	 * @generated
	 */
	int REQUIREMENT_DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_DESCRIPTION__URL = 0;

	/**
	 * The feature id for the '<em><b>Formalism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_DESCRIPTION__FORMALISM = 1;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_DESCRIPTION__REQUIREMENT = 2;

	/**
	 * The number of structural features of the '<em>Requirement Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_DESCRIPTION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.requirements.impl.FunctionalRequirementImpl <em>Functional Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.requirements.impl.FunctionalRequirementImpl
	 * @see org.obeonetwork.dsl.east_adl.requirements.impl.RequirementsPackageImpl#getFunctionalRequirement()
	 * @generated
	 */
	int FUNCTIONAL_REQUIREMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__NAME = REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Archive Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__ARCHIVE_DESCRIPTION = REQUIREMENT__ARCHIVE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version Archive</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__VERSION_ARCHIVE = REQUIREMENT__VERSION_ARCHIVE;

	/**
	 * The feature id for the '<em><b>Null Variant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__NULL_VARIANT = REQUIREMENT__NULL_VARIANT;

	/**
	 * The feature id for the '<em><b>Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__COMPLETE = REQUIREMENT__COMPLETE;

	/**
	 * The feature id for the '<em><b>Active Variations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__ACTIVE_VARIATIONS = REQUIREMENT__ACTIVE_VARIATIONS;

	/**
	 * The feature id for the '<em><b>Active Selections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__ACTIVE_SELECTIONS = REQUIREMENT__ACTIVE_SELECTIONS;

	/**
	 * The feature id for the '<em><b>Active Exclusions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__ACTIVE_EXCLUSIONS = REQUIREMENT__ACTIVE_EXCLUSIONS;

	/**
	 * The feature id for the '<em><b>Passive Variation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__PASSIVE_VARIATION = REQUIREMENT__PASSIVE_VARIATION;

	/**
	 * The feature id for the '<em><b>Passive Selections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__PASSIVE_SELECTIONS = REQUIREMENT__PASSIVE_SELECTIONS;

	/**
	 * The feature id for the '<em><b>Passive Exclusions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__PASSIVE_EXCLUSIONS = REQUIREMENT__PASSIVE_EXCLUSIONS;

	/**
	 * The feature id for the '<em><b>Variation Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__VARIATION_POINT = REQUIREMENT__VARIATION_POINT;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__VARIANTS = REQUIREMENT__VARIANTS;

	/**
	 * The feature id for the '<em><b>Selectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__SELECTORS = REQUIREMENT__SELECTORS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__SELECTED = REQUIREMENT__SELECTED;

	/**
	 * The feature id for the '<em><b>Excluders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__EXCLUDERS = REQUIREMENT__EXCLUDERS;

	/**
	 * The feature id for the '<em><b>Excluded</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__EXCLUDED = REQUIREMENT__EXCLUDED;

	/**
	 * The feature id for the '<em><b>Selection Criterion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__SELECTION_CRITERION = REQUIREMENT__SELECTION_CRITERION;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__VALIDATORS = REQUIREMENT__VALIDATORS;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__IDENTIFIER = REQUIREMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>External Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__EXTERNAL_DESCRIPTIONS = REQUIREMENT__EXTERNAL_DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__STATUS = REQUIREMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Maturity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__MATURITY = REQUIREMENT__MATURITY;

	/**
	 * The feature id for the '<em><b>Acceptance Criterion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__ACCEPTANCE_CRITERION = REQUIREMENT__ACCEPTANCE_CRITERION;

	/**
	 * The feature id for the '<em><b>Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__CRITICALITY = REQUIREMENT__CRITICALITY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__DESCRIPTION = REQUIREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Active Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__ACTIVE_TRACES = REQUIREMENT__ACTIVE_TRACES;

	/**
	 * The feature id for the '<em><b>Passive Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__PASSIVE_TRACES = REQUIREMENT__PASSIVE_TRACES;

	/**
	 * The feature id for the '<em><b>Derived Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__DERIVED_REQUIREMENTS = REQUIREMENT__DERIVED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Source Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__SOURCE_REQUIREMENTS = REQUIREMENT__SOURCE_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Sub Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__SUB_REQUIREMENTS = REQUIREMENT__SUB_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Verification Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__VERIFICATION_METHODS = REQUIREMENT__VERIFICATION_METHODS;

	/**
	 * The feature id for the '<em><b>Active Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__ACTIVE_ASSIGNMENTS = REQUIREMENT__ACTIVE_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Assigned Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__ASSIGNED_ENTITIES = REQUIREMENT__ASSIGNED_ENTITIES;

	/**
	 * The feature id for the '<em><b>Specifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__SPECIFICATIONS = REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Specified EFeatures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__SPECIFIED_EFEATURES = REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Functional Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT_FEATURE_COUNT = REQUIREMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.requirements.impl.DesignConstraintImpl <em>Design Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.requirements.impl.DesignConstraintImpl
	 * @see org.obeonetwork.dsl.east_adl.requirements.impl.RequirementsPackageImpl#getDesignConstraint()
	 * @generated
	 */
	int DESIGN_CONSTRAINT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_CONSTRAINT__NAME = REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Archive Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_CONSTRAINT__ARCHIVE_DESCRIPTION = REQUIREMENT__ARCHIVE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version Archive</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_CONSTRAINT__VERSION_ARCHIVE = REQUIREMENT__VERSION_ARCHIVE;

	/**
	 * The feature id for the '<em><b>Null Variant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_CONSTRAINT__NULL_VARIANT = REQUIREMENT__NULL_VARIANT;

	/**
	 * The feature id for the '<em><b>Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_CONSTRAINT__COMPLETE = REQUIREMENT__COMPLETE;

	/**
	 * The feature id for the '<em><b>Active Variations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_CONSTRAINT__ACTIVE_VARIATIONS = REQUIREMENT__ACTIVE_VARIATIONS;

	/**
	 * The feature id for the '<em><b>Active Selections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_CONSTRAINT__ACTIVE_SELECTIONS = REQUIREMENT__ACTIVE_SELECTIONS;

	/**
	 * The feature id for the '<em><b>Active Exclusions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_CONSTRAINT__ACTIVE_EXCLUSIONS = REQUIREMENT__ACTIVE_EXCLUSIONS;

	/**
	 * The feature id for the '<em><b>Passive Variation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_CONSTRAINT__PASSIVE_VARIATION = REQUIREMENT__PASSIVE_VARIATION;

	/**
	 * The feature id for the '<em><b>Passive Selections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_CONSTRAINT__PASSIVE_SELECTIONS = REQUIREMENT__PASSIVE_SELECTIONS;

	/**
	 * The feature id for the '<em><b>Passive Exclusions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_CONSTRAINT__PASSIVE_EXCLUSIONS = REQUIREMENT__PASSIVE_EXCLUSIONS;

	/**
	 * The feature id for the '<em><b>Variation Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_CONSTRAINT__VARIATION_POINT = REQUIREMENT__VARIATION_POINT;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_CONSTRAINT__VARIANTS = REQUIREMENT__VARIANTS;

	/**
	 * The feature id for the '<em><b>Selectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_CONSTRAINT__SELECTORS = REQUIREMENT__SELECTORS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_CONSTRAINT__SELECTED = REQUIREMENT__SELECTED;

	/**
	 * The feature id for the '<em><b>Excluders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_CONSTRAINT__EXCLUDERS = REQUIREMENT__EXCLUDERS;

	/**
	 * The feature id for the '<em><b>Excluded</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_CONSTRAINT__EXCLUDED = REQUIREMENT__EXCLUDED;

	/**
	 * The feature id for the '<em><b>Selection Criterion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_CONSTRAINT__SELECTION_CRITERION = REQUIREMENT__SELECTION_CRITERION;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_CONSTRAINT__VALIDATORS = REQUIREMENT__VALIDATORS;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_CONSTRAINT__IDENTIFIER = REQUIREMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>External Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_CONSTRAINT__EXTERNAL_DESCRIPTIONS = REQUIREMENT__EXTERNAL_DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_CONSTRAINT__STATUS = REQUIREMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Maturity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_CONSTRAINT__MATURITY = REQUIREMENT__MATURITY;

	/**
	 * The feature id for the '<em><b>Acceptance Criterion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_CONSTRAINT__ACCEPTANCE_CRITERION = REQUIREMENT__ACCEPTANCE_CRITERION;

	/**
	 * The feature id for the '<em><b>Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_CONSTRAINT__CRITICALITY = REQUIREMENT__CRITICALITY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_CONSTRAINT__DESCRIPTION = REQUIREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Active Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_CONSTRAINT__ACTIVE_TRACES = REQUIREMENT__ACTIVE_TRACES;

	/**
	 * The feature id for the '<em><b>Passive Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_CONSTRAINT__PASSIVE_TRACES = REQUIREMENT__PASSIVE_TRACES;

	/**
	 * The feature id for the '<em><b>Derived Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_CONSTRAINT__DERIVED_REQUIREMENTS = REQUIREMENT__DERIVED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Source Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_CONSTRAINT__SOURCE_REQUIREMENTS = REQUIREMENT__SOURCE_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Sub Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_CONSTRAINT__SUB_REQUIREMENTS = REQUIREMENT__SUB_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Verification Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_CONSTRAINT__VERIFICATION_METHODS = REQUIREMENT__VERIFICATION_METHODS;

	/**
	 * The feature id for the '<em><b>Active Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_CONSTRAINT__ACTIVE_ASSIGNMENTS = REQUIREMENT__ACTIVE_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Assigned Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_CONSTRAINT__ASSIGNED_ENTITIES = REQUIREMENT__ASSIGNED_ENTITIES;

	/**
	 * The feature id for the '<em><b>Design Constraint Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_CONSTRAINT__DESIGN_CONSTRAINT_TYPE = REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_CONSTRAINT__CONSTRAINTS = REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Constrained EFeatures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_CONSTRAINT__CONSTRAINED_EFEATURES = REQUIREMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Design Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_CONSTRAINT_FEATURE_COUNT = REQUIREMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.requirements.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.requirements.impl.ConstraintImpl
	 * @see org.obeonetwork.dsl.east_adl.requirements.impl.RequirementsPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__NAME = CorePackage.EASTADL_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__CONSTRAINT = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constrained Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__CONSTRAINED_ENTITY = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.requirements.impl.SpecificationImpl <em>Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.requirements.impl.SpecificationImpl
	 * @see org.obeonetwork.dsl.east_adl.requirements.impl.RequirementsPackageImpl#getSpecification()
	 * @generated
	 */
	int SPECIFICATION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__NAME = CorePackage.EASTADL_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Functional Requirement</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__FUNCTIONAL_REQUIREMENT = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Specified Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__SPECIFIED_ENTITY = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_FEATURE_COUNT = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.requirements.impl.QualityRequirementImpl <em>Quality Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.requirements.impl.QualityRequirementImpl
	 * @see org.obeonetwork.dsl.east_adl.requirements.impl.RequirementsPackageImpl#getQualityRequirement()
	 * @generated
	 */
	int QUALITY_REQUIREMENT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__NAME = REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Archive Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__ARCHIVE_DESCRIPTION = REQUIREMENT__ARCHIVE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version Archive</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__VERSION_ARCHIVE = REQUIREMENT__VERSION_ARCHIVE;

	/**
	 * The feature id for the '<em><b>Null Variant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__NULL_VARIANT = REQUIREMENT__NULL_VARIANT;

	/**
	 * The feature id for the '<em><b>Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__COMPLETE = REQUIREMENT__COMPLETE;

	/**
	 * The feature id for the '<em><b>Active Variations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__ACTIVE_VARIATIONS = REQUIREMENT__ACTIVE_VARIATIONS;

	/**
	 * The feature id for the '<em><b>Active Selections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__ACTIVE_SELECTIONS = REQUIREMENT__ACTIVE_SELECTIONS;

	/**
	 * The feature id for the '<em><b>Active Exclusions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__ACTIVE_EXCLUSIONS = REQUIREMENT__ACTIVE_EXCLUSIONS;

	/**
	 * The feature id for the '<em><b>Passive Variation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__PASSIVE_VARIATION = REQUIREMENT__PASSIVE_VARIATION;

	/**
	 * The feature id for the '<em><b>Passive Selections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__PASSIVE_SELECTIONS = REQUIREMENT__PASSIVE_SELECTIONS;

	/**
	 * The feature id for the '<em><b>Passive Exclusions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__PASSIVE_EXCLUSIONS = REQUIREMENT__PASSIVE_EXCLUSIONS;

	/**
	 * The feature id for the '<em><b>Variation Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__VARIATION_POINT = REQUIREMENT__VARIATION_POINT;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__VARIANTS = REQUIREMENT__VARIANTS;

	/**
	 * The feature id for the '<em><b>Selectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__SELECTORS = REQUIREMENT__SELECTORS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__SELECTED = REQUIREMENT__SELECTED;

	/**
	 * The feature id for the '<em><b>Excluders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__EXCLUDERS = REQUIREMENT__EXCLUDERS;

	/**
	 * The feature id for the '<em><b>Excluded</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__EXCLUDED = REQUIREMENT__EXCLUDED;

	/**
	 * The feature id for the '<em><b>Selection Criterion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__SELECTION_CRITERION = REQUIREMENT__SELECTION_CRITERION;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__VALIDATORS = REQUIREMENT__VALIDATORS;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__IDENTIFIER = REQUIREMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>External Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__EXTERNAL_DESCRIPTIONS = REQUIREMENT__EXTERNAL_DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__STATUS = REQUIREMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Maturity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__MATURITY = REQUIREMENT__MATURITY;

	/**
	 * The feature id for the '<em><b>Acceptance Criterion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__ACCEPTANCE_CRITERION = REQUIREMENT__ACCEPTANCE_CRITERION;

	/**
	 * The feature id for the '<em><b>Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__CRITICALITY = REQUIREMENT__CRITICALITY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__DESCRIPTION = REQUIREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Active Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__ACTIVE_TRACES = REQUIREMENT__ACTIVE_TRACES;

	/**
	 * The feature id for the '<em><b>Passive Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__PASSIVE_TRACES = REQUIREMENT__PASSIVE_TRACES;

	/**
	 * The feature id for the '<em><b>Derived Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__DERIVED_REQUIREMENTS = REQUIREMENT__DERIVED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Source Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__SOURCE_REQUIREMENTS = REQUIREMENT__SOURCE_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Sub Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__SUB_REQUIREMENTS = REQUIREMENT__SUB_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Verification Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__VERIFICATION_METHODS = REQUIREMENT__VERIFICATION_METHODS;

	/**
	 * The feature id for the '<em><b>Active Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__ACTIVE_ASSIGNMENTS = REQUIREMENT__ACTIVE_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Assigned Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__ASSIGNED_ENTITIES = REQUIREMENT__ASSIGNED_ENTITIES;

	/**
	 * The feature id for the '<em><b>Quality Requirement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__QUALITY_REQUIREMENT_TYPE = REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Quality Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT_FEATURE_COUNT = REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.requirements.impl.EndToEndDelayImpl <em>End To End Delay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.requirements.impl.EndToEndDelayImpl
	 * @see org.obeonetwork.dsl.east_adl.requirements.impl.RequirementsPackageImpl#getEndToEndDelay()
	 * @generated
	 */
	int END_TO_END_DELAY = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_DELAY__NAME = QUALITY_REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Archive Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_DELAY__ARCHIVE_DESCRIPTION = QUALITY_REQUIREMENT__ARCHIVE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version Archive</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_DELAY__VERSION_ARCHIVE = QUALITY_REQUIREMENT__VERSION_ARCHIVE;

	/**
	 * The feature id for the '<em><b>Null Variant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_DELAY__NULL_VARIANT = QUALITY_REQUIREMENT__NULL_VARIANT;

	/**
	 * The feature id for the '<em><b>Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_DELAY__COMPLETE = QUALITY_REQUIREMENT__COMPLETE;

	/**
	 * The feature id for the '<em><b>Active Variations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_DELAY__ACTIVE_VARIATIONS = QUALITY_REQUIREMENT__ACTIVE_VARIATIONS;

	/**
	 * The feature id for the '<em><b>Active Selections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_DELAY__ACTIVE_SELECTIONS = QUALITY_REQUIREMENT__ACTIVE_SELECTIONS;

	/**
	 * The feature id for the '<em><b>Active Exclusions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_DELAY__ACTIVE_EXCLUSIONS = QUALITY_REQUIREMENT__ACTIVE_EXCLUSIONS;

	/**
	 * The feature id for the '<em><b>Passive Variation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_DELAY__PASSIVE_VARIATION = QUALITY_REQUIREMENT__PASSIVE_VARIATION;

	/**
	 * The feature id for the '<em><b>Passive Selections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_DELAY__PASSIVE_SELECTIONS = QUALITY_REQUIREMENT__PASSIVE_SELECTIONS;

	/**
	 * The feature id for the '<em><b>Passive Exclusions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_DELAY__PASSIVE_EXCLUSIONS = QUALITY_REQUIREMENT__PASSIVE_EXCLUSIONS;

	/**
	 * The feature id for the '<em><b>Variation Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_DELAY__VARIATION_POINT = QUALITY_REQUIREMENT__VARIATION_POINT;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_DELAY__VARIANTS = QUALITY_REQUIREMENT__VARIANTS;

	/**
	 * The feature id for the '<em><b>Selectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_DELAY__SELECTORS = QUALITY_REQUIREMENT__SELECTORS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_DELAY__SELECTED = QUALITY_REQUIREMENT__SELECTED;

	/**
	 * The feature id for the '<em><b>Excluders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_DELAY__EXCLUDERS = QUALITY_REQUIREMENT__EXCLUDERS;

	/**
	 * The feature id for the '<em><b>Excluded</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_DELAY__EXCLUDED = QUALITY_REQUIREMENT__EXCLUDED;

	/**
	 * The feature id for the '<em><b>Selection Criterion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_DELAY__SELECTION_CRITERION = QUALITY_REQUIREMENT__SELECTION_CRITERION;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_DELAY__VALIDATORS = QUALITY_REQUIREMENT__VALIDATORS;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_DELAY__IDENTIFIER = QUALITY_REQUIREMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>External Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_DELAY__EXTERNAL_DESCRIPTIONS = QUALITY_REQUIREMENT__EXTERNAL_DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_DELAY__STATUS = QUALITY_REQUIREMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Maturity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_DELAY__MATURITY = QUALITY_REQUIREMENT__MATURITY;

	/**
	 * The feature id for the '<em><b>Acceptance Criterion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_DELAY__ACCEPTANCE_CRITERION = QUALITY_REQUIREMENT__ACCEPTANCE_CRITERION;

	/**
	 * The feature id for the '<em><b>Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_DELAY__CRITICALITY = QUALITY_REQUIREMENT__CRITICALITY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_DELAY__DESCRIPTION = QUALITY_REQUIREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Active Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_DELAY__ACTIVE_TRACES = QUALITY_REQUIREMENT__ACTIVE_TRACES;

	/**
	 * The feature id for the '<em><b>Passive Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_DELAY__PASSIVE_TRACES = QUALITY_REQUIREMENT__PASSIVE_TRACES;

	/**
	 * The feature id for the '<em><b>Derived Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_DELAY__DERIVED_REQUIREMENTS = QUALITY_REQUIREMENT__DERIVED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Source Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_DELAY__SOURCE_REQUIREMENTS = QUALITY_REQUIREMENT__SOURCE_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Sub Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_DELAY__SUB_REQUIREMENTS = QUALITY_REQUIREMENT__SUB_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Verification Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_DELAY__VERIFICATION_METHODS = QUALITY_REQUIREMENT__VERIFICATION_METHODS;

	/**
	 * The feature id for the '<em><b>Active Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_DELAY__ACTIVE_ASSIGNMENTS = QUALITY_REQUIREMENT__ACTIVE_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Assigned Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_DELAY__ASSIGNED_ENTITIES = QUALITY_REQUIREMENT__ASSIGNED_ENTITIES;

	/**
	 * The feature id for the '<em><b>Quality Requirement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_DELAY__QUALITY_REQUIREMENT_TYPE = QUALITY_REQUIREMENT__QUALITY_REQUIREMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_DELAY__UPPER = QUALITY_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_DELAY__LOWER = QUALITY_REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Nominal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_DELAY__NOMINAL = QUALITY_REQUIREMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Jitter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_DELAY__JITTER = QUALITY_REQUIREMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_DELAY__FROM = QUALITY_REQUIREMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Until</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_DELAY__UNTIL = QUALITY_REQUIREMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_DELAY__PROBABILITY = QUALITY_REQUIREMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>End To End Delay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_DELAY_FEATURE_COUNT = QUALITY_REQUIREMENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.requirements.impl.TimingRestrictionImpl <em>Timing Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.requirements.impl.TimingRestrictionImpl
	 * @see org.obeonetwork.dsl.east_adl.requirements.impl.RequirementsPackageImpl#getTimingRestriction()
	 * @generated
	 */
	int TIMING_RESTRICTION = 8;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_RESTRICTION__UPPER = 0;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_RESTRICTION__LOWER = 1;

	/**
	 * The feature id for the '<em><b>Nominal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_RESTRICTION__NOMINAL = 2;

	/**
	 * The feature id for the '<em><b>Jitter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_RESTRICTION__JITTER = 3;

	/**
	 * The number of structural features of the '<em>Timing Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_RESTRICTION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.requirements.impl.PeriodRestrictionImpl <em>Period Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.requirements.impl.PeriodRestrictionImpl
	 * @see org.obeonetwork.dsl.east_adl.requirements.impl.RequirementsPackageImpl#getPeriodRestriction()
	 * @generated
	 */
	int PERIOD_RESTRICTION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_RESTRICTION__NAME = QUALITY_REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Archive Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_RESTRICTION__ARCHIVE_DESCRIPTION = QUALITY_REQUIREMENT__ARCHIVE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version Archive</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_RESTRICTION__VERSION_ARCHIVE = QUALITY_REQUIREMENT__VERSION_ARCHIVE;

	/**
	 * The feature id for the '<em><b>Null Variant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_RESTRICTION__NULL_VARIANT = QUALITY_REQUIREMENT__NULL_VARIANT;

	/**
	 * The feature id for the '<em><b>Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_RESTRICTION__COMPLETE = QUALITY_REQUIREMENT__COMPLETE;

	/**
	 * The feature id for the '<em><b>Active Variations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_RESTRICTION__ACTIVE_VARIATIONS = QUALITY_REQUIREMENT__ACTIVE_VARIATIONS;

	/**
	 * The feature id for the '<em><b>Active Selections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_RESTRICTION__ACTIVE_SELECTIONS = QUALITY_REQUIREMENT__ACTIVE_SELECTIONS;

	/**
	 * The feature id for the '<em><b>Active Exclusions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_RESTRICTION__ACTIVE_EXCLUSIONS = QUALITY_REQUIREMENT__ACTIVE_EXCLUSIONS;

	/**
	 * The feature id for the '<em><b>Passive Variation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_RESTRICTION__PASSIVE_VARIATION = QUALITY_REQUIREMENT__PASSIVE_VARIATION;

	/**
	 * The feature id for the '<em><b>Passive Selections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_RESTRICTION__PASSIVE_SELECTIONS = QUALITY_REQUIREMENT__PASSIVE_SELECTIONS;

	/**
	 * The feature id for the '<em><b>Passive Exclusions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_RESTRICTION__PASSIVE_EXCLUSIONS = QUALITY_REQUIREMENT__PASSIVE_EXCLUSIONS;

	/**
	 * The feature id for the '<em><b>Variation Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_RESTRICTION__VARIATION_POINT = QUALITY_REQUIREMENT__VARIATION_POINT;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_RESTRICTION__VARIANTS = QUALITY_REQUIREMENT__VARIANTS;

	/**
	 * The feature id for the '<em><b>Selectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_RESTRICTION__SELECTORS = QUALITY_REQUIREMENT__SELECTORS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_RESTRICTION__SELECTED = QUALITY_REQUIREMENT__SELECTED;

	/**
	 * The feature id for the '<em><b>Excluders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_RESTRICTION__EXCLUDERS = QUALITY_REQUIREMENT__EXCLUDERS;

	/**
	 * The feature id for the '<em><b>Excluded</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_RESTRICTION__EXCLUDED = QUALITY_REQUIREMENT__EXCLUDED;

	/**
	 * The feature id for the '<em><b>Selection Criterion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_RESTRICTION__SELECTION_CRITERION = QUALITY_REQUIREMENT__SELECTION_CRITERION;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_RESTRICTION__VALIDATORS = QUALITY_REQUIREMENT__VALIDATORS;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_RESTRICTION__IDENTIFIER = QUALITY_REQUIREMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>External Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_RESTRICTION__EXTERNAL_DESCRIPTIONS = QUALITY_REQUIREMENT__EXTERNAL_DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_RESTRICTION__STATUS = QUALITY_REQUIREMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Maturity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_RESTRICTION__MATURITY = QUALITY_REQUIREMENT__MATURITY;

	/**
	 * The feature id for the '<em><b>Acceptance Criterion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_RESTRICTION__ACCEPTANCE_CRITERION = QUALITY_REQUIREMENT__ACCEPTANCE_CRITERION;

	/**
	 * The feature id for the '<em><b>Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_RESTRICTION__CRITICALITY = QUALITY_REQUIREMENT__CRITICALITY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_RESTRICTION__DESCRIPTION = QUALITY_REQUIREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Active Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_RESTRICTION__ACTIVE_TRACES = QUALITY_REQUIREMENT__ACTIVE_TRACES;

	/**
	 * The feature id for the '<em><b>Passive Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_RESTRICTION__PASSIVE_TRACES = QUALITY_REQUIREMENT__PASSIVE_TRACES;

	/**
	 * The feature id for the '<em><b>Derived Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_RESTRICTION__DERIVED_REQUIREMENTS = QUALITY_REQUIREMENT__DERIVED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Source Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_RESTRICTION__SOURCE_REQUIREMENTS = QUALITY_REQUIREMENT__SOURCE_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Sub Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_RESTRICTION__SUB_REQUIREMENTS = QUALITY_REQUIREMENT__SUB_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Verification Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_RESTRICTION__VERIFICATION_METHODS = QUALITY_REQUIREMENT__VERIFICATION_METHODS;

	/**
	 * The feature id for the '<em><b>Active Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_RESTRICTION__ACTIVE_ASSIGNMENTS = QUALITY_REQUIREMENT__ACTIVE_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Assigned Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_RESTRICTION__ASSIGNED_ENTITIES = QUALITY_REQUIREMENT__ASSIGNED_ENTITIES;

	/**
	 * The feature id for the '<em><b>Quality Requirement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_RESTRICTION__QUALITY_REQUIREMENT_TYPE = QUALITY_REQUIREMENT__QUALITY_REQUIREMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_RESTRICTION__UPPER = QUALITY_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_RESTRICTION__LOWER = QUALITY_REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Nominal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_RESTRICTION__NOMINAL = QUALITY_REQUIREMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Jitter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_RESTRICTION__JITTER = QUALITY_REQUIREMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Assigned Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_RESTRICTION__ASSIGNED_PORTS = QUALITY_REQUIREMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Period Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_RESTRICTION_FEATURE_COUNT = QUALITY_REQUIREMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.requirements.impl.BoundImpl <em>Bound</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.requirements.impl.BoundImpl
	 * @see org.obeonetwork.dsl.east_adl.requirements.impl.RequirementsPackageImpl#getBound()
	 * @generated
	 */
	int BOUND = 10;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND__UNIT = 0;

	/**
	 * The feature id for the '<em><b>Timing Restriction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND__TIMING_RESTRICTION = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Bound</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.requirements.impl.TraceImpl <em>Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.requirements.impl.TraceImpl
	 * @see org.obeonetwork.dsl.east_adl.requirements.impl.RequirementsPackageImpl#getTrace()
	 * @generated
	 */
	int TRACE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__NAME = CorePackage.EASTADL_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Tracer</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__TRACER = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Traced</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__TRACED = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_FEATURE_COUNT = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.requirements.impl.VerificationMethodImpl <em>Verification Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.requirements.impl.VerificationMethodImpl
	 * @see org.obeonetwork.dsl.east_adl.requirements.impl.RequirementsPackageImpl#getVerificationMethod()
	 * @generated
	 */
	int VERIFICATION_METHOD = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_METHOD__NAME = CorePackage.EASTADL_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_METHOD__DESCRIPTION = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_METHOD__TYPE = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_METHOD__REQUIREMENT = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Verification Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_METHOD_FEATURE_COUNT = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.requirements.impl.AssignmentImpl <em>Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.requirements.impl.AssignmentImpl
	 * @see org.obeonetwork.dsl.east_adl.requirements.impl.RequirementsPackageImpl#getAssignment()
	 * @generated
	 */
	int ASSIGNMENT = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__NAME = CorePackage.EASTADL_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__TARGET = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assigner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__ASSIGNER = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_FEATURE_COUNT = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.requirements.DesignConstraintKind <em>Design Constraint Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.requirements.DesignConstraintKind
	 * @see org.obeonetwork.dsl.east_adl.requirements.impl.RequirementsPackageImpl#getDesignConstraintKind()
	 * @generated
	 */
	int DESIGN_CONSTRAINT_KIND = 14;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.requirements.QualityRequirementKind <em>Quality Requirement Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.requirements.QualityRequirementKind
	 * @see org.obeonetwork.dsl.east_adl.requirements.impl.RequirementsPackageImpl#getQualityRequirementKind()
	 * @generated
	 */
	int QUALITY_REQUIREMENT_KIND = 15;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.requirements.VerificationMethodKind <em>Verification Method Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.requirements.VerificationMethodKind
	 * @see org.obeonetwork.dsl.east_adl.requirements.impl.RequirementsPackageImpl#getVerificationMethodKind()
	 * @generated
	 */
	int VERIFICATION_METHOD_KIND = 16;


	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.requirements.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement</em>'.
	 * @see org.obeonetwork.dsl.east_adl.requirements.Requirement
	 * @generated
	 */
	EClass getRequirement();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.requirements.Requirement#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see org.obeonetwork.dsl.east_adl.requirements.Requirement#getIdentifier()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Identifier();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.requirements.Requirement#getExternalDescriptions <em>External Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>External Descriptions</em>'.
	 * @see org.obeonetwork.dsl.east_adl.requirements.Requirement#getExternalDescriptions()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_ExternalDescriptions();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.requirements.Requirement#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.obeonetwork.dsl.east_adl.requirements.Requirement#getStatus()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.requirements.Requirement#getMaturity <em>Maturity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maturity</em>'.
	 * @see org.obeonetwork.dsl.east_adl.requirements.Requirement#getMaturity()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Maturity();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.requirements.Requirement#getAcceptanceCriterion <em>Acceptance Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Acceptance Criterion</em>'.
	 * @see org.obeonetwork.dsl.east_adl.requirements.Requirement#getAcceptanceCriterion()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_AcceptanceCriterion();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.requirements.Requirement#getCriticality <em>Criticality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Criticality</em>'.
	 * @see org.obeonetwork.dsl.east_adl.requirements.Requirement#getCriticality()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Criticality();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.requirements.Requirement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.obeonetwork.dsl.east_adl.requirements.Requirement#getDescription()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.requirements.Requirement#getActiveTraces <em>Active Traces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Active Traces</em>'.
	 * @see org.obeonetwork.dsl.east_adl.requirements.Requirement#getActiveTraces()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_ActiveTraces();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.requirements.Requirement#getPassiveTraces <em>Passive Traces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Passive Traces</em>'.
	 * @see org.obeonetwork.dsl.east_adl.requirements.Requirement#getPassiveTraces()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_PassiveTraces();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.requirements.Requirement#getDerivedRequirements <em>Derived Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Derived Requirements</em>'.
	 * @see org.obeonetwork.dsl.east_adl.requirements.Requirement#getDerivedRequirements()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_DerivedRequirements();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.requirements.Requirement#getSourceRequirements <em>Source Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source Requirements</em>'.
	 * @see org.obeonetwork.dsl.east_adl.requirements.Requirement#getSourceRequirements()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_SourceRequirements();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.requirements.Requirement#getSubRequirements <em>Sub Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Requirements</em>'.
	 * @see org.obeonetwork.dsl.east_adl.requirements.Requirement#getSubRequirements()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_SubRequirements();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.requirements.Requirement#getVerificationMethods <em>Verification Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Verification Methods</em>'.
	 * @see org.obeonetwork.dsl.east_adl.requirements.Requirement#getVerificationMethods()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_VerificationMethods();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.requirements.Requirement#getActiveAssignments <em>Active Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Active Assignments</em>'.
	 * @see org.obeonetwork.dsl.east_adl.requirements.Requirement#getActiveAssignments()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_ActiveAssignments();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.requirements.Requirement#getAssignedEntities <em>Assigned Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assigned Entities</em>'.
	 * @see org.obeonetwork.dsl.east_adl.requirements.Requirement#getAssignedEntities()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_AssignedEntities();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.requirements.RequirementDescription <em>Requirement Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement Description</em>'.
	 * @see org.obeonetwork.dsl.east_adl.requirements.RequirementDescription
	 * @generated
	 */
	EClass getRequirementDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.requirements.RequirementDescription#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.obeonetwork.dsl.east_adl.requirements.RequirementDescription#getUrl()
	 * @see #getRequirementDescription()
	 * @generated
	 */
	EAttribute getRequirementDescription_Url();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.requirements.RequirementDescription#getFormalism <em>Formalism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formalism</em>'.
	 * @see org.obeonetwork.dsl.east_adl.requirements.RequirementDescription#getFormalism()
	 * @see #getRequirementDescription()
	 * @generated
	 */
	EAttribute getRequirementDescription_Formalism();

	/**
	 * Returns the meta object for the container reference '{@link org.obeonetwork.dsl.east_adl.requirements.RequirementDescription#getRequirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Requirement</em>'.
	 * @see org.obeonetwork.dsl.east_adl.requirements.RequirementDescription#getRequirement()
	 * @see #getRequirementDescription()
	 * @generated
	 */
	EReference getRequirementDescription_Requirement();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.requirements.FunctionalRequirement <em>Functional Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional Requirement</em>'.
	 * @see org.obeonetwork.dsl.east_adl.requirements.FunctionalRequirement
	 * @generated
	 */
	EClass getFunctionalRequirement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.requirements.FunctionalRequirement#getSpecifications <em>Specifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specifications</em>'.
	 * @see org.obeonetwork.dsl.east_adl.requirements.FunctionalRequirement#getSpecifications()
	 * @see #getFunctionalRequirement()
	 * @generated
	 */
	EReference getFunctionalRequirement_Specifications();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.requirements.FunctionalRequirement#getSpecifiedEFeatures <em>Specified EFeatures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Specified EFeatures</em>'.
	 * @see org.obeonetwork.dsl.east_adl.requirements.FunctionalRequirement#getSpecifiedEFeatures()
	 * @see #getFunctionalRequirement()
	 * @generated
	 */
	EReference getFunctionalRequirement_SpecifiedEFeatures();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.requirements.DesignConstraint <em>Design Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Design Constraint</em>'.
	 * @see org.obeonetwork.dsl.east_adl.requirements.DesignConstraint
	 * @generated
	 */
	EClass getDesignConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.requirements.DesignConstraint#getDesignConstraintType <em>Design Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Design Constraint Type</em>'.
	 * @see org.obeonetwork.dsl.east_adl.requirements.DesignConstraint#getDesignConstraintType()
	 * @see #getDesignConstraint()
	 * @generated
	 */
	EAttribute getDesignConstraint_DesignConstraintType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.requirements.DesignConstraint#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see org.obeonetwork.dsl.east_adl.requirements.DesignConstraint#getConstraints()
	 * @see #getDesignConstraint()
	 * @generated
	 */
	EReference getDesignConstraint_Constraints();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.requirements.DesignConstraint#getConstrainedEFeatures <em>Constrained EFeatures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Constrained EFeatures</em>'.
	 * @see org.obeonetwork.dsl.east_adl.requirements.DesignConstraint#getConstrainedEFeatures()
	 * @see #getDesignConstraint()
	 * @generated
	 */
	EReference getDesignConstraint_ConstrainedEFeatures();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.requirements.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see org.obeonetwork.dsl.east_adl.requirements.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the container reference '{@link org.obeonetwork.dsl.east_adl.requirements.Constraint#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Constraint</em>'.
	 * @see org.obeonetwork.dsl.east_adl.requirements.Constraint#getConstraint()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_Constraint();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.requirements.Constraint#getConstrainedEntity <em>Constrained Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Constrained Entity</em>'.
	 * @see org.obeonetwork.dsl.east_adl.requirements.Constraint#getConstrainedEntity()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_ConstrainedEntity();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.requirements.Specification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specification</em>'.
	 * @see org.obeonetwork.dsl.east_adl.requirements.Specification
	 * @generated
	 */
	EClass getSpecification();

	/**
	 * Returns the meta object for the container reference '{@link org.obeonetwork.dsl.east_adl.requirements.Specification#getFunctionalRequirement <em>Functional Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Functional Requirement</em>'.
	 * @see org.obeonetwork.dsl.east_adl.requirements.Specification#getFunctionalRequirement()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_FunctionalRequirement();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.requirements.Specification#getSpecifiedEntity <em>Specified Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specified Entity</em>'.
	 * @see org.obeonetwork.dsl.east_adl.requirements.Specification#getSpecifiedEntity()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_SpecifiedEntity();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.requirements.QualityRequirement <em>Quality Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quality Requirement</em>'.
	 * @see org.obeonetwork.dsl.east_adl.requirements.QualityRequirement
	 * @generated
	 */
	EClass getQualityRequirement();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.requirements.QualityRequirement#getQualityRequirementType <em>Quality Requirement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quality Requirement Type</em>'.
	 * @see org.obeonetwork.dsl.east_adl.requirements.QualityRequirement#getQualityRequirementType()
	 * @see #getQualityRequirement()
	 * @generated
	 */
	EAttribute getQualityRequirement_QualityRequirementType();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.requirements.EndToEndDelay <em>End To End Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End To End Delay</em>'.
	 * @see org.obeonetwork.dsl.east_adl.requirements.EndToEndDelay
	 * @generated
	 */
	EClass getEndToEndDelay();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.requirements.EndToEndDelay#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see org.obeonetwork.dsl.east_adl.requirements.EndToEndDelay#getFrom()
	 * @see #getEndToEndDelay()
	 * @generated
	 */
	EReference getEndToEndDelay_From();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.requirements.EndToEndDelay#getUntil <em>Until</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Until</em>'.
	 * @see org.obeonetwork.dsl.east_adl.requirements.EndToEndDelay#getUntil()
	 * @see #getEndToEndDelay()
	 * @generated
	 */
	EReference getEndToEndDelay_Until();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.requirements.EndToEndDelay#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see org.obeonetwork.dsl.east_adl.requirements.EndToEndDelay#getProbability()
	 * @see #getEndToEndDelay()
	 * @generated
	 */
	EAttribute getEndToEndDelay_Probability();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.requirements.TimingRestriction <em>Timing Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timing Restriction</em>'.
	 * @see org.obeonetwork.dsl.east_adl.requirements.TimingRestriction
	 * @generated
	 */
	EClass getTimingRestriction();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.east_adl.requirements.TimingRestriction#getUpper <em>Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Upper</em>'.
	 * @see org.obeonetwork.dsl.east_adl.requirements.TimingRestriction#getUpper()
	 * @see #getTimingRestriction()
	 * @generated
	 */
	EReference getTimingRestriction_Upper();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.east_adl.requirements.TimingRestriction#getLower <em>Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lower</em>'.
	 * @see org.obeonetwork.dsl.east_adl.requirements.TimingRestriction#getLower()
	 * @see #getTimingRestriction()
	 * @generated
	 */
	EReference getTimingRestriction_Lower();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.east_adl.requirements.TimingRestriction#getNominal <em>Nominal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nominal</em>'.
	 * @see org.obeonetwork.dsl.east_adl.requirements.TimingRestriction#getNominal()
	 * @see #getTimingRestriction()
	 * @generated
	 */
	EReference getTimingRestriction_Nominal();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.east_adl.requirements.TimingRestriction#getJitter <em>Jitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Jitter</em>'.
	 * @see org.obeonetwork.dsl.east_adl.requirements.TimingRestriction#getJitter()
	 * @see #getTimingRestriction()
	 * @generated
	 */
	EReference getTimingRestriction_Jitter();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.requirements.PeriodRestriction <em>Period Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Period Restriction</em>'.
	 * @see org.obeonetwork.dsl.east_adl.requirements.PeriodRestriction
	 * @generated
	 */
	EClass getPeriodRestriction();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.requirements.PeriodRestriction#getAssignedPorts <em>Assigned Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assigned Ports</em>'.
	 * @see org.obeonetwork.dsl.east_adl.requirements.PeriodRestriction#getAssignedPorts()
	 * @see #getPeriodRestriction()
	 * @generated
	 */
	EReference getPeriodRestriction_AssignedPorts();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.requirements.Bound <em>Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bound</em>'.
	 * @see org.obeonetwork.dsl.east_adl.requirements.Bound
	 * @generated
	 */
	EClass getBound();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.requirements.Bound#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see org.obeonetwork.dsl.east_adl.requirements.Bound#getUnit()
	 * @see #getBound()
	 * @generated
	 */
	EAttribute getBound_Unit();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.requirements.Bound#getTimingRestriction <em>Timing Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Timing Restriction</em>'.
	 * @see org.obeonetwork.dsl.east_adl.requirements.Bound#getTimingRestriction()
	 * @see #getBound()
	 * @generated
	 */
	EReference getBound_TimingRestriction();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.requirements.Bound#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.obeonetwork.dsl.east_adl.requirements.Bound#getValue()
	 * @see #getBound()
	 * @generated
	 */
	EAttribute getBound_Value();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.requirements.Trace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace</em>'.
	 * @see org.obeonetwork.dsl.east_adl.requirements.Trace
	 * @generated
	 */
	EClass getTrace();

	/**
	 * Returns the meta object for the container reference '{@link org.obeonetwork.dsl.east_adl.requirements.Trace#getTracer <em>Tracer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Tracer</em>'.
	 * @see org.obeonetwork.dsl.east_adl.requirements.Trace#getTracer()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Tracer();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.requirements.Trace#getTraced <em>Traced</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Traced</em>'.
	 * @see org.obeonetwork.dsl.east_adl.requirements.Trace#getTraced()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Traced();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.requirements.VerificationMethod <em>Verification Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verification Method</em>'.
	 * @see org.obeonetwork.dsl.east_adl.requirements.VerificationMethod
	 * @generated
	 */
	EClass getVerificationMethod();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.requirements.VerificationMethod#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.obeonetwork.dsl.east_adl.requirements.VerificationMethod#getDescription()
	 * @see #getVerificationMethod()
	 * @generated
	 */
	EAttribute getVerificationMethod_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.requirements.VerificationMethod#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.obeonetwork.dsl.east_adl.requirements.VerificationMethod#getType()
	 * @see #getVerificationMethod()
	 * @generated
	 */
	EAttribute getVerificationMethod_Type();

	/**
	 * Returns the meta object for the container reference '{@link org.obeonetwork.dsl.east_adl.requirements.VerificationMethod#getRequirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Requirement</em>'.
	 * @see org.obeonetwork.dsl.east_adl.requirements.VerificationMethod#getRequirement()
	 * @see #getVerificationMethod()
	 * @generated
	 */
	EReference getVerificationMethod_Requirement();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.requirements.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment</em>'.
	 * @see org.obeonetwork.dsl.east_adl.requirements.Assignment
	 * @generated
	 */
	EClass getAssignment();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.requirements.Assignment#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.obeonetwork.dsl.east_adl.requirements.Assignment#getTarget()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_Target();

	/**
	 * Returns the meta object for the container reference '{@link org.obeonetwork.dsl.east_adl.requirements.Assignment#getAssigner <em>Assigner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Assigner</em>'.
	 * @see org.obeonetwork.dsl.east_adl.requirements.Assignment#getAssigner()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_Assigner();

	/**
	 * Returns the meta object for enum '{@link org.obeonetwork.dsl.east_adl.requirements.DesignConstraintKind <em>Design Constraint Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Design Constraint Kind</em>'.
	 * @see org.obeonetwork.dsl.east_adl.requirements.DesignConstraintKind
	 * @generated
	 */
	EEnum getDesignConstraintKind();

	/**
	 * Returns the meta object for enum '{@link org.obeonetwork.dsl.east_adl.requirements.QualityRequirementKind <em>Quality Requirement Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Quality Requirement Kind</em>'.
	 * @see org.obeonetwork.dsl.east_adl.requirements.QualityRequirementKind
	 * @generated
	 */
	EEnum getQualityRequirementKind();

	/**
	 * Returns the meta object for enum '{@link org.obeonetwork.dsl.east_adl.requirements.VerificationMethodKind <em>Verification Method Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Verification Method Kind</em>'.
	 * @see org.obeonetwork.dsl.east_adl.requirements.VerificationMethodKind
	 * @generated
	 */
	EEnum getVerificationMethodKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RequirementsFactory getRequirementsFactory();

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
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.requirements.impl.RequirementImpl <em>Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.requirements.impl.RequirementImpl
		 * @see org.obeonetwork.dsl.east_adl.requirements.impl.RequirementsPackageImpl#getRequirement()
		 * @generated
		 */
		EClass REQUIREMENT = eINSTANCE.getRequirement();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__IDENTIFIER = eINSTANCE.getRequirement_Identifier();

		/**
		 * The meta object literal for the '<em><b>External Descriptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__EXTERNAL_DESCRIPTIONS = eINSTANCE.getRequirement_ExternalDescriptions();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__STATUS = eINSTANCE.getRequirement_Status();

		/**
		 * The meta object literal for the '<em><b>Maturity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__MATURITY = eINSTANCE.getRequirement_Maturity();

		/**
		 * The meta object literal for the '<em><b>Acceptance Criterion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__ACCEPTANCE_CRITERION = eINSTANCE.getRequirement_AcceptanceCriterion();

		/**
		 * The meta object literal for the '<em><b>Criticality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__CRITICALITY = eINSTANCE.getRequirement_Criticality();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__DESCRIPTION = eINSTANCE.getRequirement_Description();

		/**
		 * The meta object literal for the '<em><b>Active Traces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__ACTIVE_TRACES = eINSTANCE.getRequirement_ActiveTraces();

		/**
		 * The meta object literal for the '<em><b>Passive Traces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__PASSIVE_TRACES = eINSTANCE.getRequirement_PassiveTraces();

		/**
		 * The meta object literal for the '<em><b>Derived Requirements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__DERIVED_REQUIREMENTS = eINSTANCE.getRequirement_DerivedRequirements();

		/**
		 * The meta object literal for the '<em><b>Source Requirements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__SOURCE_REQUIREMENTS = eINSTANCE.getRequirement_SourceRequirements();

		/**
		 * The meta object literal for the '<em><b>Sub Requirements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__SUB_REQUIREMENTS = eINSTANCE.getRequirement_SubRequirements();

		/**
		 * The meta object literal for the '<em><b>Verification Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__VERIFICATION_METHODS = eINSTANCE.getRequirement_VerificationMethods();

		/**
		 * The meta object literal for the '<em><b>Active Assignments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__ACTIVE_ASSIGNMENTS = eINSTANCE.getRequirement_ActiveAssignments();

		/**
		 * The meta object literal for the '<em><b>Assigned Entities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__ASSIGNED_ENTITIES = eINSTANCE.getRequirement_AssignedEntities();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.requirements.impl.RequirementDescriptionImpl <em>Requirement Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.requirements.impl.RequirementDescriptionImpl
		 * @see org.obeonetwork.dsl.east_adl.requirements.impl.RequirementsPackageImpl#getRequirementDescription()
		 * @generated
		 */
		EClass REQUIREMENT_DESCRIPTION = eINSTANCE.getRequirementDescription();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_DESCRIPTION__URL = eINSTANCE.getRequirementDescription_Url();

		/**
		 * The meta object literal for the '<em><b>Formalism</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_DESCRIPTION__FORMALISM = eINSTANCE.getRequirementDescription_Formalism();

		/**
		 * The meta object literal for the '<em><b>Requirement</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_DESCRIPTION__REQUIREMENT = eINSTANCE.getRequirementDescription_Requirement();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.requirements.impl.FunctionalRequirementImpl <em>Functional Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.requirements.impl.FunctionalRequirementImpl
		 * @see org.obeonetwork.dsl.east_adl.requirements.impl.RequirementsPackageImpl#getFunctionalRequirement()
		 * @generated
		 */
		EClass FUNCTIONAL_REQUIREMENT = eINSTANCE.getFunctionalRequirement();

		/**
		 * The meta object literal for the '<em><b>Specifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_REQUIREMENT__SPECIFICATIONS = eINSTANCE.getFunctionalRequirement_Specifications();

		/**
		 * The meta object literal for the '<em><b>Specified EFeatures</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_REQUIREMENT__SPECIFIED_EFEATURES = eINSTANCE.getFunctionalRequirement_SpecifiedEFeatures();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.requirements.impl.DesignConstraintImpl <em>Design Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.requirements.impl.DesignConstraintImpl
		 * @see org.obeonetwork.dsl.east_adl.requirements.impl.RequirementsPackageImpl#getDesignConstraint()
		 * @generated
		 */
		EClass DESIGN_CONSTRAINT = eINSTANCE.getDesignConstraint();

		/**
		 * The meta object literal for the '<em><b>Design Constraint Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESIGN_CONSTRAINT__DESIGN_CONSTRAINT_TYPE = eINSTANCE.getDesignConstraint_DesignConstraintType();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_CONSTRAINT__CONSTRAINTS = eINSTANCE.getDesignConstraint_Constraints();

		/**
		 * The meta object literal for the '<em><b>Constrained EFeatures</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_CONSTRAINT__CONSTRAINED_EFEATURES = eINSTANCE.getDesignConstraint_ConstrainedEFeatures();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.requirements.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.requirements.impl.ConstraintImpl
		 * @see org.obeonetwork.dsl.east_adl.requirements.impl.RequirementsPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__CONSTRAINT = eINSTANCE.getConstraint_Constraint();

		/**
		 * The meta object literal for the '<em><b>Constrained Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__CONSTRAINED_ENTITY = eINSTANCE.getConstraint_ConstrainedEntity();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.requirements.impl.SpecificationImpl <em>Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.requirements.impl.SpecificationImpl
		 * @see org.obeonetwork.dsl.east_adl.requirements.impl.RequirementsPackageImpl#getSpecification()
		 * @generated
		 */
		EClass SPECIFICATION = eINSTANCE.getSpecification();

		/**
		 * The meta object literal for the '<em><b>Functional Requirement</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__FUNCTIONAL_REQUIREMENT = eINSTANCE.getSpecification_FunctionalRequirement();

		/**
		 * The meta object literal for the '<em><b>Specified Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__SPECIFIED_ENTITY = eINSTANCE.getSpecification_SpecifiedEntity();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.requirements.impl.QualityRequirementImpl <em>Quality Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.requirements.impl.QualityRequirementImpl
		 * @see org.obeonetwork.dsl.east_adl.requirements.impl.RequirementsPackageImpl#getQualityRequirement()
		 * @generated
		 */
		EClass QUALITY_REQUIREMENT = eINSTANCE.getQualityRequirement();

		/**
		 * The meta object literal for the '<em><b>Quality Requirement Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALITY_REQUIREMENT__QUALITY_REQUIREMENT_TYPE = eINSTANCE.getQualityRequirement_QualityRequirementType();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.requirements.impl.EndToEndDelayImpl <em>End To End Delay</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.requirements.impl.EndToEndDelayImpl
		 * @see org.obeonetwork.dsl.east_adl.requirements.impl.RequirementsPackageImpl#getEndToEndDelay()
		 * @generated
		 */
		EClass END_TO_END_DELAY = eINSTANCE.getEndToEndDelay();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_TO_END_DELAY__FROM = eINSTANCE.getEndToEndDelay_From();

		/**
		 * The meta object literal for the '<em><b>Until</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_TO_END_DELAY__UNTIL = eINSTANCE.getEndToEndDelay_Until();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END_TO_END_DELAY__PROBABILITY = eINSTANCE.getEndToEndDelay_Probability();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.requirements.impl.TimingRestrictionImpl <em>Timing Restriction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.requirements.impl.TimingRestrictionImpl
		 * @see org.obeonetwork.dsl.east_adl.requirements.impl.RequirementsPackageImpl#getTimingRestriction()
		 * @generated
		 */
		EClass TIMING_RESTRICTION = eINSTANCE.getTimingRestriction();

		/**
		 * The meta object literal for the '<em><b>Upper</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_RESTRICTION__UPPER = eINSTANCE.getTimingRestriction_Upper();

		/**
		 * The meta object literal for the '<em><b>Lower</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_RESTRICTION__LOWER = eINSTANCE.getTimingRestriction_Lower();

		/**
		 * The meta object literal for the '<em><b>Nominal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_RESTRICTION__NOMINAL = eINSTANCE.getTimingRestriction_Nominal();

		/**
		 * The meta object literal for the '<em><b>Jitter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_RESTRICTION__JITTER = eINSTANCE.getTimingRestriction_Jitter();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.requirements.impl.PeriodRestrictionImpl <em>Period Restriction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.requirements.impl.PeriodRestrictionImpl
		 * @see org.obeonetwork.dsl.east_adl.requirements.impl.RequirementsPackageImpl#getPeriodRestriction()
		 * @generated
		 */
		EClass PERIOD_RESTRICTION = eINSTANCE.getPeriodRestriction();

		/**
		 * The meta object literal for the '<em><b>Assigned Ports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERIOD_RESTRICTION__ASSIGNED_PORTS = eINSTANCE.getPeriodRestriction_AssignedPorts();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.requirements.impl.BoundImpl <em>Bound</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.requirements.impl.BoundImpl
		 * @see org.obeonetwork.dsl.east_adl.requirements.impl.RequirementsPackageImpl#getBound()
		 * @generated
		 */
		EClass BOUND = eINSTANCE.getBound();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUND__UNIT = eINSTANCE.getBound_Unit();

		/**
		 * The meta object literal for the '<em><b>Timing Restriction</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOUND__TIMING_RESTRICTION = eINSTANCE.getBound_TimingRestriction();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUND__VALUE = eINSTANCE.getBound_Value();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.requirements.impl.TraceImpl <em>Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.requirements.impl.TraceImpl
		 * @see org.obeonetwork.dsl.east_adl.requirements.impl.RequirementsPackageImpl#getTrace()
		 * @generated
		 */
		EClass TRACE = eINSTANCE.getTrace();

		/**
		 * The meta object literal for the '<em><b>Tracer</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__TRACER = eINSTANCE.getTrace_Tracer();

		/**
		 * The meta object literal for the '<em><b>Traced</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__TRACED = eINSTANCE.getTrace_Traced();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.requirements.impl.VerificationMethodImpl <em>Verification Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.requirements.impl.VerificationMethodImpl
		 * @see org.obeonetwork.dsl.east_adl.requirements.impl.RequirementsPackageImpl#getVerificationMethod()
		 * @generated
		 */
		EClass VERIFICATION_METHOD = eINSTANCE.getVerificationMethod();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERIFICATION_METHOD__DESCRIPTION = eINSTANCE.getVerificationMethod_Description();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERIFICATION_METHOD__TYPE = eINSTANCE.getVerificationMethod_Type();

		/**
		 * The meta object literal for the '<em><b>Requirement</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERIFICATION_METHOD__REQUIREMENT = eINSTANCE.getVerificationMethod_Requirement();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.requirements.impl.AssignmentImpl <em>Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.requirements.impl.AssignmentImpl
		 * @see org.obeonetwork.dsl.east_adl.requirements.impl.RequirementsPackageImpl#getAssignment()
		 * @generated
		 */
		EClass ASSIGNMENT = eINSTANCE.getAssignment();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT__TARGET = eINSTANCE.getAssignment_Target();

		/**
		 * The meta object literal for the '<em><b>Assigner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT__ASSIGNER = eINSTANCE.getAssignment_Assigner();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.requirements.DesignConstraintKind <em>Design Constraint Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.requirements.DesignConstraintKind
		 * @see org.obeonetwork.dsl.east_adl.requirements.impl.RequirementsPackageImpl#getDesignConstraintKind()
		 * @generated
		 */
		EEnum DESIGN_CONSTRAINT_KIND = eINSTANCE.getDesignConstraintKind();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.requirements.QualityRequirementKind <em>Quality Requirement Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.requirements.QualityRequirementKind
		 * @see org.obeonetwork.dsl.east_adl.requirements.impl.RequirementsPackageImpl#getQualityRequirementKind()
		 * @generated
		 */
		EEnum QUALITY_REQUIREMENT_KIND = eINSTANCE.getQualityRequirementKind();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.requirements.VerificationMethodKind <em>Verification Method Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.requirements.VerificationMethodKind
		 * @see org.obeonetwork.dsl.east_adl.requirements.impl.RequirementsPackageImpl#getVerificationMethodKind()
		 * @generated
		 */
		EEnum VERIFICATION_METHOD_KIND = eINSTANCE.getVerificationMethodKind();

	}

} //RequirementsPackage
