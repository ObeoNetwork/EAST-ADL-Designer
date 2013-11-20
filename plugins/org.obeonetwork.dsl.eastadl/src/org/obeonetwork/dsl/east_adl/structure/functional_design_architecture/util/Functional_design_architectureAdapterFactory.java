/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.obeonetwork.dsl.east_adl.core.EASTADLArtifact;
import org.obeonetwork.dsl.east_adl.core.EASTADLEntity;
import org.obeonetwork.dsl.east_adl.core.EASTADLNamedElement;

import org.obeonetwork.dsl.east_adl.structure.common.AllocatableEntity;
import org.obeonetwork.dsl.east_adl.structure.common.RealizingEntity;

import org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.*;

import org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity;

import org.obeonetwork.dsl.east_adl.verification_validation.ValidatedEntity;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Functional_design_architecturePackage
 * @generated
 */
public class Functional_design_architectureAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Functional_design_architecturePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Functional_design_architectureAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Functional_design_architecturePackage.eINSTANCE;
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
	protected Functional_design_architectureSwitch<Adapter> modelSwitch =
		new Functional_design_architectureSwitch<Adapter>() {
			@Override
			public Adapter caseFunctionalDesignArchitecture(FunctionalDesignArchitecture object) {
				return createFunctionalDesignArchitectureAdapter();
			}
			@Override
			public Adapter caseElementarySoftwareFunction(ElementarySoftwareFunction object) {
				return createElementarySoftwareFunctionAdapter();
			}
			@Override
			public Adapter caseCompositeSoftwareFunction(CompositeSoftwareFunction object) {
				return createCompositeSoftwareFunctionAdapter();
			}
			@Override
			public Adapter caseLocalDeviceManager(LocalDeviceManager object) {
				return createLocalDeviceManagerAdapter();
			}
			@Override
			public Adapter casePrecedence(Precedence object) {
				return createPrecedenceAdapter();
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
			public Adapter caseRealizingEntity(RealizingEntity object) {
				return createRealizingEntityAdapter();
			}
			@Override
			public Adapter caseVariantEntity(VariantEntity object) {
				return createVariantEntityAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.FunctionalDesignArchitecture <em>Functional Design Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.FunctionalDesignArchitecture
	 * @generated
	 */
	public Adapter createFunctionalDesignArchitectureAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.LocalDeviceManager <em>Local Device Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.LocalDeviceManager
	 * @generated
	 */
	public Adapter createLocalDeviceManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Precedence <em>Precedence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.Precedence
	 * @generated
	 */
	public Adapter createPrecedenceAdapter() {
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

} //Functional_design_architectureAdapterFactory
