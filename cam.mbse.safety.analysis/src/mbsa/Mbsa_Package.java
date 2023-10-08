/**
 */
package mbsa;

import base.Base_Package;

import org.eclipse.emf.ecore.EClass;
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
 * @see mbsa.Mbsa_Factory
 * @model kind="package"
 * @generated
 */
public interface Mbsa_Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mbsa";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cam.ac.uk/mbsa/mbsa";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mbsa_";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Mbsa_Package eINSTANCE = mbsa.impl.Mbsa_PackageImpl.init();

	/**
	 * The meta object id for the '{@link mbsa.impl.MBSAPackageImpl <em>MBSA Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mbsa.impl.MBSAPackageImpl
	 * @see mbsa.impl.Mbsa_PackageImpl#getMBSAPackage()
	 * @generated
	 */
	int MBSA_PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBSA_PACKAGE__GID = Base_Package.ARTIFACT_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBSA_PACKAGE__IS_CITATION = Base_Package.ARTIFACT_ELEMENT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBSA_PACKAGE__IS_ABSTRACT = Base_Package.ARTIFACT_ELEMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBSA_PACKAGE__CITED_ELEMENT = Base_Package.ARTIFACT_ELEMENT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBSA_PACKAGE__ABSTRACT_FORM = Base_Package.ARTIFACT_ELEMENT__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBSA_PACKAGE__NAME = Base_Package.ARTIFACT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBSA_PACKAGE__DESCRIPTION = Base_Package.ARTIFACT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBSA_PACKAGE__IMPLEMENTATION_CONSTRAINT = Base_Package.ARTIFACT_ELEMENT__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBSA_PACKAGE__NOTE = Base_Package.ARTIFACT_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBSA_PACKAGE__TAGGED_VALUE = Base_Package.ARTIFACT_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Mbsa Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBSA_PACKAGE__MBSA_PACKAGES = Base_Package.ARTIFACT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBSA_PACKAGE__COMPONENT_PACKAGE = Base_Package.ARTIFACT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Requirement Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBSA_PACKAGE__REQUIREMENT_PACKAGE = Base_Package.ARTIFACT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Hazard Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBSA_PACKAGE__HAZARD_PACKAGE = Base_Package.ARTIFACT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Safety Concept Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBSA_PACKAGE__SAFETY_CONCEPT_PACKAGE = Base_Package.ARTIFACT_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Fta Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBSA_PACKAGE__FTA_PACKAGE = Base_Package.ARTIFACT_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>MBSA Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBSA_PACKAGE_FEATURE_COUNT = Base_Package.ARTIFACT_ELEMENT_FEATURE_COUNT + 6;


	/**
	 * Returns the meta object for class '{@link mbsa.MBSAPackage <em>MBSA Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MBSA Package</em>'.
	 * @see mbsa.MBSAPackage
	 * @generated
	 */
	EClass getMBSAPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link mbsa.MBSAPackage#getMbsaPackages <em>Mbsa Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mbsa Packages</em>'.
	 * @see mbsa.MBSAPackage#getMbsaPackages()
	 * @see #getMBSAPackage()
	 * @generated
	 */
	EReference getMBSAPackage_MbsaPackages();

	/**
	 * Returns the meta object for the containment reference list '{@link mbsa.MBSAPackage#getComponentPackage <em>Component Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component Package</em>'.
	 * @see mbsa.MBSAPackage#getComponentPackage()
	 * @see #getMBSAPackage()
	 * @generated
	 */
	EReference getMBSAPackage_ComponentPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link mbsa.MBSAPackage#getRequirementPackage <em>Requirement Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirement Package</em>'.
	 * @see mbsa.MBSAPackage#getRequirementPackage()
	 * @see #getMBSAPackage()
	 * @generated
	 */
	EReference getMBSAPackage_RequirementPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link mbsa.MBSAPackage#getHazardPackage <em>Hazard Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hazard Package</em>'.
	 * @see mbsa.MBSAPackage#getHazardPackage()
	 * @see #getMBSAPackage()
	 * @generated
	 */
	EReference getMBSAPackage_HazardPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link mbsa.MBSAPackage#getSafetyConceptPackage <em>Safety Concept Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Safety Concept Package</em>'.
	 * @see mbsa.MBSAPackage#getSafetyConceptPackage()
	 * @see #getMBSAPackage()
	 * @generated
	 */
	EReference getMBSAPackage_SafetyConceptPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link mbsa.MBSAPackage#getFtaPackage <em>Fta Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fta Package</em>'.
	 * @see mbsa.MBSAPackage#getFtaPackage()
	 * @see #getMBSAPackage()
	 * @generated
	 */
	EReference getMBSAPackage_FtaPackage();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Mbsa_Factory getMbsa_Factory();

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
		 * The meta object literal for the '{@link mbsa.impl.MBSAPackageImpl <em>MBSA Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mbsa.impl.MBSAPackageImpl
		 * @see mbsa.impl.Mbsa_PackageImpl#getMBSAPackage()
		 * @generated
		 */
		EClass MBSA_PACKAGE = eINSTANCE.getMBSAPackage();

		/**
		 * The meta object literal for the '<em><b>Mbsa Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MBSA_PACKAGE__MBSA_PACKAGES = eINSTANCE.getMBSAPackage_MbsaPackages();

		/**
		 * The meta object literal for the '<em><b>Component Package</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MBSA_PACKAGE__COMPONENT_PACKAGE = eINSTANCE.getMBSAPackage_ComponentPackage();

		/**
		 * The meta object literal for the '<em><b>Requirement Package</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MBSA_PACKAGE__REQUIREMENT_PACKAGE = eINSTANCE.getMBSAPackage_RequirementPackage();

		/**
		 * The meta object literal for the '<em><b>Hazard Package</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MBSA_PACKAGE__HAZARD_PACKAGE = eINSTANCE.getMBSAPackage_HazardPackage();

		/**
		 * The meta object literal for the '<em><b>Safety Concept Package</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MBSA_PACKAGE__SAFETY_CONCEPT_PACKAGE = eINSTANCE.getMBSAPackage_SafetyConceptPackage();

		/**
		 * The meta object literal for the '<em><b>Fta Package</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MBSA_PACKAGE__FTA_PACKAGE = eINSTANCE.getMBSAPackage_FtaPackage();

	}

} //Mbsa_Package
