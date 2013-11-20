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

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.obeonetwork.dsl.east_adl.core.impl.EASTADLEntityImpl;

import org.obeonetwork.dsl.east_adl.structure.common.CommonPackage;
import org.obeonetwork.dsl.east_adl.structure.common.DesignDataType;
import org.obeonetwork.dsl.east_adl.structure.common.DirectionKind;
import org.obeonetwork.dsl.east_adl.structure.common.OperationService;
import org.obeonetwork.dsl.east_adl.structure.common.ServiceParameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.impl.ServiceParameterImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.impl.ServiceParameterImpl#getOwningService <em>Owning Service</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.impl.ServiceParameterImpl#getDataType <em>Data Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceParameterImpl extends EASTADLEntityImpl implements ServiceParameter {
	/**
	 * The default value of the '{@link #getModifier() <em>Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifier()
	 * @generated
	 * @ordered
	 */
	protected static final DirectionKind MODIFIER_EDEFAULT = DirectionKind.IN;

	/**
	 * The cached value of the '{@link #getModifier() <em>Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifier()
	 * @generated
	 * @ordered
	 */
	protected DirectionKind modifier = MODIFIER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected DesignDataType dataType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.SERVICE_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectionKind getModifier() {
		return modifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModifier(DirectionKind newModifier) {
		DirectionKind oldModifier = modifier;
		modifier = newModifier == null ? MODIFIER_EDEFAULT : newModifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.SERVICE_PARAMETER__MODIFIER, oldModifier, modifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationService getOwningService() {
		if (eContainerFeatureID() != CommonPackage.SERVICE_PARAMETER__OWNING_SERVICE) return null;
		return (OperationService)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningService(OperationService newOwningService, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningService, CommonPackage.SERVICE_PARAMETER__OWNING_SERVICE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningService(OperationService newOwningService) {
		if (newOwningService != eInternalContainer() || (eContainerFeatureID() != CommonPackage.SERVICE_PARAMETER__OWNING_SERVICE && newOwningService != null)) {
			if (EcoreUtil.isAncestor(this, newOwningService))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningService != null)
				msgs = ((InternalEObject)newOwningService).eInverseAdd(this, CommonPackage.OPERATION_SERVICE__PARAMETERS, OperationService.class, msgs);
			msgs = basicSetOwningService(newOwningService, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.SERVICE_PARAMETER__OWNING_SERVICE, newOwningService, newOwningService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignDataType getDataType() {
		if (dataType != null && dataType.eIsProxy()) {
			InternalEObject oldDataType = (InternalEObject)dataType;
			dataType = (DesignDataType)eResolveProxy(oldDataType);
			if (dataType != oldDataType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonPackage.SERVICE_PARAMETER__DATA_TYPE, oldDataType, dataType));
			}
		}
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignDataType basicGetDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataType(DesignDataType newDataType, NotificationChain msgs) {
		DesignDataType oldDataType = dataType;
		dataType = newDataType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommonPackage.SERVICE_PARAMETER__DATA_TYPE, oldDataType, newDataType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataType(DesignDataType newDataType) {
		if (newDataType != dataType) {
			NotificationChain msgs = null;
			if (dataType != null)
				msgs = ((InternalEObject)dataType).eInverseRemove(this, CommonPackage.DESIGN_DATA_TYPE__TYPED_SERVICE_PARAMETERS, DesignDataType.class, msgs);
			if (newDataType != null)
				msgs = ((InternalEObject)newDataType).eInverseAdd(this, CommonPackage.DESIGN_DATA_TYPE__TYPED_SERVICE_PARAMETERS, DesignDataType.class, msgs);
			msgs = basicSetDataType(newDataType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.SERVICE_PARAMETER__DATA_TYPE, newDataType, newDataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommonPackage.SERVICE_PARAMETER__OWNING_SERVICE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningService((OperationService)otherEnd, msgs);
			case CommonPackage.SERVICE_PARAMETER__DATA_TYPE:
				if (dataType != null)
					msgs = ((InternalEObject)dataType).eInverseRemove(this, CommonPackage.DESIGN_DATA_TYPE__TYPED_SERVICE_PARAMETERS, DesignDataType.class, msgs);
				return basicSetDataType((DesignDataType)otherEnd, msgs);
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
			case CommonPackage.SERVICE_PARAMETER__OWNING_SERVICE:
				return basicSetOwningService(null, msgs);
			case CommonPackage.SERVICE_PARAMETER__DATA_TYPE:
				return basicSetDataType(null, msgs);
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
			case CommonPackage.SERVICE_PARAMETER__OWNING_SERVICE:
				return eInternalContainer().eInverseRemove(this, CommonPackage.OPERATION_SERVICE__PARAMETERS, OperationService.class, msgs);
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
			case CommonPackage.SERVICE_PARAMETER__MODIFIER:
				return getModifier();
			case CommonPackage.SERVICE_PARAMETER__OWNING_SERVICE:
				return getOwningService();
			case CommonPackage.SERVICE_PARAMETER__DATA_TYPE:
				if (resolve) return getDataType();
				return basicGetDataType();
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
			case CommonPackage.SERVICE_PARAMETER__MODIFIER:
				setModifier((DirectionKind)newValue);
				return;
			case CommonPackage.SERVICE_PARAMETER__OWNING_SERVICE:
				setOwningService((OperationService)newValue);
				return;
			case CommonPackage.SERVICE_PARAMETER__DATA_TYPE:
				setDataType((DesignDataType)newValue);
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
			case CommonPackage.SERVICE_PARAMETER__MODIFIER:
				setModifier(MODIFIER_EDEFAULT);
				return;
			case CommonPackage.SERVICE_PARAMETER__OWNING_SERVICE:
				setOwningService((OperationService)null);
				return;
			case CommonPackage.SERVICE_PARAMETER__DATA_TYPE:
				setDataType((DesignDataType)null);
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
			case CommonPackage.SERVICE_PARAMETER__MODIFIER:
				return modifier != MODIFIER_EDEFAULT;
			case CommonPackage.SERVICE_PARAMETER__OWNING_SERVICE:
				return getOwningService() != null;
			case CommonPackage.SERVICE_PARAMETER__DATA_TYPE:
				return dataType != null;
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
		result.append(" (modifier: ");
		result.append(modifier);
		result.append(')');
		return result.toString();
	}

} //ServiceParameterImpl
