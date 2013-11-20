/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.requirements.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.obeonetwork.dsl.east_adl.core.CorePackage;
import org.obeonetwork.dsl.east_adl.core.EASTADLEntity;

import org.obeonetwork.dsl.east_adl.core.impl.EASTADLNamedElementImpl;

import org.obeonetwork.dsl.east_adl.requirements.Assignment;
import org.obeonetwork.dsl.east_adl.requirements.Requirement;
import org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.impl.AssignmentImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.impl.AssignmentImpl#getAssigner <em>Assigner</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssignmentImpl extends EASTADLNamedElementImpl implements Assignment {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EASTADLEntity target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementsPackage.Literals.ASSIGNMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EASTADLEntity getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (EASTADLEntity)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RequirementsPackage.ASSIGNMENT__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EASTADLEntity basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(EASTADLEntity newTarget, NotificationChain msgs) {
		EASTADLEntity oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RequirementsPackage.ASSIGNMENT__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(EASTADLEntity newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, CorePackage.EASTADL_ENTITY__PASSIVE_ASSIGNMENTS, EASTADLEntity.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, CorePackage.EASTADL_ENTITY__PASSIVE_ASSIGNMENTS, EASTADLEntity.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.ASSIGNMENT__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement getAssigner() {
		if (eContainerFeatureID() != RequirementsPackage.ASSIGNMENT__ASSIGNER) return null;
		return (Requirement)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssigner(Requirement newAssigner, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAssigner, RequirementsPackage.ASSIGNMENT__ASSIGNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssigner(Requirement newAssigner) {
		if (newAssigner != eInternalContainer() || (eContainerFeatureID() != RequirementsPackage.ASSIGNMENT__ASSIGNER && newAssigner != null)) {
			if (EcoreUtil.isAncestor(this, newAssigner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAssigner != null)
				msgs = ((InternalEObject)newAssigner).eInverseAdd(this, RequirementsPackage.REQUIREMENT__ACTIVE_ASSIGNMENTS, Requirement.class, msgs);
			msgs = basicSetAssigner(newAssigner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.ASSIGNMENT__ASSIGNER, newAssigner, newAssigner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RequirementsPackage.ASSIGNMENT__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, CorePackage.EASTADL_ENTITY__PASSIVE_ASSIGNMENTS, EASTADLEntity.class, msgs);
				return basicSetTarget((EASTADLEntity)otherEnd, msgs);
			case RequirementsPackage.ASSIGNMENT__ASSIGNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAssigner((Requirement)otherEnd, msgs);
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
			case RequirementsPackage.ASSIGNMENT__TARGET:
				return basicSetTarget(null, msgs);
			case RequirementsPackage.ASSIGNMENT__ASSIGNER:
				return basicSetAssigner(null, msgs);
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
			case RequirementsPackage.ASSIGNMENT__ASSIGNER:
				return eInternalContainer().eInverseRemove(this, RequirementsPackage.REQUIREMENT__ACTIVE_ASSIGNMENTS, Requirement.class, msgs);
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
			case RequirementsPackage.ASSIGNMENT__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case RequirementsPackage.ASSIGNMENT__ASSIGNER:
				return getAssigner();
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
			case RequirementsPackage.ASSIGNMENT__TARGET:
				setTarget((EASTADLEntity)newValue);
				return;
			case RequirementsPackage.ASSIGNMENT__ASSIGNER:
				setAssigner((Requirement)newValue);
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
			case RequirementsPackage.ASSIGNMENT__TARGET:
				setTarget((EASTADLEntity)null);
				return;
			case RequirementsPackage.ASSIGNMENT__ASSIGNER:
				setAssigner((Requirement)null);
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
			case RequirementsPackage.ASSIGNMENT__TARGET:
				return target != null;
			case RequirementsPackage.ASSIGNMENT__ASSIGNER:
				return getAssigner() != null;
		}
		return super.eIsSet(featureID);
	}

} //AssignmentImpl
