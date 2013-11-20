/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.allocation_model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.obeonetwork.dsl.east_adl.core.EASTADLEntity;

import org.obeonetwork.dsl.east_adl.core.impl.EASTADLEntityImpl;

import org.obeonetwork.dsl.east_adl.structure.allocation_model.Allocation_modelPackage;
import org.obeonetwork.dsl.east_adl.structure.allocation_model.SignalDeployment;

import org.obeonetwork.dsl.east_adl.structure.function_instance_model.Function_instance_modelPackage;
import org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signal Deployment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.impl.SignalDeploymentImpl#getDeployed <em>Deployed</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.impl.SignalDeploymentImpl#getDeployer <em>Deployer</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.impl.SignalDeploymentImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.impl.SignalDeploymentImpl#getOffset <em>Offset</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SignalDeploymentImpl extends EASTADLEntityImpl implements SignalDeployment {
	/**
	 * The cached value of the '{@link #getDeployed() <em>Deployed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployed()
	 * @generated
	 * @ordered
	 */
	protected SignalInstance deployed;

	/**
	 * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected static final int POSITION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected int position = POSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected static final int OFFSET_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected int offset = OFFSET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignalDeploymentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Allocation_modelPackage.Literals.SIGNAL_DEPLOYMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalInstance getDeployed() {
		if (deployed != null && deployed.eIsProxy()) {
			InternalEObject oldDeployed = (InternalEObject)deployed;
			deployed = (SignalInstance)eResolveProxy(oldDeployed);
			if (deployed != oldDeployed) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Allocation_modelPackage.SIGNAL_DEPLOYMENT__DEPLOYED, oldDeployed, deployed));
			}
		}
		return deployed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalInstance basicGetDeployed() {
		return deployed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeployed(SignalInstance newDeployed, NotificationChain msgs) {
		SignalInstance oldDeployed = deployed;
		deployed = newDeployed;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Allocation_modelPackage.SIGNAL_DEPLOYMENT__DEPLOYED, oldDeployed, newDeployed);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeployed(SignalInstance newDeployed) {
		if (newDeployed != deployed) {
			NotificationChain msgs = null;
			if (deployed != null)
				msgs = ((InternalEObject)deployed).eInverseRemove(this, Function_instance_modelPackage.SIGNAL_INSTANCE__PASSIVE_DEPLOYMENTS, SignalInstance.class, msgs);
			if (newDeployed != null)
				msgs = ((InternalEObject)newDeployed).eInverseAdd(this, Function_instance_modelPackage.SIGNAL_INSTANCE__PASSIVE_DEPLOYMENTS, SignalInstance.class, msgs);
			msgs = basicSetDeployed(newDeployed, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Allocation_modelPackage.SIGNAL_DEPLOYMENT__DEPLOYED, newDeployed, newDeployed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EASTADLEntity getDeployer() {
		EASTADLEntity deployer = basicGetDeployer();
		return deployer != null && deployer.eIsProxy() ? (EASTADLEntity)eResolveProxy((InternalEObject)deployer) : deployer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EASTADLEntity basicGetDeployer() {
		// TODO: implement this method to return the 'Deployer' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(int newPosition) {
		int oldPosition = position;
		position = newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Allocation_modelPackage.SIGNAL_DEPLOYMENT__POSITION, oldPosition, position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOffset() {
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffset(int newOffset) {
		int oldOffset = offset;
		offset = newOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Allocation_modelPackage.SIGNAL_DEPLOYMENT__OFFSET, oldOffset, offset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Allocation_modelPackage.SIGNAL_DEPLOYMENT__DEPLOYED:
				if (deployed != null)
					msgs = ((InternalEObject)deployed).eInverseRemove(this, Function_instance_modelPackage.SIGNAL_INSTANCE__PASSIVE_DEPLOYMENTS, SignalInstance.class, msgs);
				return basicSetDeployed((SignalInstance)otherEnd, msgs);
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
			case Allocation_modelPackage.SIGNAL_DEPLOYMENT__DEPLOYED:
				return basicSetDeployed(null, msgs);
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
			case Allocation_modelPackage.SIGNAL_DEPLOYMENT__DEPLOYED:
				if (resolve) return getDeployed();
				return basicGetDeployed();
			case Allocation_modelPackage.SIGNAL_DEPLOYMENT__DEPLOYER:
				if (resolve) return getDeployer();
				return basicGetDeployer();
			case Allocation_modelPackage.SIGNAL_DEPLOYMENT__POSITION:
				return getPosition();
			case Allocation_modelPackage.SIGNAL_DEPLOYMENT__OFFSET:
				return getOffset();
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
			case Allocation_modelPackage.SIGNAL_DEPLOYMENT__DEPLOYED:
				setDeployed((SignalInstance)newValue);
				return;
			case Allocation_modelPackage.SIGNAL_DEPLOYMENT__POSITION:
				setPosition((Integer)newValue);
				return;
			case Allocation_modelPackage.SIGNAL_DEPLOYMENT__OFFSET:
				setOffset((Integer)newValue);
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
			case Allocation_modelPackage.SIGNAL_DEPLOYMENT__DEPLOYED:
				setDeployed((SignalInstance)null);
				return;
			case Allocation_modelPackage.SIGNAL_DEPLOYMENT__POSITION:
				setPosition(POSITION_EDEFAULT);
				return;
			case Allocation_modelPackage.SIGNAL_DEPLOYMENT__OFFSET:
				setOffset(OFFSET_EDEFAULT);
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
			case Allocation_modelPackage.SIGNAL_DEPLOYMENT__DEPLOYED:
				return deployed != null;
			case Allocation_modelPackage.SIGNAL_DEPLOYMENT__DEPLOYER:
				return basicGetDeployer() != null;
			case Allocation_modelPackage.SIGNAL_DEPLOYMENT__POSITION:
				return position != POSITION_EDEFAULT;
			case Allocation_modelPackage.SIGNAL_DEPLOYMENT__OFFSET:
				return offset != OFFSET_EDEFAULT;
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
		result.append(" (position: ");
		result.append(position);
		result.append(", offset: ");
		result.append(offset);
		result.append(')');
		return result.toString();
	}

} //SignalDeploymentImpl
