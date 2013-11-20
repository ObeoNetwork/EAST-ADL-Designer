/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.requirements.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.east_adl.requirements.Constraint;
import org.obeonetwork.dsl.east_adl.requirements.DesignConstraint;
import org.obeonetwork.dsl.east_adl.requirements.DesignConstraintKind;
import org.obeonetwork.dsl.east_adl.requirements.RequirementsPackage;

import org.obeonetwork.dsl.east_adl.structure.vehicle_feature_model.EFeature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Design Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.impl.DesignConstraintImpl#getDesignConstraintType <em>Design Constraint Type</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.impl.DesignConstraintImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.requirements.impl.DesignConstraintImpl#getConstrainedEFeatures <em>Constrained EFeatures</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DesignConstraintImpl extends RequirementImpl implements DesignConstraint {
	/**
	 * The default value of the '{@link #getDesignConstraintType() <em>Design Constraint Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignConstraintType()
	 * @generated
	 * @ordered
	 */
	protected static final DesignConstraintKind DESIGN_CONSTRAINT_TYPE_EDEFAULT = DesignConstraintKind.COST;

	/**
	 * The cached value of the '{@link #getDesignConstraintType() <em>Design Constraint Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignConstraintType()
	 * @generated
	 * @ordered
	 */
	protected DesignConstraintKind designConstraintType = DESIGN_CONSTRAINT_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> constraints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DesignConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementsPackage.Literals.DESIGN_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignConstraintKind getDesignConstraintType() {
		return designConstraintType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesignConstraintType(DesignConstraintKind newDesignConstraintType) {
		DesignConstraintKind oldDesignConstraintType = designConstraintType;
		designConstraintType = newDesignConstraintType == null ? DESIGN_CONSTRAINT_TYPE_EDEFAULT : newDesignConstraintType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.DESIGN_CONSTRAINT__DESIGN_CONSTRAINT_TYPE, oldDesignConstraintType, designConstraintType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentWithInverseEList<Constraint>(Constraint.class, this, RequirementsPackage.DESIGN_CONSTRAINT__CONSTRAINTS, RequirementsPackage.CONSTRAINT__CONSTRAINT);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EFeature> getConstrainedEFeatures() {
		// TODO: implement this method to return the 'Constrained EFeatures' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RequirementsPackage.DESIGN_CONSTRAINT__CONSTRAINTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConstraints()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RequirementsPackage.DESIGN_CONSTRAINT__CONSTRAINTS:
				return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RequirementsPackage.DESIGN_CONSTRAINT__DESIGN_CONSTRAINT_TYPE:
				return getDesignConstraintType();
			case RequirementsPackage.DESIGN_CONSTRAINT__CONSTRAINTS:
				return getConstraints();
			case RequirementsPackage.DESIGN_CONSTRAINT__CONSTRAINED_EFEATURES:
				return getConstrainedEFeatures();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RequirementsPackage.DESIGN_CONSTRAINT__DESIGN_CONSTRAINT_TYPE:
				setDesignConstraintType((DesignConstraintKind)newValue);
				return;
			case RequirementsPackage.DESIGN_CONSTRAINT__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends Constraint>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RequirementsPackage.DESIGN_CONSTRAINT__DESIGN_CONSTRAINT_TYPE:
				setDesignConstraintType(DESIGN_CONSTRAINT_TYPE_EDEFAULT);
				return;
			case RequirementsPackage.DESIGN_CONSTRAINT__CONSTRAINTS:
				getConstraints().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RequirementsPackage.DESIGN_CONSTRAINT__DESIGN_CONSTRAINT_TYPE:
				return designConstraintType != DESIGN_CONSTRAINT_TYPE_EDEFAULT;
			case RequirementsPackage.DESIGN_CONSTRAINT__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
			case RequirementsPackage.DESIGN_CONSTRAINT__CONSTRAINED_EFEATURES:
				return !getConstrainedEFeatures().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (designConstraintType: ");
		result.append(designConstraintType);
		result.append(')');
		return result.toString();
	}

} //DesignConstraintImpl
