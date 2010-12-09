/**
 * <copyright>
 * </copyright>
 *
 */
package net.certware.argument.sfp.semiFormalProof.impl;

import net.certware.argument.sfp.semiFormalProof.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SemiFormalProofFactoryImpl extends EFactoryImpl implements SemiFormalProofFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SemiFormalProofFactory init()
  {
    try
    {
      SemiFormalProofFactory theSemiFormalProofFactory = (SemiFormalProofFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.certware.net/argument/sfp/SemiFormalProof"); 
      if (theSemiFormalProofFactory != null)
      {
        return theSemiFormalProofFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SemiFormalProofFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SemiFormalProofFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SemiFormalProofPackage.PROOF: return createProof();
      case SemiFormalProofPackage.JUSTIFICATIONS: return createJustifications();
      case SemiFormalProofPackage.JUSTIFICATION: return createJustification();
      case SemiFormalProofPackage.QUOTED_ASSERTION: return createQuotedAssertion();
      case SemiFormalProofPackage.ENTAILMENT: return createEntailment();
      case SemiFormalProofPackage.CONJUNCTION: return createConjunction();
      case SemiFormalProofPackage.PROOF_STEPS: return createProofSteps();
      case SemiFormalProofPackage.STATEMENT: return createStatement();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Proof createProof()
  {
    ProofImpl proof = new ProofImpl();
    return proof;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Justifications createJustifications()
  {
    JustificationsImpl justifications = new JustificationsImpl();
    return justifications;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Justification createJustification()
  {
    JustificationImpl justification = new JustificationImpl();
    return justification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QuotedAssertion createQuotedAssertion()
  {
    QuotedAssertionImpl quotedAssertion = new QuotedAssertionImpl();
    return quotedAssertion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entailment createEntailment()
  {
    EntailmentImpl entailment = new EntailmentImpl();
    return entailment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Conjunction createConjunction()
  {
    ConjunctionImpl conjunction = new ConjunctionImpl();
    return conjunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProofSteps createProofSteps()
  {
    ProofStepsImpl proofSteps = new ProofStepsImpl();
    return proofSteps;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SemiFormalProofPackage getSemiFormalProofPackage()
  {
    return (SemiFormalProofPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SemiFormalProofPackage getPackage()
  {
    return SemiFormalProofPackage.eINSTANCE;
  }

} //SemiFormalProofFactoryImpl
