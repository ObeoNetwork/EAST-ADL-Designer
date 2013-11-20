/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.common;

import org.obeonetwork.dsl.east_adl.core.EASTADLEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Port Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is an abstract entity describing an interface for interaction through a function port.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.common.FunctionPortInterface#getTypedPort <em>Typed Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getFunctionPortInterface()
 * @model abstract="true"
 * @generated
 */
public interface FunctionPortInterface extends EASTADLEntity {
	/**
	 * Returns the value of the '<em><b>Typed Port</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.structure.common.FunctionPort#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the typed port of this interface.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Typed Port</em>' container reference.
	 * @see #setTypedPort(FunctionPort)
	 * @see org.obeonetwork.dsl.east_adl.structure.common.CommonPackage#getFunctionPortInterface_TypedPort()
	 * @see org.obeonetwork.dsl.east_adl.structure.common.FunctionPort#getInterface
	 * @model opposite="interface" required="true" transient="false"
	 * @generated
	 */
	FunctionPort getTypedPort();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.common.FunctionPortInterface#getTypedPort <em>Typed Port</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typed Port</em>' container reference.
	 * @see #getTypedPort()
	 * @generated
	 */
	void setTypedPort(FunctionPort value);

} // FunctionPortInterface
