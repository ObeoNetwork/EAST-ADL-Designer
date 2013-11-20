/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model;

import org.eclipse.emf.common.util.EList;

import org.obeonetwork.dsl.east_adl.core.EASTADLEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vehicle Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity represents all vehicles with certain properties declared in the inclusion criterion attribute.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleSet#getInclusions <em>Inclusions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleSet#getVehicleInclusionCriterion <em>Vehicle Inclusion Criterion</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleSet#getOwningArtifact <em>Owning Artifact</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleSet#getIncludedEFeatures <em>Included EFeatures</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.Vehicle_feature_modelPackage#getVehicleSet()
 * @model annotation="http://www.topcased.org/documentation documentation='This entity may have derived properties that are deleted from graphical view for readability purposes.'"
 * @generated
 */
public interface VehicleSet extends EASTADLEntity {
	/**
	 * Returns the value of the '<em><b>Inclusions</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.Inclusion}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.Inclusion#getVehicleSet <em>Vehicle Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are the inclusions objects that belong to the vehicle set. An inclusion is used to include an electronic feature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inclusions</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.Vehicle_feature_modelPackage#getVehicleSet_Inclusions()
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.Inclusion#getVehicleSet
	 * @model opposite="vehicleSet" containment="true"
	 * @generated
	 */
	EList<Inclusion> getInclusions();

	/**
	 * Returns the value of the '<em><b>Vehicle Inclusion Criterion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute is a condition that refers to the vehicle parameters (!) and can be tested for a specific vehicle.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vehicle Inclusion Criterion</em>' attribute.
	 * @see #setVehicleInclusionCriterion(String)
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.Vehicle_feature_modelPackage#getVehicleSet_VehicleInclusionCriterion()
	 * @model annotation="http://www.topcased.org/documentation documentation='I would not choose this solution to the problem.'"
	 * @generated
	 */
	String getVehicleInclusionCriterion();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleSet#getVehicleInclusionCriterion <em>Vehicle Inclusion Criterion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vehicle Inclusion Criterion</em>' attribute.
	 * @see #getVehicleInclusionCriterion()
	 * @generated
	 */
	void setVehicleInclusionCriterion(String value);

	/**
	 * Returns the value of the '<em><b>Owning Artifact</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleFeatureModel#getVehicleSets <em>Vehicle Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the artifact to which this vehicle set belongs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Artifact</em>' container reference.
	 * @see #setOwningArtifact(VehicleFeatureModel)
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.Vehicle_feature_modelPackage#getVehicleSet_OwningArtifact()
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleFeatureModel#getVehicleSets
	 * @model opposite="vehicleSets" required="true" transient="false"
	 * @generated
	 */
	VehicleFeatureModel getOwningArtifact();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleSet#getOwningArtifact <em>Owning Artifact</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Artifact</em>' container reference.
	 * @see #getOwningArtifact()
	 * @generated
	 */
	void setOwningArtifact(VehicleFeatureModel value);

	/**
	 * Returns the value of the '<em><b>Included EFeatures</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.EFeature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is a derived property used to show all included electronic features of this entity (if any).
	 * This property will be shown instead of the corresponding inclusion model objects because it is more explicit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Included EFeatures</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.Vehicle_feature_modelPackage#getVehicleSet_IncludedEFeatures()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<EFeature> getIncludedEFeatures();

} // VehicleSet
