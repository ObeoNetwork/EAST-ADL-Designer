/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.hardware_architecture.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.obeonetwork.dsl.east_adl.core.EASTADLArtifact;
import org.obeonetwork.dsl.east_adl.core.EASTADLEntity;
import org.obeonetwork.dsl.east_adl.core.EASTADLNamedElement;

import org.obeonetwork.dsl.east_adl.structure.common.RealizingEntity;

import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.*;

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
 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage
 * @generated
 */
public class Hardware_architectureSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Hardware_architecturePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hardware_architectureSwitch() {
		if (modelPackage == null) {
			modelPackage = Hardware_architecturePackage.eINSTANCE;
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
			case Hardware_architecturePackage.HARDWARE_ARCHITECTURE: {
				HardwareArchitecture hardwareArchitecture = (HardwareArchitecture)theEObject;
				T result = caseHardwareArchitecture(hardwareArchitecture);
				if (result == null) result = caseEASTADLArtifact(hardwareArchitecture);
				if (result == null) result = caseEASTADLNamedElement(hardwareArchitecture);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hardware_architecturePackage.HARDWARE_ENTITY: {
				HardwareEntity hardwareEntity = (HardwareEntity)theEObject;
				T result = caseHardwareEntity(hardwareEntity);
				if (result == null) result = caseEASTADLEntity(hardwareEntity);
				if (result == null) result = caseValidatedEntity(hardwareEntity);
				if (result == null) result = caseEASTADLNamedElement(hardwareEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hardware_architecturePackage.ECU: {
				ECU ecu = (ECU)theEObject;
				T result = caseECU(ecu);
				if (result == null) result = caseHardwareEntity(ecu);
				if (result == null) result = caseEASTADLEntity(ecu);
				if (result == null) result = caseValidatedEntity(ecu);
				if (result == null) result = caseEASTADLNamedElement(ecu);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hardware_architecturePackage.PROCESSOR: {
				Processor processor = (Processor)theEObject;
				T result = caseProcessor(processor);
				if (result == null) result = caseHardwareEntity(processor);
				if (result == null) result = caseEASTADLEntity(processor);
				if (result == null) result = caseValidatedEntity(processor);
				if (result == null) result = caseEASTADLNamedElement(processor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hardware_architecturePackage.MEMORY: {
				Memory memory = (Memory)theEObject;
				T result = caseMemory(memory);
				if (result == null) result = caseHardwareEntity(memory);
				if (result == null) result = caseEASTADLEntity(memory);
				if (result == null) result = caseValidatedEntity(memory);
				if (result == null) result = caseEASTADLNamedElement(memory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hardware_architecturePackage.PERIPHERAL: {
				Peripheral peripheral = (Peripheral)theEObject;
				T result = casePeripheral(peripheral);
				if (result == null) result = caseHardwareEntity(peripheral);
				if (result == null) result = caseEASTADLEntity(peripheral);
				if (result == null) result = caseValidatedEntity(peripheral);
				if (result == null) result = caseEASTADLNamedElement(peripheral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hardware_architecturePackage.ELECTRICAL_SIGNAL: {
				ElectricalSignal electricalSignal = (ElectricalSignal)theEObject;
				T result = caseElectricalSignal(electricalSignal);
				if (result == null) result = caseEASTADLEntity(electricalSignal);
				if (result == null) result = caseEASTADLNamedElement(electricalSignal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hardware_architecturePackage.DIGITAL_SIGNAL: {
				DigitalSignal digitalSignal = (DigitalSignal)theEObject;
				T result = caseDigitalSignal(digitalSignal);
				if (result == null) result = caseElectricalSignal(digitalSignal);
				if (result == null) result = caseEASTADLEntity(digitalSignal);
				if (result == null) result = caseEASTADLNamedElement(digitalSignal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hardware_architecturePackage.ANALOG_SIGNAL: {
				AnalogSignal analogSignal = (AnalogSignal)theEObject;
				T result = caseAnalogSignal(analogSignal);
				if (result == null) result = caseElectricalSignal(analogSignal);
				if (result == null) result = caseEASTADLEntity(analogSignal);
				if (result == null) result = caseEASTADLNamedElement(analogSignal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hardware_architecturePackage.PWM_SIGNAL: {
				PWMSignal pwmSignal = (PWMSignal)theEObject;
				T result = casePWMSignal(pwmSignal);
				if (result == null) result = caseElectricalSignal(pwmSignal);
				if (result == null) result = caseEASTADLEntity(pwmSignal);
				if (result == null) result = caseEASTADLNamedElement(pwmSignal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hardware_architecturePackage.CHANNEL: {
				Channel channel = (Channel)theEObject;
				T result = caseChannel(channel);
				if (result == null) result = caseHardwareEntity(channel);
				if (result == null) result = caseEASTADLEntity(channel);
				if (result == null) result = caseValidatedEntity(channel);
				if (result == null) result = caseEASTADLNamedElement(channel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hardware_architecturePackage.WIRE: {
				Wire wire = (Wire)theEObject;
				T result = caseWire(wire);
				if (result == null) result = caseEASTADLEntity(wire);
				if (result == null) result = caseEASTADLNamedElement(wire);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hardware_architecturePackage.PIN: {
				Pin pin = (Pin)theEObject;
				T result = casePin(pin);
				if (result == null) result = caseEASTADLEntity(pin);
				if (result == null) result = caseEASTADLNamedElement(pin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hardware_architecturePackage.SENSOR: {
				Sensor sensor = (Sensor)theEObject;
				T result = caseSensor(sensor);
				if (result == null) result = caseHardwareEntity(sensor);
				if (result == null) result = caseRealizingEntity(sensor);
				if (result == null) result = caseEASTADLEntity(sensor);
				if (result == null) result = caseValidatedEntity(sensor);
				if (result == null) result = caseEASTADLNamedElement(sensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hardware_architecturePackage.ACTUATOR: {
				Actuator actuator = (Actuator)theEObject;
				T result = caseActuator(actuator);
				if (result == null) result = caseHardwareEntity(actuator);
				if (result == null) result = caseRealizingEntity(actuator);
				if (result == null) result = caseEASTADLEntity(actuator);
				if (result == null) result = caseValidatedEntity(actuator);
				if (result == null) result = caseEASTADLNamedElement(actuator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hardware_architecturePackage.ICU_SIGNAL: {
				ICUSignal icuSignal = (ICUSignal)theEObject;
				T result = caseICUSignal(icuSignal);
				if (result == null) result = casePWMSignal(icuSignal);
				if (result == null) result = caseElectricalSignal(icuSignal);
				if (result == null) result = caseEASTADLEntity(icuSignal);
				if (result == null) result = caseEASTADLNamedElement(icuSignal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Architecture</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Architecture</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwareArchitecture(HardwareArchitecture object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwareEntity(HardwareEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ECU</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ECU</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseECU(ECU object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Processor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Processor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessor(Processor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Memory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Memory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemory(Memory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Peripheral</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Peripheral</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePeripheral(Peripheral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Electrical Signal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Electrical Signal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElectricalSignal(ElectricalSignal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Digital Signal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Digital Signal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDigitalSignal(DigitalSignal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Analog Signal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Analog Signal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnalogSignal(AnalogSignal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PWM Signal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PWM Signal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePWMSignal(PWMSignal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Channel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Channel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChannel(Channel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWire(Wire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePin(Pin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensor(Sensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actuator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actuator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActuator(Actuator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ICU Signal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ICU Signal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseICUSignal(ICUSignal object) {
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

} //Hardware_architectureSwitch
