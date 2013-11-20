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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.east_adl.core.impl.EASTADLEntityImpl;

import org.obeonetwork.dsl.east_adl.requirements.TimingRestriction;

import org.obeonetwork.dsl.east_adl.structure.allocation_model.AllocationModel;
import org.obeonetwork.dsl.east_adl.structure.allocation_model.Allocation_modelPackage;
import org.obeonetwork.dsl.east_adl.structure.allocation_model.FunctionDeployment;
import org.obeonetwork.dsl.east_adl.structure.allocation_model.OSTask;

import org.obeonetwork.dsl.east_adl.structure.common.TriggerKind;

import org.obeonetwork.dsl.east_adl.structure.function_instance_model.LogicalCluster;

import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OS Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.impl.OSTaskImpl#getOwningArtifact <em>Owning Artifact</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.impl.OSTaskImpl#getTriggerType <em>Trigger Type</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.impl.OSTaskImpl#getTriggerEvent <em>Trigger Event</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.impl.OSTaskImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.impl.OSTaskImpl#isPreemptable <em>Preemptable</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.impl.OSTaskImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.impl.OSTaskImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.impl.OSTaskImpl#getExecutionTime <em>Execution Time</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.impl.OSTaskImpl#getDeployments <em>Deployments</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.impl.OSTaskImpl#getDeployedClusters <em>Deployed Clusters</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.impl.OSTaskImpl#getExecutingProcessor <em>Executing Processor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OSTaskImpl extends EASTADLEntityImpl implements OSTask {
	/**
	 * The default value of the '{@link #getTriggerType() <em>Trigger Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerType()
	 * @generated
	 * @ordered
	 */
	protected static final TriggerKind TRIGGER_TYPE_EDEFAULT = TriggerKind.EVENT;

	/**
	 * The cached value of the '{@link #getTriggerType() <em>Trigger Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerType()
	 * @generated
	 * @ordered
	 */
	protected TriggerKind triggerType = TRIGGER_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTriggerEvent() <em>Trigger Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerEvent()
	 * @generated
	 * @ordered
	 */
	protected static final String TRIGGER_EVENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTriggerEvent() <em>Trigger Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerEvent()
	 * @generated
	 * @ordered
	 */
	protected String triggerEvent = TRIGGER_EVENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected int priority = PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isPreemptable() <em>Preemptable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPreemptable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PREEMPTABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPreemptable() <em>Preemptable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPreemptable()
	 * @generated
	 * @ordered
	 */
	protected boolean preemptable = PREEMPTABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected TimingRestriction period;

	/**
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected TimingRestriction offset;

	/**
	 * The cached value of the '{@link #getExecutionTime() <em>Execution Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionTime()
	 * @generated
	 * @ordered
	 */
	protected TimingRestriction executionTime;

	/**
	 * The cached value of the '{@link #getDeployments() <em>Deployments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployments()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionDeployment> deployments;

	/**
	 * The cached value of the '{@link #getExecutingProcessor() <em>Executing Processor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutingProcessor()
	 * @generated
	 * @ordered
	 */
	protected Processor executingProcessor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OSTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Allocation_modelPackage.Literals.OS_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationModel getOwningArtifact() {
		if (eContainerFeatureID() != Allocation_modelPackage.OS_TASK__OWNING_ARTIFACT) return null;
		return (AllocationModel)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningArtifact(AllocationModel newOwningArtifact, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningArtifact, Allocation_modelPackage.OS_TASK__OWNING_ARTIFACT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningArtifact(AllocationModel newOwningArtifact) {
		if (newOwningArtifact != eInternalContainer() || (eContainerFeatureID() != Allocation_modelPackage.OS_TASK__OWNING_ARTIFACT && newOwningArtifact != null)) {
			if (EcoreUtil.isAncestor(this, newOwningArtifact))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningArtifact != null)
				msgs = ((InternalEObject)newOwningArtifact).eInverseAdd(this, Allocation_modelPackage.ALLOCATION_MODEL__TASKS, AllocationModel.class, msgs);
			msgs = basicSetOwningArtifact(newOwningArtifact, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Allocation_modelPackage.OS_TASK__OWNING_ARTIFACT, newOwningArtifact, newOwningArtifact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerKind getTriggerType() {
		return triggerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTriggerType(TriggerKind newTriggerType) {
		TriggerKind oldTriggerType = triggerType;
		triggerType = newTriggerType == null ? TRIGGER_TYPE_EDEFAULT : newTriggerType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Allocation_modelPackage.OS_TASK__TRIGGER_TYPE, oldTriggerType, triggerType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTriggerEvent() {
		return triggerEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTriggerEvent(String newTriggerEvent) {
		String oldTriggerEvent = triggerEvent;
		triggerEvent = newTriggerEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Allocation_modelPackage.OS_TASK__TRIGGER_EVENT, oldTriggerEvent, triggerEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(int newPriority) {
		int oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Allocation_modelPackage.OS_TASK__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPreemptable() {
		return preemptable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreemptable(boolean newPreemptable) {
		boolean oldPreemptable = preemptable;
		preemptable = newPreemptable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Allocation_modelPackage.OS_TASK__PREEMPTABLE, oldPreemptable, preemptable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingRestriction getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriod(TimingRestriction newPeriod, NotificationChain msgs) {
		TimingRestriction oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Allocation_modelPackage.OS_TASK__PERIOD, oldPeriod, newPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(TimingRestriction newPeriod) {
		if (newPeriod != period) {
			NotificationChain msgs = null;
			if (period != null)
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Allocation_modelPackage.OS_TASK__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Allocation_modelPackage.OS_TASK__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Allocation_modelPackage.OS_TASK__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingRestriction getOffset() {
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOffset(TimingRestriction newOffset, NotificationChain msgs) {
		TimingRestriction oldOffset = offset;
		offset = newOffset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Allocation_modelPackage.OS_TASK__OFFSET, oldOffset, newOffset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffset(TimingRestriction newOffset) {
		if (newOffset != offset) {
			NotificationChain msgs = null;
			if (offset != null)
				msgs = ((InternalEObject)offset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Allocation_modelPackage.OS_TASK__OFFSET, null, msgs);
			if (newOffset != null)
				msgs = ((InternalEObject)newOffset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Allocation_modelPackage.OS_TASK__OFFSET, null, msgs);
			msgs = basicSetOffset(newOffset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Allocation_modelPackage.OS_TASK__OFFSET, newOffset, newOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingRestriction getExecutionTime() {
		return executionTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExecutionTime(TimingRestriction newExecutionTime, NotificationChain msgs) {
		TimingRestriction oldExecutionTime = executionTime;
		executionTime = newExecutionTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Allocation_modelPackage.OS_TASK__EXECUTION_TIME, oldExecutionTime, newExecutionTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutionTime(TimingRestriction newExecutionTime) {
		if (newExecutionTime != executionTime) {
			NotificationChain msgs = null;
			if (executionTime != null)
				msgs = ((InternalEObject)executionTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Allocation_modelPackage.OS_TASK__EXECUTION_TIME, null, msgs);
			if (newExecutionTime != null)
				msgs = ((InternalEObject)newExecutionTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Allocation_modelPackage.OS_TASK__EXECUTION_TIME, null, msgs);
			msgs = basicSetExecutionTime(newExecutionTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Allocation_modelPackage.OS_TASK__EXECUTION_TIME, newExecutionTime, newExecutionTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionDeployment> getDeployments() {
		if (deployments == null) {
			deployments = new EObjectContainmentWithInverseEList<FunctionDeployment>(FunctionDeployment.class, this, Allocation_modelPackage.OS_TASK__DEPLOYMENTS, Allocation_modelPackage.FUNCTION_DEPLOYMENT__DEPLOYER);
		}
		return deployments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogicalCluster> getDeployedClusters() {
		// TODO: implement this method to return the 'Deployed Clusters' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Processor getExecutingProcessor() {
		if (executingProcessor != null && executingProcessor.eIsProxy()) {
			InternalEObject oldExecutingProcessor = (InternalEObject)executingProcessor;
			executingProcessor = (Processor)eResolveProxy(oldExecutingProcessor);
			if (executingProcessor != oldExecutingProcessor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Allocation_modelPackage.OS_TASK__EXECUTING_PROCESSOR, oldExecutingProcessor, executingProcessor));
			}
		}
		return executingProcessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Processor basicGetExecutingProcessor() {
		return executingProcessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExecutingProcessor(Processor newExecutingProcessor, NotificationChain msgs) {
		Processor oldExecutingProcessor = executingProcessor;
		executingProcessor = newExecutingProcessor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Allocation_modelPackage.OS_TASK__EXECUTING_PROCESSOR, oldExecutingProcessor, newExecutingProcessor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutingProcessor(Processor newExecutingProcessor) {
		if (newExecutingProcessor != executingProcessor) {
			NotificationChain msgs = null;
			if (executingProcessor != null)
				msgs = ((InternalEObject)executingProcessor).eInverseRemove(this, Hardware_architecturePackage.PROCESSOR__TASKS, Processor.class, msgs);
			if (newExecutingProcessor != null)
				msgs = ((InternalEObject)newExecutingProcessor).eInverseAdd(this, Hardware_architecturePackage.PROCESSOR__TASKS, Processor.class, msgs);
			msgs = basicSetExecutingProcessor(newExecutingProcessor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Allocation_modelPackage.OS_TASK__EXECUTING_PROCESSOR, newExecutingProcessor, newExecutingProcessor));
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
			case Allocation_modelPackage.OS_TASK__OWNING_ARTIFACT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningArtifact((AllocationModel)otherEnd, msgs);
			case Allocation_modelPackage.OS_TASK__DEPLOYMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDeployments()).basicAdd(otherEnd, msgs);
			case Allocation_modelPackage.OS_TASK__EXECUTING_PROCESSOR:
				if (executingProcessor != null)
					msgs = ((InternalEObject)executingProcessor).eInverseRemove(this, Hardware_architecturePackage.PROCESSOR__TASKS, Processor.class, msgs);
				return basicSetExecutingProcessor((Processor)otherEnd, msgs);
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
			case Allocation_modelPackage.OS_TASK__OWNING_ARTIFACT:
				return basicSetOwningArtifact(null, msgs);
			case Allocation_modelPackage.OS_TASK__PERIOD:
				return basicSetPeriod(null, msgs);
			case Allocation_modelPackage.OS_TASK__OFFSET:
				return basicSetOffset(null, msgs);
			case Allocation_modelPackage.OS_TASK__EXECUTION_TIME:
				return basicSetExecutionTime(null, msgs);
			case Allocation_modelPackage.OS_TASK__DEPLOYMENTS:
				return ((InternalEList<?>)getDeployments()).basicRemove(otherEnd, msgs);
			case Allocation_modelPackage.OS_TASK__EXECUTING_PROCESSOR:
				return basicSetExecutingProcessor(null, msgs);
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
			case Allocation_modelPackage.OS_TASK__OWNING_ARTIFACT:
				return eInternalContainer().eInverseRemove(this, Allocation_modelPackage.ALLOCATION_MODEL__TASKS, AllocationModel.class, msgs);
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
			case Allocation_modelPackage.OS_TASK__OWNING_ARTIFACT:
				return getOwningArtifact();
			case Allocation_modelPackage.OS_TASK__TRIGGER_TYPE:
				return getTriggerType();
			case Allocation_modelPackage.OS_TASK__TRIGGER_EVENT:
				return getTriggerEvent();
			case Allocation_modelPackage.OS_TASK__PRIORITY:
				return getPriority();
			case Allocation_modelPackage.OS_TASK__PREEMPTABLE:
				return isPreemptable();
			case Allocation_modelPackage.OS_TASK__PERIOD:
				return getPeriod();
			case Allocation_modelPackage.OS_TASK__OFFSET:
				return getOffset();
			case Allocation_modelPackage.OS_TASK__EXECUTION_TIME:
				return getExecutionTime();
			case Allocation_modelPackage.OS_TASK__DEPLOYMENTS:
				return getDeployments();
			case Allocation_modelPackage.OS_TASK__DEPLOYED_CLUSTERS:
				return getDeployedClusters();
			case Allocation_modelPackage.OS_TASK__EXECUTING_PROCESSOR:
				if (resolve) return getExecutingProcessor();
				return basicGetExecutingProcessor();
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
			case Allocation_modelPackage.OS_TASK__OWNING_ARTIFACT:
				setOwningArtifact((AllocationModel)newValue);
				return;
			case Allocation_modelPackage.OS_TASK__TRIGGER_TYPE:
				setTriggerType((TriggerKind)newValue);
				return;
			case Allocation_modelPackage.OS_TASK__TRIGGER_EVENT:
				setTriggerEvent((String)newValue);
				return;
			case Allocation_modelPackage.OS_TASK__PRIORITY:
				setPriority((Integer)newValue);
				return;
			case Allocation_modelPackage.OS_TASK__PREEMPTABLE:
				setPreemptable((Boolean)newValue);
				return;
			case Allocation_modelPackage.OS_TASK__PERIOD:
				setPeriod((TimingRestriction)newValue);
				return;
			case Allocation_modelPackage.OS_TASK__OFFSET:
				setOffset((TimingRestriction)newValue);
				return;
			case Allocation_modelPackage.OS_TASK__EXECUTION_TIME:
				setExecutionTime((TimingRestriction)newValue);
				return;
			case Allocation_modelPackage.OS_TASK__DEPLOYMENTS:
				getDeployments().clear();
				getDeployments().addAll((Collection<? extends FunctionDeployment>)newValue);
				return;
			case Allocation_modelPackage.OS_TASK__EXECUTING_PROCESSOR:
				setExecutingProcessor((Processor)newValue);
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
			case Allocation_modelPackage.OS_TASK__OWNING_ARTIFACT:
				setOwningArtifact((AllocationModel)null);
				return;
			case Allocation_modelPackage.OS_TASK__TRIGGER_TYPE:
				setTriggerType(TRIGGER_TYPE_EDEFAULT);
				return;
			case Allocation_modelPackage.OS_TASK__TRIGGER_EVENT:
				setTriggerEvent(TRIGGER_EVENT_EDEFAULT);
				return;
			case Allocation_modelPackage.OS_TASK__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case Allocation_modelPackage.OS_TASK__PREEMPTABLE:
				setPreemptable(PREEMPTABLE_EDEFAULT);
				return;
			case Allocation_modelPackage.OS_TASK__PERIOD:
				setPeriod((TimingRestriction)null);
				return;
			case Allocation_modelPackage.OS_TASK__OFFSET:
				setOffset((TimingRestriction)null);
				return;
			case Allocation_modelPackage.OS_TASK__EXECUTION_TIME:
				setExecutionTime((TimingRestriction)null);
				return;
			case Allocation_modelPackage.OS_TASK__DEPLOYMENTS:
				getDeployments().clear();
				return;
			case Allocation_modelPackage.OS_TASK__EXECUTING_PROCESSOR:
				setExecutingProcessor((Processor)null);
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
			case Allocation_modelPackage.OS_TASK__OWNING_ARTIFACT:
				return getOwningArtifact() != null;
			case Allocation_modelPackage.OS_TASK__TRIGGER_TYPE:
				return triggerType != TRIGGER_TYPE_EDEFAULT;
			case Allocation_modelPackage.OS_TASK__TRIGGER_EVENT:
				return TRIGGER_EVENT_EDEFAULT == null ? triggerEvent != null : !TRIGGER_EVENT_EDEFAULT.equals(triggerEvent);
			case Allocation_modelPackage.OS_TASK__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case Allocation_modelPackage.OS_TASK__PREEMPTABLE:
				return preemptable != PREEMPTABLE_EDEFAULT;
			case Allocation_modelPackage.OS_TASK__PERIOD:
				return period != null;
			case Allocation_modelPackage.OS_TASK__OFFSET:
				return offset != null;
			case Allocation_modelPackage.OS_TASK__EXECUTION_TIME:
				return executionTime != null;
			case Allocation_modelPackage.OS_TASK__DEPLOYMENTS:
				return deployments != null && !deployments.isEmpty();
			case Allocation_modelPackage.OS_TASK__DEPLOYED_CLUSTERS:
				return !getDeployedClusters().isEmpty();
			case Allocation_modelPackage.OS_TASK__EXECUTING_PROCESSOR:
				return executingProcessor != null;
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
		result.append(" (triggerType: ");
		result.append(triggerType);
		result.append(", triggerEvent: ");
		result.append(triggerEvent);
		result.append(", priority: ");
		result.append(priority);
		result.append(", preemptable: ");
		result.append(preemptable);
		result.append(')');
		return result.toString();
	}

} //OSTaskImpl
