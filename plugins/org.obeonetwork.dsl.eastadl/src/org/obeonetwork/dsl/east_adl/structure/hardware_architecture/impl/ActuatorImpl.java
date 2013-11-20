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

import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Actuator;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Channel;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Pin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actuator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.ActuatorImpl#getActiveRealizations <em>Active Realizations</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.ActuatorImpl#getRealizes <em>Realizes</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.ActuatorImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.ActuatorImpl#getChannels <em>Channels</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.ActuatorImpl#getActuatorModel <em>Actuator Model</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl.ActuatorImpl#getPins <em>Pins</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActuatorImpl extends HardwareEntityImpl implements Actuator {
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
	 * The cached value of the '{@link #getActuatorModel() <em>Actuator Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuatorModel()
	 * @generated
	 * @ordered
	 */
	protected EnvironmentFunction actuatorModel;

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
	protected ActuatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hardware_architecturePackage.Literals.ACTUATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Realization> getActiveRealizations() {
		if (activeRealizations == null) {
			activeRealizations = new EObjectContainmentWithInverseEList<Realization>(Realization.class, this, Hardware_architecturePackage.ACTUATOR__ACTIVE_REALIZATIONS, CommonPackage.REALIZATION__REALIZING_ENTITY);
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hardware_architecturePackage.ACTUATOR__QUANTITY, oldQuantity, quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Channel> getChannels() {
		if (channels == null) {
			channels = new EObjectWithInverseResolvingEList.ManyInverse<Channel>(Channel.class, this, Hardware_architecturePackage.ACTUATOR__CHANNELS, Hardware_architecturePackage.CHANNEL__CONNECTED_ACTUATORS);
		}
		return channels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvironmentFunction getActuatorModel() {
		if (actuatorModel != null && actuatorModel.eIsProxy()) {
			InternalEObject oldActuatorModel = (InternalEObject)actuatorModel;
			actuatorModel = (EnvironmentFunction)eResolveProxy(oldActuatorModel);
			if (actuatorModel != oldActuatorModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hardware_architecturePackage.ACTUATOR__ACTUATOR_MODEL, oldActuatorModel, actuatorModel));
			}
		}
		return actuatorModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvironmentFunction basicGetActuatorModel() {
		return actuatorModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActuatorModel(EnvironmentFunction newActuatorModel, NotificationChain msgs) {
		EnvironmentFunction oldActuatorModel = actuatorModel;
		actuatorModel = newActuatorModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Hardware_architecturePackage.ACTUATOR__ACTUATOR_MODEL, oldActuatorModel, newActuatorModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActuatorModel(EnvironmentFunction newActuatorModel) {
		if (newActuatorModel != actuatorModel) {
			NotificationChain msgs = null;
			if (actuatorModel != null)
				msgs = ((InternalEObject)actuatorModel).eInverseRemove(this, Functional_analysis_architecturePackage.ENVIRONMENT_FUNCTION__ACTUATORS, EnvironmentFunction.class, msgs);
			if (newActuatorModel != null)
				msgs = ((InternalEObject)newActuatorModel).eInverseAdd(this, Functional_analysis_architecturePackage.ENVIRONMENT_FUNCTION__ACTUATORS, EnvironmentFunction.class, msgs);
			msgs = basicSetActuatorModel(newActuatorModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hardware_architecturePackage.ACTUATOR__ACTUATOR_MODEL, newActuatorModel, newActuatorModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pin> getPins() {
		if (pins == null) {
			pins = new EObjectContainmentEList<Pin>(Pin.class, this, Hardware_architecturePackage.ACTUATOR__PINS);
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
			case Hardware_architecturePackage.ACTUATOR__ACTIVE_REALIZATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActiveRealizations()).basicAdd(otherEnd, msgs);
			case Hardware_architecturePackage.ACTUATOR__CHANNELS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChannels()).basicAdd(otherEnd, msgs);
			case Hardware_architecturePackage.ACTUATOR__ACTUATOR_MODEL:
				if (actuatorModel != null)
					msgs = ((InternalEObject)actuatorModel).eInverseRemove(this, Functional_analysis_architecturePackage.ENVIRONMENT_FUNCTION__ACTUATORS, EnvironmentFunction.class, msgs);
				return basicSetActuatorModel((EnvironmentFunction)otherEnd, msgs);
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
			case Hardware_architecturePackage.ACTUATOR__ACTIVE_REALIZATIONS:
				return ((InternalEList<?>)getActiveRealizations()).basicRemove(otherEnd, msgs);
			case Hardware_architecturePackage.ACTUATOR__CHANNELS:
				return ((InternalEList<?>)getChannels()).basicRemove(otherEnd, msgs);
			case Hardware_architecturePackage.ACTUATOR__ACTUATOR_MODEL:
				return basicSetActuatorModel(null, msgs);
			case Hardware_architecturePackage.ACTUATOR__PINS:
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
			case Hardware_architecturePackage.ACTUATOR__ACTIVE_REALIZATIONS:
				return getActiveRealizations();
			case Hardware_architecturePackage.ACTUATOR__REALIZES:
				return getRealizes();
			case Hardware_architecturePackage.ACTUATOR__QUANTITY:
				return getQuantity();
			case Hardware_architecturePackage.ACTUATOR__CHANNELS:
				return getChannels();
			case Hardware_architecturePackage.ACTUATOR__ACTUATOR_MODEL:
				if (resolve) return getActuatorModel();
				return basicGetActuatorModel();
			case Hardware_architecturePackage.ACTUATOR__PINS:
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
			case Hardware_architecturePackage.ACTUATOR__ACTIVE_REALIZATIONS:
				getActiveRealizations().clear();
				getActiveRealizations().addAll((Collection<? extends Realization>)newValue);
				return;
			case Hardware_architecturePackage.ACTUATOR__QUANTITY:
				setQuantity((String)newValue);
				return;
			case Hardware_architecturePackage.ACTUATOR__CHANNELS:
				getChannels().clear();
				getChannels().addAll((Collection<? extends Channel>)newValue);
				return;
			case Hardware_architecturePackage.ACTUATOR__ACTUATOR_MODEL:
				setActuatorModel((EnvironmentFunction)newValue);
				return;
			case Hardware_architecturePackage.ACTUATOR__PINS:
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
			case Hardware_architecturePackage.ACTUATOR__ACTIVE_REALIZATIONS:
				getActiveRealizations().clear();
				return;
			case Hardware_architecturePackage.ACTUATOR__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
				return;
			case Hardware_architecturePackage.ACTUATOR__CHANNELS:
				getChannels().clear();
				return;
			case Hardware_architecturePackage.ACTUATOR__ACTUATOR_MODEL:
				setActuatorModel((EnvironmentFunction)null);
				return;
			case Hardware_architecturePackage.ACTUATOR__PINS:
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
			case Hardware_architecturePackage.ACTUATOR__ACTIVE_REALIZATIONS:
				return activeRealizations != null && !activeRealizations.isEmpty();
			case Hardware_architecturePackage.ACTUATOR__REALIZES:
				return !getRealizes().isEmpty();
			case Hardware_architecturePackage.ACTUATOR__QUANTITY:
				return QUANTITY_EDEFAULT == null ? quantity != null : !QUANTITY_EDEFAULT.equals(quantity);
			case Hardware_architecturePackage.ACTUATOR__CHANNELS:
				return channels != null && !channels.isEmpty();
			case Hardware_architecturePackage.ACTUATOR__ACTUATOR_MODEL:
				return actuatorModel != null;
			case Hardware_architecturePackage.ACTUATOR__PINS:
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
				case Hardware_architecturePackage.ACTUATOR__ACTIVE_REALIZATIONS: return CommonPackage.REALIZING_ENTITY__ACTIVE_REALIZATIONS;
				case Hardware_architecturePackage.ACTUATOR__REALIZES: return CommonPackage.REALIZING_ENTITY__REALIZES;
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
				case CommonPackage.REALIZING_ENTITY__ACTIVE_REALIZATIONS: return Hardware_architecturePackage.ACTUATOR__ACTIVE_REALIZATIONS;
				case CommonPackage.REALIZING_ENTITY__REALIZES: return Hardware_architecturePackage.ACTUATOR__REALIZES;
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

} //ActuatorImpl
