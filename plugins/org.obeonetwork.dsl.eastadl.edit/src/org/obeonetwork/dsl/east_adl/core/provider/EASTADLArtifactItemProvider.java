/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.core.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.obeonetwork.dsl.east_adl.core.CorePackage;
import org.obeonetwork.dsl.east_adl.core.EASTADLArtifact;

import org.obeonetwork.dsl.east_adl.requirements.RequirementsFactory;

import org.obeonetwork.dsl.east_adl.support.SupportFactory;

import org.obeonetwork.dsl.east_adl.verification_validation.Verification_validationFactory;

/**
 * This is the item provider adapter for a {@link org.obeonetwork.dsl.east_adl.core.EASTADLArtifact} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EASTADLArtifactItemProvider
	extends EASTADLNamedElementItemProvider
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
	public EASTADLArtifactItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(CorePackage.Literals.EASTADL_ARTIFACT__REQUIREMENTS);
			childrenFeatures.add(CorePackage.Literals.EASTADL_ARTIFACT__SUPPORT_ENTITIES);
			childrenFeatures.add(CorePackage.Literals.EASTADL_ARTIFACT__VALIDATION_ENTITIES);
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
		String label = ((EASTADLArtifact)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_EASTADLArtifact_type") :
			getString("_UI_EASTADLArtifact_type") + " " + label;
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

		switch (notification.getFeatureID(EASTADLArtifact.class)) {
			case CorePackage.EASTADL_ARTIFACT__REQUIREMENTS:
			case CorePackage.EASTADL_ARTIFACT__SUPPORT_ENTITIES:
			case CorePackage.EASTADL_ARTIFACT__VALIDATION_ENTITIES:
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
				(CorePackage.Literals.EASTADL_ARTIFACT__REQUIREMENTS,
				 RequirementsFactory.eINSTANCE.createFunctionalRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.EASTADL_ARTIFACT__REQUIREMENTS,
				 RequirementsFactory.eINSTANCE.createDesignConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.EASTADL_ARTIFACT__REQUIREMENTS,
				 RequirementsFactory.eINSTANCE.createQualityRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.EASTADL_ARTIFACT__REQUIREMENTS,
				 RequirementsFactory.eINSTANCE.createEndToEndDelay()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.EASTADL_ARTIFACT__REQUIREMENTS,
				 RequirementsFactory.eINSTANCE.createPeriodRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.EASTADL_ARTIFACT__SUPPORT_ENTITIES,
				 SupportFactory.eINSTANCE.createVersion()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.EASTADL_ARTIFACT__SUPPORT_ENTITIES,
				 SupportFactory.eINSTANCE.createConfiguration()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.EASTADL_ARTIFACT__SUPPORT_ENTITIES,
				 SupportFactory.eINSTANCE.createVersionArchive()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.EASTADL_ARTIFACT__VALIDATION_ENTITIES,
				 Verification_validationFactory.eINSTANCE.createSimulation()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.EASTADL_ARTIFACT__VALIDATION_ENTITIES,
				 Verification_validationFactory.eINSTANCE.createStaticAnalysis()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.EASTADL_ARTIFACT__VALIDATION_ENTITIES,
				 Verification_validationFactory.eINSTANCE.createFormalAnalysis()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.EASTADL_ARTIFACT__VALIDATION_ENTITIES,
				 Verification_validationFactory.eINSTANCE.createTestSuite()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.EASTADL_ARTIFACT__VALIDATION_ENTITIES,
				 Verification_validationFactory.eINSTANCE.createTestCase()));
	}

}
