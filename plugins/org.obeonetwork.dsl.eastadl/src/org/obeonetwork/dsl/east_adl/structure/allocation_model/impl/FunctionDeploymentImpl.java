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

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.obeonetwork.dsl.east_adl.core.impl.EASTADLEntityImpl;

import org.obeonetwork.dsl.east_adl.structure.allocation_model.Allocation_modelPackage;
import org.obeonetwork.dsl.east_adl.structure.allocation_model.FunctionDeployment;
import org.obeonetwork.dsl.east_adl.structure.allocation_model.OSTask;

import org.obeonetwork.dsl.east_adl.structure.function_instance_model.Function_instance_modelPackage;
import org.obeonetwork.dsl.east_adl.structure.function_instance_model.LogicalCluster;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Deployment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.impl.FunctionDeploymentImpl#getDeployer <em>Deployer</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.impl.FunctionDeploymentImpl#getDeployed <em>Deployed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionDeploymentImpl extends EASTADLEntityImpl implements FunctionDeployment {
	/**
	 * The cached value of the '{@link #getDeployed() <em>Deployed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployed()
	 * @generated
	 * @ordered
	 */
	protected LogicalCluster deployed;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionDeploymentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Allocation_modelPackage.Literals.FUNCTION_DEPLOYMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSTask getDeployer() {
		if (eContainerFeatureID() != Allocation_modelPackage.FUNCTION_DEPLOYMENT__DEPLOYER) return null;
		return (OSTask)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeployer(OSTask newDeployer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDeployer, Allocation_modelPackage.FUNCTION_DEPLOYMENT__DEPLOYER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeployer(OSTask newDeployer) {
		if (newDeployer != eInternalContainer() || (eContainerFeatureID() != Allocation_modelPackage.FUNCTION_DEPLOYMENT__DEPLOYER && newDeployer != null)) {
			if (EcoreUtil.isAncestor(this, newDeployer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDeployer != null)
				msgs = ((InternalEObject)newDeployer).eInverseAdd(this, Allocation_modelPackage.OS_TASK__DEPLOYMENTS, OSTask.class, msgs);
			msgs = basicSetDeployer(newDeployer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Allocation_modelPackage.FUNCTION_DEPLOYMENT__DEPLOYER, newDeployer, newDeployer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalCluster getDeployed() {
		if (deployed != null && deployed.eIsProxy()) {
			InternalEObject oldDeployed = (InternalEObject)deployed;
			deployed = (LogicalCluster)eResolveProxy(oldDeployed);
			if (deployed != oldDeployed) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Allocation_modelPackage.FUNCTION_DEPLOYMENT__DEPLOYED, oldDeployed, deployed));
			}
		}
		return deployed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalCluster basicGetDeployed() {
		return deployed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeployed(LogicalCluster newDeployed, NotificationChain msgs) {
		LogicalCluster oldDeployed = deployed;
		deployed = newDeployed;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Allocation_modelPackage.FUNCTION_DEPLOYMENT__DEPLOYED, oldDeployed, newDeployed);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeployed(LogicalCluster newDeployed) {
		if (newDeployed != deployed) {
			NotificationChain msgs = null;
			if (deployed != null)
				msgs = ((InternalEObject)deployed).eInverseRemove(this, Function_instance_modelPackage.LOGICAL_CLUSTER__PASSIVE_DEPLOYMENTS, LogicalCluster.class, msgs);
			if (newDeployed != null)
				msgs = ((InternalEObject)newDeployed).eInverseAdd(this, Function_instance_modelPackage.LOGICAL_CLUSTER__PASSIVE_DEPLOYMENTS, LogicalCluster.class, msgs);
			msgs = basicSetDeployed(newDeployed, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Allocation_modelPackage.FUNCTION_DEPLOYMENT__DEPLOYED, newDeployed, newDeployed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Allocation_modelPackage.FUNCTION_DEPLOYMENT__DEPLOYER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDeployer((OSTask)otherEnd, msgs);
			case Allocation_modelPackage.FUNCTION_DEPLOYMENT__DEPLOYED:
				if (deployed != null)
					msgs = ((InternalEObject)deployed).eInverseRemove(this, Function_instance_modelPackage.LOGICAL_CLUSTER__PASSIVE_DEPLOYMENTS, LogicalCluster.class, msgs);
				return basicSetDeployed((LogicalCluster)otherEnd, msgs);
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
			case Allocation_modelPackage.FUNCTION_DEPLOYMENT__DEPLOYER:
				return basicSetDeployer(null, msgs);
			case Allocation_modelPackage.FUNCTION_DEPLOYMENT__DEPLOYED:
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case Allocation_modelPackage.FUNCTION_DEPLOYMENT__DEPLOYER:
				return eInternalContainer().eInverseRemove(this, Allocation_modelPackage.OS_TASK__DEPLOYMENTS, OSTask.class, msgs);
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
			case Allocation_modelPackage.FUNCTION_DEPLOYMENT__DEPLOYER:
				return getDeployer();
			case Allocation_modelPackage.FUNCTION_DEPLOYMENT__DEPLOYED:
				if (resolve) return getDeployed();
				return basicGetDeployed();
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
			case Allocation_modelPackage.FUNCTION_DEPLOYMENT__DEPLOYER:
				setDeployer((OSTask)newValue);
				return;
			case Allocation_modelPackage.FUNCTION_DEPLOYMENT__DEPLOYED:
				setDeployed((LogicalCluster)newValue);
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
			case Allocation_modelPackage.FUNCTION_DEPLOYMENT__DEPLOYER:
				setDeployer((OSTask)null);
				return;
			case Allocation_modelPackage.FUNCTION_DEPLOYMENT__DEPLOYED:
				setDeployed((LogicalCluster)null);
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
			case Allocation_modelPackage.FUNCTION_DEPLOYMENT__DEPLOYER:
				return getDeployer() != null;
			case Allocation_modelPackage.FUNCTION_DEPLOYMENT__DEPLOYED:
				return deployed != null;
		}
		return super.eIsSet(featureID);
	}

} //FunctionDeploymentImpl
