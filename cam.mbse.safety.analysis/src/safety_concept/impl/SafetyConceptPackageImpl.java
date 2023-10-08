/**
 */
package safety_concept.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import safety_concept.ConceptElement;
import safety_concept.SafetyConceptPackage;
import safety_concept.SafetyConceptPackageInterface;
import safety_concept.Safety_concept_Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Safety Concept Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link safety_concept.impl.SafetyConceptPackageImpl#getRequirementElement <em>Requirement Element</em>}</li>
 *   <li>{@link safety_concept.impl.SafetyConceptPackageImpl#getInterface <em>Interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SafetyConceptPackageImpl extends ConceptElementImpl implements SafetyConceptPackage {
	/**
	 * The cached value of the '{@link #getRequirementElement() <em>Requirement Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirementElement()
	 * @generated
	 * @ordered
	 */
	protected EList<ConceptElement> requirementElement;

	/**
	 * The cached value of the '{@link #getInterface() <em>Interface</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<SafetyConceptPackageInterface> interface_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SafetyConceptPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Safety_concept_Package.Literals.SAFETY_CONCEPT_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConceptElement> getRequirementElement() {
		if (requirementElement == null) {
			requirementElement = new EObjectContainmentEList<ConceptElement>(ConceptElement.class, this, Safety_concept_Package.SAFETY_CONCEPT_PACKAGE__REQUIREMENT_ELEMENT);
		}
		return requirementElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SafetyConceptPackageInterface> getInterface() {
		if (interface_ == null) {
			interface_ = new EObjectResolvingEList<SafetyConceptPackageInterface>(SafetyConceptPackageInterface.class, this, Safety_concept_Package.SAFETY_CONCEPT_PACKAGE__INTERFACE);
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
			case Safety_concept_Package.SAFETY_CONCEPT_PACKAGE__REQUIREMENT_ELEMENT:
				return ((InternalEList<?>)getRequirementElement()).basicRemove(otherEnd, msgs);
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
			case Safety_concept_Package.SAFETY_CONCEPT_PACKAGE__REQUIREMENT_ELEMENT:
				return getRequirementElement();
			case Safety_concept_Package.SAFETY_CONCEPT_PACKAGE__INTERFACE:
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
			case Safety_concept_Package.SAFETY_CONCEPT_PACKAGE__REQUIREMENT_ELEMENT:
				getRequirementElement().clear();
				getRequirementElement().addAll((Collection<? extends ConceptElement>)newValue);
				return;
			case Safety_concept_Package.SAFETY_CONCEPT_PACKAGE__INTERFACE:
				getInterface().clear();
				getInterface().addAll((Collection<? extends SafetyConceptPackageInterface>)newValue);
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
			case Safety_concept_Package.SAFETY_CONCEPT_PACKAGE__REQUIREMENT_ELEMENT:
				getRequirementElement().clear();
				return;
			case Safety_concept_Package.SAFETY_CONCEPT_PACKAGE__INTERFACE:
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
			case Safety_concept_Package.SAFETY_CONCEPT_PACKAGE__REQUIREMENT_ELEMENT:
				return requirementElement != null && !requirementElement.isEmpty();
			case Safety_concept_Package.SAFETY_CONCEPT_PACKAGE__INTERFACE:
				return interface_ != null && !interface_.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SafetyConceptPackageImpl
