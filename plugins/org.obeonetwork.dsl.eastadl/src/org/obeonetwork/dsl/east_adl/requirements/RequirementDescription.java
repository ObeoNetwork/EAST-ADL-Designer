/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.requirements;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is a description of a requirement provided externally.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.RequirementDescription#getUrl <em>Url</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.RequirementDescription#getFormalism <em>Formalism</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.RequirementDescription#getRequirement <em>Requirement</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage#getRequirementDescription()
 * @model
 * @generated
 */
public interface RequirementDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute is the location of the description file.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage#getRequirementDescription_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.requirements.RequirementDescription#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Formalism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute is the formalism used to describe the requirement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Formalism</em>' attribute.
	 * @see #setFormalism(String)
	 * @see org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage#getRequirementDescription_Formalism()
	 * @model
	 * @generated
	 */
	String getFormalism();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.requirements.RequirementDescription#getFormalism <em>Formalism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formalism</em>' attribute.
	 * @see #getFormalism()
	 * @generated
	 */
	void setFormalism(String value);

	/**
	 * Returns the value of the '<em><b>Requirement</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.requirements.Requirement#getExternalDescriptions <em>External Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the requirement specified by this description.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requirement</em>' container reference.
	 * @see #setRequirement(Requirement)
	 * @see org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage#getRequirementDescription_Requirement()
	 * @see org.obeonetwork.dsl.east_adl.requirements.Requirement#getExternalDescriptions
	 * @model opposite="externalDescriptions" required="true" transient="false"
	 * @generated
	 */
	Requirement getRequirement();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.requirements.RequirementDescription#getRequirement <em>Requirement</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement</em>' container reference.
	 * @see #getRequirement()
	 * @generated
	 */
	void setRequirement(Requirement value);

} // RequirementDescription
