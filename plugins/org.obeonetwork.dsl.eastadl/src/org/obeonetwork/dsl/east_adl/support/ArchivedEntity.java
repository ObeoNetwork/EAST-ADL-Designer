/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.support;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Archived Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is an entity that can have a version management support. Actually only a subset of EAST ADL structure can be considered as an archive entity.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.support.ArchivedEntity#getArchiveDescription <em>Archive Description</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.support.ArchivedEntity#getVersionArchive <em>Version Archive</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.support.SupportPackage#getArchivedEntity()
 * @model abstract="true"
 * @generated
 */
public interface ArchivedEntity extends EObject {
	/**
	 * Returns the value of the '<em><b>Archive Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is an informal description of this archived entity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Archive Description</em>' attribute.
	 * @see #setArchiveDescription(String)
	 * @see org.obeonetwork.dsl.east_adl.support.SupportPackage#getArchivedEntity_ArchiveDescription()
	 * @model
	 * @generated
	 */
	String getArchiveDescription();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.support.ArchivedEntity#getArchiveDescription <em>Archive Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Archive Description</em>' attribute.
	 * @see #getArchiveDescription()
	 * @generated
	 */
	void setArchiveDescription(String value);

	/**
	 * Returns the value of the '<em><b>Version Archive</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.support.VersionArchive#getArchivedEntity <em>Archived Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the archive for an archived entity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version Archive</em>' reference.
	 * @see #setVersionArchive(VersionArchive)
	 * @see org.obeonetwork.dsl.east_adl.support.SupportPackage#getArchivedEntity_VersionArchive()
	 * @see org.obeonetwork.dsl.east_adl.support.VersionArchive#getArchivedEntity
	 * @model opposite="archivedEntity"
	 * @generated
	 */
	VersionArchive getVersionArchive();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.support.ArchivedEntity#getVersionArchive <em>Version Archive</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Archive</em>' reference.
	 * @see #getVersionArchive()
	 * @generated
	 */
	void setVersionArchive(VersionArchive value);

} // ArchivedEntity
