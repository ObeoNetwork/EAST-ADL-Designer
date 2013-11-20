/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.support;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity represents a snapshot of the state of an archived entity at a certain point of time. It is used to track different states of an archived entity during development process.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.support.Version#getVersionNumber <em>Version Number</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.support.Version#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.support.Version#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.support.Version#getVersionArchive <em>Version Archive</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.support.Version#getCreation <em>Creation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.support.SupportPackage#getVersion()
 * @model
 * @generated
 */
public interface Version extends SupportEntity {
	/**
	 * Returns the value of the '<em><b>Version Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the number of this version (unique for versions in the same archive).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version Number</em>' attribute.
	 * @see #setVersionNumber(String)
	 * @see org.obeonetwork.dsl.east_adl.support.SupportPackage#getVersion_VersionNumber()
	 * @model
	 * @generated
	 */
	String getVersionNumber();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.support.Version#getVersionNumber <em>Version Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Number</em>' attribute.
	 * @see #getVersionNumber()
	 * @generated
	 */
	void setVersionNumber(String value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the author of this version.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(String)
	 * @see org.obeonetwork.dsl.east_adl.support.SupportPackage#getVersion_Author()
	 * @model
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.support.Version#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.support.Configuration#getVersions <em>Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is a configuration for this version.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Configuration</em>' reference.
	 * @see #setConfiguration(Configuration)
	 * @see org.obeonetwork.dsl.east_adl.support.SupportPackage#getVersion_Configuration()
	 * @see org.obeonetwork.dsl.east_adl.support.Configuration#getVersions
	 * @model opposite="versions"
	 * @generated
	 */
	Configuration getConfiguration();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.support.Version#getConfiguration <em>Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(Configuration value);

	/**
	 * Returns the value of the '<em><b>Version Archive</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.support.VersionArchive#getVersions <em>Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the owning archive for this version.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version Archive</em>' reference.
	 * @see #setVersionArchive(VersionArchive)
	 * @see org.obeonetwork.dsl.east_adl.support.SupportPackage#getVersion_VersionArchive()
	 * @see org.obeonetwork.dsl.east_adl.support.VersionArchive#getVersions
	 * @model opposite="versions" required="true"
	 * @generated
	 */
	VersionArchive getVersionArchive();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.support.Version#getVersionArchive <em>Version Archive</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Archive</em>' reference.
	 * @see #getVersionArchive()
	 * @generated
	 */
	void setVersionArchive(VersionArchive value);

	/**
	 * Returns the value of the '<em><b>Creation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the date on which this version was created. It is managed by tool.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creation</em>' attribute.
	 * @see #setCreation(Date)
	 * @see org.obeonetwork.dsl.east_adl.support.SupportPackage#getVersion_Creation()
	 * @model
	 * @generated
	 */
	Date getCreation();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.support.Version#getCreation <em>Creation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation</em>' attribute.
	 * @see #getCreation()
	 * @generated
	 */
	void setCreation(Date value);

} // Version
