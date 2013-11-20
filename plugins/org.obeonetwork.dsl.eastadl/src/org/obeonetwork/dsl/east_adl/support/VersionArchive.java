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
 * A representation of the model object '<em><b>Version Archive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is a container for collecting different versions of an archived entity.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.support.VersionArchive#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.support.VersionArchive#getCreation <em>Creation</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.support.VersionArchive#getArchivedEntity <em>Archived Entity</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.support.VersionArchive#getVersions <em>Versions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.support.SupportPackage#getVersionArchive()
 * @model
 * @generated
 */
public interface VersionArchive extends SupportEntity {
	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the author/owner of this archive.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(String)
	 * @see org.obeonetwork.dsl.east_adl.support.SupportPackage#getVersionArchive_Author()
	 * @model
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.support.VersionArchive#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

	/**
	 * Returns the value of the '<em><b>Creation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the date on which this archive was created. It is managed by tool.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creation</em>' attribute.
	 * @see #setCreation(Date)
	 * @see org.obeonetwork.dsl.east_adl.support.SupportPackage#getVersionArchive_Creation()
	 * @model
	 * @generated
	 */
	Date getCreation();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.support.VersionArchive#getCreation <em>Creation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation</em>' attribute.
	 * @see #getCreation()
	 * @generated
	 */
	void setCreation(Date value);

	/**
	 * Returns the value of the '<em><b>Archived Entity</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.support.ArchivedEntity#getVersionArchive <em>Version Archive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the archived entity for which the archive is created.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Archived Entity</em>' reference.
	 * @see #setArchivedEntity(ArchivedEntity)
	 * @see org.obeonetwork.dsl.east_adl.support.SupportPackage#getVersionArchive_ArchivedEntity()
	 * @see org.obeonetwork.dsl.east_adl.support.ArchivedEntity#getVersionArchive
	 * @model opposite="versionArchive"
	 * @generated
	 */
	ArchivedEntity getArchivedEntity();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.support.VersionArchive#getArchivedEntity <em>Archived Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Archived Entity</em>' reference.
	 * @see #getArchivedEntity()
	 * @generated
	 */
	void setArchivedEntity(ArchivedEntity value);

	/**
	 * Returns the value of the '<em><b>Versions</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.support.Version#getVersionArchive <em>Version Archive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are all the versions that this archive manages.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Versions</em>' reference.
	 * @see #setVersions(Version)
	 * @see org.obeonetwork.dsl.east_adl.support.SupportPackage#getVersionArchive_Versions()
	 * @see org.obeonetwork.dsl.east_adl.support.Version#getVersionArchive
	 * @model opposite="versionArchive"
	 * @generated
	 */
	Version getVersions();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.support.VersionArchive#getVersions <em>Versions</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Versions</em>' reference.
	 * @see #getVersions()
	 * @generated
	 */
	void setVersions(Version value);

} // VersionArchive
