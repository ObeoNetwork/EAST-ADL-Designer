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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.east_adl.core.impl.EASTADLEntityImpl;

import org.obeonetwork.dsl.east_adl.requirements.TimingRestriction;

import org.obeonetwork.dsl.east_adl.structure.allocation_model.Allocation_modelPackage;
import org.obeonetwork.dsl.east_adl.structure.allocation_model.FunctionDeployment;
import org.obeonetwork.dsl.east_adl.structure.allocation_model.OSTask;

import org.obeonetwork.dsl.east_adl.structure.common.TriggerKind;

import org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstance;
import org.obeonetwork.dsl.east_adl.structure.function_instance_model.Function_instance_modelPackage;
import org.obeonetwork.dsl.east_adl.structure.function_instance_model.LogicalCluster;
import org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstance;
import org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstanceTarget;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical Cluster</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.LogicalClusterImpl#getIncomingSignals <em>Incoming Signals</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.LogicalClusterImpl#getOutgoingSignals <em>Outgoing Signals</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.LogicalClusterImpl#getFunctionInstances <em>Function Instances</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.LogicalClusterImpl#getPassiveDeployments <em>Passive Deployments</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.LogicalClusterImpl#getDeployers <em>Deployers</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.LogicalClusterImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.LogicalClusterImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.LogicalClusterImpl#getTriggerType <em>Trigger Type</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.LogicalClusterImpl#getTriggerEvent <em>Trigger Event</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LogicalClusterImpl extends EASTADLEntityImpl implements LogicalCluster {
	/**
	 * The cached value of the '{@link #getIncomingSignals() <em>Incoming Signals</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingSignals()
	 * @generated
	 * @ordered
	 */
	protected EList<SignalInstance> incomingSignals;

	/**
	 * The cached value of the '{@link #getOutgoingSignals() <em>Outgoing Signals</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingSignals()
	 * @generated
	 * @ordered
	 */
	protected EList<SignalInstance> outgoingSignals;

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
	 * The cached value of the '{@link #getPassiveDeployments() <em>Passive Deployments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassiveDeployments()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionDeployment> passiveDeployments;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalClusterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Function_instance_modelPackage.Literals.LOGICAL_CLUSTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SignalInstance> getIncomingSignals() {
		if (incomingSignals == null) {
			incomingSignals = new EObjectWithInverseResolvingEList<SignalInstance>(SignalInstance.class, this, Function_instance_modelPackage.LOGICAL_CLUSTER__INCOMING_SIGNALS, Function_instance_modelPackage.SIGNAL_INSTANCE__DESTINATION);
		}
		return incomingSignals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SignalInstance> getOutgoingSignals() {
		if (outgoingSignals == null) {
			outgoingSignals = new EObjectWithInverseResolvingEList<SignalInstance>(SignalInstance.class, this, Function_instance_modelPackage.LOGICAL_CLUSTER__OUTGOING_SIGNALS, Function_instance_modelPackage.SIGNAL_INSTANCE__SOURCE);
		}
		return outgoingSignals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionInstance> getFunctionInstances() {
		if (functionInstances == null) {
			functionInstances = new EObjectContainmentEList<FunctionInstance>(FunctionInstance.class, this, Function_instance_modelPackage.LOGICAL_CLUSTER__FUNCTION_INSTANCES);
		}
		return functionInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionDeployment> getPassiveDeployments() {
		if (passiveDeployments == null) {
			passiveDeployments = new EObjectWithInverseResolvingEList<FunctionDeployment>(FunctionDeployment.class, this, Function_instance_modelPackage.LOGICAL_CLUSTER__PASSIVE_DEPLOYMENTS, Allocation_modelPackage.FUNCTION_DEPLOYMENT__DEPLOYED);
		}
		return passiveDeployments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OSTask> getDeployers() {
		// TODO: implement this method to return the 'Deployers' reference list
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Function_instance_modelPackage.LOGICAL_CLUSTER__PERIOD, oldPeriod, newPeriod);
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
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Function_instance_modelPackage.LOGICAL_CLUSTER__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Function_instance_modelPackage.LOGICAL_CLUSTER__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Function_instance_modelPackage.LOGICAL_CLUSTER__PERIOD, newPeriod, newPeriod));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Function_instance_modelPackage.LOGICAL_CLUSTER__OFFSET, oldOffset, newOffset);
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
				msgs = ((InternalEObject)offset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Function_instance_modelPackage.LOGICAL_CLUSTER__OFFSET, null, msgs);
			if (newOffset != null)
				msgs = ((InternalEObject)newOffset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Function_instance_modelPackage.LOGICAL_CLUSTER__OFFSET, null, msgs);
			msgs = basicSetOffset(newOffset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Function_instance_modelPackage.LOGICAL_CLUSTER__OFFSET, newOffset, newOffset));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Function_instance_modelPackage.LOGICAL_CLUSTER__TRIGGER_TYPE, oldTriggerType, triggerType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Function_instance_modelPackage.LOGICAL_CLUSTER__TRIGGER_EVENT, oldTriggerEvent, triggerEvent));
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
			case Function_instance_modelPackage.LOGICAL_CLUSTER__INCOMING_SIGNALS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingSignals()).basicAdd(otherEnd, msgs);
			case Function_instance_modelPackage.LOGICAL_CLUSTER__OUTGOING_SIGNALS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingSignals()).basicAdd(otherEnd, msgs);
			case Function_instance_modelPackage.LOGICAL_CLUSTER__PASSIVE_DEPLOYMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPassiveDeployments()).basicAdd(otherEnd, msgs);
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
			case Function_instance_modelPackage.LOGICAL_CLUSTER__INCOMING_SIGNALS:
				return ((InternalEList<?>)getIncomingSignals()).basicRemove(otherEnd, msgs);
			case Function_instance_modelPackage.LOGICAL_CLUSTER__OUTGOING_SIGNALS:
				return ((InternalEList<?>)getOutgoingSignals()).basicRemove(otherEnd, msgs);
			case Function_instance_modelPackage.LOGICAL_CLUSTER__FUNCTION_INSTANCES:
				return ((InternalEList<?>)getFunctionInstances()).basicRemove(otherEnd, msgs);
			case Function_instance_modelPackage.LOGICAL_CLUSTER__PASSIVE_DEPLOYMENTS:
				return ((InternalEList<?>)getPassiveDeployments()).basicRemove(otherEnd, msgs);
			case Function_instance_modelPackage.LOGICAL_CLUSTER__PERIOD:
				return basicSetPeriod(null, msgs);
			case Function_instance_modelPackage.LOGICAL_CLUSTER__OFFSET:
				return basicSetOffset(null, msgs);
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
			case Function_instance_modelPackage.LOGICAL_CLUSTER__INCOMING_SIGNALS:
				return getIncomingSignals();
			case Function_instance_modelPackage.LOGICAL_CLUSTER__OUTGOING_SIGNALS:
				return getOutgoingSignals();
			case Function_instance_modelPackage.LOGICAL_CLUSTER__FUNCTION_INSTANCES:
				return getFunctionInstances();
			case Function_instance_modelPackage.LOGICAL_CLUSTER__PASSIVE_DEPLOYMENTS:
				return getPassiveDeployments();
			case Function_instance_modelPackage.LOGICAL_CLUSTER__DEPLOYERS:
				return getDeployers();
			case Function_instance_modelPackage.LOGICAL_CLUSTER__PERIOD:
				return getPeriod();
			case Function_instance_modelPackage.LOGICAL_CLUSTER__OFFSET:
				return getOffset();
			case Function_instance_modelPackage.LOGICAL_CLUSTER__TRIGGER_TYPE:
				return getTriggerType();
			case Function_instance_modelPackage.LOGICAL_CLUSTER__TRIGGER_EVENT:
				return getTriggerEvent();
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
			case Function_instance_modelPackage.LOGICAL_CLUSTER__INCOMING_SIGNALS:
				getIncomingSignals().clear();
				getIncomingSignals().addAll((Collection<? extends SignalInstance>)newValue);
				return;
			case Function_instance_modelPackage.LOGICAL_CLUSTER__OUTGOING_SIGNALS:
				getOutgoingSignals().clear();
				getOutgoingSignals().addAll((Collection<? extends SignalInstance>)newValue);
				return;
			case Function_instance_modelPackage.LOGICAL_CLUSTER__FUNCTION_INSTANCES:
				getFunctionInstances().clear();
				getFunctionInstances().addAll((Collection<? extends FunctionInstance>)newValue);
				return;
			case Function_instance_modelPackage.LOGICAL_CLUSTER__PASSIVE_DEPLOYMENTS:
				getPassiveDeployments().clear();
				getPassiveDeployments().addAll((Collection<? extends FunctionDeployment>)newValue);
				return;
			case Function_instance_modelPackage.LOGICAL_CLUSTER__PERIOD:
				setPeriod((TimingRestriction)newValue);
				return;
			case Function_instance_modelPackage.LOGICAL_CLUSTER__OFFSET:
				setOffset((TimingRestriction)newValue);
				return;
			case Function_instance_modelPackage.LOGICAL_CLUSTER__TRIGGER_TYPE:
				setTriggerType((TriggerKind)newValue);
				return;
			case Function_instance_modelPackage.LOGICAL_CLUSTER__TRIGGER_EVENT:
				setTriggerEvent((String)newValue);
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
			case Function_instance_modelPackage.LOGICAL_CLUSTER__INCOMING_SIGNALS:
				getIncomingSignals().clear();
				return;
			case Function_instance_modelPackage.LOGICAL_CLUSTER__OUTGOING_SIGNALS:
				getOutgoingSignals().clear();
				return;
			case Function_instance_modelPackage.LOGICAL_CLUSTER__FUNCTION_INSTANCES:
				getFunctionInstances().clear();
				return;
			case Function_instance_modelPackage.LOGICAL_CLUSTER__PASSIVE_DEPLOYMENTS:
				getPassiveDeployments().clear();
				return;
			case Function_instance_modelPackage.LOGICAL_CLUSTER__PERIOD:
				setPeriod((TimingRestriction)null);
				return;
			case Function_instance_modelPackage.LOGICAL_CLUSTER__OFFSET:
				setOffset((TimingRestriction)null);
				return;
			case Function_instance_modelPackage.LOGICAL_CLUSTER__TRIGGER_TYPE:
				setTriggerType(TRIGGER_TYPE_EDEFAULT);
				return;
			case Function_instance_modelPackage.LOGICAL_CLUSTER__TRIGGER_EVENT:
				setTriggerEvent(TRIGGER_EVENT_EDEFAULT);
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
			case Function_instance_modelPackage.LOGICAL_CLUSTER__INCOMING_SIGNALS:
				return incomingSignals != null && !incomingSignals.isEmpty();
			case Function_instance_modelPackage.LOGICAL_CLUSTER__OUTGOING_SIGNALS:
				return outgoingSignals != null && !outgoingSignals.isEmpty();
			case Function_instance_modelPackage.LOGICAL_CLUSTER__FUNCTION_INSTANCES:
				return functionInstances != null && !functionInstances.isEmpty();
			case Function_instance_modelPackage.LOGICAL_CLUSTER__PASSIVE_DEPLOYMENTS:
				return passiveDeployments != null && !passiveDeployments.isEmpty();
			case Function_instance_modelPackage.LOGICAL_CLUSTER__DEPLOYERS:
				return !getDeployers().isEmpty();
			case Function_instance_modelPackage.LOGICAL_CLUSTER__PERIOD:
				return period != null;
			case Function_instance_modelPackage.LOGICAL_CLUSTER__OFFSET:
				return offset != null;
			case Function_instance_modelPackage.LOGICAL_CLUSTER__TRIGGER_TYPE:
				return triggerType != TRIGGER_TYPE_EDEFAULT;
			case Function_instance_modelPackage.LOGICAL_CLUSTER__TRIGGER_EVENT:
				return TRIGGER_EVENT_EDEFAULT == null ? triggerEvent != null : !TRIGGER_EVENT_EDEFAULT.equals(triggerEvent);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == SignalInstanceTarget.class) {
			switch (derivedFeatureID) {
				case Function_instance_modelPackage.LOGICAL_CLUSTER__INCOMING_SIGNALS: return Function_instance_modelPackage.SIGNAL_INSTANCE_TARGET__INCOMING_SIGNALS;
				case Function_instance_modelPackage.LOGICAL_CLUSTER__OUTGOING_SIGNALS: return Function_instance_modelPackage.SIGNAL_INSTANCE_TARGET__OUTGOING_SIGNALS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == SignalInstanceTarget.class) {
			switch (baseFeatureID) {
				case Function_instance_modelPackage.SIGNAL_INSTANCE_TARGET__INCOMING_SIGNALS: return Function_instance_modelPackage.LOGICAL_CLUSTER__INCOMING_SIGNALS;
				case Function_instance_modelPackage.SIGNAL_INSTANCE_TARGET__OUTGOING_SIGNALS: return Function_instance_modelPackage.LOGICAL_CLUSTER__OUTGOING_SIGNALS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(')');
		return result.toString();
	}

} //LogicalClusterImpl
