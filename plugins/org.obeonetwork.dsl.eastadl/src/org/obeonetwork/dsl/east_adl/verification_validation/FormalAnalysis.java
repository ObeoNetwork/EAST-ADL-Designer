/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.verification_validation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formal Analysis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity is used for analysis of properties of a system (timing analysis, property analysis, etc.). It describes a V&V activity based on mathematical analysis of a model.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.verification_validation.FormalAnalysis#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.verification_validation.Verification_validationPackage#getFormalAnalysis()
 * @model
 * @generated
 */
public interface FormalAnalysis extends VVCase {
	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.verification_validation.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.Verification_validationPackage#getFormalAnalysis_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getProperties();

} // FormalAnalysis
