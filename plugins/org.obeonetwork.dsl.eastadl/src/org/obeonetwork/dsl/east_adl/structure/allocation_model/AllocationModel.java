/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.allocation_model;

import org.eclipse.emf.common.util.EList;

import org.obeonetwork.dsl.east_adl.core.EASTADLArtifact;

import org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstanceModel;

import org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allocation Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity gathers the description of all design choices related to allocation of function instances to a platform model.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.AllocationModel#getFrames <em>Frames</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.AllocationModel#getTasks <em>Tasks</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.AllocationModel#getCommunicationBuffers <em>Communication Buffers</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.AllocationModel#getPlatformModel <em>Platform Model</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.AllocationModel#getInstanceModel <em>Instance Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.Allocation_modelPackage#getAllocationModel()
 * @model
 * @generated
 */
public interface AllocationModel extends EASTADLArtifact {
	/**
	 * Returns the value of the '<em><b>Frames</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.allocation_model.Frame}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.Frame#getOwningArtifact <em>Owning Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the list of all frames defined within this model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Frames</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.Allocation_modelPackage#getAllocationModel_Frames()
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.Frame#getOwningArtifact
	 * @model opposite="owningArtifact" containment="true"
	 * @generated
	 */
	EList<Frame> getFrames();

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.allocation_model.OSTask}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.OSTask#getOwningArtifact <em>Owning Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the list of all OS tasks defined within this model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.Allocation_modelPackage#getAllocationModel_Tasks()
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.OSTask#getOwningArtifact
	 * @model opposite="owningArtifact" containment="true"
	 * @generated
	 */
	EList<OSTask> getTasks();

	/**
	 * Returns the value of the '<em><b>Communication Buffers</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.allocation_model.CommunicationBuffer}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.CommunicationBuffer#getOwningArtifact <em>Owning Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the list of all communication buffers defined within this model. They are used for the communication between logical clusters on the same ecu, as implied by the allocation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Communication Buffers</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.Allocation_modelPackage#getAllocationModel_CommunicationBuffers()
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.CommunicationBuffer#getOwningArtifact
	 * @model opposite="owningArtifact" containment="true"
	 * @generated
	 */
	EList<CommunicationBuffer> getCommunicationBuffers();

	/**
	 * Returns the value of the '<em><b>Platform Model</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel#getAllocationModel <em>Allocation Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the model providing platform entities.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Platform Model</em>' reference.
	 * @see #setPlatformModel(PlatformModel)
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.Allocation_modelPackage#getAllocationModel_PlatformModel()
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel#getAllocationModel
	 * @model opposite="allocationModel"
	 * @generated
	 */
	PlatformModel getPlatformModel();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.AllocationModel#getPlatformModel <em>Platform Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Platform Model</em>' reference.
	 * @see #getPlatformModel()
	 * @generated
	 */
	void setPlatformModel(PlatformModel value);

	/**
	 * Returns the value of the '<em><b>Instance Model</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstanceModel#getAllocationModel <em>Allocation Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the instantiation model providing function and signal instances..
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instance Model</em>' reference.
	 * @see #setInstanceModel(FunctionInstanceModel)
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.Allocation_modelPackage#getAllocationModel_InstanceModel()
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstanceModel#getAllocationModel
	 * @model opposite="allocationModel"
	 * @generated
	 */
	FunctionInstanceModel getInstanceModel();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.AllocationModel#getInstanceModel <em>Instance Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Model</em>' reference.
	 * @see #getInstanceModel()
	 * @generated
	 */
	void setInstanceModel(FunctionInstanceModel value);

} // AllocationModel
