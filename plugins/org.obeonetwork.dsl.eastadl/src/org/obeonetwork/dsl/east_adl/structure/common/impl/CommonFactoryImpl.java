/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.common.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.obeonetwork.dsl.east_adl.structure.common.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommonFactoryImpl extends EFactoryImpl implements CommonFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CommonFactory init() {
		try {
			CommonFactory theCommonFactory = (CommonFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.topcased.org/0.11.0/east_adl/structure/common"); 
			if (theCommonFactory != null) {
				return theCommonFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CommonFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonFactoryImpl() {
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
			case CommonPackage.SIGNAL_FUNCTION_PORT: return createSignalFunctionPort();
			case CommonPackage.OPERATION_FUNCTION_PORT: return createOperationFunctionPort();
			case CommonPackage.SIGNAL_FUNCTION_PORT_INTERFACE: return createSignalFunctionPortInterface();
			case CommonPackage.OPERATION_FUNCTION_PORT_INTERFACE: return createOperationFunctionPortInterface();
			case CommonPackage.CONNECTOR_SIGNAL: return createConnectorSignal();
			case CommonPackage.DESIGN_DATA_TYPE: return createDesignDataType();
			case CommonPackage.IMPLEMENTATION_DATA_TYPE: return createImplementationDataType();
			case CommonPackage.PARAMETER: return createParameter();
			case CommonPackage.REALIZATION: return createRealization();
			case CommonPackage.OPERATION_SERVICE: return createOperationService();
			case CommonPackage.SERVICE_PARAMETER: return createServiceParameter();
			case CommonPackage.OPERATION_CALL: return createOperationCall();
			case CommonPackage.TYPE_ASSOCIATION: return createTypeAssociation();
			case CommonPackage.ALLOCATION_CONSTRAINT: return createAllocationConstraint();
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
			case CommonPackage.TRIGGER_KIND:
				return createTriggerKindFromString(eDataType, initialValue);
			case CommonPackage.DESIGN_DATA_TYPE_KIND:
				return createDesignDataTypeKindFromString(eDataType, initialValue);
			case CommonPackage.IMPLEMENTATION_DATA_TYPE_KIND:
				return createImplementationDataTypeKindFromString(eDataType, initialValue);
			case CommonPackage.DIRECTION_KIND:
				return createDirectionKindFromString(eDataType, initialValue);
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
			case CommonPackage.TRIGGER_KIND:
				return convertTriggerKindToString(eDataType, instanceValue);
			case CommonPackage.DESIGN_DATA_TYPE_KIND:
				return convertDesignDataTypeKindToString(eDataType, instanceValue);
			case CommonPackage.IMPLEMENTATION_DATA_TYPE_KIND:
				return convertImplementationDataTypeKindToString(eDataType, instanceValue);
			case CommonPackage.DIRECTION_KIND:
				return convertDirectionKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalFunctionPort createSignalFunctionPort() {
		SignalFunctionPortImpl signalFunctionPort = new SignalFunctionPortImpl();
		return signalFunctionPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationFunctionPort createOperationFunctionPort() {
		OperationFunctionPortImpl operationFunctionPort = new OperationFunctionPortImpl();
		return operationFunctionPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalFunctionPortInterface createSignalFunctionPortInterface() {
		SignalFunctionPortInterfaceImpl signalFunctionPortInterface = new SignalFunctionPortInterfaceImpl();
		return signalFunctionPortInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationFunctionPortInterface createOperationFunctionPortInterface() {
		OperationFunctionPortInterfaceImpl operationFunctionPortInterface = new OperationFunctionPortInterfaceImpl();
		return operationFunctionPortInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorSignal createConnectorSignal() {
		ConnectorSignalImpl connectorSignal = new ConnectorSignalImpl();
		return connectorSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignDataType createDesignDataType() {
		DesignDataTypeImpl designDataType = new DesignDataTypeImpl();
		return designDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationDataType createImplementationDataType() {
		ImplementationDataTypeImpl implementationDataType = new ImplementationDataTypeImpl();
		return implementationDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Realization createRealization() {
		RealizationImpl realization = new RealizationImpl();
		return realization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationService createOperationService() {
		OperationServiceImpl operationService = new OperationServiceImpl();
		return operationService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceParameter createServiceParameter() {
		ServiceParameterImpl serviceParameter = new ServiceParameterImpl();
		return serviceParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationCall createOperationCall() {
		OperationCallImpl operationCall = new OperationCallImpl();
		return operationCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation createTypeAssociation() {
		TypeAssociationImpl typeAssociation = new TypeAssociationImpl();
		return typeAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationConstraint createAllocationConstraint() {
		AllocationConstraintImpl allocationConstraint = new AllocationConstraintImpl();
		return allocationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerKind createTriggerKindFromString(EDataType eDataType, String initialValue) {
		TriggerKind result = TriggerKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTriggerKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignDataTypeKind createDesignDataTypeKindFromString(EDataType eDataType, String initialValue) {
		DesignDataTypeKind result = DesignDataTypeKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDesignDataTypeKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationDataTypeKind createImplementationDataTypeKindFromString(EDataType eDataType, String initialValue) {
		ImplementationDataTypeKind result = ImplementationDataTypeKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImplementationDataTypeKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectionKind createDirectionKindFromString(EDataType eDataType, String initialValue) {
		DirectionKind result = DirectionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirectionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonPackage getCommonPackage() {
		return (CommonPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CommonPackage getPackage() {
		return CommonPackage.eINSTANCE;
	}

} //CommonFactoryImpl
