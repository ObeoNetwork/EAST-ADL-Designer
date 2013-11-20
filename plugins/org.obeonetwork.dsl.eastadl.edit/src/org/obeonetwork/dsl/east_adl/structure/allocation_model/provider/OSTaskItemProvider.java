/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.allocation_model.provider;


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

import org.obeonetwork.dsl.east_adl.requirements.RequirementsFactory;

import org.obeonetwork.dsl.east_adl.structure.allocation_model.Allocation_modelFactory;
import org.obeonetwork.dsl.east_adl.structure.allocation_model.Allocation_modelPackage;
import org.obeonetwork.dsl.east_adl.structure.allocation_model.OSTask;

/**
 * This is the item provider adapter for a {@link org.obeonetwork.dsl.east_adl.structure.allocation_model.OSTask} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OSTaskItemProvider
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
	public OSTaskItemProvider(AdapterFactory adapterFactory) {
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

			addTriggerTypePropertyDescriptor(object);
			addTriggerEventPropertyDescriptor(object);
			addPriorityPropertyDescriptor(object);
			addPreemptablePropertyDescriptor(object);
			addDeployedClustersPropertyDescriptor(object);
			addExecutingProcessorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_OSTask_triggerType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OSTask_triggerType_feature", "_UI_OSTask_type"),
				 Allocation_modelPackage.Literals.OS_TASK__TRIGGER_TYPE,
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
				 getString("_UI_OSTask_triggerEvent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OSTask_triggerEvent_feature", "_UI_OSTask_type"),
				 Allocation_modelPackage.Literals.OS_TASK__TRIGGER_EVENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Priority feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPriorityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OSTask_priority_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OSTask_priority_feature", "_UI_OSTask_type"),
				 Allocation_modelPackage.Literals.OS_TASK__PRIORITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Preemptable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPreemptablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OSTask_preemptable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OSTask_preemptable_feature", "_UI_OSTask_type"),
				 Allocation_modelPackage.Literals.OS_TASK__PREEMPTABLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Deployed Clusters feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeployedClustersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OSTask_deployedClusters_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OSTask_deployedClusters_feature", "_UI_OSTask_type"),
				 Allocation_modelPackage.Literals.OS_TASK__DEPLOYED_CLUSTERS,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Executing Processor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExecutingProcessorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OSTask_executingProcessor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OSTask_executingProcessor_feature", "_UI_OSTask_type"),
				 Allocation_modelPackage.Literals.OS_TASK__EXECUTING_PROCESSOR,
				 true,
				 false,
				 true,
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
			childrenFeatures.add(Allocation_modelPackage.Literals.OS_TASK__PERIOD);
			childrenFeatures.add(Allocation_modelPackage.Literals.OS_TASK__OFFSET);
			childrenFeatures.add(Allocation_modelPackage.Literals.OS_TASK__EXECUTION_TIME);
			childrenFeatures.add(Allocation_modelPackage.Literals.OS_TASK__DEPLOYMENTS);
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
	 * This returns OSTask.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/OSTask"));
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
		String label = ((OSTask)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_OSTask_type") :
			getString("_UI_OSTask_type") + " " + label;
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

		switch (notification.getFeatureID(OSTask.class)) {
			case Allocation_modelPackage.OS_TASK__TRIGGER_TYPE:
			case Allocation_modelPackage.OS_TASK__TRIGGER_EVENT:
			case Allocation_modelPackage.OS_TASK__PRIORITY:
			case Allocation_modelPackage.OS_TASK__PREEMPTABLE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case Allocation_modelPackage.OS_TASK__PERIOD:
			case Allocation_modelPackage.OS_TASK__OFFSET:
			case Allocation_modelPackage.OS_TASK__EXECUTION_TIME:
			case Allocation_modelPackage.OS_TASK__DEPLOYMENTS:
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
				(Allocation_modelPackage.Literals.OS_TASK__PERIOD,
				 RequirementsFactory.eINSTANCE.createEndToEndDelay()));

		newChildDescriptors.add
			(createChildParameter
				(Allocation_modelPackage.Literals.OS_TASK__PERIOD,
				 RequirementsFactory.eINSTANCE.createTimingRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(Allocation_modelPackage.Literals.OS_TASK__PERIOD,
				 RequirementsFactory.eINSTANCE.createPeriodRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(Allocation_modelPackage.Literals.OS_TASK__OFFSET,
				 RequirementsFactory.eINSTANCE.createEndToEndDelay()));

		newChildDescriptors.add
			(createChildParameter
				(Allocation_modelPackage.Literals.OS_TASK__OFFSET,
				 RequirementsFactory.eINSTANCE.createTimingRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(Allocation_modelPackage.Literals.OS_TASK__OFFSET,
				 RequirementsFactory.eINSTANCE.createPeriodRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(Allocation_modelPackage.Literals.OS_TASK__EXECUTION_TIME,
				 RequirementsFactory.eINSTANCE.createEndToEndDelay()));

		newChildDescriptors.add
			(createChildParameter
				(Allocation_modelPackage.Literals.OS_TASK__EXECUTION_TIME,
				 RequirementsFactory.eINSTANCE.createTimingRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(Allocation_modelPackage.Literals.OS_TASK__EXECUTION_TIME,
				 RequirementsFactory.eINSTANCE.createPeriodRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(Allocation_modelPackage.Literals.OS_TASK__DEPLOYMENTS,
				 Allocation_modelFactory.eINSTANCE.createFunctionDeployment()));
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
			childFeature == Allocation_modelPackage.Literals.OS_TASK__PERIOD ||
			childFeature == Allocation_modelPackage.Literals.OS_TASK__OFFSET ||
			childFeature == Allocation_modelPackage.Literals.OS_TASK__EXECUTION_TIME;

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
