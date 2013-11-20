/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture;

import org.eclipse.emf.common.util.EList;

import org.obeonetwork.dsl.east_adl.behavior.Behavior;

import org.obeonetwork.dsl.east_adl.core.EASTADLEntity;

import org.obeonetwork.dsl.east_adl.structure.common.AllocatableEntity;
import org.obeonetwork.dsl.east_adl.structure.common.FunctionPort;
import org.obeonetwork.dsl.east_adl.structure.common.Parameter;
import org.obeonetwork.dsl.east_adl.structure.common.RealizedEntity;
import org.obeonetwork.dsl.east_adl.structure.common.RealizingEntity;

import org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity;

import org.obeonetwork.dsl.east_adl.verification_validation.ValidatedEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analysis Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity is used at the analysis level to describe the functionalities provided by a car. These functions may interact with their environment (other analysis functions or functional devices) through function ports.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.AnalysisFunction#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.AnalysisFunction#getPorts <em>Ports</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.AnalysisFunction#getSubFunctions <em>Sub Functions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.AnalysisFunction#getAnalysisBehavior <em>Analysis Behavior</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.AnalysisFunction#getFunctionalDevices <em>Functional Devices</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.Functional_analysis_architecturePackage#getAnalysisFunction()
 * @model
 * @generated
 */
public interface AnalysisFunction extends EASTADLEntity, VariantEntity, RealizedEntity, RealizingEntity, AllocatableEntity, ValidatedEntity {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.common.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These entities are configuration parameters of this analysis function.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.Functional_analysis_architecturePackage#getAnalysisFunction_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.common.FunctionPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These entities are the ports of this analysis function.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.Functional_analysis_architecturePackage#getAnalysisFunction_Ports()
	 * @model containment="true"
	 * @generated
	 */
	EList<FunctionPort> getPorts();

	/**
	 * Returns the value of the '<em><b>Sub Functions</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.AnalysisFunction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are the sub functions of this function allowing to break up hierarchically the functionnalities provided by the parent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Functions</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.Functional_analysis_architecturePackage#getAnalysisFunction_SubFunctions()
	 * @model containment="true"
	 * @generated
	 */
	EList<AnalysisFunction> getSubFunctions();

	/**
	 * Returns the value of the '<em><b>Analysis Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the behavior of this function.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Analysis Behavior</em>' containment reference.
	 * @see #setAnalysisBehavior(Behavior)
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.Functional_analysis_architecturePackage#getAnalysisFunction_AnalysisBehavior()
	 * @model containment="true"
	 * @generated
	 */
	Behavior getAnalysisBehavior();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.AnalysisFunction#getAnalysisBehavior <em>Analysis Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Analysis Behavior</em>' containment reference.
	 * @see #getAnalysisBehavior()
	 * @generated
	 */
	void setAnalysisBehavior(Behavior value);

	/**
	 * Returns the value of the '<em><b>Functional Devices</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.FunctionalDevice#getOwningFunction <em>Owning Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are functional devices that can be nested within this function.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Functional Devices</em>' container reference.
	 * @see #setFunctionalDevices(FunctionalDevice)
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.Functional_analysis_architecturePackage#getAnalysisFunction_FunctionalDevices()
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.FunctionalDevice#getOwningFunction
	 * @model opposite="owningFunction" transient="false"
	 * @generated
	 */
	FunctionalDevice getFunctionalDevices();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.AnalysisFunction#getFunctionalDevices <em>Functional Devices</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Functional Devices</em>' container reference.
	 * @see #getFunctionalDevices()
	 * @generated
	 */
	void setFunctionalDevices(FunctionalDevice value);

} // AnalysisFunction
