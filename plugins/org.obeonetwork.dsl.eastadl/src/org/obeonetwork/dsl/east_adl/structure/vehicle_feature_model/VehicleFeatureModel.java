/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model;

import org.eclipse.emf.common.util.EList;

import org.obeonetwork.dsl.east_adl.core.EASTADLArtifact;

import org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.FunctionalAnalysisArchitecture;

import org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.FunctionalDesignArchitecture;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vehicle Feature Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity is a top level container for a vehicle product line. It contains a flat list of vehicle parameters that are relevant for the configuration of the embedded electronics (trim, country, etc.), and vehicle sets which describe sets of vehicle instances sharing common properties.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleFeatureModel#getVehicleParameters <em>Vehicle Parameters</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleFeatureModel#getVehicleSets <em>Vehicle Sets</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleFeatureModel#getAnalysisArchitecture <em>Analysis Architecture</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleFeatureModel#getDesignArchitecture <em>Design Architecture</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleFeatureModel#getElectronicFeatures <em>Electronic Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.Vehicle_feature_modelPackage#getVehicleFeatureModel()
 * @model
 * @generated
 */
public interface VehicleFeatureModel extends EASTADLArtifact {
	/**
	 * Returns the value of the '<em><b>Vehicle Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleParameter}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleParameter#getOwningArtifact <em>Owning Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are the vehicle parameters of this model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vehicle Parameters</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.Vehicle_feature_modelPackage#getVehicleFeatureModel_VehicleParameters()
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleParameter#getOwningArtifact
	 * @model opposite="owningArtifact" containment="true"
	 * @generated
	 */
	EList<VehicleParameter> getVehicleParameters();

	/**
	 * Returns the value of the '<em><b>Vehicle Sets</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleSet}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleSet#getOwningArtifact <em>Owning Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are the vehicle sets of this model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vehicle Sets</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.Vehicle_feature_modelPackage#getVehicleFeatureModel_VehicleSets()
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleSet#getOwningArtifact
	 * @model opposite="owningArtifact" containment="true"
	 * @generated
	 */
	EList<VehicleSet> getVehicleSets();

	/**
	 * Returns the value of the '<em><b>Analysis Architecture</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.FunctionalAnalysisArchitecture#getVehicleModel <em>Vehicle Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the analysis model that implements vehicle features of this entity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Analysis Architecture</em>' reference.
	 * @see #setAnalysisArchitecture(FunctionalAnalysisArchitecture)
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.Vehicle_feature_modelPackage#getVehicleFeatureModel_AnalysisArchitecture()
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.FunctionalAnalysisArchitecture#getVehicleModel
	 * @model opposite="vehicleModel"
	 * @generated
	 */
	FunctionalAnalysisArchitecture getAnalysisArchitecture();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleFeatureModel#getAnalysisArchitecture <em>Analysis Architecture</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Analysis Architecture</em>' reference.
	 * @see #getAnalysisArchitecture()
	 * @generated
	 */
	void setAnalysisArchitecture(FunctionalAnalysisArchitecture value);

	/**
	 * Returns the value of the '<em><b>Design Architecture</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.FunctionalDesignArchitecture#getVehicleModel <em>Vehicle Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the design model implementing this entity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Design Architecture</em>' reference.
	 * @see #setDesignArchitecture(FunctionalDesignArchitecture)
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.Vehicle_feature_modelPackage#getVehicleFeatureModel_DesignArchitecture()
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.FunctionalDesignArchitecture#getVehicleModel
	 * @model opposite="vehicleModel"
	 * @generated
	 */
	FunctionalDesignArchitecture getDesignArchitecture();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleFeatureModel#getDesignArchitecture <em>Design Architecture</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Design Architecture</em>' reference.
	 * @see #getDesignArchitecture()
	 * @generated
	 */
	void setDesignArchitecture(FunctionalDesignArchitecture value);

	/**
	 * Returns the value of the '<em><b>Electronic Features</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.EFeature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are electronic features 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Electronic Features</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.Vehicle_feature_modelPackage#getVehicleFeatureModel_ElectronicFeatures()
	 * @model containment="true"
	 * @generated
	 */
	EList<EFeature> getElectronicFeatures();

} // VehicleFeatureModel
