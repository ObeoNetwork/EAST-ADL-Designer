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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.east_adl.core.EASTADLEntity;

import org.obeonetwork.dsl.east_adl.core.impl.EASTADLEntityImpl;

import org.obeonetwork.dsl.east_adl.structure.allocation_model.Allocation_modelPackage;
import org.obeonetwork.dsl.east_adl.structure.allocation_model.SignalDeployment;

import org.obeonetwork.dsl.east_adl.structure.common.CommonPackage;
import org.obeonetwork.dsl.east_adl.structure.common.ConnectorSignal;

import org.obeonetwork.dsl.east_adl.structure.function_instance_model.Function_instance_modelPackage;
import org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstance;
import org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstanceTarget;

import org.obeonetwork.dsl.east_adl.structure.platform_model.IPCExchanger;
import org.obeonetwork.dsl.east_adl.structure.platform_model.Platform_modelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signal Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.SignalInstanceImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.SignalInstanceImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.SignalInstanceImpl#getInstantiatedSignal <em>Instantiated Signal</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.SignalInstanceImpl#getPassiveDeployments <em>Passive Deployments</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.SignalInstanceImpl#getDeployers <em>Deployers</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.SignalInstanceImpl#getOutgoingExchangers <em>Outgoing Exchangers</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.SignalInstanceImpl#getIncomingExchangers <em>Incoming Exchangers</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.SignalInstanceImpl#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SignalInstanceImpl extends EASTADLEntityImpl implements SignalInstance {
	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final int SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected int size = SIZE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected SignalInstanceTarget destination;

	/**
	 * The cached value of the '{@link #getInstantiatedSignal() <em>Instantiated Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantiatedSignal()
	 * @generated
	 * @ordered
	 */
	protected ConnectorSignal instantiatedSignal;

	/**
	 * The cached value of the '{@link #getPassiveDeployments() <em>Passive Deployments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassiveDeployments()
	 * @generated
	 * @ordered
	 */
	protected EList<SignalDeployment> passiveDeployments;

	/**
	 * The cached value of the '{@link #getOutgoingExchangers() <em>Outgoing Exchangers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingExchangers()
	 * @generated
	 * @ordered
	 */
	protected EList<IPCExchanger> outgoingExchangers;

	/**
	 * The cached value of the '{@link #getIncomingExchangers() <em>Incoming Exchangers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingExchangers()
	 * @generated
	 * @ordered
	 */
	protected EList<IPCExchanger> incomingExchangers;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected SignalInstanceTarget source;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignalInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Function_instance_modelPackage.Literals.SIGNAL_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(int newSize) {
		int oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Function_instance_modelPackage.SIGNAL_INSTANCE__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalInstanceTarget getDestination() {
		if (destination != null && destination.eIsProxy()) {
			InternalEObject oldDestination = (InternalEObject)destination;
			destination = (SignalInstanceTarget)eResolveProxy(oldDestination);
			if (destination != oldDestination) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Function_instance_modelPackage.SIGNAL_INSTANCE__DESTINATION, oldDestination, destination));
			}
		}
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalInstanceTarget basicGetDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDestination(SignalInstanceTarget newDestination, NotificationChain msgs) {
		SignalInstanceTarget oldDestination = destination;
		destination = newDestination;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Function_instance_modelPackage.SIGNAL_INSTANCE__DESTINATION, oldDestination, newDestination);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestination(SignalInstanceTarget newDestination) {
		if (newDestination != destination) {
			NotificationChain msgs = null;
			if (destination != null)
				msgs = ((InternalEObject)destination).eInverseRemove(this, Function_instance_modelPackage.SIGNAL_INSTANCE_TARGET__INCOMING_SIGNALS, SignalInstanceTarget.class, msgs);
			if (newDestination != null)
				msgs = ((InternalEObject)newDestination).eInverseAdd(this, Function_instance_modelPackage.SIGNAL_INSTANCE_TARGET__INCOMING_SIGNALS, SignalInstanceTarget.class, msgs);
			msgs = basicSetDestination(newDestination, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Function_instance_modelPackage.SIGNAL_INSTANCE__DESTINATION, newDestination, newDestination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorSignal getInstantiatedSignal() {
		if (instantiatedSignal != null && instantiatedSignal.eIsProxy()) {
			InternalEObject oldInstantiatedSignal = (InternalEObject)instantiatedSignal;
			instantiatedSignal = (ConnectorSignal)eResolveProxy(oldInstantiatedSignal);
			if (instantiatedSignal != oldInstantiatedSignal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Function_instance_modelPackage.SIGNAL_INSTANCE__INSTANTIATED_SIGNAL, oldInstantiatedSignal, instantiatedSignal));
			}
		}
		return instantiatedSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorSignal basicGetInstantiatedSignal() {
		return instantiatedSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstantiatedSignal(ConnectorSignal newInstantiatedSignal, NotificationChain msgs) {
		ConnectorSignal oldInstantiatedSignal = instantiatedSignal;
		instantiatedSignal = newInstantiatedSignal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Function_instance_modelPackage.SIGNAL_INSTANCE__INSTANTIATED_SIGNAL, oldInstantiatedSignal, newInstantiatedSignal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstantiatedSignal(ConnectorSignal newInstantiatedSignal) {
		if (newInstantiatedSignal != instantiatedSignal) {
			NotificationChain msgs = null;
			if (instantiatedSignal != null)
				msgs = ((InternalEObject)instantiatedSignal).eInverseRemove(this, CommonPackage.CONNECTOR_SIGNAL__INSTANCES, ConnectorSignal.class, msgs);
			if (newInstantiatedSignal != null)
				msgs = ((InternalEObject)newInstantiatedSignal).eInverseAdd(this, CommonPackage.CONNECTOR_SIGNAL__INSTANCES, ConnectorSignal.class, msgs);
			msgs = basicSetInstantiatedSignal(newInstantiatedSignal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Function_instance_modelPackage.SIGNAL_INSTANCE__INSTANTIATED_SIGNAL, newInstantiatedSignal, newInstantiatedSignal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SignalDeployment> getPassiveDeployments() {
		if (passiveDeployments == null) {
			passiveDeployments = new EObjectWithInverseResolvingEList<SignalDeployment>(SignalDeployment.class, this, Function_instance_modelPackage.SIGNAL_INSTANCE__PASSIVE_DEPLOYMENTS, Allocation_modelPackage.SIGNAL_DEPLOYMENT__DEPLOYED);
		}
		return passiveDeployments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EASTADLEntity> getDeployers() {
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
	public EList<IPCExchanger> getOutgoingExchangers() {
		if (outgoingExchangers == null) {
			outgoingExchangers = new EObjectWithInverseResolvingEList<IPCExchanger>(IPCExchanger.class, this, Function_instance_modelPackage.SIGNAL_INSTANCE__OUTGOING_EXCHANGERS, Platform_modelPackage.IPC_EXCHANGER__SOURCE);
		}
		return outgoingExchangers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IPCExchanger> getIncomingExchangers() {
		if (incomingExchangers == null) {
			incomingExchangers = new EObjectWithInverseResolvingEList<IPCExchanger>(IPCExchanger.class, this, Function_instance_modelPackage.SIGNAL_INSTANCE__INCOMING_EXCHANGERS, Platform_modelPackage.IPC_EXCHANGER__DESTINATION);
		}
		return incomingExchangers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalInstanceTarget getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (SignalInstanceTarget)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Function_instance_modelPackage.SIGNAL_INSTANCE__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalInstanceTarget basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(SignalInstanceTarget newSource, NotificationChain msgs) {
		SignalInstanceTarget oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Function_instance_modelPackage.SIGNAL_INSTANCE__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(SignalInstanceTarget newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, Function_instance_modelPackage.SIGNAL_INSTANCE_TARGET__OUTGOING_SIGNALS, SignalInstanceTarget.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, Function_instance_modelPackage.SIGNAL_INSTANCE_TARGET__OUTGOING_SIGNALS, SignalInstanceTarget.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Function_instance_modelPackage.SIGNAL_INSTANCE__SOURCE, newSource, newSource));
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
			case Function_instance_modelPackage.SIGNAL_INSTANCE__DESTINATION:
				if (destination != null)
					msgs = ((InternalEObject)destination).eInverseRemove(this, Function_instance_modelPackage.SIGNAL_INSTANCE_TARGET__INCOMING_SIGNALS, SignalInstanceTarget.class, msgs);
				return basicSetDestination((SignalInstanceTarget)otherEnd, msgs);
			case Function_instance_modelPackage.SIGNAL_INSTANCE__INSTANTIATED_SIGNAL:
				if (instantiatedSignal != null)
					msgs = ((InternalEObject)instantiatedSignal).eInverseRemove(this, CommonPackage.CONNECTOR_SIGNAL__INSTANCES, ConnectorSignal.class, msgs);
				return basicSetInstantiatedSignal((ConnectorSignal)otherEnd, msgs);
			case Function_instance_modelPackage.SIGNAL_INSTANCE__PASSIVE_DEPLOYMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPassiveDeployments()).basicAdd(otherEnd, msgs);
			case Function_instance_modelPackage.SIGNAL_INSTANCE__OUTGOING_EXCHANGERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingExchangers()).basicAdd(otherEnd, msgs);
			case Function_instance_modelPackage.SIGNAL_INSTANCE__INCOMING_EXCHANGERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingExchangers()).basicAdd(otherEnd, msgs);
			case Function_instance_modelPackage.SIGNAL_INSTANCE__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, Function_instance_modelPackage.SIGNAL_INSTANCE_TARGET__OUTGOING_SIGNALS, SignalInstanceTarget.class, msgs);
				return basicSetSource((SignalInstanceTarget)otherEnd, msgs);
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
			case Function_instance_modelPackage.SIGNAL_INSTANCE__DESTINATION:
				return basicSetDestination(null, msgs);
			case Function_instance_modelPackage.SIGNAL_INSTANCE__INSTANTIATED_SIGNAL:
				return basicSetInstantiatedSignal(null, msgs);
			case Function_instance_modelPackage.SIGNAL_INSTANCE__PASSIVE_DEPLOYMENTS:
				return ((InternalEList<?>)getPassiveDeployments()).basicRemove(otherEnd, msgs);
			case Function_instance_modelPackage.SIGNAL_INSTANCE__OUTGOING_EXCHANGERS:
				return ((InternalEList<?>)getOutgoingExchangers()).basicRemove(otherEnd, msgs);
			case Function_instance_modelPackage.SIGNAL_INSTANCE__INCOMING_EXCHANGERS:
				return ((InternalEList<?>)getIncomingExchangers()).basicRemove(otherEnd, msgs);
			case Function_instance_modelPackage.SIGNAL_INSTANCE__SOURCE:
				return basicSetSource(null, msgs);
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
			case Function_instance_modelPackage.SIGNAL_INSTANCE__SIZE:
				return getSize();
			case Function_instance_modelPackage.SIGNAL_INSTANCE__DESTINATION:
				if (resolve) return getDestination();
				return basicGetDestination();
			case Function_instance_modelPackage.SIGNAL_INSTANCE__INSTANTIATED_SIGNAL:
				if (resolve) return getInstantiatedSignal();
				return basicGetInstantiatedSignal();
			case Function_instance_modelPackage.SIGNAL_INSTANCE__PASSIVE_DEPLOYMENTS:
				return getPassiveDeployments();
			case Function_instance_modelPackage.SIGNAL_INSTANCE__DEPLOYERS:
				return getDeployers();
			case Function_instance_modelPackage.SIGNAL_INSTANCE__OUTGOING_EXCHANGERS:
				return getOutgoingExchangers();
			case Function_instance_modelPackage.SIGNAL_INSTANCE__INCOMING_EXCHANGERS:
				return getIncomingExchangers();
			case Function_instance_modelPackage.SIGNAL_INSTANCE__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
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
			case Function_instance_modelPackage.SIGNAL_INSTANCE__SIZE:
				setSize((Integer)newValue);
				return;
			case Function_instance_modelPackage.SIGNAL_INSTANCE__DESTINATION:
				setDestination((SignalInstanceTarget)newValue);
				return;
			case Function_instance_modelPackage.SIGNAL_INSTANCE__INSTANTIATED_SIGNAL:
				setInstantiatedSignal((ConnectorSignal)newValue);
				return;
			case Function_instance_modelPackage.SIGNAL_INSTANCE__PASSIVE_DEPLOYMENTS:
				getPassiveDeployments().clear();
				getPassiveDeployments().addAll((Collection<? extends SignalDeployment>)newValue);
				return;
			case Function_instance_modelPackage.SIGNAL_INSTANCE__OUTGOING_EXCHANGERS:
				getOutgoingExchangers().clear();
				getOutgoingExchangers().addAll((Collection<? extends IPCExchanger>)newValue);
				return;
			case Function_instance_modelPackage.SIGNAL_INSTANCE__INCOMING_EXCHANGERS:
				getIncomingExchangers().clear();
				getIncomingExchangers().addAll((Collection<? extends IPCExchanger>)newValue);
				return;
			case Function_instance_modelPackage.SIGNAL_INSTANCE__SOURCE:
				setSource((SignalInstanceTarget)newValue);
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
			case Function_instance_modelPackage.SIGNAL_INSTANCE__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case Function_instance_modelPackage.SIGNAL_INSTANCE__DESTINATION:
				setDestination((SignalInstanceTarget)null);
				return;
			case Function_instance_modelPackage.SIGNAL_INSTANCE__INSTANTIATED_SIGNAL:
				setInstantiatedSignal((ConnectorSignal)null);
				return;
			case Function_instance_modelPackage.SIGNAL_INSTANCE__PASSIVE_DEPLOYMENTS:
				getPassiveDeployments().clear();
				return;
			case Function_instance_modelPackage.SIGNAL_INSTANCE__OUTGOING_EXCHANGERS:
				getOutgoingExchangers().clear();
				return;
			case Function_instance_modelPackage.SIGNAL_INSTANCE__INCOMING_EXCHANGERS:
				getIncomingExchangers().clear();
				return;
			case Function_instance_modelPackage.SIGNAL_INSTANCE__SOURCE:
				setSource((SignalInstanceTarget)null);
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
			case Function_instance_modelPackage.SIGNAL_INSTANCE__SIZE:
				return size != SIZE_EDEFAULT;
			case Function_instance_modelPackage.SIGNAL_INSTANCE__DESTINATION:
				return destination != null;
			case Function_instance_modelPackage.SIGNAL_INSTANCE__INSTANTIATED_SIGNAL:
				return instantiatedSignal != null;
			case Function_instance_modelPackage.SIGNAL_INSTANCE__PASSIVE_DEPLOYMENTS:
				return passiveDeployments != null && !passiveDeployments.isEmpty();
			case Function_instance_modelPackage.SIGNAL_INSTANCE__DEPLOYERS:
				return !getDeployers().isEmpty();
			case Function_instance_modelPackage.SIGNAL_INSTANCE__OUTGOING_EXCHANGERS:
				return outgoingExchangers != null && !outgoingExchangers.isEmpty();
			case Function_instance_modelPackage.SIGNAL_INSTANCE__INCOMING_EXCHANGERS:
				return incomingExchangers != null && !incomingExchangers.isEmpty();
			case Function_instance_modelPackage.SIGNAL_INSTANCE__SOURCE:
				return source != null;
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
		result.append(" (size: ");
		result.append(size);
		result.append(')');
		return result.toString();
	}

} //SignalInstanceImpl
