/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.common;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * This package contains EAST-ADL structural features that are shared between all artifacts (like ports and data types).
 * <!-- end-model-doc -->
 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonFactory
 * @model kind="package"
 * @generated
 */
public interface CommonPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "common";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.topcased.org/0.11.0/east_adl/structure/common";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "common";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommonPackage eINSTANCE = org.obeonetwork.dsl.east_adl.structure.common.impl.CommonPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.common.impl.FunctionPortImpl <em>Function Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.FunctionPortImpl
	 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.CommonPackageImpl#getFunctionPort()
	 * @generated
	 */
	int FUNCTION_PORT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PORT__NAME = CorePackage.EASTADL_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Passive Assignments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PORT__PASSIVE_ASSIGNMENTS = CorePackage.EASTADL_ENTITY__PASSIVE_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Assigned Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PORT__ASSIGNED_REQUIREMENTS = CorePackage.EASTADL_ENTITY__ASSIGNED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Provided</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PORT__PROVIDED = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PORT__INTERFACE = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Delay</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PORT__FROM_DELAY = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Until Delay</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PORT__UNTIL_DELAY = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Period Restriction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PORT__PERIOD_RESTRICTION = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PORT__OWNER = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PORT__PERIOD = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Transfer Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PORT__TRANSFER_TIME = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Function Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PORT_FEATURE_COUNT = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.common.impl.SignalFunctionPortImpl <em>Signal Function Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.SignalFunctionPortImpl
	 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.CommonPackageImpl#getSignalFunctionPort()
	 * @generated
	 */
	int SIGNAL_FUNCTION_PORT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FUNCTION_PORT__NAME = FUNCTION_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Passive Assignments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FUNCTION_PORT__PASSIVE_ASSIGNMENTS = FUNCTION_PORT__PASSIVE_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Assigned Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FUNCTION_PORT__ASSIGNED_REQUIREMENTS = FUNCTION_PORT__ASSIGNED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Provided</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FUNCTION_PORT__PROVIDED = FUNCTION_PORT__PROVIDED;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FUNCTION_PORT__INTERFACE = FUNCTION_PORT__INTERFACE;

	/**
	 * The feature id for the '<em><b>From Delay</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FUNCTION_PORT__FROM_DELAY = FUNCTION_PORT__FROM_DELAY;

	/**
	 * The feature id for the '<em><b>Until Delay</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FUNCTION_PORT__UNTIL_DELAY = FUNCTION_PORT__UNTIL_DELAY;

	/**
	 * The feature id for the '<em><b>Period Restriction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FUNCTION_PORT__PERIOD_RESTRICTION = FUNCTION_PORT__PERIOD_RESTRICTION;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FUNCTION_PORT__OWNER = FUNCTION_PORT__OWNER;

	/**
	 * The feature id for the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FUNCTION_PORT__PERIOD = FUNCTION_PORT__PERIOD;

	/**
	 * The feature id for the '<em><b>Transfer Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FUNCTION_PORT__TRANSFER_TIME = FUNCTION_PORT__TRANSFER_TIME;

	/**
	 * The number of structural features of the '<em>Signal Function Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FUNCTION_PORT_FEATURE_COUNT = FUNCTION_PORT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.common.impl.OperationFunctionPortImpl <em>Operation Function Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.OperationFunctionPortImpl
	 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.CommonPackageImpl#getOperationFunctionPort()
	 * @generated
	 */
	int OPERATION_FUNCTION_PORT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FUNCTION_PORT__NAME = FUNCTION_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Passive Assignments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FUNCTION_PORT__PASSIVE_ASSIGNMENTS = FUNCTION_PORT__PASSIVE_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Assigned Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FUNCTION_PORT__ASSIGNED_REQUIREMENTS = FUNCTION_PORT__ASSIGNED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Provided</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FUNCTION_PORT__PROVIDED = FUNCTION_PORT__PROVIDED;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FUNCTION_PORT__INTERFACE = FUNCTION_PORT__INTERFACE;

	/**
	 * The feature id for the '<em><b>From Delay</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FUNCTION_PORT__FROM_DELAY = FUNCTION_PORT__FROM_DELAY;

	/**
	 * The feature id for the '<em><b>Until Delay</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FUNCTION_PORT__UNTIL_DELAY = FUNCTION_PORT__UNTIL_DELAY;

	/**
	 * The feature id for the '<em><b>Period Restriction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FUNCTION_PORT__PERIOD_RESTRICTION = FUNCTION_PORT__PERIOD_RESTRICTION;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FUNCTION_PORT__OWNER = FUNCTION_PORT__OWNER;

	/**
	 * The feature id for the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FUNCTION_PORT__PERIOD = FUNCTION_PORT__PERIOD;

	/**
	 * The feature id for the '<em><b>Transfer Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FUNCTION_PORT__TRANSFER_TIME = FUNCTION_PORT__TRANSFER_TIME;

	/**
	 * The number of structural features of the '<em>Operation Function Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FUNCTION_PORT_FEATURE_COUNT = FUNCTION_PORT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.common.impl.FunctionPortInterfaceImpl <em>Function Port Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.FunctionPortInterfaceImpl
	 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.CommonPackageImpl#getFunctionPortInterface()
	 * @generated
	 */
	int FUNCTION_PORT_INTERFACE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PORT_INTERFACE__NAME = CorePackage.EASTADL_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Passive Assignments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PORT_INTERFACE__PASSIVE_ASSIGNMENTS = CorePackage.EASTADL_ENTITY__PASSIVE_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Assigned Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PORT_INTERFACE__ASSIGNED_REQUIREMENTS = CorePackage.EASTADL_ENTITY__ASSIGNED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Typed Port</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PORT_INTERFACE__TYPED_PORT = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Function Port Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PORT_INTERFACE_FEATURE_COUNT = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.common.impl.SignalFunctionPortInterfaceImpl <em>Signal Function Port Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.SignalFunctionPortInterfaceImpl
	 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.CommonPackageImpl#getSignalFunctionPortInterface()
	 * @generated
	 */
	int SIGNAL_FUNCTION_PORT_INTERFACE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FUNCTION_PORT_INTERFACE__NAME = FUNCTION_PORT_INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Passive Assignments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FUNCTION_PORT_INTERFACE__PASSIVE_ASSIGNMENTS = FUNCTION_PORT_INTERFACE__PASSIVE_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Assigned Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FUNCTION_PORT_INTERFACE__ASSIGNED_REQUIREMENTS = FUNCTION_PORT_INTERFACE__ASSIGNED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Typed Port</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FUNCTION_PORT_INTERFACE__TYPED_PORT = FUNCTION_PORT_INTERFACE__TYPED_PORT;

	/**
	 * The feature id for the '<em><b>Emited Signals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FUNCTION_PORT_INTERFACE__EMITED_SIGNALS = FUNCTION_PORT_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Received Signals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FUNCTION_PORT_INTERFACE__RECEIVED_SIGNALS = FUNCTION_PORT_INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Signal Function Port Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FUNCTION_PORT_INTERFACE_FEATURE_COUNT = FUNCTION_PORT_INTERFACE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.common.impl.OperationFunctionPortInterfaceImpl <em>Operation Function Port Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.OperationFunctionPortInterfaceImpl
	 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.CommonPackageImpl#getOperationFunctionPortInterface()
	 * @generated
	 */
	int OPERATION_FUNCTION_PORT_INTERFACE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FUNCTION_PORT_INTERFACE__NAME = FUNCTION_PORT_INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Passive Assignments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FUNCTION_PORT_INTERFACE__PASSIVE_ASSIGNMENTS = FUNCTION_PORT_INTERFACE__PASSIVE_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Assigned Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FUNCTION_PORT_INTERFACE__ASSIGNED_REQUIREMENTS = FUNCTION_PORT_INTERFACE__ASSIGNED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Typed Port</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FUNCTION_PORT_INTERFACE__TYPED_PORT = FUNCTION_PORT_INTERFACE__TYPED_PORT;

	/**
	 * The feature id for the '<em><b>Received Calls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FUNCTION_PORT_INTERFACE__RECEIVED_CALLS = FUNCTION_PORT_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Emited Calls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FUNCTION_PORT_INTERFACE__EMITED_CALLS = FUNCTION_PORT_INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FUNCTION_PORT_INTERFACE__SERVICES = FUNCTION_PORT_INTERFACE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Operation Function Port Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FUNCTION_PORT_INTERFACE_FEATURE_COUNT = FUNCTION_PORT_INTERFACE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.common.impl.ConnectorSignalImpl <em>Connector Signal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.ConnectorSignalImpl
	 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.CommonPackageImpl#getConnectorSignal()
	 * @generated
	 */
	int CONNECTOR_SIGNAL = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_SIGNAL__NAME = CorePackage.EASTADL_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Passive Assignments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_SIGNAL__PASSIVE_ASSIGNMENTS = CorePackage.EASTADL_ENTITY__PASSIVE_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Assigned Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_SIGNAL__ASSIGNED_REQUIREMENTS = CorePackage.EASTADL_ENTITY__ASSIGNED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Emitter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_SIGNAL__EMITTER = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Receiver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_SIGNAL__RECEIVER = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_SIGNAL__DATA_TYPE = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_SIGNAL__PERIOD = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_SIGNAL__INSTANCES = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Connector Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_SIGNAL_FEATURE_COUNT = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.common.impl.DesignDataTypeImpl <em>Design Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.DesignDataTypeImpl
	 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.CommonPackageImpl#getDesignDataType()
	 * @generated
	 */
	int DESIGN_DATA_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_DATA_TYPE__NAME = CorePackage.EASTADL_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_DATA_TYPE__DESCRIPTION = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_DATA_TYPE__DATA_TYPE = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Typed Signals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_DATA_TYPE__TYPED_SIGNALS = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_DATA_TYPE__UNIT = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_DATA_TYPE__RESOLUTION = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Physical Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_DATA_TYPE__PHYSICAL_MINIMUM = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Physical Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_DATA_TYPE__PHYSICAL_MAXIMUM = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Significant Digits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_DATA_TYPE__SIGNIFICANT_DIGITS = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_DATA_TYPE__DEFAULT_VALUE = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Typed Service Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_DATA_TYPE__TYPED_SERVICE_PARAMETERS = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Type Associations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_DATA_TYPE__TYPE_ASSOCIATIONS = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Typed Function Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_DATA_TYPE__TYPED_FUNCTION_PARAMETERS = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Design Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_DATA_TYPE_FEATURE_COUNT = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.common.impl.ImplementationDataTypeImpl <em>Implementation Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.ImplementationDataTypeImpl
	 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.CommonPackageImpl#getImplementationDataType()
	 * @generated
	 */
	int IMPLEMENTATION_DATA_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_DATA_TYPE__NAME = CorePackage.EASTADL_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_DATA_TYPE__DESCRIPTION = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_DATA_TYPE__DATA_TYPE = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Implementation Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_DATA_TYPE__IMPLEMENTATION_MINIMUM = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Implementation Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_DATA_TYPE__IMPLEMENTATION_MAXIMUM = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_DATA_TYPE__DEFAULT_VALUE = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Type Associations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_DATA_TYPE__TYPE_ASSOCIATIONS = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Implementation Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_DATA_TYPE_FEATURE_COUNT = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.common.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.ParameterImpl
	 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.CommonPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = CorePackage.EASTADL_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Passive Assignments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__PASSIVE_ASSIGNMENTS = CorePackage.EASTADL_ENTITY__PASSIVE_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Assigned Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ASSIGNED_REQUIREMENTS = CorePackage.EASTADL_ENTITY__ASSIGNED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__CONSTANT = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__OWNER = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__INSTANCES = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DATA_TYPE = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DIRECTION = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.common.impl.RealizationImpl <em>Realization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.RealizationImpl
	 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.CommonPackageImpl#getRealization()
	 * @generated
	 */
	int REALIZATION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION__NAME = CorePackage.EASTADL_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Realized Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION__REALIZED_ENTITY = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Realizing Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION__REALIZING_ENTITY = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Realization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION_FEATURE_COUNT = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.common.impl.RealizedEntityImpl <em>Realized Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.RealizedEntityImpl
	 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.CommonPackageImpl#getRealizedEntity()
	 * @generated
	 */
	int REALIZED_ENTITY = 11;

	/**
	 * The feature id for the '<em><b>Passive Realizations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZED_ENTITY__PASSIVE_REALIZATIONS = 0;

	/**
	 * The feature id for the '<em><b>Realized By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZED_ENTITY__REALIZED_BY = 1;

	/**
	 * The number of structural features of the '<em>Realized Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZED_ENTITY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.common.impl.OperationServiceImpl <em>Operation Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.OperationServiceImpl
	 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.CommonPackageImpl#getOperationService()
	 * @generated
	 */
	int OPERATION_SERVICE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_SERVICE__NAME = CorePackage.EASTADL_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Passive Assignments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_SERVICE__PASSIVE_ASSIGNMENTS = CorePackage.EASTADL_ENTITY__PASSIVE_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Assigned Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_SERVICE__ASSIGNED_REQUIREMENTS = CorePackage.EASTADL_ENTITY__ASSIGNED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_SERVICE__PARAMETERS = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_SERVICE__INTERFACE = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Operation Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_SERVICE_FEATURE_COUNT = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.common.impl.ServiceParameterImpl <em>Service Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.ServiceParameterImpl
	 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.CommonPackageImpl#getServiceParameter()
	 * @generated
	 */
	int SERVICE_PARAMETER = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PARAMETER__NAME = CorePackage.EASTADL_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Passive Assignments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PARAMETER__PASSIVE_ASSIGNMENTS = CorePackage.EASTADL_ENTITY__PASSIVE_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Assigned Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PARAMETER__ASSIGNED_REQUIREMENTS = CorePackage.EASTADL_ENTITY__ASSIGNED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PARAMETER__MODIFIER = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Service</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PARAMETER__OWNING_SERVICE = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PARAMETER__DATA_TYPE = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Service Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PARAMETER_FEATURE_COUNT = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.common.impl.OperationCallImpl <em>Operation Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.OperationCallImpl
	 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.CommonPackageImpl#getOperationCall()
	 * @generated
	 */
	int OPERATION_CALL = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL__NAME = CorePackage.EASTADL_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Passive Assignments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL__PASSIVE_ASSIGNMENTS = CorePackage.EASTADL_ENTITY__PASSIVE_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Assigned Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL__ASSIGNED_REQUIREMENTS = CorePackage.EASTADL_ENTITY__ASSIGNED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Receiver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL__RECEIVER = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Emitter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL__EMITTER = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Operation Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_FEATURE_COUNT = CorePackage.EASTADL_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.common.impl.TypeAssociationImpl <em>Type Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.TypeAssociationImpl
	 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.CommonPackageImpl#getTypeAssociation()
	 * @generated
	 */
	int TYPE_ASSOCIATION = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ASSOCIATION__NAME = CorePackage.EASTADL_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Scale Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ASSOCIATION__SCALE_FACTOR = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scale Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ASSOCIATION__SCALE_OFFSET = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Design Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ASSOCIATION__DESIGN_DATA_TYPE = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Implementation Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ASSOCIATION__IMPLEMENTATION_DATA_TYPE = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Processor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ASSOCIATION__PROCESSOR = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Type Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ASSOCIATION_FEATURE_COUNT = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.common.impl.AllocatableEntityImpl <em>Allocatable Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.AllocatableEntityImpl
	 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.CommonPackageImpl#getAllocatableEntity()
	 * @generated
	 */
	int ALLOCATABLE_ENTITY = 16;

	/**
	 * The feature id for the '<em><b>Allocation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATABLE_ENTITY__ALLOCATION = 0;

	/**
	 * The feature id for the '<em><b>Allocation Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATABLE_ENTITY__ALLOCATION_TARGET = 1;

	/**
	 * The number of structural features of the '<em>Allocatable Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATABLE_ENTITY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.common.impl.AllocationConstraintImpl <em>Allocation Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.AllocationConstraintImpl
	 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.CommonPackageImpl#getAllocationConstraint()
	 * @generated
	 */
	int ALLOCATION_CONSTRAINT = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_CONSTRAINT__NAME = CorePackage.EASTADL_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Allocator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_CONSTRAINT__ALLOCATOR = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_CONSTRAINT__TARGET = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Allocation Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_CONSTRAINT_FEATURE_COUNT = CorePackage.EASTADL_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.common.impl.RealizingEntityImpl <em>Realizing Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.RealizingEntityImpl
	 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.CommonPackageImpl#getRealizingEntity()
	 * @generated
	 */
	int REALIZING_ENTITY = 18;

	/**
	 * The feature id for the '<em><b>Active Realizations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZING_ENTITY__ACTIVE_REALIZATIONS = 0;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZING_ENTITY__REALIZES = 1;

	/**
	 * The number of structural features of the '<em>Realizing Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZING_ENTITY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.common.TriggerKind <em>Trigger Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.common.TriggerKind
	 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.CommonPackageImpl#getTriggerKind()
	 * @generated
	 */
	int TRIGGER_KIND = 19;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.common.DesignDataTypeKind <em>Design Data Type Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.common.DesignDataTypeKind
	 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.CommonPackageImpl#getDesignDataTypeKind()
	 * @generated
	 */
	int DESIGN_DATA_TYPE_KIND = 20;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.common.ImplementationDataTypeKind <em>Implementation Data Type Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.common.ImplementationDataTypeKind
	 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.CommonPackageImpl#getImplementationDataTypeKind()
	 * @generated
	 */
	int IMPLEMENTATION_DATA_TYPE_KIND = 21;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.east_adl.structure.common.DirectionKind <em>Direction Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.east_adl.structure.common.DirectionKind
	 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.CommonPackageImpl#getDirectionKind()
	 * @generated
	 */
	int DIRECTION_KIND = 22;


	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.structure.common.FunctionPort <em>Function Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Port</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.FunctionPort
	 * @generated
	 */
	EClass getFunctionPort();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.structure.common.FunctionPort#isProvided <em>Provided</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provided</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.FunctionPort#isProvided()
	 * @see #getFunctionPort()
	 * @generated
	 */
	EAttribute getFunctionPort_Provided();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.east_adl.structure.common.FunctionPort#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interface</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.FunctionPort#getInterface()
	 * @see #getFunctionPort()
	 * @generated
	 */
	EReference getFunctionPort_Interface();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.structure.common.FunctionPort#getFromDelay <em>From Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Delay</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.FunctionPort#getFromDelay()
	 * @see #getFunctionPort()
	 * @generated
	 */
	EReference getFunctionPort_FromDelay();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.structure.common.FunctionPort#getUntilDelay <em>Until Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Until Delay</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.FunctionPort#getUntilDelay()
	 * @see #getFunctionPort()
	 * @generated
	 */
	EReference getFunctionPort_UntilDelay();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.structure.common.FunctionPort#getPeriodRestriction <em>Period Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Period Restriction</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.FunctionPort#getPeriodRestriction()
	 * @see #getFunctionPort()
	 * @generated
	 */
	EReference getFunctionPort_PeriodRestriction();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.structure.common.FunctionPort#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.FunctionPort#getOwner()
	 * @see #getFunctionPort()
	 * @generated
	 */
	EReference getFunctionPort_Owner();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.east_adl.structure.common.FunctionPort#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Period</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.FunctionPort#getPeriod()
	 * @see #getFunctionPort()
	 * @generated
	 */
	EReference getFunctionPort_Period();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.east_adl.structure.common.FunctionPort#getTransferTime <em>Transfer Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transfer Time</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.FunctionPort#getTransferTime()
	 * @see #getFunctionPort()
	 * @generated
	 */
	EReference getFunctionPort_TransferTime();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.structure.common.SignalFunctionPort <em>Signal Function Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Function Port</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.SignalFunctionPort
	 * @generated
	 */
	EClass getSignalFunctionPort();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.structure.common.OperationFunctionPort <em>Operation Function Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Function Port</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.OperationFunctionPort
	 * @generated
	 */
	EClass getOperationFunctionPort();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.structure.common.FunctionPortInterface <em>Function Port Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Port Interface</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.FunctionPortInterface
	 * @generated
	 */
	EClass getFunctionPortInterface();

	/**
	 * Returns the meta object for the container reference '{@link org.obeonetwork.dsl.east_adl.structure.common.FunctionPortInterface#getTypedPort <em>Typed Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Typed Port</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.FunctionPortInterface#getTypedPort()
	 * @see #getFunctionPortInterface()
	 * @generated
	 */
	EReference getFunctionPortInterface_TypedPort();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.structure.common.SignalFunctionPortInterface <em>Signal Function Port Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Function Port Interface</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.SignalFunctionPortInterface
	 * @generated
	 */
	EClass getSignalFunctionPortInterface();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.structure.common.SignalFunctionPortInterface#getEmitedSignals <em>Emited Signals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Emited Signals</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.SignalFunctionPortInterface#getEmitedSignals()
	 * @see #getSignalFunctionPortInterface()
	 * @generated
	 */
	EReference getSignalFunctionPortInterface_EmitedSignals();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.structure.common.SignalFunctionPortInterface#getReceivedSignals <em>Received Signals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Received Signals</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.SignalFunctionPortInterface#getReceivedSignals()
	 * @see #getSignalFunctionPortInterface()
	 * @generated
	 */
	EReference getSignalFunctionPortInterface_ReceivedSignals();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.structure.common.OperationFunctionPortInterface <em>Operation Function Port Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Function Port Interface</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.OperationFunctionPortInterface
	 * @generated
	 */
	EClass getOperationFunctionPortInterface();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.structure.common.OperationFunctionPortInterface#getReceivedCalls <em>Received Calls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Received Calls</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.OperationFunctionPortInterface#getReceivedCalls()
	 * @see #getOperationFunctionPortInterface()
	 * @generated
	 */
	EReference getOperationFunctionPortInterface_ReceivedCalls();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.structure.common.OperationFunctionPortInterface#getEmitedCalls <em>Emited Calls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Emited Calls</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.OperationFunctionPortInterface#getEmitedCalls()
	 * @see #getOperationFunctionPortInterface()
	 * @generated
	 */
	EReference getOperationFunctionPortInterface_EmitedCalls();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.structure.common.OperationFunctionPortInterface#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.OperationFunctionPortInterface#getServices()
	 * @see #getOperationFunctionPortInterface()
	 * @generated
	 */
	EReference getOperationFunctionPortInterface_Services();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.structure.common.ConnectorSignal <em>Connector Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector Signal</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.ConnectorSignal
	 * @generated
	 */
	EClass getConnectorSignal();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.structure.common.ConnectorSignal#getEmitter <em>Emitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Emitter</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.ConnectorSignal#getEmitter()
	 * @see #getConnectorSignal()
	 * @generated
	 */
	EReference getConnectorSignal_Emitter();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.structure.common.ConnectorSignal#getReceiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receiver</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.ConnectorSignal#getReceiver()
	 * @see #getConnectorSignal()
	 * @generated
	 */
	EReference getConnectorSignal_Receiver();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.structure.common.ConnectorSignal#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Type</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.ConnectorSignal#getDataType()
	 * @see #getConnectorSignal()
	 * @generated
	 */
	EReference getConnectorSignal_DataType();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.east_adl.structure.common.ConnectorSignal#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Period</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.ConnectorSignal#getPeriod()
	 * @see #getConnectorSignal()
	 * @generated
	 */
	EReference getConnectorSignal_Period();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.structure.common.ConnectorSignal#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instances</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.ConnectorSignal#getInstances()
	 * @see #getConnectorSignal()
	 * @generated
	 */
	EReference getConnectorSignal_Instances();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.structure.common.DesignDataType <em>Design Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Design Data Type</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.DesignDataType
	 * @generated
	 */
	EClass getDesignDataType();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.structure.common.DesignDataType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.DesignDataType#getDescription()
	 * @see #getDesignDataType()
	 * @generated
	 */
	EAttribute getDesignDataType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.structure.common.DesignDataType#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.DesignDataType#getDataType()
	 * @see #getDesignDataType()
	 * @generated
	 */
	EAttribute getDesignDataType_DataType();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.structure.common.DesignDataType#getTypedSignals <em>Typed Signals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Typed Signals</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.DesignDataType#getTypedSignals()
	 * @see #getDesignDataType()
	 * @generated
	 */
	EReference getDesignDataType_TypedSignals();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.structure.common.DesignDataType#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.DesignDataType#getUnit()
	 * @see #getDesignDataType()
	 * @generated
	 */
	EAttribute getDesignDataType_Unit();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.structure.common.DesignDataType#getResolution <em>Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolution</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.DesignDataType#getResolution()
	 * @see #getDesignDataType()
	 * @generated
	 */
	EAttribute getDesignDataType_Resolution();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.structure.common.DesignDataType#getPhysicalMinimum <em>Physical Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Physical Minimum</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.DesignDataType#getPhysicalMinimum()
	 * @see #getDesignDataType()
	 * @generated
	 */
	EAttribute getDesignDataType_PhysicalMinimum();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.structure.common.DesignDataType#getPhysicalMaximum <em>Physical Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Physical Maximum</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.DesignDataType#getPhysicalMaximum()
	 * @see #getDesignDataType()
	 * @generated
	 */
	EAttribute getDesignDataType_PhysicalMaximum();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.structure.common.DesignDataType#getSignificantDigits <em>Significant Digits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Significant Digits</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.DesignDataType#getSignificantDigits()
	 * @see #getDesignDataType()
	 * @generated
	 */
	EAttribute getDesignDataType_SignificantDigits();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.structure.common.DesignDataType#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.DesignDataType#getDefaultValue()
	 * @see #getDesignDataType()
	 * @generated
	 */
	EAttribute getDesignDataType_DefaultValue();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.structure.common.DesignDataType#getTypedServiceParameters <em>Typed Service Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Typed Service Parameters</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.DesignDataType#getTypedServiceParameters()
	 * @see #getDesignDataType()
	 * @generated
	 */
	EReference getDesignDataType_TypedServiceParameters();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.structure.common.DesignDataType#getTypeAssociations <em>Type Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Type Associations</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.DesignDataType#getTypeAssociations()
	 * @see #getDesignDataType()
	 * @generated
	 */
	EReference getDesignDataType_TypeAssociations();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.structure.common.DesignDataType#getTypedFunctionParameters <em>Typed Function Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Typed Function Parameters</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.DesignDataType#getTypedFunctionParameters()
	 * @see #getDesignDataType()
	 * @generated
	 */
	EReference getDesignDataType_TypedFunctionParameters();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.structure.common.ImplementationDataType <em>Implementation Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implementation Data Type</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.ImplementationDataType
	 * @generated
	 */
	EClass getImplementationDataType();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.structure.common.ImplementationDataType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.ImplementationDataType#getDescription()
	 * @see #getImplementationDataType()
	 * @generated
	 */
	EAttribute getImplementationDataType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.structure.common.ImplementationDataType#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.ImplementationDataType#getDataType()
	 * @see #getImplementationDataType()
	 * @generated
	 */
	EAttribute getImplementationDataType_DataType();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.structure.common.ImplementationDataType#getImplementationMinimum <em>Implementation Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implementation Minimum</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.ImplementationDataType#getImplementationMinimum()
	 * @see #getImplementationDataType()
	 * @generated
	 */
	EAttribute getImplementationDataType_ImplementationMinimum();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.structure.common.ImplementationDataType#getImplementationMaximum <em>Implementation Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implementation Maximum</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.ImplementationDataType#getImplementationMaximum()
	 * @see #getImplementationDataType()
	 * @generated
	 */
	EAttribute getImplementationDataType_ImplementationMaximum();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.structure.common.ImplementationDataType#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.ImplementationDataType#getDefaultValue()
	 * @see #getImplementationDataType()
	 * @generated
	 */
	EAttribute getImplementationDataType_DefaultValue();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.structure.common.ImplementationDataType#getTypeAssociations <em>Type Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Type Associations</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.ImplementationDataType#getTypeAssociations()
	 * @see #getImplementationDataType()
	 * @generated
	 */
	EReference getImplementationDataType_TypeAssociations();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.structure.common.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.structure.common.Parameter#isConstant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constant</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.Parameter#isConstant()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Constant();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.structure.common.Parameter#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.Parameter#getOwner()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Owner();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.structure.common.Parameter#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instances</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.Parameter#getInstances()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Instances();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.structure.common.Parameter#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Type</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.Parameter#getDataType()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_DataType();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.structure.common.Parameter#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.Parameter#getDirection()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Direction();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.structure.common.Realization <em>Realization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Realization</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.Realization
	 * @generated
	 */
	EClass getRealization();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.structure.common.Realization#getRealizedEntity <em>Realized Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Realized Entity</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.Realization#getRealizedEntity()
	 * @see #getRealization()
	 * @generated
	 */
	EReference getRealization_RealizedEntity();

	/**
	 * Returns the meta object for the container reference '{@link org.obeonetwork.dsl.east_adl.structure.common.Realization#getRealizingEntity <em>Realizing Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Realizing Entity</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.Realization#getRealizingEntity()
	 * @see #getRealization()
	 * @generated
	 */
	EReference getRealization_RealizingEntity();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.structure.common.RealizedEntity <em>Realized Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Realized Entity</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.RealizedEntity
	 * @generated
	 */
	EClass getRealizedEntity();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.structure.common.RealizedEntity#getPassiveRealizations <em>Passive Realizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Passive Realizations</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.RealizedEntity#getPassiveRealizations()
	 * @see #getRealizedEntity()
	 * @generated
	 */
	EReference getRealizedEntity_PassiveRealizations();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.structure.common.RealizedEntity#getRealizedBy <em>Realized By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Realized By</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.RealizedEntity#getRealizedBy()
	 * @see #getRealizedEntity()
	 * @generated
	 */
	EReference getRealizedEntity_RealizedBy();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.structure.common.OperationService <em>Operation Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Service</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.OperationService
	 * @generated
	 */
	EClass getOperationService();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.structure.common.OperationService#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.OperationService#getParameters()
	 * @see #getOperationService()
	 * @generated
	 */
	EReference getOperationService_Parameters();

	/**
	 * Returns the meta object for the container reference '{@link org.obeonetwork.dsl.east_adl.structure.common.OperationService#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Interface</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.OperationService#getInterface()
	 * @see #getOperationService()
	 * @generated
	 */
	EReference getOperationService_Interface();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.structure.common.ServiceParameter <em>Service Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Parameter</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.ServiceParameter
	 * @generated
	 */
	EClass getServiceParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.structure.common.ServiceParameter#getModifier <em>Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modifier</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.ServiceParameter#getModifier()
	 * @see #getServiceParameter()
	 * @generated
	 */
	EAttribute getServiceParameter_Modifier();

	/**
	 * Returns the meta object for the container reference '{@link org.obeonetwork.dsl.east_adl.structure.common.ServiceParameter#getOwningService <em>Owning Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Service</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.ServiceParameter#getOwningService()
	 * @see #getServiceParameter()
	 * @generated
	 */
	EReference getServiceParameter_OwningService();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.structure.common.ServiceParameter#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Type</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.ServiceParameter#getDataType()
	 * @see #getServiceParameter()
	 * @generated
	 */
	EReference getServiceParameter_DataType();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.structure.common.OperationCall <em>Operation Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Call</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.OperationCall
	 * @generated
	 */
	EClass getOperationCall();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.structure.common.OperationCall#getReceiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receiver</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.OperationCall#getReceiver()
	 * @see #getOperationCall()
	 * @generated
	 */
	EReference getOperationCall_Receiver();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.structure.common.OperationCall#getEmitter <em>Emitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Emitter</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.OperationCall#getEmitter()
	 * @see #getOperationCall()
	 * @generated
	 */
	EReference getOperationCall_Emitter();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.structure.common.TypeAssociation <em>Type Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Association</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.TypeAssociation
	 * @generated
	 */
	EClass getTypeAssociation();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.structure.common.TypeAssociation#getScaleFactor <em>Scale Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale Factor</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.TypeAssociation#getScaleFactor()
	 * @see #getTypeAssociation()
	 * @generated
	 */
	EAttribute getTypeAssociation_ScaleFactor();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.east_adl.structure.common.TypeAssociation#getScaleOffset <em>Scale Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale Offset</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.TypeAssociation#getScaleOffset()
	 * @see #getTypeAssociation()
	 * @generated
	 */
	EAttribute getTypeAssociation_ScaleOffset();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.structure.common.TypeAssociation#getDesignDataType <em>Design Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Design Data Type</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.TypeAssociation#getDesignDataType()
	 * @see #getTypeAssociation()
	 * @generated
	 */
	EReference getTypeAssociation_DesignDataType();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.structure.common.TypeAssociation#getImplementationDataType <em>Implementation Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implementation Data Type</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.TypeAssociation#getImplementationDataType()
	 * @see #getTypeAssociation()
	 * @generated
	 */
	EReference getTypeAssociation_ImplementationDataType();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.structure.common.TypeAssociation#getProcessor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Processor</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.TypeAssociation#getProcessor()
	 * @see #getTypeAssociation()
	 * @generated
	 */
	EReference getTypeAssociation_Processor();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.structure.common.AllocatableEntity <em>Allocatable Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allocatable Entity</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.AllocatableEntity
	 * @generated
	 */
	EClass getAllocatableEntity();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.east_adl.structure.common.AllocatableEntity#getAllocation <em>Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Allocation</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.AllocatableEntity#getAllocation()
	 * @see #getAllocatableEntity()
	 * @generated
	 */
	EReference getAllocatableEntity_Allocation();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.structure.common.AllocatableEntity#getAllocationTarget <em>Allocation Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Allocation Target</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.AllocatableEntity#getAllocationTarget()
	 * @see #getAllocatableEntity()
	 * @generated
	 */
	EReference getAllocatableEntity_AllocationTarget();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.structure.common.AllocationConstraint <em>Allocation Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allocation Constraint</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.AllocationConstraint
	 * @generated
	 */
	EClass getAllocationConstraint();

	/**
	 * Returns the meta object for the container reference '{@link org.obeonetwork.dsl.east_adl.structure.common.AllocationConstraint#getAllocator <em>Allocator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Allocator</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.AllocationConstraint#getAllocator()
	 * @see #getAllocationConstraint()
	 * @generated
	 */
	EReference getAllocationConstraint_Allocator();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.east_adl.structure.common.AllocationConstraint#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.AllocationConstraint#getTarget()
	 * @see #getAllocationConstraint()
	 * @generated
	 */
	EReference getAllocationConstraint_Target();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.east_adl.structure.common.RealizingEntity <em>Realizing Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Realizing Entity</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.RealizingEntity
	 * @generated
	 */
	EClass getRealizingEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.east_adl.structure.common.RealizingEntity#getActiveRealizations <em>Active Realizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Active Realizations</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.RealizingEntity#getActiveRealizations()
	 * @see #getRealizingEntity()
	 * @generated
	 */
	EReference getRealizingEntity_ActiveRealizations();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.east_adl.structure.common.RealizingEntity#getRealizes <em>Realizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Realizes</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.RealizingEntity#getRealizes()
	 * @see #getRealizingEntity()
	 * @generated
	 */
	EReference getRealizingEntity_Realizes();

	/**
	 * Returns the meta object for enum '{@link org.obeonetwork.dsl.east_adl.structure.common.TriggerKind <em>Trigger Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Trigger Kind</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.TriggerKind
	 * @generated
	 */
	EEnum getTriggerKind();

	/**
	 * Returns the meta object for enum '{@link org.obeonetwork.dsl.east_adl.structure.common.DesignDataTypeKind <em>Design Data Type Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Design Data Type Kind</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.DesignDataTypeKind
	 * @generated
	 */
	EEnum getDesignDataTypeKind();

	/**
	 * Returns the meta object for enum '{@link org.obeonetwork.dsl.east_adl.structure.common.ImplementationDataTypeKind <em>Implementation Data Type Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Implementation Data Type Kind</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.ImplementationDataTypeKind
	 * @generated
	 */
	EEnum getImplementationDataTypeKind();

	/**
	 * Returns the meta object for enum '{@link org.obeonetwork.dsl.east_adl.structure.common.DirectionKind <em>Direction Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Direction Kind</em>'.
	 * @see org.obeonetwork.dsl.east_adl.structure.common.DirectionKind
	 * @generated
	 */
	EEnum getDirectionKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CommonFactory getCommonFactory();

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
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.common.impl.FunctionPortImpl <em>Function Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.FunctionPortImpl
		 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.CommonPackageImpl#getFunctionPort()
		 * @generated
		 */
		EClass FUNCTION_PORT = eINSTANCE.getFunctionPort();

		/**
		 * The meta object literal for the '<em><b>Provided</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_PORT__PROVIDED = eINSTANCE.getFunctionPort_Provided();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_PORT__INTERFACE = eINSTANCE.getFunctionPort_Interface();

		/**
		 * The meta object literal for the '<em><b>From Delay</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_PORT__FROM_DELAY = eINSTANCE.getFunctionPort_FromDelay();

		/**
		 * The meta object literal for the '<em><b>Until Delay</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_PORT__UNTIL_DELAY = eINSTANCE.getFunctionPort_UntilDelay();

		/**
		 * The meta object literal for the '<em><b>Period Restriction</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_PORT__PERIOD_RESTRICTION = eINSTANCE.getFunctionPort_PeriodRestriction();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_PORT__OWNER = eINSTANCE.getFunctionPort_Owner();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_PORT__PERIOD = eINSTANCE.getFunctionPort_Period();

		/**
		 * The meta object literal for the '<em><b>Transfer Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_PORT__TRANSFER_TIME = eINSTANCE.getFunctionPort_TransferTime();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.common.impl.SignalFunctionPortImpl <em>Signal Function Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.SignalFunctionPortImpl
		 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.CommonPackageImpl#getSignalFunctionPort()
		 * @generated
		 */
		EClass SIGNAL_FUNCTION_PORT = eINSTANCE.getSignalFunctionPort();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.common.impl.OperationFunctionPortImpl <em>Operation Function Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.OperationFunctionPortImpl
		 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.CommonPackageImpl#getOperationFunctionPort()
		 * @generated
		 */
		EClass OPERATION_FUNCTION_PORT = eINSTANCE.getOperationFunctionPort();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.common.impl.FunctionPortInterfaceImpl <em>Function Port Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.FunctionPortInterfaceImpl
		 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.CommonPackageImpl#getFunctionPortInterface()
		 * @generated
		 */
		EClass FUNCTION_PORT_INTERFACE = eINSTANCE.getFunctionPortInterface();

		/**
		 * The meta object literal for the '<em><b>Typed Port</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_PORT_INTERFACE__TYPED_PORT = eINSTANCE.getFunctionPortInterface_TypedPort();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.common.impl.SignalFunctionPortInterfaceImpl <em>Signal Function Port Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.SignalFunctionPortInterfaceImpl
		 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.CommonPackageImpl#getSignalFunctionPortInterface()
		 * @generated
		 */
		EClass SIGNAL_FUNCTION_PORT_INTERFACE = eINSTANCE.getSignalFunctionPortInterface();

		/**
		 * The meta object literal for the '<em><b>Emited Signals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_FUNCTION_PORT_INTERFACE__EMITED_SIGNALS = eINSTANCE.getSignalFunctionPortInterface_EmitedSignals();

		/**
		 * The meta object literal for the '<em><b>Received Signals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_FUNCTION_PORT_INTERFACE__RECEIVED_SIGNALS = eINSTANCE.getSignalFunctionPortInterface_ReceivedSignals();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.common.impl.OperationFunctionPortInterfaceImpl <em>Operation Function Port Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.OperationFunctionPortInterfaceImpl
		 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.CommonPackageImpl#getOperationFunctionPortInterface()
		 * @generated
		 */
		EClass OPERATION_FUNCTION_PORT_INTERFACE = eINSTANCE.getOperationFunctionPortInterface();

		/**
		 * The meta object literal for the '<em><b>Received Calls</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_FUNCTION_PORT_INTERFACE__RECEIVED_CALLS = eINSTANCE.getOperationFunctionPortInterface_ReceivedCalls();

		/**
		 * The meta object literal for the '<em><b>Emited Calls</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_FUNCTION_PORT_INTERFACE__EMITED_CALLS = eINSTANCE.getOperationFunctionPortInterface_EmitedCalls();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_FUNCTION_PORT_INTERFACE__SERVICES = eINSTANCE.getOperationFunctionPortInterface_Services();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.common.impl.ConnectorSignalImpl <em>Connector Signal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.ConnectorSignalImpl
		 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.CommonPackageImpl#getConnectorSignal()
		 * @generated
		 */
		EClass CONNECTOR_SIGNAL = eINSTANCE.getConnectorSignal();

		/**
		 * The meta object literal for the '<em><b>Emitter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_SIGNAL__EMITTER = eINSTANCE.getConnectorSignal_Emitter();

		/**
		 * The meta object literal for the '<em><b>Receiver</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_SIGNAL__RECEIVER = eINSTANCE.getConnectorSignal_Receiver();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_SIGNAL__DATA_TYPE = eINSTANCE.getConnectorSignal_DataType();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_SIGNAL__PERIOD = eINSTANCE.getConnectorSignal_Period();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_SIGNAL__INSTANCES = eINSTANCE.getConnectorSignal_Instances();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.common.impl.DesignDataTypeImpl <em>Design Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.DesignDataTypeImpl
		 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.CommonPackageImpl#getDesignDataType()
		 * @generated
		 */
		EClass DESIGN_DATA_TYPE = eINSTANCE.getDesignDataType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESIGN_DATA_TYPE__DESCRIPTION = eINSTANCE.getDesignDataType_Description();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESIGN_DATA_TYPE__DATA_TYPE = eINSTANCE.getDesignDataType_DataType();

		/**
		 * The meta object literal for the '<em><b>Typed Signals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_DATA_TYPE__TYPED_SIGNALS = eINSTANCE.getDesignDataType_TypedSignals();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESIGN_DATA_TYPE__UNIT = eINSTANCE.getDesignDataType_Unit();

		/**
		 * The meta object literal for the '<em><b>Resolution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESIGN_DATA_TYPE__RESOLUTION = eINSTANCE.getDesignDataType_Resolution();

		/**
		 * The meta object literal for the '<em><b>Physical Minimum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESIGN_DATA_TYPE__PHYSICAL_MINIMUM = eINSTANCE.getDesignDataType_PhysicalMinimum();

		/**
		 * The meta object literal for the '<em><b>Physical Maximum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESIGN_DATA_TYPE__PHYSICAL_MAXIMUM = eINSTANCE.getDesignDataType_PhysicalMaximum();

		/**
		 * The meta object literal for the '<em><b>Significant Digits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESIGN_DATA_TYPE__SIGNIFICANT_DIGITS = eINSTANCE.getDesignDataType_SignificantDigits();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESIGN_DATA_TYPE__DEFAULT_VALUE = eINSTANCE.getDesignDataType_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Typed Service Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_DATA_TYPE__TYPED_SERVICE_PARAMETERS = eINSTANCE.getDesignDataType_TypedServiceParameters();

		/**
		 * The meta object literal for the '<em><b>Type Associations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_DATA_TYPE__TYPE_ASSOCIATIONS = eINSTANCE.getDesignDataType_TypeAssociations();

		/**
		 * The meta object literal for the '<em><b>Typed Function Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_DATA_TYPE__TYPED_FUNCTION_PARAMETERS = eINSTANCE.getDesignDataType_TypedFunctionParameters();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.common.impl.ImplementationDataTypeImpl <em>Implementation Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.ImplementationDataTypeImpl
		 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.CommonPackageImpl#getImplementationDataType()
		 * @generated
		 */
		EClass IMPLEMENTATION_DATA_TYPE = eINSTANCE.getImplementationDataType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPLEMENTATION_DATA_TYPE__DESCRIPTION = eINSTANCE.getImplementationDataType_Description();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPLEMENTATION_DATA_TYPE__DATA_TYPE = eINSTANCE.getImplementationDataType_DataType();

		/**
		 * The meta object literal for the '<em><b>Implementation Minimum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPLEMENTATION_DATA_TYPE__IMPLEMENTATION_MINIMUM = eINSTANCE.getImplementationDataType_ImplementationMinimum();

		/**
		 * The meta object literal for the '<em><b>Implementation Maximum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPLEMENTATION_DATA_TYPE__IMPLEMENTATION_MAXIMUM = eINSTANCE.getImplementationDataType_ImplementationMaximum();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPLEMENTATION_DATA_TYPE__DEFAULT_VALUE = eINSTANCE.getImplementationDataType_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Type Associations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTATION_DATA_TYPE__TYPE_ASSOCIATIONS = eINSTANCE.getImplementationDataType_TypeAssociations();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.common.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.ParameterImpl
		 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.CommonPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Constant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__CONSTANT = eINSTANCE.getParameter_Constant();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__OWNER = eINSTANCE.getParameter_Owner();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__INSTANCES = eINSTANCE.getParameter_Instances();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__DATA_TYPE = eINSTANCE.getParameter_DataType();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__DIRECTION = eINSTANCE.getParameter_Direction();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.common.impl.RealizationImpl <em>Realization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.RealizationImpl
		 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.CommonPackageImpl#getRealization()
		 * @generated
		 */
		EClass REALIZATION = eINSTANCE.getRealization();

		/**
		 * The meta object literal for the '<em><b>Realized Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALIZATION__REALIZED_ENTITY = eINSTANCE.getRealization_RealizedEntity();

		/**
		 * The meta object literal for the '<em><b>Realizing Entity</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALIZATION__REALIZING_ENTITY = eINSTANCE.getRealization_RealizingEntity();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.common.impl.RealizedEntityImpl <em>Realized Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.RealizedEntityImpl
		 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.CommonPackageImpl#getRealizedEntity()
		 * @generated
		 */
		EClass REALIZED_ENTITY = eINSTANCE.getRealizedEntity();

		/**
		 * The meta object literal for the '<em><b>Passive Realizations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALIZED_ENTITY__PASSIVE_REALIZATIONS = eINSTANCE.getRealizedEntity_PassiveRealizations();

		/**
		 * The meta object literal for the '<em><b>Realized By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALIZED_ENTITY__REALIZED_BY = eINSTANCE.getRealizedEntity_RealizedBy();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.common.impl.OperationServiceImpl <em>Operation Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.OperationServiceImpl
		 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.CommonPackageImpl#getOperationService()
		 * @generated
		 */
		EClass OPERATION_SERVICE = eINSTANCE.getOperationService();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_SERVICE__PARAMETERS = eINSTANCE.getOperationService_Parameters();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_SERVICE__INTERFACE = eINSTANCE.getOperationService_Interface();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.common.impl.ServiceParameterImpl <em>Service Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.ServiceParameterImpl
		 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.CommonPackageImpl#getServiceParameter()
		 * @generated
		 */
		EClass SERVICE_PARAMETER = eINSTANCE.getServiceParameter();

		/**
		 * The meta object literal for the '<em><b>Modifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_PARAMETER__MODIFIER = eINSTANCE.getServiceParameter_Modifier();

		/**
		 * The meta object literal for the '<em><b>Owning Service</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_PARAMETER__OWNING_SERVICE = eINSTANCE.getServiceParameter_OwningService();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_PARAMETER__DATA_TYPE = eINSTANCE.getServiceParameter_DataType();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.common.impl.OperationCallImpl <em>Operation Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.OperationCallImpl
		 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.CommonPackageImpl#getOperationCall()
		 * @generated
		 */
		EClass OPERATION_CALL = eINSTANCE.getOperationCall();

		/**
		 * The meta object literal for the '<em><b>Receiver</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_CALL__RECEIVER = eINSTANCE.getOperationCall_Receiver();

		/**
		 * The meta object literal for the '<em><b>Emitter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_CALL__EMITTER = eINSTANCE.getOperationCall_Emitter();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.common.impl.TypeAssociationImpl <em>Type Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.TypeAssociationImpl
		 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.CommonPackageImpl#getTypeAssociation()
		 * @generated
		 */
		EClass TYPE_ASSOCIATION = eINSTANCE.getTypeAssociation();

		/**
		 * The meta object literal for the '<em><b>Scale Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_ASSOCIATION__SCALE_FACTOR = eINSTANCE.getTypeAssociation_ScaleFactor();

		/**
		 * The meta object literal for the '<em><b>Scale Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_ASSOCIATION__SCALE_OFFSET = eINSTANCE.getTypeAssociation_ScaleOffset();

		/**
		 * The meta object literal for the '<em><b>Design Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_ASSOCIATION__DESIGN_DATA_TYPE = eINSTANCE.getTypeAssociation_DesignDataType();

		/**
		 * The meta object literal for the '<em><b>Implementation Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_ASSOCIATION__IMPLEMENTATION_DATA_TYPE = eINSTANCE.getTypeAssociation_ImplementationDataType();

		/**
		 * The meta object literal for the '<em><b>Processor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_ASSOCIATION__PROCESSOR = eINSTANCE.getTypeAssociation_Processor();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.common.impl.AllocatableEntityImpl <em>Allocatable Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.AllocatableEntityImpl
		 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.CommonPackageImpl#getAllocatableEntity()
		 * @generated
		 */
		EClass ALLOCATABLE_ENTITY = eINSTANCE.getAllocatableEntity();

		/**
		 * The meta object literal for the '<em><b>Allocation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOCATABLE_ENTITY__ALLOCATION = eINSTANCE.getAllocatableEntity_Allocation();

		/**
		 * The meta object literal for the '<em><b>Allocation Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOCATABLE_ENTITY__ALLOCATION_TARGET = eINSTANCE.getAllocatableEntity_AllocationTarget();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.common.impl.AllocationConstraintImpl <em>Allocation Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.AllocationConstraintImpl
		 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.CommonPackageImpl#getAllocationConstraint()
		 * @generated
		 */
		EClass ALLOCATION_CONSTRAINT = eINSTANCE.getAllocationConstraint();

		/**
		 * The meta object literal for the '<em><b>Allocator</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOCATION_CONSTRAINT__ALLOCATOR = eINSTANCE.getAllocationConstraint_Allocator();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOCATION_CONSTRAINT__TARGET = eINSTANCE.getAllocationConstraint_Target();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.common.impl.RealizingEntityImpl <em>Realizing Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.RealizingEntityImpl
		 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.CommonPackageImpl#getRealizingEntity()
		 * @generated
		 */
		EClass REALIZING_ENTITY = eINSTANCE.getRealizingEntity();

		/**
		 * The meta object literal for the '<em><b>Active Realizations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALIZING_ENTITY__ACTIVE_REALIZATIONS = eINSTANCE.getRealizingEntity_ActiveRealizations();

		/**
		 * The meta object literal for the '<em><b>Realizes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALIZING_ENTITY__REALIZES = eINSTANCE.getRealizingEntity_Realizes();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.common.TriggerKind <em>Trigger Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.common.TriggerKind
		 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.CommonPackageImpl#getTriggerKind()
		 * @generated
		 */
		EEnum TRIGGER_KIND = eINSTANCE.getTriggerKind();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.common.DesignDataTypeKind <em>Design Data Type Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.common.DesignDataTypeKind
		 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.CommonPackageImpl#getDesignDataTypeKind()
		 * @generated
		 */
		EEnum DESIGN_DATA_TYPE_KIND = eINSTANCE.getDesignDataTypeKind();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.common.ImplementationDataTypeKind <em>Implementation Data Type Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.common.ImplementationDataTypeKind
		 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.CommonPackageImpl#getImplementationDataTypeKind()
		 * @generated
		 */
		EEnum IMPLEMENTATION_DATA_TYPE_KIND = eINSTANCE.getImplementationDataTypeKind();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.east_adl.structure.common.DirectionKind <em>Direction Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.east_adl.structure.common.DirectionKind
		 * @see org.obeonetwork.dsl.east_adl.structure.common.impl.CommonPackageImpl#getDirectionKind()
		 * @generated
		 */
		EEnum DIRECTION_KIND = eINSTANCE.getDirectionKind();

	}

} //CommonPackage
