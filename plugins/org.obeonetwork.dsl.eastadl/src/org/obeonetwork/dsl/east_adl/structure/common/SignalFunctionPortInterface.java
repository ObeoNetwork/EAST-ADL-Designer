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
 * A representation of the model object '<em><b>Signal Function Port Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Used for interactions through signal function ports.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.SignalFunctionPortInterface#getEmitedSignals <em>Emited Signals</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.SignalFunctionPortInterface#getReceivedSignals <em>Received Signals</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getSignalFunctionPortInterface()
 * @model
 * @generated
 */
public interface SignalFunctionPortInterface extends FunctionPortInterface {
	/**
	 * Returns the value of the '<em><b>Emited Signals</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.common.ConnectorSignal}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.common.ConnectorSignal#getEmitter <em>Emitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emited Signals</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emited Signals</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getSignalFunctionPortInterface_EmitedSignals()
	 * @see org.obeonetwork.dsl.east_adl.structure.common.ConnectorSignal#getEmitter
	 * @model opposite="emitter"
	 * @generated
	 */
	EList<ConnectorSignal> getEmitedSignals();

	/**
	 * Returns the value of the '<em><b>Received Signals</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.common.ConnectorSignal}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.common.ConnectorSignal#getReceiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Received Signals</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Received Signals</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getSignalFunctionPortInterface_ReceivedSignals()
	 * @see org.obeonetwork.dsl.east_adl.structure.common.ConnectorSignal#getReceiver
	 * @model opposite="receiver"
	 * @generated
	 */
	EList<ConnectorSignal> getReceivedSignals();

} // SignalFunctionPortInterface
