/**
 */
package component;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Utility Nodes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link component.UtilityNodes#getReading <em>Reading</em>}</li>
 * </ul>
 *
 * @see component.Component_Package#getUtilityNodes()
 * @model abstract="true"
 * @generated
 */
public interface UtilityNodes extends ComponentAsset {
	/**
	 * Returns the value of the '<em><b>Reading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reading</em>' containment reference.
	 * @see #setReading(Reading)
	 * @see component.Component_Package#getUtilityNodes_Reading()
	 * @model containment="true"
	 * @generated
	 */
	Reading getReading();

	/**
	 * Sets the value of the '{@link component.UtilityNodes#getReading <em>Reading</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reading</em>' containment reference.
	 * @see #getReading()
	 * @generated
	 */
	void setReading(Reading value);

} // UtilityNodes
