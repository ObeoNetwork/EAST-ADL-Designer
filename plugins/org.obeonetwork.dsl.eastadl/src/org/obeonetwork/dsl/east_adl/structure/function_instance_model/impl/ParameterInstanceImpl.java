/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl;

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

import org.obeonetwork.dsl.east_adl.core.impl.EASTADLEntityImpl;

import org.obeonetwork.dsl.east_adl.structure.common.CommonPackage;
import org.obeonetwork.dsl.east_adl.structure.common.Parameter;

import org.obeonetwork.dsl.east_adl.structure.function_instance_model.FunctionInstance;
import org.obeonetwork.dsl.east_adl.structure.function_instance_model.Function_instance_modelPackage;
import org.obeonetwork.dsl.east_adl.structure.function_instance_model.ParameterInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.ParameterInstanceImpl#getInstantiatedParameter <em>Instantiated Parameter</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.ParameterInstanceImpl#getOwningFunction <em>Owning Function</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.east_adl.structure.function_instance_model.impl.ParameterInstanceImpl#getReferencingFunctions <em>Referencing Functions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterInstanceImpl extends EASTADLEntityImpl implements ParameterInstance {
	/**
	 * The cached value of the '{@link #getInstantiatedParameter() <em>Instantiated Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantiatedParameter()
	 * @generated
	 * @ordered
	 */
	protected Parameter instantiatedParameter;

	/**
	 * The cached value of the '{@link #getReferencingFunctions() <em>Referencing Functions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencingFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionInstance> referencingFunctions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Function_instance_modelPackage.Literals.PARAMETER_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getInstantiatedParameter() {
		if (instantiatedParameter != null && instantiatedParameter.eIsProxy()) {
			InternalEObject oldInstantiatedParameter = (InternalEObject)instantiatedParameter;
			instantiatedParameter = (Parameter)eResolveProxy(oldInstantiatedParameter);
			if (instantiatedParameter != oldInstantiatedParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Function_instance_modelPackage.PARAMETER_INSTANCE__INSTANTIATED_PARAMETER, oldInstantiatedParameter, instantiatedParameter));
			}
		}
		return instantiatedParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter basicGetInstantiatedParameter() {
		return instantiatedParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstantiatedParameter(Parameter newInstantiatedParameter, NotificationChain msgs) {
		Parameter oldInstantiatedParameter = instantiatedParameter;
		instantiatedParameter = newInstantiatedParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Function_instance_modelPackage.PARAMETER_INSTANCE__INSTANTIATED_PARAMETER, oldInstantiatedParameter, newInstantiatedParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstantiatedParameter(Parameter newInstantiatedParameter) {
		if (newInstantiatedParameter != instantiatedParameter) {
			NotificationChain msgs = null;
			if (instantiatedParameter != null)
				msgs = ((InternalEObject)instantiatedParameter).eInverseRemove(this, CommonPackage.PARAMETER__INSTANCES, Parameter.class, msgs);
			if (newInstantiatedParameter != null)
				msgs = ((InternalEObject)newInstantiatedParameter).eInverseAdd(this, CommonPackage.PARAMETER__INSTANCES, Parameter.class, msgs);
			msgs = basicSetInstantiatedParameter(newInstantiatedParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Function_instance_modelPackage.PARAMETER_INSTANCE__INSTANTIATED_PARAMETER, newInstantiatedParameter, newInstantiatedParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionInstance getOwningFunction() {
		if (eContainerFeatureID() != Function_instance_modelPackage.PARAMETER_INSTANCE__OWNING_FUNCTION) return null;
		return (FunctionInstance)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningFunction(FunctionInstance newOwningFunction, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningFunction, Function_instance_modelPackage.PARAMETER_INSTANCE__OWNING_FUNCTION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningFunction(FunctionInstance newOwningFunction) {
		if (newOwningFunction != eInternalContainer() || (eContainerFeatureID() != Function_instance_modelPackage.PARAMETER_INSTANCE__OWNING_FUNCTION && newOwningFunction != null)) {
			if (EcoreUtil.isAncestor(this, newOwningFunction))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningFunction != null)
				msgs = ((InternalEObject)newOwningFunction).eInverseAdd(this, Function_instance_modelPackage.FUNCTION_INSTANCE__DEFINED_PARAMETERS, FunctionInstance.class, msgs);
			msgs = basicSetOwningFunction(newOwningFunction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Function_instance_modelPackage.PARAMETER_INSTANCE__OWNING_FUNCTION, newOwningFunction, newOwningFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionInstance> getReferencingFunctions() {
		if (referencingFunctions == null) {
			referencingFunctions = new EObjectWithInverseResolvingEList.ManyInverse<FunctionInstance>(FunctionInstance.class, this, Function_instance_modelPackage.PARAMETER_INSTANCE__REFERENCING_FUNCTIONS, Function_instance_modelPackage.FUNCTION_INSTANCE__REFERENCED_PARAMETERS);
		}
		return referencingFunctions;
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
			case Function_instance_modelPackage.PARAMETER_INSTANCE__INSTANTIATED_PARAMETER:
				if (instantiatedParameter != null)
					msgs = ((InternalEObject)instantiatedParameter).eInverseRemove(this, CommonPackage.PARAMETER__INSTANCES, Parameter.class, msgs);
				return basicSetInstantiatedParameter((Parameter)otherEnd, msgs);
			case Function_instance_modelPackage.PARAMETER_INSTANCE__OWNING_FUNCTION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningFunction((FunctionInstance)otherEnd, msgs);
			case Function_instance_modelPackage.PARAMETER_INSTANCE__REFERENCING_FUNCTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferencingFunctions()).basicAdd(otherEnd, msgs);
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
			case Function_instance_modelPackage.PARAMETER_INSTANCE__INSTANTIATED_PARAMETER:
				return basicSetInstantiatedParameter(null, msgs);
			case Function_instance_modelPackage.PARAMETER_INSTANCE__OWNING_FUNCTION:
				return basicSetOwningFunction(null, msgs);
			case Function_instance_modelPackage.PARAMETER_INSTANCE__REFERENCING_FUNCTIONS:
				return ((InternalEList<?>)getReferencingFunctions()).basicRemove(otherEnd, msgs);
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
			case Function_instance_modelPackage.PARAMETER_INSTANCE__OWNING_FUNCTION:
				return eInternalContainer().eInverseRemove(this, Function_instance_modelPackage.FUNCTION_INSTANCE__DEFINED_PARAMETERS, FunctionInstance.class, msgs);
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
			case Function_instance_modelPackage.PARAMETER_INSTANCE__INSTANTIATED_PARAMETER:
				if (resolve) return getInstantiatedParameter();
				return basicGetInstantiatedParameter();
			case Function_instance_modelPackage.PARAMETER_INSTANCE__OWNING_FUNCTION:
				return getOwningFunction();
			case Function_instance_modelPackage.PARAMETER_INSTANCE__REFERENCING_FUNCTIONS:
				return getReferencingFunctions();
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
			case Function_instance_modelPackage.PARAMETER_INSTANCE__INSTANTIATED_PARAMETER:
				setInstantiatedParameter((Parameter)newValue);
				return;
			case Function_instance_modelPackage.PARAMETER_INSTANCE__OWNING_FUNCTION:
				setOwningFunction((FunctionInstance)newValue);
				return;
			case Function_instance_modelPackage.PARAMETER_INSTANCE__REFERENCING_FUNCTIONS:
				getReferencingFunctions().clear();
				getReferencingFunctions().addAll((Collection<? extends FunctionInstance>)newValue);
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
			case Function_instance_modelPackage.PARAMETER_INSTANCE__INSTANTIATED_PARAMETER:
				setInstantiatedParameter((Parameter)null);
				return;
			case Function_instance_modelPackage.PARAMETER_INSTANCE__OWNING_FUNCTION:
				setOwningFunction((FunctionInstance)null);
				return;
			case Function_instance_modelPackage.PARAMETER_INSTANCE__REFERENCING_FUNCTIONS:
				getReferencingFunctions().clear();
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
			case Function_instance_modelPackage.PARAMETER_INSTANCE__INSTANTIATED_PARAMETER:
				return instantiatedParameter != null;
			case Function_instance_modelPackage.PARAMETER_INSTANCE__OWNING_FUNCTION:
				return getOwningFunction() != null;
			case Function_instance_modelPackage.PARAMETER_INSTANCE__REFERENCING_FUNCTIONS:
				return referencingFunctions != null && !referencingFunctions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ParameterInstanceImpl
