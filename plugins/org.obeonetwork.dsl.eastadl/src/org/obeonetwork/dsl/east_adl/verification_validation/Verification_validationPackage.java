/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.verification_validation;

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
 * @see org.obeonetwork.dsl.east_adl.verification_validation.Verification_validationFactory
 * @model kind="package"
 * @generated
 */
public interface Verification_validationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "verification_validation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.topcased.org/0.11.0/east_adl/verification_validation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "verification_validation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Verification_validationPackage eINSTANCE = org.obeonetwork.dsl.east_adl.verification_validation.impl.Verification_validationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.verification_validation.impl.VVCaseImpl <em>VV Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.impl.VVCaseImpl
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.impl.Verification_validationPackageImpl#getVVCase()
	 * @generated
	 */
	int VV_CASE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_CASE__NAME = CorePackage.EASTADL_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_CASE__METHOD = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_CASE__PURPOSE = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Verdict</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_CASE__VERDICT = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Objective</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_CASE__OBJECTIVE = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owning Artifact</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_CASE__OWNING_ARTIFACT = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Validated Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_CASE__VALIDATED_ENTITIES = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>VV Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VV_CASE_FEATURE_COUNT = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.verification_validation.impl.SimulationImpl <em>Simulation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.impl.SimulationImpl
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.impl.Verification_validationPackageImpl#getSimulation()
	 * @generated
	 */
	int SIMULATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION__NAME = VV_CASE__NAME;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION__METHOD = VV_CASE__METHOD;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION__PURPOSE = VV_CASE__PURPOSE;

	/**
	 * The feature id for the '<em><b>Verdict</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION__VERDICT = VV_CASE__VERDICT;

	/**
	 * The feature id for the '<em><b>Objective</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION__OBJECTIVE = VV_CASE__OBJECTIVE;

	/**
	 * The feature id for the '<em><b>Owning Artifact</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION__OWNING_ARTIFACT = VV_CASE__OWNING_ARTIFACT;

	/**
	 * The feature id for the '<em><b>Validated Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION__VALIDATED_ENTITIES = VV_CASE__VALIDATED_ENTITIES;

	/**
	 * The feature id for the '<em><b>Stimulis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION__STIMULIS = VV_CASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstraction Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION__ABSTRACTION_LEVEL = VV_CASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION__RESULTS = VV_CASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION__OUTPUTS = VV_CASE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Simulation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_FEATURE_COUNT = VV_CASE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.verification_validation.impl.StaticAnalysisImpl <em>Static Analysis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.impl.StaticAnalysisImpl
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.impl.Verification_validationPackageImpl#getStaticAnalysis()
	 * @generated
	 */
	int STATIC_ANALYSIS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ANALYSIS__NAME = VV_CASE__NAME;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ANALYSIS__METHOD = VV_CASE__METHOD;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ANALYSIS__PURPOSE = VV_CASE__PURPOSE;

	/**
	 * The feature id for the '<em><b>Verdict</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ANALYSIS__VERDICT = VV_CASE__VERDICT;

	/**
	 * The feature id for the '<em><b>Objective</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ANALYSIS__OBJECTIVE = VV_CASE__OBJECTIVE;

	/**
	 * The feature id for the '<em><b>Owning Artifact</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ANALYSIS__OWNING_ARTIFACT = VV_CASE__OWNING_ARTIFACT;

	/**
	 * The feature id for the '<em><b>Validated Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ANALYSIS__VALIDATED_ENTITIES = VV_CASE__VALIDATED_ENTITIES;

	/**
	 * The number of structural features of the '<em>Static Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ANALYSIS_FEATURE_COUNT = VV_CASE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.verification_validation.impl.FormalAnalysisImpl <em>Formal Analysis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.impl.FormalAnalysisImpl
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.impl.Verification_validationPackageImpl#getFormalAnalysis()
	 * @generated
	 */
	int FORMAL_ANALYSIS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_ANALYSIS__NAME = VV_CASE__NAME;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_ANALYSIS__METHOD = VV_CASE__METHOD;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_ANALYSIS__PURPOSE = VV_CASE__PURPOSE;

	/**
	 * The feature id for the '<em><b>Verdict</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_ANALYSIS__VERDICT = VV_CASE__VERDICT;

	/**
	 * The feature id for the '<em><b>Objective</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_ANALYSIS__OBJECTIVE = VV_CASE__OBJECTIVE;

	/**
	 * The feature id for the '<em><b>Owning Artifact</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_ANALYSIS__OWNING_ARTIFACT = VV_CASE__OWNING_ARTIFACT;

	/**
	 * The feature id for the '<em><b>Validated Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_ANALYSIS__VALIDATED_ENTITIES = VV_CASE__VALIDATED_ENTITIES;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_ANALYSIS__PROPERTIES = VV_CASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Formal Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_ANALYSIS_FEATURE_COUNT = VV_CASE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.verification_validation.impl.TestSuiteImpl <em>Test Suite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.impl.TestSuiteImpl
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.impl.Verification_validationPackageImpl#getTestSuite()
	 * @generated
	 */
	int TEST_SUITE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE__NAME = VV_CASE__NAME;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE__METHOD = VV_CASE__METHOD;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE__PURPOSE = VV_CASE__PURPOSE;

	/**
	 * The feature id for the '<em><b>Verdict</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE__VERDICT = VV_CASE__VERDICT;

	/**
	 * The feature id for the '<em><b>Objective</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE__OBJECTIVE = VV_CASE__OBJECTIVE;

	/**
	 * The feature id for the '<em><b>Owning Artifact</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE__OWNING_ARTIFACT = VV_CASE__OWNING_ARTIFACT;

	/**
	 * The feature id for the '<em><b>Validated Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE__VALIDATED_ENTITIES = VV_CASE__VALIDATED_ENTITIES;

	/**
	 * The feature id for the '<em><b>Test Cases</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE__TEST_CASES = VV_CASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Test Suite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE_FEATURE_COUNT = VV_CASE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.verification_validation.impl.StimuliImpl <em>Stimuli</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.impl.StimuliImpl
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.impl.Verification_validationPackageImpl#getStimuli()
	 * @generated
	 */
	int STIMULI = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULI__NAME = CorePackage.EASTADL_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Actual Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULI__ACTUAL_RESULT = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULI__OUTPUT = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULI__DATA = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Stimuli</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULI_FEATURE_COUNT = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.verification_validation.impl.TestCaseImpl <em>Test Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.impl.TestCaseImpl
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.impl.Verification_validationPackageImpl#getTestCase()
	 * @generated
	 */
	int TEST_CASE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__NAME = VV_CASE__NAME;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__METHOD = VV_CASE__METHOD;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__PURPOSE = VV_CASE__PURPOSE;

	/**
	 * The feature id for the '<em><b>Verdict</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__VERDICT = VV_CASE__VERDICT;

	/**
	 * The feature id for the '<em><b>Objective</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__OBJECTIVE = VV_CASE__OBJECTIVE;

	/**
	 * The feature id for the '<em><b>Owning Artifact</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__OWNING_ARTIFACT = VV_CASE__OWNING_ARTIFACT;

	/**
	 * The feature id for the '<em><b>Validated Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__VALIDATED_ENTITIES = VV_CASE__VALIDATED_ENTITIES;

	/**
	 * The feature id for the '<em><b>Abstraction Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__ABSTRACTION_LEVEL = VV_CASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__INPUTS = VV_CASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__RESULTS = VV_CASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__OUTPUTS = VV_CASE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Test Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE_FEATURE_COUNT = VV_CASE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.verification_validation.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.impl.InputImpl
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.impl.Verification_validationPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__NAME = CorePackage.EASTADL_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Actual Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__ACTUAL_RESULT = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__OUTPUT = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__SCENARIO = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.verification_validation.impl.ActualResultImpl <em>Actual Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.impl.ActualResultImpl
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.impl.Verification_validationPackageImpl#getActualResult()
	 * @generated
	 */
	int ACTUAL_RESULT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_RESULT__NAME = CorePackage.EASTADL_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_RESULT__DATA = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Actual Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_RESULT_FEATURE_COUNT = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.verification_validation.impl.ExpectedOutputImpl <em>Expected Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.impl.ExpectedOutputImpl
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.impl.Verification_validationPackageImpl#getExpectedOutput()
	 * @generated
	 */
	int EXPECTED_OUTPUT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_OUTPUT__NAME = CorePackage.EASTADL_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_OUTPUT__DATA = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expected Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_OUTPUT_FEATURE_COUNT = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.verification_validation.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.impl.PropertyImpl
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.impl.Verification_validationPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = CorePackage.EASTADL_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Formalism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__FORMALISM = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DESCRIPTION = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.verification_validation.impl.ValidatedEntityImpl <em>Validated Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.impl.ValidatedEntityImpl
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.impl.Verification_validationPackageImpl#getValidatedEntity()
	 * @generated
	 */
	int VALIDATED_ENTITY = 11;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATED_ENTITY__VALIDATORS = 0;

	/**
	 * The number of structural features of the '<em>Validated Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATED_ENTITY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.verification_validation.VerdictKind <em>Verdict Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.VerdictKind
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.impl.Verification_validationPackageImpl#getVerdictKind()
	 * @generated
	 */
	int VERDICT_KIND = 12;


	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.verification_validation.VVCase <em>VV Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VV Case</em>'.
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.VVCase
	 * @generated
	 */
	EClass getVVCase();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.verification_validation.VVCase#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.VVCase#getMethod()
	 * @see #getVVCase()
	 * @generated
	 */
	EAttribute getVVCase_Method();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.verification_validation.VVCase#getPurpose <em>Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purpose</em>'.
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.VVCase#getPurpose()
	 * @see #getVVCase()
	 * @generated
	 */
	EAttribute getVVCase_Purpose();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.verification_validation.VVCase#getVerdict <em>Verdict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Verdict</em>'.
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.VVCase#getVerdict()
	 * @see #getVVCase()
	 * @generated
	 */
	EAttribute getVVCase_Verdict();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.verification_validation.VVCase#getObjective <em>Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Objective</em>'.
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.VVCase#getObjective()
	 * @see #getVVCase()
	 * @generated
	 */
	EAttribute getVVCase_Objective();

	/**
	 * Returns the meta object for the container reference '{@link org.obeonetwork.dsl.east_adl.verification_validation.VVCase#getOwningArtifact <em>Owning Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Artifact</em>'.
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.VVCase#getOwningArtifact()
	 * @see #getVVCase()
	 * @generated
	 */
	EReference getVVCase_OwningArtifact();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.verification_validation.VVCase#getValidatedEntities <em>Validated Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Validated Entities</em>'.
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.VVCase#getValidatedEntities()
	 * @see #getVVCase()
	 * @generated
	 */
	EReference getVVCase_ValidatedEntities();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.verification_validation.Simulation <em>Simulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simulation</em>'.
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.Simulation
	 * @generated
	 */
	EClass getSimulation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.verification_validation.Simulation#getStimulis <em>Stimulis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stimulis</em>'.
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.Simulation#getStimulis()
	 * @see #getSimulation()
	 * @generated
	 */
	EReference getSimulation_Stimulis();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.verification_validation.Simulation#getAbstractionLevel <em>Abstraction Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstraction Level</em>'.
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.Simulation#getAbstractionLevel()
	 * @see #getSimulation()
	 * @generated
	 */
	EAttribute getSimulation_AbstractionLevel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.verification_validation.Simulation#getResults <em>Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Results</em>'.
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.Simulation#getResults()
	 * @see #getSimulation()
	 * @generated
	 */
	EReference getSimulation_Results();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.verification_validation.Simulation#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputs</em>'.
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.Simulation#getOutputs()
	 * @see #getSimulation()
	 * @generated
	 */
	EReference getSimulation_Outputs();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.verification_validation.StaticAnalysis <em>Static Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Analysis</em>'.
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.StaticAnalysis
	 * @generated
	 */
	EClass getStaticAnalysis();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.verification_validation.FormalAnalysis <em>Formal Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formal Analysis</em>'.
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.FormalAnalysis
	 * @generated
	 */
	EClass getFormalAnalysis();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.verification_validation.FormalAnalysis#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.FormalAnalysis#getProperties()
	 * @see #getFormalAnalysis()
	 * @generated
	 */
	EReference getFormalAnalysis_Properties();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.verification_validation.TestSuite <em>Test Suite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Suite</em>'.
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.TestSuite
	 * @generated
	 */
	EClass getTestSuite();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.verification_validation.TestSuite#getTestCases <em>Test Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Test Cases</em>'.
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.TestSuite#getTestCases()
	 * @see #getTestSuite()
	 * @generated
	 */
	EReference getTestSuite_TestCases();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.verification_validation.Stimuli <em>Stimuli</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stimuli</em>'.
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.Stimuli
	 * @generated
	 */
	EClass getStimuli();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.verification_validation.Stimuli#getActualResult <em>Actual Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actual Result</em>'.
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.Stimuli#getActualResult()
	 * @see #getStimuli()
	 * @generated
	 */
	EReference getStimuli_ActualResult();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.verification_validation.Stimuli#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output</em>'.
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.Stimuli#getOutput()
	 * @see #getStimuli()
	 * @generated
	 */
	EReference getStimuli_Output();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.verification_validation.Stimuli#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.Stimuli#getData()
	 * @see #getStimuli()
	 * @generated
	 */
	EAttribute getStimuli_Data();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.verification_validation.TestCase <em>Test Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Case</em>'.
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.TestCase
	 * @generated
	 */
	EClass getTestCase();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.verification_validation.TestCase#getAbstractionLevel <em>Abstraction Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstraction Level</em>'.
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.TestCase#getAbstractionLevel()
	 * @see #getTestCase()
	 * @generated
	 */
	EAttribute getTestCase_AbstractionLevel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.verification_validation.TestCase#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.TestCase#getInputs()
	 * @see #getTestCase()
	 * @generated
	 */
	EReference getTestCase_Inputs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.verification_validation.TestCase#getResults <em>Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Results</em>'.
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.TestCase#getResults()
	 * @see #getTestCase()
	 * @generated
	 */
	EReference getTestCase_Results();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.verification_validation.TestCase#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputs</em>'.
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.TestCase#getOutputs()
	 * @see #getTestCase()
	 * @generated
	 */
	EReference getTestCase_Outputs();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.verification_validation.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.verification_validation.Input#getActualResult <em>Actual Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actual Result</em>'.
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.Input#getActualResult()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_ActualResult();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.verification_validation.Input#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output</em>'.
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.Input#getOutput()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_Output();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.verification_validation.Input#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scenario</em>'.
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.Input#getScenario()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Scenario();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.verification_validation.ActualResult <em>Actual Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actual Result</em>'.
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.ActualResult
	 * @generated
	 */
	EClass getActualResult();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.verification_validation.ActualResult#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.ActualResult#getData()
	 * @see #getActualResult()
	 * @generated
	 */
	EAttribute getActualResult_Data();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.verification_validation.ExpectedOutput <em>Expected Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expected Output</em>'.
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.ExpectedOutput
	 * @generated
	 */
	EClass getExpectedOutput();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.verification_validation.ExpectedOutput#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.ExpectedOutput#getData()
	 * @see #getExpectedOutput()
	 * @generated
	 */
	EAttribute getExpectedOutput_Data();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.verification_validation.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.verification_validation.Property#getFormalism <em>Formalism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formalism</em>'.
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.Property#getFormalism()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Formalism();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.verification_validation.Property#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.Property#getDescription()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Description();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.verification_validation.ValidatedEntity <em>Validated Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Validated Entity</em>'.
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.ValidatedEntity
	 * @generated
	 */
	EClass getValidatedEntity();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.verification_validation.ValidatedEntity#getValidators <em>Validators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Validators</em>'.
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.ValidatedEntity#getValidators()
	 * @see #getValidatedEntity()
	 * @generated
	 */
	EReference getValidatedEntity_Validators();

	/**
	 * Returns the meta object for enum '{@link org.obeonetwork.dsl.east_adl.verification_validation.VerdictKind <em>Verdict Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Verdict Kind</em>'.
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.VerdictKind
	 * @generated
	 */
	EEnum getVerdictKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Verification_validationFactory getVerification_validationFactory();

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
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.verification_validation.impl.VVCaseImpl <em>VV Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.verification_validation.impl.VVCaseImpl
		 * @see org.obeonetwork.dsl.east_adl.verification_validation.impl.Verification_validationPackageImpl#getVVCase()
		 * @generated
		 */
		EClass VV_CASE = eINSTANCE.getVVCase();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VV_CASE__METHOD = eINSTANCE.getVVCase_Method();

		/**
		 * The meta object literal for the '<em><b>Purpose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VV_CASE__PURPOSE = eINSTANCE.getVVCase_Purpose();

		/**
		 * The meta object literal for the '<em><b>Verdict</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VV_CASE__VERDICT = eINSTANCE.getVVCase_Verdict();

		/**
		 * The meta object literal for the '<em><b>Objective</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VV_CASE__OBJECTIVE = eINSTANCE.getVVCase_Objective();

		/**
		 * The meta object literal for the '<em><b>Owning Artifact</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VV_CASE__OWNING_ARTIFACT = eINSTANCE.getVVCase_OwningArtifact();

		/**
		 * The meta object literal for the '<em><b>Validated Entities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VV_CASE__VALIDATED_ENTITIES = eINSTANCE.getVVCase_ValidatedEntities();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.verification_validation.impl.SimulationImpl <em>Simulation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.verification_validation.impl.SimulationImpl
		 * @see org.obeonetwork.dsl.east_adl.verification_validation.impl.Verification_validationPackageImpl#getSimulation()
		 * @generated
		 */
		EClass SIMULATION = eINSTANCE.getSimulation();

		/**
		 * The meta object literal for the '<em><b>Stimulis</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMULATION__STIMULIS = eINSTANCE.getSimulation_Stimulis();

		/**
		 * The meta object literal for the '<em><b>Abstraction Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION__ABSTRACTION_LEVEL = eINSTANCE.getSimulation_AbstractionLevel();

		/**
		 * The meta object literal for the '<em><b>Results</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMULATION__RESULTS = eINSTANCE.getSimulation_Results();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMULATION__OUTPUTS = eINSTANCE.getSimulation_Outputs();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.verification_validation.impl.StaticAnalysisImpl <em>Static Analysis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.verification_validation.impl.StaticAnalysisImpl
		 * @see org.obeonetwork.dsl.east_adl.verification_validation.impl.Verification_validationPackageImpl#getStaticAnalysis()
		 * @generated
		 */
		EClass STATIC_ANALYSIS = eINSTANCE.getStaticAnalysis();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.verification_validation.impl.FormalAnalysisImpl <em>Formal Analysis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.verification_validation.impl.FormalAnalysisImpl
		 * @see org.obeonetwork.dsl.east_adl.verification_validation.impl.Verification_validationPackageImpl#getFormalAnalysis()
		 * @generated
		 */
		EClass FORMAL_ANALYSIS = eINSTANCE.getFormalAnalysis();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMAL_ANALYSIS__PROPERTIES = eINSTANCE.getFormalAnalysis_Properties();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.verification_validation.impl.TestSuiteImpl <em>Test Suite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.verification_validation.impl.TestSuiteImpl
		 * @see org.obeonetwork.dsl.east_adl.verification_validation.impl.Verification_validationPackageImpl#getTestSuite()
		 * @generated
		 */
		EClass TEST_SUITE = eINSTANCE.getTestSuite();

		/**
		 * The meta object literal for the '<em><b>Test Cases</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_SUITE__TEST_CASES = eINSTANCE.getTestSuite_TestCases();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.verification_validation.impl.StimuliImpl <em>Stimuli</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.verification_validation.impl.StimuliImpl
		 * @see org.obeonetwork.dsl.east_adl.verification_validation.impl.Verification_validationPackageImpl#getStimuli()
		 * @generated
		 */
		EClass STIMULI = eINSTANCE.getStimuli();

		/**
		 * The meta object literal for the '<em><b>Actual Result</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STIMULI__ACTUAL_RESULT = eINSTANCE.getStimuli_ActualResult();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STIMULI__OUTPUT = eINSTANCE.getStimuli_Output();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STIMULI__DATA = eINSTANCE.getStimuli_Data();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.verification_validation.impl.TestCaseImpl <em>Test Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.verification_validation.impl.TestCaseImpl
		 * @see org.obeonetwork.dsl.east_adl.verification_validation.impl.Verification_validationPackageImpl#getTestCase()
		 * @generated
		 */
		EClass TEST_CASE = eINSTANCE.getTestCase();

		/**
		 * The meta object literal for the '<em><b>Abstraction Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CASE__ABSTRACTION_LEVEL = eINSTANCE.getTestCase_AbstractionLevel();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_CASE__INPUTS = eINSTANCE.getTestCase_Inputs();

		/**
		 * The meta object literal for the '<em><b>Results</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_CASE__RESULTS = eINSTANCE.getTestCase_Results();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_CASE__OUTPUTS = eINSTANCE.getTestCase_Outputs();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.verification_validation.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.verification_validation.impl.InputImpl
		 * @see org.obeonetwork.dsl.east_adl.verification_validation.impl.Verification_validationPackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '<em><b>Actual Result</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT__ACTUAL_RESULT = eINSTANCE.getInput_ActualResult();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT__OUTPUT = eINSTANCE.getInput_Output();

		/**
		 * The meta object literal for the '<em><b>Scenario</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__SCENARIO = eINSTANCE.getInput_Scenario();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.verification_validation.impl.ActualResultImpl <em>Actual Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.verification_validation.impl.ActualResultImpl
		 * @see org.obeonetwork.dsl.east_adl.verification_validation.impl.Verification_validationPackageImpl#getActualResult()
		 * @generated
		 */
		EClass ACTUAL_RESULT = eINSTANCE.getActualResult();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTUAL_RESULT__DATA = eINSTANCE.getActualResult_Data();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.verification_validation.impl.ExpectedOutputImpl <em>Expected Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.verification_validation.impl.ExpectedOutputImpl
		 * @see org.obeonetwork.dsl.east_adl.verification_validation.impl.Verification_validationPackageImpl#getExpectedOutput()
		 * @generated
		 */
		EClass EXPECTED_OUTPUT = eINSTANCE.getExpectedOutput();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPECTED_OUTPUT__DATA = eINSTANCE.getExpectedOutput_Data();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.verification_validation.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.verification_validation.impl.PropertyImpl
		 * @see org.obeonetwork.dsl.east_adl.verification_validation.impl.Verification_validationPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Formalism</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__FORMALISM = eINSTANCE.getProperty_Formalism();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__DESCRIPTION = eINSTANCE.getProperty_Description();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.verification_validation.impl.ValidatedEntityImpl <em>Validated Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.verification_validation.impl.ValidatedEntityImpl
		 * @see org.obeonetwork.dsl.east_adl.verification_validation.impl.Verification_validationPackageImpl#getValidatedEntity()
		 * @generated
		 */
		EClass VALIDATED_ENTITY = eINSTANCE.getValidatedEntity();

		/**
		 * The meta object literal for the '<em><b>Validators</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALIDATED_ENTITY__VALIDATORS = eINSTANCE.getValidatedEntity_Validators();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.verification_validation.VerdictKind <em>Verdict Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.verification_validation.VerdictKind
		 * @see org.obeonetwork.dsl.east_adl.verification_validation.impl.Verification_validationPackageImpl#getVerdictKind()
		 * @generated
		 */
		EEnum VERDICT_KIND = eINSTANCE.getVerdictKind();

	}

} //Verification_validationPackage
