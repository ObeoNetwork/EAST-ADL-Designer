/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.platform_model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.east_adl.core.impl.EASTADLEntityImpl;

import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Pin;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor;

import org.obeonetwork.dsl.east_adl.structure.platform_model.HardwareAbstractionFunction;
import org.obeonetwork.dsl.east_adl.structure.platform_model.IODriver;
import org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel;
import org.obeonetwork.dsl.east_adl.structure.platform_model.Platform_modelPackage;
import org.obeonetwork.dsl.east_adl.structure.platform_model.SystemPort;

import org.obeonetwork.dsl.east_adl.verification_validation.VVCase;
import org.obeonetwork.dsl.east_adl.verification_validation.ValidatedEntity;
import org.obeonetwork.dsl.east_adl.verification_validation.Verification_validationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hardware Abstraction Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.platform_model.impl.HardwareAbstractionFunctionImpl#getValidators <em>Validators</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.platform_model.impl.HardwareAbstractionFunctionImpl#getOwningArtifact <em>Owning Artifact</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.platform_model.impl.HardwareAbstractionFunctionImpl#getDriver <em>Driver</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.platform_model.impl.HardwareAbstractionFunctionImpl#getProvidedPort <em>Provided Port</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.platform_model.impl.HardwareAbstractionFunctionImpl#getRequiredPort <em>Required Port</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.platform_model.impl.HardwareAbstractionFunctionImpl#getAccessiblePins <em>Accessible Pins</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.platform_model.impl.HardwareAbstractionFunctionImpl#getProcessor <em>Processor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HardwareAbstractionFunctionImpl extends EASTADLEntityImpl implements HardwareAbstractionFunction {
	/**
	 * The cached value of the '{@link #getValidators() <em>Validators</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidators()
	 * @generated
	 * @ordered
	 */
	protected EList<VVCase> validators;

	/**
	 * The cached value of the '{@link #getDriver() <em>Driver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriver()
	 * @generated
	 * @ordered
	 */
	protected IODriver driver;

	/**
	 * The cached value of the '{@link #getProvidedPort() <em>Provided Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedPort()
	 * @generated
	 * @ordered
	 */
	protected SystemPort providedPort;

	/**
	 * The cached value of the '{@link #getRequiredPort() <em>Required Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredPort()
	 * @generated
	 * @ordered
	 */
	protected SystemPort requiredPort;

	/**
	 * The cached value of the '{@link #getAccessiblePins() <em>Accessible Pins</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessiblePins()
	 * @generated
	 * @ordered
	 */
	protected EList<Pin> accessiblePins;

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
	protected HardwareAbstractionFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Platform_modelPackage.Literals.HARDWARE_ABSTRACTION_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VVCase> getValidators() {
		if (validators == null) {
			validators = new EObjectWithInverseResolvingEList.ManyInverse<VVCase>(VVCase.class, this, Platform_modelPackage.HARDWARE_ABSTRACTION_FUNCTION__VALIDATORS, Verification_validationPackage.VV_CASE__VALIDATED_ENTITIES);
		}
		return validators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformModel getOwningArtifact() {
		if (eContainerFeatureID() != Platform_modelPackage.HARDWARE_ABSTRACTION_FUNCTION__OWNING_ARTIFACT) return null;
		return (PlatformModel)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningArtifact(PlatformModel newOwningArtifact, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningArtifact, Platform_modelPackage.HARDWARE_ABSTRACTION_FUNCTION__OWNING_ARTIFACT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningArtifact(PlatformModel newOwningArtifact) {
		if (newOwningArtifact != eInternalContainer() || (eContainerFeatureID() != Platform_modelPackage.HARDWARE_ABSTRACTION_FUNCTION__OWNING_ARTIFACT && newOwningArtifact != null)) {
			if (EcoreUtil.isAncestor(this, newOwningArtifact))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningArtifact != null)
				msgs = ((InternalEObject)newOwningArtifact).eInverseAdd(this, Platform_modelPackage.PLATFORM_MODEL__ABSTRACT_FUNCTIONS, PlatformModel.class, msgs);
			msgs = basicSetOwningArtifact(newOwningArtifact, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Platform_modelPackage.HARDWARE_ABSTRACTION_FUNCTION__OWNING_ARTIFACT, newOwningArtifact, newOwningArtifact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IODriver getDriver() {
		if (driver != null && driver.eIsProxy()) {
			InternalEObject oldDriver = (InternalEObject)driver;
			driver = (IODriver)eResolveProxy(oldDriver);
			if (driver != oldDriver) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Platform_modelPackage.HARDWARE_ABSTRACTION_FUNCTION__DRIVER, oldDriver, driver));
			}
		}
		return driver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IODriver basicGetDriver() {
		return driver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDriver(IODriver newDriver, NotificationChain msgs) {
		IODriver oldDriver = driver;
		driver = newDriver;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Platform_modelPackage.HARDWARE_ABSTRACTION_FUNCTION__DRIVER, oldDriver, newDriver);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDriver(IODriver newDriver) {
		if (newDriver != driver) {
			NotificationChain msgs = null;
			if (driver != null)
				msgs = ((InternalEObject)driver).eInverseRemove(this, Platform_modelPackage.IO_DRIVER__ABSTRACTION, IODriver.class, msgs);
			if (newDriver != null)
				msgs = ((InternalEObject)newDriver).eInverseAdd(this, Platform_modelPackage.IO_DRIVER__ABSTRACTION, IODriver.class, msgs);
			msgs = basicSetDriver(newDriver, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Platform_modelPackage.HARDWARE_ABSTRACTION_FUNCTION__DRIVER, newDriver, newDriver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemPort getProvidedPort() {
		return providedPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProvidedPort(SystemPort newProvidedPort, NotificationChain msgs) {
		SystemPort oldProvidedPort = providedPort;
		providedPort = newProvidedPort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Platform_modelPackage.HARDWARE_ABSTRACTION_FUNCTION__PROVIDED_PORT, oldProvidedPort, newProvidedPort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvidedPort(SystemPort newProvidedPort) {
		if (newProvidedPort != providedPort) {
			NotificationChain msgs = null;
			if (providedPort != null)
				msgs = ((InternalEObject)providedPort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Platform_modelPackage.HARDWARE_ABSTRACTION_FUNCTION__PROVIDED_PORT, null, msgs);
			if (newProvidedPort != null)
				msgs = ((InternalEObject)newProvidedPort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Platform_modelPackage.HARDWARE_ABSTRACTION_FUNCTION__PROVIDED_PORT, null, msgs);
			msgs = basicSetProvidedPort(newProvidedPort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Platform_modelPackage.HARDWARE_ABSTRACTION_FUNCTION__PROVIDED_PORT, newProvidedPort, newProvidedPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemPort getRequiredPort() {
		return requiredPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequiredPort(SystemPort newRequiredPort, NotificationChain msgs) {
		SystemPort oldRequiredPort = requiredPort;
		requiredPort = newRequiredPort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Platform_modelPackage.HARDWARE_ABSTRACTION_FUNCTION__REQUIRED_PORT, oldRequiredPort, newRequiredPort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredPort(SystemPort newRequiredPort) {
		if (newRequiredPort != requiredPort) {
			NotificationChain msgs = null;
			if (requiredPort != null)
				msgs = ((InternalEObject)requiredPort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Platform_modelPackage.HARDWARE_ABSTRACTION_FUNCTION__REQUIRED_PORT, null, msgs);
			if (newRequiredPort != null)
				msgs = ((InternalEObject)newRequiredPort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Platform_modelPackage.HARDWARE_ABSTRACTION_FUNCTION__REQUIRED_PORT, null, msgs);
			msgs = basicSetRequiredPort(newRequiredPort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Platform_modelPackage.HARDWARE_ABSTRACTION_FUNCTION__REQUIRED_PORT, newRequiredPort, newRequiredPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pin> getAccessiblePins() {
		if (accessiblePins == null) {
			accessiblePins = new EObjectWithInverseResolvingEList.ManyInverse<Pin>(Pin.class, this, Platform_modelPackage.HARDWARE_ABSTRACTION_FUNCTION__ACCESSIBLE_PINS, Hardware_architecturePackage.PIN__ABSTRACT_INTERFACES);
		}
		return accessiblePins;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Platform_modelPackage.HARDWARE_ABSTRACTION_FUNCTION__PROCESSOR, oldProcessor, processor));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Platform_modelPackage.HARDWARE_ABSTRACTION_FUNCTION__PROCESSOR, oldProcessor, newProcessor);
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
				msgs = ((InternalEObject)processor).eInverseRemove(this, Hardware_architecturePackage.PROCESSOR__HARDWARE_ABSTRACTIONS, Processor.class, msgs);
			if (newProcessor != null)
				msgs = ((InternalEObject)newProcessor).eInverseAdd(this, Hardware_architecturePackage.PROCESSOR__HARDWARE_ABSTRACTIONS, Processor.class, msgs);
			msgs = basicSetProcessor(newProcessor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Platform_modelPackage.HARDWARE_ABSTRACTION_FUNCTION__PROCESSOR, newProcessor, newProcessor));
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
			case Platform_modelPackage.HARDWARE_ABSTRACTION_FUNCTION__VALIDATORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getValidators()).basicAdd(otherEnd, msgs);
			case Platform_modelPackage.HARDWARE_ABSTRACTION_FUNCTION__OWNING_ARTIFACT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningArtifact((PlatformModel)otherEnd, msgs);
			case Platform_modelPackage.HARDWARE_ABSTRACTION_FUNCTION__DRIVER:
				if (driver != null)
					msgs = ((InternalEObject)driver).eInverseRemove(this, Platform_modelPackage.IO_DRIVER__ABSTRACTION, IODriver.class, msgs);
				return basicSetDriver((IODriver)otherEnd, msgs);
			case Platform_modelPackage.HARDWARE_ABSTRACTION_FUNCTION__ACCESSIBLE_PINS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAccessiblePins()).basicAdd(otherEnd, msgs);
			case Platform_modelPackage.HARDWARE_ABSTRACTION_FUNCTION__PROCESSOR:
				if (processor != null)
					msgs = ((InternalEObject)processor).eInverseRemove(this, Hardware_architecturePackage.PROCESSOR__HARDWARE_ABSTRACTIONS, Processor.class, msgs);
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
			case Platform_modelPackage.HARDWARE_ABSTRACTION_FUNCTION__VALIDATORS:
				return ((InternalEList<?>)getValidators()).basicRemove(otherEnd, msgs);
			case Platform_modelPackage.HARDWARE_ABSTRACTION_FUNCTION__OWNING_ARTIFACT:
				return basicSetOwningArtifact(null, msgs);
			case Platform_modelPackage.HARDWARE_ABSTRACTION_FUNCTION__DRIVER:
				return basicSetDriver(null, msgs);
			case Platform_modelPackage.HARDWARE_ABSTRACTION_FUNCTION__PROVIDED_PORT:
				return basicSetProvidedPort(null, msgs);
			case Platform_modelPackage.HARDWARE_ABSTRACTION_FUNCTION__REQUIRED_PORT:
				return basicSetRequiredPort(null, msgs);
			case Platform_modelPackage.HARDWARE_ABSTRACTION_FUNCTION__ACCESSIBLE_PINS:
				return ((InternalEList<?>)getAccessiblePins()).basicRemove(otherEnd, msgs);
			case Platform_modelPackage.HARDWARE_ABSTRACTION_FUNCTION__PROCESSOR:
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
			case Platform_modelPackage.HARDWARE_ABSTRACTION_FUNCTION__OWNING_ARTIFACT:
				return eInternalContainer().eInverseRemove(this, Platform_modelPackage.PLATFORM_MODEL__ABSTRACT_FUNCTIONS, PlatformModel.class, msgs);
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
			case Platform_modelPackage.HARDWARE_ABSTRACTION_FUNCTION__VALIDATORS:
				return getValidators();
			case Platform_modelPackage.HARDWARE_ABSTRACTION_FUNCTION__OWNING_ARTIFACT:
				return getOwningArtifact();
			case Platform_modelPackage.HARDWARE_ABSTRACTION_FUNCTION__DRIVER:
				if (resolve) return getDriver();
				return basicGetDriver();
			case Platform_modelPackage.HARDWARE_ABSTRACTION_FUNCTION__PROVIDED_PORT:
				return getProvidedPort();
			case Platform_modelPackage.HARDWARE_ABSTRACTION_FUNCTION__REQUIRED_PORT:
				return getRequiredPort();
			case Platform_modelPackage.HARDWARE_ABSTRACTION_FUNCTION__ACCESSIBLE_PINS:
				return getAccessiblePins();
			case Platform_modelPackage.HARDWARE_ABSTRACTION_FUNCTION__PROCESSOR:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Platform_modelPackage.HARDWARE_ABSTRACTION_FUNCTION__VALIDATORS:
				getValidators().clear();
				getValidators().addAll((Collection<? extends VVCase>)newValue);
				return;
			case Platform_modelPackage.HARDWARE_ABSTRACTION_FUNCTION__OWNING_ARTIFACT:
				setOwningArtifact((PlatformModel)newValue);
				return;
			case Platform_modelPackage.HARDWARE_ABSTRACTION_FUNCTION__DRIVER:
				setDriver((IODriver)newValue);
				return;
			case Platform_modelPackage.HARDWARE_ABSTRACTION_FUNCTION__PROVIDED_PORT:
				setProvidedPort((SystemPort)newValue);
				return;
			case Platform_modelPackage.HARDWARE_ABSTRACTION_FUNCTION__REQUIRED_PORT:
				setRequiredPort((SystemPort)newValue);
				return;
			case Platform_modelPackage.HARDWARE_ABSTRACTION_FUNCTION__ACCESSIBLE_PINS:
				getAccessiblePins().clear();
				getAccessiblePins().addAll((Collection<? extends Pin>)newValue);
				return;
			case Platform_modelPackage.HARDWARE_ABSTRACTION_FUNCTION__PROCESSOR:
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
			case Platform_modelPackage.HARDWARE_ABSTRACTION_FUNCTION__VALIDATORS:
				getValidators().clear();
				return;
			case Platform_modelPackage.HARDWARE_ABSTRACTION_FUNCTION__OWNING_ARTIFACT:
				setOwningArtifact((PlatformModel)null);
				return;
			case Platform_modelPackage.HARDWARE_ABSTRACTION_FUNCTION__DRIVER:
				setDriver((IODriver)null);
				return;
			case Platform_modelPackage.HARDWARE_ABSTRACTION_FUNCTION__PROVIDED_PORT:
				setProvidedPort((SystemPort)null);
				return;
			case Platform_modelPackage.HARDWARE_ABSTRACTION_FUNCTION__REQUIRED_PORT:
				setRequiredPort((SystemPort)null);
				return;
			case Platform_modelPackage.HARDWARE_ABSTRACTION_FUNCTION__ACCESSIBLE_PINS:
				getAccessiblePins().clear();
				return;
			case Platform_modelPackage.HARDWARE_ABSTRACTION_FUNCTION__PROCESSOR:
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
			case Platform_modelPackage.HARDWARE_ABSTRACTION_FUNCTION__VALIDATORS:
				return validators != null && !validators.isEmpty();
			case Platform_modelPackage.HARDWARE_ABSTRACTION_FUNCTION__OWNING_ARTIFACT:
				return getOwningArtifact() != null;
			case Platform_modelPackage.HARDWARE_ABSTRACTION_FUNCTION__DRIVER:
				return driver != null;
			case Platform_modelPackage.HARDWARE_ABSTRACTION_FUNCTION__PROVIDED_PORT:
				return providedPort != null;
			case Platform_modelPackage.HARDWARE_ABSTRACTION_FUNCTION__REQUIRED_PORT:
				return requiredPort != null;
			case Platform_modelPackage.HARDWARE_ABSTRACTION_FUNCTION__ACCESSIBLE_PINS:
				return accessiblePins != null && !accessiblePins.isEmpty();
			case Platform_modelPackage.HARDWARE_ABSTRACTION_FUNCTION__PROCESSOR:
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ValidatedEntity.class) {
			switch (derivedFeatureID) {
				case Platform_modelPackage.HARDWARE_ABSTRACTION_FUNCTION__VALIDATORS: return Verification_validationPackage.VALIDATED_ENTITY__VALIDATORS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ValidatedEntity.class) {
			switch (baseFeatureID) {
				case Verification_validationPackage.VALIDATED_ENTITY__VALIDATORS: return Platform_modelPackage.HARDWARE_ABSTRACTION_FUNCTION__VALIDATORS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //HardwareAbstractionFunctionImpl
