/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Functional_analysis_architectureFactoryImpl extends EFactoryImpl implements Functional_analysis_architectureFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Functional_analysis_architectureFactory init() {
		try {
			Functional_analysis_architectureFactory theFunctional_analysis_architectureFactory = (Functional_analysis_architectureFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.topcased.org/0.11.0/east_adl/structure/functional_analysis_architecture"); 
			if (theFunctional_analysis_architectureFactory != null) {
				return theFunctional_analysis_architectureFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Functional_analysis_architectureFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Functional_analysis_architectureFactoryImpl() {
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
			case Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE: return createFunctionalAnalysisArchitecture();
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION: return createAnalysisFunction();
			case Functional_analysis_architecturePackage.FUNCTIONAL_DEVICE: return createFunctionalDevice();
			case Functional_analysis_architecturePackage.ENVIRONMENT_FUNCTION: return createEnvironmentFunction();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalAnalysisArchitecture createFunctionalAnalysisArchitecture() {
		FunctionalAnalysisArchitectureImpl functionalAnalysisArchitecture = new FunctionalAnalysisArchitectureImpl();
		return functionalAnalysisArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisFunction createAnalysisFunction() {
		AnalysisFunctionImpl analysisFunction = new AnalysisFunctionImpl();
		return analysisFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalDevice createFunctionalDevice() {
		FunctionalDeviceImpl functionalDevice = new FunctionalDeviceImpl();
		return functionalDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvironmentFunction createEnvironmentFunction() {
		EnvironmentFunctionImpl environmentFunction = new EnvironmentFunctionImpl();
		return environmentFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Functional_analysis_architecturePackage getFunctional_analysis_architecturePackage() {
		return (Functional_analysis_architecturePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Functional_analysis_architecturePackage getPackage() {
		return Functional_analysis_architecturePackage.eINSTANCE;
	}

} //Functional_analysis_architectureFactoryImpl
