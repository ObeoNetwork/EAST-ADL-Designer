/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.function_instance_model;

import org.eclipse.emf.common.util.EList;

import org.obeonetwork.dsl.east_adl.core.EASTADLArtifact;

import org.obeonetwork.dsl.east_adl.structure.allocation_model.AllocationModel;

import org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.FunctionalDesignArchitecture;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Instance Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity's purpose is to gather design decisions that should not be made in the FDA because the latter is independant of a particular allocation, but which must be made before the actual allocation step.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstanceModel#getDesignArchitecture <em>Design Architecture</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstanceModel#getFunctionInstances <em>Function Instances</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstanceModel#getLogicalClusters <em>Logical Clusters</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstanceModel#getSignalInstances <em>Signal Instances</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstanceModel#getAllocationModel <em>Allocation Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.Function_instance_modelPackage#getFunctionInstanceModel()
 * @model
 * @generated
 */
public interface FunctionInstanceModel extends EASTADLArtifact {
	/**
	 * Returns the value of the '<em><b>Design Architecture</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.FunctionalDesignArchitecture#getInstanceModel <em>Instance Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the FDA instantiated by this model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Design Architecture</em>' reference.
	 * @see #setDesignArchitecture(FunctionalDesignArchitecture)
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.Function_instance_modelPackage#getFunctionInstanceModel_DesignArchitecture()
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.FunctionalDesignArchitecture#getInstanceModel
	 * @model opposite="instanceModel"
	 * @generated
	 */
	FunctionalDesignArchitecture getDesignArchitecture();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstanceModel#getDesignArchitecture <em>Design Architecture</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Design Architecture</em>' reference.
	 * @see #getDesignArchitecture()
	 * @generated
	 */
	void setDesignArchitecture(FunctionalDesignArchitecture value);

	/**
	 * Returns the value of the '<em><b>Function Instances</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are the function instances of this model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Function Instances</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.Function_instance_modelPackage#getFunctionInstanceModel_FunctionInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<FunctionInstance> getFunctionInstances();

	/**
	 * Returns the value of the '<em><b>Logical Clusters</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.LogicalCluster}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are the logical clusters of tihs model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Logical Clusters</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.Function_instance_modelPackage#getFunctionInstanceModel_LogicalClusters()
	 * @model containment="true"
	 * @generated
	 */
	EList<LogicalCluster> getLogicalClusters();

	/**
	 * Returns the value of the '<em><b>Signal Instances</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are the signal instances of this model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signal Instances</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.Function_instance_modelPackage#getFunctionInstanceModel_SignalInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<SignalInstance> getSignalInstances();

	/**
	 * Returns the value of the '<em><b>Allocation Model</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.AllocationModel#getInstanceModel <em>Instance Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the allocation model to which platform entities are allocated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allocation Model</em>' reference.
	 * @see #setAllocationModel(AllocationModel)
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.Function_instance_modelPackage#getFunctionInstanceModel_AllocationModel()
	 * @see org.obeonetwork.dsl.east_adl.structure.allocation_model.AllocationModel#getInstanceModel
	 * @model opposite="instanceModel"
	 * @generated
	 */
	AllocationModel getAllocationModel();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstanceModel#getAllocationModel <em>Allocation Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allocation Model</em>' reference.
	 * @see #getAllocationModel()
	 * @generated
	 */
	void setAllocationModel(AllocationModel value);

} // FunctionInstanceModel
