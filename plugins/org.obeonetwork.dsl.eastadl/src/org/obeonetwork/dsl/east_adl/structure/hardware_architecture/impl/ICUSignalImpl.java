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

import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.EdgeKind;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ICUMeasurementKind;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ICUSignal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ICU Signal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.ICUSignalImpl#getMeasurementMode <em>Measurement Mode</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.ICUSignalImpl#getDefaultStartEdge <em>Default Start Edge</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.ICUSignalImpl#getAdditionalData <em>Additional Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ICUSignalImpl extends PWMSignalImpl implements ICUSignal {
	/**
	 * The default value of the '{@link #getMeasurementMode() <em>Measurement Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementMode()
	 * @generated
	 * @ordered
	 */
	protected static final ICUMeasurementKind MEASUREMENT_MODE_EDEFAULT = ICUMeasurementKind.SIGNAL_EDGE_DETECTION;

	/**
	 * The cached value of the '{@link #getMeasurementMode() <em>Measurement Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementMode()
	 * @generated
	 * @ordered
	 */
	protected ICUMeasurementKind measurementMode = MEASUREMENT_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultStartEdge() <em>Default Start Edge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultStartEdge()
	 * @generated
	 * @ordered
	 */
	protected static final EdgeKind DEFAULT_START_EDGE_EDEFAULT = EdgeKind.RISING;

	/**
	 * The cached value of the '{@link #getDefaultStartEdge() <em>Default Start Edge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultStartEdge()
	 * @generated
	 * @ordered
	 */
	protected EdgeKind defaultStartEdge = DEFAULT_START_EDGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdditionalData() <em>Additional Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalData()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDITIONAL_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdditionalData() <em>Additional Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalData()
	 * @generated
	 * @ordered
	 */
	protected String additionalData = ADDITIONAL_DATA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ICUSignalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hardware_architecturePackage.Literals.ICU_SIGNAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ICUMeasurementKind getMeasurementMode() {
		return measurementMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasurementMode(ICUMeasurementKind newMeasurementMode) {
		ICUMeasurementKind oldMeasurementMode = measurementMode;
		measurementMode = newMeasurementMode == null ? MEASUREMENT_MODE_EDEFAULT : newMeasurementMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hardware_architecturePackage.ICU_SIGNAL__MEASUREMENT_MODE, oldMeasurementMode, measurementMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeKind getDefaultStartEdge() {
		return defaultStartEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultStartEdge(EdgeKind newDefaultStartEdge) {
		EdgeKind oldDefaultStartEdge = defaultStartEdge;
		defaultStartEdge = newDefaultStartEdge == null ? DEFAULT_START_EDGE_EDEFAULT : newDefaultStartEdge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hardware_architecturePackage.ICU_SIGNAL__DEFAULT_START_EDGE, oldDefaultStartEdge, defaultStartEdge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAdditionalData() {
		return additionalData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdditionalData(String newAdditionalData) {
		String oldAdditionalData = additionalData;
		additionalData = newAdditionalData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hardware_architecturePackage.ICU_SIGNAL__ADDITIONAL_DATA, oldAdditionalData, additionalData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Hardware_architecturePackage.ICU_SIGNAL__MEASUREMENT_MODE:
				return getMeasurementMode();
			case Hardware_architecturePackage.ICU_SIGNAL__DEFAULT_START_EDGE:
				return getDefaultStartEdge();
			case Hardware_architecturePackage.ICU_SIGNAL__ADDITIONAL_DATA:
				return getAdditionalData();
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
			case Hardware_architecturePackage.ICU_SIGNAL__MEASUREMENT_MODE:
				setMeasurementMode((ICUMeasurementKind)newValue);
				return;
			case Hardware_architecturePackage.ICU_SIGNAL__DEFAULT_START_EDGE:
				setDefaultStartEdge((EdgeKind)newValue);
				return;
			case Hardware_architecturePackage.ICU_SIGNAL__ADDITIONAL_DATA:
				setAdditionalData((String)newValue);
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
			case Hardware_architecturePackage.ICU_SIGNAL__MEASUREMENT_MODE:
				setMeasurementMode(MEASUREMENT_MODE_EDEFAULT);
				return;
			case Hardware_architecturePackage.ICU_SIGNAL__DEFAULT_START_EDGE:
				setDefaultStartEdge(DEFAULT_START_EDGE_EDEFAULT);
				return;
			case Hardware_architecturePackage.ICU_SIGNAL__ADDITIONAL_DATA:
				setAdditionalData(ADDITIONAL_DATA_EDEFAULT);
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
			case Hardware_architecturePackage.ICU_SIGNAL__MEASUREMENT_MODE:
				return measurementMode != MEASUREMENT_MODE_EDEFAULT;
			case Hardware_architecturePackage.ICU_SIGNAL__DEFAULT_START_EDGE:
				return defaultStartEdge != DEFAULT_START_EDGE_EDEFAULT;
			case Hardware_architecturePackage.ICU_SIGNAL__ADDITIONAL_DATA:
				return ADDITIONAL_DATA_EDEFAULT == null ? additionalData != null : !ADDITIONAL_DATA_EDEFAULT.equals(additionalData);
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
		result.append(" (measurementMode: ");
		result.append(measurementMode);
		result.append(", defaultStartEdge: ");
		result.append(defaultStartEdge);
		result.append(", additionalData: ");
		result.append(additionalData);
		result.append(')');
		return result.toString();
	}

} //ICUSignalImpl
