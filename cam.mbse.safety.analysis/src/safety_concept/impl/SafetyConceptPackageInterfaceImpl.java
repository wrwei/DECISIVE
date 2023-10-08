/**
 */
package safety_concept.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import safety_concept.SafetyConceptPackage;
import safety_concept.SafetyConceptPackageInterface;
import safety_concept.Safety_concept_Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Safety Concept Package Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link safety_concept.impl.SafetyConceptPackageInterfaceImpl#getImplements <em>Implements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SafetyConceptPackageInterfaceImpl extends SafetyConceptPackageImpl implements SafetyConceptPackageInterface {
	/**
	 * The cached value of the '{@link #getImplements() <em>Implements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplements()
	 * @generated
	 * @ordered
	 */
	protected SafetyConceptPackage implements_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SafetyConceptPackageInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Safety_concept_Package.Literals.SAFETY_CONCEPT_PACKAGE_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SafetyConceptPackage getImplements() {
		if (implements_ != null && implements_.eIsProxy()) {
			InternalEObject oldImplements = (InternalEObject)implements_;
			implements_ = (SafetyConceptPackage)eResolveProxy(oldImplements);
			if (implements_ != oldImplements) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Safety_concept_Package.SAFETY_CONCEPT_PACKAGE_INTERFACE__IMPLEMENTS, oldImplements, implements_));
			}
		}
		return implements_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SafetyConceptPackage basicGetImplements() {
		return implements_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImplements(SafetyConceptPackage newImplements) {
		SafetyConceptPackage oldImplements = implements_;
		implements_ = newImplements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Safety_concept_Package.SAFETY_CONCEPT_PACKAGE_INTERFACE__IMPLEMENTS, oldImplements, implements_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Safety_concept_Package.SAFETY_CONCEPT_PACKAGE_INTERFACE__IMPLEMENTS:
				if (resolve) return getImplements();
				return basicGetImplements();
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
			case Safety_concept_Package.SAFETY_CONCEPT_PACKAGE_INTERFACE__IMPLEMENTS:
				setImplements((SafetyConceptPackage)newValue);
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
			case Safety_concept_Package.SAFETY_CONCEPT_PACKAGE_INTERFACE__IMPLEMENTS:
				setImplements((SafetyConceptPackage)null);
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
			case Safety_concept_Package.SAFETY_CONCEPT_PACKAGE_INTERFACE__IMPLEMENTS:
				return implements_ != null;
		}
		return super.eIsSet(featureID);
	}

} //SafetyConceptPackageInterfaceImpl
