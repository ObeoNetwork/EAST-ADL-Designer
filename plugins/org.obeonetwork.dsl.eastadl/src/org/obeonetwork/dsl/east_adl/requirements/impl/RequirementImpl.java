/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.requirements.impl;

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

import org.obeonetwork.dsl.east_adl.core.EASTADLEntity;

import org.obeonetwork.dsl.east_adl.core.impl.EASTADLNamedElementImpl;

import org.obeonetwork.dsl.east_adl.requirements.Assignment;
import org.obeonetwork.dsl.east_adl.requirements.Requirement;
import org.obeonetwork.dsl.east_adl.requirements.RequirementDescription;
import org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage;
import org.obeonetwork.dsl.east_adl.requirements.Trace;
import org.obeonetwork.dsl.east_adl.requirements.VerificationMethod;

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
 * An implementation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.impl.RequirementImpl#getArchiveDescription <em>Archive Description</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.impl.RequirementImpl#getVersionArchive <em>Version Archive</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.impl.RequirementImpl#isNullVariant <em>Null Variant</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.impl.RequirementImpl#isComplete <em>Complete</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.impl.RequirementImpl#getActiveVariations <em>Active Variations</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.impl.RequirementImpl#getActiveSelections <em>Active Selections</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.impl.RequirementImpl#getActiveExclusions <em>Active Exclusions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.impl.RequirementImpl#getPassiveVariation <em>Passive Variation</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.impl.RequirementImpl#getPassiveSelections <em>Passive Selections</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.impl.RequirementImpl#getPassiveExclusions <em>Passive Exclusions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.impl.RequirementImpl#getVariationPoint <em>Variation Point</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.impl.RequirementImpl#getVariants <em>Variants</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.impl.RequirementImpl#getSelectors <em>Selectors</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.impl.RequirementImpl#getSelected <em>Selected</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.impl.RequirementImpl#getExcluders <em>Excluders</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.impl.RequirementImpl#getExcluded <em>Excluded</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.impl.RequirementImpl#getSelectionCriterion <em>Selection Criterion</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.impl.RequirementImpl#getValidators <em>Validators</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.impl.RequirementImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.impl.RequirementImpl#getExternalDescriptions <em>External Descriptions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.impl.RequirementImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.impl.RequirementImpl#getMaturity <em>Maturity</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.impl.RequirementImpl#getAcceptanceCriterion <em>Acceptance Criterion</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.impl.RequirementImpl#getCriticality <em>Criticality</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.impl.RequirementImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.impl.RequirementImpl#getActiveTraces <em>Active Traces</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.impl.RequirementImpl#getPassiveTraces <em>Passive Traces</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.impl.RequirementImpl#getDerivedRequirements <em>Derived Requirements</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.impl.RequirementImpl#getSourceRequirements <em>Source Requirements</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.impl.RequirementImpl#getSubRequirements <em>Sub Requirements</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.impl.RequirementImpl#getVerificationMethods <em>Verification Methods</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.impl.RequirementImpl#getActiveAssignments <em>Active Assignments</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.impl.RequirementImpl#getAssignedEntities <em>Assigned Entities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RequirementImpl extends EASTADLNamedElementImpl implements Requirement {
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
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String identifier = IDENTIFIER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExternalDescriptions() <em>External Descriptions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<RequirementDescription> externalDescriptions;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected String status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaturity() <em>Maturity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaturity()
	 * @generated
	 * @ordered
	 */
	protected static final String MATURITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaturity() <em>Maturity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaturity()
	 * @generated
	 * @ordered
	 */
	protected String maturity = MATURITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getAcceptanceCriterion() <em>Acceptance Criterion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceptanceCriterion()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCEPTANCE_CRITERION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAcceptanceCriterion() <em>Acceptance Criterion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceptanceCriterion()
	 * @generated
	 * @ordered
	 */
	protected String acceptanceCriterion = ACCEPTANCE_CRITERION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCriticality() <em>Criticality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriticality()
	 * @generated
	 * @ordered
	 */
	protected static final String CRITICALITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCriticality() <em>Criticality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriticality()
	 * @generated
	 * @ordered
	 */
	protected String criticality = CRITICALITY_EDEFAULT;

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
	 * The cached value of the '{@link #getActiveTraces() <em>Active Traces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveTraces()
	 * @generated
	 * @ordered
	 */
	protected EList<Trace> activeTraces;

	/**
	 * The cached value of the '{@link #getPassiveTraces() <em>Passive Traces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassiveTraces()
	 * @generated
	 * @ordered
	 */
	protected EList<Trace> passiveTraces;

	/**
	 * The cached value of the '{@link #getSubRequirements() <em>Sub Requirements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> subRequirements;

	/**
	 * The cached value of the '{@link #getVerificationMethods() <em>Verification Methods</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerificationMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<VerificationMethod> verificationMethods;

	/**
	 * The cached value of the '{@link #getActiveAssignments() <em>Active Assignments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveAssignments()
	 * @generated
	 * @ordered
	 */
	protected EList<Assignment> activeAssignments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementsPackage.Literals.REQUIREMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.REQUIREMENT__ARCHIVE_DESCRIPTION, oldArchiveDescription, archiveDescription));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RequirementsPackage.REQUIREMENT__VERSION_ARCHIVE, oldVersionArchive, versionArchive));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RequirementsPackage.REQUIREMENT__VERSION_ARCHIVE, oldVersionArchive, newVersionArchive);
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
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.REQUIREMENT__VERSION_ARCHIVE, newVersionArchive, newVersionArchive));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.REQUIREMENT__NULL_VARIANT, oldNullVariant, nullVariant));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.REQUIREMENT__COMPLETE, oldComplete, complete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variation> getActiveVariations() {
		if (activeVariations == null) {
			activeVariations = new EObjectContainmentWithInverseEList<Variation>(Variation.class, this, RequirementsPackage.REQUIREMENT__ACTIVE_VARIATIONS, Variant_handlingPackage.VARIATION__VARIATION_POINT);
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
			activeSelections = new EObjectContainmentWithInverseEList<Selection>(Selection.class, this, RequirementsPackage.REQUIREMENT__ACTIVE_SELECTIONS, Variant_handlingPackage.SELECTION__SELECTOR);
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
			activeExclusions = new EObjectContainmentWithInverseEList<Exclusion>(Exclusion.class, this, RequirementsPackage.REQUIREMENT__ACTIVE_EXCLUSIONS, Variant_handlingPackage.EXCLUSION__EXCLUDER);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RequirementsPackage.REQUIREMENT__PASSIVE_VARIATION, oldPassiveVariation, passiveVariation));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RequirementsPackage.REQUIREMENT__PASSIVE_VARIATION, oldPassiveVariation, newPassiveVariation);
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
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.REQUIREMENT__PASSIVE_VARIATION, newPassiveVariation, newPassiveVariation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Selection> getPassiveSelections() {
		if (passiveSelections == null) {
			passiveSelections = new EObjectWithInverseResolvingEList<Selection>(Selection.class, this, RequirementsPackage.REQUIREMENT__PASSIVE_SELECTIONS, Variant_handlingPackage.SELECTION__SELECTED);
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
			passiveExclusions = new EObjectWithInverseResolvingEList<Exclusion>(Exclusion.class, this, RequirementsPackage.REQUIREMENT__PASSIVE_EXCLUSIONS, Variant_handlingPackage.EXCLUSION__EXCLUDED);
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
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.REQUIREMENT__SELECTION_CRITERION, oldSelectionCriterion, selectionCriterion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VVCase> getValidators() {
		if (validators == null) {
			validators = new EObjectWithInverseResolvingEList.ManyInverse<VVCase>(VVCase.class, this, RequirementsPackage.REQUIREMENT__VALIDATORS, Verification_validationPackage.VV_CASE__VALIDATED_ENTITIES);
		}
		return validators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(String newIdentifier) {
		String oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.REQUIREMENT__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequirementDescription> getExternalDescriptions() {
		if (externalDescriptions == null) {
			externalDescriptions = new EObjectContainmentWithInverseEList<RequirementDescription>(RequirementDescription.class, this, RequirementsPackage.REQUIREMENT__EXTERNAL_DESCRIPTIONS, RequirementsPackage.REQUIREMENT_DESCRIPTION__REQUIREMENT);
		}
		return externalDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(String newStatus) {
		String oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.REQUIREMENT__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaturity() {
		return maturity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaturity(String newMaturity) {
		String oldMaturity = maturity;
		maturity = newMaturity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.REQUIREMENT__MATURITY, oldMaturity, maturity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAcceptanceCriterion() {
		return acceptanceCriterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAcceptanceCriterion(String newAcceptanceCriterion) {
		String oldAcceptanceCriterion = acceptanceCriterion;
		acceptanceCriterion = newAcceptanceCriterion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.REQUIREMENT__ACCEPTANCE_CRITERION, oldAcceptanceCriterion, acceptanceCriterion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCriticality() {
		return criticality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCriticality(String newCriticality) {
		String oldCriticality = criticality;
		criticality = newCriticality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.REQUIREMENT__CRITICALITY, oldCriticality, criticality));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.REQUIREMENT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trace> getActiveTraces() {
		if (activeTraces == null) {
			activeTraces = new EObjectContainmentWithInverseEList<Trace>(Trace.class, this, RequirementsPackage.REQUIREMENT__ACTIVE_TRACES, RequirementsPackage.TRACE__TRACER);
		}
		return activeTraces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trace> getPassiveTraces() {
		if (passiveTraces == null) {
			passiveTraces = new EObjectWithInverseResolvingEList<Trace>(Trace.class, this, RequirementsPackage.REQUIREMENT__PASSIVE_TRACES, RequirementsPackage.TRACE__TRACED);
		}
		return passiveTraces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requirement> getDerivedRequirements() {
		// TODO: implement this method to return the 'Derived Requirements' reference list
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
	public EList<Requirement> getSourceRequirements() {
		// TODO: implement this method to return the 'Source Requirements' reference list
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
	public EList<Requirement> getSubRequirements() {
		if (subRequirements == null) {
			subRequirements = new EObjectContainmentEList<Requirement>(Requirement.class, this, RequirementsPackage.REQUIREMENT__SUB_REQUIREMENTS);
		}
		return subRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VerificationMethod> getVerificationMethods() {
		if (verificationMethods == null) {
			verificationMethods = new EObjectContainmentWithInverseEList<VerificationMethod>(VerificationMethod.class, this, RequirementsPackage.REQUIREMENT__VERIFICATION_METHODS, RequirementsPackage.VERIFICATION_METHOD__REQUIREMENT);
		}
		return verificationMethods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Assignment> getActiveAssignments() {
		if (activeAssignments == null) {
			activeAssignments = new EObjectContainmentWithInverseEList<Assignment>(Assignment.class, this, RequirementsPackage.REQUIREMENT__ACTIVE_ASSIGNMENTS, RequirementsPackage.ASSIGNMENT__ASSIGNER);
		}
		return activeAssignments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EASTADLEntity> getAssignedEntities() {
		// TODO: implement this method to return the 'Assigned Entities' reference list
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
			case RequirementsPackage.REQUIREMENT__VERSION_ARCHIVE:
				if (versionArchive != null)
					msgs = ((InternalEObject)versionArchive).eInverseRemove(this, SupportPackage.VERSION_ARCHIVE__ARCHIVED_ENTITY, VersionArchive.class, msgs);
				return basicSetVersionArchive((VersionArchive)otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__ACTIVE_VARIATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActiveVariations()).basicAdd(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__ACTIVE_SELECTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActiveSelections()).basicAdd(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__ACTIVE_EXCLUSIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActiveExclusions()).basicAdd(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__PASSIVE_VARIATION:
				if (passiveVariation != null)
					msgs = ((InternalEObject)passiveVariation).eInverseRemove(this, Variant_handlingPackage.VARIATION__VARIANT, Variation.class, msgs);
				return basicSetPassiveVariation((Variation)otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__PASSIVE_SELECTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPassiveSelections()).basicAdd(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__PASSIVE_EXCLUSIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPassiveExclusions()).basicAdd(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__VALIDATORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getValidators()).basicAdd(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__EXTERNAL_DESCRIPTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExternalDescriptions()).basicAdd(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__ACTIVE_TRACES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActiveTraces()).basicAdd(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__PASSIVE_TRACES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPassiveTraces()).basicAdd(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__VERIFICATION_METHODS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVerificationMethods()).basicAdd(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__ACTIVE_ASSIGNMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActiveAssignments()).basicAdd(otherEnd, msgs);
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
			case RequirementsPackage.REQUIREMENT__VERSION_ARCHIVE:
				return basicSetVersionArchive(null, msgs);
			case RequirementsPackage.REQUIREMENT__ACTIVE_VARIATIONS:
				return ((InternalEList<?>)getActiveVariations()).basicRemove(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__ACTIVE_SELECTIONS:
				return ((InternalEList<?>)getActiveSelections()).basicRemove(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__ACTIVE_EXCLUSIONS:
				return ((InternalEList<?>)getActiveExclusions()).basicRemove(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__PASSIVE_VARIATION:
				return basicSetPassiveVariation(null, msgs);
			case RequirementsPackage.REQUIREMENT__PASSIVE_SELECTIONS:
				return ((InternalEList<?>)getPassiveSelections()).basicRemove(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__PASSIVE_EXCLUSIONS:
				return ((InternalEList<?>)getPassiveExclusions()).basicRemove(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__VALIDATORS:
				return ((InternalEList<?>)getValidators()).basicRemove(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__EXTERNAL_DESCRIPTIONS:
				return ((InternalEList<?>)getExternalDescriptions()).basicRemove(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__ACTIVE_TRACES:
				return ((InternalEList<?>)getActiveTraces()).basicRemove(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__PASSIVE_TRACES:
				return ((InternalEList<?>)getPassiveTraces()).basicRemove(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__SUB_REQUIREMENTS:
				return ((InternalEList<?>)getSubRequirements()).basicRemove(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__VERIFICATION_METHODS:
				return ((InternalEList<?>)getVerificationMethods()).basicRemove(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__ACTIVE_ASSIGNMENTS:
				return ((InternalEList<?>)getActiveAssignments()).basicRemove(otherEnd, msgs);
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
			case RequirementsPackage.REQUIREMENT__ARCHIVE_DESCRIPTION:
				return getArchiveDescription();
			case RequirementsPackage.REQUIREMENT__VERSION_ARCHIVE:
				if (resolve) return getVersionArchive();
				return basicGetVersionArchive();
			case RequirementsPackage.REQUIREMENT__NULL_VARIANT:
				return isNullVariant();
			case RequirementsPackage.REQUIREMENT__COMPLETE:
				return isComplete();
			case RequirementsPackage.REQUIREMENT__ACTIVE_VARIATIONS:
				return getActiveVariations();
			case RequirementsPackage.REQUIREMENT__ACTIVE_SELECTIONS:
				return getActiveSelections();
			case RequirementsPackage.REQUIREMENT__ACTIVE_EXCLUSIONS:
				return getActiveExclusions();
			case RequirementsPackage.REQUIREMENT__PASSIVE_VARIATION:
				if (resolve) return getPassiveVariation();
				return basicGetPassiveVariation();
			case RequirementsPackage.REQUIREMENT__PASSIVE_SELECTIONS:
				return getPassiveSelections();
			case RequirementsPackage.REQUIREMENT__PASSIVE_EXCLUSIONS:
				return getPassiveExclusions();
			case RequirementsPackage.REQUIREMENT__VARIATION_POINT:
				if (resolve) return getVariationPoint();
				return basicGetVariationPoint();
			case RequirementsPackage.REQUIREMENT__VARIANTS:
				return getVariants();
			case RequirementsPackage.REQUIREMENT__SELECTORS:
				return getSelectors();
			case RequirementsPackage.REQUIREMENT__SELECTED:
				return getSelected();
			case RequirementsPackage.REQUIREMENT__EXCLUDERS:
				return getExcluders();
			case RequirementsPackage.REQUIREMENT__EXCLUDED:
				return getExcluded();
			case RequirementsPackage.REQUIREMENT__SELECTION_CRITERION:
				return getSelectionCriterion();
			case RequirementsPackage.REQUIREMENT__VALIDATORS:
				return getValidators();
			case RequirementsPackage.REQUIREMENT__IDENTIFIER:
				return getIdentifier();
			case RequirementsPackage.REQUIREMENT__EXTERNAL_DESCRIPTIONS:
				return getExternalDescriptions();
			case RequirementsPackage.REQUIREMENT__STATUS:
				return getStatus();
			case RequirementsPackage.REQUIREMENT__MATURITY:
				return getMaturity();
			case RequirementsPackage.REQUIREMENT__ACCEPTANCE_CRITERION:
				return getAcceptanceCriterion();
			case RequirementsPackage.REQUIREMENT__CRITICALITY:
				return getCriticality();
			case RequirementsPackage.REQUIREMENT__DESCRIPTION:
				return getDescription();
			case RequirementsPackage.REQUIREMENT__ACTIVE_TRACES:
				return getActiveTraces();
			case RequirementsPackage.REQUIREMENT__PASSIVE_TRACES:
				return getPassiveTraces();
			case RequirementsPackage.REQUIREMENT__DERIVED_REQUIREMENTS:
				return getDerivedRequirements();
			case RequirementsPackage.REQUIREMENT__SOURCE_REQUIREMENTS:
				return getSourceRequirements();
			case RequirementsPackage.REQUIREMENT__SUB_REQUIREMENTS:
				return getSubRequirements();
			case RequirementsPackage.REQUIREMENT__VERIFICATION_METHODS:
				return getVerificationMethods();
			case RequirementsPackage.REQUIREMENT__ACTIVE_ASSIGNMENTS:
				return getActiveAssignments();
			case RequirementsPackage.REQUIREMENT__ASSIGNED_ENTITIES:
				return getAssignedEntities();
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
			case RequirementsPackage.REQUIREMENT__ARCHIVE_DESCRIPTION:
				setArchiveDescription((String)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__VERSION_ARCHIVE:
				setVersionArchive((VersionArchive)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__NULL_VARIANT:
				setNullVariant((Boolean)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__COMPLETE:
				setComplete((Boolean)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__ACTIVE_VARIATIONS:
				getActiveVariations().clear();
				getActiveVariations().addAll((Collection<? extends Variation>)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__ACTIVE_SELECTIONS:
				getActiveSelections().clear();
				getActiveSelections().addAll((Collection<? extends Selection>)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__ACTIVE_EXCLUSIONS:
				getActiveExclusions().clear();
				getActiveExclusions().addAll((Collection<? extends Exclusion>)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__PASSIVE_VARIATION:
				setPassiveVariation((Variation)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__PASSIVE_SELECTIONS:
				getPassiveSelections().clear();
				getPassiveSelections().addAll((Collection<? extends Selection>)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__PASSIVE_EXCLUSIONS:
				getPassiveExclusions().clear();
				getPassiveExclusions().addAll((Collection<? extends Exclusion>)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__SELECTION_CRITERION:
				setSelectionCriterion((String)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__VALIDATORS:
				getValidators().clear();
				getValidators().addAll((Collection<? extends VVCase>)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__IDENTIFIER:
				setIdentifier((String)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__EXTERNAL_DESCRIPTIONS:
				getExternalDescriptions().clear();
				getExternalDescriptions().addAll((Collection<? extends RequirementDescription>)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__STATUS:
				setStatus((String)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__MATURITY:
				setMaturity((String)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__ACCEPTANCE_CRITERION:
				setAcceptanceCriterion((String)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__CRITICALITY:
				setCriticality((String)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__ACTIVE_TRACES:
				getActiveTraces().clear();
				getActiveTraces().addAll((Collection<? extends Trace>)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__PASSIVE_TRACES:
				getPassiveTraces().clear();
				getPassiveTraces().addAll((Collection<? extends Trace>)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__SUB_REQUIREMENTS:
				getSubRequirements().clear();
				getSubRequirements().addAll((Collection<? extends Requirement>)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__VERIFICATION_METHODS:
				getVerificationMethods().clear();
				getVerificationMethods().addAll((Collection<? extends VerificationMethod>)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__ACTIVE_ASSIGNMENTS:
				getActiveAssignments().clear();
				getActiveAssignments().addAll((Collection<? extends Assignment>)newValue);
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
			case RequirementsPackage.REQUIREMENT__ARCHIVE_DESCRIPTION:
				setArchiveDescription(ARCHIVE_DESCRIPTION_EDEFAULT);
				return;
			case RequirementsPackage.REQUIREMENT__VERSION_ARCHIVE:
				setVersionArchive((VersionArchive)null);
				return;
			case RequirementsPackage.REQUIREMENT__NULL_VARIANT:
				setNullVariant(NULL_VARIANT_EDEFAULT);
				return;
			case RequirementsPackage.REQUIREMENT__COMPLETE:
				setComplete(COMPLETE_EDEFAULT);
				return;
			case RequirementsPackage.REQUIREMENT__ACTIVE_VARIATIONS:
				getActiveVariations().clear();
				return;
			case RequirementsPackage.REQUIREMENT__ACTIVE_SELECTIONS:
				getActiveSelections().clear();
				return;
			case RequirementsPackage.REQUIREMENT__ACTIVE_EXCLUSIONS:
				getActiveExclusions().clear();
				return;
			case RequirementsPackage.REQUIREMENT__PASSIVE_VARIATION:
				setPassiveVariation((Variation)null);
				return;
			case RequirementsPackage.REQUIREMENT__PASSIVE_SELECTIONS:
				getPassiveSelections().clear();
				return;
			case RequirementsPackage.REQUIREMENT__PASSIVE_EXCLUSIONS:
				getPassiveExclusions().clear();
				return;
			case RequirementsPackage.REQUIREMENT__SELECTION_CRITERION:
				setSelectionCriterion(SELECTION_CRITERION_EDEFAULT);
				return;
			case RequirementsPackage.REQUIREMENT__VALIDATORS:
				getValidators().clear();
				return;
			case RequirementsPackage.REQUIREMENT__IDENTIFIER:
				setIdentifier(IDENTIFIER_EDEFAULT);
				return;
			case RequirementsPackage.REQUIREMENT__EXTERNAL_DESCRIPTIONS:
				getExternalDescriptions().clear();
				return;
			case RequirementsPackage.REQUIREMENT__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case RequirementsPackage.REQUIREMENT__MATURITY:
				setMaturity(MATURITY_EDEFAULT);
				return;
			case RequirementsPackage.REQUIREMENT__ACCEPTANCE_CRITERION:
				setAcceptanceCriterion(ACCEPTANCE_CRITERION_EDEFAULT);
				return;
			case RequirementsPackage.REQUIREMENT__CRITICALITY:
				setCriticality(CRITICALITY_EDEFAULT);
				return;
			case RequirementsPackage.REQUIREMENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case RequirementsPackage.REQUIREMENT__ACTIVE_TRACES:
				getActiveTraces().clear();
				return;
			case RequirementsPackage.REQUIREMENT__PASSIVE_TRACES:
				getPassiveTraces().clear();
				return;
			case RequirementsPackage.REQUIREMENT__SUB_REQUIREMENTS:
				getSubRequirements().clear();
				return;
			case RequirementsPackage.REQUIREMENT__VERIFICATION_METHODS:
				getVerificationMethods().clear();
				return;
			case RequirementsPackage.REQUIREMENT__ACTIVE_ASSIGNMENTS:
				getActiveAssignments().clear();
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
			case RequirementsPackage.REQUIREMENT__ARCHIVE_DESCRIPTION:
				return ARCHIVE_DESCRIPTION_EDEFAULT == null ? archiveDescription != null : !ARCHIVE_DESCRIPTION_EDEFAULT.equals(archiveDescription);
			case RequirementsPackage.REQUIREMENT__VERSION_ARCHIVE:
				return versionArchive != null;
			case RequirementsPackage.REQUIREMENT__NULL_VARIANT:
				return nullVariant != NULL_VARIANT_EDEFAULT;
			case RequirementsPackage.REQUIREMENT__COMPLETE:
				return complete != COMPLETE_EDEFAULT;
			case RequirementsPackage.REQUIREMENT__ACTIVE_VARIATIONS:
				return activeVariations != null && !activeVariations.isEmpty();
			case RequirementsPackage.REQUIREMENT__ACTIVE_SELECTIONS:
				return activeSelections != null && !activeSelections.isEmpty();
			case RequirementsPackage.REQUIREMENT__ACTIVE_EXCLUSIONS:
				return activeExclusions != null && !activeExclusions.isEmpty();
			case RequirementsPackage.REQUIREMENT__PASSIVE_VARIATION:
				return passiveVariation != null;
			case RequirementsPackage.REQUIREMENT__PASSIVE_SELECTIONS:
				return passiveSelections != null && !passiveSelections.isEmpty();
			case RequirementsPackage.REQUIREMENT__PASSIVE_EXCLUSIONS:
				return passiveExclusions != null && !passiveExclusions.isEmpty();
			case RequirementsPackage.REQUIREMENT__VARIATION_POINT:
				return basicGetVariationPoint() != null;
			case RequirementsPackage.REQUIREMENT__VARIANTS:
				return !getVariants().isEmpty();
			case RequirementsPackage.REQUIREMENT__SELECTORS:
				return !getSelectors().isEmpty();
			case RequirementsPackage.REQUIREMENT__SELECTED:
				return !getSelected().isEmpty();
			case RequirementsPackage.REQUIREMENT__EXCLUDERS:
				return !getExcluders().isEmpty();
			case RequirementsPackage.REQUIREMENT__EXCLUDED:
				return !getExcluded().isEmpty();
			case RequirementsPackage.REQUIREMENT__SELECTION_CRITERION:
				return SELECTION_CRITERION_EDEFAULT == null ? selectionCriterion != null : !SELECTION_CRITERION_EDEFAULT.equals(selectionCriterion);
			case RequirementsPackage.REQUIREMENT__VALIDATORS:
				return validators != null && !validators.isEmpty();
			case RequirementsPackage.REQUIREMENT__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
			case RequirementsPackage.REQUIREMENT__EXTERNAL_DESCRIPTIONS:
				return externalDescriptions != null && !externalDescriptions.isEmpty();
			case RequirementsPackage.REQUIREMENT__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
			case RequirementsPackage.REQUIREMENT__MATURITY:
				return MATURITY_EDEFAULT == null ? maturity != null : !MATURITY_EDEFAULT.equals(maturity);
			case RequirementsPackage.REQUIREMENT__ACCEPTANCE_CRITERION:
				return ACCEPTANCE_CRITERION_EDEFAULT == null ? acceptanceCriterion != null : !ACCEPTANCE_CRITERION_EDEFAULT.equals(acceptanceCriterion);
			case RequirementsPackage.REQUIREMENT__CRITICALITY:
				return CRITICALITY_EDEFAULT == null ? criticality != null : !CRITICALITY_EDEFAULT.equals(criticality);
			case RequirementsPackage.REQUIREMENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case RequirementsPackage.REQUIREMENT__ACTIVE_TRACES:
				return activeTraces != null && !activeTraces.isEmpty();
			case RequirementsPackage.REQUIREMENT__PASSIVE_TRACES:
				return passiveTraces != null && !passiveTraces.isEmpty();
			case RequirementsPackage.REQUIREMENT__DERIVED_REQUIREMENTS:
				return !getDerivedRequirements().isEmpty();
			case RequirementsPackage.REQUIREMENT__SOURCE_REQUIREMENTS:
				return !getSourceRequirements().isEmpty();
			case RequirementsPackage.REQUIREMENT__SUB_REQUIREMENTS:
				return subRequirements != null && !subRequirements.isEmpty();
			case RequirementsPackage.REQUIREMENT__VERIFICATION_METHODS:
				return verificationMethods != null && !verificationMethods.isEmpty();
			case RequirementsPackage.REQUIREMENT__ACTIVE_ASSIGNMENTS:
				return activeAssignments != null && !activeAssignments.isEmpty();
			case RequirementsPackage.REQUIREMENT__ASSIGNED_ENTITIES:
				return !getAssignedEntities().isEmpty();
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
		if (baseClass == ArchivedEntity.class) {
			switch (derivedFeatureID) {
				case RequirementsPackage.REQUIREMENT__ARCHIVE_DESCRIPTION: return SupportPackage.ARCHIVED_ENTITY__ARCHIVE_DESCRIPTION;
				case RequirementsPackage.REQUIREMENT__VERSION_ARCHIVE: return SupportPackage.ARCHIVED_ENTITY__VERSION_ARCHIVE;
				default: return -1;
			}
		}
		if (baseClass == VariantEntity.class) {
			switch (derivedFeatureID) {
				case RequirementsPackage.REQUIREMENT__NULL_VARIANT: return Variant_handlingPackage.VARIANT_ENTITY__NULL_VARIANT;
				case RequirementsPackage.REQUIREMENT__COMPLETE: return Variant_handlingPackage.VARIANT_ENTITY__COMPLETE;
				case RequirementsPackage.REQUIREMENT__ACTIVE_VARIATIONS: return Variant_handlingPackage.VARIANT_ENTITY__ACTIVE_VARIATIONS;
				case RequirementsPackage.REQUIREMENT__ACTIVE_SELECTIONS: return Variant_handlingPackage.VARIANT_ENTITY__ACTIVE_SELECTIONS;
				case RequirementsPackage.REQUIREMENT__ACTIVE_EXCLUSIONS: return Variant_handlingPackage.VARIANT_ENTITY__ACTIVE_EXCLUSIONS;
				case RequirementsPackage.REQUIREMENT__PASSIVE_VARIATION: return Variant_handlingPackage.VARIANT_ENTITY__PASSIVE_VARIATION;
				case RequirementsPackage.REQUIREMENT__PASSIVE_SELECTIONS: return Variant_handlingPackage.VARIANT_ENTITY__PASSIVE_SELECTIONS;
				case RequirementsPackage.REQUIREMENT__PASSIVE_EXCLUSIONS: return Variant_handlingPackage.VARIANT_ENTITY__PASSIVE_EXCLUSIONS;
				case RequirementsPackage.REQUIREMENT__VARIATION_POINT: return Variant_handlingPackage.VARIANT_ENTITY__VARIATION_POINT;
				case RequirementsPackage.REQUIREMENT__VARIANTS: return Variant_handlingPackage.VARIANT_ENTITY__VARIANTS;
				case RequirementsPackage.REQUIREMENT__SELECTORS: return Variant_handlingPackage.VARIANT_ENTITY__SELECTORS;
				case RequirementsPackage.REQUIREMENT__SELECTED: return Variant_handlingPackage.VARIANT_ENTITY__SELECTED;
				case RequirementsPackage.REQUIREMENT__EXCLUDERS: return Variant_handlingPackage.VARIANT_ENTITY__EXCLUDERS;
				case RequirementsPackage.REQUIREMENT__EXCLUDED: return Variant_handlingPackage.VARIANT_ENTITY__EXCLUDED;
				case RequirementsPackage.REQUIREMENT__SELECTION_CRITERION: return Variant_handlingPackage.VARIANT_ENTITY__SELECTION_CRITERION;
				default: return -1;
			}
		}
		if (baseClass == ValidatedEntity.class) {
			switch (derivedFeatureID) {
				case RequirementsPackage.REQUIREMENT__VALIDATORS: return Verification_validationPackage.VALIDATED_ENTITY__VALIDATORS;
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
		if (baseClass == ArchivedEntity.class) {
			switch (baseFeatureID) {
				case SupportPackage.ARCHIVED_ENTITY__ARCHIVE_DESCRIPTION: return RequirementsPackage.REQUIREMENT__ARCHIVE_DESCRIPTION;
				case SupportPackage.ARCHIVED_ENTITY__VERSION_ARCHIVE: return RequirementsPackage.REQUIREMENT__VERSION_ARCHIVE;
				default: return -1;
			}
		}
		if (baseClass == VariantEntity.class) {
			switch (baseFeatureID) {
				case Variant_handlingPackage.VARIANT_ENTITY__NULL_VARIANT: return RequirementsPackage.REQUIREMENT__NULL_VARIANT;
				case Variant_handlingPackage.VARIANT_ENTITY__COMPLETE: return RequirementsPackage.REQUIREMENT__COMPLETE;
				case Variant_handlingPackage.VARIANT_ENTITY__ACTIVE_VARIATIONS: return RequirementsPackage.REQUIREMENT__ACTIVE_VARIATIONS;
				case Variant_handlingPackage.VARIANT_ENTITY__ACTIVE_SELECTIONS: return RequirementsPackage.REQUIREMENT__ACTIVE_SELECTIONS;
				case Variant_handlingPackage.VARIANT_ENTITY__ACTIVE_EXCLUSIONS: return RequirementsPackage.REQUIREMENT__ACTIVE_EXCLUSIONS;
				case Variant_handlingPackage.VARIANT_ENTITY__PASSIVE_VARIATION: return RequirementsPackage.REQUIREMENT__PASSIVE_VARIATION;
				case Variant_handlingPackage.VARIANT_ENTITY__PASSIVE_SELECTIONS: return RequirementsPackage.REQUIREMENT__PASSIVE_SELECTIONS;
				case Variant_handlingPackage.VARIANT_ENTITY__PASSIVE_EXCLUSIONS: return RequirementsPackage.REQUIREMENT__PASSIVE_EXCLUSIONS;
				case Variant_handlingPackage.VARIANT_ENTITY__VARIATION_POINT: return RequirementsPackage.REQUIREMENT__VARIATION_POINT;
				case Variant_handlingPackage.VARIANT_ENTITY__VARIANTS: return RequirementsPackage.REQUIREMENT__VARIANTS;
				case Variant_handlingPackage.VARIANT_ENTITY__SELECTORS: return RequirementsPackage.REQUIREMENT__SELECTORS;
				case Variant_handlingPackage.VARIANT_ENTITY__SELECTED: return RequirementsPackage.REQUIREMENT__SELECTED;
				case Variant_handlingPackage.VARIANT_ENTITY__EXCLUDERS: return RequirementsPackage.REQUIREMENT__EXCLUDERS;
				case Variant_handlingPackage.VARIANT_ENTITY__EXCLUDED: return RequirementsPackage.REQUIREMENT__EXCLUDED;
				case Variant_handlingPackage.VARIANT_ENTITY__SELECTION_CRITERION: return RequirementsPackage.REQUIREMENT__SELECTION_CRITERION;
				default: return -1;
			}
		}
		if (baseClass == ValidatedEntity.class) {
			switch (baseFeatureID) {
				case Verification_validationPackage.VALIDATED_ENTITY__VALIDATORS: return RequirementsPackage.REQUIREMENT__VALIDATORS;
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
		result.append(", identifier: ");
		result.append(identifier);
		result.append(", status: ");
		result.append(status);
		result.append(", maturity: ");
		result.append(maturity);
		result.append(", acceptanceCriterion: ");
		result.append(acceptanceCriterion);
		result.append(", criticality: ");
		result.append(criticality);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //RequirementImpl
