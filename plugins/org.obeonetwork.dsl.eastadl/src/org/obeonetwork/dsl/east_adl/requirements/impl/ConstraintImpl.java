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

import org.obeonetwork.dsl.east_adl.requirements.Constraint;
import org.obeonetwork.dsl.east_adl.requirements.DesignConstraint;
import org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage;

import org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.EFeature;
import org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.Vehicle_feature_modelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.impl.ConstraintImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.impl.ConstraintImpl#getConstrainedEntity <em>Constrained Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstraintImpl extends EASTADLNamedElementImpl implements Constraint {
	/**
	 * The cached value of the '{@link #getConstrainedEntity() <em>Constrained Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstrainedEntity()
	 * @generated
	 * @ordered
	 */
	protected EFeature constrainedEntity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementsPackage.Literals.CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignConstraint getConstraint() {
		if (eContainerFeatureID() != RequirementsPackage.CONSTRAINT__CONSTRAINT) return null;
		return (DesignConstraint)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstraint(DesignConstraint newConstraint, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newConstraint, RequirementsPackage.CONSTRAINT__CONSTRAINT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraint(DesignConstraint newConstraint) {
		if (newConstraint != eInternalContainer() || (eContainerFeatureID() != RequirementsPackage.CONSTRAINT__CONSTRAINT && newConstraint != null)) {
			if (EcoreUtil.isAncestor(this, newConstraint))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newConstraint != null)
				msgs = ((InternalEObject)newConstraint).eInverseAdd(this, RequirementsPackage.DESIGN_CONSTRAINT__CONSTRAINTS, DesignConstraint.class, msgs);
			msgs = basicSetConstraint(newConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.CONSTRAINT__CONSTRAINT, newConstraint, newConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EFeature getConstrainedEntity() {
		if (constrainedEntity != null && constrainedEntity.eIsProxy()) {
			InternalEObject oldConstrainedEntity = (InternalEObject)constrainedEntity;
			constrainedEntity = (EFeature)eResolveProxy(oldConstrainedEntity);
			if (constrainedEntity != oldConstrainedEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RequirementsPackage.CONSTRAINT__CONSTRAINED_ENTITY, oldConstrainedEntity, constrainedEntity));
			}
		}
		return constrainedEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EFeature basicGetConstrainedEntity() {
		return constrainedEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstrainedEntity(EFeature newConstrainedEntity, NotificationChain msgs) {
		EFeature oldConstrainedEntity = constrainedEntity;
		constrainedEntity = newConstrainedEntity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RequirementsPackage.CONSTRAINT__CONSTRAINED_ENTITY, oldConstrainedEntity, newConstrainedEntity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstrainedEntity(EFeature newConstrainedEntity) {
		if (newConstrainedEntity != constrainedEntity) {
			NotificationChain msgs = null;
			if (constrainedEntity != null)
				msgs = ((InternalEObject)constrainedEntity).eInverseRemove(this, Vehicle_feature_modelPackage.EFEATURE__PASSIVE_CONSTRAINTS, EFeature.class, msgs);
			if (newConstrainedEntity != null)
				msgs = ((InternalEObject)newConstrainedEntity).eInverseAdd(this, Vehicle_feature_modelPackage.EFEATURE__PASSIVE_CONSTRAINTS, EFeature.class, msgs);
			msgs = basicSetConstrainedEntity(newConstrainedEntity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.CONSTRAINT__CONSTRAINED_ENTITY, newConstrainedEntity, newConstrainedEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RequirementsPackage.CONSTRAINT__CONSTRAINT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetConstraint((DesignConstraint)otherEnd, msgs);
			case RequirementsPackage.CONSTRAINT__CONSTRAINED_ENTITY:
				if (constrainedEntity != null)
					msgs = ((InternalEObject)constrainedEntity).eInverseRemove(this, Vehicle_feature_modelPackage.EFEATURE__PASSIVE_CONSTRAINTS, EFeature.class, msgs);
				return basicSetConstrainedEntity((EFeature)otherEnd, msgs);
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
			case RequirementsPackage.CONSTRAINT__CONSTRAINT:
				return basicSetConstraint(null, msgs);
			case RequirementsPackage.CONSTRAINT__CONSTRAINED_ENTITY:
				return basicSetConstrainedEntity(null, msgs);
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
			case RequirementsPackage.CONSTRAINT__CONSTRAINT:
				return eInternalContainer().eInverseRemove(this, RequirementsPackage.DESIGN_CONSTRAINT__CONSTRAINTS, DesignConstraint.class, msgs);
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
			case RequirementsPackage.CONSTRAINT__CONSTRAINT:
				return getConstraint();
			case RequirementsPackage.CONSTRAINT__CONSTRAINED_ENTITY:
				if (resolve) return getConstrainedEntity();
				return basicGetConstrainedEntity();
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
			case RequirementsPackage.CONSTRAINT__CONSTRAINT:
				setConstraint((DesignConstraint)newValue);
				return;
			case RequirementsPackage.CONSTRAINT__CONSTRAINED_ENTITY:
				setConstrainedEntity((EFeature)newValue);
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
			case RequirementsPackage.CONSTRAINT__CONSTRAINT:
				setConstraint((DesignConstraint)null);
				return;
			case RequirementsPackage.CONSTRAINT__CONSTRAINED_ENTITY:
				setConstrainedEntity((EFeature)null);
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
			case RequirementsPackage.CONSTRAINT__CONSTRAINT:
				return getConstraint() != null;
			case RequirementsPackage.CONSTRAINT__CONSTRAINED_ENTITY:
				return constrainedEntity != null;
		}
		return super.eIsSet(featureID);
	}

} //ConstraintImpl
