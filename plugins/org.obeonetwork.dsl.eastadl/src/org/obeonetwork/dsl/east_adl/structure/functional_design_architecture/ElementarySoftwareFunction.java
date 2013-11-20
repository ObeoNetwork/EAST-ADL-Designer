/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.functional_design_architecture;

import org.eclipse.emf.common.util.EList;

import org.obeonetwork.dsl.east_adl.behavior.Behavior;

import org.obeonetwork.dsl.east_adl.core.EASTADLEntity;

import org.obeonetwork.dsl.east_adl.requirements.TimingRestriction;

import org.obeonetwork.dsl.east_adl.structure.common.FunctionPort;
import org.obeonetwork.dsl.east_adl.structure.common.Parameter;
import org.obeonetwork.dsl.east_adl.structure.common.RealizingEntity;
import org.obeonetwork.dsl.east_adl.structure.common.TriggerKind;

import org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstance;

import org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity;

import org.obeonetwork.dsl.east_adl.verification_validation.ValidatedEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elementary Software Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity is used to describe the leaves of the functional hierarchy.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction#getPorts <em>Ports</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction#getInstances <em>Instances</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction#getTriggerType <em>Trigger Type</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction#getTriggerEvent <em>Trigger Event</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction#getTriggerCondition <em>Trigger Condition</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction#getExecutionTime <em>Execution Time</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction#getSpecifationBehavior <em>Specifation Behavior</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction#getImplementationBehavior <em>Implementation Behavior</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction#getActivePrecedencies <em>Active Precedencies</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction#getPassivePrecedencies <em>Passive Precedencies</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction#getPredecessors <em>Predecessors</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction#getSuccessors <em>Successors</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Functional_design_architecturePackage#getElementarySoftwareFunction()
 * @model
 * @generated
 */
public interface ElementarySoftwareFunction extends EASTADLEntity, RealizingEntity, VariantEntity, ValidatedEntity {
	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.common.FunctionPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are the ports of this function.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Functional_design_architecturePackage#getElementarySoftwareFunction_Ports()
	 * @model containment="true"
	 * @generated
	 */
	EList<FunctionPort> getPorts();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.common.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These entities are configuration parameters of this elementary function. Details of internal or external data exchanged by this function.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Functional_design_architecturePackage#getElementarySoftwareFunction_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Instances</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstance}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstance#getInstantiatedFunction <em>Instantiated Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are instances of this function.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instances</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Functional_design_architecturePackage#getElementarySoftwareFunction_Instances()
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstance#getInstantiatedFunction
	 * @model opposite="instantiatedFunction"
	 * @generated
	 */
	EList<FunctionInstance> getInstances();

	/**
	 * Returns the value of the '<em><b>Trigger Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.obeonetwork.dsl.east_adl.structure.common.TriggerKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute defines the triggering policy of this function.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trigger Type</em>' attribute.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.TriggerKind
	 * @see #setTriggerType(TriggerKind)
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Functional_design_architecturePackage#getElementarySoftwareFunction_TriggerType()
	 * @model
	 * @generated
	 */
	TriggerKind getTriggerType();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction#getTriggerType <em>Trigger Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger Type</em>' attribute.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.TriggerKind
	 * @see #getTriggerType()
	 * @generated
	 */
	void setTriggerType(TriggerKind value);

	/**
	 * Returns the value of the '<em><b>Trigger Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute describes the interrupt that trigs this function in case of event policy.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trigger Event</em>' attribute.
	 * @see #setTriggerEvent(String)
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Functional_design_architecturePackage#getElementarySoftwareFunction_TriggerEvent()
	 * @model
	 * @generated
	 */
	String getTriggerEvent();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction#getTriggerEvent <em>Trigger Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger Event</em>' attribute.
	 * @see #getTriggerEvent()
	 * @generated
	 */
	void setTriggerEvent(String value);

	/**
	 * Returns the value of the '<em><b>Trigger Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is a condition that must be evaluated to true in order for this function to execute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trigger Condition</em>' attribute.
	 * @see #setTriggerCondition(String)
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Functional_design_architecturePackage#getElementarySoftwareFunction_TriggerCondition()
	 * @model
	 * @generated
	 */
	String getTriggerCondition();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction#getTriggerCondition <em>Trigger Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger Condition</em>' attribute.
	 * @see #getTriggerCondition()
	 * @generated
	 */
	void setTriggerCondition(String value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the triggering period in case of periodic triggering policy.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(TimingRestriction)
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Functional_design_architecturePackage#getElementarySoftwareFunction_Period()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimingRestriction getPeriod();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(TimingRestriction value);

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the offset from the period start time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Offset</em>' containment reference.
	 * @see #setOffset(TimingRestriction)
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Functional_design_architecturePackage#getElementarySoftwareFunction_Offset()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimingRestriction getOffset();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction#getOffset <em>Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' containment reference.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(TimingRestriction value);

	/**
	 * Returns the value of the '<em><b>Execution Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the execution time from the start to completion.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Execution Time</em>' containment reference.
	 * @see #setExecutionTime(TimingRestriction)
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Functional_design_architecturePackage#getElementarySoftwareFunction_ExecutionTime()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimingRestriction getExecutionTime();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction#getExecutionTime <em>Execution Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Time</em>' containment reference.
	 * @see #getExecutionTime()
	 * @generated
	 */
	void setExecutionTime(TimingRestriction value);

	/**
	 * Returns the value of the '<em><b>Specifation Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the specification behavior of this function that may be used for verification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specifation Behavior</em>' containment reference.
	 * @see #setSpecifationBehavior(Behavior)
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Functional_design_architecturePackage#getElementarySoftwareFunction_SpecifationBehavior()
	 * @model containment="true"
	 * @generated
	 */
	Behavior getSpecifationBehavior();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction#getSpecifationBehavior <em>Specifation Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specifation Behavior</em>' containment reference.
	 * @see #getSpecifationBehavior()
	 * @generated
	 */
	void setSpecifationBehavior(Behavior value);

	/**
	 * Returns the value of the '<em><b>Implementation Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the implementation behavior of this function.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Implementation Behavior</em>' containment reference.
	 * @see #setImplementationBehavior(Behavior)
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Functional_design_architecturePackage#getElementarySoftwareFunction_ImplementationBehavior()
	 * @model containment="true"
	 * @generated
	 */
	Behavior getImplementationBehavior();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction#getImplementationBehavior <em>Implementation Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation Behavior</em>' containment reference.
	 * @see #getImplementationBehavior()
	 * @generated
	 */
	void setImplementationBehavior(Behavior value);

	/**
	 * Returns the value of the '<em><b>Active Precedencies</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Precedence}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Precedence#getPredecessor <em>Predecessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are all precedencies (representing successors) of this elementary function.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Active Precedencies</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Functional_design_architecturePackage#getElementarySoftwareFunction_ActivePrecedencies()
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Precedence#getPredecessor
	 * @model opposite="predecessor" containment="true"
	 * @generated
	 */
	EList<Precedence> getActivePrecedencies();

	/**
	 * Returns the value of the '<em><b>Passive Precedencies</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Precedence}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Precedence#getSuccessor <em>Successor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are indirect representations of predecessors of this function.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Passive Precedencies</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Functional_design_architecturePackage#getElementarySoftwareFunction_PassivePrecedencies()
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Precedence#getSuccessor
	 * @model opposite="successor"
	 * @generated
	 */
	EList<Precedence> getPassivePrecedencies();

	/**
	 * Returns the value of the '<em><b>Predecessors</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is a derived property used to show all predecessors of this function (if any).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Predecessors</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Functional_design_architecturePackage#getElementarySoftwareFunction_Predecessors()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<ElementarySoftwareFunction> getPredecessors();

	/**
	 * Returns the value of the '<em><b>Successors</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is a derived property used to show all successors of this function (if any).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Successors</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Functional_design_architecturePackage#getElementarySoftwareFunction_Successors()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<ElementarySoftwareFunction> getSuccessors();

} // ElementarySoftwareFunction
