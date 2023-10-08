/**
 */
package component.impl;

import component.Component_Package;
import component.Function;
import component.ToleranceType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link component.impl.FunctionImpl#getFunc <em>Func</em>}</li>
 *   <li>{@link component.impl.FunctionImpl#getToleranceType <em>Tolerance Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionImpl extends ComponentAssetImpl implements Function {
	/**
	 * The default value of the '{@link #getFunc() <em>Func</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunc()
	 * @generated
	 * @ordered
	 */
	protected static final String FUNC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFunc() <em>Func</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunc()
	 * @generated
	 * @ordered
	 */
	protected String func = FUNC_EDEFAULT;

	/**
	 * The default value of the '{@link #getToleranceType() <em>Tolerance Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToleranceType()
	 * @generated
	 * @ordered
	 */
	protected static final ToleranceType TOLERANCE_TYPE_EDEFAULT = ToleranceType.ONEOO1;

	/**
	 * The cached value of the '{@link #getToleranceType() <em>Tolerance Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToleranceType()
	 * @generated
	 * @ordered
	 */
	protected ToleranceType toleranceType = TOLERANCE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Component_Package.Literals.FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFunc() {
		return func;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFunc(String newFunc) {
		String oldFunc = func;
		func = newFunc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Component_Package.FUNCTION__FUNC, oldFunc, func));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ToleranceType getToleranceType() {
		return toleranceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToleranceType(ToleranceType newToleranceType) {
		ToleranceType oldToleranceType = toleranceType;
		toleranceType = newToleranceType == null ? TOLERANCE_TYPE_EDEFAULT : newToleranceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Component_Package.FUNCTION__TOLERANCE_TYPE, oldToleranceType, toleranceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Component_Package.FUNCTION__FUNC:
				return getFunc();
			case Component_Package.FUNCTION__TOLERANCE_TYPE:
				return getToleranceType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Component_Package.FUNCTION__FUNC:
				setFunc((String)newValue);
				return;
			case Component_Package.FUNCTION__TOLERANCE_TYPE:
				setToleranceType((ToleranceType)newValue);
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
			case Component_Package.FUNCTION__FUNC:
				setFunc(FUNC_EDEFAULT);
				return;
			case Component_Package.FUNCTION__TOLERANCE_TYPE:
				setToleranceType(TOLERANCE_TYPE_EDEFAULT);
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
			case Component_Package.FUNCTION__FUNC:
				return FUNC_EDEFAULT == null ? func != null : !FUNC_EDEFAULT.equals(func);
			case Component_Package.FUNCTION__TOLERANCE_TYPE:
				return toleranceType != TOLERANCE_TYPE_EDEFAULT;
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
		result.append(" (func: ");
		result.append(func);
		result.append(", toleranceType: ");
		result.append(toleranceType);
		result.append(')');
		return result.toString();
	}

} //FunctionImpl
