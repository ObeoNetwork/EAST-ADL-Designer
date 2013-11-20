/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model;

import org.obeonetwork.dsl.east_adl.core.EASTADLNamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inclusion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity allows linking a vehicle set and an EFeature.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.Inclusion#getElectronicFeature <em>Electronic Feature</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.Inclusion#getVehicleSet <em>Vehicle Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.Vehicle_feature_modelPackage#getInclusion()
 * @model
 * @generated
 */
public interface Inclusion extends EASTADLNamedElement {
	/**
	 * Returns the value of the '<em><b>Electronic Feature</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.EFeature#getInclusions <em>Inclusions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the electronic feature included by the vehicle set of this inclusion.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Electronic Feature</em>' reference.
	 * @see #setElectronicFeature(EFeature)
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.Vehicle_feature_modelPackage#getInclusion_ElectronicFeature()
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.EFeature#getInclusions
	 * @model opposite="inclusions" resolveProxies="false"
	 * @generated
	 */
	EFeature getElectronicFeature();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.Inclusion#getElectronicFeature <em>Electronic Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Electronic Feature</em>' reference.
	 * @see #getElectronicFeature()
	 * @generated
	 */
	void setElectronicFeature(EFeature value);

	/**
	 * Returns the value of the '<em><b>Vehicle Set</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleSet#getInclusions <em>Inclusions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All vehicles belonging to this set must implement included EFeatures.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vehicle Set</em>' container reference.
	 * @see #setVehicleSet(VehicleSet)
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.Vehicle_feature_modelPackage#getInclusion_VehicleSet()
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleSet#getInclusions
	 * @model opposite="inclusions" required="true" transient="false"
	 * @generated
	 */
	VehicleSet getVehicleSet();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.Inclusion#getVehicleSet <em>Vehicle Set</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vehicle Set</em>' container reference.
	 * @see #getVehicleSet()
	 * @generated
	 */
	void setVehicleSet(VehicleSet value);

} // Inclusion
