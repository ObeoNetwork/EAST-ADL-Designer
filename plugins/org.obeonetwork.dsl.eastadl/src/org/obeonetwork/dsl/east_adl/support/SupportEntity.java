/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.support;

import org.obeonetwork.dsl.east_adl.core.EASTADLArtifact;
import org.obeonetwork.dsl.east_adl.core.EASTADLNamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is a generalization of all support entities that can be owned by an artifact. Its purpose is to make simpler the interaction of support entities with artifacts by providing a single property for all objects of the same kind.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.support.SupportEntity#getOwningArtifact <em>Owning Artifact</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.support.SupportPackage#getSupportEntity()
 * @model abstract="true"
 * @generated
 */
public interface SupportEntity extends EASTADLNamedElement {
	/**
	 * Returns the value of the '<em><b>Owning Artifact</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.core.EASTADLArtifact#getSupportEntities <em>Support Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the containing artifact.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Artifact</em>' container reference.
	 * @see #setOwningArtifact(EASTADLArtifact)
	 * @see org.obeonetwork.dsl.east_adl.support.SupportPackage#getSupportEntity_OwningArtifact()
	 * @see org.obeonetwork.dsl.east_adl.core.EASTADLArtifact#getSupportEntities
	 * @model opposite="supportEntities" required="true" transient="false"
	 * @generated
	 */
	EASTADLArtifact getOwningArtifact();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.support.SupportEntity#getOwningArtifact <em>Owning Artifact</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Artifact</em>' container reference.
	 * @see #getOwningArtifact()
	 * @generated
	 */
	void setOwningArtifact(EASTADLArtifact value);

} // SupportEntity
