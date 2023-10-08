/**
 */
package safety_concept;

import base.Base_Package;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see safety_concept.Safety_concept_Factory
 * @model kind="package"
 * @generated
 */
public interface Safety_concept_Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "safety_concept";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cam.ac.uk/mbsa/safety_concept";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "safety_concept_";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Safety_concept_Package eINSTANCE = safety_concept.impl.Safety_concept_PackageImpl.init();

	/**
	 * The meta object id for the '{@link safety_concept.impl.ConceptElementImpl <em>Concept Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see safety_concept.impl.ConceptElementImpl
	 * @see safety_concept.impl.Safety_concept_PackageImpl#getConceptElement()
	 * @generated
	 */
	int CONCEPT_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_ELEMENT__GID = Base_Package.ARTIFACT_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_ELEMENT__IS_CITATION = Base_Package.ARTIFACT_ELEMENT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_ELEMENT__IS_ABSTRACT = Base_Package.ARTIFACT_ELEMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_ELEMENT__CITED_ELEMENT = Base_Package.ARTIFACT_ELEMENT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_ELEMENT__ABSTRACT_FORM = Base_Package.ARTIFACT_ELEMENT__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_ELEMENT__NAME = Base_Package.ARTIFACT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_ELEMENT__DESCRIPTION = Base_Package.ARTIFACT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_ELEMENT__IMPLEMENTATION_CONSTRAINT = Base_Package.ARTIFACT_ELEMENT__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_ELEMENT__NOTE = Base_Package.ARTIFACT_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_ELEMENT__TAGGED_VALUE = Base_Package.ARTIFACT_ELEMENT__TAGGED_VALUE;

	/**
	 * The number of structural features of the '<em>Concept Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_ELEMENT_FEATURE_COUNT = Base_Package.ARTIFACT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link safety_concept.impl.SafetyConceptPackageImpl <em>Safety Concept Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see safety_concept.impl.SafetyConceptPackageImpl
	 * @see safety_concept.impl.Safety_concept_PackageImpl#getSafetyConceptPackage()
	 * @generated
	 */
	int SAFETY_CONCEPT_PACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONCEPT_PACKAGE__GID = CONCEPT_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONCEPT_PACKAGE__IS_CITATION = CONCEPT_ELEMENT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONCEPT_PACKAGE__IS_ABSTRACT = CONCEPT_ELEMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONCEPT_PACKAGE__CITED_ELEMENT = CONCEPT_ELEMENT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONCEPT_PACKAGE__ABSTRACT_FORM = CONCEPT_ELEMENT__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONCEPT_PACKAGE__NAME = CONCEPT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONCEPT_PACKAGE__DESCRIPTION = CONCEPT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONCEPT_PACKAGE__IMPLEMENTATION_CONSTRAINT = CONCEPT_ELEMENT__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONCEPT_PACKAGE__NOTE = CONCEPT_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONCEPT_PACKAGE__TAGGED_VALUE = CONCEPT_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Requirement Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONCEPT_PACKAGE__REQUIREMENT_ELEMENT = CONCEPT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONCEPT_PACKAGE__INTERFACE = CONCEPT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Safety Concept Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONCEPT_PACKAGE_FEATURE_COUNT = CONCEPT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link safety_concept.impl.SafetyConceptPackageBindingImpl <em>Safety Concept Package Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see safety_concept.impl.SafetyConceptPackageBindingImpl
	 * @see safety_concept.impl.Safety_concept_PackageImpl#getSafetyConceptPackageBinding()
	 * @generated
	 */
	int SAFETY_CONCEPT_PACKAGE_BINDING = 2;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONCEPT_PACKAGE_BINDING__GID = SAFETY_CONCEPT_PACKAGE__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONCEPT_PACKAGE_BINDING__IS_CITATION = SAFETY_CONCEPT_PACKAGE__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONCEPT_PACKAGE_BINDING__IS_ABSTRACT = SAFETY_CONCEPT_PACKAGE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONCEPT_PACKAGE_BINDING__CITED_ELEMENT = SAFETY_CONCEPT_PACKAGE__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONCEPT_PACKAGE_BINDING__ABSTRACT_FORM = SAFETY_CONCEPT_PACKAGE__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONCEPT_PACKAGE_BINDING__NAME = SAFETY_CONCEPT_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONCEPT_PACKAGE_BINDING__DESCRIPTION = SAFETY_CONCEPT_PACKAGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONCEPT_PACKAGE_BINDING__IMPLEMENTATION_CONSTRAINT = SAFETY_CONCEPT_PACKAGE__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONCEPT_PACKAGE_BINDING__NOTE = SAFETY_CONCEPT_PACKAGE__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONCEPT_PACKAGE_BINDING__TAGGED_VALUE = SAFETY_CONCEPT_PACKAGE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Requirement Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONCEPT_PACKAGE_BINDING__REQUIREMENT_ELEMENT = SAFETY_CONCEPT_PACKAGE__REQUIREMENT_ELEMENT;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONCEPT_PACKAGE_BINDING__INTERFACE = SAFETY_CONCEPT_PACKAGE__INTERFACE;

	/**
	 * The feature id for the '<em><b>Participant Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONCEPT_PACKAGE_BINDING__PARTICIPANT_PACKAGE = SAFETY_CONCEPT_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Safety Concept Package Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONCEPT_PACKAGE_BINDING_FEATURE_COUNT = SAFETY_CONCEPT_PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link safety_concept.impl.SafetyConceptPackageInterfaceImpl <em>Safety Concept Package Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see safety_concept.impl.SafetyConceptPackageInterfaceImpl
	 * @see safety_concept.impl.Safety_concept_PackageImpl#getSafetyConceptPackageInterface()
	 * @generated
	 */
	int SAFETY_CONCEPT_PACKAGE_INTERFACE = 3;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONCEPT_PACKAGE_INTERFACE__GID = SAFETY_CONCEPT_PACKAGE__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONCEPT_PACKAGE_INTERFACE__IS_CITATION = SAFETY_CONCEPT_PACKAGE__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONCEPT_PACKAGE_INTERFACE__IS_ABSTRACT = SAFETY_CONCEPT_PACKAGE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONCEPT_PACKAGE_INTERFACE__CITED_ELEMENT = SAFETY_CONCEPT_PACKAGE__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONCEPT_PACKAGE_INTERFACE__ABSTRACT_FORM = SAFETY_CONCEPT_PACKAGE__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONCEPT_PACKAGE_INTERFACE__NAME = SAFETY_CONCEPT_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONCEPT_PACKAGE_INTERFACE__DESCRIPTION = SAFETY_CONCEPT_PACKAGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONCEPT_PACKAGE_INTERFACE__IMPLEMENTATION_CONSTRAINT = SAFETY_CONCEPT_PACKAGE__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONCEPT_PACKAGE_INTERFACE__NOTE = SAFETY_CONCEPT_PACKAGE__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONCEPT_PACKAGE_INTERFACE__TAGGED_VALUE = SAFETY_CONCEPT_PACKAGE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Requirement Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONCEPT_PACKAGE_INTERFACE__REQUIREMENT_ELEMENT = SAFETY_CONCEPT_PACKAGE__REQUIREMENT_ELEMENT;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONCEPT_PACKAGE_INTERFACE__INTERFACE = SAFETY_CONCEPT_PACKAGE__INTERFACE;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONCEPT_PACKAGE_INTERFACE__IMPLEMENTS = SAFETY_CONCEPT_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Safety Concept Package Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONCEPT_PACKAGE_INTERFACE_FEATURE_COUNT = SAFETY_CONCEPT_PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link safety_concept.impl.Safety_ConceptImpl <em>Safety Concept</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see safety_concept.impl.Safety_ConceptImpl
	 * @see safety_concept.impl.Safety_concept_PackageImpl#getSafety_Concept()
	 * @generated
	 */
	int SAFETY_CONCEPT = 4;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONCEPT__GID = CONCEPT_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONCEPT__IS_CITATION = CONCEPT_ELEMENT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONCEPT__IS_ABSTRACT = CONCEPT_ELEMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONCEPT__CITED_ELEMENT = CONCEPT_ELEMENT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONCEPT__ABSTRACT_FORM = CONCEPT_ELEMENT__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONCEPT__NAME = CONCEPT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONCEPT__DESCRIPTION = CONCEPT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONCEPT__IMPLEMENTATION_CONSTRAINT = CONCEPT_ELEMENT__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONCEPT__NOTE = CONCEPT_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONCEPT__TAGGED_VALUE = CONCEPT_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Abstract level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONCEPT__ABSTRACT_LEVEL = CONCEPT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Asil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONCEPT__ASIL = CONCEPT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONCEPT__SIL = CONCEPT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Identity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONCEPT__IDENTITY = CONCEPT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONCEPT__DESC = CONCEPT_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONCEPT__SCRIPT = CONCEPT_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Satisfied</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONCEPT__SATISFIED = CONCEPT_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONCEPT__REQUIREMENT = CONCEPT_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Safety Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONCEPT_FEATURE_COUNT = CONCEPT_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link safety_concept.impl.RequirementRelationshipImpl <em>Requirement Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see safety_concept.impl.RequirementRelationshipImpl
	 * @see safety_concept.impl.Safety_concept_PackageImpl#getRequirementRelationship()
	 * @generated
	 */
	int REQUIREMENT_RELATIONSHIP = 5;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_RELATIONSHIP__GID = CONCEPT_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_RELATIONSHIP__IS_CITATION = CONCEPT_ELEMENT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_RELATIONSHIP__IS_ABSTRACT = CONCEPT_ELEMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_RELATIONSHIP__CITED_ELEMENT = CONCEPT_ELEMENT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_RELATIONSHIP__ABSTRACT_FORM = CONCEPT_ELEMENT__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_RELATIONSHIP__NAME = CONCEPT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_RELATIONSHIP__DESCRIPTION = CONCEPT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_RELATIONSHIP__IMPLEMENTATION_CONSTRAINT = CONCEPT_ELEMENT__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_RELATIONSHIP__NOTE = CONCEPT_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_RELATIONSHIP__TAGGED_VALUE = CONCEPT_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_RELATIONSHIP__LABEL = CONCEPT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_RELATIONSHIP__SOURCE = CONCEPT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_RELATIONSHIP__TARGET = CONCEPT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Requirement Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_RELATIONSHIP_FEATURE_COUNT = CONCEPT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link safety_concept.ASIL <em>ASIL</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see safety_concept.ASIL
	 * @see safety_concept.impl.Safety_concept_PackageImpl#getASIL()
	 * @generated
	 */
	int ASIL = 6;

	/**
	 * The meta object id for the '{@link safety_concept.SIL <em>SIL</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see safety_concept.SIL
	 * @see safety_concept.impl.Safety_concept_PackageImpl#getSIL()
	 * @generated
	 */
	int SIL = 7;

	/**
	 * The meta object id for the '{@link safety_concept.ABL <em>ABL</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see safety_concept.ABL
	 * @see safety_concept.impl.Safety_concept_PackageImpl#getABL()
	 * @generated
	 */
	int ABL = 8;


	/**
	 * Returns the meta object for class '{@link safety_concept.ConceptElement <em>Concept Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concept Element</em>'.
	 * @see safety_concept.ConceptElement
	 * @generated
	 */
	EClass getConceptElement();

	/**
	 * Returns the meta object for class '{@link safety_concept.SafetyConceptPackage <em>Safety Concept Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Safety Concept Package</em>'.
	 * @see safety_concept.SafetyConceptPackage
	 * @generated
	 */
	EClass getSafetyConceptPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link safety_concept.SafetyConceptPackage#getRequirementElement <em>Requirement Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirement Element</em>'.
	 * @see safety_concept.SafetyConceptPackage#getRequirementElement()
	 * @see #getSafetyConceptPackage()
	 * @generated
	 */
	EReference getSafetyConceptPackage_RequirementElement();

	/**
	 * Returns the meta object for the reference list '{@link safety_concept.SafetyConceptPackage#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interface</em>'.
	 * @see safety_concept.SafetyConceptPackage#getInterface()
	 * @see #getSafetyConceptPackage()
	 * @generated
	 */
	EReference getSafetyConceptPackage_Interface();

	/**
	 * Returns the meta object for class '{@link safety_concept.SafetyConceptPackageBinding <em>Safety Concept Package Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Safety Concept Package Binding</em>'.
	 * @see safety_concept.SafetyConceptPackageBinding
	 * @generated
	 */
	EClass getSafetyConceptPackageBinding();

	/**
	 * Returns the meta object for the reference list '{@link safety_concept.SafetyConceptPackageBinding#getParticipantPackage <em>Participant Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Participant Package</em>'.
	 * @see safety_concept.SafetyConceptPackageBinding#getParticipantPackage()
	 * @see #getSafetyConceptPackageBinding()
	 * @generated
	 */
	EReference getSafetyConceptPackageBinding_ParticipantPackage();

	/**
	 * Returns the meta object for class '{@link safety_concept.SafetyConceptPackageInterface <em>Safety Concept Package Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Safety Concept Package Interface</em>'.
	 * @see safety_concept.SafetyConceptPackageInterface
	 * @generated
	 */
	EClass getSafetyConceptPackageInterface();

	/**
	 * Returns the meta object for the reference '{@link safety_concept.SafetyConceptPackageInterface#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implements</em>'.
	 * @see safety_concept.SafetyConceptPackageInterface#getImplements()
	 * @see #getSafetyConceptPackageInterface()
	 * @generated
	 */
	EReference getSafetyConceptPackageInterface_Implements();

	/**
	 * Returns the meta object for class '{@link safety_concept.Safety_Concept <em>Safety Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Safety Concept</em>'.
	 * @see safety_concept.Safety_Concept
	 * @generated
	 */
	EClass getSafety_Concept();

	/**
	 * Returns the meta object for the attribute '{@link safety_concept.Safety_Concept#getAbstract_level <em>Abstract level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract level</em>'.
	 * @see safety_concept.Safety_Concept#getAbstract_level()
	 * @see #getSafety_Concept()
	 * @generated
	 */
	EAttribute getSafety_Concept_Abstract_level();

	/**
	 * Returns the meta object for the attribute '{@link safety_concept.Safety_Concept#getAsil <em>Asil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Asil</em>'.
	 * @see safety_concept.Safety_Concept#getAsil()
	 * @see #getSafety_Concept()
	 * @generated
	 */
	EAttribute getSafety_Concept_Asil();

	/**
	 * Returns the meta object for the attribute '{@link safety_concept.Safety_Concept#getSil <em>Sil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sil</em>'.
	 * @see safety_concept.Safety_Concept#getSil()
	 * @see #getSafety_Concept()
	 * @generated
	 */
	EAttribute getSafety_Concept_Sil();

	/**
	 * Returns the meta object for the attribute '{@link safety_concept.Safety_Concept#getIdentity <em>Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identity</em>'.
	 * @see safety_concept.Safety_Concept#getIdentity()
	 * @see #getSafety_Concept()
	 * @generated
	 */
	EAttribute getSafety_Concept_Identity();

	/**
	 * Returns the meta object for the attribute '{@link safety_concept.Safety_Concept#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see safety_concept.Safety_Concept#getDesc()
	 * @see #getSafety_Concept()
	 * @generated
	 */
	EAttribute getSafety_Concept_Desc();

	/**
	 * Returns the meta object for the attribute '{@link safety_concept.Safety_Concept#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script</em>'.
	 * @see safety_concept.Safety_Concept#getScript()
	 * @see #getSafety_Concept()
	 * @generated
	 */
	EAttribute getSafety_Concept_Script();

	/**
	 * Returns the meta object for the attribute '{@link safety_concept.Safety_Concept#isSatisfied <em>Satisfied</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Satisfied</em>'.
	 * @see safety_concept.Safety_Concept#isSatisfied()
	 * @see #getSafety_Concept()
	 * @generated
	 */
	EAttribute getSafety_Concept_Satisfied();

	/**
	 * Returns the meta object for the reference '{@link safety_concept.Safety_Concept#getRequirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Requirement</em>'.
	 * @see safety_concept.Safety_Concept#getRequirement()
	 * @see #getSafety_Concept()
	 * @generated
	 */
	EReference getSafety_Concept_Requirement();

	/**
	 * Returns the meta object for class '{@link safety_concept.RequirementRelationship <em>Requirement Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement Relationship</em>'.
	 * @see safety_concept.RequirementRelationship
	 * @generated
	 */
	EClass getRequirementRelationship();

	/**
	 * Returns the meta object for the attribute '{@link safety_concept.RequirementRelationship#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see safety_concept.RequirementRelationship#getLabel()
	 * @see #getRequirementRelationship()
	 * @generated
	 */
	EAttribute getRequirementRelationship_Label();

	/**
	 * Returns the meta object for the reference '{@link safety_concept.RequirementRelationship#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see safety_concept.RequirementRelationship#getSource()
	 * @see #getRequirementRelationship()
	 * @generated
	 */
	EReference getRequirementRelationship_Source();

	/**
	 * Returns the meta object for the reference '{@link safety_concept.RequirementRelationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see safety_concept.RequirementRelationship#getTarget()
	 * @see #getRequirementRelationship()
	 * @generated
	 */
	EReference getRequirementRelationship_Target();

	/**
	 * Returns the meta object for enum '{@link safety_concept.ASIL <em>ASIL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ASIL</em>'.
	 * @see safety_concept.ASIL
	 * @generated
	 */
	EEnum getASIL();

	/**
	 * Returns the meta object for enum '{@link safety_concept.SIL <em>SIL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SIL</em>'.
	 * @see safety_concept.SIL
	 * @generated
	 */
	EEnum getSIL();

	/**
	 * Returns the meta object for enum '{@link safety_concept.ABL <em>ABL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ABL</em>'.
	 * @see safety_concept.ABL
	 * @generated
	 */
	EEnum getABL();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Safety_concept_Factory getSafety_concept_Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link safety_concept.impl.ConceptElementImpl <em>Concept Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see safety_concept.impl.ConceptElementImpl
		 * @see safety_concept.impl.Safety_concept_PackageImpl#getConceptElement()
		 * @generated
		 */
		EClass CONCEPT_ELEMENT = eINSTANCE.getConceptElement();

		/**
		 * The meta object literal for the '{@link safety_concept.impl.SafetyConceptPackageImpl <em>Safety Concept Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see safety_concept.impl.SafetyConceptPackageImpl
		 * @see safety_concept.impl.Safety_concept_PackageImpl#getSafetyConceptPackage()
		 * @generated
		 */
		EClass SAFETY_CONCEPT_PACKAGE = eINSTANCE.getSafetyConceptPackage();

		/**
		 * The meta object literal for the '<em><b>Requirement Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAFETY_CONCEPT_PACKAGE__REQUIREMENT_ELEMENT = eINSTANCE.getSafetyConceptPackage_RequirementElement();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAFETY_CONCEPT_PACKAGE__INTERFACE = eINSTANCE.getSafetyConceptPackage_Interface();

		/**
		 * The meta object literal for the '{@link safety_concept.impl.SafetyConceptPackageBindingImpl <em>Safety Concept Package Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see safety_concept.impl.SafetyConceptPackageBindingImpl
		 * @see safety_concept.impl.Safety_concept_PackageImpl#getSafetyConceptPackageBinding()
		 * @generated
		 */
		EClass SAFETY_CONCEPT_PACKAGE_BINDING = eINSTANCE.getSafetyConceptPackageBinding();

		/**
		 * The meta object literal for the '<em><b>Participant Package</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAFETY_CONCEPT_PACKAGE_BINDING__PARTICIPANT_PACKAGE = eINSTANCE.getSafetyConceptPackageBinding_ParticipantPackage();

		/**
		 * The meta object literal for the '{@link safety_concept.impl.SafetyConceptPackageInterfaceImpl <em>Safety Concept Package Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see safety_concept.impl.SafetyConceptPackageInterfaceImpl
		 * @see safety_concept.impl.Safety_concept_PackageImpl#getSafetyConceptPackageInterface()
		 * @generated
		 */
		EClass SAFETY_CONCEPT_PACKAGE_INTERFACE = eINSTANCE.getSafetyConceptPackageInterface();

		/**
		 * The meta object literal for the '<em><b>Implements</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAFETY_CONCEPT_PACKAGE_INTERFACE__IMPLEMENTS = eINSTANCE.getSafetyConceptPackageInterface_Implements();

		/**
		 * The meta object literal for the '{@link safety_concept.impl.Safety_ConceptImpl <em>Safety Concept</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see safety_concept.impl.Safety_ConceptImpl
		 * @see safety_concept.impl.Safety_concept_PackageImpl#getSafety_Concept()
		 * @generated
		 */
		EClass SAFETY_CONCEPT = eINSTANCE.getSafety_Concept();

		/**
		 * The meta object literal for the '<em><b>Abstract level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAFETY_CONCEPT__ABSTRACT_LEVEL = eINSTANCE.getSafety_Concept_Abstract_level();

		/**
		 * The meta object literal for the '<em><b>Asil</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAFETY_CONCEPT__ASIL = eINSTANCE.getSafety_Concept_Asil();

		/**
		 * The meta object literal for the '<em><b>Sil</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAFETY_CONCEPT__SIL = eINSTANCE.getSafety_Concept_Sil();

		/**
		 * The meta object literal for the '<em><b>Identity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAFETY_CONCEPT__IDENTITY = eINSTANCE.getSafety_Concept_Identity();

		/**
		 * The meta object literal for the '<em><b>Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAFETY_CONCEPT__DESC = eINSTANCE.getSafety_Concept_Desc();

		/**
		 * The meta object literal for the '<em><b>Script</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAFETY_CONCEPT__SCRIPT = eINSTANCE.getSafety_Concept_Script();

		/**
		 * The meta object literal for the '<em><b>Satisfied</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAFETY_CONCEPT__SATISFIED = eINSTANCE.getSafety_Concept_Satisfied();

		/**
		 * The meta object literal for the '<em><b>Requirement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAFETY_CONCEPT__REQUIREMENT = eINSTANCE.getSafety_Concept_Requirement();

		/**
		 * The meta object literal for the '{@link safety_concept.impl.RequirementRelationshipImpl <em>Requirement Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see safety_concept.impl.RequirementRelationshipImpl
		 * @see safety_concept.impl.Safety_concept_PackageImpl#getRequirementRelationship()
		 * @generated
		 */
		EClass REQUIREMENT_RELATIONSHIP = eINSTANCE.getRequirementRelationship();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_RELATIONSHIP__LABEL = eINSTANCE.getRequirementRelationship_Label();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_RELATIONSHIP__SOURCE = eINSTANCE.getRequirementRelationship_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_RELATIONSHIP__TARGET = eINSTANCE.getRequirementRelationship_Target();

		/**
		 * The meta object literal for the '{@link safety_concept.ASIL <em>ASIL</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see safety_concept.ASIL
		 * @see safety_concept.impl.Safety_concept_PackageImpl#getASIL()
		 * @generated
		 */
		EEnum ASIL = eINSTANCE.getASIL();

		/**
		 * The meta object literal for the '{@link safety_concept.SIL <em>SIL</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see safety_concept.SIL
		 * @see safety_concept.impl.Safety_concept_PackageImpl#getSIL()
		 * @generated
		 */
		EEnum SIL = eINSTANCE.getSIL();

		/**
		 * The meta object literal for the '{@link safety_concept.ABL <em>ABL</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see safety_concept.ABL
		 * @see safety_concept.impl.Safety_concept_PackageImpl#getABL()
		 * @generated
		 */
		EEnum ABL = eINSTANCE.getABL();

	}

} //Safety_concept_Package
