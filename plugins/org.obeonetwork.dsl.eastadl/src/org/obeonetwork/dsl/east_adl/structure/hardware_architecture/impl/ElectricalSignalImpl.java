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

import org.obeonetwork.dsl.east_adl.core.impl.EASTADLEntityImpl;

import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ElectricalSignal;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.HardwareArchitecture;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Pin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Electrical Signal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.ElectricalSignalImpl#getMinimumVoltage <em>Minimum Voltage</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.ElectricalSignalImpl#getMaximumVoltage <em>Maximum Voltage</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.ElectricalSignalImpl#getTypedPins <em>Typed Pins</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.ElectricalSignalImpl#getOwningArtifact <em>Owning Artifact</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElectricalSignalImpl extends EASTADLEntityImpl implements ElectricalSignal {
	/**
	 * The default value of the '{@link #getMinimumVoltage() <em>Minimum Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumVoltage()
	 * @generated
	 * @ordered
	 */
	protected static final double MINIMUM_VOLTAGE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinimumVoltage() <em>Minimum Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumVoltage()
	 * @generated
	 * @ordered
	 */
	protected double minimumVoltage = MINIMUM_VOLTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumVoltage() <em>Maximum Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumVoltage()
	 * @generated
	 * @ordered
	 */
	protected static final double MAXIMUM_VOLTAGE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaximumVoltage() <em>Maximum Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumVoltage()
	 * @generated
	 * @ordered
	 */
	protected double maximumVoltage = MAXIMUM_VOLTAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTypedPins() <em>Typed Pins</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypedPins()
	 * @generated
	 * @ordered
	 */
	protected EList<Pin> typedPins;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElectricalSignalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hardware_architecturePackage.Literals.ELECTRICAL_SIGNAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinimumVoltage() {
		return minimumVoltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumVoltage(double newMinimumVoltage) {
		double oldMinimumVoltage = minimumVoltage;
		minimumVoltage = newMinimumVoltage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hardware_architecturePackage.ELECTRICAL_SIGNAL__MINIMUM_VOLTAGE, oldMinimumVoltage, minimumVoltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaximumVoltage() {
		return maximumVoltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumVoltage(double newMaximumVoltage) {
		double oldMaximumVoltage = maximumVoltage;
		maximumVoltage = newMaximumVoltage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hardware_architecturePackage.ELECTRICAL_SIGNAL__MAXIMUM_VOLTAGE, oldMaximumVoltage, maximumVoltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pin> getTypedPins() {
		if (typedPins == null) {
			typedPins = new EObjectWithInverseResolvingEList<Pin>(Pin.class, this, Hardware_architecturePackage.ELECTRICAL_SIGNAL__TYPED_PINS, Hardware_architecturePackage.PIN__TYPE);
		}
		return typedPins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareArchitecture getOwningArtifact() {
		if (eContainerFeatureID() != Hardware_architecturePackage.ELECTRICAL_SIGNAL__OWNING_ARTIFACT) return null;
		return (HardwareArchitecture)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningArtifact(HardwareArchitecture newOwningArtifact, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningArtifact, Hardware_architecturePackage.ELECTRICAL_SIGNAL__OWNING_ARTIFACT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningArtifact(HardwareArchitecture newOwningArtifact) {
		if (newOwningArtifact != eInternalContainer() || (eContainerFeatureID() != Hardware_architecturePackage.ELECTRICAL_SIGNAL__OWNING_ARTIFACT && newOwningArtifact != null)) {
			if (EcoreUtil.isAncestor(this, newOwningArtifact))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningArtifact != null)
				msgs = ((InternalEObject)newOwningArtifact).eInverseAdd(this, Hardware_architecturePackage.HARDWARE_ARCHITECTURE__ELECTRICAL_SIGNALS, HardwareArchitecture.class, msgs);
			msgs = basicSetOwningArtifact(newOwningArtifact, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hardware_architecturePackage.ELECTRICAL_SIGNAL__OWNING_ARTIFACT, newOwningArtifact, newOwningArtifact));
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
			case Hardware_architecturePackage.ELECTRICAL_SIGNAL__TYPED_PINS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTypedPins()).basicAdd(otherEnd, msgs);
			case Hardware_architecturePackage.ELECTRICAL_SIGNAL__OWNING_ARTIFACT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningArtifact((HardwareArchitecture)otherEnd, msgs);
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
			case Hardware_architecturePackage.ELECTRICAL_SIGNAL__TYPED_PINS:
				return ((InternalEList<?>)getTypedPins()).basicRemove(otherEnd, msgs);
			case Hardware_architecturePackage.ELECTRICAL_SIGNAL__OWNING_ARTIFACT:
				return basicSetOwningArtifact(null, msgs);
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
			case Hardware_architecturePackage.ELECTRICAL_SIGNAL__OWNING_ARTIFACT:
				return eInternalContainer().eInverseRemove(this, Hardware_architecturePackage.HARDWARE_ARCHITECTURE__ELECTRICAL_SIGNALS, HardwareArchitecture.class, msgs);
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
			case Hardware_architecturePackage.ELECTRICAL_SIGNAL__MINIMUM_VOLTAGE:
				return getMinimumVoltage();
			case Hardware_architecturePackage.ELECTRICAL_SIGNAL__MAXIMUM_VOLTAGE:
				return getMaximumVoltage();
			case Hardware_architecturePackage.ELECTRICAL_SIGNAL__TYPED_PINS:
				return getTypedPins();
			case Hardware_architecturePackage.ELECTRICAL_SIGNAL__OWNING_ARTIFACT:
				return getOwningArtifact();
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
			case Hardware_architecturePackage.ELECTRICAL_SIGNAL__MINIMUM_VOLTAGE:
				setMinimumVoltage((Double)newValue);
				return;
			case Hardware_architecturePackage.ELECTRICAL_SIGNAL__MAXIMUM_VOLTAGE:
				setMaximumVoltage((Double)newValue);
				return;
			case Hardware_architecturePackage.ELECTRICAL_SIGNAL__TYPED_PINS:
				getTypedPins().clear();
				getTypedPins().addAll((Collection<? extends Pin>)newValue);
				return;
			case Hardware_architecturePackage.ELECTRICAL_SIGNAL__OWNING_ARTIFACT:
				setOwningArtifact((HardwareArchitecture)newValue);
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
			case Hardware_architecturePackage.ELECTRICAL_SIGNAL__MINIMUM_VOLTAGE:
				setMinimumVoltage(MINIMUM_VOLTAGE_EDEFAULT);
				return;
			case Hardware_architecturePackage.ELECTRICAL_SIGNAL__MAXIMUM_VOLTAGE:
				setMaximumVoltage(MAXIMUM_VOLTAGE_EDEFAULT);
				return;
			case Hardware_architecturePackage.ELECTRICAL_SIGNAL__TYPED_PINS:
				getTypedPins().clear();
				return;
			case Hardware_architecturePackage.ELECTRICAL_SIGNAL__OWNING_ARTIFACT:
				setOwningArtifact((HardwareArchitecture)null);
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
			case Hardware_architecturePackage.ELECTRICAL_SIGNAL__MINIMUM_VOLTAGE:
				return minimumVoltage != MINIMUM_VOLTAGE_EDEFAULT;
			case Hardware_architecturePackage.ELECTRICAL_SIGNAL__MAXIMUM_VOLTAGE:
				return maximumVoltage != MAXIMUM_VOLTAGE_EDEFAULT;
			case Hardware_architecturePackage.ELECTRICAL_SIGNAL__TYPED_PINS:
				return typedPins != null && !typedPins.isEmpty();
			case Hardware_architecturePackage.ELECTRICAL_SIGNAL__OWNING_ARTIFACT:
				return getOwningArtifact() != null;
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
		result.append(" (minimumVoltage: ");
		result.append(minimumVoltage);
		result.append(", maximumVoltage: ");
		result.append(maximumVoltage);
		result.append(')');
		return result.toString();
	}

} //ElectricalSignalImpl
