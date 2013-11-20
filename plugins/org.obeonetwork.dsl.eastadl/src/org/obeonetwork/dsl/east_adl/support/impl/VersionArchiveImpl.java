/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.support.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.obeonetwork.dsl.east_adl.support.ArchivedEntity;
import org.obeonetwork.dsl.east_adl.support.SupportPackage;
import org.obeonetwork.dsl.east_adl.support.Version;
import org.obeonetwork.dsl.east_adl.support.VersionArchive;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Version Archive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.support.impl.VersionArchiveImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.support.impl.VersionArchiveImpl#getCreation <em>Creation</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.support.impl.VersionArchiveImpl#getArchivedEntity <em>Archived Entity</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.support.impl.VersionArchiveImpl#getVersions <em>Versions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VersionArchiveImpl extends SupportEntityImpl implements VersionArchive {
	/**
	 * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected String author = AUTHOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreation() <em>Creation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreation()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreation() <em>Creation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreation()
	 * @generated
	 * @ordered
	 */
	protected Date creation = CREATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getArchivedEntity() <em>Archived Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchivedEntity()
	 * @generated
	 * @ordered
	 */
	protected ArchivedEntity archivedEntity;

	/**
	 * The cached value of the '{@link #getVersions() <em>Versions</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersions()
	 * @generated
	 * @ordered
	 */
	protected Version versions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VersionArchiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SupportPackage.Literals.VERSION_ARCHIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(String newAuthor) {
		String oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SupportPackage.VERSION_ARCHIVE__AUTHOR, oldAuthor, author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCreation() {
		return creation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreation(Date newCreation) {
		Date oldCreation = creation;
		creation = newCreation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SupportPackage.VERSION_ARCHIVE__CREATION, oldCreation, creation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchivedEntity getArchivedEntity() {
		if (archivedEntity != null && archivedEntity.eIsProxy()) {
			InternalEObject oldArchivedEntity = (InternalEObject)archivedEntity;
			archivedEntity = (ArchivedEntity)eResolveProxy(oldArchivedEntity);
			if (archivedEntity != oldArchivedEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SupportPackage.VERSION_ARCHIVE__ARCHIVED_ENTITY, oldArchivedEntity, archivedEntity));
			}
		}
		return archivedEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchivedEntity basicGetArchivedEntity() {
		return archivedEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArchivedEntity(ArchivedEntity newArchivedEntity, NotificationChain msgs) {
		ArchivedEntity oldArchivedEntity = archivedEntity;
		archivedEntity = newArchivedEntity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SupportPackage.VERSION_ARCHIVE__ARCHIVED_ENTITY, oldArchivedEntity, newArchivedEntity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArchivedEntity(ArchivedEntity newArchivedEntity) {
		if (newArchivedEntity != archivedEntity) {
			NotificationChain msgs = null;
			if (archivedEntity != null)
				msgs = ((InternalEObject)archivedEntity).eInverseRemove(this, SupportPackage.ARCHIVED_ENTITY__VERSION_ARCHIVE, ArchivedEntity.class, msgs);
			if (newArchivedEntity != null)
				msgs = ((InternalEObject)newArchivedEntity).eInverseAdd(this, SupportPackage.ARCHIVED_ENTITY__VERSION_ARCHIVE, ArchivedEntity.class, msgs);
			msgs = basicSetArchivedEntity(newArchivedEntity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SupportPackage.VERSION_ARCHIVE__ARCHIVED_ENTITY, newArchivedEntity, newArchivedEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version getVersions() {
		if (versions != null && versions.eIsProxy()) {
			InternalEObject oldVersions = (InternalEObject)versions;
			versions = (Version)eResolveProxy(oldVersions);
			if (versions != oldVersions) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SupportPackage.VERSION_ARCHIVE__VERSIONS, oldVersions, versions));
			}
		}
		return versions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version basicGetVersions() {
		return versions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersions(Version newVersions, NotificationChain msgs) {
		Version oldVersions = versions;
		versions = newVersions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SupportPackage.VERSION_ARCHIVE__VERSIONS, oldVersions, newVersions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersions(Version newVersions) {
		if (newVersions != versions) {
			NotificationChain msgs = null;
			if (versions != null)
				msgs = ((InternalEObject)versions).eInverseRemove(this, SupportPackage.VERSION__VERSION_ARCHIVE, Version.class, msgs);
			if (newVersions != null)
				msgs = ((InternalEObject)newVersions).eInverseAdd(this, SupportPackage.VERSION__VERSION_ARCHIVE, Version.class, msgs);
			msgs = basicSetVersions(newVersions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SupportPackage.VERSION_ARCHIVE__VERSIONS, newVersions, newVersions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SupportPackage.VERSION_ARCHIVE__ARCHIVED_ENTITY:
				if (archivedEntity != null)
					msgs = ((InternalEObject)archivedEntity).eInverseRemove(this, SupportPackage.ARCHIVED_ENTITY__VERSION_ARCHIVE, ArchivedEntity.class, msgs);
				return basicSetArchivedEntity((ArchivedEntity)otherEnd, msgs);
			case SupportPackage.VERSION_ARCHIVE__VERSIONS:
				if (versions != null)
					msgs = ((InternalEObject)versions).eInverseRemove(this, SupportPackage.VERSION__VERSION_ARCHIVE, Version.class, msgs);
				return basicSetVersions((Version)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SupportPackage.VERSION_ARCHIVE__ARCHIVED_ENTITY:
				return basicSetArchivedEntity(null, msgs);
			case SupportPackage.VERSION_ARCHIVE__VERSIONS:
				return basicSetVersions(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SupportPackage.VERSION_ARCHIVE__AUTHOR:
				return getAuthor();
			case SupportPackage.VERSION_ARCHIVE__CREATION:
				return getCreation();
			case SupportPackage.VERSION_ARCHIVE__ARCHIVED_ENTITY:
				if (resolve) return getArchivedEntity();
				return basicGetArchivedEntity();
			case SupportPackage.VERSION_ARCHIVE__VERSIONS:
				if (resolve) return getVersions();
				return basicGetVersions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SupportPackage.VERSION_ARCHIVE__AUTHOR:
				setAuthor((String)newValue);
				return;
			case SupportPackage.VERSION_ARCHIVE__CREATION:
				setCreation((Date)newValue);
				return;
			case SupportPackage.VERSION_ARCHIVE__ARCHIVED_ENTITY:
				setArchivedEntity((ArchivedEntity)newValue);
				return;
			case SupportPackage.VERSION_ARCHIVE__VERSIONS:
				setVersions((Version)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SupportPackage.VERSION_ARCHIVE__AUTHOR:
				setAuthor(AUTHOR_EDEFAULT);
				return;
			case SupportPackage.VERSION_ARCHIVE__CREATION:
				setCreation(CREATION_EDEFAULT);
				return;
			case SupportPackage.VERSION_ARCHIVE__ARCHIVED_ENTITY:
				setArchivedEntity((ArchivedEntity)null);
				return;
			case SupportPackage.VERSION_ARCHIVE__VERSIONS:
				setVersions((Version)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SupportPackage.VERSION_ARCHIVE__AUTHOR:
				return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
			case SupportPackage.VERSION_ARCHIVE__CREATION:
				return CREATION_EDEFAULT == null ? creation != null : !CREATION_EDEFAULT.equals(creation);
			case SupportPackage.VERSION_ARCHIVE__ARCHIVED_ENTITY:
				return archivedEntity != null;
			case SupportPackage.VERSION_ARCHIVE__VERSIONS:
				return versions != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (author: ");
		result.append(author);
		result.append(", creation: ");
		result.append(creation);
		result.append(')');
		return result.toString();
	}

} //VersionArchiveImpl
