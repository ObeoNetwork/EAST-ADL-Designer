/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl;

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

import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Actuator;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.AnalogSignal;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Channel;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ChannelKind;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.DigitalSignal;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.EdgeKind;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ElectricalSignal;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.HardwareArchitecture;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.HardwareEntity;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architectureFactory;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ICUMeasurementKind;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ICUSignal;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Memory;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.MemoryKind;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.PWMSignal;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Peripheral;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Pin;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Sensor;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Wire;

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
public class Hardware_architecturePackageImpl extends EPackageImpl implements Hardware_architecturePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwareArchitectureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwareEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ecuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass peripheralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass electricalSignalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass digitalSignalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analogSignalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pwmSignalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass channelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wireEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actuatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass icuSignalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum memoryKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum channelKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum icuMeasurementKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum edgeKindEEnum = null;

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
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Hardware_architecturePackageImpl() {
		super(eNS_URI, Hardware_architectureFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Hardware_architecturePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Hardware_architecturePackage init() {
		if (isInited) return (Hardware_architecturePackage)EPackage.Registry.INSTANCE.getEPackage(Hardware_architecturePackage.eNS_URI);

		// Obtain or create and register package
		Hardware_architecturePackageImpl theHardware_architecturePackage = (Hardware_architecturePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Hardware_architecturePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Hardware_architecturePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		East_adlPackageImpl theEast_adlPackage = (East_adlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(East_adlPackage.eNS_URI) instanceof East_adlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(East_adlPackage.eNS_URI) : East_adlPackage.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		StructurePackageImpl theStructurePackage = (StructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI) instanceof StructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI) : StructurePackage.eINSTANCE);
		Vehicle_feature_modelPackageImpl theVehicle_feature_modelPackage = (Vehicle_feature_modelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Vehicle_feature_modelPackage.eNS_URI) instanceof Vehicle_feature_modelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Vehicle_feature_modelPackage.eNS_URI) : Vehicle_feature_modelPackage.eINSTANCE);
		Functional_analysis_architecturePackageImpl theFunctional_analysis_architecturePackage = (Functional_analysis_architecturePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Functional_analysis_architecturePackage.eNS_URI) instanceof Functional_analysis_architecturePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Functional_analysis_architecturePackage.eNS_URI) : Functional_analysis_architecturePackage.eINSTANCE);
		Functional_design_architecturePackageImpl theFunctional_design_architecturePackage = (Functional_design_architecturePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Functional_design_architecturePackage.eNS_URI) instanceof Functional_design_architecturePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Functional_design_architecturePackage.eNS_URI) : Functional_design_architecturePackage.eINSTANCE);
		Function_instance_modelPackageImpl theFunction_instance_modelPackage = (Function_instance_modelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Function_instance_modelPackage.eNS_URI) instanceof Function_instance_modelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Function_instance_modelPackage.eNS_URI) : Function_instance_modelPackage.eINSTANCE);
		Platform_modelPackageImpl thePlatform_modelPackage = (Platform_modelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Platform_modelPackage.eNS_URI) instanceof Platform_modelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Platform_modelPackage.eNS_URI) : Platform_modelPackage.eINSTANCE);
		Allocation_modelPackageImpl theAllocation_modelPackage = (Allocation_modelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Allocation_modelPackage.eNS_URI) instanceof Allocation_modelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Allocation_modelPackage.eNS_URI) : Allocation_modelPackage.eINSTANCE);
		CommonPackageImpl theCommonPackage = (CommonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) : CommonPackage.eINSTANCE);
		RequirementsPackageImpl theRequirementsPackage = (RequirementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RequirementsPackage.eNS_URI) instanceof RequirementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RequirementsPackage.eNS_URI) : RequirementsPackage.eINSTANCE);
		Variant_handlingPackageImpl theVariant_handlingPackage = (Variant_handlingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Variant_handlingPackage.eNS_URI) instanceof Variant_handlingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Variant_handlingPackage.eNS_URI) : Variant_handlingPackage.eINSTANCE);
		SupportPackageImpl theSupportPackage = (SupportPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SupportPackage.eNS_URI) instanceof SupportPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SupportPackage.eNS_URI) : SupportPackage.eINSTANCE);
		BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) : BehaviorPackage.eINSTANCE);
		Verification_validationPackageImpl theVerification_validationPackage = (Verification_validationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Verification_validationPackage.eNS_URI) instanceof Verification_validationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Verification_validationPackage.eNS_URI) : Verification_validationPackage.eINSTANCE);

		// Create package meta-data objects
		theHardware_architecturePackage.createPackageContents();
		theEast_adlPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theStructurePackage.createPackageContents();
		theVehicle_feature_modelPackage.createPackageContents();
		theFunctional_analysis_architecturePackage.createPackageContents();
		theFunctional_design_architecturePackage.createPackageContents();
		theFunction_instance_modelPackage.createPackageContents();
		thePlatform_modelPackage.createPackageContents();
		theAllocation_modelPackage.createPackageContents();
		theCommonPackage.createPackageContents();
		theRequirementsPackage.createPackageContents();
		theVariant_handlingPackage.createPackageContents();
		theSupportPackage.createPackageContents();
		theBehaviorPackage.createPackageContents();
		theVerification_validationPackage.createPackageContents();

		// Initialize created meta-data
		theHardware_architecturePackage.initializePackageContents();
		theEast_adlPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theStructurePackage.initializePackageContents();
		theVehicle_feature_modelPackage.initializePackageContents();
		theFunctional_analysis_architecturePackage.initializePackageContents();
		theFunctional_design_architecturePackage.initializePackageContents();
		theFunction_instance_modelPackage.initializePackageContents();
		thePlatform_modelPackage.initializePackageContents();
		theAllocation_modelPackage.initializePackageContents();
		theCommonPackage.initializePackageContents();
		theRequirementsPackage.initializePackageContents();
		theVariant_handlingPackage.initializePackageContents();
		theSupportPackage.initializePackageContents();
		theBehaviorPackage.initializePackageContents();
		theVerification_validationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHardware_architecturePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Hardware_architecturePackage.eNS_URI, theHardware_architecturePackage);
		return theHardware_architecturePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwareArchitecture() {
		return hardwareArchitectureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardwareArchitecture_PlatformModel() {
		return (EReference)hardwareArchitectureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardwareArchitecture_HardwareEntities() {
		return (EReference)hardwareArchitectureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardwareArchitecture_ElectricalSignals() {
		return (EReference)hardwareArchitectureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardwareArchitecture_Wires() {
		return (EReference)hardwareArchitectureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardwareArchitecture_DesignArchitecture() {
		return (EReference)hardwareArchitectureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwareEntity() {
		return hardwareEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwareEntity_Description() {
		return (EAttribute)hardwareEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwareEntity_TechnicalSpecification() {
		return (EAttribute)hardwareEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getECU() {
		return ecuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getECU_Processors() {
		return (EReference)ecuEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getECU_Memory() {
		return (EReference)ecuEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getECU_Channels() {
		return (EReference)ecuEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getECU_Peripherals() {
		return (EReference)ecuEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getECU_Pins() {
		return (EReference)ecuEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getECU_Allocations() {
		return (EReference)ecuEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getECU_AllocatedEntities() {
		return (EReference)ecuEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessor() {
		return processorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessor_Type() {
		return (EAttribute)processorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessor_Frequency() {
		return (EAttribute)processorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessor_FrequencyUnit() {
		return (EAttribute)processorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessor_OwningECU() {
		return (EReference)processorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessor_UsedMemory() {
		return (EReference)processorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessor_Tasks() {
		return (EReference)processorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessor_IODrivers() {
		return (EReference)processorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessor_DeviceDrivers() {
		return (EReference)processorEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessor_Frameworks() {
		return (EReference)processorEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessor_OperatingSystems() {
		return (EReference)processorEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessor_TypeAssociations() {
		return (EReference)processorEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessor_HardwareAbstractions() {
		return (EReference)processorEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessor_Peripherals() {
		return (EReference)processorEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemory() {
		return memoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemory_MemoryType() {
		return (EAttribute)memoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemory_Size() {
		return (EAttribute)memoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemory_OwningECU() {
		return (EReference)memoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemory_UsingProcessors() {
		return (EReference)memoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPeripheral() {
		return peripheralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPeripheral_Type() {
		return (EAttribute)peripheralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPeripheral_OwningECU() {
		return (EReference)peripheralEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPeripheral_Pins() {
		return (EReference)peripheralEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPeripheral_DeviceDrivers() {
		return (EReference)peripheralEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPeripheral_IODrivers() {
		return (EReference)peripheralEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPeripheral_Processors() {
		return (EReference)peripheralEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElectricalSignal() {
		return electricalSignalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricalSignal_MinimumVoltage() {
		return (EAttribute)electricalSignalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricalSignal_MaximumVoltage() {
		return (EAttribute)electricalSignalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElectricalSignal_TypedPins() {
		return (EReference)electricalSignalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElectricalSignal_OwningArtifact() {
		return (EReference)electricalSignalEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDigitalSignal() {
		return digitalSignalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDigitalSignal_MinimumMaximumVoltage() {
		return (EAttribute)digitalSignalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDigitalSignal_MaximumMinimumVoltage() {
		return (EAttribute)digitalSignalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnalogSignal() {
		return analogSignalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPWMSignal() {
		return pwmSignalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPWMSignal_MinimumFrequency() {
		return (EAttribute)pwmSignalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPWMSignal_MaximumFrequency() {
		return (EAttribute)pwmSignalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPWMSignal_MinimumWidth() {
		return (EAttribute)pwmSignalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPWMSignal_MaximumWidth() {
		return (EAttribute)pwmSignalEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChannel() {
		return channelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannel_Protocol() {
		return (EAttribute)channelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannel_ChannelType() {
		return (EAttribute)channelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChannel_ConnectedSensors() {
		return (EReference)channelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChannel_ConnectedActuators() {
		return (EReference)channelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChannel_ConnectedECUs() {
		return (EReference)channelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChannel_Frames() {
		return (EReference)channelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWire() {
		return wireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWire_Source() {
		return (EReference)wireEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWire_Destination() {
		return (EReference)wireEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWire_OwningArtifact() {
		return (EReference)wireEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPin() {
		return pinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPin_OutgoingWires() {
		return (EReference)pinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPin_IncomingWires() {
		return (EReference)pinEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPin_PhysicalMeaning() {
		return (EAttribute)pinEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPin_DirectionType() {
		return (EAttribute)pinEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPin_Type() {
		return (EReference)pinEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPin_OwningHardware() {
		return (EReference)pinEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPin_AbstractInterfaces() {
		return (EReference)pinEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensor() {
		return sensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensor_Quantity() {
		return (EAttribute)sensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSensor_Channels() {
		return (EReference)sensorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSensor_SensorModel() {
		return (EReference)sensorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSensor_Pins() {
		return (EReference)sensorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActuator() {
		return actuatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActuator_Quantity() {
		return (EAttribute)actuatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActuator_Channels() {
		return (EReference)actuatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActuator_ActuatorModel() {
		return (EReference)actuatorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActuator_Pins() {
		return (EReference)actuatorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getICUSignal() {
		return icuSignalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getICUSignal_MeasurementMode() {
		return (EAttribute)icuSignalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getICUSignal_DefaultStartEdge() {
		return (EAttribute)icuSignalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getICUSignal_AdditionalData() {
		return (EAttribute)icuSignalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMemoryKind() {
		return memoryKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getChannelKind() {
		return channelKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getICUMeasurementKind() {
		return icuMeasurementKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEdgeKind() {
		return edgeKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hardware_architectureFactory getHardware_architectureFactory() {
		return (Hardware_architectureFactory)getEFactoryInstance();
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
		hardwareArchitectureEClass = createEClass(HARDWARE_ARCHITECTURE);
		createEReference(hardwareArchitectureEClass, HARDWARE_ARCHITECTURE__PLATFORM_MODEL);
		createEReference(hardwareArchitectureEClass, HARDWARE_ARCHITECTURE__HARDWARE_ENTITIES);
		createEReference(hardwareArchitectureEClass, HARDWARE_ARCHITECTURE__ELECTRICAL_SIGNALS);
		createEReference(hardwareArchitectureEClass, HARDWARE_ARCHITECTURE__WIRES);
		createEReference(hardwareArchitectureEClass, HARDWARE_ARCHITECTURE__DESIGN_ARCHITECTURE);

		hardwareEntityEClass = createEClass(HARDWARE_ENTITY);
		createEAttribute(hardwareEntityEClass, HARDWARE_ENTITY__DESCRIPTION);
		createEAttribute(hardwareEntityEClass, HARDWARE_ENTITY__TECHNICAL_SPECIFICATION);

		ecuEClass = createEClass(ECU);
		createEReference(ecuEClass, ECU__PROCESSORS);
		createEReference(ecuEClass, ECU__MEMORY);
		createEReference(ecuEClass, ECU__CHANNELS);
		createEReference(ecuEClass, ECU__PERIPHERALS);
		createEReference(ecuEClass, ECU__PINS);
		createEReference(ecuEClass, ECU__ALLOCATIONS);
		createEReference(ecuEClass, ECU__ALLOCATED_ENTITIES);

		processorEClass = createEClass(PROCESSOR);
		createEAttribute(processorEClass, PROCESSOR__TYPE);
		createEAttribute(processorEClass, PROCESSOR__FREQUENCY);
		createEAttribute(processorEClass, PROCESSOR__FREQUENCY_UNIT);
		createEReference(processorEClass, PROCESSOR__OWNING_ECU);
		createEReference(processorEClass, PROCESSOR__USED_MEMORY);
		createEReference(processorEClass, PROCESSOR__TASKS);
		createEReference(processorEClass, PROCESSOR__IO_DRIVERS);
		createEReference(processorEClass, PROCESSOR__DEVICE_DRIVERS);
		createEReference(processorEClass, PROCESSOR__FRAMEWORKS);
		createEReference(processorEClass, PROCESSOR__OPERATING_SYSTEMS);
		createEReference(processorEClass, PROCESSOR__TYPE_ASSOCIATIONS);
		createEReference(processorEClass, PROCESSOR__HARDWARE_ABSTRACTIONS);
		createEReference(processorEClass, PROCESSOR__PERIPHERALS);

		memoryEClass = createEClass(MEMORY);
		createEAttribute(memoryEClass, MEMORY__MEMORY_TYPE);
		createEAttribute(memoryEClass, MEMORY__SIZE);
		createEReference(memoryEClass, MEMORY__OWNING_ECU);
		createEReference(memoryEClass, MEMORY__USING_PROCESSORS);

		peripheralEClass = createEClass(PERIPHERAL);
		createEAttribute(peripheralEClass, PERIPHERAL__TYPE);
		createEReference(peripheralEClass, PERIPHERAL__OWNING_ECU);
		createEReference(peripheralEClass, PERIPHERAL__PINS);
		createEReference(peripheralEClass, PERIPHERAL__DEVICE_DRIVERS);
		createEReference(peripheralEClass, PERIPHERAL__IO_DRIVERS);
		createEReference(peripheralEClass, PERIPHERAL__PROCESSORS);

		electricalSignalEClass = createEClass(ELECTRICAL_SIGNAL);
		createEAttribute(electricalSignalEClass, ELECTRICAL_SIGNAL__MINIMUM_VOLTAGE);
		createEAttribute(electricalSignalEClass, ELECTRICAL_SIGNAL__MAXIMUM_VOLTAGE);
		createEReference(electricalSignalEClass, ELECTRICAL_SIGNAL__TYPED_PINS);
		createEReference(electricalSignalEClass, ELECTRICAL_SIGNAL__OWNING_ARTIFACT);

		digitalSignalEClass = createEClass(DIGITAL_SIGNAL);
		createEAttribute(digitalSignalEClass, DIGITAL_SIGNAL__MINIMUM_MAXIMUM_VOLTAGE);
		createEAttribute(digitalSignalEClass, DIGITAL_SIGNAL__MAXIMUM_MINIMUM_VOLTAGE);

		analogSignalEClass = createEClass(ANALOG_SIGNAL);

		pwmSignalEClass = createEClass(PWM_SIGNAL);
		createEAttribute(pwmSignalEClass, PWM_SIGNAL__MINIMUM_FREQUENCY);
		createEAttribute(pwmSignalEClass, PWM_SIGNAL__MAXIMUM_FREQUENCY);
		createEAttribute(pwmSignalEClass, PWM_SIGNAL__MINIMUM_WIDTH);
		createEAttribute(pwmSignalEClass, PWM_SIGNAL__MAXIMUM_WIDTH);

		channelEClass = createEClass(CHANNEL);
		createEAttribute(channelEClass, CHANNEL__PROTOCOL);
		createEAttribute(channelEClass, CHANNEL__CHANNEL_TYPE);
		createEReference(channelEClass, CHANNEL__CONNECTED_SENSORS);
		createEReference(channelEClass, CHANNEL__CONNECTED_ACTUATORS);
		createEReference(channelEClass, CHANNEL__CONNECTED_EC_US);
		createEReference(channelEClass, CHANNEL__FRAMES);

		wireEClass = createEClass(WIRE);
		createEReference(wireEClass, WIRE__SOURCE);
		createEReference(wireEClass, WIRE__DESTINATION);
		createEReference(wireEClass, WIRE__OWNING_ARTIFACT);

		pinEClass = createEClass(PIN);
		createEReference(pinEClass, PIN__OUTGOING_WIRES);
		createEReference(pinEClass, PIN__INCOMING_WIRES);
		createEAttribute(pinEClass, PIN__PHYSICAL_MEANING);
		createEAttribute(pinEClass, PIN__DIRECTION_TYPE);
		createEReference(pinEClass, PIN__TYPE);
		createEReference(pinEClass, PIN__OWNING_HARDWARE);
		createEReference(pinEClass, PIN__ABSTRACT_INTERFACES);

		sensorEClass = createEClass(SENSOR);
		createEAttribute(sensorEClass, SENSOR__QUANTITY);
		createEReference(sensorEClass, SENSOR__CHANNELS);
		createEReference(sensorEClass, SENSOR__SENSOR_MODEL);
		createEReference(sensorEClass, SENSOR__PINS);

		actuatorEClass = createEClass(ACTUATOR);
		createEAttribute(actuatorEClass, ACTUATOR__QUANTITY);
		createEReference(actuatorEClass, ACTUATOR__CHANNELS);
		createEReference(actuatorEClass, ACTUATOR__ACTUATOR_MODEL);
		createEReference(actuatorEClass, ACTUATOR__PINS);

		icuSignalEClass = createEClass(ICU_SIGNAL);
		createEAttribute(icuSignalEClass, ICU_SIGNAL__MEASUREMENT_MODE);
		createEAttribute(icuSignalEClass, ICU_SIGNAL__DEFAULT_START_EDGE);
		createEAttribute(icuSignalEClass, ICU_SIGNAL__ADDITIONAL_DATA);

		// Create enums
		memoryKindEEnum = createEEnum(MEMORY_KIND);
		channelKindEEnum = createEEnum(CHANNEL_KIND);
		icuMeasurementKindEEnum = createEEnum(ICU_MEASUREMENT_KIND);
		edgeKindEEnum = createEEnum(EDGE_KIND);
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
		Platform_modelPackage thePlatform_modelPackage = (Platform_modelPackage)EPackage.Registry.INSTANCE.getEPackage(Platform_modelPackage.eNS_URI);
		Functional_design_architecturePackage theFunctional_design_architecturePackage = (Functional_design_architecturePackage)EPackage.Registry.INSTANCE.getEPackage(Functional_design_architecturePackage.eNS_URI);
		Verification_validationPackage theVerification_validationPackage = (Verification_validationPackage)EPackage.Registry.INSTANCE.getEPackage(Verification_validationPackage.eNS_URI);
		CommonPackage theCommonPackage = (CommonPackage)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);
		Allocation_modelPackage theAllocation_modelPackage = (Allocation_modelPackage)EPackage.Registry.INSTANCE.getEPackage(Allocation_modelPackage.eNS_URI);
		Functional_analysis_architecturePackage theFunctional_analysis_architecturePackage = (Functional_analysis_architecturePackage)EPackage.Registry.INSTANCE.getEPackage(Functional_analysis_architecturePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		hardwareArchitectureEClass.getESuperTypes().add(theCorePackage.getEASTADLArtifact());
		hardwareEntityEClass.getESuperTypes().add(theCorePackage.getEASTADLEntity());
		hardwareEntityEClass.getESuperTypes().add(theVerification_validationPackage.getValidatedEntity());
		ecuEClass.getESuperTypes().add(this.getHardwareEntity());
		processorEClass.getESuperTypes().add(this.getHardwareEntity());
		memoryEClass.getESuperTypes().add(this.getHardwareEntity());
		peripheralEClass.getESuperTypes().add(this.getHardwareEntity());
		electricalSignalEClass.getESuperTypes().add(theCorePackage.getEASTADLEntity());
		digitalSignalEClass.getESuperTypes().add(this.getElectricalSignal());
		analogSignalEClass.getESuperTypes().add(this.getElectricalSignal());
		pwmSignalEClass.getESuperTypes().add(this.getElectricalSignal());
		channelEClass.getESuperTypes().add(this.getHardwareEntity());
		wireEClass.getESuperTypes().add(theCorePackage.getEASTADLEntity());
		pinEClass.getESuperTypes().add(theCorePackage.getEASTADLEntity());
		sensorEClass.getESuperTypes().add(this.getHardwareEntity());
		sensorEClass.getESuperTypes().add(theCommonPackage.getRealizingEntity());
		actuatorEClass.getESuperTypes().add(this.getHardwareEntity());
		actuatorEClass.getESuperTypes().add(theCommonPackage.getRealizingEntity());
		icuSignalEClass.getESuperTypes().add(this.getPWMSignal());

		// Initialize classes and features; add operations and parameters
		initEClass(hardwareArchitectureEClass, HardwareArchitecture.class, "HardwareArchitecture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHardwareArchitecture_PlatformModel(), thePlatform_modelPackage.getPlatformModel(), thePlatform_modelPackage.getPlatformModel_HardwareArchitecture(), "platformModel", null, 0, 1, HardwareArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHardwareArchitecture_HardwareEntities(), this.getHardwareEntity(), null, "hardwareEntities", null, 0, -1, HardwareArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHardwareArchitecture_ElectricalSignals(), this.getElectricalSignal(), this.getElectricalSignal_OwningArtifact(), "electricalSignals", null, 0, -1, HardwareArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHardwareArchitecture_Wires(), this.getWire(), this.getWire_OwningArtifact(), "wires", null, 0, -1, HardwareArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHardwareArchitecture_DesignArchitecture(), theFunctional_design_architecturePackage.getFunctionalDesignArchitecture(), theFunctional_design_architecturePackage.getFunctionalDesignArchitecture_HardwareArchitecture(), "designArchitecture", null, 0, 1, HardwareArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hardwareEntityEClass, HardwareEntity.class, "HardwareEntity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHardwareEntity_Description(), ecorePackage.getEString(), "description", null, 0, 1, HardwareEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHardwareEntity_TechnicalSpecification(), ecorePackage.getEString(), "technicalSpecification", null, 0, 1, HardwareEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ecuEClass, org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ECU.class, "ECU", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getECU_Processors(), this.getProcessor(), this.getProcessor_OwningECU(), "processors", null, 0, -1, org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ECU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getECU_Memory(), this.getMemory(), this.getMemory_OwningECU(), "memory", null, 0, -1, org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ECU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getECU_Channels(), this.getChannel(), this.getChannel_ConnectedECUs(), "channels", null, 0, -1, org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ECU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getECU_Peripherals(), this.getPeripheral(), this.getPeripheral_OwningECU(), "peripherals", null, 0, -1, org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ECU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getECU_Pins(), this.getPin(), null, "pins", null, 0, -1, org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ECU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getECU_Allocations(), theCommonPackage.getAllocationConstraint(), theCommonPackage.getAllocationConstraint_Target(), "allocations", null, 0, -1, org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ECU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getECU_AllocatedEntities(), theCommonPackage.getAllocatableEntity(), null, "allocatedEntities", null, 0, -1, org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ECU.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(processorEClass, Processor.class, "Processor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessor_Type(), ecorePackage.getEString(), "type", null, 0, 1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessor_Frequency(), ecorePackage.getEInt(), "frequency", null, 0, 1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessor_FrequencyUnit(), ecorePackage.getEString(), "frequencyUnit", null, 0, 1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessor_OwningECU(), this.getECU(), this.getECU_Processors(), "owningECU", null, 1, 1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessor_UsedMemory(), this.getMemory(), this.getMemory_UsingProcessors(), "usedMemory", null, 0, -1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessor_Tasks(), theAllocation_modelPackage.getOSTask(), theAllocation_modelPackage.getOSTask_ExecutingProcessor(), "tasks", null, 0, -1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessor_IODrivers(), thePlatform_modelPackage.getIODriver(), thePlatform_modelPackage.getIODriver_Processor(), "IODrivers", null, 0, -1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessor_DeviceDrivers(), thePlatform_modelPackage.getDeviceDriver(), thePlatform_modelPackage.getDeviceDriver_Processor(), "deviceDrivers", null, 0, -1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessor_Frameworks(), thePlatform_modelPackage.getFramework(), thePlatform_modelPackage.getFramework_Processor(), "frameworks", null, 0, -1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessor_OperatingSystems(), thePlatform_modelPackage.getOperatingSystem(), thePlatform_modelPackage.getOperatingSystem_Processor(), "operatingSystems", null, 0, -1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessor_TypeAssociations(), theCommonPackage.getTypeAssociation(), theCommonPackage.getTypeAssociation_Processor(), "typeAssociations", null, 0, -1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessor_HardwareAbstractions(), thePlatform_modelPackage.getHardwareAbstractionFunction(), thePlatform_modelPackage.getHardwareAbstractionFunction_Processor(), "hardwareAbstractions", null, 0, -1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessor_Peripherals(), this.getPeripheral(), this.getPeripheral_Processors(), "peripherals", null, 0, -1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memoryEClass, Memory.class, "Memory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMemory_MemoryType(), this.getMemoryKind(), "memoryType", null, 0, 1, Memory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMemory_Size(), ecorePackage.getEInt(), "size", null, 0, 1, Memory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMemory_OwningECU(), this.getECU(), this.getECU_Memory(), "owningECU", null, 1, 1, Memory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMemory_UsingProcessors(), this.getProcessor(), this.getProcessor_UsedMemory(), "usingProcessors", null, 0, -1, Memory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(peripheralEClass, Peripheral.class, "Peripheral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPeripheral_Type(), ecorePackage.getEString(), "type", null, 0, 1, Peripheral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPeripheral_OwningECU(), this.getECU(), this.getECU_Peripherals(), "owningECU", null, 1, 1, Peripheral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPeripheral_Pins(), this.getPin(), null, "pins", null, 0, -1, Peripheral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPeripheral_DeviceDrivers(), thePlatform_modelPackage.getDeviceDriver(), thePlatform_modelPackage.getDeviceDriver_Peripheral(), "deviceDrivers", null, 0, -1, Peripheral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPeripheral_IODrivers(), thePlatform_modelPackage.getIODriver(), thePlatform_modelPackage.getIODriver_Peripheral(), "IODrivers", null, 0, -1, Peripheral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPeripheral_Processors(), this.getProcessor(), this.getProcessor_Peripherals(), "processors", null, 0, -1, Peripheral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(electricalSignalEClass, ElectricalSignal.class, "ElectricalSignal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElectricalSignal_MinimumVoltage(), ecorePackage.getEDouble(), "minimumVoltage", null, 0, 1, ElectricalSignal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElectricalSignal_MaximumVoltage(), ecorePackage.getEDouble(), "maximumVoltage", null, 0, 1, ElectricalSignal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElectricalSignal_TypedPins(), this.getPin(), this.getPin_Type(), "typedPins", null, 0, -1, ElectricalSignal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElectricalSignal_OwningArtifact(), this.getHardwareArchitecture(), this.getHardwareArchitecture_ElectricalSignals(), "owningArtifact", null, 1, 1, ElectricalSignal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(digitalSignalEClass, DigitalSignal.class, "DigitalSignal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDigitalSignal_MinimumMaximumVoltage(), ecorePackage.getEDouble(), "minimumMaximumVoltage", null, 0, 1, DigitalSignal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDigitalSignal_MaximumMinimumVoltage(), ecorePackage.getEDouble(), "maximumMinimumVoltage", null, 0, 1, DigitalSignal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(analogSignalEClass, AnalogSignal.class, "AnalogSignal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pwmSignalEClass, PWMSignal.class, "PWMSignal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPWMSignal_MinimumFrequency(), ecorePackage.getEDouble(), "minimumFrequency", null, 0, 1, PWMSignal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPWMSignal_MaximumFrequency(), ecorePackage.getEDouble(), "maximumFrequency", null, 0, 1, PWMSignal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPWMSignal_MinimumWidth(), ecorePackage.getEDouble(), "minimumWidth", null, 0, 1, PWMSignal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPWMSignal_MaximumWidth(), ecorePackage.getEDouble(), "maximumWidth", null, 0, 1, PWMSignal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(channelEClass, Channel.class, "Channel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChannel_Protocol(), ecorePackage.getEString(), "protocol", null, 0, 1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChannel_ChannelType(), this.getChannelKind(), "channelType", null, 0, 1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChannel_ConnectedSensors(), this.getSensor(), this.getSensor_Channels(), "connectedSensors", null, 0, -1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChannel_ConnectedActuators(), this.getActuator(), this.getActuator_Channels(), "connectedActuators", null, 0, -1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChannel_ConnectedECUs(), this.getECU(), this.getECU_Channels(), "connectedECUs", null, 0, -1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChannel_Frames(), theAllocation_modelPackage.getFrame(), theAllocation_modelPackage.getFrame_SendingChannel(), "frames", null, 0, -1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wireEClass, Wire.class, "Wire", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWire_Source(), this.getPin(), this.getPin_OutgoingWires(), "source", null, 0, 1, Wire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWire_Destination(), this.getPin(), this.getPin_IncomingWires(), "destination", null, 0, 1, Wire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWire_OwningArtifact(), this.getHardwareArchitecture(), this.getHardwareArchitecture_Wires(), "owningArtifact", null, 1, 1, Wire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pinEClass, Pin.class, "Pin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPin_OutgoingWires(), this.getWire(), this.getWire_Source(), "outgoingWires", null, 0, -1, Pin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPin_IncomingWires(), this.getWire(), this.getWire_Destination(), "incomingWires", null, 0, -1, Pin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPin_PhysicalMeaning(), ecorePackage.getEString(), "physicalMeaning", null, 0, 1, Pin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPin_DirectionType(), theCommonPackage.getDirectionKind(), "directionType", null, 0, 1, Pin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPin_Type(), this.getElectricalSignal(), this.getElectricalSignal_TypedPins(), "type", null, 0, 1, Pin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPin_OwningHardware(), this.getHardwareEntity(), null, "owningHardware", null, 0, 1, Pin.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPin_AbstractInterfaces(), thePlatform_modelPackage.getHardwareAbstractionFunction(), thePlatform_modelPackage.getHardwareAbstractionFunction_AccessiblePins(), "abstractInterfaces", null, 0, -1, Pin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sensorEClass, Sensor.class, "Sensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSensor_Quantity(), ecorePackage.getEString(), "quantity", null, 0, 1, Sensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSensor_Channels(), this.getChannel(), this.getChannel_ConnectedSensors(), "channels", null, 0, -1, Sensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSensor_SensorModel(), theFunctional_analysis_architecturePackage.getEnvironmentFunction(), theFunctional_analysis_architecturePackage.getEnvironmentFunction_Sensors(), "sensorModel", null, 0, 1, Sensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSensor_Pins(), this.getPin(), null, "pins", null, 0, -1, Sensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actuatorEClass, Actuator.class, "Actuator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActuator_Quantity(), ecorePackage.getEString(), "quantity", null, 0, 1, Actuator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActuator_Channels(), this.getChannel(), this.getChannel_ConnectedActuators(), "channels", null, 0, -1, Actuator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActuator_ActuatorModel(), theFunctional_analysis_architecturePackage.getEnvironmentFunction(), theFunctional_analysis_architecturePackage.getEnvironmentFunction_Actuators(), "actuatorModel", null, 0, 1, Actuator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActuator_Pins(), this.getPin(), null, "pins", null, 0, -1, Actuator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(icuSignalEClass, ICUSignal.class, "ICUSignal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getICUSignal_MeasurementMode(), this.getICUMeasurementKind(), "measurementMode", null, 0, 1, ICUSignal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getICUSignal_DefaultStartEdge(), this.getEdgeKind(), "defaultStartEdge", null, 0, 1, ICUSignal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getICUSignal_AdditionalData(), ecorePackage.getEString(), "additionalData", null, 0, 1, ICUSignal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(memoryKindEEnum, MemoryKind.class, "MemoryKind");
		addEEnumLiteral(memoryKindEEnum, MemoryKind.RAM);
		addEEnumLiteral(memoryKindEEnum, MemoryKind.ROM);

		initEEnum(channelKindEEnum, ChannelKind.class, "ChannelKind");
		addEEnumLiteral(channelKindEEnum, ChannelKind.MOST);
		addEEnumLiteral(channelKindEEnum, ChannelKind.CAN);
		addEEnumLiteral(channelKindEEnum, ChannelKind.FLEX_RAY);
		addEEnumLiteral(channelKindEEnum, ChannelKind.TTP);
		addEEnumLiteral(channelKindEEnum, ChannelKind.LIN);
		addEEnumLiteral(channelKindEEnum, ChannelKind.ELECTRICAL);

		initEEnum(icuMeasurementKindEEnum, ICUMeasurementKind.class, "ICUMeasurementKind");
		addEEnumLiteral(icuMeasurementKindEEnum, ICUMeasurementKind.SIGNAL_EDGE_DETECTION);
		addEEnumLiteral(icuMeasurementKindEEnum, ICUMeasurementKind.SIGNAL_MEASUREMENT);
		addEEnumLiteral(icuMeasurementKindEEnum, ICUMeasurementKind.TIMESTAMP);
		addEEnumLiteral(icuMeasurementKindEEnum, ICUMeasurementKind.EDGE_COUNTER);

		initEEnum(edgeKindEEnum, EdgeKind.class, "EdgeKind");
		addEEnumLiteral(edgeKindEEnum, EdgeKind.RISING);
		addEEnumLiteral(edgeKindEEnum, EdgeKind.FALLING);
		addEEnumLiteral(edgeKindEEnum, EdgeKind.BOTH);
	}

} //Hardware_architecturePackageImpl
