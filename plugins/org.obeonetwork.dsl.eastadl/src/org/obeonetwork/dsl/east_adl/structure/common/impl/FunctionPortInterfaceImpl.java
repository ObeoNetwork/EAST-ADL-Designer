/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.common.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.obeonetwork.dsl.east_adl.core.impl.EASTADLEntityImpl;

import org.obeonetwork.dsl.east_adl.structure.common.CommonPackage;
import org.obeonetwork.dsl.east_adl.structure.common.FunctionPort;
import org.obeonetwork.dsl.east_adl.structure.common.FunctionPortInterface;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Port Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.impl.FunctionPortInterfaceImpl#getTypedPort <em>Typed Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class FunctionPortInterfaceImpl extends EASTADLEntityImpl implements FunctionPortInterface {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionPortInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.FUNCTION_PORT_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionPort getTypedPort() {
		if (eContainerFeatureID() != CommonPackage.FUNCTION_PORT_INTERFACE__TYPED_PORT) return null;
		return (FunctionPort)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypedPort(FunctionPort newTypedPort, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTypedPort, CommonPackage.FUNCTION_PORT_INTERFACE__TYPED_PORT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypedPort(FunctionPort newTypedPort) {
		if (newTypedPort != eInternalContainer() || (eContainerFeatureID() != CommonPackage.FUNCTION_PORT_INTERFACE__TYPED_PORT && newTypedPort != null)) {
			if (EcoreUtil.isAncestor(this, newTypedPort))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTypedPort != null)
				msgs = ((InternalEObject)newTypedPort).eInverseAdd(this, CommonPackage.FUNCTION_PORT__INTERFACE, FunctionPort.class, msgs);
			msgs = basicSetTypedPort(newTypedPort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.FUNCTION_PORT_INTERFACE__TYPED_PORT, newTypedPort, newTypedPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommonPackage.FUNCTION_PORT_INTERFACE__TYPED_PORT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTypedPort((FunctionPort)otherEnd, msgs);
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
			case CommonPackage.FUNCTION_PORT_INTERFACE__TYPED_PORT:
				return basicSetTypedPort(null, msgs);
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
			case CommonPackage.FUNCTION_PORT_INTERFACE__TYPED_PORT:
				return eInternalContainer().eInverseRemove(this, CommonPackage.FUNCTION_PORT__INTERFACE, FunctionPort.class, msgs);
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
			case CommonPackage.FUNCTION_PORT_INTERFACE__TYPED_PORT:
				return getTypedPort();
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
			case CommonPackage.FUNCTION_PORT_INTERFACE__TYPED_PORT:
				setTypedPort((FunctionPort)newValue);
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
			case CommonPackage.FUNCTION_PORT_INTERFACE__TYPED_PORT:
				setTypedPort((FunctionPort)null);
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
			case CommonPackage.FUNCTION_PORT_INTERFACE__TYPED_PORT:
				return getTypedPort() != null;
		}
		return super.eIsSet(featureID);
	}

} //FunctionPortInterfaceImpl
