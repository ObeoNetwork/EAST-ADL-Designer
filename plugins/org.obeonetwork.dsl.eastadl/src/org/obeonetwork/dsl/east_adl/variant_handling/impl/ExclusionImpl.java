/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.variant_handling.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.obeonetwork.dsl.east_adl.core.impl.EASTADLNamedElementImpl;

import org.obeonetwork.dsl.east_adl.variant_handling.Exclusion;
import org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity;
import org.obeonetwork.dsl.east_adl.variant_handling.Variant_handlingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exclusion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.variant_handling.impl.ExclusionImpl#getExcluder <em>Excluder</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.variant_handling.impl.ExclusionImpl#getExcluded <em>Excluded</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExclusionImpl extends EASTADLNamedElementImpl implements Exclusion {
	/**
	 * The cached value of the '{@link #getExcluded() <em>Excluded</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcluded()
	 * @generated
	 * @ordered
	 */
	protected VariantEntity excluded;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExclusionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Variant_handlingPackage.Literals.EXCLUSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariantEntity getExcluder() {
		if (eContainerFeatureID() != Variant_handlingPackage.EXCLUSION__EXCLUDER) return null;
		return (VariantEntity)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExcluder(VariantEntity newExcluder, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newExcluder, Variant_handlingPackage.EXCLUSION__EXCLUDER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExcluder(VariantEntity newExcluder) {
		if (newExcluder != eInternalContainer() || (eContainerFeatureID() != Variant_handlingPackage.EXCLUSION__EXCLUDER && newExcluder != null)) {
			if (EcoreUtil.isAncestor(this, newExcluder))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newExcluder != null)
				msgs = ((InternalEObject)newExcluder).eInverseAdd(this, Variant_handlingPackage.VARIANT_ENTITY__ACTIVE_EXCLUSIONS, VariantEntity.class, msgs);
			msgs = basicSetExcluder(newExcluder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Variant_handlingPackage.EXCLUSION__EXCLUDER, newExcluder, newExcluder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariantEntity getExcluded() {
		if (excluded != null && excluded.eIsProxy()) {
			InternalEObject oldExcluded = (InternalEObject)excluded;
			excluded = (VariantEntity)eResolveProxy(oldExcluded);
			if (excluded != oldExcluded) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Variant_handlingPackage.EXCLUSION__EXCLUDED, oldExcluded, excluded));
			}
		}
		return excluded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariantEntity basicGetExcluded() {
		return excluded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExcluded(VariantEntity newExcluded, NotificationChain msgs) {
		VariantEntity oldExcluded = excluded;
		excluded = newExcluded;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Variant_handlingPackage.EXCLUSION__EXCLUDED, oldExcluded, newExcluded);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExcluded(VariantEntity newExcluded) {
		if (newExcluded != excluded) {
			NotificationChain msgs = null;
			if (excluded != null)
				msgs = ((InternalEObject)excluded).eInverseRemove(this, Variant_handlingPackage.VARIANT_ENTITY__PASSIVE_EXCLUSIONS, VariantEntity.class, msgs);
			if (newExcluded != null)
				msgs = ((InternalEObject)newExcluded).eInverseAdd(this, Variant_handlingPackage.VARIANT_ENTITY__PASSIVE_EXCLUSIONS, VariantEntity.class, msgs);
			msgs = basicSetExcluded(newExcluded, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Variant_handlingPackage.EXCLUSION__EXCLUDED, newExcluded, newExcluded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Variant_handlingPackage.EXCLUSION__EXCLUDER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetExcluder((VariantEntity)otherEnd, msgs);
			case Variant_handlingPackage.EXCLUSION__EXCLUDED:
				if (excluded != null)
					msgs = ((InternalEObject)excluded).eInverseRemove(this, Variant_handlingPackage.VARIANT_ENTITY__PASSIVE_EXCLUSIONS, VariantEntity.class, msgs);
				return basicSetExcluded((VariantEntity)otherEnd, msgs);
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
			case Variant_handlingPackage.EXCLUSION__EXCLUDER:
				return basicSetExcluder(null, msgs);
			case Variant_handlingPackage.EXCLUSION__EXCLUDED:
				return basicSetExcluded(null, msgs);
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
			case Variant_handlingPackage.EXCLUSION__EXCLUDER:
				return eInternalContainer().eInverseRemove(this, Variant_handlingPackage.VARIANT_ENTITY__ACTIVE_EXCLUSIONS, VariantEntity.class, msgs);
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
			case Variant_handlingPackage.EXCLUSION__EXCLUDER:
				return getExcluder();
			case Variant_handlingPackage.EXCLUSION__EXCLUDED:
				if (resolve) return getExcluded();
				return basicGetExcluded();
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
			case Variant_handlingPackage.EXCLUSION__EXCLUDER:
				setExcluder((VariantEntity)newValue);
				return;
			case Variant_handlingPackage.EXCLUSION__EXCLUDED:
				setExcluded((VariantEntity)newValue);
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
			case Variant_handlingPackage.EXCLUSION__EXCLUDER:
				setExcluder((VariantEntity)null);
				return;
			case Variant_handlingPackage.EXCLUSION__EXCLUDED:
				setExcluded((VariantEntity)null);
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
			case Variant_handlingPackage.EXCLUSION__EXCLUDER:
				return getExcluder() != null;
			case Variant_handlingPackage.EXCLUSION__EXCLUDED:
				return excluded != null;
		}
		return super.eIsSet(featureID);
	}

} //ExclusionImpl
