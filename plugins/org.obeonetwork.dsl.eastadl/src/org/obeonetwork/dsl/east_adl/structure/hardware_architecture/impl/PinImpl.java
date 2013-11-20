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
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.east_adl.core.impl.EASTADLEntityImpl;

import org.obeonetwork.dsl.east_adl.structure.common.DirectionKind;

import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ElectricalSignal;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.HardwareEntity;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Pin;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Wire;

import org.obeonetwork.dsl.east_adl.structure.platform_model.HardwareAbstractionFunction;
import org.obeonetwork.dsl.east_adl.structure.platform_model.Platform_modelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.PinImpl#getOutgoingWires <em>Outgoing Wires</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.PinImpl#getIncomingWires <em>Incoming Wires</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.PinImpl#getPhysicalMeaning <em>Physical Meaning</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.PinImpl#getDirectionType <em>Direction Type</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.PinImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.PinImpl#getOwningHardware <em>Owning Hardware</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.PinImpl#getAbstractInterfaces <em>Abstract Interfaces</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PinImpl extends EASTADLEntityImpl implements Pin {
	/**
	 * The cached value of the '{@link #getOutgoingWires() <em>Outgoing Wires</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingWires()
	 * @generated
	 * @ordered
	 */
	protected EList<Wire> outgoingWires;

	/**
	 * The cached value of the '{@link #getIncomingWires() <em>Incoming Wires</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingWires()
	 * @generated
	 * @ordered
	 */
	protected EList<Wire> incomingWires;

	/**
	 * The default value of the '{@link #getPhysicalMeaning() <em>Physical Meaning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalMeaning()
	 * @generated
	 * @ordered
	 */
	protected static final String PHYSICAL_MEANING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhysicalMeaning() <em>Physical Meaning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalMeaning()
	 * @generated
	 * @ordered
	 */
	protected String physicalMeaning = PHYSICAL_MEANING_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirectionType() <em>Direction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectionType()
	 * @generated
	 * @ordered
	 */
	protected static final DirectionKind DIRECTION_TYPE_EDEFAULT = DirectionKind.IN;

	/**
	 * The cached value of the '{@link #getDirectionType() <em>Direction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectionType()
	 * @generated
	 * @ordered
	 */
	protected DirectionKind directionType = DIRECTION_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ElectricalSignal type;

	/**
	 * The cached value of the '{@link #getAbstractInterfaces() <em>Abstract Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<HardwareAbstractionFunction> abstractInterfaces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PinImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hardware_architecturePackage.Literals.PIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Wire> getOutgoingWires() {
		if (outgoingWires == null) {
			outgoingWires = new EObjectWithInverseResolvingEList<Wire>(Wire.class, this, Hardware_architecturePackage.PIN__OUTGOING_WIRES, Hardware_architecturePackage.WIRE__SOURCE);
		}
		return outgoingWires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Wire> getIncomingWires() {
		if (incomingWires == null) {
			incomingWires = new EObjectWithInverseResolvingEList<Wire>(Wire.class, this, Hardware_architecturePackage.PIN__INCOMING_WIRES, Hardware_architecturePackage.WIRE__DESTINATION);
		}
		return incomingWires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhysicalMeaning() {
		return physicalMeaning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhysicalMeaning(String newPhysicalMeaning) {
		String oldPhysicalMeaning = physicalMeaning;
		physicalMeaning = newPhysicalMeaning;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hardware_architecturePackage.PIN__PHYSICAL_MEANING, oldPhysicalMeaning, physicalMeaning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectionKind getDirectionType() {
		return directionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirectionType(DirectionKind newDirectionType) {
		DirectionKind oldDirectionType = directionType;
		directionType = newDirectionType == null ? DIRECTION_TYPE_EDEFAULT : newDirectionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hardware_architecturePackage.PIN__DIRECTION_TYPE, oldDirectionType, directionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectricalSignal getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (ElectricalSignal)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hardware_architecturePackage.PIN__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectricalSignal basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(ElectricalSignal newType, NotificationChain msgs) {
		ElectricalSignal oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Hardware_architecturePackage.PIN__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ElectricalSignal newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, Hardware_architecturePackage.ELECTRICAL_SIGNAL__TYPED_PINS, ElectricalSignal.class, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, Hardware_architecturePackage.ELECTRICAL_SIGNAL__TYPED_PINS, ElectricalSignal.class, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hardware_architecturePackage.PIN__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareEntity getOwningHardware() {
		HardwareEntity owningHardware = basicGetOwningHardware();
		return owningHardware != null && owningHardware.eIsProxy() ? (HardwareEntity)eResolveProxy((InternalEObject)owningHardware) : owningHardware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareEntity basicGetOwningHardware() {
		// TODO: implement this method to return the 'Owning Hardware' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HardwareAbstractionFunction> getAbstractInterfaces() {
		if (abstractInterfaces == null) {
			abstractInterfaces = new EObjectWithInverseResolvingEList.ManyInverse<HardwareAbstractionFunction>(HardwareAbstractionFunction.class, this, Hardware_architecturePackage.PIN__ABSTRACT_INTERFACES, Platform_modelPackage.HARDWARE_ABSTRACTION_FUNCTION__ACCESSIBLE_PINS);
		}
		return abstractInterfaces;
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
			case Hardware_architecturePackage.PIN__OUTGOING_WIRES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingWires()).basicAdd(otherEnd, msgs);
			case Hardware_architecturePackage.PIN__INCOMING_WIRES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingWires()).basicAdd(otherEnd, msgs);
			case Hardware_architecturePackage.PIN__TYPE:
				if (type != null)
					msgs = ((InternalEObject)type).eInverseRemove(this, Hardware_architecturePackage.ELECTRICAL_SIGNAL__TYPED_PINS, ElectricalSignal.class, msgs);
				return basicSetType((ElectricalSignal)otherEnd, msgs);
			case Hardware_architecturePackage.PIN__ABSTRACT_INTERFACES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAbstractInterfaces()).basicAdd(otherEnd, msgs);
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
			case Hardware_architecturePackage.PIN__OUTGOING_WIRES:
				return ((InternalEList<?>)getOutgoingWires()).basicRemove(otherEnd, msgs);
			case Hardware_architecturePackage.PIN__INCOMING_WIRES:
				return ((InternalEList<?>)getIncomingWires()).basicRemove(otherEnd, msgs);
			case Hardware_architecturePackage.PIN__TYPE:
				return basicSetType(null, msgs);
			case Hardware_architecturePackage.PIN__ABSTRACT_INTERFACES:
				return ((InternalEList<?>)getAbstractInterfaces()).basicRemove(otherEnd, msgs);
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
			case Hardware_architecturePackage.PIN__OUTGOING_WIRES:
				return getOutgoingWires();
			case Hardware_architecturePackage.PIN__INCOMING_WIRES:
				return getIncomingWires();
			case Hardware_architecturePackage.PIN__PHYSICAL_MEANING:
				return getPhysicalMeaning();
			case Hardware_architecturePackage.PIN__DIRECTION_TYPE:
				return getDirectionType();
			case Hardware_architecturePackage.PIN__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case Hardware_architecturePackage.PIN__OWNING_HARDWARE:
				if (resolve) return getOwningHardware();
				return basicGetOwningHardware();
			case Hardware_architecturePackage.PIN__ABSTRACT_INTERFACES:
				return getAbstractInterfaces();
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
			case Hardware_architecturePackage.PIN__OUTGOING_WIRES:
				getOutgoingWires().clear();
				getOutgoingWires().addAll((Collection<? extends Wire>)newValue);
				return;
			case Hardware_architecturePackage.PIN__INCOMING_WIRES:
				getIncomingWires().clear();
				getIncomingWires().addAll((Collection<? extends Wire>)newValue);
				return;
			case Hardware_architecturePackage.PIN__PHYSICAL_MEANING:
				setPhysicalMeaning((String)newValue);
				return;
			case Hardware_architecturePackage.PIN__DIRECTION_TYPE:
				setDirectionType((DirectionKind)newValue);
				return;
			case Hardware_architecturePackage.PIN__TYPE:
				setType((ElectricalSignal)newValue);
				return;
			case Hardware_architecturePackage.PIN__ABSTRACT_INTERFACES:
				getAbstractInterfaces().clear();
				getAbstractInterfaces().addAll((Collection<? extends HardwareAbstractionFunction>)newValue);
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
			case Hardware_architecturePackage.PIN__OUTGOING_WIRES:
				getOutgoingWires().clear();
				return;
			case Hardware_architecturePackage.PIN__INCOMING_WIRES:
				getIncomingWires().clear();
				return;
			case Hardware_architecturePackage.PIN__PHYSICAL_MEANING:
				setPhysicalMeaning(PHYSICAL_MEANING_EDEFAULT);
				return;
			case Hardware_architecturePackage.PIN__DIRECTION_TYPE:
				setDirectionType(DIRECTION_TYPE_EDEFAULT);
				return;
			case Hardware_architecturePackage.PIN__TYPE:
				setType((ElectricalSignal)null);
				return;
			case Hardware_architecturePackage.PIN__ABSTRACT_INTERFACES:
				getAbstractInterfaces().clear();
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
			case Hardware_architecturePackage.PIN__OUTGOING_WIRES:
				return outgoingWires != null && !outgoingWires.isEmpty();
			case Hardware_architecturePackage.PIN__INCOMING_WIRES:
				return incomingWires != null && !incomingWires.isEmpty();
			case Hardware_architecturePackage.PIN__PHYSICAL_MEANING:
				return PHYSICAL_MEANING_EDEFAULT == null ? physicalMeaning != null : !PHYSICAL_MEANING_EDEFAULT.equals(physicalMeaning);
			case Hardware_architecturePackage.PIN__DIRECTION_TYPE:
				return directionType != DIRECTION_TYPE_EDEFAULT;
			case Hardware_architecturePackage.PIN__TYPE:
				return type != null;
			case Hardware_architecturePackage.PIN__OWNING_HARDWARE:
				return basicGetOwningHardware() != null;
			case Hardware_architecturePackage.PIN__ABSTRACT_INTERFACES:
				return abstractInterfaces != null && !abstractInterfaces.isEmpty();
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
		result.append(" (physicalMeaning: ");
		result.append(physicalMeaning);
		result.append(", directionType: ");
		result.append(directionType);
		result.append(')');
		return result.toString();
	}

} //PinImpl
