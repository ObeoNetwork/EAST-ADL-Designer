/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.platform_model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.obeonetwork.dsl.east_adl.core.impl.EASTADLEntityImpl;

import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor;

import org.obeonetwork.dsl.east_adl.structure.platform_model.Framework;
import org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel;
import org.obeonetwork.dsl.east_adl.structure.platform_model.Platform_modelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Framework</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.platform_model.impl.FrameworkImpl#getConfigurationData <em>Configuration Data</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.platform_model.impl.FrameworkImpl#getOwningArtifact <em>Owning Artifact</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.platform_model.impl.FrameworkImpl#getProcessor <em>Processor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FrameworkImpl extends EASTADLEntityImpl implements Framework {
	/**
	 * The default value of the '{@link #getConfigurationData() <em>Configuration Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationData()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIGURATION_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfigurationData() <em>Configuration Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationData()
	 * @generated
	 * @ordered
	 */
	protected String configurationData = CONFIGURATION_DATA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProcessor() <em>Processor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessor()
	 * @generated
	 * @ordered
	 */
	protected Processor processor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FrameworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Platform_modelPackage.Literals.FRAMEWORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConfigurationData() {
		return configurationData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigurationData(String newConfigurationData) {
		String oldConfigurationData = configurationData;
		configurationData = newConfigurationData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Platform_modelPackage.FRAMEWORK__CONFIGURATION_DATA, oldConfigurationData, configurationData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformModel getOwningArtifact() {
		if (eContainerFeatureID() != Platform_modelPackage.FRAMEWORK__OWNING_ARTIFACT) return null;
		return (PlatformModel)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningArtifact(PlatformModel newOwningArtifact, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningArtifact, Platform_modelPackage.FRAMEWORK__OWNING_ARTIFACT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningArtifact(PlatformModel newOwningArtifact) {
		if (newOwningArtifact != eInternalContainer() || (eContainerFeatureID() != Platform_modelPackage.FRAMEWORK__OWNING_ARTIFACT && newOwningArtifact != null)) {
			if (EcoreUtil.isAncestor(this, newOwningArtifact))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningArtifact != null)
				msgs = ((InternalEObject)newOwningArtifact).eInverseAdd(this, Platform_modelPackage.PLATFORM_MODEL__FRAMEWORKS, PlatformModel.class, msgs);
			msgs = basicSetOwningArtifact(newOwningArtifact, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Platform_modelPackage.FRAMEWORK__OWNING_ARTIFACT, newOwningArtifact, newOwningArtifact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Processor getProcessor() {
		if (processor != null && processor.eIsProxy()) {
			InternalEObject oldProcessor = (InternalEObject)processor;
			processor = (Processor)eResolveProxy(oldProcessor);
			if (processor != oldProcessor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Platform_modelPackage.FRAMEWORK__PROCESSOR, oldProcessor, processor));
			}
		}
		return processor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Processor basicGetProcessor() {
		return processor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcessor(Processor newProcessor, NotificationChain msgs) {
		Processor oldProcessor = processor;
		processor = newProcessor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Platform_modelPackage.FRAMEWORK__PROCESSOR, oldProcessor, newProcessor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessor(Processor newProcessor) {
		if (newProcessor != processor) {
			NotificationChain msgs = null;
			if (processor != null)
				msgs = ((InternalEObject)processor).eInverseRemove(this, Hardware_architecturePackage.PROCESSOR__FRAMEWORKS, Processor.class, msgs);
			if (newProcessor != null)
				msgs = ((InternalEObject)newProcessor).eInverseAdd(this, Hardware_architecturePackage.PROCESSOR__FRAMEWORKS, Processor.class, msgs);
			msgs = basicSetProcessor(newProcessor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Platform_modelPackage.FRAMEWORK__PROCESSOR, newProcessor, newProcessor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Platform_modelPackage.FRAMEWORK__OWNING_ARTIFACT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningArtifact((PlatformModel)otherEnd, msgs);
			case Platform_modelPackage.FRAMEWORK__PROCESSOR:
				if (processor != null)
					msgs = ((InternalEObject)processor).eInverseRemove(this, Hardware_architecturePackage.PROCESSOR__FRAMEWORKS, Processor.class, msgs);
				return basicSetProcessor((Processor)otherEnd, msgs);
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
			case Platform_modelPackage.FRAMEWORK__OWNING_ARTIFACT:
				return basicSetOwningArtifact(null, msgs);
			case Platform_modelPackage.FRAMEWORK__PROCESSOR:
				return basicSetProcessor(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case Platform_modelPackage.FRAMEWORK__OWNING_ARTIFACT:
				return eInternalContainer().eInverseRemove(this, Platform_modelPackage.PLATFORM_MODEL__FRAMEWORKS, PlatformModel.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Platform_modelPackage.FRAMEWORK__CONFIGURATION_DATA:
				return getConfigurationData();
			case Platform_modelPackage.FRAMEWORK__OWNING_ARTIFACT:
				return getOwningArtifact();
			case Platform_modelPackage.FRAMEWORK__PROCESSOR:
				if (resolve) return getProcessor();
				return basicGetProcessor();
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
			case Platform_modelPackage.FRAMEWORK__CONFIGURATION_DATA:
				setConfigurationData((String)newValue);
				return;
			case Platform_modelPackage.FRAMEWORK__OWNING_ARTIFACT:
				setOwningArtifact((PlatformModel)newValue);
				return;
			case Platform_modelPackage.FRAMEWORK__PROCESSOR:
				setProcessor((Processor)newValue);
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
			case Platform_modelPackage.FRAMEWORK__CONFIGURATION_DATA:
				setConfigurationData(CONFIGURATION_DATA_EDEFAULT);
				return;
			case Platform_modelPackage.FRAMEWORK__OWNING_ARTIFACT:
				setOwningArtifact((PlatformModel)null);
				return;
			case Platform_modelPackage.FRAMEWORK__PROCESSOR:
				setProcessor((Processor)null);
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
			case Platform_modelPackage.FRAMEWORK__CONFIGURATION_DATA:
				return CONFIGURATION_DATA_EDEFAULT == null ? configurationData != null : !CONFIGURATION_DATA_EDEFAULT.equals(configurationData);
			case Platform_modelPackage.FRAMEWORK__OWNING_ARTIFACT:
				return getOwningArtifact() != null;
			case Platform_modelPackage.FRAMEWORK__PROCESSOR:
				return processor != null;
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
		result.append(" (configurationData: ");
		result.append(configurationData);
		result.append(')');
		return result.toString();
	}

} //FrameworkImpl
