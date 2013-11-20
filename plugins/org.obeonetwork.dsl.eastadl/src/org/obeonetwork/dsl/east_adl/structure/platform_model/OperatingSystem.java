/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.platform_model;

import org.obeonetwork.dsl.east_adl.core.EASTADLEntity;

import org.obeonetwork.dsl.east_adl.requirements.TimingRestriction;

import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operating System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity represents an individual instance of an operating system on a certain processor.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.platform_model.OperatingSystem#getType <em>Type</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.platform_model.OperatingSystem#getExecutionModelType <em>Execution Model Type</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.platform_model.OperatingSystem#getBlockingFactor <em>Blocking Factor</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.platform_model.OperatingSystem#getTaskSwitchTime <em>Task Switch Time</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.platform_model.OperatingSystem#getOwningArtifact <em>Owning Artifact</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.platform_model.OperatingSystem#getProcessor <em>Processor</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.Platform_modelPackage#getOperatingSystem()
 * @model
 * @generated
 */
public interface OperatingSystem extends EASTADLEntity {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the unformal type of the operating system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.Platform_modelPackage#getOperatingSystem_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.OperatingSystem#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Execution Model Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.obeonetwork.dsl.east_adl.structure.platform_model.ExecutionModelKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute specifies the execution model or scheduling policy of the operating system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Execution Model Type</em>' attribute.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.ExecutionModelKind
	 * @see #setExecutionModelType(ExecutionModelKind)
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.Platform_modelPackage#getOperatingSystem_ExecutionModelType()
	 * @model
	 * @generated
	 */
	ExecutionModelKind getExecutionModelType();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.OperatingSystem#getExecutionModelType <em>Execution Model Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Model Type</em>' attribute.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.ExecutionModelKind
	 * @see #getExecutionModelType()
	 * @generated
	 */
	void setExecutionModelType(ExecutionModelKind value);

	/**
	 * Returns the value of the '<em><b>Blocking Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the max time interrupts are disabled.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Blocking Factor</em>' containment reference.
	 * @see #setBlockingFactor(TimingRestriction)
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.Platform_modelPackage#getOperatingSystem_BlockingFactor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimingRestriction getBlockingFactor();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.OperatingSystem#getBlockingFactor <em>Blocking Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blocking Factor</em>' containment reference.
	 * @see #getBlockingFactor()
	 * @generated
	 */
	void setBlockingFactor(TimingRestriction value);

	/**
	 * Returns the value of the '<em><b>Task Switch Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the time it takes to (pre-empt and) switch tasks.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Task Switch Time</em>' containment reference.
	 * @see #setTaskSwitchTime(TimingRestriction)
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.Platform_modelPackage#getOperatingSystem_TaskSwitchTime()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimingRestriction getTaskSwitchTime();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.OperatingSystem#getTaskSwitchTime <em>Task Switch Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task Switch Time</em>' containment reference.
	 * @see #getTaskSwitchTime()
	 * @generated
	 */
	void setTaskSwitchTime(TimingRestriction value);

	/**
	 * Returns the value of the '<em><b>Owning Artifact</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel#getOperatingSystems <em>Operating Systems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the artifact to which this operating system belongs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Artifact</em>' container reference.
	 * @see #setOwningArtifact(PlatformModel)
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.Platform_modelPackage#getOperatingSystem_OwningArtifact()
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel#getOperatingSystems
	 * @model opposite="operatingSystems" required="true" transient="false"
	 * @generated
	 */
	PlatformModel getOwningArtifact();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.OperatingSystem#getOwningArtifact <em>Owning Artifact</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Artifact</em>' container reference.
	 * @see #getOwningArtifact()
	 * @generated
	 */
	void setOwningArtifact(PlatformModel value);

	/**
	 * Returns the value of the '<em><b>Processor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor#getOperatingSystems <em>Operating Systems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the processor on which this operating system is running.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Processor</em>' reference.
	 * @see #setProcessor(Processor)
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.Platform_modelPackage#getOperatingSystem_Processor()
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor#getOperatingSystems
	 * @model opposite="operatingSystems"
	 * @generated
	 */
	Processor getProcessor();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.OperatingSystem#getProcessor <em>Processor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processor</em>' reference.
	 * @see #getProcessor()
	 * @generated
	 */
	void setProcessor(Processor value);

} // OperatingSystem
