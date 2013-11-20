/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.common;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Function Port Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Used for interactions through operation function ports.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.OperationFunctionPortInterface#getReceivedCalls <em>Received Calls</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.OperationFunctionPortInterface#getEmitedCalls <em>Emited Calls</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.OperationFunctionPortInterface#getServices <em>Services</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getOperationFunctionPortInterface()
 * @model
 * @generated
 */
public interface OperationFunctionPortInterface extends FunctionPortInterface {
	/**
	 * Returns the value of the '<em><b>Received Calls</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.common.OperationCall}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.common.OperationCall#getReceiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Received Calls</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Received Calls</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getOperationFunctionPortInterface_ReceivedCalls()
	 * @see org.obeonetwork.dsl.east_adl.structure.common.OperationCall#getReceiver
	 * @model opposite="receiver"
	 * @generated
	 */
	EList<OperationCall> getReceivedCalls();

	/**
	 * Returns the value of the '<em><b>Emited Calls</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.common.OperationCall}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.common.OperationCall#getEmitter <em>Emitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emited Calls</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emited Calls</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getOperationFunctionPortInterface_EmitedCalls()
	 * @see org.obeonetwork.dsl.east_adl.structure.common.OperationCall#getEmitter
	 * @model opposite="emitter"
	 * @generated
	 */
	EList<OperationCall> getEmitedCalls();

	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.common.OperationService}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.common.OperationService#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getOperationFunctionPortInterface_Services()
	 * @see org.obeonetwork.dsl.east_adl.structure.common.OperationService#getInterface
	 * @model opposite="interface" containment="true"
	 * @generated
	 */
	EList<OperationService> getServices();

} // OperationFunctionPortInterface
