/**
 * Generated with Acceleo
 */
package net.certware.argument.aml.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;

import net.certware.argument.aml.AmlPackage;
import net.certware.argument.aml.parts.AmlViewsRepository;
import net.certware.argument.aml.parts.DocumentRootPropertiesEditionPart;
import net.certware.argument.aml.providers.AmlMessages;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
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
import org.eclipse.emf.eef.runtime.ui.widgets.EEFFeatureEditorDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
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
public class DocumentRootPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, DocumentRootPropertiesEditionPart {

	protected Text mixed;
		protected Button editMixed;
		private EList mixedList;
	protected ReferencesTable xMLNSPrefixMap;
	protected List<ViewerFilter> xMLNSPrefixMapBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> xMLNSPrefixMapFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable xSISchemaLocation;
	protected List<ViewerFilter> xSISchemaLocationBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> xSISchemaLocationFilters = new ArrayList<ViewerFilter>();
	protected Text description1;
	protected Text id;
	protected Text idRef;
	protected Text label1;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public DocumentRootPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence documentRootStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = documentRootStep.addStep(AmlViewsRepository.DocumentRoot.Properties.class);
		propertiesStep.addStep(AmlViewsRepository.DocumentRoot.Properties.mixed);
		propertiesStep.addStep(AmlViewsRepository.DocumentRoot.Properties.xMLNSPrefixMap);
		propertiesStep.addStep(AmlViewsRepository.DocumentRoot.Properties.xSISchemaLocation);
		propertiesStep.addStep(AmlViewsRepository.DocumentRoot.Properties.description1);
		propertiesStep.addStep(AmlViewsRepository.DocumentRoot.Properties.id);
		propertiesStep.addStep(AmlViewsRepository.DocumentRoot.Properties.idRef);
		propertiesStep.addStep(AmlViewsRepository.DocumentRoot.Properties.label1);
		
		
		composer = new PartComposer(documentRootStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == AmlViewsRepository.DocumentRoot.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == AmlViewsRepository.DocumentRoot.Properties.mixed) {
					return createMixedMultiValuedEditor(widgetFactory, parent);
				}
				if (key == AmlViewsRepository.DocumentRoot.Properties.xMLNSPrefixMap) {
					return createXMLNSPrefixMapTableComposition(widgetFactory, parent);
				}
				if (key == AmlViewsRepository.DocumentRoot.Properties.xSISchemaLocation) {
					return createXSISchemaLocationTableComposition(widgetFactory, parent);
				}
				if (key == AmlViewsRepository.DocumentRoot.Properties.description1) {
					return 		createDescription1Text(widgetFactory, parent);
				}
				if (key == AmlViewsRepository.DocumentRoot.Properties.id) {
					return 		createIdText(widgetFactory, parent);
				}
				if (key == AmlViewsRepository.DocumentRoot.Properties.idRef) {
					return 		createIdRefText(widgetFactory, parent);
				}
				if (key == AmlViewsRepository.DocumentRoot.Properties.label1) {
					return 		createLabel1Text(widgetFactory, parent);
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
		propertiesSection.setText(AmlMessages.DocumentRootPropertiesEditionPart_PropertiesGroupLabel);
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

	/**
	 * 
	 */
	protected Composite createMixedMultiValuedEditor(FormToolkit widgetFactory, Composite parent) {
		mixed = widgetFactory.createText(parent, "", SWT.READ_ONLY); //$NON-NLS-1$
		GridData mixedData = new GridData(GridData.FILL_HORIZONTAL);
		mixedData.horizontalSpan = 2;
		mixed.setLayoutData(mixedData);
		EditingUtils.setID(mixed, AmlViewsRepository.DocumentRoot.Properties.mixed);
		EditingUtils.setEEFtype(mixed, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editMixed = widgetFactory.createButton(parent, AmlMessages.DocumentRootPropertiesEditionPart_MixedLabel, SWT.NONE);
		GridData editMixedData = new GridData();
		editMixed.setLayoutData(editMixedData);
		editMixed.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(
						mixed.getShell(), "DocumentRoot", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						mixedList, AmlPackage.eINSTANCE.getDocumentRoot_Mixed().getEType(), null,
						false, true, 
						null, null);
				if (dialog.open() == Window.OK) {
					mixedList = dialog.getResult();
					if (mixedList == null) {
						mixedList = new BasicEList();
					}
					mixed.setText(mixedList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DocumentRootPropertiesEditionPartForm.this, AmlViewsRepository.DocumentRoot.Properties.mixed, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new BasicEList(mixedList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editMixed, AmlViewsRepository.DocumentRoot.Properties.mixed);
		EditingUtils.setEEFtype(editMixed, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createXMLNSPrefixMapTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.xMLNSPrefixMap = new ReferencesTable(AmlMessages.DocumentRootPropertiesEditionPart_XMLNSPrefixMapLabel, new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DocumentRootPropertiesEditionPartForm.this, AmlViewsRepository.DocumentRoot.Properties.xMLNSPrefixMap, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				xMLNSPrefixMap.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DocumentRootPropertiesEditionPartForm.this, AmlViewsRepository.DocumentRoot.Properties.xMLNSPrefixMap, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				xMLNSPrefixMap.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DocumentRootPropertiesEditionPartForm.this, AmlViewsRepository.DocumentRoot.Properties.xMLNSPrefixMap, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				xMLNSPrefixMap.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DocumentRootPropertiesEditionPartForm.this, AmlViewsRepository.DocumentRoot.Properties.xMLNSPrefixMap, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				xMLNSPrefixMap.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.xMLNSPrefixMapFilters) {
			this.xMLNSPrefixMap.addFilter(filter);
		}
		this.xMLNSPrefixMap.setHelpText(propertiesEditionComponent.getHelpContent(AmlViewsRepository.DocumentRoot.Properties.xMLNSPrefixMap, AmlViewsRepository.FORM_KIND));
		this.xMLNSPrefixMap.createControls(parent, widgetFactory);
		this.xMLNSPrefixMap.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DocumentRootPropertiesEditionPartForm.this, AmlViewsRepository.DocumentRoot.Properties.xMLNSPrefixMap, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData xMLNSPrefixMapData = new GridData(GridData.FILL_HORIZONTAL);
		xMLNSPrefixMapData.horizontalSpan = 3;
		this.xMLNSPrefixMap.setLayoutData(xMLNSPrefixMapData);
		this.xMLNSPrefixMap.setLowerBound(0);
		this.xMLNSPrefixMap.setUpperBound(-1);
		xMLNSPrefixMap.setID(AmlViewsRepository.DocumentRoot.Properties.xMLNSPrefixMap);
		xMLNSPrefixMap.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createXSISchemaLocationTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.xSISchemaLocation = new ReferencesTable(AmlMessages.DocumentRootPropertiesEditionPart_XSISchemaLocationLabel, new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DocumentRootPropertiesEditionPartForm.this, AmlViewsRepository.DocumentRoot.Properties.xSISchemaLocation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				xSISchemaLocation.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DocumentRootPropertiesEditionPartForm.this, AmlViewsRepository.DocumentRoot.Properties.xSISchemaLocation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				xSISchemaLocation.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DocumentRootPropertiesEditionPartForm.this, AmlViewsRepository.DocumentRoot.Properties.xSISchemaLocation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				xSISchemaLocation.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DocumentRootPropertiesEditionPartForm.this, AmlViewsRepository.DocumentRoot.Properties.xSISchemaLocation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				xSISchemaLocation.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.xSISchemaLocationFilters) {
			this.xSISchemaLocation.addFilter(filter);
		}
		this.xSISchemaLocation.setHelpText(propertiesEditionComponent.getHelpContent(AmlViewsRepository.DocumentRoot.Properties.xSISchemaLocation, AmlViewsRepository.FORM_KIND));
		this.xSISchemaLocation.createControls(parent, widgetFactory);
		this.xSISchemaLocation.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DocumentRootPropertiesEditionPartForm.this, AmlViewsRepository.DocumentRoot.Properties.xSISchemaLocation, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData xSISchemaLocationData = new GridData(GridData.FILL_HORIZONTAL);
		xSISchemaLocationData.horizontalSpan = 3;
		this.xSISchemaLocation.setLayoutData(xSISchemaLocationData);
		this.xSISchemaLocation.setLowerBound(0);
		this.xSISchemaLocation.setUpperBound(-1);
		xSISchemaLocation.setID(AmlViewsRepository.DocumentRoot.Properties.xSISchemaLocation);
		xSISchemaLocation.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDescription1Text(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, AmlMessages.DocumentRootPropertiesEditionPart_Description1Label, propertiesEditionComponent.isRequired(AmlViewsRepository.DocumentRoot.Properties.description1, AmlViewsRepository.FORM_KIND));
		description1 = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		description1.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData description1Data = new GridData(GridData.FILL_HORIZONTAL);
		description1.setLayoutData(description1Data);
		description1.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DocumentRootPropertiesEditionPartForm.this, AmlViewsRepository.DocumentRoot.Properties.description1, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description1.getText()));
			}
		});
		description1.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DocumentRootPropertiesEditionPartForm.this, AmlViewsRepository.DocumentRoot.Properties.description1, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description1.getText()));
				}
			}
		});
		EditingUtils.setID(description1, AmlViewsRepository.DocumentRoot.Properties.description1);
		EditingUtils.setEEFtype(description1, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(AmlViewsRepository.DocumentRoot.Properties.description1, AmlViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createIdText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, AmlMessages.DocumentRootPropertiesEditionPart_IdLabel, propertiesEditionComponent.isRequired(AmlViewsRepository.DocumentRoot.Properties.id, AmlViewsRepository.FORM_KIND));
		id = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		id.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData idData = new GridData(GridData.FILL_HORIZONTAL);
		id.setLayoutData(idData);
		id.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DocumentRootPropertiesEditionPartForm.this, AmlViewsRepository.DocumentRoot.Properties.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
			}
		});
		id.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DocumentRootPropertiesEditionPartForm.this, AmlViewsRepository.DocumentRoot.Properties.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
				}
			}
		});
		EditingUtils.setID(id, AmlViewsRepository.DocumentRoot.Properties.id);
		EditingUtils.setEEFtype(id, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(AmlViewsRepository.DocumentRoot.Properties.id, AmlViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createIdRefText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, AmlMessages.DocumentRootPropertiesEditionPart_IdRefLabel, propertiesEditionComponent.isRequired(AmlViewsRepository.DocumentRoot.Properties.idRef, AmlViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DocumentRootPropertiesEditionPartForm.this, AmlViewsRepository.DocumentRoot.Properties.idRef, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, idRef.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DocumentRootPropertiesEditionPartForm.this, AmlViewsRepository.DocumentRoot.Properties.idRef, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, idRef.getText()));
				}
			}
		});
		EditingUtils.setID(idRef, AmlViewsRepository.DocumentRoot.Properties.idRef);
		EditingUtils.setEEFtype(idRef, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(AmlViewsRepository.DocumentRoot.Properties.idRef, AmlViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createLabel1Text(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, AmlMessages.DocumentRootPropertiesEditionPart_Label1Label, propertiesEditionComponent.isRequired(AmlViewsRepository.DocumentRoot.Properties.label1, AmlViewsRepository.FORM_KIND));
		label1 = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		label1.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData label1Data = new GridData(GridData.FILL_HORIZONTAL);
		label1.setLayoutData(label1Data);
		label1.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DocumentRootPropertiesEditionPartForm.this, AmlViewsRepository.DocumentRoot.Properties.label1, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, label1.getText()));
			}
		});
		label1.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DocumentRootPropertiesEditionPartForm.this, AmlViewsRepository.DocumentRoot.Properties.label1, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, label1.getText()));
				}
			}
		});
		EditingUtils.setID(label1, AmlViewsRepository.DocumentRoot.Properties.label1);
		EditingUtils.setEEFtype(label1, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(AmlViewsRepository.DocumentRoot.Properties.label1, AmlViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see net.certware.argument.aml.parts.DocumentRootPropertiesEditionPart#getMixed()
	 * 
	 */
	public EList getMixed() {
		return mixedList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.DocumentRootPropertiesEditionPart#setMixed(EList newValue)
	 * 
	 */
	public void setMixed(EList newValue) {
		mixedList = newValue;
		if (newValue != null) {
			mixed.setText(mixedList.toString());
		} else {
			mixed.setText(""); //$NON-NLS-1$
		}
	}

	public void addToMixed(Object newValue) {
		mixedList.add(newValue);
		if (newValue != null) {
			mixed.setText(mixedList.toString());
		} else {
			mixed.setText(""); //$NON-NLS-1$
		}
	}

	public void removeToMixed(Object newValue) {
		mixedList.remove(newValue);
		if (newValue != null) {
			mixed.setText(mixedList.toString());
		} else {
			mixed.setText(""); //$NON-NLS-1$
		}
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.DocumentRootPropertiesEditionPart#initXMLNSPrefixMap(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initXMLNSPrefixMap(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		xMLNSPrefixMap.setContentProvider(contentProvider);
		xMLNSPrefixMap.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.DocumentRootPropertiesEditionPart#updateXMLNSPrefixMap()
	 * 
	 */
	public void updateXMLNSPrefixMap() {
	xMLNSPrefixMap.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.DocumentRootPropertiesEditionPart#addFilterXMLNSPrefixMap(ViewerFilter filter)
	 * 
	 */
	public void addFilterToXMLNSPrefixMap(ViewerFilter filter) {
		xMLNSPrefixMapFilters.add(filter);
		if (this.xMLNSPrefixMap != null) {
			this.xMLNSPrefixMap.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.DocumentRootPropertiesEditionPart#addBusinessFilterXMLNSPrefixMap(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToXMLNSPrefixMap(ViewerFilter filter) {
		xMLNSPrefixMapBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.DocumentRootPropertiesEditionPart#isContainedInXMLNSPrefixMapTable(EObject element)
	 * 
	 */
	public boolean isContainedInXMLNSPrefixMapTable(EObject element) {
		return ((ReferencesTableSettings)xMLNSPrefixMap.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.DocumentRootPropertiesEditionPart#initXSISchemaLocation(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initXSISchemaLocation(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		xSISchemaLocation.setContentProvider(contentProvider);
		xSISchemaLocation.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.DocumentRootPropertiesEditionPart#updateXSISchemaLocation()
	 * 
	 */
	public void updateXSISchemaLocation() {
	xSISchemaLocation.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.DocumentRootPropertiesEditionPart#addFilterXSISchemaLocation(ViewerFilter filter)
	 * 
	 */
	public void addFilterToXSISchemaLocation(ViewerFilter filter) {
		xSISchemaLocationFilters.add(filter);
		if (this.xSISchemaLocation != null) {
			this.xSISchemaLocation.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.DocumentRootPropertiesEditionPart#addBusinessFilterXSISchemaLocation(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToXSISchemaLocation(ViewerFilter filter) {
		xSISchemaLocationBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.DocumentRootPropertiesEditionPart#isContainedInXSISchemaLocationTable(EObject element)
	 * 
	 */
	public boolean isContainedInXSISchemaLocationTable(EObject element) {
		return ((ReferencesTableSettings)xSISchemaLocation.getInput()).contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.DocumentRootPropertiesEditionPart#getDescription1()
	 * 
	 */
	public String getDescription1() {
		return description1.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.DocumentRootPropertiesEditionPart#setDescription1(String newValue)
	 * 
	 */
	public void setDescription1(String newValue) {
		if (newValue != null) {
			description1.setText(newValue);
		} else {
			description1.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.DocumentRootPropertiesEditionPart#getId()
	 * 
	 */
	public String getId() {
		return id.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.DocumentRootPropertiesEditionPart#setId(String newValue)
	 * 
	 */
	public void setId(String newValue) {
		if (newValue != null) {
			id.setText(newValue);
		} else {
			id.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.DocumentRootPropertiesEditionPart#getIdRef()
	 * 
	 */
	public String getIdRef() {
		return idRef.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.DocumentRootPropertiesEditionPart#setIdRef(String newValue)
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
	 * @see net.certware.argument.aml.parts.DocumentRootPropertiesEditionPart#getLabel1()
	 * 
	 */
	public String getLabel1() {
		return label1.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.DocumentRootPropertiesEditionPart#setLabel1(String newValue)
	 * 
	 */
	public void setLabel1(String newValue) {
		if (newValue != null) {
			label1.setText(newValue);
		} else {
			label1.setText(""); //$NON-NLS-1$
		}
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return AmlMessages.DocumentRoot_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
