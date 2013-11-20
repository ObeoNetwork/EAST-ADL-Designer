/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.functional_design_architecture;

import org.eclipse.emf.common.util.EList;

import org.obeonetwork.dsl.east_adl.core.EASTADLArtifact;

import org.obeonetwork.dsl.east_adl.structure.common.ConnectorSignal;
import org.obeonetwork.dsl.east_adl.structure.common.DesignDataType;
import org.obeonetwork.dsl.east_adl.structure.common.ImplementationDataType;
import org.obeonetwork.dsl.east_adl.structure.common.OperationCall;
import org.obeonetwork.dsl.east_adl.structure.common.TypeAssociation;

import org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstanceModel;

import org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.FunctionalAnalysisArchitecture;

import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.HardwareArchitecture;

import org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleFeatureModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functional Design Architecture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity describes the realizations of the functional analysis architecture. A network of possibly decomposed functions will be specified.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.FunctionalDesignArchitecture#getElementarySoftwareFunctions <em>Elementary Software Functions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.FunctionalDesignArchitecture#getCompositeSoftwareFunctions <em>Composite Software Functions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.FunctionalDesignArchitecture#getAnalysisArchitecture <em>Analysis Architecture</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.FunctionalDesignArchitecture#getVehicleModel <em>Vehicle Model</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.FunctionalDesignArchitecture#getInstanceModel <em>Instance Model</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.FunctionalDesignArchitecture#getTypeAssociations <em>Type Associations</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.FunctionalDesignArchitecture#getImplementationDataTypes <em>Implementation Data Types</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.FunctionalDesignArchitecture#getDesignDataTypes <em>Design Data Types</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.FunctionalDesignArchitecture#getConnectorSignals <em>Connector Signals</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.FunctionalDesignArchitecture#getOperationCalls <em>Operation Calls</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.FunctionalDesignArchitecture#getHardwareArchitecture <em>Hardware Architecture</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Functional_design_architecturePackage#getFunctionalDesignArchitecture()
 * @model
 * @generated
 */
public interface FunctionalDesignArchitecture extends EASTADLArtifact {
	/**
	 * Returns the value of the '<em><b>Elementary Software Functions</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are all elementary software functions owned by this artifact.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elementary Software Functions</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Functional_design_architecturePackage#getFunctionalDesignArchitecture_ElementarySoftwareFunctions()
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
	 * These are all composite software functions owned by this artifact.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Composite Software Functions</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Functional_design_architecturePackage#getFunctionalDesignArchitecture_CompositeSoftwareFunctions()
	 * @model containment="true"
	 * @generated
	 */
	EList<CompositeSoftwareFunction> getCompositeSoftwareFunctions();

	/**
	 * Returns the value of the '<em><b>Analysis Architecture</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.FunctionalAnalysisArchitecture#getDesignArchitecture <em>Design Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the analysis model which this entity implements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Analysis Architecture</em>' reference.
	 * @see #setAnalysisArchitecture(FunctionalAnalysisArchitecture)
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Functional_design_architecturePackage#getFunctionalDesignArchitecture_AnalysisArchitecture()
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.FunctionalAnalysisArchitecture#getDesignArchitecture
	 * @model opposite="designArchitecture"
	 * @generated
	 */
	FunctionalAnalysisArchitecture getAnalysisArchitecture();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.FunctionalDesignArchitecture#getAnalysisArchitecture <em>Analysis Architecture</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Analysis Architecture</em>' reference.
	 * @see #getAnalysisArchitecture()
	 * @generated
	 */
	void setAnalysisArchitecture(FunctionalAnalysisArchitecture value);

	/**
	 * Returns the value of the '<em><b>Vehicle Model</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleFeatureModel#getDesignArchitecture <em>Design Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the vehicle model which this entity implements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vehicle Model</em>' reference.
	 * @see #setVehicleModel(VehicleFeatureModel)
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Functional_design_architecturePackage#getFunctionalDesignArchitecture_VehicleModel()
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleFeatureModel#getDesignArchitecture
	 * @model opposite="designArchitecture"
	 * @generated
	 */
	VehicleFeatureModel getVehicleModel();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.FunctionalDesignArchitecture#getVehicleModel <em>Vehicle Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vehicle Model</em>' reference.
	 * @see #getVehicleModel()
	 * @generated
	 */
	void setVehicleModel(VehicleFeatureModel value);

	/**
	 * Returns the value of the '<em><b>Instance Model</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstanceModel#getDesignArchitecture <em>Design Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the instantiating instance model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instance Model</em>' reference.
	 * @see #setInstanceModel(FunctionInstanceModel)
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Functional_design_architecturePackage#getFunctionalDesignArchitecture_InstanceModel()
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstanceModel#getDesignArchitecture
	 * @model opposite="designArchitecture"
	 * @generated
	 */
	FunctionInstanceModel getInstanceModel();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.FunctionalDesignArchitecture#getInstanceModel <em>Instance Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Model</em>' reference.
	 * @see #getInstanceModel()
	 * @generated
	 */
	void setInstanceModel(FunctionInstanceModel value);

	/**
	 * Returns the value of the '<em><b>Type Associations</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.common.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are the type associations between the types of this model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Associations</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Functional_design_architecturePackage#getFunctionalDesignArchitecture_TypeAssociations()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeAssociation> getTypeAssociations();

	/**
	 * Returns the value of the '<em><b>Implementation Data Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.common.ImplementationDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are the implementation data types of this model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Implementation Data Types</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Functional_design_architecturePackage#getFunctionalDesignArchitecture_ImplementationDataTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImplementationDataType> getImplementationDataTypes();

	/**
	 * Returns the value of the '<em><b>Design Data Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.common.DesignDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are the design data types of this model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Design Data Types</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Functional_design_architecturePackage#getFunctionalDesignArchitecture_DesignDataTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<DesignDataType> getDesignDataTypes();

	/**
	 * Returns the value of the '<em><b>Connector Signals</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.common.ConnectorSignal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are the connector signals of this model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connector Signals</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Functional_design_architecturePackage#getFunctionalDesignArchitecture_ConnectorSignals()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConnectorSignal> getConnectorSignals();

	/**
	 * Returns the value of the '<em><b>Operation Calls</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.common.OperationCall}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are operation calls of this model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operation Calls</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Functional_design_architecturePackage#getFunctionalDesignArchitecture_OperationCalls()
	 * @model containment="true"
	 * @generated
	 */
	EList<OperationCall> getOperationCalls();

	/**
	 * Returns the value of the '<em><b>Hardware Architecture</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.HardwareArchitecture#getDesignArchitecture <em>Design Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hardware Architecture</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardware Architecture</em>' reference.
	 * @see #setHardwareArchitecture(HardwareArchitecture)
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Functional_design_architecturePackage#getFunctionalDesignArchitecture_HardwareArchitecture()
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.HardwareArchitecture#getDesignArchitecture
	 * @model opposite="designArchitecture"
	 * @generated
	 */
	HardwareArchitecture getHardwareArchitecture();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.FunctionalDesignArchitecture#getHardwareArchitecture <em>Hardware Architecture</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hardware Architecture</em>' reference.
	 * @see #getHardwareArchitecture()
	 * @generated
	 */
	void setHardwareArchitecture(HardwareArchitecture value);

} // FunctionalDesignArchitecture
