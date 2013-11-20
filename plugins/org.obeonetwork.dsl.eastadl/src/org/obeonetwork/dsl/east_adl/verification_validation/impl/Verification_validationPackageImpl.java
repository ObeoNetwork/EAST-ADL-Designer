/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.verification_validation.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.obeonetwork.dsl.east_adl.East_adlPackage;

import org.obeonetwork.dsl.east_adl.behavior.BehaviorPackage;

import org.obeonetwork.dsl.east_adl.behavior.impl.BehaviorPackageImpl;

import org.obeonetwork.dsl.east_adl.core.CorePackage;

import org.obeonetwork.dsl.east_adl.core.impl.CorePackageImpl;

import org.obeonetwork.dsl.east_adl.impl.East_adlPackageImpl;

import org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage;

import org.obeonetwork.dsl.east_adl.requirements.impl.RequirementsPackageImpl;

import org.obeonetwork.dsl.east_adl.structure.StructurePackage;

import org.obeonetwork.dsl.east_adl.structure.allocation_model.Allocation_modelPackage;

import org.obeonetwork.dsl.east_adl.structure.allocation_model.impl.Allocation_modelPackageImpl;

import org.obeonetwork.dsl.east_adl.structure.common.CommonPackage;

import org.obeonetwork.dsl.east_adl.structure.common.impl.CommonPackageImpl;

import org.obeonetwork.dsl.east_adl.structure.function_instance_model.Function_instance_modelPackage;

import org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.Function_instance_modelPackageImpl;

import org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.Functional_analysis_architecturePackage;

import org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl.Functional_analysis_architecturePackageImpl;

import org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Functional_design_architecturePackage;

import org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.Functional_design_architecturePackageImpl;

import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage;

import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.Hardware_architecturePackageImpl;

import org.obeonetwork.dsl.east_adl.structure.impl.StructurePackageImpl;

import org.obeonetwork.dsl.east_adl.structure.platform_model.Platform_modelPackage;

import org.obeonetwork.dsl.east_adl.structure.platform_model.impl.Platform_modelPackageImpl;

import org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.Vehicle_feature_modelPackage;

import org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.Vehicle_feature_modelPackageImpl;

import org.obeonetwork.dsl.east_adl.support.SupportPackage;

import org.obeonetwork.dsl.east_adl.support.impl.SupportPackageImpl;

import org.obeonetwork.dsl.east_adl.variant_handling.Variant_handlingPackage;

import org.obeonetwork.dsl.east_adl.variant_handling.impl.Variant_handlingPackageImpl;

import org.obeonetwork.dsl.east_adl.verification_validation.ActualResult;
import org.obeonetwork.dsl.east_adl.verification_validation.ExpectedOutput;
import org.obeonetwork.dsl.east_adl.verification_validation.FormalAnalysis;
import org.obeonetwork.dsl.east_adl.verification_validation.Input;
import org.obeonetwork.dsl.east_adl.verification_validation.Property;
import org.obeonetwork.dsl.east_adl.verification_validation.Simulation;
import org.obeonetwork.dsl.east_adl.verification_validation.StaticAnalysis;
import org.obeonetwork.dsl.east_adl.verification_validation.Stimuli;
import org.obeonetwork.dsl.east_adl.verification_validation.TestCase;
import org.obeonetwork.dsl.east_adl.verification_validation.TestSuite;
import org.obeonetwork.dsl.east_adl.verification_validation.VVCase;
import org.obeonetwork.dsl.east_adl.verification_validation.ValidatedEntity;
import org.obeonetwork.dsl.east_adl.verification_validation.VerdictKind;
import org.obeonetwork.dsl.east_adl.verification_validation.Verification_validationFactory;
import org.obeonetwork.dsl.east_adl.verification_validation.Verification_validationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Verification_validationPackageImpl extends EPackageImpl implements Verification_validationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vvCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simulationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticAnalysisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formalAnalysisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testSuiteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stimuliEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actualResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expectedOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass validatedEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum verdictKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.Verification_validationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Verification_validationPackageImpl() {
		super(eNS_URI, Verification_validationFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Verification_validationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Verification_validationPackage init() {
		if (isInited) return (Verification_validationPackage)EPackage.Registry.INSTANCE.getEPackage(Verification_validationPackage.eNS_URI);

		// Obtain or create and register package
		Verification_validationPackageImpl theVerification_validationPackage = (Verification_validationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Verification_validationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Verification_validationPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		East_adlPackageImpl theEast_adlPackage = (East_adlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(East_adlPackage.eNS_URI) instanceof East_adlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(East_adlPackage.eNS_URI) : East_adlPackage.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		StructurePackageImpl theStructurePackage = (StructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI) instanceof StructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI) : StructurePackage.eINSTANCE);
		Vehicle_feature_modelPackageImpl theVehicle_feature_modelPackage = (Vehicle_feature_modelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Vehicle_feature_modelPackage.eNS_URI) instanceof Vehicle_feature_modelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Vehicle_feature_modelPackage.eNS_URI) : Vehicle_feature_modelPackage.eINSTANCE);
		Functional_analysis_architecturePackageImpl theFunctional_analysis_architecturePackage = (Functional_analysis_architecturePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Functional_analysis_architecturePackage.eNS_URI) instanceof Functional_analysis_architecturePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Functional_analysis_architecturePackage.eNS_URI) : Functional_analysis_architecturePackage.eINSTANCE);
		Functional_design_architecturePackageImpl theFunctional_design_architecturePackage = (Functional_design_architecturePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Functional_design_architecturePackage.eNS_URI) instanceof Functional_design_architecturePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Functional_design_architecturePackage.eNS_URI) : Functional_design_architecturePackage.eINSTANCE);
		Function_instance_modelPackageImpl theFunction_instance_modelPackage = (Function_instance_modelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Function_instance_modelPackage.eNS_URI) instanceof Function_instance_modelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Function_instance_modelPackage.eNS_URI) : Function_instance_modelPackage.eINSTANCE);
		Hardware_architecturePackageImpl theHardware_architecturePackage = (Hardware_architecturePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Hardware_architecturePackage.eNS_URI) instanceof Hardware_architecturePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Hardware_architecturePackage.eNS_URI) : Hardware_architecturePackage.eINSTANCE);
		Platform_modelPackageImpl thePlatform_modelPackage = (Platform_modelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Platform_modelPackage.eNS_URI) instanceof Platform_modelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Platform_modelPackage.eNS_URI) : Platform_modelPackage.eINSTANCE);
		Allocation_modelPackageImpl theAllocation_modelPackage = (Allocation_modelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Allocation_modelPackage.eNS_URI) instanceof Allocation_modelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Allocation_modelPackage.eNS_URI) : Allocation_modelPackage.eINSTANCE);
		CommonPackageImpl theCommonPackage = (CommonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) : CommonPackage.eINSTANCE);
		RequirementsPackageImpl theRequirementsPackage = (RequirementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RequirementsPackage.eNS_URI) instanceof RequirementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RequirementsPackage.eNS_URI) : RequirementsPackage.eINSTANCE);
		Variant_handlingPackageImpl theVariant_handlingPackage = (Variant_handlingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Variant_handlingPackage.eNS_URI) instanceof Variant_handlingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Variant_handlingPackage.eNS_URI) : Variant_handlingPackage.eINSTANCE);
		SupportPackageImpl theSupportPackage = (SupportPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SupportPackage.eNS_URI) instanceof SupportPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SupportPackage.eNS_URI) : SupportPackage.eINSTANCE);
		BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) : BehaviorPackage.eINSTANCE);

		// Create package meta-data objects
		theVerification_validationPackage.createPackageContents();
		theEast_adlPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theStructurePackage.createPackageContents();
		theVehicle_feature_modelPackage.createPackageContents();
		theFunctional_analysis_architecturePackage.createPackageContents();
		theFunctional_design_architecturePackage.createPackageContents();
		theFunction_instance_modelPackage.createPackageContents();
		theHardware_architecturePackage.createPackageContents();
		thePlatform_modelPackage.createPackageContents();
		theAllocation_modelPackage.createPackageContents();
		theCommonPackage.createPackageContents();
		theRequirementsPackage.createPackageContents();
		theVariant_handlingPackage.createPackageContents();
		theSupportPackage.createPackageContents();
		theBehaviorPackage.createPackageContents();

		// Initialize created meta-data
		theVerification_validationPackage.initializePackageContents();
		theEast_adlPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theStructurePackage.initializePackageContents();
		theVehicle_feature_modelPackage.initializePackageContents();
		theFunctional_analysis_architecturePackage.initializePackageContents();
		theFunctional_design_architecturePackage.initializePackageContents();
		theFunction_instance_modelPackage.initializePackageContents();
		theHardware_architecturePackage.initializePackageContents();
		thePlatform_modelPackage.initializePackageContents();
		theAllocation_modelPackage.initializePackageContents();
		theCommonPackage.initializePackageContents();
		theRequirementsPackage.initializePackageContents();
		theVariant_handlingPackage.initializePackageContents();
		theSupportPackage.initializePackageContents();
		theBehaviorPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVerification_validationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Verification_validationPackage.eNS_URI, theVerification_validationPackage);
		return theVerification_validationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVVCase() {
		return vvCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVVCase_Method() {
		return (EAttribute)vvCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVVCase_Purpose() {
		return (EAttribute)vvCaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVVCase_Verdict() {
		return (EAttribute)vvCaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVVCase_Objective() {
		return (EAttribute)vvCaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVVCase_OwningArtifact() {
		return (EReference)vvCaseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVVCase_ValidatedEntities() {
		return (EReference)vvCaseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimulation() {
		return simulationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimulation_Stimulis() {
		return (EReference)simulationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulation_AbstractionLevel() {
		return (EAttribute)simulationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimulation_Results() {
		return (EReference)simulationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimulation_Outputs() {
		return (EReference)simulationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaticAnalysis() {
		return staticAnalysisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormalAnalysis() {
		return formalAnalysisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormalAnalysis_Properties() {
		return (EReference)formalAnalysisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestSuite() {
		return testSuiteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestSuite_TestCases() {
		return (EReference)testSuiteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStimuli() {
		return stimuliEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStimuli_ActualResult() {
		return (EReference)stimuliEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStimuli_Output() {
		return (EReference)stimuliEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStimuli_Data() {
		return (EAttribute)stimuliEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestCase() {
		return testCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestCase_AbstractionLevel() {
		return (EAttribute)testCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestCase_Inputs() {
		return (EReference)testCaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestCase_Results() {
		return (EReference)testCaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestCase_Outputs() {
		return (EReference)testCaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInput() {
		return inputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInput_ActualResult() {
		return (EReference)inputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInput_Output() {
		return (EReference)inputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInput_Scenario() {
		return (EAttribute)inputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActualResult() {
		return actualResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActualResult_Data() {
		return (EAttribute)actualResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpectedOutput() {
		return expectedOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpectedOutput_Data() {
		return (EAttribute)expectedOutputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Formalism() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Description() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValidatedEntity() {
		return validatedEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValidatedEntity_Validators() {
		return (EReference)validatedEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVerdictKind() {
		return verdictKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Verification_validationFactory getVerification_validationFactory() {
		return (Verification_validationFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		vvCaseEClass = createEClass(VV_CASE);
		createEAttribute(vvCaseEClass, VV_CASE__METHOD);
		createEAttribute(vvCaseEClass, VV_CASE__PURPOSE);
		createEAttribute(vvCaseEClass, VV_CASE__VERDICT);
		createEAttribute(vvCaseEClass, VV_CASE__OBJECTIVE);
		createEReference(vvCaseEClass, VV_CASE__OWNING_ARTIFACT);
		createEReference(vvCaseEClass, VV_CASE__VALIDATED_ENTITIES);

		simulationEClass = createEClass(SIMULATION);
		createEReference(simulationEClass, SIMULATION__STIMULIS);
		createEAttribute(simulationEClass, SIMULATION__ABSTRACTION_LEVEL);
		createEReference(simulationEClass, SIMULATION__RESULTS);
		createEReference(simulationEClass, SIMULATION__OUTPUTS);

		staticAnalysisEClass = createEClass(STATIC_ANALYSIS);

		formalAnalysisEClass = createEClass(FORMAL_ANALYSIS);
		createEReference(formalAnalysisEClass, FORMAL_ANALYSIS__PROPERTIES);

		testSuiteEClass = createEClass(TEST_SUITE);
		createEReference(testSuiteEClass, TEST_SUITE__TEST_CASES);

		stimuliEClass = createEClass(STIMULI);
		createEReference(stimuliEClass, STIMULI__ACTUAL_RESULT);
		createEReference(stimuliEClass, STIMULI__OUTPUT);
		createEAttribute(stimuliEClass, STIMULI__DATA);

		testCaseEClass = createEClass(TEST_CASE);
		createEAttribute(testCaseEClass, TEST_CASE__ABSTRACTION_LEVEL);
		createEReference(testCaseEClass, TEST_CASE__INPUTS);
		createEReference(testCaseEClass, TEST_CASE__RESULTS);
		createEReference(testCaseEClass, TEST_CASE__OUTPUTS);

		inputEClass = createEClass(INPUT);
		createEReference(inputEClass, INPUT__ACTUAL_RESULT);
		createEReference(inputEClass, INPUT__OUTPUT);
		createEAttribute(inputEClass, INPUT__SCENARIO);

		actualResultEClass = createEClass(ACTUAL_RESULT);
		createEAttribute(actualResultEClass, ACTUAL_RESULT__DATA);

		expectedOutputEClass = createEClass(EXPECTED_OUTPUT);
		createEAttribute(expectedOutputEClass, EXPECTED_OUTPUT__DATA);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__FORMALISM);
		createEAttribute(propertyEClass, PROPERTY__DESCRIPTION);

		validatedEntityEClass = createEClass(VALIDATED_ENTITY);
		createEReference(validatedEntityEClass, VALIDATED_ENTITY__VALIDATORS);

		// Create enums
		verdictKindEEnum = createEEnum(VERDICT_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		vvCaseEClass.getESuperTypes().add(theCorePackage.getEASTADLNamedElement());
		simulationEClass.getESuperTypes().add(this.getVVCase());
		staticAnalysisEClass.getESuperTypes().add(this.getVVCase());
		formalAnalysisEClass.getESuperTypes().add(this.getVVCase());
		testSuiteEClass.getESuperTypes().add(this.getVVCase());
		stimuliEClass.getESuperTypes().add(theCorePackage.getEASTADLNamedElement());
		testCaseEClass.getESuperTypes().add(this.getVVCase());
		inputEClass.getESuperTypes().add(theCorePackage.getEASTADLNamedElement());
		actualResultEClass.getESuperTypes().add(theCorePackage.getEASTADLNamedElement());
		expectedOutputEClass.getESuperTypes().add(theCorePackage.getEASTADLNamedElement());
		propertyEClass.getESuperTypes().add(theCorePackage.getEASTADLNamedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(vvCaseEClass, VVCase.class, "VVCase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVVCase_Method(), ecorePackage.getEString(), "method", null, 0, 1, VVCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVVCase_Purpose(), ecorePackage.getEString(), "purpose", null, 0, 1, VVCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVVCase_Verdict(), this.getVerdictKind(), "verdict", null, 0, 1, VVCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVVCase_Objective(), ecorePackage.getEString(), "objective", null, 0, 1, VVCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVVCase_OwningArtifact(), theCorePackage.getEASTADLArtifact(), theCorePackage.getEASTADLArtifact_ValidationEntities(), "owningArtifact", null, 1, 1, VVCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVVCase_ValidatedEntities(), this.getValidatedEntity(), this.getValidatedEntity_Validators(), "validatedEntities", null, 0, -1, VVCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simulationEClass, Simulation.class, "Simulation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimulation_Stimulis(), this.getStimuli(), null, "stimulis", null, 0, -1, Simulation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulation_AbstractionLevel(), ecorePackage.getEString(), "abstractionLevel", null, 0, 1, Simulation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimulation_Results(), this.getActualResult(), null, "results", null, 0, -1, Simulation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimulation_Outputs(), this.getExpectedOutput(), null, "outputs", null, 0, -1, Simulation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(staticAnalysisEClass, StaticAnalysis.class, "StaticAnalysis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(formalAnalysisEClass, FormalAnalysis.class, "FormalAnalysis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFormalAnalysis_Properties(), this.getProperty(), null, "properties", null, 0, -1, FormalAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testSuiteEClass, TestSuite.class, "TestSuite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTestSuite_TestCases(), this.getTestCase(), null, "testCases", null, 0, -1, TestSuite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stimuliEClass, Stimuli.class, "Stimuli", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStimuli_ActualResult(), this.getActualResult(), null, "actualResult", null, 0, 1, Stimuli.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStimuli_Output(), this.getExpectedOutput(), null, "output", null, 0, 1, Stimuli.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStimuli_Data(), ecorePackage.getEString(), "data", null, 0, 1, Stimuli.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testCaseEClass, TestCase.class, "TestCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTestCase_AbstractionLevel(), ecorePackage.getEString(), "abstractionLevel", null, 0, 1, TestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestCase_Inputs(), this.getInput(), null, "inputs", null, 0, -1, TestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestCase_Results(), this.getActualResult(), null, "results", null, 0, -1, TestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestCase_Outputs(), this.getExpectedOutput(), null, "outputs", null, 0, -1, TestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputEClass, Input.class, "Input", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInput_ActualResult(), this.getActualResult(), null, "actualResult", null, 0, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInput_Output(), this.getExpectedOutput(), null, "output", null, 0, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInput_Scenario(), ecorePackage.getEString(), "scenario", null, 0, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actualResultEClass, ActualResult.class, "ActualResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActualResult_Data(), ecorePackage.getEString(), "data", null, 0, 1, ActualResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expectedOutputEClass, ExpectedOutput.class, "ExpectedOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExpectedOutput_Data(), ecorePackage.getEString(), "data", null, 0, 1, ExpectedOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_Formalism(), ecorePackage.getEString(), "formalism", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Description(), ecorePackage.getEString(), "description", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(validatedEntityEClass, ValidatedEntity.class, "ValidatedEntity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValidatedEntity_Validators(), this.getVVCase(), this.getVVCase_ValidatedEntities(), "validators", null, 0, -1, ValidatedEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(verdictKindEEnum, VerdictKind.class, "VerdictKind");
		addEEnumLiteral(verdictKindEEnum, VerdictKind.PASS);
		addEEnumLiteral(verdictKindEEnum, VerdictKind.FAIL);
		addEEnumLiteral(verdictKindEEnum, VerdictKind.INCONCLUSIVE);
		addEEnumLiteral(verdictKindEEnum, VerdictKind.ERROR);
	}

} //Verification_validationPackageImpl
