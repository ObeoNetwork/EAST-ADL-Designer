/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.common;

import org.obeonetwork.dsl.east_adl.core.EASTADLNamedElement;

import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity defines which DDT is implemented by what IDT and the transformation function between. Note that each type association is implemented in the context of a certain processor.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.TypeAssociation#getScaleFactor <em>Scale Factor</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.TypeAssociation#getScaleOffset <em>Scale Offset</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.TypeAssociation#getDesignDataType <em>Design Data Type</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.TypeAssociation#getImplementationDataType <em>Implementation Data Type</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.TypeAssociation#getProcessor <em>Processor</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getTypeAssociation()
 * @model
 * @generated
 */
public interface TypeAssociation extends EASTADLNamedElement {
	/**
	 * Returns the value of the '<em><b>Scale Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the multiplier of the implementation value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scale Factor</em>' attribute.
	 * @see #setScaleFactor(double)
	 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getTypeAssociation_ScaleFactor()
	 * @model
	 * @generated
	 */
	double getScaleFactor();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.common.TypeAssociation#getScaleFactor <em>Scale Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale Factor</em>' attribute.
	 * @see #getScaleFactor()
	 * @generated
	 */
	void setScaleFactor(double value);

	/**
	 * Returns the value of the '<em><b>Scale Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the offset of the multiplied value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scale Offset</em>' attribute.
	 * @see #setScaleOffset(double)
	 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getTypeAssociation_ScaleOffset()
	 * @model
	 * @generated
	 */
	double getScaleOffset();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.common.TypeAssociation#getScaleOffset <em>Scale Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale Offset</em>' attribute.
	 * @see #getScaleOffset()
	 * @generated
	 */
	void setScaleOffset(double value);

	/**
	 * Returns the value of the '<em><b>Design Data Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.common.DesignDataType#getTypeAssociations <em>Type Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the design data type of this association.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Design Data Type</em>' reference.
	 * @see #setDesignDataType(DesignDataType)
	 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getTypeAssociation_DesignDataType()
	 * @see org.obeonetwork.dsl.east_adl.structure.common.DesignDataType#getTypeAssociations
	 * @model opposite="typeAssociations"
	 * @generated
	 */
	DesignDataType getDesignDataType();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.common.TypeAssociation#getDesignDataType <em>Design Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Design Data Type</em>' reference.
	 * @see #getDesignDataType()
	 * @generated
	 */
	void setDesignDataType(DesignDataType value);

	/**
	 * Returns the value of the '<em><b>Implementation Data Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.common.ImplementationDataType#getTypeAssociations <em>Type Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the implementation data type of this association.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Implementation Data Type</em>' reference.
	 * @see #setImplementationDataType(ImplementationDataType)
	 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getTypeAssociation_ImplementationDataType()
	 * @see org.obeonetwork.dsl.east_adl.structure.common.ImplementationDataType#getTypeAssociations
	 * @model opposite="typeAssociations"
	 * @generated
	 */
	ImplementationDataType getImplementationDataType();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.common.TypeAssociation#getImplementationDataType <em>Implementation Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation Data Type</em>' reference.
	 * @see #getImplementationDataType()
	 * @generated
	 */
	void setImplementationDataType(ImplementationDataType value);

	/**
	 * Returns the value of the '<em><b>Processor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor#getTypeAssociations <em>Type Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the target processor of this association.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Processor</em>' reference.
	 * @see #setProcessor(Processor)
	 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getTypeAssociation_Processor()
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor#getTypeAssociations
	 * @model opposite="typeAssociations"
	 * @generated
	 */
	Processor getProcessor();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.common.TypeAssociation#getProcessor <em>Processor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processor</em>' reference.
	 * @see #getProcessor()
	 * @generated
	 */
	void setProcessor(Processor value);

} // TypeAssociation
