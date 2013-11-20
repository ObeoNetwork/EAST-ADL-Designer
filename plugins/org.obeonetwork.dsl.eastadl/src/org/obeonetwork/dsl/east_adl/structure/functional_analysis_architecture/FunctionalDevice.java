/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture;

import org.eclipse.emf.common.util.EList;

import org.obeonetwork.dsl.east_adl.core.EASTADLEntity;

import org.obeonetwork.dsl.east_adl.structure.common.FunctionPort;
import org.obeonetwork.dsl.east_adl.structure.common.Parameter;
import org.obeonetwork.dsl.east_adl.structure.common.RealizedEntity;

import org.obeonetwork.dsl.east_adl.verification_validation.ValidatedEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functional Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity is used at the analysis level to describe an interface for interaction with devices such as sensors or actuators.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.FunctionalDevice#getOwningArtifact <em>Owning Artifact</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.FunctionalDevice#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.FunctionalDevice#getPorts <em>Ports</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.FunctionalDevice#getOwningFunction <em>Owning Function</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.Functional_analysis_architecturePackage#getFunctionalDevice()
 * @model
 * @generated
 */
public interface FunctionalDevice extends EASTADLEntity, RealizedEntity, ValidatedEntity {
	/**
	 * Returns the value of the '<em><b>Owning Artifact</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.FunctionalAnalysisArchitecture#getFunctionalDevices <em>Functional Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the artifact to which this functional device belongs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Artifact</em>' container reference.
	 * @see #setOwningArtifact(FunctionalAnalysisArchitecture)
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.Functional_analysis_architecturePackage#getFunctionalDevice_OwningArtifact()
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.FunctionalAnalysisArchitecture#getFunctionalDevices
	 * @model opposite="functionalDevices" required="true" transient="false"
	 * @generated
	 */
	FunctionalAnalysisArchitecture getOwningArtifact();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.FunctionalDevice#getOwningArtifact <em>Owning Artifact</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Artifact</em>' container reference.
	 * @see #getOwningArtifact()
	 * @generated
	 */
	void setOwningArtifact(FunctionalAnalysisArchitecture value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.common.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These entities are used to this functional device or its behavior.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.Functional_analysis_architecturePackage#getFunctionalDevice_Parameters()
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
	 * These are the ports of this functional device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.Functional_analysis_architecturePackage#getFunctionalDevice_Ports()
	 * @model containment="true"
	 * @generated
	 */
	EList<FunctionPort> getPorts();

	/**
	 * Returns the value of the '<em><b>Owning Function</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.AnalysisFunction#getFunctionalDevices <em>Functional Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the analysis function owning this device
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Function</em>' containment reference.
	 * @see #setOwningFunction(AnalysisFunction)
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.Functional_analysis_architecturePackage#getFunctionalDevice_OwningFunction()
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.AnalysisFunction#getFunctionalDevices
	 * @model opposite="functionalDevices" containment="true"
	 * @generated
	 */
	AnalysisFunction getOwningFunction();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.FunctionalDevice#getOwningFunction <em>Owning Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Function</em>' containment reference.
	 * @see #getOwningFunction()
	 * @generated
	 */
	void setOwningFunction(AnalysisFunction value);

} // FunctionalDevice
