/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.requirements;

import org.eclipse.emf.common.util.EList;

import org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.EFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functional Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity is used to refine an EFeature requirement by specifying what the EFeature is required to do.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.FunctionalRequirement#getSpecifications <em>Specifications</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.FunctionalRequirement#getSpecifiedEFeatures <em>Specified EFeatures</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage#getFunctionalRequirement()
 * @model
 * @generated
 */
public interface FunctionalRequirement extends Requirement {
	/**
	 * Returns the value of the '<em><b>Specifications</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.requirements.Specification}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.requirements.Specification#getFunctionalRequirement <em>Functional Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are the specifications representing electronic features of this requirement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specifications</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage#getFunctionalRequirement_Specifications()
	 * @see org.obeonetwork.dsl.east_adl.requirements.Specification#getFunctionalRequirement
	 * @model opposite="functionalRequirement" containment="true"
	 * @generated
	 */
	EList<Specification> getSpecifications();

	/**
	 * Returns the value of the '<em><b>Specified EFeatures</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.EFeature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is a derived property used to show all electronic features specified by this entity (if any).
	 * This property will be shown instead of the corresponding specification model objects because it is more explicit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specified EFeatures</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage#getFunctionalRequirement_SpecifiedEFeatures()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<EFeature> getSpecifiedEFeatures();

} // FunctionalRequirement
