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

import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ECU;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Memory;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.MemoryKind;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Memory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.MemoryImpl#getMemoryType <em>Memory Type</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.MemoryImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.MemoryImpl#getOwningECU <em>Owning ECU</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.MemoryImpl#getUsingProcessors <em>Using Processors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MemoryImpl extends HardwareEntityImpl implements Memory {
	/**
	 * The default value of the '{@link #getMemoryType() <em>Memory Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryType()
	 * @generated
	 * @ordered
	 */
	protected static final MemoryKind MEMORY_TYPE_EDEFAULT = MemoryKind.RAM;

	/**
	 * The cached value of the '{@link #getMemoryType() <em>Memory Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryType()
	 * @generated
	 * @ordered
	 */
	protected MemoryKind memoryType = MEMORY_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final int SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected int size = SIZE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUsingProcessors() <em>Using Processors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsingProcessors()
	 * @generated
	 * @ordered
	 */
	protected EList<Processor> usingProcessors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hardware_architecturePackage.Literals.MEMORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryKind getMemoryType() {
		return memoryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemoryType(MemoryKind newMemoryType) {
		MemoryKind oldMemoryType = memoryType;
		memoryType = newMemoryType == null ? MEMORY_TYPE_EDEFAULT : newMemoryType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hardware_architecturePackage.MEMORY__MEMORY_TYPE, oldMemoryType, memoryType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(int newSize) {
		int oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hardware_architecturePackage.MEMORY__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECU getOwningECU() {
		if (eContainerFeatureID() != Hardware_architecturePackage.MEMORY__OWNING_ECU) return null;
		return (ECU)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningECU(ECU newOwningECU, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningECU, Hardware_architecturePackage.MEMORY__OWNING_ECU, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningECU(ECU newOwningECU) {
		if (newOwningECU != eInternalContainer() || (eContainerFeatureID() != Hardware_architecturePackage.MEMORY__OWNING_ECU && newOwningECU != null)) {
			if (EcoreUtil.isAncestor(this, newOwningECU))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningECU != null)
				msgs = ((InternalEObject)newOwningECU).eInverseAdd(this, Hardware_architecturePackage.ECU__MEMORY, ECU.class, msgs);
			msgs = basicSetOwningECU(newOwningECU, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hardware_architecturePackage.MEMORY__OWNING_ECU, newOwningECU, newOwningECU));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Processor> getUsingProcessors() {
		if (usingProcessors == null) {
			usingProcessors = new EObjectWithInverseResolvingEList.ManyInverse<Processor>(Processor.class, this, Hardware_architecturePackage.MEMORY__USING_PROCESSORS, Hardware_architecturePackage.PROCESSOR__USED_MEMORY);
		}
		return usingProcessors;
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
			case Hardware_architecturePackage.MEMORY__OWNING_ECU:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningECU((ECU)otherEnd, msgs);
			case Hardware_architecturePackage.MEMORY__USING_PROCESSORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUsingProcessors()).basicAdd(otherEnd, msgs);
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
			case Hardware_architecturePackage.MEMORY__OWNING_ECU:
				return basicSetOwningECU(null, msgs);
			case Hardware_architecturePackage.MEMORY__USING_PROCESSORS:
				return ((InternalEList<?>)getUsingProcessors()).basicRemove(otherEnd, msgs);
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
			case Hardware_architecturePackage.MEMORY__OWNING_ECU:
				return eInternalContainer().eInverseRemove(this, Hardware_architecturePackage.ECU__MEMORY, ECU.class, msgs);
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
			case Hardware_architecturePackage.MEMORY__MEMORY_TYPE:
				return getMemoryType();
			case Hardware_architecturePackage.MEMORY__SIZE:
				return getSize();
			case Hardware_architecturePackage.MEMORY__OWNING_ECU:
				return getOwningECU();
			case Hardware_architecturePackage.MEMORY__USING_PROCESSORS:
				return getUsingProcessors();
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
			case Hardware_architecturePackage.MEMORY__MEMORY_TYPE:
				setMemoryType((MemoryKind)newValue);
				return;
			case Hardware_architecturePackage.MEMORY__SIZE:
				setSize((Integer)newValue);
				return;
			case Hardware_architecturePackage.MEMORY__OWNING_ECU:
				setOwningECU((ECU)newValue);
				return;
			case Hardware_architecturePackage.MEMORY__USING_PROCESSORS:
				getUsingProcessors().clear();
				getUsingProcessors().addAll((Collection<? extends Processor>)newValue);
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
			case Hardware_architecturePackage.MEMORY__MEMORY_TYPE:
				setMemoryType(MEMORY_TYPE_EDEFAULT);
				return;
			case Hardware_architecturePackage.MEMORY__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case Hardware_architecturePackage.MEMORY__OWNING_ECU:
				setOwningECU((ECU)null);
				return;
			case Hardware_architecturePackage.MEMORY__USING_PROCESSORS:
				getUsingProcessors().clear();
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
			case Hardware_architecturePackage.MEMORY__MEMORY_TYPE:
				return memoryType != MEMORY_TYPE_EDEFAULT;
			case Hardware_architecturePackage.MEMORY__SIZE:
				return size != SIZE_EDEFAULT;
			case Hardware_architecturePackage.MEMORY__OWNING_ECU:
				return getOwningECU() != null;
			case Hardware_architecturePackage.MEMORY__USING_PROCESSORS:
				return usingProcessors != null && !usingProcessors.isEmpty();
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
		result.append(" (memoryType: ");
		result.append(memoryType);
		result.append(", size: ");
		result.append(size);
		result.append(')');
		return result.toString();
	}

} //MemoryImpl
