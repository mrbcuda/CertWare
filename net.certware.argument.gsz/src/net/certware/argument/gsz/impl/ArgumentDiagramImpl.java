/**
 * Copyright (c) 2010 National Aeronautics and Space Administration.  All rights reserved.
 */
package net.certware.argument.gsz.impl;

import java.util.Collection;

import net.certware.argument.gsz.ArgumentDiagram;
import net.certware.argument.gsz.Assumption;
import net.certware.argument.gsz.Context;
import net.certware.argument.gsz.Evidence;
import net.certware.argument.gsz.Goal;
import net.certware.argument.gsz.GszPackage;
import net.certware.argument.gsz.Justification;
import net.certware.argument.gsz.Solution;
import net.certware.argument.gsz.Strategy;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Argument Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.argument.gsz.impl.ArgumentDiagramImpl#getGoals <em>Goals</em>}</li>
 *   <li>{@link net.certware.argument.gsz.impl.ArgumentDiagramImpl#getStrategies <em>Strategies</em>}</li>
 *   <li>{@link net.certware.argument.gsz.impl.ArgumentDiagramImpl#getJustifications <em>Justifications</em>}</li>
 *   <li>{@link net.certware.argument.gsz.impl.ArgumentDiagramImpl#getContexts <em>Contexts</em>}</li>
 *   <li>{@link net.certware.argument.gsz.impl.ArgumentDiagramImpl#getAssumptions <em>Assumptions</em>}</li>
 *   <li>{@link net.certware.argument.gsz.impl.ArgumentDiagramImpl#getSolutions <em>Solutions</em>}</li>
 *   <li>{@link net.certware.argument.gsz.impl.ArgumentDiagramImpl#getEvidence <em>Evidence</em>}</li>
 *   <li>{@link net.certware.argument.gsz.impl.ArgumentDiagramImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArgumentDiagramImpl extends EObjectImpl implements ArgumentDiagram {
	/**
	 * The cached value of the '{@link #getGoals() <em>Goals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoals()
	 * @generated
	 * @ordered
	 */
	protected EList<Goal> goals;

	/**
	 * The cached value of the '{@link #getStrategies() <em>Strategies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategies()
	 * @generated
	 * @ordered
	 */
	protected EList<Strategy> strategies;

	/**
	 * The cached value of the '{@link #getJustifications() <em>Justifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJustifications()
	 * @generated
	 * @ordered
	 */
	protected EList<Justification> justifications;

	/**
	 * The cached value of the '{@link #getContexts() <em>Contexts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<Context> contexts;

	/**
	 * The cached value of the '{@link #getAssumptions() <em>Assumptions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssumptions()
	 * @generated
	 * @ordered
	 */
	protected EList<Assumption> assumptions;

	/**
	 * The cached value of the '{@link #getSolutions() <em>Solutions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolutions()
	 * @generated
	 * @ordered
	 */
	protected EList<Solution> solutions;

	/**
	 * The cached value of the '{@link #getEvidence() <em>Evidence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvidence()
	 * @generated
	 * @ordered
	 */
	protected EList<Evidence> evidence;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArgumentDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GszPackage.Literals.ARGUMENT_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Goal> getGoals() {
		if (goals == null) {
			goals = new EObjectContainmentEList<Goal>(Goal.class, this, GszPackage.ARGUMENT_DIAGRAM__GOALS);
		}
		return goals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Strategy> getStrategies() {
		if (strategies == null) {
			strategies = new EObjectContainmentEList<Strategy>(Strategy.class, this, GszPackage.ARGUMENT_DIAGRAM__STRATEGIES);
		}
		return strategies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Justification> getJustifications() {
		if (justifications == null) {
			justifications = new EObjectContainmentEList<Justification>(Justification.class, this, GszPackage.ARGUMENT_DIAGRAM__JUSTIFICATIONS);
		}
		return justifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Context> getContexts() {
		if (contexts == null) {
			contexts = new EObjectContainmentEList<Context>(Context.class, this, GszPackage.ARGUMENT_DIAGRAM__CONTEXTS);
		}
		return contexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Assumption> getAssumptions() {
		if (assumptions == null) {
			assumptions = new EObjectContainmentEList<Assumption>(Assumption.class, this, GszPackage.ARGUMENT_DIAGRAM__ASSUMPTIONS);
		}
		return assumptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Solution> getSolutions() {
		if (solutions == null) {
			solutions = new EObjectContainmentEList<Solution>(Solution.class, this, GszPackage.ARGUMENT_DIAGRAM__SOLUTIONS);
		}
		return solutions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Evidence> getEvidence() {
		if (evidence == null) {
			evidence = new EObjectContainmentEList<Evidence>(Evidence.class, this, GszPackage.ARGUMENT_DIAGRAM__EVIDENCE);
		}
		return evidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GszPackage.ARGUMENT_DIAGRAM__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GszPackage.ARGUMENT_DIAGRAM__GOALS:
				return ((InternalEList<?>)getGoals()).basicRemove(otherEnd, msgs);
			case GszPackage.ARGUMENT_DIAGRAM__STRATEGIES:
				return ((InternalEList<?>)getStrategies()).basicRemove(otherEnd, msgs);
			case GszPackage.ARGUMENT_DIAGRAM__JUSTIFICATIONS:
				return ((InternalEList<?>)getJustifications()).basicRemove(otherEnd, msgs);
			case GszPackage.ARGUMENT_DIAGRAM__CONTEXTS:
				return ((InternalEList<?>)getContexts()).basicRemove(otherEnd, msgs);
			case GszPackage.ARGUMENT_DIAGRAM__ASSUMPTIONS:
				return ((InternalEList<?>)getAssumptions()).basicRemove(otherEnd, msgs);
			case GszPackage.ARGUMENT_DIAGRAM__SOLUTIONS:
				return ((InternalEList<?>)getSolutions()).basicRemove(otherEnd, msgs);
			case GszPackage.ARGUMENT_DIAGRAM__EVIDENCE:
				return ((InternalEList<?>)getEvidence()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GszPackage.ARGUMENT_DIAGRAM__GOALS:
				return getGoals();
			case GszPackage.ARGUMENT_DIAGRAM__STRATEGIES:
				return getStrategies();
			case GszPackage.ARGUMENT_DIAGRAM__JUSTIFICATIONS:
				return getJustifications();
			case GszPackage.ARGUMENT_DIAGRAM__CONTEXTS:
				return getContexts();
			case GszPackage.ARGUMENT_DIAGRAM__ASSUMPTIONS:
				return getAssumptions();
			case GszPackage.ARGUMENT_DIAGRAM__SOLUTIONS:
				return getSolutions();
			case GszPackage.ARGUMENT_DIAGRAM__EVIDENCE:
				return getEvidence();
			case GszPackage.ARGUMENT_DIAGRAM__VERSION:
				return getVersion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GszPackage.ARGUMENT_DIAGRAM__GOALS:
				getGoals().clear();
				getGoals().addAll((Collection<? extends Goal>)newValue);
				return;
			case GszPackage.ARGUMENT_DIAGRAM__STRATEGIES:
				getStrategies().clear();
				getStrategies().addAll((Collection<? extends Strategy>)newValue);
				return;
			case GszPackage.ARGUMENT_DIAGRAM__JUSTIFICATIONS:
				getJustifications().clear();
				getJustifications().addAll((Collection<? extends Justification>)newValue);
				return;
			case GszPackage.ARGUMENT_DIAGRAM__CONTEXTS:
				getContexts().clear();
				getContexts().addAll((Collection<? extends Context>)newValue);
				return;
			case GszPackage.ARGUMENT_DIAGRAM__ASSUMPTIONS:
				getAssumptions().clear();
				getAssumptions().addAll((Collection<? extends Assumption>)newValue);
				return;
			case GszPackage.ARGUMENT_DIAGRAM__SOLUTIONS:
				getSolutions().clear();
				getSolutions().addAll((Collection<? extends Solution>)newValue);
				return;
			case GszPackage.ARGUMENT_DIAGRAM__EVIDENCE:
				getEvidence().clear();
				getEvidence().addAll((Collection<? extends Evidence>)newValue);
				return;
			case GszPackage.ARGUMENT_DIAGRAM__VERSION:
				setVersion((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GszPackage.ARGUMENT_DIAGRAM__GOALS:
				getGoals().clear();
				return;
			case GszPackage.ARGUMENT_DIAGRAM__STRATEGIES:
				getStrategies().clear();
				return;
			case GszPackage.ARGUMENT_DIAGRAM__JUSTIFICATIONS:
				getJustifications().clear();
				return;
			case GszPackage.ARGUMENT_DIAGRAM__CONTEXTS:
				getContexts().clear();
				return;
			case GszPackage.ARGUMENT_DIAGRAM__ASSUMPTIONS:
				getAssumptions().clear();
				return;
			case GszPackage.ARGUMENT_DIAGRAM__SOLUTIONS:
				getSolutions().clear();
				return;
			case GszPackage.ARGUMENT_DIAGRAM__EVIDENCE:
				getEvidence().clear();
				return;
			case GszPackage.ARGUMENT_DIAGRAM__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GszPackage.ARGUMENT_DIAGRAM__GOALS:
				return goals != null && !goals.isEmpty();
			case GszPackage.ARGUMENT_DIAGRAM__STRATEGIES:
				return strategies != null && !strategies.isEmpty();
			case GszPackage.ARGUMENT_DIAGRAM__JUSTIFICATIONS:
				return justifications != null && !justifications.isEmpty();
			case GszPackage.ARGUMENT_DIAGRAM__CONTEXTS:
				return contexts != null && !contexts.isEmpty();
			case GszPackage.ARGUMENT_DIAGRAM__ASSUMPTIONS:
				return assumptions != null && !assumptions.isEmpty();
			case GszPackage.ARGUMENT_DIAGRAM__SOLUTIONS:
				return solutions != null && !solutions.isEmpty();
			case GszPackage.ARGUMENT_DIAGRAM__EVIDENCE:
				return evidence != null && !evidence.isEmpty();
			case GszPackage.ARGUMENT_DIAGRAM__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (version: "); //$NON-NLS-1$
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //ArgumentDiagramImpl
