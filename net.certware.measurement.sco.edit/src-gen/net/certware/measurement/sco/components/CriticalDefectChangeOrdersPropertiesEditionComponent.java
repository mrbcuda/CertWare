/**
 * Generated with Acceleo
 */
package net.certware.measurement.sco.components;

// Start of user code for imports
import net.certware.measurement.sco.ChangeOrderType;
import net.certware.measurement.sco.CriticalDefectChangeOrders;
import net.certware.measurement.sco.ScoPackage;
import net.certware.measurement.sco.parts.CriticalDefectChangeOrdersPropertiesEditionPart;
import net.certware.measurement.sco.parts.ScoViewsRepository;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
	

// End of user code

/**
 * 
 * 
 */
public class CriticalDefectChangeOrdersPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public CriticalDefectChangeOrdersPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject criticalDefectChangeOrders, String editing_mode) {
		super(editingContext, criticalDefectChangeOrders, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ScoViewsRepository.class;
		partKey = ScoViewsRepository.CriticalDefectChangeOrders.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(Object key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (editingPart != null && key == partKey) {
			editingPart.setContext(elt, allResource);
			final CriticalDefectChangeOrders criticalDefectChangeOrders = (CriticalDefectChangeOrders)elt;
			final CriticalDefectChangeOrdersPropertiesEditionPart basePart = (CriticalDefectChangeOrdersPropertiesEditionPart)editingPart;
			// init values
			if (criticalDefectChangeOrders.getName() != null && isAccessible(ScoViewsRepository.CriticalDefectChangeOrders.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), criticalDefectChangeOrders.getName()));
			
			if (isAccessible(ScoViewsRepository.CriticalDefectChangeOrders.Properties.value)) {
				basePart.setValue(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), criticalDefectChangeOrders.getValue()));
			}
			
			if (isAccessible(ScoViewsRepository.CriticalDefectChangeOrders.Properties.type)) {
				basePart.initType((EEnum) ScoPackage.eINSTANCE.getChangeOrderCount_Type().getEType(), criticalDefectChangeOrders.getType());
			}
			if (isAccessible(ScoViewsRepository.CriticalDefectChangeOrders.Properties.brokenLines)) {
				basePart.setBrokenLines(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), criticalDefectChangeOrders.getBrokenLines()));
			}
			
			if (isAccessible(ScoViewsRepository.CriticalDefectChangeOrders.Properties.fixedLines)) {
				basePart.setFixedLines(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), criticalDefectChangeOrders.getFixedLines()));
			}
			
			if (isAccessible(ScoViewsRepository.CriticalDefectChangeOrders.Properties.repairEffort)) {
				basePart.setRepairEffort(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEDouble(), criticalDefectChangeOrders.getRepairEffort()));
			}
			
			// init filters
			
			
			
			
			
			
			// init values for referenced views
			
			// init filters for referenced views
			
		}
		setInitializing(false);
	}









	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#associatedFeature(java.lang.Object)
	 */
	public EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == ScoViewsRepository.CriticalDefectChangeOrders.Properties.name) {
			return ScoPackage.eINSTANCE.getChangeOrderCount_Name();
		}
		if (editorKey == ScoViewsRepository.CriticalDefectChangeOrders.Properties.value) {
			return ScoPackage.eINSTANCE.getChangeOrderCount_Value();
		}
		if (editorKey == ScoViewsRepository.CriticalDefectChangeOrders.Properties.type) {
			return ScoPackage.eINSTANCE.getChangeOrderCount_Type();
		}
		if (editorKey == ScoViewsRepository.CriticalDefectChangeOrders.Properties.brokenLines) {
			return ScoPackage.eINSTANCE.getChangeOrderCount_BrokenLines();
		}
		if (editorKey == ScoViewsRepository.CriticalDefectChangeOrders.Properties.fixedLines) {
			return ScoPackage.eINSTANCE.getChangeOrderCount_FixedLines();
		}
		if (editorKey == ScoViewsRepository.CriticalDefectChangeOrders.Properties.repairEffort) {
			return ScoPackage.eINSTANCE.getChangeOrderCount_RepairEffort();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		CriticalDefectChangeOrders criticalDefectChangeOrders = (CriticalDefectChangeOrders)semanticObject;
		if (ScoViewsRepository.CriticalDefectChangeOrders.Properties.name == event.getAffectedEditor()) {
			criticalDefectChangeOrders.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ScoViewsRepository.CriticalDefectChangeOrders.Properties.value == event.getAffectedEditor()) {
			criticalDefectChangeOrders.setValue((EEFConverterUtil.createIntFromString(EcorePackage.eINSTANCE.getEInt(), (String)event.getNewValue())));
		}
		if (ScoViewsRepository.CriticalDefectChangeOrders.Properties.type == event.getAffectedEditor()) {
			criticalDefectChangeOrders.setType((ChangeOrderType)event.getNewValue());
		}
		if (ScoViewsRepository.CriticalDefectChangeOrders.Properties.brokenLines == event.getAffectedEditor()) {
			criticalDefectChangeOrders.setBrokenLines((EEFConverterUtil.createIntFromString(EcorePackage.eINSTANCE.getEInt(), (String)event.getNewValue())));
		}
		if (ScoViewsRepository.CriticalDefectChangeOrders.Properties.fixedLines == event.getAffectedEditor()) {
			criticalDefectChangeOrders.setFixedLines((EEFConverterUtil.createIntFromString(EcorePackage.eINSTANCE.getEInt(), (String)event.getNewValue())));
		}
		if (ScoViewsRepository.CriticalDefectChangeOrders.Properties.repairEffort == event.getAffectedEditor()) {
			criticalDefectChangeOrders.setRepairEffort((EEFConverterUtil.createDoubleFromString(EcorePackage.eINSTANCE.getEDouble(), (String)event.getNewValue())));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			CriticalDefectChangeOrdersPropertiesEditionPart basePart = (CriticalDefectChangeOrdersPropertiesEditionPart)editingPart;
			if (ScoPackage.eINSTANCE.getChangeOrderCount_Name().equals(msg.getFeature()) && basePart != null && isAccessible(ScoViewsRepository.CriticalDefectChangeOrders.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (ScoPackage.eINSTANCE.getChangeOrderCount_Value().equals(msg.getFeature()) && basePart != null && isAccessible(ScoViewsRepository.CriticalDefectChangeOrders.Properties.value)) {
				if (msg.getNewValue() != null) {
					basePart.setValue(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), msg.getNewValue()));
				} else {
					basePart.setValue("");
				}
			}
			if (ScoPackage.eINSTANCE.getChangeOrderCount_Type().equals(msg.getFeature()) && isAccessible(ScoViewsRepository.CriticalDefectChangeOrders.Properties.type))
				basePart.setType((Enumerator)msg.getNewValue());
			
			if (ScoPackage.eINSTANCE.getChangeOrderCount_BrokenLines().equals(msg.getFeature()) && basePart != null && isAccessible(ScoViewsRepository.CriticalDefectChangeOrders.Properties.brokenLines)) {
				if (msg.getNewValue() != null) {
					basePart.setBrokenLines(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), msg.getNewValue()));
				} else {
					basePart.setBrokenLines("");
				}
			}
			if (ScoPackage.eINSTANCE.getChangeOrderCount_FixedLines().equals(msg.getFeature()) && basePart != null && isAccessible(ScoViewsRepository.CriticalDefectChangeOrders.Properties.fixedLines)) {
				if (msg.getNewValue() != null) {
					basePart.setFixedLines(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), msg.getNewValue()));
				} else {
					basePart.setFixedLines("");
				}
			}
			if (ScoPackage.eINSTANCE.getChangeOrderCount_RepairEffort().equals(msg.getFeature()) && basePart != null && isAccessible(ScoViewsRepository.CriticalDefectChangeOrders.Properties.repairEffort)) {
				if (msg.getNewValue() != null) {
					basePart.setRepairEffort(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEDouble(), msg.getNewValue()));
				} else {
					basePart.setRepairEffort("");
				}
			}
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == ScoViewsRepository.CriticalDefectChangeOrders.Properties.name || key == ScoViewsRepository.CriticalDefectChangeOrders.Properties.value || key == ScoViewsRepository.CriticalDefectChangeOrders.Properties.type || key == ScoViewsRepository.CriticalDefectChangeOrders.Properties.brokenLines || key == ScoViewsRepository.CriticalDefectChangeOrders.Properties.fixedLines || key == ScoViewsRepository.CriticalDefectChangeOrders.Properties.repairEffort;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#getHelpContent(java.lang.Object, int)
	 * 
	 */
	public String getHelpContent(Object key, int kind) {
		if (key == ScoViewsRepository.CriticalDefectChangeOrders.Properties.name)
			return "The name of the change order type"; //$NON-NLS-1$
		if (key == ScoViewsRepository.CriticalDefectChangeOrders.Properties.value)
			return "The number of change orders for this type"; //$NON-NLS-1$
		if (key == ScoViewsRepository.CriticalDefectChangeOrders.Properties.type)
			return "The change order type identifier"; //$NON-NLS-1$
		if (key == ScoViewsRepository.CriticalDefectChangeOrders.Properties.brokenLines)
			return "The estimated number of broken lines in the current artifact"; //$NON-NLS-1$
		if (key == ScoViewsRepository.CriticalDefectChangeOrders.Properties.fixedLines)
			return "The number of lines fixed in the current artifact and represented by the repair effort"; //$NON-NLS-1$
		if (key == ScoViewsRepository.CriticalDefectChangeOrders.Properties.repairEffort)
			return "The hours of repair effort corresponding to the fixed lines in the current artifact"; //$NON-NLS-1$
		return super.getHelpContent(key, kind);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public Diagnostic validateValue(IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			try {
				if (ScoViewsRepository.CriticalDefectChangeOrders.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ScoPackage.eINSTANCE.getChangeOrderCount_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ScoPackage.eINSTANCE.getChangeOrderCount_Name().getEAttributeType(), newValue);
				}
				if (ScoViewsRepository.CriticalDefectChangeOrders.Properties.value == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ScoPackage.eINSTANCE.getChangeOrderCount_Value().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ScoPackage.eINSTANCE.getChangeOrderCount_Value().getEAttributeType(), newValue);
				}
				if (ScoViewsRepository.CriticalDefectChangeOrders.Properties.type == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ScoPackage.eINSTANCE.getChangeOrderCount_Type().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ScoPackage.eINSTANCE.getChangeOrderCount_Type().getEAttributeType(), newValue);
				}
				if (ScoViewsRepository.CriticalDefectChangeOrders.Properties.brokenLines == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ScoPackage.eINSTANCE.getChangeOrderCount_BrokenLines().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ScoPackage.eINSTANCE.getChangeOrderCount_BrokenLines().getEAttributeType(), newValue);
				}
				if (ScoViewsRepository.CriticalDefectChangeOrders.Properties.fixedLines == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ScoPackage.eINSTANCE.getChangeOrderCount_FixedLines().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ScoPackage.eINSTANCE.getChangeOrderCount_FixedLines().getEAttributeType(), newValue);
				}
				if (ScoViewsRepository.CriticalDefectChangeOrders.Properties.repairEffort == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ScoPackage.eINSTANCE.getChangeOrderCount_RepairEffort().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ScoPackage.eINSTANCE.getChangeOrderCount_RepairEffort().getEAttributeType(), newValue);
				}
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}

}
