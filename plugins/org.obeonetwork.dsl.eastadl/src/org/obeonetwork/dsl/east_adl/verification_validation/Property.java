/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.verification_validation;

import org.obeonetwork.dsl.east_adl.core.EASTADLNamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is the expression of a specific property to be verified.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.verification_validation.Property#getFormalism <em>Formalism</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.verification_validation.Property#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.verification_validation.Verification_validationPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends EASTADLNamedElement {
	/**
	 * Returns the value of the '<em><b>Formalism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is used to specify a formalis if there is one.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Formalism</em>' attribute.
	 * @see #setFormalism(String)
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.Verification_validationPackage#getProperty_Formalism()
	 * @model
	 * @generated
	 */
	String getFormalism();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.verification_validation.Property#getFormalism <em>Formalism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formalism</em>' attribute.
	 * @see #getFormalism()
	 * @generated
	 */
	void setFormalism(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the textual description of the property that must be verified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.Verification_validationPackage#getProperty_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.verification_validation.Property#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Property
