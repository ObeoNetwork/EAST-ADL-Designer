/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.common.impl;

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

import org.obeonetwork.dsl.east_adl.structure.common.AllocatableEntity;
import org.obeonetwork.dsl.east_adl.structure.common.AllocationConstraint;
import org.obeonetwork.dsl.east_adl.structure.common.CommonFactory;
import org.obeonetwork.dsl.east_adl.structure.common.CommonPackage;
import org.obeonetwork.dsl.east_adl.structure.common.ConnectorSignal;
import org.obeonetwork.dsl.east_adl.structure.common.DesignDataType;
import org.obeonetwork.dsl.east_adl.structure.common.DesignDataTypeKind;
import org.obeonetwork.dsl.east_adl.structure.common.DirectionKind;
import org.obeonetwork.dsl.east_adl.structure.common.FunctionPort;
import org.obeonetwork.dsl.east_adl.structure.common.FunctionPortInterface;
import org.obeonetwork.dsl.east_adl.structure.common.ImplementationDataType;
import org.obeonetwork.dsl.east_adl.structure.common.ImplementationDataTypeKind;
import org.obeonetwork.dsl.east_adl.structure.common.OperationCall;
import org.obeonetwork.dsl.east_adl.structure.common.OperationFunctionPort;
import org.obeonetwork.dsl.east_adl.structure.common.OperationFunctionPortInterface;
import org.obeonetwork.dsl.east_adl.structure.common.OperationService;
import org.obeonetwork.dsl.east_adl.structure.common.Parameter;
import org.obeonetwork.dsl.east_adl.structure.common.Realization;
import org.obeonetwork.dsl.east_adl.structure.common.RealizedEntity;
import org.obeonetwork.dsl.east_adl.structure.common.RealizingEntity;
import org.obeonetwork.dsl.east_adl.structure.common.ServiceParameter;
import org.obeonetwork.dsl.east_adl.structure.common.SignalFunctionPort;
import org.obeonetwork.dsl.east_adl.structure.common.SignalFunctionPortInterface;
import org.obeonetwork.dsl.east_adl.structure.common.TriggerKind;
import org.obeonetwork.dsl.east_adl.structure.common.TypeAssociation;

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

import org.obeonetwork.dsl.east_adl.verification_validation.Verification_validationPackage;

import org.obeonetwork.dsl.east_adl.verification_validation.impl.Verification_validationPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommonPackageImpl extends EPackageImpl implements CommonPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalFunctionPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationFunctionPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionPortInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalFunctionPortInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationFunctionPortInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorSignalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass designDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementationDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realizedEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allocatableEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allocationConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realizingEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum triggerKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum designDataTypeKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum implementationDataTypeKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum directionKindEEnum = null;

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
	 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CommonPackageImpl() {
		super(eNS_URI, CommonFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CommonPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CommonPackage init() {
		if (isInited) return (CommonPackage)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);

		// Obtain or create and register package
		CommonPackageImpl theCommonPackage = (CommonPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CommonPackageImpl());

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
		RequirementsPackageImpl theRequirementsPackage = (RequirementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RequirementsPackage.eNS_URI) instanceof RequirementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RequirementsPackage.eNS_URI) : RequirementsPackage.eINSTANCE);
		Variant_handlingPackageImpl theVariant_handlingPackage = (Variant_handlingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Variant_handlingPackage.eNS_URI) instanceof Variant_handlingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Variant_handlingPackage.eNS_URI) : Variant_handlingPackage.eINSTANCE);
		SupportPackageImpl theSupportPackage = (SupportPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SupportPackage.eNS_URI) instanceof SupportPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SupportPackage.eNS_URI) : SupportPackage.eINSTANCE);
		BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) : BehaviorPackage.eINSTANCE);
		Verification_validationPackageImpl theVerification_validationPackage = (Verification_validationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Verification_validationPackage.eNS_URI) instanceof Verification_validationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Verification_validationPackage.eNS_URI) : Verification_validationPackage.eINSTANCE);

		// Create package meta-data objects
		theCommonPackage.createPackageContents();
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
		theRequirementsPackage.createPackageContents();
		theVariant_handlingPackage.createPackageContents();
		theSupportPackage.createPackageContents();
		theBehaviorPackage.createPackageContents();
		theVerification_validationPackage.createPackageContents();

		// Initialize created meta-data
		theCommonPackage.initializePackageContents();
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
		theRequirementsPackage.initializePackageContents();
		theVariant_handlingPackage.initializePackageContents();
		theSupportPackage.initializePackageContents();
		theBehaviorPackage.initializePackageContents();
		theVerification_validationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCommonPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CommonPackage.eNS_URI, theCommonPackage);
		return theCommonPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionPort() {
		return functionPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionPort_Provided() {
		return (EAttribute)functionPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionPort_Interface() {
		return (EReference)functionPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionPort_FromDelay() {
		return (EReference)functionPortEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionPort_UntilDelay() {
		return (EReference)functionPortEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionPort_PeriodRestriction() {
		return (EReference)functionPortEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionPort_Owner() {
		return (EReference)functionPortEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionPort_Period() {
		return (EReference)functionPortEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionPort_TransferTime() {
		return (EReference)functionPortEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignalFunctionPort() {
		return signalFunctionPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationFunctionPort() {
		return operationFunctionPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionPortInterface() {
		return functionPortInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionPortInterface_TypedPort() {
		return (EReference)functionPortInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignalFunctionPortInterface() {
		return signalFunctionPortInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignalFunctionPortInterface_EmitedSignals() {
		return (EReference)signalFunctionPortInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignalFunctionPortInterface_ReceivedSignals() {
		return (EReference)signalFunctionPortInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationFunctionPortInterface() {
		return operationFunctionPortInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationFunctionPortInterface_ReceivedCalls() {
		return (EReference)operationFunctionPortInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationFunctionPortInterface_EmitedCalls() {
		return (EReference)operationFunctionPortInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationFunctionPortInterface_Services() {
		return (EReference)operationFunctionPortInterfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectorSignal() {
		return connectorSignalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorSignal_Emitter() {
		return (EReference)connectorSignalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorSignal_Receiver() {
		return (EReference)connectorSignalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorSignal_DataType() {
		return (EReference)connectorSignalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorSignal_Period() {
		return (EReference)connectorSignalEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorSignal_Instances() {
		return (EReference)connectorSignalEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDesignDataType() {
		return designDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDesignDataType_Description() {
		return (EAttribute)designDataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDesignDataType_DataType() {
		return (EAttribute)designDataTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDesignDataType_TypedSignals() {
		return (EReference)designDataTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDesignDataType_Unit() {
		return (EAttribute)designDataTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDesignDataType_Resolution() {
		return (EAttribute)designDataTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDesignDataType_PhysicalMinimum() {
		return (EAttribute)designDataTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDesignDataType_PhysicalMaximum() {
		return (EAttribute)designDataTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDesignDataType_SignificantDigits() {
		return (EAttribute)designDataTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDesignDataType_DefaultValue() {
		return (EAttribute)designDataTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDesignDataType_TypedServiceParameters() {
		return (EReference)designDataTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDesignDataType_TypeAssociations() {
		return (EReference)designDataTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDesignDataType_TypedFunctionParameters() {
		return (EReference)designDataTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplementationDataType() {
		return implementationDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImplementationDataType_Description() {
		return (EAttribute)implementationDataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImplementationDataType_DataType() {
		return (EAttribute)implementationDataTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImplementationDataType_ImplementationMinimum() {
		return (EAttribute)implementationDataTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImplementationDataType_ImplementationMaximum() {
		return (EAttribute)implementationDataTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImplementationDataType_DefaultValue() {
		return (EAttribute)implementationDataTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationDataType_TypeAssociations() {
		return (EReference)implementationDataTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Constant() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_Owner() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_Instances() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_DataType() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Direction() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealization() {
		return realizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealization_RealizedEntity() {
		return (EReference)realizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealization_RealizingEntity() {
		return (EReference)realizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealizedEntity() {
		return realizedEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealizedEntity_PassiveRealizations() {
		return (EReference)realizedEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealizedEntity_RealizedBy() {
		return (EReference)realizedEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationService() {
		return operationServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationService_Parameters() {
		return (EReference)operationServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationService_Interface() {
		return (EReference)operationServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceParameter() {
		return serviceParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceParameter_Modifier() {
		return (EAttribute)serviceParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceParameter_OwningService() {
		return (EReference)serviceParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceParameter_DataType() {
		return (EReference)serviceParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationCall() {
		return operationCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationCall_Receiver() {
		return (EReference)operationCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationCall_Emitter() {
		return (EReference)operationCallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeAssociation() {
		return typeAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeAssociation_ScaleFactor() {
		return (EAttribute)typeAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeAssociation_ScaleOffset() {
		return (EAttribute)typeAssociationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeAssociation_DesignDataType() {
		return (EReference)typeAssociationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeAssociation_ImplementationDataType() {
		return (EReference)typeAssociationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeAssociation_Processor() {
		return (EReference)typeAssociationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllocatableEntity() {
		return allocatableEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllocatableEntity_Allocation() {
		return (EReference)allocatableEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllocatableEntity_AllocationTarget() {
		return (EReference)allocatableEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllocationConstraint() {
		return allocationConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllocationConstraint_Allocator() {
		return (EReference)allocationConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllocationConstraint_Target() {
		return (EReference)allocationConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealizingEntity() {
		return realizingEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealizingEntity_ActiveRealizations() {
		return (EReference)realizingEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealizingEntity_Realizes() {
		return (EReference)realizingEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTriggerKind() {
		return triggerKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDesignDataTypeKind() {
		return designDataTypeKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getImplementationDataTypeKind() {
		return implementationDataTypeKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDirectionKind() {
		return directionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonFactory getCommonFactory() {
		return (CommonFactory)getEFactoryInstance();
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
		functionPortEClass = createEClass(FUNCTION_PORT);
		createEAttribute(functionPortEClass, FUNCTION_PORT__PROVIDED);
		createEReference(functionPortEClass, FUNCTION_PORT__INTERFACE);
		createEReference(functionPortEClass, FUNCTION_PORT__FROM_DELAY);
		createEReference(functionPortEClass, FUNCTION_PORT__UNTIL_DELAY);
		createEReference(functionPortEClass, FUNCTION_PORT__PERIOD_RESTRICTION);
		createEReference(functionPortEClass, FUNCTION_PORT__OWNER);
		createEReference(functionPortEClass, FUNCTION_PORT__PERIOD);
		createEReference(functionPortEClass, FUNCTION_PORT__TRANSFER_TIME);

		signalFunctionPortEClass = createEClass(SIGNAL_FUNCTION_PORT);

		operationFunctionPortEClass = createEClass(OPERATION_FUNCTION_PORT);

		functionPortInterfaceEClass = createEClass(FUNCTION_PORT_INTERFACE);
		createEReference(functionPortInterfaceEClass, FUNCTION_PORT_INTERFACE__TYPED_PORT);

		signalFunctionPortInterfaceEClass = createEClass(SIGNAL_FUNCTION_PORT_INTERFACE);
		createEReference(signalFunctionPortInterfaceEClass, SIGNAL_FUNCTION_PORT_INTERFACE__EMITED_SIGNALS);
		createEReference(signalFunctionPortInterfaceEClass, SIGNAL_FUNCTION_PORT_INTERFACE__RECEIVED_SIGNALS);

		operationFunctionPortInterfaceEClass = createEClass(OPERATION_FUNCTION_PORT_INTERFACE);
		createEReference(operationFunctionPortInterfaceEClass, OPERATION_FUNCTION_PORT_INTERFACE__RECEIVED_CALLS);
		createEReference(operationFunctionPortInterfaceEClass, OPERATION_FUNCTION_PORT_INTERFACE__EMITED_CALLS);
		createEReference(operationFunctionPortInterfaceEClass, OPERATION_FUNCTION_PORT_INTERFACE__SERVICES);

		connectorSignalEClass = createEClass(CONNECTOR_SIGNAL);
		createEReference(connectorSignalEClass, CONNECTOR_SIGNAL__EMITTER);
		createEReference(connectorSignalEClass, CONNECTOR_SIGNAL__RECEIVER);
		createEReference(connectorSignalEClass, CONNECTOR_SIGNAL__DATA_TYPE);
		createEReference(connectorSignalEClass, CONNECTOR_SIGNAL__PERIOD);
		createEReference(connectorSignalEClass, CONNECTOR_SIGNAL__INSTANCES);

		designDataTypeEClass = createEClass(DESIGN_DATA_TYPE);
		createEAttribute(designDataTypeEClass, DESIGN_DATA_TYPE__DESCRIPTION);
		createEAttribute(designDataTypeEClass, DESIGN_DATA_TYPE__DATA_TYPE);
		createEReference(designDataTypeEClass, DESIGN_DATA_TYPE__TYPED_SIGNALS);
		createEAttribute(designDataTypeEClass, DESIGN_DATA_TYPE__UNIT);
		createEAttribute(designDataTypeEClass, DESIGN_DATA_TYPE__RESOLUTION);
		createEAttribute(designDataTypeEClass, DESIGN_DATA_TYPE__PHYSICAL_MINIMUM);
		createEAttribute(designDataTypeEClass, DESIGN_DATA_TYPE__PHYSICAL_MAXIMUM);
		createEAttribute(designDataTypeEClass, DESIGN_DATA_TYPE__SIGNIFICANT_DIGITS);
		createEAttribute(designDataTypeEClass, DESIGN_DATA_TYPE__DEFAULT_VALUE);
		createEReference(designDataTypeEClass, DESIGN_DATA_TYPE__TYPED_SERVICE_PARAMETERS);
		createEReference(designDataTypeEClass, DESIGN_DATA_TYPE__TYPE_ASSOCIATIONS);
		createEReference(designDataTypeEClass, DESIGN_DATA_TYPE__TYPED_FUNCTION_PARAMETERS);

		implementationDataTypeEClass = createEClass(IMPLEMENTATION_DATA_TYPE);
		createEAttribute(implementationDataTypeEClass, IMPLEMENTATION_DATA_TYPE__DESCRIPTION);
		createEAttribute(implementationDataTypeEClass, IMPLEMENTATION_DATA_TYPE__DATA_TYPE);
		createEAttribute(implementationDataTypeEClass, IMPLEMENTATION_DATA_TYPE__IMPLEMENTATION_MINIMUM);
		createEAttribute(implementationDataTypeEClass, IMPLEMENTATION_DATA_TYPE__IMPLEMENTATION_MAXIMUM);
		createEAttribute(implementationDataTypeEClass, IMPLEMENTATION_DATA_TYPE__DEFAULT_VALUE);
		createEReference(implementationDataTypeEClass, IMPLEMENTATION_DATA_TYPE__TYPE_ASSOCIATIONS);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__CONSTANT);
		createEReference(parameterEClass, PARAMETER__OWNER);
		createEReference(parameterEClass, PARAMETER__INSTANCES);
		createEReference(parameterEClass, PARAMETER__DATA_TYPE);
		createEAttribute(parameterEClass, PARAMETER__DIRECTION);

		realizationEClass = createEClass(REALIZATION);
		createEReference(realizationEClass, REALIZATION__REALIZED_ENTITY);
		createEReference(realizationEClass, REALIZATION__REALIZING_ENTITY);

		realizedEntityEClass = createEClass(REALIZED_ENTITY);
		createEReference(realizedEntityEClass, REALIZED_ENTITY__PASSIVE_REALIZATIONS);
		createEReference(realizedEntityEClass, REALIZED_ENTITY__REALIZED_BY);

		operationServiceEClass = createEClass(OPERATION_SERVICE);
		createEReference(operationServiceEClass, OPERATION_SERVICE__PARAMETERS);
		createEReference(operationServiceEClass, OPERATION_SERVICE__INTERFACE);

		serviceParameterEClass = createEClass(SERVICE_PARAMETER);
		createEAttribute(serviceParameterEClass, SERVICE_PARAMETER__MODIFIER);
		createEReference(serviceParameterEClass, SERVICE_PARAMETER__OWNING_SERVICE);
		createEReference(serviceParameterEClass, SERVICE_PARAMETER__DATA_TYPE);

		operationCallEClass = createEClass(OPERATION_CALL);
		createEReference(operationCallEClass, OPERATION_CALL__RECEIVER);
		createEReference(operationCallEClass, OPERATION_CALL__EMITTER);

		typeAssociationEClass = createEClass(TYPE_ASSOCIATION);
		createEAttribute(typeAssociationEClass, TYPE_ASSOCIATION__SCALE_FACTOR);
		createEAttribute(typeAssociationEClass, TYPE_ASSOCIATION__SCALE_OFFSET);
		createEReference(typeAssociationEClass, TYPE_ASSOCIATION__DESIGN_DATA_TYPE);
		createEReference(typeAssociationEClass, TYPE_ASSOCIATION__IMPLEMENTATION_DATA_TYPE);
		createEReference(typeAssociationEClass, TYPE_ASSOCIATION__PROCESSOR);

		allocatableEntityEClass = createEClass(ALLOCATABLE_ENTITY);
		createEReference(allocatableEntityEClass, ALLOCATABLE_ENTITY__ALLOCATION);
		createEReference(allocatableEntityEClass, ALLOCATABLE_ENTITY__ALLOCATION_TARGET);

		allocationConstraintEClass = createEClass(ALLOCATION_CONSTRAINT);
		createEReference(allocationConstraintEClass, ALLOCATION_CONSTRAINT__ALLOCATOR);
		createEReference(allocationConstraintEClass, ALLOCATION_CONSTRAINT__TARGET);

		realizingEntityEClass = createEClass(REALIZING_ENTITY);
		createEReference(realizingEntityEClass, REALIZING_ENTITY__ACTIVE_REALIZATIONS);
		createEReference(realizingEntityEClass, REALIZING_ENTITY__REALIZES);

		// Create enums
		triggerKindEEnum = createEEnum(TRIGGER_KIND);
		designDataTypeKindEEnum = createEEnum(DESIGN_DATA_TYPE_KIND);
		implementationDataTypeKindEEnum = createEEnum(IMPLEMENTATION_DATA_TYPE_KIND);
		directionKindEEnum = createEEnum(DIRECTION_KIND);
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
		RequirementsPackage theRequirementsPackage = (RequirementsPackage)EPackage.Registry.INSTANCE.getEPackage(RequirementsPackage.eNS_URI);
		Function_instance_modelPackage theFunction_instance_modelPackage = (Function_instance_modelPackage)EPackage.Registry.INSTANCE.getEPackage(Function_instance_modelPackage.eNS_URI);
		Hardware_architecturePackage theHardware_architecturePackage = (Hardware_architecturePackage)EPackage.Registry.INSTANCE.getEPackage(Hardware_architecturePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		functionPortEClass.getESuperTypes().add(theCorePackage.getEASTADLEntity());
		signalFunctionPortEClass.getESuperTypes().add(this.getFunctionPort());
		operationFunctionPortEClass.getESuperTypes().add(this.getFunctionPort());
		functionPortInterfaceEClass.getESuperTypes().add(theCorePackage.getEASTADLEntity());
		signalFunctionPortInterfaceEClass.getESuperTypes().add(this.getFunctionPortInterface());
		operationFunctionPortInterfaceEClass.getESuperTypes().add(this.getFunctionPortInterface());
		connectorSignalEClass.getESuperTypes().add(theCorePackage.getEASTADLEntity());
		designDataTypeEClass.getESuperTypes().add(theCorePackage.getEASTADLNamedElement());
		implementationDataTypeEClass.getESuperTypes().add(theCorePackage.getEASTADLNamedElement());
		parameterEClass.getESuperTypes().add(theCorePackage.getEASTADLEntity());
		realizationEClass.getESuperTypes().add(theCorePackage.getEASTADLNamedElement());
		operationServiceEClass.getESuperTypes().add(theCorePackage.getEASTADLEntity());
		serviceParameterEClass.getESuperTypes().add(theCorePackage.getEASTADLEntity());
		operationCallEClass.getESuperTypes().add(theCorePackage.getEASTADLEntity());
		typeAssociationEClass.getESuperTypes().add(theCorePackage.getEASTADLNamedElement());
		allocationConstraintEClass.getESuperTypes().add(theCorePackage.getEASTADLNamedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(functionPortEClass, FunctionPort.class, "FunctionPort", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunctionPort_Provided(), ecorePackage.getEBoolean(), "provided", null, 0, 1, FunctionPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionPort_Interface(), this.getFunctionPortInterface(), this.getFunctionPortInterface_TypedPort(), "interface", null, 0, 1, FunctionPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionPort_FromDelay(), theRequirementsPackage.getEndToEndDelay(), theRequirementsPackage.getEndToEndDelay_From(), "fromDelay", null, 0, 1, FunctionPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionPort_UntilDelay(), theRequirementsPackage.getEndToEndDelay(), theRequirementsPackage.getEndToEndDelay_Until(), "untilDelay", null, 0, 1, FunctionPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionPort_PeriodRestriction(), theRequirementsPackage.getPeriodRestriction(), theRequirementsPackage.getPeriodRestriction_AssignedPorts(), "periodRestriction", null, 0, 1, FunctionPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionPort_Owner(), theCorePackage.getEASTADLEntity(), null, "owner", null, 0, 1, FunctionPort.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionPort_Period(), theRequirementsPackage.getTimingRestriction(), null, "period", null, 1, 1, FunctionPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionPort_TransferTime(), theRequirementsPackage.getTimingRestriction(), null, "transferTime", null, 1, 1, FunctionPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signalFunctionPortEClass, SignalFunctionPort.class, "SignalFunctionPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(operationFunctionPortEClass, OperationFunctionPort.class, "OperationFunctionPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(functionPortInterfaceEClass, FunctionPortInterface.class, "FunctionPortInterface", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionPortInterface_TypedPort(), this.getFunctionPort(), this.getFunctionPort_Interface(), "typedPort", null, 1, 1, FunctionPortInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signalFunctionPortInterfaceEClass, SignalFunctionPortInterface.class, "SignalFunctionPortInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSignalFunctionPortInterface_EmitedSignals(), this.getConnectorSignal(), this.getConnectorSignal_Emitter(), "emitedSignals", null, 0, -1, SignalFunctionPortInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignalFunctionPortInterface_ReceivedSignals(), this.getConnectorSignal(), this.getConnectorSignal_Receiver(), "receivedSignals", null, 0, -1, SignalFunctionPortInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationFunctionPortInterfaceEClass, OperationFunctionPortInterface.class, "OperationFunctionPortInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationFunctionPortInterface_ReceivedCalls(), this.getOperationCall(), this.getOperationCall_Receiver(), "receivedCalls", null, 0, -1, OperationFunctionPortInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationFunctionPortInterface_EmitedCalls(), this.getOperationCall(), this.getOperationCall_Emitter(), "emitedCalls", null, 0, -1, OperationFunctionPortInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationFunctionPortInterface_Services(), this.getOperationService(), this.getOperationService_Interface(), "services", null, 0, -1, OperationFunctionPortInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectorSignalEClass, ConnectorSignal.class, "ConnectorSignal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectorSignal_Emitter(), this.getSignalFunctionPortInterface(), this.getSignalFunctionPortInterface_EmitedSignals(), "emitter", null, 0, 1, ConnectorSignal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectorSignal_Receiver(), this.getSignalFunctionPortInterface(), this.getSignalFunctionPortInterface_ReceivedSignals(), "receiver", null, 0, 1, ConnectorSignal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectorSignal_DataType(), this.getDesignDataType(), this.getDesignDataType_TypedSignals(), "dataType", null, 0, 1, ConnectorSignal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectorSignal_Period(), theRequirementsPackage.getTimingRestriction(), null, "period", null, 0, 1, ConnectorSignal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectorSignal_Instances(), theFunction_instance_modelPackage.getSignalInstance(), theFunction_instance_modelPackage.getSignalInstance_InstantiatedSignal(), "instances", null, 0, -1, ConnectorSignal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(designDataTypeEClass, DesignDataType.class, "DesignDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDesignDataType_Description(), ecorePackage.getEString(), "description", null, 0, 1, DesignDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDesignDataType_DataType(), this.getDesignDataTypeKind(), "dataType", null, 0, 1, DesignDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDesignDataType_TypedSignals(), this.getConnectorSignal(), this.getConnectorSignal_DataType(), "typedSignals", null, 0, -1, DesignDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDesignDataType_Unit(), ecorePackage.getEString(), "unit", null, 0, 1, DesignDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDesignDataType_Resolution(), ecorePackage.getEString(), "resolution", null, 0, 1, DesignDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDesignDataType_PhysicalMinimum(), ecorePackage.getEString(), "physicalMinimum", null, 0, 1, DesignDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDesignDataType_PhysicalMaximum(), ecorePackage.getEString(), "physicalMaximum", null, 0, 1, DesignDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDesignDataType_SignificantDigits(), ecorePackage.getEInt(), "significantDigits", null, 0, 1, DesignDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDesignDataType_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, DesignDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDesignDataType_TypedServiceParameters(), this.getServiceParameter(), this.getServiceParameter_DataType(), "typedServiceParameters", null, 0, -1, DesignDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDesignDataType_TypeAssociations(), this.getTypeAssociation(), this.getTypeAssociation_DesignDataType(), "typeAssociations", null, 0, -1, DesignDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDesignDataType_TypedFunctionParameters(), this.getParameter(), this.getParameter_DataType(), "typedFunctionParameters", null, 0, -1, DesignDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(implementationDataTypeEClass, ImplementationDataType.class, "ImplementationDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImplementationDataType_Description(), ecorePackage.getEString(), "description", null, 0, 1, ImplementationDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImplementationDataType_DataType(), this.getImplementationDataTypeKind(), "dataType", null, 0, 1, ImplementationDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImplementationDataType_ImplementationMinimum(), ecorePackage.getEString(), "implementationMinimum", null, 0, 1, ImplementationDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImplementationDataType_ImplementationMaximum(), ecorePackage.getEString(), "implementationMaximum", null, 0, 1, ImplementationDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImplementationDataType_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, ImplementationDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImplementationDataType_TypeAssociations(), this.getTypeAssociation(), this.getTypeAssociation_ImplementationDataType(), "typeAssociations", null, 0, -1, ImplementationDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Constant(), ecorePackage.getEBoolean(), "constant", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_Owner(), theCorePackage.getEASTADLEntity(), null, "owner", null, 1, 1, Parameter.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_Instances(), theFunction_instance_modelPackage.getParameterInstance(), theFunction_instance_modelPackage.getParameterInstance_InstantiatedParameter(), "instances", null, 0, -1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_DataType(), this.getDesignDataType(), this.getDesignDataType_TypedFunctionParameters(), "dataType", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Direction(), this.getDirectionKind(), "direction", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(realizationEClass, Realization.class, "Realization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRealization_RealizedEntity(), this.getRealizedEntity(), this.getRealizedEntity_PassiveRealizations(), "realizedEntity", null, 0, 1, Realization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRealization_RealizingEntity(), this.getRealizingEntity(), this.getRealizingEntity_ActiveRealizations(), "realizingEntity", null, 0, 1, Realization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(realizedEntityEClass, RealizedEntity.class, "RealizedEntity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRealizedEntity_PassiveRealizations(), this.getRealization(), this.getRealization_RealizedEntity(), "passiveRealizations", null, 0, -1, RealizedEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRealizedEntity_RealizedBy(), this.getRealizingEntity(), null, "realizedBy", null, 0, -1, RealizedEntity.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(operationServiceEClass, OperationService.class, "OperationService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationService_Parameters(), this.getServiceParameter(), this.getServiceParameter_OwningService(), "parameters", null, 0, -1, OperationService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationService_Interface(), this.getOperationFunctionPortInterface(), this.getOperationFunctionPortInterface_Services(), "interface", null, 1, 1, OperationService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceParameterEClass, ServiceParameter.class, "ServiceParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceParameter_Modifier(), this.getDirectionKind(), "modifier", null, 0, 1, ServiceParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceParameter_OwningService(), this.getOperationService(), this.getOperationService_Parameters(), "owningService", null, 1, 1, ServiceParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceParameter_DataType(), this.getDesignDataType(), this.getDesignDataType_TypedServiceParameters(), "dataType", null, 0, 1, ServiceParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationCallEClass, OperationCall.class, "OperationCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationCall_Receiver(), this.getOperationFunctionPortInterface(), this.getOperationFunctionPortInterface_ReceivedCalls(), "receiver", null, 0, 1, OperationCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationCall_Emitter(), this.getOperationFunctionPortInterface(), this.getOperationFunctionPortInterface_EmitedCalls(), "emitter", null, 0, 1, OperationCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeAssociationEClass, TypeAssociation.class, "TypeAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeAssociation_ScaleFactor(), ecorePackage.getEDouble(), "scaleFactor", null, 0, 1, TypeAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeAssociation_ScaleOffset(), ecorePackage.getEDouble(), "scaleOffset", null, 0, 1, TypeAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeAssociation_DesignDataType(), this.getDesignDataType(), this.getDesignDataType_TypeAssociations(), "designDataType", null, 0, 1, TypeAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeAssociation_ImplementationDataType(), this.getImplementationDataType(), this.getImplementationDataType_TypeAssociations(), "implementationDataType", null, 0, 1, TypeAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeAssociation_Processor(), theHardware_architecturePackage.getProcessor(), theHardware_architecturePackage.getProcessor_TypeAssociations(), "processor", null, 0, 1, TypeAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(allocatableEntityEClass, AllocatableEntity.class, "AllocatableEntity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAllocatableEntity_Allocation(), this.getAllocationConstraint(), this.getAllocationConstraint_Allocator(), "allocation", null, 0, 1, AllocatableEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAllocatableEntity_AllocationTarget(), theHardware_architecturePackage.getECU(), null, "allocationTarget", null, 0, 1, AllocatableEntity.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(allocationConstraintEClass, AllocationConstraint.class, "AllocationConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAllocationConstraint_Allocator(), this.getAllocatableEntity(), this.getAllocatableEntity_Allocation(), "allocator", null, 1, 1, AllocationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAllocationConstraint_Target(), theHardware_architecturePackage.getECU(), theHardware_architecturePackage.getECU_Allocations(), "target", null, 0, 1, AllocationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(realizingEntityEClass, RealizingEntity.class, "RealizingEntity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRealizingEntity_ActiveRealizations(), this.getRealization(), this.getRealization_RealizingEntity(), "activeRealizations", null, 0, -1, RealizingEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRealizingEntity_Realizes(), this.getRealizedEntity(), null, "realizes", null, 0, -1, RealizingEntity.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(triggerKindEEnum, TriggerKind.class, "TriggerKind");
		addEEnumLiteral(triggerKindEEnum, TriggerKind.EVENT);
		addEEnumLiteral(triggerKindEEnum, TriggerKind.PERIODIC);

		initEEnum(designDataTypeKindEEnum, DesignDataTypeKind.class, "DesignDataTypeKind");
		addEEnumLiteral(designDataTypeKindEEnum, DesignDataTypeKind.INTEGER);
		addEEnumLiteral(designDataTypeKindEEnum, DesignDataTypeKind.REAL);
		addEEnumLiteral(designDataTypeKindEEnum, DesignDataTypeKind.BOOLEAN);
		addEEnumLiteral(designDataTypeKindEEnum, DesignDataTypeKind.STRING);
		addEEnumLiteral(designDataTypeKindEEnum, DesignDataTypeKind.ENUMERATION);

		initEEnum(implementationDataTypeKindEEnum, ImplementationDataTypeKind.class, "ImplementationDataTypeKind");
		addEEnumLiteral(implementationDataTypeKindEEnum, ImplementationDataTypeKind.UNUM8);
		addEEnumLiteral(implementationDataTypeKindEEnum, ImplementationDataTypeKind.UNUM16);
		addEEnumLiteral(implementationDataTypeKindEEnum, ImplementationDataTypeKind.UNUM32);
		addEEnumLiteral(implementationDataTypeKindEEnum, ImplementationDataTypeKind.UNUM64);
		addEEnumLiteral(implementationDataTypeKindEEnum, ImplementationDataTypeKind.SNUM8);
		addEEnumLiteral(implementationDataTypeKindEEnum, ImplementationDataTypeKind.SNUM16);
		addEEnumLiteral(implementationDataTypeKindEEnum, ImplementationDataTypeKind.SNUM32);
		addEEnumLiteral(implementationDataTypeKindEEnum, ImplementationDataTypeKind.SNUM64);
		addEEnumLiteral(implementationDataTypeKindEEnum, ImplementationDataTypeKind.FLOAT32);
		addEEnumLiteral(implementationDataTypeKindEEnum, ImplementationDataTypeKind.FLOAT64);

		initEEnum(directionKindEEnum, DirectionKind.class, "DirectionKind");
		addEEnumLiteral(directionKindEEnum, DirectionKind.IN);
		addEEnumLiteral(directionKindEEnum, DirectionKind.OUT);
		addEEnumLiteral(directionKindEEnum, DirectionKind.IN_OUT);

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
		  (getFunctionPort_Provided(), 
		   source, 
		   new String[] {
			 "documentation", "Easier and better implementation of this behavior compared to the previous.\r\nThis attribute cannot be changed by the user directly but set only on creation."
		   });																
		addAnnotation
		  (connectorSignalEClass, 
		   source, 
		   new String[] {
			 "documentation", "This is a slightly different implementation of all the signal connection mechanics described in the specification. I think it is more relevant."
		   });				
		addAnnotation
		  (getConnectorSignal_Period(), 
		   source, 
		   new String[] {
			 "documentation", "This depends on units."
		   });									
		addAnnotation
		  (getDesignDataType_Resolution(), 
		   source, 
		   new String[] {
			 "documentation", "I use a String type because it is the best alternative to allow any possible entry."
		   });			
		addAnnotation
		  (getDesignDataType_PhysicalMinimum(), 
		   source, 
		   new String[] {
			 "documentation", "I use a String type because it is the best alternative to allow any possible entry."
		   });			
		addAnnotation
		  (getDesignDataType_PhysicalMaximum(), 
		   source, 
		   new String[] {
			 "documentation", "I use a String type because it is the best alternative to allow any possible entry."
		   });				
		addAnnotation
		  (getDesignDataType_DefaultValue(), 
		   source, 
		   new String[] {
			 "documentation", "I use a String type because it is the best alternative to allow any possible entry."
		   });								
		addAnnotation
		  (getImplementationDataType_ImplementationMinimum(), 
		   source, 
		   new String[] {
			 "documentation", "I use a String type because it is the best alternative to allow any possible entry."
		   });		
		addAnnotation
		  (getImplementationDataType_ImplementationMaximum(), 
		   source, 
		   new String[] {
			 "documentation", "I use a String type because it is the best alternative to allow any possible entry."
		   });			
		addAnnotation
		  (getImplementationDataType_DefaultValue(), 
		   source, 
		   new String[] {
			 "documentation", "I use a String type because it is the best alternative to allow any possible entry."
		   });					
		addAnnotation
		  (parameterEClass, 
		   source, 
		   new String[] {
			 "documentation", "This is my own implementation of the parameter notion, I think its is quite complete and relevant."
		   });					
		addAnnotation
		  (realizationEClass, 
		   source, 
		   new String[] {
			 "documentation", "This entity will be implemented by a connection."
		   });						
		addAnnotation
		  (realizedEntityEClass, 
		   source, 
		   new String[] {
			 "documentation", "I added this class for simplification purposes, in order to keep references as easy as possible."
		   });																					
	}

} //CommonPackageImpl
