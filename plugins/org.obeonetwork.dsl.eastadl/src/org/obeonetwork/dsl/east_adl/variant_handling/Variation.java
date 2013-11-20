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
 * A representation of the model object '<em><b>Variation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity allows adding an arbitrary number of variants for a variant entity. A dedicated object is used instead of a property to provide a better view of the model.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.variant_handling.Variation#getVariant <em>Variant</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.variant_handling.Variation#getVariationPoint <em>Variation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.variant_handling.Variant_handlingPackage#getVariation()
 * @model annotation="http://www.topcased.org/documentation documentation='This object will be implemented graphically by a connection.'"
 * @generated
 */
public interface Variation extends EASTADLNamedElement {
	/**
	 * Returns the value of the '<em><b>Variant</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity#getPassiveVariation <em>Passive Variation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the actual variant of the variation point of this entity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variant</em>' reference.
	 * @see #setVariant(VariantEntity)
	 * @see org.obeonetwork.dsl.east_adl.variant_handling.Variant_handlingPackage#getVariation_Variant()
	 * @see org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity#getPassiveVariation
	 * @model opposite="passiveVariation"
	 * @generated
	 */
	VariantEntity getVariant();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.variant_handling.Variation#getVariant <em>Variant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variant</em>' reference.
	 * @see #getVariant()
	 * @generated
	 */
	void setVariant(VariantEntity value);

	/**
	 * Returns the value of the '<em><b>Variation Point</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity#getActiveVariations <em>Active Variations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the variation point of this variation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variation Point</em>' container reference.
	 * @see #setVariationPoint(VariantEntity)
	 * @see org.obeonetwork.dsl.east_adl.variant_handling.Variant_handlingPackage#getVariation_VariationPoint()
	 * @see org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity#getActiveVariations
	 * @model opposite="activeVariations" required="true" transient="false"
	 * @generated
	 */
	VariantEntity getVariationPoint();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.variant_handling.Variation#getVariationPoint <em>Variation Point</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variation Point</em>' container reference.
	 * @see #getVariationPoint()
	 * @generated
	 */
	void setVariationPoint(VariantEntity value);

} // Variation
