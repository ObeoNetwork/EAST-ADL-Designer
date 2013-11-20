/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Functional_design_architectureFactoryImpl extends EFactoryImpl implements Functional_design_architectureFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Functional_design_architectureFactory init() {
		try {
			Functional_design_architectureFactory theFunctional_design_architectureFactory = (Functional_design_architectureFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.topcased.org/0.11.0/east_adl/structure/functional_design_architecture"); 
			if (theFunctional_design_architectureFactory != null) {
				return theFunctional_design_architectureFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Functional_design_architectureFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Functional_design_architectureFactoryImpl() {
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
			case Functional_design_architecturePackage.FUNCTIONAL_DESIGN_ARCHITECTURE: return createFunctionalDesignArchitecture();
			case Functional_design_architecturePackage.ELEMENTARY_SOFTWARE_FUNCTION: return createElementarySoftwareFunction();
			case Functional_design_architecturePackage.COMPOSITE_SOFTWARE_FUNCTION: return createCompositeSoftwareFunction();
			case Functional_design_architecturePackage.LOCAL_DEVICE_MANAGER: return createLocalDeviceManager();
			case Functional_design_architecturePackage.PRECEDENCE: return createPrecedence();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalDesignArchitecture createFunctionalDesignArchitecture() {
		FunctionalDesignArchitectureImpl functionalDesignArchitecture = new FunctionalDesignArchitectureImpl();
		return functionalDesignArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementarySoftwareFunction createElementarySoftwareFunction() {
		ElementarySoftwareFunctionImpl elementarySoftwareFunction = new ElementarySoftwareFunctionImpl();
		return elementarySoftwareFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeSoftwareFunction createCompositeSoftwareFunction() {
		CompositeSoftwareFunctionImpl compositeSoftwareFunction = new CompositeSoftwareFunctionImpl();
		return compositeSoftwareFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalDeviceManager createLocalDeviceManager() {
		LocalDeviceManagerImpl localDeviceManager = new LocalDeviceManagerImpl();
		return localDeviceManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Precedence createPrecedence() {
		PrecedenceImpl precedence = new PrecedenceImpl();
		return precedence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Functional_design_architecturePackage getFunctional_design_architecturePackage() {
		return (Functional_design_architecturePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Functional_design_architecturePackage getPackage() {
		return Functional_design_architecturePackage.eINSTANCE;
	}

} //Functional_design_architectureFactoryImpl
