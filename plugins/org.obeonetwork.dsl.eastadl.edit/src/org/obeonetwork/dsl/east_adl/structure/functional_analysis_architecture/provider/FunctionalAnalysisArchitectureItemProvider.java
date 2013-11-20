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

import org.obeonetwork.dsl.east_adl.core.provider.EASTADLArtifactItemProvider;

import org.obeonetwork.dsl.east_adl.provider.East_adlEditPlugin;

import org.obeonetwork.dsl.east_adl.structure.common.CommonFactory;

import org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.FunctionalAnalysisArchitecture;
import org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.Functional_analysis_architectureFactory;
import org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.Functional_analysis_architecturePackage;

/**
 * This is the item provider adapter for a {@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.FunctionalAnalysisArchitecture} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FunctionalAnalysisArchitectureItemProvider
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
	public FunctionalAnalysisArchitectureItemProvider(AdapterFactory adapterFactory) {
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

			addVehicleModelPropertyDescriptor(object);
			addDesignArchitecturePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Vehicle Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVehicleModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FunctionalAnalysisArchitecture_vehicleModel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FunctionalAnalysisArchitecture_vehicleModel_feature", "_UI_FunctionalAnalysisArchitecture_type"),
				 Functional_analysis_architecturePackage.Literals.FUNCTIONAL_ANALYSIS_ARCHITECTURE__VEHICLE_MODEL,
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
				 getString("_UI_FunctionalAnalysisArchitecture_designArchitecture_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FunctionalAnalysisArchitecture_designArchitecture_feature", "_UI_FunctionalAnalysisArchitecture_type"),
				 Functional_analysis_architecturePackage.Literals.FUNCTIONAL_ANALYSIS_ARCHITECTURE__DESIGN_ARCHITECTURE,
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
			childrenFeatures.add(Functional_analysis_architecturePackage.Literals.FUNCTIONAL_ANALYSIS_ARCHITECTURE__ANALYSIS_FUNCTIONS);
			childrenFeatures.add(Functional_analysis_architecturePackage.Literals.FUNCTIONAL_ANALYSIS_ARCHITECTURE__FUNCTIONAL_DEVICES);
			childrenFeatures.add(Functional_analysis_architecturePackage.Literals.FUNCTIONAL_ANALYSIS_ARCHITECTURE__DESIGN_DATA_TYPES);
			childrenFeatures.add(Functional_analysis_architecturePackage.Literals.FUNCTIONAL_ANALYSIS_ARCHITECTURE__CONNECTOR_SIGNALS);
			childrenFeatures.add(Functional_analysis_architecturePackage.Literals.FUNCTIONAL_ANALYSIS_ARCHITECTURE__OPERATION_CALLS);
			childrenFeatures.add(Functional_analysis_architecturePackage.Literals.FUNCTIONAL_ANALYSIS_ARCHITECTURE__TYPE_ASSOCIATIONS);
			childrenFeatures.add(Functional_analysis_architecturePackage.Literals.FUNCTIONAL_ANALYSIS_ARCHITECTURE__IMPLEMENTATION_DATA_TYPES);
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
	 * This returns FunctionalAnalysisArchitecture.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FunctionalAnalysisArchitecture"));
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
		String label = ((FunctionalAnalysisArchitecture)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_FunctionalAnalysisArchitecture_type") :
			getString("_UI_FunctionalAnalysisArchitecture_type") + " " + label;
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

		switch (notification.getFeatureID(FunctionalAnalysisArchitecture.class)) {
			case Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__ANALYSIS_FUNCTIONS:
			case Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__FUNCTIONAL_DEVICES:
			case Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__DESIGN_DATA_TYPES:
			case Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__CONNECTOR_SIGNALS:
			case Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__OPERATION_CALLS:
			case Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__TYPE_ASSOCIATIONS:
			case Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__IMPLEMENTATION_DATA_TYPES:
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
				(Functional_analysis_architecturePackage.Literals.FUNCTIONAL_ANALYSIS_ARCHITECTURE__ANALYSIS_FUNCTIONS,
				 Functional_analysis_architectureFactory.eINSTANCE.createAnalysisFunction()));

		newChildDescriptors.add
			(createChildParameter
				(Functional_analysis_architecturePackage.Literals.FUNCTIONAL_ANALYSIS_ARCHITECTURE__ANALYSIS_FUNCTIONS,
				 Functional_analysis_architectureFactory.eINSTANCE.createEnvironmentFunction()));

		newChildDescriptors.add
			(createChildParameter
				(Functional_analysis_architecturePackage.Literals.FUNCTIONAL_ANALYSIS_ARCHITECTURE__FUNCTIONAL_DEVICES,
				 Functional_analysis_architectureFactory.eINSTANCE.createFunctionalDevice()));

		newChildDescriptors.add
			(createChildParameter
				(Functional_analysis_architecturePackage.Literals.FUNCTIONAL_ANALYSIS_ARCHITECTURE__DESIGN_DATA_TYPES,
				 CommonFactory.eINSTANCE.createDesignDataType()));

		newChildDescriptors.add
			(createChildParameter
				(Functional_analysis_architecturePackage.Literals.FUNCTIONAL_ANALYSIS_ARCHITECTURE__CONNECTOR_SIGNALS,
				 CommonFactory.eINSTANCE.createConnectorSignal()));

		newChildDescriptors.add
			(createChildParameter
				(Functional_analysis_architecturePackage.Literals.FUNCTIONAL_ANALYSIS_ARCHITECTURE__OPERATION_CALLS,
				 CommonFactory.eINSTANCE.createOperationCall()));

		newChildDescriptors.add
			(createChildParameter
				(Functional_analysis_architecturePackage.Literals.FUNCTIONAL_ANALYSIS_ARCHITECTURE__TYPE_ASSOCIATIONS,
				 CommonFactory.eINSTANCE.createTypeAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(Functional_analysis_architecturePackage.Literals.FUNCTIONAL_ANALYSIS_ARCHITECTURE__IMPLEMENTATION_DATA_TYPES,
				 CommonFactory.eINSTANCE.createImplementationDataType()));
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
