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

import org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstance;

import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Channel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Frame</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity describes a physical frame that may be sent over the network. To every frame a set of signal instances will be assigned to.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.Frame#getOwningArtifact <em>Owning Artifact</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.Frame#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.Frame#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.Frame#getSize <em>Size</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.Frame#getDataSize <em>Data Size</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.Frame#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.Frame#getDeployments <em>Deployments</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.Frame#getDeployedSignalInstances <em>Deployed Signal Instances</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.Frame#getSendingChannel <em>Sending Channel</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.Allocation_modelPackage#getFrame()
 * @model
 * @generated
 */
public interface Frame extends EASTADLEntity {
	/**
	 * Returns the value of the '<em><b>Owning Artifact</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.AllocationModel#getFrames <em>Frames</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the artifact to which this frame belongs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Artifact</em>' container reference.
	 * @see #setOwningArtifact(AllocationModel)
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.Allocation_modelPackage#getFrame_OwningArtifact()
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.AllocationModel#getFrames
	 * @model opposite="frames" required="true" transient="false"
	 * @generated
	 */
	AllocationModel getOwningArtifact();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.Frame#getOwningArtifact <em>Owning Artifact</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Artifact</em>' container reference.
	 * @see #getOwningArtifact()
	 * @generated
	 */
	void setOwningArtifact(AllocationModel value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the trigger period of this frame. It represents the nominal period for periodic execution and expected interarrival time for triggered execution.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(TimingRestriction)
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.Allocation_modelPackage#getFrame_Period()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimingRestriction getPeriod();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.Frame#getPeriod <em>Period</em>}' containment reference.
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
	 * This is the offset from the period start time (only for periodic communication policy).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Offset</em>' containment reference.
	 * @see #setOffset(TimingRestriction)
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.Allocation_modelPackage#getFrame_Offset()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimingRestriction getOffset();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.Frame#getOffset <em>Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' containment reference.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(TimingRestriction value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the total length of the frame in bits.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.Allocation_modelPackage#getFrame_Size()
	 * @model
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.Frame#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

	/**
	 * Returns the value of the '<em><b>Data Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the size of the data of this frame in bits.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Size</em>' attribute.
	 * @see #setDataSize(int)
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.Allocation_modelPackage#getFrame_DataSize()
	 * @model
	 * @generated
	 */
	int getDataSize();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.Frame#getDataSize <em>Data Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Size</em>' attribute.
	 * @see #getDataSize()
	 * @generated
	 */
	void setDataSize(int value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the priority of the frame depending on the communication protocol.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(int)
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.Allocation_modelPackage#getFrame_Priority()
	 * @model
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.Frame#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

	/**
	 * Returns the value of the '<em><b>Deployments</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.allocation_model.SignalDeployment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are all the signal deployments deployed within this frame.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deployments</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.Allocation_modelPackage#getFrame_Deployments()
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
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.Allocation_modelPackage#getFrame_DeployedSignalInstances()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<SignalInstance> getDeployedSignalInstances();

	/**
	 * Returns the value of the '<em><b>Sending Channel</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Channel#getFrames <em>Frames</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the channel over which this frame is send.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sending Channel</em>' reference.
	 * @see #setSendingChannel(Channel)
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.Allocation_modelPackage#getFrame_SendingChannel()
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Channel#getFrames
	 * @model opposite="frames"
	 * @generated
	 */
	Channel getSendingChannel();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.Frame#getSendingChannel <em>Sending Channel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sending Channel</em>' reference.
	 * @see #getSendingChannel()
	 * @generated
	 */
	void setSendingChannel(Channel value);

} // Frame
