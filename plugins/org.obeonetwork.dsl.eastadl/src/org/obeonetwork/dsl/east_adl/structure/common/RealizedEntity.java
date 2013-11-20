/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.common;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Realized Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity can be realized by a realization.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.RealizedEntity#getPassiveRealizations <em>Passive Realizations</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.RealizedEntity#getRealizedBy <em>Realized By</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getRealizedEntity()
 * @model abstract="true"
 *        annotation="http://www.topcased.org/documentation documentation='I added this class for simplification purposes, in order to keep references as easy as possible.'"
 * @generated
 */
public interface RealizedEntity extends EObject {
	/**
	 * Returns the value of the '<em><b>Passive Realizations</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.common.Realization}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.common.Realization#getRealizedEntity <em>Realized Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are proxies for entities that realize this elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Passive Realizations</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getRealizedEntity_PassiveRealizations()
	 * @see org.obeonetwork.dsl.east_adl.structure.common.Realization#getRealizedEntity
	 * @model opposite="realizedEntity"
	 * @generated
	 */
	EList<Realization> getPassiveRealizations();

	/**
	 * Returns the value of the '<em><b>Realized By</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.common.RealizingEntity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is a derived property used to show all realizators of this entity (if any).
	 * This property will be shown instead of the corresponding realization model objects because it is more explicit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Realized By</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getRealizedEntity_RealizedBy()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<RealizingEntity> getRealizedBy();

} // RealizedEntity
