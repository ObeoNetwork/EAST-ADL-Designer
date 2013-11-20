/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.platform_model;

import org.obeonetwork.dsl.east_adl.core.EASTADLEntity;

import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Framework</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is the heart of a processor's platform interface layer. It provides services to the application layer for the abstract, high level mechanisms used on the FDA level (mainly signal communication) and controls the startup and shutdown of the applications as well as similar tasks.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.platform_model.Framework#getConfigurationData <em>Configuration Data</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.platform_model.Framework#getOwningArtifact <em>Owning Artifact</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.platform_model.Framework#getProcessor <em>Processor</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.Platform_modelPackage#getFramework()
 * @model
 * @generated
 */
public interface Framework extends EASTADLEntity {
	/**
	 * Returns the value of the '<em><b>Configuration Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute provides the configuration information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Configuration Data</em>' attribute.
	 * @see #setConfigurationData(String)
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.Platform_modelPackage#getFramework_ConfigurationData()
	 * @model
	 * @generated
	 */
	String getConfigurationData();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.Framework#getConfigurationData <em>Configuration Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration Data</em>' attribute.
	 * @see #getConfigurationData()
	 * @generated
	 */
	void setConfigurationData(String value);

	/**
	 * Returns the value of the '<em><b>Owning Artifact</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel#getFrameworks <em>Frameworks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the artifact to which this framework belongs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Artifact</em>' container reference.
	 * @see #setOwningArtifact(PlatformModel)
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.Platform_modelPackage#getFramework_OwningArtifact()
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel#getFrameworks
	 * @model opposite="frameworks" required="true" transient="false"
	 * @generated
	 */
	PlatformModel getOwningArtifact();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.Framework#getOwningArtifact <em>Owning Artifact</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Artifact</em>' container reference.
	 * @see #getOwningArtifact()
	 * @generated
	 */
	void setOwningArtifact(PlatformModel value);

	/**
	 * Returns the value of the '<em><b>Processor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor#getFrameworks <em>Frameworks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the processor on which this framework is running.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Processor</em>' reference.
	 * @see #setProcessor(Processor)
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.Platform_modelPackage#getFramework_Processor()
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor#getFrameworks
	 * @model opposite="frameworks"
	 * @generated
	 */
	Processor getProcessor();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.Framework#getProcessor <em>Processor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processor</em>' reference.
	 * @see #getProcessor()
	 * @generated
	 */
	void setProcessor(Processor value);

} // Framework
