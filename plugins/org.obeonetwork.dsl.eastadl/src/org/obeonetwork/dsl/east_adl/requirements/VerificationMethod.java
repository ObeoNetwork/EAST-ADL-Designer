/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.requirements;

import org.obeonetwork.dsl.east_adl.core.EASTADLNamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Verification Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is a language entity that can be used during requirements elicitation in order to require specific methods for the requirement verification.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.VerificationMethod#getDescription <em>Description</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.VerificationMethod#getType <em>Type</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.VerificationMethod#getRequirement <em>Requirement</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage#getVerificationMethod()
 * @model
 * @generated
 */
public interface VerificationMethod extends EASTADLNamedElement {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is an unformal description of this method.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage#getVerificationMethod_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.requirements.VerificationMethod#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.obeonetwork.dsl.east_adl.requirements.VerificationMethodKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the enumerative type of this method.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.obeonetwork.dsl.east_adl.requirements.VerificationMethodKind
	 * @see #setType(VerificationMethodKind)
	 * @see org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage#getVerificationMethod_Type()
	 * @model
	 * @generated
	 */
	VerificationMethodKind getType();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.requirements.VerificationMethod#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.obeonetwork.dsl.east_adl.requirements.VerificationMethodKind
	 * @see #getType()
	 * @generated
	 */
	void setType(VerificationMethodKind value);

	/**
	 * Returns the value of the '<em><b>Requirement</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.requirements.Requirement#getVerificationMethods <em>Verification Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirement</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement</em>' container reference.
	 * @see #setRequirement(Requirement)
	 * @see org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage#getVerificationMethod_Requirement()
	 * @see org.obeonetwork.dsl.east_adl.requirements.Requirement#getVerificationMethods
	 * @model opposite="verificationMethods" required="true" transient="false"
	 * @generated
	 */
	Requirement getRequirement();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.requirements.VerificationMethod#getRequirement <em>Requirement</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement</em>' container reference.
	 * @see #getRequirement()
	 * @generated
	 */
	void setRequirement(Requirement value);

} // VerificationMethod
