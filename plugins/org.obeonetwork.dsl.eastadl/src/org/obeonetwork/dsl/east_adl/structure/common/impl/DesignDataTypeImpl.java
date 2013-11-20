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
import org.obeonetwork.dsl.east_adl.structure.common.ConnectorSignal;
import org.obeonetwork.dsl.east_adl.structure.common.DesignDataType;
import org.obeonetwork.dsl.east_adl.structure.common.DesignDataTypeKind;
import org.obeonetwork.dsl.east_adl.structure.common.Parameter;
import org.obeonetwork.dsl.east_adl.structure.common.ServiceParameter;
import org.obeonetwork.dsl.east_adl.structure.common.TypeAssociation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Design Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.impl.DesignDataTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.impl.DesignDataTypeImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.impl.DesignDataTypeImpl#getTypedSignals <em>Typed Signals</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.impl.DesignDataTypeImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.impl.DesignDataTypeImpl#getResolution <em>Resolution</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.impl.DesignDataTypeImpl#getPhysicalMinimum <em>Physical Minimum</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.impl.DesignDataTypeImpl#getPhysicalMaximum <em>Physical Maximum</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.impl.DesignDataTypeImpl#getSignificantDigits <em>Significant Digits</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.impl.DesignDataTypeImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.impl.DesignDataTypeImpl#getTypedServiceParameters <em>Typed Service Parameters</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.impl.DesignDataTypeImpl#getTypeAssociations <em>Type Associations</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.impl.DesignDataTypeImpl#getTypedFunctionParameters <em>Typed Function Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DesignDataTypeImpl extends EASTADLNamedElementImpl implements DesignDataType {
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
	protected static final DesignDataTypeKind DATA_TYPE_EDEFAULT = DesignDataTypeKind.INTEGER;

	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected DesignDataTypeKind dataType = DATA_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTypedSignals() <em>Typed Signals</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypedSignals()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectorSignal> typedSignals;

	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected String unit = UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getResolution() <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolution()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOLUTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResolution() <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolution()
	 * @generated
	 * @ordered
	 */
	protected String resolution = RESOLUTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhysicalMinimum() <em>Physical Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalMinimum()
	 * @generated
	 * @ordered
	 */
	protected static final String PHYSICAL_MINIMUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhysicalMinimum() <em>Physical Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalMinimum()
	 * @generated
	 * @ordered
	 */
	protected String physicalMinimum = PHYSICAL_MINIMUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhysicalMaximum() <em>Physical Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalMaximum()
	 * @generated
	 * @ordered
	 */
	protected static final String PHYSICAL_MAXIMUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhysicalMaximum() <em>Physical Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalMaximum()
	 * @generated
	 * @ordered
	 */
	protected String physicalMaximum = PHYSICAL_MAXIMUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getSignificantDigits() <em>Significant Digits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignificantDigits()
	 * @generated
	 * @ordered
	 */
	protected static final int SIGNIFICANT_DIGITS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSignificantDigits() <em>Significant Digits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignificantDigits()
	 * @generated
	 * @ordered
	 */
	protected int significantDigits = SIGNIFICANT_DIGITS_EDEFAULT;

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
	 * The cached value of the '{@link #getTypedServiceParameters() <em>Typed Service Parameters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypedServiceParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceParameter> typedServiceParameters;

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
	 * The cached value of the '{@link #getTypedFunctionParameters() <em>Typed Function Parameters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypedFunctionParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> typedFunctionParameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DesignDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.DESIGN_DATA_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.DESIGN_DATA_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignDataTypeKind getDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataType(DesignDataTypeKind newDataType) {
		DesignDataTypeKind oldDataType = dataType;
		dataType = newDataType == null ? DATA_TYPE_EDEFAULT : newDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.DESIGN_DATA_TYPE__DATA_TYPE, oldDataType, dataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectorSignal> getTypedSignals() {
		if (typedSignals == null) {
			typedSignals = new EObjectWithInverseResolvingEList<ConnectorSignal>(ConnectorSignal.class, this, CommonPackage.DESIGN_DATA_TYPE__TYPED_SIGNALS, CommonPackage.CONNECTOR_SIGNAL__DATA_TYPE);
		}
		return typedSignals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(String newUnit) {
		String oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.DESIGN_DATA_TYPE__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResolution() {
		return resolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolution(String newResolution) {
		String oldResolution = resolution;
		resolution = newResolution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.DESIGN_DATA_TYPE__RESOLUTION, oldResolution, resolution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhysicalMinimum() {
		return physicalMinimum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhysicalMinimum(String newPhysicalMinimum) {
		String oldPhysicalMinimum = physicalMinimum;
		physicalMinimum = newPhysicalMinimum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.DESIGN_DATA_TYPE__PHYSICAL_MINIMUM, oldPhysicalMinimum, physicalMinimum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhysicalMaximum() {
		return physicalMaximum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhysicalMaximum(String newPhysicalMaximum) {
		String oldPhysicalMaximum = physicalMaximum;
		physicalMaximum = newPhysicalMaximum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.DESIGN_DATA_TYPE__PHYSICAL_MAXIMUM, oldPhysicalMaximum, physicalMaximum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSignificantDigits() {
		return significantDigits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignificantDigits(int newSignificantDigits) {
		int oldSignificantDigits = significantDigits;
		significantDigits = newSignificantDigits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.DESIGN_DATA_TYPE__SIGNIFICANT_DIGITS, oldSignificantDigits, significantDigits));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.DESIGN_DATA_TYPE__DEFAULT_VALUE, oldDefaultValue, defaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceParameter> getTypedServiceParameters() {
		if (typedServiceParameters == null) {
			typedServiceParameters = new EObjectWithInverseResolvingEList<ServiceParameter>(ServiceParameter.class, this, CommonPackage.DESIGN_DATA_TYPE__TYPED_SERVICE_PARAMETERS, CommonPackage.SERVICE_PARAMETER__DATA_TYPE);
		}
		return typedServiceParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getTypeAssociations() {
		if (typeAssociations == null) {
			typeAssociations = new EObjectWithInverseResolvingEList<TypeAssociation>(TypeAssociation.class, this, CommonPackage.DESIGN_DATA_TYPE__TYPE_ASSOCIATIONS, CommonPackage.TYPE_ASSOCIATION__DESIGN_DATA_TYPE);
		}
		return typeAssociations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getTypedFunctionParameters() {
		if (typedFunctionParameters == null) {
			typedFunctionParameters = new EObjectWithInverseResolvingEList<Parameter>(Parameter.class, this, CommonPackage.DESIGN_DATA_TYPE__TYPED_FUNCTION_PARAMETERS, CommonPackage.PARAMETER__DATA_TYPE);
		}
		return typedFunctionParameters;
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
			case CommonPackage.DESIGN_DATA_TYPE__TYPED_SIGNALS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTypedSignals()).basicAdd(otherEnd, msgs);
			case CommonPackage.DESIGN_DATA_TYPE__TYPED_SERVICE_PARAMETERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTypedServiceParameters()).basicAdd(otherEnd, msgs);
			case CommonPackage.DESIGN_DATA_TYPE__TYPE_ASSOCIATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTypeAssociations()).basicAdd(otherEnd, msgs);
			case CommonPackage.DESIGN_DATA_TYPE__TYPED_FUNCTION_PARAMETERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTypedFunctionParameters()).basicAdd(otherEnd, msgs);
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
			case CommonPackage.DESIGN_DATA_TYPE__TYPED_SIGNALS:
				return ((InternalEList<?>)getTypedSignals()).basicRemove(otherEnd, msgs);
			case CommonPackage.DESIGN_DATA_TYPE__TYPED_SERVICE_PARAMETERS:
				return ((InternalEList<?>)getTypedServiceParameters()).basicRemove(otherEnd, msgs);
			case CommonPackage.DESIGN_DATA_TYPE__TYPE_ASSOCIATIONS:
				return ((InternalEList<?>)getTypeAssociations()).basicRemove(otherEnd, msgs);
			case CommonPackage.DESIGN_DATA_TYPE__TYPED_FUNCTION_PARAMETERS:
				return ((InternalEList<?>)getTypedFunctionParameters()).basicRemove(otherEnd, msgs);
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
			case CommonPackage.DESIGN_DATA_TYPE__DESCRIPTION:
				return getDescription();
			case CommonPackage.DESIGN_DATA_TYPE__DATA_TYPE:
				return getDataType();
			case CommonPackage.DESIGN_DATA_TYPE__TYPED_SIGNALS:
				return getTypedSignals();
			case CommonPackage.DESIGN_DATA_TYPE__UNIT:
				return getUnit();
			case CommonPackage.DESIGN_DATA_TYPE__RESOLUTION:
				return getResolution();
			case CommonPackage.DESIGN_DATA_TYPE__PHYSICAL_MINIMUM:
				return getPhysicalMinimum();
			case CommonPackage.DESIGN_DATA_TYPE__PHYSICAL_MAXIMUM:
				return getPhysicalMaximum();
			case CommonPackage.DESIGN_DATA_TYPE__SIGNIFICANT_DIGITS:
				return getSignificantDigits();
			case CommonPackage.DESIGN_DATA_TYPE__DEFAULT_VALUE:
				return getDefaultValue();
			case CommonPackage.DESIGN_DATA_TYPE__TYPED_SERVICE_PARAMETERS:
				return getTypedServiceParameters();
			case CommonPackage.DESIGN_DATA_TYPE__TYPE_ASSOCIATIONS:
				return getTypeAssociations();
			case CommonPackage.DESIGN_DATA_TYPE__TYPED_FUNCTION_PARAMETERS:
				return getTypedFunctionParameters();
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
			case CommonPackage.DESIGN_DATA_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CommonPackage.DESIGN_DATA_TYPE__DATA_TYPE:
				setDataType((DesignDataTypeKind)newValue);
				return;
			case CommonPackage.DESIGN_DATA_TYPE__TYPED_SIGNALS:
				getTypedSignals().clear();
				getTypedSignals().addAll((Collection<? extends ConnectorSignal>)newValue);
				return;
			case CommonPackage.DESIGN_DATA_TYPE__UNIT:
				setUnit((String)newValue);
				return;
			case CommonPackage.DESIGN_DATA_TYPE__RESOLUTION:
				setResolution((String)newValue);
				return;
			case CommonPackage.DESIGN_DATA_TYPE__PHYSICAL_MINIMUM:
				setPhysicalMinimum((String)newValue);
				return;
			case CommonPackage.DESIGN_DATA_TYPE__PHYSICAL_MAXIMUM:
				setPhysicalMaximum((String)newValue);
				return;
			case CommonPackage.DESIGN_DATA_TYPE__SIGNIFICANT_DIGITS:
				setSignificantDigits((Integer)newValue);
				return;
			case CommonPackage.DESIGN_DATA_TYPE__DEFAULT_VALUE:
				setDefaultValue((String)newValue);
				return;
			case CommonPackage.DESIGN_DATA_TYPE__TYPED_SERVICE_PARAMETERS:
				getTypedServiceParameters().clear();
				getTypedServiceParameters().addAll((Collection<? extends ServiceParameter>)newValue);
				return;
			case CommonPackage.DESIGN_DATA_TYPE__TYPE_ASSOCIATIONS:
				getTypeAssociations().clear();
				getTypeAssociations().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case CommonPackage.DESIGN_DATA_TYPE__TYPED_FUNCTION_PARAMETERS:
				getTypedFunctionParameters().clear();
				getTypedFunctionParameters().addAll((Collection<? extends Parameter>)newValue);
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
			case CommonPackage.DESIGN_DATA_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CommonPackage.DESIGN_DATA_TYPE__DATA_TYPE:
				setDataType(DATA_TYPE_EDEFAULT);
				return;
			case CommonPackage.DESIGN_DATA_TYPE__TYPED_SIGNALS:
				getTypedSignals().clear();
				return;
			case CommonPackage.DESIGN_DATA_TYPE__UNIT:
				setUnit(UNIT_EDEFAULT);
				return;
			case CommonPackage.DESIGN_DATA_TYPE__RESOLUTION:
				setResolution(RESOLUTION_EDEFAULT);
				return;
			case CommonPackage.DESIGN_DATA_TYPE__PHYSICAL_MINIMUM:
				setPhysicalMinimum(PHYSICAL_MINIMUM_EDEFAULT);
				return;
			case CommonPackage.DESIGN_DATA_TYPE__PHYSICAL_MAXIMUM:
				setPhysicalMaximum(PHYSICAL_MAXIMUM_EDEFAULT);
				return;
			case CommonPackage.DESIGN_DATA_TYPE__SIGNIFICANT_DIGITS:
				setSignificantDigits(SIGNIFICANT_DIGITS_EDEFAULT);
				return;
			case CommonPackage.DESIGN_DATA_TYPE__DEFAULT_VALUE:
				setDefaultValue(DEFAULT_VALUE_EDEFAULT);
				return;
			case CommonPackage.DESIGN_DATA_TYPE__TYPED_SERVICE_PARAMETERS:
				getTypedServiceParameters().clear();
				return;
			case CommonPackage.DESIGN_DATA_TYPE__TYPE_ASSOCIATIONS:
				getTypeAssociations().clear();
				return;
			case CommonPackage.DESIGN_DATA_TYPE__TYPED_FUNCTION_PARAMETERS:
				getTypedFunctionParameters().clear();
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
			case CommonPackage.DESIGN_DATA_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case CommonPackage.DESIGN_DATA_TYPE__DATA_TYPE:
				return dataType != DATA_TYPE_EDEFAULT;
			case CommonPackage.DESIGN_DATA_TYPE__TYPED_SIGNALS:
				return typedSignals != null && !typedSignals.isEmpty();
			case CommonPackage.DESIGN_DATA_TYPE__UNIT:
				return UNIT_EDEFAULT == null ? unit != null : !UNIT_EDEFAULT.equals(unit);
			case CommonPackage.DESIGN_DATA_TYPE__RESOLUTION:
				return RESOLUTION_EDEFAULT == null ? resolution != null : !RESOLUTION_EDEFAULT.equals(resolution);
			case CommonPackage.DESIGN_DATA_TYPE__PHYSICAL_MINIMUM:
				return PHYSICAL_MINIMUM_EDEFAULT == null ? physicalMinimum != null : !PHYSICAL_MINIMUM_EDEFAULT.equals(physicalMinimum);
			case CommonPackage.DESIGN_DATA_TYPE__PHYSICAL_MAXIMUM:
				return PHYSICAL_MAXIMUM_EDEFAULT == null ? physicalMaximum != null : !PHYSICAL_MAXIMUM_EDEFAULT.equals(physicalMaximum);
			case CommonPackage.DESIGN_DATA_TYPE__SIGNIFICANT_DIGITS:
				return significantDigits != SIGNIFICANT_DIGITS_EDEFAULT;
			case CommonPackage.DESIGN_DATA_TYPE__DEFAULT_VALUE:
				return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
			case CommonPackage.DESIGN_DATA_TYPE__TYPED_SERVICE_PARAMETERS:
				return typedServiceParameters != null && !typedServiceParameters.isEmpty();
			case CommonPackage.DESIGN_DATA_TYPE__TYPE_ASSOCIATIONS:
				return typeAssociations != null && !typeAssociations.isEmpty();
			case CommonPackage.DESIGN_DATA_TYPE__TYPED_FUNCTION_PARAMETERS:
				return typedFunctionParameters != null && !typedFunctionParameters.isEmpty();
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
		result.append(", unit: ");
		result.append(unit);
		result.append(", resolution: ");
		result.append(resolution);
		result.append(", physicalMinimum: ");
		result.append(physicalMinimum);
		result.append(", physicalMaximum: ");
		result.append(physicalMaximum);
		result.append(", significantDigits: ");
		result.append(significantDigits);
		result.append(", defaultValue: ");
		result.append(defaultValue);
		result.append(')');
		return result.toString();
	}

} //DesignDataTypeImpl
