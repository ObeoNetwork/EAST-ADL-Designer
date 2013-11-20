/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.platform_model.provider;


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
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.obeonetwork.dsl.east_adl.core.provider.EASTADLArtifactItemProvider;

import org.obeonetwork.dsl.east_adl.provider.East_adlEditPlugin;

import org.obeonetwork.dsl.east_adl.structure.common.CommonFactory;

import org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel;
import org.obeonetwork.dsl.east_adl.structure.platform_model.Platform_modelFactory;
import org.obeonetwork.dsl.east_adl.structure.platform_model.Platform_modelPackage;

/**
 * This is the item provider adapter for a {@link org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PlatformModelItemProvider
	extends EASTADLArtifactItemProvider
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
	public PlatformModelItemProvider(AdapterFactory adapterFactory) {
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

			addAllocationModelPropertyDescriptor(object);
			addHardwareArchitecturePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Allocation Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllocationModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PlatformModel_allocationModel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PlatformModel_allocationModel_feature", "_UI_PlatformModel_type"),
				 Platform_modelPackage.Literals.PLATFORM_MODEL__ALLOCATION_MODEL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hardware Architecture feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHardwareArchitecturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PlatformModel_hardwareArchitecture_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PlatformModel_hardwareArchitecture_feature", "_UI_PlatformModel_type"),
				 Platform_modelPackage.Literals.PLATFORM_MODEL__HARDWARE_ARCHITECTURE,
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
			childrenFeatures.add(Platform_modelPackage.Literals.PLATFORM_MODEL__DEVICE_DRIVERS);
			childrenFeatures.add(Platform_modelPackage.Literals.PLATFORM_MODEL__IO_DRIVERS);
			childrenFeatures.add(Platform_modelPackage.Literals.PLATFORM_MODEL__ABSTRACT_FUNCTIONS);
			childrenFeatures.add(Platform_modelPackage.Literals.PLATFORM_MODEL__FRAMEWORKS);
			childrenFeatures.add(Platform_modelPackage.Literals.PLATFORM_MODEL__OPERATING_SYSTEMS);
			childrenFeatures.add(Platform_modelPackage.Literals.PLATFORM_MODEL__COMPOSITE_SOFTWARE_FUNCTIONS);
			childrenFeatures.add(Platform_modelPackage.Literals.PLATFORM_MODEL__ELEMENTARY_SOFTWARE_FUNCTIONS);
			childrenFeatures.add(Platform_modelPackage.Literals.PLATFORM_MODEL__IPC_EXCHANGERS);
			childrenFeatures.add(Platform_modelPackage.Literals.PLATFORM_MODEL__DESIGN_DATA_TYPES);
			childrenFeatures.add(Platform_modelPackage.Literals.PLATFORM_MODEL__IMPLEMENTATION_DATA_TYPES);
			childrenFeatures.add(Platform_modelPackage.Literals.PLATFORM_MODEL__TYPE_ASSOCIATIONS);
			childrenFeatures.add(Platform_modelPackage.Literals.PLATFORM_MODEL__CONNECTOR_SIGNALS);
			childrenFeatures.add(Platform_modelPackage.Literals.PLATFORM_MODEL__OPERATION_CALLS);
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
	 * This returns PlatformModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PlatformModel"));
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
		String label = ((PlatformModel)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_PlatformModel_type") :
			getString("_UI_PlatformModel_type") + " " + label;
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

		switch (notification.getFeatureID(PlatformModel.class)) {
			case Platform_modelPackage.PLATFORM_MODEL__DEVICE_DRIVERS:
			case Platform_modelPackage.PLATFORM_MODEL__IO_DRIVERS:
			case Platform_modelPackage.PLATFORM_MODEL__ABSTRACT_FUNCTIONS:
			case Platform_modelPackage.PLATFORM_MODEL__FRAMEWORKS:
			case Platform_modelPackage.PLATFORM_MODEL__OPERATING_SYSTEMS:
			case Platform_modelPackage.PLATFORM_MODEL__COMPOSITE_SOFTWARE_FUNCTIONS:
			case Platform_modelPackage.PLATFORM_MODEL__ELEMENTARY_SOFTWARE_FUNCTIONS:
			case Platform_modelPackage.PLATFORM_MODEL__IPC_EXCHANGERS:
			case Platform_modelPackage.PLATFORM_MODEL__DESIGN_DATA_TYPES:
			case Platform_modelPackage.PLATFORM_MODEL__IMPLEMENTATION_DATA_TYPES:
			case Platform_modelPackage.PLATFORM_MODEL__TYPE_ASSOCIATIONS:
			case Platform_modelPackage.PLATFORM_MODEL__CONNECTOR_SIGNALS:
			case Platform_modelPackage.PLATFORM_MODEL__OPERATION_CALLS:
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
				(Platform_modelPackage.Literals.PLATFORM_MODEL__DEVICE_DRIVERS,
				 Platform_modelFactory.eINSTANCE.createDeviceDriver()));

		newChildDescriptors.add
			(createChildParameter
				(Platform_modelPackage.Literals.PLATFORM_MODEL__IO_DRIVERS,
				 Platform_modelFactory.eINSTANCE.createIODriver()));

		newChildDescriptors.add
			(createChildParameter
				(Platform_modelPackage.Literals.PLATFORM_MODEL__ABSTRACT_FUNCTIONS,
				 Platform_modelFactory.eINSTANCE.createHardwareAbstractionFunction()));

		newChildDescriptors.add
			(createChildParameter
				(Platform_modelPackage.Literals.PLATFORM_MODEL__FRAMEWORKS,
				 Platform_modelFactory.eINSTANCE.createFramework()));

		newChildDescriptors.add
			(createChildParameter
				(Platform_modelPackage.Literals.PLATFORM_MODEL__OPERATING_SYSTEMS,
				 Platform_modelFactory.eINSTANCE.createOperatingSystem()));

		newChildDescriptors.add
			(createChildParameter
				(Platform_modelPackage.Literals.PLATFORM_MODEL__COMPOSITE_SOFTWARE_FUNCTIONS,
				 Platform_modelFactory.eINSTANCE.createMWCompositeSoftwareFunction()));

		newChildDescriptors.add
			(createChildParameter
				(Platform_modelPackage.Literals.PLATFORM_MODEL__ELEMENTARY_SOFTWARE_FUNCTIONS,
				 Platform_modelFactory.eINSTANCE.createMWElementarySoftwareFunction()));

		newChildDescriptors.add
			(createChildParameter
				(Platform_modelPackage.Literals.PLATFORM_MODEL__IPC_EXCHANGERS,
				 Platform_modelFactory.eINSTANCE.createIPCExchanger()));

		newChildDescriptors.add
			(createChildParameter
				(Platform_modelPackage.Literals.PLATFORM_MODEL__DESIGN_DATA_TYPES,
				 CommonFactory.eINSTANCE.createDesignDataType()));

		newChildDescriptors.add
			(createChildParameter
				(Platform_modelPackage.Literals.PLATFORM_MODEL__IMPLEMENTATION_DATA_TYPES,
				 CommonFactory.eINSTANCE.createImplementationDataType()));

		newChildDescriptors.add
			(createChildParameter
				(Platform_modelPackage.Literals.PLATFORM_MODEL__TYPE_ASSOCIATIONS,
				 CommonFactory.eINSTANCE.createTypeAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(Platform_modelPackage.Literals.PLATFORM_MODEL__CONNECTOR_SIGNALS,
				 CommonFactory.eINSTANCE.createConnectorSignal()));

		newChildDescriptors.add
			(createChildParameter
				(Platform_modelPackage.Literals.PLATFORM_MODEL__OPERATION_CALLS,
				 CommonFactory.eINSTANCE.createOperationCall()));
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
