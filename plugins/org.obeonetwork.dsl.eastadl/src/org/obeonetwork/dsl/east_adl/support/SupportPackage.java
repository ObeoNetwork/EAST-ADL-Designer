/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.support;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.obeonetwork.dsl.east_adl.core.CorePackage;

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
 * This package contains entities used for version management purposes.
 * <!-- end-model-doc -->
 * @see org.obeonetwork.dsl.east_adl.support.SupportFactory
 * @model kind="package"
 *        annotation="http://www.topcased.org/documentation documentation='These entities will be designed to be modeled in their own diagram.'"
 * @generated
 */
public interface SupportPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "support";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.topcased.org/0.11.0/east_adl/support";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "support";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SupportPackage eINSTANCE = org.obeonetwork.dsl.east_adl.support.impl.SupportPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.support.impl.ArchivedEntityImpl <em>Archived Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.support.impl.ArchivedEntityImpl
	 * @see org.obeonetwork.dsl.east_adl.support.impl.SupportPackageImpl#getArchivedEntity()
	 * @generated
	 */
	int ARCHIVED_ENTITY = 0;

	/**
	 * The feature id for the '<em><b>Archive Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVED_ENTITY__ARCHIVE_DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Version Archive</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVED_ENTITY__VERSION_ARCHIVE = 1;

	/**
	 * The number of structural features of the '<em>Archived Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVED_ENTITY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.support.impl.SupportEntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.support.impl.SupportEntityImpl
	 * @see org.obeonetwork.dsl.east_adl.support.impl.SupportPackageImpl#getSupportEntity()
	 * @generated
	 */
	int SUPPORT_ENTITY = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_ENTITY__NAME = CorePackage.EASTADL_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owning Artifact</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_ENTITY__OWNING_ARTIFACT = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_ENTITY_FEATURE_COUNT = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.support.impl.VersionImpl <em>Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.support.impl.VersionImpl
	 * @see org.obeonetwork.dsl.east_adl.support.impl.SupportPackageImpl#getVersion()
	 * @generated
	 */
	int VERSION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__NAME = SUPPORT_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Owning Artifact</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__OWNING_ARTIFACT = SUPPORT_ENTITY__OWNING_ARTIFACT;

	/**
	 * The feature id for the '<em><b>Version Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__VERSION_NUMBER = SUPPORT_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__AUTHOR = SUPPORT_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__CONFIGURATION = SUPPORT_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Version Archive</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__VERSION_ARCHIVE = SUPPORT_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Creation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__CREATION = SUPPORT_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_FEATURE_COUNT = SUPPORT_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.support.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.support.impl.ConfigurationImpl
	 * @see org.obeonetwork.dsl.east_adl.support.impl.SupportPackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__NAME = SUPPORT_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Owning Artifact</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__OWNING_ARTIFACT = SUPPORT_ENTITY__OWNING_ARTIFACT;

	/**
	 * The feature id for the '<em><b>Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__VERSIONS = SUPPORT_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Configuration Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__CONFIGURATION_DESCRIPTION = SUPPORT_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = SUPPORT_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.support.impl.VersionArchiveImpl <em>Version Archive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.support.impl.VersionArchiveImpl
	 * @see org.obeonetwork.dsl.east_adl.support.impl.SupportPackageImpl#getVersionArchive()
	 * @generated
	 */
	int VERSION_ARCHIVE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_ARCHIVE__NAME = SUPPORT_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Owning Artifact</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_ARCHIVE__OWNING_ARTIFACT = SUPPORT_ENTITY__OWNING_ARTIFACT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_ARCHIVE__AUTHOR = SUPPORT_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Creation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_ARCHIVE__CREATION = SUPPORT_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Archived Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_ARCHIVE__ARCHIVED_ENTITY = SUPPORT_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Versions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_ARCHIVE__VERSIONS = SUPPORT_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Version Archive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_ARCHIVE_FEATURE_COUNT = SUPPORT_ENTITY_FEATURE_COUNT + 4;


	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.support.ArchivedEntity <em>Archived Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Archived Entity</em>'.
	 * @see org.obeonetwork.dsl.east_adl.support.ArchivedEntity
	 * @generated
	 */
	EClass getArchivedEntity();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.support.ArchivedEntity#getArchiveDescription <em>Archive Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Archive Description</em>'.
	 * @see org.obeonetwork.dsl.east_adl.support.ArchivedEntity#getArchiveDescription()
	 * @see #getArchivedEntity()
	 * @generated
	 */
	EAttribute getArchivedEntity_ArchiveDescription();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.support.ArchivedEntity#getVersionArchive <em>Version Archive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Version Archive</em>'.
	 * @see org.obeonetwork.dsl.east_adl.support.ArchivedEntity#getVersionArchive()
	 * @see #getArchivedEntity()
	 * @generated
	 */
	EReference getArchivedEntity_VersionArchive();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.support.Version <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Version</em>'.
	 * @see org.obeonetwork.dsl.east_adl.support.Version
	 * @generated
	 */
	EClass getVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.support.Version#getVersionNumber <em>Version Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version Number</em>'.
	 * @see org.obeonetwork.dsl.east_adl.support.Version#getVersionNumber()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_VersionNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.support.Version#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see org.obeonetwork.dsl.east_adl.support.Version#getAuthor()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_Author();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.support.Version#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Configuration</em>'.
	 * @see org.obeonetwork.dsl.east_adl.support.Version#getConfiguration()
	 * @see #getVersion()
	 * @generated
	 */
	EReference getVersion_Configuration();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.support.Version#getVersionArchive <em>Version Archive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Version Archive</em>'.
	 * @see org.obeonetwork.dsl.east_adl.support.Version#getVersionArchive()
	 * @see #getVersion()
	 * @generated
	 */
	EReference getVersion_VersionArchive();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.support.Version#getCreation <em>Creation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation</em>'.
	 * @see org.obeonetwork.dsl.east_adl.support.Version#getCreation()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_Creation();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.support.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see org.obeonetwork.dsl.east_adl.support.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.support.Configuration#getVersions <em>Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Versions</em>'.
	 * @see org.obeonetwork.dsl.east_adl.support.Configuration#getVersions()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Versions();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.support.Configuration#getConfigurationDescription <em>Configuration Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Configuration Description</em>'.
	 * @see org.obeonetwork.dsl.east_adl.support.Configuration#getConfigurationDescription()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_ConfigurationDescription();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.support.VersionArchive <em>Version Archive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Version Archive</em>'.
	 * @see org.obeonetwork.dsl.east_adl.support.VersionArchive
	 * @generated
	 */
	EClass getVersionArchive();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.support.VersionArchive#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see org.obeonetwork.dsl.east_adl.support.VersionArchive#getAuthor()
	 * @see #getVersionArchive()
	 * @generated
	 */
	EAttribute getVersionArchive_Author();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.support.VersionArchive#getCreation <em>Creation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation</em>'.
	 * @see org.obeonetwork.dsl.east_adl.support.VersionArchive#getCreation()
	 * @see #getVersionArchive()
	 * @generated
	 */
	EAttribute getVersionArchive_Creation();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.support.VersionArchive#getArchivedEntity <em>Archived Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Archived Entity</em>'.
	 * @see org.obeonetwork.dsl.east_adl.support.VersionArchive#getArchivedEntity()
	 * @see #getVersionArchive()
	 * @generated
	 */
	EReference getVersionArchive_ArchivedEntity();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.support.VersionArchive#getVersions <em>Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Versions</em>'.
	 * @see org.obeonetwork.dsl.east_adl.support.VersionArchive#getVersions()
	 * @see #getVersionArchive()
	 * @generated
	 */
	EReference getVersionArchive_Versions();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.support.SupportEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see org.obeonetwork.dsl.east_adl.support.SupportEntity
	 * @generated
	 */
	EClass getSupportEntity();

	/**
	 * Returns the meta object for the container reference '{@link org.obeonetwork.dsl.east_adl.support.SupportEntity#getOwningArtifact <em>Owning Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Artifact</em>'.
	 * @see org.obeonetwork.dsl.east_adl.support.SupportEntity#getOwningArtifact()
	 * @see #getSupportEntity()
	 * @generated
	 */
	EReference getSupportEntity_OwningArtifact();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SupportFactory getSupportFactory();

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
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.support.impl.ArchivedEntityImpl <em>Archived Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.support.impl.ArchivedEntityImpl
		 * @see org.obeonetwork.dsl.east_adl.support.impl.SupportPackageImpl#getArchivedEntity()
		 * @generated
		 */
		EClass ARCHIVED_ENTITY = eINSTANCE.getArchivedEntity();

		/**
		 * The meta object literal for the '<em><b>Archive Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHIVED_ENTITY__ARCHIVE_DESCRIPTION = eINSTANCE.getArchivedEntity_ArchiveDescription();

		/**
		 * The meta object literal for the '<em><b>Version Archive</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHIVED_ENTITY__VERSION_ARCHIVE = eINSTANCE.getArchivedEntity_VersionArchive();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.support.impl.VersionImpl <em>Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.support.impl.VersionImpl
		 * @see org.obeonetwork.dsl.east_adl.support.impl.SupportPackageImpl#getVersion()
		 * @generated
		 */
		EClass VERSION = eINSTANCE.getVersion();

		/**
		 * The meta object literal for the '<em><b>Version Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION__VERSION_NUMBER = eINSTANCE.getVersion_VersionNumber();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION__AUTHOR = eINSTANCE.getVersion_Author();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSION__CONFIGURATION = eINSTANCE.getVersion_Configuration();

		/**
		 * The meta object literal for the '<em><b>Version Archive</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSION__VERSION_ARCHIVE = eINSTANCE.getVersion_VersionArchive();

		/**
		 * The meta object literal for the '<em><b>Creation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION__CREATION = eINSTANCE.getVersion_Creation();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.support.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.support.impl.ConfigurationImpl
		 * @see org.obeonetwork.dsl.east_adl.support.impl.SupportPackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>Versions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__VERSIONS = eINSTANCE.getConfiguration_Versions();

		/**
		 * The meta object literal for the '<em><b>Configuration Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__CONFIGURATION_DESCRIPTION = eINSTANCE.getConfiguration_ConfigurationDescription();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.support.impl.VersionArchiveImpl <em>Version Archive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.support.impl.VersionArchiveImpl
		 * @see org.obeonetwork.dsl.east_adl.support.impl.SupportPackageImpl#getVersionArchive()
		 * @generated
		 */
		EClass VERSION_ARCHIVE = eINSTANCE.getVersionArchive();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION_ARCHIVE__AUTHOR = eINSTANCE.getVersionArchive_Author();

		/**
		 * The meta object literal for the '<em><b>Creation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION_ARCHIVE__CREATION = eINSTANCE.getVersionArchive_Creation();

		/**
		 * The meta object literal for the '<em><b>Archived Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSION_ARCHIVE__ARCHIVED_ENTITY = eINSTANCE.getVersionArchive_ArchivedEntity();

		/**
		 * The meta object literal for the '<em><b>Versions</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSION_ARCHIVE__VERSIONS = eINSTANCE.getVersionArchive_Versions();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.support.impl.SupportEntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.support.impl.SupportEntityImpl
		 * @see org.obeonetwork.dsl.east_adl.support.impl.SupportPackageImpl#getSupportEntity()
		 * @generated
		 */
		EClass SUPPORT_ENTITY = eINSTANCE.getSupportEntity();

		/**
		 * The meta object literal for the '<em><b>Owning Artifact</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPORT_ENTITY__OWNING_ARTIFACT = eINSTANCE.getSupportEntity_OwningArtifact();

	}

} //SupportPackage
