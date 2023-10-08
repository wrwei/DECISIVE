/**
 */
package safety_concept;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Safety Concept Package Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link safety_concept.SafetyConceptPackageBinding#getParticipantPackage <em>Participant Package</em>}</li>
 * </ul>
 *
 * @see safety_concept.Safety_concept_Package#getSafetyConceptPackageBinding()
 * @model
 * @generated
 */
public interface SafetyConceptPackageBinding extends SafetyConceptPackage {
	/**
	 * Returns the value of the '<em><b>Participant Package</b></em>' reference list.
	 * The list contents are of type {@link safety_concept.SafetyConceptPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant Package</em>' reference list.
	 * @see safety_concept.Safety_concept_Package#getSafetyConceptPackageBinding_ParticipantPackage()
	 * @model lower="2"
	 * @generated
	 */
	EList<SafetyConceptPackage> getParticipantPackage();

} // SafetyConceptPackageBinding
