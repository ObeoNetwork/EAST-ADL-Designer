/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.function_instance_model;

import org.eclipse.emf.common.util.EList;

import org.obeonetwork.dsl.east_adl.core.EASTADLEntity;

import org.obeonetwork.dsl.east_adl.requirements.TimingRestriction;

import org.obeonetwork.dsl.east_adl.structure.allocation_model.FunctionDeployment;
import org.obeonetwork.dsl.east_adl.structure.allocation_model.OSTask;

import org.obeonetwork.dsl.east_adl.structure.common.TriggerKind;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Cluster</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity consists of one or several function instances with a defined execution order. This is a mappable entity that can be allocated to an OS Task in the AM.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.LogicalCluster#getFunctionInstances <em>Function Instances</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.LogicalCluster#getPassiveDeployments <em>Passive Deployments</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.LogicalCluster#getDeployers <em>Deployers</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.LogicalCluster#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.LogicalCluster#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.LogicalCluster#getTriggerType <em>Trigger Type</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.LogicalCluster#getTriggerEvent <em>Trigger Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.Function_instance_modelPackage#getLogicalCluster()
 * @model
 * @generated
 */
public interface LogicalCluster extends EASTADLEntity, SignalInstanceTarget {
	/**
	 * Returns the value of the '<em><b>Function Instances</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are function instances contained in this cluster.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Function Instances</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.Function_instance_modelPackage#getLogicalCluster_FunctionInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<FunctionInstance> getFunctionInstances();

	/**
	 * Returns the value of the '<em><b>Passive Deployments</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.allocation_model.FunctionDeployment}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.FunctionDeployment#getDeployed <em>Deployed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These represent the tasks deploying this cluster.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Passive Deployments</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.Function_instance_modelPackage#getLogicalCluster_PassiveDeployments()
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.FunctionDeployment#getDeployed
	 * @model opposite="deployed"
	 * @generated
	 */
	EList<FunctionDeployment> getPassiveDeployments();

	/**
	 * Returns the value of the '<em><b>Deployers</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.allocation_model.OSTask}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is a derived property used to show all elements deploying this entity (if any).
	 * This property will be shown instead of the corresponding deployment model objects because it is more explicit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deployers</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.Function_instance_modelPackage#getLogicalCluster_Deployers()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<OSTask> getDeployers();

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the trigger period of a cluster. It defines the nominal period for periodic execution  and expected interarrival time for event triggered execution.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(TimingRestriction)
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.Function_instance_modelPackage#getLogicalCluster_Period()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimingRestriction getPeriod();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.LogicalCluster#getPeriod <em>Period</em>}' containment reference.
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
	 * This is the offset from the period start time. It only applies to periodic trigger type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Offset</em>' containment reference.
	 * @see #setOffset(TimingRestriction)
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.Function_instance_modelPackage#getLogicalCluster_Offset()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimingRestriction getOffset();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.LogicalCluster#getOffset <em>Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' containment reference.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(TimingRestriction value);

	/**
	 * Returns the value of the '<em><b>Trigger Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.obeonetwork.dsl.east_adl.structure.common.TriggerKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute defines the triggering policy of this 
	 * cluster.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trigger Type</em>' attribute.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.TriggerKind
	 * @see #setTriggerType(TriggerKind)
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.Function_instance_modelPackage#getLogicalCluster_TriggerType()
	 * @model
	 * @generated
	 */
	TriggerKind getTriggerType();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.LogicalCluster#getTriggerType <em>Trigger Type</em>}' attribute.
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
	 * This attribute describes the interrupt that trigs the cluster in case of an event trigger type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trigger Event</em>' attribute.
	 * @see #setTriggerEvent(String)
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.Function_instance_modelPackage#getLogicalCluster_TriggerEvent()
	 * @model
	 * @generated
	 */
	String getTriggerEvent();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.LogicalCluster#getTriggerEvent <em>Trigger Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger Event</em>' attribute.
	 * @see #getTriggerEvent()
	 * @generated
	 */
	void setTriggerEvent(String value);

} // LogicalCluster
