/**
 */
package safety_concept;

import requirement.Requirement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Safety Concept</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link safety_concept.Safety_Concept#getAbstract_level <em>Abstract level</em>}</li>
 *   <li>{@link safety_concept.Safety_Concept#getAsil <em>Asil</em>}</li>
 *   <li>{@link safety_concept.Safety_Concept#getSil <em>Sil</em>}</li>
 *   <li>{@link safety_concept.Safety_Concept#getIdentity <em>Identity</em>}</li>
 *   <li>{@link safety_concept.Safety_Concept#getDesc <em>Desc</em>}</li>
 *   <li>{@link safety_concept.Safety_Concept#getScript <em>Script</em>}</li>
 *   <li>{@link safety_concept.Safety_Concept#isSatisfied <em>Satisfied</em>}</li>
 *   <li>{@link safety_concept.Safety_Concept#getRequirement <em>Requirement</em>}</li>
 * </ul>
 *
 * @see safety_concept.Safety_concept_Package#getSafety_Concept()
 * @model
 * @generated
 */
public interface Safety_Concept extends ConceptElement {
	/**
	 * Returns the value of the '<em><b>Abstract level</b></em>' attribute.
	 * The literals are from the enumeration {@link safety_concept.ABL}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract level</em>' attribute.
	 * @see safety_concept.ABL
	 * @see #setAbstract_level(ABL)
	 * @see safety_concept.Safety_concept_Package#getSafety_Concept_Abstract_level()
	 * @model
	 * @generated
	 */
	ABL getAbstract_level();

	/**
	 * Sets the value of the '{@link safety_concept.Safety_Concept#getAbstract_level <em>Abstract level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract level</em>' attribute.
	 * @see safety_concept.ABL
	 * @see #getAbstract_level()
	 * @generated
	 */
	void setAbstract_level(ABL value);

	/**
	 * Returns the value of the '<em><b>Asil</b></em>' attribute.
	 * The literals are from the enumeration {@link safety_concept.ASIL}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asil</em>' attribute.
	 * @see safety_concept.ASIL
	 * @see #setAsil(ASIL)
	 * @see safety_concept.Safety_concept_Package#getSafety_Concept_Asil()
	 * @model
	 * @generated
	 */
	ASIL getAsil();

	/**
	 * Sets the value of the '{@link safety_concept.Safety_Concept#getAsil <em>Asil</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asil</em>' attribute.
	 * @see safety_concept.ASIL
	 * @see #getAsil()
	 * @generated
	 */
	void setAsil(ASIL value);

	/**
	 * Returns the value of the '<em><b>Sil</b></em>' attribute.
	 * The literals are from the enumeration {@link safety_concept.SIL}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sil</em>' attribute.
	 * @see safety_concept.SIL
	 * @see #setSil(SIL)
	 * @see safety_concept.Safety_concept_Package#getSafety_Concept_Sil()
	 * @model
	 * @generated
	 */
	SIL getSil();

	/**
	 * Sets the value of the '{@link safety_concept.Safety_Concept#getSil <em>Sil</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sil</em>' attribute.
	 * @see safety_concept.SIL
	 * @see #getSil()
	 * @generated
	 */
	void setSil(SIL value);

	/**
	 * Returns the value of the '<em><b>Identity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identity</em>' attribute.
	 * @see #setIdentity(int)
	 * @see safety_concept.Safety_concept_Package#getSafety_Concept_Identity()
	 * @model
	 * @generated
	 */
	int getIdentity();

	/**
	 * Sets the value of the '{@link safety_concept.Safety_Concept#getIdentity <em>Identity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identity</em>' attribute.
	 * @see #getIdentity()
	 * @generated
	 */
	void setIdentity(int value);

	/**
	 * Returns the value of the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Desc</em>' attribute.
	 * @see #setDesc(String)
	 * @see safety_concept.Safety_concept_Package#getSafety_Concept_Desc()
	 * @model
	 * @generated
	 */
	String getDesc();

	/**
	 * Sets the value of the '{@link safety_concept.Safety_Concept#getDesc <em>Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Desc</em>' attribute.
	 * @see #getDesc()
	 * @generated
	 */
	void setDesc(String value);

	/**
	 * Returns the value of the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script</em>' attribute.
	 * @see #setScript(String)
	 * @see safety_concept.Safety_concept_Package#getSafety_Concept_Script()
	 * @model
	 * @generated
	 */
	String getScript();

	/**
	 * Sets the value of the '{@link safety_concept.Safety_Concept#getScript <em>Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script</em>' attribute.
	 * @see #getScript()
	 * @generated
	 */
	void setScript(String value);

	/**
	 * Returns the value of the '<em><b>Satisfied</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Satisfied</em>' attribute.
	 * @see #setSatisfied(boolean)
	 * @see safety_concept.Safety_concept_Package#getSafety_Concept_Satisfied()
	 * @model
	 * @generated
	 */
	boolean isSatisfied();

	/**
	 * Sets the value of the '{@link safety_concept.Safety_Concept#isSatisfied <em>Satisfied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Satisfied</em>' attribute.
	 * @see #isSatisfied()
	 * @generated
	 */
	void setSatisfied(boolean value);

	/**
	 * Returns the value of the '<em><b>Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement</em>' reference.
	 * @see #setRequirement(Requirement)
	 * @see safety_concept.Safety_concept_Package#getSafety_Concept_Requirement()
	 * @model
	 * @generated
	 */
	Requirement getRequirement();

	/**
	 * Sets the value of the '{@link safety_concept.Safety_Concept#getRequirement <em>Requirement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement</em>' reference.
	 * @see #getRequirement()
	 * @generated
	 */
	void setRequirement(Requirement value);

} // Safety_Concept
