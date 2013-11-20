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

import org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity;
import org.obeonetwork.dsl.east_adl.variant_handling.Variant_handlingPackage;
import org.obeonetwork.dsl.east_adl.variant_handling.Variation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.variant_handling.impl.VariationImpl#getVariant <em>Variant</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.variant_handling.impl.VariationImpl#getVariationPoint <em>Variation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariationImpl extends EASTADLNamedElementImpl implements Variation {
	/**
	 * The cached value of the '{@link #getVariant() <em>Variant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariant()
	 * @generated
	 * @ordered
	 */
	protected VariantEntity variant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Variant_handlingPackage.Literals.VARIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariantEntity getVariant() {
		if (variant != null && variant.eIsProxy()) {
			InternalEObject oldVariant = (InternalEObject)variant;
			variant = (VariantEntity)eResolveProxy(oldVariant);
			if (variant != oldVariant) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Variant_handlingPackage.VARIATION__VARIANT, oldVariant, variant));
			}
		}
		return variant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariantEntity basicGetVariant() {
		return variant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariant(VariantEntity newVariant, NotificationChain msgs) {
		VariantEntity oldVariant = variant;
		variant = newVariant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Variant_handlingPackage.VARIATION__VARIANT, oldVariant, newVariant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariant(VariantEntity newVariant) {
		if (newVariant != variant) {
			NotificationChain msgs = null;
			if (variant != null)
				msgs = ((InternalEObject)variant).eInverseRemove(this, Variant_handlingPackage.VARIANT_ENTITY__PASSIVE_VARIATION, VariantEntity.class, msgs);
			if (newVariant != null)
				msgs = ((InternalEObject)newVariant).eInverseAdd(this, Variant_handlingPackage.VARIANT_ENTITY__PASSIVE_VARIATION, VariantEntity.class, msgs);
			msgs = basicSetVariant(newVariant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Variant_handlingPackage.VARIATION__VARIANT, newVariant, newVariant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariantEntity getVariationPoint() {
		if (eContainerFeatureID() != Variant_handlingPackage.VARIATION__VARIATION_POINT) return null;
		return (VariantEntity)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariationPoint(VariantEntity newVariationPoint, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newVariationPoint, Variant_handlingPackage.VARIATION__VARIATION_POINT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariationPoint(VariantEntity newVariationPoint) {
		if (newVariationPoint != eInternalContainer() || (eContainerFeatureID() != Variant_handlingPackage.VARIATION__VARIATION_POINT && newVariationPoint != null)) {
			if (EcoreUtil.isAncestor(this, newVariationPoint))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newVariationPoint != null)
				msgs = ((InternalEObject)newVariationPoint).eInverseAdd(this, Variant_handlingPackage.VARIANT_ENTITY__ACTIVE_VARIATIONS, VariantEntity.class, msgs);
			msgs = basicSetVariationPoint(newVariationPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Variant_handlingPackage.VARIATION__VARIATION_POINT, newVariationPoint, newVariationPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Variant_handlingPackage.VARIATION__VARIANT:
				if (variant != null)
					msgs = ((InternalEObject)variant).eInverseRemove(this, Variant_handlingPackage.VARIANT_ENTITY__PASSIVE_VARIATION, VariantEntity.class, msgs);
				return basicSetVariant((VariantEntity)otherEnd, msgs);
			case Variant_handlingPackage.VARIATION__VARIATION_POINT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetVariationPoint((VariantEntity)otherEnd, msgs);
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
			case Variant_handlingPackage.VARIATION__VARIANT:
				return basicSetVariant(null, msgs);
			case Variant_handlingPackage.VARIATION__VARIATION_POINT:
				return basicSetVariationPoint(null, msgs);
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
			case Variant_handlingPackage.VARIATION__VARIATION_POINT:
				return eInternalContainer().eInverseRemove(this, Variant_handlingPackage.VARIANT_ENTITY__ACTIVE_VARIATIONS, VariantEntity.class, msgs);
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
			case Variant_handlingPackage.VARIATION__VARIANT:
				if (resolve) return getVariant();
				return basicGetVariant();
			case Variant_handlingPackage.VARIATION__VARIATION_POINT:
				return getVariationPoint();
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
			case Variant_handlingPackage.VARIATION__VARIANT:
				setVariant((VariantEntity)newValue);
				return;
			case Variant_handlingPackage.VARIATION__VARIATION_POINT:
				setVariationPoint((VariantEntity)newValue);
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
			case Variant_handlingPackage.VARIATION__VARIANT:
				setVariant((VariantEntity)null);
				return;
			case Variant_handlingPackage.VARIATION__VARIATION_POINT:
				setVariationPoint((VariantEntity)null);
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
			case Variant_handlingPackage.VARIATION__VARIANT:
				return variant != null;
			case Variant_handlingPackage.VARIATION__VARIATION_POINT:
				return getVariationPoint() != null;
		}
		return super.eIsSet(featureID);
	}

} //VariationImpl
