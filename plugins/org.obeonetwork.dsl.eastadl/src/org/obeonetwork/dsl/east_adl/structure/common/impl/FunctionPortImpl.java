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

import org.obeonetwork.dsl.east_adl.core.EASTADLEntity;

import org.obeonetwork.dsl.east_adl.core.impl.EASTADLEntityImpl;

import org.obeonetwork.dsl.east_adl.requirements.EndToEndDelay;
import org.obeonetwork.dsl.east_adl.requirements.PeriodRestriction;
import org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage;
import org.obeonetwork.dsl.east_adl.requirements.TimingRestriction;

import org.obeonetwork.dsl.east_adl.structure.common.CommonPackage;
import org.obeonetwork.dsl.east_adl.structure.common.FunctionPort;
import org.obeonetwork.dsl.east_adl.structure.common.FunctionPortInterface;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.impl.FunctionPortImpl#isProvided <em>Provided</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.impl.FunctionPortImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.impl.FunctionPortImpl#getFromDelay <em>From Delay</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.impl.FunctionPortImpl#getUntilDelay <em>Until Delay</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.impl.FunctionPortImpl#getPeriodRestriction <em>Period Restriction</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.impl.FunctionPortImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.impl.FunctionPortImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.impl.FunctionPortImpl#getTransferTime <em>Transfer Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class FunctionPortImpl extends EASTADLEntityImpl implements FunctionPort {
	/**
	 * The default value of the '{@link #isProvided() <em>Provided</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProvided()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PROVIDED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isProvided() <em>Provided</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProvided()
	 * @generated
	 * @ordered
	 */
	protected boolean provided = PROVIDED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInterface() <em>Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface()
	 * @generated
	 * @ordered
	 */
	protected FunctionPortInterface interface_;

	/**
	 * The cached value of the '{@link #getFromDelay() <em>From Delay</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDelay()
	 * @generated
	 * @ordered
	 */
	protected EndToEndDelay fromDelay;

	/**
	 * The cached value of the '{@link #getUntilDelay() <em>Until Delay</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUntilDelay()
	 * @generated
	 * @ordered
	 */
	protected EndToEndDelay untilDelay;

	/**
	 * The cached value of the '{@link #getPeriodRestriction() <em>Period Restriction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodRestriction()
	 * @generated
	 * @ordered
	 */
	protected PeriodRestriction periodRestriction;

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
	 * The cached value of the '{@link #getTransferTime() <em>Transfer Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransferTime()
	 * @generated
	 * @ordered
	 */
	protected TimingRestriction transferTime;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.FUNCTION_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isProvided() {
		return provided;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvided(boolean newProvided) {
		boolean oldProvided = provided;
		provided = newProvided;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.FUNCTION_PORT__PROVIDED, oldProvided, provided));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionPortInterface getInterface() {
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterface(FunctionPortInterface newInterface, NotificationChain msgs) {
		FunctionPortInterface oldInterface = interface_;
		interface_ = newInterface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommonPackage.FUNCTION_PORT__INTERFACE, oldInterface, newInterface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterface(FunctionPortInterface newInterface) {
		if (newInterface != interface_) {
			NotificationChain msgs = null;
			if (interface_ != null)
				msgs = ((InternalEObject)interface_).eInverseRemove(this, CommonPackage.FUNCTION_PORT_INTERFACE__TYPED_PORT, FunctionPortInterface.class, msgs);
			if (newInterface != null)
				msgs = ((InternalEObject)newInterface).eInverseAdd(this, CommonPackage.FUNCTION_PORT_INTERFACE__TYPED_PORT, FunctionPortInterface.class, msgs);
			msgs = basicSetInterface(newInterface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.FUNCTION_PORT__INTERFACE, newInterface, newInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndToEndDelay getFromDelay() {
		if (fromDelay != null && fromDelay.eIsProxy()) {
			InternalEObject oldFromDelay = (InternalEObject)fromDelay;
			fromDelay = (EndToEndDelay)eResolveProxy(oldFromDelay);
			if (fromDelay != oldFromDelay) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonPackage.FUNCTION_PORT__FROM_DELAY, oldFromDelay, fromDelay));
			}
		}
		return fromDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndToEndDelay basicGetFromDelay() {
		return fromDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFromDelay(EndToEndDelay newFromDelay, NotificationChain msgs) {
		EndToEndDelay oldFromDelay = fromDelay;
		fromDelay = newFromDelay;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommonPackage.FUNCTION_PORT__FROM_DELAY, oldFromDelay, newFromDelay);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromDelay(EndToEndDelay newFromDelay) {
		if (newFromDelay != fromDelay) {
			NotificationChain msgs = null;
			if (fromDelay != null)
				msgs = ((InternalEObject)fromDelay).eInverseRemove(this, RequirementsPackage.END_TO_END_DELAY__FROM, EndToEndDelay.class, msgs);
			if (newFromDelay != null)
				msgs = ((InternalEObject)newFromDelay).eInverseAdd(this, RequirementsPackage.END_TO_END_DELAY__FROM, EndToEndDelay.class, msgs);
			msgs = basicSetFromDelay(newFromDelay, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.FUNCTION_PORT__FROM_DELAY, newFromDelay, newFromDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndToEndDelay getUntilDelay() {
		if (untilDelay != null && untilDelay.eIsProxy()) {
			InternalEObject oldUntilDelay = (InternalEObject)untilDelay;
			untilDelay = (EndToEndDelay)eResolveProxy(oldUntilDelay);
			if (untilDelay != oldUntilDelay) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonPackage.FUNCTION_PORT__UNTIL_DELAY, oldUntilDelay, untilDelay));
			}
		}
		return untilDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndToEndDelay basicGetUntilDelay() {
		return untilDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUntilDelay(EndToEndDelay newUntilDelay, NotificationChain msgs) {
		EndToEndDelay oldUntilDelay = untilDelay;
		untilDelay = newUntilDelay;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommonPackage.FUNCTION_PORT__UNTIL_DELAY, oldUntilDelay, newUntilDelay);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUntilDelay(EndToEndDelay newUntilDelay) {
		if (newUntilDelay != untilDelay) {
			NotificationChain msgs = null;
			if (untilDelay != null)
				msgs = ((InternalEObject)untilDelay).eInverseRemove(this, RequirementsPackage.END_TO_END_DELAY__UNTIL, EndToEndDelay.class, msgs);
			if (newUntilDelay != null)
				msgs = ((InternalEObject)newUntilDelay).eInverseAdd(this, RequirementsPackage.END_TO_END_DELAY__UNTIL, EndToEndDelay.class, msgs);
			msgs = basicSetUntilDelay(newUntilDelay, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.FUNCTION_PORT__UNTIL_DELAY, newUntilDelay, newUntilDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PeriodRestriction getPeriodRestriction() {
		if (periodRestriction != null && periodRestriction.eIsProxy()) {
			InternalEObject oldPeriodRestriction = (InternalEObject)periodRestriction;
			periodRestriction = (PeriodRestriction)eResolveProxy(oldPeriodRestriction);
			if (periodRestriction != oldPeriodRestriction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonPackage.FUNCTION_PORT__PERIOD_RESTRICTION, oldPeriodRestriction, periodRestriction));
			}
		}
		return periodRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PeriodRestriction basicGetPeriodRestriction() {
		return periodRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriodRestriction(PeriodRestriction newPeriodRestriction, NotificationChain msgs) {
		PeriodRestriction oldPeriodRestriction = periodRestriction;
		periodRestriction = newPeriodRestriction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommonPackage.FUNCTION_PORT__PERIOD_RESTRICTION, oldPeriodRestriction, newPeriodRestriction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriodRestriction(PeriodRestriction newPeriodRestriction) {
		if (newPeriodRestriction != periodRestriction) {
			NotificationChain msgs = null;
			if (periodRestriction != null)
				msgs = ((InternalEObject)periodRestriction).eInverseRemove(this, RequirementsPackage.PERIOD_RESTRICTION__ASSIGNED_PORTS, PeriodRestriction.class, msgs);
			if (newPeriodRestriction != null)
				msgs = ((InternalEObject)newPeriodRestriction).eInverseAdd(this, RequirementsPackage.PERIOD_RESTRICTION__ASSIGNED_PORTS, PeriodRestriction.class, msgs);
			msgs = basicSetPeriodRestriction(newPeriodRestriction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.FUNCTION_PORT__PERIOD_RESTRICTION, newPeriodRestriction, newPeriodRestriction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EASTADLEntity getOwner() {
		EASTADLEntity owner = basicGetOwner();
		return owner != null && owner.eIsProxy() ? (EASTADLEntity)eResolveProxy((InternalEObject)owner) : owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EASTADLEntity basicGetOwner() {
		// TODO: implement this method to return the 'Owner' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommonPackage.FUNCTION_PORT__PERIOD, oldPeriod, newPeriod);
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
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommonPackage.FUNCTION_PORT__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommonPackage.FUNCTION_PORT__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.FUNCTION_PORT__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingRestriction getTransferTime() {
		return transferTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransferTime(TimingRestriction newTransferTime, NotificationChain msgs) {
		TimingRestriction oldTransferTime = transferTime;
		transferTime = newTransferTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommonPackage.FUNCTION_PORT__TRANSFER_TIME, oldTransferTime, newTransferTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransferTime(TimingRestriction newTransferTime) {
		if (newTransferTime != transferTime) {
			NotificationChain msgs = null;
			if (transferTime != null)
				msgs = ((InternalEObject)transferTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommonPackage.FUNCTION_PORT__TRANSFER_TIME, null, msgs);
			if (newTransferTime != null)
				msgs = ((InternalEObject)newTransferTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommonPackage.FUNCTION_PORT__TRANSFER_TIME, null, msgs);
			msgs = basicSetTransferTime(newTransferTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.FUNCTION_PORT__TRANSFER_TIME, newTransferTime, newTransferTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommonPackage.FUNCTION_PORT__INTERFACE:
				if (interface_ != null)
					msgs = ((InternalEObject)interface_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommonPackage.FUNCTION_PORT__INTERFACE, null, msgs);
				return basicSetInterface((FunctionPortInterface)otherEnd, msgs);
			case CommonPackage.FUNCTION_PORT__FROM_DELAY:
				if (fromDelay != null)
					msgs = ((InternalEObject)fromDelay).eInverseRemove(this, RequirementsPackage.END_TO_END_DELAY__FROM, EndToEndDelay.class, msgs);
				return basicSetFromDelay((EndToEndDelay)otherEnd, msgs);
			case CommonPackage.FUNCTION_PORT__UNTIL_DELAY:
				if (untilDelay != null)
					msgs = ((InternalEObject)untilDelay).eInverseRemove(this, RequirementsPackage.END_TO_END_DELAY__UNTIL, EndToEndDelay.class, msgs);
				return basicSetUntilDelay((EndToEndDelay)otherEnd, msgs);
			case CommonPackage.FUNCTION_PORT__PERIOD_RESTRICTION:
				if (periodRestriction != null)
					msgs = ((InternalEObject)periodRestriction).eInverseRemove(this, RequirementsPackage.PERIOD_RESTRICTION__ASSIGNED_PORTS, PeriodRestriction.class, msgs);
				return basicSetPeriodRestriction((PeriodRestriction)otherEnd, msgs);
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
			case CommonPackage.FUNCTION_PORT__INTERFACE:
				return basicSetInterface(null, msgs);
			case CommonPackage.FUNCTION_PORT__FROM_DELAY:
				return basicSetFromDelay(null, msgs);
			case CommonPackage.FUNCTION_PORT__UNTIL_DELAY:
				return basicSetUntilDelay(null, msgs);
			case CommonPackage.FUNCTION_PORT__PERIOD_RESTRICTION:
				return basicSetPeriodRestriction(null, msgs);
			case CommonPackage.FUNCTION_PORT__PERIOD:
				return basicSetPeriod(null, msgs);
			case CommonPackage.FUNCTION_PORT__TRANSFER_TIME:
				return basicSetTransferTime(null, msgs);
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
			case CommonPackage.FUNCTION_PORT__PROVIDED:
				return isProvided();
			case CommonPackage.FUNCTION_PORT__INTERFACE:
				return getInterface();
			case CommonPackage.FUNCTION_PORT__FROM_DELAY:
				if (resolve) return getFromDelay();
				return basicGetFromDelay();
			case CommonPackage.FUNCTION_PORT__UNTIL_DELAY:
				if (resolve) return getUntilDelay();
				return basicGetUntilDelay();
			case CommonPackage.FUNCTION_PORT__PERIOD_RESTRICTION:
				if (resolve) return getPeriodRestriction();
				return basicGetPeriodRestriction();
			case CommonPackage.FUNCTION_PORT__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case CommonPackage.FUNCTION_PORT__PERIOD:
				return getPeriod();
			case CommonPackage.FUNCTION_PORT__TRANSFER_TIME:
				return getTransferTime();
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
			case CommonPackage.FUNCTION_PORT__PROVIDED:
				setProvided((Boolean)newValue);
				return;
			case CommonPackage.FUNCTION_PORT__INTERFACE:
				setInterface((FunctionPortInterface)newValue);
				return;
			case CommonPackage.FUNCTION_PORT__FROM_DELAY:
				setFromDelay((EndToEndDelay)newValue);
				return;
			case CommonPackage.FUNCTION_PORT__UNTIL_DELAY:
				setUntilDelay((EndToEndDelay)newValue);
				return;
			case CommonPackage.FUNCTION_PORT__PERIOD_RESTRICTION:
				setPeriodRestriction((PeriodRestriction)newValue);
				return;
			case CommonPackage.FUNCTION_PORT__PERIOD:
				setPeriod((TimingRestriction)newValue);
				return;
			case CommonPackage.FUNCTION_PORT__TRANSFER_TIME:
				setTransferTime((TimingRestriction)newValue);
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
			case CommonPackage.FUNCTION_PORT__PROVIDED:
				setProvided(PROVIDED_EDEFAULT);
				return;
			case CommonPackage.FUNCTION_PORT__INTERFACE:
				setInterface((FunctionPortInterface)null);
				return;
			case CommonPackage.FUNCTION_PORT__FROM_DELAY:
				setFromDelay((EndToEndDelay)null);
				return;
			case CommonPackage.FUNCTION_PORT__UNTIL_DELAY:
				setUntilDelay((EndToEndDelay)null);
				return;
			case CommonPackage.FUNCTION_PORT__PERIOD_RESTRICTION:
				setPeriodRestriction((PeriodRestriction)null);
				return;
			case CommonPackage.FUNCTION_PORT__PERIOD:
				setPeriod((TimingRestriction)null);
				return;
			case CommonPackage.FUNCTION_PORT__TRANSFER_TIME:
				setTransferTime((TimingRestriction)null);
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
			case CommonPackage.FUNCTION_PORT__PROVIDED:
				return provided != PROVIDED_EDEFAULT;
			case CommonPackage.FUNCTION_PORT__INTERFACE:
				return interface_ != null;
			case CommonPackage.FUNCTION_PORT__FROM_DELAY:
				return fromDelay != null;
			case CommonPackage.FUNCTION_PORT__UNTIL_DELAY:
				return untilDelay != null;
			case CommonPackage.FUNCTION_PORT__PERIOD_RESTRICTION:
				return periodRestriction != null;
			case CommonPackage.FUNCTION_PORT__OWNER:
				return basicGetOwner() != null;
			case CommonPackage.FUNCTION_PORT__PERIOD:
				return period != null;
			case CommonPackage.FUNCTION_PORT__TRANSFER_TIME:
				return transferTime != null;
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
		result.append(" (provided: ");
		result.append(provided);
		result.append(')');
		return result.toString();
	}

} //FunctionPortImpl
