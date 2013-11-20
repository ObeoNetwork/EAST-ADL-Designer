/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.support.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.east_adl.support.Configuration;
import org.obeonetwork.dsl.east_adl.support.SupportPackage;
import org.obeonetwork.dsl.east_adl.support.Version;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.support.impl.ConfigurationImpl#getVersions <em>Versions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.support.impl.ConfigurationImpl#getConfigurationDescription <em>Configuration Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfigurationImpl extends SupportEntityImpl implements Configuration {
	/**
	 * The cached value of the '{@link #getVersions() <em>Versions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersions()
	 * @generated
	 * @ordered
	 */
	protected EList<Version> versions;

	/**
	 * The default value of the '{@link #getConfigurationDescription() <em>Configuration Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIGURATION_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfigurationDescription() <em>Configuration Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationDescription()
	 * @generated
	 * @ordered
	 */
	protected String configurationDescription = CONFIGURATION_DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SupportPackage.Literals.CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Version> getVersions() {
		if (versions == null) {
			versions = new EObjectWithInverseResolvingEList<Version>(Version.class, this, SupportPackage.CONFIGURATION__VERSIONS, SupportPackage.VERSION__CONFIGURATION);
		}
		return versions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConfigurationDescription() {
		return configurationDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigurationDescription(String newConfigurationDescription) {
		String oldConfigurationDescription = configurationDescription;
		configurationDescription = newConfigurationDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SupportPackage.CONFIGURATION__CONFIGURATION_DESCRIPTION, oldConfigurationDescription, configurationDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SupportPackage.CONFIGURATION__VERSIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVersions()).basicAdd(otherEnd, msgs);
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
			case SupportPackage.CONFIGURATION__VERSIONS:
				return ((InternalEList<?>)getVersions()).basicRemove(otherEnd, msgs);
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
			case SupportPackage.CONFIGURATION__VERSIONS:
				return getVersions();
			case SupportPackage.CONFIGURATION__CONFIGURATION_DESCRIPTION:
				return getConfigurationDescription();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SupportPackage.CONFIGURATION__VERSIONS:
				getVersions().clear();
				getVersions().addAll((Collection<? extends Version>)newValue);
				return;
			case SupportPackage.CONFIGURATION__CONFIGURATION_DESCRIPTION:
				setConfigurationDescription((String)newValue);
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
			case SupportPackage.CONFIGURATION__VERSIONS:
				getVersions().clear();
				return;
			case SupportPackage.CONFIGURATION__CONFIGURATION_DESCRIPTION:
				setConfigurationDescription(CONFIGURATION_DESCRIPTION_EDEFAULT);
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
			case SupportPackage.CONFIGURATION__VERSIONS:
				return versions != null && !versions.isEmpty();
			case SupportPackage.CONFIGURATION__CONFIGURATION_DESCRIPTION:
				return CONFIGURATION_DESCRIPTION_EDEFAULT == null ? configurationDescription != null : !CONFIGURATION_DESCRIPTION_EDEFAULT.equals(configurationDescription);
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
		result.append(" (configurationDescription: ");
		result.append(configurationDescription);
		result.append(')');
		return result.toString();
	}

} //ConfigurationImpl
