/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.verification_validation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simulation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity is used for simulation activities. It allows animating the model in order to validate it.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.verification_validation.Simulation#getStimulis <em>Stimulis</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.verification_validation.Simulation#getAbstractionLevel <em>Abstraction Level</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.verification_validation.Simulation#getResults <em>Results</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.verification_validation.Simulation#getOutputs <em>Outputs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.verification_validation.Verification_validationPackage#getSimulation()
 * @model
 * @generated
 */
public interface Simulation extends VVCase {
	/**
	 * Returns the value of the '<em><b>Stimulis</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.verification_validation.Stimuli}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are stimulis (parts) of this simulation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stimulis</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.Verification_validationPackage#getSimulation_Stimulis()
	 * @model containment="true"
	 * @generated
	 */
	EList<Stimuli> getStimulis();

	/**
	 * Returns the value of the '<em><b>Abstraction Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the level of abstraction of the test techniaues (unit testing, module testing, system testing, etc.).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstraction Level</em>' attribute.
	 * @see #setAbstractionLevel(String)
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.Verification_validationPackage#getSimulation_AbstractionLevel()
	 * @model
	 * @generated
	 */
	String getAbstractionLevel();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.verification_validation.Simulation#getAbstractionLevel <em>Abstraction Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstraction Level</em>' attribute.
	 * @see #getAbstractionLevel()
	 * @generated
	 */
	void setAbstractionLevel(String value);

	/**
	 * Returns the value of the '<em><b>Results</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.verification_validation.ActualResult}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are results obtained for this stimulis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Results</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.Verification_validationPackage#getSimulation_Results()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActualResult> getResults();

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.verification_validation.ExpectedOutput}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are output data for this simulation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outputs</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.Verification_validationPackage#getSimulation_Outputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExpectedOutput> getOutputs();

} // Simulation
