/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.allocation_model;

import org.eclipse.emf.common.util.EList;

import org.obeonetwork.dsl.east_adl.core.EASTADLEntity;

import org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Buffer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is the memory area used for data exchange between function instances allocated to separate logical clusters.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.CommunicationBuffer#getOwningArtifact <em>Owning Artifact</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.CommunicationBuffer#getSize <em>Size</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.CommunicationBuffer#getDeployments <em>Deployments</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.CommunicationBuffer#getDeployedSignalInstances <em>Deployed Signal Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.Allocation_modelPackage#getCommunicationBuffer()
 * @model
 * @generated
 */
public interface CommunicationBuffer extends EASTADLEntity {
	/**
	 * Returns the value of the '<em><b>Owning Artifact</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.AllocationModel#getCommunicationBuffers <em>Communication Buffers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the artifact to which this communication buffer belongs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Artifact</em>' container reference.
	 * @see #setOwningArtifact(AllocationModel)
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.Allocation_modelPackage#getCommunicationBuffer_OwningArtifact()
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.AllocationModel#getCommunicationBuffers
	 * @model opposite="communicationBuffers" required="true" transient="false"
	 * @generated
	 */
	AllocationModel getOwningArtifact();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.CommunicationBuffer#getOwningArtifact <em>Owning Artifact</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Artifact</em>' container reference.
	 * @see #getOwningArtifact()
	 * @generated
	 */
	void setOwningArtifact(AllocationModel value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the size of this buffer in bits.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.Allocation_modelPackage#getCommunicationBuffer_Size()
	 * @model annotation="http://www.topcased.org/documentation documentation='Maybe I ll make a slightly different implementation in future releases.'"
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.CommunicationBuffer#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

	/**
	 * Returns the value of the '<em><b>Deployments</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.allocation_model.SignalDeployment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are signal deploymetns deployed through this buffer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deployments</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.Allocation_modelPackage#getCommunicationBuffer_Deployments()
	 * @model containment="true"
	 * @generated
	 */
	EList<SignalDeployment> getDeployments();

	/**
	 * Returns the value of the '<em><b>Deployed Signal Instances</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is a derived property used to show all signals deployed by this entity (if any).
	 * This property will be shown instead of the corresponding deployment model objects because it is more explicit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deployed Signal Instances</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.Allocation_modelPackage#getCommunicationBuffer_DeployedSignalInstances()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<SignalInstance> getDeployedSignalInstances();

} // CommunicationBuffer
