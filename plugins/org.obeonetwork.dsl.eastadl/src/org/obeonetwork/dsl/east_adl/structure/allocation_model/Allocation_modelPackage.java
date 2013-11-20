/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.allocation_model;

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
 * This package contains the entities of the AM artifact (or OA - Operational Architecture). The goal here is to describe the actual allocation of the software to the hardware.
 * <!-- end-model-doc -->
 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.Allocation_modelFactory
 * @model kind="package"
 * @generated
 */
public interface Allocation_modelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "allocation_model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.topcased.org/0.11.0/east_adl/structure/allocation_model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "allocation_model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Allocation_modelPackage eINSTANCE = org.obeonetwork.dsl.east_adl.structure.allocation_model.impl.Allocation_modelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.impl.AllocationModelImpl <em>Allocation Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.impl.AllocationModelImpl
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.impl.Allocation_modelPackageImpl#getAllocationModel()
	 * @generated
	 */
	int ALLOCATION_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_MODEL__NAME = CorePackage.EASTADL_ARTIFACT__NAME;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_MODEL__REQUIREMENTS = CorePackage.EASTADL_ARTIFACT__REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_MODEL__MODEL = CorePackage.EASTADL_ARTIFACT__MODEL;

	/**
	 * The feature id for the '<em><b>Support Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_MODEL__SUPPORT_ENTITIES = CorePackage.EASTADL_ARTIFACT__SUPPORT_ENTITIES;

	/**
	 * The feature id for the '<em><b>Validation Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_MODEL__VALIDATION_ENTITIES = CorePackage.EASTADL_ARTIFACT__VALIDATION_ENTITIES;

	/**
	 * The feature id for the '<em><b>Frames</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_MODEL__FRAMES = CorePackage.EASTADL_ARTIFACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_MODEL__TASKS = CorePackage.EASTADL_ARTIFACT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Communication Buffers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_MODEL__COMMUNICATION_BUFFERS = CorePackage.EASTADL_ARTIFACT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Platform Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_MODEL__PLATFORM_MODEL = CorePackage.EASTADL_ARTIFACT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Instance Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_MODEL__INSTANCE_MODEL = CorePackage.EASTADL_ARTIFACT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Allocation Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_MODEL_FEATURE_COUNT = CorePackage.EASTADL_ARTIFACT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.impl.FrameImpl <em>Frame</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.impl.FrameImpl
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.impl.Allocation_modelPackageImpl#getFrame()
	 * @generated
	 */
	int FRAME = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__NAME = CorePackage.EASTADL_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Passive Assignments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__PASSIVE_ASSIGNMENTS = CorePackage.EASTADL_ENTITY__PASSIVE_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Assigned Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__ASSIGNED_REQUIREMENTS = CorePackage.EASTADL_ENTITY__ASSIGNED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Owning Artifact</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__OWNING_ARTIFACT = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__PERIOD = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__OFFSET = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__SIZE = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Data Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__DATA_SIZE = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__PRIORITY = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Deployments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__DEPLOYMENTS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Deployed Signal Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__DEPLOYED_SIGNAL_INSTANCES = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Sending Channel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__SENDING_CHANNEL = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Frame</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_FEATURE_COUNT = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.impl.OSTaskImpl <em>OS Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.impl.OSTaskImpl
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.impl.Allocation_modelPackageImpl#getOSTask()
	 * @generated
	 */
	int OS_TASK = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TASK__NAME = CorePackage.EASTADL_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Passive Assignments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TASK__PASSIVE_ASSIGNMENTS = CorePackage.EASTADL_ENTITY__PASSIVE_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Assigned Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TASK__ASSIGNED_REQUIREMENTS = CorePackage.EASTADL_ENTITY__ASSIGNED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Owning Artifact</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TASK__OWNING_ARTIFACT = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Trigger Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TASK__TRIGGER_TYPE = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Trigger Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TASK__TRIGGER_EVENT = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TASK__PRIORITY = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Preemptable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TASK__PREEMPTABLE = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TASK__PERIOD = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TASK__OFFSET = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Execution Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TASK__EXECUTION_TIME = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Deployments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TASK__DEPLOYMENTS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Deployed Clusters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TASK__DEPLOYED_CLUSTERS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Executing Processor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TASK__EXECUTING_PROCESSOR = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>OS Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TASK_FEATURE_COUNT = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.impl.CommunicationBufferImpl <em>Communication Buffer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.impl.CommunicationBufferImpl
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.impl.Allocation_modelPackageImpl#getCommunicationBuffer()
	 * @generated
	 */
	int COMMUNICATION_BUFFER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_BUFFER__NAME = CorePackage.EASTADL_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Passive Assignments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_BUFFER__PASSIVE_ASSIGNMENTS = CorePackage.EASTADL_ENTITY__PASSIVE_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Assigned Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_BUFFER__ASSIGNED_REQUIREMENTS = CorePackage.EASTADL_ENTITY__ASSIGNED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Owning Artifact</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_BUFFER__OWNING_ARTIFACT = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_BUFFER__SIZE = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Deployments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_BUFFER__DEPLOYMENTS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Deployed Signal Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_BUFFER__DEPLOYED_SIGNAL_INSTANCES = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Communication Buffer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_BUFFER_FEATURE_COUNT = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.impl.SignalDeploymentImpl <em>Signal Deployment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.impl.SignalDeploymentImpl
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.impl.Allocation_modelPackageImpl#getSignalDeployment()
	 * @generated
	 */
	int SIGNAL_DEPLOYMENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_DEPLOYMENT__NAME = CorePackage.EASTADL_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Passive Assignments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_DEPLOYMENT__PASSIVE_ASSIGNMENTS = CorePackage.EASTADL_ENTITY__PASSIVE_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Assigned Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_DEPLOYMENT__ASSIGNED_REQUIREMENTS = CorePackage.EASTADL_ENTITY__ASSIGNED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Deployed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_DEPLOYMENT__DEPLOYED = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Deployer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_DEPLOYMENT__DEPLOYER = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_DEPLOYMENT__POSITION = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_DEPLOYMENT__OFFSET = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Signal Deployment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_DEPLOYMENT_FEATURE_COUNT = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.impl.FunctionDeploymentImpl <em>Function Deployment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.impl.FunctionDeploymentImpl
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.impl.Allocation_modelPackageImpl#getFunctionDeployment()
	 * @generated
	 */
	int FUNCTION_DEPLOYMENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEPLOYMENT__NAME = CorePackage.EASTADL_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Passive Assignments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEPLOYMENT__PASSIVE_ASSIGNMENTS = CorePackage.EASTADL_ENTITY__PASSIVE_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Assigned Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEPLOYMENT__ASSIGNED_REQUIREMENTS = CorePackage.EASTADL_ENTITY__ASSIGNED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Deployer</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEPLOYMENT__DEPLOYER = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Deployed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEPLOYMENT__DEPLOYED = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Function Deployment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEPLOYMENT_FEATURE_COUNT = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.AllocationModel <em>Allocation Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allocation Model</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.AllocationModel
	 * @generated
	 */
	EClass getAllocationModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.AllocationModel#getFrames <em>Frames</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Frames</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.AllocationModel#getFrames()
	 * @see #getAllocationModel()
	 * @generated
	 */
	EReference getAllocationModel_Frames();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.AllocationModel#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.AllocationModel#getTasks()
	 * @see #getAllocationModel()
	 * @generated
	 */
	EReference getAllocationModel_Tasks();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.AllocationModel#getCommunicationBuffers <em>Communication Buffers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Communication Buffers</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.AllocationModel#getCommunicationBuffers()
	 * @see #getAllocationModel()
	 * @generated
	 */
	EReference getAllocationModel_CommunicationBuffers();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.AllocationModel#getPlatformModel <em>Platform Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Platform Model</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.AllocationModel#getPlatformModel()
	 * @see #getAllocationModel()
	 * @generated
	 */
	EReference getAllocationModel_PlatformModel();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.AllocationModel#getInstanceModel <em>Instance Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instance Model</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.AllocationModel#getInstanceModel()
	 * @see #getAllocationModel()
	 * @generated
	 */
	EReference getAllocationModel_InstanceModel();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.Frame <em>Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Frame</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.Frame
	 * @generated
	 */
	EClass getFrame();

	/**
	 * Returns the meta object for the container reference '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.Frame#getOwningArtifact <em>Owning Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Artifact</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.Frame#getOwningArtifact()
	 * @see #getFrame()
	 * @generated
	 */
	EReference getFrame_OwningArtifact();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.Frame#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Period</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.Frame#getPeriod()
	 * @see #getFrame()
	 * @generated
	 */
	EReference getFrame_Period();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.Frame#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Offset</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.Frame#getOffset()
	 * @see #getFrame()
	 * @generated
	 */
	EReference getFrame_Offset();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.Frame#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.Frame#getSize()
	 * @see #getFrame()
	 * @generated
	 */
	EAttribute getFrame_Size();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.Frame#getDataSize <em>Data Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Size</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.Frame#getDataSize()
	 * @see #getFrame()
	 * @generated
	 */
	EAttribute getFrame_DataSize();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.Frame#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.Frame#getPriority()
	 * @see #getFrame()
	 * @generated
	 */
	EAttribute getFrame_Priority();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.Frame#getDeployments <em>Deployments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deployments</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.Frame#getDeployments()
	 * @see #getFrame()
	 * @generated
	 */
	EReference getFrame_Deployments();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.Frame#getDeployedSignalInstances <em>Deployed Signal Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Deployed Signal Instances</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.Frame#getDeployedSignalInstances()
	 * @see #getFrame()
	 * @generated
	 */
	EReference getFrame_DeployedSignalInstances();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.Frame#getSendingChannel <em>Sending Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sending Channel</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.Frame#getSendingChannel()
	 * @see #getFrame()
	 * @generated
	 */
	EReference getFrame_SendingChannel();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.OSTask <em>OS Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OS Task</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.OSTask
	 * @generated
	 */
	EClass getOSTask();

	/**
	 * Returns the meta object for the container reference '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.OSTask#getOwningArtifact <em>Owning Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Artifact</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.OSTask#getOwningArtifact()
	 * @see #getOSTask()
	 * @generated
	 */
	EReference getOSTask_OwningArtifact();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.OSTask#getTriggerType <em>Trigger Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trigger Type</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.OSTask#getTriggerType()
	 * @see #getOSTask()
	 * @generated
	 */
	EAttribute getOSTask_TriggerType();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.OSTask#getTriggerEvent <em>Trigger Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trigger Event</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.OSTask#getTriggerEvent()
	 * @see #getOSTask()
	 * @generated
	 */
	EAttribute getOSTask_TriggerEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.OSTask#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.OSTask#getPriority()
	 * @see #getOSTask()
	 * @generated
	 */
	EAttribute getOSTask_Priority();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.OSTask#isPreemptable <em>Preemptable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preemptable</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.OSTask#isPreemptable()
	 * @see #getOSTask()
	 * @generated
	 */
	EAttribute getOSTask_Preemptable();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.OSTask#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Period</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.OSTask#getPeriod()
	 * @see #getOSTask()
	 * @generated
	 */
	EReference getOSTask_Period();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.OSTask#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Offset</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.OSTask#getOffset()
	 * @see #getOSTask()
	 * @generated
	 */
	EReference getOSTask_Offset();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.OSTask#getExecutionTime <em>Execution Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Execution Time</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.OSTask#getExecutionTime()
	 * @see #getOSTask()
	 * @generated
	 */
	EReference getOSTask_ExecutionTime();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.OSTask#getDeployments <em>Deployments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deployments</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.OSTask#getDeployments()
	 * @see #getOSTask()
	 * @generated
	 */
	EReference getOSTask_Deployments();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.OSTask#getDeployedClusters <em>Deployed Clusters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Deployed Clusters</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.OSTask#getDeployedClusters()
	 * @see #getOSTask()
	 * @generated
	 */
	EReference getOSTask_DeployedClusters();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.OSTask#getExecutingProcessor <em>Executing Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Executing Processor</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.OSTask#getExecutingProcessor()
	 * @see #getOSTask()
	 * @generated
	 */
	EReference getOSTask_ExecutingProcessor();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.CommunicationBuffer <em>Communication Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Buffer</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.CommunicationBuffer
	 * @generated
	 */
	EClass getCommunicationBuffer();

	/**
	 * Returns the meta object for the container reference '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.CommunicationBuffer#getOwningArtifact <em>Owning Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Artifact</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.CommunicationBuffer#getOwningArtifact()
	 * @see #getCommunicationBuffer()
	 * @generated
	 */
	EReference getCommunicationBuffer_OwningArtifact();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.CommunicationBuffer#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.CommunicationBuffer#getSize()
	 * @see #getCommunicationBuffer()
	 * @generated
	 */
	EAttribute getCommunicationBuffer_Size();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.CommunicationBuffer#getDeployments <em>Deployments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deployments</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.CommunicationBuffer#getDeployments()
	 * @see #getCommunicationBuffer()
	 * @generated
	 */
	EReference getCommunicationBuffer_Deployments();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.CommunicationBuffer#getDeployedSignalInstances <em>Deployed Signal Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Deployed Signal Instances</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.CommunicationBuffer#getDeployedSignalInstances()
	 * @see #getCommunicationBuffer()
	 * @generated
	 */
	EReference getCommunicationBuffer_DeployedSignalInstances();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.SignalDeployment <em>Signal Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Deployment</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.SignalDeployment
	 * @generated
	 */
	EClass getSignalDeployment();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.SignalDeployment#getDeployed <em>Deployed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Deployed</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.SignalDeployment#getDeployed()
	 * @see #getSignalDeployment()
	 * @generated
	 */
	EReference getSignalDeployment_Deployed();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.SignalDeployment#getDeployer <em>Deployer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Deployer</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.SignalDeployment#getDeployer()
	 * @see #getSignalDeployment()
	 * @generated
	 */
	EReference getSignalDeployment_Deployer();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.SignalDeployment#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.SignalDeployment#getPosition()
	 * @see #getSignalDeployment()
	 * @generated
	 */
	EAttribute getSignalDeployment_Position();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.SignalDeployment#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.SignalDeployment#getOffset()
	 * @see #getSignalDeployment()
	 * @generated
	 */
	EAttribute getSignalDeployment_Offset();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.FunctionDeployment <em>Function Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Deployment</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.FunctionDeployment
	 * @generated
	 */
	EClass getFunctionDeployment();

	/**
	 * Returns the meta object for the container reference '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.FunctionDeployment#getDeployer <em>Deployer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Deployer</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.FunctionDeployment#getDeployer()
	 * @see #getFunctionDeployment()
	 * @generated
	 */
	EReference getFunctionDeployment_Deployer();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.FunctionDeployment#getDeployed <em>Deployed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Deployed</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.FunctionDeployment#getDeployed()
	 * @see #getFunctionDeployment()
	 * @generated
	 */
	EReference getFunctionDeployment_Deployed();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Allocation_modelFactory getAllocation_modelFactory();

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
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.impl.AllocationModelImpl <em>Allocation Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.impl.AllocationModelImpl
		 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.impl.Allocation_modelPackageImpl#getAllocationModel()
		 * @generated
		 */
		EClass ALLOCATION_MODEL = eINSTANCE.getAllocationModel();

		/**
		 * The meta object literal for the '<em><b>Frames</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOCATION_MODEL__FRAMES = eINSTANCE.getAllocationModel_Frames();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOCATION_MODEL__TASKS = eINSTANCE.getAllocationModel_Tasks();

		/**
		 * The meta object literal for the '<em><b>Communication Buffers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOCATION_MODEL__COMMUNICATION_BUFFERS = eINSTANCE.getAllocationModel_CommunicationBuffers();

		/**
		 * The meta object literal for the '<em><b>Platform Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOCATION_MODEL__PLATFORM_MODEL = eINSTANCE.getAllocationModel_PlatformModel();

		/**
		 * The meta object literal for the '<em><b>Instance Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOCATION_MODEL__INSTANCE_MODEL = eINSTANCE.getAllocationModel_InstanceModel();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.impl.FrameImpl <em>Frame</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.impl.FrameImpl
		 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.impl.Allocation_modelPackageImpl#getFrame()
		 * @generated
		 */
		EClass FRAME = eINSTANCE.getFrame();

		/**
		 * The meta object literal for the '<em><b>Owning Artifact</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRAME__OWNING_ARTIFACT = eINSTANCE.getFrame_OwningArtifact();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRAME__PERIOD = eINSTANCE.getFrame_Period();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRAME__OFFSET = eINSTANCE.getFrame_Offset();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRAME__SIZE = eINSTANCE.getFrame_Size();

		/**
		 * The meta object literal for the '<em><b>Data Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRAME__DATA_SIZE = eINSTANCE.getFrame_DataSize();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRAME__PRIORITY = eINSTANCE.getFrame_Priority();

		/**
		 * The meta object literal for the '<em><b>Deployments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRAME__DEPLOYMENTS = eINSTANCE.getFrame_Deployments();

		/**
		 * The meta object literal for the '<em><b>Deployed Signal Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRAME__DEPLOYED_SIGNAL_INSTANCES = eINSTANCE.getFrame_DeployedSignalInstances();

		/**
		 * The meta object literal for the '<em><b>Sending Channel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRAME__SENDING_CHANNEL = eINSTANCE.getFrame_SendingChannel();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.impl.OSTaskImpl <em>OS Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.impl.OSTaskImpl
		 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.impl.Allocation_modelPackageImpl#getOSTask()
		 * @generated
		 */
		EClass OS_TASK = eINSTANCE.getOSTask();

		/**
		 * The meta object literal for the '<em><b>Owning Artifact</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OS_TASK__OWNING_ARTIFACT = eINSTANCE.getOSTask_OwningArtifact();

		/**
		 * The meta object literal for the '<em><b>Trigger Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OS_TASK__TRIGGER_TYPE = eINSTANCE.getOSTask_TriggerType();

		/**
		 * The meta object literal for the '<em><b>Trigger Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OS_TASK__TRIGGER_EVENT = eINSTANCE.getOSTask_TriggerEvent();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OS_TASK__PRIORITY = eINSTANCE.getOSTask_Priority();

		/**
		 * The meta object literal for the '<em><b>Preemptable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OS_TASK__PREEMPTABLE = eINSTANCE.getOSTask_Preemptable();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OS_TASK__PERIOD = eINSTANCE.getOSTask_Period();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OS_TASK__OFFSET = eINSTANCE.getOSTask_Offset();

		/**
		 * The meta object literal for the '<em><b>Execution Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OS_TASK__EXECUTION_TIME = eINSTANCE.getOSTask_ExecutionTime();

		/**
		 * The meta object literal for the '<em><b>Deployments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OS_TASK__DEPLOYMENTS = eINSTANCE.getOSTask_Deployments();

		/**
		 * The meta object literal for the '<em><b>Deployed Clusters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OS_TASK__DEPLOYED_CLUSTERS = eINSTANCE.getOSTask_DeployedClusters();

		/**
		 * The meta object literal for the '<em><b>Executing Processor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OS_TASK__EXECUTING_PROCESSOR = eINSTANCE.getOSTask_ExecutingProcessor();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.impl.CommunicationBufferImpl <em>Communication Buffer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.impl.CommunicationBufferImpl
		 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.impl.Allocation_modelPackageImpl#getCommunicationBuffer()
		 * @generated
		 */
		EClass COMMUNICATION_BUFFER = eINSTANCE.getCommunicationBuffer();

		/**
		 * The meta object literal for the '<em><b>Owning Artifact</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_BUFFER__OWNING_ARTIFACT = eINSTANCE.getCommunicationBuffer_OwningArtifact();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_BUFFER__SIZE = eINSTANCE.getCommunicationBuffer_Size();

		/**
		 * The meta object literal for the '<em><b>Deployments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_BUFFER__DEPLOYMENTS = eINSTANCE.getCommunicationBuffer_Deployments();

		/**
		 * The meta object literal for the '<em><b>Deployed Signal Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_BUFFER__DEPLOYED_SIGNAL_INSTANCES = eINSTANCE.getCommunicationBuffer_DeployedSignalInstances();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.impl.SignalDeploymentImpl <em>Signal Deployment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.impl.SignalDeploymentImpl
		 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.impl.Allocation_modelPackageImpl#getSignalDeployment()
		 * @generated
		 */
		EClass SIGNAL_DEPLOYMENT = eINSTANCE.getSignalDeployment();

		/**
		 * The meta object literal for the '<em><b>Deployed</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_DEPLOYMENT__DEPLOYED = eINSTANCE.getSignalDeployment_Deployed();

		/**
		 * The meta object literal for the '<em><b>Deployer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_DEPLOYMENT__DEPLOYER = eINSTANCE.getSignalDeployment_Deployer();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNAL_DEPLOYMENT__POSITION = eINSTANCE.getSignalDeployment_Position();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNAL_DEPLOYMENT__OFFSET = eINSTANCE.getSignalDeployment_Offset();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.impl.FunctionDeploymentImpl <em>Function Deployment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.impl.FunctionDeploymentImpl
		 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.impl.Allocation_modelPackageImpl#getFunctionDeployment()
		 * @generated
		 */
		EClass FUNCTION_DEPLOYMENT = eINSTANCE.getFunctionDeployment();

		/**
		 * The meta object literal for the '<em><b>Deployer</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_DEPLOYMENT__DEPLOYER = eINSTANCE.getFunctionDeployment_Deployer();

		/**
		 * The meta object literal for the '<em><b>Deployed</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_DEPLOYMENT__DEPLOYED = eINSTANCE.getFunctionDeployment_Deployed();

	}

} //Allocation_modelPackage
