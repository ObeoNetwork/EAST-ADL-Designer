/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.Vehicle_feature_modelPackage
 * @generated
 */
public interface Vehicle_feature_modelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Vehicle_feature_modelFactory eINSTANCE = org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.Vehicle_feature_modelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Vehicle Feature Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vehicle Feature Model</em>'.
	 * @generated
	 */
	VehicleFeatureModel createVehicleFeatureModel();

	/**
	 * Returns a new object of class '<em>Vehicle Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vehicle Parameter</em>'.
	 * @generated
	 */
	VehicleParameter createVehicleParameter();

	/**
	 * Returns a new object of class '<em>Vehicle Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vehicle Set</em>'.
	 * @generated
	 */
	VehicleSet createVehicleSet();

	/**
	 * Returns a new object of class '<em>Inclusion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inclusion</em>'.
	 * @generated
	 */
	Inclusion createInclusion();

	/**
	 * Returns a new object of class '<em>EFeature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EFeature</em>'.
	 * @generated
	 */
	EFeature createEFeature();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Vehicle_feature_modelPackage getVehicle_feature_modelPackage();

} //Vehicle_feature_modelFactory
