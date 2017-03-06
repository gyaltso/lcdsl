/**
 * generated by Xtext 2.10.0
 */
package com.wamas.ide.launching.lcDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.wamas.ide.launching.lcDsl.MainType#getMainClass <em>Main Class</em>}</li>
 * </ul>
 *
 * @see com.wamas.ide.launching.lcDsl.LcDslPackage#getMainType()
 * @model
 * @generated
 */
public interface MainType extends EObject
{
  /**
   * Returns the value of the '<em><b>Main Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Main Class</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Main Class</em>' containment reference.
   * @see #setMainClass(JavaMainType)
   * @see com.wamas.ide.launching.lcDsl.LcDslPackage#getMainType_MainClass()
   * @model containment="true"
   * @generated
   */
  JavaMainType getMainClass();

  /**
   * Sets the value of the '{@link com.wamas.ide.launching.lcDsl.MainType#getMainClass <em>Main Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Main Class</em>' containment reference.
   * @see #getMainClass()
   * @generated
   */
  void setMainClass(JavaMainType value);

} // MainType
