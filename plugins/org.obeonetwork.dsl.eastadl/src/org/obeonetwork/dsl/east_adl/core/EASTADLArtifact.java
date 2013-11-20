/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.core;

import org.eclipse.emf.common.util.EList;

import org.obeonetwork.dsl.east_adl.EASTADLModel;

import org.obeonetwork.dsl.east_adl.requirements.Requirement;

import org.obeonetwork.dsl.east_adl.support.SupportEntity;

import org.obeonetwork.dsl.east_adl.verification_validation.VVCase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EASTADL Artifact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is an EAST-ADL artifact, a container for EAST-ADL structural entities. For more information, look at the documentation provided for a specific artifact.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.core.EASTADLArtifact#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.core.EASTADLArtifact#getModel <em>Model</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.core.EASTADLArtifact#getSupportEntities <em>Support Entities</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.core.EASTADLArtifact#getValidationEntities <em>Validation Entities</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.core.CorePackage#getEASTADLArtifact()
 * @model abstract="true"
 * @generated
 */
public interface EASTADLArtifact extends EASTADLNamedElement {
	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.requirements.Requirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are the requirements contained in this artifact.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requirements</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.core.CorePackage#getEASTADLArtifact_Requirements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Requirement> getRequirements();

	/**
	 * Returns the value of the '<em><b>Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.EASTADLModel#getArtifacts <em>Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the owning model of this artifact.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Model</em>' container reference.
	 * @see #setModel(EASTADLModel)
	 * @see org.obeonetwork.dsl.east_adl.core.CorePackage#getEASTADLArtifact_Model()
	 * @see org.obeonetwork.dsl.east_adl.EASTADLModel#getArtifacts
	 * @model opposite="artifacts" required="true" transient="false"
	 * @generated
	 */
	EASTADLModel getModel();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.core.EASTADLArtifact#getModel <em>Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' container reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(EASTADLModel value);

	/**
	 * Returns the value of the '<em><b>Support Entities</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.support.SupportEntity}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.support.SupportEntity#getOwningArtifact <em>Owning Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are support entities that are contained in this artifact.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Support Entities</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.core.CorePackage#getEASTADLArtifact_SupportEntities()
	 * @see org.obeonetwork.dsl.east_adl.support.SupportEntity#getOwningArtifact
	 * @model opposite="owningArtifact" containment="true"
	 * @generated
	 */
	EList<SupportEntity> getSupportEntities();

	/**
	 * Returns the value of the '<em><b>Validation Entities</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.verification_validation.VVCase}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.verification_validation.VVCase#getOwningArtifact <em>Owning Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are verification and validation entities of this artifact.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Validation Entities</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.core.CorePackage#getEASTADLArtifact_ValidationEntities()
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.VVCase#getOwningArtifact
	 * @model opposite="owningArtifact" containment="true"
	 * @generated
	 */
	EList<VVCase> getValidationEntities();

} // EASTADLArtifact
