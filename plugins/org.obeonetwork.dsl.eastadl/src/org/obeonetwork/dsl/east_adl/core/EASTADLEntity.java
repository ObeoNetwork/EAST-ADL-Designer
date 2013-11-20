/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.core;

import org.eclipse.emf.common.util.EList;

import org.obeonetwork.dsl.east_adl.requirements.Assignment;
import org.obeonetwork.dsl.east_adl.requirements.Requirement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EASTADL Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is the base class for all EAST-ADL structural entities.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.core.EASTADLEntity#getPassiveAssignments <em>Passive Assignments</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.core.EASTADLEntity#getAssignedRequirements <em>Assigned Requirements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.core.CorePackage#getEASTADLEntity()
 * @model abstract="true"
 * @generated
 */
public interface EASTADLEntity extends EASTADLNamedElement {
	/**
	 * Returns the value of the '<em><b>Passive Assignments</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.requirements.Assignment}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.requirements.Assignment#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are all assignments of this entity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Passive Assignments</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.core.CorePackage#getEASTADLEntity_PassiveAssignments()
	 * @see org.obeonetwork.dsl.east_adl.requirements.Assignment#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Assignment> getPassiveAssignments();

	/**
	 * Returns the value of the '<em><b>Assigned Requirements</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.requirements.Requirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are requirements assigning this entity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assigned Requirements</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.core.CorePackage#getEASTADLEntity_AssignedRequirements()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Requirement> getAssignedRequirements();

} // EASTADLEntity
