/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model;

import org.obeonetwork.dsl.east_adl.core.EASTADLEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vehicle Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity is used to describe general vehicle characteristics that may affect the actual configuration of the embedded electronics. It may be also a customer selectable attribute.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleParameter#isCustomerChoice <em>Customer Choice</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleParameter#getType <em>Type</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleParameter#getOwningArtifact <em>Owning Artifact</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.Vehicle_feature_modelPackage#getVehicleParameter()
 * @model annotation="http://www.topcased.org/documentation documentation='See vehicle inclusion criterion command.'"
 * @generated
 */
public interface VehicleParameter extends EASTADLEntity {
	/**
	 * Returns the value of the '<em><b>Customer Choice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute is used to declare if this parameter is a choice usually done by the customer. This is only for reference and has no technical impact on the system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Customer Choice</em>' attribute.
	 * @see #setCustomerChoice(boolean)
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.Vehicle_feature_modelPackage#getVehicleParameter_CustomerChoice()
	 * @model
	 * @generated
	 */
	boolean isCustomerChoice();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleParameter#isCustomerChoice <em>Customer Choice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Choice</em>' attribute.
	 * @see #isCustomerChoice()
	 * @generated
	 */
	void setCustomerChoice(boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute is the type of the vehicle parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.Vehicle_feature_modelPackage#getVehicleParameter_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleParameter#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Owning Artifact</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleFeatureModel#getVehicleParameters <em>Vehicle Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the artifact to which this vehicle parameter belongs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Artifact</em>' container reference.
	 * @see #setOwningArtifact(VehicleFeatureModel)
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.Vehicle_feature_modelPackage#getVehicleParameter_OwningArtifact()
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleFeatureModel#getVehicleParameters
	 * @model opposite="vehicleParameters" required="true" transient="false"
	 * @generated
	 */
	VehicleFeatureModel getOwningArtifact();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleParameter#getOwningArtifact <em>Owning Artifact</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Artifact</em>' container reference.
	 * @see #getOwningArtifact()
	 * @generated
	 */
	void setOwningArtifact(VehicleFeatureModel value);

} // VehicleParameter
