/**
 */
package component;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Directed Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link component.DirectedRelationship#getSource <em>Source</em>}</li>
 *   <li>{@link component.DirectedRelationship#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see component.Component_Package#getDirectedRelationship()
 * @model
 * @generated
 */
public interface DirectedRelationship extends ComponentRelationship {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ComponentElement)
	 * @see component.Component_Package#getDirectedRelationship_Source()
	 * @model
	 * @generated
	 */
	ComponentElement getSource();

	/**
	 * Sets the value of the '{@link component.DirectedRelationship#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ComponentElement value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ComponentElement)
	 * @see component.Component_Package#getDirectedRelationship_Target()
	 * @model
	 * @generated
	 */
	ComponentElement getTarget();

	/**
	 * Sets the value of the '{@link component.DirectedRelationship#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ComponentElement value);

} // DirectedRelationship
