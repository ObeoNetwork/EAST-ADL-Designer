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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.east_adl.structure.allocation_model.Allocation_modelPackage;
import org.obeonetwork.dsl.east_adl.structure.allocation_model.OSTask;

import org.obeonetwork.dsl.east_adl.structure.common.CommonPackage;
import org.obeonetwork.dsl.east_adl.structure.common.TypeAssociation;

import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ECU;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Memory;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Peripheral;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor;

import org.obeonetwork.dsl.east_adl.structure.platform_model.DeviceDriver;
import org.obeonetwork.dsl.east_adl.structure.platform_model.Framework;
import org.obeonetwork.dsl.east_adl.structure.platform_model.HardwareAbstractionFunction;
import org.obeonetwork.dsl.east_adl.structure.platform_model.IODriver;
import org.obeonetwork.dsl.east_adl.structure.platform_model.OperatingSystem;
import org.obeonetwork.dsl.east_adl.structure.platform_model.Platform_modelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Processor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.ProcessorImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.ProcessorImpl#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.ProcessorImpl#getFrequencyUnit <em>Frequency Unit</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.ProcessorImpl#getOwningECU <em>Owning ECU</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.ProcessorImpl#getUsedMemory <em>Used Memory</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.ProcessorImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.ProcessorImpl#getIODrivers <em>IO Drivers</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.ProcessorImpl#getDeviceDrivers <em>Device Drivers</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.ProcessorImpl#getFrameworks <em>Frameworks</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.ProcessorImpl#getOperatingSystems <em>Operating Systems</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.ProcessorImpl#getTypeAssociations <em>Type Associations</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.ProcessorImpl#getHardwareAbstractions <em>Hardware Abstractions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.ProcessorImpl#getPeripherals <em>Peripherals</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessorImpl extends HardwareEntityImpl implements Processor {
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
	 * The default value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final int FREQUENCY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected int frequency = FREQUENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getFrequencyUnit() <em>Frequency Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequencyUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String FREQUENCY_UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrequencyUnit() <em>Frequency Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequencyUnit()
	 * @generated
	 * @ordered
	 */
	protected String frequencyUnit = FREQUENCY_UNIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUsedMemory() <em>Used Memory</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedMemory()
	 * @generated
	 * @ordered
	 */
	protected EList<Memory> usedMemory;

	/**
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<OSTask> tasks;

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
	 * The cached value of the '{@link #getDeviceDrivers() <em>Device Drivers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceDrivers()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceDriver> deviceDrivers;

	/**
	 * The cached value of the '{@link #getFrameworks() <em>Frameworks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrameworks()
	 * @generated
	 * @ordered
	 */
	protected EList<Framework> frameworks;

	/**
	 * The cached value of the '{@link #getOperatingSystems() <em>Operating Systems</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatingSystems()
	 * @generated
	 * @ordered
	 */
	protected EList<OperatingSystem> operatingSystems;

	/**
	 * The cached value of the '{@link #getTypeAssociations() <em>Type Associations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAssociations()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> typeAssociations;

	/**
	 * The cached value of the '{@link #getHardwareAbstractions() <em>Hardware Abstractions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardwareAbstractions()
	 * @generated
	 * @ordered
	 */
	protected EList<HardwareAbstractionFunction> hardwareAbstractions;

	/**
	 * The cached value of the '{@link #getPeripherals() <em>Peripherals</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeripherals()
	 * @generated
	 * @ordered
	 */
	protected EList<Peripheral> peripherals;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hardware_architecturePackage.Literals.PROCESSOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hardware_architecturePackage.PROCESSOR__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFrequency() {
		return frequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrequency(int newFrequency) {
		int oldFrequency = frequency;
		frequency = newFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hardware_architecturePackage.PROCESSOR__FREQUENCY, oldFrequency, frequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFrequencyUnit() {
		return frequencyUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrequencyUnit(String newFrequencyUnit) {
		String oldFrequencyUnit = frequencyUnit;
		frequencyUnit = newFrequencyUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hardware_architecturePackage.PROCESSOR__FREQUENCY_UNIT, oldFrequencyUnit, frequencyUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECU getOwningECU() {
		if (eContainerFeatureID() != Hardware_architecturePackage.PROCESSOR__OWNING_ECU) return null;
		return (ECU)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningECU(ECU newOwningECU, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningECU, Hardware_architecturePackage.PROCESSOR__OWNING_ECU, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningECU(ECU newOwningECU) {
		if (newOwningECU != eInternalContainer() || (eContainerFeatureID() != Hardware_architecturePackage.PROCESSOR__OWNING_ECU && newOwningECU != null)) {
			if (EcoreUtil.isAncestor(this, newOwningECU))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningECU != null)
				msgs = ((InternalEObject)newOwningECU).eInverseAdd(this, Hardware_architecturePackage.ECU__PROCESSORS, ECU.class, msgs);
			msgs = basicSetOwningECU(newOwningECU, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hardware_architecturePackage.PROCESSOR__OWNING_ECU, newOwningECU, newOwningECU));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Memory> getUsedMemory() {
		if (usedMemory == null) {
			usedMemory = new EObjectWithInverseResolvingEList.ManyInverse<Memory>(Memory.class, this, Hardware_architecturePackage.PROCESSOR__USED_MEMORY, Hardware_architecturePackage.MEMORY__USING_PROCESSORS);
		}
		return usedMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OSTask> getTasks() {
		if (tasks == null) {
			tasks = new EObjectWithInverseResolvingEList<OSTask>(OSTask.class, this, Hardware_architecturePackage.PROCESSOR__TASKS, Allocation_modelPackage.OS_TASK__EXECUTING_PROCESSOR);
		}
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IODriver> getIODrivers() {
		if (ioDrivers == null) {
			ioDrivers = new EObjectWithInverseResolvingEList<IODriver>(IODriver.class, this, Hardware_architecturePackage.PROCESSOR__IO_DRIVERS, Platform_modelPackage.IO_DRIVER__PROCESSOR);
		}
		return ioDrivers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeviceDriver> getDeviceDrivers() {
		if (deviceDrivers == null) {
			deviceDrivers = new EObjectWithInverseResolvingEList<DeviceDriver>(DeviceDriver.class, this, Hardware_architecturePackage.PROCESSOR__DEVICE_DRIVERS, Platform_modelPackage.DEVICE_DRIVER__PROCESSOR);
		}
		return deviceDrivers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Framework> getFrameworks() {
		if (frameworks == null) {
			frameworks = new EObjectWithInverseResolvingEList<Framework>(Framework.class, this, Hardware_architecturePackage.PROCESSOR__FRAMEWORKS, Platform_modelPackage.FRAMEWORK__PROCESSOR);
		}
		return frameworks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperatingSystem> getOperatingSystems() {
		if (operatingSystems == null) {
			operatingSystems = new EObjectWithInverseResolvingEList<OperatingSystem>(OperatingSystem.class, this, Hardware_architecturePackage.PROCESSOR__OPERATING_SYSTEMS, Platform_modelPackage.OPERATING_SYSTEM__PROCESSOR);
		}
		return operatingSystems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getTypeAssociations() {
		if (typeAssociations == null) {
			typeAssociations = new EObjectWithInverseResolvingEList<TypeAssociation>(TypeAssociation.class, this, Hardware_architecturePackage.PROCESSOR__TYPE_ASSOCIATIONS, CommonPackage.TYPE_ASSOCIATION__PROCESSOR);
		}
		return typeAssociations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HardwareAbstractionFunction> getHardwareAbstractions() {
		if (hardwareAbstractions == null) {
			hardwareAbstractions = new EObjectWithInverseResolvingEList<HardwareAbstractionFunction>(HardwareAbstractionFunction.class, this, Hardware_architecturePackage.PROCESSOR__HARDWARE_ABSTRACTIONS, Platform_modelPackage.HARDWARE_ABSTRACTION_FUNCTION__PROCESSOR);
		}
		return hardwareAbstractions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Peripheral> getPeripherals() {
		if (peripherals == null) {
			peripherals = new EObjectWithInverseResolvingEList.ManyInverse<Peripheral>(Peripheral.class, this, Hardware_architecturePackage.PROCESSOR__PERIPHERALS, Hardware_architecturePackage.PERIPHERAL__PROCESSORS);
		}
		return peripherals;
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
			case Hardware_architecturePackage.PROCESSOR__OWNING_ECU:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningECU((ECU)otherEnd, msgs);
			case Hardware_architecturePackage.PROCESSOR__USED_MEMORY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUsedMemory()).basicAdd(otherEnd, msgs);
			case Hardware_architecturePackage.PROCESSOR__TASKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTasks()).basicAdd(otherEnd, msgs);
			case Hardware_architecturePackage.PROCESSOR__IO_DRIVERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIODrivers()).basicAdd(otherEnd, msgs);
			case Hardware_architecturePackage.PROCESSOR__DEVICE_DRIVERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDeviceDrivers()).basicAdd(otherEnd, msgs);
			case Hardware_architecturePackage.PROCESSOR__FRAMEWORKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFrameworks()).basicAdd(otherEnd, msgs);
			case Hardware_architecturePackage.PROCESSOR__OPERATING_SYSTEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOperatingSystems()).basicAdd(otherEnd, msgs);
			case Hardware_architecturePackage.PROCESSOR__TYPE_ASSOCIATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTypeAssociations()).basicAdd(otherEnd, msgs);
			case Hardware_architecturePackage.PROCESSOR__HARDWARE_ABSTRACTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHardwareAbstractions()).basicAdd(otherEnd, msgs);
			case Hardware_architecturePackage.PROCESSOR__PERIPHERALS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPeripherals()).basicAdd(otherEnd, msgs);
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
			case Hardware_architecturePackage.PROCESSOR__OWNING_ECU:
				return basicSetOwningECU(null, msgs);
			case Hardware_architecturePackage.PROCESSOR__USED_MEMORY:
				return ((InternalEList<?>)getUsedMemory()).basicRemove(otherEnd, msgs);
			case Hardware_architecturePackage.PROCESSOR__TASKS:
				return ((InternalEList<?>)getTasks()).basicRemove(otherEnd, msgs);
			case Hardware_architecturePackage.PROCESSOR__IO_DRIVERS:
				return ((InternalEList<?>)getIODrivers()).basicRemove(otherEnd, msgs);
			case Hardware_architecturePackage.PROCESSOR__DEVICE_DRIVERS:
				return ((InternalEList<?>)getDeviceDrivers()).basicRemove(otherEnd, msgs);
			case Hardware_architecturePackage.PROCESSOR__FRAMEWORKS:
				return ((InternalEList<?>)getFrameworks()).basicRemove(otherEnd, msgs);
			case Hardware_architecturePackage.PROCESSOR__OPERATING_SYSTEMS:
				return ((InternalEList<?>)getOperatingSystems()).basicRemove(otherEnd, msgs);
			case Hardware_architecturePackage.PROCESSOR__TYPE_ASSOCIATIONS:
				return ((InternalEList<?>)getTypeAssociations()).basicRemove(otherEnd, msgs);
			case Hardware_architecturePackage.PROCESSOR__HARDWARE_ABSTRACTIONS:
				return ((InternalEList<?>)getHardwareAbstractions()).basicRemove(otherEnd, msgs);
			case Hardware_architecturePackage.PROCESSOR__PERIPHERALS:
				return ((InternalEList<?>)getPeripherals()).basicRemove(otherEnd, msgs);
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
			case Hardware_architecturePackage.PROCESSOR__OWNING_ECU:
				return eInternalContainer().eInverseRemove(this, Hardware_architecturePackage.ECU__PROCESSORS, ECU.class, msgs);
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
			case Hardware_architecturePackage.PROCESSOR__TYPE:
				return getType();
			case Hardware_architecturePackage.PROCESSOR__FREQUENCY:
				return getFrequency();
			case Hardware_architecturePackage.PROCESSOR__FREQUENCY_UNIT:
				return getFrequencyUnit();
			case Hardware_architecturePackage.PROCESSOR__OWNING_ECU:
				return getOwningECU();
			case Hardware_architecturePackage.PROCESSOR__USED_MEMORY:
				return getUsedMemory();
			case Hardware_architecturePackage.PROCESSOR__TASKS:
				return getTasks();
			case Hardware_architecturePackage.PROCESSOR__IO_DRIVERS:
				return getIODrivers();
			case Hardware_architecturePackage.PROCESSOR__DEVICE_DRIVERS:
				return getDeviceDrivers();
			case Hardware_architecturePackage.PROCESSOR__FRAMEWORKS:
				return getFrameworks();
			case Hardware_architecturePackage.PROCESSOR__OPERATING_SYSTEMS:
				return getOperatingSystems();
			case Hardware_architecturePackage.PROCESSOR__TYPE_ASSOCIATIONS:
				return getTypeAssociations();
			case Hardware_architecturePackage.PROCESSOR__HARDWARE_ABSTRACTIONS:
				return getHardwareAbstractions();
			case Hardware_architecturePackage.PROCESSOR__PERIPHERALS:
				return getPeripherals();
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
			case Hardware_architecturePackage.PROCESSOR__TYPE:
				setType((String)newValue);
				return;
			case Hardware_architecturePackage.PROCESSOR__FREQUENCY:
				setFrequency((Integer)newValue);
				return;
			case Hardware_architecturePackage.PROCESSOR__FREQUENCY_UNIT:
				setFrequencyUnit((String)newValue);
				return;
			case Hardware_architecturePackage.PROCESSOR__OWNING_ECU:
				setOwningECU((ECU)newValue);
				return;
			case Hardware_architecturePackage.PROCESSOR__USED_MEMORY:
				getUsedMemory().clear();
				getUsedMemory().addAll((Collection<? extends Memory>)newValue);
				return;
			case Hardware_architecturePackage.PROCESSOR__TASKS:
				getTasks().clear();
				getTasks().addAll((Collection<? extends OSTask>)newValue);
				return;
			case Hardware_architecturePackage.PROCESSOR__IO_DRIVERS:
				getIODrivers().clear();
				getIODrivers().addAll((Collection<? extends IODriver>)newValue);
				return;
			case Hardware_architecturePackage.PROCESSOR__DEVICE_DRIVERS:
				getDeviceDrivers().clear();
				getDeviceDrivers().addAll((Collection<? extends DeviceDriver>)newValue);
				return;
			case Hardware_architecturePackage.PROCESSOR__FRAMEWORKS:
				getFrameworks().clear();
				getFrameworks().addAll((Collection<? extends Framework>)newValue);
				return;
			case Hardware_architecturePackage.PROCESSOR__OPERATING_SYSTEMS:
				getOperatingSystems().clear();
				getOperatingSystems().addAll((Collection<? extends OperatingSystem>)newValue);
				return;
			case Hardware_architecturePackage.PROCESSOR__TYPE_ASSOCIATIONS:
				getTypeAssociations().clear();
				getTypeAssociations().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case Hardware_architecturePackage.PROCESSOR__HARDWARE_ABSTRACTIONS:
				getHardwareAbstractions().clear();
				getHardwareAbstractions().addAll((Collection<? extends HardwareAbstractionFunction>)newValue);
				return;
			case Hardware_architecturePackage.PROCESSOR__PERIPHERALS:
				getPeripherals().clear();
				getPeripherals().addAll((Collection<? extends Peripheral>)newValue);
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
			case Hardware_architecturePackage.PROCESSOR__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case Hardware_architecturePackage.PROCESSOR__FREQUENCY:
				setFrequency(FREQUENCY_EDEFAULT);
				return;
			case Hardware_architecturePackage.PROCESSOR__FREQUENCY_UNIT:
				setFrequencyUnit(FREQUENCY_UNIT_EDEFAULT);
				return;
			case Hardware_architecturePackage.PROCESSOR__OWNING_ECU:
				setOwningECU((ECU)null);
				return;
			case Hardware_architecturePackage.PROCESSOR__USED_MEMORY:
				getUsedMemory().clear();
				return;
			case Hardware_architecturePackage.PROCESSOR__TASKS:
				getTasks().clear();
				return;
			case Hardware_architecturePackage.PROCESSOR__IO_DRIVERS:
				getIODrivers().clear();
				return;
			case Hardware_architecturePackage.PROCESSOR__DEVICE_DRIVERS:
				getDeviceDrivers().clear();
				return;
			case Hardware_architecturePackage.PROCESSOR__FRAMEWORKS:
				getFrameworks().clear();
				return;
			case Hardware_architecturePackage.PROCESSOR__OPERATING_SYSTEMS:
				getOperatingSystems().clear();
				return;
			case Hardware_architecturePackage.PROCESSOR__TYPE_ASSOCIATIONS:
				getTypeAssociations().clear();
				return;
			case Hardware_architecturePackage.PROCESSOR__HARDWARE_ABSTRACTIONS:
				getHardwareAbstractions().clear();
				return;
			case Hardware_architecturePackage.PROCESSOR__PERIPHERALS:
				getPeripherals().clear();
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
			case Hardware_architecturePackage.PROCESSOR__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case Hardware_architecturePackage.PROCESSOR__FREQUENCY:
				return frequency != FREQUENCY_EDEFAULT;
			case Hardware_architecturePackage.PROCESSOR__FREQUENCY_UNIT:
				return FREQUENCY_UNIT_EDEFAULT == null ? frequencyUnit != null : !FREQUENCY_UNIT_EDEFAULT.equals(frequencyUnit);
			case Hardware_architecturePackage.PROCESSOR__OWNING_ECU:
				return getOwningECU() != null;
			case Hardware_architecturePackage.PROCESSOR__USED_MEMORY:
				return usedMemory != null && !usedMemory.isEmpty();
			case Hardware_architecturePackage.PROCESSOR__TASKS:
				return tasks != null && !tasks.isEmpty();
			case Hardware_architecturePackage.PROCESSOR__IO_DRIVERS:
				return ioDrivers != null && !ioDrivers.isEmpty();
			case Hardware_architecturePackage.PROCESSOR__DEVICE_DRIVERS:
				return deviceDrivers != null && !deviceDrivers.isEmpty();
			case Hardware_architecturePackage.PROCESSOR__FRAMEWORKS:
				return frameworks != null && !frameworks.isEmpty();
			case Hardware_architecturePackage.PROCESSOR__OPERATING_SYSTEMS:
				return operatingSystems != null && !operatingSystems.isEmpty();
			case Hardware_architecturePackage.PROCESSOR__TYPE_ASSOCIATIONS:
				return typeAssociations != null && !typeAssociations.isEmpty();
			case Hardware_architecturePackage.PROCESSOR__HARDWARE_ABSTRACTIONS:
				return hardwareAbstractions != null && !hardwareAbstractions.isEmpty();
			case Hardware_architecturePackage.PROCESSOR__PERIPHERALS:
				return peripherals != null && !peripherals.isEmpty();
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
		result.append(", frequency: ");
		result.append(frequency);
		result.append(", frequencyUnit: ");
		result.append(frequencyUnit);
		result.append(')');
		return result.toString();
	}

} //ProcessorImpl
