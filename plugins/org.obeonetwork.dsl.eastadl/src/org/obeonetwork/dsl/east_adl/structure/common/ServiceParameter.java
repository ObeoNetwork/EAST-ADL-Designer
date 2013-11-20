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
 * A representation of the model object '<em><b>Service Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is a parameter of a service provided by an operation port.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.ServiceParameter#getModifier <em>Modifier</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.ServiceParameter#getOwningService <em>Owning Service</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.ServiceParameter#getDataType <em>Data Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getServiceParameter()
 * @model
 * @generated
 */
public interface ServiceParameter extends EASTADLEntity {
	/**
	 * Returns the value of the '<em><b>Modifier</b></em>' attribute.
	 * The literals are from the enumeration {@link org.obeonetwork.dsl.east_adl.structure.common.DirectionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modifier</em>' attribute.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.DirectionKind
	 * @see #setModifier(DirectionKind)
	 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getServiceParameter_Modifier()
	 * @model
	 * @generated
	 */
	DirectionKind getModifier();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.common.ServiceParameter#getModifier <em>Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modifier</em>' attribute.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.DirectionKind
	 * @see #getModifier()
	 * @generated
	 */
	void setModifier(DirectionKind value);

	/**
	 * Returns the value of the '<em><b>Owning Service</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.common.OperationService#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Service</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Service</em>' container reference.
	 * @see #setOwningService(OperationService)
	 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getServiceParameter_OwningService()
	 * @see org.obeonetwork.dsl.east_adl.structure.common.OperationService#getParameters
	 * @model opposite="parameters" required="true" transient="false"
	 * @generated
	 */
	OperationService getOwningService();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.common.ServiceParameter#getOwningService <em>Owning Service</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Service</em>' container reference.
	 * @see #getOwningService()
	 * @generated
	 */
	void setOwningService(OperationService value);

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.common.DesignDataType#getTypedServiceParameters <em>Typed Service Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the data type of the service parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Type</em>' reference.
	 * @see #setDataType(DesignDataType)
	 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getServiceParameter_DataType()
	 * @see org.obeonetwork.dsl.east_adl.structure.common.DesignDataType#getTypedServiceParameters
	 * @model opposite="typedServiceParameters"
	 * @generated
	 */
	DesignDataType getDataType();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.common.ServiceParameter#getDataType <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' reference.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(DesignDataType value);

} // ServiceParameter
