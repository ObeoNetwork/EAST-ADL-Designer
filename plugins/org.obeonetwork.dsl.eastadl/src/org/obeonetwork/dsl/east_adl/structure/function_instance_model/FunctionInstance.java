/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.function_instance_model;

import org.eclipse.emf.common.util.EList;

import org.obeonetwork.dsl.east_adl.core.EASTADLEntity;

import org.obeonetwork.dsl.east_adl.requirements.TimingRestriction;

import org.obeonetwork.dsl.east_adl.structure.common.TriggerKind;

import org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity is the instantiation of an elementary software function.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstance#getTriggerType <em>Trigger Type</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstance#getTriggerEvent <em>Trigger Event</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstance#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstance#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstance#getExecutionTime <em>Execution Time</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstance#getInstantiatedFunction <em>Instantiated Function</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstance#getDefinedParameters <em>Defined Parameters</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstance#getReferencedParameters <em>Referenced Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.Function_instance_modelPackage#getFunctionInstance()
 * @model
 * @generated
 */
public interface FunctionInstance extends EASTADLEntity, SignalInstanceTarget {
	/**
	 * Returns the value of the '<em><b>Trigger Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.obeonetwork.dsl.east_adl.structure.common.TriggerKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute defines the triggering policy of this function instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trigger Type</em>' attribute.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.TriggerKind
	 * @see #setTriggerType(TriggerKind)
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.Function_instance_modelPackage#getFunctionInstance_TriggerType()
	 * @model
	 * @generated
	 */
	TriggerKind getTriggerType();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstance#getTriggerType <em>Trigger Type</em>}' attribute.
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
	 * This attribute describes the interrupt that trigs the function instance in case of an event trigger type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trigger Event</em>' attribute.
	 * @see #setTriggerEvent(String)
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.Function_instance_modelPackage#getFunctionInstance_TriggerEvent()
	 * @model
	 * @generated
	 */
	String getTriggerEvent();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstance#getTriggerEvent <em>Trigger Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger Event</em>' attribute.
	 * @see #getTriggerEvent()
	 * @generated
	 */
	void setTriggerEvent(String value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the trigger period of a function instance. It defines the nominal period for periodic execution  and expected interarrival time for event triggered execution.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(TimingRestriction)
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.Function_instance_modelPackage#getFunctionInstance_Period()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimingRestriction getPeriod();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstance#getPeriod <em>Period</em>}' containment reference.
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
	 * This is the offset from the period start time. It only applies to periodic trigger type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Offset</em>' containment reference.
	 * @see #setOffset(TimingRestriction)
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.Function_instance_modelPackage#getFunctionInstance_Offset()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimingRestriction getOffset();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstance#getOffset <em>Offset</em>}' containment reference.
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
	 * This is the execution time of the function instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Execution Time</em>' containment reference.
	 * @see #setExecutionTime(TimingRestriction)
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.Function_instance_modelPackage#getFunctionInstance_ExecutionTime()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimingRestriction getExecutionTime();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstance#getExecutionTime <em>Execution Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Time</em>' containment reference.
	 * @see #getExecutionTime()
	 * @generated
	 */
	void setExecutionTime(TimingRestriction value);

	/**
	 * Returns the value of the '<em><b>Instantiated Function</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the function that this entity instantiates.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instantiated Function</em>' reference.
	 * @see #setInstantiatedFunction(ElementarySoftwareFunction)
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.Function_instance_modelPackage#getFunctionInstance_InstantiatedFunction()
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction#getInstances
	 * @model opposite="instances"
	 * @generated
	 */
	ElementarySoftwareFunction getInstantiatedFunction();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstance#getInstantiatedFunction <em>Instantiated Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instantiated Function</em>' reference.
	 * @see #getInstantiatedFunction()
	 * @generated
	 */
	void setInstantiatedFunction(ElementarySoftwareFunction value);

	/**
	 * Returns the value of the '<em><b>Defined Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.ParameterInstance}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.ParameterInstance#getOwningFunction <em>Owning Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are the values of parameters of instantiated elementary software function.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Defined Parameters</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.Function_instance_modelPackage#getFunctionInstance_DefinedParameters()
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.ParameterInstance#getOwningFunction
	 * @model opposite="owningFunction" containment="true"
	 * @generated
	 */
	EList<ParameterInstance> getDefinedParameters();

	/**
	 * Returns the value of the '<em><b>Referenced Parameters</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.ParameterInstance}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.ParameterInstance#getReferencingFunctions <em>Referencing Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are parameters of other function instances referenced here.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Referenced Parameters</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.Function_instance_modelPackage#getFunctionInstance_ReferencedParameters()
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.ParameterInstance#getReferencingFunctions
	 * @model opposite="referencingFunctions"
	 * @generated
	 */
	EList<ParameterInstance> getReferencedParameters();

} // FunctionInstance
