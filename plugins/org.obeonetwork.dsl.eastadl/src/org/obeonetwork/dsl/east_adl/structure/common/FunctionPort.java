/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.common;

import org.obeonetwork.dsl.east_adl.core.EASTADLEntity;

import org.obeonetwork.dsl.east_adl.requirements.EndToEndDelay;
import org.obeonetwork.dsl.east_adl.requirements.PeriodRestriction;
import org.obeonetwork.dsl.east_adl.requirements.TimingRestriction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is an abstract entity used to define distinct interaction points for the functional entities of the system through which they communicate with their environment. This entity is connected to other function ports through connectors through which signals or operation calls can be sent or received.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.FunctionPort#isProvided <em>Provided</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.FunctionPort#getInterface <em>Interface</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.FunctionPort#getFromDelay <em>From Delay</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.FunctionPort#getUntilDelay <em>Until Delay</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.FunctionPort#getPeriodRestriction <em>Period Restriction</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.FunctionPort#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.FunctionPort#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.FunctionPort#getTransferTime <em>Transfer Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getFunctionPort()
 * @model abstract="true"
 * @generated
 */
public interface FunctionPort extends EASTADLEntity {
	/**
	 * Returns the value of the '<em><b>Provided</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute is used to declare if a port is provided or required. It defines thus the direction of signals that can be sent or received through this port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provided</em>' attribute.
	 * @see #setProvided(boolean)
	 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getFunctionPort_Provided()
	 * @model annotation="http://www.topcased.org/documentation documentation='Easier and better implementation of this behavior compared to the previous.\r\nThis attribute cannot be changed by the user directly but set only on creation.'"
	 * @generated
	 */
	boolean isProvided();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.common.FunctionPort#isProvided <em>Provided</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provided</em>' attribute.
	 * @see #isProvided()
	 * @generated
	 */
	void setProvided(boolean value);

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.common.FunctionPortInterface#getTypedPort <em>Typed Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the function port interface that types this port. It characterizes any interaction that may occur between a functional entity and its environment at this port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interface</em>' containment reference.
	 * @see #setInterface(FunctionPortInterface)
	 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getFunctionPort_Interface()
	 * @see org.obeonetwork.dsl.east_adl.structure.common.FunctionPortInterface#getTypedPort
	 * @model opposite="typedPort" containment="true"
	 * @generated
	 */
	FunctionPortInterface getInterface();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.common.FunctionPort#getInterface <em>Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' containment reference.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(FunctionPortInterface value);

	/**
	 * Returns the value of the '<em><b>From Delay</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.requirements.EndToEndDelay#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the beginning delay requirement computation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>From Delay</em>' reference.
	 * @see #setFromDelay(EndToEndDelay)
	 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getFunctionPort_FromDelay()
	 * @see org.obeonetwork.dsl.east_adl.requirements.EndToEndDelay#getFrom
	 * @model opposite="from"
	 * @generated
	 */
	EndToEndDelay getFromDelay();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.common.FunctionPort#getFromDelay <em>From Delay</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Delay</em>' reference.
	 * @see #getFromDelay()
	 * @generated
	 */
	void setFromDelay(EndToEndDelay value);

	/**
	 * Returns the value of the '<em><b>Until Delay</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.requirements.EndToEndDelay#getUntil <em>Until</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the ending delay requirement computation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Until Delay</em>' reference.
	 * @see #setUntilDelay(EndToEndDelay)
	 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getFunctionPort_UntilDelay()
	 * @see org.obeonetwork.dsl.east_adl.requirements.EndToEndDelay#getUntil
	 * @model opposite="until"
	 * @generated
	 */
	EndToEndDelay getUntilDelay();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.common.FunctionPort#getUntilDelay <em>Until Delay</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Until Delay</em>' reference.
	 * @see #getUntilDelay()
	 * @generated
	 */
	void setUntilDelay(EndToEndDelay value);

	/**
	 * Returns the value of the '<em><b>Period Restriction</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.requirements.PeriodRestriction#getAssignedPorts <em>Assigned Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the period restriction that contrains this port's period.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period Restriction</em>' reference.
	 * @see #setPeriodRestriction(PeriodRestriction)
	 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getFunctionPort_PeriodRestriction()
	 * @see org.obeonetwork.dsl.east_adl.requirements.PeriodRestriction#getAssignedPorts
	 * @model opposite="assignedPorts"
	 * @generated
	 */
	PeriodRestriction getPeriodRestriction();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.common.FunctionPort#getPeriodRestriction <em>Period Restriction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period Restriction</em>' reference.
	 * @see #getPeriodRestriction()
	 * @generated
	 */
	void setPeriodRestriction(PeriodRestriction value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is a derived reference to specify the owner of this port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getFunctionPort_Owner()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EASTADLEntity getOwner();

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is an optional attribute defining the period of update for this port signals or calls.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(TimingRestriction)
	 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getFunctionPort_Period()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimingRestriction getPeriod();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.common.FunctionPort#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(TimingRestriction value);

	/**
	 * Returns the value of the '<em><b>Transfer Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is an optional attribute defining max time to writing at sender to availability for reading at receiver.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transfer Time</em>' containment reference.
	 * @see #setTransferTime(TimingRestriction)
	 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getFunctionPort_TransferTime()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimingRestriction getTransferTime();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.common.FunctionPort#getTransferTime <em>Transfer Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transfer Time</em>' containment reference.
	 * @see #getTransferTime()
	 * @generated
	 */
	void setTransferTime(TimingRestriction value);

} // FunctionPort
