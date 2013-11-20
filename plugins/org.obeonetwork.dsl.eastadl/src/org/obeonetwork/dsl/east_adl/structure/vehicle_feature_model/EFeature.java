/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model;

import org.eclipse.emf.common.util.EList;

import org.obeonetwork.dsl.east_adl.core.EASTADLEntity;

import org.obeonetwork.dsl.east_adl.requirements.Constraint;
import org.obeonetwork.dsl.east_adl.requirements.DesignConstraint;
import org.obeonetwork.dsl.east_adl.requirements.FunctionalRequirement;
import org.obeonetwork.dsl.east_adl.requirements.Specification;

import org.obeonetwork.dsl.east_adl.structure.common.AllocatableEntity;
import org.obeonetwork.dsl.east_adl.structure.common.RealizedEntity;

import org.obeonetwork.dsl.east_adl.support.ArchivedEntity;

import org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity;

import org.obeonetwork.dsl.east_adl.verification_validation.ValidatedEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EFeature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is the entity used to describe required functionnalities of in-vehicle embedded systems.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.EFeature#isOptional <em>Optional</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.EFeature#isVisibleByCustomer <em>Visible By Customer</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.EFeature#getPassiveSpecifications <em>Passive Specifications</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.EFeature#getPassiveConstraints <em>Passive Constraints</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.EFeature#getSpecifyingFunctionalRequirements <em>Specifying Functional Requirements</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.EFeature#getConstrainingDesignConstraints <em>Constraining Design Constraints</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.EFeature#getInclusions <em>Inclusions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.EFeature#getIncludingVehicleSets <em>Including Vehicle Sets</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.EFeature#getSubFeatures <em>Sub Features</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.EFeature#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.Vehicle_feature_modelPackage#getEFeature()
 * @model annotation="http://www.topcased.org/documentation documentation='This entity may have derived properties that are deleted from graphical view for readability purposes.'"
 * @generated
 */
public interface EFeature extends EASTADLEntity, RealizedEntity, AllocatableEntity, ArchivedEntity, VariantEntity, ValidatedEntity {
	/**
	 * Returns the value of the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute declares whether this electronic feature is optional or not. Allows to model product independant technical variability when decomposing EFeatures into sub-EFeatures.If its value is true, the decision to include this EFeature in the containing EFeature will be done by engineers during design or implementation phases. If the attribute is false, the EFeature must be necessarily included.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Optional</em>' attribute.
	 * @see #setOptional(boolean)
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.Vehicle_feature_modelPackage#getEFeature_Optional()
	 * @model
	 * @generated
	 */
	boolean isOptional();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.EFeature#isOptional <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional</em>' attribute.
	 * @see #isOptional()
	 * @generated
	 */
	void setOptional(boolean value);

	/**
	 * Returns the value of the '<em><b>Visible By Customer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute declares whether this electronic feature is visible by a customer or not. If an EFeature has customer visibility, the decision to include that feature in a certain car or not and the selection of variant is done by the customer. Otherwise these decisions will be taken by engineers or other actors.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Visible By Customer</em>' attribute.
	 * @see #setVisibleByCustomer(boolean)
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.Vehicle_feature_modelPackage#getEFeature_VisibleByCustomer()
	 * @model
	 * @generated
	 */
	boolean isVisibleByCustomer();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.EFeature#isVisibleByCustomer <em>Visible By Customer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visible By Customer</em>' attribute.
	 * @see #isVisibleByCustomer()
	 * @generated
	 */
	void setVisibleByCustomer(boolean value);

	/**
	 * Returns the value of the '<em><b>Passive Specifications</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.requirements.Specification}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.requirements.Specification#getSpecifiedEntity <em>Specified Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are descriptions of what this electronic feature does.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Passive Specifications</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.Vehicle_feature_modelPackage#getEFeature_PassiveSpecifications()
	 * @see org.obeonetwork.dsl.east_adl.requirements.Specification#getSpecifiedEntity
	 * @model opposite="specifiedEntity"
	 * @generated
	 */
	EList<Specification> getPassiveSpecifications();

	/**
	 * Returns the value of the '<em><b>Passive Constraints</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.requirements.Constraint}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.requirements.Constraint#getConstrainedEntity <em>Constrained Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the constraint to be considered for an electronic feature design and implementation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Passive Constraints</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.Vehicle_feature_modelPackage#getEFeature_PassiveConstraints()
	 * @see org.obeonetwork.dsl.east_adl.requirements.Constraint#getConstrainedEntity
	 * @model opposite="constrainedEntity"
	 * @generated
	 */
	EList<Constraint> getPassiveConstraints();

	/**
	 * Returns the value of the '<em><b>Specifying Functional Requirements</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.requirements.FunctionalRequirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is a derived property used to show all functional requirements specifying this entity (if any).
	 * This property will be shown instead of the corresponding specification model objects because it is more explicit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specifying Functional Requirements</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.Vehicle_feature_modelPackage#getEFeature_SpecifyingFunctionalRequirements()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<FunctionalRequirement> getSpecifyingFunctionalRequirements();

	/**
	 * Returns the value of the '<em><b>Constraining Design Constraints</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.requirements.DesignConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is a derived property used to show all design constraints constraining this entity (if any).
	 * This property will be shown instead of the corresponding constraint model objects because it is more explicit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constraining Design Constraints</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.Vehicle_feature_modelPackage#getEFeature_ConstrainingDesignConstraints()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<DesignConstraint> getConstrainingDesignConstraints();

	/**
	 * Returns the value of the '<em><b>Inclusions</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.Inclusion}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.Inclusion#getElectronicFeature <em>Electronic Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are the inclusions including this feature. An inclusion represents a vehicle set.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inclusions</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.Vehicle_feature_modelPackage#getEFeature_Inclusions()
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.Inclusion#getElectronicFeature
	 * @model opposite="electronicFeature"
	 * @generated
	 */
	EList<Inclusion> getInclusions();

	/**
	 * Returns the value of the '<em><b>Including Vehicle Sets</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is a derived property used to show all including vehicle sets of this entity (if any).
	 * This property will be shown instead of the corresponding inclusion model objects because it is more explicit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Including Vehicle Sets</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.Vehicle_feature_modelPackage#getEFeature_IncludingVehicleSets()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<VehicleSet> getIncludingVehicleSets();

	/**
	 * Returns the value of the '<em><b>Sub Features</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.EFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Features</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.Vehicle_feature_modelPackage#getEFeature_SubFeatures()
	 * @model containment="true"
	 * @generated
	 */
	EList<EFeature> getSubFeatures();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.Vehicle_feature_modelPackage#getEFeature_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.EFeature#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // EFeature
