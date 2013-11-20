/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.allocation_model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.east_adl.core.impl.EASTADLArtifactImpl;

import org.obeonetwork.dsl.east_adl.structure.allocation_model.AllocationModel;
import org.obeonetwork.dsl.east_adl.structure.allocation_model.Allocation_modelPackage;
import org.obeonetwork.dsl.east_adl.structure.allocation_model.CommunicationBuffer;
import org.obeonetwork.dsl.east_adl.structure.allocation_model.Frame;
import org.obeonetwork.dsl.east_adl.structure.allocation_model.OSTask;

import org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstanceModel;
import org.obeonetwork.dsl.east_adl.structure.function_instance_model.Function_instance_modelPackage;

import org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel;
import org.obeonetwork.dsl.east_adl.structure.platform_model.Platform_modelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Allocation Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.impl.AllocationModelImpl#getFrames <em>Frames</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.impl.AllocationModelImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.impl.AllocationModelImpl#getCommunicationBuffers <em>Communication Buffers</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.impl.AllocationModelImpl#getPlatformModel <em>Platform Model</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.impl.AllocationModelImpl#getInstanceModel <em>Instance Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AllocationModelImpl extends EASTADLArtifactImpl implements AllocationModel {
	/**
	 * The cached value of the '{@link #getFrames() <em>Frames</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrames()
	 * @generated
	 * @ordered
	 */
	protected EList<Frame> frames;

	/**
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<OSTask> tasks;

	/**
	 * The cached value of the '{@link #getCommunicationBuffers() <em>Communication Buffers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationBuffers()
	 * @generated
	 * @ordered
	 */
	protected EList<CommunicationBuffer> communicationBuffers;

	/**
	 * The cached value of the '{@link #getPlatformModel() <em>Platform Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatformModel()
	 * @generated
	 * @ordered
	 */
	protected PlatformModel platformModel;

	/**
	 * The cached value of the '{@link #getInstanceModel() <em>Instance Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceModel()
	 * @generated
	 * @ordered
	 */
	protected FunctionInstanceModel instanceModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllocationModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Allocation_modelPackage.Literals.ALLOCATION_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Frame> getFrames() {
		if (frames == null) {
			frames = new EObjectContainmentWithInverseEList<Frame>(Frame.class, this, Allocation_modelPackage.ALLOCATION_MODEL__FRAMES, Allocation_modelPackage.FRAME__OWNING_ARTIFACT);
		}
		return frames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OSTask> getTasks() {
		if (tasks == null) {
			tasks = new EObjectContainmentWithInverseEList<OSTask>(OSTask.class, this, Allocation_modelPackage.ALLOCATION_MODEL__TASKS, Allocation_modelPackage.OS_TASK__OWNING_ARTIFACT);
		}
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommunicationBuffer> getCommunicationBuffers() {
		if (communicationBuffers == null) {
			communicationBuffers = new EObjectContainmentWithInverseEList<CommunicationBuffer>(CommunicationBuffer.class, this, Allocation_modelPackage.ALLOCATION_MODEL__COMMUNICATION_BUFFERS, Allocation_modelPackage.COMMUNICATION_BUFFER__OWNING_ARTIFACT);
		}
		return communicationBuffers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformModel getPlatformModel() {
		if (platformModel != null && platformModel.eIsProxy()) {
			InternalEObject oldPlatformModel = (InternalEObject)platformModel;
			platformModel = (PlatformModel)eResolveProxy(oldPlatformModel);
			if (platformModel != oldPlatformModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Allocation_modelPackage.ALLOCATION_MODEL__PLATFORM_MODEL, oldPlatformModel, platformModel));
			}
		}
		return platformModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformModel basicGetPlatformModel() {
		return platformModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlatformModel(PlatformModel newPlatformModel, NotificationChain msgs) {
		PlatformModel oldPlatformModel = platformModel;
		platformModel = newPlatformModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Allocation_modelPackage.ALLOCATION_MODEL__PLATFORM_MODEL, oldPlatformModel, newPlatformModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlatformModel(PlatformModel newPlatformModel) {
		if (newPlatformModel != platformModel) {
			NotificationChain msgs = null;
			if (platformModel != null)
				msgs = ((InternalEObject)platformModel).eInverseRemove(this, Platform_modelPackage.PLATFORM_MODEL__ALLOCATION_MODEL, PlatformModel.class, msgs);
			if (newPlatformModel != null)
				msgs = ((InternalEObject)newPlatformModel).eInverseAdd(this, Platform_modelPackage.PLATFORM_MODEL__ALLOCATION_MODEL, PlatformModel.class, msgs);
			msgs = basicSetPlatformModel(newPlatformModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Allocation_modelPackage.ALLOCATION_MODEL__PLATFORM_MODEL, newPlatformModel, newPlatformModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionInstanceModel getInstanceModel() {
		if (instanceModel != null && instanceModel.eIsProxy()) {
			InternalEObject oldInstanceModel = (InternalEObject)instanceModel;
			instanceModel = (FunctionInstanceModel)eResolveProxy(oldInstanceModel);
			if (instanceModel != oldInstanceModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Allocation_modelPackage.ALLOCATION_MODEL__INSTANCE_MODEL, oldInstanceModel, instanceModel));
			}
		}
		return instanceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionInstanceModel basicGetInstanceModel() {
		return instanceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstanceModel(FunctionInstanceModel newInstanceModel, NotificationChain msgs) {
		FunctionInstanceModel oldInstanceModel = instanceModel;
		instanceModel = newInstanceModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Allocation_modelPackage.ALLOCATION_MODEL__INSTANCE_MODEL, oldInstanceModel, newInstanceModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceModel(FunctionInstanceModel newInstanceModel) {
		if (newInstanceModel != instanceModel) {
			NotificationChain msgs = null;
			if (instanceModel != null)
				msgs = ((InternalEObject)instanceModel).eInverseRemove(this, Function_instance_modelPackage.FUNCTION_INSTANCE_MODEL__ALLOCATION_MODEL, FunctionInstanceModel.class, msgs);
			if (newInstanceModel != null)
				msgs = ((InternalEObject)newInstanceModel).eInverseAdd(this, Function_instance_modelPackage.FUNCTION_INSTANCE_MODEL__ALLOCATION_MODEL, FunctionInstanceModel.class, msgs);
			msgs = basicSetInstanceModel(newInstanceModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Allocation_modelPackage.ALLOCATION_MODEL__INSTANCE_MODEL, newInstanceModel, newInstanceModel));
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
			case Allocation_modelPackage.ALLOCATION_MODEL__FRAMES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFrames()).basicAdd(otherEnd, msgs);
			case Allocation_modelPackage.ALLOCATION_MODEL__TASKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTasks()).basicAdd(otherEnd, msgs);
			case Allocation_modelPackage.ALLOCATION_MODEL__COMMUNICATION_BUFFERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCommunicationBuffers()).basicAdd(otherEnd, msgs);
			case Allocation_modelPackage.ALLOCATION_MODEL__PLATFORM_MODEL:
				if (platformModel != null)
					msgs = ((InternalEObject)platformModel).eInverseRemove(this, Platform_modelPackage.PLATFORM_MODEL__ALLOCATION_MODEL, PlatformModel.class, msgs);
				return basicSetPlatformModel((PlatformModel)otherEnd, msgs);
			case Allocation_modelPackage.ALLOCATION_MODEL__INSTANCE_MODEL:
				if (instanceModel != null)
					msgs = ((InternalEObject)instanceModel).eInverseRemove(this, Function_instance_modelPackage.FUNCTION_INSTANCE_MODEL__ALLOCATION_MODEL, FunctionInstanceModel.class, msgs);
				return basicSetInstanceModel((FunctionInstanceModel)otherEnd, msgs);
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
			case Allocation_modelPackage.ALLOCATION_MODEL__FRAMES:
				return ((InternalEList<?>)getFrames()).basicRemove(otherEnd, msgs);
			case Allocation_modelPackage.ALLOCATION_MODEL__TASKS:
				return ((InternalEList<?>)getTasks()).basicRemove(otherEnd, msgs);
			case Allocation_modelPackage.ALLOCATION_MODEL__COMMUNICATION_BUFFERS:
				return ((InternalEList<?>)getCommunicationBuffers()).basicRemove(otherEnd, msgs);
			case Allocation_modelPackage.ALLOCATION_MODEL__PLATFORM_MODEL:
				return basicSetPlatformModel(null, msgs);
			case Allocation_modelPackage.ALLOCATION_MODEL__INSTANCE_MODEL:
				return basicSetInstanceModel(null, msgs);
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
			case Allocation_modelPackage.ALLOCATION_MODEL__FRAMES:
				return getFrames();
			case Allocation_modelPackage.ALLOCATION_MODEL__TASKS:
				return getTasks();
			case Allocation_modelPackage.ALLOCATION_MODEL__COMMUNICATION_BUFFERS:
				return getCommunicationBuffers();
			case Allocation_modelPackage.ALLOCATION_MODEL__PLATFORM_MODEL:
				if (resolve) return getPlatformModel();
				return basicGetPlatformModel();
			case Allocation_modelPackage.ALLOCATION_MODEL__INSTANCE_MODEL:
				if (resolve) return getInstanceModel();
				return basicGetInstanceModel();
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
			case Allocation_modelPackage.ALLOCATION_MODEL__FRAMES:
				getFrames().clear();
				getFrames().addAll((Collection<? extends Frame>)newValue);
				return;
			case Allocation_modelPackage.ALLOCATION_MODEL__TASKS:
				getTasks().clear();
				getTasks().addAll((Collection<? extends OSTask>)newValue);
				return;
			case Allocation_modelPackage.ALLOCATION_MODEL__COMMUNICATION_BUFFERS:
				getCommunicationBuffers().clear();
				getCommunicationBuffers().addAll((Collection<? extends CommunicationBuffer>)newValue);
				return;
			case Allocation_modelPackage.ALLOCATION_MODEL__PLATFORM_MODEL:
				setPlatformModel((PlatformModel)newValue);
				return;
			case Allocation_modelPackage.ALLOCATION_MODEL__INSTANCE_MODEL:
				setInstanceModel((FunctionInstanceModel)newValue);
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
			case Allocation_modelPackage.ALLOCATION_MODEL__FRAMES:
				getFrames().clear();
				return;
			case Allocation_modelPackage.ALLOCATION_MODEL__TASKS:
				getTasks().clear();
				return;
			case Allocation_modelPackage.ALLOCATION_MODEL__COMMUNICATION_BUFFERS:
				getCommunicationBuffers().clear();
				return;
			case Allocation_modelPackage.ALLOCATION_MODEL__PLATFORM_MODEL:
				setPlatformModel((PlatformModel)null);
				return;
			case Allocation_modelPackage.ALLOCATION_MODEL__INSTANCE_MODEL:
				setInstanceModel((FunctionInstanceModel)null);
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
			case Allocation_modelPackage.ALLOCATION_MODEL__FRAMES:
				return frames != null && !frames.isEmpty();
			case Allocation_modelPackage.ALLOCATION_MODEL__TASKS:
				return tasks != null && !tasks.isEmpty();
			case Allocation_modelPackage.ALLOCATION_MODEL__COMMUNICATION_BUFFERS:
				return communicationBuffers != null && !communicationBuffers.isEmpty();
			case Allocation_modelPackage.ALLOCATION_MODEL__PLATFORM_MODEL:
				return platformModel != null;
			case Allocation_modelPackage.ALLOCATION_MODEL__INSTANCE_MODEL:
				return instanceModel != null;
		}
		return super.eIsSet(featureID);
	}

} //AllocationModelImpl
