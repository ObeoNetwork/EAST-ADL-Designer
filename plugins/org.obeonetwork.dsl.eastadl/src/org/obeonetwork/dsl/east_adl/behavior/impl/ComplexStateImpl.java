/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.behavior.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.east_adl.behavior.Behavior;
import org.obeonetwork.dsl.east_adl.behavior.BehaviorPackage;
import org.obeonetwork.dsl.east_adl.behavior.ComplexState;
import org.obeonetwork.dsl.east_adl.behavior.FinalState;
import org.obeonetwork.dsl.east_adl.behavior.InitialState;
import org.obeonetwork.dsl.east_adl.behavior.NativeBehavior;
import org.obeonetwork.dsl.east_adl.behavior.State;
import org.obeonetwork.dsl.east_adl.behavior.Transition;

import org.obeonetwork.dsl.east_adl.core.EASTADLEntity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.behavior.impl.ComplexStateImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.behavior.impl.ComplexStateImpl#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.behavior.impl.ComplexStateImpl#getStates <em>States</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.behavior.impl.ComplexStateImpl#getFinalState <em>Final State</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.behavior.impl.ComplexStateImpl#getTransitions <em>Transitions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComplexStateImpl extends StateImpl implements ComplexState {
	/**
	 * The cached value of the '{@link #getInitialState() <em>Initial State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialState()
	 * @generated
	 * @ordered
	 */
	protected InitialState initialState;

	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> states;

	/**
	 * The cached value of the '{@link #getFinalState() <em>Final State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalState()
	 * @generated
	 * @ordered
	 */
	protected FinalState finalState;

	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplexStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.COMPLEX_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EASTADLEntity getOwner() {
		EASTADLEntity owner = basicGetOwner();
		return owner != null && owner.eIsProxy() ? (EASTADLEntity)eResolveProxy((InternalEObject)owner) : owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EASTADLEntity basicGetOwner() {
		// TODO: implement this method to return the 'Owner' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialState getInitialState() {
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialState(InitialState newInitialState, NotificationChain msgs) {
		InitialState oldInitialState = initialState;
		initialState = newInitialState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviorPackage.COMPLEX_STATE__INITIAL_STATE, oldInitialState, newInitialState);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialState(InitialState newInitialState) {
		if (newInitialState != initialState) {
			NotificationChain msgs = null;
			if (initialState != null)
				msgs = ((InternalEObject)initialState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.COMPLEX_STATE__INITIAL_STATE, null, msgs);
			if (newInitialState != null)
				msgs = ((InternalEObject)newInitialState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.COMPLEX_STATE__INITIAL_STATE, null, msgs);
			msgs = basicSetInitialState(newInitialState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.COMPLEX_STATE__INITIAL_STATE, newInitialState, newInitialState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectContainmentEList<State>(State.class, this, BehaviorPackage.COMPLEX_STATE__STATES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalState getFinalState() {
		return finalState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFinalState(FinalState newFinalState, NotificationChain msgs) {
		FinalState oldFinalState = finalState;
		finalState = newFinalState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviorPackage.COMPLEX_STATE__FINAL_STATE, oldFinalState, newFinalState);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinalState(FinalState newFinalState) {
		if (newFinalState != finalState) {
			NotificationChain msgs = null;
			if (finalState != null)
				msgs = ((InternalEObject)finalState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.COMPLEX_STATE__FINAL_STATE, null, msgs);
			if (newFinalState != null)
				msgs = ((InternalEObject)newFinalState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.COMPLEX_STATE__FINAL_STATE, null, msgs);
			msgs = basicSetFinalState(newFinalState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.COMPLEX_STATE__FINAL_STATE, newFinalState, newFinalState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getTransitions() {
		if (transitions == null) {
			transitions = new EObjectContainmentEList<Transition>(Transition.class, this, BehaviorPackage.COMPLEX_STATE__TRANSITIONS);
		}
		return transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviorPackage.COMPLEX_STATE__INITIAL_STATE:
				return basicSetInitialState(null, msgs);
			case BehaviorPackage.COMPLEX_STATE__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
			case BehaviorPackage.COMPLEX_STATE__FINAL_STATE:
				return basicSetFinalState(null, msgs);
			case BehaviorPackage.COMPLEX_STATE__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
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
			case BehaviorPackage.COMPLEX_STATE__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case BehaviorPackage.COMPLEX_STATE__INITIAL_STATE:
				return getInitialState();
			case BehaviorPackage.COMPLEX_STATE__STATES:
				return getStates();
			case BehaviorPackage.COMPLEX_STATE__FINAL_STATE:
				return getFinalState();
			case BehaviorPackage.COMPLEX_STATE__TRANSITIONS:
				return getTransitions();
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
			case BehaviorPackage.COMPLEX_STATE__INITIAL_STATE:
				setInitialState((InitialState)newValue);
				return;
			case BehaviorPackage.COMPLEX_STATE__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends State>)newValue);
				return;
			case BehaviorPackage.COMPLEX_STATE__FINAL_STATE:
				setFinalState((FinalState)newValue);
				return;
			case BehaviorPackage.COMPLEX_STATE__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends Transition>)newValue);
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
			case BehaviorPackage.COMPLEX_STATE__INITIAL_STATE:
				setInitialState((InitialState)null);
				return;
			case BehaviorPackage.COMPLEX_STATE__STATES:
				getStates().clear();
				return;
			case BehaviorPackage.COMPLEX_STATE__FINAL_STATE:
				setFinalState((FinalState)null);
				return;
			case BehaviorPackage.COMPLEX_STATE__TRANSITIONS:
				getTransitions().clear();
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
			case BehaviorPackage.COMPLEX_STATE__OWNER:
				return basicGetOwner() != null;
			case BehaviorPackage.COMPLEX_STATE__INITIAL_STATE:
				return initialState != null;
			case BehaviorPackage.COMPLEX_STATE__STATES:
				return states != null && !states.isEmpty();
			case BehaviorPackage.COMPLEX_STATE__FINAL_STATE:
				return finalState != null;
			case BehaviorPackage.COMPLEX_STATE__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Behavior.class) {
			switch (derivedFeatureID) {
				case BehaviorPackage.COMPLEX_STATE__OWNER: return BehaviorPackage.BEHAVIOR__OWNER;
				default: return -1;
			}
		}
		if (baseClass == NativeBehavior.class) {
			switch (derivedFeatureID) {
				case BehaviorPackage.COMPLEX_STATE__INITIAL_STATE: return BehaviorPackage.NATIVE_BEHAVIOR__INITIAL_STATE;
				case BehaviorPackage.COMPLEX_STATE__STATES: return BehaviorPackage.NATIVE_BEHAVIOR__STATES;
				case BehaviorPackage.COMPLEX_STATE__FINAL_STATE: return BehaviorPackage.NATIVE_BEHAVIOR__FINAL_STATE;
				case BehaviorPackage.COMPLEX_STATE__TRANSITIONS: return BehaviorPackage.NATIVE_BEHAVIOR__TRANSITIONS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Behavior.class) {
			switch (baseFeatureID) {
				case BehaviorPackage.BEHAVIOR__OWNER: return BehaviorPackage.COMPLEX_STATE__OWNER;
				default: return -1;
			}
		}
		if (baseClass == NativeBehavior.class) {
			switch (baseFeatureID) {
				case BehaviorPackage.NATIVE_BEHAVIOR__INITIAL_STATE: return BehaviorPackage.COMPLEX_STATE__INITIAL_STATE;
				case BehaviorPackage.NATIVE_BEHAVIOR__STATES: return BehaviorPackage.COMPLEX_STATE__STATES;
				case BehaviorPackage.NATIVE_BEHAVIOR__FINAL_STATE: return BehaviorPackage.COMPLEX_STATE__FINAL_STATE;
				case BehaviorPackage.NATIVE_BEHAVIOR__TRANSITIONS: return BehaviorPackage.COMPLEX_STATE__TRANSITIONS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ComplexStateImpl
