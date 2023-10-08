/**
 */
package safety_concept;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link safety_concept.RequirementRelationship#getLabel <em>Label</em>}</li>
 *   <li>{@link safety_concept.RequirementRelationship#getSource <em>Source</em>}</li>
 *   <li>{@link safety_concept.RequirementRelationship#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see safety_concept.Safety_concept_Package#getRequirementRelationship()
 * @model
 * @generated
 */
public interface RequirementRelationship extends ConceptElement {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see safety_concept.Safety_concept_Package#getRequirementRelationship_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link safety_concept.RequirementRelationship#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Safety_Concept)
	 * @see safety_concept.Safety_concept_Package#getRequirementRelationship_Source()
	 * @model
	 * @generated
	 */
	Safety_Concept getSource();

	/**
	 * Sets the value of the '{@link safety_concept.RequirementRelationship#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Safety_Concept value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Safety_Concept)
	 * @see safety_concept.Safety_concept_Package#getRequirementRelationship_Target()
	 * @model
	 * @generated
	 */
	Safety_Concept getTarget();

	/**
	 * Sets the value of the '{@link safety_concept.RequirementRelationship#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Safety_Concept value);

} // RequirementRelationship
