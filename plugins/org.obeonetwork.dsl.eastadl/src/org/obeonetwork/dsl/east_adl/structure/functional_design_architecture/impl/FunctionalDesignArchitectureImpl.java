/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.east_adl.core.impl.EASTADLArtifactImpl;

import org.obeonetwork.dsl.east_adl.structure.common.ConnectorSignal;
import org.obeonetwork.dsl.east_adl.structure.common.DesignDataType;
import org.obeonetwork.dsl.east_adl.structure.common.ImplementationDataType;
import org.obeonetwork.dsl.east_adl.structure.common.OperationCall;
import org.obeonetwork.dsl.east_adl.structure.common.TypeAssociation;

import org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstanceModel;
import org.obeonetwork.dsl.east_adl.structure.function_instance_model.Function_instance_modelPackage;

import org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.FunctionalAnalysisArchitecture;
import org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.Functional_analysis_architecturePackage;

import org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.CompositeSoftwareFunction;
import org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction;
import org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.FunctionalDesignArchitecture;
import org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Functional_design_architecturePackage;

import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.HardwareArchitecture;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage;

import org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.VehicleFeatureModel;
import org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.Vehicle_feature_modelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functional Design Architecture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.FunctionalDesignArchitectureImpl#getElementarySoftwareFunctions <em>Elementary Software Functions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.FunctionalDesignArchitectureImpl#getCompositeSoftwareFunctions <em>Composite Software Functions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.FunctionalDesignArchitectureImpl#getAnalysisArchitecture <em>Analysis Architecture</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.FunctionalDesignArchitectureImpl#getVehicleModel <em>Vehicle Model</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.FunctionalDesignArchitectureImpl#getInstanceModel <em>Instance Model</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.FunctionalDesignArchitectureImpl#getTypeAssociations <em>Type Associations</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.FunctionalDesignArchitectureImpl#getImplementationDataTypes <em>Implementation Data Types</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.FunctionalDesignArchitectureImpl#getDesignDataTypes <em>Design Data Types</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.FunctionalDesignArchitectureImpl#getConnectorSignals <em>Connector Signals</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.FunctionalDesignArchitectureImpl#getOperationCalls <em>Operation Calls</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl.FunctionalDesignArchitectureImpl#getHardwareArchitecture <em>Hardware Architecture</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionalDesignArchitectureImpl extends EASTADLArtifactImpl implements FunctionalDesignArchitecture {
	/**
	 * The cached value of the '{@link #getElementarySoftwareFunctions() <em>Elementary Software Functions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementarySoftwareFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementarySoftwareFunction> elementarySoftwareFunctions;

	/**
	 * The cached value of the '{@link #getCompositeSoftwareFunctions() <em>Composite Software Functions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositeSoftwareFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<CompositeSoftwareFunction> compositeSoftwareFunctions;

	/**
	 * The cached value of the '{@link #getAnalysisArchitecture() <em>Analysis Architecture</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalysisArchitecture()
	 * @generated
	 * @ordered
	 */
	protected FunctionalAnalysisArchitecture analysisArchitecture;

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
	 * The cached value of the '{@link #getInstanceModel() <em>Instance Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceModel()
	 * @generated
	 * @ordered
	 */
	protected FunctionInstanceModel instanceModel;

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
	 * The cached value of the '{@link #getHardwareArchitecture() <em>Hardware Architecture</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardwareArchitecture()
	 * @generated
	 * @ordered
	 */
	protected HardwareArchitecture hardwareArchitecture;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionalDesignArchitectureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Functional_design_architecturePackage.Literals.FUNCTIONAL_DESIGN_ARCHITECTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementarySoftwareFunction> getElementarySoftwareFunctions() {
		if (elementarySoftwareFunctions == null) {
			elementarySoftwareFunctions = new EObjectContainmentEList<ElementarySoftwareFunction>(ElementarySoftwareFunction.class, this, Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__ELEMENTARY_SOFTWARE_FUNCTIONS);
		}
		return elementarySoftwareFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompositeSoftwareFunction> getCompositeSoftwareFunctions() {
		if (compositeSoftwareFunctions == null) {
			compositeSoftwareFunctions = new EObjectContainmentEList<CompositeSoftwareFunction>(CompositeSoftwareFunction.class, this, Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__COMPOSITE_SOFTWARE_FUNCTIONS);
		}
		return compositeSoftwareFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalAnalysisArchitecture getAnalysisArchitecture() {
		if (analysisArchitecture != null && analysisArchitecture.eIsProxy()) {
			InternalEObject oldAnalysisArchitecture = (InternalEObject)analysisArchitecture;
			analysisArchitecture = (FunctionalAnalysisArchitecture)eResolveProxy(oldAnalysisArchitecture);
			if (analysisArchitecture != oldAnalysisArchitecture) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__ANALYSIS_ARCHITECTURE, oldAnalysisArchitecture, analysisArchitecture));
			}
		}
		return analysisArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalAnalysisArchitecture basicGetAnalysisArchitecture() {
		return analysisArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnalysisArchitecture(FunctionalAnalysisArchitecture newAnalysisArchitecture, NotificationChain msgs) {
		FunctionalAnalysisArchitecture oldAnalysisArchitecture = analysisArchitecture;
		analysisArchitecture = newAnalysisArchitecture;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__ANALYSIS_ARCHITECTURE, oldAnalysisArchitecture, newAnalysisArchitecture);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnalysisArchitecture(FunctionalAnalysisArchitecture newAnalysisArchitecture) {
		if (newAnalysisArchitecture != analysisArchitecture) {
			NotificationChain msgs = null;
			if (analysisArchitecture != null)
				msgs = ((InternalEObject)analysisArchitecture).eInverseRemove(this, Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__DESIGN_ARCHITECTURE, FunctionalAnalysisArchitecture.class, msgs);
			if (newAnalysisArchitecture != null)
				msgs = ((InternalEObject)newAnalysisArchitecture).eInverseAdd(this, Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__DESIGN_ARCHITECTURE, FunctionalAnalysisArchitecture.class, msgs);
			msgs = basicSetAnalysisArchitecture(newAnalysisArchitecture, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__ANALYSIS_ARCHITECTURE, newAnalysisArchitecture, newAnalysisArchitecture));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__VEHICLE_MODEL, oldVehicleModel, vehicleModel));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__VEHICLE_MODEL, oldVehicleModel, newVehicleModel);
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
				msgs = ((InternalEObject)vehicleModel).eInverseRemove(this, Vehicle_feature_modelPackage.VEHICLE_FEATURE_MODEL__DESIGN_ARCHITECTURE, VehicleFeatureModel.class, msgs);
			if (newVehicleModel != null)
				msgs = ((InternalEObject)newVehicleModel).eInverseAdd(this, Vehicle_feature_modelPackage.VEHICLE_FEATURE_MODEL__DESIGN_ARCHITECTURE, VehicleFeatureModel.class, msgs);
			msgs = basicSetVehicleModel(newVehicleModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__VEHICLE_MODEL, newVehicleModel, newVehicleModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionInstanceModel getInstanceModel() {
		if (instanceModel != null && instanceModel.eIsProxy()) {
			InternalEObject oldInstanceModel = (InternalEObject)instanceModel;
			instanceModel = (FunctionInstanceModel)eResolveProxy(oldInstanceModel);
			if (instanceModel != oldInstanceModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__INSTANCE_MODEL, oldInstanceModel, instanceModel));
			}
		}
		return instanceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionInstanceModel basicGetInstanceModel() {
		return instanceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstanceModel(FunctionInstanceModel newInstanceModel, NotificationChain msgs) {
		FunctionInstanceModel oldInstanceModel = instanceModel;
		instanceModel = newInstanceModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__INSTANCE_MODEL, oldInstanceModel, newInstanceModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceModel(FunctionInstanceModel newInstanceModel) {
		if (newInstanceModel != instanceModel) {
			NotificationChain msgs = null;
			if (instanceModel != null)
				msgs = ((InternalEObject)instanceModel).eInverseRemove(this, Function_instance_modelPackage.FUNCTION_INSTANCE_MODEL__DESIGN_ARCHITECTURE, FunctionInstanceModel.class, msgs);
			if (newInstanceModel != null)
				msgs = ((InternalEObject)newInstanceModel).eInverseAdd(this, Function_instance_modelPackage.FUNCTION_INSTANCE_MODEL__DESIGN_ARCHITECTURE, FunctionInstanceModel.class, msgs);
			msgs = basicSetInstanceModel(newInstanceModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__INSTANCE_MODEL, newInstanceModel, newInstanceModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getTypeAssociations() {
		if (typeAssociations == null) {
			typeAssociations = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__TYPE_ASSOCIATIONS);
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
			implementationDataTypes = new EObjectContainmentEList<ImplementationDataType>(ImplementationDataType.class, this, Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__IMPLEMENTATION_DATA_TYPES);
		}
		return implementationDataTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DesignDataType> getDesignDataTypes() {
		if (designDataTypes == null) {
			designDataTypes = new EObjectContainmentEList<DesignDataType>(DesignDataType.class, this, Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__DESIGN_DATA_TYPES);
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
			connectorSignals = new EObjectContainmentEList<ConnectorSignal>(ConnectorSignal.class, this, Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__CONNECTOR_SIGNALS);
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
			operationCalls = new EObjectContainmentEList<OperationCall>(OperationCall.class, this, Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__OPERATION_CALLS);
		}
		return operationCalls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareArchitecture getHardwareArchitecture() {
		if (hardwareArchitecture != null && hardwareArchitecture.eIsProxy()) {
			InternalEObject oldHardwareArchitecture = (InternalEObject)hardwareArchitecture;
			hardwareArchitecture = (HardwareArchitecture)eResolveProxy(oldHardwareArchitecture);
			if (hardwareArchitecture != oldHardwareArchitecture) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__HARDWARE_ARCHITECTURE, oldHardwareArchitecture, hardwareArchitecture));
			}
		}
		return hardwareArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareArchitecture basicGetHardwareArchitecture() {
		return hardwareArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHardwareArchitecture(HardwareArchitecture newHardwareArchitecture, NotificationChain msgs) {
		HardwareArchitecture oldHardwareArchitecture = hardwareArchitecture;
		hardwareArchitecture = newHardwareArchitecture;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__HARDWARE_ARCHITECTURE, oldHardwareArchitecture, newHardwareArchitecture);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHardwareArchitecture(HardwareArchitecture newHardwareArchitecture) {
		if (newHardwareArchitecture != hardwareArchitecture) {
			NotificationChain msgs = null;
			if (hardwareArchitecture != null)
				msgs = ((InternalEObject)hardwareArchitecture).eInverseRemove(this, Hardware_architecturePackage.HARDWARE_ARCHITECTURE__DESIGN_ARCHITECTURE, HardwareArchitecture.class, msgs);
			if (newHardwareArchitecture != null)
				msgs = ((InternalEObject)newHardwareArchitecture).eInverseAdd(this, Hardware_architecturePackage.HARDWARE_ARCHITECTURE__DESIGN_ARCHITECTURE, HardwareArchitecture.class, msgs);
			msgs = basicSetHardwareArchitecture(newHardwareArchitecture, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__HARDWARE_ARCHITECTURE, newHardwareArchitecture, newHardwareArchitecture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__ANALYSIS_ARCHITECTURE:
				if (analysisArchitecture != null)
					msgs = ((InternalEObject)analysisArchitecture).eInverseRemove(this, Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__DESIGN_ARCHITECTURE, FunctionalAnalysisArchitecture.class, msgs);
				return basicSetAnalysisArchitecture((FunctionalAnalysisArchitecture)otherEnd, msgs);
			case Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__VEHICLE_MODEL:
				if (vehicleModel != null)
					msgs = ((InternalEObject)vehicleModel).eInverseRemove(this, Vehicle_feature_modelPackage.VEHICLE_FEATURE_MODEL__DESIGN_ARCHITECTURE, VehicleFeatureModel.class, msgs);
				return basicSetVehicleModel((VehicleFeatureModel)otherEnd, msgs);
			case Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__INSTANCE_MODEL:
				if (instanceModel != null)
					msgs = ((InternalEObject)instanceModel).eInverseRemove(this, Function_instance_modelPackage.FUNCTION_INSTANCE_MODEL__DESIGN_ARCHITECTURE, FunctionInstanceModel.class, msgs);
				return basicSetInstanceModel((FunctionInstanceModel)otherEnd, msgs);
			case Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__HARDWARE_ARCHITECTURE:
				if (hardwareArchitecture != null)
					msgs = ((InternalEObject)hardwareArchitecture).eInverseRemove(this, Hardware_architecturePackage.HARDWARE_ARCHITECTURE__DESIGN_ARCHITECTURE, HardwareArchitecture.class, msgs);
				return basicSetHardwareArchitecture((HardwareArchitecture)otherEnd, msgs);
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
			case Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__ELEMENTARY_SOFTWARE_FUNCTIONS:
				return ((InternalEList<?>)getElementarySoftwareFunctions()).basicRemove(otherEnd, msgs);
			case Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__COMPOSITE_SOFTWARE_FUNCTIONS:
				return ((InternalEList<?>)getCompositeSoftwareFunctions()).basicRemove(otherEnd, msgs);
			case Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__ANALYSIS_ARCHITECTURE:
				return basicSetAnalysisArchitecture(null, msgs);
			case Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__VEHICLE_MODEL:
				return basicSetVehicleModel(null, msgs);
			case Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__INSTANCE_MODEL:
				return basicSetInstanceModel(null, msgs);
			case Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__TYPE_ASSOCIATIONS:
				return ((InternalEList<?>)getTypeAssociations()).basicRemove(otherEnd, msgs);
			case Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__IMPLEMENTATION_DATA_TYPES:
				return ((InternalEList<?>)getImplementationDataTypes()).basicRemove(otherEnd, msgs);
			case Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__DESIGN_DATA_TYPES:
				return ((InternalEList<?>)getDesignDataTypes()).basicRemove(otherEnd, msgs);
			case Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__CONNECTOR_SIGNALS:
				return ((InternalEList<?>)getConnectorSignals()).basicRemove(otherEnd, msgs);
			case Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__OPERATION_CALLS:
				return ((InternalEList<?>)getOperationCalls()).basicRemove(otherEnd, msgs);
			case Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__HARDWARE_ARCHITECTURE:
				return basicSetHardwareArchitecture(null, msgs);
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
			case Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__ELEMENTARY_SOFTWARE_FUNCTIONS:
				return getElementarySoftwareFunctions();
			case Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__COMPOSITE_SOFTWARE_FUNCTIONS:
				return getCompositeSoftwareFunctions();
			case Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__ANALYSIS_ARCHITECTURE:
				if (resolve) return getAnalysisArchitecture();
				return basicGetAnalysisArchitecture();
			case Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__VEHICLE_MODEL:
				if (resolve) return getVehicleModel();
				return basicGetVehicleModel();
			case Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__INSTANCE_MODEL:
				if (resolve) return getInstanceModel();
				return basicGetInstanceModel();
			case Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__TYPE_ASSOCIATIONS:
				return getTypeAssociations();
			case Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__IMPLEMENTATION_DATA_TYPES:
				return getImplementationDataTypes();
			case Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__DESIGN_DATA_TYPES:
				return getDesignDataTypes();
			case Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__CONNECTOR_SIGNALS:
				return getConnectorSignals();
			case Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__OPERATION_CALLS:
				return getOperationCalls();
			case Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__HARDWARE_ARCHITECTURE:
				if (resolve) return getHardwareArchitecture();
				return basicGetHardwareArchitecture();
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
			case Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__ELEMENTARY_SOFTWARE_FUNCTIONS:
				getElementarySoftwareFunctions().clear();
				getElementarySoftwareFunctions().addAll((Collection<? extends ElementarySoftwareFunction>)newValue);
				return;
			case Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__COMPOSITE_SOFTWARE_FUNCTIONS:
				getCompositeSoftwareFunctions().clear();
				getCompositeSoftwareFunctions().addAll((Collection<? extends CompositeSoftwareFunction>)newValue);
				return;
			case Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__ANALYSIS_ARCHITECTURE:
				setAnalysisArchitecture((FunctionalAnalysisArchitecture)newValue);
				return;
			case Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__VEHICLE_MODEL:
				setVehicleModel((VehicleFeatureModel)newValue);
				return;
			case Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__INSTANCE_MODEL:
				setInstanceModel((FunctionInstanceModel)newValue);
				return;
			case Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__TYPE_ASSOCIATIONS:
				getTypeAssociations().clear();
				getTypeAssociations().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__IMPLEMENTATION_DATA_TYPES:
				getImplementationDataTypes().clear();
				getImplementationDataTypes().addAll((Collection<? extends ImplementationDataType>)newValue);
				return;
			case Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__DESIGN_DATA_TYPES:
				getDesignDataTypes().clear();
				getDesignDataTypes().addAll((Collection<? extends DesignDataType>)newValue);
				return;
			case Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__CONNECTOR_SIGNALS:
				getConnectorSignals().clear();
				getConnectorSignals().addAll((Collection<? extends ConnectorSignal>)newValue);
				return;
			case Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__OPERATION_CALLS:
				getOperationCalls().clear();
				getOperationCalls().addAll((Collection<? extends OperationCall>)newValue);
				return;
			case Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__HARDWARE_ARCHITECTURE:
				setHardwareArchitecture((HardwareArchitecture)newValue);
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
			case Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__ELEMENTARY_SOFTWARE_FUNCTIONS:
				getElementarySoftwareFunctions().clear();
				return;
			case Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__COMPOSITE_SOFTWARE_FUNCTIONS:
				getCompositeSoftwareFunctions().clear();
				return;
			case Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__ANALYSIS_ARCHITECTURE:
				setAnalysisArchitecture((FunctionalAnalysisArchitecture)null);
				return;
			case Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__VEHICLE_MODEL:
				setVehicleModel((VehicleFeatureModel)null);
				return;
			case Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__INSTANCE_MODEL:
				setInstanceModel((FunctionInstanceModel)null);
				return;
			case Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__TYPE_ASSOCIATIONS:
				getTypeAssociations().clear();
				return;
			case Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__IMPLEMENTATION_DATA_TYPES:
				getImplementationDataTypes().clear();
				return;
			case Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__DESIGN_DATA_TYPES:
				getDesignDataTypes().clear();
				return;
			case Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__CONNECTOR_SIGNALS:
				getConnectorSignals().clear();
				return;
			case Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__OPERATION_CALLS:
				getOperationCalls().clear();
				return;
			case Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__HARDWARE_ARCHITECTURE:
				setHardwareArchitecture((HardwareArchitecture)null);
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
			case Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__ELEMENTARY_SOFTWARE_FUNCTIONS:
				return elementarySoftwareFunctions != null && !elementarySoftwareFunctions.isEmpty();
			case Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__COMPOSITE_SOFTWARE_FUNCTIONS:
				return compositeSoftwareFunctions != null && !compositeSoftwareFunctions.isEmpty();
			case Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__ANALYSIS_ARCHITECTURE:
				return analysisArchitecture != null;
			case Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__VEHICLE_MODEL:
				return vehicleModel != null;
			case Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__INSTANCE_MODEL:
				return instanceModel != null;
			case Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__TYPE_ASSOCIATIONS:
				return typeAssociations != null && !typeAssociations.isEmpty();
			case Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__IMPLEMENTATION_DATA_TYPES:
				return implementationDataTypes != null && !implementationDataTypes.isEmpty();
			case Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__DESIGN_DATA_TYPES:
				return designDataTypes != null && !designDataTypes.isEmpty();
			case Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__CONNECTOR_SIGNALS:
				return connectorSignals != null && !connectorSignals.isEmpty();
			case Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__OPERATION_CALLS:
				return operationCalls != null && !operationCalls.isEmpty();
			case Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE__HARDWARE_ARCHITECTURE:
				return hardwareArchitecture != null;
		}
		return super.eIsSet(featureID);
	}

} //FunctionalDesignArchitectureImpl
