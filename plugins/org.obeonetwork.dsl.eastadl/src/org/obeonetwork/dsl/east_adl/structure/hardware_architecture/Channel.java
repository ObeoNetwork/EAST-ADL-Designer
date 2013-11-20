/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.hardware_architecture;

import org.eclipse.emf.common.util.EList;

import org.obeonetwork.dsl.east_adl.structure.allocation_model.Frame;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Channel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is the basic entity for creating communication connections between hardware entities.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Channel#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Channel#getChannelType <em>Channel Type</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Channel#getConnectedSensors <em>Connected Sensors</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Channel#getConnectedActuators <em>Connected Actuators</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Channel#getConnectedECUs <em>Connected EC Us</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Channel#getFrames <em>Frames</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage#getChannel()
 * @model
 * @generated
 */
public interface Channel extends HardwareEntity {
	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the protocol used for the channel.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see #setProtocol(String)
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage#getChannel_Protocol()
	 * @model
	 * @generated
	 */
	String getProtocol();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Channel#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(String value);

	/**
	 * Returns the value of the '<em><b>Channel Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ChannelKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the type of the channel.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Channel Type</em>' attribute.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ChannelKind
	 * @see #setChannelType(ChannelKind)
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage#getChannel_ChannelType()
	 * @model
	 * @generated
	 */
	ChannelKind getChannelType();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Channel#getChannelType <em>Channel Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channel Type</em>' attribute.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ChannelKind
	 * @see #getChannelType()
	 * @generated
	 */
	void setChannelType(ChannelKind value);

	/**
	 * Returns the value of the '<em><b>Connected Sensors</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Sensor}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Sensor#getChannels <em>Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are all connected sensors.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connected Sensors</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage#getChannel_ConnectedSensors()
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Sensor#getChannels
	 * @model opposite="channels"
	 * @generated
	 */
	EList<Sensor> getConnectedSensors();

	/**
	 * Returns the value of the '<em><b>Connected Actuators</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Actuator}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Actuator#getChannels <em>Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are all connected actuators.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connected Actuators</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage#getChannel_ConnectedActuators()
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Actuator#getChannels
	 * @model opposite="channels"
	 * @generated
	 */
	EList<Actuator> getConnectedActuators();

	/**
	 * Returns the value of the '<em><b>Connected EC Us</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ECU}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ECU#getChannels <em>Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are all connected ECUs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connected EC Us</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage#getChannel_ConnectedECUs()
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ECU#getChannels
	 * @model opposite="channels"
	 * @generated
	 */
	EList<ECU> getConnectedECUs();

	/**
	 * Returns the value of the '<em><b>Frames</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.allocation_model.Frame}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.Frame#getSendingChannel <em>Sending Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are frames send by this channel.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Frames</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage#getChannel_Frames()
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.Frame#getSendingChannel
	 * @model opposite="sendingChannel"
	 * @generated
	 */
	EList<Frame> getFrames();

} // Channel
