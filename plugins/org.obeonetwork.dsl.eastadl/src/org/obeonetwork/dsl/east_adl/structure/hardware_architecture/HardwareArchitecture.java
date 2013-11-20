/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.hardware_architecture;

import org.eclipse.emf.common.util.EList;

import org.obeonetwork.dsl.east_adl.core.EASTADLArtifact;

import org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.FunctionalDesignArchitecture;

import org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hardware Architecture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity contains all entitites of a certain hardware architecture and is used to reference a particular hardware architecture.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.HardwareArchitecture#getPlatformModel <em>Platform Model</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.HardwareArchitecture#getHardwareEntities <em>Hardware Entities</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.HardwareArchitecture#getElectricalSignals <em>Electrical Signals</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.HardwareArchitecture#getWires <em>Wires</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.HardwareArchitecture#getDesignArchitecture <em>Design Architecture</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage#getHardwareArchitecture()
 * @model
 * @generated
 */
public interface HardwareArchitecture extends EASTADLArtifact {
	/**
	 * Returns the value of the '<em><b>Platform Model</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel#getHardwareArchitecture <em>Hardware Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the platform model defined for this hardware architecture.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Platform Model</em>' reference.
	 * @see #setPlatformModel(PlatformModel)
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage#getHardwareArchitecture_PlatformModel()
	 * @see org.obeonetwork.dsl.east_adl.structure.platform_model.PlatformModel#getHardwareArchitecture
	 * @model opposite="hardwareArchitecture"
	 * @generated
	 */
	PlatformModel getPlatformModel();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.HardwareArchitecture#getPlatformModel <em>Platform Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Platform Model</em>' reference.
	 * @see #getPlatformModel()
	 * @generated
	 */
	void setPlatformModel(PlatformModel value);

	/**
	 * Returns the value of the '<em><b>Hardware Entities</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.HardwareEntity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are hardware entities of this architecture.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hardware Entities</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage#getHardwareArchitecture_HardwareEntities()
	 * @model containment="true"
	 * @generated
	 */
	EList<HardwareEntity> getHardwareEntities();

	/**
	 * Returns the value of the '<em><b>Electrical Signals</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ElectricalSignal}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ElectricalSignal#getOwningArtifact <em>Owning Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are signals used in this hardware model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Electrical Signals</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage#getHardwareArchitecture_ElectricalSignals()
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ElectricalSignal#getOwningArtifact
	 * @model opposite="owningArtifact" containment="true"
	 * @generated
	 */
	EList<ElectricalSignal> getElectricalSignals();

	/**
	 * Returns the value of the '<em><b>Wires</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Wire}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Wire#getOwningArtifact <em>Owning Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are all the wires used in this hardware model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wires</em>' containment reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage#getHardwareArchitecture_Wires()
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Wire#getOwningArtifact
	 * @model opposite="owningArtifact" containment="true"
	 * @generated
	 */
	EList<Wire> getWires();

	/**
	 * Returns the value of the '<em><b>Design Architecture</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.FunctionalDesignArchitecture#getHardwareArchitecture <em>Hardware Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Design Architecture</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design Architecture</em>' reference.
	 * @see #setDesignArchitecture(FunctionalDesignArchitecture)
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage#getHardwareArchitecture_DesignArchitecture()
	 * @see org.obeonetwork.dsl.east_adl.structure.functional_design_architecture.FunctionalDesignArchitecture#getHardwareArchitecture
	 * @model opposite="hardwareArchitecture"
	 * @generated
	 */
	FunctionalDesignArchitecture getDesignArchitecture();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.HardwareArchitecture#getDesignArchitecture <em>Design Architecture</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Design Architecture</em>' reference.
	 * @see #getDesignArchitecture()
	 * @generated
	 */
	void setDesignArchitecture(FunctionalDesignArchitecture value);

} // HardwareArchitecture
