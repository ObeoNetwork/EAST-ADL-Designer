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

import org.obeonetwork.dsl.east_adl.structure.function_instance_model.Function_instance_modelPackage;
import org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstance;

import org.obeonetwork.dsl.east_adl.structure.platform_model.IPCExchanger;
import org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel;
import org.obeonetwork.dsl.east_adl.structure.platform_model.Platform_modelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IPC Exchanger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.platform_model.impl.IPCExchangerImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.platform_model.impl.IPCExchangerImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.platform_model.impl.IPCExchangerImpl#getOwningArtifact <em>Owning Artifact</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IPCExchangerImpl extends EASTADLEntityImpl implements IPCExchanger {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected SignalInstance source;

	/**
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected SignalInstance destination;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IPCExchangerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Platform_modelPackage.Literals.IPC_EXCHANGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalInstance getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (SignalInstance)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Platform_modelPackage.IPC_EXCHANGER__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalInstance basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(SignalInstance newSource, NotificationChain msgs) {
		SignalInstance oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Platform_modelPackage.IPC_EXCHANGER__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(SignalInstance newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, Function_instance_modelPackage.SIGNAL_INSTANCE__OUTGOING_EXCHANGERS, SignalInstance.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, Function_instance_modelPackage.SIGNAL_INSTANCE__OUTGOING_EXCHANGERS, SignalInstance.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Platform_modelPackage.IPC_EXCHANGER__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalInstance getDestination() {
		if (destination != null && destination.eIsProxy()) {
			InternalEObject oldDestination = (InternalEObject)destination;
			destination = (SignalInstance)eResolveProxy(oldDestination);
			if (destination != oldDestination) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Platform_modelPackage.IPC_EXCHANGER__DESTINATION, oldDestination, destination));
			}
		}
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalInstance basicGetDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDestination(SignalInstance newDestination, NotificationChain msgs) {
		SignalInstance oldDestination = destination;
		destination = newDestination;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Platform_modelPackage.IPC_EXCHANGER__DESTINATION, oldDestination, newDestination);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestination(SignalInstance newDestination) {
		if (newDestination != destination) {
			NotificationChain msgs = null;
			if (destination != null)
				msgs = ((InternalEObject)destination).eInverseRemove(this, Function_instance_modelPackage.SIGNAL_INSTANCE__INCOMING_EXCHANGERS, SignalInstance.class, msgs);
			if (newDestination != null)
				msgs = ((InternalEObject)newDestination).eInverseAdd(this, Function_instance_modelPackage.SIGNAL_INSTANCE__INCOMING_EXCHANGERS, SignalInstance.class, msgs);
			msgs = basicSetDestination(newDestination, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Platform_modelPackage.IPC_EXCHANGER__DESTINATION, newDestination, newDestination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformModel getOwningArtifact() {
		if (eContainerFeatureID() != Platform_modelPackage.IPC_EXCHANGER__OWNING_ARTIFACT) return null;
		return (PlatformModel)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningArtifact(PlatformModel newOwningArtifact, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningArtifact, Platform_modelPackage.IPC_EXCHANGER__OWNING_ARTIFACT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningArtifact(PlatformModel newOwningArtifact) {
		if (newOwningArtifact != eInternalContainer() || (eContainerFeatureID() != Platform_modelPackage.IPC_EXCHANGER__OWNING_ARTIFACT && newOwningArtifact != null)) {
			if (EcoreUtil.isAncestor(this, newOwningArtifact))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningArtifact != null)
				msgs = ((InternalEObject)newOwningArtifact).eInverseAdd(this, Platform_modelPackage.PLATFORM_MODEL__IPC_EXCHANGERS, PlatformModel.class, msgs);
			msgs = basicSetOwningArtifact(newOwningArtifact, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Platform_modelPackage.IPC_EXCHANGER__OWNING_ARTIFACT, newOwningArtifact, newOwningArtifact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Platform_modelPackage.IPC_EXCHANGER__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, Function_instance_modelPackage.SIGNAL_INSTANCE__OUTGOING_EXCHANGERS, SignalInstance.class, msgs);
				return basicSetSource((SignalInstance)otherEnd, msgs);
			case Platform_modelPackage.IPC_EXCHANGER__DESTINATION:
				if (destination != null)
					msgs = ((InternalEObject)destination).eInverseRemove(this, Function_instance_modelPackage.SIGNAL_INSTANCE__INCOMING_EXCHANGERS, SignalInstance.class, msgs);
				return basicSetDestination((SignalInstance)otherEnd, msgs);
			case Platform_modelPackage.IPC_EXCHANGER__OWNING_ARTIFACT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningArtifact((PlatformModel)otherEnd, msgs);
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
			case Platform_modelPackage.IPC_EXCHANGER__SOURCE:
				return basicSetSource(null, msgs);
			case Platform_modelPackage.IPC_EXCHANGER__DESTINATION:
				return basicSetDestination(null, msgs);
			case Platform_modelPackage.IPC_EXCHANGER__OWNING_ARTIFACT:
				return basicSetOwningArtifact(null, msgs);
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
			case Platform_modelPackage.IPC_EXCHANGER__OWNING_ARTIFACT:
				return eInternalContainer().eInverseRemove(this, Platform_modelPackage.PLATFORM_MODEL__IPC_EXCHANGERS, PlatformModel.class, msgs);
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
			case Platform_modelPackage.IPC_EXCHANGER__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case Platform_modelPackage.IPC_EXCHANGER__DESTINATION:
				if (resolve) return getDestination();
				return basicGetDestination();
			case Platform_modelPackage.IPC_EXCHANGER__OWNING_ARTIFACT:
				return getOwningArtifact();
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
			case Platform_modelPackage.IPC_EXCHANGER__SOURCE:
				setSource((SignalInstance)newValue);
				return;
			case Platform_modelPackage.IPC_EXCHANGER__DESTINATION:
				setDestination((SignalInstance)newValue);
				return;
			case Platform_modelPackage.IPC_EXCHANGER__OWNING_ARTIFACT:
				setOwningArtifact((PlatformModel)newValue);
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
			case Platform_modelPackage.IPC_EXCHANGER__SOURCE:
				setSource((SignalInstance)null);
				return;
			case Platform_modelPackage.IPC_EXCHANGER__DESTINATION:
				setDestination((SignalInstance)null);
				return;
			case Platform_modelPackage.IPC_EXCHANGER__OWNING_ARTIFACT:
				setOwningArtifact((PlatformModel)null);
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
			case Platform_modelPackage.IPC_EXCHANGER__SOURCE:
				return source != null;
			case Platform_modelPackage.IPC_EXCHANGER__DESTINATION:
				return destination != null;
			case Platform_modelPackage.IPC_EXCHANGER__OWNING_ARTIFACT:
				return getOwningArtifact() != null;
		}
		return super.eIsSet(featureID);
	}

} //IPCExchangerImpl
