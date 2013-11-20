/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.function_instance_model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.Function_instance_modelPackage
 * @generated
 */
public interface Function_instance_modelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Function_instance_modelFactory eINSTANCE = org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.Function_instance_modelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Function Instance Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Instance Model</em>'.
	 * @generated
	 */
	FunctionInstanceModel createFunctionInstanceModel();

	/**
	 * Returns a new object of class '<em>Function Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Instance</em>'.
	 * @generated
	 */
	FunctionInstance createFunctionInstance();

	/**
	 * Returns a new object of class '<em>Logical Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logical Cluster</em>'.
	 * @generated
	 */
	LogicalCluster createLogicalCluster();

	/**
	 * Returns a new object of class '<em>Parameter Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Instance</em>'.
	 * @generated
	 */
	ParameterInstance createParameterInstance();

	/**
	 * Returns a new object of class '<em>Signal Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signal Instance</em>'.
	 * @generated
	 */
	SignalInstance createSignalInstance();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Function_instance_modelPackage getFunction_instance_modelPackage();

} //Function_instance_modelFactory
