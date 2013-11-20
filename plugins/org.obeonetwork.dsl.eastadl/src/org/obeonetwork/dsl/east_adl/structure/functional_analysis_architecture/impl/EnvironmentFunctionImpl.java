/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.EnvironmentFunction;
import org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.Functional_analysis_architecturePackage;

import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Actuator;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Sensor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Environment Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl.EnvironmentFunctionImpl#getActuators <em>Actuators</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl.EnvironmentFunctionImpl#getSensors <em>Sensors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnvironmentFunctionImpl extends AnalysisFunctionImpl implements EnvironmentFunction {
	/**
	 * The cached value of the '{@link #getActuators() <em>Actuators</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuators()
	 * @generated
	 * @ordered
	 */
	protected EList<Actuator> actuators;

	/**
	 * The cached value of the '{@link #getSensors() <em>Sensors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensors()
	 * @generated
	 * @ordered
	 */
	protected EList<Sensor> sensors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnvironmentFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Functional_analysis_architecturePackage.Literals.ENVIRONMENT_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actuator> getActuators() {
		if (actuators == null) {
			actuators = new EObjectWithInverseResolvingEList<Actuator>(Actuator.class, this, Functional_analysis_architecturePackage.ENVIRONMENT_FUNCTION__ACTUATORS, Hardware_architecturePackage.ACTUATOR__ACTUATOR_MODEL);
		}
		return actuators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sensor> getSensors() {
		if (sensors == null) {
			sensors = new EObjectWithInverseResolvingEList<Sensor>(Sensor.class, this, Functional_analysis_architecturePackage.ENVIRONMENT_FUNCTION__SENSORS, Hardware_architecturePackage.SENSOR__SENSOR_MODEL);
		}
		return sensors;
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
			case Functional_analysis_architecturePackage.ENVIRONMENT_FUNCTION__ACTUATORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActuators()).basicAdd(otherEnd, msgs);
			case Functional_analysis_architecturePackage.ENVIRONMENT_FUNCTION__SENSORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSensors()).basicAdd(otherEnd, msgs);
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
			case Functional_analysis_architecturePackage.ENVIRONMENT_FUNCTION__ACTUATORS:
				return ((InternalEList<?>)getActuators()).basicRemove(otherEnd, msgs);
			case Functional_analysis_architecturePackage.ENVIRONMENT_FUNCTION__SENSORS:
				return ((InternalEList<?>)getSensors()).basicRemove(otherEnd, msgs);
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
			case Functional_analysis_architecturePackage.ENVIRONMENT_FUNCTION__ACTUATORS:
				return getActuators();
			case Functional_analysis_architecturePackage.ENVIRONMENT_FUNCTION__SENSORS:
				return getSensors();
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
			case Functional_analysis_architecturePackage.ENVIRONMENT_FUNCTION__ACTUATORS:
				getActuators().clear();
				getActuators().addAll((Collection<? extends Actuator>)newValue);
				return;
			case Functional_analysis_architecturePackage.ENVIRONMENT_FUNCTION__SENSORS:
				getSensors().clear();
				getSensors().addAll((Collection<? extends Sensor>)newValue);
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
			case Functional_analysis_architecturePackage.ENVIRONMENT_FUNCTION__ACTUATORS:
				getActuators().clear();
				return;
			case Functional_analysis_architecturePackage.ENVIRONMENT_FUNCTION__SENSORS:
				getSensors().clear();
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
			case Functional_analysis_architecturePackage.ENVIRONMENT_FUNCTION__ACTUATORS:
				return actuators != null && !actuators.isEmpty();
			case Functional_analysis_architecturePackage.ENVIRONMENT_FUNCTION__SENSORS:
				return sensors != null && !sensors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EnvironmentFunctionImpl
