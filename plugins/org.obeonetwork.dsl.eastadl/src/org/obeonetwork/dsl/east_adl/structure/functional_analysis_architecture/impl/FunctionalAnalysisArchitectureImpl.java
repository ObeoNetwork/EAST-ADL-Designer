/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.east_adl.core.impl.EASTADLArtifactImpl;

import org.obeonetwork.dsl.east_adl.structure.common.ConnectorSignal;
import org.obeonetwork.dsl.east_adl.structure.common.DesignDataType;
import org.obeonetwork.dsl.east_adl.structure.common.ImplementationDataType;
import org.obeonetwork.dsl.east_adl.structure.common.OperationCall;
import org.obeonetwork.dsl.east_adl.structure.common.TypeAssociation;

import org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.AnalysisFunction;
import org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.FunctionalAnalysisArchitecture;
import org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.FunctionalDevice;
import org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.Functional_analysis_architecturePackage;

import org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.FunctionalDesignArchitecture;
import org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Functional_design_architecturePackage;

import org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleFeatureModel;
import org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.Vehicle_feature_modelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functional Analysis Architecture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl.FunctionalAnalysisArchitectureImpl#getAnalysisFunctions <em>Analysis Functions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl.FunctionalAnalysisArchitectureImpl#getFunctionalDevices <em>Functional Devices</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl.FunctionalAnalysisArchitectureImpl#getVehicleModel <em>Vehicle Model</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl.FunctionalAnalysisArchitectureImpl#getDesignArchitecture <em>Design Architecture</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl.FunctionalAnalysisArchitectureImpl#getDesignDataTypes <em>Design Data Types</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl.FunctionalAnalysisArchitectureImpl#getConnectorSignals <em>Connector Signals</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl.FunctionalAnalysisArchitectureImpl#getOperationCalls <em>Operation Calls</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl.FunctionalAnalysisArchitectureImpl#getTypeAssociations <em>Type Associations</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl.FunctionalAnalysisArchitectureImpl#getImplementationDataTypes <em>Implementation Data Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionalAnalysisArchitectureImpl extends EASTADLArtifactImpl implements FunctionalAnalysisArchitecture {
	/**
	 * The cached value of the '{@link #getAnalysisFunctions() <em>Analysis Functions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalysisFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<AnalysisFunction> analysisFunctions;

	/**
	 * The cached value of the '{@link #getFunctionalDevices() <em>Functional Devices</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalDevices()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionalDevice> functionalDevices;

	/**
	 * The cached value of the '{@link #getVehicleModel() <em>Vehicle Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleModel()
	 * @generated
	 * @ordered
	 */
	protected VehicleFeatureModel vehicleModel;

	/**
	 * The cached value of the '{@link #getDesignArchitecture() <em>Design Architecture</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignArchitecture()
	 * @generated
	 * @ordered
	 */
	protected FunctionalDesignArchitecture designArchitecture;

	/**
	 * The cached value of the '{@link #getDesignDataTypes() <em>Design Data Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignDataTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<DesignDataType> designDataTypes;

	/**
	 * The cached value of the '{@link #getConnectorSignals() <em>Connector Signals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorSignals()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectorSignal> connectorSignals;

	/**
	 * The cached value of the '{@link #getOperationCalls() <em>Operation Calls</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationCalls()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationCall> operationCalls;

	/**
	 * The cached value of the '{@link #getTypeAssociations() <em>Type Associations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAssociations()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> typeAssociations;

	/**
	 * The cached value of the '{@link #getImplementationDataTypes() <em>Implementation Data Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationDataTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ImplementationDataType> implementationDataTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionalAnalysisArchitectureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Functional_analysis_architecturePackage.Literals.FUNCTIONAL_ANALYSIS_ARCHITECTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnalysisFunction> getAnalysisFunctions() {
		if (analysisFunctions == null) {
			analysisFunctions = new EObjectContainmentEList<AnalysisFunction>(AnalysisFunction.class, this, Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__ANALYSIS_FUNCTIONS);
		}
		return analysisFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionalDevice> getFunctionalDevices() {
		if (functionalDevices == null) {
			functionalDevices = new EObjectContainmentWithInverseEList<FunctionalDevice>(FunctionalDevice.class, this, Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__FUNCTIONAL_DEVICES, Functional_analysis_architecturePackage.FUNCTIONAL_DEVICE__OWNING_ARTIFACT);
		}
		return functionalDevices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VehicleFeatureModel getVehicleModel() {
		if (vehicleModel != null && vehicleModel.eIsProxy()) {
			InternalEObject oldVehicleModel = (InternalEObject)vehicleModel;
			vehicleModel = (VehicleFeatureModel)eResolveProxy(oldVehicleModel);
			if (vehicleModel != oldVehicleModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__VEHICLE_MODEL, oldVehicleModel, vehicleModel));
			}
		}
		return vehicleModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VehicleFeatureModel basicGetVehicleModel() {
		return vehicleModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVehicleModel(VehicleFeatureModel newVehicleModel, NotificationChain msgs) {
		VehicleFeatureModel oldVehicleModel = vehicleModel;
		vehicleModel = newVehicleModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__VEHICLE_MODEL, oldVehicleModel, newVehicleModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVehicleModel(VehicleFeatureModel newVehicleModel) {
		if (newVehicleModel != vehicleModel) {
			NotificationChain msgs = null;
			if (vehicleModel != null)
				msgs = ((InternalEObject)vehicleModel).eInverseRemove(this, Vehicle_feature_modelPackage.VEHICLE_FEATURE_MODEL__ANALYSIS_ARCHITECTURE, VehicleFeatureModel.class, msgs);
			if (newVehicleModel != null)
				msgs = ((InternalEObject)newVehicleModel).eInverseAdd(this, Vehicle_feature_modelPackage.VEHICLE_FEATURE_MODEL__ANALYSIS_ARCHITECTURE, VehicleFeatureModel.class, msgs);
			msgs = basicSetVehicleModel(newVehicleModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__VEHICLE_MODEL, newVehicleModel, newVehicleModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalDesignArchitecture getDesignArchitecture() {
		if (designArchitecture != null && designArchitecture.eIsProxy()) {
			InternalEObject oldDesignArchitecture = (InternalEObject)designArchitecture;
			designArchitecture = (FunctionalDesignArchitecture)eResolveProxy(oldDesignArchitecture);
			if (designArchitecture != oldDesignArchitecture) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__DESIGN_ARCHITECTURE, oldDesignArchitecture, designArchitecture));
			}
		}
		return designArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalDesignArchitecture basicGetDesignArchitecture() {
		return designArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDesignArchitecture(FunctionalDesignArchitecture newDesignArchitecture, NotificationChain msgs) {
		FunctionalDesignArchitecture oldDesignArchitecture = designArchitecture;
		designArchitecture = newDesignArchitecture;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__DESIGN_ARCHITECTURE, oldDesignArchitecture, newDesignArchitecture);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesignArchitecture(FunctionalDesignArchitecture newDesignArchitecture) {
		if (newDesignArchitecture != designArchitecture) {
			NotificationChain msgs = null;
			if (designArchitecture != null)
				msgs = ((InternalEObject)designArchitecture).eInverseRemove(this, Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__ANALYSIS_ARCHITECTURE, FunctionalDesignArchitecture.class, msgs);
			if (newDesignArchitecture != null)
				msgs = ((InternalEObject)newDesignArchitecture).eInverseAdd(this, Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__ANALYSIS_ARCHITECTURE, FunctionalDesignArchitecture.class, msgs);
			msgs = basicSetDesignArchitecture(newDesignArchitecture, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__DESIGN_ARCHITECTURE, newDesignArchitecture, newDesignArchitecture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DesignDataType> getDesignDataTypes() {
		if (designDataTypes == null) {
			designDataTypes = new EObjectContainmentEList<DesignDataType>(DesignDataType.class, this, Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__DESIGN_DATA_TYPES);
		}
		return designDataTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectorSignal> getConnectorSignals() {
		if (connectorSignals == null) {
			connectorSignals = new EObjectContainmentEList<ConnectorSignal>(ConnectorSignal.class, this, Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__CONNECTOR_SIGNALS);
		}
		return connectorSignals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationCall> getOperationCalls() {
		if (operationCalls == null) {
			operationCalls = new EObjectContainmentEList<OperationCall>(OperationCall.class, this, Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__OPERATION_CALLS);
		}
		return operationCalls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getTypeAssociations() {
		if (typeAssociations == null) {
			typeAssociations = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__TYPE_ASSOCIATIONS);
		}
		return typeAssociations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImplementationDataType> getImplementationDataTypes() {
		if (implementationDataTypes == null) {
			implementationDataTypes = new EObjectContainmentEList<ImplementationDataType>(ImplementationDataType.class, this, Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__IMPLEMENTATION_DATA_TYPES);
		}
		return implementationDataTypes;
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
			case Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__FUNCTIONAL_DEVICES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFunctionalDevices()).basicAdd(otherEnd, msgs);
			case Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__VEHICLE_MODEL:
				if (vehicleModel != null)
					msgs = ((InternalEObject)vehicleModel).eInverseRemove(this, Vehicle_feature_modelPackage.VEHICLE_FEATURE_MODEL__ANALYSIS_ARCHITECTURE, VehicleFeatureModel.class, msgs);
				return basicSetVehicleModel((VehicleFeatureModel)otherEnd, msgs);
			case Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__DESIGN_ARCHITECTURE:
				if (designArchitecture != null)
					msgs = ((InternalEObject)designArchitecture).eInverseRemove(this, Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__ANALYSIS_ARCHITECTURE, FunctionalDesignArchitecture.class, msgs);
				return basicSetDesignArchitecture((FunctionalDesignArchitecture)otherEnd, msgs);
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
			case Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__ANALYSIS_FUNCTIONS:
				return ((InternalEList<?>)getAnalysisFunctions()).basicRemove(otherEnd, msgs);
			case Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__FUNCTIONAL_DEVICES:
				return ((InternalEList<?>)getFunctionalDevices()).basicRemove(otherEnd, msgs);
			case Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__VEHICLE_MODEL:
				return basicSetVehicleModel(null, msgs);
			case Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__DESIGN_ARCHITECTURE:
				return basicSetDesignArchitecture(null, msgs);
			case Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__DESIGN_DATA_TYPES:
				return ((InternalEList<?>)getDesignDataTypes()).basicRemove(otherEnd, msgs);
			case Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__CONNECTOR_SIGNALS:
				return ((InternalEList<?>)getConnectorSignals()).basicRemove(otherEnd, msgs);
			case Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__OPERATION_CALLS:
				return ((InternalEList<?>)getOperationCalls()).basicRemove(otherEnd, msgs);
			case Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__TYPE_ASSOCIATIONS:
				return ((InternalEList<?>)getTypeAssociations()).basicRemove(otherEnd, msgs);
			case Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__IMPLEMENTATION_DATA_TYPES:
				return ((InternalEList<?>)getImplementationDataTypes()).basicRemove(otherEnd, msgs);
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
			case Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__ANALYSIS_FUNCTIONS:
				return getAnalysisFunctions();
			case Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__FUNCTIONAL_DEVICES:
				return getFunctionalDevices();
			case Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__VEHICLE_MODEL:
				if (resolve) return getVehicleModel();
				return basicGetVehicleModel();
			case Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__DESIGN_ARCHITECTURE:
				if (resolve) return getDesignArchitecture();
				return basicGetDesignArchitecture();
			case Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__DESIGN_DATA_TYPES:
				return getDesignDataTypes();
			case Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__CONNECTOR_SIGNALS:
				return getConnectorSignals();
			case Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__OPERATION_CALLS:
				return getOperationCalls();
			case Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__TYPE_ASSOCIATIONS:
				return getTypeAssociations();
			case Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__IMPLEMENTATION_DATA_TYPES:
				return getImplementationDataTypes();
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
			case Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__ANALYSIS_FUNCTIONS:
				getAnalysisFunctions().clear();
				getAnalysisFunctions().addAll((Collection<? extends AnalysisFunction>)newValue);
				return;
			case Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__FUNCTIONAL_DEVICES:
				getFunctionalDevices().clear();
				getFunctionalDevices().addAll((Collection<? extends FunctionalDevice>)newValue);
				return;
			case Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__VEHICLE_MODEL:
				setVehicleModel((VehicleFeatureModel)newValue);
				return;
			case Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__DESIGN_ARCHITECTURE:
				setDesignArchitecture((FunctionalDesignArchitecture)newValue);
				return;
			case Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__DESIGN_DATA_TYPES:
				getDesignDataTypes().clear();
				getDesignDataTypes().addAll((Collection<? extends DesignDataType>)newValue);
				return;
			case Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__CONNECTOR_SIGNALS:
				getConnectorSignals().clear();
				getConnectorSignals().addAll((Collection<? extends ConnectorSignal>)newValue);
				return;
			case Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__OPERATION_CALLS:
				getOperationCalls().clear();
				getOperationCalls().addAll((Collection<? extends OperationCall>)newValue);
				return;
			case Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__TYPE_ASSOCIATIONS:
				getTypeAssociations().clear();
				getTypeAssociations().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__IMPLEMENTATION_DATA_TYPES:
				getImplementationDataTypes().clear();
				getImplementationDataTypes().addAll((Collection<? extends ImplementationDataType>)newValue);
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
			case Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__ANALYSIS_FUNCTIONS:
				getAnalysisFunctions().clear();
				return;
			case Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__FUNCTIONAL_DEVICES:
				getFunctionalDevices().clear();
				return;
			case Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__VEHICLE_MODEL:
				setVehicleModel((VehicleFeatureModel)null);
				return;
			case Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__DESIGN_ARCHITECTURE:
				setDesignArchitecture((FunctionalDesignArchitecture)null);
				return;
			case Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__DESIGN_DATA_TYPES:
				getDesignDataTypes().clear();
				return;
			case Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__CONNECTOR_SIGNALS:
				getConnectorSignals().clear();
				return;
			case Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__OPERATION_CALLS:
				getOperationCalls().clear();
				return;
			case Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__TYPE_ASSOCIATIONS:
				getTypeAssociations().clear();
				return;
			case Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__IMPLEMENTATION_DATA_TYPES:
				getImplementationDataTypes().clear();
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
			case Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__ANALYSIS_FUNCTIONS:
				return analysisFunctions != null && !analysisFunctions.isEmpty();
			case Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__FUNCTIONAL_DEVICES:
				return functionalDevices != null && !functionalDevices.isEmpty();
			case Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__VEHICLE_MODEL:
				return vehicleModel != null;
			case Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__DESIGN_ARCHITECTURE:
				return designArchitecture != null;
			case Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__DESIGN_DATA_TYPES:
				return designDataTypes != null && !designDataTypes.isEmpty();
			case Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__CONNECTOR_SIGNALS:
				return connectorSignals != null && !connectorSignals.isEmpty();
			case Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__OPERATION_CALLS:
				return operationCalls != null && !operationCalls.isEmpty();
			case Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__TYPE_ASSOCIATIONS:
				return typeAssociations != null && !typeAssociations.isEmpty();
			case Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__IMPLEMENTATION_DATA_TYPES:
				return implementationDataTypes != null && !implementationDataTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FunctionalAnalysisArchitectureImpl
