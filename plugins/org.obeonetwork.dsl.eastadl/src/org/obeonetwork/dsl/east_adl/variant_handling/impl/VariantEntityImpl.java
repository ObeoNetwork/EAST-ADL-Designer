/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.variant_handling.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.east_adl.variant_handling.Exclusion;
import org.obeonetwork.dsl.east_adl.variant_handling.Selection;
import org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity;
import org.obeonetwork.dsl.east_adl.variant_handling.Variant_handlingPackage;
import org.obeonetwork.dsl.east_adl.variant_handling.Variation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variant Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.variant_handling.impl.VariantEntityImpl#isNullVariant <em>Null Variant</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.variant_handling.impl.VariantEntityImpl#isComplete <em>Complete</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.variant_handling.impl.VariantEntityImpl#getActiveVariations <em>Active Variations</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.variant_handling.impl.VariantEntityImpl#getActiveSelections <em>Active Selections</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.variant_handling.impl.VariantEntityImpl#getActiveExclusions <em>Active Exclusions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.variant_handling.impl.VariantEntityImpl#getPassiveVariation <em>Passive Variation</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.variant_handling.impl.VariantEntityImpl#getPassiveSelections <em>Passive Selections</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.variant_handling.impl.VariantEntityImpl#getPassiveExclusions <em>Passive Exclusions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.variant_handling.impl.VariantEntityImpl#getVariationPoint <em>Variation Point</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.variant_handling.impl.VariantEntityImpl#getVariants <em>Variants</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.variant_handling.impl.VariantEntityImpl#getSelectors <em>Selectors</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.variant_handling.impl.VariantEntityImpl#getSelected <em>Selected</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.variant_handling.impl.VariantEntityImpl#getExcluders <em>Excluders</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.variant_handling.impl.VariantEntityImpl#getExcluded <em>Excluded</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.variant_handling.impl.VariantEntityImpl#getSelectionCriterion <em>Selection Criterion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class VariantEntityImpl extends EObjectImpl implements VariantEntity {
	/**
	 * The default value of the '{@link #isNullVariant() <em>Null Variant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNullVariant()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NULL_VARIANT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNullVariant() <em>Null Variant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNullVariant()
	 * @generated
	 * @ordered
	 */
	protected boolean nullVariant = NULL_VARIANT_EDEFAULT;

	/**
	 * The default value of the '{@link #isComplete() <em>Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isComplete()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COMPLETE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isComplete() <em>Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isComplete()
	 * @generated
	 * @ordered
	 */
	protected boolean complete = COMPLETE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActiveVariations() <em>Active Variations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveVariations()
	 * @generated
	 * @ordered
	 */
	protected EList<Variation> activeVariations;

	/**
	 * The cached value of the '{@link #getActiveSelections() <em>Active Selections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveSelections()
	 * @generated
	 * @ordered
	 */
	protected EList<Selection> activeSelections;

	/**
	 * The cached value of the '{@link #getActiveExclusions() <em>Active Exclusions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveExclusions()
	 * @generated
	 * @ordered
	 */
	protected EList<Exclusion> activeExclusions;

	/**
	 * The cached value of the '{@link #getPassiveVariation() <em>Passive Variation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassiveVariation()
	 * @generated
	 * @ordered
	 */
	protected Variation passiveVariation;

	/**
	 * The cached value of the '{@link #getPassiveSelections() <em>Passive Selections</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassiveSelections()
	 * @generated
	 * @ordered
	 */
	protected EList<Selection> passiveSelections;

	/**
	 * The cached value of the '{@link #getPassiveExclusions() <em>Passive Exclusions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassiveExclusions()
	 * @generated
	 * @ordered
	 */
	protected EList<Exclusion> passiveExclusions;

	/**
	 * The default value of the '{@link #getSelectionCriterion() <em>Selection Criterion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectionCriterion()
	 * @generated
	 * @ordered
	 */
	protected static final String SELECTION_CRITERION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSelectionCriterion() <em>Selection Criterion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectionCriterion()
	 * @generated
	 * @ordered
	 */
	protected String selectionCriterion = SELECTION_CRITERION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariantEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Variant_handlingPackage.Literals.VARIANT_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNullVariant() {
		return nullVariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNullVariant(boolean newNullVariant) {
		boolean oldNullVariant = nullVariant;
		nullVariant = newNullVariant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Variant_handlingPackage.VARIANT_ENTITY__NULL_VARIANT, oldNullVariant, nullVariant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isComplete() {
		return complete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComplete(boolean newComplete) {
		boolean oldComplete = complete;
		complete = newComplete;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Variant_handlingPackage.VARIANT_ENTITY__COMPLETE, oldComplete, complete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variation> getActiveVariations() {
		if (activeVariations == null) {
			activeVariations = new EObjectContainmentWithInverseEList<Variation>(Variation.class, this, Variant_handlingPackage.VARIANT_ENTITY__ACTIVE_VARIATIONS, Variant_handlingPackage.VARIATION__VARIATION_POINT);
		}
		return activeVariations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Selection> getActiveSelections() {
		if (activeSelections == null) {
			activeSelections = new EObjectContainmentWithInverseEList<Selection>(Selection.class, this, Variant_handlingPackage.VARIANT_ENTITY__ACTIVE_SELECTIONS, Variant_handlingPackage.SELECTION__SELECTOR);
		}
		return activeSelections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Exclusion> getActiveExclusions() {
		if (activeExclusions == null) {
			activeExclusions = new EObjectContainmentWithInverseEList<Exclusion>(Exclusion.class, this, Variant_handlingPackage.VARIANT_ENTITY__ACTIVE_EXCLUSIONS, Variant_handlingPackage.EXCLUSION__EXCLUDER);
		}
		return activeExclusions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variation getPassiveVariation() {
		if (passiveVariation != null && passiveVariation.eIsProxy()) {
			InternalEObject oldPassiveVariation = (InternalEObject)passiveVariation;
			passiveVariation = (Variation)eResolveProxy(oldPassiveVariation);
			if (passiveVariation != oldPassiveVariation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Variant_handlingPackage.VARIANT_ENTITY__PASSIVE_VARIATION, oldPassiveVariation, passiveVariation));
			}
		}
		return passiveVariation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variation basicGetPassiveVariation() {
		return passiveVariation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPassiveVariation(Variation newPassiveVariation, NotificationChain msgs) {
		Variation oldPassiveVariation = passiveVariation;
		passiveVariation = newPassiveVariation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Variant_handlingPackage.VARIANT_ENTITY__PASSIVE_VARIATION, oldPassiveVariation, newPassiveVariation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassiveVariation(Variation newPassiveVariation) {
		if (newPassiveVariation != passiveVariation) {
			NotificationChain msgs = null;
			if (passiveVariation != null)
				msgs = ((InternalEObject)passiveVariation).eInverseRemove(this, Variant_handlingPackage.VARIATION__VARIANT, Variation.class, msgs);
			if (newPassiveVariation != null)
				msgs = ((InternalEObject)newPassiveVariation).eInverseAdd(this, Variant_handlingPackage.VARIATION__VARIANT, Variation.class, msgs);
			msgs = basicSetPassiveVariation(newPassiveVariation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Variant_handlingPackage.VARIANT_ENTITY__PASSIVE_VARIATION, newPassiveVariation, newPassiveVariation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Selection> getPassiveSelections() {
		if (passiveSelections == null) {
			passiveSelections = new EObjectWithInverseResolvingEList<Selection>(Selection.class, this, Variant_handlingPackage.VARIANT_ENTITY__PASSIVE_SELECTIONS, Variant_handlingPackage.SELECTION__SELECTED);
		}
		return passiveSelections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Exclusion> getPassiveExclusions() {
		if (passiveExclusions == null) {
			passiveExclusions = new EObjectWithInverseResolvingEList<Exclusion>(Exclusion.class, this, Variant_handlingPackage.VARIANT_ENTITY__PASSIVE_EXCLUSIONS, Variant_handlingPackage.EXCLUSION__EXCLUDED);
		}
		return passiveExclusions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariantEntity getVariationPoint() {
		VariantEntity variationPoint = basicGetVariationPoint();
		return variationPoint != null && variationPoint.eIsProxy() ? (VariantEntity)eResolveProxy((InternalEObject)variationPoint) : variationPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariantEntity basicGetVariationPoint() {
		// TODO: implement this method to return the 'Variation Point' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariantEntity> getVariants() {
		// TODO: implement this method to return the 'Variants' reference list
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
	public EList<VariantEntity> getSelectors() {
		// TODO: implement this method to return the 'Selectors' reference list
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
	public EList<VariantEntity> getSelected() {
		// TODO: implement this method to return the 'Selected' reference list
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
	public EList<VariantEntity> getExcluders() {
		// TODO: implement this method to return the 'Excluders' reference list
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
	public EList<VariantEntity> getExcluded() {
		// TODO: implement this method to return the 'Excluded' reference list
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
	public String getSelectionCriterion() {
		return selectionCriterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectionCriterion(String newSelectionCriterion) {
		String oldSelectionCriterion = selectionCriterion;
		selectionCriterion = newSelectionCriterion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Variant_handlingPackage.VARIANT_ENTITY__SELECTION_CRITERION, oldSelectionCriterion, selectionCriterion));
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
			case Variant_handlingPackage.VARIANT_ENTITY__ACTIVE_VARIATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActiveVariations()).basicAdd(otherEnd, msgs);
			case Variant_handlingPackage.VARIANT_ENTITY__ACTIVE_SELECTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActiveSelections()).basicAdd(otherEnd, msgs);
			case Variant_handlingPackage.VARIANT_ENTITY__ACTIVE_EXCLUSIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActiveExclusions()).basicAdd(otherEnd, msgs);
			case Variant_handlingPackage.VARIANT_ENTITY__PASSIVE_VARIATION:
				if (passiveVariation != null)
					msgs = ((InternalEObject)passiveVariation).eInverseRemove(this, Variant_handlingPackage.VARIATION__VARIANT, Variation.class, msgs);
				return basicSetPassiveVariation((Variation)otherEnd, msgs);
			case Variant_handlingPackage.VARIANT_ENTITY__PASSIVE_SELECTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPassiveSelections()).basicAdd(otherEnd, msgs);
			case Variant_handlingPackage.VARIANT_ENTITY__PASSIVE_EXCLUSIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPassiveExclusions()).basicAdd(otherEnd, msgs);
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
			case Variant_handlingPackage.VARIANT_ENTITY__ACTIVE_VARIATIONS:
				return ((InternalEList<?>)getActiveVariations()).basicRemove(otherEnd, msgs);
			case Variant_handlingPackage.VARIANT_ENTITY__ACTIVE_SELECTIONS:
				return ((InternalEList<?>)getActiveSelections()).basicRemove(otherEnd, msgs);
			case Variant_handlingPackage.VARIANT_ENTITY__ACTIVE_EXCLUSIONS:
				return ((InternalEList<?>)getActiveExclusions()).basicRemove(otherEnd, msgs);
			case Variant_handlingPackage.VARIANT_ENTITY__PASSIVE_VARIATION:
				return basicSetPassiveVariation(null, msgs);
			case Variant_handlingPackage.VARIANT_ENTITY__PASSIVE_SELECTIONS:
				return ((InternalEList<?>)getPassiveSelections()).basicRemove(otherEnd, msgs);
			case Variant_handlingPackage.VARIANT_ENTITY__PASSIVE_EXCLUSIONS:
				return ((InternalEList<?>)getPassiveExclusions()).basicRemove(otherEnd, msgs);
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
			case Variant_handlingPackage.VARIANT_ENTITY__NULL_VARIANT:
				return isNullVariant();
			case Variant_handlingPackage.VARIANT_ENTITY__COMPLETE:
				return isComplete();
			case Variant_handlingPackage.VARIANT_ENTITY__ACTIVE_VARIATIONS:
				return getActiveVariations();
			case Variant_handlingPackage.VARIANT_ENTITY__ACTIVE_SELECTIONS:
				return getActiveSelections();
			case Variant_handlingPackage.VARIANT_ENTITY__ACTIVE_EXCLUSIONS:
				return getActiveExclusions();
			case Variant_handlingPackage.VARIANT_ENTITY__PASSIVE_VARIATION:
				if (resolve) return getPassiveVariation();
				return basicGetPassiveVariation();
			case Variant_handlingPackage.VARIANT_ENTITY__PASSIVE_SELECTIONS:
				return getPassiveSelections();
			case Variant_handlingPackage.VARIANT_ENTITY__PASSIVE_EXCLUSIONS:
				return getPassiveExclusions();
			case Variant_handlingPackage.VARIANT_ENTITY__VARIATION_POINT:
				if (resolve) return getVariationPoint();
				return basicGetVariationPoint();
			case Variant_handlingPackage.VARIANT_ENTITY__VARIANTS:
				return getVariants();
			case Variant_handlingPackage.VARIANT_ENTITY__SELECTORS:
				return getSelectors();
			case Variant_handlingPackage.VARIANT_ENTITY__SELECTED:
				return getSelected();
			case Variant_handlingPackage.VARIANT_ENTITY__EXCLUDERS:
				return getExcluders();
			case Variant_handlingPackage.VARIANT_ENTITY__EXCLUDED:
				return getExcluded();
			case Variant_handlingPackage.VARIANT_ENTITY__SELECTION_CRITERION:
				return getSelectionCriterion();
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
			case Variant_handlingPackage.VARIANT_ENTITY__NULL_VARIANT:
				setNullVariant((Boolean)newValue);
				return;
			case Variant_handlingPackage.VARIANT_ENTITY__COMPLETE:
				setComplete((Boolean)newValue);
				return;
			case Variant_handlingPackage.VARIANT_ENTITY__ACTIVE_VARIATIONS:
				getActiveVariations().clear();
				getActiveVariations().addAll((Collection<? extends Variation>)newValue);
				return;
			case Variant_handlingPackage.VARIANT_ENTITY__ACTIVE_SELECTIONS:
				getActiveSelections().clear();
				getActiveSelections().addAll((Collection<? extends Selection>)newValue);
				return;
			case Variant_handlingPackage.VARIANT_ENTITY__ACTIVE_EXCLUSIONS:
				getActiveExclusions().clear();
				getActiveExclusions().addAll((Collection<? extends Exclusion>)newValue);
				return;
			case Variant_handlingPackage.VARIANT_ENTITY__PASSIVE_VARIATION:
				setPassiveVariation((Variation)newValue);
				return;
			case Variant_handlingPackage.VARIANT_ENTITY__PASSIVE_SELECTIONS:
				getPassiveSelections().clear();
				getPassiveSelections().addAll((Collection<? extends Selection>)newValue);
				return;
			case Variant_handlingPackage.VARIANT_ENTITY__PASSIVE_EXCLUSIONS:
				getPassiveExclusions().clear();
				getPassiveExclusions().addAll((Collection<? extends Exclusion>)newValue);
				return;
			case Variant_handlingPackage.VARIANT_ENTITY__SELECTION_CRITERION:
				setSelectionCriterion((String)newValue);
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
			case Variant_handlingPackage.VARIANT_ENTITY__NULL_VARIANT:
				setNullVariant(NULL_VARIANT_EDEFAULT);
				return;
			case Variant_handlingPackage.VARIANT_ENTITY__COMPLETE:
				setComplete(COMPLETE_EDEFAULT);
				return;
			case Variant_handlingPackage.VARIANT_ENTITY__ACTIVE_VARIATIONS:
				getActiveVariations().clear();
				return;
			case Variant_handlingPackage.VARIANT_ENTITY__ACTIVE_SELECTIONS:
				getActiveSelections().clear();
				return;
			case Variant_handlingPackage.VARIANT_ENTITY__ACTIVE_EXCLUSIONS:
				getActiveExclusions().clear();
				return;
			case Variant_handlingPackage.VARIANT_ENTITY__PASSIVE_VARIATION:
				setPassiveVariation((Variation)null);
				return;
			case Variant_handlingPackage.VARIANT_ENTITY__PASSIVE_SELECTIONS:
				getPassiveSelections().clear();
				return;
			case Variant_handlingPackage.VARIANT_ENTITY__PASSIVE_EXCLUSIONS:
				getPassiveExclusions().clear();
				return;
			case Variant_handlingPackage.VARIANT_ENTITY__SELECTION_CRITERION:
				setSelectionCriterion(SELECTION_CRITERION_EDEFAULT);
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
			case Variant_handlingPackage.VARIANT_ENTITY__NULL_VARIANT:
				return nullVariant != NULL_VARIANT_EDEFAULT;
			case Variant_handlingPackage.VARIANT_ENTITY__COMPLETE:
				return complete != COMPLETE_EDEFAULT;
			case Variant_handlingPackage.VARIANT_ENTITY__ACTIVE_VARIATIONS:
				return activeVariations != null && !activeVariations.isEmpty();
			case Variant_handlingPackage.VARIANT_ENTITY__ACTIVE_SELECTIONS:
				return activeSelections != null && !activeSelections.isEmpty();
			case Variant_handlingPackage.VARIANT_ENTITY__ACTIVE_EXCLUSIONS:
				return activeExclusions != null && !activeExclusions.isEmpty();
			case Variant_handlingPackage.VARIANT_ENTITY__PASSIVE_VARIATION:
				return passiveVariation != null;
			case Variant_handlingPackage.VARIANT_ENTITY__PASSIVE_SELECTIONS:
				return passiveSelections != null && !passiveSelections.isEmpty();
			case Variant_handlingPackage.VARIANT_ENTITY__PASSIVE_EXCLUSIONS:
				return passiveExclusions != null && !passiveExclusions.isEmpty();
			case Variant_handlingPackage.VARIANT_ENTITY__VARIATION_POINT:
				return basicGetVariationPoint() != null;
			case Variant_handlingPackage.VARIANT_ENTITY__VARIANTS:
				return !getVariants().isEmpty();
			case Variant_handlingPackage.VARIANT_ENTITY__SELECTORS:
				return !getSelectors().isEmpty();
			case Variant_handlingPackage.VARIANT_ENTITY__SELECTED:
				return !getSelected().isEmpty();
			case Variant_handlingPackage.VARIANT_ENTITY__EXCLUDERS:
				return !getExcluders().isEmpty();
			case Variant_handlingPackage.VARIANT_ENTITY__EXCLUDED:
				return !getExcluded().isEmpty();
			case Variant_handlingPackage.VARIANT_ENTITY__SELECTION_CRITERION:
				return SELECTION_CRITERION_EDEFAULT == null ? selectionCriterion != null : !SELECTION_CRITERION_EDEFAULT.equals(selectionCriterion);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nullVariant: ");
		result.append(nullVariant);
		result.append(", complete: ");
		result.append(complete);
		result.append(", selectionCriterion: ");
		result.append(selectionCriterion);
		result.append(')');
		return result.toString();
	}

} //VariantEntityImpl
