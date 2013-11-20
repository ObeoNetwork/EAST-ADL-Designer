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
 * A representation of the model object '<em><b>Exclusion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity allows user to establish a dependency between variant entities that cannot exist together. An exclusion model object is used here to allow more explicit modeling.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.variant_handling.Exclusion#getExcluder <em>Excluder</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.variant_handling.Exclusion#getExcluded <em>Excluded</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.variant_handling.Variant_handlingPackage#getExclusion()
 * @model annotation="http://www.topcased.org/documentation documentation='This object will be implemented graphically by a connection.'"
 * @generated
 */
public interface Exclusion extends EASTADLNamedElement {
	/**
	 * Returns the value of the '<em><b>Excluder</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity#getActiveExclusions <em>Active Exclusions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the excluder object of this exclusion.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Excluder</em>' container reference.
	 * @see #setExcluder(VariantEntity)
	 * @see org.obeonetwork.dsl.east_adl.variant_handling.Variant_handlingPackage#getExclusion_Excluder()
	 * @see org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity#getActiveExclusions
	 * @model opposite="activeExclusions" required="true" transient="false"
	 * @generated
	 */
	VariantEntity getExcluder();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.variant_handling.Exclusion#getExcluder <em>Excluder</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Excluder</em>' container reference.
	 * @see #getExcluder()
	 * @generated
	 */
	void setExcluder(VariantEntity value);

	/**
	 * Returns the value of the '<em><b>Excluded</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity#getPassiveExclusions <em>Passive Exclusions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are the actual variant entities that are excluded by the excluder of this exclusion.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Excluded</em>' reference.
	 * @see #setExcluded(VariantEntity)
	 * @see org.obeonetwork.dsl.east_adl.variant_handling.Variant_handlingPackage#getExclusion_Excluded()
	 * @see org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity#getPassiveExclusions
	 * @model opposite="passiveExclusions"
	 * @generated
	 */
	VariantEntity getExcluded();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.variant_handling.Exclusion#getExcluded <em>Excluded</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Excluded</em>' reference.
	 * @see #getExcluded()
	 * @generated
	 */
	void setExcluded(VariantEntity value);

} // Exclusion
