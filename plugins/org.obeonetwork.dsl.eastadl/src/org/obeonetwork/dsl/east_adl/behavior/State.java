/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.behavior;

import org.eclipse.emf.common.util.EList;

import org.obeonetwork.dsl.east_adl.core.EASTADLNamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is a simple state representation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.behavior.State#getActions <em>Actions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.behavior.State#getOutgoingTransitions <em>Outgoing Transitions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.behavior.State#getIncomingTransitions <em>Incoming Transitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.behavior.BehaviorPackage#getState()
 * @model
 * @generated
 */
public interface State extends EASTADLNamedElement {
	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.behavior.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.behavior.BehaviorPackage#getState_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getActions();

	/**
	 * Returns the value of the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.behavior.Transition}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.behavior.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Transitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Transitions</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.behavior.BehaviorPackage#getState_OutgoingTransitions()
	 * @see org.obeonetwork.dsl.east_adl.behavior.Transition#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Transition> getOutgoingTransitions();

	/**
	 * Returns the value of the '<em><b>Incoming Transitions</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.behavior.Transition}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.behavior.Transition#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Transitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Transitions</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.behavior.BehaviorPackage#getState_IncomingTransitions()
	 * @see org.obeonetwork.dsl.east_adl.behavior.Transition#getDestination
	 * @model opposite="destination"
	 * @generated
	 */
	EList<Transition> getIncomingTransitions();

} // State
