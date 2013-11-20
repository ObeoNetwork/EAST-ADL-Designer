/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.functional_design_architecture;

import org.obeonetwork.dsl.east_adl.core.EASTADLNamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Precedence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This association is used to define a precedence relationship between several elementary functions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Precedence#getPredecessor <em>Predecessor</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Precedence#getSuccessor <em>Successor</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Functional_design_architecturePackage#getPrecedence()
 * @model
 * @generated
 */
public interface Precedence extends EASTADLNamedElement {
	/**
	 * Returns the value of the '<em><b>Predecessor</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction#getActivePrecedencies <em>Active Precedencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the predecessor of this association.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Predecessor</em>' container reference.
	 * @see #setPredecessor(ElementarySoftwareFunction)
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Functional_design_architecturePackage#getPrecedence_Predecessor()
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction#getActivePrecedencies
	 * @model opposite="activePrecedencies" required="true" transient="false"
	 * @generated
	 */
	ElementarySoftwareFunction getPredecessor();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Precedence#getPredecessor <em>Predecessor</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predecessor</em>' container reference.
	 * @see #getPredecessor()
	 * @generated
	 */
	void setPredecessor(ElementarySoftwareFunction value);

	/**
	 * Returns the value of the '<em><b>Successor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction#getPassivePrecedencies <em>Passive Precedencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the successor of this precedence
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Successor</em>' reference.
	 * @see #setSuccessor(ElementarySoftwareFunction)
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Functional_design_architecturePackage#getPrecedence_Successor()
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction#getPassivePrecedencies
	 * @model opposite="passivePrecedencies"
	 * @generated
	 */
	ElementarySoftwareFunction getSuccessor();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Precedence#getSuccessor <em>Successor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Successor</em>' reference.
	 * @see #getSuccessor()
	 * @generated
	 */
	void setSuccessor(ElementarySoftwareFunction value);

} // Precedence
