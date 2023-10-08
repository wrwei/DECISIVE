/**
 */
package component;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link component.Switch#getPorts <em>Ports</em>}</li>
 * </ul>
 *
 * @see component.Component_Package#getSwitch()
 * @model
 * @generated
 */
public interface Switch extends TransitionNode {
	/**
	 * Returns the value of the '<em><b>Ports</b></em>' reference list.
	 * The list contents are of type {@link component.ComponentElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' reference list.
	 * @see component.Component_Package#getSwitch_Ports()
	 * @model
	 * @generated
	 */
	EList<ComponentElement> getPorts();

} // Switch
