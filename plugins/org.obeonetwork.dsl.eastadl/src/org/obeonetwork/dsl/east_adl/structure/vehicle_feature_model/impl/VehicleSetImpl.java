/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.east_adl.core.impl.EASTADLEntityImpl;

import org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.EFeature;
import org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.Inclusion;
import org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleFeatureModel;
import org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleSet;
import org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.Vehicle_feature_modelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vehicle Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.VehicleSetImpl#getInclusions <em>Inclusions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.VehicleSetImpl#getVehicleInclusionCriterion <em>Vehicle Inclusion Criterion</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.VehicleSetImpl#getOwningArtifact <em>Owning Artifact</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.VehicleSetImpl#getIncludedEFeatures <em>Included EFeatures</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VehicleSetImpl extends EASTADLEntityImpl implements VehicleSet {
	/**
	 * The cached value of the '{@link #getInclusions() <em>Inclusions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInclusions()
	 * @generated
	 * @ordered
	 */
	protected EList<Inclusion> inclusions;

	/**
	 * The default value of the '{@link #getVehicleInclusionCriterion() <em>Vehicle Inclusion Criterion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleInclusionCriterion()
	 * @generated
	 * @ordered
	 */
	protected static final String VEHICLE_INCLUSION_CRITERION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVehicleInclusionCriterion() <em>Vehicle Inclusion Criterion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleInclusionCriterion()
	 * @generated
	 * @ordered
	 */
	protected String vehicleInclusionCriterion = VEHICLE_INCLUSION_CRITERION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VehicleSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Vehicle_feature_modelPackage.Literals.VEHICLE_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Inclusion> getInclusions() {
		if (inclusions == null) {
			inclusions = new EObjectContainmentWithInverseEList<Inclusion>(Inclusion.class, this, Vehicle_feature_modelPackage.VEHICLE_SET__INCLUSIONS, Vehicle_feature_modelPackage.INCLUSION__VEHICLE_SET);
		}
		return inclusions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVehicleInclusionCriterion() {
		return vehicleInclusionCriterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVehicleInclusionCriterion(String newVehicleInclusionCriterion) {
		String oldVehicleInclusionCriterion = vehicleInclusionCriterion;
		vehicleInclusionCriterion = newVehicleInclusionCriterion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Vehicle_feature_modelPackage.VEHICLE_SET__VEHICLE_INCLUSION_CRITERION, oldVehicleInclusionCriterion, vehicleInclusionCriterion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VehicleFeatureModel getOwningArtifact() {
		if (eContainerFeatureID() != Vehicle_feature_modelPackage.VEHICLE_SET__OWNING_ARTIFACT) return null;
		return (VehicleFeatureModel)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningArtifact(VehicleFeatureModel newOwningArtifact, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningArtifact, Vehicle_feature_modelPackage.VEHICLE_SET__OWNING_ARTIFACT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningArtifact(VehicleFeatureModel newOwningArtifact) {
		if (newOwningArtifact != eInternalContainer() || (eContainerFeatureID() != Vehicle_feature_modelPackage.VEHICLE_SET__OWNING_ARTIFACT && newOwningArtifact != null)) {
			if (EcoreUtil.isAncestor(this, newOwningArtifact))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningArtifact != null)
				msgs = ((InternalEObject)newOwningArtifact).eInverseAdd(this, Vehicle_feature_modelPackage.VEHICLE_FEATURE_MODEL__VEHICLE_SETS, VehicleFeatureModel.class, msgs);
			msgs = basicSetOwningArtifact(newOwningArtifact, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Vehicle_feature_modelPackage.VEHICLE_SET__OWNING_ARTIFACT, newOwningArtifact, newOwningArtifact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EFeature> getIncludedEFeatures() {
		// TODO: implement this method to return the 'Included EFeatures' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
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
			case Vehicle_feature_modelPackage.VEHICLE_SET__INCLUSIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInclusions()).basicAdd(otherEnd, msgs);
			case Vehicle_feature_modelPackage.VEHICLE_SET__OWNING_ARTIFACT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningArtifact((VehicleFeatureModel)otherEnd, msgs);
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
			case Vehicle_feature_modelPackage.VEHICLE_SET__INCLUSIONS:
				return ((InternalEList<?>)getInclusions()).basicRemove(otherEnd, msgs);
			case Vehicle_feature_modelPackage.VEHICLE_SET__OWNING_ARTIFACT:
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
			case Vehicle_feature_modelPackage.VEHICLE_SET__OWNING_ARTIFACT:
				return eInternalContainer().eInverseRemove(this, Vehicle_feature_modelPackage.VEHICLE_FEATURE_MODEL__VEHICLE_SETS, VehicleFeatureModel.class, msgs);
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
			case Vehicle_feature_modelPackage.VEHICLE_SET__INCLUSIONS:
				return getInclusions();
			case Vehicle_feature_modelPackage.VEHICLE_SET__VEHICLE_INCLUSION_CRITERION:
				return getVehicleInclusionCriterion();
			case Vehicle_feature_modelPackage.VEHICLE_SET__OWNING_ARTIFACT:
				return getOwningArtifact();
			case Vehicle_feature_modelPackage.VEHICLE_SET__INCLUDED_EFEATURES:
				return getIncludedEFeatures();
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
			case Vehicle_feature_modelPackage.VEHICLE_SET__INCLUSIONS:
				getInclusions().clear();
				getInclusions().addAll((Collection<? extends Inclusion>)newValue);
				return;
			case Vehicle_feature_modelPackage.VEHICLE_SET__VEHICLE_INCLUSION_CRITERION:
				setVehicleInclusionCriterion((String)newValue);
				return;
			case Vehicle_feature_modelPackage.VEHICLE_SET__OWNING_ARTIFACT:
				setOwningArtifact((VehicleFeatureModel)newValue);
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
			case Vehicle_feature_modelPackage.VEHICLE_SET__INCLUSIONS:
				getInclusions().clear();
				return;
			case Vehicle_feature_modelPackage.VEHICLE_SET__VEHICLE_INCLUSION_CRITERION:
				setVehicleInclusionCriterion(VEHICLE_INCLUSION_CRITERION_EDEFAULT);
				return;
			case Vehicle_feature_modelPackage.VEHICLE_SET__OWNING_ARTIFACT:
				setOwningArtifact((VehicleFeatureModel)null);
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
			case Vehicle_feature_modelPackage.VEHICLE_SET__INCLUSIONS:
				return inclusions != null && !inclusions.isEmpty();
			case Vehicle_feature_modelPackage.VEHICLE_SET__VEHICLE_INCLUSION_CRITERION:
				return VEHICLE_INCLUSION_CRITERION_EDEFAULT == null ? vehicleInclusionCriterion != null : !VEHICLE_INCLUSION_CRITERION_EDEFAULT.equals(vehicleInclusionCriterion);
			case Vehicle_feature_modelPackage.VEHICLE_SET__OWNING_ARTIFACT:
				return getOwningArtifact() != null;
			case Vehicle_feature_modelPackage.VEHICLE_SET__INCLUDED_EFEATURES:
				return !getIncludedEFeatures().isEmpty();
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
		result.append(" (vehicleInclusionCriterion: ");
		result.append(vehicleInclusionCriterion);
		result.append(')');
		return result.toString();
	}

} //VehicleSetImpl
