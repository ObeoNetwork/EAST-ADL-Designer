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
 * A representation of the model object '<em><b>Design Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity is used to declare the abstract type of a variable, parameter or connector signal. It contains both the physical aspects and implementation aspects. The implementation aspects are limited to those needed for characterizing the variables.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.DesignDataType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.DesignDataType#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.DesignDataType#getTypedSignals <em>Typed Signals</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.DesignDataType#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.DesignDataType#getResolution <em>Resolution</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.DesignDataType#getPhysicalMinimum <em>Physical Minimum</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.DesignDataType#getPhysicalMaximum <em>Physical Maximum</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.DesignDataType#getSignificantDigits <em>Significant Digits</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.DesignDataType#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.DesignDataType#getTypedServiceParameters <em>Typed Service Parameters</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.DesignDataType#getTypeAssociations <em>Type Associations</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.DesignDataType#getTypedFunctionParameters <em>Typed Function Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getDesignDataType()
 * @model
 * @generated
 */
public interface DesignDataType extends EASTADLNamedElement {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute describes the data type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getDesignDataType_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.common.DesignDataType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.obeonetwork.dsl.east_adl.structure.common.DesignDataTypeKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute is the abstract type of the phisical representation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Type</em>' attribute.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.DesignDataTypeKind
	 * @see #setDataType(DesignDataTypeKind)
	 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getDesignDataType_DataType()
	 * @model
	 * @generated
	 */
	DesignDataTypeKind getDataType();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.common.DesignDataType#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' attribute.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.DesignDataTypeKind
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(DesignDataTypeKind value);

	/**
	 * Returns the value of the '<em><b>Typed Signals</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.common.ConnectorSignal}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.common.ConnectorSignal#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are all the signals typed by this data type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Typed Signals</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getDesignDataType_TypedSignals()
	 * @see org.obeonetwork.dsl.east_adl.structure.common.ConnectorSignal#getDataType
	 * @model opposite="dataType"
	 * @generated
	 */
	EList<ConnectorSignal> getTypedSignals();

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the unit of the variable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(String)
	 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getDesignDataType_Unit()
	 * @model
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.common.DesignDataType#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

	/**
	 * Returns the value of the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the size of the minimum difference between variables.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resolution</em>' attribute.
	 * @see #setResolution(String)
	 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getDesignDataType_Resolution()
	 * @model annotation="http://www.topcased.org/documentation documentation='I use a String type because it is the best alternative to allow any possible entry.'"
	 * @generated
	 */
	String getResolution();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.common.DesignDataType#getResolution <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolution</em>' attribute.
	 * @see #getResolution()
	 * @generated
	 */
	void setResolution(String value);

	/**
	 * Returns the value of the '<em><b>Physical Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the minimum value this attribute might represent in the real world.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Physical Minimum</em>' attribute.
	 * @see #setPhysicalMinimum(String)
	 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getDesignDataType_PhysicalMinimum()
	 * @model annotation="http://www.topcased.org/documentation documentation='I use a String type because it is the best alternative to allow any possible entry.'"
	 * @generated
	 */
	String getPhysicalMinimum();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.common.DesignDataType#getPhysicalMinimum <em>Physical Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical Minimum</em>' attribute.
	 * @see #getPhysicalMinimum()
	 * @generated
	 */
	void setPhysicalMinimum(String value);

	/**
	 * Returns the value of the '<em><b>Physical Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the maximum value this attribute might represent in the real world.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Physical Maximum</em>' attribute.
	 * @see #setPhysicalMaximum(String)
	 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getDesignDataType_PhysicalMaximum()
	 * @model annotation="http://www.topcased.org/documentation documentation='I use a String type because it is the best alternative to allow any possible entry.'"
	 * @generated
	 */
	String getPhysicalMaximum();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.common.DesignDataType#getPhysicalMaximum <em>Physical Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical Maximum</em>' attribute.
	 * @see #getPhysicalMaximum()
	 * @generated
	 */
	void setPhysicalMaximum(String value);

	/**
	 * Returns the value of the '<em><b>Significant Digits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the number of significant digits.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Significant Digits</em>' attribute.
	 * @see #setSignificantDigits(int)
	 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getDesignDataType_SignificantDigits()
	 * @model
	 * @generated
	 */
	int getSignificantDigits();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.common.DesignDataType#getSignificantDigits <em>Significant Digits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Significant Digits</em>' attribute.
	 * @see #getSignificantDigits()
	 * @generated
	 */
	void setSignificantDigits(int value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the default value used to initialize the attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(String)
	 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getDesignDataType_DefaultValue()
	 * @model annotation="http://www.topcased.org/documentation documentation='I use a String type because it is the best alternative to allow any possible entry.'"
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.common.DesignDataType#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(String value);

	/**
	 * Returns the value of the '<em><b>Typed Service Parameters</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.common.ServiceParameter}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.common.ServiceParameter#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are the service parameters typed by this data type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Typed Service Parameters</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getDesignDataType_TypedServiceParameters()
	 * @see org.obeonetwork.dsl.east_adl.structure.common.ServiceParameter#getDataType
	 * @model opposite="dataType"
	 * @generated
	 */
	EList<ServiceParameter> getTypedServiceParameters();

	/**
	 * Returns the value of the '<em><b>Type Associations</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.common.TypeAssociation}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.common.TypeAssociation#getDesignDataType <em>Design Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are all the associations of this data type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Associations</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getDesignDataType_TypeAssociations()
	 * @see org.obeonetwork.dsl.east_adl.structure.common.TypeAssociation#getDesignDataType
	 * @model opposite="designDataType"
	 * @generated
	 */
	EList<TypeAssociation> getTypeAssociations();

	/**
	 * Returns the value of the '<em><b>Typed Function Parameters</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.common.Parameter}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.common.Parameter#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Typed Function Parameters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typed Function Parameters</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getDesignDataType_TypedFunctionParameters()
	 * @see org.obeonetwork.dsl.east_adl.structure.common.Parameter#getDataType
	 * @model opposite="dataType"
	 * @generated
	 */
	EList<Parameter> getTypedFunctionParameters();

} // DesignDataType
