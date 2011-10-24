/**
 * Copyright (c) 2010 Object Management Group (ARM metamodel)
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.  (generated models) 
 */
package net.certware.argument.arm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.certware.argument.arm.ArmPackage
 * @generated
 */
public interface ArmFactory extends EFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2010 Object Management Group (ARM metamodel)\nCopyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.  (generated models) "; //$NON-NLS-1$

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArmFactory eINSTANCE = net.certware.argument.arm.impl.ArmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Tagged Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tagged Value</em>'.
	 * @generated
	 */
	TaggedValue createTaggedValue();

	/**
	 * Returns a new object of class '<em>Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Argument</em>'.
	 * @generated
	 */
	Argument createArgument();

	/**
	 * Returns a new object of class '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation</em>'.
	 * @generated
	 */
	Annotation createAnnotation();

	/**
	 * Returns a new object of class '<em>Asserted Inference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Asserted Inference</em>'.
	 * @generated
	 */
	AssertedInference createAssertedInference();

	/**
	 * Returns a new object of class '<em>Asserted Evidence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Asserted Evidence</em>'.
	 * @generated
	 */
	AssertedEvidence createAssertedEvidence();

	/**
	 * Returns a new object of class '<em>Asserted Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Asserted Context</em>'.
	 * @generated
	 */
	AssertedContext createAssertedContext();

	/**
	 * Returns a new object of class '<em>Asserted Counter Evidence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Asserted Counter Evidence</em>'.
	 * @generated
	 */
	AssertedCounterEvidence createAssertedCounterEvidence();

	/**
	 * Returns a new object of class '<em>Asserted Challenge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Asserted Challenge</em>'.
	 * @generated
	 */
	AssertedChallenge createAssertedChallenge();

	/**
	 * Returns a new object of class '<em>Claim</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim</em>'.
	 * @generated
	 */
	Claim createClaim();

	/**
	 * Returns a new object of class '<em>Evidence Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evidence Assertion</em>'.
	 * @generated
	 */
	EvidenceAssertion createEvidenceAssertion();

	/**
	 * Returns a new object of class '<em>Information Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Information Element</em>'.
	 * @generated
	 */
	InformationElement createInformationElement();

	/**
	 * Returns a new object of class '<em>Argument Reasoning</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Argument Reasoning</em>'.
	 * @generated
	 */
	ArgumentReasoning createArgumentReasoning();

	/**
	 * Returns a new object of class '<em>Citation Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Citation Element</em>'.
	 * @generated
	 */
	CitationElement createCitationElement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ArmPackage getArmPackage();

} //ArmFactory
