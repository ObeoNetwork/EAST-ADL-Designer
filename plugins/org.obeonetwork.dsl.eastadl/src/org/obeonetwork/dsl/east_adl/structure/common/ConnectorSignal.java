/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.common;

import org.eclipse.emf.common.util.EList;

import org.obeonetwork.dsl.east_adl.core.EASTADLEntity;

import org.obeonetwork.dsl.east_adl.requirements.TimingRestriction;

import org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector Signal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity specifies the data exchanged by signal function port interfaces and its characteristics.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.ConnectorSignal#getEmitter <em>Emitter</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.ConnectorSignal#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.ConnectorSignal#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.ConnectorSignal#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.ConnectorSignal#getInstances <em>Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getConnectorSignal()
 * @model annotation="http://www.topcased.org/documentation documentation='This is a slightly different implementation of all the signal connection mechanics described in the specification. I think it is more relevant.'"
 * @generated
 */
public interface ConnectorSignal extends EASTADLEntity {
	/**
	 * Returns the value of the '<em><b>Emitter</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.common.SignalFunctionPortInterface#getEmitedSignals <em>Emited Signals</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emitter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emitter</em>' reference.
	 * @see #setEmitter(SignalFunctionPortInterface)
	 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getConnectorSignal_Emitter()
	 * @see org.obeonetwork.dsl.east_adl.structure.common.SignalFunctionPortInterface#getEmitedSignals
	 * @model opposite="emitedSignals"
	 * @generated
	 */
	SignalFunctionPortInterface getEmitter();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.common.ConnectorSignal#getEmitter <em>Emitter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emitter</em>' reference.
	 * @see #getEmitter()
	 * @generated
	 */
	void setEmitter(SignalFunctionPortInterface value);

	/**
	 * Returns the value of the '<em><b>Receiver</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.common.SignalFunctionPortInterface#getReceivedSignals <em>Received Signals</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receiver</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receiver</em>' reference.
	 * @see #setReceiver(SignalFunctionPortInterface)
	 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getConnectorSignal_Receiver()
	 * @see org.obeonetwork.dsl.east_adl.structure.common.SignalFunctionPortInterface#getReceivedSignals
	 * @model opposite="receivedSignals"
	 * @generated
	 */
	SignalFunctionPortInterface getReceiver();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.common.ConnectorSignal#getReceiver <em>Receiver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiver</em>' reference.
	 * @see #getReceiver()
	 * @generated
	 */
	void setReceiver(SignalFunctionPortInterface value);

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.common.DesignDataType#getTypedSignals <em>Typed Signals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the data type of the connector signal
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Type</em>' reference.
	 * @see #setDataType(DesignDataType)
	 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getConnectorSignal_DataType()
	 * @see org.obeonetwork.dsl.east_adl.structure.common.DesignDataType#getTypedSignals
	 * @model opposite="typedSignals"
	 * @generated
	 */
	DesignDataType getDataType();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.common.ConnectorSignal#getDataType <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' reference.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(DesignDataType value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the period of this signal. A nominal period of T means that this signal is sent every T time units.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(TimingRestriction)
	 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getConnectorSignal_Period()
	 * @model containment="true"
	 *        annotation="http://www.topcased.org/documentation documentation='This depends on units.'"
	 * @generated
	 */
	TimingRestriction getPeriod();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.common.ConnectorSignal#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(TimingRestriction value);

	/**
	 * Returns the value of the '<em><b>Instances</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstance}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstance#getInstantiatedSignal <em>Instantiated Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are all instances of this connector signal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instances</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getConnectorSignal_Instances()
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstance#getInstantiatedSignal
	 * @model opposite="instantiatedSignal"
	 * @generated
	 */
	EList<SignalInstance> getInstances();

} // ConnectorSignal
