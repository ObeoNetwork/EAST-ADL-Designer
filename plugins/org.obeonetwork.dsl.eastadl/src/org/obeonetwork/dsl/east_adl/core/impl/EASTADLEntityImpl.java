/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.core.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.east_adl.core.CorePackage;
import org.obeonetwork.dsl.east_adl.core.EASTADLEntity;

import org.obeonetwork.dsl.east_adl.requirements.Assignment;
import org.obeonetwork.dsl.east_adl.requirements.Requirement;
import org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EASTADL Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.core.impl.EASTADLEntityImpl#getPassiveAssignments <em>Passive Assignments</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.core.impl.EASTADLEntityImpl#getAssignedRequirements <em>Assigned Requirements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class EASTADLEntityImpl extends EASTADLNamedElementImpl implements EASTADLEntity {
	/**
	 * The cached value of the '{@link #getPassiveAssignments() <em>Passive Assignments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassiveAssignments()
	 * @generated
	 * @ordered
	 */
	protected EList<Assignment> passiveAssignments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EASTADLEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.EASTADL_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Assignment> getPassiveAssignments() {
		if (passiveAssignments == null) {
			passiveAssignments = new EObjectWithInverseResolvingEList<Assignment>(Assignment.class, this, CorePackage.EASTADL_ENTITY__PASSIVE_ASSIGNMENTS, RequirementsPackage.ASSIGNMENT__TARGET);
		}
		return passiveAssignments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requirement> getAssignedRequirements() {
		// TODO: implement this method to return the 'Assigned Requirements' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.EASTADL_ENTITY__PASSIVE_ASSIGNMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPassiveAssignments()).basicAdd(otherEnd, msgs);
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
			case CorePackage.EASTADL_ENTITY__PASSIVE_ASSIGNMENTS:
				return ((InternalEList<?>)getPassiveAssignments()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.EASTADL_ENTITY__PASSIVE_ASSIGNMENTS:
				return getPassiveAssignments();
			case CorePackage.EASTADL_ENTITY__ASSIGNED_REQUIREMENTS:
				return getAssignedRequirements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.EASTADL_ENTITY__PASSIVE_ASSIGNMENTS:
				getPassiveAssignments().clear();
				getPassiveAssignments().addAll((Collection<? extends Assignment>)newValue);
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
			case CorePackage.EASTADL_ENTITY__PASSIVE_ASSIGNMENTS:
				getPassiveAssignments().clear();
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
			case CorePackage.EASTADL_ENTITY__PASSIVE_ASSIGNMENTS:
				return passiveAssignments != null && !passiveAssignments.isEmpty();
			case CorePackage.EASTADL_ENTITY__ASSIGNED_REQUIREMENTS:
				return !getAssignedRequirements().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EASTADLEntityImpl
