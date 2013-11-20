/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.obeonetwork.dsl.east_adl.core.impl.EASTADLNamedElementImpl;

import org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.EFeature;
import org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.Inclusion;
import org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleSet;
import org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.Vehicle_feature_modelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inclusion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.InclusionImpl#getElectronicFeature <em>Electronic Feature</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.InclusionImpl#getVehicleSet <em>Vehicle Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InclusionImpl extends EASTADLNamedElementImpl implements Inclusion {
	/**
	 * The cached value of the '{@link #getElectronicFeature() <em>Electronic Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElectronicFeature()
	 * @generated
	 * @ordered
	 */
	protected EFeature electronicFeature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InclusionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Vehicle_feature_modelPackage.Literals.INCLUSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EFeature getElectronicFeature() {
		return electronicFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElectronicFeature(EFeature newElectronicFeature, NotificationChain msgs) {
		EFeature oldElectronicFeature = electronicFeature;
		electronicFeature = newElectronicFeature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Vehicle_feature_modelPackage.INCLUSION__ELECTRONIC_FEATURE, oldElectronicFeature, newElectronicFeature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElectronicFeature(EFeature newElectronicFeature) {
		if (newElectronicFeature != electronicFeature) {
			NotificationChain msgs = null;
			if (electronicFeature != null)
				msgs = ((InternalEObject)electronicFeature).eInverseRemove(this, Vehicle_feature_modelPackage.EFEATURE__INCLUSIONS, EFeature.class, msgs);
			if (newElectronicFeature != null)
				msgs = ((InternalEObject)newElectronicFeature).eInverseAdd(this, Vehicle_feature_modelPackage.EFEATURE__INCLUSIONS, EFeature.class, msgs);
			msgs = basicSetElectronicFeature(newElectronicFeature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Vehicle_feature_modelPackage.INCLUSION__ELECTRONIC_FEATURE, newElectronicFeature, newElectronicFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VehicleSet getVehicleSet() {
		if (eContainerFeatureID() != Vehicle_feature_modelPackage.INCLUSION__VEHICLE_SET) return null;
		return (VehicleSet)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVehicleSet(VehicleSet newVehicleSet, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newVehicleSet, Vehicle_feature_modelPackage.INCLUSION__VEHICLE_SET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVehicleSet(VehicleSet newVehicleSet) {
		if (newVehicleSet != eInternalContainer() || (eContainerFeatureID() != Vehicle_feature_modelPackage.INCLUSION__VEHICLE_SET && newVehicleSet != null)) {
			if (EcoreUtil.isAncestor(this, newVehicleSet))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newVehicleSet != null)
				msgs = ((InternalEObject)newVehicleSet).eInverseAdd(this, Vehicle_feature_modelPackage.VEHICLE_SET__INCLUSIONS, VehicleSet.class, msgs);
			msgs = basicSetVehicleSet(newVehicleSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Vehicle_feature_modelPackage.INCLUSION__VEHICLE_SET, newVehicleSet, newVehicleSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Vehicle_feature_modelPackage.INCLUSION__ELECTRONIC_FEATURE:
				if (electronicFeature != null)
					msgs = ((InternalEObject)electronicFeature).eInverseRemove(this, Vehicle_feature_modelPackage.EFEATURE__INCLUSIONS, EFeature.class, msgs);
				return basicSetElectronicFeature((EFeature)otherEnd, msgs);
			case Vehicle_feature_modelPackage.INCLUSION__VEHICLE_SET:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetVehicleSet((VehicleSet)otherEnd, msgs);
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
			case Vehicle_feature_modelPackage.INCLUSION__ELECTRONIC_FEATURE:
				return basicSetElectronicFeature(null, msgs);
			case Vehicle_feature_modelPackage.INCLUSION__VEHICLE_SET:
				return basicSetVehicleSet(null, msgs);
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
			case Vehicle_feature_modelPackage.INCLUSION__VEHICLE_SET:
				return eInternalContainer().eInverseRemove(this, Vehicle_feature_modelPackage.VEHICLE_SET__INCLUSIONS, VehicleSet.class, msgs);
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
			case Vehicle_feature_modelPackage.INCLUSION__ELECTRONIC_FEATURE:
				return getElectronicFeature();
			case Vehicle_feature_modelPackage.INCLUSION__VEHICLE_SET:
				return getVehicleSet();
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
			case Vehicle_feature_modelPackage.INCLUSION__ELECTRONIC_FEATURE:
				setElectronicFeature((EFeature)newValue);
				return;
			case Vehicle_feature_modelPackage.INCLUSION__VEHICLE_SET:
				setVehicleSet((VehicleSet)newValue);
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
			case Vehicle_feature_modelPackage.INCLUSION__ELECTRONIC_FEATURE:
				setElectronicFeature((EFeature)null);
				return;
			case Vehicle_feature_modelPackage.INCLUSION__VEHICLE_SET:
				setVehicleSet((VehicleSet)null);
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
			case Vehicle_feature_modelPackage.INCLUSION__ELECTRONIC_FEATURE:
				return electronicFeature != null;
			case Vehicle_feature_modelPackage.INCLUSION__VEHICLE_SET:
				return getVehicleSet() != null;
		}
		return super.eIsSet(featureID);
	}

} //InclusionImpl
