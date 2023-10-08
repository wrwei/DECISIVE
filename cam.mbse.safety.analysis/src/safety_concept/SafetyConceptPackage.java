/**
 */
package safety_concept;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Safety Concept Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link safety_concept.SafetyConceptPackage#getRequirementElement <em>Requirement Element</em>}</li>
 *   <li>{@link safety_concept.SafetyConceptPackage#getInterface <em>Interface</em>}</li>
 * </ul>
 *
 * @see safety_concept.Safety_concept_Package#getSafetyConceptPackage()
 * @model
 * @generated
 */
public interface SafetyConceptPackage extends ConceptElement {
	/**
	 * Returns the value of the '<em><b>Requirement Element</b></em>' containment reference list.
	 * The list contents are of type {@link safety_concept.ConceptElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement Element</em>' containment reference list.
	 * @see safety_concept.Safety_concept_Package#getSafetyConceptPackage_RequirementElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConceptElement> getRequirementElement();

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' reference list.
	 * The list contents are of type {@link safety_concept.SafetyConceptPackageInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' reference list.
	 * @see safety_concept.Safety_concept_Package#getSafetyConceptPackage_Interface()
	 * @model
	 * @generated
	 */
	EList<SafetyConceptPackageInterface> getInterface();

} // SafetyConceptPackage
