/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.verification_validation.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.obeonetwork.dsl.east_adl.core.impl.EASTADLNamedElementImpl;

import org.obeonetwork.dsl.east_adl.verification_validation.ActualResult;
import org.obeonetwork.dsl.east_adl.verification_validation.ExpectedOutput;
import org.obeonetwork.dsl.east_adl.verification_validation.Input;
import org.obeonetwork.dsl.east_adl.verification_validation.Verification_validationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.verification_validation.impl.InputImpl#getActualResult <em>Actual Result</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.verification_validation.impl.InputImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.verification_validation.impl.InputImpl#getScenario <em>Scenario</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InputImpl extends EASTADLNamedElementImpl implements Input {
	/**
	 * The cached value of the '{@link #getActualResult() <em>Actual Result</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualResult()
	 * @generated
	 * @ordered
	 */
	protected ActualResult actualResult;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected ExpectedOutput output;

	/**
	 * The default value of the '{@link #getScenario() <em>Scenario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenario()
	 * @generated
	 * @ordered
	 */
	protected static final String SCENARIO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScenario() <em>Scenario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenario()
	 * @generated
	 * @ordered
	 */
	protected String scenario = SCENARIO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Verification_validationPackage.Literals.INPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActualResult getActualResult() {
		if (actualResult != null && actualResult.eIsProxy()) {
			InternalEObject oldActualResult = (InternalEObject)actualResult;
			actualResult = (ActualResult)eResolveProxy(oldActualResult);
			if (actualResult != oldActualResult) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Verification_validationPackage.INPUT__ACTUAL_RESULT, oldActualResult, actualResult));
			}
		}
		return actualResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActualResult basicGetActualResult() {
		return actualResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActualResult(ActualResult newActualResult) {
		ActualResult oldActualResult = actualResult;
		actualResult = newActualResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Verification_validationPackage.INPUT__ACTUAL_RESULT, oldActualResult, actualResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpectedOutput getOutput() {
		if (output != null && output.eIsProxy()) {
			InternalEObject oldOutput = (InternalEObject)output;
			output = (ExpectedOutput)eResolveProxy(oldOutput);
			if (output != oldOutput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Verification_validationPackage.INPUT__OUTPUT, oldOutput, output));
			}
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpectedOutput basicGetOutput() {
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput(ExpectedOutput newOutput) {
		ExpectedOutput oldOutput = output;
		output = newOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Verification_validationPackage.INPUT__OUTPUT, oldOutput, output));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScenario() {
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScenario(String newScenario) {
		String oldScenario = scenario;
		scenario = newScenario;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Verification_validationPackage.INPUT__SCENARIO, oldScenario, scenario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Verification_validationPackage.INPUT__ACTUAL_RESULT:
				if (resolve) return getActualResult();
				return basicGetActualResult();
			case Verification_validationPackage.INPUT__OUTPUT:
				if (resolve) return getOutput();
				return basicGetOutput();
			case Verification_validationPackage.INPUT__SCENARIO:
				return getScenario();
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
			case Verification_validationPackage.INPUT__ACTUAL_RESULT:
				setActualResult((ActualResult)newValue);
				return;
			case Verification_validationPackage.INPUT__OUTPUT:
				setOutput((ExpectedOutput)newValue);
				return;
			case Verification_validationPackage.INPUT__SCENARIO:
				setScenario((String)newValue);
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
			case Verification_validationPackage.INPUT__ACTUAL_RESULT:
				setActualResult((ActualResult)null);
				return;
			case Verification_validationPackage.INPUT__OUTPUT:
				setOutput((ExpectedOutput)null);
				return;
			case Verification_validationPackage.INPUT__SCENARIO:
				setScenario(SCENARIO_EDEFAULT);
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
			case Verification_validationPackage.INPUT__ACTUAL_RESULT:
				return actualResult != null;
			case Verification_validationPackage.INPUT__OUTPUT:
				return output != null;
			case Verification_validationPackage.INPUT__SCENARIO:
				return SCENARIO_EDEFAULT == null ? scenario != null : !SCENARIO_EDEFAULT.equals(scenario);
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
		result.append(" (scenario: ");
		result.append(scenario);
		result.append(')');
		return result.toString();
	}

} //InputImpl
