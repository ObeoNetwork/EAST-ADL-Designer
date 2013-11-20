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
 * A representation of the model object '<em><b>Stimuli</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is a compound of a simulation case and it gathers a list of stimuli needed for the stimulation activity.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.verification_validation.Stimuli#getActualResult <em>Actual Result</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.verification_validation.Stimuli#getOutput <em>Output</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.verification_validation.Stimuli#getData <em>Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.verification_validation.Verification_validationPackage#getStimuli()
 * @model
 * @generated
 */
public interface Stimuli extends EASTADLNamedElement {
	/**
	 * Returns the value of the '<em><b>Actual Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the actual result for this stimulis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actual Result</em>' reference.
	 * @see #setActualResult(ActualResult)
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.Verification_validationPackage#getStimuli_ActualResult()
	 * @model
	 * @generated
	 */
	ActualResult getActualResult();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.verification_validation.Stimuli#getActualResult <em>Actual Result</em>}' reference.
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
	 * This is the output expected for this stimulis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output</em>' reference.
	 * @see #setOutput(ExpectedOutput)
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.Verification_validationPackage#getStimuli_Output()
	 * @model
	 * @generated
	 */
	ExpectedOutput getOutput();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.verification_validation.Stimuli#getOutput <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(ExpectedOutput value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the data describing this stimuli.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data</em>' attribute.
	 * @see #setData(String)
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.Verification_validationPackage#getStimuli_Data()
	 * @model
	 * @generated
	 */
	String getData();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.verification_validation.Stimuli#getData <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' attribute.
	 * @see #getData()
	 * @generated
	 */
	void setData(String value);

} // Stimuli
