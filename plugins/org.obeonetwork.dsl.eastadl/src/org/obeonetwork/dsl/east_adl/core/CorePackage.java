/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.core;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * This package contains core elements which are usually base classes. 
 * <!-- end-model-doc -->
 * @see org.obeonetwork.dsl.east_adl.core.CoreFactory
 * @model kind="package"
 * @generated
 */
public interface CorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "core";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.topcased.org/0.11.0/east_adl/core";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "core";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CorePackage eINSTANCE = org.obeonetwork.dsl.east_adl.core.impl.CorePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.core.impl.EASTADLNamedElementImpl <em>EASTADL Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.core.impl.EASTADLNamedElementImpl
	 * @see org.obeonetwork.dsl.east_adl.core.impl.CorePackageImpl#getEASTADLNamedElement()
	 * @generated
	 */
	int EASTADL_NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASTADL_NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>EASTADL Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASTADL_NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.core.impl.EASTADLArtifactImpl <em>EASTADL Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.core.impl.EASTADLArtifactImpl
	 * @see org.obeonetwork.dsl.east_adl.core.impl.CorePackageImpl#getEASTADLArtifact()
	 * @generated
	 */
	int EASTADL_ARTIFACT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASTADL_ARTIFACT__NAME = EASTADL_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASTADL_ARTIFACT__REQUIREMENTS = EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASTADL_ARTIFACT__MODEL = EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Support Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASTADL_ARTIFACT__SUPPORT_ENTITIES = EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Validation Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASTADL_ARTIFACT__VALIDATION_ENTITIES = EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>EASTADL Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASTADL_ARTIFACT_FEATURE_COUNT = EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.core.impl.EASTADLEntityImpl <em>EASTADL Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.core.impl.EASTADLEntityImpl
	 * @see org.obeonetwork.dsl.east_adl.core.impl.CorePackageImpl#getEASTADLEntity()
	 * @generated
	 */
	int EASTADL_ENTITY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASTADL_ENTITY__NAME = EASTADL_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Passive Assignments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASTADL_ENTITY__PASSIVE_ASSIGNMENTS = EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assigned Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASTADL_ENTITY__ASSIGNED_REQUIREMENTS = EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EASTADL Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASTADL_ENTITY_FEATURE_COUNT = EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.core.EASTADLNamedElement <em>EASTADL Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EASTADL Named Element</em>'.
	 * @see org.obeonetwork.dsl.east_adl.core.EASTADLNamedElement
	 * @generated
	 */
	EClass getEASTADLNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.core.EASTADLNamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.east_adl.core.EASTADLNamedElement#getName()
	 * @see #getEASTADLNamedElement()
	 * @generated
	 */
	EAttribute getEASTADLNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.core.EASTADLArtifact <em>EASTADL Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EASTADL Artifact</em>'.
	 * @see org.obeonetwork.dsl.east_adl.core.EASTADLArtifact
	 * @generated
	 */
	EClass getEASTADLArtifact();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.core.EASTADLArtifact#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirements</em>'.
	 * @see org.obeonetwork.dsl.east_adl.core.EASTADLArtifact#getRequirements()
	 * @see #getEASTADLArtifact()
	 * @generated
	 */
	EReference getEASTADLArtifact_Requirements();

	/**
	 * Returns the meta object for the container reference '{@link org.obeonetwork.dsl.east_adl.core.EASTADLArtifact#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Model</em>'.
	 * @see org.obeonetwork.dsl.east_adl.core.EASTADLArtifact#getModel()
	 * @see #getEASTADLArtifact()
	 * @generated
	 */
	EReference getEASTADLArtifact_Model();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.core.EASTADLArtifact#getSupportEntities <em>Support Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Support Entities</em>'.
	 * @see org.obeonetwork.dsl.east_adl.core.EASTADLArtifact#getSupportEntities()
	 * @see #getEASTADLArtifact()
	 * @generated
	 */
	EReference getEASTADLArtifact_SupportEntities();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.core.EASTADLArtifact#getValidationEntities <em>Validation Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Validation Entities</em>'.
	 * @see org.obeonetwork.dsl.east_adl.core.EASTADLArtifact#getValidationEntities()
	 * @see #getEASTADLArtifact()
	 * @generated
	 */
	EReference getEASTADLArtifact_ValidationEntities();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.core.EASTADLEntity <em>EASTADL Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EASTADL Entity</em>'.
	 * @see org.obeonetwork.dsl.east_adl.core.EASTADLEntity
	 * @generated
	 */
	EClass getEASTADLEntity();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.core.EASTADLEntity#getPassiveAssignments <em>Passive Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Passive Assignments</em>'.
	 * @see org.obeonetwork.dsl.east_adl.core.EASTADLEntity#getPassiveAssignments()
	 * @see #getEASTADLEntity()
	 * @generated
	 */
	EReference getEASTADLEntity_PassiveAssignments();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.core.EASTADLEntity#getAssignedRequirements <em>Assigned Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assigned Requirements</em>'.
	 * @see org.obeonetwork.dsl.east_adl.core.EASTADLEntity#getAssignedRequirements()
	 * @see #getEASTADLEntity()
	 * @generated
	 */
	EReference getEASTADLEntity_AssignedRequirements();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CoreFactory getCoreFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.core.impl.EASTADLNamedElementImpl <em>EASTADL Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.core.impl.EASTADLNamedElementImpl
		 * @see org.obeonetwork.dsl.east_adl.core.impl.CorePackageImpl#getEASTADLNamedElement()
		 * @generated
		 */
		EClass EASTADL_NAMED_ELEMENT = eINSTANCE.getEASTADLNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EASTADL_NAMED_ELEMENT__NAME = eINSTANCE.getEASTADLNamedElement_Name();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.core.impl.EASTADLArtifactImpl <em>EASTADL Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.core.impl.EASTADLArtifactImpl
		 * @see org.obeonetwork.dsl.east_adl.core.impl.CorePackageImpl#getEASTADLArtifact()
		 * @generated
		 */
		EClass EASTADL_ARTIFACT = eINSTANCE.getEASTADLArtifact();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EASTADL_ARTIFACT__REQUIREMENTS = eINSTANCE.getEASTADLArtifact_Requirements();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EASTADL_ARTIFACT__MODEL = eINSTANCE.getEASTADLArtifact_Model();

		/**
		 * The meta object literal for the '<em><b>Support Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EASTADL_ARTIFACT__SUPPORT_ENTITIES = eINSTANCE.getEASTADLArtifact_SupportEntities();

		/**
		 * The meta object literal for the '<em><b>Validation Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EASTADL_ARTIFACT__VALIDATION_ENTITIES = eINSTANCE.getEASTADLArtifact_ValidationEntities();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.core.impl.EASTADLEntityImpl <em>EASTADL Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.core.impl.EASTADLEntityImpl
		 * @see org.obeonetwork.dsl.east_adl.core.impl.CorePackageImpl#getEASTADLEntity()
		 * @generated
		 */
		EClass EASTADL_ENTITY = eINSTANCE.getEASTADLEntity();

		/**
		 * The meta object literal for the '<em><b>Passive Assignments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EASTADL_ENTITY__PASSIVE_ASSIGNMENTS = eINSTANCE.getEASTADLEntity_PassiveAssignments();

		/**
		 * The meta object literal for the '<em><b>Assigned Requirements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EASTADL_ENTITY__ASSIGNED_REQUIREMENTS = eINSTANCE.getEASTADLEntity_AssignedRequirements();

	}

} //CorePackage
