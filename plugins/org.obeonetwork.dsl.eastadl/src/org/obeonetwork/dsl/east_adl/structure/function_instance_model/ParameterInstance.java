/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.function_instance_model;

import org.eclipse.emf.common.util.EList;

import org.obeonetwork.dsl.east_adl.core.EASTADLEntity;

import org.obeonetwork.dsl.east_adl.structure.common.Parameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity is an instantiation of a function parameter.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.ParameterInstance#getInstantiatedParameter <em>Instantiated Parameter</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.ParameterInstance#getOwningFunction <em>Owning Function</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.ParameterInstance#getReferencingFunctions <em>Referencing Functions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.Function_instance_modelPackage#getParameterInstance()
 * @model
 * @generated
 */
public interface ParameterInstance extends EASTADLEntity {
	/**
	 * Returns the value of the '<em><b>Instantiated Parameter</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.common.Parameter#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the parameter of an elementary software function which this instance parameter instantiates.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instantiated Parameter</em>' reference.
	 * @see #setInstantiatedParameter(Parameter)
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.Function_instance_modelPackage#getParameterInstance_InstantiatedParameter()
	 * @see org.obeonetwork.dsl.east_adl.structure.common.Parameter#getInstances
	 * @model opposite="instances"
	 * @generated
	 */
	Parameter getInstantiatedParameter();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.ParameterInstance#getInstantiatedParameter <em>Instantiated Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instantiated Parameter</em>' reference.
	 * @see #getInstantiatedParameter()
	 * @generated
	 */
	void setInstantiatedParameter(Parameter value);

	/**
	 * Returns the value of the '<em><b>Owning Function</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstance#getDefinedParameters <em>Defined Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the funciton instance for which this parameter is defined.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Function</em>' container reference.
	 * @see #setOwningFunction(FunctionInstance)
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.Function_instance_modelPackage#getParameterInstance_OwningFunction()
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstance#getDefinedParameters
	 * @model opposite="definedParameters" required="true" transient="false"
	 * @generated
	 */
	FunctionInstance getOwningFunction();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.ParameterInstance#getOwningFunction <em>Owning Function</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Function</em>' container reference.
	 * @see #getOwningFunction()
	 * @generated
	 */
	void setOwningFunction(FunctionInstance value);

	/**
	 * Returns the value of the '<em><b>Referencing Functions</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstance}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstance#getReferencedParameters <em>Referenced Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are all function instances referencing this parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Referencing Functions</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.Function_instance_modelPackage#getParameterInstance_ReferencingFunctions()
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstance#getReferencedParameters
	 * @model opposite="referencedParameters"
	 * @generated
	 */
	EList<FunctionInstance> getReferencingFunctions();

} // ParameterInstance
