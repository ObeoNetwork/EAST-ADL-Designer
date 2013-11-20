/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.variant_handling.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.obeonetwork.dsl.east_adl.core.impl.EASTADLNamedElementImpl;

import org.obeonetwork.dsl.east_adl.variant_handling.LogicalOperationKind;
import org.obeonetwork.dsl.east_adl.variant_handling.Selection;
import org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity;
import org.obeonetwork.dsl.east_adl.variant_handling.Variant_handlingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Selection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.variant_handling.impl.SelectionImpl#getSelector <em>Selector</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.variant_handling.impl.SelectionImpl#getSelected <em>Selected</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.variant_handling.impl.SelectionImpl#getSelectionType <em>Selection Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SelectionImpl extends EASTADLNamedElementImpl implements Selection {
	/**
	 * The cached value of the '{@link #getSelected() <em>Selected</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelected()
	 * @generated
	 * @ordered
	 */
	protected VariantEntity selected;

	/**
	 * The default value of the '{@link #getSelectionType() <em>Selection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectionType()
	 * @generated
	 * @ordered
	 */
	protected static final LogicalOperationKind SELECTION_TYPE_EDEFAULT = LogicalOperationKind.AND;

	/**
	 * The cached value of the '{@link #getSelectionType() <em>Selection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectionType()
	 * @generated
	 * @ordered
	 */
	protected LogicalOperationKind selectionType = SELECTION_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Variant_handlingPackage.Literals.SELECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariantEntity getSelector() {
		if (eContainerFeatureID() != Variant_handlingPackage.SELECTION__SELECTOR) return null;
		return (VariantEntity)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelector(VariantEntity newSelector, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSelector, Variant_handlingPackage.SELECTION__SELECTOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelector(VariantEntity newSelector) {
		if (newSelector != eInternalContainer() || (eContainerFeatureID() != Variant_handlingPackage.SELECTION__SELECTOR && newSelector != null)) {
			if (EcoreUtil.isAncestor(this, newSelector))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSelector != null)
				msgs = ((InternalEObject)newSelector).eInverseAdd(this, Variant_handlingPackage.VARIANT_ENTITY__ACTIVE_SELECTIONS, VariantEntity.class, msgs);
			msgs = basicSetSelector(newSelector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Variant_handlingPackage.SELECTION__SELECTOR, newSelector, newSelector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariantEntity getSelected() {
		if (selected != null && selected.eIsProxy()) {
			InternalEObject oldSelected = (InternalEObject)selected;
			selected = (VariantEntity)eResolveProxy(oldSelected);
			if (selected != oldSelected) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Variant_handlingPackage.SELECTION__SELECTED, oldSelected, selected));
			}
		}
		return selected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariantEntity basicGetSelected() {
		return selected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelected(VariantEntity newSelected, NotificationChain msgs) {
		VariantEntity oldSelected = selected;
		selected = newSelected;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Variant_handlingPackage.SELECTION__SELECTED, oldSelected, newSelected);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelected(VariantEntity newSelected) {
		if (newSelected != selected) {
			NotificationChain msgs = null;
			if (selected != null)
				msgs = ((InternalEObject)selected).eInverseRemove(this, Variant_handlingPackage.VARIANT_ENTITY__PASSIVE_SELECTIONS, VariantEntity.class, msgs);
			if (newSelected != null)
				msgs = ((InternalEObject)newSelected).eInverseAdd(this, Variant_handlingPackage.VARIANT_ENTITY__PASSIVE_SELECTIONS, VariantEntity.class, msgs);
			msgs = basicSetSelected(newSelected, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Variant_handlingPackage.SELECTION__SELECTED, newSelected, newSelected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalOperationKind getSelectionType() {
		return selectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectionType(LogicalOperationKind newSelectionType) {
		LogicalOperationKind oldSelectionType = selectionType;
		selectionType = newSelectionType == null ? SELECTION_TYPE_EDEFAULT : newSelectionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Variant_handlingPackage.SELECTION__SELECTION_TYPE, oldSelectionType, selectionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Variant_handlingPackage.SELECTION__SELECTOR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSelector((VariantEntity)otherEnd, msgs);
			case Variant_handlingPackage.SELECTION__SELECTED:
				if (selected != null)
					msgs = ((InternalEObject)selected).eInverseRemove(this, Variant_handlingPackage.VARIANT_ENTITY__PASSIVE_SELECTIONS, VariantEntity.class, msgs);
				return basicSetSelected((VariantEntity)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Variant_handlingPackage.SELECTION__SELECTOR:
				return basicSetSelector(null, msgs);
			case Variant_handlingPackage.SELECTION__SELECTED:
				return basicSetSelected(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case Variant_handlingPackage.SELECTION__SELECTOR:
				return eInternalContainer().eInverseRemove(this, Variant_handlingPackage.VARIANT_ENTITY__ACTIVE_SELECTIONS, VariantEntity.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Variant_handlingPackage.SELECTION__SELECTOR:
				return getSelector();
			case Variant_handlingPackage.SELECTION__SELECTED:
				if (resolve) return getSelected();
				return basicGetSelected();
			case Variant_handlingPackage.SELECTION__SELECTION_TYPE:
				return getSelectionType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Variant_handlingPackage.SELECTION__SELECTOR:
				setSelector((VariantEntity)newValue);
				return;
			case Variant_handlingPackage.SELECTION__SELECTED:
				setSelected((VariantEntity)newValue);
				return;
			case Variant_handlingPackage.SELECTION__SELECTION_TYPE:
				setSelectionType((LogicalOperationKind)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Variant_handlingPackage.SELECTION__SELECTOR:
				setSelector((VariantEntity)null);
				return;
			case Variant_handlingPackage.SELECTION__SELECTED:
				setSelected((VariantEntity)null);
				return;
			case Variant_handlingPackage.SELECTION__SELECTION_TYPE:
				setSelectionType(SELECTION_TYPE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Variant_handlingPackage.SELECTION__SELECTOR:
				return getSelector() != null;
			case Variant_handlingPackage.SELECTION__SELECTED:
				return selected != null;
			case Variant_handlingPackage.SELECTION__SELECTION_TYPE:
				return selectionType != SELECTION_TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (selectionType: ");
		result.append(selectionType);
		result.append(')');
		return result.toString();
	}

} //SelectionImpl
