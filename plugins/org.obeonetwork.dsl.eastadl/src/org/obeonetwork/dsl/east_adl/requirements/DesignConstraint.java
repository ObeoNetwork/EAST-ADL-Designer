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
 * A representation of the model object '<em><b>Design Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity is used to constrain the solution space of electronic features realizations.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.DesignConstraint#getDesignConstraintType <em>Design Constraint Type</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.DesignConstraint#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.DesignConstraint#getConstrainedEFeatures <em>Constrained EFeatures</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage#getDesignConstraint()
 * @model
 * @generated
 */
public interface DesignConstraint extends Requirement {
	/**
	 * Returns the value of the '<em><b>Design Constraint Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.obeonetwork.dsl.east_adl.requirements.DesignConstraintKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute is the enumerative type of this design constraint.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Design Constraint Type</em>' attribute.
	 * @see org.obeonetwork.dsl.east_adl.requirements.DesignConstraintKind
	 * @see #setDesignConstraintType(DesignConstraintKind)
	 * @see org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage#getDesignConstraint_DesignConstraintType()
	 * @model
	 * @generated
	 */
	DesignConstraintKind getDesignConstraintType();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.requirements.DesignConstraint#getDesignConstraintType <em>Design Constraint Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Design Constraint Type</em>' attribute.
	 * @see org.obeonetwork.dsl.east_adl.requirements.DesignConstraintKind
	 * @see #getDesignConstraintType()
	 * @generated
	 */
	void setDesignConstraintType(DesignConstraintKind value);

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.requirements.Constraint}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.requirements.Constraint#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are the constraints representing electronic features of this requirement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage#getDesignConstraint_Constraints()
	 * @see org.obeonetwork.dsl.east_adl.requirements.Constraint#getConstraint
	 * @model opposite="constraint" containment="true"
	 * @generated
	 */
	EList<Constraint> getConstraints();

	/**
	 * Returns the value of the '<em><b>Constrained EFeatures</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.EFeature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is a derived property used to show all electronic features constrained by this entity (if any).
	 * This property will be shown instead of the corresponding constraint model objects because it is more explicit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constrained EFeatures</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage#getDesignConstraint_ConstrainedEFeatures()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<EFeature> getConstrainedEFeatures();

} // DesignConstraint
