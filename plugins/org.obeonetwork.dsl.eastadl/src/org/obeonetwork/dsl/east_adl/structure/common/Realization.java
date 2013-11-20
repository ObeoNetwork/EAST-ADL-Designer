/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.common;

import org.obeonetwork.dsl.east_adl.core.EASTADLNamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Realization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity is used to declare a realization association between two elements.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.Realization#getRealizedEntity <em>Realized Entity</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.Realization#getRealizingEntity <em>Realizing Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getRealization()
 * @model annotation="http://www.topcased.org/documentation documentation='This entity will be implemented by a connection.'"
 * @generated
 */
public interface Realization extends EASTADLNamedElement {
	/**
	 * Returns the value of the '<em><b>Realized Entity</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.common.RealizedEntity#getPassiveRealizations <em>Passive Realizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the entity that is actually realized by the owner of this realization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Realized Entity</em>' reference.
	 * @see #setRealizedEntity(RealizedEntity)
	 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getRealization_RealizedEntity()
	 * @see org.obeonetwork.dsl.east_adl.structure.common.RealizedEntity#getPassiveRealizations
	 * @model opposite="passiveRealizations"
	 * @generated
	 */
	RealizedEntity getRealizedEntity();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.common.Realization#getRealizedEntity <em>Realized Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Realized Entity</em>' reference.
	 * @see #getRealizedEntity()
	 * @generated
	 */
	void setRealizedEntity(RealizedEntity value);

	/**
	 * Returns the value of the '<em><b>Realizing Entity</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.common.RealizingEntity#getActiveRealizations <em>Active Realizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the realizer of this realization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Realizing Entity</em>' container reference.
	 * @see #setRealizingEntity(RealizingEntity)
	 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getRealization_RealizingEntity()
	 * @see org.obeonetwork.dsl.east_adl.structure.common.RealizingEntity#getActiveRealizations
	 * @model opposite="activeRealizations" transient="false"
	 * @generated
	 */
	RealizingEntity getRealizingEntity();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.common.Realization#getRealizingEntity <em>Realizing Entity</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Realizing Entity</em>' container reference.
	 * @see #getRealizingEntity()
	 * @generated
	 */
	void setRealizingEntity(RealizingEntity value);

} // Realization
