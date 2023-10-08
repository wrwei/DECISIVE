/**
 */
package fta;

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
 * @see fta.Fta_Factory
 * @model kind="package"
 * @generated
 */
public interface Fta_Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "fta";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cam.ac.uk/mbsa/fta";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fta_";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Fta_Package eINSTANCE = fta.impl.Fta_PackageImpl.init();

	/**
	 * The meta object id for the '{@link fta.impl.FTAElementImpl <em>FTA Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fta.impl.FTAElementImpl
	 * @see fta.impl.Fta_PackageImpl#getFTAElement()
	 * @generated
	 */
	int FTA_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_ELEMENT__GID = Base_Package.ARTIFACT_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_ELEMENT__IS_CITATION = Base_Package.ARTIFACT_ELEMENT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_ELEMENT__IS_ABSTRACT = Base_Package.ARTIFACT_ELEMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_ELEMENT__CITED_ELEMENT = Base_Package.ARTIFACT_ELEMENT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_ELEMENT__ABSTRACT_FORM = Base_Package.ARTIFACT_ELEMENT__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_ELEMENT__NAME = Base_Package.ARTIFACT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_ELEMENT__DESCRIPTION = Base_Package.ARTIFACT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_ELEMENT__IMPLEMENTATION_CONSTRAINT = Base_Package.ARTIFACT_ELEMENT__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_ELEMENT__NOTE = Base_Package.ARTIFACT_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_ELEMENT__TAGGED_VALUE = Base_Package.ARTIFACT_ELEMENT__TAGGED_VALUE;

	/**
	 * The number of structural features of the '<em>FTA Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_ELEMENT_FEATURE_COUNT = Base_Package.ARTIFACT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fta.impl.FTAPackageImpl <em>FTA Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fta.impl.FTAPackageImpl
	 * @see fta.impl.Fta_PackageImpl#getFTAPackage()
	 * @generated
	 */
	int FTA_PACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_PACKAGE__GID = FTA_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_PACKAGE__IS_CITATION = FTA_ELEMENT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_PACKAGE__IS_ABSTRACT = FTA_ELEMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_PACKAGE__CITED_ELEMENT = FTA_ELEMENT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_PACKAGE__ABSTRACT_FORM = FTA_ELEMENT__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_PACKAGE__NAME = FTA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_PACKAGE__DESCRIPTION = FTA_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_PACKAGE__IMPLEMENTATION_CONSTRAINT = FTA_ELEMENT__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_PACKAGE__NOTE = FTA_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_PACKAGE__TAGGED_VALUE = FTA_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_PACKAGE__ELEMENTS = FTA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_PACKAGE__INTERFACE = FTA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>FTA Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_PACKAGE_FEATURE_COUNT = FTA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fta.impl.FTAPackageInterfaceImpl <em>FTA Package Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fta.impl.FTAPackageInterfaceImpl
	 * @see fta.impl.Fta_PackageImpl#getFTAPackageInterface()
	 * @generated
	 */
	int FTA_PACKAGE_INTERFACE = 2;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_PACKAGE_INTERFACE__GID = FTA_PACKAGE__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_PACKAGE_INTERFACE__IS_CITATION = FTA_PACKAGE__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_PACKAGE_INTERFACE__IS_ABSTRACT = FTA_PACKAGE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_PACKAGE_INTERFACE__CITED_ELEMENT = FTA_PACKAGE__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_PACKAGE_INTERFACE__ABSTRACT_FORM = FTA_PACKAGE__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_PACKAGE_INTERFACE__NAME = FTA_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_PACKAGE_INTERFACE__DESCRIPTION = FTA_PACKAGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_PACKAGE_INTERFACE__IMPLEMENTATION_CONSTRAINT = FTA_PACKAGE__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_PACKAGE_INTERFACE__NOTE = FTA_PACKAGE__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_PACKAGE_INTERFACE__TAGGED_VALUE = FTA_PACKAGE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_PACKAGE_INTERFACE__ELEMENTS = FTA_PACKAGE__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_PACKAGE_INTERFACE__INTERFACE = FTA_PACKAGE__INTERFACE;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_PACKAGE_INTERFACE__IMPLEMENTS = FTA_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>FTA Package Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_PACKAGE_INTERFACE_FEATURE_COUNT = FTA_PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fta.impl.ComponentPackageBindingImpl <em>Component Package Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fta.impl.ComponentPackageBindingImpl
	 * @see fta.impl.Fta_PackageImpl#getComponentPackageBinding()
	 * @generated
	 */
	int COMPONENT_PACKAGE_BINDING = 3;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PACKAGE_BINDING__GID = FTA_PACKAGE__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PACKAGE_BINDING__IS_CITATION = FTA_PACKAGE__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PACKAGE_BINDING__IS_ABSTRACT = FTA_PACKAGE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PACKAGE_BINDING__CITED_ELEMENT = FTA_PACKAGE__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PACKAGE_BINDING__ABSTRACT_FORM = FTA_PACKAGE__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PACKAGE_BINDING__NAME = FTA_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PACKAGE_BINDING__DESCRIPTION = FTA_PACKAGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PACKAGE_BINDING__IMPLEMENTATION_CONSTRAINT = FTA_PACKAGE__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PACKAGE_BINDING__NOTE = FTA_PACKAGE__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PACKAGE_BINDING__TAGGED_VALUE = FTA_PACKAGE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PACKAGE_BINDING__ELEMENTS = FTA_PACKAGE__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PACKAGE_BINDING__INTERFACE = FTA_PACKAGE__INTERFACE;

	/**
	 * The feature id for the '<em><b>Participant Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PACKAGE_BINDING__PARTICIPANT_PACKAGE = FTA_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component Package Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PACKAGE_BINDING_FEATURE_COUNT = FTA_PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fta.impl.GateImpl <em>Gate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fta.impl.GateImpl
	 * @see fta.impl.Fta_PackageImpl#getGate()
	 * @generated
	 */
	int GATE = 4;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__GID = FTA_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__IS_CITATION = FTA_ELEMENT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__IS_ABSTRACT = FTA_ELEMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__CITED_ELEMENT = FTA_ELEMENT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__ABSTRACT_FORM = FTA_ELEMENT__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__NAME = FTA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__DESCRIPTION = FTA_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__IMPLEMENTATION_CONSTRAINT = FTA_ELEMENT__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__NOTE = FTA_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__TAGGED_VALUE = FTA_ELEMENT__TAGGED_VALUE;

	/**
	 * The number of structural features of the '<em>Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_FEATURE_COUNT = FTA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fta.impl.ANDGateImpl <em>AND Gate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fta.impl.ANDGateImpl
	 * @see fta.impl.Fta_PackageImpl#getANDGate()
	 * @generated
	 */
	int AND_GATE = 5;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_GATE__GID = GATE__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_GATE__IS_CITATION = GATE__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_GATE__IS_ABSTRACT = GATE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_GATE__CITED_ELEMENT = GATE__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_GATE__ABSTRACT_FORM = GATE__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_GATE__NAME = GATE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_GATE__DESCRIPTION = GATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_GATE__IMPLEMENTATION_CONSTRAINT = GATE__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_GATE__NOTE = GATE__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_GATE__TAGGED_VALUE = GATE__TAGGED_VALUE;

	/**
	 * The number of structural features of the '<em>AND Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_GATE_FEATURE_COUNT = GATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fta.impl.ORGateImpl <em>OR Gate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fta.impl.ORGateImpl
	 * @see fta.impl.Fta_PackageImpl#getORGate()
	 * @generated
	 */
	int OR_GATE = 6;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_GATE__GID = GATE__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_GATE__IS_CITATION = GATE__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_GATE__IS_ABSTRACT = GATE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_GATE__CITED_ELEMENT = GATE__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_GATE__ABSTRACT_FORM = GATE__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_GATE__NAME = GATE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_GATE__DESCRIPTION = GATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_GATE__IMPLEMENTATION_CONSTRAINT = GATE__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_GATE__NOTE = GATE__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_GATE__TAGGED_VALUE = GATE__TAGGED_VALUE;

	/**
	 * The number of structural features of the '<em>OR Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_GATE_FEATURE_COUNT = GATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fta.impl.InibitGateImpl <em>Inibit Gate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fta.impl.InibitGateImpl
	 * @see fta.impl.Fta_PackageImpl#getInibitGate()
	 * @generated
	 */
	int INIBIT_GATE = 7;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIBIT_GATE__GID = GATE__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIBIT_GATE__IS_CITATION = GATE__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIBIT_GATE__IS_ABSTRACT = GATE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIBIT_GATE__CITED_ELEMENT = GATE__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIBIT_GATE__ABSTRACT_FORM = GATE__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIBIT_GATE__NAME = GATE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIBIT_GATE__DESCRIPTION = GATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIBIT_GATE__IMPLEMENTATION_CONSTRAINT = GATE__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIBIT_GATE__NOTE = GATE__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIBIT_GATE__TAGGED_VALUE = GATE__TAGGED_VALUE;

	/**
	 * The number of structural features of the '<em>Inibit Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIBIT_GATE_FEATURE_COUNT = GATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fta.impl.SubtreeImpl <em>Subtree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fta.impl.SubtreeImpl
	 * @see fta.impl.Fta_PackageImpl#getSubtree()
	 * @generated
	 */
	int SUBTREE = 8;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTREE__GID = FTA_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTREE__IS_CITATION = FTA_ELEMENT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTREE__IS_ABSTRACT = FTA_ELEMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTREE__CITED_ELEMENT = FTA_ELEMENT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTREE__ABSTRACT_FORM = FTA_ELEMENT__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTREE__NAME = FTA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTREE__DESCRIPTION = FTA_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTREE__IMPLEMENTATION_CONSTRAINT = FTA_ELEMENT__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTREE__NOTE = FTA_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTREE__TAGGED_VALUE = FTA_ELEMENT__TAGGED_VALUE;

	/**
	 * The number of structural features of the '<em>Subtree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTREE_FEATURE_COUNT = FTA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fta.impl.InTriangleImpl <em>In Triangle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fta.impl.InTriangleImpl
	 * @see fta.impl.Fta_PackageImpl#getInTriangle()
	 * @generated
	 */
	int IN_TRIANGLE = 9;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_TRIANGLE__GID = SUBTREE__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_TRIANGLE__IS_CITATION = SUBTREE__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_TRIANGLE__IS_ABSTRACT = SUBTREE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_TRIANGLE__CITED_ELEMENT = SUBTREE__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_TRIANGLE__ABSTRACT_FORM = SUBTREE__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_TRIANGLE__NAME = SUBTREE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_TRIANGLE__DESCRIPTION = SUBTREE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_TRIANGLE__IMPLEMENTATION_CONSTRAINT = SUBTREE__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_TRIANGLE__NOTE = SUBTREE__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_TRIANGLE__TAGGED_VALUE = SUBTREE__TAGGED_VALUE;

	/**
	 * The number of structural features of the '<em>In Triangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_TRIANGLE_FEATURE_COUNT = SUBTREE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fta.impl.OutTriangleImpl <em>Out Triangle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fta.impl.OutTriangleImpl
	 * @see fta.impl.Fta_PackageImpl#getOutTriangle()
	 * @generated
	 */
	int OUT_TRIANGLE = 10;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_TRIANGLE__GID = SUBTREE__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_TRIANGLE__IS_CITATION = SUBTREE__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_TRIANGLE__IS_ABSTRACT = SUBTREE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_TRIANGLE__CITED_ELEMENT = SUBTREE__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_TRIANGLE__ABSTRACT_FORM = SUBTREE__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_TRIANGLE__NAME = SUBTREE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_TRIANGLE__DESCRIPTION = SUBTREE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_TRIANGLE__IMPLEMENTATION_CONSTRAINT = SUBTREE__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_TRIANGLE__NOTE = SUBTREE__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_TRIANGLE__TAGGED_VALUE = SUBTREE__TAGGED_VALUE;

	/**
	 * The number of structural features of the '<em>Out Triangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_TRIANGLE_FEATURE_COUNT = SUBTREE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fta.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fta.impl.EventImpl
	 * @see fta.impl.Fta_PackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 11;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__GID = FTA_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__IS_CITATION = FTA_ELEMENT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__IS_ABSTRACT = FTA_ELEMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__CITED_ELEMENT = FTA_ELEMENT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ABSTRACT_FORM = FTA_ELEMENT__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = FTA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__DESCRIPTION = FTA_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__IMPLEMENTATION_CONSTRAINT = FTA_ELEMENT__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NOTE = FTA_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__TAGGED_VALUE = FTA_ELEMENT__TAGGED_VALUE;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = FTA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fta.impl.TopEventImpl <em>Top Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fta.impl.TopEventImpl
	 * @see fta.impl.Fta_PackageImpl#getTopEvent()
	 * @generated
	 */
	int TOP_EVENT = 12;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_EVENT__GID = EVENT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_EVENT__IS_CITATION = EVENT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_EVENT__IS_ABSTRACT = EVENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_EVENT__CITED_ELEMENT = EVENT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_EVENT__ABSTRACT_FORM = EVENT__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_EVENT__DESCRIPTION = EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_EVENT__IMPLEMENTATION_CONSTRAINT = EVENT__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_EVENT__NOTE = EVENT__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_EVENT__TAGGED_VALUE = EVENT__TAGGED_VALUE;

	/**
	 * The number of structural features of the '<em>Top Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fta.impl.ConditioningEventImpl <em>Conditioning Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fta.impl.ConditioningEventImpl
	 * @see fta.impl.Fta_PackageImpl#getConditioningEvent()
	 * @generated
	 */
	int CONDITIONING_EVENT = 13;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONING_EVENT__GID = EVENT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONING_EVENT__IS_CITATION = EVENT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONING_EVENT__IS_ABSTRACT = EVENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONING_EVENT__CITED_ELEMENT = EVENT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONING_EVENT__ABSTRACT_FORM = EVENT__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONING_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONING_EVENT__DESCRIPTION = EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONING_EVENT__IMPLEMENTATION_CONSTRAINT = EVENT__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONING_EVENT__NOTE = EVENT__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONING_EVENT__TAGGED_VALUE = EVENT__TAGGED_VALUE;

	/**
	 * The number of structural features of the '<em>Conditioning Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONING_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fta.impl.ExternalEventImpl <em>External Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fta.impl.ExternalEventImpl
	 * @see fta.impl.Fta_PackageImpl#getExternalEvent()
	 * @generated
	 */
	int EXTERNAL_EVENT = 14;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_EVENT__GID = EVENT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_EVENT__IS_CITATION = EVENT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_EVENT__IS_ABSTRACT = EVENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_EVENT__CITED_ELEMENT = EVENT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_EVENT__ABSTRACT_FORM = EVENT__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_EVENT__DESCRIPTION = EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_EVENT__IMPLEMENTATION_CONSTRAINT = EVENT__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_EVENT__NOTE = EVENT__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_EVENT__TAGGED_VALUE = EVENT__TAGGED_VALUE;

	/**
	 * The number of structural features of the '<em>External Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fta.impl.BasicEventImpl <em>Basic Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fta.impl.BasicEventImpl
	 * @see fta.impl.Fta_PackageImpl#getBasicEvent()
	 * @generated
	 */
	int BASIC_EVENT = 15;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT__GID = EVENT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT__IS_CITATION = EVENT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT__IS_ABSTRACT = EVENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT__CITED_ELEMENT = EVENT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT__ABSTRACT_FORM = EVENT__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT__DESCRIPTION = EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT__IMPLEMENTATION_CONSTRAINT = EVENT__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT__NOTE = EVENT__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT__TAGGED_VALUE = EVENT__TAGGED_VALUE;

	/**
	 * The number of structural features of the '<em>Basic Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fta.impl.UndevelopedEventImpl <em>Undeveloped Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fta.impl.UndevelopedEventImpl
	 * @see fta.impl.Fta_PackageImpl#getUndevelopedEvent()
	 * @generated
	 */
	int UNDEVELOPED_EVENT = 16;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEVELOPED_EVENT__GID = EVENT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEVELOPED_EVENT__IS_CITATION = EVENT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEVELOPED_EVENT__IS_ABSTRACT = EVENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEVELOPED_EVENT__CITED_ELEMENT = EVENT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEVELOPED_EVENT__ABSTRACT_FORM = EVENT__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEVELOPED_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEVELOPED_EVENT__DESCRIPTION = EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEVELOPED_EVENT__IMPLEMENTATION_CONSTRAINT = EVENT__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEVELOPED_EVENT__NOTE = EVENT__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEVELOPED_EVENT__TAGGED_VALUE = EVENT__TAGGED_VALUE;

	/**
	 * The number of structural features of the '<em>Undeveloped Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEVELOPED_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fta.impl.IntermediateEventImpl <em>Intermediate Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fta.impl.IntermediateEventImpl
	 * @see fta.impl.Fta_PackageImpl#getIntermediateEvent()
	 * @generated
	 */
	int INTERMEDIATE_EVENT = 17;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_EVENT__GID = EVENT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_EVENT__IS_CITATION = EVENT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_EVENT__IS_ABSTRACT = EVENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_EVENT__CITED_ELEMENT = EVENT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_EVENT__ABSTRACT_FORM = EVENT__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_EVENT__DESCRIPTION = EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_EVENT__IMPLEMENTATION_CONSTRAINT = EVENT__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_EVENT__NOTE = EVENT__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_EVENT__TAGGED_VALUE = EVENT__TAGGED_VALUE;

	/**
	 * The number of structural features of the '<em>Intermediate Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link fta.FTAElement <em>FTA Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FTA Element</em>'.
	 * @see fta.FTAElement
	 * @generated
	 */
	EClass getFTAElement();

	/**
	 * Returns the meta object for class '{@link fta.FTAPackage <em>FTA Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FTA Package</em>'.
	 * @see fta.FTAPackage
	 * @generated
	 */
	EClass getFTAPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link fta.FTAPackage#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see fta.FTAPackage#getElements()
	 * @see #getFTAPackage()
	 * @generated
	 */
	EReference getFTAPackage_Elements();

	/**
	 * Returns the meta object for the reference list '{@link fta.FTAPackage#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interface</em>'.
	 * @see fta.FTAPackage#getInterface()
	 * @see #getFTAPackage()
	 * @generated
	 */
	EReference getFTAPackage_Interface();

	/**
	 * Returns the meta object for class '{@link fta.FTAPackageInterface <em>FTA Package Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FTA Package Interface</em>'.
	 * @see fta.FTAPackageInterface
	 * @generated
	 */
	EClass getFTAPackageInterface();

	/**
	 * Returns the meta object for the reference '{@link fta.FTAPackageInterface#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implements</em>'.
	 * @see fta.FTAPackageInterface#getImplements()
	 * @see #getFTAPackageInterface()
	 * @generated
	 */
	EReference getFTAPackageInterface_Implements();

	/**
	 * Returns the meta object for class '{@link fta.ComponentPackageBinding <em>Component Package Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Package Binding</em>'.
	 * @see fta.ComponentPackageBinding
	 * @generated
	 */
	EClass getComponentPackageBinding();

	/**
	 * Returns the meta object for the reference list '{@link fta.ComponentPackageBinding#getParticipantPackage <em>Participant Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Participant Package</em>'.
	 * @see fta.ComponentPackageBinding#getParticipantPackage()
	 * @see #getComponentPackageBinding()
	 * @generated
	 */
	EReference getComponentPackageBinding_ParticipantPackage();

	/**
	 * Returns the meta object for class '{@link fta.Gate <em>Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gate</em>'.
	 * @see fta.Gate
	 * @generated
	 */
	EClass getGate();

	/**
	 * Returns the meta object for class '{@link fta.ANDGate <em>AND Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AND Gate</em>'.
	 * @see fta.ANDGate
	 * @generated
	 */
	EClass getANDGate();

	/**
	 * Returns the meta object for class '{@link fta.ORGate <em>OR Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OR Gate</em>'.
	 * @see fta.ORGate
	 * @generated
	 */
	EClass getORGate();

	/**
	 * Returns the meta object for class '{@link fta.InibitGate <em>Inibit Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inibit Gate</em>'.
	 * @see fta.InibitGate
	 * @generated
	 */
	EClass getInibitGate();

	/**
	 * Returns the meta object for class '{@link fta.Subtree <em>Subtree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subtree</em>'.
	 * @see fta.Subtree
	 * @generated
	 */
	EClass getSubtree();

	/**
	 * Returns the meta object for class '{@link fta.InTriangle <em>In Triangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In Triangle</em>'.
	 * @see fta.InTriangle
	 * @generated
	 */
	EClass getInTriangle();

	/**
	 * Returns the meta object for class '{@link fta.OutTriangle <em>Out Triangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Out Triangle</em>'.
	 * @see fta.OutTriangle
	 * @generated
	 */
	EClass getOutTriangle();

	/**
	 * Returns the meta object for class '{@link fta.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see fta.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for class '{@link fta.TopEvent <em>Top Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Top Event</em>'.
	 * @see fta.TopEvent
	 * @generated
	 */
	EClass getTopEvent();

	/**
	 * Returns the meta object for class '{@link fta.ConditioningEvent <em>Conditioning Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditioning Event</em>'.
	 * @see fta.ConditioningEvent
	 * @generated
	 */
	EClass getConditioningEvent();

	/**
	 * Returns the meta object for class '{@link fta.ExternalEvent <em>External Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Event</em>'.
	 * @see fta.ExternalEvent
	 * @generated
	 */
	EClass getExternalEvent();

	/**
	 * Returns the meta object for class '{@link fta.BasicEvent <em>Basic Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Event</em>'.
	 * @see fta.BasicEvent
	 * @generated
	 */
	EClass getBasicEvent();

	/**
	 * Returns the meta object for class '{@link fta.UndevelopedEvent <em>Undeveloped Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Undeveloped Event</em>'.
	 * @see fta.UndevelopedEvent
	 * @generated
	 */
	EClass getUndevelopedEvent();

	/**
	 * Returns the meta object for class '{@link fta.IntermediateEvent <em>Intermediate Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intermediate Event</em>'.
	 * @see fta.IntermediateEvent
	 * @generated
	 */
	EClass getIntermediateEvent();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Fta_Factory getFta_Factory();

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
		 * The meta object literal for the '{@link fta.impl.FTAElementImpl <em>FTA Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fta.impl.FTAElementImpl
		 * @see fta.impl.Fta_PackageImpl#getFTAElement()
		 * @generated
		 */
		EClass FTA_ELEMENT = eINSTANCE.getFTAElement();

		/**
		 * The meta object literal for the '{@link fta.impl.FTAPackageImpl <em>FTA Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fta.impl.FTAPackageImpl
		 * @see fta.impl.Fta_PackageImpl#getFTAPackage()
		 * @generated
		 */
		EClass FTA_PACKAGE = eINSTANCE.getFTAPackage();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FTA_PACKAGE__ELEMENTS = eINSTANCE.getFTAPackage_Elements();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FTA_PACKAGE__INTERFACE = eINSTANCE.getFTAPackage_Interface();

		/**
		 * The meta object literal for the '{@link fta.impl.FTAPackageInterfaceImpl <em>FTA Package Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fta.impl.FTAPackageInterfaceImpl
		 * @see fta.impl.Fta_PackageImpl#getFTAPackageInterface()
		 * @generated
		 */
		EClass FTA_PACKAGE_INTERFACE = eINSTANCE.getFTAPackageInterface();

		/**
		 * The meta object literal for the '<em><b>Implements</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FTA_PACKAGE_INTERFACE__IMPLEMENTS = eINSTANCE.getFTAPackageInterface_Implements();

		/**
		 * The meta object literal for the '{@link fta.impl.ComponentPackageBindingImpl <em>Component Package Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fta.impl.ComponentPackageBindingImpl
		 * @see fta.impl.Fta_PackageImpl#getComponentPackageBinding()
		 * @generated
		 */
		EClass COMPONENT_PACKAGE_BINDING = eINSTANCE.getComponentPackageBinding();

		/**
		 * The meta object literal for the '<em><b>Participant Package</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_PACKAGE_BINDING__PARTICIPANT_PACKAGE = eINSTANCE.getComponentPackageBinding_ParticipantPackage();

		/**
		 * The meta object literal for the '{@link fta.impl.GateImpl <em>Gate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fta.impl.GateImpl
		 * @see fta.impl.Fta_PackageImpl#getGate()
		 * @generated
		 */
		EClass GATE = eINSTANCE.getGate();

		/**
		 * The meta object literal for the '{@link fta.impl.ANDGateImpl <em>AND Gate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fta.impl.ANDGateImpl
		 * @see fta.impl.Fta_PackageImpl#getANDGate()
		 * @generated
		 */
		EClass AND_GATE = eINSTANCE.getANDGate();

		/**
		 * The meta object literal for the '{@link fta.impl.ORGateImpl <em>OR Gate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fta.impl.ORGateImpl
		 * @see fta.impl.Fta_PackageImpl#getORGate()
		 * @generated
		 */
		EClass OR_GATE = eINSTANCE.getORGate();

		/**
		 * The meta object literal for the '{@link fta.impl.InibitGateImpl <em>Inibit Gate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fta.impl.InibitGateImpl
		 * @see fta.impl.Fta_PackageImpl#getInibitGate()
		 * @generated
		 */
		EClass INIBIT_GATE = eINSTANCE.getInibitGate();

		/**
		 * The meta object literal for the '{@link fta.impl.SubtreeImpl <em>Subtree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fta.impl.SubtreeImpl
		 * @see fta.impl.Fta_PackageImpl#getSubtree()
		 * @generated
		 */
		EClass SUBTREE = eINSTANCE.getSubtree();

		/**
		 * The meta object literal for the '{@link fta.impl.InTriangleImpl <em>In Triangle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fta.impl.InTriangleImpl
		 * @see fta.impl.Fta_PackageImpl#getInTriangle()
		 * @generated
		 */
		EClass IN_TRIANGLE = eINSTANCE.getInTriangle();

		/**
		 * The meta object literal for the '{@link fta.impl.OutTriangleImpl <em>Out Triangle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fta.impl.OutTriangleImpl
		 * @see fta.impl.Fta_PackageImpl#getOutTriangle()
		 * @generated
		 */
		EClass OUT_TRIANGLE = eINSTANCE.getOutTriangle();

		/**
		 * The meta object literal for the '{@link fta.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fta.impl.EventImpl
		 * @see fta.impl.Fta_PackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '{@link fta.impl.TopEventImpl <em>Top Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fta.impl.TopEventImpl
		 * @see fta.impl.Fta_PackageImpl#getTopEvent()
		 * @generated
		 */
		EClass TOP_EVENT = eINSTANCE.getTopEvent();

		/**
		 * The meta object literal for the '{@link fta.impl.ConditioningEventImpl <em>Conditioning Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fta.impl.ConditioningEventImpl
		 * @see fta.impl.Fta_PackageImpl#getConditioningEvent()
		 * @generated
		 */
		EClass CONDITIONING_EVENT = eINSTANCE.getConditioningEvent();

		/**
		 * The meta object literal for the '{@link fta.impl.ExternalEventImpl <em>External Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fta.impl.ExternalEventImpl
		 * @see fta.impl.Fta_PackageImpl#getExternalEvent()
		 * @generated
		 */
		EClass EXTERNAL_EVENT = eINSTANCE.getExternalEvent();

		/**
		 * The meta object literal for the '{@link fta.impl.BasicEventImpl <em>Basic Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fta.impl.BasicEventImpl
		 * @see fta.impl.Fta_PackageImpl#getBasicEvent()
		 * @generated
		 */
		EClass BASIC_EVENT = eINSTANCE.getBasicEvent();

		/**
		 * The meta object literal for the '{@link fta.impl.UndevelopedEventImpl <em>Undeveloped Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fta.impl.UndevelopedEventImpl
		 * @see fta.impl.Fta_PackageImpl#getUndevelopedEvent()
		 * @generated
		 */
		EClass UNDEVELOPED_EVENT = eINSTANCE.getUndevelopedEvent();

		/**
		 * The meta object literal for the '{@link fta.impl.IntermediateEventImpl <em>Intermediate Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fta.impl.IntermediateEventImpl
		 * @see fta.impl.Fta_PackageImpl#getIntermediateEvent()
		 * @generated
		 */
		EClass INTERMEDIATE_EVENT = eINSTANCE.getIntermediateEvent();

	}

} //Fta_Package
