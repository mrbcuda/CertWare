/**
 * Generated with Acceleo
 */
package net.certware.argument.arm.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;

import net.certware.argument.arm.parts.ArgumentPropertiesEditionPart;
import net.certware.argument.arm.parts.ArmViewsRepository;
import net.certware.argument.arm.providers.ArmMessages;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;



// End of user code

/**
 * 
 * 
 */
public class ArgumentPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ArgumentPropertiesEditionPart {

	protected Text identifier;
	protected Text description;
	protected Text content;
protected ReferencesTable isTagged;
protected List<ViewerFilter> isTaggedBusinessFilters = new ArrayList<ViewerFilter>();
protected List<ViewerFilter> isTaggedFilters = new ArrayList<ViewerFilter>();
protected ReferencesTable containsArgumentElement;
protected List<ViewerFilter> containsArgumentElementBusinessFilters = new ArrayList<ViewerFilter>();
protected List<ViewerFilter> containsArgumentElementFilters = new ArrayList<ViewerFilter>();
protected ReferencesTable containsArgumentLink;
protected List<ViewerFilter> containsArgumentLinkBusinessFilters = new ArrayList<ViewerFilter>();
protected List<ViewerFilter> containsArgumentLinkFilters = new ArrayList<ViewerFilter>();
protected ReferencesTable containsArgument;
protected List<ViewerFilter> containsArgumentBusinessFilters = new ArrayList<ViewerFilter>();
protected List<ViewerFilter> containsArgumentFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ArgumentPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence argumentStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = argumentStep.addStep(ArmViewsRepository.Argument.Properties.class);
		propertiesStep.addStep(ArmViewsRepository.Argument.Properties.identifier);
		propertiesStep.addStep(ArmViewsRepository.Argument.Properties.description);
		propertiesStep.addStep(ArmViewsRepository.Argument.Properties.content);
		propertiesStep.addStep(ArmViewsRepository.Argument.Properties.isTagged);
		propertiesStep.addStep(ArmViewsRepository.Argument.Properties.containsArgumentElement);
		propertiesStep.addStep(ArmViewsRepository.Argument.Properties.containsArgumentLink);
		propertiesStep.addStep(ArmViewsRepository.Argument.Properties.containsArgument);
		
		
		composer = new PartComposer(argumentStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ArmViewsRepository.Argument.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == ArmViewsRepository.Argument.Properties.identifier) {
					return createIdentifierText(parent);
				}
				if (key == ArmViewsRepository.Argument.Properties.description) {
					return createDescriptionText(parent);
				}
				if (key == ArmViewsRepository.Argument.Properties.content) {
					return createContentText(parent);
				}
				if (key == ArmViewsRepository.Argument.Properties.isTagged) {
					return createIsTaggedAdvancedTableComposition(parent);
				}
				if (key == ArmViewsRepository.Argument.Properties.containsArgumentElement) {
					return createContainsArgumentElementAdvancedTableComposition(parent);
				}
				if (key == ArmViewsRepository.Argument.Properties.containsArgumentLink) {
					return createContainsArgumentLinkAdvancedTableComposition(parent);
				}
				if (key == ArmViewsRepository.Argument.Properties.containsArgument) {
					return createContainsArgumentAdvancedTableComposition(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(ArmMessages.ArgumentPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createIdentifierText(Composite parent) {
		SWTUtils.createPartLabel(parent, ArmMessages.ArgumentPropertiesEditionPart_IdentifierLabel, propertiesEditionComponent.isRequired(ArmViewsRepository.Argument.Properties.identifier, ArmViewsRepository.SWT_KIND));
		identifier = new Text(parent, SWT.BORDER);
		GridData identifierData = new GridData(GridData.FILL_HORIZONTAL);
		identifier.setLayoutData(identifierData);
		identifier.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, ArmViewsRepository.Argument.Properties.identifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, identifier.getText()));
			}

		});
		identifier.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, ArmViewsRepository.Argument.Properties.identifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, identifier.getText()));
				}
			}

		});
		EditingUtils.setID(identifier, ArmViewsRepository.Argument.Properties.identifier);
		EditingUtils.setEEFtype(identifier, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ArmViewsRepository.Argument.Properties.identifier, ArmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDescriptionText(Composite parent) {
		SWTUtils.createPartLabel(parent, ArmMessages.ArgumentPropertiesEditionPart_DescriptionLabel, propertiesEditionComponent.isRequired(ArmViewsRepository.Argument.Properties.description, ArmViewsRepository.SWT_KIND));
		description = new Text(parent, SWT.BORDER);
		GridData descriptionData = new GridData(GridData.FILL_HORIZONTAL);
		description.setLayoutData(descriptionData);
		description.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, ArmViewsRepository.Argument.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
			}

		});
		description.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, ArmViewsRepository.Argument.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}

		});
		EditingUtils.setID(description, ArmViewsRepository.Argument.Properties.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ArmViewsRepository.Argument.Properties.description, ArmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createContentText(Composite parent) {
		SWTUtils.createPartLabel(parent, ArmMessages.ArgumentPropertiesEditionPart_ContentLabel, propertiesEditionComponent.isRequired(ArmViewsRepository.Argument.Properties.content, ArmViewsRepository.SWT_KIND));
		content = new Text(parent, SWT.BORDER);
		GridData contentData = new GridData(GridData.FILL_HORIZONTAL);
		content.setLayoutData(contentData);
		content.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, ArmViewsRepository.Argument.Properties.content, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, content.getText()));
			}

		});
		content.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, ArmViewsRepository.Argument.Properties.content, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, content.getText()));
				}
			}

		});
		EditingUtils.setID(content, ArmViewsRepository.Argument.Properties.content);
		EditingUtils.setEEFtype(content, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ArmViewsRepository.Argument.Properties.content, ArmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createIsTaggedAdvancedTableComposition(Composite parent) {
		this.isTagged = new ReferencesTable(ArmMessages.ArgumentPropertiesEditionPart_IsTaggedLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, ArmViewsRepository.Argument.Properties.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				isTagged.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, ArmViewsRepository.Argument.Properties.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				isTagged.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, ArmViewsRepository.Argument.Properties.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				isTagged.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, ArmViewsRepository.Argument.Properties.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				isTagged.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.isTaggedFilters) {
			this.isTagged.addFilter(filter);
		}
		this.isTagged.setHelpText(propertiesEditionComponent.getHelpContent(ArmViewsRepository.Argument.Properties.isTagged, ArmViewsRepository.SWT_KIND));
		this.isTagged.createControls(parent);
		this.isTagged.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, ArmViewsRepository.Argument.Properties.isTagged, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData isTaggedData = new GridData(GridData.FILL_HORIZONTAL);
		isTaggedData.horizontalSpan = 3;
		this.isTagged.setLayoutData(isTaggedData);
		this.isTagged.setLowerBound(0);
		this.isTagged.setUpperBound(-1);
		isTagged.setID(ArmViewsRepository.Argument.Properties.isTagged);
		isTagged.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createContainsArgumentElementAdvancedTableComposition(Composite parent) {
		this.containsArgumentElement = new ReferencesTable(ArmMessages.ArgumentPropertiesEditionPart_ContainsArgumentElementLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, ArmViewsRepository.Argument.Properties.containsArgumentElement, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				containsArgumentElement.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, ArmViewsRepository.Argument.Properties.containsArgumentElement, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				containsArgumentElement.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, ArmViewsRepository.Argument.Properties.containsArgumentElement, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				containsArgumentElement.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, ArmViewsRepository.Argument.Properties.containsArgumentElement, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				containsArgumentElement.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.containsArgumentElementFilters) {
			this.containsArgumentElement.addFilter(filter);
		}
		this.containsArgumentElement.setHelpText(propertiesEditionComponent.getHelpContent(ArmViewsRepository.Argument.Properties.containsArgumentElement, ArmViewsRepository.SWT_KIND));
		this.containsArgumentElement.createControls(parent);
		this.containsArgumentElement.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, ArmViewsRepository.Argument.Properties.containsArgumentElement, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData containsArgumentElementData = new GridData(GridData.FILL_HORIZONTAL);
		containsArgumentElementData.horizontalSpan = 3;
		this.containsArgumentElement.setLayoutData(containsArgumentElementData);
		this.containsArgumentElement.setLowerBound(0);
		this.containsArgumentElement.setUpperBound(-1);
		containsArgumentElement.setID(ArmViewsRepository.Argument.Properties.containsArgumentElement);
		containsArgumentElement.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createContainsArgumentLinkAdvancedTableComposition(Composite parent) {
		this.containsArgumentLink = new ReferencesTable(ArmMessages.ArgumentPropertiesEditionPart_ContainsArgumentLinkLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, ArmViewsRepository.Argument.Properties.containsArgumentLink, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				containsArgumentLink.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, ArmViewsRepository.Argument.Properties.containsArgumentLink, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				containsArgumentLink.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, ArmViewsRepository.Argument.Properties.containsArgumentLink, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				containsArgumentLink.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, ArmViewsRepository.Argument.Properties.containsArgumentLink, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				containsArgumentLink.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.containsArgumentLinkFilters) {
			this.containsArgumentLink.addFilter(filter);
		}
		this.containsArgumentLink.setHelpText(propertiesEditionComponent.getHelpContent(ArmViewsRepository.Argument.Properties.containsArgumentLink, ArmViewsRepository.SWT_KIND));
		this.containsArgumentLink.createControls(parent);
		this.containsArgumentLink.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, ArmViewsRepository.Argument.Properties.containsArgumentLink, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData containsArgumentLinkData = new GridData(GridData.FILL_HORIZONTAL);
		containsArgumentLinkData.horizontalSpan = 3;
		this.containsArgumentLink.setLayoutData(containsArgumentLinkData);
		this.containsArgumentLink.setLowerBound(0);
		this.containsArgumentLink.setUpperBound(-1);
		containsArgumentLink.setID(ArmViewsRepository.Argument.Properties.containsArgumentLink);
		containsArgumentLink.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createContainsArgumentAdvancedTableComposition(Composite parent) {
		this.containsArgument = new ReferencesTable(ArmMessages.ArgumentPropertiesEditionPart_ContainsArgumentLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, ArmViewsRepository.Argument.Properties.containsArgument, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				containsArgument.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, ArmViewsRepository.Argument.Properties.containsArgument, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				containsArgument.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, ArmViewsRepository.Argument.Properties.containsArgument, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				containsArgument.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, ArmViewsRepository.Argument.Properties.containsArgument, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				containsArgument.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.containsArgumentFilters) {
			this.containsArgument.addFilter(filter);
		}
		this.containsArgument.setHelpText(propertiesEditionComponent.getHelpContent(ArmViewsRepository.Argument.Properties.containsArgument, ArmViewsRepository.SWT_KIND));
		this.containsArgument.createControls(parent);
		this.containsArgument.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, ArmViewsRepository.Argument.Properties.containsArgument, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData containsArgumentData = new GridData(GridData.FILL_HORIZONTAL);
		containsArgumentData.horizontalSpan = 3;
		this.containsArgument.setLayoutData(containsArgumentData);
		this.containsArgument.setLowerBound(0);
		this.containsArgument.setUpperBound(-1);
		containsArgument.setID(ArmViewsRepository.Argument.Properties.containsArgument);
		containsArgument.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
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
	 * @see net.certware.argument.arm.parts.ArgumentPropertiesEditionPart#getIdentifier()
	 * 
	 */
	public String getIdentifier() {
		return identifier.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.ArgumentPropertiesEditionPart#setIdentifier(String newValue)
	 * 
	 */
	public void setIdentifier(String newValue) {
		if (newValue != null) {
			identifier.setText(newValue);
		} else {
			identifier.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.ArgumentPropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.ArgumentPropertiesEditionPart#setDescription(String newValue)
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
	 * @see net.certware.argument.arm.parts.ArgumentPropertiesEditionPart#getContent()
	 * 
	 */
	public String getContent() {
		return content.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.ArgumentPropertiesEditionPart#setContent(String newValue)
	 * 
	 */
	public void setContent(String newValue) {
		if (newValue != null) {
			content.setText(newValue);
		} else {
			content.setText(""); //$NON-NLS-1$
		}
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.ArgumentPropertiesEditionPart#initIsTagged(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initIsTagged(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		isTagged.setContentProvider(contentProvider);
		isTagged.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.ArgumentPropertiesEditionPart#updateIsTagged()
	 * 
	 */
	public void updateIsTagged() {
	isTagged.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.ArgumentPropertiesEditionPart#addFilterIsTagged(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIsTagged(ViewerFilter filter) {
		isTaggedFilters.add(filter);
		if (this.isTagged != null) {
			this.isTagged.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.ArgumentPropertiesEditionPart#addBusinessFilterIsTagged(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsTagged(ViewerFilter filter) {
		isTaggedBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.ArgumentPropertiesEditionPart#isContainedInIsTaggedTable(EObject element)
	 * 
	 */
	public boolean isContainedInIsTaggedTable(EObject element) {
		return ((ReferencesTableSettings)isTagged.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.ArgumentPropertiesEditionPart#initContainsArgumentElement(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initContainsArgumentElement(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		containsArgumentElement.setContentProvider(contentProvider);
		containsArgumentElement.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.ArgumentPropertiesEditionPart#updateContainsArgumentElement()
	 * 
	 */
	public void updateContainsArgumentElement() {
	containsArgumentElement.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.ArgumentPropertiesEditionPart#addFilterContainsArgumentElement(ViewerFilter filter)
	 * 
	 */
	public void addFilterToContainsArgumentElement(ViewerFilter filter) {
		containsArgumentElementFilters.add(filter);
		if (this.containsArgumentElement != null) {
			this.containsArgumentElement.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.ArgumentPropertiesEditionPart#addBusinessFilterContainsArgumentElement(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToContainsArgumentElement(ViewerFilter filter) {
		containsArgumentElementBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.ArgumentPropertiesEditionPart#isContainedInContainsArgumentElementTable(EObject element)
	 * 
	 */
	public boolean isContainedInContainsArgumentElementTable(EObject element) {
		return ((ReferencesTableSettings)containsArgumentElement.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.ArgumentPropertiesEditionPart#initContainsArgumentLink(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initContainsArgumentLink(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		containsArgumentLink.setContentProvider(contentProvider);
		containsArgumentLink.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.ArgumentPropertiesEditionPart#updateContainsArgumentLink()
	 * 
	 */
	public void updateContainsArgumentLink() {
	containsArgumentLink.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.ArgumentPropertiesEditionPart#addFilterContainsArgumentLink(ViewerFilter filter)
	 * 
	 */
	public void addFilterToContainsArgumentLink(ViewerFilter filter) {
		containsArgumentLinkFilters.add(filter);
		if (this.containsArgumentLink != null) {
			this.containsArgumentLink.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.ArgumentPropertiesEditionPart#addBusinessFilterContainsArgumentLink(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToContainsArgumentLink(ViewerFilter filter) {
		containsArgumentLinkBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.ArgumentPropertiesEditionPart#isContainedInContainsArgumentLinkTable(EObject element)
	 * 
	 */
	public boolean isContainedInContainsArgumentLinkTable(EObject element) {
		return ((ReferencesTableSettings)containsArgumentLink.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.ArgumentPropertiesEditionPart#initContainsArgument(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initContainsArgument(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		containsArgument.setContentProvider(contentProvider);
		containsArgument.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.ArgumentPropertiesEditionPart#updateContainsArgument()
	 * 
	 */
	public void updateContainsArgument() {
	containsArgument.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.ArgumentPropertiesEditionPart#addFilterContainsArgument(ViewerFilter filter)
	 * 
	 */
	public void addFilterToContainsArgument(ViewerFilter filter) {
		containsArgumentFilters.add(filter);
		if (this.containsArgument != null) {
			this.containsArgument.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.ArgumentPropertiesEditionPart#addBusinessFilterContainsArgument(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToContainsArgument(ViewerFilter filter) {
		containsArgumentBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.ArgumentPropertiesEditionPart#isContainedInContainsArgumentTable(EObject element)
	 * 
	 */
	public boolean isContainedInContainsArgumentTable(EObject element) {
		return ((ReferencesTableSettings)containsArgument.getInput()).contains(element);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ArmMessages.Argument_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
