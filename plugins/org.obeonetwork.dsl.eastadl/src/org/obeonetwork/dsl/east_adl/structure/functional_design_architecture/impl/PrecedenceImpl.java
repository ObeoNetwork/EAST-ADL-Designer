/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.obeonetwork.dsl.east_adl.core.impl.EASTADLNamedElementImpl;

import org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction;
import org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Functional_design_architecturePackage;
import org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Precedence;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Precedence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.PrecedenceImpl#getPredecessor <em>Predecessor</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.PrecedenceImpl#getSuccessor <em>Successor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrecedenceImpl extends EASTADLNamedElementImpl implements Precedence {
	/**
	 * The cached value of the '{@link #getSuccessor() <em>Successor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessor()
	 * @generated
	 * @ordered
	 */
	protected ElementarySoftwareFunction successor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrecedenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Functional_design_architecturePackage.Literals.PRECEDENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementarySoftwareFunction getPredecessor() {
		if (eContainerFeatureID() != Functional_design_architecturePackage.PRECEDENCE__PREDECESSOR) return null;
		return (ElementarySoftwareFunction)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPredecessor(ElementarySoftwareFunction newPredecessor, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPredecessor, Functional_design_architecturePackage.PRECEDENCE__PREDECESSOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredecessor(ElementarySoftwareFunction newPredecessor) {
		if (newPredecessor != eInternalContainer() || (eContainerFeatureID() != Functional_design_architecturePackage.PRECEDENCE__PREDECESSOR && newPredecessor != null)) {
			if (EcoreUtil.isAncestor(this, newPredecessor))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPredecessor != null)
				msgs = ((InternalEObject)newPredecessor).eInverseAdd(this, Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__ACTIVE_PRECEDENCIES, ElementarySoftwareFunction.class, msgs);
			msgs = basicSetPredecessor(newPredecessor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Functional_design_architecturePackage.PRECEDENCE__PREDECESSOR, newPredecessor, newPredecessor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementarySoftwareFunction getSuccessor() {
		if (successor != null && successor.eIsProxy()) {
			InternalEObject oldSuccessor = (InternalEObject)successor;
			successor = (ElementarySoftwareFunction)eResolveProxy(oldSuccessor);
			if (successor != oldSuccessor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Functional_design_architecturePackage.PRECEDENCE__SUCCESSOR, oldSuccessor, successor));
			}
		}
		return successor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementarySoftwareFunction basicGetSuccessor() {
		return successor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuccessor(ElementarySoftwareFunction newSuccessor, NotificationChain msgs) {
		ElementarySoftwareFunction oldSuccessor = successor;
		successor = newSuccessor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Functional_design_architecturePackage.PRECEDENCE__SUCCESSOR, oldSuccessor, newSuccessor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuccessor(ElementarySoftwareFunction newSuccessor) {
		if (newSuccessor != successor) {
			NotificationChain msgs = null;
			if (successor != null)
				msgs = ((InternalEObject)successor).eInverseRemove(this, Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__PASSIVE_PRECEDENCIES, ElementarySoftwareFunction.class, msgs);
			if (newSuccessor != null)
				msgs = ((InternalEObject)newSuccessor).eInverseAdd(this, Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__PASSIVE_PRECEDENCIES, ElementarySoftwareFunction.class, msgs);
			msgs = basicSetSuccessor(newSuccessor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Functional_design_architecturePackage.PRECEDENCE__SUCCESSOR, newSuccessor, newSuccessor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Functional_design_architecturePackage.PRECEDENCE__PREDECESSOR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPredecessor((ElementarySoftwareFunction)otherEnd, msgs);
			case Functional_design_architecturePackage.PRECEDENCE__SUCCESSOR:
				if (successor != null)
					msgs = ((InternalEObject)successor).eInverseRemove(this, Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__PASSIVE_PRECEDENCIES, ElementarySoftwareFunction.class, msgs);
				return basicSetSuccessor((ElementarySoftwareFunction)otherEnd, msgs);
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
			case Functional_design_architecturePackage.PRECEDENCE__PREDECESSOR:
				return basicSetPredecessor(null, msgs);
			case Functional_design_architecturePackage.PRECEDENCE__SUCCESSOR:
				return basicSetSuccessor(null, msgs);
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
			case Functional_design_architecturePackage.PRECEDENCE__PREDECESSOR:
				return eInternalContainer().eInverseRemove(this, Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION__ACTIVE_PRECEDENCIES, ElementarySoftwareFunction.class, msgs);
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
			case Functional_design_architecturePackage.PRECEDENCE__PREDECESSOR:
				return getPredecessor();
			case Functional_design_architecturePackage.PRECEDENCE__SUCCESSOR:
				if (resolve) return getSuccessor();
				return basicGetSuccessor();
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
			case Functional_design_architecturePackage.PRECEDENCE__PREDECESSOR:
				setPredecessor((ElementarySoftwareFunction)newValue);
				return;
			case Functional_design_architecturePackage.PRECEDENCE__SUCCESSOR:
				setSuccessor((ElementarySoftwareFunction)newValue);
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
			case Functional_design_architecturePackage.PRECEDENCE__PREDECESSOR:
				setPredecessor((ElementarySoftwareFunction)null);
				return;
			case Functional_design_architecturePackage.PRECEDENCE__SUCCESSOR:
				setSuccessor((ElementarySoftwareFunction)null);
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
			case Functional_design_architecturePackage.PRECEDENCE__PREDECESSOR:
				return getPredecessor() != null;
			case Functional_design_architecturePackage.PRECEDENCE__SUCCESSOR:
				return successor != null;
		}
		return super.eIsSet(featureID);
	}

} //PrecedenceImpl
