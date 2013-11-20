/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.common.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.east_adl.core.impl.EASTADLEntityImpl;

import org.obeonetwork.dsl.east_adl.requirements.TimingRestriction;

import org.obeonetwork.dsl.east_adl.structure.common.CommonPackage;
import org.obeonetwork.dsl.east_adl.structure.common.ConnectorSignal;
import org.obeonetwork.dsl.east_adl.structure.common.DesignDataType;
import org.obeonetwork.dsl.east_adl.structure.common.SignalFunctionPortInterface;

import org.obeonetwork.dsl.east_adl.structure.function_instance_model.Function_instance_modelPackage;
import org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector Signal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.impl.ConnectorSignalImpl#getEmitter <em>Emitter</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.impl.ConnectorSignalImpl#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.impl.ConnectorSignalImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.impl.ConnectorSignalImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.impl.ConnectorSignalImpl#getInstances <em>Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectorSignalImpl extends EASTADLEntityImpl implements ConnectorSignal {
	/**
	 * The cached value of the '{@link #getEmitter() <em>Emitter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmitter()
	 * @generated
	 * @ordered
	 */
	protected SignalFunctionPortInterface emitter;

	/**
	 * The cached value of the '{@link #getReceiver() <em>Receiver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiver()
	 * @generated
	 * @ordered
	 */
	protected SignalFunctionPortInterface receiver;

	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected DesignDataType dataType;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected TimingRestriction period;

	/**
	 * The cached value of the '{@link #getInstances() <em>Instances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<SignalInstance> instances;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorSignalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.CONNECTOR_SIGNAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalFunctionPortInterface getEmitter() {
		if (emitter != null && emitter.eIsProxy()) {
			InternalEObject oldEmitter = (InternalEObject)emitter;
			emitter = (SignalFunctionPortInterface)eResolveProxy(oldEmitter);
			if (emitter != oldEmitter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonPackage.CONNECTOR_SIGNAL__EMITTER, oldEmitter, emitter));
			}
		}
		return emitter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalFunctionPortInterface basicGetEmitter() {
		return emitter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmitter(SignalFunctionPortInterface newEmitter, NotificationChain msgs) {
		SignalFunctionPortInterface oldEmitter = emitter;
		emitter = newEmitter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommonPackage.CONNECTOR_SIGNAL__EMITTER, oldEmitter, newEmitter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmitter(SignalFunctionPortInterface newEmitter) {
		if (newEmitter != emitter) {
			NotificationChain msgs = null;
			if (emitter != null)
				msgs = ((InternalEObject)emitter).eInverseRemove(this, CommonPackage.SIGNAL_FUNCTION_PORT_INTERFACE__EMITED_SIGNALS, SignalFunctionPortInterface.class, msgs);
			if (newEmitter != null)
				msgs = ((InternalEObject)newEmitter).eInverseAdd(this, CommonPackage.SIGNAL_FUNCTION_PORT_INTERFACE__EMITED_SIGNALS, SignalFunctionPortInterface.class, msgs);
			msgs = basicSetEmitter(newEmitter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.CONNECTOR_SIGNAL__EMITTER, newEmitter, newEmitter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalFunctionPortInterface getReceiver() {
		if (receiver != null && receiver.eIsProxy()) {
			InternalEObject oldReceiver = (InternalEObject)receiver;
			receiver = (SignalFunctionPortInterface)eResolveProxy(oldReceiver);
			if (receiver != oldReceiver) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonPackage.CONNECTOR_SIGNAL__RECEIVER, oldReceiver, receiver));
			}
		}
		return receiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalFunctionPortInterface basicGetReceiver() {
		return receiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReceiver(SignalFunctionPortInterface newReceiver, NotificationChain msgs) {
		SignalFunctionPortInterface oldReceiver = receiver;
		receiver = newReceiver;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommonPackage.CONNECTOR_SIGNAL__RECEIVER, oldReceiver, newReceiver);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceiver(SignalFunctionPortInterface newReceiver) {
		if (newReceiver != receiver) {
			NotificationChain msgs = null;
			if (receiver != null)
				msgs = ((InternalEObject)receiver).eInverseRemove(this, CommonPackage.SIGNAL_FUNCTION_PORT_INTERFACE__RECEIVED_SIGNALS, SignalFunctionPortInterface.class, msgs);
			if (newReceiver != null)
				msgs = ((InternalEObject)newReceiver).eInverseAdd(this, CommonPackage.SIGNAL_FUNCTION_PORT_INTERFACE__RECEIVED_SIGNALS, SignalFunctionPortInterface.class, msgs);
			msgs = basicSetReceiver(newReceiver, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.CONNECTOR_SIGNAL__RECEIVER, newReceiver, newReceiver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignDataType getDataType() {
		if (dataType != null && dataType.eIsProxy()) {
			InternalEObject oldDataType = (InternalEObject)dataType;
			dataType = (DesignDataType)eResolveProxy(oldDataType);
			if (dataType != oldDataType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonPackage.CONNECTOR_SIGNAL__DATA_TYPE, oldDataType, dataType));
			}
		}
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignDataType basicGetDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataType(DesignDataType newDataType, NotificationChain msgs) {
		DesignDataType oldDataType = dataType;
		dataType = newDataType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommonPackage.CONNECTOR_SIGNAL__DATA_TYPE, oldDataType, newDataType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataType(DesignDataType newDataType) {
		if (newDataType != dataType) {
			NotificationChain msgs = null;
			if (dataType != null)
				msgs = ((InternalEObject)dataType).eInverseRemove(this, CommonPackage.DESIGN_DATA_TYPE__TYPED_SIGNALS, DesignDataType.class, msgs);
			if (newDataType != null)
				msgs = ((InternalEObject)newDataType).eInverseAdd(this, CommonPackage.DESIGN_DATA_TYPE__TYPED_SIGNALS, DesignDataType.class, msgs);
			msgs = basicSetDataType(newDataType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.CONNECTOR_SIGNAL__DATA_TYPE, newDataType, newDataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingRestriction getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriod(TimingRestriction newPeriod, NotificationChain msgs) {
		TimingRestriction oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommonPackage.CONNECTOR_SIGNAL__PERIOD, oldPeriod, newPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(TimingRestriction newPeriod) {
		if (newPeriod != period) {
			NotificationChain msgs = null;
			if (period != null)
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommonPackage.CONNECTOR_SIGNAL__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommonPackage.CONNECTOR_SIGNAL__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.CONNECTOR_SIGNAL__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SignalInstance> getInstances() {
		if (instances == null) {
			instances = new EObjectWithInverseResolvingEList<SignalInstance>(SignalInstance.class, this, CommonPackage.CONNECTOR_SIGNAL__INSTANCES, Function_instance_modelPackage.SIGNAL_INSTANCE__INSTANTIATED_SIGNAL);
		}
		return instances;
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
			case CommonPackage.CONNECTOR_SIGNAL__EMITTER:
				if (emitter != null)
					msgs = ((InternalEObject)emitter).eInverseRemove(this, CommonPackage.SIGNAL_FUNCTION_PORT_INTERFACE__EMITED_SIGNALS, SignalFunctionPortInterface.class, msgs);
				return basicSetEmitter((SignalFunctionPortInterface)otherEnd, msgs);
			case CommonPackage.CONNECTOR_SIGNAL__RECEIVER:
				if (receiver != null)
					msgs = ((InternalEObject)receiver).eInverseRemove(this, CommonPackage.SIGNAL_FUNCTION_PORT_INTERFACE__RECEIVED_SIGNALS, SignalFunctionPortInterface.class, msgs);
				return basicSetReceiver((SignalFunctionPortInterface)otherEnd, msgs);
			case CommonPackage.CONNECTOR_SIGNAL__DATA_TYPE:
				if (dataType != null)
					msgs = ((InternalEObject)dataType).eInverseRemove(this, CommonPackage.DESIGN_DATA_TYPE__TYPED_SIGNALS, DesignDataType.class, msgs);
				return basicSetDataType((DesignDataType)otherEnd, msgs);
			case CommonPackage.CONNECTOR_SIGNAL__INSTANCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInstances()).basicAdd(otherEnd, msgs);
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
			case CommonPackage.CONNECTOR_SIGNAL__EMITTER:
				return basicSetEmitter(null, msgs);
			case CommonPackage.CONNECTOR_SIGNAL__RECEIVER:
				return basicSetReceiver(null, msgs);
			case CommonPackage.CONNECTOR_SIGNAL__DATA_TYPE:
				return basicSetDataType(null, msgs);
			case CommonPackage.CONNECTOR_SIGNAL__PERIOD:
				return basicSetPeriod(null, msgs);
			case CommonPackage.CONNECTOR_SIGNAL__INSTANCES:
				return ((InternalEList<?>)getInstances()).basicRemove(otherEnd, msgs);
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
			case CommonPackage.CONNECTOR_SIGNAL__EMITTER:
				if (resolve) return getEmitter();
				return basicGetEmitter();
			case CommonPackage.CONNECTOR_SIGNAL__RECEIVER:
				if (resolve) return getReceiver();
				return basicGetReceiver();
			case CommonPackage.CONNECTOR_SIGNAL__DATA_TYPE:
				if (resolve) return getDataType();
				return basicGetDataType();
			case CommonPackage.CONNECTOR_SIGNAL__PERIOD:
				return getPeriod();
			case CommonPackage.CONNECTOR_SIGNAL__INSTANCES:
				return getInstances();
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
			case CommonPackage.CONNECTOR_SIGNAL__EMITTER:
				setEmitter((SignalFunctionPortInterface)newValue);
				return;
			case CommonPackage.CONNECTOR_SIGNAL__RECEIVER:
				setReceiver((SignalFunctionPortInterface)newValue);
				return;
			case CommonPackage.CONNECTOR_SIGNAL__DATA_TYPE:
				setDataType((DesignDataType)newValue);
				return;
			case CommonPackage.CONNECTOR_SIGNAL__PERIOD:
				setPeriod((TimingRestriction)newValue);
				return;
			case CommonPackage.CONNECTOR_SIGNAL__INSTANCES:
				getInstances().clear();
				getInstances().addAll((Collection<? extends SignalInstance>)newValue);
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
			case CommonPackage.CONNECTOR_SIGNAL__EMITTER:
				setEmitter((SignalFunctionPortInterface)null);
				return;
			case CommonPackage.CONNECTOR_SIGNAL__RECEIVER:
				setReceiver((SignalFunctionPortInterface)null);
				return;
			case CommonPackage.CONNECTOR_SIGNAL__DATA_TYPE:
				setDataType((DesignDataType)null);
				return;
			case CommonPackage.CONNECTOR_SIGNAL__PERIOD:
				setPeriod((TimingRestriction)null);
				return;
			case CommonPackage.CONNECTOR_SIGNAL__INSTANCES:
				getInstances().clear();
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
			case CommonPackage.CONNECTOR_SIGNAL__EMITTER:
				return emitter != null;
			case CommonPackage.CONNECTOR_SIGNAL__RECEIVER:
				return receiver != null;
			case CommonPackage.CONNECTOR_SIGNAL__DATA_TYPE:
				return dataType != null;
			case CommonPackage.CONNECTOR_SIGNAL__PERIOD:
				return period != null;
			case CommonPackage.CONNECTOR_SIGNAL__INSTANCES:
				return instances != null && !instances.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConnectorSignalImpl
