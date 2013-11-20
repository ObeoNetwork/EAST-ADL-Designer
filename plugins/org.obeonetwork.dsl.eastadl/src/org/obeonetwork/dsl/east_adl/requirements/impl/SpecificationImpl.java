/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.requirements.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.obeonetwork.dsl.east_adl.core.impl.EASTADLNamedElementImpl;

import org.obeonetwork.dsl.east_adl.requirements.FunctionalRequirement;
import org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage;
import org.obeonetwork.dsl.east_adl.requirements.Specification;

import org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.EFeature;
import org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.Vehicle_feature_modelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.impl.SpecificationImpl#getFunctionalRequirement <em>Functional Requirement</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.impl.SpecificationImpl#getSpecifiedEntity <em>Specified Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpecificationImpl extends EASTADLNamedElementImpl implements Specification {
	/**
	 * The cached value of the '{@link #getSpecifiedEntity() <em>Specified Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecifiedEntity()
	 * @generated
	 * @ordered
	 */
	protected EFeature specifiedEntity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementsPackage.Literals.SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalRequirement getFunctionalRequirement() {
		if (eContainerFeatureID() != RequirementsPackage.SPECIFICATION__FUNCTIONAL_REQUIREMENT) return null;
		return (FunctionalRequirement)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFunctionalRequirement(FunctionalRequirement newFunctionalRequirement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newFunctionalRequirement, RequirementsPackage.SPECIFICATION__FUNCTIONAL_REQUIREMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctionalRequirement(FunctionalRequirement newFunctionalRequirement) {
		if (newFunctionalRequirement != eInternalContainer() || (eContainerFeatureID() != RequirementsPackage.SPECIFICATION__FUNCTIONAL_REQUIREMENT && newFunctionalRequirement != null)) {
			if (EcoreUtil.isAncestor(this, newFunctionalRequirement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFunctionalRequirement != null)
				msgs = ((InternalEObject)newFunctionalRequirement).eInverseAdd(this, RequirementsPackage.FUNCTIONAL_REQUIREMENT__SPECIFICATIONS, FunctionalRequirement.class, msgs);
			msgs = basicSetFunctionalRequirement(newFunctionalRequirement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.SPECIFICATION__FUNCTIONAL_REQUIREMENT, newFunctionalRequirement, newFunctionalRequirement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EFeature getSpecifiedEntity() {
		if (specifiedEntity != null && specifiedEntity.eIsProxy()) {
			InternalEObject oldSpecifiedEntity = (InternalEObject)specifiedEntity;
			specifiedEntity = (EFeature)eResolveProxy(oldSpecifiedEntity);
			if (specifiedEntity != oldSpecifiedEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RequirementsPackage.SPECIFICATION__SPECIFIED_ENTITY, oldSpecifiedEntity, specifiedEntity));
			}
		}
		return specifiedEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EFeature basicGetSpecifiedEntity() {
		return specifiedEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecifiedEntity(EFeature newSpecifiedEntity, NotificationChain msgs) {
		EFeature oldSpecifiedEntity = specifiedEntity;
		specifiedEntity = newSpecifiedEntity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RequirementsPackage.SPECIFICATION__SPECIFIED_ENTITY, oldSpecifiedEntity, newSpecifiedEntity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecifiedEntity(EFeature newSpecifiedEntity) {
		if (newSpecifiedEntity != specifiedEntity) {
			NotificationChain msgs = null;
			if (specifiedEntity != null)
				msgs = ((InternalEObject)specifiedEntity).eInverseRemove(this, Vehicle_feature_modelPackage.EFEATURE__PASSIVE_SPECIFICATIONS, EFeature.class, msgs);
			if (newSpecifiedEntity != null)
				msgs = ((InternalEObject)newSpecifiedEntity).eInverseAdd(this, Vehicle_feature_modelPackage.EFEATURE__PASSIVE_SPECIFICATIONS, EFeature.class, msgs);
			msgs = basicSetSpecifiedEntity(newSpecifiedEntity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.SPECIFICATION__SPECIFIED_ENTITY, newSpecifiedEntity, newSpecifiedEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RequirementsPackage.SPECIFICATION__FUNCTIONAL_REQUIREMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetFunctionalRequirement((FunctionalRequirement)otherEnd, msgs);
			case RequirementsPackage.SPECIFICATION__SPECIFIED_ENTITY:
				if (specifiedEntity != null)
					msgs = ((InternalEObject)specifiedEntity).eInverseRemove(this, Vehicle_feature_modelPackage.EFEATURE__PASSIVE_SPECIFICATIONS, EFeature.class, msgs);
				return basicSetSpecifiedEntity((EFeature)otherEnd, msgs);
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
			case RequirementsPackage.SPECIFICATION__FUNCTIONAL_REQUIREMENT:
				return basicSetFunctionalRequirement(null, msgs);
			case RequirementsPackage.SPECIFICATION__SPECIFIED_ENTITY:
				return basicSetSpecifiedEntity(null, msgs);
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
			case RequirementsPackage.SPECIFICATION__FUNCTIONAL_REQUIREMENT:
				return eInternalContainer().eInverseRemove(this, RequirementsPackage.FUNCTIONAL_REQUIREMENT__SPECIFICATIONS, FunctionalRequirement.class, msgs);
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
			case RequirementsPackage.SPECIFICATION__FUNCTIONAL_REQUIREMENT:
				return getFunctionalRequirement();
			case RequirementsPackage.SPECIFICATION__SPECIFIED_ENTITY:
				if (resolve) return getSpecifiedEntity();
				return basicGetSpecifiedEntity();
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
			case RequirementsPackage.SPECIFICATION__FUNCTIONAL_REQUIREMENT:
				setFunctionalRequirement((FunctionalRequirement)newValue);
				return;
			case RequirementsPackage.SPECIFICATION__SPECIFIED_ENTITY:
				setSpecifiedEntity((EFeature)newValue);
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
			case RequirementsPackage.SPECIFICATION__FUNCTIONAL_REQUIREMENT:
				setFunctionalRequirement((FunctionalRequirement)null);
				return;
			case RequirementsPackage.SPECIFICATION__SPECIFIED_ENTITY:
				setSpecifiedEntity((EFeature)null);
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
			case RequirementsPackage.SPECIFICATION__FUNCTIONAL_REQUIREMENT:
				return getFunctionalRequirement() != null;
			case RequirementsPackage.SPECIFICATION__SPECIFIED_ENTITY:
				return specifiedEntity != null;
		}
		return super.eIsSet(featureID);
	}

} //SpecificationImpl
