/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.requirements;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timing Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is the entity used to give bounds to system timed attributes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.TimingRestriction#getUpper <em>Upper</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.TimingRestriction#getLower <em>Lower</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.TimingRestriction#getNominal <em>Nominal</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.TimingRestriction#getJitter <em>Jitter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage#getTimingRestriction()
 * @model
 * @generated
 */
public interface TimingRestriction extends EObject {
	/**
	 * Returns the value of the '<em><b>Upper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the maximal allowed value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Upper</em>' containment reference.
	 * @see #setUpper(Bound)
	 * @see org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage#getTimingRestriction_Upper()
	 * @model containment="true"
	 *        annotation="http://www.topcased.org/documentation documentation='It is not a multiplicity-many feature as depicted in the specification.'"
	 * @generated
	 */
	Bound getUpper();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.requirements.TimingRestriction#getUpper <em>Upper</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper</em>' containment reference.
	 * @see #getUpper()
	 * @generated
	 */
	void setUpper(Bound value);

	/**
	 * Returns the value of the '<em><b>Lower</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the minimal allowed value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lower</em>' containment reference.
	 * @see #setLower(Bound)
	 * @see org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage#getTimingRestriction_Lower()
	 * @model containment="true"
	 * @generated
	 */
	Bound getLower();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.requirements.TimingRestriction#getLower <em>Lower</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower</em>' containment reference.
	 * @see #getLower()
	 * @generated
	 */
	void setLower(Bound value);

	/**
	 * Returns the value of the '<em><b>Nominal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the nominal or target value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nominal</em>' containment reference.
	 * @see #setNominal(Bound)
	 * @see org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage#getTimingRestriction_Nominal()
	 * @model containment="true"
	 * @generated
	 */
	Bound getNominal();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.requirements.TimingRestriction#getNominal <em>Nominal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nominal</em>' containment reference.
	 * @see #getNominal()
	 * @generated
	 */
	void setNominal(Bound value);

	/**
	 * Returns the value of the '<em><b>Jitter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the maximum allowed run-time variation for a value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Jitter</em>' containment reference.
	 * @see #setJitter(Bound)
	 * @see org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage#getTimingRestriction_Jitter()
	 * @model containment="true"
	 * @generated
	 */
	Bound getJitter();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.requirements.TimingRestriction#getJitter <em>Jitter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jitter</em>' containment reference.
	 * @see #getJitter()
	 * @generated
	 */
	void setJitter(Bound value);

} // TimingRestriction
