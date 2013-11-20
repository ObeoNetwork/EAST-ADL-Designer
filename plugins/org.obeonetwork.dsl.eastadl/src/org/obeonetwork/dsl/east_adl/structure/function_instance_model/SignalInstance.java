/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.function_instance_model;

import org.eclipse.emf.common.util.EList;

import org.obeonetwork.dsl.east_adl.core.EASTADLEntity;

import org.obeonetwork.dsl.east_adl.structure.allocation_model.SignalDeployment;

import org.obeonetwork.dsl.east_adl.structure.common.ConnectorSignal;

import org.obeonetwork.dsl.east_adl.structure.platform_model.IPCExchanger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity is used for communication within and between logical clusters. It corresponds to a connector signal of the FDA.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstance#getSize <em>Size</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstance#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstance#getInstantiatedSignal <em>Instantiated Signal</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstance#getPassiveDeployments <em>Passive Deployments</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstance#getDeployers <em>Deployers</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstance#getOutgoingExchangers <em>Outgoing Exchangers</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstance#getIncomingExchangers <em>Incoming Exchangers</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstance#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.Function_instance_modelPackage#getSignalInstance()
 * @model
 * @generated
 */
public interface SignalInstance extends EASTADLEntity {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the size in bits of the signal instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.Function_instance_modelPackage#getSignalInstance_Size()
	 * @model
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstance#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstanceTarget#getIncomingSignals <em>Incoming Signals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the destination of the signal instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Destination</em>' reference.
	 * @see #setDestination(SignalInstanceTarget)
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.Function_instance_modelPackage#getSignalInstance_Destination()
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstanceTarget#getIncomingSignals
	 * @model opposite="incomingSignals" required="true"
	 * @generated
	 */
	SignalInstanceTarget getDestination();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstance#getDestination <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(SignalInstanceTarget value);

	/**
	 * Returns the value of the '<em><b>Instantiated Signal</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.common.ConnectorSignal#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the connector signal which is instantiated by this signal instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instantiated Signal</em>' reference.
	 * @see #setInstantiatedSignal(ConnectorSignal)
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.Function_instance_modelPackage#getSignalInstance_InstantiatedSignal()
	 * @see org.obeonetwork.dsl.east_adl.structure.common.ConnectorSignal#getInstances
	 * @model opposite="instances"
	 * @generated
	 */
	ConnectorSignal getInstantiatedSignal();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstance#getInstantiatedSignal <em>Instantiated Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instantiated Signal</em>' reference.
	 * @see #getInstantiatedSignal()
	 * @generated
	 */
	void setInstantiatedSignal(ConnectorSignal value);

	/**
	 * Returns the value of the '<em><b>Passive Deployments</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.allocation_model.SignalDeployment}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.SignalDeployment#getDeployed <em>Deployed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These represent entities deploying this signal instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Passive Deployments</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.Function_instance_modelPackage#getSignalInstance_PassiveDeployments()
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.SignalDeployment#getDeployed
	 * @model opposite="deployed"
	 * @generated
	 */
	EList<SignalDeployment> getPassiveDeployments();

	/**
	 * Returns the value of the '<em><b>Deployers</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.core.EASTADLEntity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is a derived property used to show all elements deploying this entity (if any).
	 * This property will be shown instead of the corresponding deployment model objects because it is more explicit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deployers</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.Function_instance_modelPackage#getSignalInstance_Deployers()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<EASTADLEntity> getDeployers();

	/**
	 * Returns the value of the '<em><b>Outgoing Exchangers</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.platform_model.IPCExchanger}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.IPCExchanger#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are all outgoing exchangers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outgoing Exchangers</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.Function_instance_modelPackage#getSignalInstance_OutgoingExchangers()
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.IPCExchanger#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<IPCExchanger> getOutgoingExchangers();

	/**
	 * Returns the value of the '<em><b>Incoming Exchangers</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.platform_model.IPCExchanger}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.IPCExchanger#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are all incoming exchangers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Incoming Exchangers</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.Function_instance_modelPackage#getSignalInstance_IncomingExchangers()
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.IPCExchanger#getDestination
	 * @model opposite="destination"
	 * @generated
	 */
	EList<IPCExchanger> getIncomingExchangers();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstanceTarget#getOutgoingSignals <em>Outgoing Signals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the source of the signal instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(SignalInstanceTarget)
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.Function_instance_modelPackage#getSignalInstance_Source()
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstanceTarget#getOutgoingSignals
	 * @model opposite="outgoingSignals" required="true"
	 * @generated
	 */
	SignalInstanceTarget getSource();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstance#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(SignalInstanceTarget value);

} // SignalInstance
