/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.verification_validation.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.east_adl.core.CorePackage;
import org.obeonetwork.dsl.east_adl.core.EASTADLArtifact;

import org.obeonetwork.dsl.east_adl.core.impl.EASTADLNamedElementImpl;

import org.obeonetwork.dsl.east_adl.verification_validation.VVCase;
import org.obeonetwork.dsl.east_adl.verification_validation.ValidatedEntity;
import org.obeonetwork.dsl.east_adl.verification_validation.VerdictKind;
import org.obeonetwork.dsl.east_adl.verification_validation.Verification_validationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VV Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.verification_validation.impl.VVCaseImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.verification_validation.impl.VVCaseImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.verification_validation.impl.VVCaseImpl#getVerdict <em>Verdict</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.verification_validation.impl.VVCaseImpl#getObjective <em>Objective</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.verification_validation.impl.VVCaseImpl#getOwningArtifact <em>Owning Artifact</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.verification_validation.impl.VVCaseImpl#getValidatedEntities <em>Validated Entities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class VVCaseImpl extends EASTADLNamedElementImpl implements VVCase {
	/**
	 * The default value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected String method = METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected static final String PURPOSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected String purpose = PURPOSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVerdict() <em>Verdict</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerdict()
	 * @generated
	 * @ordered
	 */
	protected static final VerdictKind VERDICT_EDEFAULT = VerdictKind.PASS;

	/**
	 * The cached value of the '{@link #getVerdict() <em>Verdict</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerdict()
	 * @generated
	 * @ordered
	 */
	protected VerdictKind verdict = VERDICT_EDEFAULT;

	/**
	 * The default value of the '{@link #getObjective() <em>Objective</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjective()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJECTIVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObjective() <em>Objective</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjective()
	 * @generated
	 * @ordered
	 */
	protected String objective = OBJECTIVE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValidatedEntities() <em>Validated Entities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidatedEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<ValidatedEntity> validatedEntities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VVCaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Verification_validationPackage.Literals.VV_CASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(String newMethod) {
		String oldMethod = method;
		method = newMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Verification_validationPackage.VV_CASE__METHOD, oldMethod, method));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPurpose() {
		return purpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPurpose(String newPurpose) {
		String oldPurpose = purpose;
		purpose = newPurpose;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Verification_validationPackage.VV_CASE__PURPOSE, oldPurpose, purpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerdictKind getVerdict() {
		return verdict;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerdict(VerdictKind newVerdict) {
		VerdictKind oldVerdict = verdict;
		verdict = newVerdict == null ? VERDICT_EDEFAULT : newVerdict;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Verification_validationPackage.VV_CASE__VERDICT, oldVerdict, verdict));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObjective() {
		return objective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjective(String newObjective) {
		String oldObjective = objective;
		objective = newObjective;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Verification_validationPackage.VV_CASE__OBJECTIVE, oldObjective, objective));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EASTADLArtifact getOwningArtifact() {
		if (eContainerFeatureID() != Verification_validationPackage.VV_CASE__OWNING_ARTIFACT) return null;
		return (EASTADLArtifact)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningArtifact(EASTADLArtifact newOwningArtifact, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningArtifact, Verification_validationPackage.VV_CASE__OWNING_ARTIFACT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningArtifact(EASTADLArtifact newOwningArtifact) {
		if (newOwningArtifact != eInternalContainer() || (eContainerFeatureID() != Verification_validationPackage.VV_CASE__OWNING_ARTIFACT && newOwningArtifact != null)) {
			if (EcoreUtil.isAncestor(this, newOwningArtifact))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningArtifact != null)
				msgs = ((InternalEObject)newOwningArtifact).eInverseAdd(this, CorePackage.EASTADL_ARTIFACT__VALIDATION_ENTITIES, EASTADLArtifact.class, msgs);
			msgs = basicSetOwningArtifact(newOwningArtifact, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Verification_validationPackage.VV_CASE__OWNING_ARTIFACT, newOwningArtifact, newOwningArtifact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValidatedEntity> getValidatedEntities() {
		if (validatedEntities == null) {
			validatedEntities = new EObjectWithInverseResolvingEList.ManyInverse<ValidatedEntity>(ValidatedEntity.class, this, Verification_validationPackage.VV_CASE__VALIDATED_ENTITIES, Verification_validationPackage.VALIDATED_ENTITY__VALIDATORS);
		}
		return validatedEntities;
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
			case Verification_validationPackage.VV_CASE__OWNING_ARTIFACT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningArtifact((EASTADLArtifact)otherEnd, msgs);
			case Verification_validationPackage.VV_CASE__VALIDATED_ENTITIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getValidatedEntities()).basicAdd(otherEnd, msgs);
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
			case Verification_validationPackage.VV_CASE__OWNING_ARTIFACT:
				return basicSetOwningArtifact(null, msgs);
			case Verification_validationPackage.VV_CASE__VALIDATED_ENTITIES:
				return ((InternalEList<?>)getValidatedEntities()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case Verification_validationPackage.VV_CASE__OWNING_ARTIFACT:
				return eInternalContainer().eInverseRemove(this, CorePackage.EASTADL_ARTIFACT__VALIDATION_ENTITIES, EASTADLArtifact.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Verification_validationPackage.VV_CASE__METHOD:
				return getMethod();
			case Verification_validationPackage.VV_CASE__PURPOSE:
				return getPurpose();
			case Verification_validationPackage.VV_CASE__VERDICT:
				return getVerdict();
			case Verification_validationPackage.VV_CASE__OBJECTIVE:
				return getObjective();
			case Verification_validationPackage.VV_CASE__OWNING_ARTIFACT:
				return getOwningArtifact();
			case Verification_validationPackage.VV_CASE__VALIDATED_ENTITIES:
				return getValidatedEntities();
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
			case Verification_validationPackage.VV_CASE__METHOD:
				setMethod((String)newValue);
				return;
			case Verification_validationPackage.VV_CASE__PURPOSE:
				setPurpose((String)newValue);
				return;
			case Verification_validationPackage.VV_CASE__VERDICT:
				setVerdict((VerdictKind)newValue);
				return;
			case Verification_validationPackage.VV_CASE__OBJECTIVE:
				setObjective((String)newValue);
				return;
			case Verification_validationPackage.VV_CASE__OWNING_ARTIFACT:
				setOwningArtifact((EASTADLArtifact)newValue);
				return;
			case Verification_validationPackage.VV_CASE__VALIDATED_ENTITIES:
				getValidatedEntities().clear();
				getValidatedEntities().addAll((Collection<? extends ValidatedEntity>)newValue);
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
			case Verification_validationPackage.VV_CASE__METHOD:
				setMethod(METHOD_EDEFAULT);
				return;
			case Verification_validationPackage.VV_CASE__PURPOSE:
				setPurpose(PURPOSE_EDEFAULT);
				return;
			case Verification_validationPackage.VV_CASE__VERDICT:
				setVerdict(VERDICT_EDEFAULT);
				return;
			case Verification_validationPackage.VV_CASE__OBJECTIVE:
				setObjective(OBJECTIVE_EDEFAULT);
				return;
			case Verification_validationPackage.VV_CASE__OWNING_ARTIFACT:
				setOwningArtifact((EASTADLArtifact)null);
				return;
			case Verification_validationPackage.VV_CASE__VALIDATED_ENTITIES:
				getValidatedEntities().clear();
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
			case Verification_validationPackage.VV_CASE__METHOD:
				return METHOD_EDEFAULT == null ? method != null : !METHOD_EDEFAULT.equals(method);
			case Verification_validationPackage.VV_CASE__PURPOSE:
				return PURPOSE_EDEFAULT == null ? purpose != null : !PURPOSE_EDEFAULT.equals(purpose);
			case Verification_validationPackage.VV_CASE__VERDICT:
				return verdict != VERDICT_EDEFAULT;
			case Verification_validationPackage.VV_CASE__OBJECTIVE:
				return OBJECTIVE_EDEFAULT == null ? objective != null : !OBJECTIVE_EDEFAULT.equals(objective);
			case Verification_validationPackage.VV_CASE__OWNING_ARTIFACT:
				return getOwningArtifact() != null;
			case Verification_validationPackage.VV_CASE__VALIDATED_ENTITIES:
				return validatedEntities != null && !validatedEntities.isEmpty();
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
		result.append(" (method: ");
		result.append(method);
		result.append(", purpose: ");
		result.append(purpose);
		result.append(", verdict: ");
		result.append(verdict);
		result.append(", objective: ");
		result.append(objective);
		result.append(')');
		return result.toString();
	}

} //VVCaseImpl
