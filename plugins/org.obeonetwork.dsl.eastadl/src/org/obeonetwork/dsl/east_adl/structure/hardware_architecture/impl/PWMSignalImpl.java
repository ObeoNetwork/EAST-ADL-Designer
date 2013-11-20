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

import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.PWMSignal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PWM Signal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.PWMSignalImpl#getMinimumFrequency <em>Minimum Frequency</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.PWMSignalImpl#getMaximumFrequency <em>Maximum Frequency</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.PWMSignalImpl#getMinimumWidth <em>Minimum Width</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.PWMSignalImpl#getMaximumWidth <em>Maximum Width</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PWMSignalImpl extends ElectricalSignalImpl implements PWMSignal {
	/**
	 * The default value of the '{@link #getMinimumFrequency() <em>Minimum Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final double MINIMUM_FREQUENCY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinimumFrequency() <em>Minimum Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumFrequency()
	 * @generated
	 * @ordered
	 */
	protected double minimumFrequency = MINIMUM_FREQUENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumFrequency() <em>Maximum Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final double MAXIMUM_FREQUENCY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaximumFrequency() <em>Maximum Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumFrequency()
	 * @generated
	 * @ordered
	 */
	protected double maximumFrequency = MAXIMUM_FREQUENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinimumWidth() <em>Minimum Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumWidth()
	 * @generated
	 * @ordered
	 */
	protected static final double MINIMUM_WIDTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinimumWidth() <em>Minimum Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumWidth()
	 * @generated
	 * @ordered
	 */
	protected double minimumWidth = MINIMUM_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumWidth() <em>Maximum Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumWidth()
	 * @generated
	 * @ordered
	 */
	protected static final double MAXIMUM_WIDTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaximumWidth() <em>Maximum Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumWidth()
	 * @generated
	 * @ordered
	 */
	protected double maximumWidth = MAXIMUM_WIDTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PWMSignalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hardware_architecturePackage.Literals.PWM_SIGNAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinimumFrequency() {
		return minimumFrequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumFrequency(double newMinimumFrequency) {
		double oldMinimumFrequency = minimumFrequency;
		minimumFrequency = newMinimumFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hardware_architecturePackage.PWM_SIGNAL__MINIMUM_FREQUENCY, oldMinimumFrequency, minimumFrequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaximumFrequency() {
		return maximumFrequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumFrequency(double newMaximumFrequency) {
		double oldMaximumFrequency = maximumFrequency;
		maximumFrequency = newMaximumFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hardware_architecturePackage.PWM_SIGNAL__MAXIMUM_FREQUENCY, oldMaximumFrequency, maximumFrequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinimumWidth() {
		return minimumWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumWidth(double newMinimumWidth) {
		double oldMinimumWidth = minimumWidth;
		minimumWidth = newMinimumWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hardware_architecturePackage.PWM_SIGNAL__MINIMUM_WIDTH, oldMinimumWidth, minimumWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaximumWidth() {
		return maximumWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumWidth(double newMaximumWidth) {
		double oldMaximumWidth = maximumWidth;
		maximumWidth = newMaximumWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hardware_architecturePackage.PWM_SIGNAL__MAXIMUM_WIDTH, oldMaximumWidth, maximumWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Hardware_architecturePackage.PWM_SIGNAL__MINIMUM_FREQUENCY:
				return getMinimumFrequency();
			case Hardware_architecturePackage.PWM_SIGNAL__MAXIMUM_FREQUENCY:
				return getMaximumFrequency();
			case Hardware_architecturePackage.PWM_SIGNAL__MINIMUM_WIDTH:
				return getMinimumWidth();
			case Hardware_architecturePackage.PWM_SIGNAL__MAXIMUM_WIDTH:
				return getMaximumWidth();
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
			case Hardware_architecturePackage.PWM_SIGNAL__MINIMUM_FREQUENCY:
				setMinimumFrequency((Double)newValue);
				return;
			case Hardware_architecturePackage.PWM_SIGNAL__MAXIMUM_FREQUENCY:
				setMaximumFrequency((Double)newValue);
				return;
			case Hardware_architecturePackage.PWM_SIGNAL__MINIMUM_WIDTH:
				setMinimumWidth((Double)newValue);
				return;
			case Hardware_architecturePackage.PWM_SIGNAL__MAXIMUM_WIDTH:
				setMaximumWidth((Double)newValue);
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
			case Hardware_architecturePackage.PWM_SIGNAL__MINIMUM_FREQUENCY:
				setMinimumFrequency(MINIMUM_FREQUENCY_EDEFAULT);
				return;
			case Hardware_architecturePackage.PWM_SIGNAL__MAXIMUM_FREQUENCY:
				setMaximumFrequency(MAXIMUM_FREQUENCY_EDEFAULT);
				return;
			case Hardware_architecturePackage.PWM_SIGNAL__MINIMUM_WIDTH:
				setMinimumWidth(MINIMUM_WIDTH_EDEFAULT);
				return;
			case Hardware_architecturePackage.PWM_SIGNAL__MAXIMUM_WIDTH:
				setMaximumWidth(MAXIMUM_WIDTH_EDEFAULT);
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
			case Hardware_architecturePackage.PWM_SIGNAL__MINIMUM_FREQUENCY:
				return minimumFrequency != MINIMUM_FREQUENCY_EDEFAULT;
			case Hardware_architecturePackage.PWM_SIGNAL__MAXIMUM_FREQUENCY:
				return maximumFrequency != MAXIMUM_FREQUENCY_EDEFAULT;
			case Hardware_architecturePackage.PWM_SIGNAL__MINIMUM_WIDTH:
				return minimumWidth != MINIMUM_WIDTH_EDEFAULT;
			case Hardware_architecturePackage.PWM_SIGNAL__MAXIMUM_WIDTH:
				return maximumWidth != MAXIMUM_WIDTH_EDEFAULT;
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
		result.append(" (minimumFrequency: ");
		result.append(minimumFrequency);
		result.append(", maximumFrequency: ");
		result.append(maximumFrequency);
		result.append(", minimumWidth: ");
		result.append(minimumWidth);
		result.append(", maximumWidth: ");
		result.append(maximumWidth);
		result.append(')');
		return result.toString();
	}

} //PWMSignalImpl
