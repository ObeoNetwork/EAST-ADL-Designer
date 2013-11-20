/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.requirements;

import org.obeonetwork.dsl.east_adl.core.EASTADLNamedElement;

import org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.EFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is a relationship used to link electronic features with functional requirements (in EAST-ADL specification it is named Specify). It used to describe what an electronic feature does.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.Specification#getFunctionalRequirement <em>Functional Requirement</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.Specification#getSpecifiedEntity <em>Specified Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage#getSpecification()
 * @model annotation="http://www.topcased.org/documentation documentation='This object will be implemented graphically by a connection.'"
 * @generated
 */
public interface Specification extends EASTADLNamedElement {
	/**
	 * Returns the value of the '<em><b>Functional Requirement</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.requirements.FunctionalRequirement#getSpecifications <em>Specifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are the actual functional requirements for the specified entity. It is known as required behavior in the EAST-ADL specification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Functional Requirement</em>' container reference.
	 * @see #setFunctionalRequirement(FunctionalRequirement)
	 * @see org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage#getSpecification_FunctionalRequirement()
	 * @see org.obeonetwork.dsl.east_adl.requirements.FunctionalRequirement#getSpecifications
	 * @model opposite="specifications" required="true" transient="false"
	 * @generated
	 */
	FunctionalRequirement getFunctionalRequirement();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.requirements.Specification#getFunctionalRequirement <em>Functional Requirement</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Functional Requirement</em>' container reference.
	 * @see #getFunctionalRequirement()
	 * @generated
	 */
	void setFunctionalRequirement(FunctionalRequirement value);

	/**
	 * Returns the value of the '<em><b>Specified Entity</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.EFeature#getPassiveSpecifications <em>Passive Specifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the electronic feature of the specification
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specified Entity</em>' reference.
	 * @see #setSpecifiedEntity(EFeature)
	 * @see org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage#getSpecification_SpecifiedEntity()
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.EFeature#getPassiveSpecifications
	 * @model opposite="passiveSpecifications"
	 * @generated
	 */
	EFeature getSpecifiedEntity();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.requirements.Specification#getSpecifiedEntity <em>Specified Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specified Entity</em>' reference.
	 * @see #getSpecifiedEntity()
	 * @generated
	 */
	void setSpecifiedEntity(EFeature value);

} // Specification
