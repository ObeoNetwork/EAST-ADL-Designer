/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.east_adl.structure.function_instance_model.Function_instance_modelPackage;
import org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstance;
import org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstanceTarget;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signal Instance Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.SignalInstanceTargetImpl#getIncomingSignals <em>Incoming Signals</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.SignalInstanceTargetImpl#getOutgoingSignals <em>Outgoing Signals</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class SignalInstanceTargetImpl extends EObjectImpl implements SignalInstanceTarget {
	/**
	 * The cached value of the '{@link #getIncomingSignals() <em>Incoming Signals</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingSignals()
	 * @generated
	 * @ordered
	 */
	protected EList<SignalInstance> incomingSignals;

	/**
	 * The cached value of the '{@link #getOutgoingSignals() <em>Outgoing Signals</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingSignals()
	 * @generated
	 * @ordered
	 */
	protected EList<SignalInstance> outgoingSignals;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignalInstanceTargetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Function_instance_modelPackage.Literals.SIGNAL_INSTANCE_TARGET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SignalInstance> getIncomingSignals() {
		if (incomingSignals == null) {
			incomingSignals = new EObjectWithInverseResolvingEList<SignalInstance>(SignalInstance.class, this, Function_instance_modelPackage.SIGNAL_INSTANCE_TARGET__INCOMING_SIGNALS, Function_instance_modelPackage.SIGNAL_INSTANCE__DESTINATION);
		}
		return incomingSignals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SignalInstance> getOutgoingSignals() {
		if (outgoingSignals == null) {
			outgoingSignals = new EObjectWithInverseResolvingEList<SignalInstance>(SignalInstance.class, this, Function_instance_modelPackage.SIGNAL_INSTANCE_TARGET__OUTGOING_SIGNALS, Function_instance_modelPackage.SIGNAL_INSTANCE__SOURCE);
		}
		return outgoingSignals;
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
			case Function_instance_modelPackage.SIGNAL_INSTANCE_TARGET__INCOMING_SIGNALS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingSignals()).basicAdd(otherEnd, msgs);
			case Function_instance_modelPackage.SIGNAL_INSTANCE_TARGET__OUTGOING_SIGNALS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingSignals()).basicAdd(otherEnd, msgs);
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
			case Function_instance_modelPackage.SIGNAL_INSTANCE_TARGET__INCOMING_SIGNALS:
				return ((InternalEList<?>)getIncomingSignals()).basicRemove(otherEnd, msgs);
			case Function_instance_modelPackage.SIGNAL_INSTANCE_TARGET__OUTGOING_SIGNALS:
				return ((InternalEList<?>)getOutgoingSignals()).basicRemove(otherEnd, msgs);
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
			case Function_instance_modelPackage.SIGNAL_INSTANCE_TARGET__INCOMING_SIGNALS:
				return getIncomingSignals();
			case Function_instance_modelPackage.SIGNAL_INSTANCE_TARGET__OUTGOING_SIGNALS:
				return getOutgoingSignals();
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
			case Function_instance_modelPackage.SIGNAL_INSTANCE_TARGET__INCOMING_SIGNALS:
				getIncomingSignals().clear();
				getIncomingSignals().addAll((Collection<? extends SignalInstance>)newValue);
				return;
			case Function_instance_modelPackage.SIGNAL_INSTANCE_TARGET__OUTGOING_SIGNALS:
				getOutgoingSignals().clear();
				getOutgoingSignals().addAll((Collection<? extends SignalInstance>)newValue);
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
			case Function_instance_modelPackage.SIGNAL_INSTANCE_TARGET__INCOMING_SIGNALS:
				getIncomingSignals().clear();
				return;
			case Function_instance_modelPackage.SIGNAL_INSTANCE_TARGET__OUTGOING_SIGNALS:
				getOutgoingSignals().clear();
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
			case Function_instance_modelPackage.SIGNAL_INSTANCE_TARGET__INCOMING_SIGNALS:
				return incomingSignals != null && !incomingSignals.isEmpty();
			case Function_instance_modelPackage.SIGNAL_INSTANCE_TARGET__OUTGOING_SIGNALS:
				return outgoingSignals != null && !outgoingSignals.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SignalInstanceTargetImpl
