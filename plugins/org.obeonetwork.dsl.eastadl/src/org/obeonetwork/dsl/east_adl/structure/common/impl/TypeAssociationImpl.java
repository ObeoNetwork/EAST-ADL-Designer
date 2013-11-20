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

import org.obeonetwork.dsl.east_adl.core.impl.EASTADLNamedElementImpl;

import org.obeonetwork.dsl.east_adl.structure.common.CommonPackage;
import org.obeonetwork.dsl.east_adl.structure.common.DesignDataType;
import org.obeonetwork.dsl.east_adl.structure.common.ImplementationDataType;
import org.obeonetwork.dsl.east_adl.structure.common.TypeAssociation;

import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.impl.TypeAssociationImpl#getScaleFactor <em>Scale Factor</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.impl.TypeAssociationImpl#getScaleOffset <em>Scale Offset</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.impl.TypeAssociationImpl#getDesignDataType <em>Design Data Type</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.impl.TypeAssociationImpl#getImplementationDataType <em>Implementation Data Type</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.impl.TypeAssociationImpl#getProcessor <em>Processor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationImpl extends EASTADLNamedElementImpl implements TypeAssociation {
	/**
	 * The default value of the '{@link #getScaleFactor() <em>Scale Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleFactor()
	 * @generated
	 * @ordered
	 */
	protected static final double SCALE_FACTOR_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getScaleFactor() <em>Scale Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleFactor()
	 * @generated
	 * @ordered
	 */
	protected double scaleFactor = SCALE_FACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getScaleOffset() <em>Scale Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleOffset()
	 * @generated
	 * @ordered
	 */
	protected static final double SCALE_OFFSET_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getScaleOffset() <em>Scale Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleOffset()
	 * @generated
	 * @ordered
	 */
	protected double scaleOffset = SCALE_OFFSET_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDesignDataType() <em>Design Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignDataType()
	 * @generated
	 * @ordered
	 */
	protected DesignDataType designDataType;

	/**
	 * The cached value of the '{@link #getImplementationDataType() <em>Implementation Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationDataType()
	 * @generated
	 * @ordered
	 */
	protected ImplementationDataType implementationDataType;

	/**
	 * The cached value of the '{@link #getProcessor() <em>Processor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessor()
	 * @generated
	 * @ordered
	 */
	protected Processor processor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.TYPE_ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getScaleFactor() {
		return scaleFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScaleFactor(double newScaleFactor) {
		double oldScaleFactor = scaleFactor;
		scaleFactor = newScaleFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.TYPE_ASSOCIATION__SCALE_FACTOR, oldScaleFactor, scaleFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getScaleOffset() {
		return scaleOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScaleOffset(double newScaleOffset) {
		double oldScaleOffset = scaleOffset;
		scaleOffset = newScaleOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.TYPE_ASSOCIATION__SCALE_OFFSET, oldScaleOffset, scaleOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignDataType getDesignDataType() {
		if (designDataType != null && designDataType.eIsProxy()) {
			InternalEObject oldDesignDataType = (InternalEObject)designDataType;
			designDataType = (DesignDataType)eResolveProxy(oldDesignDataType);
			if (designDataType != oldDesignDataType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonPackage.TYPE_ASSOCIATION__DESIGN_DATA_TYPE, oldDesignDataType, designDataType));
			}
		}
		return designDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignDataType basicGetDesignDataType() {
		return designDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDesignDataType(DesignDataType newDesignDataType, NotificationChain msgs) {
		DesignDataType oldDesignDataType = designDataType;
		designDataType = newDesignDataType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommonPackage.TYPE_ASSOCIATION__DESIGN_DATA_TYPE, oldDesignDataType, newDesignDataType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesignDataType(DesignDataType newDesignDataType) {
		if (newDesignDataType != designDataType) {
			NotificationChain msgs = null;
			if (designDataType != null)
				msgs = ((InternalEObject)designDataType).eInverseRemove(this, CommonPackage.DESIGN_DATA_TYPE__TYPE_ASSOCIATIONS, DesignDataType.class, msgs);
			if (newDesignDataType != null)
				msgs = ((InternalEObject)newDesignDataType).eInverseAdd(this, CommonPackage.DESIGN_DATA_TYPE__TYPE_ASSOCIATIONS, DesignDataType.class, msgs);
			msgs = basicSetDesignDataType(newDesignDataType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.TYPE_ASSOCIATION__DESIGN_DATA_TYPE, newDesignDataType, newDesignDataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationDataType getImplementationDataType() {
		if (implementationDataType != null && implementationDataType.eIsProxy()) {
			InternalEObject oldImplementationDataType = (InternalEObject)implementationDataType;
			implementationDataType = (ImplementationDataType)eResolveProxy(oldImplementationDataType);
			if (implementationDataType != oldImplementationDataType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonPackage.TYPE_ASSOCIATION__IMPLEMENTATION_DATA_TYPE, oldImplementationDataType, implementationDataType));
			}
		}
		return implementationDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationDataType basicGetImplementationDataType() {
		return implementationDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplementationDataType(ImplementationDataType newImplementationDataType, NotificationChain msgs) {
		ImplementationDataType oldImplementationDataType = implementationDataType;
		implementationDataType = newImplementationDataType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommonPackage.TYPE_ASSOCIATION__IMPLEMENTATION_DATA_TYPE, oldImplementationDataType, newImplementationDataType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementationDataType(ImplementationDataType newImplementationDataType) {
		if (newImplementationDataType != implementationDataType) {
			NotificationChain msgs = null;
			if (implementationDataType != null)
				msgs = ((InternalEObject)implementationDataType).eInverseRemove(this, CommonPackage.IMPLEMENTATION_DATA_TYPE__TYPE_ASSOCIATIONS, ImplementationDataType.class, msgs);
			if (newImplementationDataType != null)
				msgs = ((InternalEObject)newImplementationDataType).eInverseAdd(this, CommonPackage.IMPLEMENTATION_DATA_TYPE__TYPE_ASSOCIATIONS, ImplementationDataType.class, msgs);
			msgs = basicSetImplementationDataType(newImplementationDataType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.TYPE_ASSOCIATION__IMPLEMENTATION_DATA_TYPE, newImplementationDataType, newImplementationDataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Processor getProcessor() {
		if (processor != null && processor.eIsProxy()) {
			InternalEObject oldProcessor = (InternalEObject)processor;
			processor = (Processor)eResolveProxy(oldProcessor);
			if (processor != oldProcessor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonPackage.TYPE_ASSOCIATION__PROCESSOR, oldProcessor, processor));
			}
		}
		return processor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Processor basicGetProcessor() {
		return processor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcessor(Processor newProcessor, NotificationChain msgs) {
		Processor oldProcessor = processor;
		processor = newProcessor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommonPackage.TYPE_ASSOCIATION__PROCESSOR, oldProcessor, newProcessor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessor(Processor newProcessor) {
		if (newProcessor != processor) {
			NotificationChain msgs = null;
			if (processor != null)
				msgs = ((InternalEObject)processor).eInverseRemove(this, Hardware_architecturePackage.PROCESSOR__TYPE_ASSOCIATIONS, Processor.class, msgs);
			if (newProcessor != null)
				msgs = ((InternalEObject)newProcessor).eInverseAdd(this, Hardware_architecturePackage.PROCESSOR__TYPE_ASSOCIATIONS, Processor.class, msgs);
			msgs = basicSetProcessor(newProcessor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.TYPE_ASSOCIATION__PROCESSOR, newProcessor, newProcessor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommonPackage.TYPE_ASSOCIATION__DESIGN_DATA_TYPE:
				if (designDataType != null)
					msgs = ((InternalEObject)designDataType).eInverseRemove(this, CommonPackage.DESIGN_DATA_TYPE__TYPE_ASSOCIATIONS, DesignDataType.class, msgs);
				return basicSetDesignDataType((DesignDataType)otherEnd, msgs);
			case CommonPackage.TYPE_ASSOCIATION__IMPLEMENTATION_DATA_TYPE:
				if (implementationDataType != null)
					msgs = ((InternalEObject)implementationDataType).eInverseRemove(this, CommonPackage.IMPLEMENTATION_DATA_TYPE__TYPE_ASSOCIATIONS, ImplementationDataType.class, msgs);
				return basicSetImplementationDataType((ImplementationDataType)otherEnd, msgs);
			case CommonPackage.TYPE_ASSOCIATION__PROCESSOR:
				if (processor != null)
					msgs = ((InternalEObject)processor).eInverseRemove(this, Hardware_architecturePackage.PROCESSOR__TYPE_ASSOCIATIONS, Processor.class, msgs);
				return basicSetProcessor((Processor)otherEnd, msgs);
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
			case CommonPackage.TYPE_ASSOCIATION__DESIGN_DATA_TYPE:
				return basicSetDesignDataType(null, msgs);
			case CommonPackage.TYPE_ASSOCIATION__IMPLEMENTATION_DATA_TYPE:
				return basicSetImplementationDataType(null, msgs);
			case CommonPackage.TYPE_ASSOCIATION__PROCESSOR:
				return basicSetProcessor(null, msgs);
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
			case CommonPackage.TYPE_ASSOCIATION__SCALE_FACTOR:
				return getScaleFactor();
			case CommonPackage.TYPE_ASSOCIATION__SCALE_OFFSET:
				return getScaleOffset();
			case CommonPackage.TYPE_ASSOCIATION__DESIGN_DATA_TYPE:
				if (resolve) return getDesignDataType();
				return basicGetDesignDataType();
			case CommonPackage.TYPE_ASSOCIATION__IMPLEMENTATION_DATA_TYPE:
				if (resolve) return getImplementationDataType();
				return basicGetImplementationDataType();
			case CommonPackage.TYPE_ASSOCIATION__PROCESSOR:
				if (resolve) return getProcessor();
				return basicGetProcessor();
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
			case CommonPackage.TYPE_ASSOCIATION__SCALE_FACTOR:
				setScaleFactor((Double)newValue);
				return;
			case CommonPackage.TYPE_ASSOCIATION__SCALE_OFFSET:
				setScaleOffset((Double)newValue);
				return;
			case CommonPackage.TYPE_ASSOCIATION__DESIGN_DATA_TYPE:
				setDesignDataType((DesignDataType)newValue);
				return;
			case CommonPackage.TYPE_ASSOCIATION__IMPLEMENTATION_DATA_TYPE:
				setImplementationDataType((ImplementationDataType)newValue);
				return;
			case CommonPackage.TYPE_ASSOCIATION__PROCESSOR:
				setProcessor((Processor)newValue);
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
			case CommonPackage.TYPE_ASSOCIATION__SCALE_FACTOR:
				setScaleFactor(SCALE_FACTOR_EDEFAULT);
				return;
			case CommonPackage.TYPE_ASSOCIATION__SCALE_OFFSET:
				setScaleOffset(SCALE_OFFSET_EDEFAULT);
				return;
			case CommonPackage.TYPE_ASSOCIATION__DESIGN_DATA_TYPE:
				setDesignDataType((DesignDataType)null);
				return;
			case CommonPackage.TYPE_ASSOCIATION__IMPLEMENTATION_DATA_TYPE:
				setImplementationDataType((ImplementationDataType)null);
				return;
			case CommonPackage.TYPE_ASSOCIATION__PROCESSOR:
				setProcessor((Processor)null);
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
			case CommonPackage.TYPE_ASSOCIATION__SCALE_FACTOR:
				return scaleFactor != SCALE_FACTOR_EDEFAULT;
			case CommonPackage.TYPE_ASSOCIATION__SCALE_OFFSET:
				return scaleOffset != SCALE_OFFSET_EDEFAULT;
			case CommonPackage.TYPE_ASSOCIATION__DESIGN_DATA_TYPE:
				return designDataType != null;
			case CommonPackage.TYPE_ASSOCIATION__IMPLEMENTATION_DATA_TYPE:
				return implementationDataType != null;
			case CommonPackage.TYPE_ASSOCIATION__PROCESSOR:
				return processor != null;
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
		result.append(" (scaleFactor: ");
		result.append(scaleFactor);
		result.append(", scaleOffset: ");
		result.append(scaleOffset);
		result.append(')');
		return result.toString();
	}

} //TypeAssociationImpl
