/**
 * Generated with Acceleo
 */
package net.certware.measurement.sco.parts.forms;

// Start of user code for imports
import net.certware.measurement.sco.parts.ImprovementChangeOrdersPropertiesEditionPart;
import net.certware.measurement.sco.parts.ScoViewsRepository;
import net.certware.measurement.sco.providers.ScoMessages;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.util.EcoreAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
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
 * @author mrb
 * 
 */
public class ImprovementChangeOrdersPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, ImprovementChangeOrdersPropertiesEditionPart {

	protected Text name;
	protected Text value;
	protected EMFComboViewer type;
	protected Text brokenLines;
	protected Text fixedLines;
	protected Text repairEffort;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ImprovementChangeOrdersPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		propertiesSection.setText(ScoMessages.ImprovementChangeOrdersPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesSectionData.horizontalSpan = 3;
		propertiesSection.setLayoutData(propertiesSectionData);
		Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		createNameText(widgetFactory, propertiesGroup);
		createValueText(widgetFactory, propertiesGroup);
		createTypeEMFComboViewer(widgetFactory, propertiesGroup);
		createBrokenLinesText(widgetFactory, propertiesGroup);
		createFixedLinesText(widgetFactory, propertiesGroup);
		createRepairEffortText(widgetFactory, propertiesGroup);
		propertiesSection.setClient(propertiesGroup);
	}

	
	protected void createNameText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ScoMessages.ImprovementChangeOrdersPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(ScoViewsRepository.ImprovementChangeOrders.name, ScoViewsRepository.FORM_KIND));
		name = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		name.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ImprovementChangeOrdersPropertiesEditionPartForm.this, ScoViewsRepository.ImprovementChangeOrders.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
			}
		});
		name.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ImprovementChangeOrdersPropertiesEditionPartForm.this, ScoViewsRepository.ImprovementChangeOrders.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, ScoViewsRepository.ImprovementChangeOrders.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ScoViewsRepository.ImprovementChangeOrders.name, ScoViewsRepository.FORM_KIND), null); //$NON-NLS-1$
	}

	
	protected void createValueText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ScoMessages.ImprovementChangeOrdersPropertiesEditionPart_ValueLabel, propertiesEditionComponent.isRequired(ScoViewsRepository.ImprovementChangeOrders.value, ScoViewsRepository.FORM_KIND));
		value = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		value.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData valueData = new GridData(GridData.FILL_HORIZONTAL);
		value.setLayoutData(valueData);
		value.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ImprovementChangeOrdersPropertiesEditionPartForm.this, ScoViewsRepository.ImprovementChangeOrders.value, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, value.getText()));
			}
		});
		value.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ImprovementChangeOrdersPropertiesEditionPartForm.this, ScoViewsRepository.ImprovementChangeOrders.value, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, value.getText()));
				}
			}
		});
		EditingUtils.setID(value, ScoViewsRepository.ImprovementChangeOrders.value);
		EditingUtils.setEEFtype(value, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ScoViewsRepository.ImprovementChangeOrders.value, ScoViewsRepository.FORM_KIND), null); //$NON-NLS-1$
	}

	
	protected void createTypeEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ScoMessages.ImprovementChangeOrdersPropertiesEditionPart_TypeLabel, propertiesEditionComponent.isRequired(ScoViewsRepository.ImprovementChangeOrders.type, ScoViewsRepository.FORM_KIND));
		type = new EMFComboViewer(parent);
		type.setContentProvider(new ArrayContentProvider());
		type.setLabelProvider(new AdapterFactoryLabelProvider(new EcoreAdapterFactory()));
		GridData typeData = new GridData(GridData.FILL_HORIZONTAL);
		type.getCombo().setLayoutData(typeData);
		type.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ImprovementChangeOrdersPropertiesEditionPartForm.this, ScoViewsRepository.ImprovementChangeOrders.type, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getType()));
			}

		});
		type.setID(ScoViewsRepository.ImprovementChangeOrders.type);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ScoViewsRepository.ImprovementChangeOrders.type, ScoViewsRepository.FORM_KIND), null); //$NON-NLS-1$
	}

	
	protected void createBrokenLinesText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ScoMessages.ImprovementChangeOrdersPropertiesEditionPart_BrokenLinesLabel, propertiesEditionComponent.isRequired(ScoViewsRepository.ImprovementChangeOrders.brokenLines, ScoViewsRepository.FORM_KIND));
		brokenLines = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		brokenLines.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData brokenLinesData = new GridData(GridData.FILL_HORIZONTAL);
		brokenLines.setLayoutData(brokenLinesData);
		brokenLines.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ImprovementChangeOrdersPropertiesEditionPartForm.this, ScoViewsRepository.ImprovementChangeOrders.brokenLines, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, brokenLines.getText()));
			}
		});
		brokenLines.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ImprovementChangeOrdersPropertiesEditionPartForm.this, ScoViewsRepository.ImprovementChangeOrders.brokenLines, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, brokenLines.getText()));
				}
			}
		});
		EditingUtils.setID(brokenLines, ScoViewsRepository.ImprovementChangeOrders.brokenLines);
		EditingUtils.setEEFtype(brokenLines, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ScoViewsRepository.ImprovementChangeOrders.brokenLines, ScoViewsRepository.FORM_KIND), null); //$NON-NLS-1$
	}

	
	protected void createFixedLinesText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ScoMessages.ImprovementChangeOrdersPropertiesEditionPart_FixedLinesLabel, propertiesEditionComponent.isRequired(ScoViewsRepository.ImprovementChangeOrders.fixedLines, ScoViewsRepository.FORM_KIND));
		fixedLines = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		fixedLines.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData fixedLinesData = new GridData(GridData.FILL_HORIZONTAL);
		fixedLines.setLayoutData(fixedLinesData);
		fixedLines.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ImprovementChangeOrdersPropertiesEditionPartForm.this, ScoViewsRepository.ImprovementChangeOrders.fixedLines, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, fixedLines.getText()));
			}
		});
		fixedLines.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ImprovementChangeOrdersPropertiesEditionPartForm.this, ScoViewsRepository.ImprovementChangeOrders.fixedLines, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, fixedLines.getText()));
				}
			}
		});
		EditingUtils.setID(fixedLines, ScoViewsRepository.ImprovementChangeOrders.fixedLines);
		EditingUtils.setEEFtype(fixedLines, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ScoViewsRepository.ImprovementChangeOrders.fixedLines, ScoViewsRepository.FORM_KIND), null); //$NON-NLS-1$
	}

	
	protected void createRepairEffortText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ScoMessages.ImprovementChangeOrdersPropertiesEditionPart_RepairEffortLabel, propertiesEditionComponent.isRequired(ScoViewsRepository.ImprovementChangeOrders.repairEffort, ScoViewsRepository.FORM_KIND));
		repairEffort = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		repairEffort.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData repairEffortData = new GridData(GridData.FILL_HORIZONTAL);
		repairEffort.setLayoutData(repairEffortData);
		repairEffort.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ImprovementChangeOrdersPropertiesEditionPartForm.this, ScoViewsRepository.ImprovementChangeOrders.repairEffort, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, repairEffort.getText()));
			}
		});
		repairEffort.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ImprovementChangeOrdersPropertiesEditionPartForm.this, ScoViewsRepository.ImprovementChangeOrders.repairEffort, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, repairEffort.getText()));
				}
			}
		});
		EditingUtils.setID(repairEffort, ScoViewsRepository.ImprovementChangeOrders.repairEffort);
		EditingUtils.setEEFtype(repairEffort, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ScoViewsRepository.ImprovementChangeOrders.repairEffort, ScoViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see net.certware.measurement.sco.parts.ImprovementChangeOrdersPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.measurement.sco.parts.ImprovementChangeOrdersPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.measurement.sco.parts.ImprovementChangeOrdersPropertiesEditionPart#getValue()
	 * 
	 */
	public String getValue() {
		return value.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.measurement.sco.parts.ImprovementChangeOrdersPropertiesEditionPart#setValue(String newValue)
	 * 
	 */
	public void setValue(String newValue) {
		if (newValue != null) {
			value.setText(newValue);
		} else {
			value.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.measurement.sco.parts.ImprovementChangeOrdersPropertiesEditionPart#getType()
	 * 
	 */
	public Enumerator getType() {
		EEnumLiteral selection = (EEnumLiteral) ((StructuredSelection) type.getSelection()).getFirstElement();
		return selection.getInstance();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.measurement.sco.parts.ImprovementChangeOrdersPropertiesEditionPart#initType(EEnum eenum, Enumerator current)
	 */
	public void initType(EEnum eenum, Enumerator current) {
		type.setInput(eenum.getELiterals());
		type.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.measurement.sco.parts.ImprovementChangeOrdersPropertiesEditionPart#setType(Enumerator newValue)
	 * 
	 */
	public void setType(Enumerator newValue) {
		type.modelUpdating(new StructuredSelection(newValue));
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.measurement.sco.parts.ImprovementChangeOrdersPropertiesEditionPart#getBrokenLines()
	 * 
	 */
	public String getBrokenLines() {
		return brokenLines.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.measurement.sco.parts.ImprovementChangeOrdersPropertiesEditionPart#setBrokenLines(String newValue)
	 * 
	 */
	public void setBrokenLines(String newValue) {
		if (newValue != null) {
			brokenLines.setText(newValue);
		} else {
			brokenLines.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.measurement.sco.parts.ImprovementChangeOrdersPropertiesEditionPart#getFixedLines()
	 * 
	 */
	public String getFixedLines() {
		return fixedLines.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.measurement.sco.parts.ImprovementChangeOrdersPropertiesEditionPart#setFixedLines(String newValue)
	 * 
	 */
	public void setFixedLines(String newValue) {
		if (newValue != null) {
			fixedLines.setText(newValue);
		} else {
			fixedLines.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.measurement.sco.parts.ImprovementChangeOrdersPropertiesEditionPart#getRepairEffort()
	 * 
	 */
	public String getRepairEffort() {
		return repairEffort.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.measurement.sco.parts.ImprovementChangeOrdersPropertiesEditionPart#setRepairEffort(String newValue)
	 * 
	 */
	public void setRepairEffort(String newValue) {
		if (newValue != null) {
			repairEffort.setText(newValue);
		} else {
			repairEffort.setText(""); //$NON-NLS-1$
		}
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ScoMessages.ImprovementChangeOrders_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
