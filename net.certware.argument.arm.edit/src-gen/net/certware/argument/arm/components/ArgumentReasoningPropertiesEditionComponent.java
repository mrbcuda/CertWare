/**
 * Generated with Acceleo
 */
package net.certware.argument.arm.components;

// Start of user code for imports
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.certware.argument.arm.Argument;
import net.certware.argument.arm.ArgumentReasoning;
import net.certware.argument.arm.ArmPackage;
import net.certware.argument.arm.TaggedValue;
import net.certware.argument.arm.parts.ArgumentReasoningPropertiesEditionPart;
import net.certware.argument.arm.parts.ArmViewsRepository;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.command.IdentityCommand;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.command.MoveCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;
import org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesValidationEditionEvent;
import org.eclipse.emf.eef.runtime.impl.services.PropertiesEditionPartProviderService;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
	

// End of user code

/**
 * 
 * 
 */
public class ArgumentReasoningPropertiesEditionComponent extends StandardPropertiesEditionComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	private String[] parts = {BASE_PART};

	/**
	 * The EObject to edit
	 * 
	 */
	private ArgumentReasoning argumentReasoning;

	/**
	 * The Base part
	 * 
	 */
	protected ArgumentReasoningPropertiesEditionPart basePart;

	/**
	 * Default constructor
	 * 
	 */
	public ArgumentReasoningPropertiesEditionComponent(EObject argumentReasoning, String editing_mode) {
		if (argumentReasoning instanceof ArgumentReasoning) {
			this.argumentReasoning = (ArgumentReasoning)argumentReasoning;
			if (IPropertiesEditionComponent.LIVE_MODE.equals(editing_mode)) {
				semanticAdapter = initializeSemanticAdapter();
				this.argumentReasoning.eAdapters().add(semanticAdapter);
			}
		}
		this.editing_mode = editing_mode;
	}

	/**
	 * Initialize the semantic model listener for live editing mode
	 * 
	 * @return the semantic model listener
	 * 
	 */
	private AdapterImpl initializeSemanticAdapter() {
		return new EContentAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.emf.common.notify.impl.AdapterImpl#notifyChanged(org.eclipse.emf.common.notify.Notification)
			 * 
			 */
			public void notifyChanged(final Notification msg) {
				if (basePart == null)
					ArgumentReasoningPropertiesEditionComponent.this.dispose();
				else {
					Runnable updateRunnable = new Runnable() {
						public void run() {
							runUpdateRunnable(msg);
						}
					};
					if (null == Display.getCurrent()) {
						PlatformUI.getWorkbench().getDisplay().syncExec(updateRunnable);
					} else {
						updateRunnable.run();
					}
				}
			}

		};
	}

	/**
	 * Used to update the views
	 * 
	 */
	protected void runUpdateRunnable(final Notification msg) {
		if (ArmPackage.eINSTANCE.getModelElement_Identifier().equals(msg.getFeature()) && basePart != null){
			if (msg.getNewValue() != null) {
				basePart.setIdentifier(EcoreUtil.convertToString(ArmPackage.eINSTANCE.getString(), msg.getNewValue()));
			} else {
				basePart.setIdentifier("");
			}
		}
		if (ArmPackage.eINSTANCE.getModelElement_Description().equals(msg.getFeature()) && basePart != null){
			if (msg.getNewValue() != null) {
				basePart.setDescription(EcoreUtil.convertToString(ArmPackage.eINSTANCE.getString(), msg.getNewValue()));
			} else {
				basePart.setDescription("");
			}
		}
		if (ArmPackage.eINSTANCE.getModelElement_Content().equals(msg.getFeature()) && basePart != null){
			if (msg.getNewValue() != null) {
				basePart.setContent(EcoreUtil.convertToString(ArmPackage.eINSTANCE.getString(), msg.getNewValue()));
			} else {
				basePart.setContent("");
			}
		}
		if (msg.getFeature() != null && ((EStructuralFeature)msg.getFeature() == ArmPackage.eINSTANCE.getModelElement_IsTagged())) {
			basePart.updateIsTagged(argumentReasoning);
		}
		if (ArmPackage.eINSTANCE.getArgumentReasoning_Describes().equals(msg.getFeature()))
			basePart.updateDescribes(argumentReasoning);
		if (ArmPackage.eINSTANCE.getArgumentReasoning_HasStructure().equals(msg.getFeature()) && basePart != null)
			basePart.setHasStructure((EObject)msg.getNewValue());

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#translatePart(java.lang.String)
	 * 
	 */
	public java.lang.Class translatePart(String key) {
		if (BASE_PART.equals(key))
			return ArmViewsRepository.ArgumentReasoning.class;
		return super.translatePart(key);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#partsList()
	 * 
	 */
	public String[] partsList() {
		return parts;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#getPropertiesEditionPart
	 *  (java.lang.String, java.lang.String)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(int kind, String key) {
		if (argumentReasoning != null && BASE_PART.equals(key)) {
			if (basePart == null) {
				IPropertiesEditionPartProvider provider = PropertiesEditionPartProviderService.getInstance().getProvider(ArmViewsRepository.class);
				if (provider != null) {
					basePart = (ArgumentReasoningPropertiesEditionPart)provider.getPropertiesEditionPart(ArmViewsRepository.ArgumentReasoning.class, kind, this);
					addListener((IPropertiesEditionListener)basePart);
				}
			}
			return (IPropertiesEditionPart)basePart;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#
	 *      setPropertiesEditionPart(java.lang.Class, int, org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart)
	 * 
	 */
	public void setPropertiesEditionPart(java.lang.Class key, int kind, IPropertiesEditionPart propertiesEditionPart) {
		if (key == ArmViewsRepository.ArgumentReasoning.class)
			this.basePart = (ArgumentReasoningPropertiesEditionPart) propertiesEditionPart;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Class, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(java.lang.Class key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (basePart != null && key == ArmViewsRepository.ArgumentReasoning.class) {
			((IPropertiesEditionPart)basePart).setContext(elt, allResource);
			final ArgumentReasoning argumentReasoning = (ArgumentReasoning)elt;
			// init values
			if (argumentReasoning.getIdentifier() != null)
				basePart.setIdentifier(EEFConverterUtil.convertToString(ArmPackage.eINSTANCE.getString(), argumentReasoning.getIdentifier()));

			if (argumentReasoning.getDescription() != null)
				basePart.setDescription(EEFConverterUtil.convertToString(ArmPackage.eINSTANCE.getString(), argumentReasoning.getDescription()));

			if (argumentReasoning.getContent() != null)
				basePart.setContent(EEFConverterUtil.convertToString(ArmPackage.eINSTANCE.getString(), argumentReasoning.getContent()));

			basePart.initIsTagged(argumentReasoning, null, ArmPackage.eINSTANCE.getModelElement_IsTagged());
			basePart.initDescribes(argumentReasoning, null, ArmPackage.eINSTANCE.getArgumentReasoning_Describes());
			// init part
			basePart.initHasStructure(allResource, argumentReasoning.getHasStructure());
			// set the button mode
			basePart.setHasStructureButtonMode(ButtonsModeEnum.BROWSE);
			// init filters



			basePart.addFilterToIsTagged(new ViewerFilter() {

					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof TaggedValue); //$NON-NLS-1$ 
				}

			});
			// Start of user code for additional businessfilters for isTagged
			
			// End of user code

			basePart.addFilterToDescribes(new ViewerFilter() {

				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInDescribesTable((EObject)element));
					return element instanceof Resource;
				}

			});
			basePart.addFilterToDescribes(new EObjectFilter(ArmPackage.eINSTANCE.getAssertedInference()));
			// Start of user code for additional businessfilters for describes
			
			// End of user code

			basePart.addFilterToHasStructure(new ViewerFilter() {

				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					return (element instanceof String && element.equals("")) || (element instanceof Argument); //$NON-NLS-1$ 
				}

			});
			// Start of user code for additional businessfilters for hasStructure
			
			// End of user code

		}
		// init values for referenced views

		// init filters for referenced views

		setInitializing(false);
	}









	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#getPropertiesEditionCommand
	 *     (org.eclipse.emf.edit.domain.EditingDomain)
	 * 
	 */
	public CompoundCommand getPropertiesEditionCommand(EditingDomain editingDomain) {
		CompoundCommand cc = new CompoundCommand();
		if ((argumentReasoning != null) && (basePart != null)) { 
			cc.append(SetCommand.create(editingDomain, argumentReasoning, ArmPackage.eINSTANCE.getModelElement_Identifier(), EEFConverterUtil.createFromString(ArmPackage.eINSTANCE.getString(), basePart.getIdentifier())));
			cc.append(SetCommand.create(editingDomain, argumentReasoning, ArmPackage.eINSTANCE.getModelElement_Description(), EEFConverterUtil.createFromString(ArmPackage.eINSTANCE.getString(), basePart.getDescription())));
			cc.append(SetCommand.create(editingDomain, argumentReasoning, ArmPackage.eINSTANCE.getModelElement_Content(), EEFConverterUtil.createFromString(ArmPackage.eINSTANCE.getString(), basePart.getContent())));
			List isTaggedToAddFromIsTagged = basePart.getIsTaggedToAdd();
			for (Iterator iter = isTaggedToAddFromIsTagged.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, argumentReasoning, ArmPackage.eINSTANCE.getModelElement_IsTagged(), iter.next()));
			Map isTaggedToRefreshFromIsTagged = basePart.getIsTaggedToEdit();
			for (Iterator iter = isTaggedToRefreshFromIsTagged.keySet().iterator(); iter.hasNext();) {
				TaggedValue nextElement = (TaggedValue) iter.next();
				TaggedValue isTagged = (TaggedValue) isTaggedToRefreshFromIsTagged.get(nextElement);
				for (EStructuralFeature feature : nextElement.eClass().getEAllStructuralFeatures()) {
					if (feature.isChangeable() && !(feature instanceof EReference && ((EReference) feature).isContainer())) {
						cc.append(SetCommand.create(editingDomain, nextElement, feature, isTagged.eGet(feature)));
					}
				}
			}
			List isTaggedToRemoveFromIsTagged = basePart.getIsTaggedToRemove();
			for (Iterator iter = isTaggedToRemoveFromIsTagged.iterator(); iter.hasNext();)
				cc.append(DeleteCommand.create(editingDomain, iter.next()));
			List isTaggedToMoveFromIsTagged = basePart.getIsTaggedToMove();
			for (Iterator iter = isTaggedToMoveFromIsTagged.iterator(); iter.hasNext();){
				org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement moveElement = (org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement)iter.next();
				cc.append(MoveCommand.create(editingDomain, argumentReasoning, ArmPackage.eINSTANCE.getTaggedValue(), moveElement.getElement(), moveElement.getIndex()));
			}
			List describesToAddFromDescribes = basePart.getDescribesToAdd();
			for (Iterator iter = describesToAddFromDescribes.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, argumentReasoning, ArmPackage.eINSTANCE.getArgumentReasoning_Describes(), iter.next()));
			List describesToRemoveFromDescribes = basePart.getDescribesToRemove();
			for (Iterator iter = describesToRemoveFromDescribes.iterator(); iter.hasNext();)
				cc.append(RemoveCommand.create(editingDomain, argumentReasoning, ArmPackage.eINSTANCE.getArgumentReasoning_Describes(), iter.next()));
			//List describesToMoveFromDescribes = basePart.getDescribesToMove();
			//for (Iterator iter = describesToMoveFromDescribes.iterator(); iter.hasNext();){
			//	org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement moveElement = (org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement)iter.next();
			//	cc.append(MoveCommand.create(editingDomain, argumentReasoning, ArmPackage.eINSTANCE.getAssertedInference(), moveElement.getElement(), moveElement.getIndex()));
			//}
			if (argumentReasoning.eGet(ArmPackage.eINSTANCE.getArgumentReasoning_HasStructure()) == null || !argumentReasoning.eGet(ArmPackage.eINSTANCE.getArgumentReasoning_HasStructure()).equals(basePart.getHasStructure())) {
				cc.append(SetCommand.create(editingDomain, argumentReasoning, ArmPackage.eINSTANCE.getArgumentReasoning_HasStructure(), basePart.getHasStructure()));
			}

		}
		if (!cc.isEmpty())
			return cc;
		cc.append(IdentityCommand.INSTANCE);
		return cc;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#getPropertiesEditionObject()
	 * 
	 */
	public EObject getPropertiesEditionObject(EObject source) {
		if (source instanceof ArgumentReasoning) {
			ArgumentReasoning argumentReasoningToUpdate = (ArgumentReasoning)source;
			argumentReasoningToUpdate.setIdentifier((java.lang.String)EEFConverterUtil.createFromString(ArmPackage.eINSTANCE.getString(), basePart.getIdentifier()));

			argumentReasoningToUpdate.setDescription((java.lang.String)EEFConverterUtil.createFromString(ArmPackage.eINSTANCE.getString(), basePart.getDescription()));

			argumentReasoningToUpdate.setContent((java.lang.String)EEFConverterUtil.createFromString(ArmPackage.eINSTANCE.getString(), basePart.getContent()));

			argumentReasoningToUpdate.getIsTagged().addAll(basePart.getIsTaggedToAdd());
			argumentReasoningToUpdate.getDescribes().addAll(basePart.getDescribesToAdd());
			argumentReasoningToUpdate.setHasStructure((Argument)basePart.getHasStructure());

			return argumentReasoningToUpdate;
		}
		else
			return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		if (!isInitializing()) {
			Diagnostic valueDiagnostic = validateValue(event);
			if (PropertiesEditionEvent.COMMIT == event.getState() && IPropertiesEditionComponent.LIVE_MODE.equals(editing_mode) && valueDiagnostic.getSeverity() == Diagnostic.OK) {
				CompoundCommand command = new CompoundCommand();
			if (ArmViewsRepository.ArgumentReasoning.identifier == event.getAffectedEditor()) {
				command.append(SetCommand.create(liveEditingDomain, argumentReasoning, ArmPackage.eINSTANCE.getModelElement_Identifier(), EEFConverterUtil.createFromString(ArmPackage.eINSTANCE.getString(), (String)event.getNewValue())));
			}
			if (ArmViewsRepository.ArgumentReasoning.description == event.getAffectedEditor()) {
				command.append(SetCommand.create(liveEditingDomain, argumentReasoning, ArmPackage.eINSTANCE.getModelElement_Description(), EEFConverterUtil.createFromString(ArmPackage.eINSTANCE.getString(), (String)event.getNewValue())));
			}
			if (ArmViewsRepository.ArgumentReasoning.content == event.getAffectedEditor()) {
				command.append(SetCommand.create(liveEditingDomain, argumentReasoning, ArmPackage.eINSTANCE.getModelElement_Content(), EEFConverterUtil.createFromString(ArmPackage.eINSTANCE.getString(), (String)event.getNewValue())));
			}
			if (ArmViewsRepository.ArgumentReasoning.isTagged == event.getAffectedEditor()) {
				if (PropertiesEditionEvent.SET == event.getKind()) {
					TaggedValue oldValue = (TaggedValue)event.getOldValue();
					TaggedValue newValue = (TaggedValue)event.getNewValue();
					// TODO: Complete the argumentReasoning update command
					for (EStructuralFeature feature : newValue.eClass().getEAllStructuralFeatures()) {
						if (feature.isChangeable() && !(feature instanceof EReference && ((EReference) feature).isContainer())) {
							command.append(SetCommand.create(liveEditingDomain, oldValue, feature, newValue.eGet(feature)));
						}
					}
				}
				else if (PropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, argumentReasoning, ArmPackage.eINSTANCE.getModelElement_IsTagged(), event.getNewValue()));
				else if (PropertiesEditionEvent.REMOVE == event.getKind())
					command.append(DeleteCommand.create(liveEditingDomain, event.getNewValue()));
				else if (PropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, argumentReasoning, ArmPackage.eINSTANCE.getTaggedValue(), event.getNewValue(), event.getNewIndex()));
			}
			if (ArmViewsRepository.ArgumentReasoning.describes == event.getAffectedEditor()) {
				if (PropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, argumentReasoning, ArmPackage.eINSTANCE.getArgumentReasoning_Describes(), event.getNewValue()));
				if (PropertiesEditionEvent.REMOVE == event.getKind())
					command.append(RemoveCommand.create(liveEditingDomain, argumentReasoning, ArmPackage.eINSTANCE.getArgumentReasoning_Describes(), event.getNewValue()));
				if (PropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, argumentReasoning, ArmPackage.eINSTANCE.getArgumentReasoning_Describes(), event.getNewValue(), event.getNewIndex()));
			}
			if (ArmViewsRepository.ArgumentReasoning.hasStructure == event.getAffectedEditor())
				command.append(SetCommand.create(liveEditingDomain, argumentReasoning, ArmPackage.eINSTANCE.getArgumentReasoning_HasStructure(), event.getNewValue()));

				if (!command.isEmpty() && !command.canExecute()) {
					EEFRuntimePlugin.getDefault().logError("Cannot perform model change command.", null);
				} else {
					liveEditingDomain.getCommandStack().execute(command);
				}
			}
			if (valueDiagnostic.getSeverity() != Diagnostic.OK && valueDiagnostic instanceof BasicDiagnostic)
				super.firePropertiesChanged(new PropertiesValidationEditionEvent(event, valueDiagnostic));
			else {
				Diagnostic validate = validate();
				super.firePropertiesChanged(new PropertiesValidationEditionEvent(event, validate));
			}
			super.firePropertiesChanged(event);
		}
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
			String newStringValue = event.getNewValue().toString();
			try {
				if (ArmViewsRepository.ArgumentReasoning.identifier == event.getAffectedEditor()) {
					Object newValue = EcoreUtil.createFromString(ArmPackage.eINSTANCE.getModelElement_Identifier().getEAttributeType(), newStringValue);
					ret = Diagnostician.INSTANCE.validate(ArmPackage.eINSTANCE.getModelElement_Identifier().getEAttributeType(), newValue);
				}
				if (ArmViewsRepository.ArgumentReasoning.description == event.getAffectedEditor()) {
					Object newValue = EcoreUtil.createFromString(ArmPackage.eINSTANCE.getModelElement_Description().getEAttributeType(), newStringValue);
					ret = Diagnostician.INSTANCE.validate(ArmPackage.eINSTANCE.getModelElement_Description().getEAttributeType(), newValue);
				}
				if (ArmViewsRepository.ArgumentReasoning.content == event.getAffectedEditor()) {
					Object newValue = EcoreUtil.createFromString(ArmPackage.eINSTANCE.getModelElement_Content().getEAttributeType(), newStringValue);
					ret = Diagnostician.INSTANCE.validate(ArmPackage.eINSTANCE.getModelElement_Content().getEAttributeType(), newValue);
				}
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validate()
	 * 
	 */
	public Diagnostic validate() {
		Diagnostic validate = Diagnostic.OK_INSTANCE;
		if (IPropertiesEditionComponent.BATCH_MODE.equals(editing_mode)) {
			EObject copy = EcoreUtil.copy(argumentReasoning);
			copy = getPropertiesEditionObject(copy);
			validate =  EEFRuntimePlugin.getEEFValidator().validate(copy);
		}
		else if (IPropertiesEditionComponent.LIVE_MODE.equals(editing_mode))
			validate = EEFRuntimePlugin.getEEFValidator().validate(argumentReasoning);
		// Start of user code for custom validation check
		
		// End of user code
		return validate;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#dispose()
	 * 
	 */
	public void dispose() {
		if (semanticAdapter != null)
			argumentReasoning.eAdapters().remove(semanticAdapter);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#getTabText(java.lang.String)
	 * 
	 */
	public String getTabText(String p_key) {
		return basePart.getTitle();
	}
}