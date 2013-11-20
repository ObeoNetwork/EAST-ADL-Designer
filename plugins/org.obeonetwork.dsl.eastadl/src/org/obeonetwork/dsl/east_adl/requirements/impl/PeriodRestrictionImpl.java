/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.requirements.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.east_adl.requirements.Bound;
import org.obeonetwork.dsl.east_adl.requirements.PeriodRestriction;
import org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage;
import org.obeonetwork.dsl.east_adl.requirements.TimingRestriction;

import org.obeonetwork.dsl.east_adl.structure.common.CommonPackage;
import org.obeonetwork.dsl.east_adl.structure.common.FunctionPort;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Period Restriction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.impl.PeriodRestrictionImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.impl.PeriodRestrictionImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.impl.PeriodRestrictionImpl#getNominal <em>Nominal</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.impl.PeriodRestrictionImpl#getJitter <em>Jitter</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.impl.PeriodRestrictionImpl#getAssignedPorts <em>Assigned Ports</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PeriodRestrictionImpl extends QualityRequirementImpl implements PeriodRestriction {
	/**
	 * The cached value of the '{@link #getUpper() <em>Upper</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected Bound upper;

	/**
	 * The cached value of the '{@link #getLower() <em>Lower</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected Bound lower;

	/**
	 * The cached value of the '{@link #getNominal() <em>Nominal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominal()
	 * @generated
	 * @ordered
	 */
	protected Bound nominal;

	/**
	 * The cached value of the '{@link #getJitter() <em>Jitter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJitter()
	 * @generated
	 * @ordered
	 */
	protected Bound jitter;

	/**
	 * The cached value of the '{@link #getAssignedPorts() <em>Assigned Ports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionPort> assignedPorts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PeriodRestrictionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementsPackage.Literals.PERIOD_RESTRICTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bound getUpper() {
		return upper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpper(Bound newUpper, NotificationChain msgs) {
		Bound oldUpper = upper;
		upper = newUpper;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RequirementsPackage.PERIOD_RESTRICTION__UPPER, oldUpper, newUpper);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpper(Bound newUpper) {
		if (newUpper != upper) {
			NotificationChain msgs = null;
			if (upper != null)
				msgs = ((InternalEObject)upper).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RequirementsPackage.PERIOD_RESTRICTION__UPPER, null, msgs);
			if (newUpper != null)
				msgs = ((InternalEObject)newUpper).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RequirementsPackage.PERIOD_RESTRICTION__UPPER, null, msgs);
			msgs = basicSetUpper(newUpper, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.PERIOD_RESTRICTION__UPPER, newUpper, newUpper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bound getLower() {
		return lower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLower(Bound newLower, NotificationChain msgs) {
		Bound oldLower = lower;
		lower = newLower;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RequirementsPackage.PERIOD_RESTRICTION__LOWER, oldLower, newLower);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLower(Bound newLower) {
		if (newLower != lower) {
			NotificationChain msgs = null;
			if (lower != null)
				msgs = ((InternalEObject)lower).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RequirementsPackage.PERIOD_RESTRICTION__LOWER, null, msgs);
			if (newLower != null)
				msgs = ((InternalEObject)newLower).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RequirementsPackage.PERIOD_RESTRICTION__LOWER, null, msgs);
			msgs = basicSetLower(newLower, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.PERIOD_RESTRICTION__LOWER, newLower, newLower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bound getNominal() {
		return nominal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNominal(Bound newNominal, NotificationChain msgs) {
		Bound oldNominal = nominal;
		nominal = newNominal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RequirementsPackage.PERIOD_RESTRICTION__NOMINAL, oldNominal, newNominal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNominal(Bound newNominal) {
		if (newNominal != nominal) {
			NotificationChain msgs = null;
			if (nominal != null)
				msgs = ((InternalEObject)nominal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RequirementsPackage.PERIOD_RESTRICTION__NOMINAL, null, msgs);
			if (newNominal != null)
				msgs = ((InternalEObject)newNominal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RequirementsPackage.PERIOD_RESTRICTION__NOMINAL, null, msgs);
			msgs = basicSetNominal(newNominal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.PERIOD_RESTRICTION__NOMINAL, newNominal, newNominal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bound getJitter() {
		return jitter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJitter(Bound newJitter, NotificationChain msgs) {
		Bound oldJitter = jitter;
		jitter = newJitter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RequirementsPackage.PERIOD_RESTRICTION__JITTER, oldJitter, newJitter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJitter(Bound newJitter) {
		if (newJitter != jitter) {
			NotificationChain msgs = null;
			if (jitter != null)
				msgs = ((InternalEObject)jitter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RequirementsPackage.PERIOD_RESTRICTION__JITTER, null, msgs);
			if (newJitter != null)
				msgs = ((InternalEObject)newJitter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RequirementsPackage.PERIOD_RESTRICTION__JITTER, null, msgs);
			msgs = basicSetJitter(newJitter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.PERIOD_RESTRICTION__JITTER, newJitter, newJitter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionPort> getAssignedPorts() {
		if (assignedPorts == null) {
			assignedPorts = new EObjectWithInverseResolvingEList<FunctionPort>(FunctionPort.class, this, RequirementsPackage.PERIOD_RESTRICTION__ASSIGNED_PORTS, CommonPackage.FUNCTION_PORT__PERIOD_RESTRICTION);
		}
		return assignedPorts;
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
			case RequirementsPackage.PERIOD_RESTRICTION__ASSIGNED_PORTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssignedPorts()).basicAdd(otherEnd, msgs);
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
			case RequirementsPackage.PERIOD_RESTRICTION__UPPER:
				return basicSetUpper(null, msgs);
			case RequirementsPackage.PERIOD_RESTRICTION__LOWER:
				return basicSetLower(null, msgs);
			case RequirementsPackage.PERIOD_RESTRICTION__NOMINAL:
				return basicSetNominal(null, msgs);
			case RequirementsPackage.PERIOD_RESTRICTION__JITTER:
				return basicSetJitter(null, msgs);
			case RequirementsPackage.PERIOD_RESTRICTION__ASSIGNED_PORTS:
				return ((InternalEList<?>)getAssignedPorts()).basicRemove(otherEnd, msgs);
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
			case RequirementsPackage.PERIOD_RESTRICTION__UPPER:
				return getUpper();
			case RequirementsPackage.PERIOD_RESTRICTION__LOWER:
				return getLower();
			case RequirementsPackage.PERIOD_RESTRICTION__NOMINAL:
				return getNominal();
			case RequirementsPackage.PERIOD_RESTRICTION__JITTER:
				return getJitter();
			case RequirementsPackage.PERIOD_RESTRICTION__ASSIGNED_PORTS:
				return getAssignedPorts();
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
			case RequirementsPackage.PERIOD_RESTRICTION__UPPER:
				setUpper((Bound)newValue);
				return;
			case RequirementsPackage.PERIOD_RESTRICTION__LOWER:
				setLower((Bound)newValue);
				return;
			case RequirementsPackage.PERIOD_RESTRICTION__NOMINAL:
				setNominal((Bound)newValue);
				return;
			case RequirementsPackage.PERIOD_RESTRICTION__JITTER:
				setJitter((Bound)newValue);
				return;
			case RequirementsPackage.PERIOD_RESTRICTION__ASSIGNED_PORTS:
				getAssignedPorts().clear();
				getAssignedPorts().addAll((Collection<? extends FunctionPort>)newValue);
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
			case RequirementsPackage.PERIOD_RESTRICTION__UPPER:
				setUpper((Bound)null);
				return;
			case RequirementsPackage.PERIOD_RESTRICTION__LOWER:
				setLower((Bound)null);
				return;
			case RequirementsPackage.PERIOD_RESTRICTION__NOMINAL:
				setNominal((Bound)null);
				return;
			case RequirementsPackage.PERIOD_RESTRICTION__JITTER:
				setJitter((Bound)null);
				return;
			case RequirementsPackage.PERIOD_RESTRICTION__ASSIGNED_PORTS:
				getAssignedPorts().clear();
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
			case RequirementsPackage.PERIOD_RESTRICTION__UPPER:
				return upper != null;
			case RequirementsPackage.PERIOD_RESTRICTION__LOWER:
				return lower != null;
			case RequirementsPackage.PERIOD_RESTRICTION__NOMINAL:
				return nominal != null;
			case RequirementsPackage.PERIOD_RESTRICTION__JITTER:
				return jitter != null;
			case RequirementsPackage.PERIOD_RESTRICTION__ASSIGNED_PORTS:
				return assignedPorts != null && !assignedPorts.isEmpty();
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
		if (baseClass == TimingRestriction.class) {
			switch (derivedFeatureID) {
				case RequirementsPackage.PERIOD_RESTRICTION__UPPER: return RequirementsPackage.TIMING_RESTRICTION__UPPER;
				case RequirementsPackage.PERIOD_RESTRICTION__LOWER: return RequirementsPackage.TIMING_RESTRICTION__LOWER;
				case RequirementsPackage.PERIOD_RESTRICTION__NOMINAL: return RequirementsPackage.TIMING_RESTRICTION__NOMINAL;
				case RequirementsPackage.PERIOD_RESTRICTION__JITTER: return RequirementsPackage.TIMING_RESTRICTION__JITTER;
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
		if (baseClass == TimingRestriction.class) {
			switch (baseFeatureID) {
				case RequirementsPackage.TIMING_RESTRICTION__UPPER: return RequirementsPackage.PERIOD_RESTRICTION__UPPER;
				case RequirementsPackage.TIMING_RESTRICTION__LOWER: return RequirementsPackage.PERIOD_RESTRICTION__LOWER;
				case RequirementsPackage.TIMING_RESTRICTION__NOMINAL: return RequirementsPackage.PERIOD_RESTRICTION__NOMINAL;
				case RequirementsPackage.TIMING_RESTRICTION__JITTER: return RequirementsPackage.PERIOD_RESTRICTION__JITTER;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //PeriodRestrictionImpl
