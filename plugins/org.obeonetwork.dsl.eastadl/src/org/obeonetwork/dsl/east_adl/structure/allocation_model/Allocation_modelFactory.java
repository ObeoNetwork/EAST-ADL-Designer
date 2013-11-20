/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.allocation_model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.Allocation_modelPackage
 * @generated
 */
public interface Allocation_modelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Allocation_modelFactory eINSTANCE = org.obeonetwork.dsl.east_adl.structure.allocation_model.impl.Allocation_modelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Allocation Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allocation Model</em>'.
	 * @generated
	 */
	AllocationModel createAllocationModel();

	/**
	 * Returns a new object of class '<em>Frame</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Frame</em>'.
	 * @generated
	 */
	Frame createFrame();

	/**
	 * Returns a new object of class '<em>OS Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OS Task</em>'.
	 * @generated
	 */
	OSTask createOSTask();

	/**
	 * Returns a new object of class '<em>Communication Buffer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Communication Buffer</em>'.
	 * @generated
	 */
	CommunicationBuffer createCommunicationBuffer();

	/**
	 * Returns a new object of class '<em>Signal Deployment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signal Deployment</em>'.
	 * @generated
	 */
	SignalDeployment createSignalDeployment();

	/**
	 * Returns a new object of class '<em>Function Deployment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Deployment</em>'.
	 * @generated
	 */
	FunctionDeployment createFunctionDeployment();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Allocation_modelPackage getAllocation_modelPackage();

} //Allocation_modelFactory
