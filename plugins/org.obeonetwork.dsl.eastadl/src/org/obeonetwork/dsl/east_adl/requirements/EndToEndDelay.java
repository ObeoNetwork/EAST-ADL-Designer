/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.requirements;

import org.obeonetwork.dsl.east_adl.structure.common.FunctionPort;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>End To End Delay</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is the entity used to constrain a delay between the arrival of a signal in a port and the writing of a signal in another port as to fall in certain bounds.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.EndToEndDelay#getFrom <em>From</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.EndToEndDelay#getUntil <em>Until</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.EndToEndDelay#getProbability <em>Probability</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage#getEndToEndDelay()
 * @model
 * @generated
 */
public interface EndToEndDelay extends QualityRequirement, TimingRestriction {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.common.FunctionPort#getFromDelay <em>From Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the port where a signal arrival or writing marks the beginning of computation for the end to end delay.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(FunctionPort)
	 * @see org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage#getEndToEndDelay_From()
	 * @see org.obeonetwork.dsl.east_adl.structure.common.FunctionPort#getFromDelay
	 * @model opposite="fromDelay"
	 * @generated
	 */
	FunctionPort getFrom();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.requirements.EndToEndDelay#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(FunctionPort value);

	/**
	 * Returns the value of the '<em><b>Until</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.common.FunctionPort#getUntilDelay <em>Until Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the port where a signal arrival or writing marks the ending of computation for the end to end delay.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Until</em>' reference.
	 * @see #setUntil(FunctionPort)
	 * @see org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage#getEndToEndDelay_Until()
	 * @see org.obeonetwork.dsl.east_adl.structure.common.FunctionPort#getUntilDelay
	 * @model opposite="untilDelay"
	 * @generated
	 */
	FunctionPort getUntil();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.requirements.EndToEndDelay#getUntil <em>Until</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Until</em>' reference.
	 * @see #getUntil()
	 * @generated
	 */
	void setUntil(FunctionPort value);

	/**
	 * Returns the value of the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute is used to express a probability that that this entity will be higher than the lower bound and less than the upper bound.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Probability</em>' attribute.
	 * @see #setProbability(int)
	 * @see org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage#getEndToEndDelay_Probability()
	 * @model annotation="http://www.topcased.org/documentation documentation='In EAST-ADL specification this is typed as Bound, which is meaningless ...'"
	 * @generated
	 */
	int getProbability();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.requirements.EndToEndDelay#getProbability <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probability</em>' attribute.
	 * @see #getProbability()
	 * @generated
	 */
	void setProbability(int value);

} // EndToEndDelay
