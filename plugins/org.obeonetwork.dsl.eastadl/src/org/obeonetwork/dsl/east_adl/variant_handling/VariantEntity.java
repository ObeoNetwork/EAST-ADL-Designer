/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.variant_handling;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variant Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is an entity that can have a variant handling capabilities. Actually only a subset of EAST ADL structure can be considered as variant entities.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity#isNullVariant <em>Null Variant</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity#isComplete <em>Complete</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity#getActiveVariations <em>Active Variations</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity#getActiveSelections <em>Active Selections</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity#getActiveExclusions <em>Active Exclusions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity#getPassiveVariation <em>Passive Variation</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity#getPassiveSelections <em>Passive Selections</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity#getPassiveExclusions <em>Passive Exclusions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity#getVariationPoint <em>Variation Point</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity#getVariants <em>Variants</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity#getSelectors <em>Selectors</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity#getSelected <em>Selected</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity#getExcluders <em>Excluders</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity#getExcluded <em>Excluded</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity#getSelectionCriterion <em>Selection Criterion</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.variant_handling.Variant_handlingPackage#getVariantEntity()
 * @model abstract="true"
 *        annotation="http://www.topcased.org/documentation documentation='This entity may have derived properties that are deleted from graphical view for readability purposes.'"
 * @generated
 */
public interface VariantEntity extends EObject {
	/**
	 * Returns the value of the '<em><b>Null Variant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute is used to declare a void realization of a variation point (meaning that it becomes optional).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Null Variant</em>' attribute.
	 * @see #setNullVariant(boolean)
	 * @see org.obeonetwork.dsl.east_adl.variant_handling.Variant_handlingPackage#getVariantEntity_NullVariant()
	 * @model
	 * @generated
	 */
	boolean isNullVariant();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity#isNullVariant <em>Null Variant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Null Variant</em>' attribute.
	 * @see #isNullVariant()
	 * @generated
	 */
	void setNullVariant(boolean value);

	/**
	 * Returns the value of the '<em><b>Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute is used to declare that the selection criterion of this variant entity is not complete.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Complete</em>' attribute.
	 * @see #setComplete(boolean)
	 * @see org.obeonetwork.dsl.east_adl.variant_handling.Variant_handlingPackage#getVariantEntity_Complete()
	 * @model
	 * @generated
	 */
	boolean isComplete();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity#isComplete <em>Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complete</em>' attribute.
	 * @see #isComplete()
	 * @generated
	 */
	void setComplete(boolean value);

	/**
	 * Returns the value of the '<em><b>Active Variations</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.variant_handling.Variation}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.variant_handling.Variation#getVariationPoint <em>Variation Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are all variants of this entity. A variation is used here for a proxy-like representation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Active Variations</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.variant_handling.Variant_handlingPackage#getVariantEntity_ActiveVariations()
	 * @see org.obeonetwork.dsl.east_adl.variant_handling.Variation#getVariationPoint
	 * @model opposite="variationPoint" containment="true"
	 * @generated
	 */
	EList<Variation> getActiveVariations();

	/**
	 * Returns the value of the '<em><b>Active Selections</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.variant_handling.Selection}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.variant_handling.Selection#getSelector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are all the variant entitites that are selected by this variant entity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Active Selections</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.variant_handling.Variant_handlingPackage#getVariantEntity_ActiveSelections()
	 * @see org.obeonetwork.dsl.east_adl.variant_handling.Selection#getSelector
	 * @model opposite="selector" containment="true"
	 * @generated
	 */
	EList<Selection> getActiveSelections();

	/**
	 * Returns the value of the '<em><b>Active Exclusions</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.variant_handling.Exclusion}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.variant_handling.Exclusion#getExcluder <em>Excluder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are all variant entities that cannot exist with this variant entity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Active Exclusions</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.variant_handling.Variant_handlingPackage#getVariantEntity_ActiveExclusions()
	 * @see org.obeonetwork.dsl.east_adl.variant_handling.Exclusion#getExcluder
	 * @model opposite="excluder" containment="true"
	 * @generated
	 */
	EList<Exclusion> getActiveExclusions();

	/**
	 * Returns the value of the '<em><b>Passive Variation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.variant_handling.Variation#getVariant <em>Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This represents the variation point of this entity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Passive Variation</em>' reference.
	 * @see #setPassiveVariation(Variation)
	 * @see org.obeonetwork.dsl.east_adl.variant_handling.Variant_handlingPackage#getVariantEntity_PassiveVariation()
	 * @see org.obeonetwork.dsl.east_adl.variant_handling.Variation#getVariant
	 * @model opposite="variant"
	 * @generated
	 */
	Variation getPassiveVariation();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity#getPassiveVariation <em>Passive Variation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passive Variation</em>' reference.
	 * @see #getPassiveVariation()
	 * @generated
	 */
	void setPassiveVariation(Variation value);

	/**
	 * Returns the value of the '<em><b>Passive Selections</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.variant_handling.Selection}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.variant_handling.Selection#getSelected <em>Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are the selections representing selectors of this variant entity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Passive Selections</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.variant_handling.Variant_handlingPackage#getVariantEntity_PassiveSelections()
	 * @see org.obeonetwork.dsl.east_adl.variant_handling.Selection#getSelected
	 * @model opposite="selected"
	 * @generated
	 */
	EList<Selection> getPassiveSelections();

	/**
	 * Returns the value of the '<em><b>Passive Exclusions</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.variant_handling.Exclusion}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.variant_handling.Exclusion#getExcluded <em>Excluded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are the exclusions representing excluders of this variant entity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Passive Exclusions</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.variant_handling.Variant_handlingPackage#getVariantEntity_PassiveExclusions()
	 * @see org.obeonetwork.dsl.east_adl.variant_handling.Exclusion#getExcluded
	 * @model opposite="excluded"
	 * @generated
	 */
	EList<Exclusion> getPassiveExclusions();

	/**
	 * Returns the value of the '<em><b>Variation Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is a derived property used to show a variation point of this entity (if any).
	 * This property will be shown instead of the variation model object because it is more explicit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variation Point</em>' reference.
	 * @see org.obeonetwork.dsl.east_adl.variant_handling.Variant_handlingPackage#getVariantEntity_VariationPoint()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	VariantEntity getVariationPoint();

	/**
	 * Returns the value of the '<em><b>Variants</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is a derived property used to show all variants of this entity (if any).
	 * This property will be shown instead of the corresponding variation model objects because it is more explicit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variants</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.variant_handling.Variant_handlingPackage#getVariantEntity_Variants()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<VariantEntity> getVariants();

	/**
	 * Returns the value of the '<em><b>Selectors</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is a derived property used to show all selectors of this entity (if any).
	 * This property will be shown instead of the corresponding selection model objects because it is more explicit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Selectors</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.variant_handling.Variant_handlingPackage#getVariantEntity_Selectors()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<VariantEntity> getSelectors();

	/**
	 * Returns the value of the '<em><b>Selected</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is a derived property used to show all objects selected by this entity (if any).
	 * This property will be shown instead of the corresponding selection model objects because it is more explicit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Selected</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.variant_handling.Variant_handlingPackage#getVariantEntity_Selected()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<VariantEntity> getSelected();

	/**
	 * Returns the value of the '<em><b>Excluders</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is a derived property used to show all excluders of this entity (if any).
	 * This property will be shown instead of the corresponding exclusion model objects because it is more explicit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Excluders</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.variant_handling.Variant_handlingPackage#getVariantEntity_Excluders()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<VariantEntity> getExcluders();

	/**
	 * Returns the value of the '<em><b>Excluded</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is a derived property used to show all objects excluded by this entity (if any).
	 * This property will be shown instead of the corresponding  exclusion model objects because it is more explicit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Excluded</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.variant_handling.Variant_handlingPackage#getVariantEntity_Excluded()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<VariantEntity> getExcluded();

	/**
	 * Returns the value of the '<em><b>Selection Criterion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute is the condition required for this object to be selected.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Selection Criterion</em>' attribute.
	 * @see #setSelectionCriterion(String)
	 * @see org.obeonetwork.dsl.east_adl.variant_handling.Variant_handlingPackage#getVariantEntity_SelectionCriterion()
	 * @model annotation="http://www.topcased.org/documentation documentation='This object is modeled as an attribute instead of a eclass (EAST-ADL specification) because i saw no point in making a complex object for something that represents a condition (for now).'"
	 * @generated
	 */
	String getSelectionCriterion();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity#getSelectionCriterion <em>Selection Criterion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection Criterion</em>' attribute.
	 * @see #getSelectionCriterion()
	 * @generated
	 */
	void setSelectionCriterion(String value);

} // VariantEntity
