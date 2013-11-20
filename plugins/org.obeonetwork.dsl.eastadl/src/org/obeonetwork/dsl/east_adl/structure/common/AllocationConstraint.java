/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.common;

import org.obeonetwork.dsl.east_adl.core.EASTADLNamedElement;

import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ECU;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allocation Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is an intermediary entity used as link between an ECU and the entity that is allocated.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.AllocationConstraint#getAllocator <em>Allocator</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.AllocationConstraint#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getAllocationConstraint()
 * @model
 * @generated
 */
public interface AllocationConstraint extends EASTADLNamedElement {
	/**
	 * Returns the value of the '<em><b>Allocator</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.common.AllocatableEntity#getAllocation <em>Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the allocator of this constraint.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allocator</em>' container reference.
	 * @see #setAllocator(AllocatableEntity)
	 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getAllocationConstraint_Allocator()
	 * @see org.obeonetwork.dsl.east_adl.structure.common.AllocatableEntity#getAllocation
	 * @model opposite="allocation" required="true" transient="false"
	 * @generated
	 */
	AllocatableEntity getAllocator();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.common.AllocationConstraint#getAllocator <em>Allocator</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allocator</em>' container reference.
	 * @see #getAllocator()
	 * @generated
	 */
	void setAllocator(AllocatableEntity value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ECU#getAllocations <em>Allocations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the target ECU of this constraint.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ECU)
	 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getAllocationConstraint_Target()
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ECU#getAllocations
	 * @model opposite="allocations"
	 * @generated
	 */
	ECU getTarget();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.common.AllocationConstraint#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ECU value);

} // AllocationConstraint
