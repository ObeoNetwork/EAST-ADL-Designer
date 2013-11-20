/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.hardware_architecture.provider;


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

import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.HardwareArchitecture;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architectureFactory;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage;

/**
 * This is the item provider adapter for a {@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.HardwareArchitecture} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HardwareArchitectureItemProvider
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
	public HardwareArchitectureItemProvider(AdapterFactory adapterFactory) {
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

			addPlatformModelPropertyDescriptor(object);
			addDesignArchitecturePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Platform Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPlatformModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HardwareArchitecture_platformModel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HardwareArchitecture_platformModel_feature", "_UI_HardwareArchitecture_type"),
				 Hardware_architecturePackage.Literals.HARDWARE_ARCHITECTURE__PLATFORM_MODEL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Design Architecture feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDesignArchitecturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HardwareArchitecture_designArchitecture_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HardwareArchitecture_designArchitecture_feature", "_UI_HardwareArchitecture_type"),
				 Hardware_architecturePackage.Literals.HARDWARE_ARCHITECTURE__DESIGN_ARCHITECTURE,
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
			childrenFeatures.add(Hardware_architecturePackage.Literals.HARDWARE_ARCHITECTURE__HARDWARE_ENTITIES);
			childrenFeatures.add(Hardware_architecturePackage.Literals.HARDWARE_ARCHITECTURE__ELECTRICAL_SIGNALS);
			childrenFeatures.add(Hardware_architecturePackage.Literals.HARDWARE_ARCHITECTURE__WIRES);
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
	 * This returns HardwareArchitecture.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/HardwareArchitecture"));
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
		String label = ((HardwareArchitecture)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_HardwareArchitecture_type") :
			getString("_UI_HardwareArchitecture_type") + " " + label;
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

		switch (notification.getFeatureID(HardwareArchitecture.class)) {
			case Hardware_architecturePackage.HARDWARE_ARCHITECTURE__HARDWARE_ENTITIES:
			case Hardware_architecturePackage.HARDWARE_ARCHITECTURE__ELECTRICAL_SIGNALS:
			case Hardware_architecturePackage.HARDWARE_ARCHITECTURE__WIRES:
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
				(Hardware_architecturePackage.Literals.HARDWARE_ARCHITECTURE__HARDWARE_ENTITIES,
				 Hardware_architectureFactory.eINSTANCE.createECU()));

		newChildDescriptors.add
			(createChildParameter
				(Hardware_architecturePackage.Literals.HARDWARE_ARCHITECTURE__HARDWARE_ENTITIES,
				 Hardware_architectureFactory.eINSTANCE.createProcessor()));

		newChildDescriptors.add
			(createChildParameter
				(Hardware_architecturePackage.Literals.HARDWARE_ARCHITECTURE__HARDWARE_ENTITIES,
				 Hardware_architectureFactory.eINSTANCE.createMemory()));

		newChildDescriptors.add
			(createChildParameter
				(Hardware_architecturePackage.Literals.HARDWARE_ARCHITECTURE__HARDWARE_ENTITIES,
				 Hardware_architectureFactory.eINSTANCE.createPeripheral()));

		newChildDescriptors.add
			(createChildParameter
				(Hardware_architecturePackage.Literals.HARDWARE_ARCHITECTURE__HARDWARE_ENTITIES,
				 Hardware_architectureFactory.eINSTANCE.createChannel()));

		newChildDescriptors.add
			(createChildParameter
				(Hardware_architecturePackage.Literals.HARDWARE_ARCHITECTURE__HARDWARE_ENTITIES,
				 Hardware_architectureFactory.eINSTANCE.createSensor()));

		newChildDescriptors.add
			(createChildParameter
				(Hardware_architecturePackage.Literals.HARDWARE_ARCHITECTURE__HARDWARE_ENTITIES,
				 Hardware_architectureFactory.eINSTANCE.createActuator()));

		newChildDescriptors.add
			(createChildParameter
				(Hardware_architecturePackage.Literals.HARDWARE_ARCHITECTURE__ELECTRICAL_SIGNALS,
				 Hardware_architectureFactory.eINSTANCE.createElectricalSignal()));

		newChildDescriptors.add
			(createChildParameter
				(Hardware_architecturePackage.Literals.HARDWARE_ARCHITECTURE__ELECTRICAL_SIGNALS,
				 Hardware_architectureFactory.eINSTANCE.createDigitalSignal()));

		newChildDescriptors.add
			(createChildParameter
				(Hardware_architecturePackage.Literals.HARDWARE_ARCHITECTURE__ELECTRICAL_SIGNALS,
				 Hardware_architectureFactory.eINSTANCE.createAnalogSignal()));

		newChildDescriptors.add
			(createChildParameter
				(Hardware_architecturePackage.Literals.HARDWARE_ARCHITECTURE__ELECTRICAL_SIGNALS,
				 Hardware_architectureFactory.eINSTANCE.createPWMSignal()));

		newChildDescriptors.add
			(createChildParameter
				(Hardware_architecturePackage.Literals.HARDWARE_ARCHITECTURE__ELECTRICAL_SIGNALS,
				 Hardware_architectureFactory.eINSTANCE.createICUSignal()));

		newChildDescriptors.add
			(createChildParameter
				(Hardware_architecturePackage.Literals.HARDWARE_ARCHITECTURE__WIRES,
				 Hardware_architectureFactory.eINSTANCE.createWire()));
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
