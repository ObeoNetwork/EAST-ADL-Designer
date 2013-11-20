/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.platform_model.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.obeonetwork.dsl.east_adl.structure.platform_model.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Platform_modelFactoryImpl extends EFactoryImpl implements Platform_modelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Platform_modelFactory init() {
		try {
			Platform_modelFactory thePlatform_modelFactory = (Platform_modelFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.topcased.org/0.11.0/east_adl/structure/platform_model"); 
			if (thePlatform_modelFactory != null) {
				return thePlatform_modelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Platform_modelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Platform_modelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Platform_modelPackage.PLATFORM_MODEL: return createPlatformModel();
			case Platform_modelPackage.DEVICE_DRIVER: return createDeviceDriver();
			case Platform_modelPackage.IO_DRIVER: return createIODriver();
			case Platform_modelPackage.HARDWARE_ABSTRACTION_FUNCTION: return createHardwareAbstractionFunction();
			case Platform_modelPackage.OPERATING_SYSTEM: return createOperatingSystem();
			case Platform_modelPackage.FRAMEWORK: return createFramework();
			case Platform_modelPackage.MW_COMPOSITE_SOFTWARE_FUNCTION: return createMWCompositeSoftwareFunction();
			case Platform_modelPackage.MW_ELEMENTARY_SOFTWARE_FUNCTION: return createMWElementarySoftwareFunction();
			case Platform_modelPackage.SYSTEM_PORT: return createSystemPort();
			case Platform_modelPackage.MW_LOCAL_PORT: return createMWLocalPort();
			case Platform_modelPackage.MW_REMOTE_PORT: return createMWRemotePort();
			case Platform_modelPackage.IPC_EXCHANGER: return createIPCExchanger();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Platform_modelPackage.EXECUTION_MODEL_KIND:
				return createExecutionModelKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Platform_modelPackage.EXECUTION_MODEL_KIND:
				return convertExecutionModelKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformModel createPlatformModel() {
		PlatformModelImpl platformModel = new PlatformModelImpl();
		return platformModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceDriver createDeviceDriver() {
		DeviceDriverImpl deviceDriver = new DeviceDriverImpl();
		return deviceDriver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IODriver createIODriver() {
		IODriverImpl ioDriver = new IODriverImpl();
		return ioDriver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareAbstractionFunction createHardwareAbstractionFunction() {
		HardwareAbstractionFunctionImpl hardwareAbstractionFunction = new HardwareAbstractionFunctionImpl();
		return hardwareAbstractionFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatingSystem createOperatingSystem() {
		OperatingSystemImpl operatingSystem = new OperatingSystemImpl();
		return operatingSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Framework createFramework() {
		FrameworkImpl framework = new FrameworkImpl();
		return framework;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MWCompositeSoftwareFunction createMWCompositeSoftwareFunction() {
		MWCompositeSoftwareFunctionImpl mwCompositeSoftwareFunction = new MWCompositeSoftwareFunctionImpl();
		return mwCompositeSoftwareFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MWElementarySoftwareFunction createMWElementarySoftwareFunction() {
		MWElementarySoftwareFunctionImpl mwElementarySoftwareFunction = new MWElementarySoftwareFunctionImpl();
		return mwElementarySoftwareFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemPort createSystemPort() {
		SystemPortImpl systemPort = new SystemPortImpl();
		return systemPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MWLocalPort createMWLocalPort() {
		MWLocalPortImpl mwLocalPort = new MWLocalPortImpl();
		return mwLocalPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MWRemotePort createMWRemotePort() {
		MWRemotePortImpl mwRemotePort = new MWRemotePortImpl();
		return mwRemotePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPCExchanger createIPCExchanger() {
		IPCExchangerImpl ipcExchanger = new IPCExchangerImpl();
		return ipcExchanger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionModelKind createExecutionModelKindFromString(EDataType eDataType, String initialValue) {
		ExecutionModelKind result = ExecutionModelKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExecutionModelKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Platform_modelPackage getPlatform_modelPackage() {
		return (Platform_modelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Platform_modelPackage getPackage() {
		return Platform_modelPackage.eINSTANCE;
	}

} //Platform_modelFactoryImpl
