/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.east_adl.core.impl.EASTADLArtifactImpl;

import org.obeonetwork.dsl.east_adl.structure.allocation_model.AllocationModel;
import org.obeonetwork.dsl.east_adl.structure.allocation_model.Allocation_modelPackage;

import org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstance;
import org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstanceModel;
import org.obeonetwork.dsl.east_adl.structure.function_instance_model.Function_instance_modelPackage;
import org.obeonetwork.dsl.east_adl.structure.function_instance_model.LogicalCluster;
import org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstance;

import org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.FunctionalDesignArchitecture;
import org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Functional_design_architecturePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Instance Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.FunctionInstanceModelImpl#getDesignArchitecture <em>Design Architecture</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.FunctionInstanceModelImpl#getFunctionInstances <em>Function Instances</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.FunctionInstanceModelImpl#getLogicalClusters <em>Logical Clusters</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.FunctionInstanceModelImpl#getSignalInstances <em>Signal Instances</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.FunctionInstanceModelImpl#getAllocationModel <em>Allocation Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionInstanceModelImpl extends EASTADLArtifactImpl implements FunctionInstanceModel {
	/**
	 * The cached value of the '{@link #getDesignArchitecture() <em>Design Architecture</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignArchitecture()
	 * @generated
	 * @ordered
	 */
	protected FunctionalDesignArchitecture designArchitecture;

	/**
	 * The cached value of the '{@link #getFunctionInstances() <em>Function Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionInstance> functionInstances;

	/**
	 * The cached value of the '{@link #getLogicalClusters() <em>Logical Clusters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalClusters()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalCluster> logicalClusters;

	/**
	 * The cached value of the '{@link #getSignalInstances() <em>Signal Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<SignalInstance> signalInstances;

	/**
	 * The cached value of the '{@link #getAllocationModel() <em>Allocation Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocationModel()
	 * @generated
	 * @ordered
	 */
	protected AllocationModel allocationModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionInstanceModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Function_instance_modelPackage.Literals.FUNCTION_INSTANCE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalDesignArchitecture getDesignArchitecture() {
		if (designArchitecture != null && designArchitecture.eIsProxy()) {
			InternalEObject oldDesignArchitecture = (InternalEObject)designArchitecture;
			designArchitecture = (FunctionalDesignArchitecture)eResolveProxy(oldDesignArchitecture);
			if (designArchitecture != oldDesignArchitecture) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Function_instance_modelPackage.FUNCTION_INSTANCE_MODEL__DESIGN_ARCHITECTURE, oldDesignArchitecture, designArchitecture));
			}
		}
		return designArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalDesignArchitecture basicGetDesignArchitecture() {
		return designArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDesignArchitecture(FunctionalDesignArchitecture newDesignArchitecture, NotificationChain msgs) {
		FunctionalDesignArchitecture oldDesignArchitecture = designArchitecture;
		designArchitecture = newDesignArchitecture;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Function_instance_modelPackage.FUNCTION_INSTANCE_MODEL__DESIGN_ARCHITECTURE, oldDesignArchitecture, newDesignArchitecture);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesignArchitecture(FunctionalDesignArchitecture newDesignArchitecture) {
		if (newDesignArchitecture != designArchitecture) {
			NotificationChain msgs = null;
			if (designArchitecture != null)
				msgs = ((InternalEObject)designArchitecture).eInverseRemove(this, Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__INSTANCE_MODEL, FunctionalDesignArchitecture.class, msgs);
			if (newDesignArchitecture != null)
				msgs = ((InternalEObject)newDesignArchitecture).eInverseAdd(this, Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__INSTANCE_MODEL, FunctionalDesignArchitecture.class, msgs);
			msgs = basicSetDesignArchitecture(newDesignArchitecture, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Function_instance_modelPackage.FUNCTION_INSTANCE_MODEL__DESIGN_ARCHITECTURE, newDesignArchitecture, newDesignArchitecture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionInstance> getFunctionInstances() {
		if (functionInstances == null) {
			functionInstances = new EObjectContainmentEList<FunctionInstance>(FunctionInstance.class, this, Function_instance_modelPackage.FUNCTION_INSTANCE_MODEL__FUNCTION_INSTANCES);
		}
		return functionInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogicalCluster> getLogicalClusters() {
		if (logicalClusters == null) {
			logicalClusters = new EObjectContainmentEList<LogicalCluster>(LogicalCluster.class, this, Function_instance_modelPackage.FUNCTION_INSTANCE_MODEL__LOGICAL_CLUSTERS);
		}
		return logicalClusters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SignalInstance> getSignalInstances() {
		if (signalInstances == null) {
			signalInstances = new EObjectContainmentEList<SignalInstance>(SignalInstance.class, this, Function_instance_modelPackage.FUNCTION_INSTANCE_MODEL__SIGNAL_INSTANCES);
		}
		return signalInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationModel getAllocationModel() {
		if (allocationModel != null && allocationModel.eIsProxy()) {
			InternalEObject oldAllocationModel = (InternalEObject)allocationModel;
			allocationModel = (AllocationModel)eResolveProxy(oldAllocationModel);
			if (allocationModel != oldAllocationModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Function_instance_modelPackage.FUNCTION_INSTANCE_MODEL__ALLOCATION_MODEL, oldAllocationModel, allocationModel));
			}
		}
		return allocationModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationModel basicGetAllocationModel() {
		return allocationModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllocationModel(AllocationModel newAllocationModel, NotificationChain msgs) {
		AllocationModel oldAllocationModel = allocationModel;
		allocationModel = newAllocationModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Function_instance_modelPackage.FUNCTION_INSTANCE_MODEL__ALLOCATION_MODEL, oldAllocationModel, newAllocationModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllocationModel(AllocationModel newAllocationModel) {
		if (newAllocationModel != allocationModel) {
			NotificationChain msgs = null;
			if (allocationModel != null)
				msgs = ((InternalEObject)allocationModel).eInverseRemove(this, Allocation_modelPackage.ALLOCATION_MODEL__INSTANCE_MODEL, AllocationModel.class, msgs);
			if (newAllocationModel != null)
				msgs = ((InternalEObject)newAllocationModel).eInverseAdd(this, Allocation_modelPackage.ALLOCATION_MODEL__INSTANCE_MODEL, AllocationModel.class, msgs);
			msgs = basicSetAllocationModel(newAllocationModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Function_instance_modelPackage.FUNCTION_INSTANCE_MODEL__ALLOCATION_MODEL, newAllocationModel, newAllocationModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Function_instance_modelPackage.FUNCTION_INSTANCE_MODEL__DESIGN_ARCHITECTURE:
				if (designArchitecture != null)
					msgs = ((InternalEObject)designArchitecture).eInverseRemove(this, Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__INSTANCE_MODEL, FunctionalDesignArchitecture.class, msgs);
				return basicSetDesignArchitecture((FunctionalDesignArchitecture)otherEnd, msgs);
			case Function_instance_modelPackage.FUNCTION_INSTANCE_MODEL__ALLOCATION_MODEL:
				if (allocationModel != null)
					msgs = ((InternalEObject)allocationModel).eInverseRemove(this, Allocation_modelPackage.ALLOCATION_MODEL__INSTANCE_MODEL, AllocationModel.class, msgs);
				return basicSetAllocationModel((AllocationModel)otherEnd, msgs);
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
			case Function_instance_modelPackage.FUNCTION_INSTANCE_MODEL__DESIGN_ARCHITECTURE:
				return basicSetDesignArchitecture(null, msgs);
			case Function_instance_modelPackage.FUNCTION_INSTANCE_MODEL__FUNCTION_INSTANCES:
				return ((InternalEList<?>)getFunctionInstances()).basicRemove(otherEnd, msgs);
			case Function_instance_modelPackage.FUNCTION_INSTANCE_MODEL__LOGICAL_CLUSTERS:
				return ((InternalEList<?>)getLogicalClusters()).basicRemove(otherEnd, msgs);
			case Function_instance_modelPackage.FUNCTION_INSTANCE_MODEL__SIGNAL_INSTANCES:
				return ((InternalEList<?>)getSignalInstances()).basicRemove(otherEnd, msgs);
			case Function_instance_modelPackage.FUNCTION_INSTANCE_MODEL__ALLOCATION_MODEL:
				return basicSetAllocationModel(null, msgs);
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
			case Function_instance_modelPackage.FUNCTION_INSTANCE_MODEL__DESIGN_ARCHITECTURE:
				if (resolve) return getDesignArchitecture();
				return basicGetDesignArchitecture();
			case Function_instance_modelPackage.FUNCTION_INSTANCE_MODEL__FUNCTION_INSTANCES:
				return getFunctionInstances();
			case Function_instance_modelPackage.FUNCTION_INSTANCE_MODEL__LOGICAL_CLUSTERS:
				return getLogicalClusters();
			case Function_instance_modelPackage.FUNCTION_INSTANCE_MODEL__SIGNAL_INSTANCES:
				return getSignalInstances();
			case Function_instance_modelPackage.FUNCTION_INSTANCE_MODEL__ALLOCATION_MODEL:
				if (resolve) return getAllocationModel();
				return basicGetAllocationModel();
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
			case Function_instance_modelPackage.FUNCTION_INSTANCE_MODEL__DESIGN_ARCHITECTURE:
				setDesignArchitecture((FunctionalDesignArchitecture)newValue);
				return;
			case Function_instance_modelPackage.FUNCTION_INSTANCE_MODEL__FUNCTION_INSTANCES:
				getFunctionInstances().clear();
				getFunctionInstances().addAll((Collection<? extends FunctionInstance>)newValue);
				return;
			case Function_instance_modelPackage.FUNCTION_INSTANCE_MODEL__LOGICAL_CLUSTERS:
				getLogicalClusters().clear();
				getLogicalClusters().addAll((Collection<? extends LogicalCluster>)newValue);
				return;
			case Function_instance_modelPackage.FUNCTION_INSTANCE_MODEL__SIGNAL_INSTANCES:
				getSignalInstances().clear();
				getSignalInstances().addAll((Collection<? extends SignalInstance>)newValue);
				return;
			case Function_instance_modelPackage.FUNCTION_INSTANCE_MODEL__ALLOCATION_MODEL:
				setAllocationModel((AllocationModel)newValue);
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
			case Function_instance_modelPackage.FUNCTION_INSTANCE_MODEL__DESIGN_ARCHITECTURE:
				setDesignArchitecture((FunctionalDesignArchitecture)null);
				return;
			case Function_instance_modelPackage.FUNCTION_INSTANCE_MODEL__FUNCTION_INSTANCES:
				getFunctionInstances().clear();
				return;
			case Function_instance_modelPackage.FUNCTION_INSTANCE_MODEL__LOGICAL_CLUSTERS:
				getLogicalClusters().clear();
				return;
			case Function_instance_modelPackage.FUNCTION_INSTANCE_MODEL__SIGNAL_INSTANCES:
				getSignalInstances().clear();
				return;
			case Function_instance_modelPackage.FUNCTION_INSTANCE_MODEL__ALLOCATION_MODEL:
				setAllocationModel((AllocationModel)null);
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
			case Function_instance_modelPackage.FUNCTION_INSTANCE_MODEL__DESIGN_ARCHITECTURE:
				return designArchitecture != null;
			case Function_instance_modelPackage.FUNCTION_INSTANCE_MODEL__FUNCTION_INSTANCES:
				return functionInstances != null && !functionInstances.isEmpty();
			case Function_instance_modelPackage.FUNCTION_INSTANCE_MODEL__LOGICAL_CLUSTERS:
				return logicalClusters != null && !logicalClusters.isEmpty();
			case Function_instance_modelPackage.FUNCTION_INSTANCE_MODEL__SIGNAL_INSTANCES:
				return signalInstances != null && !signalInstances.isEmpty();
			case Function_instance_modelPackage.FUNCTION_INSTANCE_MODEL__ALLOCATION_MODEL:
				return allocationModel != null;
		}
		return super.eIsSet(featureID);
	}

} //FunctionInstanceModelImpl
