/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl;

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
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.east_adl.behavior.Behavior;

import org.obeonetwork.dsl.east_adl.core.impl.EASTADLEntityImpl;

import org.obeonetwork.dsl.east_adl.requirements.TimingRestriction;

import org.obeonetwork.dsl.east_adl.structure.common.CommonPackage;
import org.obeonetwork.dsl.east_adl.structure.common.FunctionPort;
import org.obeonetwork.dsl.east_adl.structure.common.Parameter;
import org.obeonetwork.dsl.east_adl.structure.common.Realization;
import org.obeonetwork.dsl.east_adl.structure.common.RealizedEntity;
import org.obeonetwork.dsl.east_adl.structure.common.RealizingEntity;
import org.obeonetwork.dsl.east_adl.structure.common.TriggerKind;

import org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstance;
import org.obeonetwork.dsl.east_adl.structure.function_instance_model.Function_instance_modelPackage;

import org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction;
import org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Functional_design_architecturePackage;
import org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Precedence;

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
 * An implementation of the model object '<em><b>Elementary Software Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.ElementarySoftwareFunctionImpl#getActiveRealizations <em>Active Realizations</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.ElementarySoftwareFunctionImpl#getRealizes <em>Realizes</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.ElementarySoftwareFunctionImpl#isNullVariant <em>Null Variant</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.ElementarySoftwareFunctionImpl#isComplete <em>Complete</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.ElementarySoftwareFunctionImpl#getActiveVariations <em>Active Variations</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.ElementarySoftwareFunctionImpl#getActiveSelections <em>Active Selections</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.ElementarySoftwareFunctionImpl#getActiveExclusions <em>Active Exclusions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.ElementarySoftwareFunctionImpl#getPassiveVariation <em>Passive Variation</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.ElementarySoftwareFunctionImpl#getPassiveSelections <em>Passive Selections</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.ElementarySoftwareFunctionImpl#getPassiveExclusions <em>Passive Exclusions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.ElementarySoftwareFunctionImpl#getVariationPoint <em>Variation Point</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.ElementarySoftwareFunctionImpl#getVariants <em>Variants</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.ElementarySoftwareFunctionImpl#getSelectors <em>Selectors</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.ElementarySoftwareFunctionImpl#getSelected <em>Selected</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.ElementarySoftwareFunctionImpl#getExcluders <em>Excluders</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.ElementarySoftwareFunctionImpl#getExcluded <em>Excluded</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.ElementarySoftwareFunctionImpl#getSelectionCriterion <em>Selection Criterion</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.ElementarySoftwareFunctionImpl#getValidators <em>Validators</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.ElementarySoftwareFunctionImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.ElementarySoftwareFunctionImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.ElementarySoftwareFunctionImpl#getInstances <em>Instances</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.ElementarySoftwareFunctionImpl#getTriggerType <em>Trigger Type</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.ElementarySoftwareFunctionImpl#getTriggerEvent <em>Trigger Event</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.ElementarySoftwareFunctionImpl#getTriggerCondition <em>Trigger Condition</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.ElementarySoftwareFunctionImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.ElementarySoftwareFunctionImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.ElementarySoftwareFunctionImpl#getExecutionTime <em>Execution Time</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.ElementarySoftwareFunctionImpl#getSpecifationBehavior <em>Specifation Behavior</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.ElementarySoftwareFunctionImpl#getImplementationBehavior <em>Implementation Behavior</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.ElementarySoftwareFunctionImpl#getActivePrecedencies <em>Active Precedencies</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.ElementarySoftwareFunctionImpl#getPassivePrecedencies <em>Passive Precedencies</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.ElementarySoftwareFunctionImpl#getPredecessors <em>Predecessors</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.ElementarySoftwareFunctionImpl#getSuccessors <em>Successors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElementarySoftwareFunctionImpl extends EASTADLEntityImpl implements ElementarySoftwareFunction {
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
	 * The cached value of the '{@link #getValidators() <em>Validators</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidators()
	 * @generated
	 * @ordered
	 */
	protected EList<VVCase> validators;

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
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * The cached value of the '{@link #getInstances() <em>Instances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionInstance> instances;

	/**
	 * The default value of the '{@link #getTriggerType() <em>Trigger Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerType()
	 * @generated
	 * @ordered
	 */
	protected static final TriggerKind TRIGGER_TYPE_EDEFAULT = TriggerKind.EVENT;

	/**
	 * The cached value of the '{@link #getTriggerType() <em>Trigger Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerType()
	 * @generated
	 * @ordered
	 */
	protected TriggerKind triggerType = TRIGGER_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTriggerEvent() <em>Trigger Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerEvent()
	 * @generated
	 * @ordered
	 */
	protected static final String TRIGGER_EVENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTriggerEvent() <em>Trigger Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerEvent()
	 * @generated
	 * @ordered
	 */
	protected String triggerEvent = TRIGGER_EVENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTriggerCondition() <em>Trigger Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String TRIGGER_CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTriggerCondition() <em>Trigger Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerCondition()
	 * @generated
	 * @ordered
	 */
	protected String triggerCondition = TRIGGER_CONDITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected TimingRestriction period;

	/**
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected TimingRestriction offset;

	/**
	 * The cached value of the '{@link #getExecutionTime() <em>Execution Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionTime()
	 * @generated
	 * @ordered
	 */
	protected TimingRestriction executionTime;

	/**
	 * The cached value of the '{@link #getSpecifationBehavior() <em>Specifation Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecifationBehavior()
	 * @generated
	 * @ordered
	 */
	protected Behavior specifationBehavior;

	/**
	 * The cached value of the '{@link #getImplementationBehavior() <em>Implementation Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationBehavior()
	 * @generated
	 * @ordered
	 */
	protected Behavior implementationBehavior;

	/**
	 * The cached value of the '{@link #getActivePrecedencies() <em>Active Precedencies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePrecedencies()
	 * @generated
	 * @ordered
	 */
	protected EList<Precedence> activePrecedencies;

	/**
	 * The cached value of the '{@link #getPassivePrecedencies() <em>Passive Precedencies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassivePrecedencies()
	 * @generated
	 * @ordered
	 */
	protected EList<Precedence> passivePrecedencies;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementarySoftwareFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Functional_design_architecturePackage.Literals.ELEMENTARY_SOFTWARE_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Realization> getActiveRealizations() {
		if (activeRealizations == null) {
			activeRealizations = new EObjectContainmentWithInverseEList<Realization>(Realization.class, this, Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__ACTIVE_REALIZATIONS, CommonPackage.REALIZATION__REALIZING_ENTITY);
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
			eNotify(new ENotificationImpl(this, Notification.SET, Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__NULL_VARIANT, oldNullVariant, nullVariant));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__COMPLETE, oldComplete, complete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variation> getActiveVariations() {
		if (activeVariations == null) {
			activeVariations = new EObjectContainmentWithInverseEList<Variation>(Variation.class, this, Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__ACTIVE_VARIATIONS, Variant_handlingPackage.VARIATION__VARIATION_POINT);
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
			activeSelections = new EObjectContainmentWithInverseEList<Selection>(Selection.class, this, Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__ACTIVE_SELECTIONS, Variant_handlingPackage.SELECTION__SELECTOR);
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
			activeExclusions = new EObjectContainmentWithInverseEList<Exclusion>(Exclusion.class, this, Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__ACTIVE_EXCLUSIONS, Variant_handlingPackage.EXCLUSION__EXCLUDER);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__PASSIVE_VARIATION, oldPassiveVariation, passiveVariation));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__PASSIVE_VARIATION, oldPassiveVariation, newPassiveVariation);
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
			eNotify(new ENotificationImpl(this, Notification.SET, Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__PASSIVE_VARIATION, newPassiveVariation, newPassiveVariation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Selection> getPassiveSelections() {
		if (passiveSelections == null) {
			passiveSelections = new EObjectWithInverseResolvingEList<Selection>(Selection.class, this, Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__PASSIVE_SELECTIONS, Variant_handlingPackage.SELECTION__SELECTED);
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
			passiveExclusions = new EObjectWithInverseResolvingEList<Exclusion>(Exclusion.class, this, Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__PASSIVE_EXCLUSIONS, Variant_handlingPackage.EXCLUSION__EXCLUDED);
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
			eNotify(new ENotificationImpl(this, Notification.SET, Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__SELECTION_CRITERION, oldSelectionCriterion, selectionCriterion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VVCase> getValidators() {
		if (validators == null) {
			validators = new EObjectWithInverseResolvingEList.ManyInverse<VVCase>(VVCase.class, this, Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__VALIDATORS, Verification_validationPackage.VV_CASE__VALIDATED_ENTITIES);
		}
		return validators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionPort> getPorts() {
		if (ports == null) {
			ports = new EObjectContainmentEList<FunctionPort>(FunctionPort.class, this, Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__PORTS);
		}
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionInstance> getInstances() {
		if (instances == null) {
			instances = new EObjectWithInverseResolvingEList<FunctionInstance>(FunctionInstance.class, this, Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__INSTANCES, Function_instance_modelPackage.FUNCTION_INSTANCE__INSTANTIATED_FUNCTION);
		}
		return instances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerKind getTriggerType() {
		return triggerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTriggerType(TriggerKind newTriggerType) {
		TriggerKind oldTriggerType = triggerType;
		triggerType = newTriggerType == null ? TRIGGER_TYPE_EDEFAULT : newTriggerType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__TRIGGER_TYPE, oldTriggerType, triggerType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTriggerEvent() {
		return triggerEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTriggerEvent(String newTriggerEvent) {
		String oldTriggerEvent = triggerEvent;
		triggerEvent = newTriggerEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__TRIGGER_EVENT, oldTriggerEvent, triggerEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTriggerCondition() {
		return triggerCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTriggerCondition(String newTriggerCondition) {
		String oldTriggerCondition = triggerCondition;
		triggerCondition = newTriggerCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__TRIGGER_CONDITION, oldTriggerCondition, triggerCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingRestriction getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriod(TimingRestriction newPeriod, NotificationChain msgs) {
		TimingRestriction oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__PERIOD, oldPeriod, newPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(TimingRestriction newPeriod) {
		if (newPeriod != period) {
			NotificationChain msgs = null;
			if (period != null)
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingRestriction getOffset() {
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOffset(TimingRestriction newOffset, NotificationChain msgs) {
		TimingRestriction oldOffset = offset;
		offset = newOffset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__OFFSET, oldOffset, newOffset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffset(TimingRestriction newOffset) {
		if (newOffset != offset) {
			NotificationChain msgs = null;
			if (offset != null)
				msgs = ((InternalEObject)offset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__OFFSET, null, msgs);
			if (newOffset != null)
				msgs = ((InternalEObject)newOffset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__OFFSET, null, msgs);
			msgs = basicSetOffset(newOffset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__OFFSET, newOffset, newOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingRestriction getExecutionTime() {
		return executionTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExecutionTime(TimingRestriction newExecutionTime, NotificationChain msgs) {
		TimingRestriction oldExecutionTime = executionTime;
		executionTime = newExecutionTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__EXECUTION_TIME, oldExecutionTime, newExecutionTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutionTime(TimingRestriction newExecutionTime) {
		if (newExecutionTime != executionTime) {
			NotificationChain msgs = null;
			if (executionTime != null)
				msgs = ((InternalEObject)executionTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__EXECUTION_TIME, null, msgs);
			if (newExecutionTime != null)
				msgs = ((InternalEObject)newExecutionTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__EXECUTION_TIME, null, msgs);
			msgs = basicSetExecutionTime(newExecutionTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__EXECUTION_TIME, newExecutionTime, newExecutionTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getSpecifationBehavior() {
		return specifationBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecifationBehavior(Behavior newSpecifationBehavior, NotificationChain msgs) {
		Behavior oldSpecifationBehavior = specifationBehavior;
		specifationBehavior = newSpecifationBehavior;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__SPECIFATION_BEHAVIOR, oldSpecifationBehavior, newSpecifationBehavior);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecifationBehavior(Behavior newSpecifationBehavior) {
		if (newSpecifationBehavior != specifationBehavior) {
			NotificationChain msgs = null;
			if (specifationBehavior != null)
				msgs = ((InternalEObject)specifationBehavior).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__SPECIFATION_BEHAVIOR, null, msgs);
			if (newSpecifationBehavior != null)
				msgs = ((InternalEObject)newSpecifationBehavior).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__SPECIFATION_BEHAVIOR, null, msgs);
			msgs = basicSetSpecifationBehavior(newSpecifationBehavior, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__SPECIFATION_BEHAVIOR, newSpecifationBehavior, newSpecifationBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getImplementationBehavior() {
		return implementationBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplementationBehavior(Behavior newImplementationBehavior, NotificationChain msgs) {
		Behavior oldImplementationBehavior = implementationBehavior;
		implementationBehavior = newImplementationBehavior;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__IMPLEMENTATION_BEHAVIOR, oldImplementationBehavior, newImplementationBehavior);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementationBehavior(Behavior newImplementationBehavior) {
		if (newImplementationBehavior != implementationBehavior) {
			NotificationChain msgs = null;
			if (implementationBehavior != null)
				msgs = ((InternalEObject)implementationBehavior).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__IMPLEMENTATION_BEHAVIOR, null, msgs);
			if (newImplementationBehavior != null)
				msgs = ((InternalEObject)newImplementationBehavior).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__IMPLEMENTATION_BEHAVIOR, null, msgs);
			msgs = basicSetImplementationBehavior(newImplementationBehavior, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__IMPLEMENTATION_BEHAVIOR, newImplementationBehavior, newImplementationBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Precedence> getActivePrecedencies() {
		if (activePrecedencies == null) {
			activePrecedencies = new EObjectContainmentWithInverseEList<Precedence>(Precedence.class, this, Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__ACTIVE_PRECEDENCIES, Functional_design_architecturePackage.PRECEDENCE__PREDECESSOR);
		}
		return activePrecedencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Precedence> getPassivePrecedencies() {
		if (passivePrecedencies == null) {
			passivePrecedencies = new EObjectWithInverseResolvingEList<Precedence>(Precedence.class, this, Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__PASSIVE_PRECEDENCIES, Functional_design_architecturePackage.PRECEDENCE__SUCCESSOR);
		}
		return passivePrecedencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementarySoftwareFunction> getPredecessors() {
		// TODO: implement this method to return the 'Predecessors' reference list
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
	public EList<ElementarySoftwareFunction> getSuccessors() {
		// TODO: implement this method to return the 'Successors' reference list
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
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__ACTIVE_REALIZATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActiveRealizations()).basicAdd(otherEnd, msgs);
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__ACTIVE_VARIATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActiveVariations()).basicAdd(otherEnd, msgs);
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__ACTIVE_SELECTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActiveSelections()).basicAdd(otherEnd, msgs);
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__ACTIVE_EXCLUSIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActiveExclusions()).basicAdd(otherEnd, msgs);
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__PASSIVE_VARIATION:
				if (passiveVariation != null)
					msgs = ((InternalEObject)passiveVariation).eInverseRemove(this, Variant_handlingPackage.VARIATION__VARIANT, Variation.class, msgs);
				return basicSetPassiveVariation((Variation)otherEnd, msgs);
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__PASSIVE_SELECTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPassiveSelections()).basicAdd(otherEnd, msgs);
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__PASSIVE_EXCLUSIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPassiveExclusions()).basicAdd(otherEnd, msgs);
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__VALIDATORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getValidators()).basicAdd(otherEnd, msgs);
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__INSTANCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInstances()).basicAdd(otherEnd, msgs);
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__ACTIVE_PRECEDENCIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActivePrecedencies()).basicAdd(otherEnd, msgs);
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__PASSIVE_PRECEDENCIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPassivePrecedencies()).basicAdd(otherEnd, msgs);
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
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__ACTIVE_REALIZATIONS:
				return ((InternalEList<?>)getActiveRealizations()).basicRemove(otherEnd, msgs);
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__ACTIVE_VARIATIONS:
				return ((InternalEList<?>)getActiveVariations()).basicRemove(otherEnd, msgs);
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__ACTIVE_SELECTIONS:
				return ((InternalEList<?>)getActiveSelections()).basicRemove(otherEnd, msgs);
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__ACTIVE_EXCLUSIONS:
				return ((InternalEList<?>)getActiveExclusions()).basicRemove(otherEnd, msgs);
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__PASSIVE_VARIATION:
				return basicSetPassiveVariation(null, msgs);
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__PASSIVE_SELECTIONS:
				return ((InternalEList<?>)getPassiveSelections()).basicRemove(otherEnd, msgs);
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__PASSIVE_EXCLUSIONS:
				return ((InternalEList<?>)getPassiveExclusions()).basicRemove(otherEnd, msgs);
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__VALIDATORS:
				return ((InternalEList<?>)getValidators()).basicRemove(otherEnd, msgs);
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__PORTS:
				return ((InternalEList<?>)getPorts()).basicRemove(otherEnd, msgs);
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__INSTANCES:
				return ((InternalEList<?>)getInstances()).basicRemove(otherEnd, msgs);
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__PERIOD:
				return basicSetPeriod(null, msgs);
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__OFFSET:
				return basicSetOffset(null, msgs);
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__EXECUTION_TIME:
				return basicSetExecutionTime(null, msgs);
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__SPECIFATION_BEHAVIOR:
				return basicSetSpecifationBehavior(null, msgs);
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__IMPLEMENTATION_BEHAVIOR:
				return basicSetImplementationBehavior(null, msgs);
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__ACTIVE_PRECEDENCIES:
				return ((InternalEList<?>)getActivePrecedencies()).basicRemove(otherEnd, msgs);
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__PASSIVE_PRECEDENCIES:
				return ((InternalEList<?>)getPassivePrecedencies()).basicRemove(otherEnd, msgs);
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
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__ACTIVE_REALIZATIONS:
				return getActiveRealizations();
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__REALIZES:
				return getRealizes();
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__NULL_VARIANT:
				return isNullVariant();
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__COMPLETE:
				return isComplete();
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__ACTIVE_VARIATIONS:
				return getActiveVariations();
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__ACTIVE_SELECTIONS:
				return getActiveSelections();
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__ACTIVE_EXCLUSIONS:
				return getActiveExclusions();
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__PASSIVE_VARIATION:
				if (resolve) return getPassiveVariation();
				return basicGetPassiveVariation();
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__PASSIVE_SELECTIONS:
				return getPassiveSelections();
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__PASSIVE_EXCLUSIONS:
				return getPassiveExclusions();
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__VARIATION_POINT:
				if (resolve) return getVariationPoint();
				return basicGetVariationPoint();
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__VARIANTS:
				return getVariants();
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__SELECTORS:
				return getSelectors();
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__SELECTED:
				return getSelected();
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__EXCLUDERS:
				return getExcluders();
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__EXCLUDED:
				return getExcluded();
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__SELECTION_CRITERION:
				return getSelectionCriterion();
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__VALIDATORS:
				return getValidators();
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__PORTS:
				return getPorts();
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__PARAMETERS:
				return getParameters();
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__INSTANCES:
				return getInstances();
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__TRIGGER_TYPE:
				return getTriggerType();
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__TRIGGER_EVENT:
				return getTriggerEvent();
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__TRIGGER_CONDITION:
				return getTriggerCondition();
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__PERIOD:
				return getPeriod();
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__OFFSET:
				return getOffset();
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__EXECUTION_TIME:
				return getExecutionTime();
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__SPECIFATION_BEHAVIOR:
				return getSpecifationBehavior();
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__IMPLEMENTATION_BEHAVIOR:
				return getImplementationBehavior();
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__ACTIVE_PRECEDENCIES:
				return getActivePrecedencies();
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__PASSIVE_PRECEDENCIES:
				return getPassivePrecedencies();
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__PREDECESSORS:
				return getPredecessors();
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__SUCCESSORS:
				return getSuccessors();
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
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__ACTIVE_REALIZATIONS:
				getActiveRealizations().clear();
				getActiveRealizations().addAll((Collection<? extends Realization>)newValue);
				return;
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__NULL_VARIANT:
				setNullVariant((Boolean)newValue);
				return;
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__COMPLETE:
				setComplete((Boolean)newValue);
				return;
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__ACTIVE_VARIATIONS:
				getActiveVariations().clear();
				getActiveVariations().addAll((Collection<? extends Variation>)newValue);
				return;
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__ACTIVE_SELECTIONS:
				getActiveSelections().clear();
				getActiveSelections().addAll((Collection<? extends Selection>)newValue);
				return;
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__ACTIVE_EXCLUSIONS:
				getActiveExclusions().clear();
				getActiveExclusions().addAll((Collection<? extends Exclusion>)newValue);
				return;
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__PASSIVE_VARIATION:
				setPassiveVariation((Variation)newValue);
				return;
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__PASSIVE_SELECTIONS:
				getPassiveSelections().clear();
				getPassiveSelections().addAll((Collection<? extends Selection>)newValue);
				return;
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__PASSIVE_EXCLUSIONS:
				getPassiveExclusions().clear();
				getPassiveExclusions().addAll((Collection<? extends Exclusion>)newValue);
				return;
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__SELECTION_CRITERION:
				setSelectionCriterion((String)newValue);
				return;
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__VALIDATORS:
				getValidators().clear();
				getValidators().addAll((Collection<? extends VVCase>)newValue);
				return;
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__PORTS:
				getPorts().clear();
				getPorts().addAll((Collection<? extends FunctionPort>)newValue);
				return;
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__INSTANCES:
				getInstances().clear();
				getInstances().addAll((Collection<? extends FunctionInstance>)newValue);
				return;
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__TRIGGER_TYPE:
				setTriggerType((TriggerKind)newValue);
				return;
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__TRIGGER_EVENT:
				setTriggerEvent((String)newValue);
				return;
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__TRIGGER_CONDITION:
				setTriggerCondition((String)newValue);
				return;
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__PERIOD:
				setPeriod((TimingRestriction)newValue);
				return;
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__OFFSET:
				setOffset((TimingRestriction)newValue);
				return;
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__EXECUTION_TIME:
				setExecutionTime((TimingRestriction)newValue);
				return;
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__SPECIFATION_BEHAVIOR:
				setSpecifationBehavior((Behavior)newValue);
				return;
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__IMPLEMENTATION_BEHAVIOR:
				setImplementationBehavior((Behavior)newValue);
				return;
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__ACTIVE_PRECEDENCIES:
				getActivePrecedencies().clear();
				getActivePrecedencies().addAll((Collection<? extends Precedence>)newValue);
				return;
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__PASSIVE_PRECEDENCIES:
				getPassivePrecedencies().clear();
				getPassivePrecedencies().addAll((Collection<? extends Precedence>)newValue);
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
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__ACTIVE_REALIZATIONS:
				getActiveRealizations().clear();
				return;
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__NULL_VARIANT:
				setNullVariant(NULL_VARIANT_EDEFAULT);
				return;
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__COMPLETE:
				setComplete(COMPLETE_EDEFAULT);
				return;
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__ACTIVE_VARIATIONS:
				getActiveVariations().clear();
				return;
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__ACTIVE_SELECTIONS:
				getActiveSelections().clear();
				return;
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__ACTIVE_EXCLUSIONS:
				getActiveExclusions().clear();
				return;
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__PASSIVE_VARIATION:
				setPassiveVariation((Variation)null);
				return;
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__PASSIVE_SELECTIONS:
				getPassiveSelections().clear();
				return;
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__PASSIVE_EXCLUSIONS:
				getPassiveExclusions().clear();
				return;
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__SELECTION_CRITERION:
				setSelectionCriterion(SELECTION_CRITERION_EDEFAULT);
				return;
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__VALIDATORS:
				getValidators().clear();
				return;
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__PORTS:
				getPorts().clear();
				return;
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__PARAMETERS:
				getParameters().clear();
				return;
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__INSTANCES:
				getInstances().clear();
				return;
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__TRIGGER_TYPE:
				setTriggerType(TRIGGER_TYPE_EDEFAULT);
				return;
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__TRIGGER_EVENT:
				setTriggerEvent(TRIGGER_EVENT_EDEFAULT);
				return;
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__TRIGGER_CONDITION:
				setTriggerCondition(TRIGGER_CONDITION_EDEFAULT);
				return;
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__PERIOD:
				setPeriod((TimingRestriction)null);
				return;
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__OFFSET:
				setOffset((TimingRestriction)null);
				return;
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__EXECUTION_TIME:
				setExecutionTime((TimingRestriction)null);
				return;
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__SPECIFATION_BEHAVIOR:
				setSpecifationBehavior((Behavior)null);
				return;
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__IMPLEMENTATION_BEHAVIOR:
				setImplementationBehavior((Behavior)null);
				return;
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__ACTIVE_PRECEDENCIES:
				getActivePrecedencies().clear();
				return;
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__PASSIVE_PRECEDENCIES:
				getPassivePrecedencies().clear();
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
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__ACTIVE_REALIZATIONS:
				return activeRealizations != null && !activeRealizations.isEmpty();
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__REALIZES:
				return !getRealizes().isEmpty();
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__NULL_VARIANT:
				return nullVariant != NULL_VARIANT_EDEFAULT;
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__COMPLETE:
				return complete != COMPLETE_EDEFAULT;
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__ACTIVE_VARIATIONS:
				return activeVariations != null && !activeVariations.isEmpty();
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__ACTIVE_SELECTIONS:
				return activeSelections != null && !activeSelections.isEmpty();
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__ACTIVE_EXCLUSIONS:
				return activeExclusions != null && !activeExclusions.isEmpty();
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__PASSIVE_VARIATION:
				return passiveVariation != null;
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__PASSIVE_SELECTIONS:
				return passiveSelections != null && !passiveSelections.isEmpty();
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__PASSIVE_EXCLUSIONS:
				return passiveExclusions != null && !passiveExclusions.isEmpty();
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__VARIATION_POINT:
				return basicGetVariationPoint() != null;
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__VARIANTS:
				return !getVariants().isEmpty();
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__SELECTORS:
				return !getSelectors().isEmpty();
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__SELECTED:
				return !getSelected().isEmpty();
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__EXCLUDERS:
				return !getExcluders().isEmpty();
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__EXCLUDED:
				return !getExcluded().isEmpty();
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__SELECTION_CRITERION:
				return SELECTION_CRITERION_EDEFAULT == null ? selectionCriterion != null : !SELECTION_CRITERION_EDEFAULT.equals(selectionCriterion);
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__VALIDATORS:
				return validators != null && !validators.isEmpty();
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__PORTS:
				return ports != null && !ports.isEmpty();
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__INSTANCES:
				return instances != null && !instances.isEmpty();
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__TRIGGER_TYPE:
				return triggerType != TRIGGER_TYPE_EDEFAULT;
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__TRIGGER_EVENT:
				return TRIGGER_EVENT_EDEFAULT == null ? triggerEvent != null : !TRIGGER_EVENT_EDEFAULT.equals(triggerEvent);
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__TRIGGER_CONDITION:
				return TRIGGER_CONDITION_EDEFAULT == null ? triggerCondition != null : !TRIGGER_CONDITION_EDEFAULT.equals(triggerCondition);
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__PERIOD:
				return period != null;
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__OFFSET:
				return offset != null;
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__EXECUTION_TIME:
				return executionTime != null;
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__SPECIFATION_BEHAVIOR:
				return specifationBehavior != null;
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__IMPLEMENTATION_BEHAVIOR:
				return implementationBehavior != null;
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__ACTIVE_PRECEDENCIES:
				return activePrecedencies != null && !activePrecedencies.isEmpty();
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__PASSIVE_PRECEDENCIES:
				return passivePrecedencies != null && !passivePrecedencies.isEmpty();
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__PREDECESSORS:
				return !getPredecessors().isEmpty();
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__SUCCESSORS:
				return !getSuccessors().isEmpty();
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
		if (baseClass == RealizingEntity.class) {
			switch (derivedFeatureID) {
				case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__ACTIVE_REALIZATIONS: return CommonPackage.REALIZING_ENTITY__ACTIVE_REALIZATIONS;
				case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__REALIZES: return CommonPackage.REALIZING_ENTITY__REALIZES;
				default: return -1;
			}
		}
		if (baseClass == VariantEntity.class) {
			switch (derivedFeatureID) {
				case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__NULL_VARIANT: return Variant_handlingPackage.VARIANT_ENTITY__NULL_VARIANT;
				case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__COMPLETE: return Variant_handlingPackage.VARIANT_ENTITY__COMPLETE;
				case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__ACTIVE_VARIATIONS: return Variant_handlingPackage.VARIANT_ENTITY__ACTIVE_VARIATIONS;
				case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__ACTIVE_SELECTIONS: return Variant_handlingPackage.VARIANT_ENTITY__ACTIVE_SELECTIONS;
				case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__ACTIVE_EXCLUSIONS: return Variant_handlingPackage.VARIANT_ENTITY__ACTIVE_EXCLUSIONS;
				case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__PASSIVE_VARIATION: return Variant_handlingPackage.VARIANT_ENTITY__PASSIVE_VARIATION;
				case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__PASSIVE_SELECTIONS: return Variant_handlingPackage.VARIANT_ENTITY__PASSIVE_SELECTIONS;
				case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__PASSIVE_EXCLUSIONS: return Variant_handlingPackage.VARIANT_ENTITY__PASSIVE_EXCLUSIONS;
				case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__VARIATION_POINT: return Variant_handlingPackage.VARIANT_ENTITY__VARIATION_POINT;
				case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__VARIANTS: return Variant_handlingPackage.VARIANT_ENTITY__VARIANTS;
				case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__SELECTORS: return Variant_handlingPackage.VARIANT_ENTITY__SELECTORS;
				case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__SELECTED: return Variant_handlingPackage.VARIANT_ENTITY__SELECTED;
				case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__EXCLUDERS: return Variant_handlingPackage.VARIANT_ENTITY__EXCLUDERS;
				case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__EXCLUDED: return Variant_handlingPackage.VARIANT_ENTITY__EXCLUDED;
				case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__SELECTION_CRITERION: return Variant_handlingPackage.VARIANT_ENTITY__SELECTION_CRITERION;
				default: return -1;
			}
		}
		if (baseClass == ValidatedEntity.class) {
			switch (derivedFeatureID) {
				case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__VALIDATORS: return Verification_validationPackage.VALIDATED_ENTITY__VALIDATORS;
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
		if (baseClass == RealizingEntity.class) {
			switch (baseFeatureID) {
				case CommonPackage.REALIZING_ENTITY__ACTIVE_REALIZATIONS: return Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__ACTIVE_REALIZATIONS;
				case CommonPackage.REALIZING_ENTITY__REALIZES: return Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__REALIZES;
				default: return -1;
			}
		}
		if (baseClass == VariantEntity.class) {
			switch (baseFeatureID) {
				case Variant_handlingPackage.VARIANT_ENTITY__NULL_VARIANT: return Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__NULL_VARIANT;
				case Variant_handlingPackage.VARIANT_ENTITY__COMPLETE: return Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__COMPLETE;
				case Variant_handlingPackage.VARIANT_ENTITY__ACTIVE_VARIATIONS: return Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__ACTIVE_VARIATIONS;
				case Variant_handlingPackage.VARIANT_ENTITY__ACTIVE_SELECTIONS: return Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__ACTIVE_SELECTIONS;
				case Variant_handlingPackage.VARIANT_ENTITY__ACTIVE_EXCLUSIONS: return Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__ACTIVE_EXCLUSIONS;
				case Variant_handlingPackage.VARIANT_ENTITY__PASSIVE_VARIATION: return Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__PASSIVE_VARIATION;
				case Variant_handlingPackage.VARIANT_ENTITY__PASSIVE_SELECTIONS: return Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__PASSIVE_SELECTIONS;
				case Variant_handlingPackage.VARIANT_ENTITY__PASSIVE_EXCLUSIONS: return Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__PASSIVE_EXCLUSIONS;
				case Variant_handlingPackage.VARIANT_ENTITY__VARIATION_POINT: return Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__VARIATION_POINT;
				case Variant_handlingPackage.VARIANT_ENTITY__VARIANTS: return Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__VARIANTS;
				case Variant_handlingPackage.VARIANT_ENTITY__SELECTORS: return Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__SELECTORS;
				case Variant_handlingPackage.VARIANT_ENTITY__SELECTED: return Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__SELECTED;
				case Variant_handlingPackage.VARIANT_ENTITY__EXCLUDERS: return Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__EXCLUDERS;
				case Variant_handlingPackage.VARIANT_ENTITY__EXCLUDED: return Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__EXCLUDED;
				case Variant_handlingPackage.VARIANT_ENTITY__SELECTION_CRITERION: return Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__SELECTION_CRITERION;
				default: return -1;
			}
		}
		if (baseClass == ValidatedEntity.class) {
			switch (baseFeatureID) {
				case Verification_validationPackage.VALIDATED_ENTITY__VALIDATORS: return Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__VALIDATORS;
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
		result.append(", triggerType: ");
		result.append(triggerType);
		result.append(", triggerEvent: ");
		result.append(triggerEvent);
		result.append(", triggerCondition: ");
		result.append(triggerCondition);
		result.append(')');
		return result.toString();
	}

} //ElementarySoftwareFunctionImpl
