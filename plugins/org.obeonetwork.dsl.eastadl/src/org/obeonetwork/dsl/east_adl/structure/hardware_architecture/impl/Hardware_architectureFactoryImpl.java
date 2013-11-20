/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.hardware_architecture.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Hardware_architectureFactoryImpl extends EFactoryImpl implements Hardware_architectureFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Hardware_architectureFactory init() {
		try {
			Hardware_architectureFactory theHardware_architectureFactory = (Hardware_architectureFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.topcased.org/0.11.0/east_adl/structure/hardware_architecture"); 
			if (theHardware_architectureFactory != null) {
				return theHardware_architectureFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Hardware_architectureFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hardware_architectureFactoryImpl() {
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
			case Hardware_architecturePackage.HARDWARE_ARCHITECTURE: return createHardwareArchitecture();
			case Hardware_architecturePackage.ECU: return createECU();
			case Hardware_architecturePackage.PROCESSOR: return createProcessor();
			case Hardware_architecturePackage.MEMORY: return createMemory();
			case Hardware_architecturePackage.PERIPHERAL: return createPeripheral();
			case Hardware_architecturePackage.ELECTRICAL_SIGNAL: return createElectricalSignal();
			case Hardware_architecturePackage.DIGITAL_SIGNAL: return createDigitalSignal();
			case Hardware_architecturePackage.ANALOG_SIGNAL: return createAnalogSignal();
			case Hardware_architecturePackage.PWM_SIGNAL: return createPWMSignal();
			case Hardware_architecturePackage.CHANNEL: return createChannel();
			case Hardware_architecturePackage.WIRE: return createWire();
			case Hardware_architecturePackage.PIN: return createPin();
			case Hardware_architecturePackage.SENSOR: return createSensor();
			case Hardware_architecturePackage.ACTUATOR: return createActuator();
			case Hardware_architecturePackage.ICU_SIGNAL: return createICUSignal();
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
			case Hardware_architecturePackage.MEMORY_KIND:
				return createMemoryKindFromString(eDataType, initialValue);
			case Hardware_architecturePackage.CHANNEL_KIND:
				return createChannelKindFromString(eDataType, initialValue);
			case Hardware_architecturePackage.ICU_MEASUREMENT_KIND:
				return createICUMeasurementKindFromString(eDataType, initialValue);
			case Hardware_architecturePackage.EDGE_KIND:
				return createEdgeKindFromString(eDataType, initialValue);
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
			case Hardware_architecturePackage.MEMORY_KIND:
				return convertMemoryKindToString(eDataType, instanceValue);
			case Hardware_architecturePackage.CHANNEL_KIND:
				return convertChannelKindToString(eDataType, instanceValue);
			case Hardware_architecturePackage.ICU_MEASUREMENT_KIND:
				return convertICUMeasurementKindToString(eDataType, instanceValue);
			case Hardware_architecturePackage.EDGE_KIND:
				return convertEdgeKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareArchitecture createHardwareArchitecture() {
		HardwareArchitectureImpl hardwareArchitecture = new HardwareArchitectureImpl();
		return hardwareArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECU createECU() {
		ECUImpl ecu = new ECUImpl();
		return ecu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Processor createProcessor() {
		ProcessorImpl processor = new ProcessorImpl();
		return processor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Memory createMemory() {
		MemoryImpl memory = new MemoryImpl();
		return memory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Peripheral createPeripheral() {
		PeripheralImpl peripheral = new PeripheralImpl();
		return peripheral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectricalSignal createElectricalSignal() {
		ElectricalSignalImpl electricalSignal = new ElectricalSignalImpl();
		return electricalSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DigitalSignal createDigitalSignal() {
		DigitalSignalImpl digitalSignal = new DigitalSignalImpl();
		return digitalSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogSignal createAnalogSignal() {
		AnalogSignalImpl analogSignal = new AnalogSignalImpl();
		return analogSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PWMSignal createPWMSignal() {
		PWMSignalImpl pwmSignal = new PWMSignalImpl();
		return pwmSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Channel createChannel() {
		ChannelImpl channel = new ChannelImpl();
		return channel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wire createWire() {
		WireImpl wire = new WireImpl();
		return wire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pin createPin() {
		PinImpl pin = new PinImpl();
		return pin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sensor createSensor() {
		SensorImpl sensor = new SensorImpl();
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actuator createActuator() {
		ActuatorImpl actuator = new ActuatorImpl();
		return actuator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ICUSignal createICUSignal() {
		ICUSignalImpl icuSignal = new ICUSignalImpl();
		return icuSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryKind createMemoryKindFromString(EDataType eDataType, String initialValue) {
		MemoryKind result = MemoryKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMemoryKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChannelKind createChannelKindFromString(EDataType eDataType, String initialValue) {
		ChannelKind result = ChannelKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChannelKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ICUMeasurementKind createICUMeasurementKindFromString(EDataType eDataType, String initialValue) {
		ICUMeasurementKind result = ICUMeasurementKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertICUMeasurementKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeKind createEdgeKindFromString(EDataType eDataType, String initialValue) {
		EdgeKind result = EdgeKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEdgeKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hardware_architecturePackage getHardware_architecturePackage() {
		return (Hardware_architecturePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Hardware_architecturePackage getPackage() {
		return Hardware_architecturePackage.eINSTANCE;
	}

} //Hardware_architectureFactoryImpl
