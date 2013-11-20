/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.east_adl.structure.common.AllocatableEntity;
import org.obeonetwork.dsl.east_adl.structure.common.AllocationConstraint;
import org.obeonetwork.dsl.east_adl.structure.common.CommonPackage;

import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Channel;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ECU;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Memory;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Peripheral;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Pin;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ECU</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.ECUImpl#getProcessors <em>Processors</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.ECUImpl#getMemory <em>Memory</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.ECUImpl#getChannels <em>Channels</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.ECUImpl#getPeripherals <em>Peripherals</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.ECUImpl#getPins <em>Pins</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.ECUImpl#getAllocations <em>Allocations</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.ECUImpl#getAllocatedEntities <em>Allocated Entities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ECUImpl extends HardwareEntityImpl implements ECU {
	/**
	 * The cached value of the '{@link #getProcessors() <em>Processors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessors()
	 * @generated
	 * @ordered
	 */
	protected EList<Processor> processors;

	/**
	 * The cached value of the '{@link #getMemory() <em>Memory</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory()
	 * @generated
	 * @ordered
	 */
	protected EList<Memory> memory;

	/**
	 * The cached value of the '{@link #getChannels() <em>Channels</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannels()
	 * @generated
	 * @ordered
	 */
	protected EList<Channel> channels;

	/**
	 * The cached value of the '{@link #getPeripherals() <em>Peripherals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeripherals()
	 * @generated
	 * @ordered
	 */
	protected EList<Peripheral> peripherals;

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
	 * The cached value of the '{@link #getAllocations() <em>Allocations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocations()
	 * @generated
	 * @ordered
	 */
	protected EList<AllocationConstraint> allocations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ECUImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hardware_architecturePackage.Literals.ECU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Processor> getProcessors() {
		if (processors == null) {
			processors = new EObjectContainmentWithInverseEList<Processor>(Processor.class, this, Hardware_architecturePackage.ECU__PROCESSORS, Hardware_architecturePackage.PROCESSOR__OWNING_ECU);
		}
		return processors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Memory> getMemory() {
		if (memory == null) {
			memory = new EObjectContainmentWithInverseEList<Memory>(Memory.class, this, Hardware_architecturePackage.ECU__MEMORY, Hardware_architecturePackage.MEMORY__OWNING_ECU);
		}
		return memory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Channel> getChannels() {
		if (channels == null) {
			channels = new EObjectWithInverseResolvingEList.ManyInverse<Channel>(Channel.class, this, Hardware_architecturePackage.ECU__CHANNELS, Hardware_architecturePackage.CHANNEL__CONNECTED_EC_US);
		}
		return channels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Peripheral> getPeripherals() {
		if (peripherals == null) {
			peripherals = new EObjectContainmentWithInverseEList<Peripheral>(Peripheral.class, this, Hardware_architecturePackage.ECU__PERIPHERALS, Hardware_architecturePackage.PERIPHERAL__OWNING_ECU);
		}
		return peripherals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pin> getPins() {
		if (pins == null) {
			pins = new EObjectContainmentEList<Pin>(Pin.class, this, Hardware_architecturePackage.ECU__PINS);
		}
		return pins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AllocationConstraint> getAllocations() {
		if (allocations == null) {
			allocations = new EObjectWithInverseResolvingEList<AllocationConstraint>(AllocationConstraint.class, this, Hardware_architecturePackage.ECU__ALLOCATIONS, CommonPackage.ALLOCATION_CONSTRAINT__TARGET);
		}
		return allocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AllocatableEntity> getAllocatedEntities() {
		// TODO: implement this method to return the 'Allocated Entities' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
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
			case Hardware_architecturePackage.ECU__PROCESSORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProcessors()).basicAdd(otherEnd, msgs);
			case Hardware_architecturePackage.ECU__MEMORY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMemory()).basicAdd(otherEnd, msgs);
			case Hardware_architecturePackage.ECU__CHANNELS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChannels()).basicAdd(otherEnd, msgs);
			case Hardware_architecturePackage.ECU__PERIPHERALS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPeripherals()).basicAdd(otherEnd, msgs);
			case Hardware_architecturePackage.ECU__ALLOCATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAllocations()).basicAdd(otherEnd, msgs);
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
			case Hardware_architecturePackage.ECU__PROCESSORS:
				return ((InternalEList<?>)getProcessors()).basicRemove(otherEnd, msgs);
			case Hardware_architecturePackage.ECU__MEMORY:
				return ((InternalEList<?>)getMemory()).basicRemove(otherEnd, msgs);
			case Hardware_architecturePackage.ECU__CHANNELS:
				return ((InternalEList<?>)getChannels()).basicRemove(otherEnd, msgs);
			case Hardware_architecturePackage.ECU__PERIPHERALS:
				return ((InternalEList<?>)getPeripherals()).basicRemove(otherEnd, msgs);
			case Hardware_architecturePackage.ECU__PINS:
				return ((InternalEList<?>)getPins()).basicRemove(otherEnd, msgs);
			case Hardware_architecturePackage.ECU__ALLOCATIONS:
				return ((InternalEList<?>)getAllocations()).basicRemove(otherEnd, msgs);
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
			case Hardware_architecturePackage.ECU__PROCESSORS:
				return getProcessors();
			case Hardware_architecturePackage.ECU__MEMORY:
				return getMemory();
			case Hardware_architecturePackage.ECU__CHANNELS:
				return getChannels();
			case Hardware_architecturePackage.ECU__PERIPHERALS:
				return getPeripherals();
			case Hardware_architecturePackage.ECU__PINS:
				return getPins();
			case Hardware_architecturePackage.ECU__ALLOCATIONS:
				return getAllocations();
			case Hardware_architecturePackage.ECU__ALLOCATED_ENTITIES:
				return getAllocatedEntities();
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
			case Hardware_architecturePackage.ECU__PROCESSORS:
				getProcessors().clear();
				getProcessors().addAll((Collection<? extends Processor>)newValue);
				return;
			case Hardware_architecturePackage.ECU__MEMORY:
				getMemory().clear();
				getMemory().addAll((Collection<? extends Memory>)newValue);
				return;
			case Hardware_architecturePackage.ECU__CHANNELS:
				getChannels().clear();
				getChannels().addAll((Collection<? extends Channel>)newValue);
				return;
			case Hardware_architecturePackage.ECU__PERIPHERALS:
				getPeripherals().clear();
				getPeripherals().addAll((Collection<? extends Peripheral>)newValue);
				return;
			case Hardware_architecturePackage.ECU__PINS:
				getPins().clear();
				getPins().addAll((Collection<? extends Pin>)newValue);
				return;
			case Hardware_architecturePackage.ECU__ALLOCATIONS:
				getAllocations().clear();
				getAllocations().addAll((Collection<? extends AllocationConstraint>)newValue);
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
			case Hardware_architecturePackage.ECU__PROCESSORS:
				getProcessors().clear();
				return;
			case Hardware_architecturePackage.ECU__MEMORY:
				getMemory().clear();
				return;
			case Hardware_architecturePackage.ECU__CHANNELS:
				getChannels().clear();
				return;
			case Hardware_architecturePackage.ECU__PERIPHERALS:
				getPeripherals().clear();
				return;
			case Hardware_architecturePackage.ECU__PINS:
				getPins().clear();
				return;
			case Hardware_architecturePackage.ECU__ALLOCATIONS:
				getAllocations().clear();
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
			case Hardware_architecturePackage.ECU__PROCESSORS:
				return processors != null && !processors.isEmpty();
			case Hardware_architecturePackage.ECU__MEMORY:
				return memory != null && !memory.isEmpty();
			case Hardware_architecturePackage.ECU__CHANNELS:
				return channels != null && !channels.isEmpty();
			case Hardware_architecturePackage.ECU__PERIPHERALS:
				return peripherals != null && !peripherals.isEmpty();
			case Hardware_architecturePackage.ECU__PINS:
				return pins != null && !pins.isEmpty();
			case Hardware_architecturePackage.ECU__ALLOCATIONS:
				return allocations != null && !allocations.isEmpty();
			case Hardware_architecturePackage.ECU__ALLOCATED_ENTITIES:
				return !getAllocatedEntities().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ECUImpl
