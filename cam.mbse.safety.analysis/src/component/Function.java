/**
 */
package component;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link component.Function#getFunc <em>Func</em>}</li>
 *   <li>{@link component.Function#getToleranceType <em>Tolerance Type</em>}</li>
 * </ul>
 *
 * @see component.Component_Package#getFunction()
 * @model
 * @generated
 */
public interface Function extends ComponentAsset {
	/**
	 * Returns the value of the '<em><b>Func</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Func</em>' attribute.
	 * @see #setFunc(String)
	 * @see component.Component_Package#getFunction_Func()
	 * @model
	 * @generated
	 */
	String getFunc();

	/**
	 * Sets the value of the '{@link component.Function#getFunc <em>Func</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Func</em>' attribute.
	 * @see #getFunc()
	 * @generated
	 */
	void setFunc(String value);

	/**
	 * Returns the value of the '<em><b>Tolerance Type</b></em>' attribute.
	 * The literals are from the enumeration {@link component.ToleranceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tolerance Type</em>' attribute.
	 * @see component.ToleranceType
	 * @see #setToleranceType(ToleranceType)
	 * @see component.Component_Package#getFunction_ToleranceType()
	 * @model
	 * @generated
	 */
	ToleranceType getToleranceType();

	/**
	 * Sets the value of the '{@link component.Function#getToleranceType <em>Tolerance Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tolerance Type</em>' attribute.
	 * @see component.ToleranceType
	 * @see #getToleranceType()
	 * @generated
	 */
	void setToleranceType(ToleranceType value);

} // Function
