/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.functional_design_architecture;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Functional_design_architecturePackage
 * @generated
 */
public interface Functional_design_architectureFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Functional_design_architectureFactory eINSTANCE = org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.Functional_design_architectureFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Functional Design Architecture</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Functional Design Architecture</em>'.
	 * @generated
	 */
	FunctionalDesignArchitecture createFunctionalDesignArchitecture();

	/**
	 * Returns a new object of class '<em>Elementary Software Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Elementary Software Function</em>'.
	 * @generated
	 */
	ElementarySoftwareFunction createElementarySoftwareFunction();

	/**
	 * Returns a new object of class '<em>Composite Software Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Software Function</em>'.
	 * @generated
	 */
	CompositeSoftwareFunction createCompositeSoftwareFunction();

	/**
	 * Returns a new object of class '<em>Local Device Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Local Device Manager</em>'.
	 * @generated
	 */
	LocalDeviceManager createLocalDeviceManager();

	/**
	 * Returns a new object of class '<em>Precedence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Precedence</em>'.
	 * @generated
	 */
	Precedence createPrecedence();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Functional_design_architecturePackage getFunctional_design_architecturePackage();

} //Functional_design_architectureFactory
