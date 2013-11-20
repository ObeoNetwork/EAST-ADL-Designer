/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.provider;


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

import org.obeonetwork.dsl.east_adl.behavior.BehaviorFactory;

import org.obeonetwork.dsl.east_adl.core.provider.EASTADLEntityItemProvider;

import org.obeonetwork.dsl.east_adl.provider.East_adlEditPlugin;

import org.obeonetwork.dsl.east_adl.requirements.RequirementsFactory;

import org.obeonetwork.dsl.east_adl.structure.common.CommonFactory;
import org.obeonetwork.dsl.east_adl.structure.common.CommonPackage;

import org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction;
import org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Functional_design_architectureFactory;
import org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Functional_design_architecturePackage;

import org.obeonetwork.dsl.east_adl.structure.platform_model.Platform_modelFactory;

import org.obeonetwork.dsl.east_adl.variant_handling.Variant_handlingFactory;
import org.obeonetwork.dsl.east_adl.variant_handling.Variant_handlingPackage;

import org.obeonetwork.dsl.east_adl.verification_validation.Verification_validationPackage;

/**
 * This is the item provider adapter for a {@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ElementarySoftwareFunctionItemProvider
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
	public ElementarySoftwareFunctionItemProvider(AdapterFactory adapterFactory) {
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

			addRealizesPropertyDescriptor(object);
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
			addInstancesPropertyDescriptor(object);
			addTriggerTypePropertyDescriptor(object);
			addTriggerEventPropertyDescriptor(object);
			addTriggerConditionPropertyDescriptor(object);
			addPassivePrecedenciesPropertyDescriptor(object);
			addPredecessorsPropertyDescriptor(object);
			addSuccessorsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Realizes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRealizesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RealizingEntity_realizes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RealizingEntity_realizes_feature", "_UI_RealizingEntity_type"),
				 CommonPackage.Literals.REALIZING_ENTITY__REALIZES,
				 false,
				 false,
				 false,
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
	 * This adds a property descriptor for the Instances feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInstancesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ElementarySoftwareFunction_instances_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ElementarySoftwareFunction_instances_feature", "_UI_ElementarySoftwareFunction_type"),
				 Functional_design_architecturePackage.Literals.ELEMENTARY_SOFTWARE_FUNCTION__INSTANCES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Trigger Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTriggerTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ElementarySoftwareFunction_triggerType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ElementarySoftwareFunction_triggerType_feature", "_UI_ElementarySoftwareFunction_type"),
				 Functional_design_architecturePackage.Literals.ELEMENTARY_SOFTWARE_FUNCTION__TRIGGER_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Trigger Event feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTriggerEventPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ElementarySoftwareFunction_triggerEvent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ElementarySoftwareFunction_triggerEvent_feature", "_UI_ElementarySoftwareFunction_type"),
				 Functional_design_architecturePackage.Literals.ELEMENTARY_SOFTWARE_FUNCTION__TRIGGER_EVENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Trigger Condition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTriggerConditionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ElementarySoftwareFunction_triggerCondition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ElementarySoftwareFunction_triggerCondition_feature", "_UI_ElementarySoftwareFunction_type"),
				 Functional_design_architecturePackage.Literals.ELEMENTARY_SOFTWARE_FUNCTION__TRIGGER_CONDITION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Passive Precedencies feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPassivePrecedenciesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ElementarySoftwareFunction_passivePrecedencies_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ElementarySoftwareFunction_passivePrecedencies_feature", "_UI_ElementarySoftwareFunction_type"),
				 Functional_design_architecturePackage.Literals.ELEMENTARY_SOFTWARE_FUNCTION__PASSIVE_PRECEDENCIES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Predecessors feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPredecessorsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ElementarySoftwareFunction_predecessors_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ElementarySoftwareFunction_predecessors_feature", "_UI_ElementarySoftwareFunction_type"),
				 Functional_design_architecturePackage.Literals.ELEMENTARY_SOFTWARE_FUNCTION__PREDECESSORS,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Successors feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSuccessorsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ElementarySoftwareFunction_successors_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ElementarySoftwareFunction_successors_feature", "_UI_ElementarySoftwareFunction_type"),
				 Functional_design_architecturePackage.Literals.ELEMENTARY_SOFTWARE_FUNCTION__SUCCESSORS,
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
			childrenFeatures.add(CommonPackage.Literals.REALIZING_ENTITY__ACTIVE_REALIZATIONS);
			childrenFeatures.add(Variant_handlingPackage.Literals.VARIANT_ENTITY__ACTIVE_VARIATIONS);
			childrenFeatures.add(Variant_handlingPackage.Literals.VARIANT_ENTITY__ACTIVE_SELECTIONS);
			childrenFeatures.add(Variant_handlingPackage.Literals.VARIANT_ENTITY__ACTIVE_EXCLUSIONS);
			childrenFeatures.add(Functional_design_architecturePackage.Literals.ELEMENTARY_SOFTWARE_FUNCTION__PORTS);
			childrenFeatures.add(Functional_design_architecturePackage.Literals.ELEMENTARY_SOFTWARE_FUNCTION__PARAMETERS);
			childrenFeatures.add(Functional_design_architecturePackage.Literals.ELEMENTARY_SOFTWARE_FUNCTION__PERIOD);
			childrenFeatures.add(Functional_design_architecturePackage.Literals.ELEMENTARY_SOFTWARE_FUNCTION__OFFSET);
			childrenFeatures.add(Functional_design_architecturePackage.Literals.ELEMENTARY_SOFTWARE_FUNCTION__EXECUTION_TIME);
			childrenFeatures.add(Functional_design_architecturePackage.Literals.ELEMENTARY_SOFTWARE_FUNCTION__SPECIFATION_BEHAVIOR);
			childrenFeatures.add(Functional_design_architecturePackage.Literals.ELEMENTARY_SOFTWARE_FUNCTION__IMPLEMENTATION_BEHAVIOR);
			childrenFeatures.add(Functional_design_architecturePackage.Literals.ELEMENTARY_SOFTWARE_FUNCTION__ACTIVE_PRECEDENCIES);
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
	 * This returns ElementarySoftwareFunction.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ElementarySoftwareFunction"));
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
		String label = ((ElementarySoftwareFunction)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ElementarySoftwareFunction_type") :
			getString("_UI_ElementarySoftwareFunction_type") + " " + label;
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

		switch (notification.getFeatureID(ElementarySoftwareFunction.class)) {
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__NULL_VARIANT:
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__COMPLETE:
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__SELECTION_CRITERION:
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__TRIGGER_TYPE:
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__TRIGGER_EVENT:
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__TRIGGER_CONDITION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__ACTIVE_REALIZATIONS:
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__ACTIVE_VARIATIONS:
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__ACTIVE_SELECTIONS:
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__ACTIVE_EXCLUSIONS:
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__PORTS:
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__PARAMETERS:
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__PERIOD:
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__OFFSET:
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__EXECUTION_TIME:
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__SPECIFATION_BEHAVIOR:
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__IMPLEMENTATION_BEHAVIOR:
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__ACTIVE_PRECEDENCIES:
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
				(CommonPackage.Literals.REALIZING_ENTITY__ACTIVE_REALIZATIONS,
				 CommonFactory.eINSTANCE.createRealization()));

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
				(Functional_design_architecturePackage.Literals.ELEMENTARY_SOFTWARE_FUNCTION__PORTS,
				 Platform_modelFactory.eINSTANCE.createSystemPort()));

		newChildDescriptors.add
			(createChildParameter
				(Functional_design_architecturePackage.Literals.ELEMENTARY_SOFTWARE_FUNCTION__PORTS,
				 Platform_modelFactory.eINSTANCE.createMWLocalPort()));

		newChildDescriptors.add
			(createChildParameter
				(Functional_design_architecturePackage.Literals.ELEMENTARY_SOFTWARE_FUNCTION__PORTS,
				 Platform_modelFactory.eINSTANCE.createMWRemotePort()));

		newChildDescriptors.add
			(createChildParameter
				(Functional_design_architecturePackage.Literals.ELEMENTARY_SOFTWARE_FUNCTION__PORTS,
				 CommonFactory.eINSTANCE.createSignalFunctionPort()));

		newChildDescriptors.add
			(createChildParameter
				(Functional_design_architecturePackage.Literals.ELEMENTARY_SOFTWARE_FUNCTION__PORTS,
				 CommonFactory.eINSTANCE.createOperationFunctionPort()));

		newChildDescriptors.add
			(createChildParameter
				(Functional_design_architecturePackage.Literals.ELEMENTARY_SOFTWARE_FUNCTION__PARAMETERS,
				 CommonFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(Functional_design_architecturePackage.Literals.ELEMENTARY_SOFTWARE_FUNCTION__PERIOD,
				 RequirementsFactory.eINSTANCE.createEndToEndDelay()));

		newChildDescriptors.add
			(createChildParameter
				(Functional_design_architecturePackage.Literals.ELEMENTARY_SOFTWARE_FUNCTION__PERIOD,
				 RequirementsFactory.eINSTANCE.createTimingRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(Functional_design_architecturePackage.Literals.ELEMENTARY_SOFTWARE_FUNCTION__PERIOD,
				 RequirementsFactory.eINSTANCE.createPeriodRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(Functional_design_architecturePackage.Literals.ELEMENTARY_SOFTWARE_FUNCTION__OFFSET,
				 RequirementsFactory.eINSTANCE.createEndToEndDelay()));

		newChildDescriptors.add
			(createChildParameter
				(Functional_design_architecturePackage.Literals.ELEMENTARY_SOFTWARE_FUNCTION__OFFSET,
				 RequirementsFactory.eINSTANCE.createTimingRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(Functional_design_architecturePackage.Literals.ELEMENTARY_SOFTWARE_FUNCTION__OFFSET,
				 RequirementsFactory.eINSTANCE.createPeriodRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(Functional_design_architecturePackage.Literals.ELEMENTARY_SOFTWARE_FUNCTION__EXECUTION_TIME,
				 RequirementsFactory.eINSTANCE.createEndToEndDelay()));

		newChildDescriptors.add
			(createChildParameter
				(Functional_design_architecturePackage.Literals.ELEMENTARY_SOFTWARE_FUNCTION__EXECUTION_TIME,
				 RequirementsFactory.eINSTANCE.createTimingRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(Functional_design_architecturePackage.Literals.ELEMENTARY_SOFTWARE_FUNCTION__EXECUTION_TIME,
				 RequirementsFactory.eINSTANCE.createPeriodRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(Functional_design_architecturePackage.Literals.ELEMENTARY_SOFTWARE_FUNCTION__SPECIFATION_BEHAVIOR,
				 BehaviorFactory.eINSTANCE.createExternalBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(Functional_design_architecturePackage.Literals.ELEMENTARY_SOFTWARE_FUNCTION__SPECIFATION_BEHAVIOR,
				 BehaviorFactory.eINSTANCE.createNativeBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(Functional_design_architecturePackage.Literals.ELEMENTARY_SOFTWARE_FUNCTION__SPECIFATION_BEHAVIOR,
				 BehaviorFactory.eINSTANCE.createComplexState()));

		newChildDescriptors.add
			(createChildParameter
				(Functional_design_architecturePackage.Literals.ELEMENTARY_SOFTWARE_FUNCTION__IMPLEMENTATION_BEHAVIOR,
				 BehaviorFactory.eINSTANCE.createExternalBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(Functional_design_architecturePackage.Literals.ELEMENTARY_SOFTWARE_FUNCTION__IMPLEMENTATION_BEHAVIOR,
				 BehaviorFactory.eINSTANCE.createNativeBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(Functional_design_architecturePackage.Literals.ELEMENTARY_SOFTWARE_FUNCTION__IMPLEMENTATION_BEHAVIOR,
				 BehaviorFactory.eINSTANCE.createComplexState()));

		newChildDescriptors.add
			(createChildParameter
				(Functional_design_architecturePackage.Literals.ELEMENTARY_SOFTWARE_FUNCTION__ACTIVE_PRECEDENCIES,
				 Functional_design_architectureFactory.eINSTANCE.createPrecedence()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == Functional_design_architecturePackage.Literals.ELEMENTARY_SOFTWARE_FUNCTION__PERIOD ||
			childFeature == Functional_design_architecturePackage.Literals.ELEMENTARY_SOFTWARE_FUNCTION__OFFSET ||
			childFeature == Functional_design_architecturePackage.Literals.ELEMENTARY_SOFTWARE_FUNCTION__EXECUTION_TIME ||
			childFeature == Functional_design_architecturePackage.Literals.ELEMENTARY_SOFTWARE_FUNCTION__SPECIFATION_BEHAVIOR ||
			childFeature == Functional_design_architecturePackage.Literals.ELEMENTARY_SOFTWARE_FUNCTION__IMPLEMENTATION_BEHAVIOR;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
