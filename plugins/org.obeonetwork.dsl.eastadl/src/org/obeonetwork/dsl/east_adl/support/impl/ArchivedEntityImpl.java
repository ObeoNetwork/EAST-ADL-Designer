/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.support.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.obeonetwork.dsl.east_adl.support.ArchivedEntity;
import org.obeonetwork.dsl.east_adl.support.SupportPackage;
import org.obeonetwork.dsl.east_adl.support.VersionArchive;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Archived Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.support.impl.ArchivedEntityImpl#getArchiveDescription <em>Archive Description</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.support.impl.ArchivedEntityImpl#getVersionArchive <em>Version Archive</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ArchivedEntityImpl extends EObjectImpl implements ArchivedEntity {
	/**
	 * The default value of the '{@link #getArchiveDescription() <em>Archive Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchiveDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String ARCHIVE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArchiveDescription() <em>Archive Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchiveDescription()
	 * @generated
	 * @ordered
	 */
	protected String archiveDescription = ARCHIVE_DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVersionArchive() <em>Version Archive</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionArchive()
	 * @generated
	 * @ordered
	 */
	protected VersionArchive versionArchive;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArchivedEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SupportPackage.Literals.ARCHIVED_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArchiveDescription() {
		return archiveDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArchiveDescription(String newArchiveDescription) {
		String oldArchiveDescription = archiveDescription;
		archiveDescription = newArchiveDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SupportPackage.ARCHIVED_ENTITY__ARCHIVE_DESCRIPTION, oldArchiveDescription, archiveDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionArchive getVersionArchive() {
		if (versionArchive != null && versionArchive.eIsProxy()) {
			InternalEObject oldVersionArchive = (InternalEObject)versionArchive;
			versionArchive = (VersionArchive)eResolveProxy(oldVersionArchive);
			if (versionArchive != oldVersionArchive) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SupportPackage.ARCHIVED_ENTITY__VERSION_ARCHIVE, oldVersionArchive, versionArchive));
			}
		}
		return versionArchive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionArchive basicGetVersionArchive() {
		return versionArchive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersionArchive(VersionArchive newVersionArchive, NotificationChain msgs) {
		VersionArchive oldVersionArchive = versionArchive;
		versionArchive = newVersionArchive;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SupportPackage.ARCHIVED_ENTITY__VERSION_ARCHIVE, oldVersionArchive, newVersionArchive);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersionArchive(VersionArchive newVersionArchive) {
		if (newVersionArchive != versionArchive) {
			NotificationChain msgs = null;
			if (versionArchive != null)
				msgs = ((InternalEObject)versionArchive).eInverseRemove(this, SupportPackage.VERSION_ARCHIVE__ARCHIVED_ENTITY, VersionArchive.class, msgs);
			if (newVersionArchive != null)
				msgs = ((InternalEObject)newVersionArchive).eInverseAdd(this, SupportPackage.VERSION_ARCHIVE__ARCHIVED_ENTITY, VersionArchive.class, msgs);
			msgs = basicSetVersionArchive(newVersionArchive, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SupportPackage.ARCHIVED_ENTITY__VERSION_ARCHIVE, newVersionArchive, newVersionArchive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SupportPackage.ARCHIVED_ENTITY__VERSION_ARCHIVE:
				if (versionArchive != null)
					msgs = ((InternalEObject)versionArchive).eInverseRemove(this, SupportPackage.VERSION_ARCHIVE__ARCHIVED_ENTITY, VersionArchive.class, msgs);
				return basicSetVersionArchive((VersionArchive)otherEnd, msgs);
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
			case SupportPackage.ARCHIVED_ENTITY__VERSION_ARCHIVE:
				return basicSetVersionArchive(null, msgs);
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
			case SupportPackage.ARCHIVED_ENTITY__ARCHIVE_DESCRIPTION:
				return getArchiveDescription();
			case SupportPackage.ARCHIVED_ENTITY__VERSION_ARCHIVE:
				if (resolve) return getVersionArchive();
				return basicGetVersionArchive();
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
			case SupportPackage.ARCHIVED_ENTITY__ARCHIVE_DESCRIPTION:
				setArchiveDescription((String)newValue);
				return;
			case SupportPackage.ARCHIVED_ENTITY__VERSION_ARCHIVE:
				setVersionArchive((VersionArchive)newValue);
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
			case SupportPackage.ARCHIVED_ENTITY__ARCHIVE_DESCRIPTION:
				setArchiveDescription(ARCHIVE_DESCRIPTION_EDEFAULT);
				return;
			case SupportPackage.ARCHIVED_ENTITY__VERSION_ARCHIVE:
				setVersionArchive((VersionArchive)null);
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
			case SupportPackage.ARCHIVED_ENTITY__ARCHIVE_DESCRIPTION:
				return ARCHIVE_DESCRIPTION_EDEFAULT == null ? archiveDescription != null : !ARCHIVE_DESCRIPTION_EDEFAULT.equals(archiveDescription);
			case SupportPackage.ARCHIVED_ENTITY__VERSION_ARCHIVE:
				return versionArchive != null;
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
		result.append(" (archiveDescription: ");
		result.append(archiveDescription);
		result.append(')');
		return result.toString();
	}

} //ArchivedEntityImpl
