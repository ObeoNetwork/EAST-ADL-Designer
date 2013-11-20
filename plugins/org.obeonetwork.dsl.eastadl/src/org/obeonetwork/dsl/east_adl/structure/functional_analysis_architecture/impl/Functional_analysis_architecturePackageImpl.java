/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl;

import org.eclipse.emf.ecore.EClass;
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

import org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.AnalysisFunction;
import org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.EnvironmentFunction;
import org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.FunctionalAnalysisArchitecture;
import org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.FunctionalDevice;
import org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.Functional_analysis_architectureFactory;
import org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.Functional_analysis_architecturePackage;

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

import org.obeonetwork.dsl.east_adl.verification_validation.Verification_validationPackage;

import org.obeonetwork.dsl.east_adl.verification_validation.impl.Verification_validationPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Functional_analysis_architecturePackageImpl extends EPackageImpl implements Functional_analysis_architecturePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalAnalysisArchitectureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analysisFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalDeviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass environmentFunctionEClass = null;

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
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.Functional_analysis_architecturePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Functional_analysis_architecturePackageImpl() {
		super(eNS_URI, Functional_analysis_architectureFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Functional_analysis_architecturePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Functional_analysis_architecturePackage init() {
		if (isInited) return (Functional_analysis_architecturePackage)EPackage.Registry.INSTANCE.getEPackage(Functional_analysis_architecturePackage.eNS_URI);

		// Obtain or create and register package
		Functional_analysis_architecturePackageImpl theFunctional_analysis_architecturePackage = (Functional_analysis_architecturePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Functional_analysis_architecturePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Functional_analysis_architecturePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		East_adlPackageImpl theEast_adlPackage = (East_adlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(East_adlPackage.eNS_URI) instanceof East_adlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(East_adlPackage.eNS_URI) : East_adlPackage.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		StructurePackageImpl theStructurePackage = (StructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI) instanceof StructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI) : StructurePackage.eINSTANCE);
		Vehicle_feature_modelPackageImpl theVehicle_feature_modelPackage = (Vehicle_feature_modelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Vehicle_feature_modelPackage.eNS_URI) instanceof Vehicle_feature_modelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Vehicle_feature_modelPackage.eNS_URI) : Vehicle_feature_modelPackage.eINSTANCE);
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
		Verification_validationPackageImpl theVerification_validationPackage = (Verification_validationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Verification_validationPackage.eNS_URI) instanceof Verification_validationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Verification_validationPackage.eNS_URI) : Verification_validationPackage.eINSTANCE);

		// Create package meta-data objects
		theFunctional_analysis_architecturePackage.createPackageContents();
		theEast_adlPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theStructurePackage.createPackageContents();
		theVehicle_feature_modelPackage.createPackageContents();
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
		theVerification_validationPackage.createPackageContents();

		// Initialize created meta-data
		theFunctional_analysis_architecturePackage.initializePackageContents();
		theEast_adlPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theStructurePackage.initializePackageContents();
		theVehicle_feature_modelPackage.initializePackageContents();
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
		theVerification_validationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFunctional_analysis_architecturePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Functional_analysis_architecturePackage.eNS_URI, theFunctional_analysis_architecturePackage);
		return theFunctional_analysis_architecturePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionalAnalysisArchitecture() {
		return functionalAnalysisArchitectureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalAnalysisArchitecture_AnalysisFunctions() {
		return (EReference)functionalAnalysisArchitectureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalAnalysisArchitecture_FunctionalDevices() {
		return (EReference)functionalAnalysisArchitectureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalAnalysisArchitecture_VehicleModel() {
		return (EReference)functionalAnalysisArchitectureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalAnalysisArchitecture_DesignArchitecture() {
		return (EReference)functionalAnalysisArchitectureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalAnalysisArchitecture_DesignDataTypes() {
		return (EReference)functionalAnalysisArchitectureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalAnalysisArchitecture_ConnectorSignals() {
		return (EReference)functionalAnalysisArchitectureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalAnalysisArchitecture_OperationCalls() {
		return (EReference)functionalAnalysisArchitectureEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalAnalysisArchitecture_TypeAssociations() {
		return (EReference)functionalAnalysisArchitectureEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalAnalysisArchitecture_ImplementationDataTypes() {
		return (EReference)functionalAnalysisArchitectureEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnalysisFunction() {
		return analysisFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalysisFunction_Parameters() {
		return (EReference)analysisFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalysisFunction_Ports() {
		return (EReference)analysisFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalysisFunction_SubFunctions() {
		return (EReference)analysisFunctionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalysisFunction_AnalysisBehavior() {
		return (EReference)analysisFunctionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalysisFunction_FunctionalDevices() {
		return (EReference)analysisFunctionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionalDevice() {
		return functionalDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalDevice_OwningArtifact() {
		return (EReference)functionalDeviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalDevice_Parameters() {
		return (EReference)functionalDeviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalDevice_Ports() {
		return (EReference)functionalDeviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalDevice_OwningFunction() {
		return (EReference)functionalDeviceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnvironmentFunction() {
		return environmentFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvironmentFunction_Actuators() {
		return (EReference)environmentFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvironmentFunction_Sensors() {
		return (EReference)environmentFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Functional_analysis_architectureFactory getFunctional_analysis_architectureFactory() {
		return (Functional_analysis_architectureFactory)getEFactoryInstance();
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
		functionalAnalysisArchitectureEClass = createEClass(FUNCTIONAL_ANALYSIS_ARCHITECTURE);
		createEReference(functionalAnalysisArchitectureEClass, FUNCTIONAL_ANALYSIS_ARCHITECTURE__ANALYSIS_FUNCTIONS);
		createEReference(functionalAnalysisArchitectureEClass, FUNCTIONAL_ANALYSIS_ARCHITECTURE__FUNCTIONAL_DEVICES);
		createEReference(functionalAnalysisArchitectureEClass, FUNCTIONAL_ANALYSIS_ARCHITECTURE__VEHICLE_MODEL);
		createEReference(functionalAnalysisArchitectureEClass, FUNCTIONAL_ANALYSIS_ARCHITECTURE__DESIGN_ARCHITECTURE);
		createEReference(functionalAnalysisArchitectureEClass, FUNCTIONAL_ANALYSIS_ARCHITECTURE__DESIGN_DATA_TYPES);
		createEReference(functionalAnalysisArchitectureEClass, FUNCTIONAL_ANALYSIS_ARCHITECTURE__CONNECTOR_SIGNALS);
		createEReference(functionalAnalysisArchitectureEClass, FUNCTIONAL_ANALYSIS_ARCHITECTURE__OPERATION_CALLS);
		createEReference(functionalAnalysisArchitectureEClass, FUNCTIONAL_ANALYSIS_ARCHITECTURE__TYPE_ASSOCIATIONS);
		createEReference(functionalAnalysisArchitectureEClass, FUNCTIONAL_ANALYSIS_ARCHITECTURE__IMPLEMENTATION_DATA_TYPES);

		analysisFunctionEClass = createEClass(ANALYSIS_FUNCTION);
		createEReference(analysisFunctionEClass, ANALYSIS_FUNCTION__PARAMETERS);
		createEReference(analysisFunctionEClass, ANALYSIS_FUNCTION__PORTS);
		createEReference(analysisFunctionEClass, ANALYSIS_FUNCTION__SUB_FUNCTIONS);
		createEReference(analysisFunctionEClass, ANALYSIS_FUNCTION__ANALYSIS_BEHAVIOR);
		createEReference(analysisFunctionEClass, ANALYSIS_FUNCTION__FUNCTIONAL_DEVICES);

		functionalDeviceEClass = createEClass(FUNCTIONAL_DEVICE);
		createEReference(functionalDeviceEClass, FUNCTIONAL_DEVICE__OWNING_ARTIFACT);
		createEReference(functionalDeviceEClass, FUNCTIONAL_DEVICE__PARAMETERS);
		createEReference(functionalDeviceEClass, FUNCTIONAL_DEVICE__PORTS);
		createEReference(functionalDeviceEClass, FUNCTIONAL_DEVICE__OWNING_FUNCTION);

		environmentFunctionEClass = createEClass(ENVIRONMENT_FUNCTION);
		createEReference(environmentFunctionEClass, ENVIRONMENT_FUNCTION__ACTUATORS);
		createEReference(environmentFunctionEClass, ENVIRONMENT_FUNCTION__SENSORS);
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
		Vehicle_feature_modelPackage theVehicle_feature_modelPackage = (Vehicle_feature_modelPackage)EPackage.Registry.INSTANCE.getEPackage(Vehicle_feature_modelPackage.eNS_URI);
		Functional_design_architecturePackage theFunctional_design_architecturePackage = (Functional_design_architecturePackage)EPackage.Registry.INSTANCE.getEPackage(Functional_design_architecturePackage.eNS_URI);
		CommonPackage theCommonPackage = (CommonPackage)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);
		Variant_handlingPackage theVariant_handlingPackage = (Variant_handlingPackage)EPackage.Registry.INSTANCE.getEPackage(Variant_handlingPackage.eNS_URI);
		Verification_validationPackage theVerification_validationPackage = (Verification_validationPackage)EPackage.Registry.INSTANCE.getEPackage(Verification_validationPackage.eNS_URI);
		BehaviorPackage theBehaviorPackage = (BehaviorPackage)EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI);
		Hardware_architecturePackage theHardware_architecturePackage = (Hardware_architecturePackage)EPackage.Registry.INSTANCE.getEPackage(Hardware_architecturePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		functionalAnalysisArchitectureEClass.getESuperTypes().add(theCorePackage.getEASTADLArtifact());
		analysisFunctionEClass.getESuperTypes().add(theCorePackage.getEASTADLEntity());
		analysisFunctionEClass.getESuperTypes().add(theVariant_handlingPackage.getVariantEntity());
		analysisFunctionEClass.getESuperTypes().add(theCommonPackage.getRealizedEntity());
		analysisFunctionEClass.getESuperTypes().add(theCommonPackage.getRealizingEntity());
		analysisFunctionEClass.getESuperTypes().add(theCommonPackage.getAllocatableEntity());
		analysisFunctionEClass.getESuperTypes().add(theVerification_validationPackage.getValidatedEntity());
		functionalDeviceEClass.getESuperTypes().add(theCorePackage.getEASTADLEntity());
		functionalDeviceEClass.getESuperTypes().add(theCommonPackage.getRealizedEntity());
		functionalDeviceEClass.getESuperTypes().add(theVerification_validationPackage.getValidatedEntity());
		environmentFunctionEClass.getESuperTypes().add(this.getAnalysisFunction());

		// Initialize classes and features; add operations and parameters
		initEClass(functionalAnalysisArchitectureEClass, FunctionalAnalysisArchitecture.class, "FunctionalAnalysisArchitecture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionalAnalysisArchitecture_AnalysisFunctions(), this.getAnalysisFunction(), null, "analysisFunctions", null, 0, -1, FunctionalAnalysisArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalAnalysisArchitecture_FunctionalDevices(), this.getFunctionalDevice(), this.getFunctionalDevice_OwningArtifact(), "functionalDevices", null, 0, -1, FunctionalAnalysisArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalAnalysisArchitecture_VehicleModel(), theVehicle_feature_modelPackage.getVehicleFeatureModel(), theVehicle_feature_modelPackage.getVehicleFeatureModel_AnalysisArchitecture(), "vehicleModel", null, 0, 1, FunctionalAnalysisArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalAnalysisArchitecture_DesignArchitecture(), theFunctional_design_architecturePackage.getFunctionalDesignArchitecture(), theFunctional_design_architecturePackage.getFunctionalDesignArchitecture_AnalysisArchitecture(), "designArchitecture", null, 0, 1, FunctionalAnalysisArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalAnalysisArchitecture_DesignDataTypes(), theCommonPackage.getDesignDataType(), null, "designDataTypes", null, 0, -1, FunctionalAnalysisArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalAnalysisArchitecture_ConnectorSignals(), theCommonPackage.getConnectorSignal(), null, "connectorSignals", null, 0, -1, FunctionalAnalysisArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalAnalysisArchitecture_OperationCalls(), theCommonPackage.getOperationCall(), null, "operationCalls", null, 0, -1, FunctionalAnalysisArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalAnalysisArchitecture_TypeAssociations(), theCommonPackage.getTypeAssociation(), null, "typeAssociations", null, 0, -1, FunctionalAnalysisArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalAnalysisArchitecture_ImplementationDataTypes(), theCommonPackage.getImplementationDataType(), null, "implementationDataTypes", null, 0, -1, FunctionalAnalysisArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(analysisFunctionEClass, AnalysisFunction.class, "AnalysisFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnalysisFunction_Parameters(), theCommonPackage.getParameter(), null, "parameters", null, 0, -1, AnalysisFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalysisFunction_Ports(), theCommonPackage.getFunctionPort(), null, "ports", null, 0, -1, AnalysisFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalysisFunction_SubFunctions(), this.getAnalysisFunction(), null, "subFunctions", null, 0, -1, AnalysisFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalysisFunction_AnalysisBehavior(), theBehaviorPackage.getBehavior(), null, "analysisBehavior", null, 0, 1, AnalysisFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalysisFunction_FunctionalDevices(), this.getFunctionalDevice(), this.getFunctionalDevice_OwningFunction(), "functionalDevices", null, 0, 1, AnalysisFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionalDeviceEClass, FunctionalDevice.class, "FunctionalDevice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionalDevice_OwningArtifact(), this.getFunctionalAnalysisArchitecture(), this.getFunctionalAnalysisArchitecture_FunctionalDevices(), "owningArtifact", null, 1, 1, FunctionalDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalDevice_Parameters(), theCommonPackage.getParameter(), null, "parameters", null, 0, -1, FunctionalDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalDevice_Ports(), theCommonPackage.getFunctionPort(), null, "ports", null, 0, -1, FunctionalDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalDevice_OwningFunction(), this.getAnalysisFunction(), this.getAnalysisFunction_FunctionalDevices(), "owningFunction", null, 0, 1, FunctionalDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(environmentFunctionEClass, EnvironmentFunction.class, "EnvironmentFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnvironmentFunction_Actuators(), theHardware_architecturePackage.getActuator(), theHardware_architecturePackage.getActuator_ActuatorModel(), "actuators", null, 0, -1, EnvironmentFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnvironmentFunction_Sensors(), theHardware_architecturePackage.getSensor(), theHardware_architecturePackage.getSensor_SensorModel(), "sensors", null, 0, -1, EnvironmentFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create annotations
		// http://www.topcased.org/documentation
		createDocumentationAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.topcased.org/documentation</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDocumentationAnnotations() {
		String source = "http://www.topcased.org/documentation";				
		addAnnotation
		  (functionalAnalysisArchitectureEClass, 
		   source, 
		   new String[] {
			 "documentation", "In the specification this is a top level analysis function. I\'m not ok with this and I consider this as a simple artifact. However, within this artifact you can create any top level function you want."
		   });						
		addAnnotation
		  (getFunctionalAnalysisArchitecture_DesignDataTypes(), 
		   source, 
		   new String[] {
			 "documentation", "These are all DDT used by entities of this artifact."
		   });																
	}

} //Functional_analysis_architecturePackageImpl
