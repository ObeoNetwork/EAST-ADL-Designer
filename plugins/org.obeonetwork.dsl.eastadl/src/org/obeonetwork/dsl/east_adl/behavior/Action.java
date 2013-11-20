/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.behavior;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is an action which is defined for a transition.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.behavior.Action#getTransition <em>Transition</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.behavior.Action#getDirective <em>Directive</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.behavior.BehaviorPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends EObject {
	/**
	 * Returns the value of the '<em><b>Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' reference.
	 * @see #setTransition(Transition)
	 * @see org.obeonetwork.dsl.east_adl.behavior.BehaviorPackage#getAction_Transition()
	 * @model
	 * @generated
	 */
	Transition getTransition();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.behavior.Action#getTransition <em>Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition</em>' reference.
	 * @see #getTransition()
	 * @generated
	 */
	void setTransition(Transition value);

	/**
	 * Returns the value of the '<em><b>Directive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the description of this action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Directive</em>' attribute.
	 * @see #setDirective(String)
	 * @see org.obeonetwork.dsl.east_adl.behavior.BehaviorPackage#getAction_Directive()
	 * @model
	 * @generated
	 */
	String getDirective();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.behavior.Action#getDirective <em>Directive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Directive</em>' attribute.
	 * @see #getDirective()
	 * @generated
	 */
	void setDirective(String value);

} // Action
