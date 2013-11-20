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
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is a relationship used to identify the design constraints that have to be respected during design and implementation of this electronic feature.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.Constraint#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.Constraint#getConstrainedEntity <em>Constrained Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage#getConstraint()
 * @model annotation="http://www.topcased.org/documentation documentation='This object will be implemented graphically by a connection.'"
 * @generated
 */
public interface Constraint extends EASTADLNamedElement {
	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.requirements.DesignConstraint#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are the actual design constraints for the specified entity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constraint</em>' container reference.
	 * @see #setConstraint(DesignConstraint)
	 * @see org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage#getConstraint_Constraint()
	 * @see org.obeonetwork.dsl.east_adl.requirements.DesignConstraint#getConstraints
	 * @model opposite="constraints" required="true" transient="false"
	 * @generated
	 */
	DesignConstraint getConstraint();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.requirements.Constraint#getConstraint <em>Constraint</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint</em>' container reference.
	 * @see #getConstraint()
	 * @generated
	 */
	void setConstraint(DesignConstraint value);

	/**
	 * Returns the value of the '<em><b>Constrained Entity</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.EFeature#getPassiveConstraints <em>Passive Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the electronic feature of the constraint.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constrained Entity</em>' reference.
	 * @see #setConstrainedEntity(EFeature)
	 * @see org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage#getConstraint_ConstrainedEntity()
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.EFeature#getPassiveConstraints
	 * @model opposite="passiveConstraints"
	 * @generated
	 */
	EFeature getConstrainedEntity();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.requirements.Constraint#getConstrainedEntity <em>Constrained Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constrained Entity</em>' reference.
	 * @see #getConstrainedEntity()
	 * @generated
	 */
	void setConstrainedEntity(EFeature value);

} // Constraint
