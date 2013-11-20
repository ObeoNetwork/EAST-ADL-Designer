/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.common.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.obeonetwork.dsl.east_adl.core.impl.EASTADLNamedElementImpl;

import org.obeonetwork.dsl.east_adl.structure.common.AllocatableEntity;
import org.obeonetwork.dsl.east_adl.structure.common.AllocationConstraint;
import org.obeonetwork.dsl.east_adl.structure.common.CommonPackage;

import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ECU;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Allocation Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.impl.AllocationConstraintImpl#getAllocator <em>Allocator</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.impl.AllocationConstraintImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AllocationConstraintImpl extends EASTADLNamedElementImpl implements AllocationConstraint {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected ECU target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllocationConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.ALLOCATION_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocatableEntity getAllocator() {
		if (eContainerFeatureID() != CommonPackage.ALLOCATION_CONSTRAINT__ALLOCATOR) return null;
		return (AllocatableEntity)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllocator(AllocatableEntity newAllocator, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAllocator, CommonPackage.ALLOCATION_CONSTRAINT__ALLOCATOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllocator(AllocatableEntity newAllocator) {
		if (newAllocator != eInternalContainer() || (eContainerFeatureID() != CommonPackage.ALLOCATION_CONSTRAINT__ALLOCATOR && newAllocator != null)) {
			if (EcoreUtil.isAncestor(this, newAllocator))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAllocator != null)
				msgs = ((InternalEObject)newAllocator).eInverseAdd(this, CommonPackage.ALLOCATABLE_ENTITY__ALLOCATION, AllocatableEntity.class, msgs);
			msgs = basicSetAllocator(newAllocator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.ALLOCATION_CONSTRAINT__ALLOCATOR, newAllocator, newAllocator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECU getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (ECU)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonPackage.ALLOCATION_CONSTRAINT__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECU basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(ECU newTarget, NotificationChain msgs) {
		ECU oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommonPackage.ALLOCATION_CONSTRAINT__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(ECU newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, Hardware_architecturePackage.ECU__ALLOCATIONS, ECU.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, Hardware_architecturePackage.ECU__ALLOCATIONS, ECU.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.ALLOCATION_CONSTRAINT__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommonPackage.ALLOCATION_CONSTRAINT__ALLOCATOR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAllocator((AllocatableEntity)otherEnd, msgs);
			case CommonPackage.ALLOCATION_CONSTRAINT__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, Hardware_architecturePackage.ECU__ALLOCATIONS, ECU.class, msgs);
				return basicSetTarget((ECU)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommonPackage.ALLOCATION_CONSTRAINT__ALLOCATOR:
				return basicSetAllocator(null, msgs);
			case CommonPackage.ALLOCATION_CONSTRAINT__TARGET:
				return basicSetTarget(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case CommonPackage.ALLOCATION_CONSTRAINT__ALLOCATOR:
				return eInternalContainer().eInverseRemove(this, CommonPackage.ALLOCATABLE_ENTITY__ALLOCATION, AllocatableEntity.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommonPackage.ALLOCATION_CONSTRAINT__ALLOCATOR:
				return getAllocator();
			case CommonPackage.ALLOCATION_CONSTRAINT__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CommonPackage.ALLOCATION_CONSTRAINT__ALLOCATOR:
				setAllocator((AllocatableEntity)newValue);
				return;
			case CommonPackage.ALLOCATION_CONSTRAINT__TARGET:
				setTarget((ECU)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CommonPackage.ALLOCATION_CONSTRAINT__ALLOCATOR:
				setAllocator((AllocatableEntity)null);
				return;
			case CommonPackage.ALLOCATION_CONSTRAINT__TARGET:
				setTarget((ECU)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CommonPackage.ALLOCATION_CONSTRAINT__ALLOCATOR:
				return getAllocator() != null;
			case CommonPackage.ALLOCATION_CONSTRAINT__TARGET:
				return target != null;
		}
		return super.eIsSet(featureID);
	}

} //AllocationConstraintImpl
