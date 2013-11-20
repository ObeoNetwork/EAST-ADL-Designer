/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.behavior;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity represents behavior defined in an external tool such as Simulink or Statemate.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.behavior.ExternalBehavior#getRepresentation <em>Representation</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.behavior.ExternalBehavior#getPath <em>Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.behavior.BehaviorPackage#getExternalBehavior()
 * @model
 * @generated
 */
public interface ExternalBehavior extends Behavior {
	/**
	 * Returns the value of the '<em><b>Representation</b></em>' attribute.
	 * The literals are from the enumeration {@link org.obeonetwork.dsl.east_adl.behavior.ExternalBehaviorKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the type of this external behavior.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Representation</em>' attribute.
	 * @see org.obeonetwork.dsl.east_adl.behavior.ExternalBehaviorKind
	 * @see #setRepresentation(ExternalBehaviorKind)
	 * @see org.obeonetwork.dsl.east_adl.behavior.BehaviorPackage#getExternalBehavior_Representation()
	 * @model
	 * @generated
	 */
	ExternalBehaviorKind getRepresentation();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.behavior.ExternalBehavior#getRepresentation <em>Representation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Representation</em>' attribute.
	 * @see org.obeonetwork.dsl.east_adl.behavior.ExternalBehaviorKind
	 * @see #getRepresentation()
	 * @generated
	 */
	void setRepresentation(ExternalBehaviorKind value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the path to the file or model entity containing this behavior.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see org.obeonetwork.dsl.east_adl.behavior.BehaviorPackage#getExternalBehavior_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.behavior.ExternalBehavior#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

} // ExternalBehavior
