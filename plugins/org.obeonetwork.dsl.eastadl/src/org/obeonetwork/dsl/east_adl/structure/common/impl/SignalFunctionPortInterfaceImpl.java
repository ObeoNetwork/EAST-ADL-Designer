/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.common.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.east_adl.structure.common.CommonPackage;
import org.obeonetwork.dsl.east_adl.structure.common.ConnectorSignal;
import org.obeonetwork.dsl.east_adl.structure.common.SignalFunctionPortInterface;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signal Function Port Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.impl.SignalFunctionPortInterfaceImpl#getEmitedSignals <em>Emited Signals</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.impl.SignalFunctionPortInterfaceImpl#getReceivedSignals <em>Received Signals</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SignalFunctionPortInterfaceImpl extends FunctionPortInterfaceImpl implements SignalFunctionPortInterface {
	/**
	 * The cached value of the '{@link #getEmitedSignals() <em>Emited Signals</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmitedSignals()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectorSignal> emitedSignals;

	/**
	 * The cached value of the '{@link #getReceivedSignals() <em>Received Signals</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivedSignals()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectorSignal> receivedSignals;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignalFunctionPortInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.SIGNAL_FUNCTION_PORT_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectorSignal> getEmitedSignals() {
		if (emitedSignals == null) {
			emitedSignals = new EObjectWithInverseResolvingEList<ConnectorSignal>(ConnectorSignal.class, this, CommonPackage.SIGNAL_FUNCTION_PORT_INTERFACE__EMITED_SIGNALS, CommonPackage.CONNECTOR_SIGNAL__EMITTER);
		}
		return emitedSignals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectorSignal> getReceivedSignals() {
		if (receivedSignals == null) {
			receivedSignals = new EObjectWithInverseResolvingEList<ConnectorSignal>(ConnectorSignal.class, this, CommonPackage.SIGNAL_FUNCTION_PORT_INTERFACE__RECEIVED_SIGNALS, CommonPackage.CONNECTOR_SIGNAL__RECEIVER);
		}
		return receivedSignals;
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
			case CommonPackage.SIGNAL_FUNCTION_PORT_INTERFACE__EMITED_SIGNALS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEmitedSignals()).basicAdd(otherEnd, msgs);
			case CommonPackage.SIGNAL_FUNCTION_PORT_INTERFACE__RECEIVED_SIGNALS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReceivedSignals()).basicAdd(otherEnd, msgs);
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
			case CommonPackage.SIGNAL_FUNCTION_PORT_INTERFACE__EMITED_SIGNALS:
				return ((InternalEList<?>)getEmitedSignals()).basicRemove(otherEnd, msgs);
			case CommonPackage.SIGNAL_FUNCTION_PORT_INTERFACE__RECEIVED_SIGNALS:
				return ((InternalEList<?>)getReceivedSignals()).basicRemove(otherEnd, msgs);
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
			case CommonPackage.SIGNAL_FUNCTION_PORT_INTERFACE__EMITED_SIGNALS:
				return getEmitedSignals();
			case CommonPackage.SIGNAL_FUNCTION_PORT_INTERFACE__RECEIVED_SIGNALS:
				return getReceivedSignals();
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
			case CommonPackage.SIGNAL_FUNCTION_PORT_INTERFACE__EMITED_SIGNALS:
				getEmitedSignals().clear();
				getEmitedSignals().addAll((Collection<? extends ConnectorSignal>)newValue);
				return;
			case CommonPackage.SIGNAL_FUNCTION_PORT_INTERFACE__RECEIVED_SIGNALS:
				getReceivedSignals().clear();
				getReceivedSignals().addAll((Collection<? extends ConnectorSignal>)newValue);
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
			case CommonPackage.SIGNAL_FUNCTION_PORT_INTERFACE__EMITED_SIGNALS:
				getEmitedSignals().clear();
				return;
			case CommonPackage.SIGNAL_FUNCTION_PORT_INTERFACE__RECEIVED_SIGNALS:
				getReceivedSignals().clear();
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
			case CommonPackage.SIGNAL_FUNCTION_PORT_INTERFACE__EMITED_SIGNALS:
				return emitedSignals != null && !emitedSignals.isEmpty();
			case CommonPackage.SIGNAL_FUNCTION_PORT_INTERFACE__RECEIVED_SIGNALS:
				return receivedSignals != null && !receivedSignals.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SignalFunctionPortInterfaceImpl
