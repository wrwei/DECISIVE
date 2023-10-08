/**
 */
package fta.impl;

import fta.FTAElement;
import fta.FTAPackage;
import fta.FTAPackageInterface;
import fta.Fta_Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FTA Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fta.impl.FTAPackageImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link fta.impl.FTAPackageImpl#getInterface <em>Interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FTAPackageImpl extends FTAElementImpl implements FTAPackage {
	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<FTAElement> elements;

	/**
	 * The cached value of the '{@link #getInterface() <em>Interface</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<FTAPackageInterface> interface_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FTAPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Fta_Package.Literals.FTA_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FTAElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<FTAElement>(FTAElement.class, this, Fta_Package.FTA_PACKAGE__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FTAPackageInterface> getInterface() {
		if (interface_ == null) {
			interface_ = new EObjectResolvingEList<FTAPackageInterface>(FTAPackageInterface.class, this, Fta_Package.FTA_PACKAGE__INTERFACE);
		}
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Fta_Package.FTA_PACKAGE__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
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
			case Fta_Package.FTA_PACKAGE__ELEMENTS:
				return getElements();
			case Fta_Package.FTA_PACKAGE__INTERFACE:
				return getInterface();
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
			case Fta_Package.FTA_PACKAGE__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends FTAElement>)newValue);
				return;
			case Fta_Package.FTA_PACKAGE__INTERFACE:
				getInterface().clear();
				getInterface().addAll((Collection<? extends FTAPackageInterface>)newValue);
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
			case Fta_Package.FTA_PACKAGE__ELEMENTS:
				getElements().clear();
				return;
			case Fta_Package.FTA_PACKAGE__INTERFACE:
				getInterface().clear();
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
			case Fta_Package.FTA_PACKAGE__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case Fta_Package.FTA_PACKAGE__INTERFACE:
				return interface_ != null && !interface_.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FTAPackageImpl
