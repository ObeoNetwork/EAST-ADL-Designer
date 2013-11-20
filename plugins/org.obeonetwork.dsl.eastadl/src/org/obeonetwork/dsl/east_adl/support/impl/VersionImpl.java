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

import org.obeonetwork.dsl.east_adl.support.Configuration;
import org.obeonetwork.dsl.east_adl.support.SupportPackage;
import org.obeonetwork.dsl.east_adl.support.Version;
import org.obeonetwork.dsl.east_adl.support.VersionArchive;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Version</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.support.impl.VersionImpl#getVersionNumber <em>Version Number</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.support.impl.VersionImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.support.impl.VersionImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.support.impl.VersionImpl#getVersionArchive <em>Version Archive</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.support.impl.VersionImpl#getCreation <em>Creation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VersionImpl extends SupportEntityImpl implements Version {
	/**
	 * The default value of the '{@link #getVersionNumber() <em>Version Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersionNumber() <em>Version Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionNumber()
	 * @generated
	 * @ordered
	 */
	protected String versionNumber = VERSION_NUMBER_EDEFAULT;

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
	 * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected Configuration configuration;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VersionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SupportPackage.Literals.VERSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersionNumber() {
		return versionNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersionNumber(String newVersionNumber) {
		String oldVersionNumber = versionNumber;
		versionNumber = newVersionNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SupportPackage.VERSION__VERSION_NUMBER, oldVersionNumber, versionNumber));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SupportPackage.VERSION__AUTHOR, oldAuthor, author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration getConfiguration() {
		if (configuration != null && configuration.eIsProxy()) {
			InternalEObject oldConfiguration = (InternalEObject)configuration;
			configuration = (Configuration)eResolveProxy(oldConfiguration);
			if (configuration != oldConfiguration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SupportPackage.VERSION__CONFIGURATION, oldConfiguration, configuration));
			}
		}
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration basicGetConfiguration() {
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfiguration(Configuration newConfiguration, NotificationChain msgs) {
		Configuration oldConfiguration = configuration;
		configuration = newConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SupportPackage.VERSION__CONFIGURATION, oldConfiguration, newConfiguration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfiguration(Configuration newConfiguration) {
		if (newConfiguration != configuration) {
			NotificationChain msgs = null;
			if (configuration != null)
				msgs = ((InternalEObject)configuration).eInverseRemove(this, SupportPackage.CONFIGURATION__VERSIONS, Configuration.class, msgs);
			if (newConfiguration != null)
				msgs = ((InternalEObject)newConfiguration).eInverseAdd(this, SupportPackage.CONFIGURATION__VERSIONS, Configuration.class, msgs);
			msgs = basicSetConfiguration(newConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SupportPackage.VERSION__CONFIGURATION, newConfiguration, newConfiguration));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SupportPackage.VERSION__VERSION_ARCHIVE, oldVersionArchive, versionArchive));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SupportPackage.VERSION__VERSION_ARCHIVE, oldVersionArchive, newVersionArchive);
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
				msgs = ((InternalEObject)versionArchive).eInverseRemove(this, SupportPackage.VERSION_ARCHIVE__VERSIONS, VersionArchive.class, msgs);
			if (newVersionArchive != null)
				msgs = ((InternalEObject)newVersionArchive).eInverseAdd(this, SupportPackage.VERSION_ARCHIVE__VERSIONS, VersionArchive.class, msgs);
			msgs = basicSetVersionArchive(newVersionArchive, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SupportPackage.VERSION__VERSION_ARCHIVE, newVersionArchive, newVersionArchive));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SupportPackage.VERSION__CREATION, oldCreation, creation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SupportPackage.VERSION__CONFIGURATION:
				if (configuration != null)
					msgs = ((InternalEObject)configuration).eInverseRemove(this, SupportPackage.CONFIGURATION__VERSIONS, Configuration.class, msgs);
				return basicSetConfiguration((Configuration)otherEnd, msgs);
			case SupportPackage.VERSION__VERSION_ARCHIVE:
				if (versionArchive != null)
					msgs = ((InternalEObject)versionArchive).eInverseRemove(this, SupportPackage.VERSION_ARCHIVE__VERSIONS, VersionArchive.class, msgs);
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
			case SupportPackage.VERSION__CONFIGURATION:
				return basicSetConfiguration(null, msgs);
			case SupportPackage.VERSION__VERSION_ARCHIVE:
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
			case SupportPackage.VERSION__VERSION_NUMBER:
				return getVersionNumber();
			case SupportPackage.VERSION__AUTHOR:
				return getAuthor();
			case SupportPackage.VERSION__CONFIGURATION:
				if (resolve) return getConfiguration();
				return basicGetConfiguration();
			case SupportPackage.VERSION__VERSION_ARCHIVE:
				if (resolve) return getVersionArchive();
				return basicGetVersionArchive();
			case SupportPackage.VERSION__CREATION:
				return getCreation();
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
			case SupportPackage.VERSION__VERSION_NUMBER:
				setVersionNumber((String)newValue);
				return;
			case SupportPackage.VERSION__AUTHOR:
				setAuthor((String)newValue);
				return;
			case SupportPackage.VERSION__CONFIGURATION:
				setConfiguration((Configuration)newValue);
				return;
			case SupportPackage.VERSION__VERSION_ARCHIVE:
				setVersionArchive((VersionArchive)newValue);
				return;
			case SupportPackage.VERSION__CREATION:
				setCreation((Date)newValue);
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
			case SupportPackage.VERSION__VERSION_NUMBER:
				setVersionNumber(VERSION_NUMBER_EDEFAULT);
				return;
			case SupportPackage.VERSION__AUTHOR:
				setAuthor(AUTHOR_EDEFAULT);
				return;
			case SupportPackage.VERSION__CONFIGURATION:
				setConfiguration((Configuration)null);
				return;
			case SupportPackage.VERSION__VERSION_ARCHIVE:
				setVersionArchive((VersionArchive)null);
				return;
			case SupportPackage.VERSION__CREATION:
				setCreation(CREATION_EDEFAULT);
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
			case SupportPackage.VERSION__VERSION_NUMBER:
				return VERSION_NUMBER_EDEFAULT == null ? versionNumber != null : !VERSION_NUMBER_EDEFAULT.equals(versionNumber);
			case SupportPackage.VERSION__AUTHOR:
				return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
			case SupportPackage.VERSION__CONFIGURATION:
				return configuration != null;
			case SupportPackage.VERSION__VERSION_ARCHIVE:
				return versionArchive != null;
			case SupportPackage.VERSION__CREATION:
				return CREATION_EDEFAULT == null ? creation != null : !CREATION_EDEFAULT.equals(creation);
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
		result.append(" (versionNumber: ");
		result.append(versionNumber);
		result.append(", author: ");
		result.append(author);
		result.append(", creation: ");
		result.append(creation);
		result.append(')');
		return result.toString();
	}

} //VersionImpl
