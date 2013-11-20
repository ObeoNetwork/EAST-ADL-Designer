/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.verification_validation.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.east_adl.verification_validation.ActualResult;
import org.obeonetwork.dsl.east_adl.verification_validation.ExpectedOutput;
import org.obeonetwork.dsl.east_adl.verification_validation.Simulation;
import org.obeonetwork.dsl.east_adl.verification_validation.Stimuli;
import org.obeonetwork.dsl.east_adl.verification_validation.Verification_validationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simulation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.verification_validation.impl.SimulationImpl#getStimulis <em>Stimulis</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.verification_validation.impl.SimulationImpl#getAbstractionLevel <em>Abstraction Level</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.verification_validation.impl.SimulationImpl#getResults <em>Results</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.verification_validation.impl.SimulationImpl#getOutputs <em>Outputs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimulationImpl extends VVCaseImpl implements Simulation {
	/**
	 * The cached value of the '{@link #getStimulis() <em>Stimulis</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulis()
	 * @generated
	 * @ordered
	 */
	protected EList<Stimuli> stimulis;

	/**
	 * The default value of the '{@link #getAbstractionLevel() <em>Abstraction Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractionLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String ABSTRACTION_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbstractionLevel() <em>Abstraction Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractionLevel()
	 * @generated
	 * @ordered
	 */
	protected String abstractionLevel = ABSTRACTION_LEVEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResults() <em>Results</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResults()
	 * @generated
	 * @ordered
	 */
	protected EList<ActualResult> results;

	/**
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<ExpectedOutput> outputs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimulationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Verification_validationPackage.Literals.SIMULATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Stimuli> getStimulis() {
		if (stimulis == null) {
			stimulis = new EObjectContainmentEList<Stimuli>(Stimuli.class, this, Verification_validationPackage.SIMULATION__STIMULIS);
		}
		return stimulis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAbstractionLevel() {
		return abstractionLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstractionLevel(String newAbstractionLevel) {
		String oldAbstractionLevel = abstractionLevel;
		abstractionLevel = newAbstractionLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Verification_validationPackage.SIMULATION__ABSTRACTION_LEVEL, oldAbstractionLevel, abstractionLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActualResult> getResults() {
		if (results == null) {
			results = new EObjectContainmentEList<ActualResult>(ActualResult.class, this, Verification_validationPackage.SIMULATION__RESULTS);
		}
		return results;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExpectedOutput> getOutputs() {
		if (outputs == null) {
			outputs = new EObjectContainmentEList<ExpectedOutput>(ExpectedOutput.class, this, Verification_validationPackage.SIMULATION__OUTPUTS);
		}
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Verification_validationPackage.SIMULATION__STIMULIS:
				return ((InternalEList<?>)getStimulis()).basicRemove(otherEnd, msgs);
			case Verification_validationPackage.SIMULATION__RESULTS:
				return ((InternalEList<?>)getResults()).basicRemove(otherEnd, msgs);
			case Verification_validationPackage.SIMULATION__OUTPUTS:
				return ((InternalEList<?>)getOutputs()).basicRemove(otherEnd, msgs);
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
			case Verification_validationPackage.SIMULATION__STIMULIS:
				return getStimulis();
			case Verification_validationPackage.SIMULATION__ABSTRACTION_LEVEL:
				return getAbstractionLevel();
			case Verification_validationPackage.SIMULATION__RESULTS:
				return getResults();
			case Verification_validationPackage.SIMULATION__OUTPUTS:
				return getOutputs();
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
			case Verification_validationPackage.SIMULATION__STIMULIS:
				getStimulis().clear();
				getStimulis().addAll((Collection<? extends Stimuli>)newValue);
				return;
			case Verification_validationPackage.SIMULATION__ABSTRACTION_LEVEL:
				setAbstractionLevel((String)newValue);
				return;
			case Verification_validationPackage.SIMULATION__RESULTS:
				getResults().clear();
				getResults().addAll((Collection<? extends ActualResult>)newValue);
				return;
			case Verification_validationPackage.SIMULATION__OUTPUTS:
				getOutputs().clear();
				getOutputs().addAll((Collection<? extends ExpectedOutput>)newValue);
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
			case Verification_validationPackage.SIMULATION__STIMULIS:
				getStimulis().clear();
				return;
			case Verification_validationPackage.SIMULATION__ABSTRACTION_LEVEL:
				setAbstractionLevel(ABSTRACTION_LEVEL_EDEFAULT);
				return;
			case Verification_validationPackage.SIMULATION__RESULTS:
				getResults().clear();
				return;
			case Verification_validationPackage.SIMULATION__OUTPUTS:
				getOutputs().clear();
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
			case Verification_validationPackage.SIMULATION__STIMULIS:
				return stimulis != null && !stimulis.isEmpty();
			case Verification_validationPackage.SIMULATION__ABSTRACTION_LEVEL:
				return ABSTRACTION_LEVEL_EDEFAULT == null ? abstractionLevel != null : !ABSTRACTION_LEVEL_EDEFAULT.equals(abstractionLevel);
			case Verification_validationPackage.SIMULATION__RESULTS:
				return results != null && !results.isEmpty();
			case Verification_validationPackage.SIMULATION__OUTPUTS:
				return outputs != null && !outputs.isEmpty();
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
		result.append(" (abstractionLevel: ");
		result.append(abstractionLevel);
		result.append(')');
		return result.toString();
	}

} //SimulationImpl
