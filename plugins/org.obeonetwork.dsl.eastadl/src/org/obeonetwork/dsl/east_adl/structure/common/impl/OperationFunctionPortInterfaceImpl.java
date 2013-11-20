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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.east_adl.structure.common.CommonPackage;
import org.obeonetwork.dsl.east_adl.structure.common.OperationCall;
import org.obeonetwork.dsl.east_adl.structure.common.OperationFunctionPortInterface;
import org.obeonetwork.dsl.east_adl.structure.common.OperationService;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Function Port Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.impl.OperationFunctionPortInterfaceImpl#getReceivedCalls <em>Received Calls</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.impl.OperationFunctionPortInterfaceImpl#getEmitedCalls <em>Emited Calls</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.impl.OperationFunctionPortInterfaceImpl#getServices <em>Services</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationFunctionPortInterfaceImpl extends FunctionPortInterfaceImpl implements OperationFunctionPortInterface {
	/**
	 * The cached value of the '{@link #getReceivedCalls() <em>Received Calls</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivedCalls()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationCall> receivedCalls;

	/**
	 * The cached value of the '{@link #getEmitedCalls() <em>Emited Calls</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmitedCalls()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationCall> emitedCalls;

	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationService> services;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationFunctionPortInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.OPERATION_FUNCTION_PORT_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationCall> getReceivedCalls() {
		if (receivedCalls == null) {
			receivedCalls = new EObjectWithInverseResolvingEList<OperationCall>(OperationCall.class, this, CommonPackage.OPERATION_FUNCTION_PORT_INTERFACE__RECEIVED_CALLS, CommonPackage.OPERATION_CALL__RECEIVER);
		}
		return receivedCalls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationCall> getEmitedCalls() {
		if (emitedCalls == null) {
			emitedCalls = new EObjectWithInverseResolvingEList<OperationCall>(OperationCall.class, this, CommonPackage.OPERATION_FUNCTION_PORT_INTERFACE__EMITED_CALLS, CommonPackage.OPERATION_CALL__EMITTER);
		}
		return emitedCalls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationService> getServices() {
		if (services == null) {
			services = new EObjectContainmentWithInverseEList<OperationService>(OperationService.class, this, CommonPackage.OPERATION_FUNCTION_PORT_INTERFACE__SERVICES, CommonPackage.OPERATION_SERVICE__INTERFACE);
		}
		return services;
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
			case CommonPackage.OPERATION_FUNCTION_PORT_INTERFACE__RECEIVED_CALLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReceivedCalls()).basicAdd(otherEnd, msgs);
			case CommonPackage.OPERATION_FUNCTION_PORT_INTERFACE__EMITED_CALLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEmitedCalls()).basicAdd(otherEnd, msgs);
			case CommonPackage.OPERATION_FUNCTION_PORT_INTERFACE__SERVICES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getServices()).basicAdd(otherEnd, msgs);
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
			case CommonPackage.OPERATION_FUNCTION_PORT_INTERFACE__RECEIVED_CALLS:
				return ((InternalEList<?>)getReceivedCalls()).basicRemove(otherEnd, msgs);
			case CommonPackage.OPERATION_FUNCTION_PORT_INTERFACE__EMITED_CALLS:
				return ((InternalEList<?>)getEmitedCalls()).basicRemove(otherEnd, msgs);
			case CommonPackage.OPERATION_FUNCTION_PORT_INTERFACE__SERVICES:
				return ((InternalEList<?>)getServices()).basicRemove(otherEnd, msgs);
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
			case CommonPackage.OPERATION_FUNCTION_PORT_INTERFACE__RECEIVED_CALLS:
				return getReceivedCalls();
			case CommonPackage.OPERATION_FUNCTION_PORT_INTERFACE__EMITED_CALLS:
				return getEmitedCalls();
			case CommonPackage.OPERATION_FUNCTION_PORT_INTERFACE__SERVICES:
				return getServices();
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
			case CommonPackage.OPERATION_FUNCTION_PORT_INTERFACE__RECEIVED_CALLS:
				getReceivedCalls().clear();
				getReceivedCalls().addAll((Collection<? extends OperationCall>)newValue);
				return;
			case CommonPackage.OPERATION_FUNCTION_PORT_INTERFACE__EMITED_CALLS:
				getEmitedCalls().clear();
				getEmitedCalls().addAll((Collection<? extends OperationCall>)newValue);
				return;
			case CommonPackage.OPERATION_FUNCTION_PORT_INTERFACE__SERVICES:
				getServices().clear();
				getServices().addAll((Collection<? extends OperationService>)newValue);
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
			case CommonPackage.OPERATION_FUNCTION_PORT_INTERFACE__RECEIVED_CALLS:
				getReceivedCalls().clear();
				return;
			case CommonPackage.OPERATION_FUNCTION_PORT_INTERFACE__EMITED_CALLS:
				getEmitedCalls().clear();
				return;
			case CommonPackage.OPERATION_FUNCTION_PORT_INTERFACE__SERVICES:
				getServices().clear();
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
			case CommonPackage.OPERATION_FUNCTION_PORT_INTERFACE__RECEIVED_CALLS:
				return receivedCalls != null && !receivedCalls.isEmpty();
			case CommonPackage.OPERATION_FUNCTION_PORT_INTERFACE__EMITED_CALLS:
				return emitedCalls != null && !emitedCalls.isEmpty();
			case CommonPackage.OPERATION_FUNCTION_PORT_INTERFACE__SERVICES:
				return services != null && !services.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OperationFunctionPortInterfaceImpl
