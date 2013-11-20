/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.platform_model.impl;

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

import org.obeonetwork.dsl.east_adl.structure.platform_model.DeviceDriver;
import org.obeonetwork.dsl.east_adl.structure.platform_model.ExecutionModelKind;
import org.obeonetwork.dsl.east_adl.structure.platform_model.Framework;
import org.obeonetwork.dsl.east_adl.structure.platform_model.HardwareAbstractionFunction;
import org.obeonetwork.dsl.east_adl.structure.platform_model.IODriver;
import org.obeonetwork.dsl.east_adl.structure.platform_model.IPCExchanger;
import org.obeonetwork.dsl.east_adl.structure.platform_model.MWCompositeSoftwareFunction;
import org.obeonetwork.dsl.east_adl.structure.platform_model.MWElementarySoftwareFunction;
import org.obeonetwork.dsl.east_adl.structure.platform_model.MWLocalPort;
import org.obeonetwork.dsl.east_adl.structure.platform_model.MWRemotePort;
import org.obeonetwork.dsl.east_adl.structure.platform_model.OperatingSystem;
import org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel;
import org.obeonetwork.dsl.east_adl.structure.platform_model.Platform_modelFactory;
import org.obeonetwork.dsl.east_adl.structure.platform_model.Platform_modelPackage;
import org.obeonetwork.dsl.east_adl.structure.platform_model.SystemPort;

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
public class Platform_modelPackageImpl extends EPackageImpl implements Platform_modelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass platformModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceDriverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ioDriverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwareAbstractionFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operatingSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass frameworkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mwCompositeSoftwareFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mwElementarySoftwareFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mwLocalPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mwRemotePortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ipcExchangerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum executionModelKindEEnum = null;

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
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.Platform_modelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Platform_modelPackageImpl() {
		super(eNS_URI, Platform_modelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Platform_modelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Platform_modelPackage init() {
		if (isInited) return (Platform_modelPackage)EPackage.Registry.INSTANCE.getEPackage(Platform_modelPackage.eNS_URI);

		// Obtain or create and register package
		Platform_modelPackageImpl thePlatform_modelPackage = (Platform_modelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Platform_modelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Platform_modelPackageImpl());

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
		Allocation_modelPackageImpl theAllocation_modelPackage = (Allocation_modelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Allocation_modelPackage.eNS_URI) instanceof Allocation_modelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Allocation_modelPackage.eNS_URI) : Allocation_modelPackage.eINSTANCE);
		CommonPackageImpl theCommonPackage = (CommonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) : CommonPackage.eINSTANCE);
		RequirementsPackageImpl theRequirementsPackage = (RequirementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RequirementsPackage.eNS_URI) instanceof RequirementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RequirementsPackage.eNS_URI) : RequirementsPackage.eINSTANCE);
		Variant_handlingPackageImpl theVariant_handlingPackage = (Variant_handlingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Variant_handlingPackage.eNS_URI) instanceof Variant_handlingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Variant_handlingPackage.eNS_URI) : Variant_handlingPackage.eINSTANCE);
		SupportPackageImpl theSupportPackage = (SupportPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SupportPackage.eNS_URI) instanceof SupportPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SupportPackage.eNS_URI) : SupportPackage.eINSTANCE);
		BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) : BehaviorPackage.eINSTANCE);
		Verification_validationPackageImpl theVerification_validationPackage = (Verification_validationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Verification_validationPackage.eNS_URI) instanceof Verification_validationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Verification_validationPackage.eNS_URI) : Verification_validationPackage.eINSTANCE);

		// Create package meta-data objects
		thePlatform_modelPackage.createPackageContents();
		theEast_adlPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theStructurePackage.createPackageContents();
		theVehicle_feature_modelPackage.createPackageContents();
		theFunctional_analysis_architecturePackage.createPackageContents();
		theFunctional_design_architecturePackage.createPackageContents();
		theFunction_instance_modelPackage.createPackageContents();
		theHardware_architecturePackage.createPackageContents();
		theAllocation_modelPackage.createPackageContents();
		theCommonPackage.createPackageContents();
		theRequirementsPackage.createPackageContents();
		theVariant_handlingPackage.createPackageContents();
		theSupportPackage.createPackageContents();
		theBehaviorPackage.createPackageContents();
		theVerification_validationPackage.createPackageContents();

		// Initialize created meta-data
		thePlatform_modelPackage.initializePackageContents();
		theEast_adlPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theStructurePackage.initializePackageContents();
		theVehicle_feature_modelPackage.initializePackageContents();
		theFunctional_analysis_architecturePackage.initializePackageContents();
		theFunctional_design_architecturePackage.initializePackageContents();
		theFunction_instance_modelPackage.initializePackageContents();
		theHardware_architecturePackage.initializePackageContents();
		theAllocation_modelPackage.initializePackageContents();
		theCommonPackage.initializePackageContents();
		theRequirementsPackage.initializePackageContents();
		theVariant_handlingPackage.initializePackageContents();
		theSupportPackage.initializePackageContents();
		theBehaviorPackage.initializePackageContents();
		theVerification_validationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePlatform_modelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Platform_modelPackage.eNS_URI, thePlatform_modelPackage);
		return thePlatform_modelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlatformModel() {
		return platformModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlatformModel_AllocationModel() {
		return (EReference)platformModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlatformModel_HardwareArchitecture() {
		return (EReference)platformModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlatformModel_DeviceDrivers() {
		return (EReference)platformModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlatformModel_IODrivers() {
		return (EReference)platformModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlatformModel_AbstractFunctions() {
		return (EReference)platformModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlatformModel_Frameworks() {
		return (EReference)platformModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlatformModel_OperatingSystems() {
		return (EReference)platformModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlatformModel_CompositeSoftwareFunctions() {
		return (EReference)platformModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlatformModel_ElementarySoftwareFunctions() {
		return (EReference)platformModelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlatformModel_IPCExchangers() {
		return (EReference)platformModelEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlatformModel_DesignDataTypes() {
		return (EReference)platformModelEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlatformModel_ImplementationDataTypes() {
		return (EReference)platformModelEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlatformModel_TypeAssociations() {
		return (EReference)platformModelEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlatformModel_ConnectorSignals() {
		return (EReference)platformModelEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlatformModel_OperationCalls() {
		return (EReference)platformModelEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceDriver() {
		return deviceDriverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceDriver_ConfigurationData() {
		return (EAttribute)deviceDriverEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceDriver_OwningArtifact() {
		return (EReference)deviceDriverEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceDriver_Processor() {
		return (EReference)deviceDriverEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceDriver_Peripheral() {
		return (EReference)deviceDriverEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIODriver() {
		return ioDriverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIODriver_ConfigurationData() {
		return (EAttribute)ioDriverEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIODriver_OwningArtifact() {
		return (EReference)ioDriverEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIODriver_Abstraction() {
		return (EReference)ioDriverEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIODriver_Processor() {
		return (EReference)ioDriverEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIODriver_Peripheral() {
		return (EReference)ioDriverEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwareAbstractionFunction() {
		return hardwareAbstractionFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardwareAbstractionFunction_OwningArtifact() {
		return (EReference)hardwareAbstractionFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardwareAbstractionFunction_Driver() {
		return (EReference)hardwareAbstractionFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardwareAbstractionFunction_ProvidedPort() {
		return (EReference)hardwareAbstractionFunctionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardwareAbstractionFunction_RequiredPort() {
		return (EReference)hardwareAbstractionFunctionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardwareAbstractionFunction_AccessiblePins() {
		return (EReference)hardwareAbstractionFunctionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardwareAbstractionFunction_Processor() {
		return (EReference)hardwareAbstractionFunctionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperatingSystem() {
		return operatingSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperatingSystem_Type() {
		return (EAttribute)operatingSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperatingSystem_ExecutionModelType() {
		return (EAttribute)operatingSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperatingSystem_BlockingFactor() {
		return (EReference)operatingSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperatingSystem_TaskSwitchTime() {
		return (EReference)operatingSystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperatingSystem_OwningArtifact() {
		return (EReference)operatingSystemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperatingSystem_Processor() {
		return (EReference)operatingSystemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFramework() {
		return frameworkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFramework_ConfigurationData() {
		return (EAttribute)frameworkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFramework_OwningArtifact() {
		return (EReference)frameworkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFramework_Processor() {
		return (EReference)frameworkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMWCompositeSoftwareFunction() {
		return mwCompositeSoftwareFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMWElementarySoftwareFunction() {
		return mwElementarySoftwareFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemPort() {
		return systemPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMWLocalPort() {
		return mwLocalPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMWRemotePort() {
		return mwRemotePortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIPCExchanger() {
		return ipcExchangerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIPCExchanger_Source() {
		return (EReference)ipcExchangerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIPCExchanger_Destination() {
		return (EReference)ipcExchangerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIPCExchanger_OwningArtifact() {
		return (EReference)ipcExchangerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getExecutionModelKind() {
		return executionModelKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Platform_modelFactory getPlatform_modelFactory() {
		return (Platform_modelFactory)getEFactoryInstance();
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
		platformModelEClass = createEClass(PLATFORM_MODEL);
		createEReference(platformModelEClass, PLATFORM_MODEL__ALLOCATION_MODEL);
		createEReference(platformModelEClass, PLATFORM_MODEL__HARDWARE_ARCHITECTURE);
		createEReference(platformModelEClass, PLATFORM_MODEL__DEVICE_DRIVERS);
		createEReference(platformModelEClass, PLATFORM_MODEL__IO_DRIVERS);
		createEReference(platformModelEClass, PLATFORM_MODEL__ABSTRACT_FUNCTIONS);
		createEReference(platformModelEClass, PLATFORM_MODEL__FRAMEWORKS);
		createEReference(platformModelEClass, PLATFORM_MODEL__OPERATING_SYSTEMS);
		createEReference(platformModelEClass, PLATFORM_MODEL__COMPOSITE_SOFTWARE_FUNCTIONS);
		createEReference(platformModelEClass, PLATFORM_MODEL__ELEMENTARY_SOFTWARE_FUNCTIONS);
		createEReference(platformModelEClass, PLATFORM_MODEL__IPC_EXCHANGERS);
		createEReference(platformModelEClass, PLATFORM_MODEL__DESIGN_DATA_TYPES);
		createEReference(platformModelEClass, PLATFORM_MODEL__IMPLEMENTATION_DATA_TYPES);
		createEReference(platformModelEClass, PLATFORM_MODEL__TYPE_ASSOCIATIONS);
		createEReference(platformModelEClass, PLATFORM_MODEL__CONNECTOR_SIGNALS);
		createEReference(platformModelEClass, PLATFORM_MODEL__OPERATION_CALLS);

		deviceDriverEClass = createEClass(DEVICE_DRIVER);
		createEAttribute(deviceDriverEClass, DEVICE_DRIVER__CONFIGURATION_DATA);
		createEReference(deviceDriverEClass, DEVICE_DRIVER__OWNING_ARTIFACT);
		createEReference(deviceDriverEClass, DEVICE_DRIVER__PROCESSOR);
		createEReference(deviceDriverEClass, DEVICE_DRIVER__PERIPHERAL);

		ioDriverEClass = createEClass(IO_DRIVER);
		createEAttribute(ioDriverEClass, IO_DRIVER__CONFIGURATION_DATA);
		createEReference(ioDriverEClass, IO_DRIVER__OWNING_ARTIFACT);
		createEReference(ioDriverEClass, IO_DRIVER__ABSTRACTION);
		createEReference(ioDriverEClass, IO_DRIVER__PROCESSOR);
		createEReference(ioDriverEClass, IO_DRIVER__PERIPHERAL);

		hardwareAbstractionFunctionEClass = createEClass(HARDWARE_ABSTRACTION_FUNCTION);
		createEReference(hardwareAbstractionFunctionEClass, HARDWARE_ABSTRACTION_FUNCTION__OWNING_ARTIFACT);
		createEReference(hardwareAbstractionFunctionEClass, HARDWARE_ABSTRACTION_FUNCTION__DRIVER);
		createEReference(hardwareAbstractionFunctionEClass, HARDWARE_ABSTRACTION_FUNCTION__PROVIDED_PORT);
		createEReference(hardwareAbstractionFunctionEClass, HARDWARE_ABSTRACTION_FUNCTION__REQUIRED_PORT);
		createEReference(hardwareAbstractionFunctionEClass, HARDWARE_ABSTRACTION_FUNCTION__ACCESSIBLE_PINS);
		createEReference(hardwareAbstractionFunctionEClass, HARDWARE_ABSTRACTION_FUNCTION__PROCESSOR);

		operatingSystemEClass = createEClass(OPERATING_SYSTEM);
		createEAttribute(operatingSystemEClass, OPERATING_SYSTEM__TYPE);
		createEAttribute(operatingSystemEClass, OPERATING_SYSTEM__EXECUTION_MODEL_TYPE);
		createEReference(operatingSystemEClass, OPERATING_SYSTEM__BLOCKING_FACTOR);
		createEReference(operatingSystemEClass, OPERATING_SYSTEM__TASK_SWITCH_TIME);
		createEReference(operatingSystemEClass, OPERATING_SYSTEM__OWNING_ARTIFACT);
		createEReference(operatingSystemEClass, OPERATING_SYSTEM__PROCESSOR);

		frameworkEClass = createEClass(FRAMEWORK);
		createEAttribute(frameworkEClass, FRAMEWORK__CONFIGURATION_DATA);
		createEReference(frameworkEClass, FRAMEWORK__OWNING_ARTIFACT);
		createEReference(frameworkEClass, FRAMEWORK__PROCESSOR);

		mwCompositeSoftwareFunctionEClass = createEClass(MW_COMPOSITE_SOFTWARE_FUNCTION);

		mwElementarySoftwareFunctionEClass = createEClass(MW_ELEMENTARY_SOFTWARE_FUNCTION);

		systemPortEClass = createEClass(SYSTEM_PORT);

		mwLocalPortEClass = createEClass(MW_LOCAL_PORT);

		mwRemotePortEClass = createEClass(MW_REMOTE_PORT);

		ipcExchangerEClass = createEClass(IPC_EXCHANGER);
		createEReference(ipcExchangerEClass, IPC_EXCHANGER__SOURCE);
		createEReference(ipcExchangerEClass, IPC_EXCHANGER__DESTINATION);
		createEReference(ipcExchangerEClass, IPC_EXCHANGER__OWNING_ARTIFACT);

		// Create enums
		executionModelKindEEnum = createEEnum(EXECUTION_MODEL_KIND);
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
		Allocation_modelPackage theAllocation_modelPackage = (Allocation_modelPackage)EPackage.Registry.INSTANCE.getEPackage(Allocation_modelPackage.eNS_URI);
		Hardware_architecturePackage theHardware_architecturePackage = (Hardware_architecturePackage)EPackage.Registry.INSTANCE.getEPackage(Hardware_architecturePackage.eNS_URI);
		CommonPackage theCommonPackage = (CommonPackage)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);
		Verification_validationPackage theVerification_validationPackage = (Verification_validationPackage)EPackage.Registry.INSTANCE.getEPackage(Verification_validationPackage.eNS_URI);
		RequirementsPackage theRequirementsPackage = (RequirementsPackage)EPackage.Registry.INSTANCE.getEPackage(RequirementsPackage.eNS_URI);
		Functional_design_architecturePackage theFunctional_design_architecturePackage = (Functional_design_architecturePackage)EPackage.Registry.INSTANCE.getEPackage(Functional_design_architecturePackage.eNS_URI);
		Function_instance_modelPackage theFunction_instance_modelPackage = (Function_instance_modelPackage)EPackage.Registry.INSTANCE.getEPackage(Function_instance_modelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		platformModelEClass.getESuperTypes().add(theCorePackage.getEASTADLArtifact());
		deviceDriverEClass.getESuperTypes().add(theCorePackage.getEASTADLEntity());
		deviceDriverEClass.getESuperTypes().add(theVerification_validationPackage.getValidatedEntity());
		ioDriverEClass.getESuperTypes().add(theCorePackage.getEASTADLEntity());
		ioDriverEClass.getESuperTypes().add(theVerification_validationPackage.getValidatedEntity());
		hardwareAbstractionFunctionEClass.getESuperTypes().add(theCorePackage.getEASTADLEntity());
		hardwareAbstractionFunctionEClass.getESuperTypes().add(theVerification_validationPackage.getValidatedEntity());
		operatingSystemEClass.getESuperTypes().add(theCorePackage.getEASTADLEntity());
		frameworkEClass.getESuperTypes().add(theCorePackage.getEASTADLEntity());
		mwCompositeSoftwareFunctionEClass.getESuperTypes().add(theFunctional_design_architecturePackage.getCompositeSoftwareFunction());
		mwElementarySoftwareFunctionEClass.getESuperTypes().add(theFunctional_design_architecturePackage.getElementarySoftwareFunction());
		systemPortEClass.getESuperTypes().add(theCommonPackage.getOperationFunctionPort());
		mwLocalPortEClass.getESuperTypes().add(theCommonPackage.getSignalFunctionPort());
		mwRemotePortEClass.getESuperTypes().add(theCommonPackage.getSignalFunctionPort());
		ipcExchangerEClass.getESuperTypes().add(theCorePackage.getEASTADLEntity());

		// Initialize classes and features; add operations and parameters
		initEClass(platformModelEClass, PlatformModel.class, "PlatformModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlatformModel_AllocationModel(), theAllocation_modelPackage.getAllocationModel(), theAllocation_modelPackage.getAllocationModel_PlatformModel(), "allocationModel", null, 0, 1, PlatformModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlatformModel_HardwareArchitecture(), theHardware_architecturePackage.getHardwareArchitecture(), theHardware_architecturePackage.getHardwareArchitecture_PlatformModel(), "hardwareArchitecture", null, 0, 1, PlatformModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlatformModel_DeviceDrivers(), this.getDeviceDriver(), this.getDeviceDriver_OwningArtifact(), "deviceDrivers", null, 0, -1, PlatformModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlatformModel_IODrivers(), this.getIODriver(), this.getIODriver_OwningArtifact(), "IODrivers", null, 0, -1, PlatformModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlatformModel_AbstractFunctions(), this.getHardwareAbstractionFunction(), this.getHardwareAbstractionFunction_OwningArtifact(), "abstractFunctions", null, 0, -1, PlatformModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlatformModel_Frameworks(), this.getFramework(), this.getFramework_OwningArtifact(), "frameworks", null, 0, -1, PlatformModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlatformModel_OperatingSystems(), this.getOperatingSystem(), this.getOperatingSystem_OwningArtifact(), "operatingSystems", null, 0, -1, PlatformModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlatformModel_CompositeSoftwareFunctions(), this.getMWCompositeSoftwareFunction(), null, "compositeSoftwareFunctions", null, 0, -1, PlatformModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlatformModel_ElementarySoftwareFunctions(), this.getMWElementarySoftwareFunction(), null, "elementarySoftwareFunctions", null, 0, -1, PlatformModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlatformModel_IPCExchangers(), this.getIPCExchanger(), this.getIPCExchanger_OwningArtifact(), "IPCExchangers", null, 0, -1, PlatformModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlatformModel_DesignDataTypes(), theCommonPackage.getDesignDataType(), null, "designDataTypes", null, 0, -1, PlatformModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlatformModel_ImplementationDataTypes(), theCommonPackage.getImplementationDataType(), null, "implementationDataTypes", null, 0, -1, PlatformModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlatformModel_TypeAssociations(), theCommonPackage.getTypeAssociation(), null, "typeAssociations", null, 0, -1, PlatformModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlatformModel_ConnectorSignals(), theCommonPackage.getConnectorSignal(), null, "connectorSignals", null, 0, -1, PlatformModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlatformModel_OperationCalls(), theCommonPackage.getOperationCall(), null, "operationCalls", null, 0, -1, PlatformModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceDriverEClass, DeviceDriver.class, "DeviceDriver", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeviceDriver_ConfigurationData(), ecorePackage.getEString(), "configurationData", null, 0, 1, DeviceDriver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceDriver_OwningArtifact(), this.getPlatformModel(), this.getPlatformModel_DeviceDrivers(), "owningArtifact", null, 1, 1, DeviceDriver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceDriver_Processor(), theHardware_architecturePackage.getProcessor(), theHardware_architecturePackage.getProcessor_DeviceDrivers(), "processor", null, 0, 1, DeviceDriver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceDriver_Peripheral(), theHardware_architecturePackage.getPeripheral(), theHardware_architecturePackage.getPeripheral_DeviceDrivers(), "peripheral", null, 0, 1, DeviceDriver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ioDriverEClass, IODriver.class, "IODriver", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIODriver_ConfigurationData(), ecorePackage.getEString(), "configurationData", null, 0, 1, IODriver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIODriver_OwningArtifact(), this.getPlatformModel(), this.getPlatformModel_IODrivers(), "owningArtifact", null, 1, 1, IODriver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIODriver_Abstraction(), this.getHardwareAbstractionFunction(), this.getHardwareAbstractionFunction_Driver(), "abstraction", null, 0, 1, IODriver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIODriver_Processor(), theHardware_architecturePackage.getProcessor(), theHardware_architecturePackage.getProcessor_IODrivers(), "processor", null, 0, 1, IODriver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIODriver_Peripheral(), theHardware_architecturePackage.getPeripheral(), theHardware_architecturePackage.getPeripheral_IODrivers(), "peripheral", null, 0, 1, IODriver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hardwareAbstractionFunctionEClass, HardwareAbstractionFunction.class, "HardwareAbstractionFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHardwareAbstractionFunction_OwningArtifact(), this.getPlatformModel(), this.getPlatformModel_AbstractFunctions(), "owningArtifact", null, 1, 1, HardwareAbstractionFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHardwareAbstractionFunction_Driver(), this.getIODriver(), this.getIODriver_Abstraction(), "driver", null, 0, 1, HardwareAbstractionFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHardwareAbstractionFunction_ProvidedPort(), this.getSystemPort(), null, "providedPort", null, 0, 1, HardwareAbstractionFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHardwareAbstractionFunction_RequiredPort(), this.getSystemPort(), null, "requiredPort", null, 0, 1, HardwareAbstractionFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHardwareAbstractionFunction_AccessiblePins(), theHardware_architecturePackage.getPin(), theHardware_architecturePackage.getPin_AbstractInterfaces(), "accessiblePins", null, 0, -1, HardwareAbstractionFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHardwareAbstractionFunction_Processor(), theHardware_architecturePackage.getProcessor(), theHardware_architecturePackage.getProcessor_HardwareAbstractions(), "processor", null, 0, 1, HardwareAbstractionFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operatingSystemEClass, OperatingSystem.class, "OperatingSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperatingSystem_Type(), ecorePackage.getEString(), "type", null, 0, 1, OperatingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperatingSystem_ExecutionModelType(), this.getExecutionModelKind(), "executionModelType", null, 0, 1, OperatingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperatingSystem_BlockingFactor(), theRequirementsPackage.getTimingRestriction(), null, "blockingFactor", null, 1, 1, OperatingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperatingSystem_TaskSwitchTime(), theRequirementsPackage.getTimingRestriction(), null, "taskSwitchTime", null, 1, 1, OperatingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperatingSystem_OwningArtifact(), this.getPlatformModel(), this.getPlatformModel_OperatingSystems(), "owningArtifact", null, 1, 1, OperatingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperatingSystem_Processor(), theHardware_architecturePackage.getProcessor(), theHardware_architecturePackage.getProcessor_OperatingSystems(), "processor", null, 0, 1, OperatingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(frameworkEClass, Framework.class, "Framework", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFramework_ConfigurationData(), ecorePackage.getEString(), "configurationData", null, 0, 1, Framework.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFramework_OwningArtifact(), this.getPlatformModel(), this.getPlatformModel_Frameworks(), "owningArtifact", null, 1, 1, Framework.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFramework_Processor(), theHardware_architecturePackage.getProcessor(), theHardware_architecturePackage.getProcessor_Frameworks(), "processor", null, 0, 1, Framework.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mwCompositeSoftwareFunctionEClass, MWCompositeSoftwareFunction.class, "MWCompositeSoftwareFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mwElementarySoftwareFunctionEClass, MWElementarySoftwareFunction.class, "MWElementarySoftwareFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(systemPortEClass, SystemPort.class, "SystemPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mwLocalPortEClass, MWLocalPort.class, "MWLocalPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mwRemotePortEClass, MWRemotePort.class, "MWRemotePort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ipcExchangerEClass, IPCExchanger.class, "IPCExchanger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIPCExchanger_Source(), theFunction_instance_modelPackage.getSignalInstance(), theFunction_instance_modelPackage.getSignalInstance_OutgoingExchangers(), "source", null, 0, 1, IPCExchanger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIPCExchanger_Destination(), theFunction_instance_modelPackage.getSignalInstance(), theFunction_instance_modelPackage.getSignalInstance_IncomingExchangers(), "destination", null, 0, 1, IPCExchanger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIPCExchanger_OwningArtifact(), this.getPlatformModel(), this.getPlatformModel_IPCExchangers(), "owningArtifact", null, 1, 1, IPCExchanger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(executionModelKindEEnum, ExecutionModelKind.class, "ExecutionModelKind");
		addEEnumLiteral(executionModelKindEEnum, ExecutionModelKind.FIXED_PRIORITY);
		addEEnumLiteral(executionModelKindEEnum, ExecutionModelKind.STATIC_CYCLIC);
	}

} //Platform_modelPackageImpl
