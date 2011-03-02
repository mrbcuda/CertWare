/**
 * <copyright>
 * </copyright>
 *
 */
package net.certware.evidence.hugin.netDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exp Factor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.evidence.hugin.netDSL.ExpFactor#getLhs <em>Lhs</em>}</li>
 *   <li>{@link net.certware.evidence.hugin.netDSL.ExpFactor#getRhs <em>Rhs</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.evidence.hugin.netDSL.NetDSLPackage#getExpFactor()
 * @model
 * @generated
 */
public interface ExpFactor extends EObject
{
  /**
   * Returns the value of the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lhs</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lhs</em>' containment reference.
   * @see #setLhs(Factor)
   * @see net.certware.evidence.hugin.netDSL.NetDSLPackage#getExpFactor_Lhs()
   * @model containment="true"
   * @generated
   */
  Factor getLhs();

  /**
   * Sets the value of the '{@link net.certware.evidence.hugin.netDSL.ExpFactor#getLhs <em>Lhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lhs</em>' containment reference.
   * @see #getLhs()
   * @generated
   */
  void setLhs(Factor value);

  /**
   * Returns the value of the '<em><b>Rhs</b></em>' containment reference list.
   * The list contents are of type {@link net.certware.evidence.hugin.netDSL.ExpFactor}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rhs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rhs</em>' containment reference list.
   * @see net.certware.evidence.hugin.netDSL.NetDSLPackage#getExpFactor_Rhs()
   * @model containment="true"
   * @generated
   */
  EList<ExpFactor> getRhs();

} // ExpFactor
