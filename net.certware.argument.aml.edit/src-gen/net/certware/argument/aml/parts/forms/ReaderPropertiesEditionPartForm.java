
package net.certware.argument.aml.parts.forms;

// Start of user code for imports
import net.certware.argument.aml.parts.AmlViewsRepository;
import net.certware.argument.aml.parts.ReaderPropertiesEditionPart;
import net.certware.argument.aml.providers.AmlMessages;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;


// End of user code

/**
 * @author mrb
 * 
 */
public class ReaderPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, ReaderPropertiesEditionPart {

	protected Text description;
	protected Text idRef;
	protected Text objectType;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ReaderPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createFigure(org.eclipse.swt.widgets.Composite, org.eclipse.ui.forms.widgets.FormToolkit)
	 * 
	 */
	public Composite createFigure(final Composite parent, final FormToolkit widgetFactory) {
		ScrolledForm scrolledForm = widgetFactory.createScrolledForm(parent);
		Form form = scrolledForm.getForm();
		view = form.getBody();
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(widgetFactory, view);
		return scrolledForm;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createControls(org.eclipse.ui.forms.widgets.FormToolkit, org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(final FormToolkit widgetFactory, Composite view) {
		createPropertiesGroup(widgetFactory, view);

		// Start of user code for additional ui definition
		
		// End of user code
	}
	/**
	 * 
	 */
	protected void createPropertiesGroup(FormToolkit widgetFactory, final Composite view) {
		Section propertiesSection = widgetFactory.createSection(view, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		propertiesSection.setText(AmlMessages.ReaderPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesSectionData.horizontalSpan = 3;
		propertiesSection.setLayoutData(propertiesSectionData);
		Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		createDescriptionTextarea(widgetFactory, propertiesGroup);
		createIdRefText(widgetFactory, propertiesGroup);
		createObjectTypeText(widgetFactory, propertiesGroup);
		propertiesSection.setClient(propertiesGroup);
	}

	
	protected void createDescriptionTextarea(FormToolkit widgetFactory, Composite parent) {
		Label descriptionLabel = FormUtils.createPartLabel(widgetFactory, parent, AmlMessages.ReaderPropertiesEditionPart_DescriptionLabel, propertiesEditionComponent.isRequired(AmlViewsRepository.Reader.description, AmlViewsRepository.FORM_KIND));
		GridData descriptionLabelData = new GridData(GridData.FILL_HORIZONTAL);
		descriptionLabelData.horizontalSpan = 3;
		descriptionLabel.setLayoutData(descriptionLabelData);
		description = widgetFactory.createText(parent, "", SWT.BORDER | SWT.WRAP | SWT.MULTI | SWT.V_SCROLL); //$NON-NLS-1$
		GridData descriptionData = new GridData(GridData.FILL_HORIZONTAL);
		descriptionData.horizontalSpan = 2;
		descriptionData.heightHint = 80;
		descriptionData.widthHint = 200;
		description.setLayoutData(descriptionData);
		description.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReaderPropertiesEditionPartForm.this, AmlViewsRepository.Reader.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
			}

		});
		EditingUtils.setID(description, AmlViewsRepository.Reader.description);
		EditingUtils.setEEFtype(description, "eef::Textarea"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(AmlViewsRepository.Reader.description, AmlViewsRepository.FORM_KIND), null); //$NON-NLS-1$
	}

	
	protected void createIdRefText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, AmlMessages.ReaderPropertiesEditionPart_IdRefLabel, propertiesEditionComponent.isRequired(AmlViewsRepository.Reader.idRef, AmlViewsRepository.FORM_KIND));
		idRef = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		idRef.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData idRefData = new GridData(GridData.FILL_HORIZONTAL);
		idRef.setLayoutData(idRefData);
		idRef.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReaderPropertiesEditionPartForm.this, AmlViewsRepository.Reader.idRef, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, idRef.getText()));
			}
		});
		idRef.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReaderPropertiesEditionPartForm.this, AmlViewsRepository.Reader.idRef, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, idRef.getText()));
				}
			}
		});
		EditingUtils.setID(idRef, AmlViewsRepository.Reader.idRef);
		EditingUtils.setEEFtype(idRef, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(AmlViewsRepository.Reader.idRef, AmlViewsRepository.FORM_KIND), null); //$NON-NLS-1$
	}

	
	protected void createObjectTypeText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, AmlMessages.ReaderPropertiesEditionPart_ObjectTypeLabel, propertiesEditionComponent.isRequired(AmlViewsRepository.Reader.objectType, AmlViewsRepository.FORM_KIND));
		objectType = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		objectType.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData objectTypeData = new GridData(GridData.FILL_HORIZONTAL);
		objectType.setLayoutData(objectTypeData);
		objectType.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReaderPropertiesEditionPartForm.this, AmlViewsRepository.Reader.objectType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, objectType.getText()));
			}
		});
		objectType.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReaderPropertiesEditionPartForm.this, AmlViewsRepository.Reader.objectType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, objectType.getText()));
				}
			}
		});
		EditingUtils.setID(objectType, AmlViewsRepository.Reader.objectType);
		EditingUtils.setEEFtype(objectType, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(AmlViewsRepository.Reader.objectType, AmlViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see net.certware.argument.aml.parts.ReaderPropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.ReaderPropertiesEditionPart#setDescription(String newValue)
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
	 * @see net.certware.argument.aml.parts.ReaderPropertiesEditionPart#getIdRef()
	 * 
	 */
	public String getIdRef() {
		return idRef.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.ReaderPropertiesEditionPart#setIdRef(String newValue)
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
	 * @see net.certware.argument.aml.parts.ReaderPropertiesEditionPart#getObjectType()
	 * 
	 */
	public String getObjectType() {
		return objectType.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.ReaderPropertiesEditionPart#setObjectType(String newValue)
	 * 
	 */
	public void setObjectType(String newValue) {
		if (newValue != null) {
			objectType.setText(newValue);
		} else {
			objectType.setText(""); //$NON-NLS-1$
		}
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return AmlMessages.Reader_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
