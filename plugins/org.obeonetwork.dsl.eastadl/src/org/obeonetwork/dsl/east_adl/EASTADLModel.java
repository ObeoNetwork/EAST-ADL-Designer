/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl;

import org.eclipse.emf.common.util.EList;

import org.obeonetwork.dsl.east_adl.core.EASTADLArtifact;
import org.obeonetwork.dsl.east_adl.core.EASTADLNamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EASTADL Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is the root entity for modeling all EAST-ADL artifacts.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.EASTADLModel#getArtifacts <em>Artifacts</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.East_adlPackage#getEASTADLModel()
 * @model
 * @generated
 */
public interface EASTADLModel extends EASTADLNamedElement {
	/**
	 * Returns the value of the '<em><b>Artifacts</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.core.EASTADLArtifact}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.core.EASTADLArtifact#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are artifacts that belong to this model. Several artifacts of same kind can be present.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Artifacts</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.East_adlPackage#getEASTADLModel_Artifacts()
	 * @see org.obeonetwork.dsl.east_adl.core.EASTADLArtifact#getModel
	 * @model opposite="model" containment="true"
	 * @generated
	 */
	EList<EASTADLArtifact> getArtifacts();

} // EASTADLModel
