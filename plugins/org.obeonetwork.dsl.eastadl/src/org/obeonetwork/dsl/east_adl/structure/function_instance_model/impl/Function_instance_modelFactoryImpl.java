/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.obeonetwork.dsl.east_adl.structure.function_instance_model.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Function_instance_modelFactoryImpl extends EFactoryImpl implements Function_instance_modelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Function_instance_modelFactory init() {
		try {
			Function_instance_modelFactory theFunction_instance_modelFactory = (Function_instance_modelFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.topcased.org/0.11.0/east_adl/structure/function_instance_model"); 
			if (theFunction_instance_modelFactory != null) {
				return theFunction_instance_modelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Function_instance_modelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function_instance_modelFactoryImpl() {
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
			case Function_instance_modelPackage.FUNCTION_INSTANCE_MODEL: return createFunctionInstanceModel();
			case Function_instance_modelPackage.FUNCTION_INSTANCE: return createFunctionInstance();
			case Function_instance_modelPackage.LOGICAL_CLUSTER: return createLogicalCluster();
			case Function_instance_modelPackage.PARAMETER_INSTANCE: return createParameterInstance();
			case Function_instance_modelPackage.SIGNAL_INSTANCE: return createSignalInstance();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionInstanceModel createFunctionInstanceModel() {
		FunctionInstanceModelImpl functionInstanceModel = new FunctionInstanceModelImpl();
		return functionInstanceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionInstance createFunctionInstance() {
		FunctionInstanceImpl functionInstance = new FunctionInstanceImpl();
		return functionInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalCluster createLogicalCluster() {
		LogicalClusterImpl logicalCluster = new LogicalClusterImpl();
		return logicalCluster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterInstance createParameterInstance() {
		ParameterInstanceImpl parameterInstance = new ParameterInstanceImpl();
		return parameterInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalInstance createSignalInstance() {
		SignalInstanceImpl signalInstance = new SignalInstanceImpl();
		return signalInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function_instance_modelPackage getFunction_instance_modelPackage() {
		return (Function_instance_modelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Function_instance_modelPackage getPackage() {
		return Function_instance_modelPackage.eINSTANCE;
	}

} //Function_instance_modelFactoryImpl
