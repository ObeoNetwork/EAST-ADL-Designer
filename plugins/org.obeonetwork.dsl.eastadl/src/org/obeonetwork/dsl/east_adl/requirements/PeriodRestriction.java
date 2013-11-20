/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.requirements;

import org.eclipse.emf.common.util.EList;

import org.obeonetwork.dsl.east_adl.structure.common.FunctionPort;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Period Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is the entity used to restrict allowed periods for either ports or logical clusters.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.PeriodRestriction#getAssignedPorts <em>Assigned Ports</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage#getPeriodRestriction()
 * @model
 * @generated
 */
public interface PeriodRestriction extends QualityRequirement, TimingRestriction {
	/**
	 * Returns the value of the '<em><b>Assigned Ports</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.common.FunctionPort}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.common.FunctionPort#getPeriodRestriction <em>Period Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the port whose period must match the period restriction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assigned Ports</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage#getPeriodRestriction_AssignedPorts()
	 * @see org.obeonetwork.dsl.east_adl.structure.common.FunctionPort#getPeriodRestriction
	 * @model opposite="periodRestriction"
	 * @generated
	 */
	EList<FunctionPort> getAssignedPorts();

} // PeriodRestriction
