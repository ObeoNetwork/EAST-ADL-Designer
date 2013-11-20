/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.platform_model.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.obeonetwork.dsl.east_adl.core.EASTADLArtifact;
import org.obeonetwork.dsl.east_adl.core.EASTADLEntity;
import org.obeonetwork.dsl.east_adl.core.EASTADLNamedElement;

import org.obeonetwork.dsl.east_adl.structure.common.AllocatableEntity;
import org.obeonetwork.dsl.east_adl.structure.common.FunctionPort;
import org.obeonetwork.dsl.east_adl.structure.common.OperationFunctionPort;
import org.obeonetwork.dsl.east_adl.structure.common.RealizingEntity;
import org.obeonetwork.dsl.east_adl.structure.common.SignalFunctionPort;

import org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.CompositeSoftwareFunction;
import org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction;

import org.obeonetwork.dsl.east_adl.structure.platform_model.*;

import org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity;

import org.obeonetwork.dsl.east_adl.verification_validation.ValidatedEntity;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.Platform_modelPackage
 * @generated
 */
public class Platform_modelSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Platform_modelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Platform_modelSwitch() {
		if (modelPackage == null) {
			modelPackage = Platform_modelPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Platform_modelPackage.PLATFORM_MODEL: {
				PlatformModel platformModel = (PlatformModel)theEObject;
				T result = casePlatformModel(platformModel);
				if (result == null) result = caseEASTADLArtifact(platformModel);
				if (result == null) result = caseEASTADLNamedElement(platformModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Platform_modelPackage.DEVICE_DRIVER: {
				DeviceDriver deviceDriver = (DeviceDriver)theEObject;
				T result = caseDeviceDriver(deviceDriver);
				if (result == null) result = caseEASTADLEntity(deviceDriver);
				if (result == null) result = caseValidatedEntity(deviceDriver);
				if (result == null) result = caseEASTADLNamedElement(deviceDriver);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Platform_modelPackage.IO_DRIVER: {
				IODriver ioDriver = (IODriver)theEObject;
				T result = caseIODriver(ioDriver);
				if (result == null) result = caseEASTADLEntity(ioDriver);
				if (result == null) result = caseValidatedEntity(ioDriver);
				if (result == null) result = caseEASTADLNamedElement(ioDriver);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Platform_modelPackage.HARDWARE_ABSTRACTION_FUNCTION: {
				HardwareAbstractionFunction hardwareAbstractionFunction = (HardwareAbstractionFunction)theEObject;
				T result = caseHardwareAbstractionFunction(hardwareAbstractionFunction);
				if (result == null) result = caseEASTADLEntity(hardwareAbstractionFunction);
				if (result == null) result = caseValidatedEntity(hardwareAbstractionFunction);
				if (result == null) result = caseEASTADLNamedElement(hardwareAbstractionFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Platform_modelPackage.OPERATING_SYSTEM: {
				OperatingSystem operatingSystem = (OperatingSystem)theEObject;
				T result = caseOperatingSystem(operatingSystem);
				if (result == null) result = caseEASTADLEntity(operatingSystem);
				if (result == null) result = caseEASTADLNamedElement(operatingSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Platform_modelPackage.FRAMEWORK: {
				Framework framework = (Framework)theEObject;
				T result = caseFramework(framework);
				if (result == null) result = caseEASTADLEntity(framework);
				if (result == null) result = caseEASTADLNamedElement(framework);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Platform_modelPackage.MW_COMPOSITE_SOFTWARE_FUNCTION: {
				MWCompositeSoftwareFunction mwCompositeSoftwareFunction = (MWCompositeSoftwareFunction)theEObject;
				T result = caseMWCompositeSoftwareFunction(mwCompositeSoftwareFunction);
				if (result == null) result = caseCompositeSoftwareFunction(mwCompositeSoftwareFunction);
				if (result == null) result = caseEASTADLEntity(mwCompositeSoftwareFunction);
				if (result == null) result = caseAllocatableEntity(mwCompositeSoftwareFunction);
				if (result == null) result = caseRealizingEntity(mwCompositeSoftwareFunction);
				if (result == null) result = caseVariantEntity(mwCompositeSoftwareFunction);
				if (result == null) result = caseValidatedEntity(mwCompositeSoftwareFunction);
				if (result == null) result = caseEASTADLNamedElement(mwCompositeSoftwareFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Platform_modelPackage.MW_ELEMENTARY_SOFTWARE_FUNCTION: {
				MWElementarySoftwareFunction mwElementarySoftwareFunction = (MWElementarySoftwareFunction)theEObject;
				T result = caseMWElementarySoftwareFunction(mwElementarySoftwareFunction);
				if (result == null) result = caseElementarySoftwareFunction(mwElementarySoftwareFunction);
				if (result == null) result = caseEASTADLEntity(mwElementarySoftwareFunction);
				if (result == null) result = caseRealizingEntity(mwElementarySoftwareFunction);
				if (result == null) result = caseVariantEntity(mwElementarySoftwareFunction);
				if (result == null) result = caseValidatedEntity(mwElementarySoftwareFunction);
				if (result == null) result = caseEASTADLNamedElement(mwElementarySoftwareFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Platform_modelPackage.SYSTEM_PORT: {
				SystemPort systemPort = (SystemPort)theEObject;
				T result = caseSystemPort(systemPort);
				if (result == null) result = caseOperationFunctionPort(systemPort);
				if (result == null) result = caseFunctionPort(systemPort);
				if (result == null) result = caseEASTADLEntity(systemPort);
				if (result == null) result = caseEASTADLNamedElement(systemPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Platform_modelPackage.MW_LOCAL_PORT: {
				MWLocalPort mwLocalPort = (MWLocalPort)theEObject;
				T result = caseMWLocalPort(mwLocalPort);
				if (result == null) result = caseSignalFunctionPort(mwLocalPort);
				if (result == null) result = caseFunctionPort(mwLocalPort);
				if (result == null) result = caseEASTADLEntity(mwLocalPort);
				if (result == null) result = caseEASTADLNamedElement(mwLocalPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Platform_modelPackage.MW_REMOTE_PORT: {
				MWRemotePort mwRemotePort = (MWRemotePort)theEObject;
				T result = caseMWRemotePort(mwRemotePort);
				if (result == null) result = caseSignalFunctionPort(mwRemotePort);
				if (result == null) result = caseFunctionPort(mwRemotePort);
				if (result == null) result = caseEASTADLEntity(mwRemotePort);
				if (result == null) result = caseEASTADLNamedElement(mwRemotePort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Platform_modelPackage.IPC_EXCHANGER: {
				IPCExchanger ipcExchanger = (IPCExchanger)theEObject;
				T result = caseIPCExchanger(ipcExchanger);
				if (result == null) result = caseEASTADLEntity(ipcExchanger);
				if (result == null) result = caseEASTADLNamedElement(ipcExchanger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Platform Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Platform Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlatformModel(PlatformModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Driver</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Driver</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceDriver(DeviceDriver object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IO Driver</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IO Driver</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIODriver(IODriver object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Abstraction Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Abstraction Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwareAbstractionFunction(HardwareAbstractionFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operating System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operating System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperatingSystem(OperatingSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Framework</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Framework</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFramework(Framework object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MW Composite Software Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MW Composite Software Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMWCompositeSoftwareFunction(MWCompositeSoftwareFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MW Elementary Software Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MW Elementary Software Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMWElementarySoftwareFunction(MWElementarySoftwareFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemPort(SystemPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MW Local Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MW Local Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMWLocalPort(MWLocalPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MW Remote Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MW Remote Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMWRemotePort(MWRemotePort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IPC Exchanger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IPC Exchanger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIPCExchanger(IPCExchanger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EASTADL Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EASTADL Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEASTADLNamedElement(EASTADLNamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EASTADL Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EASTADL Artifact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEASTADLArtifact(EASTADLArtifact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EASTADL Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EASTADL Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEASTADLEntity(EASTADLEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Validated Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Validated Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValidatedEntity(ValidatedEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allocatable Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allocatable Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllocatableEntity(AllocatableEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Realizing Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Realizing Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealizingEntity(RealizingEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variant Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variant Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariantEntity(VariantEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Software Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Software Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeSoftwareFunction(CompositeSoftwareFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elementary Software Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elementary Software Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementarySoftwareFunction(ElementarySoftwareFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionPort(FunctionPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Function Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Function Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationFunctionPort(OperationFunctionPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signal Function Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signal Function Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignalFunctionPort(SignalFunctionPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //Platform_modelSwitch
