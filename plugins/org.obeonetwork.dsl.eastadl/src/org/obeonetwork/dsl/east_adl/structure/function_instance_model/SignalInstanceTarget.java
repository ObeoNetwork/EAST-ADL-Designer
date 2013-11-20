/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.function_instance_model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal Instance Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity is used to declare entities that can be linked through signal instances.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstanceTarget#getIncomingSignals <em>Incoming Signals</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstanceTarget#getOutgoingSignals <em>Outgoing Signals</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.Function_instance_modelPackage#getSignalInstanceTarget()
 * @model abstract="true"
 * @generated
 */
public interface SignalInstanceTarget extends EObject {
	/**
	 * Returns the value of the '<em><b>Incoming Signals</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstance}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstance#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Signals</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Signals</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.Function_instance_modelPackage#getSignalInstanceTarget_IncomingSignals()
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstance#getDestination
	 * @model opposite="destination"
	 * @generated
	 */
	EList<SignalInstance> getIncomingSignals();

	/**
	 * Returns the value of the '<em><b>Outgoing Signals</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstance}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstance#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Signals</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Signals</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.Function_instance_modelPackage#getSignalInstanceTarget_OutgoingSignals()
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstance#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<SignalInstance> getOutgoingSignals();

} // SignalInstanceTarget
