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
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.obeonetwork.dsl.east_adl.core.provider.EASTADLArtifactItemProvider;

import org.obeonetwork.dsl.east_adl.provider.East_adlEditPlugin;

import org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleFeatureModel;
import org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.Vehicle_feature_modelFactory;
import org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.Vehicle_feature_modelPackage;

/**
 * This is the item provider adapter for a {@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleFeatureModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VehicleFeatureModelItemProvider
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
	public VehicleFeatureModelItemProvider(AdapterFactory adapterFactory) {
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

			addAnalysisArchitecturePropertyDescriptor(object);
			addDesignArchitecturePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Analysis Architecture feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAnalysisArchitecturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VehicleFeatureModel_analysisArchitecture_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VehicleFeatureModel_analysisArchitecture_feature", "_UI_VehicleFeatureModel_type"),
				 Vehicle_feature_modelPackage.Literals.VEHICLE_FEATURE_MODEL__ANALYSIS_ARCHITECTURE,
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
				 getString("_UI_VehicleFeatureModel_designArchitecture_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VehicleFeatureModel_designArchitecture_feature", "_UI_VehicleFeatureModel_type"),
				 Vehicle_feature_modelPackage.Literals.VEHICLE_FEATURE_MODEL__DESIGN_ARCHITECTURE,
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
			childrenFeatures.add(Vehicle_feature_modelPackage.Literals.VEHICLE_FEATURE_MODEL__VEHICLE_PARAMETERS);
			childrenFeatures.add(Vehicle_feature_modelPackage.Literals.VEHICLE_FEATURE_MODEL__VEHICLE_SETS);
			childrenFeatures.add(Vehicle_feature_modelPackage.Literals.VEHICLE_FEATURE_MODEL__ELECTRONIC_FEATURES);
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
	 * This returns VehicleFeatureModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/VehicleFeatureModel"));
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
		String label = ((VehicleFeatureModel)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_VehicleFeatureModel_type") :
			getString("_UI_VehicleFeatureModel_type") + " " + label;
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

		switch (notification.getFeatureID(VehicleFeatureModel.class)) {
			case Vehicle_feature_modelPackage.VEHICLE_FEATURE_MODEL__VEHICLE_PARAMETERS:
			case Vehicle_feature_modelPackage.VEHICLE_FEATURE_MODEL__VEHICLE_SETS:
			case Vehicle_feature_modelPackage.VEHICLE_FEATURE_MODEL__ELECTRONIC_FEATURES:
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
				(Vehicle_feature_modelPackage.Literals.VEHICLE_FEATURE_MODEL__VEHICLE_PARAMETERS,
				 Vehicle_feature_modelFactory.eINSTANCE.createVehicleParameter()));

		newChildDescriptors.add
			(createChildParameter
				(Vehicle_feature_modelPackage.Literals.VEHICLE_FEATURE_MODEL__VEHICLE_SETS,
				 Vehicle_feature_modelFactory.eINSTANCE.createVehicleSet()));

		newChildDescriptors.add
			(createChildParameter
				(Vehicle_feature_modelPackage.Literals.VEHICLE_FEATURE_MODEL__ELECTRONIC_FEATURES,
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
