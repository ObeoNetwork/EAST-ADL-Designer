/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.common.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.obeonetwork.dsl.east_adl.core.impl.EASTADLEntityImpl;

import org.obeonetwork.dsl.east_adl.structure.common.CommonPackage;
import org.obeonetwork.dsl.east_adl.structure.common.OperationCall;
import org.obeonetwork.dsl.east_adl.structure.common.OperationFunctionPortInterface;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.impl.OperationCallImpl#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.impl.OperationCallImpl#getEmitter <em>Emitter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationCallImpl extends EASTADLEntityImpl implements OperationCall {
	/**
	 * The cached value of the '{@link #getReceiver() <em>Receiver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiver()
	 * @generated
	 * @ordered
	 */
	protected OperationFunctionPortInterface receiver;

	/**
	 * The cached value of the '{@link #getEmitter() <em>Emitter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmitter()
	 * @generated
	 * @ordered
	 */
	protected OperationFunctionPortInterface emitter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.OPERATION_CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationFunctionPortInterface getReceiver() {
		if (receiver != null && receiver.eIsProxy()) {
			InternalEObject oldReceiver = (InternalEObject)receiver;
			receiver = (OperationFunctionPortInterface)eResolveProxy(oldReceiver);
			if (receiver != oldReceiver) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonPackage.OPERATION_CALL__RECEIVER, oldReceiver, receiver));
			}
		}
		return receiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationFunctionPortInterface basicGetReceiver() {
		return receiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReceiver(OperationFunctionPortInterface newReceiver, NotificationChain msgs) {
		OperationFunctionPortInterface oldReceiver = receiver;
		receiver = newReceiver;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommonPackage.OPERATION_CALL__RECEIVER, oldReceiver, newReceiver);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceiver(OperationFunctionPortInterface newReceiver) {
		if (newReceiver != receiver) {
			NotificationChain msgs = null;
			if (receiver != null)
				msgs = ((InternalEObject)receiver).eInverseRemove(this, CommonPackage.OPERATION_FUNCTION_PORT_INTERFACE__RECEIVED_CALLS, OperationFunctionPortInterface.class, msgs);
			if (newReceiver != null)
				msgs = ((InternalEObject)newReceiver).eInverseAdd(this, CommonPackage.OPERATION_FUNCTION_PORT_INTERFACE__RECEIVED_CALLS, OperationFunctionPortInterface.class, msgs);
			msgs = basicSetReceiver(newReceiver, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.OPERATION_CALL__RECEIVER, newReceiver, newReceiver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationFunctionPortInterface getEmitter() {
		if (emitter != null && emitter.eIsProxy()) {
			InternalEObject oldEmitter = (InternalEObject)emitter;
			emitter = (OperationFunctionPortInterface)eResolveProxy(oldEmitter);
			if (emitter != oldEmitter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonPackage.OPERATION_CALL__EMITTER, oldEmitter, emitter));
			}
		}
		return emitter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationFunctionPortInterface basicGetEmitter() {
		return emitter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmitter(OperationFunctionPortInterface newEmitter, NotificationChain msgs) {
		OperationFunctionPortInterface oldEmitter = emitter;
		emitter = newEmitter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommonPackage.OPERATION_CALL__EMITTER, oldEmitter, newEmitter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmitter(OperationFunctionPortInterface newEmitter) {
		if (newEmitter != emitter) {
			NotificationChain msgs = null;
			if (emitter != null)
				msgs = ((InternalEObject)emitter).eInverseRemove(this, CommonPackage.OPERATION_FUNCTION_PORT_INTERFACE__EMITED_CALLS, OperationFunctionPortInterface.class, msgs);
			if (newEmitter != null)
				msgs = ((InternalEObject)newEmitter).eInverseAdd(this, CommonPackage.OPERATION_FUNCTION_PORT_INTERFACE__EMITED_CALLS, OperationFunctionPortInterface.class, msgs);
			msgs = basicSetEmitter(newEmitter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.OPERATION_CALL__EMITTER, newEmitter, newEmitter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommonPackage.OPERATION_CALL__RECEIVER:
				if (receiver != null)
					msgs = ((InternalEObject)receiver).eInverseRemove(this, CommonPackage.OPERATION_FUNCTION_PORT_INTERFACE__RECEIVED_CALLS, OperationFunctionPortInterface.class, msgs);
				return basicSetReceiver((OperationFunctionPortInterface)otherEnd, msgs);
			case CommonPackage.OPERATION_CALL__EMITTER:
				if (emitter != null)
					msgs = ((InternalEObject)emitter).eInverseRemove(this, CommonPackage.OPERATION_FUNCTION_PORT_INTERFACE__EMITED_CALLS, OperationFunctionPortInterface.class, msgs);
				return basicSetEmitter((OperationFunctionPortInterface)otherEnd, msgs);
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
			case CommonPackage.OPERATION_CALL__RECEIVER:
				return basicSetReceiver(null, msgs);
			case CommonPackage.OPERATION_CALL__EMITTER:
				return basicSetEmitter(null, msgs);
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
			case CommonPackage.OPERATION_CALL__RECEIVER:
				if (resolve) return getReceiver();
				return basicGetReceiver();
			case CommonPackage.OPERATION_CALL__EMITTER:
				if (resolve) return getEmitter();
				return basicGetEmitter();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CommonPackage.OPERATION_CALL__RECEIVER:
				setReceiver((OperationFunctionPortInterface)newValue);
				return;
			case CommonPackage.OPERATION_CALL__EMITTER:
				setEmitter((OperationFunctionPortInterface)newValue);
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
			case CommonPackage.OPERATION_CALL__RECEIVER:
				setReceiver((OperationFunctionPortInterface)null);
				return;
			case CommonPackage.OPERATION_CALL__EMITTER:
				setEmitter((OperationFunctionPortInterface)null);
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
			case CommonPackage.OPERATION_CALL__RECEIVER:
				return receiver != null;
			case CommonPackage.OPERATION_CALL__EMITTER:
				return emitter != null;
		}
		return super.eIsSet(featureID);
	}

} //OperationCallImpl
