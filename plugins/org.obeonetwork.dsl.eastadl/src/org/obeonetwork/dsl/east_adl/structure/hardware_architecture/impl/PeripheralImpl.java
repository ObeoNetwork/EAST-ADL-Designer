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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ECU;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Peripheral;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Pin;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor;

import org.obeonetwork.dsl.east_adl.structure.platform_model.DeviceDriver;
import org.obeonetwork.dsl.east_adl.structure.platform_model.IODriver;
import org.obeonetwork.dsl.east_adl.structure.platform_model.Platform_modelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Peripheral</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.PeripheralImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.PeripheralImpl#getOwningECU <em>Owning ECU</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.PeripheralImpl#getPins <em>Pins</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.PeripheralImpl#getDeviceDrivers <em>Device Drivers</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.PeripheralImpl#getIODrivers <em>IO Drivers</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.PeripheralImpl#getProcessors <em>Processors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PeripheralImpl extends HardwareEntityImpl implements Peripheral {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPins() <em>Pins</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPins()
	 * @generated
	 * @ordered
	 */
	protected EList<Pin> pins;

	/**
	 * The cached value of the '{@link #getDeviceDrivers() <em>Device Drivers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceDrivers()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceDriver> deviceDrivers;

	/**
	 * The cached value of the '{@link #getIODrivers() <em>IO Drivers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIODrivers()
	 * @generated
	 * @ordered
	 */
	protected EList<IODriver> ioDrivers;

	/**
	 * The cached value of the '{@link #getProcessors() <em>Processors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessors()
	 * @generated
	 * @ordered
	 */
	protected EList<Processor> processors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PeripheralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hardware_architecturePackage.Literals.PERIPHERAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hardware_architecturePackage.PERIPHERAL__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECU getOwningECU() {
		if (eContainerFeatureID() != Hardware_architecturePackage.PERIPHERAL__OWNING_ECU) return null;
		return (ECU)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningECU(ECU newOwningECU, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningECU, Hardware_architecturePackage.PERIPHERAL__OWNING_ECU, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningECU(ECU newOwningECU) {
		if (newOwningECU != eInternalContainer() || (eContainerFeatureID() != Hardware_architecturePackage.PERIPHERAL__OWNING_ECU && newOwningECU != null)) {
			if (EcoreUtil.isAncestor(this, newOwningECU))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningECU != null)
				msgs = ((InternalEObject)newOwningECU).eInverseAdd(this, Hardware_architecturePackage.ECU__PERIPHERALS, ECU.class, msgs);
			msgs = basicSetOwningECU(newOwningECU, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hardware_architecturePackage.PERIPHERAL__OWNING_ECU, newOwningECU, newOwningECU));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pin> getPins() {
		if (pins == null) {
			pins = new EObjectContainmentEList<Pin>(Pin.class, this, Hardware_architecturePackage.PERIPHERAL__PINS);
		}
		return pins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeviceDriver> getDeviceDrivers() {
		if (deviceDrivers == null) {
			deviceDrivers = new EObjectWithInverseResolvingEList<DeviceDriver>(DeviceDriver.class, this, Hardware_architecturePackage.PERIPHERAL__DEVICE_DRIVERS, Platform_modelPackage.DEVICE_DRIVER__PERIPHERAL);
		}
		return deviceDrivers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IODriver> getIODrivers() {
		if (ioDrivers == null) {
			ioDrivers = new EObjectWithInverseResolvingEList<IODriver>(IODriver.class, this, Hardware_architecturePackage.PERIPHERAL__IO_DRIVERS, Platform_modelPackage.IO_DRIVER__PERIPHERAL);
		}
		return ioDrivers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Processor> getProcessors() {
		if (processors == null) {
			processors = new EObjectWithInverseResolvingEList.ManyInverse<Processor>(Processor.class, this, Hardware_architecturePackage.PERIPHERAL__PROCESSORS, Hardware_architecturePackage.PROCESSOR__PERIPHERALS);
		}
		return processors;
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
			case Hardware_architecturePackage.PERIPHERAL__OWNING_ECU:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningECU((ECU)otherEnd, msgs);
			case Hardware_architecturePackage.PERIPHERAL__DEVICE_DRIVERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDeviceDrivers()).basicAdd(otherEnd, msgs);
			case Hardware_architecturePackage.PERIPHERAL__IO_DRIVERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIODrivers()).basicAdd(otherEnd, msgs);
			case Hardware_architecturePackage.PERIPHERAL__PROCESSORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProcessors()).basicAdd(otherEnd, msgs);
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
			case Hardware_architecturePackage.PERIPHERAL__OWNING_ECU:
				return basicSetOwningECU(null, msgs);
			case Hardware_architecturePackage.PERIPHERAL__PINS:
				return ((InternalEList<?>)getPins()).basicRemove(otherEnd, msgs);
			case Hardware_architecturePackage.PERIPHERAL__DEVICE_DRIVERS:
				return ((InternalEList<?>)getDeviceDrivers()).basicRemove(otherEnd, msgs);
			case Hardware_architecturePackage.PERIPHERAL__IO_DRIVERS:
				return ((InternalEList<?>)getIODrivers()).basicRemove(otherEnd, msgs);
			case Hardware_architecturePackage.PERIPHERAL__PROCESSORS:
				return ((InternalEList<?>)getProcessors()).basicRemove(otherEnd, msgs);
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
			case Hardware_architecturePackage.PERIPHERAL__OWNING_ECU:
				return eInternalContainer().eInverseRemove(this, Hardware_architecturePackage.ECU__PERIPHERALS, ECU.class, msgs);
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
			case Hardware_architecturePackage.PERIPHERAL__TYPE:
				return getType();
			case Hardware_architecturePackage.PERIPHERAL__OWNING_ECU:
				return getOwningECU();
			case Hardware_architecturePackage.PERIPHERAL__PINS:
				return getPins();
			case Hardware_architecturePackage.PERIPHERAL__DEVICE_DRIVERS:
				return getDeviceDrivers();
			case Hardware_architecturePackage.PERIPHERAL__IO_DRIVERS:
				return getIODrivers();
			case Hardware_architecturePackage.PERIPHERAL__PROCESSORS:
				return getProcessors();
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
			case Hardware_architecturePackage.PERIPHERAL__TYPE:
				setType((String)newValue);
				return;
			case Hardware_architecturePackage.PERIPHERAL__OWNING_ECU:
				setOwningECU((ECU)newValue);
				return;
			case Hardware_architecturePackage.PERIPHERAL__PINS:
				getPins().clear();
				getPins().addAll((Collection<? extends Pin>)newValue);
				return;
			case Hardware_architecturePackage.PERIPHERAL__DEVICE_DRIVERS:
				getDeviceDrivers().clear();
				getDeviceDrivers().addAll((Collection<? extends DeviceDriver>)newValue);
				return;
			case Hardware_architecturePackage.PERIPHERAL__IO_DRIVERS:
				getIODrivers().clear();
				getIODrivers().addAll((Collection<? extends IODriver>)newValue);
				return;
			case Hardware_architecturePackage.PERIPHERAL__PROCESSORS:
				getProcessors().clear();
				getProcessors().addAll((Collection<? extends Processor>)newValue);
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
			case Hardware_architecturePackage.PERIPHERAL__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case Hardware_architecturePackage.PERIPHERAL__OWNING_ECU:
				setOwningECU((ECU)null);
				return;
			case Hardware_architecturePackage.PERIPHERAL__PINS:
				getPins().clear();
				return;
			case Hardware_architecturePackage.PERIPHERAL__DEVICE_DRIVERS:
				getDeviceDrivers().clear();
				return;
			case Hardware_architecturePackage.PERIPHERAL__IO_DRIVERS:
				getIODrivers().clear();
				return;
			case Hardware_architecturePackage.PERIPHERAL__PROCESSORS:
				getProcessors().clear();
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
			case Hardware_architecturePackage.PERIPHERAL__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case Hardware_architecturePackage.PERIPHERAL__OWNING_ECU:
				return getOwningECU() != null;
			case Hardware_architecturePackage.PERIPHERAL__PINS:
				return pins != null && !pins.isEmpty();
			case Hardware_architecturePackage.PERIPHERAL__DEVICE_DRIVERS:
				return deviceDrivers != null && !deviceDrivers.isEmpty();
			case Hardware_architecturePackage.PERIPHERAL__IO_DRIVERS:
				return ioDrivers != null && !ioDrivers.isEmpty();
			case Hardware_architecturePackage.PERIPHERAL__PROCESSORS:
				return processors != null && !processors.isEmpty();
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //PeripheralImpl
