/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.allocation_model;

import org.obeonetwork.dsl.east_adl.core.EASTADLEntity;

import org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal Deployment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity is used to assign a signal instance to a frame or link it to a communication buffer. All signal instances will thus be sent inside this frame over the bus the frame is assigned to.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.SignalDeployment#getDeployed <em>Deployed</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.SignalDeployment#getDeployer <em>Deployer</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.SignalDeployment#getPosition <em>Position</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.SignalDeployment#getOffset <em>Offset</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.Allocation_modelPackage#getSignalDeployment()
 * @model
 * @generated
 */
public interface SignalDeployment extends EASTADLEntity {
	/**
	 * Returns the value of the '<em><b>Deployed</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstance#getPassiveDeployments <em>Passive Deployments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the actual signal instance being deployed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deployed</em>' reference.
	 * @see #setDeployed(SignalInstance)
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.Allocation_modelPackage#getSignalDeployment_Deployed()
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstance#getPassiveDeployments
	 * @model opposite="passiveDeployments"
	 * @generated
	 */
	SignalInstance getDeployed();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.SignalDeployment#getDeployed <em>Deployed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployed</em>' reference.
	 * @see #getDeployed()
	 * @generated
	 */
	void setDeployed(SignalInstance value);

	/**
	 * Returns the value of the '<em><b>Deployer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the entity that deploys this signal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deployer</em>' reference.
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.Allocation_modelPackage#getSignalDeployment_Deployer()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EASTADLEntity getDeployer();

	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the address of the signal instance in case it is mapped to memory or the byte position in a frame in case it is mapped to a frame.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #setPosition(int)
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.Allocation_modelPackage#getSignalDeployment_Position()
	 * @model
	 * @generated
	 */
	int getPosition();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.SignalDeployment#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(int value);

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The bit offset within the frame.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Offset</em>' attribute.
	 * @see #setOffset(int)
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.Allocation_modelPackage#getSignalDeployment_Offset()
	 * @model
	 * @generated
	 */
	int getOffset();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.SignalDeployment#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' attribute.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(int value);

} // SignalDeployment
