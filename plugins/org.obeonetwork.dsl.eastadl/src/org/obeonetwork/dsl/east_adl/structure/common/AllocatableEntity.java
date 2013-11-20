/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.common;

import org.eclipse.emf.ecore.EObject;

import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ECU;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allocatable Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is an entity that can be allocated to an ecu.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.AllocatableEntity#getAllocation <em>Allocation</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.AllocatableEntity#getAllocationTarget <em>Allocation Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getAllocatableEntity()
 * @model abstract="true"
 * @generated
 */
public interface AllocatableEntity extends EObject {
	/**
	 * Returns the value of the '<em><b>Allocation</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.common.AllocationConstraint#getAllocator <em>Allocator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the allocation of this entity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allocation</em>' containment reference.
	 * @see #setAllocation(AllocationConstraint)
	 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getAllocatableEntity_Allocation()
	 * @see org.obeonetwork.dsl.east_adl.structure.common.AllocationConstraint#getAllocator
	 * @model opposite="allocator" containment="true"
	 * @generated
	 */
	AllocationConstraint getAllocation();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.common.AllocatableEntity#getAllocation <em>Allocation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allocation</em>' containment reference.
	 * @see #getAllocation()
	 * @generated
	 */
	void setAllocation(AllocationConstraint value);

	/**
	 * Returns the value of the '<em><b>Allocation Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is a derived property for the target ECU.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allocation Target</em>' reference.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getAllocatableEntity_AllocationTarget()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	ECU getAllocationTarget();

} // AllocatableEntity
