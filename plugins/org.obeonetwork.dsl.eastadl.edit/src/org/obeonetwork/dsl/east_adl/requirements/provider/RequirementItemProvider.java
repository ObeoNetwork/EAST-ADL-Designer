/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.requirements.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.obeonetwork.dsl.east_adl.core.provider.EASTADLNamedElementItemProvider;

import org.obeonetwork.dsl.east_adl.provider.East_adlEditPlugin;

import org.obeonetwork.dsl.east_adl.requirements.Requirement;
import org.obeonetwork.dsl.east_adl.requirements.RequirementsFactory;
import org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage;

import org.obeonetwork.dsl.east_adl.support.SupportPackage;

import org.obeonetwork.dsl.east_adl.variant_handling.Variant_handlingFactory;
import org.obeonetwork.dsl.east_adl.variant_handling.Variant_handlingPackage;

import org.obeonetwork.dsl.east_adl.verification_validation.Verification_validationPackage;

/**
 * This is the item provider adapter for a {@link org.obeonetwork.dsl.east_adl.requirements.Requirement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RequirementItemProvider
	extends EASTADLNamedElementItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addArchiveDescriptionPropertyDescriptor(object);
			addVersionArchivePropertyDescriptor(object);
			addNullVariantPropertyDescriptor(object);
			addCompletePropertyDescriptor(object);
			addPassiveVariationPropertyDescriptor(object);
			addPassiveSelectionsPropertyDescriptor(object);
			addPassiveExclusionsPropertyDescriptor(object);
			addVariationPointPropertyDescriptor(object);
			addVariantsPropertyDescriptor(object);
			addSelectorsPropertyDescriptor(object);
			addSelectedPropertyDescriptor(object);
			addExcludersPropertyDescriptor(object);
			addExcludedPropertyDescriptor(object);
			addSelectionCriterionPropertyDescriptor(object);
			addValidatorsPropertyDescriptor(object);
			addIdentifierPropertyDescriptor(object);
			addStatusPropertyDescriptor(object);
			addMaturityPropertyDescriptor(object);
			addAcceptanceCriterionPropertyDescriptor(object);
			addCriticalityPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addPassiveTracesPropertyDescriptor(object);
			addDerivedRequirementsPropertyDescriptor(object);
			addSourceRequirementsPropertyDescriptor(object);
			addAssignedEntitiesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Archive Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArchiveDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArchivedEntity_archiveDescription_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArchivedEntity_archiveDescription_feature", "_UI_ArchivedEntity_type"),
				 SupportPackage.Literals.ARCHIVED_ENTITY__ARCHIVE_DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Version Archive feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionArchivePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArchivedEntity_versionArchive_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArchivedEntity_versionArchive_feature", "_UI_ArchivedEntity_type"),
				 SupportPackage.Literals.ARCHIVED_ENTITY__VERSION_ARCHIVE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Null Variant feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNullVariantPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VariantEntity_nullVariant_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VariantEntity_nullVariant_feature", "_UI_VariantEntity_type"),
				 Variant_handlingPackage.Literals.VARIANT_ENTITY__NULL_VARIANT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Complete feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCompletePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VariantEntity_complete_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VariantEntity_complete_feature", "_UI_VariantEntity_type"),
				 Variant_handlingPackage.Literals.VARIANT_ENTITY__COMPLETE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Passive Variation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPassiveVariationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VariantEntity_passiveVariation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VariantEntity_passiveVariation_feature", "_UI_VariantEntity_type"),
				 Variant_handlingPackage.Literals.VARIANT_ENTITY__PASSIVE_VARIATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Passive Selections feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPassiveSelectionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VariantEntity_passiveSelections_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VariantEntity_passiveSelections_feature", "_UI_VariantEntity_type"),
				 Variant_handlingPackage.Literals.VARIANT_ENTITY__PASSIVE_SELECTIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Passive Exclusions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPassiveExclusionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VariantEntity_passiveExclusions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VariantEntity_passiveExclusions_feature", "_UI_VariantEntity_type"),
				 Variant_handlingPackage.Literals.VARIANT_ENTITY__PASSIVE_EXCLUSIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Variation Point feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVariationPointPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VariantEntity_variationPoint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VariantEntity_variationPoint_feature", "_UI_VariantEntity_type"),
				 Variant_handlingPackage.Literals.VARIANT_ENTITY__VARIATION_POINT,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Variants feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVariantsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VariantEntity_variants_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VariantEntity_variants_feature", "_UI_VariantEntity_type"),
				 Variant_handlingPackage.Literals.VARIANT_ENTITY__VARIANTS,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Selectors feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSelectorsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VariantEntity_selectors_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VariantEntity_selectors_feature", "_UI_VariantEntity_type"),
				 Variant_handlingPackage.Literals.VARIANT_ENTITY__SELECTORS,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Selected feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSelectedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VariantEntity_selected_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VariantEntity_selected_feature", "_UI_VariantEntity_type"),
				 Variant_handlingPackage.Literals.VARIANT_ENTITY__SELECTED,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Excluders feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExcludersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VariantEntity_excluders_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VariantEntity_excluders_feature", "_UI_VariantEntity_type"),
				 Variant_handlingPackage.Literals.VARIANT_ENTITY__EXCLUDERS,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Excluded feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExcludedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VariantEntity_excluded_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VariantEntity_excluded_feature", "_UI_VariantEntity_type"),
				 Variant_handlingPackage.Literals.VARIANT_ENTITY__EXCLUDED,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Selection Criterion feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSelectionCriterionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VariantEntity_selectionCriterion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VariantEntity_selectionCriterion_feature", "_UI_VariantEntity_type"),
				 Variant_handlingPackage.Literals.VARIANT_ENTITY__SELECTION_CRITERION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Validators feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValidatorsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ValidatedEntity_validators_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ValidatedEntity_validators_feature", "_UI_ValidatedEntity_type"),
				 Verification_validationPackage.Literals.VALIDATED_ENTITY__VALIDATORS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Identifier feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdentifierPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Requirement_identifier_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Requirement_identifier_feature", "_UI_Requirement_type"),
				 RequirementsPackage.Literals.REQUIREMENT__IDENTIFIER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Requirement_status_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Requirement_status_feature", "_UI_Requirement_type"),
				 RequirementsPackage.Literals.REQUIREMENT__STATUS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Maturity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaturityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Requirement_maturity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Requirement_maturity_feature", "_UI_Requirement_type"),
				 RequirementsPackage.Literals.REQUIREMENT__MATURITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Acceptance Criterion feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAcceptanceCriterionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Requirement_acceptanceCriterion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Requirement_acceptanceCriterion_feature", "_UI_Requirement_type"),
				 RequirementsPackage.Literals.REQUIREMENT__ACCEPTANCE_CRITERION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Criticality feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCriticalityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Requirement_criticality_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Requirement_criticality_feature", "_UI_Requirement_type"),
				 RequirementsPackage.Literals.REQUIREMENT__CRITICALITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Requirement_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Requirement_description_feature", "_UI_Requirement_type"),
				 RequirementsPackage.Literals.REQUIREMENT__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Passive Traces feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPassiveTracesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Requirement_passiveTraces_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Requirement_passiveTraces_feature", "_UI_Requirement_type"),
				 RequirementsPackage.Literals.REQUIREMENT__PASSIVE_TRACES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Derived Requirements feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDerivedRequirementsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Requirement_derivedRequirements_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Requirement_derivedRequirements_feature", "_UI_Requirement_type"),
				 RequirementsPackage.Literals.REQUIREMENT__DERIVED_REQUIREMENTS,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Source Requirements feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceRequirementsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Requirement_sourceRequirements_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Requirement_sourceRequirements_feature", "_UI_Requirement_type"),
				 RequirementsPackage.Literals.REQUIREMENT__SOURCE_REQUIREMENTS,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Assigned Entities feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAssignedEntitiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Requirement_assignedEntities_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Requirement_assignedEntities_feature", "_UI_Requirement_type"),
				 RequirementsPackage.Literals.REQUIREMENT__ASSIGNED_ENTITIES,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(Variant_handlingPackage.Literals.VARIANT_ENTITY__ACTIVE_VARIATIONS);
			childrenFeatures.add(Variant_handlingPackage.Literals.VARIANT_ENTITY__ACTIVE_SELECTIONS);
			childrenFeatures.add(Variant_handlingPackage.Literals.VARIANT_ENTITY__ACTIVE_EXCLUSIONS);
			childrenFeatures.add(RequirementsPackage.Literals.REQUIREMENT__EXTERNAL_DESCRIPTIONS);
			childrenFeatures.add(RequirementsPackage.Literals.REQUIREMENT__ACTIVE_TRACES);
			childrenFeatures.add(RequirementsPackage.Literals.REQUIREMENT__SUB_REQUIREMENTS);
			childrenFeatures.add(RequirementsPackage.Literals.REQUIREMENT__VERIFICATION_METHODS);
			childrenFeatures.add(RequirementsPackage.Literals.REQUIREMENT__ACTIVE_ASSIGNMENTS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Requirement)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Requirement_type") :
			getString("_UI_Requirement_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Requirement.class)) {
			case RequirementsPackage.REQUIREMENT__ARCHIVE_DESCRIPTION:
			case RequirementsPackage.REQUIREMENT__NULL_VARIANT:
			case RequirementsPackage.REQUIREMENT__COMPLETE:
			case RequirementsPackage.REQUIREMENT__SELECTION_CRITERION:
			case RequirementsPackage.REQUIREMENT__IDENTIFIER:
			case RequirementsPackage.REQUIREMENT__STATUS:
			case RequirementsPackage.REQUIREMENT__MATURITY:
			case RequirementsPackage.REQUIREMENT__ACCEPTANCE_CRITERION:
			case RequirementsPackage.REQUIREMENT__CRITICALITY:
			case RequirementsPackage.REQUIREMENT__DESCRIPTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case RequirementsPackage.REQUIREMENT__ACTIVE_VARIATIONS:
			case RequirementsPackage.REQUIREMENT__ACTIVE_SELECTIONS:
			case RequirementsPackage.REQUIREMENT__ACTIVE_EXCLUSIONS:
			case RequirementsPackage.REQUIREMENT__EXTERNAL_DESCRIPTIONS:
			case RequirementsPackage.REQUIREMENT__ACTIVE_TRACES:
			case RequirementsPackage.REQUIREMENT__SUB_REQUIREMENTS:
			case RequirementsPackage.REQUIREMENT__VERIFICATION_METHODS:
			case RequirementsPackage.REQUIREMENT__ACTIVE_ASSIGNMENTS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(Variant_handlingPackage.Literals.VARIANT_ENTITY__ACTIVE_VARIATIONS,
				 Variant_handlingFactory.eINSTANCE.createVariation()));

		newChildDescriptors.add
			(createChildParameter
				(Variant_handlingPackage.Literals.VARIANT_ENTITY__ACTIVE_SELECTIONS,
				 Variant_handlingFactory.eINSTANCE.createSelection()));

		newChildDescriptors.add
			(createChildParameter
				(Variant_handlingPackage.Literals.VARIANT_ENTITY__ACTIVE_EXCLUSIONS,
				 Variant_handlingFactory.eINSTANCE.createExclusion()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.REQUIREMENT__EXTERNAL_DESCRIPTIONS,
				 RequirementsFactory.eINSTANCE.createRequirementDescription()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.REQUIREMENT__ACTIVE_TRACES,
				 RequirementsFactory.eINSTANCE.createTrace()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.REQUIREMENT__SUB_REQUIREMENTS,
				 RequirementsFactory.eINSTANCE.createFunctionalRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.REQUIREMENT__SUB_REQUIREMENTS,
				 RequirementsFactory.eINSTANCE.createDesignConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.REQUIREMENT__SUB_REQUIREMENTS,
				 RequirementsFactory.eINSTANCE.createQualityRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.REQUIREMENT__SUB_REQUIREMENTS,
				 RequirementsFactory.eINSTANCE.createEndToEndDelay()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.REQUIREMENT__SUB_REQUIREMENTS,
				 RequirementsFactory.eINSTANCE.createPeriodRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.REQUIREMENT__VERIFICATION_METHODS,
				 RequirementsFactory.eINSTANCE.createVerificationMethod()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.REQUIREMENT__ACTIVE_ASSIGNMENTS,
				 RequirementsFactory.eINSTANCE.createAssignment()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return East_adlEditPlugin.INSTANCE;
	}

}
