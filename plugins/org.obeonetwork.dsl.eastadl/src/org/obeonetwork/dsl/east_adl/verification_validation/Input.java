/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.verification_validation;

import org.obeonetwork.dsl.east_adl.core.EASTADLNamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity summarizes each input corresponding to the test case associated and associated to the implementation tested.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.verification_validation.Input#getActualResult <em>Actual Result</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.verification_validation.Input#getOutput <em>Output</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.verification_validation.Input#getScenario <em>Scenario</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.verification_validation.Verification_validationPackage#getInput()
 * @model
 * @generated
 */
public interface Input extends EASTADLNamedElement {
	/**
	 * Returns the value of the '<em><b>Actual Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the actual result for this input.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actual Result</em>' reference.
	 * @see #setActualResult(ActualResult)
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.Verification_validationPackage#getInput_ActualResult()
	 * @model
	 * @generated
	 */
	ActualResult getActualResult();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.verification_validation.Input#getActualResult <em>Actual Result</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Result</em>' reference.
	 * @see #getActualResult()
	 * @generated
	 */
	void setActualResult(ActualResult value);

	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the output expected for this input data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output</em>' reference.
	 * @see #setOutput(ExpectedOutput)
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.Verification_validationPackage#getInput_Output()
	 * @model
	 * @generated
	 */
	ExpectedOutput getOutput();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.verification_validation.Input#getOutput <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(ExpectedOutput value);

	/**
	 * Returns the value of the '<em><b>Scenario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the scenario for this input.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scenario</em>' attribute.
	 * @see #setScenario(String)
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.Verification_validationPackage#getInput_Scenario()
	 * @model
	 * @generated
	 */
	String getScenario();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.verification_validation.Input#getScenario <em>Scenario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scenario</em>' attribute.
	 * @see #getScenario()
	 * @generated
	 */
	void setScenario(String value);

} // Input
