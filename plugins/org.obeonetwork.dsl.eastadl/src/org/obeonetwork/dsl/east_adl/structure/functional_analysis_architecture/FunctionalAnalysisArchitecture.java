/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture;

import org.eclipse.emf.common.util.EList;

import org.obeonetwork.dsl.east_adl.core.EASTADLArtifact;

import org.obeonetwork.dsl.east_adl.structure.common.ConnectorSignal;
import org.obeonetwork.dsl.east_adl.structure.common.DesignDataType;
import org.obeonetwork.dsl.east_adl.structure.common.ImplementationDataType;
import org.obeonetwork.dsl.east_adl.structure.common.OperationCall;
import org.obeonetwork.dsl.east_adl.structure.common.TypeAssociation;

import org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.FunctionalDesignArchitecture;

import org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleFeatureModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functional Analysis Architecture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity describes the functionalities of a vehicle at a level of abstraction situated between the informal specification of the features and the implementation of the functionalities that support these features.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.FunctionalAnalysisArchitecture#getAnalysisFunctions <em>Analysis Functions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.FunctionalAnalysisArchitecture#getFunctionalDevices <em>Functional Devices</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.FunctionalAnalysisArchitecture#getVehicleModel <em>Vehicle Model</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.FunctionalAnalysisArchitecture#getDesignArchitecture <em>Design Architecture</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.FunctionalAnalysisArchitecture#getDesignDataTypes <em>Design Data Types</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.FunctionalAnalysisArchitecture#getConnectorSignals <em>Connector Signals</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.FunctionalAnalysisArchitecture#getOperationCalls <em>Operation Calls</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.FunctionalAnalysisArchitecture#getTypeAssociations <em>Type Associations</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.FunctionalAnalysisArchitecture#getImplementationDataTypes <em>Implementation Data Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.Functional_analysis_architecturePackage#getFunctionalAnalysisArchitecture()
 * @model annotation="http://www.topcased.org/documentation documentation='In the specification this is a top level analysis function. I\'m not ok with this and I consider this as a simple artifact. However, within this artifact you can create any top level function you want.'"
 * @generated
 */
public interface FunctionalAnalysisArchitecture extends EASTADLArtifact {
	/**
	 * Returns the value of the '<em><b>Analysis Functions</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.AnalysisFunction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are the analysis functions of this model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Analysis Functions</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.Functional_analysis_architecturePackage#getFunctionalAnalysisArchitecture_AnalysisFunctions()
	 * @model containment="true"
	 * @generated
	 */
	EList<AnalysisFunction> getAnalysisFunctions();

	/**
	 * Returns the value of the '<em><b>Functional Devices</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.FunctionalDevice}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.FunctionalDevice#getOwningArtifact <em>Owning Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are the functional devices of this model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Functional Devices</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.Functional_analysis_architecturePackage#getFunctionalAnalysisArchitecture_FunctionalDevices()
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.FunctionalDevice#getOwningArtifact
	 * @model opposite="owningArtifact" containment="true"
	 * @generated
	 */
	EList<FunctionalDevice> getFunctionalDevices();

	/**
	 * Returns the value of the '<em><b>Vehicle Model</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleFeatureModel#getAnalysisArchitecture <em>Analysis Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the vehicle model which this entity implements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vehicle Model</em>' reference.
	 * @see #setVehicleModel(VehicleFeatureModel)
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.Functional_analysis_architecturePackage#getFunctionalAnalysisArchitecture_VehicleModel()
	 * @see org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleFeatureModel#getAnalysisArchitecture
	 * @model opposite="analysisArchitecture"
	 * @generated
	 */
	VehicleFeatureModel getVehicleModel();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.FunctionalAnalysisArchitecture#getVehicleModel <em>Vehicle Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vehicle Model</em>' reference.
	 * @see #getVehicleModel()
	 * @generated
	 */
	void setVehicleModel(VehicleFeatureModel value);

	/**
	 * Returns the value of the '<em><b>Design Architecture</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.FunctionalDesignArchitecture#getAnalysisArchitecture <em>Analysis Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the design model implementing this entity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Design Architecture</em>' reference.
	 * @see #setDesignArchitecture(FunctionalDesignArchitecture)
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.Functional_analysis_architecturePackage#getFunctionalAnalysisArchitecture_DesignArchitecture()
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.FunctionalDesignArchitecture#getAnalysisArchitecture
	 * @model opposite="analysisArchitecture"
	 * @generated
	 */
	FunctionalDesignArchitecture getDesignArchitecture();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.FunctionalAnalysisArchitecture#getDesignArchitecture <em>Design Architecture</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Design Architecture</em>' reference.
	 * @see #getDesignArchitecture()
	 * @generated
	 */
	void setDesignArchitecture(FunctionalDesignArchitecture value);

	/**
	 * Returns the value of the '<em><b>Design Data Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.common.DesignDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are design data types used in this model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Design Data Types</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.Functional_analysis_architecturePackage#getFunctionalAnalysisArchitecture_DesignDataTypes()
	 * @model containment="true"
	 *        annotation="http://www.topcased.org/documentation documentation='These are all DDT used by entities of this artifact.'"
	 * @generated
	 */
	EList<DesignDataType> getDesignDataTypes();

	/**
	 * Returns the value of the '<em><b>Connector Signals</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.common.ConnectorSignal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are connector signals used in this analysis model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connector Signals</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.Functional_analysis_architecturePackage#getFunctionalAnalysisArchitecture_ConnectorSignals()
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
	 * These are operation calls used at this analysis level.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operation Calls</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.Functional_analysis_architecturePackage#getFunctionalAnalysisArchitecture_OperationCalls()
	 * @model containment="true"
	 * @generated
	 */
	EList<OperationCall> getOperationCalls();

	/**
	 * Returns the value of the '<em><b>Type Associations</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.common.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are associations between the types of this model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Associations</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.Functional_analysis_architecturePackage#getFunctionalAnalysisArchitecture_TypeAssociations()
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
	 * These are implementation data types of this model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Implementation Data Types</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.Functional_analysis_architecturePackage#getFunctionalAnalysisArchitecture_ImplementationDataTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImplementationDataType> getImplementationDataTypes();

} // FunctionalAnalysisArchitecture
