/**
 * <copyright>
 * </copyright>
 *
 */
package net.certware.evidence.hugin.netDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.evidence.hugin.netDSL.StringLiteral#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.evidence.hugin.netDSL.NetDSLPackage#getStringLiteral()
 * @model
 * @generated
 */
public interface StringLiteral extends TermLiteral
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see net.certware.evidence.hugin.netDSL.NetDSLPackage#getStringLiteral_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link net.certware.evidence.hugin.netDSL.StringLiteral#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // StringLiteral
