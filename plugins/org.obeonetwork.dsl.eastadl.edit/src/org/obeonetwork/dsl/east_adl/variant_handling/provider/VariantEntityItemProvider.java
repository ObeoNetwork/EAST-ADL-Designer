/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.variant_handling.provider;


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
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.obeonetwork.dsl.east_adl.provider.East_adlEditPlugin;

import org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity;
import org.obeonetwork.dsl.east_adl.variant_handling.Variant_handlingFactory;
import org.obeonetwork.dsl.east_adl.variant_handling.Variant_handlingPackage;

/**
 * This is the item provider adapter for a {@link org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VariantEntityItemProvider
	extends ItemProviderAdapter
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
	public VariantEntityItemProvider(AdapterFactory adapterFactory) {
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
		}
		return itemPropertyDescriptors;
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
		VariantEntity variantEntity = (VariantEntity)object;
		return getString("_UI_VariantEntity_type") + " " + variantEntity.isNullVariant();
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

		switch (notification.getFeatureID(VariantEntity.class)) {
			case Variant_handlingPackage.VARIANT_ENTITY__NULL_VARIANT:
			case Variant_handlingPackage.VARIANT_ENTITY__COMPLETE:
			case Variant_handlingPackage.VARIANT_ENTITY__SELECTION_CRITERION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case Variant_handlingPackage.VARIANT_ENTITY__ACTIVE_VARIATIONS:
			case Variant_handlingPackage.VARIANT_ENTITY__ACTIVE_SELECTIONS:
			case Variant_handlingPackage.VARIANT_ENTITY__ACTIVE_EXCLUSIONS:
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
