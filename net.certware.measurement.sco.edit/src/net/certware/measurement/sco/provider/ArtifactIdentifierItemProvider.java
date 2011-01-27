/**
 * Copyright (c) 2011 Kestrel Technology LLC
 */
package net.certware.measurement.sco.provider;


import java.util.Collection;
import java.util.List;

import net.certware.measurement.sco.ArtifactIdentifier;
import net.certware.measurement.sco.ScoPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemColorProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITableItemColorProvider;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.certware.measurement.sco.ArtifactIdentifier} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ArtifactIdentifierItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource,
		ITableItemLabelProvider,
		ITableItemColorProvider,
		IItemColorProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactIdentifierItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addResourceNamePropertyDescriptor(object);
			addBaselinedLineCountPropertyDescriptor(object);
			addCurrentLineCountPropertyDescriptor(object);
			addCriticalDefectChangeOrdersPropertyDescriptor(object);
			addNormalDefectChangeOrdersPropertyDescriptor(object);
			addImprovementChangeOrdersPropertyDescriptor(object);
			addNewFeatureChangeOrdersPropertyDescriptor(object);
			addTotalChangeOrdersPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Resource Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResourceNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArtifactIdentifier_resourceName_feature"), //$NON-NLS-1$
				 getString("_UI_ArtifactIdentifier_resourceName_description"), //$NON-NLS-1$
				 ScoPackage.Literals.ARTIFACT_IDENTIFIER__RESOURCE_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_BasicPropertyCategory"), //$NON-NLS-1$
				 null));
	}

	/**
	 * This adds a property descriptor for the Baselined Line Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBaselinedLineCountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArtifactIdentifier_baselinedLineCount_feature"), //$NON-NLS-1$
				 getString("_UI_ArtifactIdentifier_baselinedLineCount_description"), //$NON-NLS-1$
				 ScoPackage.Literals.ARTIFACT_IDENTIFIER__BASELINED_LINE_COUNT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI_LinesPropertyCategory"), //$NON-NLS-1$
				 null));
	}

	/**
	 * This adds a property descriptor for the Current Line Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCurrentLineCountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArtifactIdentifier_currentLineCount_feature"), //$NON-NLS-1$
				 getString("_UI_ArtifactIdentifier_currentLineCount_description"), //$NON-NLS-1$
				 ScoPackage.Literals.ARTIFACT_IDENTIFIER__CURRENT_LINE_COUNT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI_LinesPropertyCategory"), //$NON-NLS-1$
				 null));
	}

	/**
	 * This adds a property descriptor for the Critical Defect Change Orders feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCriticalDefectChangeOrdersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArtifactIdentifier_criticalDefectChangeOrders_feature"), //$NON-NLS-1$
				 getString("_UI_ArtifactIdentifier_criticalDefectChangeOrders_description"), //$NON-NLS-1$
				 ScoPackage.Literals.ARTIFACT_IDENTIFIER__CRITICAL_DEFECT_CHANGE_ORDERS,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_ChangesPropertyCategory"), //$NON-NLS-1$
				 null));
	}

	/**
	 * This adds a property descriptor for the Normal Defect Change Orders feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNormalDefectChangeOrdersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArtifactIdentifier_normalDefectChangeOrders_feature"), //$NON-NLS-1$
				 getString("_UI_ArtifactIdentifier_normalDefectChangeOrders_description"), //$NON-NLS-1$
				 ScoPackage.Literals.ARTIFACT_IDENTIFIER__NORMAL_DEFECT_CHANGE_ORDERS,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_ChangesPropertyCategory"), //$NON-NLS-1$
				 null));
	}

	/**
	 * This adds a property descriptor for the Improvement Change Orders feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImprovementChangeOrdersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArtifactIdentifier_improvementChangeOrders_feature"), //$NON-NLS-1$
				 getString("_UI_ArtifactIdentifier_improvementChangeOrders_description"), //$NON-NLS-1$
				 ScoPackage.Literals.ARTIFACT_IDENTIFIER__IMPROVEMENT_CHANGE_ORDERS,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_ChangesPropertyCategory"), //$NON-NLS-1$
				 null));
	}

	/**
	 * This adds a property descriptor for the New Feature Change Orders feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNewFeatureChangeOrdersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArtifactIdentifier_newFeatureChangeOrders_feature"), //$NON-NLS-1$
				 getString("_UI_ArtifactIdentifier_newFeatureChangeOrders_description"), //$NON-NLS-1$
				 ScoPackage.Literals.ARTIFACT_IDENTIFIER__NEW_FEATURE_CHANGE_ORDERS,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_ChangesPropertyCategory"), //$NON-NLS-1$
				 null));
	}

	/**
	 * This adds a property descriptor for the Total Change Orders feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTotalChangeOrdersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArtifactIdentifier_totalChangeOrders_feature"), //$NON-NLS-1$
				 getString("_UI_ArtifactIdentifier_totalChangeOrders_description"), //$NON-NLS-1$
				 ScoPackage.Literals.ARTIFACT_IDENTIFIER__TOTAL_CHANGE_ORDERS,
				 false,
				 false,
				 true,
				 null,
				 getString("_UI_ChangesPropertyCategory"), //$NON-NLS-1$
				 null));
	}

	/**
	 * This returns ArtifactIdentifier.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ArtifactIdentifier")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ArtifactIdentifier)object).getResourceName();
		return label == null || label.length() == 0 ?
			getString("_UI_ArtifactIdentifier_type") : //$NON-NLS-1$
			getString("_UI_ArtifactIdentifier_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ArtifactIdentifier.class)) {
			case ScoPackage.ARTIFACT_IDENTIFIER__RESOURCE_NAME:
			case ScoPackage.ARTIFACT_IDENTIFIER__BASELINED_LINE_COUNT:
			case ScoPackage.ARTIFACT_IDENTIFIER__CURRENT_LINE_COUNT:
			case ScoPackage.ARTIFACT_IDENTIFIER__TOTAL_CHANGE_ORDERS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ScoEditPlugin.INSTANCE;
	}

}