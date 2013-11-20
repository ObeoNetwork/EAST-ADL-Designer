/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.allocation_model;

import org.obeonetwork.dsl.east_adl.core.EASTADLEntity;

import org.obeonetwork.dsl.east_adl.structure.function_instance_model.LogicalCluster;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Deployment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity is used to link a logical cluster to a task. The cluster will be executed within the execution of the corresponding task in the specified order.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.FunctionDeployment#getDeployer <em>Deployer</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.FunctionDeployment#getDeployed <em>Deployed</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.Allocation_modelPackage#getFunctionDeployment()
 * @model
 * @generated
 */
public interface FunctionDeployment extends EASTADLEntity {
	/**
	 * Returns the value of the '<em><b>Deployer</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.OSTask#getDeployments <em>Deployments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the task deploying this function.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deployer</em>' container reference.
	 * @see #setDeployer(OSTask)
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.Allocation_modelPackage#getFunctionDeployment_Deployer()
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.OSTask#getDeployments
	 * @model opposite="deployments" required="true" transient="false"
	 * @generated
	 */
	OSTask getDeployer();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.FunctionDeployment#getDeployer <em>Deployer</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployer</em>' container reference.
	 * @see #getDeployer()
	 * @generated
	 */
	void setDeployer(OSTask value);

	/**
	 * Returns the value of the '<em><b>Deployed</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.LogicalCluster#getPassiveDeployments <em>Passive Deployments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the actual logical cluster being deployed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deployed</em>' reference.
	 * @see #setDeployed(LogicalCluster)
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.Allocation_modelPackage#getFunctionDeployment_Deployed()
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.LogicalCluster#getPassiveDeployments
	 * @model opposite="passiveDeployments"
	 * @generated
	 */
	LogicalCluster getDeployed();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.FunctionDeployment#getDeployed <em>Deployed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployed</em>' reference.
	 * @see #getDeployed()
	 * @generated
	 */
	void setDeployed(LogicalCluster value);

} // FunctionDeployment
