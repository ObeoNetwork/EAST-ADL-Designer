/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.platform_model.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.Platform_modelPackage
 * @generated
 */
public class Platform_modelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Platform_modelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Platform_modelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Platform_modelPackage.eINSTANCE;
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
	protected Platform_modelSwitch<Adapter> modelSwitch =
		new Platform_modelSwitch<Adapter>() {
			@Override
			public Adapter casePlatformModel(PlatformModel object) {
				return createPlatformModelAdapter();
			}
			@Override
			public Adapter caseDeviceDriver(DeviceDriver object) {
				return createDeviceDriverAdapter();
			}
			@Override
			public Adapter caseIODriver(IODriver object) {
				return createIODriverAdapter();
			}
			@Override
			public Adapter caseHardwareAbstractionFunction(HardwareAbstractionFunction object) {
				return createHardwareAbstractionFunctionAdapter();
			}
			@Override
			public Adapter caseOperatingSystem(OperatingSystem object) {
				return createOperatingSystemAdapter();
			}
			@Override
			public Adapter caseFramework(Framework object) {
				return createFrameworkAdapter();
			}
			@Override
			public Adapter caseMWCompositeSoftwareFunction(MWCompositeSoftwareFunction object) {
				return createMWCompositeSoftwareFunctionAdapter();
			}
			@Override
			public Adapter caseMWElementarySoftwareFunction(MWElementarySoftwareFunction object) {
				return createMWElementarySoftwareFunctionAdapter();
			}
			@Override
			public Adapter caseSystemPort(SystemPort object) {
				return createSystemPortAdapter();
			}
			@Override
			public Adapter caseMWLocalPort(MWLocalPort object) {
				return createMWLocalPortAdapter();
			}
			@Override
			public Adapter caseMWRemotePort(MWRemotePort object) {
				return createMWRemotePortAdapter();
			}
			@Override
			public Adapter caseIPCExchanger(IPCExchanger object) {
				return createIPCExchangerAdapter();
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
			public Adapter caseValidatedEntity(ValidatedEntity object) {
				return createValidatedEntityAdapter();
			}
			@Override
			public Adapter caseAllocatableEntity(AllocatableEntity object) {
				return createAllocatableEntityAdapter();
			}
			@Override
			public Adapter caseRealizingEntity(RealizingEntity object) {
				return createRealizingEntityAdapter();
			}
			@Override
			public Adapter caseVariantEntity(VariantEntity object) {
				return createVariantEntityAdapter();
			}
			@Override
			public Adapter caseCompositeSoftwareFunction(CompositeSoftwareFunction object) {
				return createCompositeSoftwareFunctionAdapter();
			}
			@Override
			public Adapter caseElementarySoftwareFunction(ElementarySoftwareFunction object) {
				return createElementarySoftwareFunctionAdapter();
			}
			@Override
			public Adapter caseFunctionPort(FunctionPort object) {
				return createFunctionPortAdapter();
			}
			@Override
			public Adapter caseOperationFunctionPort(OperationFunctionPort object) {
				return createOperationFunctionPortAdapter();
			}
			@Override
			public Adapter caseSignalFunctionPort(SignalFunctionPort object) {
				return createSignalFunctionPortAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel <em>Platform Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel
	 * @generated
	 */
	public Adapter createPlatformModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.DeviceDriver <em>Device Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.DeviceDriver
	 * @generated
	 */
	public Adapter createDeviceDriverAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.IODriver <em>IO Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.IODriver
	 * @generated
	 */
	public Adapter createIODriverAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.HardwareAbstractionFunction <em>Hardware Abstraction Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.HardwareAbstractionFunction
	 * @generated
	 */
	public Adapter createHardwareAbstractionFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.OperatingSystem <em>Operating System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.OperatingSystem
	 * @generated
	 */
	public Adapter createOperatingSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.Framework <em>Framework</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.Framework
	 * @generated
	 */
	public Adapter createFrameworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.MWCompositeSoftwareFunction <em>MW Composite Software Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.MWCompositeSoftwareFunction
	 * @generated
	 */
	public Adapter createMWCompositeSoftwareFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.MWElementarySoftwareFunction <em>MW Elementary Software Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.MWElementarySoftwareFunction
	 * @generated
	 */
	public Adapter createMWElementarySoftwareFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.SystemPort <em>System Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.SystemPort
	 * @generated
	 */
	public Adapter createSystemPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.MWLocalPort <em>MW Local Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.MWLocalPort
	 * @generated
	 */
	public Adapter createMWLocalPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.MWRemotePort <em>MW Remote Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.MWRemotePort
	 * @generated
	 */
	public Adapter createMWRemotePortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.IPCExchanger <em>IPC Exchanger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.IPCExchanger
	 * @generated
	 */
	public Adapter createIPCExchangerAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.east_adl.verification_validation.ValidatedEntity <em>Validated Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.east_adl.verification_validation.ValidatedEntity
	 * @generated
	 */
	public Adapter createValidatedEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.east_adl.structure.common.AllocatableEntity <em>Allocatable Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.AllocatableEntity
	 * @generated
	 */
	public Adapter createAllocatableEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.east_adl.structure.common.RealizingEntity <em>Realizing Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.RealizingEntity
	 * @generated
	 */
	public Adapter createRealizingEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity <em>Variant Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity
	 * @generated
	 */
	public Adapter createVariantEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.CompositeSoftwareFunction <em>Composite Software Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.CompositeSoftwareFunction
	 * @generated
	 */
	public Adapter createCompositeSoftwareFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction <em>Elementary Software Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.ElementarySoftwareFunction
	 * @generated
	 */
	public Adapter createElementarySoftwareFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.east_adl.structure.common.FunctionPort <em>Function Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.FunctionPort
	 * @generated
	 */
	public Adapter createFunctionPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.east_adl.structure.common.OperationFunctionPort <em>Operation Function Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.OperationFunctionPort
	 * @generated
	 */
	public Adapter createOperationFunctionPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.east_adl.structure.common.SignalFunctionPort <em>Signal Function Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.SignalFunctionPort
	 * @generated
	 */
	public Adapter createSignalFunctionPortAdapter() {
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

} //Platform_modelAdapterFactory
