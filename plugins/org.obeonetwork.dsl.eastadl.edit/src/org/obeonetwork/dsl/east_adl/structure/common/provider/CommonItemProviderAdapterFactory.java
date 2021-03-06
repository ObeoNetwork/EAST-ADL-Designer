/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.east_adl.structure.common.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.obeonetwork.dsl.east_adl.structure.common.util.CommonAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CommonItemProviderAdapterFactory extends CommonAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.east_adl.structure.common.SignalFunctionPort} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignalFunctionPortItemProvider signalFunctionPortItemProvider;

	/**
	 * This creates an adapter for a {@link org.obeonetwork.dsl.east_adl.structure.common.SignalFunctionPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSignalFunctionPortAdapter() {
		if (signalFunctionPortItemProvider == null) {
			signalFunctionPortItemProvider = new SignalFunctionPortItemProvider(this);
		}

		return signalFunctionPortItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.east_adl.structure.common.OperationFunctionPort} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationFunctionPortItemProvider operationFunctionPortItemProvider;

	/**
	 * This creates an adapter for a {@link org.obeonetwork.dsl.east_adl.structure.common.OperationFunctionPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOperationFunctionPortAdapter() {
		if (operationFunctionPortItemProvider == null) {
			operationFunctionPortItemProvider = new OperationFunctionPortItemProvider(this);
		}

		return operationFunctionPortItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.east_adl.structure.common.SignalFunctionPortInterface} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignalFunctionPortInterfaceItemProvider signalFunctionPortInterfaceItemProvider;

	/**
	 * This creates an adapter for a {@link org.obeonetwork.dsl.east_adl.structure.common.SignalFunctionPortInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSignalFunctionPortInterfaceAdapter() {
		if (signalFunctionPortInterfaceItemProvider == null) {
			signalFunctionPortInterfaceItemProvider = new SignalFunctionPortInterfaceItemProvider(this);
		}

		return signalFunctionPortInterfaceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.east_adl.structure.common.OperationFunctionPortInterface} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationFunctionPortInterfaceItemProvider operationFunctionPortInterfaceItemProvider;

	/**
	 * This creates an adapter for a {@link org.obeonetwork.dsl.east_adl.structure.common.OperationFunctionPortInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOperationFunctionPortInterfaceAdapter() {
		if (operationFunctionPortInterfaceItemProvider == null) {
			operationFunctionPortInterfaceItemProvider = new OperationFunctionPortInterfaceItemProvider(this);
		}

		return operationFunctionPortInterfaceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.east_adl.structure.common.ConnectorSignal} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorSignalItemProvider connectorSignalItemProvider;

	/**
	 * This creates an adapter for a {@link org.obeonetwork.dsl.east_adl.structure.common.ConnectorSignal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConnectorSignalAdapter() {
		if (connectorSignalItemProvider == null) {
			connectorSignalItemProvider = new ConnectorSignalItemProvider(this);
		}

		return connectorSignalItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.east_adl.structure.common.DesignDataType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DesignDataTypeItemProvider designDataTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.obeonetwork.dsl.east_adl.structure.common.DesignDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDesignDataTypeAdapter() {
		if (designDataTypeItemProvider == null) {
			designDataTypeItemProvider = new DesignDataTypeItemProvider(this);
		}

		return designDataTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.east_adl.structure.common.ImplementationDataType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplementationDataTypeItemProvider implementationDataTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.obeonetwork.dsl.east_adl.structure.common.ImplementationDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createImplementationDataTypeAdapter() {
		if (implementationDataTypeItemProvider == null) {
			implementationDataTypeItemProvider = new ImplementationDataTypeItemProvider(this);
		}

		return implementationDataTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.east_adl.structure.common.Parameter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterItemProvider parameterItemProvider;

	/**
	 * This creates an adapter for a {@link org.obeonetwork.dsl.east_adl.structure.common.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParameterAdapter() {
		if (parameterItemProvider == null) {
			parameterItemProvider = new ParameterItemProvider(this);
		}

		return parameterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.east_adl.structure.common.Realization} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RealizationItemProvider realizationItemProvider;

	/**
	 * This creates an adapter for a {@link org.obeonetwork.dsl.east_adl.structure.common.Realization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRealizationAdapter() {
		if (realizationItemProvider == null) {
			realizationItemProvider = new RealizationItemProvider(this);
		}

		return realizationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.east_adl.structure.common.OperationService} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationServiceItemProvider operationServiceItemProvider;

	/**
	 * This creates an adapter for a {@link org.obeonetwork.dsl.east_adl.structure.common.OperationService}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOperationServiceAdapter() {
		if (operationServiceItemProvider == null) {
			operationServiceItemProvider = new OperationServiceItemProvider(this);
		}

		return operationServiceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.east_adl.structure.common.ServiceParameter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceParameterItemProvider serviceParameterItemProvider;

	/**
	 * This creates an adapter for a {@link org.obeonetwork.dsl.east_adl.structure.common.ServiceParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createServiceParameterAdapter() {
		if (serviceParameterItemProvider == null) {
			serviceParameterItemProvider = new ServiceParameterItemProvider(this);
		}

		return serviceParameterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.east_adl.structure.common.OperationCall} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationCallItemProvider operationCallItemProvider;

	/**
	 * This creates an adapter for a {@link org.obeonetwork.dsl.east_adl.structure.common.OperationCall}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOperationCallAdapter() {
		if (operationCallItemProvider == null) {
			operationCallItemProvider = new OperationCallItemProvider(this);
		}

		return operationCallItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.east_adl.structure.common.TypeAssociation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssociationItemProvider typeAssociationItemProvider;

	/**
	 * This creates an adapter for a {@link org.obeonetwork.dsl.east_adl.structure.common.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTypeAssociationAdapter() {
		if (typeAssociationItemProvider == null) {
			typeAssociationItemProvider = new TypeAssociationItemProvider(this);
		}

		return typeAssociationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.east_adl.structure.common.AllocationConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllocationConstraintItemProvider allocationConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link org.obeonetwork.dsl.east_adl.structure.common.AllocationConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAllocationConstraintAdapter() {
		if (allocationConstraintItemProvider == null) {
			allocationConstraintItemProvider = new AllocationConstraintItemProvider(this);
		}

		return allocationConstraintItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (signalFunctionPortItemProvider != null) signalFunctionPortItemProvider.dispose();
		if (operationFunctionPortItemProvider != null) operationFunctionPortItemProvider.dispose();
		if (signalFunctionPortInterfaceItemProvider != null) signalFunctionPortInterfaceItemProvider.dispose();
		if (operationFunctionPortInterfaceItemProvider != null) operationFunctionPortInterfaceItemProvider.dispose();
		if (connectorSignalItemProvider != null) connectorSignalItemProvider.dispose();
		if (designDataTypeItemProvider != null) designDataTypeItemProvider.dispose();
		if (implementationDataTypeItemProvider != null) implementationDataTypeItemProvider.dispose();
		if (parameterItemProvider != null) parameterItemProvider.dispose();
		if (realizationItemProvider != null) realizationItemProvider.dispose();
		if (operationServiceItemProvider != null) operationServiceItemProvider.dispose();
		if (serviceParameterItemProvider != null) serviceParameterItemProvider.dispose();
		if (operationCallItemProvider != null) operationCallItemProvider.dispose();
		if (typeAssociationItemProvider != null) typeAssociationItemProvider.dispose();
		if (allocationConstraintItemProvider != null) allocationConstraintItemProvider.dispose();
	}

}
