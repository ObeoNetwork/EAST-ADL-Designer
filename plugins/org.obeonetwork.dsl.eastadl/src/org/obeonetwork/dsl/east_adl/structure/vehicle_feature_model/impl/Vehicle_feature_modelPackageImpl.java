/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl;

import org.eclipse.emf.ecore.EAttribute;
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

import org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.Functional_analysis_architecturePackage;

import org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl.Functional_analysis_architecturePackageImpl;

import org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Functional_design_architecturePackage;

import org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.Functional_design_architecturePackageImpl;

import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage;

import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.Hardware_architecturePackageImpl;

import org.obeonetwork.dsl.east_adl.structure.impl.StructurePackageImpl;

import org.obeonetwork.dsl.east_adl.structure.platform_model.Platform_modelPackage;

import org.obeonetwork.dsl.east_adl.structure.platform_model.impl.Platform_modelPackageImpl;

import org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.EFeature;
import org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.Inclusion;
import org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleFeatureModel;
import org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleParameter;
import org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleSet;
import org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.Vehicle_feature_modelFactory;
import org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.Vehicle_feature_modelPackage;

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
public class Vehicle_feature_modelPackageImpl extends EPackageImpl implements Vehicle_feature_modelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vehicleFeatureModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vehicleParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vehicleSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inclusionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eFeatureEClass = null;

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
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.Vehicle_feature_modelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Vehicle_feature_modelPackageImpl() {
		super(eNS_URI, Vehicle_feature_modelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Vehicle_feature_modelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Vehicle_feature_modelPackage init() {
		if (isInited) return (Vehicle_feature_modelPackage)EPackage.Registry.INSTANCE.getEPackage(Vehicle_feature_modelPackage.eNS_URI);

		// Obtain or create and register package
		Vehicle_feature_modelPackageImpl theVehicle_feature_modelPackage = (Vehicle_feature_modelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Vehicle_feature_modelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Vehicle_feature_modelPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		East_adlPackageImpl theEast_adlPackage = (East_adlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(East_adlPackage.eNS_URI) instanceof East_adlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(East_adlPackage.eNS_URI) : East_adlPackage.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		StructurePackageImpl theStructurePackage = (StructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI) instanceof StructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI) : StructurePackage.eINSTANCE);
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
		Verification_validationPackageImpl theVerification_validationPackage = (Verification_validationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Verification_validationPackage.eNS_URI) instanceof Verification_validationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Verification_validationPackage.eNS_URI) : Verification_validationPackage.eINSTANCE);

		// Create package meta-data objects
		theVehicle_feature_modelPackage.createPackageContents();
		theEast_adlPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theStructurePackage.createPackageContents();
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
		theVerification_validationPackage.createPackageContents();

		// Initialize created meta-data
		theVehicle_feature_modelPackage.initializePackageContents();
		theEast_adlPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theStructurePackage.initializePackageContents();
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
		theVerification_validationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVehicle_feature_modelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Vehicle_feature_modelPackage.eNS_URI, theVehicle_feature_modelPackage);
		return theVehicle_feature_modelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVehicleFeatureModel() {
		return vehicleFeatureModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVehicleFeatureModel_VehicleParameters() {
		return (EReference)vehicleFeatureModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVehicleFeatureModel_VehicleSets() {
		return (EReference)vehicleFeatureModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVehicleFeatureModel_AnalysisArchitecture() {
		return (EReference)vehicleFeatureModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVehicleFeatureModel_DesignArchitecture() {
		return (EReference)vehicleFeatureModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVehicleFeatureModel_ElectronicFeatures() {
		return (EReference)vehicleFeatureModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVehicleParameter() {
		return vehicleParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVehicleParameter_CustomerChoice() {
		return (EAttribute)vehicleParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVehicleParameter_Type() {
		return (EAttribute)vehicleParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVehicleParameter_OwningArtifact() {
		return (EReference)vehicleParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVehicleSet() {
		return vehicleSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVehicleSet_Inclusions() {
		return (EReference)vehicleSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVehicleSet_VehicleInclusionCriterion() {
		return (EAttribute)vehicleSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVehicleSet_OwningArtifact() {
		return (EReference)vehicleSetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVehicleSet_IncludedEFeatures() {
		return (EReference)vehicleSetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInclusion() {
		return inclusionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInclusion_ElectronicFeature() {
		return (EReference)inclusionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInclusion_VehicleSet() {
		return (EReference)inclusionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEFeature() {
		return eFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEFeature_Optional() {
		return (EAttribute)eFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEFeature_VisibleByCustomer() {
		return (EAttribute)eFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEFeature_PassiveSpecifications() {
		return (EReference)eFeatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEFeature_PassiveConstraints() {
		return (EReference)eFeatureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEFeature_SpecifyingFunctionalRequirements() {
		return (EReference)eFeatureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEFeature_ConstrainingDesignConstraints() {
		return (EReference)eFeatureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEFeature_Inclusions() {
		return (EReference)eFeatureEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEFeature_IncludingVehicleSets() {
		return (EReference)eFeatureEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEFeature_SubFeatures() {
		return (EReference)eFeatureEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEFeature_Description() {
		return (EAttribute)eFeatureEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vehicle_feature_modelFactory getVehicle_feature_modelFactory() {
		return (Vehicle_feature_modelFactory)getEFactoryInstance();
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
		vehicleFeatureModelEClass = createEClass(VEHICLE_FEATURE_MODEL);
		createEReference(vehicleFeatureModelEClass, VEHICLE_FEATURE_MODEL__VEHICLE_PARAMETERS);
		createEReference(vehicleFeatureModelEClass, VEHICLE_FEATURE_MODEL__VEHICLE_SETS);
		createEReference(vehicleFeatureModelEClass, VEHICLE_FEATURE_MODEL__ANALYSIS_ARCHITECTURE);
		createEReference(vehicleFeatureModelEClass, VEHICLE_FEATURE_MODEL__DESIGN_ARCHITECTURE);
		createEReference(vehicleFeatureModelEClass, VEHICLE_FEATURE_MODEL__ELECTRONIC_FEATURES);

		vehicleParameterEClass = createEClass(VEHICLE_PARAMETER);
		createEAttribute(vehicleParameterEClass, VEHICLE_PARAMETER__CUSTOMER_CHOICE);
		createEAttribute(vehicleParameterEClass, VEHICLE_PARAMETER__TYPE);
		createEReference(vehicleParameterEClass, VEHICLE_PARAMETER__OWNING_ARTIFACT);

		vehicleSetEClass = createEClass(VEHICLE_SET);
		createEReference(vehicleSetEClass, VEHICLE_SET__INCLUSIONS);
		createEAttribute(vehicleSetEClass, VEHICLE_SET__VEHICLE_INCLUSION_CRITERION);
		createEReference(vehicleSetEClass, VEHICLE_SET__OWNING_ARTIFACT);
		createEReference(vehicleSetEClass, VEHICLE_SET__INCLUDED_EFEATURES);

		inclusionEClass = createEClass(INCLUSION);
		createEReference(inclusionEClass, INCLUSION__ELECTRONIC_FEATURE);
		createEReference(inclusionEClass, INCLUSION__VEHICLE_SET);

		eFeatureEClass = createEClass(EFEATURE);
		createEAttribute(eFeatureEClass, EFEATURE__OPTIONAL);
		createEAttribute(eFeatureEClass, EFEATURE__VISIBLE_BY_CUSTOMER);
		createEReference(eFeatureEClass, EFEATURE__PASSIVE_SPECIFICATIONS);
		createEReference(eFeatureEClass, EFEATURE__PASSIVE_CONSTRAINTS);
		createEReference(eFeatureEClass, EFEATURE__SPECIFYING_FUNCTIONAL_REQUIREMENTS);
		createEReference(eFeatureEClass, EFEATURE__CONSTRAINING_DESIGN_CONSTRAINTS);
		createEReference(eFeatureEClass, EFEATURE__INCLUSIONS);
		createEReference(eFeatureEClass, EFEATURE__INCLUDING_VEHICLE_SETS);
		createEReference(eFeatureEClass, EFEATURE__SUB_FEATURES);
		createEAttribute(eFeatureEClass, EFEATURE__DESCRIPTION);
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
		Functional_analysis_architecturePackage theFunctional_analysis_architecturePackage = (Functional_analysis_architecturePackage)EPackage.Registry.INSTANCE.getEPackage(Functional_analysis_architecturePackage.eNS_URI);
		Functional_design_architecturePackage theFunctional_design_architecturePackage = (Functional_design_architecturePackage)EPackage.Registry.INSTANCE.getEPackage(Functional_design_architecturePackage.eNS_URI);
		CommonPackage theCommonPackage = (CommonPackage)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);
		SupportPackage theSupportPackage = (SupportPackage)EPackage.Registry.INSTANCE.getEPackage(SupportPackage.eNS_URI);
		Variant_handlingPackage theVariant_handlingPackage = (Variant_handlingPackage)EPackage.Registry.INSTANCE.getEPackage(Variant_handlingPackage.eNS_URI);
		Verification_validationPackage theVerification_validationPackage = (Verification_validationPackage)EPackage.Registry.INSTANCE.getEPackage(Verification_validationPackage.eNS_URI);
		RequirementsPackage theRequirementsPackage = (RequirementsPackage)EPackage.Registry.INSTANCE.getEPackage(RequirementsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		vehicleFeatureModelEClass.getESuperTypes().add(theCorePackage.getEASTADLArtifact());
		vehicleParameterEClass.getESuperTypes().add(theCorePackage.getEASTADLEntity());
		vehicleSetEClass.getESuperTypes().add(theCorePackage.getEASTADLEntity());
		inclusionEClass.getESuperTypes().add(theCorePackage.getEASTADLNamedElement());
		eFeatureEClass.getESuperTypes().add(theCorePackage.getEASTADLEntity());
		eFeatureEClass.getESuperTypes().add(theCommonPackage.getRealizedEntity());
		eFeatureEClass.getESuperTypes().add(theCommonPackage.getAllocatableEntity());
		eFeatureEClass.getESuperTypes().add(theSupportPackage.getArchivedEntity());
		eFeatureEClass.getESuperTypes().add(theVariant_handlingPackage.getVariantEntity());
		eFeatureEClass.getESuperTypes().add(theVerification_validationPackage.getValidatedEntity());

		// Initialize classes and features; add operations and parameters
		initEClass(vehicleFeatureModelEClass, VehicleFeatureModel.class, "VehicleFeatureModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVehicleFeatureModel_VehicleParameters(), this.getVehicleParameter(), this.getVehicleParameter_OwningArtifact(), "vehicleParameters", null, 0, -1, VehicleFeatureModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVehicleFeatureModel_VehicleSets(), this.getVehicleSet(), this.getVehicleSet_OwningArtifact(), "vehicleSets", null, 0, -1, VehicleFeatureModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVehicleFeatureModel_AnalysisArchitecture(), theFunctional_analysis_architecturePackage.getFunctionalAnalysisArchitecture(), theFunctional_analysis_architecturePackage.getFunctionalAnalysisArchitecture_VehicleModel(), "analysisArchitecture", null, 0, 1, VehicleFeatureModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVehicleFeatureModel_DesignArchitecture(), theFunctional_design_architecturePackage.getFunctionalDesignArchitecture(), theFunctional_design_architecturePackage.getFunctionalDesignArchitecture_VehicleModel(), "designArchitecture", null, 0, 1, VehicleFeatureModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVehicleFeatureModel_ElectronicFeatures(), this.getEFeature(), null, "electronicFeatures", null, 0, -1, VehicleFeatureModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vehicleParameterEClass, VehicleParameter.class, "VehicleParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVehicleParameter_CustomerChoice(), ecorePackage.getEBoolean(), "customerChoice", null, 0, 1, VehicleParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVehicleParameter_Type(), ecorePackage.getEString(), "type", null, 0, 1, VehicleParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVehicleParameter_OwningArtifact(), this.getVehicleFeatureModel(), this.getVehicleFeatureModel_VehicleParameters(), "owningArtifact", null, 1, 1, VehicleParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vehicleSetEClass, VehicleSet.class, "VehicleSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVehicleSet_Inclusions(), this.getInclusion(), this.getInclusion_VehicleSet(), "inclusions", null, 0, -1, VehicleSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVehicleSet_VehicleInclusionCriterion(), ecorePackage.getEString(), "vehicleInclusionCriterion", null, 0, 1, VehicleSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVehicleSet_OwningArtifact(), this.getVehicleFeatureModel(), this.getVehicleFeatureModel_VehicleSets(), "owningArtifact", null, 1, 1, VehicleSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVehicleSet_IncludedEFeatures(), this.getEFeature(), null, "includedEFeatures", null, 0, -1, VehicleSet.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(inclusionEClass, Inclusion.class, "Inclusion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInclusion_ElectronicFeature(), this.getEFeature(), this.getEFeature_Inclusions(), "electronicFeature", null, 0, 1, Inclusion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInclusion_VehicleSet(), this.getVehicleSet(), this.getVehicleSet_Inclusions(), "vehicleSet", null, 1, 1, Inclusion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eFeatureEClass, EFeature.class, "EFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEFeature_Optional(), ecorePackage.getEBoolean(), "optional", null, 0, 1, EFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEFeature_VisibleByCustomer(), ecorePackage.getEBoolean(), "visibleByCustomer", null, 0, 1, EFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEFeature_PassiveSpecifications(), theRequirementsPackage.getSpecification(), theRequirementsPackage.getSpecification_SpecifiedEntity(), "passiveSpecifications", null, 0, -1, EFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEFeature_PassiveConstraints(), theRequirementsPackage.getConstraint(), theRequirementsPackage.getConstraint_ConstrainedEntity(), "passiveConstraints", null, 0, -1, EFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEFeature_SpecifyingFunctionalRequirements(), theRequirementsPackage.getFunctionalRequirement(), null, "specifyingFunctionalRequirements", null, 0, -1, EFeature.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEFeature_ConstrainingDesignConstraints(), theRequirementsPackage.getDesignConstraint(), null, "constrainingDesignConstraints", null, 0, -1, EFeature.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEFeature_Inclusions(), this.getInclusion(), this.getInclusion_ElectronicFeature(), "inclusions", null, 0, -1, EFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEFeature_IncludingVehicleSets(), this.getVehicleSet(), null, "includingVehicleSets", null, 0, -1, EFeature.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEFeature_SubFeatures(), this.getEFeature(), null, "subFeatures", null, 0, -1, EFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEFeature_Description(), ecorePackage.getEString(), "description", null, 0, 1, EFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (vehicleParameterEClass, 
		   source, 
		   new String[] {
			 "documentation", "See vehicle inclusion criterion command."
		   });						
		addAnnotation
		  (vehicleSetEClass, 
		   source, 
		   new String[] {
			 "documentation", "This entity may have derived properties that are deleted from graphical view for readability purposes."
		   });				
		addAnnotation
		  (getVehicleSet_VehicleInclusionCriterion(), 
		   source, 
		   new String[] {
			 "documentation", "I would not choose this solution to the problem."
		   });							
		addAnnotation
		  (eFeatureEClass, 
		   source, 
		   new String[] {
			 "documentation", "This entity may have derived properties that are deleted from graphical view for readability purposes."
		   });									
	}

} //Vehicle_feature_modelPackageImpl
