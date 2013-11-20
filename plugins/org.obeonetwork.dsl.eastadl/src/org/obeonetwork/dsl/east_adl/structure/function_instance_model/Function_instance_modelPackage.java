/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.function_instance_model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * This package contains the entities of the FIM artifact (or LA - Logial Architecture). The goal here is to instantiate elementary software functions.
 * <!-- end-model-doc -->
 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.Function_instance_modelFactory
 * @model kind="package"
 * @generated
 */
public interface Function_instance_modelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "function_instance_model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.topcased.org/0.11.0/east_adl/structure/function_instance_model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "function_instance_model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Function_instance_modelPackage eINSTANCE = org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.Function_instance_modelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.FunctionInstanceModelImpl <em>Function Instance Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.FunctionInstanceModelImpl
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.Function_instance_modelPackageImpl#getFunctionInstanceModel()
	 * @generated
	 */
	int FUNCTION_INSTANCE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INSTANCE_MODEL__NAME = CorePackage.EASTADL_ARTIFACT__NAME;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INSTANCE_MODEL__REQUIREMENTS = CorePackage.EASTADL_ARTIFACT__REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INSTANCE_MODEL__MODEL = CorePackage.EASTADL_ARTIFACT__MODEL;

	/**
	 * The feature id for the '<em><b>Support Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INSTANCE_MODEL__SUPPORT_ENTITIES = CorePackage.EASTADL_ARTIFACT__SUPPORT_ENTITIES;

	/**
	 * The feature id for the '<em><b>Validation Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INSTANCE_MODEL__VALIDATION_ENTITIES = CorePackage.EASTADL_ARTIFACT__VALIDATION_ENTITIES;

	/**
	 * The feature id for the '<em><b>Design Architecture</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INSTANCE_MODEL__DESIGN_ARCHITECTURE = CorePackage.EASTADL_ARTIFACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Function Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INSTANCE_MODEL__FUNCTION_INSTANCES = CorePackage.EASTADL_ARTIFACT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Logical Clusters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INSTANCE_MODEL__LOGICAL_CLUSTERS = CorePackage.EASTADL_ARTIFACT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Signal Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INSTANCE_MODEL__SIGNAL_INSTANCES = CorePackage.EASTADL_ARTIFACT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Allocation Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INSTANCE_MODEL__ALLOCATION_MODEL = CorePackage.EASTADL_ARTIFACT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Function Instance Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INSTANCE_MODEL_FEATURE_COUNT = CorePackage.EASTADL_ARTIFACT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.FunctionInstanceImpl <em>Function Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.FunctionInstanceImpl
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.Function_instance_modelPackageImpl#getFunctionInstance()
	 * @generated
	 */
	int FUNCTION_INSTANCE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INSTANCE__NAME = CorePackage.EASTADL_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Passive Assignments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INSTANCE__PASSIVE_ASSIGNMENTS = CorePackage.EASTADL_ENTITY__PASSIVE_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Assigned Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INSTANCE__ASSIGNED_REQUIREMENTS = CorePackage.EASTADL_ENTITY__ASSIGNED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Incoming Signals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INSTANCE__INCOMING_SIGNALS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outgoing Signals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INSTANCE__OUTGOING_SIGNALS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Trigger Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INSTANCE__TRIGGER_TYPE = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trigger Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INSTANCE__TRIGGER_EVENT = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INSTANCE__PERIOD = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INSTANCE__OFFSET = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Execution Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INSTANCE__EXECUTION_TIME = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Instantiated Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INSTANCE__INSTANTIATED_FUNCTION = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Defined Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INSTANCE__DEFINED_PARAMETERS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Referenced Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INSTANCE__REFERENCED_PARAMETERS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Function Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INSTANCE_FEATURE_COUNT = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.LogicalClusterImpl <em>Logical Cluster</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.LogicalClusterImpl
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.Function_instance_modelPackageImpl#getLogicalCluster()
	 * @generated
	 */
	int LOGICAL_CLUSTER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CLUSTER__NAME = CorePackage.EASTADL_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Passive Assignments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CLUSTER__PASSIVE_ASSIGNMENTS = CorePackage.EASTADL_ENTITY__PASSIVE_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Assigned Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CLUSTER__ASSIGNED_REQUIREMENTS = CorePackage.EASTADL_ENTITY__ASSIGNED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Incoming Signals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CLUSTER__INCOMING_SIGNALS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outgoing Signals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CLUSTER__OUTGOING_SIGNALS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Function Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CLUSTER__FUNCTION_INSTANCES = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Passive Deployments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CLUSTER__PASSIVE_DEPLOYMENTS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Deployers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CLUSTER__DEPLOYERS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CLUSTER__PERIOD = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CLUSTER__OFFSET = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Trigger Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CLUSTER__TRIGGER_TYPE = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Trigger Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CLUSTER__TRIGGER_EVENT = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Logical Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CLUSTER_FEATURE_COUNT = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.ParameterInstanceImpl <em>Parameter Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.ParameterInstanceImpl
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.Function_instance_modelPackageImpl#getParameterInstance()
	 * @generated
	 */
	int PARAMETER_INSTANCE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_INSTANCE__NAME = CorePackage.EASTADL_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Passive Assignments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_INSTANCE__PASSIVE_ASSIGNMENTS = CorePackage.EASTADL_ENTITY__PASSIVE_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Assigned Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_INSTANCE__ASSIGNED_REQUIREMENTS = CorePackage.EASTADL_ENTITY__ASSIGNED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Instantiated Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_INSTANCE__INSTANTIATED_PARAMETER = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Function</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_INSTANCE__OWNING_FUNCTION = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Referencing Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_INSTANCE__REFERENCING_FUNCTIONS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Parameter Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_INSTANCE_FEATURE_COUNT = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.SignalInstanceImpl <em>Signal Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.SignalInstanceImpl
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.Function_instance_modelPackageImpl#getSignalInstance()
	 * @generated
	 */
	int SIGNAL_INSTANCE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_INSTANCE__NAME = CorePackage.EASTADL_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Passive Assignments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_INSTANCE__PASSIVE_ASSIGNMENTS = CorePackage.EASTADL_ENTITY__PASSIVE_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Assigned Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_INSTANCE__ASSIGNED_REQUIREMENTS = CorePackage.EASTADL_ENTITY__ASSIGNED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_INSTANCE__SIZE = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_INSTANCE__DESTINATION = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Instantiated Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_INSTANCE__INSTANTIATED_SIGNAL = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Passive Deployments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_INSTANCE__PASSIVE_DEPLOYMENTS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Deployers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_INSTANCE__DEPLOYERS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Outgoing Exchangers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_INSTANCE__OUTGOING_EXCHANGERS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Incoming Exchangers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_INSTANCE__INCOMING_EXCHANGERS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_INSTANCE__SOURCE = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Signal Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_INSTANCE_FEATURE_COUNT = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.SignalInstanceTargetImpl <em>Signal Instance Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.SignalInstanceTargetImpl
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.Function_instance_modelPackageImpl#getSignalInstanceTarget()
	 * @generated
	 */
	int SIGNAL_INSTANCE_TARGET = 5;

	/**
	 * The feature id for the '<em><b>Incoming Signals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_INSTANCE_TARGET__INCOMING_SIGNALS = 0;

	/**
	 * The feature id for the '<em><b>Outgoing Signals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_INSTANCE_TARGET__OUTGOING_SIGNALS = 1;

	/**
	 * The number of structural features of the '<em>Signal Instance Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_INSTANCE_TARGET_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstanceModel <em>Function Instance Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Instance Model</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstanceModel
	 * @generated
	 */
	EClass getFunctionInstanceModel();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstanceModel#getDesignArchitecture <em>Design Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Design Architecture</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstanceModel#getDesignArchitecture()
	 * @see #getFunctionInstanceModel()
	 * @generated
	 */
	EReference getFunctionInstanceModel_DesignArchitecture();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstanceModel#getFunctionInstances <em>Function Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Function Instances</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstanceModel#getFunctionInstances()
	 * @see #getFunctionInstanceModel()
	 * @generated
	 */
	EReference getFunctionInstanceModel_FunctionInstances();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstanceModel#getLogicalClusters <em>Logical Clusters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Logical Clusters</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstanceModel#getLogicalClusters()
	 * @see #getFunctionInstanceModel()
	 * @generated
	 */
	EReference getFunctionInstanceModel_LogicalClusters();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstanceModel#getSignalInstances <em>Signal Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signal Instances</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstanceModel#getSignalInstances()
	 * @see #getFunctionInstanceModel()
	 * @generated
	 */
	EReference getFunctionInstanceModel_SignalInstances();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstanceModel#getAllocationModel <em>Allocation Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Allocation Model</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstanceModel#getAllocationModel()
	 * @see #getFunctionInstanceModel()
	 * @generated
	 */
	EReference getFunctionInstanceModel_AllocationModel();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstance <em>Function Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Instance</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstance
	 * @generated
	 */
	EClass getFunctionInstance();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstance#getTriggerType <em>Trigger Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trigger Type</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstance#getTriggerType()
	 * @see #getFunctionInstance()
	 * @generated
	 */
	EAttribute getFunctionInstance_TriggerType();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstance#getTriggerEvent <em>Trigger Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trigger Event</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstance#getTriggerEvent()
	 * @see #getFunctionInstance()
	 * @generated
	 */
	EAttribute getFunctionInstance_TriggerEvent();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstance#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Period</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstance#getPeriod()
	 * @see #getFunctionInstance()
	 * @generated
	 */
	EReference getFunctionInstance_Period();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstance#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Offset</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstance#getOffset()
	 * @see #getFunctionInstance()
	 * @generated
	 */
	EReference getFunctionInstance_Offset();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstance#getExecutionTime <em>Execution Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Execution Time</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstance#getExecutionTime()
	 * @see #getFunctionInstance()
	 * @generated
	 */
	EReference getFunctionInstance_ExecutionTime();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstance#getInstantiatedFunction <em>Instantiated Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instantiated Function</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstance#getInstantiatedFunction()
	 * @see #getFunctionInstance()
	 * @generated
	 */
	EReference getFunctionInstance_InstantiatedFunction();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstance#getDefinedParameters <em>Defined Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Defined Parameters</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstance#getDefinedParameters()
	 * @see #getFunctionInstance()
	 * @generated
	 */
	EReference getFunctionInstance_DefinedParameters();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstance#getReferencedParameters <em>Referenced Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referenced Parameters</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstance#getReferencedParameters()
	 * @see #getFunctionInstance()
	 * @generated
	 */
	EReference getFunctionInstance_ReferencedParameters();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.LogicalCluster <em>Logical Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Cluster</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.LogicalCluster
	 * @generated
	 */
	EClass getLogicalCluster();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.LogicalCluster#getFunctionInstances <em>Function Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Function Instances</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.LogicalCluster#getFunctionInstances()
	 * @see #getLogicalCluster()
	 * @generated
	 */
	EReference getLogicalCluster_FunctionInstances();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.LogicalCluster#getPassiveDeployments <em>Passive Deployments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Passive Deployments</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.LogicalCluster#getPassiveDeployments()
	 * @see #getLogicalCluster()
	 * @generated
	 */
	EReference getLogicalCluster_PassiveDeployments();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.LogicalCluster#getDeployers <em>Deployers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Deployers</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.LogicalCluster#getDeployers()
	 * @see #getLogicalCluster()
	 * @generated
	 */
	EReference getLogicalCluster_Deployers();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.LogicalCluster#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Period</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.LogicalCluster#getPeriod()
	 * @see #getLogicalCluster()
	 * @generated
	 */
	EReference getLogicalCluster_Period();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.LogicalCluster#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Offset</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.LogicalCluster#getOffset()
	 * @see #getLogicalCluster()
	 * @generated
	 */
	EReference getLogicalCluster_Offset();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.LogicalCluster#getTriggerType <em>Trigger Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trigger Type</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.LogicalCluster#getTriggerType()
	 * @see #getLogicalCluster()
	 * @generated
	 */
	EAttribute getLogicalCluster_TriggerType();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.LogicalCluster#getTriggerEvent <em>Trigger Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trigger Event</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.LogicalCluster#getTriggerEvent()
	 * @see #getLogicalCluster()
	 * @generated
	 */
	EAttribute getLogicalCluster_TriggerEvent();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.ParameterInstance <em>Parameter Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Instance</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.ParameterInstance
	 * @generated
	 */
	EClass getParameterInstance();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.ParameterInstance#getInstantiatedParameter <em>Instantiated Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instantiated Parameter</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.ParameterInstance#getInstantiatedParameter()
	 * @see #getParameterInstance()
	 * @generated
	 */
	EReference getParameterInstance_InstantiatedParameter();

	/**
	 * Returns the meta object for the container reference '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.ParameterInstance#getOwningFunction <em>Owning Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Function</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.ParameterInstance#getOwningFunction()
	 * @see #getParameterInstance()
	 * @generated
	 */
	EReference getParameterInstance_OwningFunction();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.ParameterInstance#getReferencingFunctions <em>Referencing Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referencing Functions</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.ParameterInstance#getReferencingFunctions()
	 * @see #getParameterInstance()
	 * @generated
	 */
	EReference getParameterInstance_ReferencingFunctions();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstance <em>Signal Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Instance</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstance
	 * @generated
	 */
	EClass getSignalInstance();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstance#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstance#getSize()
	 * @see #getSignalInstance()
	 * @generated
	 */
	EAttribute getSignalInstance_Size();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstance#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstance#getDestination()
	 * @see #getSignalInstance()
	 * @generated
	 */
	EReference getSignalInstance_Destination();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstance#getInstantiatedSignal <em>Instantiated Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instantiated Signal</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstance#getInstantiatedSignal()
	 * @see #getSignalInstance()
	 * @generated
	 */
	EReference getSignalInstance_InstantiatedSignal();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstance#getPassiveDeployments <em>Passive Deployments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Passive Deployments</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstance#getPassiveDeployments()
	 * @see #getSignalInstance()
	 * @generated
	 */
	EReference getSignalInstance_PassiveDeployments();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstance#getDeployers <em>Deployers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Deployers</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstance#getDeployers()
	 * @see #getSignalInstance()
	 * @generated
	 */
	EReference getSignalInstance_Deployers();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstance#getOutgoingExchangers <em>Outgoing Exchangers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Exchangers</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstance#getOutgoingExchangers()
	 * @see #getSignalInstance()
	 * @generated
	 */
	EReference getSignalInstance_OutgoingExchangers();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstance#getIncomingExchangers <em>Incoming Exchangers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Exchangers</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstance#getIncomingExchangers()
	 * @see #getSignalInstance()
	 * @generated
	 */
	EReference getSignalInstance_IncomingExchangers();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstance#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstance#getSource()
	 * @see #getSignalInstance()
	 * @generated
	 */
	EReference getSignalInstance_Source();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstanceTarget <em>Signal Instance Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Instance Target</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstanceTarget
	 * @generated
	 */
	EClass getSignalInstanceTarget();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstanceTarget#getIncomingSignals <em>Incoming Signals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Signals</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstanceTarget#getIncomingSignals()
	 * @see #getSignalInstanceTarget()
	 * @generated
	 */
	EReference getSignalInstanceTarget_IncomingSignals();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstanceTarget#getOutgoingSignals <em>Outgoing Signals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Signals</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstanceTarget#getOutgoingSignals()
	 * @see #getSignalInstanceTarget()
	 * @generated
	 */
	EReference getSignalInstanceTarget_OutgoingSignals();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Function_instance_modelFactory getFunction_instance_modelFactory();

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
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.FunctionInstanceModelImpl <em>Function Instance Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.FunctionInstanceModelImpl
		 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.Function_instance_modelPackageImpl#getFunctionInstanceModel()
		 * @generated
		 */
		EClass FUNCTION_INSTANCE_MODEL = eINSTANCE.getFunctionInstanceModel();

		/**
		 * The meta object literal for the '<em><b>Design Architecture</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_INSTANCE_MODEL__DESIGN_ARCHITECTURE = eINSTANCE.getFunctionInstanceModel_DesignArchitecture();

		/**
		 * The meta object literal for the '<em><b>Function Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_INSTANCE_MODEL__FUNCTION_INSTANCES = eINSTANCE.getFunctionInstanceModel_FunctionInstances();

		/**
		 * The meta object literal for the '<em><b>Logical Clusters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_INSTANCE_MODEL__LOGICAL_CLUSTERS = eINSTANCE.getFunctionInstanceModel_LogicalClusters();

		/**
		 * The meta object literal for the '<em><b>Signal Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_INSTANCE_MODEL__SIGNAL_INSTANCES = eINSTANCE.getFunctionInstanceModel_SignalInstances();

		/**
		 * The meta object literal for the '<em><b>Allocation Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_INSTANCE_MODEL__ALLOCATION_MODEL = eINSTANCE.getFunctionInstanceModel_AllocationModel();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.FunctionInstanceImpl <em>Function Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.FunctionInstanceImpl
		 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.Function_instance_modelPackageImpl#getFunctionInstance()
		 * @generated
		 */
		EClass FUNCTION_INSTANCE = eINSTANCE.getFunctionInstance();

		/**
		 * The meta object literal for the '<em><b>Trigger Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_INSTANCE__TRIGGER_TYPE = eINSTANCE.getFunctionInstance_TriggerType();

		/**
		 * The meta object literal for the '<em><b>Trigger Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_INSTANCE__TRIGGER_EVENT = eINSTANCE.getFunctionInstance_TriggerEvent();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_INSTANCE__PERIOD = eINSTANCE.getFunctionInstance_Period();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_INSTANCE__OFFSET = eINSTANCE.getFunctionInstance_Offset();

		/**
		 * The meta object literal for the '<em><b>Execution Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_INSTANCE__EXECUTION_TIME = eINSTANCE.getFunctionInstance_ExecutionTime();

		/**
		 * The meta object literal for the '<em><b>Instantiated Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_INSTANCE__INSTANTIATED_FUNCTION = eINSTANCE.getFunctionInstance_InstantiatedFunction();

		/**
		 * The meta object literal for the '<em><b>Defined Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_INSTANCE__DEFINED_PARAMETERS = eINSTANCE.getFunctionInstance_DefinedParameters();

		/**
		 * The meta object literal for the '<em><b>Referenced Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_INSTANCE__REFERENCED_PARAMETERS = eINSTANCE.getFunctionInstance_ReferencedParameters();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.LogicalClusterImpl <em>Logical Cluster</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.LogicalClusterImpl
		 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.Function_instance_modelPackageImpl#getLogicalCluster()
		 * @generated
		 */
		EClass LOGICAL_CLUSTER = eINSTANCE.getLogicalCluster();

		/**
		 * The meta object literal for the '<em><b>Function Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_CLUSTER__FUNCTION_INSTANCES = eINSTANCE.getLogicalCluster_FunctionInstances();

		/**
		 * The meta object literal for the '<em><b>Passive Deployments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_CLUSTER__PASSIVE_DEPLOYMENTS = eINSTANCE.getLogicalCluster_PassiveDeployments();

		/**
		 * The meta object literal for the '<em><b>Deployers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_CLUSTER__DEPLOYERS = eINSTANCE.getLogicalCluster_Deployers();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_CLUSTER__PERIOD = eINSTANCE.getLogicalCluster_Period();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_CLUSTER__OFFSET = eINSTANCE.getLogicalCluster_Offset();

		/**
		 * The meta object literal for the '<em><b>Trigger Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGICAL_CLUSTER__TRIGGER_TYPE = eINSTANCE.getLogicalCluster_TriggerType();

		/**
		 * The meta object literal for the '<em><b>Trigger Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGICAL_CLUSTER__TRIGGER_EVENT = eINSTANCE.getLogicalCluster_TriggerEvent();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.ParameterInstanceImpl <em>Parameter Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.ParameterInstanceImpl
		 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.Function_instance_modelPackageImpl#getParameterInstance()
		 * @generated
		 */
		EClass PARAMETER_INSTANCE = eINSTANCE.getParameterInstance();

		/**
		 * The meta object literal for the '<em><b>Instantiated Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_INSTANCE__INSTANTIATED_PARAMETER = eINSTANCE.getParameterInstance_InstantiatedParameter();

		/**
		 * The meta object literal for the '<em><b>Owning Function</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_INSTANCE__OWNING_FUNCTION = eINSTANCE.getParameterInstance_OwningFunction();

		/**
		 * The meta object literal for the '<em><b>Referencing Functions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_INSTANCE__REFERENCING_FUNCTIONS = eINSTANCE.getParameterInstance_ReferencingFunctions();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.SignalInstanceImpl <em>Signal Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.SignalInstanceImpl
		 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.Function_instance_modelPackageImpl#getSignalInstance()
		 * @generated
		 */
		EClass SIGNAL_INSTANCE = eINSTANCE.getSignalInstance();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNAL_INSTANCE__SIZE = eINSTANCE.getSignalInstance_Size();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_INSTANCE__DESTINATION = eINSTANCE.getSignalInstance_Destination();

		/**
		 * The meta object literal for the '<em><b>Instantiated Signal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_INSTANCE__INSTANTIATED_SIGNAL = eINSTANCE.getSignalInstance_InstantiatedSignal();

		/**
		 * The meta object literal for the '<em><b>Passive Deployments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_INSTANCE__PASSIVE_DEPLOYMENTS = eINSTANCE.getSignalInstance_PassiveDeployments();

		/**
		 * The meta object literal for the '<em><b>Deployers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_INSTANCE__DEPLOYERS = eINSTANCE.getSignalInstance_Deployers();

		/**
		 * The meta object literal for the '<em><b>Outgoing Exchangers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_INSTANCE__OUTGOING_EXCHANGERS = eINSTANCE.getSignalInstance_OutgoingExchangers();

		/**
		 * The meta object literal for the '<em><b>Incoming Exchangers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_INSTANCE__INCOMING_EXCHANGERS = eINSTANCE.getSignalInstance_IncomingExchangers();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_INSTANCE__SOURCE = eINSTANCE.getSignalInstance_Source();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.SignalInstanceTargetImpl <em>Signal Instance Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.SignalInstanceTargetImpl
		 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.Function_instance_modelPackageImpl#getSignalInstanceTarget()
		 * @generated
		 */
		EClass SIGNAL_INSTANCE_TARGET = eINSTANCE.getSignalInstanceTarget();

		/**
		 * The meta object literal for the '<em><b>Incoming Signals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_INSTANCE_TARGET__INCOMING_SIGNALS = eINSTANCE.getSignalInstanceTarget_IncomingSignals();

		/**
		 * The meta object literal for the '<em><b>Outgoing Signals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_INSTANCE_TARGET__OUTGOING_SIGNALS = eINSTANCE.getSignalInstanceTarget_OutgoingSignals();

	}

} //Function_instance_modelPackage
