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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.east_adl.core.impl.EASTADLArtifactImpl;

import org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.FunctionalAnalysisArchitecture;
import org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.Functional_analysis_architecturePackage;

import org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.FunctionalDesignArchitecture;
import org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Functional_design_architecturePackage;

import org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.EFeature;
import org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleFeatureModel;
import org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleParameter;
import org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleSet;
import org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.Vehicle_feature_modelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vehicle Feature Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.VehicleFeatureModelImpl#getVehicleParameters <em>Vehicle Parameters</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.VehicleFeatureModelImpl#getVehicleSets <em>Vehicle Sets</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.VehicleFeatureModelImpl#getAnalysisArchitecture <em>Analysis Architecture</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.VehicleFeatureModelImpl#getDesignArchitecture <em>Design Architecture</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.VehicleFeatureModelImpl#getElectronicFeatures <em>Electronic Features</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VehicleFeatureModelImpl extends EASTADLArtifactImpl implements VehicleFeatureModel {
	/**
	 * The cached value of the '{@link #getVehicleParameters() <em>Vehicle Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<VehicleParameter> vehicleParameters;

	/**
	 * The cached value of the '{@link #getVehicleSets() <em>Vehicle Sets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleSets()
	 * @generated
	 * @ordered
	 */
	protected EList<VehicleSet> vehicleSets;

	/**
	 * The cached value of the '{@link #getAnalysisArchitecture() <em>Analysis Architecture</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalysisArchitecture()
	 * @generated
	 * @ordered
	 */
	protected FunctionalAnalysisArchitecture analysisArchitecture;

	/**
	 * The cached value of the '{@link #getDesignArchitecture() <em>Design Architecture</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignArchitecture()
	 * @generated
	 * @ordered
	 */
	protected FunctionalDesignArchitecture designArchitecture;

	/**
	 * The cached value of the '{@link #getElectronicFeatures() <em>Electronic Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElectronicFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<EFeature> electronicFeatures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VehicleFeatureModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Vehicle_feature_modelPackage.Literals.VEHICLE_FEATURE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VehicleParameter> getVehicleParameters() {
		if (vehicleParameters == null) {
			vehicleParameters = new EObjectContainmentWithInverseEList<VehicleParameter>(VehicleParameter.class, this, Vehicle_feature_modelPackage.VEHICLE_FEATURE_MODEL__VEHICLE_PARAMETERS, Vehicle_feature_modelPackage.VEHICLE_PARAMETER__OWNING_ARTIFACT);
		}
		return vehicleParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VehicleSet> getVehicleSets() {
		if (vehicleSets == null) {
			vehicleSets = new EObjectContainmentWithInverseEList<VehicleSet>(VehicleSet.class, this, Vehicle_feature_modelPackage.VEHICLE_FEATURE_MODEL__VEHICLE_SETS, Vehicle_feature_modelPackage.VEHICLE_SET__OWNING_ARTIFACT);
		}
		return vehicleSets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalAnalysisArchitecture getAnalysisArchitecture() {
		if (analysisArchitecture != null && analysisArchitecture.eIsProxy()) {
			InternalEObject oldAnalysisArchitecture = (InternalEObject)analysisArchitecture;
			analysisArchitecture = (FunctionalAnalysisArchitecture)eResolveProxy(oldAnalysisArchitecture);
			if (analysisArchitecture != oldAnalysisArchitecture) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Vehicle_feature_modelPackage.VEHICLE_FEATURE_MODEL__ANALYSIS_ARCHITECTURE, oldAnalysisArchitecture, analysisArchitecture));
			}
		}
		return analysisArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalAnalysisArchitecture basicGetAnalysisArchitecture() {
		return analysisArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnalysisArchitecture(FunctionalAnalysisArchitecture newAnalysisArchitecture, NotificationChain msgs) {
		FunctionalAnalysisArchitecture oldAnalysisArchitecture = analysisArchitecture;
		analysisArchitecture = newAnalysisArchitecture;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Vehicle_feature_modelPackage.VEHICLE_FEATURE_MODEL__ANALYSIS_ARCHITECTURE, oldAnalysisArchitecture, newAnalysisArchitecture);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnalysisArchitecture(FunctionalAnalysisArchitecture newAnalysisArchitecture) {
		if (newAnalysisArchitecture != analysisArchitecture) {
			NotificationChain msgs = null;
			if (analysisArchitecture != null)
				msgs = ((InternalEObject)analysisArchitecture).eInverseRemove(this, Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__VEHICLE_MODEL, FunctionalAnalysisArchitecture.class, msgs);
			if (newAnalysisArchitecture != null)
				msgs = ((InternalEObject)newAnalysisArchitecture).eInverseAdd(this, Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__VEHICLE_MODEL, FunctionalAnalysisArchitecture.class, msgs);
			msgs = basicSetAnalysisArchitecture(newAnalysisArchitecture, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Vehicle_feature_modelPackage.VEHICLE_FEATURE_MODEL__ANALYSIS_ARCHITECTURE, newAnalysisArchitecture, newAnalysisArchitecture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalDesignArchitecture getDesignArchitecture() {
		if (designArchitecture != null && designArchitecture.eIsProxy()) {
			InternalEObject oldDesignArchitecture = (InternalEObject)designArchitecture;
			designArchitecture = (FunctionalDesignArchitecture)eResolveProxy(oldDesignArchitecture);
			if (designArchitecture != oldDesignArchitecture) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Vehicle_feature_modelPackage.VEHICLE_FEATURE_MODEL__DESIGN_ARCHITECTURE, oldDesignArchitecture, designArchitecture));
			}
		}
		return designArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalDesignArchitecture basicGetDesignArchitecture() {
		return designArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDesignArchitecture(FunctionalDesignArchitecture newDesignArchitecture, NotificationChain msgs) {
		FunctionalDesignArchitecture oldDesignArchitecture = designArchitecture;
		designArchitecture = newDesignArchitecture;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Vehicle_feature_modelPackage.VEHICLE_FEATURE_MODEL__DESIGN_ARCHITECTURE, oldDesignArchitecture, newDesignArchitecture);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesignArchitecture(FunctionalDesignArchitecture newDesignArchitecture) {
		if (newDesignArchitecture != designArchitecture) {
			NotificationChain msgs = null;
			if (designArchitecture != null)
				msgs = ((InternalEObject)designArchitecture).eInverseRemove(this, Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__VEHICLE_MODEL, FunctionalDesignArchitecture.class, msgs);
			if (newDesignArchitecture != null)
				msgs = ((InternalEObject)newDesignArchitecture).eInverseAdd(this, Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__VEHICLE_MODEL, FunctionalDesignArchitecture.class, msgs);
			msgs = basicSetDesignArchitecture(newDesignArchitecture, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Vehicle_feature_modelPackage.VEHICLE_FEATURE_MODEL__DESIGN_ARCHITECTURE, newDesignArchitecture, newDesignArchitecture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EFeature> getElectronicFeatures() {
		if (electronicFeatures == null) {
			electronicFeatures = new EObjectContainmentEList<EFeature>(EFeature.class, this, Vehicle_feature_modelPackage.VEHICLE_FEATURE_MODEL__ELECTRONIC_FEATURES);
		}
		return electronicFeatures;
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
			case Vehicle_feature_modelPackage.VEHICLE_FEATURE_MODEL__VEHICLE_PARAMETERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVehicleParameters()).basicAdd(otherEnd, msgs);
			case Vehicle_feature_modelPackage.VEHICLE_FEATURE_MODEL__VEHICLE_SETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVehicleSets()).basicAdd(otherEnd, msgs);
			case Vehicle_feature_modelPackage.VEHICLE_FEATURE_MODEL__ANALYSIS_ARCHITECTURE:
				if (analysisArchitecture != null)
					msgs = ((InternalEObject)analysisArchitecture).eInverseRemove(this, Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__VEHICLE_MODEL, FunctionalAnalysisArchitecture.class, msgs);
				return basicSetAnalysisArchitecture((FunctionalAnalysisArchitecture)otherEnd, msgs);
			case Vehicle_feature_modelPackage.VEHICLE_FEATURE_MODEL__DESIGN_ARCHITECTURE:
				if (designArchitecture != null)
					msgs = ((InternalEObject)designArchitecture).eInverseRemove(this, Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__VEHICLE_MODEL, FunctionalDesignArchitecture.class, msgs);
				return basicSetDesignArchitecture((FunctionalDesignArchitecture)otherEnd, msgs);
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
			case Vehicle_feature_modelPackage.VEHICLE_FEATURE_MODEL__VEHICLE_PARAMETERS:
				return ((InternalEList<?>)getVehicleParameters()).basicRemove(otherEnd, msgs);
			case Vehicle_feature_modelPackage.VEHICLE_FEATURE_MODEL__VEHICLE_SETS:
				return ((InternalEList<?>)getVehicleSets()).basicRemove(otherEnd, msgs);
			case Vehicle_feature_modelPackage.VEHICLE_FEATURE_MODEL__ANALYSIS_ARCHITECTURE:
				return basicSetAnalysisArchitecture(null, msgs);
			case Vehicle_feature_modelPackage.VEHICLE_FEATURE_MODEL__DESIGN_ARCHITECTURE:
				return basicSetDesignArchitecture(null, msgs);
			case Vehicle_feature_modelPackage.VEHICLE_FEATURE_MODEL__ELECTRONIC_FEATURES:
				return ((InternalEList<?>)getElectronicFeatures()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Vehicle_feature_modelPackage.VEHICLE_FEATURE_MODEL__VEHICLE_PARAMETERS:
				return getVehicleParameters();
			case Vehicle_feature_modelPackage.VEHICLE_FEATURE_MODEL__VEHICLE_SETS:
				return getVehicleSets();
			case Vehicle_feature_modelPackage.VEHICLE_FEATURE_MODEL__ANALYSIS_ARCHITECTURE:
				if (resolve) return getAnalysisArchitecture();
				return basicGetAnalysisArchitecture();
			case Vehicle_feature_modelPackage.VEHICLE_FEATURE_MODEL__DESIGN_ARCHITECTURE:
				if (resolve) return getDesignArchitecture();
				return basicGetDesignArchitecture();
			case Vehicle_feature_modelPackage.VEHICLE_FEATURE_MODEL__ELECTRONIC_FEATURES:
				return getElectronicFeatures();
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
			case Vehicle_feature_modelPackage.VEHICLE_FEATURE_MODEL__VEHICLE_PARAMETERS:
				getVehicleParameters().clear();
				getVehicleParameters().addAll((Collection<? extends VehicleParameter>)newValue);
				return;
			case Vehicle_feature_modelPackage.VEHICLE_FEATURE_MODEL__VEHICLE_SETS:
				getVehicleSets().clear();
				getVehicleSets().addAll((Collection<? extends VehicleSet>)newValue);
				return;
			case Vehicle_feature_modelPackage.VEHICLE_FEATURE_MODEL__ANALYSIS_ARCHITECTURE:
				setAnalysisArchitecture((FunctionalAnalysisArchitecture)newValue);
				return;
			case Vehicle_feature_modelPackage.VEHICLE_FEATURE_MODEL__DESIGN_ARCHITECTURE:
				setDesignArchitecture((FunctionalDesignArchitecture)newValue);
				return;
			case Vehicle_feature_modelPackage.VEHICLE_FEATURE_MODEL__ELECTRONIC_FEATURES:
				getElectronicFeatures().clear();
				getElectronicFeatures().addAll((Collection<? extends EFeature>)newValue);
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
			case Vehicle_feature_modelPackage.VEHICLE_FEATURE_MODEL__VEHICLE_PARAMETERS:
				getVehicleParameters().clear();
				return;
			case Vehicle_feature_modelPackage.VEHICLE_FEATURE_MODEL__VEHICLE_SETS:
				getVehicleSets().clear();
				return;
			case Vehicle_feature_modelPackage.VEHICLE_FEATURE_MODEL__ANALYSIS_ARCHITECTURE:
				setAnalysisArchitecture((FunctionalAnalysisArchitecture)null);
				return;
			case Vehicle_feature_modelPackage.VEHICLE_FEATURE_MODEL__DESIGN_ARCHITECTURE:
				setDesignArchitecture((FunctionalDesignArchitecture)null);
				return;
			case Vehicle_feature_modelPackage.VEHICLE_FEATURE_MODEL__ELECTRONIC_FEATURES:
				getElectronicFeatures().clear();
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
			case Vehicle_feature_modelPackage.VEHICLE_FEATURE_MODEL__VEHICLE_PARAMETERS:
				return vehicleParameters != null && !vehicleParameters.isEmpty();
			case Vehicle_feature_modelPackage.VEHICLE_FEATURE_MODEL__VEHICLE_SETS:
				return vehicleSets != null && !vehicleSets.isEmpty();
			case Vehicle_feature_modelPackage.VEHICLE_FEATURE_MODEL__ANALYSIS_ARCHITECTURE:
				return analysisArchitecture != null;
			case Vehicle_feature_modelPackage.VEHICLE_FEATURE_MODEL__DESIGN_ARCHITECTURE:
				return designArchitecture != null;
			case Vehicle_feature_modelPackage.VEHICLE_FEATURE_MODEL__ELECTRONIC_FEATURES:
				return electronicFeatures != null && !electronicFeatures.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VehicleFeatureModelImpl
