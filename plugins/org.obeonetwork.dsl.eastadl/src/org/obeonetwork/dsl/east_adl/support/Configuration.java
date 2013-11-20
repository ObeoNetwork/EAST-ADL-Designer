/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.support;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity is used for creation of an architecture build up of certain versions of archived entities. Thus it is possible to easily recreate a special state of the modeled system.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.support.Configuration#getVersions <em>Versions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.support.Configuration#getConfigurationDescription <em>Configuration Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.support.SupportPackage#getConfiguration()
 * @model
 * @generated
 */
public interface Configuration extends SupportEntity {
	/**
	 * Returns the value of the '<em><b>Versions</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.support.Version}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.support.Version#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are version that this configuration manages.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Versions</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.support.SupportPackage#getConfiguration_Versions()
	 * @see org.obeonetwork.dsl.east_adl.support.Version#getConfiguration
	 * @model opposite="configuration"
	 * @generated
	 */
	EList<Version> getVersions();

	/**
	 * Returns the value of the '<em><b>Configuration Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is a brief description of this configuration purposes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Configuration Description</em>' attribute.
	 * @see #setConfigurationDescription(String)
	 * @see org.obeonetwork.dsl.east_adl.support.SupportPackage#getConfiguration_ConfigurationDescription()
	 * @model
	 * @generated
	 */
	String getConfigurationDescription();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.support.Configuration#getConfigurationDescription <em>Configuration Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration Description</em>' attribute.
	 * @see #getConfigurationDescription()
	 * @generated
	 */
	void setConfigurationDescription(String value);

} // Configuration
