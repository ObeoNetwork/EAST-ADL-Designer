/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.function_instance_model.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.obeonetwork.dsl.east_adl.core.EASTADLArtifact;
import org.obeonetwork.dsl.east_adl.core.EASTADLEntity;
import org.obeonetwork.dsl.east_adl.core.EASTADLNamedElement;

import org.obeonetwork.dsl.east_adl.structure.function_instance_model.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.Function_instance_modelPackage
 * @generated
 */
public class Function_instance_modelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Function_instance_modelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function_instance_modelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Function_instance_modelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Function_instance_modelSwitch<Adapter> modelSwitch =
		new Function_instance_modelSwitch<Adapter>() {
			@Override
			public Adapter caseFunctionInstanceModel(FunctionInstanceModel object) {
				return createFunctionInstanceModelAdapter();
			}
			@Override
			public Adapter caseFunctionInstance(FunctionInstance object) {
				return createFunctionInstanceAdapter();
			}
			@Override
			public Adapter caseLogicalCluster(LogicalCluster object) {
				return createLogicalClusterAdapter();
			}
			@Override
			public Adapter caseParameterInstance(ParameterInstance object) {
				return createParameterInstanceAdapter();
			}
			@Override
			public Adapter caseSignalInstance(SignalInstance object) {
				return createSignalInstanceAdapter();
			}
			@Override
			public Adapter caseSignalInstanceTarget(SignalInstanceTarget object) {
				return createSignalInstanceTargetAdapter();
			}
			@Override
			public Adapter caseEASTADLNamedElement(EASTADLNamedElement object) {
				return createEASTADLNamedElementAdapter();
			}
			@Override
			public Adapter caseEASTADLArtifact(EASTADLArtifact object) {
				return createEASTADLArtifactAdapter();
			}
			@Override
			public Adapter caseEASTADLEntity(EASTADLEntity object) {
				return createEASTADLEntityAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstanceModel <em>Function Instance Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstanceModel
	 * @generated
	 */
	public Adapter createFunctionInstanceModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstance <em>Function Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstance
	 * @generated
	 */
	public Adapter createFunctionInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.LogicalCluster <em>Logical Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.LogicalCluster
	 * @generated
	 */
	public Adapter createLogicalClusterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.ParameterInstance <em>Parameter Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.ParameterInstance
	 * @generated
	 */
	public Adapter createParameterInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstance <em>Signal Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstance
	 * @generated
	 */
	public Adapter createSignalInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstanceTarget <em>Signal Instance Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.east_adl.structure.function_instance_model.SignalInstanceTarget
	 * @generated
	 */
	public Adapter createSignalInstanceTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.east_adl.core.EASTADLNamedElement <em>EASTADL Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.east_adl.core.EASTADLNamedElement
	 * @generated
	 */
	public Adapter createEASTADLNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.east_adl.core.EASTADLArtifact <em>EASTADL Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.east_adl.core.EASTADLArtifact
	 * @generated
	 */
	public Adapter createEASTADLArtifactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.east_adl.core.EASTADLEntity <em>EASTADL Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.east_adl.core.EASTADLEntity
	 * @generated
	 */
	public Adapter createEASTADLEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Function_instance_modelAdapterFactory
