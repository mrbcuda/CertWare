/**
 * Generated with Acceleo
 */
package net.certware.argument.aml.parts.forms;

// Start of user code for imports
import net.certware.argument.aml.AmlPackage;
import net.certware.argument.aml.parts.AmlViewsRepository;
import net.certware.argument.aml.parts.AnswerPropertiesEditionPart;
import net.certware.argument.aml.providers.AmlMessages;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
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
public class AnswerPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, AnswerPropertiesEditionPart {

	protected Text group;
		protected Button editGroup;
		private EList groupList;
	protected Text questionId;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public AnswerPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence answerStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = answerStep.addStep(AmlViewsRepository.Answer.Properties.class);
		propertiesStep.addStep(AmlViewsRepository.Answer.Properties.group);
		propertiesStep.addStep(AmlViewsRepository.Answer.Properties.questionId);
		
		
		composer = new PartComposer(answerStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == AmlViewsRepository.Answer.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == AmlViewsRepository.Answer.Properties.group) {
					return createGroupMultiValuedEditor(widgetFactory, parent);
				}
				if (key == AmlViewsRepository.Answer.Properties.questionId) {
					return 		createQuestionIdText(widgetFactory, parent);
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
		propertiesSection.setText(AmlMessages.AnswerPropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createGroupMultiValuedEditor(FormToolkit widgetFactory, Composite parent) {
		group = widgetFactory.createText(parent, "", SWT.READ_ONLY); //$NON-NLS-1$
		GridData groupData = new GridData(GridData.FILL_HORIZONTAL);
		groupData.horizontalSpan = 2;
		group.setLayoutData(groupData);
		EditingUtils.setID(group, AmlViewsRepository.Answer.Properties.group);
		EditingUtils.setEEFtype(group, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editGroup = widgetFactory.createButton(parent, AmlMessages.AnswerPropertiesEditionPart_GroupLabel, SWT.NONE);
		GridData editGroupData = new GridData();
		editGroup.setLayoutData(editGroupData);
		editGroup.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(
						group.getShell(), "Answer", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						groupList, AmlPackage.eINSTANCE.getAnswer_Group().getEType(), null,
						false, true, 
						null, null);
				if (dialog.open() == Window.OK) {
					groupList = dialog.getResult();
					if (groupList == null) {
						groupList = new BasicEList();
					}
					group.setText(groupList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnswerPropertiesEditionPartForm.this, AmlViewsRepository.Answer.Properties.group, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new BasicEList(groupList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editGroup, AmlViewsRepository.Answer.Properties.group);
		EditingUtils.setEEFtype(editGroup, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createQuestionIdText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, AmlMessages.AnswerPropertiesEditionPart_QuestionIdLabel, propertiesEditionComponent.isRequired(AmlViewsRepository.Answer.Properties.questionId, AmlViewsRepository.FORM_KIND));
		questionId = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		questionId.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData questionIdData = new GridData(GridData.FILL_HORIZONTAL);
		questionId.setLayoutData(questionIdData);
		questionId.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnswerPropertiesEditionPartForm.this, AmlViewsRepository.Answer.Properties.questionId, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, questionId.getText()));
			}
		});
		questionId.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnswerPropertiesEditionPartForm.this, AmlViewsRepository.Answer.Properties.questionId, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, questionId.getText()));
				}
			}
		});
		EditingUtils.setID(questionId, AmlViewsRepository.Answer.Properties.questionId);
		EditingUtils.setEEFtype(questionId, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(AmlViewsRepository.Answer.Properties.questionId, AmlViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see net.certware.argument.aml.parts.AnswerPropertiesEditionPart#getGroup()
	 * 
	 */
	public EList getGroup() {
		return groupList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.AnswerPropertiesEditionPart#setGroup(EList newValue)
	 * 
	 */
	public void setGroup(EList newValue) {
		groupList = newValue;
		if (newValue != null) {
			group.setText(groupList.toString());
		} else {
			group.setText(""); //$NON-NLS-1$
		}
	}

	public void addToGroup(Object newValue) {
		groupList.add(newValue);
		if (newValue != null) {
			group.setText(groupList.toString());
		} else {
			group.setText(""); //$NON-NLS-1$
		}
	}

	public void removeToGroup(Object newValue) {
		groupList.remove(newValue);
		if (newValue != null) {
			group.setText(groupList.toString());
		} else {
			group.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.AnswerPropertiesEditionPart#getQuestionId()
	 * 
	 */
	public String getQuestionId() {
		return questionId.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.AnswerPropertiesEditionPart#setQuestionId(String newValue)
	 * 
	 */
	public void setQuestionId(String newValue) {
		if (newValue != null) {
			questionId.setText(newValue);
		} else {
			questionId.setText(""); //$NON-NLS-1$
		}
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return AmlMessages.Answer_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
