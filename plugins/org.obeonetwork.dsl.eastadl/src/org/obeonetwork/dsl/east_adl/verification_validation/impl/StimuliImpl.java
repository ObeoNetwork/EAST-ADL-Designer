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
import org.obeonetwork.dsl.east_adl.verification_validation.Stimuli;
import org.obeonetwork.dsl.east_adl.verification_validation.Verification_validationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stimuli</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.verification_validation.impl.StimuliImpl#getActualResult <em>Actual Result</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.verification_validation.impl.StimuliImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.verification_validation.impl.StimuliImpl#getData <em>Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StimuliImpl extends EASTADLNamedElementImpl implements Stimuli {
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
	 * The default value of the '{@link #getData() <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected String data = DATA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StimuliImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Verification_validationPackage.Literals.STIMULI;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Verification_validationPackage.STIMULI__ACTUAL_RESULT, oldActualResult, actualResult));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Verification_validationPackage.STIMULI__ACTUAL_RESULT, oldActualResult, actualResult));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Verification_validationPackage.STIMULI__OUTPUT, oldOutput, output));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Verification_validationPackage.STIMULI__OUTPUT, oldOutput, output));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getData() {
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData(String newData) {
		String oldData = data;
		data = newData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Verification_validationPackage.STIMULI__DATA, oldData, data));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Verification_validationPackage.STIMULI__ACTUAL_RESULT:
				if (resolve) return getActualResult();
				return basicGetActualResult();
			case Verification_validationPackage.STIMULI__OUTPUT:
				if (resolve) return getOutput();
				return basicGetOutput();
			case Verification_validationPackage.STIMULI__DATA:
				return getData();
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
			case Verification_validationPackage.STIMULI__ACTUAL_RESULT:
				setActualResult((ActualResult)newValue);
				return;
			case Verification_validationPackage.STIMULI__OUTPUT:
				setOutput((ExpectedOutput)newValue);
				return;
			case Verification_validationPackage.STIMULI__DATA:
				setData((String)newValue);
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
			case Verification_validationPackage.STIMULI__ACTUAL_RESULT:
				setActualResult((ActualResult)null);
				return;
			case Verification_validationPackage.STIMULI__OUTPUT:
				setOutput((ExpectedOutput)null);
				return;
			case Verification_validationPackage.STIMULI__DATA:
				setData(DATA_EDEFAULT);
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
			case Verification_validationPackage.STIMULI__ACTUAL_RESULT:
				return actualResult != null;
			case Verification_validationPackage.STIMULI__OUTPUT:
				return output != null;
			case Verification_validationPackage.STIMULI__DATA:
				return DATA_EDEFAULT == null ? data != null : !DATA_EDEFAULT.equals(data);
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
		result.append(" (data: ");
		result.append(data);
		result.append(')');
		return result.toString();
	}

} //StimuliImpl
