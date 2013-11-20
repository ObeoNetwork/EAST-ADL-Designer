/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.platform_model.impl;

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

import org.obeonetwork.dsl.east_adl.structure.allocation_model.AllocationModel;
import org.obeonetwork.dsl.east_adl.structure.allocation_model.Allocation_modelPackage;

import org.obeonetwork.dsl.east_adl.structure.common.ConnectorSignal;
import org.obeonetwork.dsl.east_adl.structure.common.DesignDataType;
import org.obeonetwork.dsl.east_adl.structure.common.ImplementationDataType;
import org.obeonetwork.dsl.east_adl.structure.common.OperationCall;
import org.obeonetwork.dsl.east_adl.structure.common.TypeAssociation;

import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.HardwareArchitecture;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage;

import org.obeonetwork.dsl.east_adl.structure.platform_model.DeviceDriver;
import org.obeonetwork.dsl.east_adl.structure.platform_model.Framework;
import org.obeonetwork.dsl.east_adl.structure.platform_model.HardwareAbstractionFunction;
import org.obeonetwork.dsl.east_adl.structure.platform_model.IODriver;
import org.obeonetwork.dsl.east_adl.structure.platform_model.IPCExchanger;
import org.obeonetwork.dsl.east_adl.structure.platform_model.MWCompositeSoftwareFunction;
import org.obeonetwork.dsl.east_adl.structure.platform_model.MWElementarySoftwareFunction;
import org.obeonetwork.dsl.east_adl.structure.platform_model.OperatingSystem;
import org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel;
import org.obeonetwork.dsl.east_adl.structure.platform_model.Platform_modelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Platform Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.platform_model.impl.PlatformModelImpl#getAllocationModel <em>Allocation Model</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.platform_model.impl.PlatformModelImpl#getHardwareArchitecture <em>Hardware Architecture</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.platform_model.impl.PlatformModelImpl#getDeviceDrivers <em>Device Drivers</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.platform_model.impl.PlatformModelImpl#getIODrivers <em>IO Drivers</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.platform_model.impl.PlatformModelImpl#getAbstractFunctions <em>Abstract Functions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.platform_model.impl.PlatformModelImpl#getFrameworks <em>Frameworks</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.platform_model.impl.PlatformModelImpl#getOperatingSystems <em>Operating Systems</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.platform_model.impl.PlatformModelImpl#getCompositeSoftwareFunctions <em>Composite Software Functions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.platform_model.impl.PlatformModelImpl#getElementarySoftwareFunctions <em>Elementary Software Functions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.platform_model.impl.PlatformModelImpl#getIPCExchangers <em>IPC Exchangers</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.platform_model.impl.PlatformModelImpl#getDesignDataTypes <em>Design Data Types</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.platform_model.impl.PlatformModelImpl#getImplementationDataTypes <em>Implementation Data Types</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.platform_model.impl.PlatformModelImpl#getTypeAssociations <em>Type Associations</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.platform_model.impl.PlatformModelImpl#getConnectorSignals <em>Connector Signals</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.platform_model.impl.PlatformModelImpl#getOperationCalls <em>Operation Calls</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlatformModelImpl extends EASTADLArtifactImpl implements PlatformModel {
	/**
	 * The cached value of the '{@link #getAllocationModel() <em>Allocation Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocationModel()
	 * @generated
	 * @ordered
	 */
	protected AllocationModel allocationModel;

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
	 * The cached value of the '{@link #getDeviceDrivers() <em>Device Drivers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceDrivers()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceDriver> deviceDrivers;

	/**
	 * The cached value of the '{@link #getIODrivers() <em>IO Drivers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIODrivers()
	 * @generated
	 * @ordered
	 */
	protected EList<IODriver> ioDrivers;

	/**
	 * The cached value of the '{@link #getAbstractFunctions() <em>Abstract Functions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<HardwareAbstractionFunction> abstractFunctions;

	/**
	 * The cached value of the '{@link #getFrameworks() <em>Frameworks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrameworks()
	 * @generated
	 * @ordered
	 */
	protected EList<Framework> frameworks;

	/**
	 * The cached value of the '{@link #getOperatingSystems() <em>Operating Systems</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatingSystems()
	 * @generated
	 * @ordered
	 */
	protected EList<OperatingSystem> operatingSystems;

	/**
	 * The cached value of the '{@link #getCompositeSoftwareFunctions() <em>Composite Software Functions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositeSoftwareFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<MWCompositeSoftwareFunction> compositeSoftwareFunctions;

	/**
	 * The cached value of the '{@link #getElementarySoftwareFunctions() <em>Elementary Software Functions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementarySoftwareFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<MWElementarySoftwareFunction> elementarySoftwareFunctions;

	/**
	 * The cached value of the '{@link #getIPCExchangers() <em>IPC Exchangers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIPCExchangers()
	 * @generated
	 * @ordered
	 */
	protected EList<IPCExchanger> ipcExchangers;

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
	 * The cached value of the '{@link #getImplementationDataTypes() <em>Implementation Data Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationDataTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ImplementationDataType> implementationDataTypes;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlatformModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Platform_modelPackage.Literals.PLATFORM_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationModel getAllocationModel() {
		if (allocationModel != null && allocationModel.eIsProxy()) {
			InternalEObject oldAllocationModel = (InternalEObject)allocationModel;
			allocationModel = (AllocationModel)eResolveProxy(oldAllocationModel);
			if (allocationModel != oldAllocationModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Platform_modelPackage.PLATFORM_MODEL__ALLOCATION_MODEL, oldAllocationModel, allocationModel));
			}
		}
		return allocationModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationModel basicGetAllocationModel() {
		return allocationModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllocationModel(AllocationModel newAllocationModel, NotificationChain msgs) {
		AllocationModel oldAllocationModel = allocationModel;
		allocationModel = newAllocationModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Platform_modelPackage.PLATFORM_MODEL__ALLOCATION_MODEL, oldAllocationModel, newAllocationModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllocationModel(AllocationModel newAllocationModel) {
		if (newAllocationModel != allocationModel) {
			NotificationChain msgs = null;
			if (allocationModel != null)
				msgs = ((InternalEObject)allocationModel).eInverseRemove(this, Allocation_modelPackage.ALLOCATION_MODEL__PLATFORM_MODEL, AllocationModel.class, msgs);
			if (newAllocationModel != null)
				msgs = ((InternalEObject)newAllocationModel).eInverseAdd(this, Allocation_modelPackage.ALLOCATION_MODEL__PLATFORM_MODEL, AllocationModel.class, msgs);
			msgs = basicSetAllocationModel(newAllocationModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Platform_modelPackage.PLATFORM_MODEL__ALLOCATION_MODEL, newAllocationModel, newAllocationModel));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Platform_modelPackage.PLATFORM_MODEL__HARDWARE_ARCHITECTURE, oldHardwareArchitecture, hardwareArchitecture));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Platform_modelPackage.PLATFORM_MODEL__HARDWARE_ARCHITECTURE, oldHardwareArchitecture, newHardwareArchitecture);
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
				msgs = ((InternalEObject)hardwareArchitecture).eInverseRemove(this, Hardware_architecturePackage.HARDWARE_ARCHITECTURE__PLATFORM_MODEL, HardwareArchitecture.class, msgs);
			if (newHardwareArchitecture != null)
				msgs = ((InternalEObject)newHardwareArchitecture).eInverseAdd(this, Hardware_architecturePackage.HARDWARE_ARCHITECTURE__PLATFORM_MODEL, HardwareArchitecture.class, msgs);
			msgs = basicSetHardwareArchitecture(newHardwareArchitecture, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Platform_modelPackage.PLATFORM_MODEL__HARDWARE_ARCHITECTURE, newHardwareArchitecture, newHardwareArchitecture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeviceDriver> getDeviceDrivers() {
		if (deviceDrivers == null) {
			deviceDrivers = new EObjectContainmentWithInverseEList<DeviceDriver>(DeviceDriver.class, this, Platform_modelPackage.PLATFORM_MODEL__DEVICE_DRIVERS, Platform_modelPackage.DEVICE_DRIVER__OWNING_ARTIFACT);
		}
		return deviceDrivers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IODriver> getIODrivers() {
		if (ioDrivers == null) {
			ioDrivers = new EObjectContainmentWithInverseEList<IODriver>(IODriver.class, this, Platform_modelPackage.PLATFORM_MODEL__IO_DRIVERS, Platform_modelPackage.IO_DRIVER__OWNING_ARTIFACT);
		}
		return ioDrivers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HardwareAbstractionFunction> getAbstractFunctions() {
		if (abstractFunctions == null) {
			abstractFunctions = new EObjectContainmentWithInverseEList<HardwareAbstractionFunction>(HardwareAbstractionFunction.class, this, Platform_modelPackage.PLATFORM_MODEL__ABSTRACT_FUNCTIONS, Platform_modelPackage.HARDWARE_ABSTRACTION_FUNCTION__OWNING_ARTIFACT);
		}
		return abstractFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Framework> getFrameworks() {
		if (frameworks == null) {
			frameworks = new EObjectContainmentWithInverseEList<Framework>(Framework.class, this, Platform_modelPackage.PLATFORM_MODEL__FRAMEWORKS, Platform_modelPackage.FRAMEWORK__OWNING_ARTIFACT);
		}
		return frameworks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperatingSystem> getOperatingSystems() {
		if (operatingSystems == null) {
			operatingSystems = new EObjectContainmentWithInverseEList<OperatingSystem>(OperatingSystem.class, this, Platform_modelPackage.PLATFORM_MODEL__OPERATING_SYSTEMS, Platform_modelPackage.OPERATING_SYSTEM__OWNING_ARTIFACT);
		}
		return operatingSystems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MWCompositeSoftwareFunction> getCompositeSoftwareFunctions() {
		if (compositeSoftwareFunctions == null) {
			compositeSoftwareFunctions = new EObjectContainmentEList<MWCompositeSoftwareFunction>(MWCompositeSoftwareFunction.class, this, Platform_modelPackage.PLATFORM_MODEL__COMPOSITE_SOFTWARE_FUNCTIONS);
		}
		return compositeSoftwareFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MWElementarySoftwareFunction> getElementarySoftwareFunctions() {
		if (elementarySoftwareFunctions == null) {
			elementarySoftwareFunctions = new EObjectContainmentEList<MWElementarySoftwareFunction>(MWElementarySoftwareFunction.class, this, Platform_modelPackage.PLATFORM_MODEL__ELEMENTARY_SOFTWARE_FUNCTIONS);
		}
		return elementarySoftwareFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IPCExchanger> getIPCExchangers() {
		if (ipcExchangers == null) {
			ipcExchangers = new EObjectContainmentWithInverseEList<IPCExchanger>(IPCExchanger.class, this, Platform_modelPackage.PLATFORM_MODEL__IPC_EXCHANGERS, Platform_modelPackage.IPC_EXCHANGER__OWNING_ARTIFACT);
		}
		return ipcExchangers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DesignDataType> getDesignDataTypes() {
		if (designDataTypes == null) {
			designDataTypes = new EObjectContainmentEList<DesignDataType>(DesignDataType.class, this, Platform_modelPackage.PLATFORM_MODEL__DESIGN_DATA_TYPES);
		}
		return designDataTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImplementationDataType> getImplementationDataTypes() {
		if (implementationDataTypes == null) {
			implementationDataTypes = new EObjectContainmentEList<ImplementationDataType>(ImplementationDataType.class, this, Platform_modelPackage.PLATFORM_MODEL__IMPLEMENTATION_DATA_TYPES);
		}
		return implementationDataTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getTypeAssociations() {
		if (typeAssociations == null) {
			typeAssociations = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, Platform_modelPackage.PLATFORM_MODEL__TYPE_ASSOCIATIONS);
		}
		return typeAssociations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectorSignal> getConnectorSignals() {
		if (connectorSignals == null) {
			connectorSignals = new EObjectContainmentEList<ConnectorSignal>(ConnectorSignal.class, this, Platform_modelPackage.PLATFORM_MODEL__CONNECTOR_SIGNALS);
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
			operationCalls = new EObjectContainmentEList<OperationCall>(OperationCall.class, this, Platform_modelPackage.PLATFORM_MODEL__OPERATION_CALLS);
		}
		return operationCalls;
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
			case Platform_modelPackage.PLATFORM_MODEL__ALLOCATION_MODEL:
				if (allocationModel != null)
					msgs = ((InternalEObject)allocationModel).eInverseRemove(this, Allocation_modelPackage.ALLOCATION_MODEL__PLATFORM_MODEL, AllocationModel.class, msgs);
				return basicSetAllocationModel((AllocationModel)otherEnd, msgs);
			case Platform_modelPackage.PLATFORM_MODEL__HARDWARE_ARCHITECTURE:
				if (hardwareArchitecture != null)
					msgs = ((InternalEObject)hardwareArchitecture).eInverseRemove(this, Hardware_architecturePackage.HARDWARE_ARCHITECTURE__PLATFORM_MODEL, HardwareArchitecture.class, msgs);
				return basicSetHardwareArchitecture((HardwareArchitecture)otherEnd, msgs);
			case Platform_modelPackage.PLATFORM_MODEL__DEVICE_DRIVERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDeviceDrivers()).basicAdd(otherEnd, msgs);
			case Platform_modelPackage.PLATFORM_MODEL__IO_DRIVERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIODrivers()).basicAdd(otherEnd, msgs);
			case Platform_modelPackage.PLATFORM_MODEL__ABSTRACT_FUNCTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAbstractFunctions()).basicAdd(otherEnd, msgs);
			case Platform_modelPackage.PLATFORM_MODEL__FRAMEWORKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFrameworks()).basicAdd(otherEnd, msgs);
			case Platform_modelPackage.PLATFORM_MODEL__OPERATING_SYSTEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOperatingSystems()).basicAdd(otherEnd, msgs);
			case Platform_modelPackage.PLATFORM_MODEL__IPC_EXCHANGERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIPCExchangers()).basicAdd(otherEnd, msgs);
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
			case Platform_modelPackage.PLATFORM_MODEL__ALLOCATION_MODEL:
				return basicSetAllocationModel(null, msgs);
			case Platform_modelPackage.PLATFORM_MODEL__HARDWARE_ARCHITECTURE:
				return basicSetHardwareArchitecture(null, msgs);
			case Platform_modelPackage.PLATFORM_MODEL__DEVICE_DRIVERS:
				return ((InternalEList<?>)getDeviceDrivers()).basicRemove(otherEnd, msgs);
			case Platform_modelPackage.PLATFORM_MODEL__IO_DRIVERS:
				return ((InternalEList<?>)getIODrivers()).basicRemove(otherEnd, msgs);
			case Platform_modelPackage.PLATFORM_MODEL__ABSTRACT_FUNCTIONS:
				return ((InternalEList<?>)getAbstractFunctions()).basicRemove(otherEnd, msgs);
			case Platform_modelPackage.PLATFORM_MODEL__FRAMEWORKS:
				return ((InternalEList<?>)getFrameworks()).basicRemove(otherEnd, msgs);
			case Platform_modelPackage.PLATFORM_MODEL__OPERATING_SYSTEMS:
				return ((InternalEList<?>)getOperatingSystems()).basicRemove(otherEnd, msgs);
			case Platform_modelPackage.PLATFORM_MODEL__COMPOSITE_SOFTWARE_FUNCTIONS:
				return ((InternalEList<?>)getCompositeSoftwareFunctions()).basicRemove(otherEnd, msgs);
			case Platform_modelPackage.PLATFORM_MODEL__ELEMENTARY_SOFTWARE_FUNCTIONS:
				return ((InternalEList<?>)getElementarySoftwareFunctions()).basicRemove(otherEnd, msgs);
			case Platform_modelPackage.PLATFORM_MODEL__IPC_EXCHANGERS:
				return ((InternalEList<?>)getIPCExchangers()).basicRemove(otherEnd, msgs);
			case Platform_modelPackage.PLATFORM_MODEL__DESIGN_DATA_TYPES:
				return ((InternalEList<?>)getDesignDataTypes()).basicRemove(otherEnd, msgs);
			case Platform_modelPackage.PLATFORM_MODEL__IMPLEMENTATION_DATA_TYPES:
				return ((InternalEList<?>)getImplementationDataTypes()).basicRemove(otherEnd, msgs);
			case Platform_modelPackage.PLATFORM_MODEL__TYPE_ASSOCIATIONS:
				return ((InternalEList<?>)getTypeAssociations()).basicRemove(otherEnd, msgs);
			case Platform_modelPackage.PLATFORM_MODEL__CONNECTOR_SIGNALS:
				return ((InternalEList<?>)getConnectorSignals()).basicRemove(otherEnd, msgs);
			case Platform_modelPackage.PLATFORM_MODEL__OPERATION_CALLS:
				return ((InternalEList<?>)getOperationCalls()).basicRemove(otherEnd, msgs);
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
			case Platform_modelPackage.PLATFORM_MODEL__ALLOCATION_MODEL:
				if (resolve) return getAllocationModel();
				return basicGetAllocationModel();
			case Platform_modelPackage.PLATFORM_MODEL__HARDWARE_ARCHITECTURE:
				if (resolve) return getHardwareArchitecture();
				return basicGetHardwareArchitecture();
			case Platform_modelPackage.PLATFORM_MODEL__DEVICE_DRIVERS:
				return getDeviceDrivers();
			case Platform_modelPackage.PLATFORM_MODEL__IO_DRIVERS:
				return getIODrivers();
			case Platform_modelPackage.PLATFORM_MODEL__ABSTRACT_FUNCTIONS:
				return getAbstractFunctions();
			case Platform_modelPackage.PLATFORM_MODEL__FRAMEWORKS:
				return getFrameworks();
			case Platform_modelPackage.PLATFORM_MODEL__OPERATING_SYSTEMS:
				return getOperatingSystems();
			case Platform_modelPackage.PLATFORM_MODEL__COMPOSITE_SOFTWARE_FUNCTIONS:
				return getCompositeSoftwareFunctions();
			case Platform_modelPackage.PLATFORM_MODEL__ELEMENTARY_SOFTWARE_FUNCTIONS:
				return getElementarySoftwareFunctions();
			case Platform_modelPackage.PLATFORM_MODEL__IPC_EXCHANGERS:
				return getIPCExchangers();
			case Platform_modelPackage.PLATFORM_MODEL__DESIGN_DATA_TYPES:
				return getDesignDataTypes();
			case Platform_modelPackage.PLATFORM_MODEL__IMPLEMENTATION_DATA_TYPES:
				return getImplementationDataTypes();
			case Platform_modelPackage.PLATFORM_MODEL__TYPE_ASSOCIATIONS:
				return getTypeAssociations();
			case Platform_modelPackage.PLATFORM_MODEL__CONNECTOR_SIGNALS:
				return getConnectorSignals();
			case Platform_modelPackage.PLATFORM_MODEL__OPERATION_CALLS:
				return getOperationCalls();
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
			case Platform_modelPackage.PLATFORM_MODEL__ALLOCATION_MODEL:
				setAllocationModel((AllocationModel)newValue);
				return;
			case Platform_modelPackage.PLATFORM_MODEL__HARDWARE_ARCHITECTURE:
				setHardwareArchitecture((HardwareArchitecture)newValue);
				return;
			case Platform_modelPackage.PLATFORM_MODEL__DEVICE_DRIVERS:
				getDeviceDrivers().clear();
				getDeviceDrivers().addAll((Collection<? extends DeviceDriver>)newValue);
				return;
			case Platform_modelPackage.PLATFORM_MODEL__IO_DRIVERS:
				getIODrivers().clear();
				getIODrivers().addAll((Collection<? extends IODriver>)newValue);
				return;
			case Platform_modelPackage.PLATFORM_MODEL__ABSTRACT_FUNCTIONS:
				getAbstractFunctions().clear();
				getAbstractFunctions().addAll((Collection<? extends HardwareAbstractionFunction>)newValue);
				return;
			case Platform_modelPackage.PLATFORM_MODEL__FRAMEWORKS:
				getFrameworks().clear();
				getFrameworks().addAll((Collection<? extends Framework>)newValue);
				return;
			case Platform_modelPackage.PLATFORM_MODEL__OPERATING_SYSTEMS:
				getOperatingSystems().clear();
				getOperatingSystems().addAll((Collection<? extends OperatingSystem>)newValue);
				return;
			case Platform_modelPackage.PLATFORM_MODEL__COMPOSITE_SOFTWARE_FUNCTIONS:
				getCompositeSoftwareFunctions().clear();
				getCompositeSoftwareFunctions().addAll((Collection<? extends MWCompositeSoftwareFunction>)newValue);
				return;
			case Platform_modelPackage.PLATFORM_MODEL__ELEMENTARY_SOFTWARE_FUNCTIONS:
				getElementarySoftwareFunctions().clear();
				getElementarySoftwareFunctions().addAll((Collection<? extends MWElementarySoftwareFunction>)newValue);
				return;
			case Platform_modelPackage.PLATFORM_MODEL__IPC_EXCHANGERS:
				getIPCExchangers().clear();
				getIPCExchangers().addAll((Collection<? extends IPCExchanger>)newValue);
				return;
			case Platform_modelPackage.PLATFORM_MODEL__DESIGN_DATA_TYPES:
				getDesignDataTypes().clear();
				getDesignDataTypes().addAll((Collection<? extends DesignDataType>)newValue);
				return;
			case Platform_modelPackage.PLATFORM_MODEL__IMPLEMENTATION_DATA_TYPES:
				getImplementationDataTypes().clear();
				getImplementationDataTypes().addAll((Collection<? extends ImplementationDataType>)newValue);
				return;
			case Platform_modelPackage.PLATFORM_MODEL__TYPE_ASSOCIATIONS:
				getTypeAssociations().clear();
				getTypeAssociations().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case Platform_modelPackage.PLATFORM_MODEL__CONNECTOR_SIGNALS:
				getConnectorSignals().clear();
				getConnectorSignals().addAll((Collection<? extends ConnectorSignal>)newValue);
				return;
			case Platform_modelPackage.PLATFORM_MODEL__OPERATION_CALLS:
				getOperationCalls().clear();
				getOperationCalls().addAll((Collection<? extends OperationCall>)newValue);
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
			case Platform_modelPackage.PLATFORM_MODEL__ALLOCATION_MODEL:
				setAllocationModel((AllocationModel)null);
				return;
			case Platform_modelPackage.PLATFORM_MODEL__HARDWARE_ARCHITECTURE:
				setHardwareArchitecture((HardwareArchitecture)null);
				return;
			case Platform_modelPackage.PLATFORM_MODEL__DEVICE_DRIVERS:
				getDeviceDrivers().clear();
				return;
			case Platform_modelPackage.PLATFORM_MODEL__IO_DRIVERS:
				getIODrivers().clear();
				return;
			case Platform_modelPackage.PLATFORM_MODEL__ABSTRACT_FUNCTIONS:
				getAbstractFunctions().clear();
				return;
			case Platform_modelPackage.PLATFORM_MODEL__FRAMEWORKS:
				getFrameworks().clear();
				return;
			case Platform_modelPackage.PLATFORM_MODEL__OPERATING_SYSTEMS:
				getOperatingSystems().clear();
				return;
			case Platform_modelPackage.PLATFORM_MODEL__COMPOSITE_SOFTWARE_FUNCTIONS:
				getCompositeSoftwareFunctions().clear();
				return;
			case Platform_modelPackage.PLATFORM_MODEL__ELEMENTARY_SOFTWARE_FUNCTIONS:
				getElementarySoftwareFunctions().clear();
				return;
			case Platform_modelPackage.PLATFORM_MODEL__IPC_EXCHANGERS:
				getIPCExchangers().clear();
				return;
			case Platform_modelPackage.PLATFORM_MODEL__DESIGN_DATA_TYPES:
				getDesignDataTypes().clear();
				return;
			case Platform_modelPackage.PLATFORM_MODEL__IMPLEMENTATION_DATA_TYPES:
				getImplementationDataTypes().clear();
				return;
			case Platform_modelPackage.PLATFORM_MODEL__TYPE_ASSOCIATIONS:
				getTypeAssociations().clear();
				return;
			case Platform_modelPackage.PLATFORM_MODEL__CONNECTOR_SIGNALS:
				getConnectorSignals().clear();
				return;
			case Platform_modelPackage.PLATFORM_MODEL__OPERATION_CALLS:
				getOperationCalls().clear();
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
			case Platform_modelPackage.PLATFORM_MODEL__ALLOCATION_MODEL:
				return allocationModel != null;
			case Platform_modelPackage.PLATFORM_MODEL__HARDWARE_ARCHITECTURE:
				return hardwareArchitecture != null;
			case Platform_modelPackage.PLATFORM_MODEL__DEVICE_DRIVERS:
				return deviceDrivers != null && !deviceDrivers.isEmpty();
			case Platform_modelPackage.PLATFORM_MODEL__IO_DRIVERS:
				return ioDrivers != null && !ioDrivers.isEmpty();
			case Platform_modelPackage.PLATFORM_MODEL__ABSTRACT_FUNCTIONS:
				return abstractFunctions != null && !abstractFunctions.isEmpty();
			case Platform_modelPackage.PLATFORM_MODEL__FRAMEWORKS:
				return frameworks != null && !frameworks.isEmpty();
			case Platform_modelPackage.PLATFORM_MODEL__OPERATING_SYSTEMS:
				return operatingSystems != null && !operatingSystems.isEmpty();
			case Platform_modelPackage.PLATFORM_MODEL__COMPOSITE_SOFTWARE_FUNCTIONS:
				return compositeSoftwareFunctions != null && !compositeSoftwareFunctions.isEmpty();
			case Platform_modelPackage.PLATFORM_MODEL__ELEMENTARY_SOFTWARE_FUNCTIONS:
				return elementarySoftwareFunctions != null && !elementarySoftwareFunctions.isEmpty();
			case Platform_modelPackage.PLATFORM_MODEL__IPC_EXCHANGERS:
				return ipcExchangers != null && !ipcExchangers.isEmpty();
			case Platform_modelPackage.PLATFORM_MODEL__DESIGN_DATA_TYPES:
				return designDataTypes != null && !designDataTypes.isEmpty();
			case Platform_modelPackage.PLATFORM_MODEL__IMPLEMENTATION_DATA_TYPES:
				return implementationDataTypes != null && !implementationDataTypes.isEmpty();
			case Platform_modelPackage.PLATFORM_MODEL__TYPE_ASSOCIATIONS:
				return typeAssociations != null && !typeAssociations.isEmpty();
			case Platform_modelPackage.PLATFORM_MODEL__CONNECTOR_SIGNALS:
				return connectorSignals != null && !connectorSignals.isEmpty();
			case Platform_modelPackage.PLATFORM_MODEL__OPERATION_CALLS:
				return operationCalls != null && !operationCalls.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PlatformModelImpl
