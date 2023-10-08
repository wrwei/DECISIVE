/**
 */
package component;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Failure Effect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link component.FailureEffect#getEffect <em>Effect</em>}</li>
 *   <li>{@link component.FailureEffect#getAffected <em>Affected</em>}</li>
 * </ul>
 *
 * @see component.Component_Package#getFailureEffect()
 * @model abstract="true"
 * @generated
 */
public interface FailureEffect extends ComponentSafetyElement {
	/**
	 * Returns the value of the '<em><b>Effect</b></em>' attribute.
	 * The literals are from the enumeration {@link component.FailureEffectEnum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effect</em>' attribute.
	 * @see component.FailureEffectEnum
	 * @see #setEffect(FailureEffectEnum)
	 * @see component.Component_Package#getFailureEffect_Effect()
	 * @model
	 * @generated
	 */
	FailureEffectEnum getEffect();

	/**
	 * Sets the value of the '{@link component.FailureEffect#getEffect <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effect</em>' attribute.
	 * @see component.FailureEffectEnum
	 * @see #getEffect()
	 * @generated
	 */
	void setEffect(FailureEffectEnum value);

	/**
	 * Returns the value of the '<em><b>Affected</b></em>' reference list.
	 * The list contents are of type {@link component.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affected</em>' reference list.
	 * @see component.Component_Package#getFailureEffect_Affected()
	 * @model
	 * @generated
	 */
	EList<Component> getAffected();

} // FailureEffect
