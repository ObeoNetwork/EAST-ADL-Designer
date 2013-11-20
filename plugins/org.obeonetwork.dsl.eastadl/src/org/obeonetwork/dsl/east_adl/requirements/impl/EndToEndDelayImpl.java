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

import org.obeonetwork.dsl.east_adl.requirements.Bound;
import org.obeonetwork.dsl.east_adl.requirements.EndToEndDelay;
import org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage;
import org.obeonetwork.dsl.east_adl.requirements.TimingRestriction;

import org.obeonetwork.dsl.east_adl.structure.common.CommonPackage;
import org.obeonetwork.dsl.east_adl.structure.common.FunctionPort;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>End To End Delay</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.impl.EndToEndDelayImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.impl.EndToEndDelayImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.impl.EndToEndDelayImpl#getNominal <em>Nominal</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.impl.EndToEndDelayImpl#getJitter <em>Jitter</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.impl.EndToEndDelayImpl#getFrom <em>From</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.impl.EndToEndDelayImpl#getUntil <em>Until</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.impl.EndToEndDelayImpl#getProbability <em>Probability</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EndToEndDelayImpl extends QualityRequirementImpl implements EndToEndDelay {
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
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected FunctionPort from;

	/**
	 * The cached value of the '{@link #getUntil() <em>Until</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUntil()
	 * @generated
	 * @ordered
	 */
	protected FunctionPort until;

	/**
	 * The default value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected static final int PROBABILITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected int probability = PROBABILITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndToEndDelayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementsPackage.Literals.END_TO_END_DELAY;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RequirementsPackage.END_TO_END_DELAY__UPPER, oldUpper, newUpper);
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
				msgs = ((InternalEObject)upper).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RequirementsPackage.END_TO_END_DELAY__UPPER, null, msgs);
			if (newUpper != null)
				msgs = ((InternalEObject)newUpper).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RequirementsPackage.END_TO_END_DELAY__UPPER, null, msgs);
			msgs = basicSetUpper(newUpper, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.END_TO_END_DELAY__UPPER, newUpper, newUpper));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RequirementsPackage.END_TO_END_DELAY__LOWER, oldLower, newLower);
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
				msgs = ((InternalEObject)lower).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RequirementsPackage.END_TO_END_DELAY__LOWER, null, msgs);
			if (newLower != null)
				msgs = ((InternalEObject)newLower).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RequirementsPackage.END_TO_END_DELAY__LOWER, null, msgs);
			msgs = basicSetLower(newLower, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.END_TO_END_DELAY__LOWER, newLower, newLower));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RequirementsPackage.END_TO_END_DELAY__NOMINAL, oldNominal, newNominal);
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
				msgs = ((InternalEObject)nominal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RequirementsPackage.END_TO_END_DELAY__NOMINAL, null, msgs);
			if (newNominal != null)
				msgs = ((InternalEObject)newNominal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RequirementsPackage.END_TO_END_DELAY__NOMINAL, null, msgs);
			msgs = basicSetNominal(newNominal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.END_TO_END_DELAY__NOMINAL, newNominal, newNominal));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RequirementsPackage.END_TO_END_DELAY__JITTER, oldJitter, newJitter);
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
				msgs = ((InternalEObject)jitter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RequirementsPackage.END_TO_END_DELAY__JITTER, null, msgs);
			if (newJitter != null)
				msgs = ((InternalEObject)newJitter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RequirementsPackage.END_TO_END_DELAY__JITTER, null, msgs);
			msgs = basicSetJitter(newJitter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.END_TO_END_DELAY__JITTER, newJitter, newJitter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionPort getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject)from;
			from = (FunctionPort)eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RequirementsPackage.END_TO_END_DELAY__FROM, oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionPort basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrom(FunctionPort newFrom, NotificationChain msgs) {
		FunctionPort oldFrom = from;
		from = newFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RequirementsPackage.END_TO_END_DELAY__FROM, oldFrom, newFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(FunctionPort newFrom) {
		if (newFrom != from) {
			NotificationChain msgs = null;
			if (from != null)
				msgs = ((InternalEObject)from).eInverseRemove(this, CommonPackage.FUNCTION_PORT__FROM_DELAY, FunctionPort.class, msgs);
			if (newFrom != null)
				msgs = ((InternalEObject)newFrom).eInverseAdd(this, CommonPackage.FUNCTION_PORT__FROM_DELAY, FunctionPort.class, msgs);
			msgs = basicSetFrom(newFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.END_TO_END_DELAY__FROM, newFrom, newFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionPort getUntil() {
		if (until != null && until.eIsProxy()) {
			InternalEObject oldUntil = (InternalEObject)until;
			until = (FunctionPort)eResolveProxy(oldUntil);
			if (until != oldUntil) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RequirementsPackage.END_TO_END_DELAY__UNTIL, oldUntil, until));
			}
		}
		return until;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionPort basicGetUntil() {
		return until;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUntil(FunctionPort newUntil, NotificationChain msgs) {
		FunctionPort oldUntil = until;
		until = newUntil;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RequirementsPackage.END_TO_END_DELAY__UNTIL, oldUntil, newUntil);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUntil(FunctionPort newUntil) {
		if (newUntil != until) {
			NotificationChain msgs = null;
			if (until != null)
				msgs = ((InternalEObject)until).eInverseRemove(this, CommonPackage.FUNCTION_PORT__UNTIL_DELAY, FunctionPort.class, msgs);
			if (newUntil != null)
				msgs = ((InternalEObject)newUntil).eInverseAdd(this, CommonPackage.FUNCTION_PORT__UNTIL_DELAY, FunctionPort.class, msgs);
			msgs = basicSetUntil(newUntil, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.END_TO_END_DELAY__UNTIL, newUntil, newUntil));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getProbability() {
		return probability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProbability(int newProbability) {
		int oldProbability = probability;
		probability = newProbability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.END_TO_END_DELAY__PROBABILITY, oldProbability, probability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RequirementsPackage.END_TO_END_DELAY__FROM:
				if (from != null)
					msgs = ((InternalEObject)from).eInverseRemove(this, CommonPackage.FUNCTION_PORT__FROM_DELAY, FunctionPort.class, msgs);
				return basicSetFrom((FunctionPort)otherEnd, msgs);
			case RequirementsPackage.END_TO_END_DELAY__UNTIL:
				if (until != null)
					msgs = ((InternalEObject)until).eInverseRemove(this, CommonPackage.FUNCTION_PORT__UNTIL_DELAY, FunctionPort.class, msgs);
				return basicSetUntil((FunctionPort)otherEnd, msgs);
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
			case RequirementsPackage.END_TO_END_DELAY__UPPER:
				return basicSetUpper(null, msgs);
			case RequirementsPackage.END_TO_END_DELAY__LOWER:
				return basicSetLower(null, msgs);
			case RequirementsPackage.END_TO_END_DELAY__NOMINAL:
				return basicSetNominal(null, msgs);
			case RequirementsPackage.END_TO_END_DELAY__JITTER:
				return basicSetJitter(null, msgs);
			case RequirementsPackage.END_TO_END_DELAY__FROM:
				return basicSetFrom(null, msgs);
			case RequirementsPackage.END_TO_END_DELAY__UNTIL:
				return basicSetUntil(null, msgs);
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
			case RequirementsPackage.END_TO_END_DELAY__UPPER:
				return getUpper();
			case RequirementsPackage.END_TO_END_DELAY__LOWER:
				return getLower();
			case RequirementsPackage.END_TO_END_DELAY__NOMINAL:
				return getNominal();
			case RequirementsPackage.END_TO_END_DELAY__JITTER:
				return getJitter();
			case RequirementsPackage.END_TO_END_DELAY__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
			case RequirementsPackage.END_TO_END_DELAY__UNTIL:
				if (resolve) return getUntil();
				return basicGetUntil();
			case RequirementsPackage.END_TO_END_DELAY__PROBABILITY:
				return getProbability();
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
			case RequirementsPackage.END_TO_END_DELAY__UPPER:
				setUpper((Bound)newValue);
				return;
			case RequirementsPackage.END_TO_END_DELAY__LOWER:
				setLower((Bound)newValue);
				return;
			case RequirementsPackage.END_TO_END_DELAY__NOMINAL:
				setNominal((Bound)newValue);
				return;
			case RequirementsPackage.END_TO_END_DELAY__JITTER:
				setJitter((Bound)newValue);
				return;
			case RequirementsPackage.END_TO_END_DELAY__FROM:
				setFrom((FunctionPort)newValue);
				return;
			case RequirementsPackage.END_TO_END_DELAY__UNTIL:
				setUntil((FunctionPort)newValue);
				return;
			case RequirementsPackage.END_TO_END_DELAY__PROBABILITY:
				setProbability((Integer)newValue);
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
			case RequirementsPackage.END_TO_END_DELAY__UPPER:
				setUpper((Bound)null);
				return;
			case RequirementsPackage.END_TO_END_DELAY__LOWER:
				setLower((Bound)null);
				return;
			case RequirementsPackage.END_TO_END_DELAY__NOMINAL:
				setNominal((Bound)null);
				return;
			case RequirementsPackage.END_TO_END_DELAY__JITTER:
				setJitter((Bound)null);
				return;
			case RequirementsPackage.END_TO_END_DELAY__FROM:
				setFrom((FunctionPort)null);
				return;
			case RequirementsPackage.END_TO_END_DELAY__UNTIL:
				setUntil((FunctionPort)null);
				return;
			case RequirementsPackage.END_TO_END_DELAY__PROBABILITY:
				setProbability(PROBABILITY_EDEFAULT);
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
			case RequirementsPackage.END_TO_END_DELAY__UPPER:
				return upper != null;
			case RequirementsPackage.END_TO_END_DELAY__LOWER:
				return lower != null;
			case RequirementsPackage.END_TO_END_DELAY__NOMINAL:
				return nominal != null;
			case RequirementsPackage.END_TO_END_DELAY__JITTER:
				return jitter != null;
			case RequirementsPackage.END_TO_END_DELAY__FROM:
				return from != null;
			case RequirementsPackage.END_TO_END_DELAY__UNTIL:
				return until != null;
			case RequirementsPackage.END_TO_END_DELAY__PROBABILITY:
				return probability != PROBABILITY_EDEFAULT;
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
				case RequirementsPackage.END_TO_END_DELAY__UPPER: return RequirementsPackage.TIMING_RESTRICTION__UPPER;
				case RequirementsPackage.END_TO_END_DELAY__LOWER: return RequirementsPackage.TIMING_RESTRICTION__LOWER;
				case RequirementsPackage.END_TO_END_DELAY__NOMINAL: return RequirementsPackage.TIMING_RESTRICTION__NOMINAL;
				case RequirementsPackage.END_TO_END_DELAY__JITTER: return RequirementsPackage.TIMING_RESTRICTION__JITTER;
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
				case RequirementsPackage.TIMING_RESTRICTION__UPPER: return RequirementsPackage.END_TO_END_DELAY__UPPER;
				case RequirementsPackage.TIMING_RESTRICTION__LOWER: return RequirementsPackage.END_TO_END_DELAY__LOWER;
				case RequirementsPackage.TIMING_RESTRICTION__NOMINAL: return RequirementsPackage.END_TO_END_DELAY__NOMINAL;
				case RequirementsPackage.TIMING_RESTRICTION__JITTER: return RequirementsPackage.END_TO_END_DELAY__JITTER;
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
		result.append(" (probability: ");
		result.append(probability);
		result.append(')');
		return result.toString();
	}

} //EndToEndDelayImpl
