/**
 */
package safety_concept;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Safety Concept Package Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link safety_concept.SafetyConceptPackageInterface#getImplements <em>Implements</em>}</li>
 * </ul>
 *
 * @see safety_concept.Safety_concept_Package#getSafetyConceptPackageInterface()
 * @model
 * @generated
 */
public interface SafetyConceptPackageInterface extends SafetyConceptPackage {
	/**
	 * Returns the value of the '<em><b>Implements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements</em>' reference.
	 * @see #setImplements(SafetyConceptPackage)
	 * @see safety_concept.Safety_concept_Package#getSafetyConceptPackageInterface_Implements()
	 * @model required="true"
	 * @generated
	 */
	SafetyConceptPackage getImplements();

	/**
	 * Sets the value of the '{@link safety_concept.SafetyConceptPackageInterface#getImplements <em>Implements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implements</em>' reference.
	 * @see #getImplements()
	 * @generated
	 */
	void setImplements(SafetyConceptPackage value);

} // SafetyConceptPackageInterface
