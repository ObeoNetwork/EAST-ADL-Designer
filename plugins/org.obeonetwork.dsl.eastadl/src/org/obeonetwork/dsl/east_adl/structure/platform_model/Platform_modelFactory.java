/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.platform_model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.Platform_modelPackage
 * @generated
 */
public interface Platform_modelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Platform_modelFactory eINSTANCE = org.obeonetwork.dsl.east_adl.structure.platform_model.impl.Platform_modelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Platform Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Platform Model</em>'.
	 * @generated
	 */
	PlatformModel createPlatformModel();

	/**
	 * Returns a new object of class '<em>Device Driver</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Driver</em>'.
	 * @generated
	 */
	DeviceDriver createDeviceDriver();

	/**
	 * Returns a new object of class '<em>IO Driver</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IO Driver</em>'.
	 * @generated
	 */
	IODriver createIODriver();

	/**
	 * Returns a new object of class '<em>Hardware Abstraction Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hardware Abstraction Function</em>'.
	 * @generated
	 */
	HardwareAbstractionFunction createHardwareAbstractionFunction();

	/**
	 * Returns a new object of class '<em>Operating System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operating System</em>'.
	 * @generated
	 */
	OperatingSystem createOperatingSystem();

	/**
	 * Returns a new object of class '<em>Framework</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Framework</em>'.
	 * @generated
	 */
	Framework createFramework();

	/**
	 * Returns a new object of class '<em>MW Composite Software Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MW Composite Software Function</em>'.
	 * @generated
	 */
	MWCompositeSoftwareFunction createMWCompositeSoftwareFunction();

	/**
	 * Returns a new object of class '<em>MW Elementary Software Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MW Elementary Software Function</em>'.
	 * @generated
	 */
	MWElementarySoftwareFunction createMWElementarySoftwareFunction();

	/**
	 * Returns a new object of class '<em>System Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Port</em>'.
	 * @generated
	 */
	SystemPort createSystemPort();

	/**
	 * Returns a new object of class '<em>MW Local Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MW Local Port</em>'.
	 * @generated
	 */
	MWLocalPort createMWLocalPort();

	/**
	 * Returns a new object of class '<em>MW Remote Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MW Remote Port</em>'.
	 * @generated
	 */
	MWRemotePort createMWRemotePort();

	/**
	 * Returns a new object of class '<em>IPC Exchanger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IPC Exchanger</em>'.
	 * @generated
	 */
	IPCExchanger createIPCExchanger();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Platform_modelPackage getPlatform_modelPackage();

} //Platform_modelFactory
