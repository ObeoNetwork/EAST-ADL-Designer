/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl;

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

import org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.CompositeSoftwareFunction;
import org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction;
import org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.FunctionalDesignArchitecture;
import org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Functional_design_architectureFactory;
import org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Functional_design_architecturePackage;
import org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.LocalDeviceManager;
import org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Precedence;

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
public class Functional_design_architecturePackageImpl extends EPackageImpl implements Functional_design_architecturePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalDesignArchitectureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementarySoftwareFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeSoftwareFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localDeviceManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass precedenceEClass = null;

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
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Functional_design_architecturePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Functional_design_architecturePackageImpl() {
		super(eNS_URI, Functional_design_architectureFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Functional_design_architecturePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Functional_design_architecturePackage init() {
		if (isInited) return (Functional_design_architecturePackage)EPackage.Registry.INSTANCE.getEPackage(Functional_design_architecturePackage.eNS_URI);

		// Obtain or create and register package
		Functional_design_architecturePackageImpl theFunctional_design_architecturePackage = (Functional_design_architecturePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Functional_design_architecturePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Functional_design_architecturePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		East_adlPackageImpl theEast_adlPackage = (East_adlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(East_adlPackage.eNS_URI) instanceof East_adlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(East_adlPackage.eNS_URI) : East_adlPackage.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		StructurePackageImpl theStructurePackage = (StructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI) instanceof StructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI) : StructurePackage.eINSTANCE);
		Vehicle_feature_modelPackageImpl theVehicle_feature_modelPackage = (Vehicle_feature_modelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Vehicle_feature_modelPackage.eNS_URI) instanceof Vehicle_feature_modelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Vehicle_feature_modelPackage.eNS_URI) : Vehicle_feature_modelPackage.eINSTANCE);
		Functional_analysis_architecturePackageImpl theFunctional_analysis_architecturePackage = (Functional_analysis_architecturePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Functional_analysis_architecturePackage.eNS_URI) instanceof Functional_analysis_architecturePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Functional_analysis_architecturePackage.eNS_URI) : Functional_analysis_architecturePackage.eINSTANCE);
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
		theFunctional_design_architecturePackage.createPackageContents();
		theEast_adlPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theStructurePackage.createPackageContents();
		theVehicle_feature_modelPackage.createPackageContents();
		theFunctional_analysis_architecturePackage.createPackageContents();
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
		theFunctional_design_architecturePackage.initializePackageContents();
		theEast_adlPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theStructurePackage.initializePackageContents();
		theVehicle_feature_modelPackage.initializePackageContents();
		theFunctional_analysis_architecturePackage.initializePackageContents();
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
		theFunctional_design_architecturePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Functional_design_architecturePackage.eNS_URI, theFunctional_design_architecturePackage);
		return theFunctional_design_architecturePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionalDesignArchitecture() {
		return functionalDesignArchitectureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalDesignArchitecture_ElementarySoftwareFunctions() {
		return (EReference)functionalDesignArchitectureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalDesignArchitecture_CompositeSoftwareFunctions() {
		return (EReference)functionalDesignArchitectureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalDesignArchitecture_AnalysisArchitecture() {
		return (EReference)functionalDesignArchitectureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalDesignArchitecture_VehicleModel() {
		return (EReference)functionalDesignArchitectureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalDesignArchitecture_InstanceModel() {
		return (EReference)functionalDesignArchitectureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalDesignArchitecture_TypeAssociations() {
		return (EReference)functionalDesignArchitectureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalDesignArchitecture_ImplementationDataTypes() {
		return (EReference)functionalDesignArchitectureEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalDesignArchitecture_DesignDataTypes() {
		return (EReference)functionalDesignArchitectureEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalDesignArchitecture_ConnectorSignals() {
		return (EReference)functionalDesignArchitectureEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalDesignArchitecture_OperationCalls() {
		return (EReference)functionalDesignArchitectureEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalDesignArchitecture_HardwareArchitecture() {
		return (EReference)functionalDesignArchitectureEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementarySoftwareFunction() {
		return elementarySoftwareFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementarySoftwareFunction_Ports() {
		return (EReference)elementarySoftwareFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementarySoftwareFunction_Parameters() {
		return (EReference)elementarySoftwareFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementarySoftwareFunction_Instances() {
		return (EReference)elementarySoftwareFunctionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementarySoftwareFunction_TriggerType() {
		return (EAttribute)elementarySoftwareFunctionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementarySoftwareFunction_TriggerEvent() {
		return (EAttribute)elementarySoftwareFunctionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementarySoftwareFunction_TriggerCondition() {
		return (EAttribute)elementarySoftwareFunctionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementarySoftwareFunction_Period() {
		return (EReference)elementarySoftwareFunctionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementarySoftwareFunction_Offset() {
		return (EReference)elementarySoftwareFunctionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementarySoftwareFunction_ExecutionTime() {
		return (EReference)elementarySoftwareFunctionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementarySoftwareFunction_SpecifationBehavior() {
		return (EReference)elementarySoftwareFunctionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementarySoftwareFunction_ImplementationBehavior() {
		return (EReference)elementarySoftwareFunctionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementarySoftwareFunction_ActivePrecedencies() {
		return (EReference)elementarySoftwareFunctionEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementarySoftwareFunction_PassivePrecedencies() {
		return (EReference)elementarySoftwareFunctionEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementarySoftwareFunction_Predecessors() {
		return (EReference)elementarySoftwareFunctionEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementarySoftwareFunction_Successors() {
		return (EReference)elementarySoftwareFunctionEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeSoftwareFunction() {
		return compositeSoftwareFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeSoftwareFunction_ElementarySoftwareFunctions() {
		return (EReference)compositeSoftwareFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeSoftwareFunction_CompositeSoftwareFunctions() {
		return (EReference)compositeSoftwareFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeSoftwareFunction_Ports() {
		return (EReference)compositeSoftwareFunctionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeSoftwareFunction_Parameters() {
		return (EReference)compositeSoftwareFunctionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalDeviceManager() {
		return localDeviceManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrecedence() {
		return precedenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrecedence_Predecessor() {
		return (EReference)precedenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrecedence_Successor() {
		return (EReference)precedenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Functional_design_architectureFactory getFunctional_design_architectureFactory() {
		return (Functional_design_architectureFactory)getEFactoryInstance();
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
		functionalDesignArchitectureEClass = createEClass(FUNCTIONAL_DESIGN_ARCHITECTURE);
		createEReference(functionalDesignArchitectureEClass, FUNCTIONAL_DESIGN_ARCHITECTURE__ELEMENTARY_SOFTWARE_FUNCTIONS);
		createEReference(functionalDesignArchitectureEClass, FUNCTIONAL_DESIGN_ARCHITECTURE__COMPOSITE_SOFTWARE_FUNCTIONS);
		createEReference(functionalDesignArchitectureEClass, FUNCTIONAL_DESIGN_ARCHITECTURE__ANALYSIS_ARCHITECTURE);
		createEReference(functionalDesignArchitectureEClass, FUNCTIONAL_DESIGN_ARCHITECTURE__VEHICLE_MODEL);
		createEReference(functionalDesignArchitectureEClass, FUNCTIONAL_DESIGN_ARCHITECTURE__INSTANCE_MODEL);
		createEReference(functionalDesignArchitectureEClass, FUNCTIONAL_DESIGN_ARCHITECTURE__TYPE_ASSOCIATIONS);
		createEReference(functionalDesignArchitectureEClass, FUNCTIONAL_DESIGN_ARCHITECTURE__IMPLEMENTATION_DATA_TYPES);
		createEReference(functionalDesignArchitectureEClass, FUNCTIONAL_DESIGN_ARCHITECTURE__DESIGN_DATA_TYPES);
		createEReference(functionalDesignArchitectureEClass, FUNCTIONAL_DESIGN_ARCHITECTURE__CONNECTOR_SIGNALS);
		createEReference(functionalDesignArchitectureEClass, FUNCTIONAL_DESIGN_ARCHITECTURE__OPERATION_CALLS);
		createEReference(functionalDesignArchitectureEClass, FUNCTIONAL_DESIGN_ARCHITECTURE__HARDWARE_ARCHITECTURE);

		elementarySoftwareFunctionEClass = createEClass(ELEMENTARY_SOFTWARE_FUNCTION);
		createEReference(elementarySoftwareFunctionEClass, ELEMENTARY_SOFTWARE_FUNCTION__PORTS);
		createEReference(elementarySoftwareFunctionEClass, ELEMENTARY_SOFTWARE_FUNCTION__PARAMETERS);
		createEReference(elementarySoftwareFunctionEClass, ELEMENTARY_SOFTWARE_FUNCTION__INSTANCES);
		createEAttribute(elementarySoftwareFunctionEClass, ELEMENTARY_SOFTWARE_FUNCTION__TRIGGER_TYPE);
		createEAttribute(elementarySoftwareFunctionEClass, ELEMENTARY_SOFTWARE_FUNCTION__TRIGGER_EVENT);
		createEAttribute(elementarySoftwareFunctionEClass, ELEMENTARY_SOFTWARE_FUNCTION__TRIGGER_CONDITION);
		createEReference(elementarySoftwareFunctionEClass, ELEMENTARY_SOFTWARE_FUNCTION__PERIOD);
		createEReference(elementarySoftwareFunctionEClass, ELEMENTARY_SOFTWARE_FUNCTION__OFFSET);
		createEReference(elementarySoftwareFunctionEClass, ELEMENTARY_SOFTWARE_FUNCTION__EXECUTION_TIME);
		createEReference(elementarySoftwareFunctionEClass, ELEMENTARY_SOFTWARE_FUNCTION__SPECIFATION_BEHAVIOR);
		createEReference(elementarySoftwareFunctionEClass, ELEMENTARY_SOFTWARE_FUNCTION__IMPLEMENTATION_BEHAVIOR);
		createEReference(elementarySoftwareFunctionEClass, ELEMENTARY_SOFTWARE_FUNCTION__ACTIVE_PRECEDENCIES);
		createEReference(elementarySoftwareFunctionEClass, ELEMENTARY_SOFTWARE_FUNCTION__PASSIVE_PRECEDENCIES);
		createEReference(elementarySoftwareFunctionEClass, ELEMENTARY_SOFTWARE_FUNCTION__PREDECESSORS);
		createEReference(elementarySoftwareFunctionEClass, ELEMENTARY_SOFTWARE_FUNCTION__SUCCESSORS);

		compositeSoftwareFunctionEClass = createEClass(COMPOSITE_SOFTWARE_FUNCTION);
		createEReference(compositeSoftwareFunctionEClass, COMPOSITE_SOFTWARE_FUNCTION__ELEMENTARY_SOFTWARE_FUNCTIONS);
		createEReference(compositeSoftwareFunctionEClass, COMPOSITE_SOFTWARE_FUNCTION__COMPOSITE_SOFTWARE_FUNCTIONS);
		createEReference(compositeSoftwareFunctionEClass, COMPOSITE_SOFTWARE_FUNCTION__PORTS);
		createEReference(compositeSoftwareFunctionEClass, COMPOSITE_SOFTWARE_FUNCTION__PARAMETERS);

		localDeviceManagerEClass = createEClass(LOCAL_DEVICE_MANAGER);

		precedenceEClass = createEClass(PRECEDENCE);
		createEReference(precedenceEClass, PRECEDENCE__PREDECESSOR);
		createEReference(precedenceEClass, PRECEDENCE__SUCCESSOR);
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
		Vehicle_feature_modelPackage theVehicle_feature_modelPackage = (Vehicle_feature_modelPackage)EPackage.Registry.INSTANCE.getEPackage(Vehicle_feature_modelPackage.eNS_URI);
		Function_instance_modelPackage theFunction_instance_modelPackage = (Function_instance_modelPackage)EPackage.Registry.INSTANCE.getEPackage(Function_instance_modelPackage.eNS_URI);
		CommonPackage theCommonPackage = (CommonPackage)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);
		Hardware_architecturePackage theHardware_architecturePackage = (Hardware_architecturePackage)EPackage.Registry.INSTANCE.getEPackage(Hardware_architecturePackage.eNS_URI);
		Variant_handlingPackage theVariant_handlingPackage = (Variant_handlingPackage)EPackage.Registry.INSTANCE.getEPackage(Variant_handlingPackage.eNS_URI);
		Verification_validationPackage theVerification_validationPackage = (Verification_validationPackage)EPackage.Registry.INSTANCE.getEPackage(Verification_validationPackage.eNS_URI);
		RequirementsPackage theRequirementsPackage = (RequirementsPackage)EPackage.Registry.INSTANCE.getEPackage(RequirementsPackage.eNS_URI);
		BehaviorPackage theBehaviorPackage = (BehaviorPackage)EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		functionalDesignArchitectureEClass.getESuperTypes().add(theCorePackage.getEASTADLArtifact());
		elementarySoftwareFunctionEClass.getESuperTypes().add(theCorePackage.getEASTADLEntity());
		elementarySoftwareFunctionEClass.getESuperTypes().add(theCommonPackage.getRealizingEntity());
		elementarySoftwareFunctionEClass.getESuperTypes().add(theVariant_handlingPackage.getVariantEntity());
		elementarySoftwareFunctionEClass.getESuperTypes().add(theVerification_validationPackage.getValidatedEntity());
		compositeSoftwareFunctionEClass.getESuperTypes().add(theCorePackage.getEASTADLEntity());
		compositeSoftwareFunctionEClass.getESuperTypes().add(theCommonPackage.getAllocatableEntity());
		compositeSoftwareFunctionEClass.getESuperTypes().add(theCommonPackage.getRealizingEntity());
		compositeSoftwareFunctionEClass.getESuperTypes().add(theVariant_handlingPackage.getVariantEntity());
		compositeSoftwareFunctionEClass.getESuperTypes().add(theVerification_validationPackage.getValidatedEntity());
		localDeviceManagerEClass.getESuperTypes().add(this.getElementarySoftwareFunction());
		precedenceEClass.getESuperTypes().add(theCorePackage.getEASTADLNamedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(functionalDesignArchitectureEClass, FunctionalDesignArchitecture.class, "FunctionalDesignArchitecture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionalDesignArchitecture_ElementarySoftwareFunctions(), this.getElementarySoftwareFunction(), null, "elementarySoftwareFunctions", null, 0, -1, FunctionalDesignArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalDesignArchitecture_CompositeSoftwareFunctions(), this.getCompositeSoftwareFunction(), null, "compositeSoftwareFunctions", null, 0, -1, FunctionalDesignArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalDesignArchitecture_AnalysisArchitecture(), theFunctional_analysis_architecturePackage.getFunctionalAnalysisArchitecture(), theFunctional_analysis_architecturePackage.getFunctionalAnalysisArchitecture_DesignArchitecture(), "analysisArchitecture", null, 0, 1, FunctionalDesignArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalDesignArchitecture_VehicleModel(), theVehicle_feature_modelPackage.getVehicleFeatureModel(), theVehicle_feature_modelPackage.getVehicleFeatureModel_DesignArchitecture(), "vehicleModel", null, 0, 1, FunctionalDesignArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalDesignArchitecture_InstanceModel(), theFunction_instance_modelPackage.getFunctionInstanceModel(), theFunction_instance_modelPackage.getFunctionInstanceModel_DesignArchitecture(), "instanceModel", null, 0, 1, FunctionalDesignArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalDesignArchitecture_TypeAssociations(), theCommonPackage.getTypeAssociation(), null, "typeAssociations", null, 0, -1, FunctionalDesignArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalDesignArchitecture_ImplementationDataTypes(), theCommonPackage.getImplementationDataType(), null, "implementationDataTypes", null, 0, -1, FunctionalDesignArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalDesignArchitecture_DesignDataTypes(), theCommonPackage.getDesignDataType(), null, "designDataTypes", null, 0, -1, FunctionalDesignArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalDesignArchitecture_ConnectorSignals(), theCommonPackage.getConnectorSignal(), null, "connectorSignals", null, 0, -1, FunctionalDesignArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalDesignArchitecture_OperationCalls(), theCommonPackage.getOperationCall(), null, "operationCalls", null, 0, -1, FunctionalDesignArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalDesignArchitecture_HardwareArchitecture(), theHardware_architecturePackage.getHardwareArchitecture(), theHardware_architecturePackage.getHardwareArchitecture_DesignArchitecture(), "hardwareArchitecture", null, 0, 1, FunctionalDesignArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementarySoftwareFunctionEClass, ElementarySoftwareFunction.class, "ElementarySoftwareFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElementarySoftwareFunction_Ports(), theCommonPackage.getFunctionPort(), null, "ports", null, 0, -1, ElementarySoftwareFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementarySoftwareFunction_Parameters(), theCommonPackage.getParameter(), null, "parameters", null, 0, -1, ElementarySoftwareFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementarySoftwareFunction_Instances(), theFunction_instance_modelPackage.getFunctionInstance(), theFunction_instance_modelPackage.getFunctionInstance_InstantiatedFunction(), "instances", null, 0, -1, ElementarySoftwareFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementarySoftwareFunction_TriggerType(), theCommonPackage.getTriggerKind(), "triggerType", null, 0, 1, ElementarySoftwareFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementarySoftwareFunction_TriggerEvent(), ecorePackage.getEString(), "triggerEvent", null, 0, 1, ElementarySoftwareFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementarySoftwareFunction_TriggerCondition(), ecorePackage.getEString(), "triggerCondition", null, 0, 1, ElementarySoftwareFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementarySoftwareFunction_Period(), theRequirementsPackage.getTimingRestriction(), null, "period", null, 1, 1, ElementarySoftwareFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementarySoftwareFunction_Offset(), theRequirementsPackage.getTimingRestriction(), null, "offset", null, 1, 1, ElementarySoftwareFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementarySoftwareFunction_ExecutionTime(), theRequirementsPackage.getTimingRestriction(), null, "executionTime", null, 1, 1, ElementarySoftwareFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementarySoftwareFunction_SpecifationBehavior(), theBehaviorPackage.getBehavior(), null, "specifationBehavior", null, 0, 1, ElementarySoftwareFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementarySoftwareFunction_ImplementationBehavior(), theBehaviorPackage.getBehavior(), null, "implementationBehavior", null, 0, 1, ElementarySoftwareFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementarySoftwareFunction_ActivePrecedencies(), this.getPrecedence(), this.getPrecedence_Predecessor(), "activePrecedencies", null, 0, -1, ElementarySoftwareFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementarySoftwareFunction_PassivePrecedencies(), this.getPrecedence(), this.getPrecedence_Successor(), "passivePrecedencies", null, 0, -1, ElementarySoftwareFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementarySoftwareFunction_Predecessors(), this.getElementarySoftwareFunction(), null, "predecessors", null, 0, -1, ElementarySoftwareFunction.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getElementarySoftwareFunction_Successors(), this.getElementarySoftwareFunction(), null, "successors", null, 0, -1, ElementarySoftwareFunction.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(compositeSoftwareFunctionEClass, CompositeSoftwareFunction.class, "CompositeSoftwareFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeSoftwareFunction_ElementarySoftwareFunctions(), this.getElementarySoftwareFunction(), null, "elementarySoftwareFunctions", null, 0, -1, CompositeSoftwareFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompositeSoftwareFunction_CompositeSoftwareFunctions(), this.getCompositeSoftwareFunction(), null, "compositeSoftwareFunctions", null, 0, -1, CompositeSoftwareFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompositeSoftwareFunction_Ports(), theCommonPackage.getFunctionPort(), null, "ports", null, 0, -1, CompositeSoftwareFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompositeSoftwareFunction_Parameters(), theCommonPackage.getParameter(), null, "parameters", null, 0, -1, CompositeSoftwareFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(localDeviceManagerEClass, LocalDeviceManager.class, "LocalDeviceManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(precedenceEClass, Precedence.class, "Precedence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrecedence_Predecessor(), this.getElementarySoftwareFunction(), this.getElementarySoftwareFunction_ActivePrecedencies(), "predecessor", null, 1, 1, Precedence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrecedence_Successor(), this.getElementarySoftwareFunction(), this.getElementarySoftwareFunction_PassivePrecedencies(), "successor", null, 0, 1, Precedence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //Functional_design_architecturePackageImpl
