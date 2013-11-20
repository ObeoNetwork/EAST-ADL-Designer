/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.provider;


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

import org.obeonetwork.dsl.east_adl.core.provider.EASTADLEntityItemProvider;

import org.obeonetwork.dsl.east_adl.provider.East_adlEditPlugin;

import org.obeonetwork.dsl.east_adl.structure.common.CommonFactory;
import org.obeonetwork.dsl.east_adl.structure.common.CommonPackage;

import org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.EFeature;
import org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.Vehicle_feature_modelFactory;
import org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.Vehicle_feature_modelPackage;

import org.obeonetwork.dsl.east_adl.support.SupportPackage;

import org.obeonetwork.dsl.east_adl.variant_handling.Variant_handlingFactory;
import org.obeonetwork.dsl.east_adl.variant_handling.Variant_handlingPackage;

import org.obeonetwork.dsl.east_adl.verification_validation.Verification_validationPackage;

/**
 * This is the item provider adapter for a {@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.EFeature} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EFeatureItemProvider
	extends EASTADLEntityItemProvider
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
	public EFeatureItemProvider(AdapterFactory adapterFactory) {
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

			addPassiveRealizationsPropertyDescriptor(object);
			addRealizedByPropertyDescriptor(object);
			addAllocationTargetPropertyDescriptor(object);
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
			addOptionalPropertyDescriptor(object);
			addVisibleByCustomerPropertyDescriptor(object);
			addPassiveSpecificationsPropertyDescriptor(object);
			addPassiveConstraintsPropertyDescriptor(object);
			addSpecifyingFunctionalRequirementsPropertyDescriptor(object);
			addConstrainingDesignConstraintsPropertyDescriptor(object);
			addInclusionsPropertyDescriptor(object);
			addIncludingVehicleSetsPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Passive Realizations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPassiveRealizationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RealizedEntity_passiveRealizations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RealizedEntity_passiveRealizations_feature", "_UI_RealizedEntity_type"),
				 CommonPackage.Literals.REALIZED_ENTITY__PASSIVE_REALIZATIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Realized By feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRealizedByPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RealizedEntity_realizedBy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RealizedEntity_realizedBy_feature", "_UI_RealizedEntity_type"),
				 CommonPackage.Literals.REALIZED_ENTITY__REALIZED_BY,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Allocation Target feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllocationTargetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AllocatableEntity_allocationTarget_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AllocatableEntity_allocationTarget_feature", "_UI_AllocatableEntity_type"),
				 CommonPackage.Literals.ALLOCATABLE_ENTITY__ALLOCATION_TARGET,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
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
	 * This adds a property descriptor for the Optional feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOptionalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EFeature_optional_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EFeature_optional_feature", "_UI_EFeature_type"),
				 Vehicle_feature_modelPackage.Literals.EFEATURE__OPTIONAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Visible By Customer feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVisibleByCustomerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EFeature_visibleByCustomer_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EFeature_visibleByCustomer_feature", "_UI_EFeature_type"),
				 Vehicle_feature_modelPackage.Literals.EFEATURE__VISIBLE_BY_CUSTOMER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Passive Specifications feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPassiveSpecificationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EFeature_passiveSpecifications_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EFeature_passiveSpecifications_feature", "_UI_EFeature_type"),
				 Vehicle_feature_modelPackage.Literals.EFEATURE__PASSIVE_SPECIFICATIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Passive Constraints feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPassiveConstraintsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EFeature_passiveConstraints_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EFeature_passiveConstraints_feature", "_UI_EFeature_type"),
				 Vehicle_feature_modelPackage.Literals.EFEATURE__PASSIVE_CONSTRAINTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Specifying Functional Requirements feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpecifyingFunctionalRequirementsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EFeature_specifyingFunctionalRequirements_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EFeature_specifyingFunctionalRequirements_feature", "_UI_EFeature_type"),
				 Vehicle_feature_modelPackage.Literals.EFEATURE__SPECIFYING_FUNCTIONAL_REQUIREMENTS,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constraining Design Constraints feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstrainingDesignConstraintsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EFeature_constrainingDesignConstraints_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EFeature_constrainingDesignConstraints_feature", "_UI_EFeature_type"),
				 Vehicle_feature_modelPackage.Literals.EFEATURE__CONSTRAINING_DESIGN_CONSTRAINTS,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Inclusions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInclusionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EFeature_inclusions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EFeature_inclusions_feature", "_UI_EFeature_type"),
				 Vehicle_feature_modelPackage.Literals.EFEATURE__INCLUSIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Including Vehicle Sets feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncludingVehicleSetsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EFeature_includingVehicleSets_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EFeature_includingVehicleSets_feature", "_UI_EFeature_type"),
				 Vehicle_feature_modelPackage.Literals.EFEATURE__INCLUDING_VEHICLE_SETS,
				 false,
				 false,
				 false,
				 null,
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
				 getString("_UI_EFeature_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EFeature_description_feature", "_UI_EFeature_type"),
				 Vehicle_feature_modelPackage.Literals.EFEATURE__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(CommonPackage.Literals.ALLOCATABLE_ENTITY__ALLOCATION);
			childrenFeatures.add(Variant_handlingPackage.Literals.VARIANT_ENTITY__ACTIVE_VARIATIONS);
			childrenFeatures.add(Variant_handlingPackage.Literals.VARIANT_ENTITY__ACTIVE_SELECTIONS);
			childrenFeatures.add(Variant_handlingPackage.Literals.VARIANT_ENTITY__ACTIVE_EXCLUSIONS);
			childrenFeatures.add(Vehicle_feature_modelPackage.Literals.EFEATURE__SUB_FEATURES);
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
	 * This returns EFeature.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EFeature"));
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
		String label = ((EFeature)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_EFeature_type") :
			getString("_UI_EFeature_type") + " " + label;
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

		switch (notification.getFeatureID(EFeature.class)) {
			case Vehicle_feature_modelPackage.EFEATURE__ARCHIVE_DESCRIPTION:
			case Vehicle_feature_modelPackage.EFEATURE__NULL_VARIANT:
			case Vehicle_feature_modelPackage.EFEATURE__COMPLETE:
			case Vehicle_feature_modelPackage.EFEATURE__SELECTION_CRITERION:
			case Vehicle_feature_modelPackage.EFEATURE__OPTIONAL:
			case Vehicle_feature_modelPackage.EFEATURE__VISIBLE_BY_CUSTOMER:
			case Vehicle_feature_modelPackage.EFEATURE__DESCRIPTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case Vehicle_feature_modelPackage.EFEATURE__ALLOCATION:
			case Vehicle_feature_modelPackage.EFEATURE__ACTIVE_VARIATIONS:
			case Vehicle_feature_modelPackage.EFEATURE__ACTIVE_SELECTIONS:
			case Vehicle_feature_modelPackage.EFEATURE__ACTIVE_EXCLUSIONS:
			case Vehicle_feature_modelPackage.EFEATURE__SUB_FEATURES:
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
				(CommonPackage.Literals.ALLOCATABLE_ENTITY__ALLOCATION,
				 CommonFactory.eINSTANCE.createAllocationConstraint()));

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
				(Vehicle_feature_modelPackage.Literals.EFEATURE__SUB_FEATURES,
				 Vehicle_feature_modelFactory.eINSTANCE.createEFeature()));
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
