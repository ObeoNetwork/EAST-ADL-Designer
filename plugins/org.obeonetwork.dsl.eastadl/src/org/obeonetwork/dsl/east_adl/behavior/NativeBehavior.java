/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.behavior;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Native Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity is a placeholder for a behavioral definition that is recognized by EAST-ADL compliant tools.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.behavior.NativeBehavior#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.behavior.NativeBehavior#getStates <em>States</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.behavior.NativeBehavior#getFinalState <em>Final State</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.behavior.NativeBehavior#getTransitions <em>Transitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.behavior.BehaviorPackage#getNativeBehavior()
 * @model
 * @generated
 */
public interface NativeBehavior extends Behavior {
	/**
	 * Returns the value of the '<em><b>Initial State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial State</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial State</em>' containment reference.
	 * @see #setInitialState(InitialState)
	 * @see org.obeonetwork.dsl.east_adl.behavior.BehaviorPackage#getNativeBehavior_InitialState()
	 * @model containment="true"
	 * @generated
	 */
	InitialState getInitialState();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.behavior.NativeBehavior#getInitialState <em>Initial State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial State</em>' containment reference.
	 * @see #getInitialState()
	 * @generated
	 */
	void setInitialState(InitialState value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.behavior.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.behavior.BehaviorPackage#getNativeBehavior_States()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Final State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final State</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final State</em>' containment reference.
	 * @see #setFinalState(FinalState)
	 * @see org.obeonetwork.dsl.east_adl.behavior.BehaviorPackage#getNativeBehavior_FinalState()
	 * @model containment="true"
	 * @generated
	 */
	FinalState getFinalState();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.behavior.NativeBehavior#getFinalState <em>Final State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final State</em>' containment reference.
	 * @see #getFinalState()
	 * @generated
	 */
	void setFinalState(FinalState value);

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.behavior.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.behavior.BehaviorPackage#getNativeBehavior_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

} // NativeBehavior
