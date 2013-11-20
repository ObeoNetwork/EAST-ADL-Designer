/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.provider;


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

import org.obeonetwork.dsl.east_adl.core.provider.EASTADLEntityItemProvider;

import org.obeonetwork.dsl.east_adl.provider.East_adlEditPlugin;

import org.obeonetwork.dsl.east_adl.structure.common.CommonFactory;
import org.obeonetwork.dsl.east_adl.structure.common.CommonPackage;

import org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.FunctionalDevice;
import org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.Functional_analysis_architectureFactory;
import org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.Functional_analysis_architecturePackage;

import org.obeonetwork.dsl.east_adl.structure.platform_model.Platform_modelFactory;

import org.obeonetwork.dsl.east_adl.verification_validation.Verification_validationPackage;

/**
 * This is the item provider adapter for a {@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.FunctionalDevice} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FunctionalDeviceItemProvider
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
	public FunctionalDeviceItemProvider(AdapterFactory adapterFactory) {
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
			addValidatorsPropertyDescriptor(object);
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
			childrenFeatures.add(Functional_analysis_architecturePackage.Literals.FUNCTIONAL_DEVICE__PARAMETERS);
			childrenFeatures.add(Functional_analysis_architecturePackage.Literals.FUNCTIONAL_DEVICE__PORTS);
			childrenFeatures.add(Functional_analysis_architecturePackage.Literals.FUNCTIONAL_DEVICE__OWNING_FUNCTION);
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
	 * This returns FunctionalDevice.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FunctionalDevice"));
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
		String label = ((FunctionalDevice)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_FunctionalDevice_type") :
			getString("_UI_FunctionalDevice_type") + " " + label;
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

		switch (notification.getFeatureID(FunctionalDevice.class)) {
			case Functional_analysis_architecturePackage.FUNCTIONAL_DEVICE__PARAMETERS:
			case Functional_analysis_architecturePackage.FUNCTIONAL_DEVICE__PORTS:
			case Functional_analysis_architecturePackage.FUNCTIONAL_DEVICE__OWNING_FUNCTION:
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
				(Functional_analysis_architecturePackage.Literals.FUNCTIONAL_DEVICE__PARAMETERS,
				 CommonFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(Functional_analysis_architecturePackage.Literals.FUNCTIONAL_DEVICE__PORTS,
				 Platform_modelFactory.eINSTANCE.createSystemPort()));

		newChildDescriptors.add
			(createChildParameter
				(Functional_analysis_architecturePackage.Literals.FUNCTIONAL_DEVICE__PORTS,
				 Platform_modelFactory.eINSTANCE.createMWLocalPort()));

		newChildDescriptors.add
			(createChildParameter
				(Functional_analysis_architecturePackage.Literals.FUNCTIONAL_DEVICE__PORTS,
				 Platform_modelFactory.eINSTANCE.createMWRemotePort()));

		newChildDescriptors.add
			(createChildParameter
				(Functional_analysis_architecturePackage.Literals.FUNCTIONAL_DEVICE__PORTS,
				 CommonFactory.eINSTANCE.createSignalFunctionPort()));

		newChildDescriptors.add
			(createChildParameter
				(Functional_analysis_architecturePackage.Literals.FUNCTIONAL_DEVICE__PORTS,
				 CommonFactory.eINSTANCE.createOperationFunctionPort()));

		newChildDescriptors.add
			(createChildParameter
				(Functional_analysis_architecturePackage.Literals.FUNCTIONAL_DEVICE__OWNING_FUNCTION,
				 Functional_analysis_architectureFactory.eINSTANCE.createAnalysisFunction()));

		newChildDescriptors.add
			(createChildParameter
				(Functional_analysis_architecturePackage.Literals.FUNCTIONAL_DEVICE__OWNING_FUNCTION,
				 Functional_analysis_architectureFactory.eINSTANCE.createEnvironmentFunction()));
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
