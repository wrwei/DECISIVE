/**
 */
package safety_concept.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import safety_concept.SafetyConceptPackage;
import safety_concept.SafetyConceptPackageBinding;
import safety_concept.Safety_concept_Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Safety Concept Package Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link safety_concept.impl.SafetyConceptPackageBindingImpl#getParticipantPackage <em>Participant Package</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SafetyConceptPackageBindingImpl extends SafetyConceptPackageImpl implements SafetyConceptPackageBinding {
	/**
	 * The cached value of the '{@link #getParticipantPackage() <em>Participant Package</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipantPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<SafetyConceptPackage> participantPackage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SafetyConceptPackageBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Safety_concept_Package.Literals.SAFETY_CONCEPT_PACKAGE_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SafetyConceptPackage> getParticipantPackage() {
		if (participantPackage == null) {
			participantPackage = new EObjectResolvingEList<SafetyConceptPackage>(SafetyConceptPackage.class, this, Safety_concept_Package.SAFETY_CONCEPT_PACKAGE_BINDING__PARTICIPANT_PACKAGE);
		}
		return participantPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Safety_concept_Package.SAFETY_CONCEPT_PACKAGE_BINDING__PARTICIPANT_PACKAGE:
				return getParticipantPackage();
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
			case Safety_concept_Package.SAFETY_CONCEPT_PACKAGE_BINDING__PARTICIPANT_PACKAGE:
				getParticipantPackage().clear();
				getParticipantPackage().addAll((Collection<? extends SafetyConceptPackage>)newValue);
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
			case Safety_concept_Package.SAFETY_CONCEPT_PACKAGE_BINDING__PARTICIPANT_PACKAGE:
				getParticipantPackage().clear();
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
			case Safety_concept_Package.SAFETY_CONCEPT_PACKAGE_BINDING__PARTICIPANT_PACKAGE:
				return participantPackage != null && !participantPackage.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SafetyConceptPackageBindingImpl
