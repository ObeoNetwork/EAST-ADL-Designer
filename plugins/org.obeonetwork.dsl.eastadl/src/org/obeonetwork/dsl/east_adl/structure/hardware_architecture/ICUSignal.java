/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.hardware_architecture;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ICU Signal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ICUSignal#getMeasurementMode <em>Measurement Mode</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ICUSignal#getDefaultStartEdge <em>Default Start Edge</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ICUSignal#getAdditionalData <em>Additional Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage#getICUSignal()
 * @model
 * @generated
 */
public interface ICUSignal extends PWMSignal {
	/**
	 * Returns the value of the '<em><b>Measurement Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ICUMeasurementKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurement Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurement Mode</em>' attribute.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ICUMeasurementKind
	 * @see #setMeasurementMode(ICUMeasurementKind)
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage#getICUSignal_MeasurementMode()
	 * @model
	 * @generated
	 */
	ICUMeasurementKind getMeasurementMode();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ICUSignal#getMeasurementMode <em>Measurement Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measurement Mode</em>' attribute.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ICUMeasurementKind
	 * @see #getMeasurementMode()
	 * @generated
	 */
	void setMeasurementMode(ICUMeasurementKind value);

	/**
	 * Returns the value of the '<em><b>Default Start Edge</b></em>' attribute.
	 * The literals are from the enumeration {@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.EdgeKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Start Edge</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Start Edge</em>' attribute.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.EdgeKind
	 * @see #setDefaultStartEdge(EdgeKind)
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage#getICUSignal_DefaultStartEdge()
	 * @model
	 * @generated
	 */
	EdgeKind getDefaultStartEdge();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ICUSignal#getDefaultStartEdge <em>Default Start Edge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Start Edge</em>' attribute.
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.EdgeKind
	 * @see #getDefaultStartEdge()
	 * @generated
	 */
	void setDefaultStartEdge(EdgeKind value);

	/**
	 * Returns the value of the '<em><b>Additional Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additional Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Data</em>' attribute.
	 * @see #setAdditionalData(String)
	 * @see org.obeonetwork.dsl.east_adl.structure.hardware_architecture.Hardware_architecturePackage#getICUSignal_AdditionalData()
	 * @model
	 * @generated
	 */
	String getAdditionalData();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.structure.hardware_architecture.ICUSignal#getAdditionalData <em>Additional Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Data</em>' attribute.
	 * @see #getAdditionalData()
	 * @generated
	 */
	void setAdditionalData(String value);

} // ICUSignal
