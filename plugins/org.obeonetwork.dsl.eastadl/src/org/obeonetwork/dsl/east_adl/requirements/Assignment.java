/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.requirements;

import org.obeonetwork.dsl.east_adl.core.EASTADLEntity;
import org.obeonetwork.dsl.east_adl.core.EASTADLNamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity is used to link a requirement to a structural entity.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.Assignment#getTarget <em>Target</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.Assignment#getAssigner <em>Assigner</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage#getAssignment()
 * @model
 * @generated
 */
public interface Assignment extends EASTADLNamedElement {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.core.EASTADLEntity#getPassiveAssignments <em>Passive Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the entity that is assigned by this assignment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(EASTADLEntity)
	 * @see org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage#getAssignment_Target()
	 * @see org.obeonetwork.dsl.east_adl.core.EASTADLEntity#getPassiveAssignments
	 * @model opposite="passiveAssignments"
	 * @generated
	 */
	EASTADLEntity getTarget();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.requirements.Assignment#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(EASTADLEntity value);

	/**
	 * Returns the value of the '<em><b>Assigner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.requirements.Requirement#getActiveAssignments <em>Active Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the assigner of this assignment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assigner</em>' container reference.
	 * @see #setAssigner(Requirement)
	 * @see org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage#getAssignment_Assigner()
	 * @see org.obeonetwork.dsl.east_adl.requirements.Requirement#getActiveAssignments
	 * @model opposite="activeAssignments" required="true" transient="false"
	 * @generated
	 */
	Requirement getAssigner();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.requirements.Assignment#getAssigner <em>Assigner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assigner</em>' container reference.
	 * @see #getAssigner()
	 * @generated
	 */
	void setAssigner(Requirement value);

} // Assignment
