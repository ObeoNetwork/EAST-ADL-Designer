/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.common;

import org.eclipse.emf.common.util.EList;

import org.obeonetwork.dsl.east_adl.core.EASTADLNamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implementation Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity is used to define the implementation type of a variable, a parameter or a connector signal.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.ImplementationDataType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.ImplementationDataType#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.ImplementationDataType#getImplementationMinimum <em>Implementation Minimum</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.ImplementationDataType#getImplementationMaximum <em>Implementation Maximum</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.ImplementationDataType#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.ImplementationDataType#getTypeAssociations <em>Type Associations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getImplementationDataType()
 * @model
 * @generated
 */
public interface ImplementationDataType extends EASTADLNamedElement {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute describes a data type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getImplementationDataType_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.common.ImplementationDataType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.obeonetwork.dsl.east_adl.structure.common.ImplementationDataTypeKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the abstract type of the implementation representation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Type</em>' attribute.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.ImplementationDataTypeKind
	 * @see #setDataType(ImplementationDataTypeKind)
	 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getImplementationDataType_DataType()
	 * @model
	 * @generated
	 */
	ImplementationDataTypeKind getDataType();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.common.ImplementationDataType#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' attribute.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.ImplementationDataTypeKind
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(ImplementationDataTypeKind value);

	/**
	 * Returns the value of the '<em><b>Implementation Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the minimum value that the attribute might take (depends on data type and design data type).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Implementation Minimum</em>' attribute.
	 * @see #setImplementationMinimum(String)
	 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getImplementationDataType_ImplementationMinimum()
	 * @model annotation="http://www.topcased.org/documentation documentation='I use a String type because it is the best alternative to allow any possible entry.'"
	 * @generated
	 */
	String getImplementationMinimum();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.common.ImplementationDataType#getImplementationMinimum <em>Implementation Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation Minimum</em>' attribute.
	 * @see #getImplementationMinimum()
	 * @generated
	 */
	void setImplementationMinimum(String value);

	/**
	 * Returns the value of the '<em><b>Implementation Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the maximum value that the attribute might take (depends on data type and design data type).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Implementation Maximum</em>' attribute.
	 * @see #setImplementationMaximum(String)
	 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getImplementationDataType_ImplementationMaximum()
	 * @model annotation="http://www.topcased.org/documentation documentation='I use a String type because it is the best alternative to allow any possible entry.'"
	 * @generated
	 */
	String getImplementationMaximum();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.common.ImplementationDataType#getImplementationMaximum <em>Implementation Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation Maximum</em>' attribute.
	 * @see #getImplementationMaximum()
	 * @generated
	 */
	void setImplementationMaximum(String value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the value used to initialize this attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(String)
	 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getImplementationDataType_DefaultValue()
	 * @model annotation="http://www.topcased.org/documentation documentation='I use a String type because it is the best alternative to allow any possible entry.'"
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.common.ImplementationDataType#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(String value);

	/**
	 * Returns the value of the '<em><b>Type Associations</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.common.TypeAssociation}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.common.TypeAssociation#getImplementationDataType <em>Implementation Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are all the associations of this data type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Associations</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getImplementationDataType_TypeAssociations()
	 * @see org.obeonetwork.dsl.east_adl.structure.common.TypeAssociation#getImplementationDataType
	 * @model opposite="implementationDataType"
	 * @generated
	 */
	EList<TypeAssociation> getTypeAssociations();

} // ImplementationDataType
