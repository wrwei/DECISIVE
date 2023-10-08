/**
 */
package safety_concept;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see safety_concept.Safety_concept_Package
 * @generated
 */
public interface Safety_concept_Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Safety_concept_Factory eINSTANCE = safety_concept.impl.Safety_concept_FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Safety Concept Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Safety Concept Package</em>'.
	 * @generated
	 */
	SafetyConceptPackage createSafetyConceptPackage();

	/**
	 * Returns a new object of class '<em>Safety Concept Package Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Safety Concept Package Binding</em>'.
	 * @generated
	 */
	SafetyConceptPackageBinding createSafetyConceptPackageBinding();

	/**
	 * Returns a new object of class '<em>Safety Concept Package Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Safety Concept Package Interface</em>'.
	 * @generated
	 */
	SafetyConceptPackageInterface createSafetyConceptPackageInterface();

	/**
	 * Returns a new object of class '<em>Safety Concept</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Safety Concept</em>'.
	 * @generated
	 */
	Safety_Concept createSafety_Concept();

	/**
	 * Returns a new object of class '<em>Requirement Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requirement Relationship</em>'.
	 * @generated
	 */
	RequirementRelationship createRequirementRelationship();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Safety_concept_Package getSafety_concept_Package();

} //Safety_concept_Factory
