/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl;

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

import org.obeonetwork.dsl.east_adl.core.impl.EASTADLEntityImpl;

import org.obeonetwork.dsl.east_adl.requirements.Constraint;
import org.obeonetwork.dsl.east_adl.requirements.DesignConstraint;
import org.obeonetwork.dsl.east_adl.requirements.FunctionalRequirement;
import org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage;
import org.obeonetwork.dsl.east_adl.requirements.Specification;

import org.obeonetwork.dsl.east_adl.structure.common.AllocatableEntity;
import org.obeonetwork.dsl.east_adl.structure.common.AllocationConstraint;
import org.obeonetwork.dsl.east_adl.structure.common.CommonPackage;
import org.obeonetwork.dsl.east_adl.structure.common.Realization;
import org.obeonetwork.dsl.east_adl.structure.common.RealizedEntity;
import org.obeonetwork.dsl.east_adl.structure.common.RealizingEntity;

import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ECU;

import org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.EFeature;
import org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.Inclusion;
import org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleSet;
import org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.Vehicle_feature_modelPackage;

import org.obeonetwork.dsl.east_adl.support.ArchivedEntity;
import org.obeonetwork.dsl.east_adl.support.SupportPackage;
import org.obeonetwork.dsl.east_adl.support.VersionArchive;

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
 * An implementation of the model object '<em><b>EFeature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.EFeatureImpl#getPassiveRealizations <em>Passive Realizations</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.EFeatureImpl#getRealizedBy <em>Realized By</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.EFeatureImpl#getAllocation <em>Allocation</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.EFeatureImpl#getAllocationTarget <em>Allocation Target</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.EFeatureImpl#getArchiveDescription <em>Archive Description</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.EFeatureImpl#getVersionArchive <em>Version Archive</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.EFeatureImpl#isNullVariant <em>Null Variant</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.EFeatureImpl#isComplete <em>Complete</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.EFeatureImpl#getActiveVariations <em>Active Variations</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.EFeatureImpl#getActiveSelections <em>Active Selections</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.EFeatureImpl#getActiveExclusions <em>Active Exclusions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.EFeatureImpl#getPassiveVariation <em>Passive Variation</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.EFeatureImpl#getPassiveSelections <em>Passive Selections</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.EFeatureImpl#getPassiveExclusions <em>Passive Exclusions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.EFeatureImpl#getVariationPoint <em>Variation Point</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.EFeatureImpl#getVariants <em>Variants</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.EFeatureImpl#getSelectors <em>Selectors</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.EFeatureImpl#getSelected <em>Selected</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.EFeatureImpl#getExcluders <em>Excluders</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.EFeatureImpl#getExcluded <em>Excluded</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.EFeatureImpl#getSelectionCriterion <em>Selection Criterion</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.EFeatureImpl#getValidators <em>Validators</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.EFeatureImpl#isOptional <em>Optional</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.EFeatureImpl#isVisibleByCustomer <em>Visible By Customer</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.EFeatureImpl#getPassiveSpecifications <em>Passive Specifications</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.EFeatureImpl#getPassiveConstraints <em>Passive Constraints</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.EFeatureImpl#getSpecifyingFunctionalRequirements <em>Specifying Functional Requirements</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.EFeatureImpl#getConstrainingDesignConstraints <em>Constraining Design Constraints</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.EFeatureImpl#getInclusions <em>Inclusions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.EFeatureImpl#getIncludingVehicleSets <em>Including Vehicle Sets</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.EFeatureImpl#getSubFeatures <em>Sub Features</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.EFeatureImpl#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EFeatureImpl extends EASTADLEntityImpl implements EFeature {
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
	 * The cached value of the '{@link #getAllocation() <em>Allocation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocation()
	 * @generated
	 * @ordered
	 */
	protected AllocationConstraint allocation;

	/**
	 * The default value of the '{@link #getArchiveDescription() <em>Archive Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchiveDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String ARCHIVE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArchiveDescription() <em>Archive Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchiveDescription()
	 * @generated
	 * @ordered
	 */
	protected String archiveDescription = ARCHIVE_DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVersionArchive() <em>Version Archive</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionArchive()
	 * @generated
	 * @ordered
	 */
	protected VersionArchive versionArchive;

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
	 * The default value of the '{@link #isOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPTIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptional()
	 * @generated
	 * @ordered
	 */
	protected boolean optional = OPTIONAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isVisibleByCustomer() <em>Visible By Customer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisibleByCustomer()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VISIBLE_BY_CUSTOMER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVisibleByCustomer() <em>Visible By Customer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisibleByCustomer()
	 * @generated
	 * @ordered
	 */
	protected boolean visibleByCustomer = VISIBLE_BY_CUSTOMER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPassiveSpecifications() <em>Passive Specifications</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassiveSpecifications()
	 * @generated
	 * @ordered
	 */
	protected EList<Specification> passiveSpecifications;

	/**
	 * The cached value of the '{@link #getPassiveConstraints() <em>Passive Constraints</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassiveConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> passiveConstraints;

	/**
	 * The cached value of the '{@link #getInclusions() <em>Inclusions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInclusions()
	 * @generated
	 * @ordered
	 */
	protected EList<Inclusion> inclusions;

	/**
	 * The cached value of the '{@link #getSubFeatures() <em>Sub Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<EFeature> subFeatures;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Vehicle_feature_modelPackage.Literals.EFEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Realization> getPassiveRealizations() {
		if (passiveRealizations == null) {
			passiveRealizations = new EObjectWithInverseResolvingEList<Realization>(Realization.class, this, Vehicle_feature_modelPackage.EFEATURE__PASSIVE_REALIZATIONS, CommonPackage.REALIZATION__REALIZED_ENTITY);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Vehicle_feature_modelPackage.EFEATURE__ALLOCATION, oldAllocation, newAllocation);
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
			eNotify(new ENotificationImpl(this, Notification.SET, Vehicle_feature_modelPackage.EFEATURE__ALLOCATION, newAllocation, newAllocation));
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
	public String getArchiveDescription() {
		return archiveDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArchiveDescription(String newArchiveDescription) {
		String oldArchiveDescription = archiveDescription;
		archiveDescription = newArchiveDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Vehicle_feature_modelPackage.EFEATURE__ARCHIVE_DESCRIPTION, oldArchiveDescription, archiveDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionArchive getVersionArchive() {
		if (versionArchive != null && versionArchive.eIsProxy()) {
			InternalEObject oldVersionArchive = (InternalEObject)versionArchive;
			versionArchive = (VersionArchive)eResolveProxy(oldVersionArchive);
			if (versionArchive != oldVersionArchive) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Vehicle_feature_modelPackage.EFEATURE__VERSION_ARCHIVE, oldVersionArchive, versionArchive));
			}
		}
		return versionArchive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionArchive basicGetVersionArchive() {
		return versionArchive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersionArchive(VersionArchive newVersionArchive, NotificationChain msgs) {
		VersionArchive oldVersionArchive = versionArchive;
		versionArchive = newVersionArchive;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Vehicle_feature_modelPackage.EFEATURE__VERSION_ARCHIVE, oldVersionArchive, newVersionArchive);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersionArchive(VersionArchive newVersionArchive) {
		if (newVersionArchive != versionArchive) {
			NotificationChain msgs = null;
			if (versionArchive != null)
				msgs = ((InternalEObject)versionArchive).eInverseRemove(this, SupportPackage.VERSION_ARCHIVE__ARCHIVED_ENTITY, VersionArchive.class, msgs);
			if (newVersionArchive != null)
				msgs = ((InternalEObject)newVersionArchive).eInverseAdd(this, SupportPackage.VERSION_ARCHIVE__ARCHIVED_ENTITY, VersionArchive.class, msgs);
			msgs = basicSetVersionArchive(newVersionArchive, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Vehicle_feature_modelPackage.EFEATURE__VERSION_ARCHIVE, newVersionArchive, newVersionArchive));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Vehicle_feature_modelPackage.EFEATURE__NULL_VARIANT, oldNullVariant, nullVariant));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Vehicle_feature_modelPackage.EFEATURE__COMPLETE, oldComplete, complete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variation> getActiveVariations() {
		if (activeVariations == null) {
			activeVariations = new EObjectContainmentWithInverseEList<Variation>(Variation.class, this, Vehicle_feature_modelPackage.EFEATURE__ACTIVE_VARIATIONS, Variant_handlingPackage.VARIATION__VARIATION_POINT);
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
			activeSelections = new EObjectContainmentWithInverseEList<Selection>(Selection.class, this, Vehicle_feature_modelPackage.EFEATURE__ACTIVE_SELECTIONS, Variant_handlingPackage.SELECTION__SELECTOR);
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
			activeExclusions = new EObjectContainmentWithInverseEList<Exclusion>(Exclusion.class, this, Vehicle_feature_modelPackage.EFEATURE__ACTIVE_EXCLUSIONS, Variant_handlingPackage.EXCLUSION__EXCLUDER);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Vehicle_feature_modelPackage.EFEATURE__PASSIVE_VARIATION, oldPassiveVariation, passiveVariation));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Vehicle_feature_modelPackage.EFEATURE__PASSIVE_VARIATION, oldPassiveVariation, newPassiveVariation);
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
			eNotify(new ENotificationImpl(this, Notification.SET, Vehicle_feature_modelPackage.EFEATURE__PASSIVE_VARIATION, newPassiveVariation, newPassiveVariation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Selection> getPassiveSelections() {
		if (passiveSelections == null) {
			passiveSelections = new EObjectWithInverseResolvingEList<Selection>(Selection.class, this, Vehicle_feature_modelPackage.EFEATURE__PASSIVE_SELECTIONS, Variant_handlingPackage.SELECTION__SELECTED);
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
			passiveExclusions = new EObjectWithInverseResolvingEList<Exclusion>(Exclusion.class, this, Vehicle_feature_modelPackage.EFEATURE__PASSIVE_EXCLUSIONS, Variant_handlingPackage.EXCLUSION__EXCLUDED);
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
			eNotify(new ENotificationImpl(this, Notification.SET, Vehicle_feature_modelPackage.EFEATURE__SELECTION_CRITERION, oldSelectionCriterion, selectionCriterion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VVCase> getValidators() {
		if (validators == null) {
			validators = new EObjectWithInverseResolvingEList.ManyInverse<VVCase>(VVCase.class, this, Vehicle_feature_modelPackage.EFEATURE__VALIDATORS, Verification_validationPackage.VV_CASE__VALIDATED_ENTITIES);
		}
		return validators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOptional() {
		return optional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptional(boolean newOptional) {
		boolean oldOptional = optional;
		optional = newOptional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Vehicle_feature_modelPackage.EFEATURE__OPTIONAL, oldOptional, optional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVisibleByCustomer() {
		return visibleByCustomer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibleByCustomer(boolean newVisibleByCustomer) {
		boolean oldVisibleByCustomer = visibleByCustomer;
		visibleByCustomer = newVisibleByCustomer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Vehicle_feature_modelPackage.EFEATURE__VISIBLE_BY_CUSTOMER, oldVisibleByCustomer, visibleByCustomer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Specification> getPassiveSpecifications() {
		if (passiveSpecifications == null) {
			passiveSpecifications = new EObjectWithInverseResolvingEList<Specification>(Specification.class, this, Vehicle_feature_modelPackage.EFEATURE__PASSIVE_SPECIFICATIONS, RequirementsPackage.SPECIFICATION__SPECIFIED_ENTITY);
		}
		return passiveSpecifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getPassiveConstraints() {
		if (passiveConstraints == null) {
			passiveConstraints = new EObjectWithInverseResolvingEList<Constraint>(Constraint.class, this, Vehicle_feature_modelPackage.EFEATURE__PASSIVE_CONSTRAINTS, RequirementsPackage.CONSTRAINT__CONSTRAINED_ENTITY);
		}
		return passiveConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionalRequirement> getSpecifyingFunctionalRequirements() {
		// TODO: implement this method to return the 'Specifying Functional Requirements' reference list
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
	public EList<DesignConstraint> getConstrainingDesignConstraints() {
		// TODO: implement this method to return the 'Constraining Design Constraints' reference list
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
	public EList<Inclusion> getInclusions() {
		if (inclusions == null) {
			inclusions = new EObjectWithInverseResolvingEList<Inclusion>(Inclusion.class, this, Vehicle_feature_modelPackage.EFEATURE__INCLUSIONS, Vehicle_feature_modelPackage.INCLUSION__ELECTRONIC_FEATURE);
		}
		return inclusions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VehicleSet> getIncludingVehicleSets() {
		// TODO: implement this method to return the 'Including Vehicle Sets' reference list
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
	public EList<EFeature> getSubFeatures() {
		if (subFeatures == null) {
			subFeatures = new EObjectContainmentEList<EFeature>(EFeature.class, this, Vehicle_feature_modelPackage.EFEATURE__SUB_FEATURES);
		}
		return subFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Vehicle_feature_modelPackage.EFEATURE__DESCRIPTION, oldDescription, description));
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
			case Vehicle_feature_modelPackage.EFEATURE__PASSIVE_REALIZATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPassiveRealizations()).basicAdd(otherEnd, msgs);
			case Vehicle_feature_modelPackage.EFEATURE__ALLOCATION:
				if (allocation != null)
					msgs = ((InternalEObject)allocation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Vehicle_feature_modelPackage.EFEATURE__ALLOCATION, null, msgs);
				return basicSetAllocation((AllocationConstraint)otherEnd, msgs);
			case Vehicle_feature_modelPackage.EFEATURE__VERSION_ARCHIVE:
				if (versionArchive != null)
					msgs = ((InternalEObject)versionArchive).eInverseRemove(this, SupportPackage.VERSION_ARCHIVE__ARCHIVED_ENTITY, VersionArchive.class, msgs);
				return basicSetVersionArchive((VersionArchive)otherEnd, msgs);
			case Vehicle_feature_modelPackage.EFEATURE__ACTIVE_VARIATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActiveVariations()).basicAdd(otherEnd, msgs);
			case Vehicle_feature_modelPackage.EFEATURE__ACTIVE_SELECTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActiveSelections()).basicAdd(otherEnd, msgs);
			case Vehicle_feature_modelPackage.EFEATURE__ACTIVE_EXCLUSIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActiveExclusions()).basicAdd(otherEnd, msgs);
			case Vehicle_feature_modelPackage.EFEATURE__PASSIVE_VARIATION:
				if (passiveVariation != null)
					msgs = ((InternalEObject)passiveVariation).eInverseRemove(this, Variant_handlingPackage.VARIATION__VARIANT, Variation.class, msgs);
				return basicSetPassiveVariation((Variation)otherEnd, msgs);
			case Vehicle_feature_modelPackage.EFEATURE__PASSIVE_SELECTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPassiveSelections()).basicAdd(otherEnd, msgs);
			case Vehicle_feature_modelPackage.EFEATURE__PASSIVE_EXCLUSIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPassiveExclusions()).basicAdd(otherEnd, msgs);
			case Vehicle_feature_modelPackage.EFEATURE__VALIDATORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getValidators()).basicAdd(otherEnd, msgs);
			case Vehicle_feature_modelPackage.EFEATURE__PASSIVE_SPECIFICATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPassiveSpecifications()).basicAdd(otherEnd, msgs);
			case Vehicle_feature_modelPackage.EFEATURE__PASSIVE_CONSTRAINTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPassiveConstraints()).basicAdd(otherEnd, msgs);
			case Vehicle_feature_modelPackage.EFEATURE__INCLUSIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInclusions()).basicAdd(otherEnd, msgs);
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
			case Vehicle_feature_modelPackage.EFEATURE__PASSIVE_REALIZATIONS:
				return ((InternalEList<?>)getPassiveRealizations()).basicRemove(otherEnd, msgs);
			case Vehicle_feature_modelPackage.EFEATURE__ALLOCATION:
				return basicSetAllocation(null, msgs);
			case Vehicle_feature_modelPackage.EFEATURE__VERSION_ARCHIVE:
				return basicSetVersionArchive(null, msgs);
			case Vehicle_feature_modelPackage.EFEATURE__ACTIVE_VARIATIONS:
				return ((InternalEList<?>)getActiveVariations()).basicRemove(otherEnd, msgs);
			case Vehicle_feature_modelPackage.EFEATURE__ACTIVE_SELECTIONS:
				return ((InternalEList<?>)getActiveSelections()).basicRemove(otherEnd, msgs);
			case Vehicle_feature_modelPackage.EFEATURE__ACTIVE_EXCLUSIONS:
				return ((InternalEList<?>)getActiveExclusions()).basicRemove(otherEnd, msgs);
			case Vehicle_feature_modelPackage.EFEATURE__PASSIVE_VARIATION:
				return basicSetPassiveVariation(null, msgs);
			case Vehicle_feature_modelPackage.EFEATURE__PASSIVE_SELECTIONS:
				return ((InternalEList<?>)getPassiveSelections()).basicRemove(otherEnd, msgs);
			case Vehicle_feature_modelPackage.EFEATURE__PASSIVE_EXCLUSIONS:
				return ((InternalEList<?>)getPassiveExclusions()).basicRemove(otherEnd, msgs);
			case Vehicle_feature_modelPackage.EFEATURE__VALIDATORS:
				return ((InternalEList<?>)getValidators()).basicRemove(otherEnd, msgs);
			case Vehicle_feature_modelPackage.EFEATURE__PASSIVE_SPECIFICATIONS:
				return ((InternalEList<?>)getPassiveSpecifications()).basicRemove(otherEnd, msgs);
			case Vehicle_feature_modelPackage.EFEATURE__PASSIVE_CONSTRAINTS:
				return ((InternalEList<?>)getPassiveConstraints()).basicRemove(otherEnd, msgs);
			case Vehicle_feature_modelPackage.EFEATURE__INCLUSIONS:
				return ((InternalEList<?>)getInclusions()).basicRemove(otherEnd, msgs);
			case Vehicle_feature_modelPackage.EFEATURE__SUB_FEATURES:
				return ((InternalEList<?>)getSubFeatures()).basicRemove(otherEnd, msgs);
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
			case Vehicle_feature_modelPackage.EFEATURE__PASSIVE_REALIZATIONS:
				return getPassiveRealizations();
			case Vehicle_feature_modelPackage.EFEATURE__REALIZED_BY:
				return getRealizedBy();
			case Vehicle_feature_modelPackage.EFEATURE__ALLOCATION:
				return getAllocation();
			case Vehicle_feature_modelPackage.EFEATURE__ALLOCATION_TARGET:
				if (resolve) return getAllocationTarget();
				return basicGetAllocationTarget();
			case Vehicle_feature_modelPackage.EFEATURE__ARCHIVE_DESCRIPTION:
				return getArchiveDescription();
			case Vehicle_feature_modelPackage.EFEATURE__VERSION_ARCHIVE:
				if (resolve) return getVersionArchive();
				return basicGetVersionArchive();
			case Vehicle_feature_modelPackage.EFEATURE__NULL_VARIANT:
				return isNullVariant();
			case Vehicle_feature_modelPackage.EFEATURE__COMPLETE:
				return isComplete();
			case Vehicle_feature_modelPackage.EFEATURE__ACTIVE_VARIATIONS:
				return getActiveVariations();
			case Vehicle_feature_modelPackage.EFEATURE__ACTIVE_SELECTIONS:
				return getActiveSelections();
			case Vehicle_feature_modelPackage.EFEATURE__ACTIVE_EXCLUSIONS:
				return getActiveExclusions();
			case Vehicle_feature_modelPackage.EFEATURE__PASSIVE_VARIATION:
				if (resolve) return getPassiveVariation();
				return basicGetPassiveVariation();
			case Vehicle_feature_modelPackage.EFEATURE__PASSIVE_SELECTIONS:
				return getPassiveSelections();
			case Vehicle_feature_modelPackage.EFEATURE__PASSIVE_EXCLUSIONS:
				return getPassiveExclusions();
			case Vehicle_feature_modelPackage.EFEATURE__VARIATION_POINT:
				if (resolve) return getVariationPoint();
				return basicGetVariationPoint();
			case Vehicle_feature_modelPackage.EFEATURE__VARIANTS:
				return getVariants();
			case Vehicle_feature_modelPackage.EFEATURE__SELECTORS:
				return getSelectors();
			case Vehicle_feature_modelPackage.EFEATURE__SELECTED:
				return getSelected();
			case Vehicle_feature_modelPackage.EFEATURE__EXCLUDERS:
				return getExcluders();
			case Vehicle_feature_modelPackage.EFEATURE__EXCLUDED:
				return getExcluded();
			case Vehicle_feature_modelPackage.EFEATURE__SELECTION_CRITERION:
				return getSelectionCriterion();
			case Vehicle_feature_modelPackage.EFEATURE__VALIDATORS:
				return getValidators();
			case Vehicle_feature_modelPackage.EFEATURE__OPTIONAL:
				return isOptional();
			case Vehicle_feature_modelPackage.EFEATURE__VISIBLE_BY_CUSTOMER:
				return isVisibleByCustomer();
			case Vehicle_feature_modelPackage.EFEATURE__PASSIVE_SPECIFICATIONS:
				return getPassiveSpecifications();
			case Vehicle_feature_modelPackage.EFEATURE__PASSIVE_CONSTRAINTS:
				return getPassiveConstraints();
			case Vehicle_feature_modelPackage.EFEATURE__SPECIFYING_FUNCTIONAL_REQUIREMENTS:
				return getSpecifyingFunctionalRequirements();
			case Vehicle_feature_modelPackage.EFEATURE__CONSTRAINING_DESIGN_CONSTRAINTS:
				return getConstrainingDesignConstraints();
			case Vehicle_feature_modelPackage.EFEATURE__INCLUSIONS:
				return getInclusions();
			case Vehicle_feature_modelPackage.EFEATURE__INCLUDING_VEHICLE_SETS:
				return getIncludingVehicleSets();
			case Vehicle_feature_modelPackage.EFEATURE__SUB_FEATURES:
				return getSubFeatures();
			case Vehicle_feature_modelPackage.EFEATURE__DESCRIPTION:
				return getDescription();
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
			case Vehicle_feature_modelPackage.EFEATURE__PASSIVE_REALIZATIONS:
				getPassiveRealizations().clear();
				getPassiveRealizations().addAll((Collection<? extends Realization>)newValue);
				return;
			case Vehicle_feature_modelPackage.EFEATURE__ALLOCATION:
				setAllocation((AllocationConstraint)newValue);
				return;
			case Vehicle_feature_modelPackage.EFEATURE__ARCHIVE_DESCRIPTION:
				setArchiveDescription((String)newValue);
				return;
			case Vehicle_feature_modelPackage.EFEATURE__VERSION_ARCHIVE:
				setVersionArchive((VersionArchive)newValue);
				return;
			case Vehicle_feature_modelPackage.EFEATURE__NULL_VARIANT:
				setNullVariant((Boolean)newValue);
				return;
			case Vehicle_feature_modelPackage.EFEATURE__COMPLETE:
				setComplete((Boolean)newValue);
				return;
			case Vehicle_feature_modelPackage.EFEATURE__ACTIVE_VARIATIONS:
				getActiveVariations().clear();
				getActiveVariations().addAll((Collection<? extends Variation>)newValue);
				return;
			case Vehicle_feature_modelPackage.EFEATURE__ACTIVE_SELECTIONS:
				getActiveSelections().clear();
				getActiveSelections().addAll((Collection<? extends Selection>)newValue);
				return;
			case Vehicle_feature_modelPackage.EFEATURE__ACTIVE_EXCLUSIONS:
				getActiveExclusions().clear();
				getActiveExclusions().addAll((Collection<? extends Exclusion>)newValue);
				return;
			case Vehicle_feature_modelPackage.EFEATURE__PASSIVE_VARIATION:
				setPassiveVariation((Variation)newValue);
				return;
			case Vehicle_feature_modelPackage.EFEATURE__PASSIVE_SELECTIONS:
				getPassiveSelections().clear();
				getPassiveSelections().addAll((Collection<? extends Selection>)newValue);
				return;
			case Vehicle_feature_modelPackage.EFEATURE__PASSIVE_EXCLUSIONS:
				getPassiveExclusions().clear();
				getPassiveExclusions().addAll((Collection<? extends Exclusion>)newValue);
				return;
			case Vehicle_feature_modelPackage.EFEATURE__SELECTION_CRITERION:
				setSelectionCriterion((String)newValue);
				return;
			case Vehicle_feature_modelPackage.EFEATURE__VALIDATORS:
				getValidators().clear();
				getValidators().addAll((Collection<? extends VVCase>)newValue);
				return;
			case Vehicle_feature_modelPackage.EFEATURE__OPTIONAL:
				setOptional((Boolean)newValue);
				return;
			case Vehicle_feature_modelPackage.EFEATURE__VISIBLE_BY_CUSTOMER:
				setVisibleByCustomer((Boolean)newValue);
				return;
			case Vehicle_feature_modelPackage.EFEATURE__PASSIVE_SPECIFICATIONS:
				getPassiveSpecifications().clear();
				getPassiveSpecifications().addAll((Collection<? extends Specification>)newValue);
				return;
			case Vehicle_feature_modelPackage.EFEATURE__PASSIVE_CONSTRAINTS:
				getPassiveConstraints().clear();
				getPassiveConstraints().addAll((Collection<? extends Constraint>)newValue);
				return;
			case Vehicle_feature_modelPackage.EFEATURE__INCLUSIONS:
				getInclusions().clear();
				getInclusions().addAll((Collection<? extends Inclusion>)newValue);
				return;
			case Vehicle_feature_modelPackage.EFEATURE__SUB_FEATURES:
				getSubFeatures().clear();
				getSubFeatures().addAll((Collection<? extends EFeature>)newValue);
				return;
			case Vehicle_feature_modelPackage.EFEATURE__DESCRIPTION:
				setDescription((String)newValue);
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
			case Vehicle_feature_modelPackage.EFEATURE__PASSIVE_REALIZATIONS:
				getPassiveRealizations().clear();
				return;
			case Vehicle_feature_modelPackage.EFEATURE__ALLOCATION:
				setAllocation((AllocationConstraint)null);
				return;
			case Vehicle_feature_modelPackage.EFEATURE__ARCHIVE_DESCRIPTION:
				setArchiveDescription(ARCHIVE_DESCRIPTION_EDEFAULT);
				return;
			case Vehicle_feature_modelPackage.EFEATURE__VERSION_ARCHIVE:
				setVersionArchive((VersionArchive)null);
				return;
			case Vehicle_feature_modelPackage.EFEATURE__NULL_VARIANT:
				setNullVariant(NULL_VARIANT_EDEFAULT);
				return;
			case Vehicle_feature_modelPackage.EFEATURE__COMPLETE:
				setComplete(COMPLETE_EDEFAULT);
				return;
			case Vehicle_feature_modelPackage.EFEATURE__ACTIVE_VARIATIONS:
				getActiveVariations().clear();
				return;
			case Vehicle_feature_modelPackage.EFEATURE__ACTIVE_SELECTIONS:
				getActiveSelections().clear();
				return;
			case Vehicle_feature_modelPackage.EFEATURE__ACTIVE_EXCLUSIONS:
				getActiveExclusions().clear();
				return;
			case Vehicle_feature_modelPackage.EFEATURE__PASSIVE_VARIATION:
				setPassiveVariation((Variation)null);
				return;
			case Vehicle_feature_modelPackage.EFEATURE__PASSIVE_SELECTIONS:
				getPassiveSelections().clear();
				return;
			case Vehicle_feature_modelPackage.EFEATURE__PASSIVE_EXCLUSIONS:
				getPassiveExclusions().clear();
				return;
			case Vehicle_feature_modelPackage.EFEATURE__SELECTION_CRITERION:
				setSelectionCriterion(SELECTION_CRITERION_EDEFAULT);
				return;
			case Vehicle_feature_modelPackage.EFEATURE__VALIDATORS:
				getValidators().clear();
				return;
			case Vehicle_feature_modelPackage.EFEATURE__OPTIONAL:
				setOptional(OPTIONAL_EDEFAULT);
				return;
			case Vehicle_feature_modelPackage.EFEATURE__VISIBLE_BY_CUSTOMER:
				setVisibleByCustomer(VISIBLE_BY_CUSTOMER_EDEFAULT);
				return;
			case Vehicle_feature_modelPackage.EFEATURE__PASSIVE_SPECIFICATIONS:
				getPassiveSpecifications().clear();
				return;
			case Vehicle_feature_modelPackage.EFEATURE__PASSIVE_CONSTRAINTS:
				getPassiveConstraints().clear();
				return;
			case Vehicle_feature_modelPackage.EFEATURE__INCLUSIONS:
				getInclusions().clear();
				return;
			case Vehicle_feature_modelPackage.EFEATURE__SUB_FEATURES:
				getSubFeatures().clear();
				return;
			case Vehicle_feature_modelPackage.EFEATURE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case Vehicle_feature_modelPackage.EFEATURE__PASSIVE_REALIZATIONS:
				return passiveRealizations != null && !passiveRealizations.isEmpty();
			case Vehicle_feature_modelPackage.EFEATURE__REALIZED_BY:
				return !getRealizedBy().isEmpty();
			case Vehicle_feature_modelPackage.EFEATURE__ALLOCATION:
				return allocation != null;
			case Vehicle_feature_modelPackage.EFEATURE__ALLOCATION_TARGET:
				return basicGetAllocationTarget() != null;
			case Vehicle_feature_modelPackage.EFEATURE__ARCHIVE_DESCRIPTION:
				return ARCHIVE_DESCRIPTION_EDEFAULT == null ? archiveDescription != null : !ARCHIVE_DESCRIPTION_EDEFAULT.equals(archiveDescription);
			case Vehicle_feature_modelPackage.EFEATURE__VERSION_ARCHIVE:
				return versionArchive != null;
			case Vehicle_feature_modelPackage.EFEATURE__NULL_VARIANT:
				return nullVariant != NULL_VARIANT_EDEFAULT;
			case Vehicle_feature_modelPackage.EFEATURE__COMPLETE:
				return complete != COMPLETE_EDEFAULT;
			case Vehicle_feature_modelPackage.EFEATURE__ACTIVE_VARIATIONS:
				return activeVariations != null && !activeVariations.isEmpty();
			case Vehicle_feature_modelPackage.EFEATURE__ACTIVE_SELECTIONS:
				return activeSelections != null && !activeSelections.isEmpty();
			case Vehicle_feature_modelPackage.EFEATURE__ACTIVE_EXCLUSIONS:
				return activeExclusions != null && !activeExclusions.isEmpty();
			case Vehicle_feature_modelPackage.EFEATURE__PASSIVE_VARIATION:
				return passiveVariation != null;
			case Vehicle_feature_modelPackage.EFEATURE__PASSIVE_SELECTIONS:
				return passiveSelections != null && !passiveSelections.isEmpty();
			case Vehicle_feature_modelPackage.EFEATURE__PASSIVE_EXCLUSIONS:
				return passiveExclusions != null && !passiveExclusions.isEmpty();
			case Vehicle_feature_modelPackage.EFEATURE__VARIATION_POINT:
				return basicGetVariationPoint() != null;
			case Vehicle_feature_modelPackage.EFEATURE__VARIANTS:
				return !getVariants().isEmpty();
			case Vehicle_feature_modelPackage.EFEATURE__SELECTORS:
				return !getSelectors().isEmpty();
			case Vehicle_feature_modelPackage.EFEATURE__SELECTED:
				return !getSelected().isEmpty();
			case Vehicle_feature_modelPackage.EFEATURE__EXCLUDERS:
				return !getExcluders().isEmpty();
			case Vehicle_feature_modelPackage.EFEATURE__EXCLUDED:
				return !getExcluded().isEmpty();
			case Vehicle_feature_modelPackage.EFEATURE__SELECTION_CRITERION:
				return SELECTION_CRITERION_EDEFAULT == null ? selectionCriterion != null : !SELECTION_CRITERION_EDEFAULT.equals(selectionCriterion);
			case Vehicle_feature_modelPackage.EFEATURE__VALIDATORS:
				return validators != null && !validators.isEmpty();
			case Vehicle_feature_modelPackage.EFEATURE__OPTIONAL:
				return optional != OPTIONAL_EDEFAULT;
			case Vehicle_feature_modelPackage.EFEATURE__VISIBLE_BY_CUSTOMER:
				return visibleByCustomer != VISIBLE_BY_CUSTOMER_EDEFAULT;
			case Vehicle_feature_modelPackage.EFEATURE__PASSIVE_SPECIFICATIONS:
				return passiveSpecifications != null && !passiveSpecifications.isEmpty();
			case Vehicle_feature_modelPackage.EFEATURE__PASSIVE_CONSTRAINTS:
				return passiveConstraints != null && !passiveConstraints.isEmpty();
			case Vehicle_feature_modelPackage.EFEATURE__SPECIFYING_FUNCTIONAL_REQUIREMENTS:
				return !getSpecifyingFunctionalRequirements().isEmpty();
			case Vehicle_feature_modelPackage.EFEATURE__CONSTRAINING_DESIGN_CONSTRAINTS:
				return !getConstrainingDesignConstraints().isEmpty();
			case Vehicle_feature_modelPackage.EFEATURE__INCLUSIONS:
				return inclusions != null && !inclusions.isEmpty();
			case Vehicle_feature_modelPackage.EFEATURE__INCLUDING_VEHICLE_SETS:
				return !getIncludingVehicleSets().isEmpty();
			case Vehicle_feature_modelPackage.EFEATURE__SUB_FEATURES:
				return subFeatures != null && !subFeatures.isEmpty();
			case Vehicle_feature_modelPackage.EFEATURE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		if (baseClass == RealizedEntity.class) {
			switch (derivedFeatureID) {
				case Vehicle_feature_modelPackage.EFEATURE__PASSIVE_REALIZATIONS: return CommonPackage.REALIZED_ENTITY__PASSIVE_REALIZATIONS;
				case Vehicle_feature_modelPackage.EFEATURE__REALIZED_BY: return CommonPackage.REALIZED_ENTITY__REALIZED_BY;
				default: return -1;
			}
		}
		if (baseClass == AllocatableEntity.class) {
			switch (derivedFeatureID) {
				case Vehicle_feature_modelPackage.EFEATURE__ALLOCATION: return CommonPackage.ALLOCATABLE_ENTITY__ALLOCATION;
				case Vehicle_feature_modelPackage.EFEATURE__ALLOCATION_TARGET: return CommonPackage.ALLOCATABLE_ENTITY__ALLOCATION_TARGET;
				default: return -1;
			}
		}
		if (baseClass == ArchivedEntity.class) {
			switch (derivedFeatureID) {
				case Vehicle_feature_modelPackage.EFEATURE__ARCHIVE_DESCRIPTION: return SupportPackage.ARCHIVED_ENTITY__ARCHIVE_DESCRIPTION;
				case Vehicle_feature_modelPackage.EFEATURE__VERSION_ARCHIVE: return SupportPackage.ARCHIVED_ENTITY__VERSION_ARCHIVE;
				default: return -1;
			}
		}
		if (baseClass == VariantEntity.class) {
			switch (derivedFeatureID) {
				case Vehicle_feature_modelPackage.EFEATURE__NULL_VARIANT: return Variant_handlingPackage.VARIANT_ENTITY__NULL_VARIANT;
				case Vehicle_feature_modelPackage.EFEATURE__COMPLETE: return Variant_handlingPackage.VARIANT_ENTITY__COMPLETE;
				case Vehicle_feature_modelPackage.EFEATURE__ACTIVE_VARIATIONS: return Variant_handlingPackage.VARIANT_ENTITY__ACTIVE_VARIATIONS;
				case Vehicle_feature_modelPackage.EFEATURE__ACTIVE_SELECTIONS: return Variant_handlingPackage.VARIANT_ENTITY__ACTIVE_SELECTIONS;
				case Vehicle_feature_modelPackage.EFEATURE__ACTIVE_EXCLUSIONS: return Variant_handlingPackage.VARIANT_ENTITY__ACTIVE_EXCLUSIONS;
				case Vehicle_feature_modelPackage.EFEATURE__PASSIVE_VARIATION: return Variant_handlingPackage.VARIANT_ENTITY__PASSIVE_VARIATION;
				case Vehicle_feature_modelPackage.EFEATURE__PASSIVE_SELECTIONS: return Variant_handlingPackage.VARIANT_ENTITY__PASSIVE_SELECTIONS;
				case Vehicle_feature_modelPackage.EFEATURE__PASSIVE_EXCLUSIONS: return Variant_handlingPackage.VARIANT_ENTITY__PASSIVE_EXCLUSIONS;
				case Vehicle_feature_modelPackage.EFEATURE__VARIATION_POINT: return Variant_handlingPackage.VARIANT_ENTITY__VARIATION_POINT;
				case Vehicle_feature_modelPackage.EFEATURE__VARIANTS: return Variant_handlingPackage.VARIANT_ENTITY__VARIANTS;
				case Vehicle_feature_modelPackage.EFEATURE__SELECTORS: return Variant_handlingPackage.VARIANT_ENTITY__SELECTORS;
				case Vehicle_feature_modelPackage.EFEATURE__SELECTED: return Variant_handlingPackage.VARIANT_ENTITY__SELECTED;
				case Vehicle_feature_modelPackage.EFEATURE__EXCLUDERS: return Variant_handlingPackage.VARIANT_ENTITY__EXCLUDERS;
				case Vehicle_feature_modelPackage.EFEATURE__EXCLUDED: return Variant_handlingPackage.VARIANT_ENTITY__EXCLUDED;
				case Vehicle_feature_modelPackage.EFEATURE__SELECTION_CRITERION: return Variant_handlingPackage.VARIANT_ENTITY__SELECTION_CRITERION;
				default: return -1;
			}
		}
		if (baseClass == ValidatedEntity.class) {
			switch (derivedFeatureID) {
				case Vehicle_feature_modelPackage.EFEATURE__VALIDATORS: return Verification_validationPackage.VALIDATED_ENTITY__VALIDATORS;
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
		if (baseClass == RealizedEntity.class) {
			switch (baseFeatureID) {
				case CommonPackage.REALIZED_ENTITY__PASSIVE_REALIZATIONS: return Vehicle_feature_modelPackage.EFEATURE__PASSIVE_REALIZATIONS;
				case CommonPackage.REALIZED_ENTITY__REALIZED_BY: return Vehicle_feature_modelPackage.EFEATURE__REALIZED_BY;
				default: return -1;
			}
		}
		if (baseClass == AllocatableEntity.class) {
			switch (baseFeatureID) {
				case CommonPackage.ALLOCATABLE_ENTITY__ALLOCATION: return Vehicle_feature_modelPackage.EFEATURE__ALLOCATION;
				case CommonPackage.ALLOCATABLE_ENTITY__ALLOCATION_TARGET: return Vehicle_feature_modelPackage.EFEATURE__ALLOCATION_TARGET;
				default: return -1;
			}
		}
		if (baseClass == ArchivedEntity.class) {
			switch (baseFeatureID) {
				case SupportPackage.ARCHIVED_ENTITY__ARCHIVE_DESCRIPTION: return Vehicle_feature_modelPackage.EFEATURE__ARCHIVE_DESCRIPTION;
				case SupportPackage.ARCHIVED_ENTITY__VERSION_ARCHIVE: return Vehicle_feature_modelPackage.EFEATURE__VERSION_ARCHIVE;
				default: return -1;
			}
		}
		if (baseClass == VariantEntity.class) {
			switch (baseFeatureID) {
				case Variant_handlingPackage.VARIANT_ENTITY__NULL_VARIANT: return Vehicle_feature_modelPackage.EFEATURE__NULL_VARIANT;
				case Variant_handlingPackage.VARIANT_ENTITY__COMPLETE: return Vehicle_feature_modelPackage.EFEATURE__COMPLETE;
				case Variant_handlingPackage.VARIANT_ENTITY__ACTIVE_VARIATIONS: return Vehicle_feature_modelPackage.EFEATURE__ACTIVE_VARIATIONS;
				case Variant_handlingPackage.VARIANT_ENTITY__ACTIVE_SELECTIONS: return Vehicle_feature_modelPackage.EFEATURE__ACTIVE_SELECTIONS;
				case Variant_handlingPackage.VARIANT_ENTITY__ACTIVE_EXCLUSIONS: return Vehicle_feature_modelPackage.EFEATURE__ACTIVE_EXCLUSIONS;
				case Variant_handlingPackage.VARIANT_ENTITY__PASSIVE_VARIATION: return Vehicle_feature_modelPackage.EFEATURE__PASSIVE_VARIATION;
				case Variant_handlingPackage.VARIANT_ENTITY__PASSIVE_SELECTIONS: return Vehicle_feature_modelPackage.EFEATURE__PASSIVE_SELECTIONS;
				case Variant_handlingPackage.VARIANT_ENTITY__PASSIVE_EXCLUSIONS: return Vehicle_feature_modelPackage.EFEATURE__PASSIVE_EXCLUSIONS;
				case Variant_handlingPackage.VARIANT_ENTITY__VARIATION_POINT: return Vehicle_feature_modelPackage.EFEATURE__VARIATION_POINT;
				case Variant_handlingPackage.VARIANT_ENTITY__VARIANTS: return Vehicle_feature_modelPackage.EFEATURE__VARIANTS;
				case Variant_handlingPackage.VARIANT_ENTITY__SELECTORS: return Vehicle_feature_modelPackage.EFEATURE__SELECTORS;
				case Variant_handlingPackage.VARIANT_ENTITY__SELECTED: return Vehicle_feature_modelPackage.EFEATURE__SELECTED;
				case Variant_handlingPackage.VARIANT_ENTITY__EXCLUDERS: return Vehicle_feature_modelPackage.EFEATURE__EXCLUDERS;
				case Variant_handlingPackage.VARIANT_ENTITY__EXCLUDED: return Vehicle_feature_modelPackage.EFEATURE__EXCLUDED;
				case Variant_handlingPackage.VARIANT_ENTITY__SELECTION_CRITERION: return Vehicle_feature_modelPackage.EFEATURE__SELECTION_CRITERION;
				default: return -1;
			}
		}
		if (baseClass == ValidatedEntity.class) {
			switch (baseFeatureID) {
				case Verification_validationPackage.VALIDATED_ENTITY__VALIDATORS: return Vehicle_feature_modelPackage.EFEATURE__VALIDATORS;
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
		result.append(" (archiveDescription: ");
		result.append(archiveDescription);
		result.append(", nullVariant: ");
		result.append(nullVariant);
		result.append(", complete: ");
		result.append(complete);
		result.append(", selectionCriterion: ");
		result.append(selectionCriterion);
		result.append(", optional: ");
		result.append(optional);
		result.append(", visibleByCustomer: ");
		result.append(visibleByCustomer);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //EFeatureImpl
