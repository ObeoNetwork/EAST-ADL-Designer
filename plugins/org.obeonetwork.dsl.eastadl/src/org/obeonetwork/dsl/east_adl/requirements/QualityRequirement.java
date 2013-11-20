/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.requirements;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quality Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity is used to introduce externally visible property of the system considered as whole. The system could be entire vehicle or its subsystem.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.QualityRequirement#getQualityRequirementType <em>Quality Requirement Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage#getQualityRequirement()
 * @model
 * @generated
 */
public interface QualityRequirement extends Requirement {
	/**
	 * Returns the value of the '<em><b>Quality Requirement Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.obeonetwork.dsl.east_adl.requirements.QualityRequirementKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute is the enumerative type of this quality requirement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quality Requirement Type</em>' attribute.
	 * @see org.obeonetwork.dsl.east_adl.requirements.QualityRequirementKind
	 * @see #setQualityRequirementType(QualityRequirementKind)
	 * @see org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage#getQualityRequirement_QualityRequirementType()
	 * @model
	 * @generated
	 */
	QualityRequirementKind getQualityRequirementType();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.requirements.QualityRequirement#getQualityRequirementType <em>Quality Requirement Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quality Requirement Type</em>' attribute.
	 * @see org.obeonetwork.dsl.east_adl.requirements.QualityRequirementKind
	 * @see #getQualityRequirementType()
	 * @generated
	 */
	void setQualityRequirementType(QualityRequirementKind value);

} // QualityRequirement
