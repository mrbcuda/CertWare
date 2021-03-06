/**
 * Copyright (c) 2010 National Aeronautics and Space Administration.  All rights reserved.
 */
package net.certware.argument.eur;

import net.certware.argument.arm.InformationElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.argument.eur.Context#getAssumption <em>Assumption</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.argument.eur.EurPackage#getContext()
 * @model
 * @generated
 */
public interface Context extends InformationElement {

	/**
	 * Returns the value of the '<em><b>Assumption</b></em>' reference list.
	 * The list contents are of type {@link net.certware.argument.eur.Assumption}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assumption</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assumption</em>' reference list.
	 * @see net.certware.argument.eur.EurPackage#getContext_Assumption()
	 * @model
	 * @generated
	 */
	EList<Assumption> getAssumption();
} // Context
