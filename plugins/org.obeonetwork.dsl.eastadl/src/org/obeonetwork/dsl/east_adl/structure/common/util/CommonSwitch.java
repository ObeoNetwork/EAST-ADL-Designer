/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.common.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.obeonetwork.dsl.east_adl.core.EASTADLEntity;
import org.obeonetwork.dsl.east_adl.core.EASTADLNamedElement;

import org.obeonetwork.dsl.east_adl.structure.common.*;

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
 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage
 * @generated
 */
public class CommonSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CommonPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonSwitch() {
		if (modelPackage == null) {
			modelPackage = CommonPackage.eINSTANCE;
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
			case CommonPackage.FUNCTION_PORT: {
				FunctionPort functionPort = (FunctionPort)theEObject;
				T result = caseFunctionPort(functionPort);
				if (result == null) result = caseEASTADLEntity(functionPort);
				if (result == null) result = caseEASTADLNamedElement(functionPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.SIGNAL_FUNCTION_PORT: {
				SignalFunctionPort signalFunctionPort = (SignalFunctionPort)theEObject;
				T result = caseSignalFunctionPort(signalFunctionPort);
				if (result == null) result = caseFunctionPort(signalFunctionPort);
				if (result == null) result = caseEASTADLEntity(signalFunctionPort);
				if (result == null) result = caseEASTADLNamedElement(signalFunctionPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.OPERATION_FUNCTION_PORT: {
				OperationFunctionPort operationFunctionPort = (OperationFunctionPort)theEObject;
				T result = caseOperationFunctionPort(operationFunctionPort);
				if (result == null) result = caseFunctionPort(operationFunctionPort);
				if (result == null) result = caseEASTADLEntity(operationFunctionPort);
				if (result == null) result = caseEASTADLNamedElement(operationFunctionPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.FUNCTION_PORT_INTERFACE: {
				FunctionPortInterface functionPortInterface = (FunctionPortInterface)theEObject;
				T result = caseFunctionPortInterface(functionPortInterface);
				if (result == null) result = caseEASTADLEntity(functionPortInterface);
				if (result == null) result = caseEASTADLNamedElement(functionPortInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.SIGNAL_FUNCTION_PORT_INTERFACE: {
				SignalFunctionPortInterface signalFunctionPortInterface = (SignalFunctionPortInterface)theEObject;
				T result = caseSignalFunctionPortInterface(signalFunctionPortInterface);
				if (result == null) result = caseFunctionPortInterface(signalFunctionPortInterface);
				if (result == null) result = caseEASTADLEntity(signalFunctionPortInterface);
				if (result == null) result = caseEASTADLNamedElement(signalFunctionPortInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.OPERATION_FUNCTION_PORT_INTERFACE: {
				OperationFunctionPortInterface operationFunctionPortInterface = (OperationFunctionPortInterface)theEObject;
				T result = caseOperationFunctionPortInterface(operationFunctionPortInterface);
				if (result == null) result = caseFunctionPortInterface(operationFunctionPortInterface);
				if (result == null) result = caseEASTADLEntity(operationFunctionPortInterface);
				if (result == null) result = caseEASTADLNamedElement(operationFunctionPortInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.CONNECTOR_SIGNAL: {
				ConnectorSignal connectorSignal = (ConnectorSignal)theEObject;
				T result = caseConnectorSignal(connectorSignal);
				if (result == null) result = caseEASTADLEntity(connectorSignal);
				if (result == null) result = caseEASTADLNamedElement(connectorSignal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.DESIGN_DATA_TYPE: {
				DesignDataType designDataType = (DesignDataType)theEObject;
				T result = caseDesignDataType(designDataType);
				if (result == null) result = caseEASTADLNamedElement(designDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.IMPLEMENTATION_DATA_TYPE: {
				ImplementationDataType implementationDataType = (ImplementationDataType)theEObject;
				T result = caseImplementationDataType(implementationDataType);
				if (result == null) result = caseEASTADLNamedElement(implementationDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = caseEASTADLEntity(parameter);
				if (result == null) result = caseEASTADLNamedElement(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.REALIZATION: {
				Realization realization = (Realization)theEObject;
				T result = caseRealization(realization);
				if (result == null) result = caseEASTADLNamedElement(realization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.REALIZED_ENTITY: {
				RealizedEntity realizedEntity = (RealizedEntity)theEObject;
				T result = caseRealizedEntity(realizedEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.OPERATION_SERVICE: {
				OperationService operationService = (OperationService)theEObject;
				T result = caseOperationService(operationService);
				if (result == null) result = caseEASTADLEntity(operationService);
				if (result == null) result = caseEASTADLNamedElement(operationService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.SERVICE_PARAMETER: {
				ServiceParameter serviceParameter = (ServiceParameter)theEObject;
				T result = caseServiceParameter(serviceParameter);
				if (result == null) result = caseEASTADLEntity(serviceParameter);
				if (result == null) result = caseEASTADLNamedElement(serviceParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.OPERATION_CALL: {
				OperationCall operationCall = (OperationCall)theEObject;
				T result = caseOperationCall(operationCall);
				if (result == null) result = caseEASTADLEntity(operationCall);
				if (result == null) result = caseEASTADLNamedElement(operationCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.TYPE_ASSOCIATION: {
				TypeAssociation typeAssociation = (TypeAssociation)theEObject;
				T result = caseTypeAssociation(typeAssociation);
				if (result == null) result = caseEASTADLNamedElement(typeAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.ALLOCATABLE_ENTITY: {
				AllocatableEntity allocatableEntity = (AllocatableEntity)theEObject;
				T result = caseAllocatableEntity(allocatableEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.ALLOCATION_CONSTRAINT: {
				AllocationConstraint allocationConstraint = (AllocationConstraint)theEObject;
				T result = caseAllocationConstraint(allocationConstraint);
				if (result == null) result = caseEASTADLNamedElement(allocationConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.REALIZING_ENTITY: {
				RealizingEntity realizingEntity = (RealizingEntity)theEObject;
				T result = caseRealizingEntity(realizingEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>Function Port Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Port Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionPortInterface(FunctionPortInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signal Function Port Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signal Function Port Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignalFunctionPortInterface(SignalFunctionPortInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Function Port Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Function Port Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationFunctionPortInterface(OperationFunctionPortInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector Signal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector Signal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectorSignal(ConnectorSignal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Design Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Design Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDesignDataType(DesignDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementation Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementation Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementationDataType(ImplementationDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Realization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Realization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealization(Realization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Realized Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Realized Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealizedEntity(RealizedEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationService(OperationService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceParameter(ServiceParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationCall(OperationCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAssociation(TypeAssociation object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Allocation Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allocation Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllocationConstraint(AllocationConstraint object) {
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

} //CommonSwitch
