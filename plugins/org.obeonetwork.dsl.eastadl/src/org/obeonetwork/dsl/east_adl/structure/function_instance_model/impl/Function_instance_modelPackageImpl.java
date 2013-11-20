/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl;

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

import org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstance;
import org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstanceModel;
import org.obeonetwork.dsl.east_adl.structure.function_instance_model.Function_instance_modelFactory;
import org.obeonetwork.dsl.east_adl.structure.function_instance_model.Function_instance_modelPackage;
import org.obeonetwork.dsl.east_adl.structure.function_instance_model.LogicalCluster;
import org.obeonetwork.dsl.east_adl.structure.function_instance_model.ParameterInstance;
import org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstance;
import org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstanceTarget;

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
public class Function_instance_modelPackageImpl extends EPackageImpl implements Function_instance_modelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionInstanceModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalClusterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalInstanceTargetEClass = null;

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
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.Function_instance_modelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Function_instance_modelPackageImpl() {
		super(eNS_URI, Function_instance_modelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Function_instance_modelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Function_instance_modelPackage init() {
		if (isInited) return (Function_instance_modelPackage)EPackage.Registry.INSTANCE.getEPackage(Function_instance_modelPackage.eNS_URI);

		// Obtain or create and register package
		Function_instance_modelPackageImpl theFunction_instance_modelPackage = (Function_instance_modelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Function_instance_modelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Function_instance_modelPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		East_adlPackageImpl theEast_adlPackage = (East_adlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(East_adlPackage.eNS_URI) instanceof East_adlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(East_adlPackage.eNS_URI) : East_adlPackage.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		StructurePackageImpl theStructurePackage = (StructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI) instanceof StructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI) : StructurePackage.eINSTANCE);
		Vehicle_feature_modelPackageImpl theVehicle_feature_modelPackage = (Vehicle_feature_modelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Vehicle_feature_modelPackage.eNS_URI) instanceof Vehicle_feature_modelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Vehicle_feature_modelPackage.eNS_URI) : Vehicle_feature_modelPackage.eINSTANCE);
		Functional_analysis_architecturePackageImpl theFunctional_analysis_architecturePackage = (Functional_analysis_architecturePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Functional_analysis_architecturePackage.eNS_URI) instanceof Functional_analysis_architecturePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Functional_analysis_architecturePackage.eNS_URI) : Functional_analysis_architecturePackage.eINSTANCE);
		Functional_design_architecturePackageImpl theFunctional_design_architecturePackage = (Functional_design_architecturePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Functional_design_architecturePackage.eNS_URI) instanceof Functional_design_architecturePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Functional_design_architecturePackage.eNS_URI) : Functional_design_architecturePackage.eINSTANCE);
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
		theFunction_instance_modelPackage.createPackageContents();
		theEast_adlPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theStructurePackage.createPackageContents();
		theVehicle_feature_modelPackage.createPackageContents();
		theFunctional_analysis_architecturePackage.createPackageContents();
		theFunctional_design_architecturePackage.createPackageContents();
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
		theFunction_instance_modelPackage.initializePackageContents();
		theEast_adlPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theStructurePackage.initializePackageContents();
		theVehicle_feature_modelPackage.initializePackageContents();
		theFunctional_analysis_architecturePackage.initializePackageContents();
		theFunctional_design_architecturePackage.initializePackageContents();
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
		theFunction_instance_modelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Function_instance_modelPackage.eNS_URI, theFunction_instance_modelPackage);
		return theFunction_instance_modelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionInstanceModel() {
		return functionInstanceModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionInstanceModel_DesignArchitecture() {
		return (EReference)functionInstanceModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionInstanceModel_FunctionInstances() {
		return (EReference)functionInstanceModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionInstanceModel_LogicalClusters() {
		return (EReference)functionInstanceModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionInstanceModel_SignalInstances() {
		return (EReference)functionInstanceModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionInstanceModel_AllocationModel() {
		return (EReference)functionInstanceModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionInstance() {
		return functionInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionInstance_TriggerType() {
		return (EAttribute)functionInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionInstance_TriggerEvent() {
		return (EAttribute)functionInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionInstance_Period() {
		return (EReference)functionInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionInstance_Offset() {
		return (EReference)functionInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionInstance_ExecutionTime() {
		return (EReference)functionInstanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionInstance_InstantiatedFunction() {
		return (EReference)functionInstanceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionInstance_DefinedParameters() {
		return (EReference)functionInstanceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionInstance_ReferencedParameters() {
		return (EReference)functionInstanceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicalCluster() {
		return logicalClusterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalCluster_FunctionInstances() {
		return (EReference)logicalClusterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalCluster_PassiveDeployments() {
		return (EReference)logicalClusterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalCluster_Deployers() {
		return (EReference)logicalClusterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalCluster_Period() {
		return (EReference)logicalClusterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalCluster_Offset() {
		return (EReference)logicalClusterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicalCluster_TriggerType() {
		return (EAttribute)logicalClusterEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicalCluster_TriggerEvent() {
		return (EAttribute)logicalClusterEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterInstance() {
		return parameterInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterInstance_InstantiatedParameter() {
		return (EReference)parameterInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterInstance_OwningFunction() {
		return (EReference)parameterInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterInstance_ReferencingFunctions() {
		return (EReference)parameterInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignalInstance() {
		return signalInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignalInstance_Size() {
		return (EAttribute)signalInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignalInstance_Destination() {
		return (EReference)signalInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignalInstance_InstantiatedSignal() {
		return (EReference)signalInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignalInstance_PassiveDeployments() {
		return (EReference)signalInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignalInstance_Deployers() {
		return (EReference)signalInstanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignalInstance_OutgoingExchangers() {
		return (EReference)signalInstanceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignalInstance_IncomingExchangers() {
		return (EReference)signalInstanceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignalInstance_Source() {
		return (EReference)signalInstanceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignalInstanceTarget() {
		return signalInstanceTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignalInstanceTarget_IncomingSignals() {
		return (EReference)signalInstanceTargetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignalInstanceTarget_OutgoingSignals() {
		return (EReference)signalInstanceTargetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function_instance_modelFactory getFunction_instance_modelFactory() {
		return (Function_instance_modelFactory)getEFactoryInstance();
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
		functionInstanceModelEClass = createEClass(FUNCTION_INSTANCE_MODEL);
		createEReference(functionInstanceModelEClass, FUNCTION_INSTANCE_MODEL__DESIGN_ARCHITECTURE);
		createEReference(functionInstanceModelEClass, FUNCTION_INSTANCE_MODEL__FUNCTION_INSTANCES);
		createEReference(functionInstanceModelEClass, FUNCTION_INSTANCE_MODEL__LOGICAL_CLUSTERS);
		createEReference(functionInstanceModelEClass, FUNCTION_INSTANCE_MODEL__SIGNAL_INSTANCES);
		createEReference(functionInstanceModelEClass, FUNCTION_INSTANCE_MODEL__ALLOCATION_MODEL);

		functionInstanceEClass = createEClass(FUNCTION_INSTANCE);
		createEAttribute(functionInstanceEClass, FUNCTION_INSTANCE__TRIGGER_TYPE);
		createEAttribute(functionInstanceEClass, FUNCTION_INSTANCE__TRIGGER_EVENT);
		createEReference(functionInstanceEClass, FUNCTION_INSTANCE__PERIOD);
		createEReference(functionInstanceEClass, FUNCTION_INSTANCE__OFFSET);
		createEReference(functionInstanceEClass, FUNCTION_INSTANCE__EXECUTION_TIME);
		createEReference(functionInstanceEClass, FUNCTION_INSTANCE__INSTANTIATED_FUNCTION);
		createEReference(functionInstanceEClass, FUNCTION_INSTANCE__DEFINED_PARAMETERS);
		createEReference(functionInstanceEClass, FUNCTION_INSTANCE__REFERENCED_PARAMETERS);

		logicalClusterEClass = createEClass(LOGICAL_CLUSTER);
		createEReference(logicalClusterEClass, LOGICAL_CLUSTER__FUNCTION_INSTANCES);
		createEReference(logicalClusterEClass, LOGICAL_CLUSTER__PASSIVE_DEPLOYMENTS);
		createEReference(logicalClusterEClass, LOGICAL_CLUSTER__DEPLOYERS);
		createEReference(logicalClusterEClass, LOGICAL_CLUSTER__PERIOD);
		createEReference(logicalClusterEClass, LOGICAL_CLUSTER__OFFSET);
		createEAttribute(logicalClusterEClass, LOGICAL_CLUSTER__TRIGGER_TYPE);
		createEAttribute(logicalClusterEClass, LOGICAL_CLUSTER__TRIGGER_EVENT);

		parameterInstanceEClass = createEClass(PARAMETER_INSTANCE);
		createEReference(parameterInstanceEClass, PARAMETER_INSTANCE__INSTANTIATED_PARAMETER);
		createEReference(parameterInstanceEClass, PARAMETER_INSTANCE__OWNING_FUNCTION);
		createEReference(parameterInstanceEClass, PARAMETER_INSTANCE__REFERENCING_FUNCTIONS);

		signalInstanceEClass = createEClass(SIGNAL_INSTANCE);
		createEAttribute(signalInstanceEClass, SIGNAL_INSTANCE__SIZE);
		createEReference(signalInstanceEClass, SIGNAL_INSTANCE__DESTINATION);
		createEReference(signalInstanceEClass, SIGNAL_INSTANCE__INSTANTIATED_SIGNAL);
		createEReference(signalInstanceEClass, SIGNAL_INSTANCE__PASSIVE_DEPLOYMENTS);
		createEReference(signalInstanceEClass, SIGNAL_INSTANCE__DEPLOYERS);
		createEReference(signalInstanceEClass, SIGNAL_INSTANCE__OUTGOING_EXCHANGERS);
		createEReference(signalInstanceEClass, SIGNAL_INSTANCE__INCOMING_EXCHANGERS);
		createEReference(signalInstanceEClass, SIGNAL_INSTANCE__SOURCE);

		signalInstanceTargetEClass = createEClass(SIGNAL_INSTANCE_TARGET);
		createEReference(signalInstanceTargetEClass, SIGNAL_INSTANCE_TARGET__INCOMING_SIGNALS);
		createEReference(signalInstanceTargetEClass, SIGNAL_INSTANCE_TARGET__OUTGOING_SIGNALS);
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
		Functional_design_architecturePackage theFunctional_design_architecturePackage = (Functional_design_architecturePackage)EPackage.Registry.INSTANCE.getEPackage(Functional_design_architecturePackage.eNS_URI);
		Allocation_modelPackage theAllocation_modelPackage = (Allocation_modelPackage)EPackage.Registry.INSTANCE.getEPackage(Allocation_modelPackage.eNS_URI);
		CommonPackage theCommonPackage = (CommonPackage)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);
		RequirementsPackage theRequirementsPackage = (RequirementsPackage)EPackage.Registry.INSTANCE.getEPackage(RequirementsPackage.eNS_URI);
		Platform_modelPackage thePlatform_modelPackage = (Platform_modelPackage)EPackage.Registry.INSTANCE.getEPackage(Platform_modelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		functionInstanceModelEClass.getESuperTypes().add(theCorePackage.getEASTADLArtifact());
		functionInstanceEClass.getESuperTypes().add(theCorePackage.getEASTADLEntity());
		functionInstanceEClass.getESuperTypes().add(this.getSignalInstanceTarget());
		logicalClusterEClass.getESuperTypes().add(theCorePackage.getEASTADLEntity());
		logicalClusterEClass.getESuperTypes().add(this.getSignalInstanceTarget());
		parameterInstanceEClass.getESuperTypes().add(theCorePackage.getEASTADLEntity());
		signalInstanceEClass.getESuperTypes().add(theCorePackage.getEASTADLEntity());

		// Initialize classes and features; add operations and parameters
		initEClass(functionInstanceModelEClass, FunctionInstanceModel.class, "FunctionInstanceModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionInstanceModel_DesignArchitecture(), theFunctional_design_architecturePackage.getFunctionalDesignArchitecture(), theFunctional_design_architecturePackage.getFunctionalDesignArchitecture_InstanceModel(), "designArchitecture", null, 0, 1, FunctionInstanceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionInstanceModel_FunctionInstances(), this.getFunctionInstance(), null, "functionInstances", null, 0, -1, FunctionInstanceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionInstanceModel_LogicalClusters(), this.getLogicalCluster(), null, "logicalClusters", null, 0, -1, FunctionInstanceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionInstanceModel_SignalInstances(), this.getSignalInstance(), null, "signalInstances", null, 0, -1, FunctionInstanceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionInstanceModel_AllocationModel(), theAllocation_modelPackage.getAllocationModel(), theAllocation_modelPackage.getAllocationModel_InstanceModel(), "allocationModel", null, 0, 1, FunctionInstanceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionInstanceEClass, FunctionInstance.class, "FunctionInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunctionInstance_TriggerType(), theCommonPackage.getTriggerKind(), "triggerType", null, 0, 1, FunctionInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionInstance_TriggerEvent(), ecorePackage.getEString(), "triggerEvent", null, 0, 1, FunctionInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionInstance_Period(), theRequirementsPackage.getTimingRestriction(), null, "period", null, 1, 1, FunctionInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionInstance_Offset(), theRequirementsPackage.getTimingRestriction(), null, "offset", null, 1, 1, FunctionInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionInstance_ExecutionTime(), theRequirementsPackage.getTimingRestriction(), null, "executionTime", null, 1, 1, FunctionInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionInstance_InstantiatedFunction(), theFunctional_design_architecturePackage.getElementarySoftwareFunction(), theFunctional_design_architecturePackage.getElementarySoftwareFunction_Instances(), "instantiatedFunction", null, 0, 1, FunctionInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionInstance_DefinedParameters(), this.getParameterInstance(), this.getParameterInstance_OwningFunction(), "definedParameters", null, 0, -1, FunctionInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionInstance_ReferencedParameters(), this.getParameterInstance(), this.getParameterInstance_ReferencingFunctions(), "referencedParameters", null, 0, -1, FunctionInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logicalClusterEClass, LogicalCluster.class, "LogicalCluster", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogicalCluster_FunctionInstances(), this.getFunctionInstance(), null, "functionInstances", null, 0, -1, LogicalCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicalCluster_PassiveDeployments(), theAllocation_modelPackage.getFunctionDeployment(), theAllocation_modelPackage.getFunctionDeployment_Deployed(), "passiveDeployments", null, 0, -1, LogicalCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicalCluster_Deployers(), theAllocation_modelPackage.getOSTask(), null, "deployers", null, 0, -1, LogicalCluster.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getLogicalCluster_Period(), theRequirementsPackage.getTimingRestriction(), null, "period", null, 1, 1, LogicalCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicalCluster_Offset(), theRequirementsPackage.getTimingRestriction(), null, "offset", null, 1, 1, LogicalCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogicalCluster_TriggerType(), theCommonPackage.getTriggerKind(), "triggerType", null, 0, 1, LogicalCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogicalCluster_TriggerEvent(), ecorePackage.getEString(), "triggerEvent", null, 0, 1, LogicalCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterInstanceEClass, ParameterInstance.class, "ParameterInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterInstance_InstantiatedParameter(), theCommonPackage.getParameter(), theCommonPackage.getParameter_Instances(), "instantiatedParameter", null, 0, 1, ParameterInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterInstance_OwningFunction(), this.getFunctionInstance(), this.getFunctionInstance_DefinedParameters(), "owningFunction", null, 1, 1, ParameterInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterInstance_ReferencingFunctions(), this.getFunctionInstance(), this.getFunctionInstance_ReferencedParameters(), "referencingFunctions", null, 0, -1, ParameterInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signalInstanceEClass, SignalInstance.class, "SignalInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSignalInstance_Size(), ecorePackage.getEInt(), "size", null, 0, 1, SignalInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignalInstance_Destination(), this.getSignalInstanceTarget(), this.getSignalInstanceTarget_IncomingSignals(), "destination", null, 1, 1, SignalInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignalInstance_InstantiatedSignal(), theCommonPackage.getConnectorSignal(), theCommonPackage.getConnectorSignal_Instances(), "instantiatedSignal", null, 0, 1, SignalInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignalInstance_PassiveDeployments(), theAllocation_modelPackage.getSignalDeployment(), theAllocation_modelPackage.getSignalDeployment_Deployed(), "passiveDeployments", null, 0, -1, SignalInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignalInstance_Deployers(), theCorePackage.getEASTADLEntity(), null, "deployers", null, 0, -1, SignalInstance.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSignalInstance_OutgoingExchangers(), thePlatform_modelPackage.getIPCExchanger(), thePlatform_modelPackage.getIPCExchanger_Source(), "outgoingExchangers", null, 0, -1, SignalInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignalInstance_IncomingExchangers(), thePlatform_modelPackage.getIPCExchanger(), thePlatform_modelPackage.getIPCExchanger_Destination(), "incomingExchangers", null, 0, -1, SignalInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignalInstance_Source(), this.getSignalInstanceTarget(), this.getSignalInstanceTarget_OutgoingSignals(), "source", null, 1, 1, SignalInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signalInstanceTargetEClass, SignalInstanceTarget.class, "SignalInstanceTarget", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSignalInstanceTarget_IncomingSignals(), this.getSignalInstance(), this.getSignalInstance_Destination(), "incomingSignals", null, 0, -1, SignalInstanceTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignalInstanceTarget_OutgoingSignals(), this.getSignalInstance(), this.getSignalInstance_Source(), "outgoingSignals", null, 0, -1, SignalInstanceTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //Function_instance_modelPackageImpl
