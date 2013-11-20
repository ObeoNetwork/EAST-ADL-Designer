/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.common;

import org.obeonetwork.dsl.east_adl.core.EASTADLEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is a connection between two opera
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.OperationCall#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.OperationCall#getEmitter <em>Emitter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getOperationCall()
 * @model
 * @generated
 */
public interface OperationCall extends EASTADLEntity {
	/**
	 * Returns the value of the '<em><b>Receiver</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.common.OperationFunctionPortInterface#getReceivedCalls <em>Received Calls</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receiver</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receiver</em>' reference.
	 * @see #setReceiver(OperationFunctionPortInterface)
	 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getOperationCall_Receiver()
	 * @see org.obeonetwork.dsl.east_adl.structure.common.OperationFunctionPortInterface#getReceivedCalls
	 * @model opposite="receivedCalls"
	 * @generated
	 */
	OperationFunctionPortInterface getReceiver();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.common.OperationCall#getReceiver <em>Receiver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiver</em>' reference.
	 * @see #getReceiver()
	 * @generated
	 */
	void setReceiver(OperationFunctionPortInterface value);

	/**
	 * Returns the value of the '<em><b>Emitter</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.common.OperationFunctionPortInterface#getEmitedCalls <em>Emited Calls</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emitter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emitter</em>' reference.
	 * @see #setEmitter(OperationFunctionPortInterface)
	 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getOperationCall_Emitter()
	 * @see org.obeonetwork.dsl.east_adl.structure.common.OperationFunctionPortInterface#getEmitedCalls
	 * @model opposite="emitedCalls"
	 * @generated
	 */
	OperationFunctionPortInterface getEmitter();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.common.OperationCall#getEmitter <em>Emitter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emitter</em>' reference.
	 * @see #getEmitter()
	 * @generated
	 */
	void setEmitter(OperationFunctionPortInterface value);

} // OperationCall
