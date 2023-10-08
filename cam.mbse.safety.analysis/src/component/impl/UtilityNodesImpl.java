/**
 */
package component.impl;

import component.Component_Package;
import component.Reading;
import component.UtilityNodes;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Utility Nodes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link component.impl.UtilityNodesImpl#getReading <em>Reading</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class UtilityNodesImpl extends ComponentAssetImpl implements UtilityNodes {
	/**
	 * The cached value of the '{@link #getReading() <em>Reading</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReading()
	 * @generated
	 * @ordered
	 */
	protected Reading reading;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UtilityNodesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Component_Package.Literals.UTILITY_NODES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reading getReading() {
		return reading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReading(Reading newReading, NotificationChain msgs) {
		Reading oldReading = reading;
		reading = newReading;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Component_Package.UTILITY_NODES__READING, oldReading, newReading);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReading(Reading newReading) {
		if (newReading != reading) {
			NotificationChain msgs = null;
			if (reading != null)
				msgs = ((InternalEObject)reading).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Component_Package.UTILITY_NODES__READING, null, msgs);
			if (newReading != null)
				msgs = ((InternalEObject)newReading).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Component_Package.UTILITY_NODES__READING, null, msgs);
			msgs = basicSetReading(newReading, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Component_Package.UTILITY_NODES__READING, newReading, newReading));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Component_Package.UTILITY_NODES__READING:
				return basicSetReading(null, msgs);
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
			case Component_Package.UTILITY_NODES__READING:
				return getReading();
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
			case Component_Package.UTILITY_NODES__READING:
				setReading((Reading)newValue);
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
			case Component_Package.UTILITY_NODES__READING:
				setReading((Reading)null);
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
			case Component_Package.UTILITY_NODES__READING:
				return reading != null;
		}
		return super.eIsSet(featureID);
	}

} //UtilityNodesImpl
