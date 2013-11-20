/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.common.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.east_adl.core.impl.EASTADLNamedElementImpl;

import org.obeonetwork.dsl.east_adl.structure.common.CommonPackage;
import org.obeonetwork.dsl.east_adl.structure.common.ImplementationDataType;
import org.obeonetwork.dsl.east_adl.structure.common.ImplementationDataTypeKind;
import org.obeonetwork.dsl.east_adl.structure.common.TypeAssociation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implementation Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.impl.ImplementationDataTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.impl.ImplementationDataTypeImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.impl.ImplementationDataTypeImpl#getImplementationMinimum <em>Implementation Minimum</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.impl.ImplementationDataTypeImpl#getImplementationMaximum <em>Implementation Maximum</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.impl.ImplementationDataTypeImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.impl.ImplementationDataTypeImpl#getTypeAssociations <em>Type Associations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImplementationDataTypeImpl extends EASTADLNamedElementImpl implements ImplementationDataType {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected static final ImplementationDataTypeKind DATA_TYPE_EDEFAULT = ImplementationDataTypeKind.UNUM8;

	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected ImplementationDataTypeKind dataType = DATA_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getImplementationMinimum() <em>Implementation Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationMinimum()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPLEMENTATION_MINIMUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImplementationMinimum() <em>Implementation Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationMinimum()
	 * @generated
	 * @ordered
	 */
	protected String implementationMinimum = IMPLEMENTATION_MINIMUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getImplementationMaximum() <em>Implementation Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationMaximum()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPLEMENTATION_MAXIMUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImplementationMaximum() <em>Implementation Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationMaximum()
	 * @generated
	 * @ordered
	 */
	protected String implementationMaximum = IMPLEMENTATION_MAXIMUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected String defaultValue = DEFAULT_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTypeAssociations() <em>Type Associations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAssociations()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> typeAssociations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplementationDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.IMPLEMENTATION_DATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.IMPLEMENTATION_DATA_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationDataTypeKind getDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataType(ImplementationDataTypeKind newDataType) {
		ImplementationDataTypeKind oldDataType = dataType;
		dataType = newDataType == null ? DATA_TYPE_EDEFAULT : newDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.IMPLEMENTATION_DATA_TYPE__DATA_TYPE, oldDataType, dataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImplementationMinimum() {
		return implementationMinimum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementationMinimum(String newImplementationMinimum) {
		String oldImplementationMinimum = implementationMinimum;
		implementationMinimum = newImplementationMinimum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.IMPLEMENTATION_DATA_TYPE__IMPLEMENTATION_MINIMUM, oldImplementationMinimum, implementationMinimum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImplementationMaximum() {
		return implementationMaximum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementationMaximum(String newImplementationMaximum) {
		String oldImplementationMaximum = implementationMaximum;
		implementationMaximum = newImplementationMaximum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.IMPLEMENTATION_DATA_TYPE__IMPLEMENTATION_MAXIMUM, oldImplementationMaximum, implementationMaximum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(String newDefaultValue) {
		String oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.IMPLEMENTATION_DATA_TYPE__DEFAULT_VALUE, oldDefaultValue, defaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getTypeAssociations() {
		if (typeAssociations == null) {
			typeAssociations = new EObjectWithInverseResolvingEList<TypeAssociation>(TypeAssociation.class, this, CommonPackage.IMPLEMENTATION_DATA_TYPE__TYPE_ASSOCIATIONS, CommonPackage.TYPE_ASSOCIATION__IMPLEMENTATION_DATA_TYPE);
		}
		return typeAssociations;
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
			case CommonPackage.IMPLEMENTATION_DATA_TYPE__TYPE_ASSOCIATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTypeAssociations()).basicAdd(otherEnd, msgs);
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
			case CommonPackage.IMPLEMENTATION_DATA_TYPE__TYPE_ASSOCIATIONS:
				return ((InternalEList<?>)getTypeAssociations()).basicRemove(otherEnd, msgs);
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
			case CommonPackage.IMPLEMENTATION_DATA_TYPE__DESCRIPTION:
				return getDescription();
			case CommonPackage.IMPLEMENTATION_DATA_TYPE__DATA_TYPE:
				return getDataType();
			case CommonPackage.IMPLEMENTATION_DATA_TYPE__IMPLEMENTATION_MINIMUM:
				return getImplementationMinimum();
			case CommonPackage.IMPLEMENTATION_DATA_TYPE__IMPLEMENTATION_MAXIMUM:
				return getImplementationMaximum();
			case CommonPackage.IMPLEMENTATION_DATA_TYPE__DEFAULT_VALUE:
				return getDefaultValue();
			case CommonPackage.IMPLEMENTATION_DATA_TYPE__TYPE_ASSOCIATIONS:
				return getTypeAssociations();
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
			case CommonPackage.IMPLEMENTATION_DATA_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CommonPackage.IMPLEMENTATION_DATA_TYPE__DATA_TYPE:
				setDataType((ImplementationDataTypeKind)newValue);
				return;
			case CommonPackage.IMPLEMENTATION_DATA_TYPE__IMPLEMENTATION_MINIMUM:
				setImplementationMinimum((String)newValue);
				return;
			case CommonPackage.IMPLEMENTATION_DATA_TYPE__IMPLEMENTATION_MAXIMUM:
				setImplementationMaximum((String)newValue);
				return;
			case CommonPackage.IMPLEMENTATION_DATA_TYPE__DEFAULT_VALUE:
				setDefaultValue((String)newValue);
				return;
			case CommonPackage.IMPLEMENTATION_DATA_TYPE__TYPE_ASSOCIATIONS:
				getTypeAssociations().clear();
				getTypeAssociations().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case CommonPackage.IMPLEMENTATION_DATA_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CommonPackage.IMPLEMENTATION_DATA_TYPE__DATA_TYPE:
				setDataType(DATA_TYPE_EDEFAULT);
				return;
			case CommonPackage.IMPLEMENTATION_DATA_TYPE__IMPLEMENTATION_MINIMUM:
				setImplementationMinimum(IMPLEMENTATION_MINIMUM_EDEFAULT);
				return;
			case CommonPackage.IMPLEMENTATION_DATA_TYPE__IMPLEMENTATION_MAXIMUM:
				setImplementationMaximum(IMPLEMENTATION_MAXIMUM_EDEFAULT);
				return;
			case CommonPackage.IMPLEMENTATION_DATA_TYPE__DEFAULT_VALUE:
				setDefaultValue(DEFAULT_VALUE_EDEFAULT);
				return;
			case CommonPackage.IMPLEMENTATION_DATA_TYPE__TYPE_ASSOCIATIONS:
				getTypeAssociations().clear();
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
			case CommonPackage.IMPLEMENTATION_DATA_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case CommonPackage.IMPLEMENTATION_DATA_TYPE__DATA_TYPE:
				return dataType != DATA_TYPE_EDEFAULT;
			case CommonPackage.IMPLEMENTATION_DATA_TYPE__IMPLEMENTATION_MINIMUM:
				return IMPLEMENTATION_MINIMUM_EDEFAULT == null ? implementationMinimum != null : !IMPLEMENTATION_MINIMUM_EDEFAULT.equals(implementationMinimum);
			case CommonPackage.IMPLEMENTATION_DATA_TYPE__IMPLEMENTATION_MAXIMUM:
				return IMPLEMENTATION_MAXIMUM_EDEFAULT == null ? implementationMaximum != null : !IMPLEMENTATION_MAXIMUM_EDEFAULT.equals(implementationMaximum);
			case CommonPackage.IMPLEMENTATION_DATA_TYPE__DEFAULT_VALUE:
				return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
			case CommonPackage.IMPLEMENTATION_DATA_TYPE__TYPE_ASSOCIATIONS:
				return typeAssociations != null && !typeAssociations.isEmpty();
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
		result.append(" (description: ");
		result.append(description);
		result.append(", dataType: ");
		result.append(dataType);
		result.append(", implementationMinimum: ");
		result.append(implementationMinimum);
		result.append(", implementationMaximum: ");
		result.append(implementationMaximum);
		result.append(", defaultValue: ");
		result.append(defaultValue);
		result.append(')');
		return result.toString();
	}

} //ImplementationDataTypeImpl
