/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.common;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage
 * @generated
 */
public interface CommonFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommonFactory eINSTANCE = org.obeonetwork.dsl.east_adl.structure.common.impl.CommonFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Signal Function Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signal Function Port</em>'.
	 * @generated
	 */
	SignalFunctionPort createSignalFunctionPort();

	/**
	 * Returns a new object of class '<em>Operation Function Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Function Port</em>'.
	 * @generated
	 */
	OperationFunctionPort createOperationFunctionPort();

	/**
	 * Returns a new object of class '<em>Signal Function Port Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signal Function Port Interface</em>'.
	 * @generated
	 */
	SignalFunctionPortInterface createSignalFunctionPortInterface();

	/**
	 * Returns a new object of class '<em>Operation Function Port Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Function Port Interface</em>'.
	 * @generated
	 */
	OperationFunctionPortInterface createOperationFunctionPortInterface();

	/**
	 * Returns a new object of class '<em>Connector Signal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connector Signal</em>'.
	 * @generated
	 */
	ConnectorSignal createConnectorSignal();

	/**
	 * Returns a new object of class '<em>Design Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Design Data Type</em>'.
	 * @generated
	 */
	DesignDataType createDesignDataType();

	/**
	 * Returns a new object of class '<em>Implementation Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implementation Data Type</em>'.
	 * @generated
	 */
	ImplementationDataType createImplementationDataType();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>Realization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Realization</em>'.
	 * @generated
	 */
	Realization createRealization();

	/**
	 * Returns a new object of class '<em>Operation Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Service</em>'.
	 * @generated
	 */
	OperationService createOperationService();

	/**
	 * Returns a new object of class '<em>Service Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Parameter</em>'.
	 * @generated
	 */
	ServiceParameter createServiceParameter();

	/**
	 * Returns a new object of class '<em>Operation Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Call</em>'.
	 * @generated
	 */
	OperationCall createOperationCall();

	/**
	 * Returns a new object of class '<em>Type Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Association</em>'.
	 * @generated
	 */
	TypeAssociation createTypeAssociation();

	/**
	 * Returns a new object of class '<em>Allocation Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allocation Constraint</em>'.
	 * @generated
	 */
	AllocationConstraint createAllocationConstraint();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CommonPackage getCommonPackage();

} //CommonFactory
