/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.verification_validation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Validated Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is a representation of entities that support V&V.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.verification_validation.ValidatedEntity#getValidators <em>Validators</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.verification_validation.Verification_validationPackage#getValidatedEntity()
 * @model abstract="true"
 * @generated
 */
public interface ValidatedEntity extends EObject {
	/**
	 * Returns the value of the '<em><b>Validators</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.verification_validation.VVCase}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.verification_validation.VVCase#getValidatedEntities <em>Validated Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are V&V cases that verify and validate this entity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Validators</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.Verification_validationPackage#getValidatedEntity_Validators()
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.VVCase#getValidatedEntities
	 * @model opposite="validatedEntities"
	 * @generated
	 */
	EList<VVCase> getValidators();

} // ValidatedEntity
