/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.obeonetwork.dsl.east_adl.core.EASTADLArtifact;
import org.obeonetwork.dsl.east_adl.core.EASTADLEntity;
import org.obeonetwork.dsl.east_adl.core.EASTADLNamedElement;

import org.obeonetwork.dsl.east_adl.structure.common.AllocatableEntity;
import org.obeonetwork.dsl.east_adl.structure.common.RealizedEntity;
import org.obeonetwork.dsl.east_adl.structure.common.RealizingEntity;

import org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.*;

import org.obeonetwork.dsl.east_adl.variant_handling.VariantEntity;

import org.obeonetwork.dsl.east_adl.verification_validation.ValidatedEntity;

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
 * @see org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.Functional_analysis_architecturePackage
 * @generated
 */
public class Functional_analysis_architectureSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Functional_analysis_architecturePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Functional_analysis_architectureSwitch() {
		if (modelPackage == null) {
			modelPackage = Functional_analysis_architecturePackage.eINSTANCE;
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
			case Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE: {
				FunctionalAnalysisArchitecture functionalAnalysisArchitecture = (FunctionalAnalysisArchitecture)theEObject;
				T result = caseFunctionalAnalysisArchitecture(functionalAnalysisArchitecture);
				if (result == null) result = caseEASTADLArtifact(functionalAnalysisArchitecture);
				if (result == null) result = caseEASTADLNamedElement(functionalAnalysisArchitecture);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Functional_analysis_architecturePackage.ANALYSIS_FUNCTION: {
				AnalysisFunction analysisFunction = (AnalysisFunction)theEObject;
				T result = caseAnalysisFunction(analysisFunction);
				if (result == null) result = caseEASTADLEntity(analysisFunction);
				if (result == null) result = caseVariantEntity(analysisFunction);
				if (result == null) result = caseRealizedEntity(analysisFunction);
				if (result == null) result = caseRealizingEntity(analysisFunction);
				if (result == null) result = caseAllocatableEntity(analysisFunction);
				if (result == null) result = caseValidatedEntity(analysisFunction);
				if (result == null) result = caseEASTADLNamedElement(analysisFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Functional_analysis_architecturePackage.FUNCTIONAL_DEVICE: {
				FunctionalDevice functionalDevice = (FunctionalDevice)theEObject;
				T result = caseFunctionalDevice(functionalDevice);
				if (result == null) result = caseEASTADLEntity(functionalDevice);
				if (result == null) result = caseRealizedEntity(functionalDevice);
				if (result == null) result = caseValidatedEntity(functionalDevice);
				if (result == null) result = caseEASTADLNamedElement(functionalDevice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Functional_analysis_architecturePackage.ENVIRONMENT_FUNCTION: {
				EnvironmentFunction environmentFunction = (EnvironmentFunction)theEObject;
				T result = caseEnvironmentFunction(environmentFunction);
				if (result == null) result = caseAnalysisFunction(environmentFunction);
				if (result == null) result = caseEASTADLEntity(environmentFunction);
				if (result == null) result = caseVariantEntity(environmentFunction);
				if (result == null) result = caseRealizedEntity(environmentFunction);
				if (result == null) result = caseRealizingEntity(environmentFunction);
				if (result == null) result = caseAllocatableEntity(environmentFunction);
				if (result == null) result = caseValidatedEntity(environmentFunction);
				if (result == null) result = caseEASTADLNamedElement(environmentFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functional Analysis Architecture</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functional Analysis Architecture</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionalAnalysisArchitecture(FunctionalAnalysisArchitecture object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Analysis Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Analysis Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnalysisFunction(AnalysisFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functional Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functional Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionalDevice(FunctionalDevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Environment Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Environment Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnvironmentFunction(EnvironmentFunction object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>EASTADL Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EASTADL Artifact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEASTADLArtifact(EASTADLArtifact object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Variant Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variant Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariantEntity(VariantEntity object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Validated Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Validated Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValidatedEntity(ValidatedEntity object) {
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

} //Functional_analysis_architectureSwitch
