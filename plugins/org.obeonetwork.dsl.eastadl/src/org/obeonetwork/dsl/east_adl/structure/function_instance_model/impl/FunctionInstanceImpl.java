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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.east_adl.core.impl.EASTADLEntityImpl;

import org.obeonetwork.dsl.east_adl.requirements.TimingRestriction;

import org.obeonetwork.dsl.east_adl.structure.common.TriggerKind;

import org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstance;
import org.obeonetwork.dsl.east_adl.structure.function_instance_model.Function_instance_modelPackage;
import org.obeonetwork.dsl.east_adl.structure.function_instance_model.ParameterInstance;
import org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstance;
import org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstanceTarget;

import org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction;
import org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Functional_design_architecturePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.FunctionInstanceImpl#getIncomingSignals <em>Incoming Signals</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.FunctionInstanceImpl#getOutgoingSignals <em>Outgoing Signals</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.FunctionInstanceImpl#getTriggerType <em>Trigger Type</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.FunctionInstanceImpl#getTriggerEvent <em>Trigger Event</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.FunctionInstanceImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.FunctionInstanceImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.FunctionInstanceImpl#getExecutionTime <em>Execution Time</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.FunctionInstanceImpl#getInstantiatedFunction <em>Instantiated Function</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.FunctionInstanceImpl#getDefinedParameters <em>Defined Parameters</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.FunctionInstanceImpl#getReferencedParameters <em>Referenced Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionInstanceImpl extends EASTADLEntityImpl implements FunctionInstance {
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
	 * The cached value of the '{@link #getInstantiatedFunction() <em>Instantiated Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantiatedFunction()
	 * @generated
	 * @ordered
	 */
	protected ElementarySoftwareFunction instantiatedFunction;

	/**
	 * The cached value of the '{@link #getDefinedParameters() <em>Defined Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinedParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterInstance> definedParameters;

	/**
	 * The cached value of the '{@link #getReferencedParameters() <em>Referenced Parameters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterInstance> referencedParameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Function_instance_modelPackage.Literals.FUNCTION_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SignalInstance> getIncomingSignals() {
		if (incomingSignals == null) {
			incomingSignals = new EObjectWithInverseResolvingEList<SignalInstance>(SignalInstance.class, this, Function_instance_modelPackage.FUNCTION_INSTANCE__INCOMING_SIGNALS, Function_instance_modelPackage.SIGNAL_INSTANCE__DESTINATION);
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
			outgoingSignals = new EObjectWithInverseResolvingEList<SignalInstance>(SignalInstance.class, this, Function_instance_modelPackage.FUNCTION_INSTANCE__OUTGOING_SIGNALS, Function_instance_modelPackage.SIGNAL_INSTANCE__SOURCE);
		}
		return outgoingSignals;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Function_instance_modelPackage.FUNCTION_INSTANCE__TRIGGER_TYPE, oldTriggerType, triggerType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Function_instance_modelPackage.FUNCTION_INSTANCE__TRIGGER_EVENT, oldTriggerEvent, triggerEvent));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Function_instance_modelPackage.FUNCTION_INSTANCE__PERIOD, oldPeriod, newPeriod);
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
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Function_instance_modelPackage.FUNCTION_INSTANCE__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Function_instance_modelPackage.FUNCTION_INSTANCE__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Function_instance_modelPackage.FUNCTION_INSTANCE__PERIOD, newPeriod, newPeriod));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Function_instance_modelPackage.FUNCTION_INSTANCE__OFFSET, oldOffset, newOffset);
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
				msgs = ((InternalEObject)offset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Function_instance_modelPackage.FUNCTION_INSTANCE__OFFSET, null, msgs);
			if (newOffset != null)
				msgs = ((InternalEObject)newOffset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Function_instance_modelPackage.FUNCTION_INSTANCE__OFFSET, null, msgs);
			msgs = basicSetOffset(newOffset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Function_instance_modelPackage.FUNCTION_INSTANCE__OFFSET, newOffset, newOffset));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Function_instance_modelPackage.FUNCTION_INSTANCE__EXECUTION_TIME, oldExecutionTime, newExecutionTime);
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
				msgs = ((InternalEObject)executionTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Function_instance_modelPackage.FUNCTION_INSTANCE__EXECUTION_TIME, null, msgs);
			if (newExecutionTime != null)
				msgs = ((InternalEObject)newExecutionTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Function_instance_modelPackage.FUNCTION_INSTANCE__EXECUTION_TIME, null, msgs);
			msgs = basicSetExecutionTime(newExecutionTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Function_instance_modelPackage.FUNCTION_INSTANCE__EXECUTION_TIME, newExecutionTime, newExecutionTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementarySoftwareFunction getInstantiatedFunction() {
		if (instantiatedFunction != null && instantiatedFunction.eIsProxy()) {
			InternalEObject oldInstantiatedFunction = (InternalEObject)instantiatedFunction;
			instantiatedFunction = (ElementarySoftwareFunction)eResolveProxy(oldInstantiatedFunction);
			if (instantiatedFunction != oldInstantiatedFunction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Function_instance_modelPackage.FUNCTION_INSTANCE__INSTANTIATED_FUNCTION, oldInstantiatedFunction, instantiatedFunction));
			}
		}
		return instantiatedFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementarySoftwareFunction basicGetInstantiatedFunction() {
		return instantiatedFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstantiatedFunction(ElementarySoftwareFunction newInstantiatedFunction, NotificationChain msgs) {
		ElementarySoftwareFunction oldInstantiatedFunction = instantiatedFunction;
		instantiatedFunction = newInstantiatedFunction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Function_instance_modelPackage.FUNCTION_INSTANCE__INSTANTIATED_FUNCTION, oldInstantiatedFunction, newInstantiatedFunction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstantiatedFunction(ElementarySoftwareFunction newInstantiatedFunction) {
		if (newInstantiatedFunction != instantiatedFunction) {
			NotificationChain msgs = null;
			if (instantiatedFunction != null)
				msgs = ((InternalEObject)instantiatedFunction).eInverseRemove(this, Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__INSTANCES, ElementarySoftwareFunction.class, msgs);
			if (newInstantiatedFunction != null)
				msgs = ((InternalEObject)newInstantiatedFunction).eInverseAdd(this, Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__INSTANCES, ElementarySoftwareFunction.class, msgs);
			msgs = basicSetInstantiatedFunction(newInstantiatedFunction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Function_instance_modelPackage.FUNCTION_INSTANCE__INSTANTIATED_FUNCTION, newInstantiatedFunction, newInstantiatedFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterInstance> getDefinedParameters() {
		if (definedParameters == null) {
			definedParameters = new EObjectContainmentWithInverseEList<ParameterInstance>(ParameterInstance.class, this, Function_instance_modelPackage.FUNCTION_INSTANCE__DEFINED_PARAMETERS, Function_instance_modelPackage.PARAMETER_INSTANCE__OWNING_FUNCTION);
		}
		return definedParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterInstance> getReferencedParameters() {
		if (referencedParameters == null) {
			referencedParameters = new EObjectWithInverseResolvingEList.ManyInverse<ParameterInstance>(ParameterInstance.class, this, Function_instance_modelPackage.FUNCTION_INSTANCE__REFERENCED_PARAMETERS, Function_instance_modelPackage.PARAMETER_INSTANCE__REFERENCING_FUNCTIONS);
		}
		return referencedParameters;
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
			case Function_instance_modelPackage.FUNCTION_INSTANCE__INCOMING_SIGNALS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingSignals()).basicAdd(otherEnd, msgs);
			case Function_instance_modelPackage.FUNCTION_INSTANCE__OUTGOING_SIGNALS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingSignals()).basicAdd(otherEnd, msgs);
			case Function_instance_modelPackage.FUNCTION_INSTANCE__INSTANTIATED_FUNCTION:
				if (instantiatedFunction != null)
					msgs = ((InternalEObject)instantiatedFunction).eInverseRemove(this, Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__INSTANCES, ElementarySoftwareFunction.class, msgs);
				return basicSetInstantiatedFunction((ElementarySoftwareFunction)otherEnd, msgs);
			case Function_instance_modelPackage.FUNCTION_INSTANCE__DEFINED_PARAMETERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDefinedParameters()).basicAdd(otherEnd, msgs);
			case Function_instance_modelPackage.FUNCTION_INSTANCE__REFERENCED_PARAMETERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferencedParameters()).basicAdd(otherEnd, msgs);
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
			case Function_instance_modelPackage.FUNCTION_INSTANCE__INCOMING_SIGNALS:
				return ((InternalEList<?>)getIncomingSignals()).basicRemove(otherEnd, msgs);
			case Function_instance_modelPackage.FUNCTION_INSTANCE__OUTGOING_SIGNALS:
				return ((InternalEList<?>)getOutgoingSignals()).basicRemove(otherEnd, msgs);
			case Function_instance_modelPackage.FUNCTION_INSTANCE__PERIOD:
				return basicSetPeriod(null, msgs);
			case Function_instance_modelPackage.FUNCTION_INSTANCE__OFFSET:
				return basicSetOffset(null, msgs);
			case Function_instance_modelPackage.FUNCTION_INSTANCE__EXECUTION_TIME:
				return basicSetExecutionTime(null, msgs);
			case Function_instance_modelPackage.FUNCTION_INSTANCE__INSTANTIATED_FUNCTION:
				return basicSetInstantiatedFunction(null, msgs);
			case Function_instance_modelPackage.FUNCTION_INSTANCE__DEFINED_PARAMETERS:
				return ((InternalEList<?>)getDefinedParameters()).basicRemove(otherEnd, msgs);
			case Function_instance_modelPackage.FUNCTION_INSTANCE__REFERENCED_PARAMETERS:
				return ((InternalEList<?>)getReferencedParameters()).basicRemove(otherEnd, msgs);
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
			case Function_instance_modelPackage.FUNCTION_INSTANCE__INCOMING_SIGNALS:
				return getIncomingSignals();
			case Function_instance_modelPackage.FUNCTION_INSTANCE__OUTGOING_SIGNALS:
				return getOutgoingSignals();
			case Function_instance_modelPackage.FUNCTION_INSTANCE__TRIGGER_TYPE:
				return getTriggerType();
			case Function_instance_modelPackage.FUNCTION_INSTANCE__TRIGGER_EVENT:
				return getTriggerEvent();
			case Function_instance_modelPackage.FUNCTION_INSTANCE__PERIOD:
				return getPeriod();
			case Function_instance_modelPackage.FUNCTION_INSTANCE__OFFSET:
				return getOffset();
			case Function_instance_modelPackage.FUNCTION_INSTANCE__EXECUTION_TIME:
				return getExecutionTime();
			case Function_instance_modelPackage.FUNCTION_INSTANCE__INSTANTIATED_FUNCTION:
				if (resolve) return getInstantiatedFunction();
				return basicGetInstantiatedFunction();
			case Function_instance_modelPackage.FUNCTION_INSTANCE__DEFINED_PARAMETERS:
				return getDefinedParameters();
			case Function_instance_modelPackage.FUNCTION_INSTANCE__REFERENCED_PARAMETERS:
				return getReferencedParameters();
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
			case Function_instance_modelPackage.FUNCTION_INSTANCE__INCOMING_SIGNALS:
				getIncomingSignals().clear();
				getIncomingSignals().addAll((Collection<? extends SignalInstance>)newValue);
				return;
			case Function_instance_modelPackage.FUNCTION_INSTANCE__OUTGOING_SIGNALS:
				getOutgoingSignals().clear();
				getOutgoingSignals().addAll((Collection<? extends SignalInstance>)newValue);
				return;
			case Function_instance_modelPackage.FUNCTION_INSTANCE__TRIGGER_TYPE:
				setTriggerType((TriggerKind)newValue);
				return;
			case Function_instance_modelPackage.FUNCTION_INSTANCE__TRIGGER_EVENT:
				setTriggerEvent((String)newValue);
				return;
			case Function_instance_modelPackage.FUNCTION_INSTANCE__PERIOD:
				setPeriod((TimingRestriction)newValue);
				return;
			case Function_instance_modelPackage.FUNCTION_INSTANCE__OFFSET:
				setOffset((TimingRestriction)newValue);
				return;
			case Function_instance_modelPackage.FUNCTION_INSTANCE__EXECUTION_TIME:
				setExecutionTime((TimingRestriction)newValue);
				return;
			case Function_instance_modelPackage.FUNCTION_INSTANCE__INSTANTIATED_FUNCTION:
				setInstantiatedFunction((ElementarySoftwareFunction)newValue);
				return;
			case Function_instance_modelPackage.FUNCTION_INSTANCE__DEFINED_PARAMETERS:
				getDefinedParameters().clear();
				getDefinedParameters().addAll((Collection<? extends ParameterInstance>)newValue);
				return;
			case Function_instance_modelPackage.FUNCTION_INSTANCE__REFERENCED_PARAMETERS:
				getReferencedParameters().clear();
				getReferencedParameters().addAll((Collection<? extends ParameterInstance>)newValue);
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
			case Function_instance_modelPackage.FUNCTION_INSTANCE__INCOMING_SIGNALS:
				getIncomingSignals().clear();
				return;
			case Function_instance_modelPackage.FUNCTION_INSTANCE__OUTGOING_SIGNALS:
				getOutgoingSignals().clear();
				return;
			case Function_instance_modelPackage.FUNCTION_INSTANCE__TRIGGER_TYPE:
				setTriggerType(TRIGGER_TYPE_EDEFAULT);
				return;
			case Function_instance_modelPackage.FUNCTION_INSTANCE__TRIGGER_EVENT:
				setTriggerEvent(TRIGGER_EVENT_EDEFAULT);
				return;
			case Function_instance_modelPackage.FUNCTION_INSTANCE__PERIOD:
				setPeriod((TimingRestriction)null);
				return;
			case Function_instance_modelPackage.FUNCTION_INSTANCE__OFFSET:
				setOffset((TimingRestriction)null);
				return;
			case Function_instance_modelPackage.FUNCTION_INSTANCE__EXECUTION_TIME:
				setExecutionTime((TimingRestriction)null);
				return;
			case Function_instance_modelPackage.FUNCTION_INSTANCE__INSTANTIATED_FUNCTION:
				setInstantiatedFunction((ElementarySoftwareFunction)null);
				return;
			case Function_instance_modelPackage.FUNCTION_INSTANCE__DEFINED_PARAMETERS:
				getDefinedParameters().clear();
				return;
			case Function_instance_modelPackage.FUNCTION_INSTANCE__REFERENCED_PARAMETERS:
				getReferencedParameters().clear();
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
			case Function_instance_modelPackage.FUNCTION_INSTANCE__INCOMING_SIGNALS:
				return incomingSignals != null && !incomingSignals.isEmpty();
			case Function_instance_modelPackage.FUNCTION_INSTANCE__OUTGOING_SIGNALS:
				return outgoingSignals != null && !outgoingSignals.isEmpty();
			case Function_instance_modelPackage.FUNCTION_INSTANCE__TRIGGER_TYPE:
				return triggerType != TRIGGER_TYPE_EDEFAULT;
			case Function_instance_modelPackage.FUNCTION_INSTANCE__TRIGGER_EVENT:
				return TRIGGER_EVENT_EDEFAULT == null ? triggerEvent != null : !TRIGGER_EVENT_EDEFAULT.equals(triggerEvent);
			case Function_instance_modelPackage.FUNCTION_INSTANCE__PERIOD:
				return period != null;
			case Function_instance_modelPackage.FUNCTION_INSTANCE__OFFSET:
				return offset != null;
			case Function_instance_modelPackage.FUNCTION_INSTANCE__EXECUTION_TIME:
				return executionTime != null;
			case Function_instance_modelPackage.FUNCTION_INSTANCE__INSTANTIATED_FUNCTION:
				return instantiatedFunction != null;
			case Function_instance_modelPackage.FUNCTION_INSTANCE__DEFINED_PARAMETERS:
				return definedParameters != null && !definedParameters.isEmpty();
			case Function_instance_modelPackage.FUNCTION_INSTANCE__REFERENCED_PARAMETERS:
				return referencedParameters != null && !referencedParameters.isEmpty();
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
				case Function_instance_modelPackage.FUNCTION_INSTANCE__INCOMING_SIGNALS: return Function_instance_modelPackage.SIGNAL_INSTANCE_TARGET__INCOMING_SIGNALS;
				case Function_instance_modelPackage.FUNCTION_INSTANCE__OUTGOING_SIGNALS: return Function_instance_modelPackage.SIGNAL_INSTANCE_TARGET__OUTGOING_SIGNALS;
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
				case Function_instance_modelPackage.SIGNAL_INSTANCE_TARGET__INCOMING_SIGNALS: return Function_instance_modelPackage.FUNCTION_INSTANCE__INCOMING_SIGNALS;
				case Function_instance_modelPackage.SIGNAL_INSTANCE_TARGET__OUTGOING_SIGNALS: return Function_instance_modelPackage.FUNCTION_INSTANCE__OUTGOING_SIGNALS;
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

} //FunctionInstanceImpl
