/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture;

import org.eclipse.emf.common.util.EList;

import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Actuator;
import org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Sensor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.EnvironmentFunction#getActuators <em>Actuators</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.EnvironmentFunction#getSensors <em>Sensors</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.Functional_analysis_architecturePackage#getEnvironmentFunction()
 * @model
 * @generated
 */
public interface EnvironmentFunction extends AnalysisFunction {
	/**
	 * Returns the value of the '<em><b>Actuators</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Actuator}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Actuator#getActuatorModel <em>Actuator Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actuators</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuators</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.Functional_analysis_architecturePackage#getEnvironmentFunction_Actuators()
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Actuator#getActuatorModel
	 * @model opposite="actuatorModel"
	 * @generated
	 */
	EList<Actuator> getActuators();

	/**
	 * Returns the value of the '<em><b>Sensors</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Sensor}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Sensor#getSensorModel <em>Sensor Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensors</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.Functional_analysis_architecturePackage#getEnvironmentFunction_Sensors()
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Sensor#getSensorModel
	 * @model opposite="sensorModel"
	 * @generated
	 */
	EList<Sensor> getSensors();

} // EnvironmentFunction
