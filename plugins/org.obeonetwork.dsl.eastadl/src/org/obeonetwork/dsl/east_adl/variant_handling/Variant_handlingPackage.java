/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.variant_handling;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.obeonetwork.dsl.east_adl.core.CorePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * This package contains variant handling entities. Variants can be used to manage different occurences of a common concept or entity making possible to build hierarchies of arbitrary deep.
 * Actually, only a subset of EAST-ADL entities will be variant handling capable.
 * <!-- end-model-doc -->
 * @see org.obeonetwork.dsl.east_adl.variant_handling.Variant_handlingFactory
 * @model kind="package"
 *        annotation="http://www.topcased.org/documentation documentation='These entities will be modeled in the structural view.'"
 * @generated
 */
public interface Variant_handlingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "variant_handling";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.topcased.org/0.11.0/east_adl/variant_handling";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "variant_handling";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Variant_handlingPackage eINSTANCE = org.obeonetwork.dsl.east_adl.variant_handling.impl.Variant_handlingPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.variant_handling.impl.VariantEntityImpl <em>Variant Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.variant_handling.impl.VariantEntityImpl
	 * @see org.obeonetwork.dsl.east_adl.variant_handling.impl.Variant_handlingPackageImpl#getVariantEntity()
	 * @generated
	 */
	int VARIANT_ENTITY = 0;

	/**
	 * The feature id for the '<em><b>Null Variant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_ENTITY__NULL_VARIANT = 0;

	/**
	 * The feature id for the '<em><b>Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_ENTITY__COMPLETE = 1;

	/**
	 * The feature id for the '<em><b>Active Variations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_ENTITY__ACTIVE_VARIATIONS = 2;

	/**
	 * The feature id for the '<em><b>Active Selections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_ENTITY__ACTIVE_SELECTIONS = 3;

	/**
	 * The feature id for the '<em><b>Active Exclusions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_ENTITY__ACTIVE_EXCLUSIONS = 4;

	/**
	 * The feature id for the '<em><b>Passive Variation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_ENTITY__PASSIVE_VARIATION = 5;

	/**
	 * The feature id for the '<em><b>Passive Selections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_ENTITY__PASSIVE_SELECTIONS = 6;

	/**
	 * The feature id for the '<em><b>Passive Exclusions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_ENTITY__PASSIVE_EXCLUSIONS = 7;

	/**
	 * The feature id for the '<em><b>Variation Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_ENTITY__VARIATION_POINT = 8;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_ENTITY__VARIANTS = 9;

	/**
	 * The feature id for the '<em><b>Selectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_ENTITY__SELECTORS = 10;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_ENTITY__SELECTED = 11;

	/**
	 * The feature id for the '<em><b>Excluders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_ENTITY__EXCLUDERS = 12;

	/**
	 * The feature id for the '<em><b>Excluded</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_ENTITY__EXCLUDED = 13;

	/**
	 * The feature id for the '<em><b>Selection Criterion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_ENTITY__SELECTION_CRITERION = 14;

	/**
	 * The number of structural features of the '<em>Variant Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_ENTITY_FEATURE_COUNT = 15;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.variant_handling.impl.VariationImpl <em>Variation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.variant_handling.impl.VariationImpl
	 * @see org.obeonetwork.dsl.east_adl.variant_handling.impl.Variant_handlingPackageImpl#getVariation()
	 * @generated
	 */
	int VARIATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIATION__NAME = CorePackage.EASTADL_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Variant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIATION__VARIANT = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variation Point</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIATION__VARIATION_POINT = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Variation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIATION_FEATURE_COUNT = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.variant_handling.impl.SelectionImpl <em>Selection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.variant_handling.impl.SelectionImpl
	 * @see org.obeonetwork.dsl.east_adl.variant_handling.impl.Variant_handlingPackageImpl#getSelection()
	 * @generated
	 */
	int SELECTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION__NAME = CorePackage.EASTADL_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Selector</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION__SELECTOR = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION__SELECTED = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Selection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION__SELECTION_TYPE = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FEATURE_COUNT = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.variant_handling.impl.ExclusionImpl <em>Exclusion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.variant_handling.impl.ExclusionImpl
	 * @see org.obeonetwork.dsl.east_adl.variant_handling.impl.Variant_handlingPackageImpl#getExclusion()
	 * @generated
	 */
	int EXCLUSION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSION__NAME = CorePackage.EASTADL_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Excluder</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSION__EXCLUDER = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Excluded</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSION__EXCLUDED = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Exclusion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSION_FEATURE_COUNT = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.variant_handling.LogicalOperationKind <em>Logical Operation Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.variant_handling.LogicalOperationKind
	 * @see org.obeonetwork.dsl.east_adl.variant_handling.impl.Variant_handlingPackageImpl#getLogicalOperationKind()
	 * @generated
	 */
	int LOGICAL_OPERATION_KIND = 4;


	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity <em>Variant Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variant Entity</em>'.
	 * @see org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity
	 * @generated
	 */
	EClass getVariantEntity();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity#isNullVariant <em>Null Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Variant</em>'.
	 * @see org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity#isNullVariant()
	 * @see #getVariantEntity()
	 * @generated
	 */
	EAttribute getVariantEntity_NullVariant();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity#isComplete <em>Complete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Complete</em>'.
	 * @see org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity#isComplete()
	 * @see #getVariantEntity()
	 * @generated
	 */
	EAttribute getVariantEntity_Complete();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity#getActiveVariations <em>Active Variations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Active Variations</em>'.
	 * @see org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity#getActiveVariations()
	 * @see #getVariantEntity()
	 * @generated
	 */
	EReference getVariantEntity_ActiveVariations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity#getActiveSelections <em>Active Selections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Active Selections</em>'.
	 * @see org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity#getActiveSelections()
	 * @see #getVariantEntity()
	 * @generated
	 */
	EReference getVariantEntity_ActiveSelections();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity#getActiveExclusions <em>Active Exclusions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Active Exclusions</em>'.
	 * @see org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity#getActiveExclusions()
	 * @see #getVariantEntity()
	 * @generated
	 */
	EReference getVariantEntity_ActiveExclusions();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity#getPassiveVariation <em>Passive Variation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Passive Variation</em>'.
	 * @see org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity#getPassiveVariation()
	 * @see #getVariantEntity()
	 * @generated
	 */
	EReference getVariantEntity_PassiveVariation();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity#getPassiveSelections <em>Passive Selections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Passive Selections</em>'.
	 * @see org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity#getPassiveSelections()
	 * @see #getVariantEntity()
	 * @generated
	 */
	EReference getVariantEntity_PassiveSelections();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity#getPassiveExclusions <em>Passive Exclusions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Passive Exclusions</em>'.
	 * @see org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity#getPassiveExclusions()
	 * @see #getVariantEntity()
	 * @generated
	 */
	EReference getVariantEntity_PassiveExclusions();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity#getVariationPoint <em>Variation Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variation Point</em>'.
	 * @see org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity#getVariationPoint()
	 * @see #getVariantEntity()
	 * @generated
	 */
	EReference getVariantEntity_VariationPoint();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity#getVariants <em>Variants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Variants</em>'.
	 * @see org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity#getVariants()
	 * @see #getVariantEntity()
	 * @generated
	 */
	EReference getVariantEntity_Variants();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity#getSelectors <em>Selectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Selectors</em>'.
	 * @see org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity#getSelectors()
	 * @see #getVariantEntity()
	 * @generated
	 */
	EReference getVariantEntity_Selectors();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity#getSelected <em>Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Selected</em>'.
	 * @see org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity#getSelected()
	 * @see #getVariantEntity()
	 * @generated
	 */
	EReference getVariantEntity_Selected();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity#getExcluders <em>Excluders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Excluders</em>'.
	 * @see org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity#getExcluders()
	 * @see #getVariantEntity()
	 * @generated
	 */
	EReference getVariantEntity_Excluders();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity#getExcluded <em>Excluded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Excluded</em>'.
	 * @see org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity#getExcluded()
	 * @see #getVariantEntity()
	 * @generated
	 */
	EReference getVariantEntity_Excluded();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity#getSelectionCriterion <em>Selection Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selection Criterion</em>'.
	 * @see org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity#getSelectionCriterion()
	 * @see #getVariantEntity()
	 * @generated
	 */
	EAttribute getVariantEntity_SelectionCriterion();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.variant_handling.Variation <em>Variation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variation</em>'.
	 * @see org.obeonetwork.dsl.east_adl.variant_handling.Variation
	 * @generated
	 */
	EClass getVariation();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.variant_handling.Variation#getVariant <em>Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variant</em>'.
	 * @see org.obeonetwork.dsl.east_adl.variant_handling.Variation#getVariant()
	 * @see #getVariation()
	 * @generated
	 */
	EReference getVariation_Variant();

	/**
	 * Returns the meta object for the container reference '{@link org.obeonetwork.dsl.east_adl.variant_handling.Variation#getVariationPoint <em>Variation Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Variation Point</em>'.
	 * @see org.obeonetwork.dsl.east_adl.variant_handling.Variation#getVariationPoint()
	 * @see #getVariation()
	 * @generated
	 */
	EReference getVariation_VariationPoint();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.variant_handling.Selection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selection</em>'.
	 * @see org.obeonetwork.dsl.east_adl.variant_handling.Selection
	 * @generated
	 */
	EClass getSelection();

	/**
	 * Returns the meta object for the container reference '{@link org.obeonetwork.dsl.east_adl.variant_handling.Selection#getSelector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Selector</em>'.
	 * @see org.obeonetwork.dsl.east_adl.variant_handling.Selection#getSelector()
	 * @see #getSelection()
	 * @generated
	 */
	EReference getSelection_Selector();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.variant_handling.Selection#getSelected <em>Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Selected</em>'.
	 * @see org.obeonetwork.dsl.east_adl.variant_handling.Selection#getSelected()
	 * @see #getSelection()
	 * @generated
	 */
	EReference getSelection_Selected();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.variant_handling.Selection#getSelectionType <em>Selection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selection Type</em>'.
	 * @see org.obeonetwork.dsl.east_adl.variant_handling.Selection#getSelectionType()
	 * @see #getSelection()
	 * @generated
	 */
	EAttribute getSelection_SelectionType();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.variant_handling.Exclusion <em>Exclusion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exclusion</em>'.
	 * @see org.obeonetwork.dsl.east_adl.variant_handling.Exclusion
	 * @generated
	 */
	EClass getExclusion();

	/**
	 * Returns the meta object for the container reference '{@link org.obeonetwork.dsl.east_adl.variant_handling.Exclusion#getExcluder <em>Excluder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Excluder</em>'.
	 * @see org.obeonetwork.dsl.east_adl.variant_handling.Exclusion#getExcluder()
	 * @see #getExclusion()
	 * @generated
	 */
	EReference getExclusion_Excluder();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.variant_handling.Exclusion#getExcluded <em>Excluded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Excluded</em>'.
	 * @see org.obeonetwork.dsl.east_adl.variant_handling.Exclusion#getExcluded()
	 * @see #getExclusion()
	 * @generated
	 */
	EReference getExclusion_Excluded();

	/**
	 * Returns the meta object for enum '{@link org.obeonetwork.dsl.east_adl.variant_handling.LogicalOperationKind <em>Logical Operation Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Logical Operation Kind</em>'.
	 * @see org.obeonetwork.dsl.east_adl.variant_handling.LogicalOperationKind
	 * @generated
	 */
	EEnum getLogicalOperationKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Variant_handlingFactory getVariant_handlingFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.variant_handling.impl.VariantEntityImpl <em>Variant Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.variant_handling.impl.VariantEntityImpl
		 * @see org.obeonetwork.dsl.east_adl.variant_handling.impl.Variant_handlingPackageImpl#getVariantEntity()
		 * @generated
		 */
		EClass VARIANT_ENTITY = eINSTANCE.getVariantEntity();

		/**
		 * The meta object literal for the '<em><b>Null Variant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIANT_ENTITY__NULL_VARIANT = eINSTANCE.getVariantEntity_NullVariant();

		/**
		 * The meta object literal for the '<em><b>Complete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIANT_ENTITY__COMPLETE = eINSTANCE.getVariantEntity_Complete();

		/**
		 * The meta object literal for the '<em><b>Active Variations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIANT_ENTITY__ACTIVE_VARIATIONS = eINSTANCE.getVariantEntity_ActiveVariations();

		/**
		 * The meta object literal for the '<em><b>Active Selections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIANT_ENTITY__ACTIVE_SELECTIONS = eINSTANCE.getVariantEntity_ActiveSelections();

		/**
		 * The meta object literal for the '<em><b>Active Exclusions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIANT_ENTITY__ACTIVE_EXCLUSIONS = eINSTANCE.getVariantEntity_ActiveExclusions();

		/**
		 * The meta object literal for the '<em><b>Passive Variation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIANT_ENTITY__PASSIVE_VARIATION = eINSTANCE.getVariantEntity_PassiveVariation();

		/**
		 * The meta object literal for the '<em><b>Passive Selections</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIANT_ENTITY__PASSIVE_SELECTIONS = eINSTANCE.getVariantEntity_PassiveSelections();

		/**
		 * The meta object literal for the '<em><b>Passive Exclusions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIANT_ENTITY__PASSIVE_EXCLUSIONS = eINSTANCE.getVariantEntity_PassiveExclusions();

		/**
		 * The meta object literal for the '<em><b>Variation Point</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIANT_ENTITY__VARIATION_POINT = eINSTANCE.getVariantEntity_VariationPoint();

		/**
		 * The meta object literal for the '<em><b>Variants</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIANT_ENTITY__VARIANTS = eINSTANCE.getVariantEntity_Variants();

		/**
		 * The meta object literal for the '<em><b>Selectors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIANT_ENTITY__SELECTORS = eINSTANCE.getVariantEntity_Selectors();

		/**
		 * The meta object literal for the '<em><b>Selected</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIANT_ENTITY__SELECTED = eINSTANCE.getVariantEntity_Selected();

		/**
		 * The meta object literal for the '<em><b>Excluders</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIANT_ENTITY__EXCLUDERS = eINSTANCE.getVariantEntity_Excluders();

		/**
		 * The meta object literal for the '<em><b>Excluded</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIANT_ENTITY__EXCLUDED = eINSTANCE.getVariantEntity_Excluded();

		/**
		 * The meta object literal for the '<em><b>Selection Criterion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIANT_ENTITY__SELECTION_CRITERION = eINSTANCE.getVariantEntity_SelectionCriterion();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.variant_handling.impl.VariationImpl <em>Variation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.variant_handling.impl.VariationImpl
		 * @see org.obeonetwork.dsl.east_adl.variant_handling.impl.Variant_handlingPackageImpl#getVariation()
		 * @generated
		 */
		EClass VARIATION = eINSTANCE.getVariation();

		/**
		 * The meta object literal for the '<em><b>Variant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIATION__VARIANT = eINSTANCE.getVariation_Variant();

		/**
		 * The meta object literal for the '<em><b>Variation Point</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIATION__VARIATION_POINT = eINSTANCE.getVariation_VariationPoint();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.variant_handling.impl.SelectionImpl <em>Selection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.variant_handling.impl.SelectionImpl
		 * @see org.obeonetwork.dsl.east_adl.variant_handling.impl.Variant_handlingPackageImpl#getSelection()
		 * @generated
		 */
		EClass SELECTION = eINSTANCE.getSelection();

		/**
		 * The meta object literal for the '<em><b>Selector</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECTION__SELECTOR = eINSTANCE.getSelection_Selector();

		/**
		 * The meta object literal for the '<em><b>Selected</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECTION__SELECTED = eINSTANCE.getSelection_Selected();

		/**
		 * The meta object literal for the '<em><b>Selection Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECTION__SELECTION_TYPE = eINSTANCE.getSelection_SelectionType();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.variant_handling.impl.ExclusionImpl <em>Exclusion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.variant_handling.impl.ExclusionImpl
		 * @see org.obeonetwork.dsl.east_adl.variant_handling.impl.Variant_handlingPackageImpl#getExclusion()
		 * @generated
		 */
		EClass EXCLUSION = eINSTANCE.getExclusion();

		/**
		 * The meta object literal for the '<em><b>Excluder</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCLUSION__EXCLUDER = eINSTANCE.getExclusion_Excluder();

		/**
		 * The meta object literal for the '<em><b>Excluded</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCLUSION__EXCLUDED = eINSTANCE.getExclusion_Excluded();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.variant_handling.LogicalOperationKind <em>Logical Operation Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.variant_handling.LogicalOperationKind
		 * @see org.obeonetwork.dsl.east_adl.variant_handling.impl.Variant_handlingPackageImpl#getLogicalOperationKind()
		 * @generated
		 */
		EEnum LOGICAL_OPERATION_KIND = eINSTANCE.getLogicalOperationKind();

	}

} //Variant_handlingPackage
