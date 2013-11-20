/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.allocation_model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.east_adl.core.impl.EASTADLEntityImpl;

import org.obeonetwork.dsl.east_adl.requirements.TimingRestriction;

import org.obeonetwork.dsl.east_adl.structure.allocation_model.AllocationModel;
import org.obeonetwork.dsl.east_adl.structure.allocation_model.Allocation_modelPackage;
import org.obeonetwork.dsl.east_adl.structure.allocation_model.Frame;
import org.obeonetwork.dsl.east_adl.structure.allocation_model.SignalDeployment;

import org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstance;

import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Channel;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Frame</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.impl.FrameImpl#getOwningArtifact <em>Owning Artifact</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.impl.FrameImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.impl.FrameImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.impl.FrameImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.impl.FrameImpl#getDataSize <em>Data Size</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.impl.FrameImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.impl.FrameImpl#getDeployments <em>Deployments</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.impl.FrameImpl#getDeployedSignalInstances <em>Deployed Signal Instances</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.allocation_model.impl.FrameImpl#getSendingChannel <em>Sending Channel</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FrameImpl extends EASTADLEntityImpl implements Frame {
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
	 * The default value of the '{@link #getDataSize() <em>Data Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSize()
	 * @generated
	 * @ordered
	 */
	protected static final int DATA_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDataSize() <em>Data Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSize()
	 * @generated
	 * @ordered
	 */
	protected int dataSize = DATA_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected int priority = PRIORITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDeployments() <em>Deployments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployments()
	 * @generated
	 * @ordered
	 */
	protected EList<SignalDeployment> deployments;

	/**
	 * The cached value of the '{@link #getSendingChannel() <em>Sending Channel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendingChannel()
	 * @generated
	 * @ordered
	 */
	protected Channel sendingChannel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FrameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Allocation_modelPackage.Literals.FRAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationModel getOwningArtifact() {
		if (eContainerFeatureID() != Allocation_modelPackage.FRAME__OWNING_ARTIFACT) return null;
		return (AllocationModel)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningArtifact(AllocationModel newOwningArtifact, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningArtifact, Allocation_modelPackage.FRAME__OWNING_ARTIFACT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningArtifact(AllocationModel newOwningArtifact) {
		if (newOwningArtifact != eInternalContainer() || (eContainerFeatureID() != Allocation_modelPackage.FRAME__OWNING_ARTIFACT && newOwningArtifact != null)) {
			if (EcoreUtil.isAncestor(this, newOwningArtifact))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningArtifact != null)
				msgs = ((InternalEObject)newOwningArtifact).eInverseAdd(this, Allocation_modelPackage.ALLOCATION_MODEL__FRAMES, AllocationModel.class, msgs);
			msgs = basicSetOwningArtifact(newOwningArtifact, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Allocation_modelPackage.FRAME__OWNING_ARTIFACT, newOwningArtifact, newOwningArtifact));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Allocation_modelPackage.FRAME__PERIOD, oldPeriod, newPeriod);
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
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Allocation_modelPackage.FRAME__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Allocation_modelPackage.FRAME__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Allocation_modelPackage.FRAME__PERIOD, newPeriod, newPeriod));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Allocation_modelPackage.FRAME__OFFSET, oldOffset, newOffset);
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
				msgs = ((InternalEObject)offset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Allocation_modelPackage.FRAME__OFFSET, null, msgs);
			if (newOffset != null)
				msgs = ((InternalEObject)newOffset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Allocation_modelPackage.FRAME__OFFSET, null, msgs);
			msgs = basicSetOffset(newOffset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Allocation_modelPackage.FRAME__OFFSET, newOffset, newOffset));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Allocation_modelPackage.FRAME__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDataSize() {
		return dataSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSize(int newDataSize) {
		int oldDataSize = dataSize;
		dataSize = newDataSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Allocation_modelPackage.FRAME__DATA_SIZE, oldDataSize, dataSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(int newPriority) {
		int oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Allocation_modelPackage.FRAME__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SignalDeployment> getDeployments() {
		if (deployments == null) {
			deployments = new EObjectContainmentEList<SignalDeployment>(SignalDeployment.class, this, Allocation_modelPackage.FRAME__DEPLOYMENTS);
		}
		return deployments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SignalInstance> getDeployedSignalInstances() {
		// TODO: implement this method to return the 'Deployed Signal Instances' reference list
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
	public Channel getSendingChannel() {
		if (sendingChannel != null && sendingChannel.eIsProxy()) {
			InternalEObject oldSendingChannel = (InternalEObject)sendingChannel;
			sendingChannel = (Channel)eResolveProxy(oldSendingChannel);
			if (sendingChannel != oldSendingChannel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Allocation_modelPackage.FRAME__SENDING_CHANNEL, oldSendingChannel, sendingChannel));
			}
		}
		return sendingChannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Channel basicGetSendingChannel() {
		return sendingChannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSendingChannel(Channel newSendingChannel, NotificationChain msgs) {
		Channel oldSendingChannel = sendingChannel;
		sendingChannel = newSendingChannel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Allocation_modelPackage.FRAME__SENDING_CHANNEL, oldSendingChannel, newSendingChannel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSendingChannel(Channel newSendingChannel) {
		if (newSendingChannel != sendingChannel) {
			NotificationChain msgs = null;
			if (sendingChannel != null)
				msgs = ((InternalEObject)sendingChannel).eInverseRemove(this, Hardware_architecturePackage.CHANNEL__FRAMES, Channel.class, msgs);
			if (newSendingChannel != null)
				msgs = ((InternalEObject)newSendingChannel).eInverseAdd(this, Hardware_architecturePackage.CHANNEL__FRAMES, Channel.class, msgs);
			msgs = basicSetSendingChannel(newSendingChannel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Allocation_modelPackage.FRAME__SENDING_CHANNEL, newSendingChannel, newSendingChannel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Allocation_modelPackage.FRAME__OWNING_ARTIFACT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningArtifact((AllocationModel)otherEnd, msgs);
			case Allocation_modelPackage.FRAME__SENDING_CHANNEL:
				if (sendingChannel != null)
					msgs = ((InternalEObject)sendingChannel).eInverseRemove(this, Hardware_architecturePackage.CHANNEL__FRAMES, Channel.class, msgs);
				return basicSetSendingChannel((Channel)otherEnd, msgs);
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
			case Allocation_modelPackage.FRAME__OWNING_ARTIFACT:
				return basicSetOwningArtifact(null, msgs);
			case Allocation_modelPackage.FRAME__PERIOD:
				return basicSetPeriod(null, msgs);
			case Allocation_modelPackage.FRAME__OFFSET:
				return basicSetOffset(null, msgs);
			case Allocation_modelPackage.FRAME__DEPLOYMENTS:
				return ((InternalEList<?>)getDeployments()).basicRemove(otherEnd, msgs);
			case Allocation_modelPackage.FRAME__SENDING_CHANNEL:
				return basicSetSendingChannel(null, msgs);
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
			case Allocation_modelPackage.FRAME__OWNING_ARTIFACT:
				return eInternalContainer().eInverseRemove(this, Allocation_modelPackage.ALLOCATION_MODEL__FRAMES, AllocationModel.class, msgs);
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
			case Allocation_modelPackage.FRAME__OWNING_ARTIFACT:
				return getOwningArtifact();
			case Allocation_modelPackage.FRAME__PERIOD:
				return getPeriod();
			case Allocation_modelPackage.FRAME__OFFSET:
				return getOffset();
			case Allocation_modelPackage.FRAME__SIZE:
				return getSize();
			case Allocation_modelPackage.FRAME__DATA_SIZE:
				return getDataSize();
			case Allocation_modelPackage.FRAME__PRIORITY:
				return getPriority();
			case Allocation_modelPackage.FRAME__DEPLOYMENTS:
				return getDeployments();
			case Allocation_modelPackage.FRAME__DEPLOYED_SIGNAL_INSTANCES:
				return getDeployedSignalInstances();
			case Allocation_modelPackage.FRAME__SENDING_CHANNEL:
				if (resolve) return getSendingChannel();
				return basicGetSendingChannel();
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
			case Allocation_modelPackage.FRAME__OWNING_ARTIFACT:
				setOwningArtifact((AllocationModel)newValue);
				return;
			case Allocation_modelPackage.FRAME__PERIOD:
				setPeriod((TimingRestriction)newValue);
				return;
			case Allocation_modelPackage.FRAME__OFFSET:
				setOffset((TimingRestriction)newValue);
				return;
			case Allocation_modelPackage.FRAME__SIZE:
				setSize((Integer)newValue);
				return;
			case Allocation_modelPackage.FRAME__DATA_SIZE:
				setDataSize((Integer)newValue);
				return;
			case Allocation_modelPackage.FRAME__PRIORITY:
				setPriority((Integer)newValue);
				return;
			case Allocation_modelPackage.FRAME__DEPLOYMENTS:
				getDeployments().clear();
				getDeployments().addAll((Collection<? extends SignalDeployment>)newValue);
				return;
			case Allocation_modelPackage.FRAME__SENDING_CHANNEL:
				setSendingChannel((Channel)newValue);
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
			case Allocation_modelPackage.FRAME__OWNING_ARTIFACT:
				setOwningArtifact((AllocationModel)null);
				return;
			case Allocation_modelPackage.FRAME__PERIOD:
				setPeriod((TimingRestriction)null);
				return;
			case Allocation_modelPackage.FRAME__OFFSET:
				setOffset((TimingRestriction)null);
				return;
			case Allocation_modelPackage.FRAME__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case Allocation_modelPackage.FRAME__DATA_SIZE:
				setDataSize(DATA_SIZE_EDEFAULT);
				return;
			case Allocation_modelPackage.FRAME__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case Allocation_modelPackage.FRAME__DEPLOYMENTS:
				getDeployments().clear();
				return;
			case Allocation_modelPackage.FRAME__SENDING_CHANNEL:
				setSendingChannel((Channel)null);
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
			case Allocation_modelPackage.FRAME__OWNING_ARTIFACT:
				return getOwningArtifact() != null;
			case Allocation_modelPackage.FRAME__PERIOD:
				return period != null;
			case Allocation_modelPackage.FRAME__OFFSET:
				return offset != null;
			case Allocation_modelPackage.FRAME__SIZE:
				return size != SIZE_EDEFAULT;
			case Allocation_modelPackage.FRAME__DATA_SIZE:
				return dataSize != DATA_SIZE_EDEFAULT;
			case Allocation_modelPackage.FRAME__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case Allocation_modelPackage.FRAME__DEPLOYMENTS:
				return deployments != null && !deployments.isEmpty();
			case Allocation_modelPackage.FRAME__DEPLOYED_SIGNAL_INSTANCES:
				return !getDeployedSignalInstances().isEmpty();
			case Allocation_modelPackage.FRAME__SENDING_CHANNEL:
				return sendingChannel != null;
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
		result.append(", dataSize: ");
		result.append(dataSize);
		result.append(", priority: ");
		result.append(priority);
		result.append(')');
		return result.toString();
	}

} //FrameImpl
