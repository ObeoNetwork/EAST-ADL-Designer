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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.east_adl.structure.common.CommonPackage;
import org.obeonetwork.dsl.east_adl.structure.common.Realization;
import org.obeonetwork.dsl.east_adl.structure.common.RealizedEntity;
import org.obeonetwork.dsl.east_adl.structure.common.RealizingEntity;

import org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.EnvironmentFunction;
import org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.Functional_analysis_architecturePackage;

import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Channel;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Pin;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Sensor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.SensorImpl#getActiveRealizations <em>Active Realizations</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.SensorImpl#getRealizes <em>Realizes</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.SensorImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.SensorImpl#getChannels <em>Channels</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.SensorImpl#getSensorModel <em>Sensor Model</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.SensorImpl#getPins <em>Pins</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SensorImpl extends HardwareEntityImpl implements Sensor {
	/**
	 * The cached value of the '{@link #getActiveRealizations() <em>Active Realizations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveRealizations()
	 * @generated
	 * @ordered
	 */
	protected EList<Realization> activeRealizations;

	/**
	 * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final String QUANTITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected String quantity = QUANTITY_EDEFAULT;

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
	 * The cached value of the '{@link #getSensorModel() <em>Sensor Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensorModel()
	 * @generated
	 * @ordered
	 */
	protected EnvironmentFunction sensorModel;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hardware_architecturePackage.Literals.SENSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Realization> getActiveRealizations() {
		if (activeRealizations == null) {
			activeRealizations = new EObjectContainmentWithInverseEList<Realization>(Realization.class, this, Hardware_architecturePackage.SENSOR__ACTIVE_REALIZATIONS, CommonPackage.REALIZATION__REALIZING_ENTITY);
		}
		return activeRealizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RealizedEntity> getRealizes() {
		// TODO: implement this method to return the 'Realizes' reference list
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
	public String getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(String newQuantity) {
		String oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hardware_architecturePackage.SENSOR__QUANTITY, oldQuantity, quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Channel> getChannels() {
		if (channels == null) {
			channels = new EObjectWithInverseResolvingEList.ManyInverse<Channel>(Channel.class, this, Hardware_architecturePackage.SENSOR__CHANNELS, Hardware_architecturePackage.CHANNEL__CONNECTED_SENSORS);
		}
		return channels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvironmentFunction getSensorModel() {
		if (sensorModel != null && sensorModel.eIsProxy()) {
			InternalEObject oldSensorModel = (InternalEObject)sensorModel;
			sensorModel = (EnvironmentFunction)eResolveProxy(oldSensorModel);
			if (sensorModel != oldSensorModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hardware_architecturePackage.SENSOR__SENSOR_MODEL, oldSensorModel, sensorModel));
			}
		}
		return sensorModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvironmentFunction basicGetSensorModel() {
		return sensorModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSensorModel(EnvironmentFunction newSensorModel, NotificationChain msgs) {
		EnvironmentFunction oldSensorModel = sensorModel;
		sensorModel = newSensorModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Hardware_architecturePackage.SENSOR__SENSOR_MODEL, oldSensorModel, newSensorModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSensorModel(EnvironmentFunction newSensorModel) {
		if (newSensorModel != sensorModel) {
			NotificationChain msgs = null;
			if (sensorModel != null)
				msgs = ((InternalEObject)sensorModel).eInverseRemove(this, Functional_analysis_architecturePackage.ENVIRONMENT_FUNCTION__SENSORS, EnvironmentFunction.class, msgs);
			if (newSensorModel != null)
				msgs = ((InternalEObject)newSensorModel).eInverseAdd(this, Functional_analysis_architecturePackage.ENVIRONMENT_FUNCTION__SENSORS, EnvironmentFunction.class, msgs);
			msgs = basicSetSensorModel(newSensorModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hardware_architecturePackage.SENSOR__SENSOR_MODEL, newSensorModel, newSensorModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pin> getPins() {
		if (pins == null) {
			pins = new EObjectContainmentEList<Pin>(Pin.class, this, Hardware_architecturePackage.SENSOR__PINS);
		}
		return pins;
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
			case Hardware_architecturePackage.SENSOR__ACTIVE_REALIZATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActiveRealizations()).basicAdd(otherEnd, msgs);
			case Hardware_architecturePackage.SENSOR__CHANNELS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChannels()).basicAdd(otherEnd, msgs);
			case Hardware_architecturePackage.SENSOR__SENSOR_MODEL:
				if (sensorModel != null)
					msgs = ((InternalEObject)sensorModel).eInverseRemove(this, Functional_analysis_architecturePackage.ENVIRONMENT_FUNCTION__SENSORS, EnvironmentFunction.class, msgs);
				return basicSetSensorModel((EnvironmentFunction)otherEnd, msgs);
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
			case Hardware_architecturePackage.SENSOR__ACTIVE_REALIZATIONS:
				return ((InternalEList<?>)getActiveRealizations()).basicRemove(otherEnd, msgs);
			case Hardware_architecturePackage.SENSOR__CHANNELS:
				return ((InternalEList<?>)getChannels()).basicRemove(otherEnd, msgs);
			case Hardware_architecturePackage.SENSOR__SENSOR_MODEL:
				return basicSetSensorModel(null, msgs);
			case Hardware_architecturePackage.SENSOR__PINS:
				return ((InternalEList<?>)getPins()).basicRemove(otherEnd, msgs);
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
			case Hardware_architecturePackage.SENSOR__ACTIVE_REALIZATIONS:
				return getActiveRealizations();
			case Hardware_architecturePackage.SENSOR__REALIZES:
				return getRealizes();
			case Hardware_architecturePackage.SENSOR__QUANTITY:
				return getQuantity();
			case Hardware_architecturePackage.SENSOR__CHANNELS:
				return getChannels();
			case Hardware_architecturePackage.SENSOR__SENSOR_MODEL:
				if (resolve) return getSensorModel();
				return basicGetSensorModel();
			case Hardware_architecturePackage.SENSOR__PINS:
				return getPins();
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
			case Hardware_architecturePackage.SENSOR__ACTIVE_REALIZATIONS:
				getActiveRealizations().clear();
				getActiveRealizations().addAll((Collection<? extends Realization>)newValue);
				return;
			case Hardware_architecturePackage.SENSOR__QUANTITY:
				setQuantity((String)newValue);
				return;
			case Hardware_architecturePackage.SENSOR__CHANNELS:
				getChannels().clear();
				getChannels().addAll((Collection<? extends Channel>)newValue);
				return;
			case Hardware_architecturePackage.SENSOR__SENSOR_MODEL:
				setSensorModel((EnvironmentFunction)newValue);
				return;
			case Hardware_architecturePackage.SENSOR__PINS:
				getPins().clear();
				getPins().addAll((Collection<? extends Pin>)newValue);
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
			case Hardware_architecturePackage.SENSOR__ACTIVE_REALIZATIONS:
				getActiveRealizations().clear();
				return;
			case Hardware_architecturePackage.SENSOR__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
				return;
			case Hardware_architecturePackage.SENSOR__CHANNELS:
				getChannels().clear();
				return;
			case Hardware_architecturePackage.SENSOR__SENSOR_MODEL:
				setSensorModel((EnvironmentFunction)null);
				return;
			case Hardware_architecturePackage.SENSOR__PINS:
				getPins().clear();
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
			case Hardware_architecturePackage.SENSOR__ACTIVE_REALIZATIONS:
				return activeRealizations != null && !activeRealizations.isEmpty();
			case Hardware_architecturePackage.SENSOR__REALIZES:
				return !getRealizes().isEmpty();
			case Hardware_architecturePackage.SENSOR__QUANTITY:
				return QUANTITY_EDEFAULT == null ? quantity != null : !QUANTITY_EDEFAULT.equals(quantity);
			case Hardware_architecturePackage.SENSOR__CHANNELS:
				return channels != null && !channels.isEmpty();
			case Hardware_architecturePackage.SENSOR__SENSOR_MODEL:
				return sensorModel != null;
			case Hardware_architecturePackage.SENSOR__PINS:
				return pins != null && !pins.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == RealizingEntity.class) {
			switch (derivedFeatureID) {
				case Hardware_architecturePackage.SENSOR__ACTIVE_REALIZATIONS: return CommonPackage.REALIZING_ENTITY__ACTIVE_REALIZATIONS;
				case Hardware_architecturePackage.SENSOR__REALIZES: return CommonPackage.REALIZING_ENTITY__REALIZES;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == RealizingEntity.class) {
			switch (baseFeatureID) {
				case CommonPackage.REALIZING_ENTITY__ACTIVE_REALIZATIONS: return Hardware_architecturePackage.SENSOR__ACTIVE_REALIZATIONS;
				case CommonPackage.REALIZING_ENTITY__REALIZES: return Hardware_architecturePackage.SENSOR__REALIZES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (quantity: ");
		result.append(quantity);
		result.append(')');
		return result.toString();
	}

} //SensorImpl
