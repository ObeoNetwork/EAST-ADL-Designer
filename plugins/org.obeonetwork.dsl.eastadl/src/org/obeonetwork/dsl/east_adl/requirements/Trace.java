/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.requirements;

import org.obeonetwork.dsl.east_adl.core.EASTADLNamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is a relationship used to link requirements so that a traceability between them can be formally expressed.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.Trace#getTracer <em>Tracer</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.Trace#getTraced <em>Traced</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage#getTrace()
 * @model annotation="http://www.topcased.org/documentation documentation='This is the only entity that i found interesting from sysml requirements concept.'"
 * @generated
 */
public interface Trace extends EASTADLNamedElement {
	/**
	 * Returns the value of the '<em><b>Tracer</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.requirements.Requirement#getActiveTraces <em>Active Traces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the actual requirement tracing the traced element of this entity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tracer</em>' container reference.
	 * @see #setTracer(Requirement)
	 * @see org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage#getTrace_Tracer()
	 * @see org.obeonetwork.dsl.east_adl.requirements.Requirement#getActiveTraces
	 * @model opposite="activeTraces" required="true" transient="false"
	 * @generated
	 */
	Requirement getTracer();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.requirements.Trace#getTracer <em>Tracer</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tracer</em>' container reference.
	 * @see #getTracer()
	 * @generated
	 */
	void setTracer(Requirement value);

	/**
	 * Returns the value of the '<em><b>Traced</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.east_adl.requirements.Requirement#getPassiveTraces <em>Passive Traces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the requirement traced by the tracer of this entity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Traced</em>' reference.
	 * @see #setTraced(Requirement)
	 * @see org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage#getTrace_Traced()
	 * @see org.obeonetwork.dsl.east_adl.requirements.Requirement#getPassiveTraces
	 * @model opposite="passiveTraces"
	 * @generated
	 */
	Requirement getTraced();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.east_adl.requirements.Trace#getTraced <em>Traced</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Traced</em>' reference.
	 * @see #getTraced()
	 * @generated
	 */
	void setTraced(Requirement value);

} // Trace
