/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.allocation_model.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.obeonetwork.dsl.east_adl.structure.allocation_model.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Allocation_modelFactoryImpl extends EFactoryImpl implements Allocation_modelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Allocation_modelFactory init() {
		try {
			Allocation_modelFactory theAllocation_modelFactory = (Allocation_modelFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.topcased.org/0.11.0/east_adl/structure/allocation_model"); 
			if (theAllocation_modelFactory != null) {
				return theAllocation_modelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Allocation_modelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Allocation_modelFactoryImpl() {
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
			case Allocation_modelPackage.ALLOCATION_MODEL: return createAllocationModel();
			case Allocation_modelPackage.FRAME: return createFrame();
			case Allocation_modelPackage.OS_TASK: return createOSTask();
			case Allocation_modelPackage.COMMUNICATION_BUFFER: return createCommunicationBuffer();
			case Allocation_modelPackage.SIGNAL_DEPLOYMENT: return createSignalDeployment();
			case Allocation_modelPackage.FUNCTION_DEPLOYMENT: return createFunctionDeployment();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationModel createAllocationModel() {
		AllocationModelImpl allocationModel = new AllocationModelImpl();
		return allocationModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Frame createFrame() {
		FrameImpl frame = new FrameImpl();
		return frame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSTask createOSTask() {
		OSTaskImpl osTask = new OSTaskImpl();
		return osTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationBuffer createCommunicationBuffer() {
		CommunicationBufferImpl communicationBuffer = new CommunicationBufferImpl();
		return communicationBuffer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalDeployment createSignalDeployment() {
		SignalDeploymentImpl signalDeployment = new SignalDeploymentImpl();
		return signalDeployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionDeployment createFunctionDeployment() {
		FunctionDeploymentImpl functionDeployment = new FunctionDeploymentImpl();
		return functionDeployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Allocation_modelPackage getAllocation_modelPackage() {
		return (Allocation_modelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Allocation_modelPackage getPackage() {
		return Allocation_modelPackage.eINSTANCE;
	}

} //Allocation_modelFactoryImpl
