/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.hardware_architecture;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Memory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is the RAM/ROM used by a processor.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Memory#getMemoryType <em>Memory Type</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Memory#getSize <em>Size</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Memory#getOwningECU <em>Owning ECU</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Memory#getUsingProcessors <em>Using Processors</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage#getMemory()
 * @model
 * @generated
 */
public interface Memory extends HardwareEntity {
	/**
	 * Returns the value of the '<em><b>Memory Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.MemoryKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the type of the memory (RAM or ROM).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Memory Type</em>' attribute.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.MemoryKind
	 * @see #setMemoryType(MemoryKind)
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage#getMemory_MemoryType()
	 * @model
	 * @generated
	 */
	MemoryKind getMemoryType();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Memory#getMemoryType <em>Memory Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Type</em>' attribute.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.MemoryKind
	 * @see #getMemoryType()
	 * @generated
	 */
	void setMemoryType(MemoryKind value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the size of the memory in KB.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage#getMemory_Size()
	 * @model
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Memory#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

	/**
	 * Returns the value of the '<em><b>Owning ECU</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ECU#getMemory <em>Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the ECU owning this memory.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning ECU</em>' container reference.
	 * @see #setOwningECU(ECU)
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage#getMemory_OwningECU()
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ECU#getMemory
	 * @model opposite="memory" required="true" transient="false"
	 * @generated
	 */
	ECU getOwningECU();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Memory#getOwningECU <em>Owning ECU</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning ECU</em>' container reference.
	 * @see #getOwningECU()
	 * @generated
	 */
	void setOwningECU(ECU value);

	/**
	 * Returns the value of the '<em><b>Using Processors</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor#getUsedMemory <em>Used Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These are processors using this memory.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Using Processors</em>' reference list.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage#getMemory_UsingProcessors()
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Processor#getUsedMemory
	 * @model opposite="usedMemory"
	 * @generated
	 */
	EList<Processor> getUsingProcessors();

} // Memory
