/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.east_adl.core.impl.EASTADLEntityImpl;

import org.obeonetwork.dsl.east_adl.structure.common.CommonPackage;
import org.obeonetwork.dsl.east_adl.structure.common.FunctionPort;
import org.obeonetwork.dsl.east_adl.structure.common.Parameter;
import org.obeonetwork.dsl.east_adl.structure.common.Realization;
import org.obeonetwork.dsl.east_adl.structure.common.RealizedEntity;
import org.obeonetwork.dsl.east_adl.structure.common.RealizingEntity;

import org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.AnalysisFunction;
import org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.FunctionalAnalysisArchitecture;
import org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.FunctionalDevice;
import org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.Functional_analysis_architecturePackage;

import org.obeonetwork.dsl.east_adl.verification_validation.VVCase;
import org.obeonetwork.dsl.east_adl.verification_validation.ValidatedEntity;
import org.obeonetwork.dsl.east_adl.verification_validation.Verification_validationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functional Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl.FunctionalDeviceImpl#getPassiveRealizations <em>Passive Realizations</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl.FunctionalDeviceImpl#getRealizedBy <em>Realized By</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl.FunctionalDeviceImpl#getValidators <em>Validators</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl.FunctionalDeviceImpl#getOwningArtifact <em>Owning Artifact</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl.FunctionalDeviceImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl.FunctionalDeviceImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.functional_analysis_architecture.impl.FunctionalDeviceImpl#getOwningFunction <em>Owning Function</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionalDeviceImpl extends EASTADLEntityImpl implements FunctionalDevice {
	/**
	 * The cached value of the '{@link #getPassiveRealizations() <em>Passive Realizations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassiveRealizations()
	 * @generated
	 * @ordered
	 */
	protected EList<Realization> passiveRealizations;

	/**
	 * The cached value of the '{@link #getValidators() <em>Validators</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidators()
	 * @generated
	 * @ordered
	 */
	protected EList<VVCase> validators;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionPort> ports;

	/**
	 * The cached value of the '{@link #getOwningFunction() <em>Owning Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningFunction()
	 * @generated
	 * @ordered
	 */
	protected AnalysisFunction owningFunction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionalDeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Functional_analysis_architecturePackage.Literals.FUNCTIONAL_DEVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Realization> getPassiveRealizations() {
		if (passiveRealizations == null) {
			passiveRealizations = new EObjectWithInverseResolvingEList<Realization>(Realization.class, this, Functional_analysis_architecturePackage.FUNCTIONAL_DEVICE__PASSIVE_REALIZATIONS, CommonPackage.REALIZATION__REALIZED_ENTITY);
		}
		return passiveRealizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RealizingEntity> getRealizedBy() {
		// TODO: implement this method to return the 'Realized By' reference list
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
	public EList<VVCase> getValidators() {
		if (validators == null) {
			validators = new EObjectWithInverseResolvingEList.ManyInverse<VVCase>(VVCase.class, this, Functional_analysis_architecturePackage.FUNCTIONAL_DEVICE__VALIDATORS, Verification_validationPackage.VV_CASE__VALIDATED_ENTITIES);
		}
		return validators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalAnalysisArchitecture getOwningArtifact() {
		if (eContainerFeatureID() != Functional_analysis_architecturePackage.FUNCTIONAL_DEVICE__OWNING_ARTIFACT) return null;
		return (FunctionalAnalysisArchitecture)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningArtifact(FunctionalAnalysisArchitecture newOwningArtifact, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningArtifact, Functional_analysis_architecturePackage.FUNCTIONAL_DEVICE__OWNING_ARTIFACT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningArtifact(FunctionalAnalysisArchitecture newOwningArtifact) {
		if (newOwningArtifact != eInternalContainer() || (eContainerFeatureID() != Functional_analysis_architecturePackage.FUNCTIONAL_DEVICE__OWNING_ARTIFACT && newOwningArtifact != null)) {
			if (EcoreUtil.isAncestor(this, newOwningArtifact))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningArtifact != null)
				msgs = ((InternalEObject)newOwningArtifact).eInverseAdd(this, Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__FUNCTIONAL_DEVICES, FunctionalAnalysisArchitecture.class, msgs);
			msgs = basicSetOwningArtifact(newOwningArtifact, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Functional_analysis_architecturePackage.FUNCTIONAL_DEVICE__OWNING_ARTIFACT, newOwningArtifact, newOwningArtifact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, Functional_analysis_architecturePackage.FUNCTIONAL_DEVICE__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionPort> getPorts() {
		if (ports == null) {
			ports = new EObjectContainmentEList<FunctionPort>(FunctionPort.class, this, Functional_analysis_architecturePackage.FUNCTIONAL_DEVICE__PORTS);
		}
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisFunction getOwningFunction() {
		return owningFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningFunction(AnalysisFunction newOwningFunction, NotificationChain msgs) {
		AnalysisFunction oldOwningFunction = owningFunction;
		owningFunction = newOwningFunction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Functional_analysis_architecturePackage.FUNCTIONAL_DEVICE__OWNING_FUNCTION, oldOwningFunction, newOwningFunction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningFunction(AnalysisFunction newOwningFunction) {
		if (newOwningFunction != owningFunction) {
			NotificationChain msgs = null;
			if (owningFunction != null)
				msgs = ((InternalEObject)owningFunction).eInverseRemove(this, Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__FUNCTIONAL_DEVICES, AnalysisFunction.class, msgs);
			if (newOwningFunction != null)
				msgs = ((InternalEObject)newOwningFunction).eInverseAdd(this, Functional_analysis_architecturePackage.ANALYSIS_FUNCTION__FUNCTIONAL_DEVICES, AnalysisFunction.class, msgs);
			msgs = basicSetOwningFunction(newOwningFunction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Functional_analysis_architecturePackage.FUNCTIONAL_DEVICE__OWNING_FUNCTION, newOwningFunction, newOwningFunction));
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
			case Functional_analysis_architecturePackage.FUNCTIONAL_DEVICE__PASSIVE_REALIZATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPassiveRealizations()).basicAdd(otherEnd, msgs);
			case Functional_analysis_architecturePackage.FUNCTIONAL_DEVICE__VALIDATORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getValidators()).basicAdd(otherEnd, msgs);
			case Functional_analysis_architecturePackage.FUNCTIONAL_DEVICE__OWNING_ARTIFACT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningArtifact((FunctionalAnalysisArchitecture)otherEnd, msgs);
			case Functional_analysis_architecturePackage.FUNCTIONAL_DEVICE__OWNING_FUNCTION:
				if (owningFunction != null)
					msgs = ((InternalEObject)owningFunction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Functional_analysis_architecturePackage.FUNCTIONAL_DEVICE__OWNING_FUNCTION, null, msgs);
				return basicSetOwningFunction((AnalysisFunction)otherEnd, msgs);
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
			case Functional_analysis_architecturePackage.FUNCTIONAL_DEVICE__PASSIVE_REALIZATIONS:
				return ((InternalEList<?>)getPassiveRealizations()).basicRemove(otherEnd, msgs);
			case Functional_analysis_architecturePackage.FUNCTIONAL_DEVICE__VALIDATORS:
				return ((InternalEList<?>)getValidators()).basicRemove(otherEnd, msgs);
			case Functional_analysis_architecturePackage.FUNCTIONAL_DEVICE__OWNING_ARTIFACT:
				return basicSetOwningArtifact(null, msgs);
			case Functional_analysis_architecturePackage.FUNCTIONAL_DEVICE__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case Functional_analysis_architecturePackage.FUNCTIONAL_DEVICE__PORTS:
				return ((InternalEList<?>)getPorts()).basicRemove(otherEnd, msgs);
			case Functional_analysis_architecturePackage.FUNCTIONAL_DEVICE__OWNING_FUNCTION:
				return basicSetOwningFunction(null, msgs);
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
			case Functional_analysis_architecturePackage.FUNCTIONAL_DEVICE__OWNING_ARTIFACT:
				return eInternalContainer().eInverseRemove(this, Functional_analysis_architecturePackage.FUNCTIONAL_ANALYSIS_ARCHITECTURE__FUNCTIONAL_DEVICES, FunctionalAnalysisArchitecture.class, msgs);
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
			case Functional_analysis_architecturePackage.FUNCTIONAL_DEVICE__PASSIVE_REALIZATIONS:
				return getPassiveRealizations();
			case Functional_analysis_architecturePackage.FUNCTIONAL_DEVICE__REALIZED_BY:
				return getRealizedBy();
			case Functional_analysis_architecturePackage.FUNCTIONAL_DEVICE__VALIDATORS:
				return getValidators();
			case Functional_analysis_architecturePackage.FUNCTIONAL_DEVICE__OWNING_ARTIFACT:
				return getOwningArtifact();
			case Functional_analysis_architecturePackage.FUNCTIONAL_DEVICE__PARAMETERS:
				return getParameters();
			case Functional_analysis_architecturePackage.FUNCTIONAL_DEVICE__PORTS:
				return getPorts();
			case Functional_analysis_architecturePackage.FUNCTIONAL_DEVICE__OWNING_FUNCTION:
				return getOwningFunction();
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
			case Functional_analysis_architecturePackage.FUNCTIONAL_DEVICE__PASSIVE_REALIZATIONS:
				getPassiveRealizations().clear();
				getPassiveRealizations().addAll((Collection<? extends Realization>)newValue);
				return;
			case Functional_analysis_architecturePackage.FUNCTIONAL_DEVICE__VALIDATORS:
				getValidators().clear();
				getValidators().addAll((Collection<? extends VVCase>)newValue);
				return;
			case Functional_analysis_architecturePackage.FUNCTIONAL_DEVICE__OWNING_ARTIFACT:
				setOwningArtifact((FunctionalAnalysisArchitecture)newValue);
				return;
			case Functional_analysis_architecturePackage.FUNCTIONAL_DEVICE__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case Functional_analysis_architecturePackage.FUNCTIONAL_DEVICE__PORTS:
				getPorts().clear();
				getPorts().addAll((Collection<? extends FunctionPort>)newValue);
				return;
			case Functional_analysis_architecturePackage.FUNCTIONAL_DEVICE__OWNING_FUNCTION:
				setOwningFunction((AnalysisFunction)newValue);
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
			case Functional_analysis_architecturePackage.FUNCTIONAL_DEVICE__PASSIVE_REALIZATIONS:
				getPassiveRealizations().clear();
				return;
			case Functional_analysis_architecturePackage.FUNCTIONAL_DEVICE__VALIDATORS:
				getValidators().clear();
				return;
			case Functional_analysis_architecturePackage.FUNCTIONAL_DEVICE__OWNING_ARTIFACT:
				setOwningArtifact((FunctionalAnalysisArchitecture)null);
				return;
			case Functional_analysis_architecturePackage.FUNCTIONAL_DEVICE__PARAMETERS:
				getParameters().clear();
				return;
			case Functional_analysis_architecturePackage.FUNCTIONAL_DEVICE__PORTS:
				getPorts().clear();
				return;
			case Functional_analysis_architecturePackage.FUNCTIONAL_DEVICE__OWNING_FUNCTION:
				setOwningFunction((AnalysisFunction)null);
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
			case Functional_analysis_architecturePackage.FUNCTIONAL_DEVICE__PASSIVE_REALIZATIONS:
				return passiveRealizations != null && !passiveRealizations.isEmpty();
			case Functional_analysis_architecturePackage.FUNCTIONAL_DEVICE__REALIZED_BY:
				return !getRealizedBy().isEmpty();
			case Functional_analysis_architecturePackage.FUNCTIONAL_DEVICE__VALIDATORS:
				return validators != null && !validators.isEmpty();
			case Functional_analysis_architecturePackage.FUNCTIONAL_DEVICE__OWNING_ARTIFACT:
				return getOwningArtifact() != null;
			case Functional_analysis_architecturePackage.FUNCTIONAL_DEVICE__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case Functional_analysis_architecturePackage.FUNCTIONAL_DEVICE__PORTS:
				return ports != null && !ports.isEmpty();
			case Functional_analysis_architecturePackage.FUNCTIONAL_DEVICE__OWNING_FUNCTION:
				return owningFunction != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == RealizedEntity.class) {
			switch (derivedFeatureID) {
				case Functional_analysis_architecturePackage.FUNCTIONAL_DEVICE__PASSIVE_REALIZATIONS: return CommonPackage.REALIZED_ENTITY__PASSIVE_REALIZATIONS;
				case Functional_analysis_architecturePackage.FUNCTIONAL_DEVICE__REALIZED_BY: return CommonPackage.REALIZED_ENTITY__REALIZED_BY;
				default: return -1;
			}
		}
		if (baseClass == ValidatedEntity.class) {
			switch (derivedFeatureID) {
				case Functional_analysis_architecturePackage.FUNCTIONAL_DEVICE__VALIDATORS: return Verification_validationPackage.VALIDATED_ENTITY__VALIDATORS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == RealizedEntity.class) {
			switch (baseFeatureID) {
				case CommonPackage.REALIZED_ENTITY__PASSIVE_REALIZATIONS: return Functional_analysis_architecturePackage.FUNCTIONAL_DEVICE__PASSIVE_REALIZATIONS;
				case CommonPackage.REALIZED_ENTITY__REALIZED_BY: return Functional_analysis_architecturePackage.FUNCTIONAL_DEVICE__REALIZED_BY;
				default: return -1;
			}
		}
		if (baseClass == ValidatedEntity.class) {
			switch (baseFeatureID) {
				case Verification_validationPackage.VALIDATED_ENTITY__VALIDATORS: return Functional_analysis_architecturePackage.FUNCTIONAL_DEVICE__VALIDATORS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //FunctionalDeviceImpl
