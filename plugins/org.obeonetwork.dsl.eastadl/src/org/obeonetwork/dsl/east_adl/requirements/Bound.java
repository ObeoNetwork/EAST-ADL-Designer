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
 * A representation of the model object '<em><b>Bound</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity is used for timing measures.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.Bound#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.Bound#getTimingRestriction <em>Timing Restriction</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.Bound#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage#getBound()
 * @model
 * @generated
 */
public interface Bound extends EObject {
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute is used to express the unit (ms, seconds, etc.).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(String)
	 * @see org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage#getBound_Unit()
	 * @model
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.requirements.Bound#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

	/**
	 * Returns the value of the '<em><b>Timing Restriction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the timing restriction containing this bound.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timing Restriction</em>' reference.
	 * @see org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage#getBound_TimingRestriction()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.topcased.org/documentation documentation='This will be implemented with eContainer reference.'"
	 * @generated
	 */
	TimingRestriction getTimingRestriction();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the actual value of this bound.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage#getBound_Value()
	 * @model
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.requirements.Bound#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

} // Bound
