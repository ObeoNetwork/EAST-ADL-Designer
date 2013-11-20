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

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.obeonetwork.dsl.east_adl.core.impl.EASTADLNamedElementImpl;

import org.obeonetwork.dsl.east_adl.requirements.Requirement;
import org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage;
import org.obeonetwork.dsl.east_adl.requirements.Trace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.impl.TraceImpl#getTracer <em>Tracer</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.impl.TraceImpl#getTraced <em>Traced</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TraceImpl extends EASTADLNamedElementImpl implements Trace {
	/**
	 * The cached value of the '{@link #getTraced() <em>Traced</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraced()
	 * @generated
	 * @ordered
	 */
	protected Requirement traced;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementsPackage.Literals.TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement getTracer() {
		if (eContainerFeatureID() != RequirementsPackage.TRACE__TRACER) return null;
		return (Requirement)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTracer(Requirement newTracer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTracer, RequirementsPackage.TRACE__TRACER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTracer(Requirement newTracer) {
		if (newTracer != eInternalContainer() || (eContainerFeatureID() != RequirementsPackage.TRACE__TRACER && newTracer != null)) {
			if (EcoreUtil.isAncestor(this, newTracer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTracer != null)
				msgs = ((InternalEObject)newTracer).eInverseAdd(this, RequirementsPackage.REQUIREMENT__ACTIVE_TRACES, Requirement.class, msgs);
			msgs = basicSetTracer(newTracer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.TRACE__TRACER, newTracer, newTracer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement getTraced() {
		if (traced != null && traced.eIsProxy()) {
			InternalEObject oldTraced = (InternalEObject)traced;
			traced = (Requirement)eResolveProxy(oldTraced);
			if (traced != oldTraced) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RequirementsPackage.TRACE__TRACED, oldTraced, traced));
			}
		}
		return traced;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement basicGetTraced() {
		return traced;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTraced(Requirement newTraced, NotificationChain msgs) {
		Requirement oldTraced = traced;
		traced = newTraced;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RequirementsPackage.TRACE__TRACED, oldTraced, newTraced);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTraced(Requirement newTraced) {
		if (newTraced != traced) {
			NotificationChain msgs = null;
			if (traced != null)
				msgs = ((InternalEObject)traced).eInverseRemove(this, RequirementsPackage.REQUIREMENT__PASSIVE_TRACES, Requirement.class, msgs);
			if (newTraced != null)
				msgs = ((InternalEObject)newTraced).eInverseAdd(this, RequirementsPackage.REQUIREMENT__PASSIVE_TRACES, Requirement.class, msgs);
			msgs = basicSetTraced(newTraced, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.TRACE__TRACED, newTraced, newTraced));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RequirementsPackage.TRACE__TRACER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTracer((Requirement)otherEnd, msgs);
			case RequirementsPackage.TRACE__TRACED:
				if (traced != null)
					msgs = ((InternalEObject)traced).eInverseRemove(this, RequirementsPackage.REQUIREMENT__PASSIVE_TRACES, Requirement.class, msgs);
				return basicSetTraced((Requirement)otherEnd, msgs);
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
			case RequirementsPackage.TRACE__TRACER:
				return basicSetTracer(null, msgs);
			case RequirementsPackage.TRACE__TRACED:
				return basicSetTraced(null, msgs);
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
			case RequirementsPackage.TRACE__TRACER:
				return eInternalContainer().eInverseRemove(this, RequirementsPackage.REQUIREMENT__ACTIVE_TRACES, Requirement.class, msgs);
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
			case RequirementsPackage.TRACE__TRACER:
				return getTracer();
			case RequirementsPackage.TRACE__TRACED:
				if (resolve) return getTraced();
				return basicGetTraced();
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
			case RequirementsPackage.TRACE__TRACER:
				setTracer((Requirement)newValue);
				return;
			case RequirementsPackage.TRACE__TRACED:
				setTraced((Requirement)newValue);
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
			case RequirementsPackage.TRACE__TRACER:
				setTracer((Requirement)null);
				return;
			case RequirementsPackage.TRACE__TRACED:
				setTraced((Requirement)null);
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
			case RequirementsPackage.TRACE__TRACER:
				return getTracer() != null;
			case RequirementsPackage.TRACE__TRACED:
				return traced != null;
		}
		return super.eIsSet(featureID);
	}

} //TraceImpl
