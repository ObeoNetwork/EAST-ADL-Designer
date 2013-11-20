/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.requirements.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.obeonetwork.dsl.east_adl.requirements.Bound;
import org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage;
import org.obeonetwork.dsl.east_adl.requirements.TimingRestriction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timing Restriction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.impl.TimingRestrictionImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.impl.TimingRestrictionImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.impl.TimingRestrictionImpl#getNominal <em>Nominal</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.impl.TimingRestrictionImpl#getJitter <em>Jitter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimingRestrictionImpl extends EObjectImpl implements TimingRestriction {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimingRestrictionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementsPackage.Literals.TIMING_RESTRICTION;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RequirementsPackage.TIMING_RESTRICTION__UPPER, oldUpper, newUpper);
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
				msgs = ((InternalEObject)upper).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RequirementsPackage.TIMING_RESTRICTION__UPPER, null, msgs);
			if (newUpper != null)
				msgs = ((InternalEObject)newUpper).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RequirementsPackage.TIMING_RESTRICTION__UPPER, null, msgs);
			msgs = basicSetUpper(newUpper, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.TIMING_RESTRICTION__UPPER, newUpper, newUpper));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RequirementsPackage.TIMING_RESTRICTION__LOWER, oldLower, newLower);
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
				msgs = ((InternalEObject)lower).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RequirementsPackage.TIMING_RESTRICTION__LOWER, null, msgs);
			if (newLower != null)
				msgs = ((InternalEObject)newLower).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RequirementsPackage.TIMING_RESTRICTION__LOWER, null, msgs);
			msgs = basicSetLower(newLower, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.TIMING_RESTRICTION__LOWER, newLower, newLower));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RequirementsPackage.TIMING_RESTRICTION__NOMINAL, oldNominal, newNominal);
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
				msgs = ((InternalEObject)nominal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RequirementsPackage.TIMING_RESTRICTION__NOMINAL, null, msgs);
			if (newNominal != null)
				msgs = ((InternalEObject)newNominal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RequirementsPackage.TIMING_RESTRICTION__NOMINAL, null, msgs);
			msgs = basicSetNominal(newNominal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.TIMING_RESTRICTION__NOMINAL, newNominal, newNominal));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RequirementsPackage.TIMING_RESTRICTION__JITTER, oldJitter, newJitter);
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
				msgs = ((InternalEObject)jitter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RequirementsPackage.TIMING_RESTRICTION__JITTER, null, msgs);
			if (newJitter != null)
				msgs = ((InternalEObject)newJitter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RequirementsPackage.TIMING_RESTRICTION__JITTER, null, msgs);
			msgs = basicSetJitter(newJitter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.TIMING_RESTRICTION__JITTER, newJitter, newJitter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RequirementsPackage.TIMING_RESTRICTION__UPPER:
				return basicSetUpper(null, msgs);
			case RequirementsPackage.TIMING_RESTRICTION__LOWER:
				return basicSetLower(null, msgs);
			case RequirementsPackage.TIMING_RESTRICTION__NOMINAL:
				return basicSetNominal(null, msgs);
			case RequirementsPackage.TIMING_RESTRICTION__JITTER:
				return basicSetJitter(null, msgs);
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
			case RequirementsPackage.TIMING_RESTRICTION__UPPER:
				return getUpper();
			case RequirementsPackage.TIMING_RESTRICTION__LOWER:
				return getLower();
			case RequirementsPackage.TIMING_RESTRICTION__NOMINAL:
				return getNominal();
			case RequirementsPackage.TIMING_RESTRICTION__JITTER:
				return getJitter();
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
			case RequirementsPackage.TIMING_RESTRICTION__UPPER:
				setUpper((Bound)newValue);
				return;
			case RequirementsPackage.TIMING_RESTRICTION__LOWER:
				setLower((Bound)newValue);
				return;
			case RequirementsPackage.TIMING_RESTRICTION__NOMINAL:
				setNominal((Bound)newValue);
				return;
			case RequirementsPackage.TIMING_RESTRICTION__JITTER:
				setJitter((Bound)newValue);
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
			case RequirementsPackage.TIMING_RESTRICTION__UPPER:
				setUpper((Bound)null);
				return;
			case RequirementsPackage.TIMING_RESTRICTION__LOWER:
				setLower((Bound)null);
				return;
			case RequirementsPackage.TIMING_RESTRICTION__NOMINAL:
				setNominal((Bound)null);
				return;
			case RequirementsPackage.TIMING_RESTRICTION__JITTER:
				setJitter((Bound)null);
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
			case RequirementsPackage.TIMING_RESTRICTION__UPPER:
				return upper != null;
			case RequirementsPackage.TIMING_RESTRICTION__LOWER:
				return lower != null;
			case RequirementsPackage.TIMING_RESTRICTION__NOMINAL:
				return nominal != null;
			case RequirementsPackage.TIMING_RESTRICTION__JITTER:
				return jitter != null;
		}
		return super.eIsSet(featureID);
	}

} //TimingRestrictionImpl
