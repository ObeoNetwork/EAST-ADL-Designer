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
 * A representation of the model object '<em><b>Realizing Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity can realize other entities through the realization link.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.RealizingEntity#getActiveRealizations <em>Active Realizations</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.RealizingEntity#getRealizes <em>Realizes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getRealizingEntity()
 * @model abstract="true"
 * @generated
 */
public interface RealizingEntity extends EObject {
	/**
	 * Returns the value of the '<em><b>Active Realizations</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.common.Realization}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.common.Realization#getRealizingEntity <em>Realizing Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are the realized entities.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Active Realizations</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getRealizingEntity_ActiveRealizations()
	 * @see org.obeonetwork.dsl.east_adl.structure.common.Realization#getRealizingEntity
	 * @model opposite="realizingEntity" containment="true"
	 * @generated
	 */
	EList<Realization> getActiveRealizations();

	/**
	 * Returns the value of the '<em><b>Realizes</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.common.RealizedEntity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is a derived entity displaying all realized entities.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Realizes</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getRealizingEntity_Realizes()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<RealizedEntity> getRealizes();

} // RealizingEntity
