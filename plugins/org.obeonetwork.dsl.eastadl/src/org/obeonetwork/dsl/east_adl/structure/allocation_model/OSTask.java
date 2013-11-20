/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.allocation_model;

import org.eclipse.emf.common.util.EList;

import org.obeonetwork.dsl.east_adl.core.EASTADLEntity;

import org.obeonetwork.dsl.east_adl.requirements.TimingRestriction;

import org.obeonetwork.dsl.east_adl.structure.common.TriggerKind;

import org.obeonetwork.dsl.east_adl.structure.function_instance_model.LogicalCluster;

import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OS Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity represents an operating system task. It executes the allocated logical clusters in a specified order.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.OSTask#getOwningArtifact <em>Owning Artifact</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.OSTask#getTriggerType <em>Trigger Type</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.OSTask#getTriggerEvent <em>Trigger Event</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.OSTask#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.OSTask#isPreemptable <em>Preemptable</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.OSTask#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.OSTask#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.OSTask#getExecutionTime <em>Execution Time</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.OSTask#getDeployments <em>Deployments</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.OSTask#getDeployedClusters <em>Deployed Clusters</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.OSTask#getExecutingProcessor <em>Executing Processor</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.Allocation_modelPackage#getOSTask()
 * @model
 * @generated
 */
public interface OSTask extends EASTADLEntity {
	/**
	 * Returns the value of the '<em><b>Owning Artifact</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.AllocationModel#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the artifact to which this task belongs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Artifact</em>' container reference.
	 * @see #setOwningArtifact(AllocationModel)
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.Allocation_modelPackage#getOSTask_OwningArtifact()
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.AllocationModel#getTasks
	 * @model opposite="tasks" required="true" transient="false"
	 * @generated
	 */
	AllocationModel getOwningArtifact();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.OSTask#getOwningArtifact <em>Owning Artifact</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Artifact</em>' container reference.
	 * @see #getOwningArtifact()
	 * @generated
	 */
	void setOwningArtifact(AllocationModel value);

	/**
	 * Returns the value of the '<em><b>Trigger Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.obeonetwork.dsl.east_adl.structure.common.TriggerKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute defines the triggering policy of this task.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trigger Type</em>' attribute.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.TriggerKind
	 * @see #setTriggerType(TriggerKind)
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.Allocation_modelPackage#getOSTask_TriggerType()
	 * @model
	 * @generated
	 */
	TriggerKind getTriggerType();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.OSTask#getTriggerType <em>Trigger Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger Type</em>' attribute.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.TriggerKind
	 * @see #getTriggerType()
	 * @generated
	 */
	void setTriggerType(TriggerKind value);

	/**
	 * Returns the value of the '<em><b>Trigger Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the identifier of the interrupt that trigs the task (in case of an event policy).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trigger Event</em>' attribute.
	 * @see #setTriggerEvent(String)
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.Allocation_modelPackage#getOSTask_TriggerEvent()
	 * @model
	 * @generated
	 */
	String getTriggerEvent();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.OSTask#getTriggerEvent <em>Trigger Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger Event</em>' attribute.
	 * @see #getTriggerEvent()
	 * @generated
	 */
	void setTriggerEvent(String value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the priority of the task. It depends on scheduling policies supported by the OS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(int)
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.Allocation_modelPackage#getOSTask_Priority()
	 * @model
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.OSTask#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

	/**
	 * Returns the value of the '<em><b>Preemptable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute tells whether this task is preemptable or not.  It depends on scheduling policies supported by the OS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Preemptable</em>' attribute.
	 * @see #setPreemptable(boolean)
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.Allocation_modelPackage#getOSTask_Preemptable()
	 * @model
	 * @generated
	 */
	boolean isPreemptable();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.OSTask#isPreemptable <em>Preemptable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preemptable</em>' attribute.
	 * @see #isPreemptable()
	 * @generated
	 */
	void setPreemptable(boolean value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the trigger period of this task. It represents the nominal period for periodic execution and expected interarrival time for triggered execution.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(TimingRestriction)
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.Allocation_modelPackage#getOSTask_Period()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimingRestriction getPeriod();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.OSTask#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(TimingRestriction value);

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the offset from the period start time (only for periodic triggering policies).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Offset</em>' containment reference.
	 * @see #setOffset(TimingRestriction)
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.Allocation_modelPackage#getOSTask_Offset()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimingRestriction getOffset();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.OSTask#getOffset <em>Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' containment reference.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(TimingRestriction value);

	/**
	 * Returns the value of the '<em><b>Execution Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the execution time from the start (activation) to completion for the OSTask. It may be approximated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Execution Time</em>' containment reference.
	 * @see #setExecutionTime(TimingRestriction)
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.Allocation_modelPackage#getOSTask_ExecutionTime()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimingRestriction getExecutionTime();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.OSTask#getExecutionTime <em>Execution Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Time</em>' containment reference.
	 * @see #getExecutionTime()
	 * @generated
	 */
	void setExecutionTime(TimingRestriction value);

	/**
	 * Returns the value of the '<em><b>Deployments</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.allocation_model.FunctionDeployment}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.FunctionDeployment#getDeployer <em>Deployer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are all function deployments of this task.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deployments</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.Allocation_modelPackage#getOSTask_Deployments()
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.FunctionDeployment#getDeployer
	 * @model opposite="deployer" containment="true"
	 * @generated
	 */
	EList<FunctionDeployment> getDeployments();

	/**
	 * Returns the value of the '<em><b>Deployed Clusters</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.LogicalCluster}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is a derived property used to show all clusters deployed by this entity (if any).
	 * This property will be shown instead of the corresponding function deployment model objects because it is more explicit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deployed Clusters</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.Allocation_modelPackage#getOSTask_DeployedClusters()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<LogicalCluster> getDeployedClusters();

	/**
	 * Returns the value of the '<em><b>Executing Processor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the processor on which this task is executed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Executing Processor</em>' reference.
	 * @see #setExecutingProcessor(Processor)
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.Allocation_modelPackage#getOSTask_ExecutingProcessor()
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor#getTasks
	 * @model opposite="tasks"
	 * @generated
	 */
	Processor getExecutingProcessor();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.OSTask#getExecutingProcessor <em>Executing Processor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Executing Processor</em>' reference.
	 * @see #getExecutingProcessor()
	 * @generated
	 */
	void setExecutingProcessor(Processor value);

} // OSTask
