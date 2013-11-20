/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.obeonetwork.dsl.east_adl.core.impl.EASTADLEntityImpl;

import org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleFeatureModel;
import org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleParameter;
import org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.Vehicle_feature_modelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vehicle Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.VehicleParameterImpl#isCustomerChoice <em>Customer Choice</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.VehicleParameterImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.impl.VehicleParameterImpl#getOwningArtifact <em>Owning Artifact</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VehicleParameterImpl extends EASTADLEntityImpl implements VehicleParameter {
	/**
	 * The default value of the '{@link #isCustomerChoice() <em>Customer Choice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCustomerChoice()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CUSTOMER_CHOICE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCustomerChoice() <em>Customer Choice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCustomerChoice()
	 * @generated
	 * @ordered
	 */
	protected boolean customerChoice = CUSTOMER_CHOICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VehicleParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Vehicle_feature_modelPackage.Literals.VEHICLE_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCustomerChoice() {
		return customerChoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomerChoice(boolean newCustomerChoice) {
		boolean oldCustomerChoice = customerChoice;
		customerChoice = newCustomerChoice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Vehicle_feature_modelPackage.VEHICLE_PARAMETER__CUSTOMER_CHOICE, oldCustomerChoice, customerChoice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Vehicle_feature_modelPackage.VEHICLE_PARAMETER__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VehicleFeatureModel getOwningArtifact() {
		if (eContainerFeatureID() != Vehicle_feature_modelPackage.VEHICLE_PARAMETER__OWNING_ARTIFACT) return null;
		return (VehicleFeatureModel)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningArtifact(VehicleFeatureModel newOwningArtifact, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningArtifact, Vehicle_feature_modelPackage.VEHICLE_PARAMETER__OWNING_ARTIFACT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningArtifact(VehicleFeatureModel newOwningArtifact) {
		if (newOwningArtifact != eInternalContainer() || (eContainerFeatureID() != Vehicle_feature_modelPackage.VEHICLE_PARAMETER__OWNING_ARTIFACT && newOwningArtifact != null)) {
			if (EcoreUtil.isAncestor(this, newOwningArtifact))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningArtifact != null)
				msgs = ((InternalEObject)newOwningArtifact).eInverseAdd(this, Vehicle_feature_modelPackage.VEHICLE_FEATURE_MODEL__VEHICLE_PARAMETERS, VehicleFeatureModel.class, msgs);
			msgs = basicSetOwningArtifact(newOwningArtifact, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Vehicle_feature_modelPackage.VEHICLE_PARAMETER__OWNING_ARTIFACT, newOwningArtifact, newOwningArtifact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Vehicle_feature_modelPackage.VEHICLE_PARAMETER__OWNING_ARTIFACT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningArtifact((VehicleFeatureModel)otherEnd, msgs);
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
			case Vehicle_feature_modelPackage.VEHICLE_PARAMETER__OWNING_ARTIFACT:
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
			case Vehicle_feature_modelPackage.VEHICLE_PARAMETER__OWNING_ARTIFACT:
				return eInternalContainer().eInverseRemove(this, Vehicle_feature_modelPackage.VEHICLE_FEATURE_MODEL__VEHICLE_PARAMETERS, VehicleFeatureModel.class, msgs);
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
			case Vehicle_feature_modelPackage.VEHICLE_PARAMETER__CUSTOMER_CHOICE:
				return isCustomerChoice();
			case Vehicle_feature_modelPackage.VEHICLE_PARAMETER__TYPE:
				return getType();
			case Vehicle_feature_modelPackage.VEHICLE_PARAMETER__OWNING_ARTIFACT:
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
			case Vehicle_feature_modelPackage.VEHICLE_PARAMETER__CUSTOMER_CHOICE:
				setCustomerChoice((Boolean)newValue);
				return;
			case Vehicle_feature_modelPackage.VEHICLE_PARAMETER__TYPE:
				setType((String)newValue);
				return;
			case Vehicle_feature_modelPackage.VEHICLE_PARAMETER__OWNING_ARTIFACT:
				setOwningArtifact((VehicleFeatureModel)newValue);
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
			case Vehicle_feature_modelPackage.VEHICLE_PARAMETER__CUSTOMER_CHOICE:
				setCustomerChoice(CUSTOMER_CHOICE_EDEFAULT);
				return;
			case Vehicle_feature_modelPackage.VEHICLE_PARAMETER__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case Vehicle_feature_modelPackage.VEHICLE_PARAMETER__OWNING_ARTIFACT:
				setOwningArtifact((VehicleFeatureModel)null);
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
			case Vehicle_feature_modelPackage.VEHICLE_PARAMETER__CUSTOMER_CHOICE:
				return customerChoice != CUSTOMER_CHOICE_EDEFAULT;
			case Vehicle_feature_modelPackage.VEHICLE_PARAMETER__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case Vehicle_feature_modelPackage.VEHICLE_PARAMETER__OWNING_ARTIFACT:
				return getOwningArtifact() != null;
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
		result.append(" (customerChoice: ");
		result.append(customerChoice);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //VehicleParameterImpl
