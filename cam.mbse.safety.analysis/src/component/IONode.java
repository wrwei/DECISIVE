/**
 */
package component;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IO Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link component.IONode#getUpper <em>Upper</em>}</li>
 *   <li>{@link component.IONode#getLower <em>Lower</em>}</li>
 * </ul>
 *
 * @see component.Component_Package#getIONode()
 * @model abstract="true"
 * @generated
 */
public interface IONode extends UtilityNodes {
	/**
	 * Returns the value of the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper</em>' attribute.
	 * @see #setUpper(float)
	 * @see component.Component_Package#getIONode_Upper()
	 * @model
	 * @generated
	 */
	float getUpper();

	/**
	 * Sets the value of the '{@link component.IONode#getUpper <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper</em>' attribute.
	 * @see #getUpper()
	 * @generated
	 */
	void setUpper(float value);

	/**
	 * Returns the value of the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower</em>' attribute.
	 * @see #setLower(float)
	 * @see component.Component_Package#getIONode_Lower()
	 * @model
	 * @generated
	 */
	float getLower();

	/**
	 * Sets the value of the '{@link component.IONode#getLower <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower</em>' attribute.
	 * @see #getLower()
	 * @generated
	 */
	void setLower(float value);

} // IONode
