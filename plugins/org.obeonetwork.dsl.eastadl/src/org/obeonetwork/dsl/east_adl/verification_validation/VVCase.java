/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.verification_validation;

import org.eclipse.emf.common.util.EList;

import org.obeonetwork.dsl.east_adl.core.EASTADLArtifact;
import org.obeonetwork.dsl.east_adl.core.EASTADLNamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VV Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is a generic view of the V&V context. This case is associated to elements needed for any kind of verification and validation method.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.verification_validation.VVCase#getMethod <em>Method</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.verification_validation.VVCase#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.verification_validation.VVCase#getVerdict <em>Verdict</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.verification_validation.VVCase#getObjective <em>Objective</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.verification_validation.VVCase#getOwningArtifact <em>Owning Artifact</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.verification_validation.VVCase#getValidatedEntities <em>Validated Entities</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.verification_validation.Verification_validationPackage#getVVCase()
 * @model abstract="true"
 * @generated
 */
public interface VVCase extends EASTADLNamedElement {
	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the method followed for this verification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see #setMethod(String)
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.Verification_validationPackage#getVVCase_Method()
	 * @model
	 * @generated
	 */
	String getMethod();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.verification_validation.VVCase#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' attribute.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(String value);

	/**
	 * Returns the value of the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the purpose of this case.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Purpose</em>' attribute.
	 * @see #setPurpose(String)
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.Verification_validationPackage#getVVCase_Purpose()
	 * @model
	 * @generated
	 */
	String getPurpose();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.verification_validation.VVCase#getPurpose <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose</em>' attribute.
	 * @see #getPurpose()
	 * @generated
	 */
	void setPurpose(String value);

	/**
	 * Returns the value of the '<em><b>Verdict</b></em>' attribute.
	 * The literals are from the enumeration {@link org.obeonetwork.dsl.east_adl.verification_validation.VerdictKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the enumerative result of this case.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Verdict</em>' attribute.
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.VerdictKind
	 * @see #setVerdict(VerdictKind)
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.Verification_validationPackage#getVVCase_Verdict()
	 * @model
	 * @generated
	 */
	VerdictKind getVerdict();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.verification_validation.VVCase#getVerdict <em>Verdict</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verdict</em>' attribute.
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.VerdictKind
	 * @see #getVerdict()
	 * @generated
	 */
	void setVerdict(VerdictKind value);

	/**
	 * Returns the value of the '<em><b>Objective</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the objective of this case.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Objective</em>' attribute.
	 * @see #setObjective(String)
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.Verification_validationPackage#getVVCase_Objective()
	 * @model
	 * @generated
	 */
	String getObjective();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.verification_validation.VVCase#getObjective <em>Objective</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objective</em>' attribute.
	 * @see #getObjective()
	 * @generated
	 */
	void setObjective(String value);

	/**
	 * Returns the value of the '<em><b>Owning Artifact</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.core.EASTADLArtifact#getValidationEntities <em>Validation Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the artifact owning this entity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Artifact</em>' container reference.
	 * @see #setOwningArtifact(EASTADLArtifact)
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.Verification_validationPackage#getVVCase_OwningArtifact()
	 * @see org.obeonetwork.dsl.east_adl.core.EASTADLArtifact#getValidationEntities
	 * @model opposite="validationEntities" required="true" transient="false"
	 * @generated
	 */
	EASTADLArtifact getOwningArtifact();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.verification_validation.VVCase#getOwningArtifact <em>Owning Artifact</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Artifact</em>' container reference.
	 * @see #getOwningArtifact()
	 * @generated
	 */
	void setOwningArtifact(EASTADLArtifact value);

	/**
	 * Returns the value of the '<em><b>Validated Entities</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.verification_validation.ValidatedEntity}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.verification_validation.ValidatedEntity#getValidators <em>Validators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are all entities validated by this case.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Validated Entities</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.Verification_validationPackage#getVVCase_ValidatedEntities()
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.ValidatedEntity#getValidators
	 * @model opposite="validators"
	 * @generated
	 */
	EList<ValidatedEntity> getValidatedEntities();

} // VVCase
