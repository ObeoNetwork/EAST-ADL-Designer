/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.DigitalSignal;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Digital Signal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.DigitalSignalImpl#getMinimumMaximumVoltage <em>Minimum Maximum Voltage</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.DigitalSignalImpl#getMaximumMinimumVoltage <em>Maximum Minimum Voltage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DigitalSignalImpl extends ElectricalSignalImpl implements DigitalSignal {
	/**
	 * The default value of the '{@link #getMinimumMaximumVoltage() <em>Minimum Maximum Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumMaximumVoltage()
	 * @generated
	 * @ordered
	 */
	protected static final double MINIMUM_MAXIMUM_VOLTAGE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinimumMaximumVoltage() <em>Minimum Maximum Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumMaximumVoltage()
	 * @generated
	 * @ordered
	 */
	protected double minimumMaximumVoltage = MINIMUM_MAXIMUM_VOLTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumMinimumVoltage() <em>Maximum Minimum Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumMinimumVoltage()
	 * @generated
	 * @ordered
	 */
	protected static final double MAXIMUM_MINIMUM_VOLTAGE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaximumMinimumVoltage() <em>Maximum Minimum Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumMinimumVoltage()
	 * @generated
	 * @ordered
	 */
	protected double maximumMinimumVoltage = MAXIMUM_MINIMUM_VOLTAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DigitalSignalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hardware_architecturePackage.Literals.DIGITAL_SIGNAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinimumMaximumVoltage() {
		return minimumMaximumVoltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumMaximumVoltage(double newMinimumMaximumVoltage) {
		double oldMinimumMaximumVoltage = minimumMaximumVoltage;
		minimumMaximumVoltage = newMinimumMaximumVoltage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hardware_architecturePackage.DIGITAL_SIGNAL__MINIMUM_MAXIMUM_VOLTAGE, oldMinimumMaximumVoltage, minimumMaximumVoltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaximumMinimumVoltage() {
		return maximumMinimumVoltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumMinimumVoltage(double newMaximumMinimumVoltage) {
		double oldMaximumMinimumVoltage = maximumMinimumVoltage;
		maximumMinimumVoltage = newMaximumMinimumVoltage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hardware_architecturePackage.DIGITAL_SIGNAL__MAXIMUM_MINIMUM_VOLTAGE, oldMaximumMinimumVoltage, maximumMinimumVoltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Hardware_architecturePackage.DIGITAL_SIGNAL__MINIMUM_MAXIMUM_VOLTAGE:
				return getMinimumMaximumVoltage();
			case Hardware_architecturePackage.DIGITAL_SIGNAL__MAXIMUM_MINIMUM_VOLTAGE:
				return getMaximumMinimumVoltage();
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
			case Hardware_architecturePackage.DIGITAL_SIGNAL__MINIMUM_MAXIMUM_VOLTAGE:
				setMinimumMaximumVoltage((Double)newValue);
				return;
			case Hardware_architecturePackage.DIGITAL_SIGNAL__MAXIMUM_MINIMUM_VOLTAGE:
				setMaximumMinimumVoltage((Double)newValue);
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
			case Hardware_architecturePackage.DIGITAL_SIGNAL__MINIMUM_MAXIMUM_VOLTAGE:
				setMinimumMaximumVoltage(MINIMUM_MAXIMUM_VOLTAGE_EDEFAULT);
				return;
			case Hardware_architecturePackage.DIGITAL_SIGNAL__MAXIMUM_MINIMUM_VOLTAGE:
				setMaximumMinimumVoltage(MAXIMUM_MINIMUM_VOLTAGE_EDEFAULT);
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
			case Hardware_architecturePackage.DIGITAL_SIGNAL__MINIMUM_MAXIMUM_VOLTAGE:
				return minimumMaximumVoltage != MINIMUM_MAXIMUM_VOLTAGE_EDEFAULT;
			case Hardware_architecturePackage.DIGITAL_SIGNAL__MAXIMUM_MINIMUM_VOLTAGE:
				return maximumMinimumVoltage != MAXIMUM_MINIMUM_VOLTAGE_EDEFAULT;
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
		result.append(" (minimumMaximumVoltage: ");
		result.append(minimumMaximumVoltage);
		result.append(", maximumMinimumVoltage: ");
		result.append(maximumMinimumVoltage);
		result.append(')');
		return result.toString();
	}

} //DigitalSignalImpl
