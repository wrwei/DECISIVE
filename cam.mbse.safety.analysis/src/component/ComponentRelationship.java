/**
 */
package component;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link component.ComponentRelationship#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @see component.Component_Package#getComponentRelationship()
 * @model abstract="true"
 * @generated
 */
public interface ComponentRelationship extends ComponentElement {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see component.Component_Package#getComponentRelationship_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link component.ComponentRelationship#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

} // ComponentRelationship
