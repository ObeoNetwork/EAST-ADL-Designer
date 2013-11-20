/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.platform_model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.obeonetwork.dsl.east_adl.core.impl.EASTADLEntityImpl;

import org.obeonetwork.dsl.east_adl.requirements.TimingRestriction;

import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor;

import org.obeonetwork.dsl.east_adl.structure.platform_model.ExecutionModelKind;
import org.obeonetwork.dsl.east_adl.structure.platform_model.OperatingSystem;
import org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel;
import org.obeonetwork.dsl.east_adl.structure.platform_model.Platform_modelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operating System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.platform_model.impl.OperatingSystemImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.platform_model.impl.OperatingSystemImpl#getExecutionModelType <em>Execution Model Type</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.platform_model.impl.OperatingSystemImpl#getBlockingFactor <em>Blocking Factor</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.platform_model.impl.OperatingSystemImpl#getTaskSwitchTime <em>Task Switch Time</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.platform_model.impl.OperatingSystemImpl#getOwningArtifact <em>Owning Artifact</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.platform_model.impl.OperatingSystemImpl#getProcessor <em>Processor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperatingSystemImpl extends EASTADLEntityImpl implements OperatingSystem {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExecutionModelType() <em>Execution Model Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionModelType()
	 * @generated
	 * @ordered
	 */
	protected static final ExecutionModelKind EXECUTION_MODEL_TYPE_EDEFAULT = ExecutionModelKind.FIXED_PRIORITY;

	/**
	 * The cached value of the '{@link #getExecutionModelType() <em>Execution Model Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionModelType()
	 * @generated
	 * @ordered
	 */
	protected ExecutionModelKind executionModelType = EXECUTION_MODEL_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBlockingFactor() <em>Blocking Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockingFactor()
	 * @generated
	 * @ordered
	 */
	protected TimingRestriction blockingFactor;

	/**
	 * The cached value of the '{@link #getTaskSwitchTime() <em>Task Switch Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskSwitchTime()
	 * @generated
	 * @ordered
	 */
	protected TimingRestriction taskSwitchTime;

	/**
	 * The cached value of the '{@link #getProcessor() <em>Processor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessor()
	 * @generated
	 * @ordered
	 */
	protected Processor processor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperatingSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Platform_modelPackage.Literals.OPERATING_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Platform_modelPackage.OPERATING_SYSTEM__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionModelKind getExecutionModelType() {
		return executionModelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutionModelType(ExecutionModelKind newExecutionModelType) {
		ExecutionModelKind oldExecutionModelType = executionModelType;
		executionModelType = newExecutionModelType == null ? EXECUTION_MODEL_TYPE_EDEFAULT : newExecutionModelType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Platform_modelPackage.OPERATING_SYSTEM__EXECUTION_MODEL_TYPE, oldExecutionModelType, executionModelType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingRestriction getBlockingFactor() {
		return blockingFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBlockingFactor(TimingRestriction newBlockingFactor, NotificationChain msgs) {
		TimingRestriction oldBlockingFactor = blockingFactor;
		blockingFactor = newBlockingFactor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Platform_modelPackage.OPERATING_SYSTEM__BLOCKING_FACTOR, oldBlockingFactor, newBlockingFactor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlockingFactor(TimingRestriction newBlockingFactor) {
		if (newBlockingFactor != blockingFactor) {
			NotificationChain msgs = null;
			if (blockingFactor != null)
				msgs = ((InternalEObject)blockingFactor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Platform_modelPackage.OPERATING_SYSTEM__BLOCKING_FACTOR, null, msgs);
			if (newBlockingFactor != null)
				msgs = ((InternalEObject)newBlockingFactor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Platform_modelPackage.OPERATING_SYSTEM__BLOCKING_FACTOR, null, msgs);
			msgs = basicSetBlockingFactor(newBlockingFactor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Platform_modelPackage.OPERATING_SYSTEM__BLOCKING_FACTOR, newBlockingFactor, newBlockingFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingRestriction getTaskSwitchTime() {
		return taskSwitchTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTaskSwitchTime(TimingRestriction newTaskSwitchTime, NotificationChain msgs) {
		TimingRestriction oldTaskSwitchTime = taskSwitchTime;
		taskSwitchTime = newTaskSwitchTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Platform_modelPackage.OPERATING_SYSTEM__TASK_SWITCH_TIME, oldTaskSwitchTime, newTaskSwitchTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaskSwitchTime(TimingRestriction newTaskSwitchTime) {
		if (newTaskSwitchTime != taskSwitchTime) {
			NotificationChain msgs = null;
			if (taskSwitchTime != null)
				msgs = ((InternalEObject)taskSwitchTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Platform_modelPackage.OPERATING_SYSTEM__TASK_SWITCH_TIME, null, msgs);
			if (newTaskSwitchTime != null)
				msgs = ((InternalEObject)newTaskSwitchTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Platform_modelPackage.OPERATING_SYSTEM__TASK_SWITCH_TIME, null, msgs);
			msgs = basicSetTaskSwitchTime(newTaskSwitchTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Platform_modelPackage.OPERATING_SYSTEM__TASK_SWITCH_TIME, newTaskSwitchTime, newTaskSwitchTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformModel getOwningArtifact() {
		if (eContainerFeatureID() != Platform_modelPackage.OPERATING_SYSTEM__OWNING_ARTIFACT) return null;
		return (PlatformModel)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningArtifact(PlatformModel newOwningArtifact, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningArtifact, Platform_modelPackage.OPERATING_SYSTEM__OWNING_ARTIFACT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningArtifact(PlatformModel newOwningArtifact) {
		if (newOwningArtifact != eInternalContainer() || (eContainerFeatureID() != Platform_modelPackage.OPERATING_SYSTEM__OWNING_ARTIFACT && newOwningArtifact != null)) {
			if (EcoreUtil.isAncestor(this, newOwningArtifact))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningArtifact != null)
				msgs = ((InternalEObject)newOwningArtifact).eInverseAdd(this, Platform_modelPackage.PLATFORM_MODEL__OPERATING_SYSTEMS, PlatformModel.class, msgs);
			msgs = basicSetOwningArtifact(newOwningArtifact, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Platform_modelPackage.OPERATING_SYSTEM__OWNING_ARTIFACT, newOwningArtifact, newOwningArtifact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Processor getProcessor() {
		if (processor != null && processor.eIsProxy()) {
			InternalEObject oldProcessor = (InternalEObject)processor;
			processor = (Processor)eResolveProxy(oldProcessor);
			if (processor != oldProcessor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Platform_modelPackage.OPERATING_SYSTEM__PROCESSOR, oldProcessor, processor));
			}
		}
		return processor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Processor basicGetProcessor() {
		return processor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcessor(Processor newProcessor, NotificationChain msgs) {
		Processor oldProcessor = processor;
		processor = newProcessor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Platform_modelPackage.OPERATING_SYSTEM__PROCESSOR, oldProcessor, newProcessor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessor(Processor newProcessor) {
		if (newProcessor != processor) {
			NotificationChain msgs = null;
			if (processor != null)
				msgs = ((InternalEObject)processor).eInverseRemove(this, Hardware_architecturePackage.PROCESSOR__OPERATING_SYSTEMS, Processor.class, msgs);
			if (newProcessor != null)
				msgs = ((InternalEObject)newProcessor).eInverseAdd(this, Hardware_architecturePackage.PROCESSOR__OPERATING_SYSTEMS, Processor.class, msgs);
			msgs = basicSetProcessor(newProcessor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Platform_modelPackage.OPERATING_SYSTEM__PROCESSOR, newProcessor, newProcessor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Platform_modelPackage.OPERATING_SYSTEM__OWNING_ARTIFACT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningArtifact((PlatformModel)otherEnd, msgs);
			case Platform_modelPackage.OPERATING_SYSTEM__PROCESSOR:
				if (processor != null)
					msgs = ((InternalEObject)processor).eInverseRemove(this, Hardware_architecturePackage.PROCESSOR__OPERATING_SYSTEMS, Processor.class, msgs);
				return basicSetProcessor((Processor)otherEnd, msgs);
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
			case Platform_modelPackage.OPERATING_SYSTEM__BLOCKING_FACTOR:
				return basicSetBlockingFactor(null, msgs);
			case Platform_modelPackage.OPERATING_SYSTEM__TASK_SWITCH_TIME:
				return basicSetTaskSwitchTime(null, msgs);
			case Platform_modelPackage.OPERATING_SYSTEM__OWNING_ARTIFACT:
				return basicSetOwningArtifact(null, msgs);
			case Platform_modelPackage.OPERATING_SYSTEM__PROCESSOR:
				return basicSetProcessor(null, msgs);
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
			case Platform_modelPackage.OPERATING_SYSTEM__OWNING_ARTIFACT:
				return eInternalContainer().eInverseRemove(this, Platform_modelPackage.PLATFORM_MODEL__OPERATING_SYSTEMS, PlatformModel.class, msgs);
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
			case Platform_modelPackage.OPERATING_SYSTEM__TYPE:
				return getType();
			case Platform_modelPackage.OPERATING_SYSTEM__EXECUTION_MODEL_TYPE:
				return getExecutionModelType();
			case Platform_modelPackage.OPERATING_SYSTEM__BLOCKING_FACTOR:
				return getBlockingFactor();
			case Platform_modelPackage.OPERATING_SYSTEM__TASK_SWITCH_TIME:
				return getTaskSwitchTime();
			case Platform_modelPackage.OPERATING_SYSTEM__OWNING_ARTIFACT:
				return getOwningArtifact();
			case Platform_modelPackage.OPERATING_SYSTEM__PROCESSOR:
				if (resolve) return getProcessor();
				return basicGetProcessor();
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
			case Platform_modelPackage.OPERATING_SYSTEM__TYPE:
				setType((String)newValue);
				return;
			case Platform_modelPackage.OPERATING_SYSTEM__EXECUTION_MODEL_TYPE:
				setExecutionModelType((ExecutionModelKind)newValue);
				return;
			case Platform_modelPackage.OPERATING_SYSTEM__BLOCKING_FACTOR:
				setBlockingFactor((TimingRestriction)newValue);
				return;
			case Platform_modelPackage.OPERATING_SYSTEM__TASK_SWITCH_TIME:
				setTaskSwitchTime((TimingRestriction)newValue);
				return;
			case Platform_modelPackage.OPERATING_SYSTEM__OWNING_ARTIFACT:
				setOwningArtifact((PlatformModel)newValue);
				return;
			case Platform_modelPackage.OPERATING_SYSTEM__PROCESSOR:
				setProcessor((Processor)newValue);
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
			case Platform_modelPackage.OPERATING_SYSTEM__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case Platform_modelPackage.OPERATING_SYSTEM__EXECUTION_MODEL_TYPE:
				setExecutionModelType(EXECUTION_MODEL_TYPE_EDEFAULT);
				return;
			case Platform_modelPackage.OPERATING_SYSTEM__BLOCKING_FACTOR:
				setBlockingFactor((TimingRestriction)null);
				return;
			case Platform_modelPackage.OPERATING_SYSTEM__TASK_SWITCH_TIME:
				setTaskSwitchTime((TimingRestriction)null);
				return;
			case Platform_modelPackage.OPERATING_SYSTEM__OWNING_ARTIFACT:
				setOwningArtifact((PlatformModel)null);
				return;
			case Platform_modelPackage.OPERATING_SYSTEM__PROCESSOR:
				setProcessor((Processor)null);
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
			case Platform_modelPackage.OPERATING_SYSTEM__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case Platform_modelPackage.OPERATING_SYSTEM__EXECUTION_MODEL_TYPE:
				return executionModelType != EXECUTION_MODEL_TYPE_EDEFAULT;
			case Platform_modelPackage.OPERATING_SYSTEM__BLOCKING_FACTOR:
				return blockingFactor != null;
			case Platform_modelPackage.OPERATING_SYSTEM__TASK_SWITCH_TIME:
				return taskSwitchTime != null;
			case Platform_modelPackage.OPERATING_SYSTEM__OWNING_ARTIFACT:
				return getOwningArtifact() != null;
			case Platform_modelPackage.OPERATING_SYSTEM__PROCESSOR:
				return processor != null;
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
		result.append(" (type: ");
		result.append(type);
		result.append(", executionModelType: ");
		result.append(executionModelType);
		result.append(')');
		return result.toString();
	}

} //OperatingSystemImpl
