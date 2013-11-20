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

import org.obeonetwork.dsl.east_adl.structure.common.CommonPackage;
import org.obeonetwork.dsl.east_adl.structure.common.Realization;
import org.obeonetwork.dsl.east_adl.structure.common.RealizedEntity;
import org.obeonetwork.dsl.east_adl.structure.common.RealizingEntity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Realization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.impl.RealizationImpl#getRealizedEntity <em>Realized Entity</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.impl.RealizationImpl#getRealizingEntity <em>Realizing Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RealizationImpl extends EASTADLNamedElementImpl implements Realization {
	/**
	 * The cached value of the '{@link #getRealizedEntity() <em>Realized Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizedEntity()
	 * @generated
	 * @ordered
	 */
	protected RealizedEntity realizedEntity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RealizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.REALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealizedEntity getRealizedEntity() {
		if (realizedEntity != null && realizedEntity.eIsProxy()) {
			InternalEObject oldRealizedEntity = (InternalEObject)realizedEntity;
			realizedEntity = (RealizedEntity)eResolveProxy(oldRealizedEntity);
			if (realizedEntity != oldRealizedEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonPackage.REALIZATION__REALIZED_ENTITY, oldRealizedEntity, realizedEntity));
			}
		}
		return realizedEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealizedEntity basicGetRealizedEntity() {
		return realizedEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRealizedEntity(RealizedEntity newRealizedEntity, NotificationChain msgs) {
		RealizedEntity oldRealizedEntity = realizedEntity;
		realizedEntity = newRealizedEntity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommonPackage.REALIZATION__REALIZED_ENTITY, oldRealizedEntity, newRealizedEntity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRealizedEntity(RealizedEntity newRealizedEntity) {
		if (newRealizedEntity != realizedEntity) {
			NotificationChain msgs = null;
			if (realizedEntity != null)
				msgs = ((InternalEObject)realizedEntity).eInverseRemove(this, CommonPackage.REALIZED_ENTITY__PASSIVE_REALIZATIONS, RealizedEntity.class, msgs);
			if (newRealizedEntity != null)
				msgs = ((InternalEObject)newRealizedEntity).eInverseAdd(this, CommonPackage.REALIZED_ENTITY__PASSIVE_REALIZATIONS, RealizedEntity.class, msgs);
			msgs = basicSetRealizedEntity(newRealizedEntity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.REALIZATION__REALIZED_ENTITY, newRealizedEntity, newRealizedEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealizingEntity getRealizingEntity() {
		if (eContainerFeatureID() != CommonPackage.REALIZATION__REALIZING_ENTITY) return null;
		return (RealizingEntity)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRealizingEntity(RealizingEntity newRealizingEntity, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRealizingEntity, CommonPackage.REALIZATION__REALIZING_ENTITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRealizingEntity(RealizingEntity newRealizingEntity) {
		if (newRealizingEntity != eInternalContainer() || (eContainerFeatureID() != CommonPackage.REALIZATION__REALIZING_ENTITY && newRealizingEntity != null)) {
			if (EcoreUtil.isAncestor(this, newRealizingEntity))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRealizingEntity != null)
				msgs = ((InternalEObject)newRealizingEntity).eInverseAdd(this, CommonPackage.REALIZING_ENTITY__ACTIVE_REALIZATIONS, RealizingEntity.class, msgs);
			msgs = basicSetRealizingEntity(newRealizingEntity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.REALIZATION__REALIZING_ENTITY, newRealizingEntity, newRealizingEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommonPackage.REALIZATION__REALIZED_ENTITY:
				if (realizedEntity != null)
					msgs = ((InternalEObject)realizedEntity).eInverseRemove(this, CommonPackage.REALIZED_ENTITY__PASSIVE_REALIZATIONS, RealizedEntity.class, msgs);
				return basicSetRealizedEntity((RealizedEntity)otherEnd, msgs);
			case CommonPackage.REALIZATION__REALIZING_ENTITY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRealizingEntity((RealizingEntity)otherEnd, msgs);
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
			case CommonPackage.REALIZATION__REALIZED_ENTITY:
				return basicSetRealizedEntity(null, msgs);
			case CommonPackage.REALIZATION__REALIZING_ENTITY:
				return basicSetRealizingEntity(null, msgs);
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
			case CommonPackage.REALIZATION__REALIZING_ENTITY:
				return eInternalContainer().eInverseRemove(this, CommonPackage.REALIZING_ENTITY__ACTIVE_REALIZATIONS, RealizingEntity.class, msgs);
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
			case CommonPackage.REALIZATION__REALIZED_ENTITY:
				if (resolve) return getRealizedEntity();
				return basicGetRealizedEntity();
			case CommonPackage.REALIZATION__REALIZING_ENTITY:
				return getRealizingEntity();
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
			case CommonPackage.REALIZATION__REALIZED_ENTITY:
				setRealizedEntity((RealizedEntity)newValue);
				return;
			case CommonPackage.REALIZATION__REALIZING_ENTITY:
				setRealizingEntity((RealizingEntity)newValue);
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
			case CommonPackage.REALIZATION__REALIZED_ENTITY:
				setRealizedEntity((RealizedEntity)null);
				return;
			case CommonPackage.REALIZATION__REALIZING_ENTITY:
				setRealizingEntity((RealizingEntity)null);
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
			case CommonPackage.REALIZATION__REALIZED_ENTITY:
				return realizedEntity != null;
			case CommonPackage.REALIZATION__REALIZING_ENTITY:
				return getRealizingEntity() != null;
		}
		return super.eIsSet(featureID);
	}

} //RealizationImpl
