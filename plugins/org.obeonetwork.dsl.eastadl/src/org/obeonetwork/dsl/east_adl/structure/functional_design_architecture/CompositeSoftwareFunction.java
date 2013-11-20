/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.functional_design_architecture;

import org.eclipse.emf.common.util.EList;

import org.obeonetwork.dsl.east_adl.core.EASTADLEntity;

import org.obeonetwork.dsl.east_adl.structure.common.AllocatableEntity;
import org.obeonetwork.dsl.east_adl.structure.common.FunctionPort;
import org.obeonetwork.dsl.east_adl.structure.common.Parameter;
import org.obeonetwork.dsl.east_adl.structure.common.RealizingEntity;

import org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity;

import org.obeonetwork.dsl.east_adl.verification_validation.ValidatedEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Software Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity is used to describe functional hierarchy
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.CompositeSoftwareFunction#getElementarySoftwareFunctions <em>Elementary Software Functions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.CompositeSoftwareFunction#getCompositeSoftwareFunctions <em>Composite Software Functions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.CompositeSoftwareFunction#getPorts <em>Ports</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.CompositeSoftwareFunction#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Functional_design_architecturePackage#getCompositeSoftwareFunction()
 * @model
 * @generated
 */
public interface CompositeSoftwareFunction extends EASTADLEntity, AllocatableEntity, RealizingEntity, VariantEntity, ValidatedEntity {
	/**
	 * Returns the value of the '<em><b>Elementary Software Functions</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are elementary functions owned by this entity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elementary Software Functions</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Functional_design_architecturePackage#getCompositeSoftwareFunction_ElementarySoftwareFunctions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ElementarySoftwareFunction> getElementarySoftwareFunctions();

	/**
	 * Returns the value of the '<em><b>Composite Software Functions</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.CompositeSoftwareFunction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are composite functions owned by this entity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Composite Software Functions</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Functional_design_architecturePackage#getCompositeSoftwareFunction_CompositeSoftwareFunctions()
	 * @model containment="true"
	 * @generated
	 */
	EList<CompositeSoftwareFunction> getCompositeSoftwareFunctions();

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.common.FunctionPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are the ports of tis composite function.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Functional_design_architecturePackage#getCompositeSoftwareFunction_Ports()
	 * @model containment="true"
	 * @generated
	 */
	EList<FunctionPort> getPorts();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.common.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These entities are configuration parameters of this elementary function. Details of internal or external data exchanged by this function.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Functional_design_architecturePackage#getCompositeSoftwareFunction_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

} // CompositeSoftwareFunction
