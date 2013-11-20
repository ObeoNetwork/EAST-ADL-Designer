/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Vehicle_feature_modelFactoryImpl extends EFactoryImpl implements Vehicle_feature_modelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Vehicle_feature_modelFactory init() {
		try {
			Vehicle_feature_modelFactory theVehicle_feature_modelFactory = (Vehicle_feature_modelFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.topcased.org/0.11.0/east_adl/structure/vehicle_feature_model"); 
			if (theVehicle_feature_modelFactory != null) {
				return theVehicle_feature_modelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Vehicle_feature_modelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vehicle_feature_modelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Vehicle_feature_modelPackage.VEHICLE_FEATURE_MODEL: return createVehicleFeatureModel();
			case Vehicle_feature_modelPackage.VEHICLE_PARAMETER: return createVehicleParameter();
			case Vehicle_feature_modelPackage.VEHICLE_SET: return createVehicleSet();
			case Vehicle_feature_modelPackage.INCLUSION: return createInclusion();
			case Vehicle_feature_modelPackage.EFEATURE: return createEFeature();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VehicleFeatureModel createVehicleFeatureModel() {
		VehicleFeatureModelImpl vehicleFeatureModel = new VehicleFeatureModelImpl();
		return vehicleFeatureModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VehicleParameter createVehicleParameter() {
		VehicleParameterImpl vehicleParameter = new VehicleParameterImpl();
		return vehicleParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VehicleSet createVehicleSet() {
		VehicleSetImpl vehicleSet = new VehicleSetImpl();
		return vehicleSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inclusion createInclusion() {
		InclusionImpl inclusion = new InclusionImpl();
		return inclusion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EFeature createEFeature() {
		EFeatureImpl eFeature = new EFeatureImpl();
		return eFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vehicle_feature_modelPackage getVehicle_feature_modelPackage() {
		return (Vehicle_feature_modelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Vehicle_feature_modelPackage getPackage() {
		return Vehicle_feature_modelPackage.eINSTANCE;
	}

} //Vehicle_feature_modelFactoryImpl
