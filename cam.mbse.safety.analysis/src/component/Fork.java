/**
 */
package component;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fork</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link component.Fork#getSource <em>Source</em>}</li>
 *   <li>{@link component.Fork#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see component.Component_Package#getFork()
 * @model
 * @generated
 */
public interface Fork extends TransitionNode {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ComponentElement)
	 * @see component.Component_Package#getFork_Source()
	 * @model required="true"
	 * @generated
	 */
	ComponentElement getSource();

	/**
	 * Sets the value of the '{@link component.Fork#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ComponentElement value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference list.
	 * The list contents are of type {@link component.ComponentElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference list.
	 * @see component.Component_Package#getFork_Target()
	 * @model
	 * @generated
	 */
	EList<ComponentElement> getTarget();

} // Fork
