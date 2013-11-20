/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.common;

import org.eclipse.emf.common.util.EList;

import org.obeonetwork.dsl.east_adl.core.EASTADLEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is a service (or an operation) provided by an operation port.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.OperationService#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.OperationService#getInterface <em>Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getOperationService()
 * @model
 * @generated
 */
public interface OperationService extends EASTADLEntity {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.common.ServiceParameter}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.common.ServiceParameter#getOwningService <em>Owning Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getOperationService_Parameters()
	 * @see org.obeonetwork.dsl.east_adl.structure.common.ServiceParameter#getOwningService
	 * @model opposite="owningService" containment="true"
	 * @generated
	 */
	EList<ServiceParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.common.OperationFunctionPortInterface#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' container reference.
	 * @see #setInterface(OperationFunctionPortInterface)
	 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getOperationService_Interface()
	 * @see org.obeonetwork.dsl.east_adl.structure.common.OperationFunctionPortInterface#getServices
	 * @model opposite="services" required="true" transient="false"
	 * @generated
	 */
	OperationFunctionPortInterface getInterface();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.common.OperationService#getInterface <em>Interface</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' container reference.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(OperationFunctionPortInterface value);

} // OperationService
