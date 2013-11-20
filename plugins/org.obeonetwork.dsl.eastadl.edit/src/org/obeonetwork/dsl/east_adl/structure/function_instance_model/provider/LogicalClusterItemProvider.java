/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.function_instance_model.provider;


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

import org.obeonetwork.dsl.east_adl.structure.function_instance_model.Function_instance_modelFactory;
import org.obeonetwork.dsl.east_adl.structure.function_instance_model.Function_instance_modelPackage;
import org.obeonetwork.dsl.east_adl.structure.function_instance_model.LogicalCluster;

/**
 * This is the item provider adapter for a {@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.LogicalCluster} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LogicalClusterItemProvider
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
	public LogicalClusterItemProvider(AdapterFactory adapterFactory) {
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

			addIncomingSignalsPropertyDescriptor(object);
			addOutgoingSignalsPropertyDescriptor(object);
			addPassiveDeploymentsPropertyDescriptor(object);
			addDeployersPropertyDescriptor(object);
			addTriggerTypePropertyDescriptor(object);
			addTriggerEventPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Incoming Signals feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncomingSignalsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SignalInstanceTarget_incomingSignals_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SignalInstanceTarget_incomingSignals_feature", "_UI_SignalInstanceTarget_type"),
				 Function_instance_modelPackage.Literals.SIGNAL_INSTANCE_TARGET__INCOMING_SIGNALS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Outgoing Signals feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutgoingSignalsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SignalInstanceTarget_outgoingSignals_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SignalInstanceTarget_outgoingSignals_feature", "_UI_SignalInstanceTarget_type"),
				 Function_instance_modelPackage.Literals.SIGNAL_INSTANCE_TARGET__OUTGOING_SIGNALS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Passive Deployments feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPassiveDeploymentsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LogicalCluster_passiveDeployments_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LogicalCluster_passiveDeployments_feature", "_UI_LogicalCluster_type"),
				 Function_instance_modelPackage.Literals.LOGICAL_CLUSTER__PASSIVE_DEPLOYMENTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Deployers feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeployersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LogicalCluster_deployers_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LogicalCluster_deployers_feature", "_UI_LogicalCluster_type"),
				 Function_instance_modelPackage.Literals.LOGICAL_CLUSTER__DEPLOYERS,
				 false,
				 false,
				 false,
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
				 getString("_UI_LogicalCluster_triggerType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LogicalCluster_triggerType_feature", "_UI_LogicalCluster_type"),
				 Function_instance_modelPackage.Literals.LOGICAL_CLUSTER__TRIGGER_TYPE,
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
				 getString("_UI_LogicalCluster_triggerEvent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LogicalCluster_triggerEvent_feature", "_UI_LogicalCluster_type"),
				 Function_instance_modelPackage.Literals.LOGICAL_CLUSTER__TRIGGER_EVENT,
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
			childrenFeatures.add(Function_instance_modelPackage.Literals.LOGICAL_CLUSTER__FUNCTION_INSTANCES);
			childrenFeatures.add(Function_instance_modelPackage.Literals.LOGICAL_CLUSTER__PERIOD);
			childrenFeatures.add(Function_instance_modelPackage.Literals.LOGICAL_CLUSTER__OFFSET);
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
	 * This returns LogicalCluster.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LogicalCluster"));
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
		String label = ((LogicalCluster)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_LogicalCluster_type") :
			getString("_UI_LogicalCluster_type") + " " + label;
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

		switch (notification.getFeatureID(LogicalCluster.class)) {
			case Function_instance_modelPackage.LOGICAL_CLUSTER__TRIGGER_TYPE:
			case Function_instance_modelPackage.LOGICAL_CLUSTER__TRIGGER_EVENT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case Function_instance_modelPackage.LOGICAL_CLUSTER__FUNCTION_INSTANCES:
			case Function_instance_modelPackage.LOGICAL_CLUSTER__PERIOD:
			case Function_instance_modelPackage.LOGICAL_CLUSTER__OFFSET:
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
				(Function_instance_modelPackage.Literals.LOGICAL_CLUSTER__FUNCTION_INSTANCES,
				 Function_instance_modelFactory.eINSTANCE.createFunctionInstance()));

		newChildDescriptors.add
			(createChildParameter
				(Function_instance_modelPackage.Literals.LOGICAL_CLUSTER__PERIOD,
				 RequirementsFactory.eINSTANCE.createEndToEndDelay()));

		newChildDescriptors.add
			(createChildParameter
				(Function_instance_modelPackage.Literals.LOGICAL_CLUSTER__PERIOD,
				 RequirementsFactory.eINSTANCE.createTimingRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(Function_instance_modelPackage.Literals.LOGICAL_CLUSTER__PERIOD,
				 RequirementsFactory.eINSTANCE.createPeriodRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(Function_instance_modelPackage.Literals.LOGICAL_CLUSTER__OFFSET,
				 RequirementsFactory.eINSTANCE.createEndToEndDelay()));

		newChildDescriptors.add
			(createChildParameter
				(Function_instance_modelPackage.Literals.LOGICAL_CLUSTER__OFFSET,
				 RequirementsFactory.eINSTANCE.createTimingRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(Function_instance_modelPackage.Literals.LOGICAL_CLUSTER__OFFSET,
				 RequirementsFactory.eINSTANCE.createPeriodRestriction()));
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
			childFeature == Function_instance_modelPackage.Literals.LOGICAL_CLUSTER__PERIOD ||
			childFeature == Function_instance_modelPackage.Literals.LOGICAL_CLUSTER__OFFSET;

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
