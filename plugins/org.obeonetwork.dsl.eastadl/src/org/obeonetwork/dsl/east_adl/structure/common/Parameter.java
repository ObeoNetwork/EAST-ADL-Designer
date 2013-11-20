/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.common;

import org.eclipse.emf.common.util.EList;

import org.obeonetwork.dsl.east_adl.core.EASTADLEntity;

import org.obeonetwork.dsl.east_adl.structure.function_instance_model.ParameterInstance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity models a parameterization point of a function
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.Parameter#isConstant <em>Constant</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.Parameter#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.Parameter#getInstances <em>Instances</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.Parameter#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.Parameter#getDirection <em>Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getParameter()
 * @model annotation="http://www.topcased.org/documentation documentation='This is my own implementation of the parameter notion, I think its is quite complete and relevant.'"
 * @generated
 */
public interface Parameter extends EASTADLEntity {
	/**
	 * Returns the value of the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute is used to declare if the value of the parameter can be changed after code generation or can be only set on configuration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constant</em>' attribute.
	 * @see #setConstant(boolean)
	 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getParameter_Constant()
	 * @model
	 * @generated
	 */
	boolean isConstant();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.common.Parameter#isConstant <em>Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant</em>' attribute.
	 * @see #isConstant()
	 * @generated
	 */
	void setConstant(boolean value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is a derived reference to specify the owner of this parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getParameter_Owner()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EASTADLEntity getOwner();

	/**
	 * Returns the value of the '<em><b>Instances</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.ParameterInstance}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.ParameterInstance#getInstantiatedParameter <em>Instantiated Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are all instantiations of this parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instances</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getParameter_Instances()
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.ParameterInstance#getInstantiatedParameter
	 * @model opposite="instantiatedParameter"
	 * @generated
	 */
	EList<ParameterInstance> getInstances();

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.common.DesignDataType#getTypedFunctionParameters <em>Typed Function Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' reference.
	 * @see #setDataType(DesignDataType)
	 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getParameter_DataType()
	 * @see org.obeonetwork.dsl.east_adl.structure.common.DesignDataType#getTypedFunctionParameters
	 * @model opposite="typedFunctionParameters"
	 * @generated
	 */
	DesignDataType getDataType();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.common.Parameter#getDataType <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' reference.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(DesignDataType value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link org.obeonetwork.dsl.east_adl.structure.common.DirectionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.DirectionKind
	 * @see #setDirection(DirectionKind)
	 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getParameter_Direction()
	 * @model
	 * @generated
	 */
	DirectionKind getDirection();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.common.Parameter#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.DirectionKind
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(DirectionKind value);

} // Parameter
