/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.requirements;

import org.eclipse.emf.common.util.EList;

import org.obeonetwork.dsl.east_adl.core.EASTADLEntity;
import org.obeonetwork.dsl.east_adl.core.EASTADLNamedElement;

import org.obeonetwork.dsl.east_adl.support.ArchivedEntity;

import org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity;

import org.obeonetwork.dsl.east_adl.verification_validation.ValidatedEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is an abstract element used to unite common properties of specific properties type. Its purpose is also to make simpler the interaction of requirement entities with artifacts by providing a single property for all objects of the same kind.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.Requirement#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.Requirement#getExternalDescriptions <em>External Descriptions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.Requirement#getStatus <em>Status</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.Requirement#getMaturity <em>Maturity</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.Requirement#getAcceptanceCriterion <em>Acceptance Criterion</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.Requirement#getCriticality <em>Criticality</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.Requirement#getDescription <em>Description</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.Requirement#getActiveTraces <em>Active Traces</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.Requirement#getPassiveTraces <em>Passive Traces</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.Requirement#getDerivedRequirements <em>Derived Requirements</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.Requirement#getSourceRequirements <em>Source Requirements</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.Requirement#getSubRequirements <em>Sub Requirements</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.Requirement#getVerificationMethods <em>Verification Methods</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.Requirement#getActiveAssignments <em>Active Assignments</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.Requirement#getAssignedEntities <em>Assigned Entities</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage#getRequirement()
 * @model abstract="true"
 * @generated
 */
public interface Requirement extends EASTADLNamedElement, ArchivedEntity, VariantEntity, ValidatedEntity {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute is the unique identifier of the requirement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage#getRequirement_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.requirements.Requirement#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>External Descriptions</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.requirements.RequirementDescription}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.requirements.RequirementDescription#getRequirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are externals descriptions (not contained in the model) of this requirement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>External Descriptions</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage#getRequirement_ExternalDescriptions()
	 * @see org.obeonetwork.dsl.east_adl.requirements.RequirementDescription#getRequirement
	 * @model opposite="requirement" containment="true"
	 * @generated
	 */
	EList<RequirementDescription> getExternalDescriptions();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute is a process specific enumeration. To make things simple, the type of this attribute is String.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(String)
	 * @see org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage#getRequirement_Status()
	 * @model
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.requirements.Requirement#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

	/**
	 * Returns the value of the '<em><b>Maturity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute describes the maturity of this requirement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maturity</em>' attribute.
	 * @see #setMaturity(String)
	 * @see org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage#getRequirement_Maturity()
	 * @model
	 * @generated
	 */
	String getMaturity();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.requirements.Requirement#getMaturity <em>Maturity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maturity</em>' attribute.
	 * @see #getMaturity()
	 * @generated
	 */
	void setMaturity(String value);

	/**
	 * Returns the value of the '<em><b>Acceptance Criterion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute is the condition required for this requirement to be accepted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Acceptance Criterion</em>' attribute.
	 * @see #setAcceptanceCriterion(String)
	 * @see org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage#getRequirement_AcceptanceCriterion()
	 * @model
	 * @generated
	 */
	String getAcceptanceCriterion();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.requirements.Requirement#getAcceptanceCriterion <em>Acceptance Criterion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acceptance Criterion</em>' attribute.
	 * @see #getAcceptanceCriterion()
	 * @generated
	 */
	void setAcceptanceCriterion(String value);

	/**
	 * Returns the value of the '<em><b>Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute is the criticality of this requirement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Criticality</em>' attribute.
	 * @see #setCriticality(String)
	 * @see org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage#getRequirement_Criticality()
	 * @model
	 * @generated
	 */
	String getCriticality();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.requirements.Requirement#getCriticality <em>Criticality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Criticality</em>' attribute.
	 * @see #getCriticality()
	 * @generated
	 */
	void setCriticality(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute provides the desription of this requirement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage#getRequirement_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.requirements.Requirement#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Active Traces</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.requirements.Trace}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.requirements.Trace#getTracer <em>Tracer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are all requirements traced by this entity. A trace is used here for a proxy-like representation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Active Traces</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage#getRequirement_ActiveTraces()
	 * @see org.obeonetwork.dsl.east_adl.requirements.Trace#getTracer
	 * @model opposite="tracer" containment="true"
	 * @generated
	 */
	EList<Trace> getActiveTraces();

	/**
	 * Returns the value of the '<em><b>Passive Traces</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.requirements.Trace}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.requirements.Trace#getTraced <em>Traced</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are the traces representing requirements that trace this variant entity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Passive Traces</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage#getRequirement_PassiveTraces()
	 * @see org.obeonetwork.dsl.east_adl.requirements.Trace#getTraced
	 * @model opposite="traced"
	 * @generated
	 */
	EList<Trace> getPassiveTraces();

	/**
	 * Returns the value of the '<em><b>Derived Requirements</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.requirements.Requirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is a derived property used to show all requirements traced by this entity (if any).
	 * This property will be shown instead of the corresponding trace model objects because it is more explicit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Derived Requirements</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage#getRequirement_DerivedRequirements()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Requirement> getDerivedRequirements();

	/**
	 * Returns the value of the '<em><b>Source Requirements</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.requirements.Requirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is a derived property used to show all requirements that trace this entity (if any).
	 * This property will be shown instead of the corresponding trace model objects because it is more explicit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Requirements</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage#getRequirement_SourceRequirements()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Requirement> getSourceRequirements();

	/**
	 * Returns the value of the '<em><b>Sub Requirements</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.requirements.Requirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are all sub requirements of this entity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Requirements</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage#getRequirement_SubRequirements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Requirement> getSubRequirements();

	/**
	 * Returns the value of the '<em><b>Verification Methods</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.requirements.VerificationMethod}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.requirements.VerificationMethod#getRequirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are the methods used to verify this requirement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Verification Methods</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage#getRequirement_VerificationMethods()
	 * @see org.obeonetwork.dsl.east_adl.requirements.VerificationMethod#getRequirement
	 * @model opposite="requirement" containment="true"
	 * @generated
	 */
	EList<VerificationMethod> getVerificationMethods();

	/**
	 * Returns the value of the '<em><b>Active Assignments</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.requirements.Assignment}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.requirements.Assignment#getAssigner <em>Assigner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are all entities assigned by this requirement. An intermediary object is used here.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Active Assignments</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage#getRequirement_ActiveAssignments()
	 * @see org.obeonetwork.dsl.east_adl.requirements.Assignment#getAssigner
	 * @model opposite="assigner" containment="true"
	 * @generated
	 */
	EList<Assignment> getActiveAssignments();

	/**
	 * Returns the value of the '<em><b>Assigned Entities</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.core.EASTADLEntity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are all assigned entities.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assigned Entities</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage#getRequirement_AssignedEntities()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<EASTADLEntity> getAssignedEntities();

} // Requirement
