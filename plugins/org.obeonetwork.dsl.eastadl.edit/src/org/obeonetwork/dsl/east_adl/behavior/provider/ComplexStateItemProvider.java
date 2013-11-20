/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.behavior.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.obeonetwork.dsl.east_adl.behavior.BehaviorFactory;
import org.obeonetwork.dsl.east_adl.behavior.BehaviorPackage;
import org.obeonetwork.dsl.east_adl.behavior.ComplexState;

/**
 * This is the item provider adapter for a {@link org.obeonetwork.dsl.east_adl.behavior.ComplexState} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComplexStateItemProvider
	extends StateItemProvider
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
	public ComplexStateItemProvider(AdapterFactory adapterFactory) {
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

			addOwnerPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Owner feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Behavior_owner_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Behavior_owner_feature", "_UI_Behavior_type"),
				 BehaviorPackage.Literals.BEHAVIOR__OWNER,
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
			childrenFeatures.add(BehaviorPackage.Literals.NATIVE_BEHAVIOR__INITIAL_STATE);
			childrenFeatures.add(BehaviorPackage.Literals.NATIVE_BEHAVIOR__STATES);
			childrenFeatures.add(BehaviorPackage.Literals.NATIVE_BEHAVIOR__FINAL_STATE);
			childrenFeatures.add(BehaviorPackage.Literals.NATIVE_BEHAVIOR__TRANSITIONS);
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
	 * This returns ComplexState.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ComplexState"));
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
		String label = ((ComplexState)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ComplexState_type") :
			getString("_UI_ComplexState_type") + " " + label;
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

		switch (notification.getFeatureID(ComplexState.class)) {
			case BehaviorPackage.COMPLEX_STATE__INITIAL_STATE:
			case BehaviorPackage.COMPLEX_STATE__STATES:
			case BehaviorPackage.COMPLEX_STATE__FINAL_STATE:
			case BehaviorPackage.COMPLEX_STATE__TRANSITIONS:
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
				(BehaviorPackage.Literals.NATIVE_BEHAVIOR__INITIAL_STATE,
				 BehaviorFactory.eINSTANCE.createInitialState()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.NATIVE_BEHAVIOR__STATES,
				 BehaviorFactory.eINSTANCE.createState()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.NATIVE_BEHAVIOR__STATES,
				 BehaviorFactory.eINSTANCE.createComplexState()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.NATIVE_BEHAVIOR__STATES,
				 BehaviorFactory.eINSTANCE.createInitialState()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.NATIVE_BEHAVIOR__STATES,
				 BehaviorFactory.eINSTANCE.createFinalState()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.NATIVE_BEHAVIOR__STATES,
				 BehaviorFactory.eINSTANCE.createChoiceState()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.NATIVE_BEHAVIOR__STATES,
				 BehaviorFactory.eINSTANCE.createJunctionState()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.NATIVE_BEHAVIOR__FINAL_STATE,
				 BehaviorFactory.eINSTANCE.createFinalState()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.NATIVE_BEHAVIOR__TRANSITIONS,
				 BehaviorFactory.eINSTANCE.createTransition()));
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
			childFeature == BehaviorPackage.Literals.NATIVE_BEHAVIOR__INITIAL_STATE ||
			childFeature == BehaviorPackage.Literals.NATIVE_BEHAVIOR__STATES ||
			childFeature == BehaviorPackage.Literals.NATIVE_BEHAVIOR__FINAL_STATE;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
