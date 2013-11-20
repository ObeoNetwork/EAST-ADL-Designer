/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.east_adl.behavior.Behavior;

import org.obeonetwork.dsl.east_adl.core.impl.EASTADLEntityImpl;

import org.obeonetwork.dsl.east_adl.structure.common.AllocatableEntity;
import org.obeonetwork.dsl.east_adl.structure.common.AllocationConstraint;
import org.obeonetwork.dsl.east_adl.structure.common.CommonPackage;
import org.obeonetwork.dsl.east_adl.structure.common.FunctionPort;
import org.obeonetwork.dsl.east_adl.structure.common.Parameter;
import org.obeonetwork.dsl.east_adl.structure.common.Realization;
import org.obeonetwork.dsl.east_adl.structure.common.RealizedEntity;
import org.obeonetwork.dsl.east_adl.structure.common.RealizingEntity;

import org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.AnalysisFunction;
import org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.FunctionalDevice;
import org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.Functional_analysis_architecturePackage;

import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ECU;

import org.obeonetwork.dsl.east_adl.variant_handling.Exclusion;
import org.obeonetwork.dsl.east_adl.variant_handling.Selection;
import org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity;
import org.obeonetwork.dsl.east_adl.variant_handling.Variant_handlingPackage;
import org.obeonetwork.dsl.east_adl.variant_handling.Variation;

import org.obeonetwork.dsl.east_adl.verification_validation.VVCase;
import org.obeonetwork.dsl.east_adl.verification_validation.ValidatedEntity;
import org.obeonetwork.dsl.east_adl.verification_validation.Verification_validationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Analysis Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl.AnalysisFunctionImpl#isNullVariant <em>Null Variant</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl.AnalysisFunctionImpl#isComplete <em>Complete</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl.AnalysisFunctionImpl#getActiveVariations <em>Active Variations</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl.AnalysisFunctionImpl#getActiveSelections <em>Active Selections</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl.AnalysisFunctionImpl#getActiveExclusions <em>Active Exclusions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl.AnalysisFunctionImpl#getPassiveVariation <em>Passive Variation</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl.AnalysisFunctionImpl#getPassiveSelections <em>Passive Selections</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl.AnalysisFunctionImpl#getPassiveExclusions <em>Passive Exclusions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl.AnalysisFunctionImpl#getVariationPoint <em>Variation Point</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl.AnalysisFunctionImpl#getVariants <em>Variants</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl.AnalysisFunctionImpl#getSelectors <em>Selectors</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl.AnalysisFunctionImpl#getSelected <em>Selected</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl.AnalysisFunctionImpl#getExcluders <em>Excluders</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl.AnalysisFunctionImpl#getExcluded <em>Excluded</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl.AnalysisFunctionImpl#getSelectionCriterion <em>Selection Criterion</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl.AnalysisFunctionImpl#getPassiveRealizations <em>Passive Realizations</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl.AnalysisFunctionImpl#getRealizedBy <em>Realized By</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl.AnalysisFunctionImpl#getActiveRealizations <em>Active Realizations</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl.AnalysisFunctionImpl#getRealizes <em>Realizes</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl.AnalysisFunctionImpl#getAllocation <em>Allocation</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl.AnalysisFunctionImpl#getAllocationTarget <em>Allocation Target</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl.AnalysisFunctionImpl#getValidators <em>Validators</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl.AnalysisFunctionImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl.AnalysisFunctionImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl.AnalysisFunctionImpl#getSubFunctions <em>Sub Functions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl.AnalysisFunctionImpl#getAnalysisBehavior <em>Analysis Behavior</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl.AnalysisFunctionImpl#getFunctionalDevices <em>Functional Devices</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnalysisFunctionImpl extends EASTADLEntityImpl implements AnalysisFunction {
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
	 * The cached value of the '{@link #getPassiveRealizations() <em>Passive Realizations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassiveRealizations()
	 * @generated
	 * @ordered
	 */
	protected EList<Realization> passiveRealizations;

	/**
	 * The cached value of the '{@link #getActiveRealizations() <em>Active Realizations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveRealizations()
	 * @generated
	 * @ordered
	 */
	protected EList<Realization> activeRealizations;

	/**
	 * The cached value of the '{@link #getAllocation() <em>Allocation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocation()
	 * @generated
	 * @ordered
	 */
	protected AllocationConstraint allocation;

	/**
	 * The cached value of the '{@link #getValidators() <em>Validators</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidators()
	 * @generated
	 * @ordered
	 */
	protected EList<VVCase> validators;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionPort> ports;

	/**
	 * The cached value of the '{@link #getSubFunctions() <em>Sub Functions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<AnalysisFunction> subFunctions;

	/**
	 * The cached value of the '{@link #getAnalysisBehavior() <em>Analysis Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalysisBehavior()
	 * @generated
	 * @ordered
	 */
	protected Behavior analysisBehavior;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalysisFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Functional_analysis_architecturePackage.Literals.ANALYSIS_FUNCTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__NULL_VARIANT, oldNullVariant, nullVariant));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__COMPLETE, oldComplete, complete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variation> getActiveVariations() {
		if (activeVariations == null) {
			activeVariations = new EObjectContainmentWithInverseEList<Variation>(Variation.class, this, Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__ACTIVE_VARIATIONS, Variant_handlingPackage.VARIATION__VARIATION_POINT);
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
			activeSelections = new EObjectContainmentWithInverseEList<Selection>(Selection.class, this, Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__ACTIVE_SELECTIONS, Variant_handlingPackage.SELECTION__SELECTOR);
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
			activeExclusions = new EObjectContainmentWithInverseEList<Exclusion>(Exclusion.class, this, Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__ACTIVE_EXCLUSIONS, Variant_handlingPackage.EXCLUSION__EXCLUDER);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__PASSIVE_VARIATION, oldPassiveVariation, passiveVariation));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__PASSIVE_VARIATION, oldPassiveVariation, newPassiveVariation);
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
			eNotify(new ENotificationImpl(this, Notification.SET, Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__PASSIVE_VARIATION, newPassiveVariation, newPassiveVariation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Selection> getPassiveSelections() {
		if (passiveSelections == null) {
			passiveSelections = new EObjectWithInverseResolvingEList<Selection>(Selection.class, this, Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__PASSIVE_SELECTIONS, Variant_handlingPackage.SELECTION__SELECTED);
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
			passiveExclusions = new EObjectWithInverseResolvingEList<Exclusion>(Exclusion.class, this, Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__PASSIVE_EXCLUSIONS, Variant_handlingPackage.EXCLUSION__EXCLUDED);
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
			eNotify(new ENotificationImpl(this, Notification.SET, Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__SELECTION_CRITERION, oldSelectionCriterion, selectionCriterion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Realization> getPassiveRealizations() {
		if (passiveRealizations == null) {
			passiveRealizations = new EObjectWithInverseResolvingEList<Realization>(Realization.class, this, Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__PASSIVE_REALIZATIONS, CommonPackage.REALIZATION__REALIZED_ENTITY);
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
	public EList<Realization> getActiveRealizations() {
		if (activeRealizations == null) {
			activeRealizations = new EObjectContainmentWithInverseEList<Realization>(Realization.class, this, Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__ACTIVE_REALIZATIONS, CommonPackage.REALIZATION__REALIZING_ENTITY);
		}
		return activeRealizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RealizedEntity> getRealizes() {
		// TODO: implement this method to return the 'Realizes' reference list
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
	public AllocationConstraint getAllocation() {
		return allocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllocation(AllocationConstraint newAllocation, NotificationChain msgs) {
		AllocationConstraint oldAllocation = allocation;
		allocation = newAllocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__ALLOCATION, oldAllocation, newAllocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllocation(AllocationConstraint newAllocation) {
		if (newAllocation != allocation) {
			NotificationChain msgs = null;
			if (allocation != null)
				msgs = ((InternalEObject)allocation).eInverseRemove(this, CommonPackage.ALLOCATION_CONSTRAINT__ALLOCATOR, AllocationConstraint.class, msgs);
			if (newAllocation != null)
				msgs = ((InternalEObject)newAllocation).eInverseAdd(this, CommonPackage.ALLOCATION_CONSTRAINT__ALLOCATOR, AllocationConstraint.class, msgs);
			msgs = basicSetAllocation(newAllocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__ALLOCATION, newAllocation, newAllocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECU getAllocationTarget() {
		ECU allocationTarget = basicGetAllocationTarget();
		return allocationTarget != null && allocationTarget.eIsProxy() ? (ECU)eResolveProxy((InternalEObject)allocationTarget) : allocationTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECU basicGetAllocationTarget() {
		// TODO: implement this method to return the 'Allocation Target' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VVCase> getValidators() {
		if (validators == null) {
			validators = new EObjectWithInverseResolvingEList.ManyInverse<VVCase>(VVCase.class, this, Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__VALIDATORS, Verification_validationPackage.VV_CASE__VALIDATED_ENTITIES);
		}
		return validators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionPort> getPorts() {
		if (ports == null) {
			ports = new EObjectContainmentEList<FunctionPort>(FunctionPort.class, this, Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__PORTS);
		}
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnalysisFunction> getSubFunctions() {
		if (subFunctions == null) {
			subFunctions = new EObjectContainmentEList<AnalysisFunction>(AnalysisFunction.class, this, Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__SUB_FUNCTIONS);
		}
		return subFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getAnalysisBehavior() {
		return analysisBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnalysisBehavior(Behavior newAnalysisBehavior, NotificationChain msgs) {
		Behavior oldAnalysisBehavior = analysisBehavior;
		analysisBehavior = newAnalysisBehavior;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__ANALYSIS_BEHAVIOR, oldAnalysisBehavior, newAnalysisBehavior);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnalysisBehavior(Behavior newAnalysisBehavior) {
		if (newAnalysisBehavior != analysisBehavior) {
			NotificationChain msgs = null;
			if (analysisBehavior != null)
				msgs = ((InternalEObject)analysisBehavior).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__ANALYSIS_BEHAVIOR, null, msgs);
			if (newAnalysisBehavior != null)
				msgs = ((InternalEObject)newAnalysisBehavior).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__ANALYSIS_BEHAVIOR, null, msgs);
			msgs = basicSetAnalysisBehavior(newAnalysisBehavior, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__ANALYSIS_BEHAVIOR, newAnalysisBehavior, newAnalysisBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalDevice getFunctionalDevices() {
		if (eContainerFeatureID() != Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__FUNCTIONAL_DEVICES) return null;
		return (FunctionalDevice)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFunctionalDevices(FunctionalDevice newFunctionalDevices, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newFunctionalDevices, Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__FUNCTIONAL_DEVICES, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctionalDevices(FunctionalDevice newFunctionalDevices) {
		if (newFunctionalDevices != eInternalContainer() || (eContainerFeatureID() != Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__FUNCTIONAL_DEVICES && newFunctionalDevices != null)) {
			if (EcoreUtil.isAncestor(this, newFunctionalDevices))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFunctionalDevices != null)
				msgs = ((InternalEObject)newFunctionalDevices).eInverseAdd(this, Functional_analysis_architecturePackage.FUNCTIONAL_DEVICE__OWNING_FUNCTION, FunctionalDevice.class, msgs);
			msgs = basicSetFunctionalDevices(newFunctionalDevices, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__FUNCTIONAL_DEVICES, newFunctionalDevices, newFunctionalDevices));
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
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__ACTIVE_VARIATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActiveVariations()).basicAdd(otherEnd, msgs);
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__ACTIVE_SELECTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActiveSelections()).basicAdd(otherEnd, msgs);
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__ACTIVE_EXCLUSIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActiveExclusions()).basicAdd(otherEnd, msgs);
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__PASSIVE_VARIATION:
				if (passiveVariation != null)
					msgs = ((InternalEObject)passiveVariation).eInverseRemove(this, Variant_handlingPackage.VARIATION__VARIANT, Variation.class, msgs);
				return basicSetPassiveVariation((Variation)otherEnd, msgs);
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__PASSIVE_SELECTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPassiveSelections()).basicAdd(otherEnd, msgs);
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__PASSIVE_EXCLUSIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPassiveExclusions()).basicAdd(otherEnd, msgs);
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__PASSIVE_REALIZATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPassiveRealizations()).basicAdd(otherEnd, msgs);
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__ACTIVE_REALIZATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActiveRealizations()).basicAdd(otherEnd, msgs);
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__ALLOCATION:
				if (allocation != null)
					msgs = ((InternalEObject)allocation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__ALLOCATION, null, msgs);
				return basicSetAllocation((AllocationConstraint)otherEnd, msgs);
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__VALIDATORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getValidators()).basicAdd(otherEnd, msgs);
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__FUNCTIONAL_DEVICES:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetFunctionalDevices((FunctionalDevice)otherEnd, msgs);
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
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__ACTIVE_VARIATIONS:
				return ((InternalEList<?>)getActiveVariations()).basicRemove(otherEnd, msgs);
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__ACTIVE_SELECTIONS:
				return ((InternalEList<?>)getActiveSelections()).basicRemove(otherEnd, msgs);
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__ACTIVE_EXCLUSIONS:
				return ((InternalEList<?>)getActiveExclusions()).basicRemove(otherEnd, msgs);
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__PASSIVE_VARIATION:
				return basicSetPassiveVariation(null, msgs);
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__PASSIVE_SELECTIONS:
				return ((InternalEList<?>)getPassiveSelections()).basicRemove(otherEnd, msgs);
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__PASSIVE_EXCLUSIONS:
				return ((InternalEList<?>)getPassiveExclusions()).basicRemove(otherEnd, msgs);
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__PASSIVE_REALIZATIONS:
				return ((InternalEList<?>)getPassiveRealizations()).basicRemove(otherEnd, msgs);
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__ACTIVE_REALIZATIONS:
				return ((InternalEList<?>)getActiveRealizations()).basicRemove(otherEnd, msgs);
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__ALLOCATION:
				return basicSetAllocation(null, msgs);
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__VALIDATORS:
				return ((InternalEList<?>)getValidators()).basicRemove(otherEnd, msgs);
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__PORTS:
				return ((InternalEList<?>)getPorts()).basicRemove(otherEnd, msgs);
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__SUB_FUNCTIONS:
				return ((InternalEList<?>)getSubFunctions()).basicRemove(otherEnd, msgs);
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__ANALYSIS_BEHAVIOR:
				return basicSetAnalysisBehavior(null, msgs);
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__FUNCTIONAL_DEVICES:
				return basicSetFunctionalDevices(null, msgs);
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
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__FUNCTIONAL_DEVICES:
				return eInternalContainer().eInverseRemove(this, Functional_analysis_architecturePackage.FUNCTIONAL_DEVICE__OWNING_FUNCTION, FunctionalDevice.class, msgs);
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
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__NULL_VARIANT:
				return isNullVariant();
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__COMPLETE:
				return isComplete();
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__ACTIVE_VARIATIONS:
				return getActiveVariations();
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__ACTIVE_SELECTIONS:
				return getActiveSelections();
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__ACTIVE_EXCLUSIONS:
				return getActiveExclusions();
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__PASSIVE_VARIATION:
				if (resolve) return getPassiveVariation();
				return basicGetPassiveVariation();
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__PASSIVE_SELECTIONS:
				return getPassiveSelections();
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__PASSIVE_EXCLUSIONS:
				return getPassiveExclusions();
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__VARIATION_POINT:
				if (resolve) return getVariationPoint();
				return basicGetVariationPoint();
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__VARIANTS:
				return getVariants();
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__SELECTORS:
				return getSelectors();
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__SELECTED:
				return getSelected();
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__EXCLUDERS:
				return getExcluders();
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__EXCLUDED:
				return getExcluded();
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__SELECTION_CRITERION:
				return getSelectionCriterion();
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__PASSIVE_REALIZATIONS:
				return getPassiveRealizations();
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__REALIZED_BY:
				return getRealizedBy();
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__ACTIVE_REALIZATIONS:
				return getActiveRealizations();
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__REALIZES:
				return getRealizes();
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__ALLOCATION:
				return getAllocation();
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__ALLOCATION_TARGET:
				if (resolve) return getAllocationTarget();
				return basicGetAllocationTarget();
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__VALIDATORS:
				return getValidators();
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__PARAMETERS:
				return getParameters();
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__PORTS:
				return getPorts();
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__SUB_FUNCTIONS:
				return getSubFunctions();
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__ANALYSIS_BEHAVIOR:
				return getAnalysisBehavior();
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__FUNCTIONAL_DEVICES:
				return getFunctionalDevices();
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
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__NULL_VARIANT:
				setNullVariant((Boolean)newValue);
				return;
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__COMPLETE:
				setComplete((Boolean)newValue);
				return;
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__ACTIVE_VARIATIONS:
				getActiveVariations().clear();
				getActiveVariations().addAll((Collection<? extends Variation>)newValue);
				return;
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__ACTIVE_SELECTIONS:
				getActiveSelections().clear();
				getActiveSelections().addAll((Collection<? extends Selection>)newValue);
				return;
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__ACTIVE_EXCLUSIONS:
				getActiveExclusions().clear();
				getActiveExclusions().addAll((Collection<? extends Exclusion>)newValue);
				return;
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__PASSIVE_VARIATION:
				setPassiveVariation((Variation)newValue);
				return;
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__PASSIVE_SELECTIONS:
				getPassiveSelections().clear();
				getPassiveSelections().addAll((Collection<? extends Selection>)newValue);
				return;
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__PASSIVE_EXCLUSIONS:
				getPassiveExclusions().clear();
				getPassiveExclusions().addAll((Collection<? extends Exclusion>)newValue);
				return;
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__SELECTION_CRITERION:
				setSelectionCriterion((String)newValue);
				return;
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__PASSIVE_REALIZATIONS:
				getPassiveRealizations().clear();
				getPassiveRealizations().addAll((Collection<? extends Realization>)newValue);
				return;
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__ACTIVE_REALIZATIONS:
				getActiveRealizations().clear();
				getActiveRealizations().addAll((Collection<? extends Realization>)newValue);
				return;
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__ALLOCATION:
				setAllocation((AllocationConstraint)newValue);
				return;
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__VALIDATORS:
				getValidators().clear();
				getValidators().addAll((Collection<? extends VVCase>)newValue);
				return;
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__PORTS:
				getPorts().clear();
				getPorts().addAll((Collection<? extends FunctionPort>)newValue);
				return;
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__SUB_FUNCTIONS:
				getSubFunctions().clear();
				getSubFunctions().addAll((Collection<? extends AnalysisFunction>)newValue);
				return;
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__ANALYSIS_BEHAVIOR:
				setAnalysisBehavior((Behavior)newValue);
				return;
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__FUNCTIONAL_DEVICES:
				setFunctionalDevices((FunctionalDevice)newValue);
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
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__NULL_VARIANT:
				setNullVariant(NULL_VARIANT_EDEFAULT);
				return;
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__COMPLETE:
				setComplete(COMPLETE_EDEFAULT);
				return;
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__ACTIVE_VARIATIONS:
				getActiveVariations().clear();
				return;
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__ACTIVE_SELECTIONS:
				getActiveSelections().clear();
				return;
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__ACTIVE_EXCLUSIONS:
				getActiveExclusions().clear();
				return;
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__PASSIVE_VARIATION:
				setPassiveVariation((Variation)null);
				return;
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__PASSIVE_SELECTIONS:
				getPassiveSelections().clear();
				return;
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__PASSIVE_EXCLUSIONS:
				getPassiveExclusions().clear();
				return;
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__SELECTION_CRITERION:
				setSelectionCriterion(SELECTION_CRITERION_EDEFAULT);
				return;
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__PASSIVE_REALIZATIONS:
				getPassiveRealizations().clear();
				return;
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__ACTIVE_REALIZATIONS:
				getActiveRealizations().clear();
				return;
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__ALLOCATION:
				setAllocation((AllocationConstraint)null);
				return;
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__VALIDATORS:
				getValidators().clear();
				return;
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__PARAMETERS:
				getParameters().clear();
				return;
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__PORTS:
				getPorts().clear();
				return;
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__SUB_FUNCTIONS:
				getSubFunctions().clear();
				return;
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__ANALYSIS_BEHAVIOR:
				setAnalysisBehavior((Behavior)null);
				return;
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__FUNCTIONAL_DEVICES:
				setFunctionalDevices((FunctionalDevice)null);
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
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__NULL_VARIANT:
				return nullVariant != NULL_VARIANT_EDEFAULT;
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__COMPLETE:
				return complete != COMPLETE_EDEFAULT;
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__ACTIVE_VARIATIONS:
				return activeVariations != null && !activeVariations.isEmpty();
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__ACTIVE_SELECTIONS:
				return activeSelections != null && !activeSelections.isEmpty();
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__ACTIVE_EXCLUSIONS:
				return activeExclusions != null && !activeExclusions.isEmpty();
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__PASSIVE_VARIATION:
				return passiveVariation != null;
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__PASSIVE_SELECTIONS:
				return passiveSelections != null && !passiveSelections.isEmpty();
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__PASSIVE_EXCLUSIONS:
				return passiveExclusions != null && !passiveExclusions.isEmpty();
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__VARIATION_POINT:
				return basicGetVariationPoint() != null;
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__VARIANTS:
				return !getVariants().isEmpty();
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__SELECTORS:
				return !getSelectors().isEmpty();
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__SELECTED:
				return !getSelected().isEmpty();
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__EXCLUDERS:
				return !getExcluders().isEmpty();
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__EXCLUDED:
				return !getExcluded().isEmpty();
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__SELECTION_CRITERION:
				return SELECTION_CRITERION_EDEFAULT == null ? selectionCriterion != null : !SELECTION_CRITERION_EDEFAULT.equals(selectionCriterion);
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__PASSIVE_REALIZATIONS:
				return passiveRealizations != null && !passiveRealizations.isEmpty();
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__REALIZED_BY:
				return !getRealizedBy().isEmpty();
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__ACTIVE_REALIZATIONS:
				return activeRealizations != null && !activeRealizations.isEmpty();
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__REALIZES:
				return !getRealizes().isEmpty();
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__ALLOCATION:
				return allocation != null;
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__ALLOCATION_TARGET:
				return basicGetAllocationTarget() != null;
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__VALIDATORS:
				return validators != null && !validators.isEmpty();
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__PORTS:
				return ports != null && !ports.isEmpty();
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__SUB_FUNCTIONS:
				return subFunctions != null && !subFunctions.isEmpty();
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__ANALYSIS_BEHAVIOR:
				return analysisBehavior != null;
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__FUNCTIONAL_DEVICES:
				return getFunctionalDevices() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == VariantEntity.class) {
			switch (derivedFeatureID) {
				case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__NULL_VARIANT: return Variant_handlingPackage.VARIANT_ENTITY__NULL_VARIANT;
				case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__COMPLETE: return Variant_handlingPackage.VARIANT_ENTITY__COMPLETE;
				case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__ACTIVE_VARIATIONS: return Variant_handlingPackage.VARIANT_ENTITY__ACTIVE_VARIATIONS;
				case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__ACTIVE_SELECTIONS: return Variant_handlingPackage.VARIANT_ENTITY__ACTIVE_SELECTIONS;
				case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__ACTIVE_EXCLUSIONS: return Variant_handlingPackage.VARIANT_ENTITY__ACTIVE_EXCLUSIONS;
				case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__PASSIVE_VARIATION: return Variant_handlingPackage.VARIANT_ENTITY__PASSIVE_VARIATION;
				case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__PASSIVE_SELECTIONS: return Variant_handlingPackage.VARIANT_ENTITY__PASSIVE_SELECTIONS;
				case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__PASSIVE_EXCLUSIONS: return Variant_handlingPackage.VARIANT_ENTITY__PASSIVE_EXCLUSIONS;
				case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__VARIATION_POINT: return Variant_handlingPackage.VARIANT_ENTITY__VARIATION_POINT;
				case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__VARIANTS: return Variant_handlingPackage.VARIANT_ENTITY__VARIANTS;
				case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__SELECTORS: return Variant_handlingPackage.VARIANT_ENTITY__SELECTORS;
				case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__SELECTED: return Variant_handlingPackage.VARIANT_ENTITY__SELECTED;
				case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__EXCLUDERS: return Variant_handlingPackage.VARIANT_ENTITY__EXCLUDERS;
				case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__EXCLUDED: return Variant_handlingPackage.VARIANT_ENTITY__EXCLUDED;
				case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__SELECTION_CRITERION: return Variant_handlingPackage.VARIANT_ENTITY__SELECTION_CRITERION;
				default: return -1;
			}
		}
		if (baseClass == RealizedEntity.class) {
			switch (derivedFeatureID) {
				case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__PASSIVE_REALIZATIONS: return CommonPackage.REALIZED_ENTITY__PASSIVE_REALIZATIONS;
				case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__REALIZED_BY: return CommonPackage.REALIZED_ENTITY__REALIZED_BY;
				default: return -1;
			}
		}
		if (baseClass == RealizingEntity.class) {
			switch (derivedFeatureID) {
				case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__ACTIVE_REALIZATIONS: return CommonPackage.REALIZING_ENTITY__ACTIVE_REALIZATIONS;
				case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__REALIZES: return CommonPackage.REALIZING_ENTITY__REALIZES;
				default: return -1;
			}
		}
		if (baseClass == AllocatableEntity.class) {
			switch (derivedFeatureID) {
				case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__ALLOCATION: return CommonPackage.ALLOCATABLE_ENTITY__ALLOCATION;
				case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__ALLOCATION_TARGET: return CommonPackage.ALLOCATABLE_ENTITY__ALLOCATION_TARGET;
				default: return -1;
			}
		}
		if (baseClass == ValidatedEntity.class) {
			switch (derivedFeatureID) {
				case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__VALIDATORS: return Verification_validationPackage.VALIDATED_ENTITY__VALIDATORS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == VariantEntity.class) {
			switch (baseFeatureID) {
				case Variant_handlingPackage.VARIANT_ENTITY__NULL_VARIANT: return Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__NULL_VARIANT;
				case Variant_handlingPackage.VARIANT_ENTITY__COMPLETE: return Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__COMPLETE;
				case Variant_handlingPackage.VARIANT_ENTITY__ACTIVE_VARIATIONS: return Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__ACTIVE_VARIATIONS;
				case Variant_handlingPackage.VARIANT_ENTITY__ACTIVE_SELECTIONS: return Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__ACTIVE_SELECTIONS;
				case Variant_handlingPackage.VARIANT_ENTITY__ACTIVE_EXCLUSIONS: return Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__ACTIVE_EXCLUSIONS;
				case Variant_handlingPackage.VARIANT_ENTITY__PASSIVE_VARIATION: return Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__PASSIVE_VARIATION;
				case Variant_handlingPackage.VARIANT_ENTITY__PASSIVE_SELECTIONS: return Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__PASSIVE_SELECTIONS;
				case Variant_handlingPackage.VARIANT_ENTITY__PASSIVE_EXCLUSIONS: return Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__PASSIVE_EXCLUSIONS;
				case Variant_handlingPackage.VARIANT_ENTITY__VARIATION_POINT: return Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__VARIATION_POINT;
				case Variant_handlingPackage.VARIANT_ENTITY__VARIANTS: return Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__VARIANTS;
				case Variant_handlingPackage.VARIANT_ENTITY__SELECTORS: return Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__SELECTORS;
				case Variant_handlingPackage.VARIANT_ENTITY__SELECTED: return Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__SELECTED;
				case Variant_handlingPackage.VARIANT_ENTITY__EXCLUDERS: return Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__EXCLUDERS;
				case Variant_handlingPackage.VARIANT_ENTITY__EXCLUDED: return Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__EXCLUDED;
				case Variant_handlingPackage.VARIANT_ENTITY__SELECTION_CRITERION: return Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__SELECTION_CRITERION;
				default: return -1;
			}
		}
		if (baseClass == RealizedEntity.class) {
			switch (baseFeatureID) {
				case CommonPackage.REALIZED_ENTITY__PASSIVE_REALIZATIONS: return Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__PASSIVE_REALIZATIONS;
				case CommonPackage.REALIZED_ENTITY__REALIZED_BY: return Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__REALIZED_BY;
				default: return -1;
			}
		}
		if (baseClass == RealizingEntity.class) {
			switch (baseFeatureID) {
				case CommonPackage.REALIZING_ENTITY__ACTIVE_REALIZATIONS: return Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__ACTIVE_REALIZATIONS;
				case CommonPackage.REALIZING_ENTITY__REALIZES: return Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__REALIZES;
				default: return -1;
			}
		}
		if (baseClass == AllocatableEntity.class) {
			switch (baseFeatureID) {
				case CommonPackage.ALLOCATABLE_ENTITY__ALLOCATION: return Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__ALLOCATION;
				case CommonPackage.ALLOCATABLE_ENTITY__ALLOCATION_TARGET: return Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__ALLOCATION_TARGET;
				default: return -1;
			}
		}
		if (baseClass == ValidatedEntity.class) {
			switch (baseFeatureID) {
				case Verification_validationPackage.VALIDATED_ENTITY__VALIDATORS: return Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__VALIDATORS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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

} //AnalysisFunctionImpl
