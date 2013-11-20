/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.support.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.obeonetwork.dsl.east_adl.core.CorePackage;
import org.obeonetwork.dsl.east_adl.core.EASTADLArtifact;

import org.obeonetwork.dsl.east_adl.core.impl.EASTADLNamedElementImpl;

import org.obeonetwork.dsl.east_adl.support.SupportEntity;
import org.obeonetwork.dsl.east_adl.support.SupportPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.support.impl.SupportEntityImpl#getOwningArtifact <em>Owning Artifact</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class SupportEntityImpl extends EASTADLNamedElementImpl implements SupportEntity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupportEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SupportPackage.Literals.SUPPORT_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EASTADLArtifact getOwningArtifact() {
		if (eContainerFeatureID() != SupportPackage.SUPPORT_ENTITY__OWNING_ARTIFACT) return null;
		return (EASTADLArtifact)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningArtifact(EASTADLArtifact newOwningArtifact, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningArtifact, SupportPackage.SUPPORT_ENTITY__OWNING_ARTIFACT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningArtifact(EASTADLArtifact newOwningArtifact) {
		if (newOwningArtifact != eInternalContainer() || (eContainerFeatureID() != SupportPackage.SUPPORT_ENTITY__OWNING_ARTIFACT && newOwningArtifact != null)) {
			if (EcoreUtil.isAncestor(this, newOwningArtifact))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningArtifact != null)
				msgs = ((InternalEObject)newOwningArtifact).eInverseAdd(this, CorePackage.EASTADL_ARTIFACT__SUPPORT_ENTITIES, EASTADLArtifact.class, msgs);
			msgs = basicSetOwningArtifact(newOwningArtifact, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SupportPackage.SUPPORT_ENTITY__OWNING_ARTIFACT, newOwningArtifact, newOwningArtifact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SupportPackage.SUPPORT_ENTITY__OWNING_ARTIFACT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningArtifact((EASTADLArtifact)otherEnd, msgs);
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
			case SupportPackage.SUPPORT_ENTITY__OWNING_ARTIFACT:
				return basicSetOwningArtifact(null, msgs);
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
			case SupportPackage.SUPPORT_ENTITY__OWNING_ARTIFACT:
				return eInternalContainer().eInverseRemove(this, CorePackage.EASTADL_ARTIFACT__SUPPORT_ENTITIES, EASTADLArtifact.class, msgs);
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
			case SupportPackage.SUPPORT_ENTITY__OWNING_ARTIFACT:
				return getOwningArtifact();
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
			case SupportPackage.SUPPORT_ENTITY__OWNING_ARTIFACT:
				setOwningArtifact((EASTADLArtifact)newValue);
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
			case SupportPackage.SUPPORT_ENTITY__OWNING_ARTIFACT:
				setOwningArtifact((EASTADLArtifact)null);
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
			case SupportPackage.SUPPORT_ENTITY__OWNING_ARTIFACT:
				return getOwningArtifact() != null;
		}
		return super.eIsSet(featureID);
	}

} //SupportEntityImpl
