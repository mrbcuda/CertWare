/**
 * Generated with Acceleo
 */
package net.certware.argument.aml.parts.impl;

// Start of user code for imports
import net.certware.argument.aml.parts.AmlViewsRepository;
import net.certware.argument.aml.parts.IntervalPropertiesEditionPart;
import net.certware.argument.aml.providers.AmlMessages;

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
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
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
public class IntervalPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, IntervalPropertiesEditionPart {

	protected Text max;
	protected Text min;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public IntervalPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence intervalStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = intervalStep.addStep(AmlViewsRepository.Interval.Properties.class);
		propertiesStep.addStep(AmlViewsRepository.Interval.Properties.max);
		propertiesStep.addStep(AmlViewsRepository.Interval.Properties.min);
		
		
		composer = new PartComposer(intervalStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == AmlViewsRepository.Interval.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == AmlViewsRepository.Interval.Properties.max) {
					return createMaxText(parent);
				}
				if (key == AmlViewsRepository.Interval.Properties.min) {
					return createMinText(parent);
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
		propertiesGroup.setText(AmlMessages.IntervalPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createMaxText(Composite parent) {
		SWTUtils.createPartLabel(parent, AmlMessages.IntervalPropertiesEditionPart_MaxLabel, propertiesEditionComponent.isRequired(AmlViewsRepository.Interval.Properties.max, AmlViewsRepository.SWT_KIND));
		max = new Text(parent, SWT.BORDER);
		GridData maxData = new GridData(GridData.FILL_HORIZONTAL);
		max.setLayoutData(maxData);
		max.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntervalPropertiesEditionPartImpl.this, AmlViewsRepository.Interval.Properties.max, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, max.getText()));
			}

		});
		max.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntervalPropertiesEditionPartImpl.this, AmlViewsRepository.Interval.Properties.max, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, max.getText()));
				}
			}

		});
		EditingUtils.setID(max, AmlViewsRepository.Interval.Properties.max);
		EditingUtils.setEEFtype(max, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AmlViewsRepository.Interval.Properties.max, AmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createMinText(Composite parent) {
		SWTUtils.createPartLabel(parent, AmlMessages.IntervalPropertiesEditionPart_MinLabel, propertiesEditionComponent.isRequired(AmlViewsRepository.Interval.Properties.min, AmlViewsRepository.SWT_KIND));
		min = new Text(parent, SWT.BORDER);
		GridData minData = new GridData(GridData.FILL_HORIZONTAL);
		min.setLayoutData(minData);
		min.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntervalPropertiesEditionPartImpl.this, AmlViewsRepository.Interval.Properties.min, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, min.getText()));
			}

		});
		min.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntervalPropertiesEditionPartImpl.this, AmlViewsRepository.Interval.Properties.min, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, min.getText()));
				}
			}

		});
		EditingUtils.setID(min, AmlViewsRepository.Interval.Properties.min);
		EditingUtils.setEEFtype(min, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AmlViewsRepository.Interval.Properties.min, AmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see net.certware.argument.aml.parts.IntervalPropertiesEditionPart#getMax()
	 * 
	 */
	public String getMax() {
		return max.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.IntervalPropertiesEditionPart#setMax(String newValue)
	 * 
	 */
	public void setMax(String newValue) {
		if (newValue != null) {
			max.setText(newValue);
		} else {
			max.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.IntervalPropertiesEditionPart#getMin()
	 * 
	 */
	public String getMin() {
		return min.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.IntervalPropertiesEditionPart#setMin(String newValue)
	 * 
	 */
	public void setMin(String newValue) {
		if (newValue != null) {
			min.setText(newValue);
		} else {
			min.setText(""); //$NON-NLS-1$
		}
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return AmlMessages.Interval_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
