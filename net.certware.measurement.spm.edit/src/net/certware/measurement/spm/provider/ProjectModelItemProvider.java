/**
 * Copyright (c) 2011 Kestrel Technology LLC
 */
package net.certware.measurement.spm.provider;


import java.util.Collection;
import java.util.List;

import net.certware.measurement.smm.SmmPackage;
import net.certware.measurement.smm.provider.SmmModelItemProvider;

import net.certware.measurement.spm.SpmFactory;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemColorProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the item provider adapter for a {@link net.certware.measurement.spm.ProjectModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProjectModelItemProvider
	extends SmmModelItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource,
		IItemColorProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectModelItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This returns ProjectModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ProjectModel")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ProjectModel_type"); //$NON-NLS-1$
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

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SMM_ELEMENT__MODEL,
				 SpmFactory.eINSTANCE.createProjectModel()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SMM_ELEMENT__MODEL,
				 SpmFactory.eINSTANCE.createProjectCommit()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SMM_MODEL__MODEL_ELEMENT,
				 SpmFactory.eINSTANCE.createProjectModel()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SMM_MODEL__MODEL_ELEMENT,
				 SpmFactory.eINSTANCE.createProjectCommit()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SMM_MODEL__MODEL_ELEMENT,
				 SpmFactory.eINSTANCE.createCommitRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SMM_MODEL__MODEL_ELEMENT,
				 SpmFactory.eINSTANCE.createEndProductQualityCategory()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SMM_MODEL__MODEL_ELEMENT,
				 SpmFactory.eINSTANCE.createInProgressQualityCategory()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SMM_MODEL__MODEL_ELEMENT,
				 SpmFactory.eINSTANCE.createEndProductQuality()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SMM_MODEL__MODEL_ELEMENT,
				 SpmFactory.eINSTANCE.createMaintainability()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SMM_MODEL__MODEL_ELEMENT,
				 SpmFactory.eINSTANCE.createInProgressIndicator()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SMM_MODEL__MODEL_ELEMENT,
				 SpmFactory.eINSTANCE.createProjectSize()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SMM_MODEL__MODEL_ELEMENT,
				 SpmFactory.eINSTANCE.createCaseDimensionalMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SMM_MODEL__MODEL_ELEMENT,
				 SpmFactory.eINSTANCE.createChangeOrderDimensionalMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SMM_MODEL__MODEL_ELEMENT,
				 SpmFactory.eINSTANCE.createTimeDimensionalMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SMM_MODEL__MODEL_ELEMENT,
				 SpmFactory.eINSTANCE.createAdditiveMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SMM_MODEL__MODEL_ELEMENT,
				 SpmFactory.eINSTANCE.createCaseScope()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SMM_MODEL__MODEL_ELEMENT,
				 SpmFactory.eINSTANCE.createProjectScope()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SMM_MODEL__MODEL_ELEMENT,
				 SpmFactory.eINSTANCE.createChangeScope()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SMM_MODEL__MODEL_ELEMENT,
				 SpmFactory.eINSTANCE.createCriticalDefectChangeOrderCount()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SMM_MODEL__MODEL_ELEMENT,
				 SpmFactory.eINSTANCE.createNormalDefectChangeOrderCount()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SMM_MODEL__MODEL_ELEMENT,
				 SpmFactory.eINSTANCE.createImprovementChangeOrderCount()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SMM_MODEL__MODEL_ELEMENT,
				 SpmFactory.eINSTANCE.createNewFeatureChangeOrderCount()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SMM_MODEL__MODEL_ELEMENT,
				 SpmFactory.eINSTANCE.createTrendMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SMM_MODEL__MODEL_ELEMENT,
				 SpmFactory.eINSTANCE.createScrapRatioMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SMM_MODEL__MODEL_ELEMENT,
				 SpmFactory.eINSTANCE.createModularityMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SMM_MODEL__MODEL_ELEMENT,
				 SpmFactory.eINSTANCE.createReworkRatioMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SMM_MODEL__MODEL_ELEMENT,
				 SpmFactory.eINSTANCE.createAdaptabilityRatioMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SMM_MODEL__MODEL_ELEMENT,
				 SpmFactory.eINSTANCE.createMaturityRatioMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SMM_MODEL__MODEL_ELEMENT,
				 SpmFactory.eINSTANCE.createMaintainabilityMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SMM_MODEL__MODEL_ELEMENT,
				 SpmFactory.eINSTANCE.createBrokenCaseSizeMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SMM_MODEL__MODEL_ELEMENT,
				 SpmFactory.eINSTANCE.createFixedCaseSizeMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SMM_MODEL__MODEL_ELEMENT,
				 SpmFactory.eINSTANCE.createTotalCaseSizeMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SMM_MODEL__MODEL_ELEMENT,
				 SpmFactory.eINSTANCE.createBaselineCaseSizeMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SMM_MODEL__MODEL_ELEMENT,
				 SpmFactory.eINSTANCE.createUsageTimeMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SMM_MODEL__MODEL_ELEMENT,
				 SpmFactory.eINSTANCE.createRepairEffortMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SMM_MODEL__MODEL_ELEMENT,
				 SpmFactory.eINSTANCE.createDevelopmentEffortMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SMM_MODEL__MODEL_ELEMENT,
				 SpmFactory.eINSTANCE.createTotalChangeOrderCount()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SMM_MODEL__MODEL_ELEMENT,
				 SpmFactory.eINSTANCE.createCriticalAndNormalChangeOrderCount()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SMM_MODEL__MODEL_ELEMENT,
				 SpmFactory.eINSTANCE.createReworkStabilityMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SMM_MODEL__MODEL_ELEMENT,
				 SpmFactory.eINSTANCE.createReworkBacklogMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SMM_MODEL__MODEL_ELEMENT,
				 SpmFactory.eINSTANCE.createModularityTrend()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SMM_MODEL__MODEL_ELEMENT,
				 SpmFactory.eINSTANCE.createAdaptabilityTrend()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SMM_MODEL__MODEL_ELEMENT,
				 SpmFactory.eINSTANCE.createMaturityTrend()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == SmmPackage.Literals.SMM_ELEMENT__MODEL ||
			childFeature == SmmPackage.Literals.SMM_MODEL__MODEL_ELEMENT ||
			childFeature == SmmPackage.Literals.SMM_ELEMENT__ATTRIBUTE ||
			childFeature == SmmPackage.Literals.SMM_ELEMENT__ANNOTATION;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2", //$NON-NLS-1$
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return SpmEditPlugin.INSTANCE;
	}

}
