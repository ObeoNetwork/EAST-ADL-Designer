/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.east_adl.structure.allocation_model.Allocation_modelPackage;
import org.obeonetwork.dsl.east_adl.structure.allocation_model.Frame;

import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Actuator;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Channel;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ChannelKind;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ECU;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Sensor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Channel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.ChannelImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.ChannelImpl#getChannelType <em>Channel Type</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.ChannelImpl#getConnectedSensors <em>Connected Sensors</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.ChannelImpl#getConnectedActuators <em>Connected Actuators</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.ChannelImpl#getConnectedECUs <em>Connected EC Us</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.ChannelImpl#getFrames <em>Frames</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChannelImpl extends HardwareEntityImpl implements Channel {
	/**
	 * The default value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final String PROTOCOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected String protocol = PROTOCOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getChannelType() <em>Channel Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannelType()
	 * @generated
	 * @ordered
	 */
	protected static final ChannelKind CHANNEL_TYPE_EDEFAULT = ChannelKind.MOST;

	/**
	 * The cached value of the '{@link #getChannelType() <em>Channel Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannelType()
	 * @generated
	 * @ordered
	 */
	protected ChannelKind channelType = CHANNEL_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConnectedSensors() <em>Connected Sensors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectedSensors()
	 * @generated
	 * @ordered
	 */
	protected EList<Sensor> connectedSensors;

	/**
	 * The cached value of the '{@link #getConnectedActuators() <em>Connected Actuators</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectedActuators()
	 * @generated
	 * @ordered
	 */
	protected EList<Actuator> connectedActuators;

	/**
	 * The cached value of the '{@link #getConnectedECUs() <em>Connected EC Us</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectedECUs()
	 * @generated
	 * @ordered
	 */
	protected EList<ECU> connectedECUs;

	/**
	 * The cached value of the '{@link #getFrames() <em>Frames</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrames()
	 * @generated
	 * @ordered
	 */
	protected EList<Frame> frames;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChannelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hardware_architecturePackage.Literals.CHANNEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProtocol() {
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocol(String newProtocol) {
		String oldProtocol = protocol;
		protocol = newProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hardware_architecturePackage.CHANNEL__PROTOCOL, oldProtocol, protocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChannelKind getChannelType() {
		return channelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChannelType(ChannelKind newChannelType) {
		ChannelKind oldChannelType = channelType;
		channelType = newChannelType == null ? CHANNEL_TYPE_EDEFAULT : newChannelType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hardware_architecturePackage.CHANNEL__CHANNEL_TYPE, oldChannelType, channelType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sensor> getConnectedSensors() {
		if (connectedSensors == null) {
			connectedSensors = new EObjectWithInverseResolvingEList.ManyInverse<Sensor>(Sensor.class, this, Hardware_architecturePackage.CHANNEL__CONNECTED_SENSORS, Hardware_architecturePackage.SENSOR__CHANNELS);
		}
		return connectedSensors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actuator> getConnectedActuators() {
		if (connectedActuators == null) {
			connectedActuators = new EObjectWithInverseResolvingEList.ManyInverse<Actuator>(Actuator.class, this, Hardware_architecturePackage.CHANNEL__CONNECTED_ACTUATORS, Hardware_architecturePackage.ACTUATOR__CHANNELS);
		}
		return connectedActuators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ECU> getConnectedECUs() {
		if (connectedECUs == null) {
			connectedECUs = new EObjectWithInverseResolvingEList.ManyInverse<ECU>(ECU.class, this, Hardware_architecturePackage.CHANNEL__CONNECTED_EC_US, Hardware_architecturePackage.ECU__CHANNELS);
		}
		return connectedECUs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Frame> getFrames() {
		if (frames == null) {
			frames = new EObjectWithInverseResolvingEList<Frame>(Frame.class, this, Hardware_architecturePackage.CHANNEL__FRAMES, Allocation_modelPackage.FRAME__SENDING_CHANNEL);
		}
		return frames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Hardware_architecturePackage.CHANNEL__CONNECTED_SENSORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnectedSensors()).basicAdd(otherEnd, msgs);
			case Hardware_architecturePackage.CHANNEL__CONNECTED_ACTUATORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnectedActuators()).basicAdd(otherEnd, msgs);
			case Hardware_architecturePackage.CHANNEL__CONNECTED_EC_US:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnectedECUs()).basicAdd(otherEnd, msgs);
			case Hardware_architecturePackage.CHANNEL__FRAMES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFrames()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Hardware_architecturePackage.CHANNEL__CONNECTED_SENSORS:
				return ((InternalEList<?>)getConnectedSensors()).basicRemove(otherEnd, msgs);
			case Hardware_architecturePackage.CHANNEL__CONNECTED_ACTUATORS:
				return ((InternalEList<?>)getConnectedActuators()).basicRemove(otherEnd, msgs);
			case Hardware_architecturePackage.CHANNEL__CONNECTED_EC_US:
				return ((InternalEList<?>)getConnectedECUs()).basicRemove(otherEnd, msgs);
			case Hardware_architecturePackage.CHANNEL__FRAMES:
				return ((InternalEList<?>)getFrames()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Hardware_architecturePackage.CHANNEL__PROTOCOL:
				return getProtocol();
			case Hardware_architecturePackage.CHANNEL__CHANNEL_TYPE:
				return getChannelType();
			case Hardware_architecturePackage.CHANNEL__CONNECTED_SENSORS:
				return getConnectedSensors();
			case Hardware_architecturePackage.CHANNEL__CONNECTED_ACTUATORS:
				return getConnectedActuators();
			case Hardware_architecturePackage.CHANNEL__CONNECTED_EC_US:
				return getConnectedECUs();
			case Hardware_architecturePackage.CHANNEL__FRAMES:
				return getFrames();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Hardware_architecturePackage.CHANNEL__PROTOCOL:
				setProtocol((String)newValue);
				return;
			case Hardware_architecturePackage.CHANNEL__CHANNEL_TYPE:
				setChannelType((ChannelKind)newValue);
				return;
			case Hardware_architecturePackage.CHANNEL__CONNECTED_SENSORS:
				getConnectedSensors().clear();
				getConnectedSensors().addAll((Collection<? extends Sensor>)newValue);
				return;
			case Hardware_architecturePackage.CHANNEL__CONNECTED_ACTUATORS:
				getConnectedActuators().clear();
				getConnectedActuators().addAll((Collection<? extends Actuator>)newValue);
				return;
			case Hardware_architecturePackage.CHANNEL__CONNECTED_EC_US:
				getConnectedECUs().clear();
				getConnectedECUs().addAll((Collection<? extends ECU>)newValue);
				return;
			case Hardware_architecturePackage.CHANNEL__FRAMES:
				getFrames().clear();
				getFrames().addAll((Collection<? extends Frame>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Hardware_architecturePackage.CHANNEL__PROTOCOL:
				setProtocol(PROTOCOL_EDEFAULT);
				return;
			case Hardware_architecturePackage.CHANNEL__CHANNEL_TYPE:
				setChannelType(CHANNEL_TYPE_EDEFAULT);
				return;
			case Hardware_architecturePackage.CHANNEL__CONNECTED_SENSORS:
				getConnectedSensors().clear();
				return;
			case Hardware_architecturePackage.CHANNEL__CONNECTED_ACTUATORS:
				getConnectedActuators().clear();
				return;
			case Hardware_architecturePackage.CHANNEL__CONNECTED_EC_US:
				getConnectedECUs().clear();
				return;
			case Hardware_architecturePackage.CHANNEL__FRAMES:
				getFrames().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Hardware_architecturePackage.CHANNEL__PROTOCOL:
				return PROTOCOL_EDEFAULT == null ? protocol != null : !PROTOCOL_EDEFAULT.equals(protocol);
			case Hardware_architecturePackage.CHANNEL__CHANNEL_TYPE:
				return channelType != CHANNEL_TYPE_EDEFAULT;
			case Hardware_architecturePackage.CHANNEL__CONNECTED_SENSORS:
				return connectedSensors != null && !connectedSensors.isEmpty();
			case Hardware_architecturePackage.CHANNEL__CONNECTED_ACTUATORS:
				return connectedActuators != null && !connectedActuators.isEmpty();
			case Hardware_architecturePackage.CHANNEL__CONNECTED_EC_US:
				return connectedECUs != null && !connectedECUs.isEmpty();
			case Hardware_architecturePackage.CHANNEL__FRAMES:
				return frames != null && !frames.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (protocol: ");
		result.append(protocol);
		result.append(", channelType: ");
		result.append(channelType);
		result.append(')');
		return result.toString();
	}

} //ChannelImpl
