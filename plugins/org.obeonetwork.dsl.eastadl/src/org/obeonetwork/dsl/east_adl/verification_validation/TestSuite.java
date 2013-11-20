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
 * A representation of the model object '<em><b>Test Suite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity gathers all needed in order to test a system.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.verification_validation.TestSuite#getTestCases <em>Test Cases</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.verification_validation.Verification_validationPackage#getTestSuite()
 * @model
 * @generated
 */
public interface TestSuite extends VVCase {
	/**
	 * Returns the value of the '<em><b>Test Cases</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.verification_validation.TestCase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Cases</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Cases</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.Verification_validationPackage#getTestSuite_TestCases()
	 * @model
	 * @generated
	 */
	EList<TestCase> getTestCases();

} // TestSuite
