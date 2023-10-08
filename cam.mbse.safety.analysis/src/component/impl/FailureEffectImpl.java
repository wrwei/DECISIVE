/**
 */
package component.impl;

import component.Component;
import component.Component_Package;
import component.FailureEffect;
import component.FailureEffectEnum;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Failure Effect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link component.impl.FailureEffectImpl#getEffect <em>Effect</em>}</li>
 *   <li>{@link component.impl.FailureEffectImpl#getAffected <em>Affected</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FailureEffectImpl extends ComponentSafetyElementImpl implements FailureEffect {
	/**
	 * The default value of the '{@link #getEffect() <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffect()
	 * @generated
	 * @ordered
	 */
	protected static final FailureEffectEnum EFFECT_EDEFAULT = FailureEffectEnum.LOSS_OF_FUNCTION;

	/**
	 * The cached value of the '{@link #getEffect() <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffect()
	 * @generated
	 * @ordered
	 */
	protected FailureEffectEnum effect = EFFECT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAffected() <em>Affected</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffected()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> affected;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FailureEffectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Component_Package.Literals.FAILURE_EFFECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FailureEffectEnum getEffect() {
		return effect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEffect(FailureEffectEnum newEffect) {
		FailureEffectEnum oldEffect = effect;
		effect = newEffect == null ? EFFECT_EDEFAULT : newEffect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Component_Package.FAILURE_EFFECT__EFFECT, oldEffect, effect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Component> getAffected() {
		if (affected == null) {
			affected = new EObjectResolvingEList<Component>(Component.class, this, Component_Package.FAILURE_EFFECT__AFFECTED);
		}
		return affected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Component_Package.FAILURE_EFFECT__EFFECT:
				return getEffect();
			case Component_Package.FAILURE_EFFECT__AFFECTED:
				return getAffected();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Component_Package.FAILURE_EFFECT__EFFECT:
				setEffect((FailureEffectEnum)newValue);
				return;
			case Component_Package.FAILURE_EFFECT__AFFECTED:
				getAffected().clear();
				getAffected().addAll((Collection<? extends Component>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Component_Package.FAILURE_EFFECT__EFFECT:
				setEffect(EFFECT_EDEFAULT);
				return;
			case Component_Package.FAILURE_EFFECT__AFFECTED:
				getAffected().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Component_Package.FAILURE_EFFECT__EFFECT:
				return effect != EFFECT_EDEFAULT;
			case Component_Package.FAILURE_EFFECT__AFFECTED:
				return affected != null && !affected.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (effect: ");
		result.append(effect);
		result.append(')');
		return result.toString();
	}

} //FailureEffectImpl
