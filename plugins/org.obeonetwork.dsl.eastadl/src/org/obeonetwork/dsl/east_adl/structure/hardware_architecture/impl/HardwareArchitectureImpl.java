/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.east_adl.core.impl.EASTADLArtifactImpl;

import org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.FunctionalDesignArchitecture;
import org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Functional_design_architecturePackage;

import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ElectricalSignal;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.HardwareArchitecture;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.HardwareEntity;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Wire;

import org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel;
import org.obeonetwork.dsl.east_adl.structure.platform_model.Platform_modelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hardware Architecture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.HardwareArchitectureImpl#getPlatformModel <em>Platform Model</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.HardwareArchitectureImpl#getHardwareEntities <em>Hardware Entities</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.HardwareArchitectureImpl#getElectricalSignals <em>Electrical Signals</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.HardwareArchitectureImpl#getWires <em>Wires</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.HardwareArchitectureImpl#getDesignArchitecture <em>Design Architecture</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HardwareArchitectureImpl extends EASTADLArtifactImpl implements HardwareArchitecture {
	/**
	 * The cached value of the '{@link #getPlatformModel() <em>Platform Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatformModel()
	 * @generated
	 * @ordered
	 */
	protected PlatformModel platformModel;

	/**
	 * The cached value of the '{@link #getHardwareEntities() <em>Hardware Entities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardwareEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<HardwareEntity> hardwareEntities;

	/**
	 * The cached value of the '{@link #getElectricalSignals() <em>Electrical Signals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElectricalSignals()
	 * @generated
	 * @ordered
	 */
	protected EList<ElectricalSignal> electricalSignals;

	/**
	 * The cached value of the '{@link #getWires() <em>Wires</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWires()
	 * @generated
	 * @ordered
	 */
	protected EList<Wire> wires;

	/**
	 * The cached value of the '{@link #getDesignArchitecture() <em>Design Architecture</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignArchitecture()
	 * @generated
	 * @ordered
	 */
	protected FunctionalDesignArchitecture designArchitecture;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HardwareArchitectureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hardware_architecturePackage.Literals.HARDWARE_ARCHITECTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformModel getPlatformModel() {
		if (platformModel != null && platformModel.eIsProxy()) {
			InternalEObject oldPlatformModel = (InternalEObject)platformModel;
			platformModel = (PlatformModel)eResolveProxy(oldPlatformModel);
			if (platformModel != oldPlatformModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hardware_architecturePackage.HARDWARE_ARCHITECTURE__PLATFORM_MODEL, oldPlatformModel, platformModel));
			}
		}
		return platformModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformModel basicGetPlatformModel() {
		return platformModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlatformModel(PlatformModel newPlatformModel, NotificationChain msgs) {
		PlatformModel oldPlatformModel = platformModel;
		platformModel = newPlatformModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Hardware_architecturePackage.HARDWARE_ARCHITECTURE__PLATFORM_MODEL, oldPlatformModel, newPlatformModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlatformModel(PlatformModel newPlatformModel) {
		if (newPlatformModel != platformModel) {
			NotificationChain msgs = null;
			if (platformModel != null)
				msgs = ((InternalEObject)platformModel).eInverseRemove(this, Platform_modelPackage.PLATFORM_MODEL__HARDWARE_ARCHITECTURE, PlatformModel.class, msgs);
			if (newPlatformModel != null)
				msgs = ((InternalEObject)newPlatformModel).eInverseAdd(this, Platform_modelPackage.PLATFORM_MODEL__HARDWARE_ARCHITECTURE, PlatformModel.class, msgs);
			msgs = basicSetPlatformModel(newPlatformModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hardware_architecturePackage.HARDWARE_ARCHITECTURE__PLATFORM_MODEL, newPlatformModel, newPlatformModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HardwareEntity> getHardwareEntities() {
		if (hardwareEntities == null) {
			hardwareEntities = new EObjectContainmentEList<HardwareEntity>(HardwareEntity.class, this, Hardware_architecturePackage.HARDWARE_ARCHITECTURE__HARDWARE_ENTITIES);
		}
		return hardwareEntities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElectricalSignal> getElectricalSignals() {
		if (electricalSignals == null) {
			electricalSignals = new EObjectContainmentWithInverseEList<ElectricalSignal>(ElectricalSignal.class, this, Hardware_architecturePackage.HARDWARE_ARCHITECTURE__ELECTRICAL_SIGNALS, Hardware_architecturePackage.ELECTRICAL_SIGNAL__OWNING_ARTIFACT);
		}
		return electricalSignals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Wire> getWires() {
		if (wires == null) {
			wires = new EObjectContainmentWithInverseEList<Wire>(Wire.class, this, Hardware_architecturePackage.HARDWARE_ARCHITECTURE__WIRES, Hardware_architecturePackage.WIRE__OWNING_ARTIFACT);
		}
		return wires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalDesignArchitecture getDesignArchitecture() {
		if (designArchitecture != null && designArchitecture.eIsProxy()) {
			InternalEObject oldDesignArchitecture = (InternalEObject)designArchitecture;
			designArchitecture = (FunctionalDesignArchitecture)eResolveProxy(oldDesignArchitecture);
			if (designArchitecture != oldDesignArchitecture) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hardware_architecturePackage.HARDWARE_ARCHITECTURE__DESIGN_ARCHITECTURE, oldDesignArchitecture, designArchitecture));
			}
		}
		return designArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalDesignArchitecture basicGetDesignArchitecture() {
		return designArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDesignArchitecture(FunctionalDesignArchitecture newDesignArchitecture, NotificationChain msgs) {
		FunctionalDesignArchitecture oldDesignArchitecture = designArchitecture;
		designArchitecture = newDesignArchitecture;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Hardware_architecturePackage.HARDWARE_ARCHITECTURE__DESIGN_ARCHITECTURE, oldDesignArchitecture, newDesignArchitecture);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesignArchitecture(FunctionalDesignArchitecture newDesignArchitecture) {
		if (newDesignArchitecture != designArchitecture) {
			NotificationChain msgs = null;
			if (designArchitecture != null)
				msgs = ((InternalEObject)designArchitecture).eInverseRemove(this, Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__HARDWARE_ARCHITECTURE, FunctionalDesignArchitecture.class, msgs);
			if (newDesignArchitecture != null)
				msgs = ((InternalEObject)newDesignArchitecture).eInverseAdd(this, Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__HARDWARE_ARCHITECTURE, FunctionalDesignArchitecture.class, msgs);
			msgs = basicSetDesignArchitecture(newDesignArchitecture, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hardware_architecturePackage.HARDWARE_ARCHITECTURE__DESIGN_ARCHITECTURE, newDesignArchitecture, newDesignArchitecture));
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
			case Hardware_architecturePackage.HARDWARE_ARCHITECTURE__PLATFORM_MODEL:
				if (platformModel != null)
					msgs = ((InternalEObject)platformModel).eInverseRemove(this, Platform_modelPackage.PLATFORM_MODEL__HARDWARE_ARCHITECTURE, PlatformModel.class, msgs);
				return basicSetPlatformModel((PlatformModel)otherEnd, msgs);
			case Hardware_architecturePackage.HARDWARE_ARCHITECTURE__ELECTRICAL_SIGNALS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getElectricalSignals()).basicAdd(otherEnd, msgs);
			case Hardware_architecturePackage.HARDWARE_ARCHITECTURE__WIRES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWires()).basicAdd(otherEnd, msgs);
			case Hardware_architecturePackage.HARDWARE_ARCHITECTURE__DESIGN_ARCHITECTURE:
				if (designArchitecture != null)
					msgs = ((InternalEObject)designArchitecture).eInverseRemove(this, Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__HARDWARE_ARCHITECTURE, FunctionalDesignArchitecture.class, msgs);
				return basicSetDesignArchitecture((FunctionalDesignArchitecture)otherEnd, msgs);
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
			case Hardware_architecturePackage.HARDWARE_ARCHITECTURE__PLATFORM_MODEL:
				return basicSetPlatformModel(null, msgs);
			case Hardware_architecturePackage.HARDWARE_ARCHITECTURE__HARDWARE_ENTITIES:
				return ((InternalEList<?>)getHardwareEntities()).basicRemove(otherEnd, msgs);
			case Hardware_architecturePackage.HARDWARE_ARCHITECTURE__ELECTRICAL_SIGNALS:
				return ((InternalEList<?>)getElectricalSignals()).basicRemove(otherEnd, msgs);
			case Hardware_architecturePackage.HARDWARE_ARCHITECTURE__WIRES:
				return ((InternalEList<?>)getWires()).basicRemove(otherEnd, msgs);
			case Hardware_architecturePackage.HARDWARE_ARCHITECTURE__DESIGN_ARCHITECTURE:
				return basicSetDesignArchitecture(null, msgs);
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
			case Hardware_architecturePackage.HARDWARE_ARCHITECTURE__PLATFORM_MODEL:
				if (resolve) return getPlatformModel();
				return basicGetPlatformModel();
			case Hardware_architecturePackage.HARDWARE_ARCHITECTURE__HARDWARE_ENTITIES:
				return getHardwareEntities();
			case Hardware_architecturePackage.HARDWARE_ARCHITECTURE__ELECTRICAL_SIGNALS:
				return getElectricalSignals();
			case Hardware_architecturePackage.HARDWARE_ARCHITECTURE__WIRES:
				return getWires();
			case Hardware_architecturePackage.HARDWARE_ARCHITECTURE__DESIGN_ARCHITECTURE:
				if (resolve) return getDesignArchitecture();
				return basicGetDesignArchitecture();
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
			case Hardware_architecturePackage.HARDWARE_ARCHITECTURE__PLATFORM_MODEL:
				setPlatformModel((PlatformModel)newValue);
				return;
			case Hardware_architecturePackage.HARDWARE_ARCHITECTURE__HARDWARE_ENTITIES:
				getHardwareEntities().clear();
				getHardwareEntities().addAll((Collection<? extends HardwareEntity>)newValue);
				return;
			case Hardware_architecturePackage.HARDWARE_ARCHITECTURE__ELECTRICAL_SIGNALS:
				getElectricalSignals().clear();
				getElectricalSignals().addAll((Collection<? extends ElectricalSignal>)newValue);
				return;
			case Hardware_architecturePackage.HARDWARE_ARCHITECTURE__WIRES:
				getWires().clear();
				getWires().addAll((Collection<? extends Wire>)newValue);
				return;
			case Hardware_architecturePackage.HARDWARE_ARCHITECTURE__DESIGN_ARCHITECTURE:
				setDesignArchitecture((FunctionalDesignArchitecture)newValue);
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
			case Hardware_architecturePackage.HARDWARE_ARCHITECTURE__PLATFORM_MODEL:
				setPlatformModel((PlatformModel)null);
				return;
			case Hardware_architecturePackage.HARDWARE_ARCHITECTURE__HARDWARE_ENTITIES:
				getHardwareEntities().clear();
				return;
			case Hardware_architecturePackage.HARDWARE_ARCHITECTURE__ELECTRICAL_SIGNALS:
				getElectricalSignals().clear();
				return;
			case Hardware_architecturePackage.HARDWARE_ARCHITECTURE__WIRES:
				getWires().clear();
				return;
			case Hardware_architecturePackage.HARDWARE_ARCHITECTURE__DESIGN_ARCHITECTURE:
				setDesignArchitecture((FunctionalDesignArchitecture)null);
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
			case Hardware_architecturePackage.HARDWARE_ARCHITECTURE__PLATFORM_MODEL:
				return platformModel != null;
			case Hardware_architecturePackage.HARDWARE_ARCHITECTURE__HARDWARE_ENTITIES:
				return hardwareEntities != null && !hardwareEntities.isEmpty();
			case Hardware_architecturePackage.HARDWARE_ARCHITECTURE__ELECTRICAL_SIGNALS:
				return electricalSignals != null && !electricalSignals.isEmpty();
			case Hardware_architecturePackage.HARDWARE_ARCHITECTURE__WIRES:
				return wires != null && !wires.isEmpty();
			case Hardware_architecturePackage.HARDWARE_ARCHITECTURE__DESIGN_ARCHITECTURE:
				return designArchitecture != null;
		}
		return super.eIsSet(featureID);
	}

} //HardwareArchitectureImpl
