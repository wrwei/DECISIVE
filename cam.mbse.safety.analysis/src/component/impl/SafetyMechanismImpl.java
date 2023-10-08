/**
 */
package component.impl;

import component.Component_Package;
import component.Cost;
import component.FailureMode;
import component.SafetyMechanism;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Safety Mechanism</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link component.impl.SafetyMechanismImpl#getHandle <em>Handle</em>}</li>
 *   <li>{@link component.impl.SafetyMechanismImpl#getMechanism <em>Mechanism</em>}</li>
 *   <li>{@link component.impl.SafetyMechanismImpl#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link component.impl.SafetyMechanismImpl#getCosts <em>Costs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SafetyMechanismImpl extends ComponentSafetyElementImpl implements SafetyMechanism {
	/**
	 * The cached value of the '{@link #getHandle() <em>Handle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandle()
	 * @generated
	 * @ordered
	 */
	protected FailureMode handle;

	/**
	 * The default value of the '{@link #getMechanism() <em>Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMechanism()
	 * @generated
	 * @ordered
	 */
	protected static final String MECHANISM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMechanism() <em>Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMechanism()
	 * @generated
	 * @ordered
	 */
	protected String mechanism = MECHANISM_EDEFAULT;

	/**
	 * The default value of the '{@link #getCoverage() <em>Coverage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoverage()
	 * @generated
	 * @ordered
	 */
	protected static final float COVERAGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCoverage() <em>Coverage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoverage()
	 * @generated
	 * @ordered
	 */
	protected float coverage = COVERAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCosts() <em>Costs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCosts()
	 * @generated
	 * @ordered
	 */
	protected EList<Cost> costs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SafetyMechanismImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Component_Package.Literals.SAFETY_MECHANISM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FailureMode getHandle() {
		if (handle != null && handle.eIsProxy()) {
			InternalEObject oldHandle = (InternalEObject)handle;
			handle = (FailureMode)eResolveProxy(oldHandle);
			if (handle != oldHandle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Component_Package.SAFETY_MECHANISM__HANDLE, oldHandle, handle));
			}
		}
		return handle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureMode basicGetHandle() {
		return handle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHandle(FailureMode newHandle) {
		FailureMode oldHandle = handle;
		handle = newHandle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Component_Package.SAFETY_MECHANISM__HANDLE, oldHandle, handle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMechanism() {
		return mechanism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMechanism(String newMechanism) {
		String oldMechanism = mechanism;
		mechanism = newMechanism;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Component_Package.SAFETY_MECHANISM__MECHANISM, oldMechanism, mechanism));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getCoverage() {
		return coverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCoverage(float newCoverage) {
		float oldCoverage = coverage;
		coverage = newCoverage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Component_Package.SAFETY_MECHANISM__COVERAGE, oldCoverage, coverage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Cost> getCosts() {
		if (costs == null) {
			costs = new EObjectContainmentEList<Cost>(Cost.class, this, Component_Package.SAFETY_MECHANISM__COSTS);
		}
		return costs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Component_Package.SAFETY_MECHANISM__COSTS:
				return ((InternalEList<?>)getCosts()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Component_Package.SAFETY_MECHANISM__HANDLE:
				if (resolve) return getHandle();
				return basicGetHandle();
			case Component_Package.SAFETY_MECHANISM__MECHANISM:
				return getMechanism();
			case Component_Package.SAFETY_MECHANISM__COVERAGE:
				return getCoverage();
			case Component_Package.SAFETY_MECHANISM__COSTS:
				return getCosts();
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
			case Component_Package.SAFETY_MECHANISM__HANDLE:
				setHandle((FailureMode)newValue);
				return;
			case Component_Package.SAFETY_MECHANISM__MECHANISM:
				setMechanism((String)newValue);
				return;
			case Component_Package.SAFETY_MECHANISM__COVERAGE:
				setCoverage((Float)newValue);
				return;
			case Component_Package.SAFETY_MECHANISM__COSTS:
				getCosts().clear();
				getCosts().addAll((Collection<? extends Cost>)newValue);
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
			case Component_Package.SAFETY_MECHANISM__HANDLE:
				setHandle((FailureMode)null);
				return;
			case Component_Package.SAFETY_MECHANISM__MECHANISM:
				setMechanism(MECHANISM_EDEFAULT);
				return;
			case Component_Package.SAFETY_MECHANISM__COVERAGE:
				setCoverage(COVERAGE_EDEFAULT);
				return;
			case Component_Package.SAFETY_MECHANISM__COSTS:
				getCosts().clear();
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
			case Component_Package.SAFETY_MECHANISM__HANDLE:
				return handle != null;
			case Component_Package.SAFETY_MECHANISM__MECHANISM:
				return MECHANISM_EDEFAULT == null ? mechanism != null : !MECHANISM_EDEFAULT.equals(mechanism);
			case Component_Package.SAFETY_MECHANISM__COVERAGE:
				return coverage != COVERAGE_EDEFAULT;
			case Component_Package.SAFETY_MECHANISM__COSTS:
				return costs != null && !costs.isEmpty();
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
		result.append(" (mechanism: ");
		result.append(mechanism);
		result.append(", coverage: ");
		result.append(coverage);
		result.append(')');
		return result.toString();
	}

} //SafetyMechanismImpl
