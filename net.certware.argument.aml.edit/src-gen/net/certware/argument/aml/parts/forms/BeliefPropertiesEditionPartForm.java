/**
 * Generated with Acceleo
 */
package net.certware.argument.aml.parts.forms;

// Start of user code for imports
import net.certware.argument.aml.parts.AmlViewsRepository;
import net.certware.argument.aml.parts.BeliefPropertiesEditionPart;
import net.certware.argument.aml.providers.AmlMessages;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
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
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;


// End of user code

/**
 * 
 * 
 */
public class BeliefPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, BeliefPropertiesEditionPart {

	protected Text description;
	protected Text label;
	protected Text ordinal;
	protected Text symbol;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public BeliefPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence beliefStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = beliefStep.addStep(AmlViewsRepository.Belief.Properties.class);
		propertiesStep.addStep(AmlViewsRepository.Belief.Properties.description);
		propertiesStep.addStep(AmlViewsRepository.Belief.Properties.label);
		propertiesStep.addStep(AmlViewsRepository.Belief.Properties.ordinal);
		propertiesStep.addStep(AmlViewsRepository.Belief.Properties.symbol);
		
		
		composer = new PartComposer(beliefStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == AmlViewsRepository.Belief.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == AmlViewsRepository.Belief.Properties.description) {
					return 		createDescriptionText(widgetFactory, parent);
				}
				if (key == AmlViewsRepository.Belief.Properties.label) {
					return 		createLabelText(widgetFactory, parent);
				}
				if (key == AmlViewsRepository.Belief.Properties.ordinal) {
					return 		createOrdinalText(widgetFactory, parent);
				}
				if (key == AmlViewsRepository.Belief.Properties.symbol) {
					return 		createSymbolText(widgetFactory, parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	/**
	 * 
	 */
	protected Composite createPropertiesGroup(FormToolkit widgetFactory, final Composite parent) {
		Section propertiesSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		propertiesSection.setText(AmlMessages.BeliefPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesSectionData.horizontalSpan = 3;
		propertiesSection.setLayoutData(propertiesSectionData);
		Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		propertiesSection.setClient(propertiesGroup);
		return propertiesGroup;
	}

	
	protected Composite createDescriptionText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, AmlMessages.BeliefPropertiesEditionPart_DescriptionLabel, propertiesEditionComponent.isRequired(AmlViewsRepository.Belief.Properties.description, AmlViewsRepository.FORM_KIND));
		description = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		description.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData descriptionData = new GridData(GridData.FILL_HORIZONTAL);
		description.setLayoutData(descriptionData);
		description.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BeliefPropertiesEditionPartForm.this, AmlViewsRepository.Belief.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
			}
		});
		description.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BeliefPropertiesEditionPartForm.this, AmlViewsRepository.Belief.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}
		});
		EditingUtils.setID(description, AmlViewsRepository.Belief.Properties.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(AmlViewsRepository.Belief.Properties.description, AmlViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createLabelText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, AmlMessages.BeliefPropertiesEditionPart_LabelLabel, propertiesEditionComponent.isRequired(AmlViewsRepository.Belief.Properties.label, AmlViewsRepository.FORM_KIND));
		label = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		label.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData labelData = new GridData(GridData.FILL_HORIZONTAL);
		label.setLayoutData(labelData);
		label.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BeliefPropertiesEditionPartForm.this, AmlViewsRepository.Belief.Properties.label, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, label.getText()));
			}
		});
		label.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BeliefPropertiesEditionPartForm.this, AmlViewsRepository.Belief.Properties.label, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, label.getText()));
				}
			}
		});
		EditingUtils.setID(label, AmlViewsRepository.Belief.Properties.label);
		EditingUtils.setEEFtype(label, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(AmlViewsRepository.Belief.Properties.label, AmlViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createOrdinalText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, AmlMessages.BeliefPropertiesEditionPart_OrdinalLabel, propertiesEditionComponent.isRequired(AmlViewsRepository.Belief.Properties.ordinal, AmlViewsRepository.FORM_KIND));
		ordinal = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		ordinal.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData ordinalData = new GridData(GridData.FILL_HORIZONTAL);
		ordinal.setLayoutData(ordinalData);
		ordinal.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BeliefPropertiesEditionPartForm.this, AmlViewsRepository.Belief.Properties.ordinal, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, ordinal.getText()));
			}
		});
		ordinal.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BeliefPropertiesEditionPartForm.this, AmlViewsRepository.Belief.Properties.ordinal, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, ordinal.getText()));
				}
			}
		});
		EditingUtils.setID(ordinal, AmlViewsRepository.Belief.Properties.ordinal);
		EditingUtils.setEEFtype(ordinal, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(AmlViewsRepository.Belief.Properties.ordinal, AmlViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createSymbolText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, AmlMessages.BeliefPropertiesEditionPart_SymbolLabel, propertiesEditionComponent.isRequired(AmlViewsRepository.Belief.Properties.symbol, AmlViewsRepository.FORM_KIND));
		symbol = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		symbol.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData symbolData = new GridData(GridData.FILL_HORIZONTAL);
		symbol.setLayoutData(symbolData);
		symbol.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BeliefPropertiesEditionPartForm.this, AmlViewsRepository.Belief.Properties.symbol, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, symbol.getText()));
			}
		});
		symbol.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BeliefPropertiesEditionPartForm.this, AmlViewsRepository.Belief.Properties.symbol, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, symbol.getText()));
				}
			}
		});
		EditingUtils.setID(symbol, AmlViewsRepository.Belief.Properties.symbol);
		EditingUtils.setEEFtype(symbol, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(AmlViewsRepository.Belief.Properties.symbol, AmlViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
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
	 * @see net.certware.argument.aml.parts.BeliefPropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.BeliefPropertiesEditionPart#setDescription(String newValue)
	 * 
	 */
	public void setDescription(String newValue) {
		if (newValue != null) {
			description.setText(newValue);
		} else {
			description.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.BeliefPropertiesEditionPart#getLabel()
	 * 
	 */
	public String getLabel() {
		return label.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.BeliefPropertiesEditionPart#setLabel(String newValue)
	 * 
	 */
	public void setLabel(String newValue) {
		if (newValue != null) {
			label.setText(newValue);
		} else {
			label.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.BeliefPropertiesEditionPart#getOrdinal()
	 * 
	 */
	public String getOrdinal() {
		return ordinal.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.BeliefPropertiesEditionPart#setOrdinal(String newValue)
	 * 
	 */
	public void setOrdinal(String newValue) {
		if (newValue != null) {
			ordinal.setText(newValue);
		} else {
			ordinal.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.BeliefPropertiesEditionPart#getSymbol()
	 * 
	 */
	public String getSymbol() {
		return symbol.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.BeliefPropertiesEditionPart#setSymbol(String newValue)
	 * 
	 */
	public void setSymbol(String newValue) {
		if (newValue != null) {
			symbol.setText(newValue);
		} else {
			symbol.setText(""); //$NON-NLS-1$
		}
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return AmlMessages.Belief_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
