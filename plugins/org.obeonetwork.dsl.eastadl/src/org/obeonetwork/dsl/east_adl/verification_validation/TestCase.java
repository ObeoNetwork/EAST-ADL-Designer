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
 * A representation of the model object '<em><b>Test Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is a specific case to test the system used only for testing activity.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.verification_validation.TestCase#getAbstractionLevel <em>Abstraction Level</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.verification_validation.TestCase#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.verification_validation.TestCase#getResults <em>Results</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.verification_validation.TestCase#getOutputs <em>Outputs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.verification_validation.Verification_validationPackage#getTestCase()
 * @model
 * @generated
 */
public interface TestCase extends VVCase {
	/**
	 * Returns the value of the '<em><b>Abstraction Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the level of abstraction of the test techniaues (unit testing, module testing, system testing, etc.).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstraction Level</em>' attribute.
	 * @see #setAbstractionLevel(String)
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.Verification_validationPackage#getTestCase_AbstractionLevel()
	 * @model
	 * @generated
	 */
	String getAbstractionLevel();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.verification_validation.TestCase#getAbstractionLevel <em>Abstraction Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstraction Level</em>' attribute.
	 * @see #getAbstractionLevel()
	 * @generated
	 */
	void setAbstractionLevel(String value);

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.verification_validation.Input}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are input data of this test case.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.Verification_validationPackage#getTestCase_Inputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Input> getInputs();

	/**
	 * Returns the value of the '<em><b>Results</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.verification_validation.ActualResult}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are results obtained for this test case.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Results</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.Verification_validationPackage#getTestCase_Results()
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
	 * These are output data for this test case.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outputs</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.Verification_validationPackage#getTestCase_Outputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExpectedOutput> getOutputs();

} // TestCase
