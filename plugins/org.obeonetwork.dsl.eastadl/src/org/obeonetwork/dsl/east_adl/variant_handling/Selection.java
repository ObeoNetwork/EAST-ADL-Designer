/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.variant_handling;

import org.obeonetwork.dsl.east_adl.core.EASTADLNamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity allows user to establish a dependency between variants entities meaning that if one (all)  selector(s) is(are) selected, the dependant entities will also be selected. A Selection model object is used here to allow more explicit modeling.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.variant_handling.Selection#getSelector <em>Selector</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.variant_handling.Selection#getSelected <em>Selected</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.variant_handling.Selection#getSelectionType <em>Selection Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.variant_handling.Variant_handlingPackage#getSelection()
 * @model annotation="http://www.topcased.org/documentation documentation='This object will be implemented graphically by a connection.'"
 * @generated
 */
public interface Selection extends EASTADLNamedElement {
	/**
	 * Returns the value of the '<em><b>Selector</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity#getActiveSelections <em>Active Selections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the selector of this selection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Selector</em>' container reference.
	 * @see #setSelector(VariantEntity)
	 * @see org.obeonetwork.dsl.east_adl.variant_handling.Variant_handlingPackage#getSelection_Selector()
	 * @see org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity#getActiveSelections
	 * @model opposite="activeSelections" required="true" transient="false"
	 * @generated
	 */
	VariantEntity getSelector();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.variant_handling.Selection#getSelector <em>Selector</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selector</em>' container reference.
	 * @see #getSelector()
	 * @generated
	 */
	void setSelector(VariantEntity value);

	/**
	 * Returns the value of the '<em><b>Selected</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity#getPassiveSelections <em>Passive Selections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are the actual variant entities that are selected (dependant) by the selector of this selection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Selected</em>' reference.
	 * @see #setSelected(VariantEntity)
	 * @see org.obeonetwork.dsl.east_adl.variant_handling.Variant_handlingPackage#getSelection_Selected()
	 * @see org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity#getPassiveSelections
	 * @model opposite="passiveSelections"
	 * @generated
	 */
	VariantEntity getSelected();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.variant_handling.Selection#getSelected <em>Selected</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected</em>' reference.
	 * @see #getSelected()
	 * @generated
	 */
	void setSelected(VariantEntity value);

	/**
	 * Returns the value of the '<em><b>Selection Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.obeonetwork.dsl.east_adl.variant_handling.LogicalOperationKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This enumeration specifies whether one or all selectors should be selected for dependant entities to be selected. Possible values are OR and AND.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Selection Type</em>' attribute.
	 * @see org.obeonetwork.dsl.east_adl.variant_handling.LogicalOperationKind
	 * @see #setSelectionType(LogicalOperationKind)
	 * @see org.obeonetwork.dsl.east_adl.variant_handling.Variant_handlingPackage#getSelection_SelectionType()
	 * @model
	 * @generated
	 */
	LogicalOperationKind getSelectionType();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.variant_handling.Selection#getSelectionType <em>Selection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection Type</em>' attribute.
	 * @see org.obeonetwork.dsl.east_adl.variant_handling.LogicalOperationKind
	 * @see #getSelectionType()
	 * @generated
	 */
	void setSelectionType(LogicalOperationKind value);

} // Selection
