/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.common.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.east_adl.structure.common.CommonPackage;
import org.obeonetwork.dsl.east_adl.structure.common.Realization;
import org.obeonetwork.dsl.east_adl.structure.common.RealizedEntity;
import org.obeonetwork.dsl.east_adl.structure.common.RealizingEntity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Realized Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.impl.RealizedEntityImpl#getPassiveRealizations <em>Passive Realizations</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.impl.RealizedEntityImpl#getRealizedBy <em>Realized By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RealizedEntityImpl extends EObjectImpl implements RealizedEntity {
	/**
	 * The cached value of the '{@link #getPassiveRealizations() <em>Passive Realizations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassiveRealizations()
	 * @generated
	 * @ordered
	 */
	protected EList<Realization> passiveRealizations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RealizedEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.REALIZED_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Realization> getPassiveRealizations() {
		if (passiveRealizations == null) {
			passiveRealizations = new EObjectWithInverseResolvingEList<Realization>(Realization.class, this, CommonPackage.REALIZED_ENTITY__PASSIVE_REALIZATIONS, CommonPackage.REALIZATION__REALIZED_ENTITY);
		}
		return passiveRealizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RealizingEntity> getRealizedBy() {
		// TODO: implement this method to return the 'Realized By' reference list
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
			case CommonPackage.REALIZED_ENTITY__PASSIVE_REALIZATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPassiveRealizations()).basicAdd(otherEnd, msgs);
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
			case CommonPackage.REALIZED_ENTITY__PASSIVE_REALIZATIONS:
				return ((InternalEList<?>)getPassiveRealizations()).basicRemove(otherEnd, msgs);
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
			case CommonPackage.REALIZED_ENTITY__PASSIVE_REALIZATIONS:
				return getPassiveRealizations();
			case CommonPackage.REALIZED_ENTITY__REALIZED_BY:
				return getRealizedBy();
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
			case CommonPackage.REALIZED_ENTITY__PASSIVE_REALIZATIONS:
				getPassiveRealizations().clear();
				getPassiveRealizations().addAll((Collection<? extends Realization>)newValue);
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
			case CommonPackage.REALIZED_ENTITY__PASSIVE_REALIZATIONS:
				getPassiveRealizations().clear();
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
			case CommonPackage.REALIZED_ENTITY__PASSIVE_REALIZATIONS:
				return passiveRealizations != null && !passiveRealizations.isEmpty();
			case CommonPackage.REALIZED_ENTITY__REALIZED_BY:
				return !getRealizedBy().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RealizedEntityImpl
