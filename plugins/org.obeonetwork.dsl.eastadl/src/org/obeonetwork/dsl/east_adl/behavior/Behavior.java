/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.behavior;

import org.obeonetwork.dsl.east_adl.core.EASTADLEntity;
import org.obeonetwork.dsl.east_adl.core.EASTADLNamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is an abstract behavior used to represent a behavior of a function.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.behavior.Behavior#getOwner <em>Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.behavior.BehaviorPackage#getBehavior()
 * @model abstract="true"
 * @generated
 */
public interface Behavior extends EASTADLNamedElement {
	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is a derived property used to identify the owner of this behavior.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see org.obeonetwork.dsl.east_adl.behavior.BehaviorPackage#getBehavior_Owner()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EASTADLEntity getOwner();

} // Behavior
