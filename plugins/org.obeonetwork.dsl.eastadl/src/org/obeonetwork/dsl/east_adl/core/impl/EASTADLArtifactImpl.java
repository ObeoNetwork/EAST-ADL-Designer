/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.core.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.east_adl.EASTADLModel;
import org.obeonetwork.dsl.east_adl.East_adlPackage;

import org.obeonetwork.dsl.east_adl.core.CorePackage;
import org.obeonetwork.dsl.east_adl.core.EASTADLArtifact;

import org.obeonetwork.dsl.east_adl.requirements.Requirement;

import org.obeonetwork.dsl.east_adl.support.SupportEntity;
import org.obeonetwork.dsl.east_adl.support.SupportPackage;

import org.obeonetwork.dsl.east_adl.verification_validation.VVCase;
import org.obeonetwork.dsl.east_adl.verification_validation.Verification_validationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EASTADL Artifact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.core.impl.EASTADLArtifactImpl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.core.impl.EASTADLArtifactImpl#getModel <em>Model</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.core.impl.EASTADLArtifactImpl#getSupportEntities <em>Support Entities</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.core.impl.EASTADLArtifactImpl#getValidationEntities <em>Validation Entities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class EASTADLArtifactImpl extends EASTADLNamedElementImpl implements EASTADLArtifact {
	/**
	 * The cached value of the '{@link #getRequirements() <em>Requirements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> requirements;

	/**
	 * The cached value of the '{@link #getSupportEntities() <em>Support Entities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<SupportEntity> supportEntities;

	/**
	 * The cached value of the '{@link #getValidationEntities() <em>Validation Entities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidationEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<VVCase> validationEntities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EASTADLArtifactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.EASTADL_ARTIFACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requirement> getRequirements() {
		if (requirements == null) {
			requirements = new EObjectContainmentEList<Requirement>(Requirement.class, this, CorePackage.EASTADL_ARTIFACT__REQUIREMENTS);
		}
		return requirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EASTADLModel getModel() {
		if (eContainerFeatureID() != CorePackage.EASTADL_ARTIFACT__MODEL) return null;
		return (EASTADLModel)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModel(EASTADLModel newModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newModel, CorePackage.EASTADL_ARTIFACT__MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(EASTADLModel newModel) {
		if (newModel != eInternalContainer() || (eContainerFeatureID() != CorePackage.EASTADL_ARTIFACT__MODEL && newModel != null)) {
			if (EcoreUtil.isAncestor(this, newModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newModel != null)
				msgs = ((InternalEObject)newModel).eInverseAdd(this, East_adlPackage.EASTADL_MODEL__ARTIFACTS, EASTADLModel.class, msgs);
			msgs = basicSetModel(newModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.EASTADL_ARTIFACT__MODEL, newModel, newModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SupportEntity> getSupportEntities() {
		if (supportEntities == null) {
			supportEntities = new EObjectContainmentWithInverseEList<SupportEntity>(SupportEntity.class, this, CorePackage.EASTADL_ARTIFACT__SUPPORT_ENTITIES, SupportPackage.SUPPORT_ENTITY__OWNING_ARTIFACT);
		}
		return supportEntities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VVCase> getValidationEntities() {
		if (validationEntities == null) {
			validationEntities = new EObjectContainmentWithInverseEList<VVCase>(VVCase.class, this, CorePackage.EASTADL_ARTIFACT__VALIDATION_ENTITIES, Verification_validationPackage.VV_CASE__OWNING_ARTIFACT);
		}
		return validationEntities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.EASTADL_ARTIFACT__MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetModel((EASTADLModel)otherEnd, msgs);
			case CorePackage.EASTADL_ARTIFACT__SUPPORT_ENTITIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSupportEntities()).basicAdd(otherEnd, msgs);
			case CorePackage.EASTADL_ARTIFACT__VALIDATION_ENTITIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getValidationEntities()).basicAdd(otherEnd, msgs);
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
			case CorePackage.EASTADL_ARTIFACT__REQUIREMENTS:
				return ((InternalEList<?>)getRequirements()).basicRemove(otherEnd, msgs);
			case CorePackage.EASTADL_ARTIFACT__MODEL:
				return basicSetModel(null, msgs);
			case CorePackage.EASTADL_ARTIFACT__SUPPORT_ENTITIES:
				return ((InternalEList<?>)getSupportEntities()).basicRemove(otherEnd, msgs);
			case CorePackage.EASTADL_ARTIFACT__VALIDATION_ENTITIES:
				return ((InternalEList<?>)getValidationEntities()).basicRemove(otherEnd, msgs);
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
			case CorePackage.EASTADL_ARTIFACT__MODEL:
				return eInternalContainer().eInverseRemove(this, East_adlPackage.EASTADL_MODEL__ARTIFACTS, EASTADLModel.class, msgs);
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
			case CorePackage.EASTADL_ARTIFACT__REQUIREMENTS:
				return getRequirements();
			case CorePackage.EASTADL_ARTIFACT__MODEL:
				return getModel();
			case CorePackage.EASTADL_ARTIFACT__SUPPORT_ENTITIES:
				return getSupportEntities();
			case CorePackage.EASTADL_ARTIFACT__VALIDATION_ENTITIES:
				return getValidationEntities();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.EASTADL_ARTIFACT__REQUIREMENTS:
				getRequirements().clear();
				getRequirements().addAll((Collection<? extends Requirement>)newValue);
				return;
			case CorePackage.EASTADL_ARTIFACT__MODEL:
				setModel((EASTADLModel)newValue);
				return;
			case CorePackage.EASTADL_ARTIFACT__SUPPORT_ENTITIES:
				getSupportEntities().clear();
				getSupportEntities().addAll((Collection<? extends SupportEntity>)newValue);
				return;
			case CorePackage.EASTADL_ARTIFACT__VALIDATION_ENTITIES:
				getValidationEntities().clear();
				getValidationEntities().addAll((Collection<? extends VVCase>)newValue);
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
			case CorePackage.EASTADL_ARTIFACT__REQUIREMENTS:
				getRequirements().clear();
				return;
			case CorePackage.EASTADL_ARTIFACT__MODEL:
				setModel((EASTADLModel)null);
				return;
			case CorePackage.EASTADL_ARTIFACT__SUPPORT_ENTITIES:
				getSupportEntities().clear();
				return;
			case CorePackage.EASTADL_ARTIFACT__VALIDATION_ENTITIES:
				getValidationEntities().clear();
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
			case CorePackage.EASTADL_ARTIFACT__REQUIREMENTS:
				return requirements != null && !requirements.isEmpty();
			case CorePackage.EASTADL_ARTIFACT__MODEL:
				return getModel() != null;
			case CorePackage.EASTADL_ARTIFACT__SUPPORT_ENTITIES:
				return supportEntities != null && !supportEntities.isEmpty();
			case CorePackage.EASTADL_ARTIFACT__VALIDATION_ENTITIES:
				return validationEntities != null && !validationEntities.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EASTADLArtifactImpl
