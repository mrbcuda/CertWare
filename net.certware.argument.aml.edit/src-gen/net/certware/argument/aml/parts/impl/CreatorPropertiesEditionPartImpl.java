
package net.certware.argument.aml.parts.impl;

// Start of user code for imports
import net.certware.argument.aml.parts.AmlViewsRepository;
import net.certware.argument.aml.parts.CreatorPropertiesEditionPart;
import net.certware.argument.aml.providers.AmlMessages;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.util.EcoreAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;



// End of user code	

/**
 * @author mrb
 * 
 */
public class CreatorPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, CreatorPropertiesEditionPart {

	protected Text description;
	protected Text idRef;
	protected EMFComboViewer objectType;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public CreatorPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createFigure(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public Composite createFigure(final Composite parent) {
		view = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(view);
		return view;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createControls(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(Composite view) { 
		createPropertiesGroup(view);


		// Start of user code for additional ui definition
		
		// End of user code
	}

	/**
	 * 
	 */
	protected void createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(AmlMessages.CreatorPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		createDescriptionTextarea(propertiesGroup);
		createIdRefText(propertiesGroup);
		createObjectTypeEMFComboViewer(propertiesGroup);
	}

	
	protected void createDescriptionTextarea(Composite parent) {
		Label descriptionLabel = SWTUtils.createPartLabel(parent, AmlMessages.CreatorPropertiesEditionPart_DescriptionLabel, propertiesEditionComponent.isRequired(AmlViewsRepository.Creator.description, AmlViewsRepository.SWT_KIND));
		GridData descriptionLabelData = new GridData(GridData.FILL_HORIZONTAL);
		descriptionLabelData.horizontalSpan = 3;
		descriptionLabel.setLayoutData(descriptionLabelData);
		description = new Text(parent, SWT.BORDER | SWT.WRAP | SWT.MULTI | SWT.V_SCROLL);
		GridData descriptionData = new GridData(GridData.FILL_HORIZONTAL);
		descriptionData.horizontalSpan = 2;
		descriptionData.heightHint = 80;
		descriptionData.widthHint = 200;
		description.setLayoutData(descriptionData);
		EditingUtils.setID(description, AmlViewsRepository.Creator.description);
		EditingUtils.setEEFtype(description, "eef::Textarea"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AmlViewsRepository.Creator.description, AmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	
	protected void createIdRefText(Composite parent) {
		SWTUtils.createPartLabel(parent, AmlMessages.CreatorPropertiesEditionPart_IdRefLabel, propertiesEditionComponent.isRequired(AmlViewsRepository.Creator.idRef, AmlViewsRepository.SWT_KIND));
		idRef = new Text(parent, SWT.BORDER);
		GridData idRefData = new GridData(GridData.FILL_HORIZONTAL);
		idRef.setLayoutData(idRefData);
		idRef.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CreatorPropertiesEditionPartImpl.this, AmlViewsRepository.Creator.idRef, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, idRef.getText()));
			}

		});
		idRef.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CreatorPropertiesEditionPartImpl.this, AmlViewsRepository.Creator.idRef, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, idRef.getText()));
				}
			}

		});
		EditingUtils.setID(idRef, AmlViewsRepository.Creator.idRef);
		EditingUtils.setEEFtype(idRef, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AmlViewsRepository.Creator.idRef, AmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	
	protected void createObjectTypeEMFComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, AmlMessages.CreatorPropertiesEditionPart_ObjectTypeLabel, propertiesEditionComponent.isRequired(AmlViewsRepository.Creator.objectType, AmlViewsRepository.SWT_KIND));
		objectType = new EMFComboViewer(parent);
		objectType.setContentProvider(new ArrayContentProvider());
		objectType.setLabelProvider(new AdapterFactoryLabelProvider(new EcoreAdapterFactory()));
		GridData objectTypeData = new GridData(GridData.FILL_HORIZONTAL);
		objectType.getCombo().setLayoutData(objectTypeData);
		objectType.setID(AmlViewsRepository.Creator.objectType);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AmlViewsRepository.Creator.objectType, AmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization
		
		// End of user code
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.CreatorPropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.CreatorPropertiesEditionPart#setDescription(String newValue)
	 * 
	 */
	public void setDescription(String newValue) {
		if (newValue != null) {
			description.setText(newValue);
		} else {
			description.setText("");  //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.CreatorPropertiesEditionPart#getIdRef()
	 * 
	 */
	public String getIdRef() {
		return idRef.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.CreatorPropertiesEditionPart#setIdRef(String newValue)
	 * 
	 */
	public void setIdRef(String newValue) {
		if (newValue != null) {
			idRef.setText(newValue);
		} else {
			idRef.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.CreatorPropertiesEditionPart#getObjectType()
	 * 
	 */
	public Enumerator getObjectType() {
		EEnumLiteral selection = (EEnumLiteral) ((StructuredSelection) objectType.getSelection()).getFirstElement();
		return selection.getInstance();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.CreatorPropertiesEditionPart#initObjectType(EEnum eenum, Enumerator current)
	 */
	public void initObjectType(EEnum eenum, Enumerator current) {
		objectType.setInput(eenum.getELiterals());
		objectType.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.CreatorPropertiesEditionPart#setObjectType(Enumerator newValue)
	 * 
	 */
	public void setObjectType(Enumerator newValue) {
		objectType.modelUpdating(new StructuredSelection(newValue));
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return AmlMessages.Creator_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
