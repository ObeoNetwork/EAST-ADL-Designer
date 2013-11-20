/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.Functional_analysis_architecturePackage
 * @generated
 */
public interface Functional_analysis_architectureFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Functional_analysis_architectureFactory eINSTANCE = org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl.Functional_analysis_architectureFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Functional Analysis Architecture</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Functional Analysis Architecture</em>'.
	 * @generated
	 */
	FunctionalAnalysisArchitecture createFunctionalAnalysisArchitecture();

	/**
	 * Returns a new object of class '<em>Analysis Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Analysis Function</em>'.
	 * @generated
	 */
	AnalysisFunction createAnalysisFunction();

	/**
	 * Returns a new object of class '<em>Functional Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Functional Device</em>'.
	 * @generated
	 */
	FunctionalDevice createFunctionalDevice();

	/**
	 * Returns a new object of class '<em>Environment Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Environment Function</em>'.
	 * @generated
	 */
	EnvironmentFunction createEnvironmentFunction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Functional_analysis_architecturePackage getFunctional_analysis_architecturePackage();

} //Functional_analysis_architectureFactory
