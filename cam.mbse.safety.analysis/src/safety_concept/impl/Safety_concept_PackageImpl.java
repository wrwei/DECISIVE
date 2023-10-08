/**
 */
package safety_concept.impl;

import base.Base_Package;

import base.impl.Base_PackageImpl;

import component.Component_Package;
import component.impl.Component_PackageImpl;
import fta.Fta_Package;
import fta.impl.Fta_PackageImpl;
import hazard.Hazard_Package;
import hazard.impl.Hazard_PackageImpl;
import mbsa.Mbsa_Package;
import mbsa.impl.Mbsa_PackageImpl;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import requirement.Requirement_Package;

import requirement.impl.Requirement_PackageImpl;

import safety_concept.ConceptElement;
import safety_concept.RequirementRelationship;
import safety_concept.SafetyConceptPackage;
import safety_concept.SafetyConceptPackageBinding;
import safety_concept.SafetyConceptPackageInterface;
import safety_concept.Safety_Concept;
import safety_concept.Safety_concept_Factory;
import safety_concept.Safety_concept_Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Safety_concept_PackageImpl extends EPackageImpl implements Safety_concept_Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass safetyConceptPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass safetyConceptPackageBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass safetyConceptPackageInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass safety_ConceptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum asilEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum silEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ablEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see safety_concept.Safety_concept_Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Safety_concept_PackageImpl() {
		super(eNS_URI, Safety_concept_Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Safety_concept_Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Safety_concept_Package init() {
		if (isInited) return (Safety_concept_Package)EPackage.Registry.INSTANCE.getEPackage(Safety_concept_Package.eNS_URI);

		// Obtain or create and register package
		Object registeredSafety_concept_Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		Safety_concept_PackageImpl theSafety_concept_Package = registeredSafety_concept_Package instanceof Safety_concept_PackageImpl ? (Safety_concept_PackageImpl)registeredSafety_concept_Package : new Safety_concept_PackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Mbsa_Package.eNS_URI);
		Mbsa_PackageImpl theMbsa_Package = (Mbsa_PackageImpl)(registeredPackage instanceof Mbsa_PackageImpl ? registeredPackage : Mbsa_Package.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Base_Package.eNS_URI);
		Base_PackageImpl theBase_Package = (Base_PackageImpl)(registeredPackage instanceof Base_PackageImpl ? registeredPackage : Base_Package.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Component_Package.eNS_URI);
		Component_PackageImpl theComponent_Package = (Component_PackageImpl)(registeredPackage instanceof Component_PackageImpl ? registeredPackage : Component_Package.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Requirement_Package.eNS_URI);
		Requirement_PackageImpl theRequirement_Package = (Requirement_PackageImpl)(registeredPackage instanceof Requirement_PackageImpl ? registeredPackage : Requirement_Package.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Hazard_Package.eNS_URI);
		Hazard_PackageImpl theHazard_Package = (Hazard_PackageImpl)(registeredPackage instanceof Hazard_PackageImpl ? registeredPackage : Hazard_Package.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Fta_Package.eNS_URI);
		Fta_PackageImpl theFta_Package = (Fta_PackageImpl)(registeredPackage instanceof Fta_PackageImpl ? registeredPackage : Fta_Package.eINSTANCE);

		// Create package meta-data objects
		theSafety_concept_Package.createPackageContents();
		theMbsa_Package.createPackageContents();
		theBase_Package.createPackageContents();
		theComponent_Package.createPackageContents();
		theRequirement_Package.createPackageContents();
		theHazard_Package.createPackageContents();
		theFta_Package.createPackageContents();

		// Initialize created meta-data
		theSafety_concept_Package.initializePackageContents();
		theMbsa_Package.initializePackageContents();
		theBase_Package.initializePackageContents();
		theComponent_Package.initializePackageContents();
		theRequirement_Package.initializePackageContents();
		theHazard_Package.initializePackageContents();
		theFta_Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSafety_concept_Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Safety_concept_Package.eNS_URI, theSafety_concept_Package);
		return theSafety_concept_Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConceptElement() {
		return conceptElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSafetyConceptPackage() {
		return safetyConceptPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSafetyConceptPackage_RequirementElement() {
		return (EReference)safetyConceptPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSafetyConceptPackage_Interface() {
		return (EReference)safetyConceptPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSafetyConceptPackageBinding() {
		return safetyConceptPackageBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSafetyConceptPackageBinding_ParticipantPackage() {
		return (EReference)safetyConceptPackageBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSafetyConceptPackageInterface() {
		return safetyConceptPackageInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSafetyConceptPackageInterface_Implements() {
		return (EReference)safetyConceptPackageInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSafety_Concept() {
		return safety_ConceptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSafety_Concept_Abstract_level() {
		return (EAttribute)safety_ConceptEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSafety_Concept_Asil() {
		return (EAttribute)safety_ConceptEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSafety_Concept_Sil() {
		return (EAttribute)safety_ConceptEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSafety_Concept_Identity() {
		return (EAttribute)safety_ConceptEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSafety_Concept_Desc() {
		return (EAttribute)safety_ConceptEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSafety_Concept_Script() {
		return (EAttribute)safety_ConceptEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSafety_Concept_Satisfied() {
		return (EAttribute)safety_ConceptEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSafety_Concept_Requirement() {
		return (EReference)safety_ConceptEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequirementRelationship() {
		return requirementRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirementRelationship_Label() {
		return (EAttribute)requirementRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirementRelationship_Source() {
		return (EReference)requirementRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirementRelationship_Target() {
		return (EReference)requirementRelationshipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getASIL() {
		return asilEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSIL() {
		return silEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getABL() {
		return ablEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Safety_concept_Factory getSafety_concept_Factory() {
		return (Safety_concept_Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		conceptElementEClass = createEClass(CONCEPT_ELEMENT);

		safetyConceptPackageEClass = createEClass(SAFETY_CONCEPT_PACKAGE);
		createEReference(safetyConceptPackageEClass, SAFETY_CONCEPT_PACKAGE__REQUIREMENT_ELEMENT);
		createEReference(safetyConceptPackageEClass, SAFETY_CONCEPT_PACKAGE__INTERFACE);

		safetyConceptPackageBindingEClass = createEClass(SAFETY_CONCEPT_PACKAGE_BINDING);
		createEReference(safetyConceptPackageBindingEClass, SAFETY_CONCEPT_PACKAGE_BINDING__PARTICIPANT_PACKAGE);

		safetyConceptPackageInterfaceEClass = createEClass(SAFETY_CONCEPT_PACKAGE_INTERFACE);
		createEReference(safetyConceptPackageInterfaceEClass, SAFETY_CONCEPT_PACKAGE_INTERFACE__IMPLEMENTS);

		safety_ConceptEClass = createEClass(SAFETY_CONCEPT);
		createEAttribute(safety_ConceptEClass, SAFETY_CONCEPT__ABSTRACT_LEVEL);
		createEAttribute(safety_ConceptEClass, SAFETY_CONCEPT__ASIL);
		createEAttribute(safety_ConceptEClass, SAFETY_CONCEPT__SIL);
		createEAttribute(safety_ConceptEClass, SAFETY_CONCEPT__IDENTITY);
		createEAttribute(safety_ConceptEClass, SAFETY_CONCEPT__DESC);
		createEAttribute(safety_ConceptEClass, SAFETY_CONCEPT__SCRIPT);
		createEAttribute(safety_ConceptEClass, SAFETY_CONCEPT__SATISFIED);
		createEReference(safety_ConceptEClass, SAFETY_CONCEPT__REQUIREMENT);

		requirementRelationshipEClass = createEClass(REQUIREMENT_RELATIONSHIP);
		createEAttribute(requirementRelationshipEClass, REQUIREMENT_RELATIONSHIP__LABEL);
		createEReference(requirementRelationshipEClass, REQUIREMENT_RELATIONSHIP__SOURCE);
		createEReference(requirementRelationshipEClass, REQUIREMENT_RELATIONSHIP__TARGET);

		// Create enums
		asilEEnum = createEEnum(ASIL);
		silEEnum = createEEnum(SIL);
		ablEEnum = createEEnum(ABL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		Base_Package theBase_Package = (Base_Package)EPackage.Registry.INSTANCE.getEPackage(Base_Package.eNS_URI);
		Requirement_Package theRequirement_Package = (Requirement_Package)EPackage.Registry.INSTANCE.getEPackage(Requirement_Package.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		conceptElementEClass.getESuperTypes().add(theBase_Package.getArtifactElement());
		safetyConceptPackageEClass.getESuperTypes().add(this.getConceptElement());
		safetyConceptPackageBindingEClass.getESuperTypes().add(this.getSafetyConceptPackage());
		safetyConceptPackageInterfaceEClass.getESuperTypes().add(this.getSafetyConceptPackage());
		safety_ConceptEClass.getESuperTypes().add(this.getConceptElement());
		requirementRelationshipEClass.getESuperTypes().add(this.getConceptElement());

		// Initialize classes and features; add operations and parameters
		initEClass(conceptElementEClass, ConceptElement.class, "ConceptElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(safetyConceptPackageEClass, SafetyConceptPackage.class, "SafetyConceptPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSafetyConceptPackage_RequirementElement(), this.getConceptElement(), null, "requirementElement", null, 0, -1, SafetyConceptPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSafetyConceptPackage_Interface(), this.getSafetyConceptPackageInterface(), null, "interface", null, 0, -1, SafetyConceptPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(safetyConceptPackageBindingEClass, SafetyConceptPackageBinding.class, "SafetyConceptPackageBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSafetyConceptPackageBinding_ParticipantPackage(), this.getSafetyConceptPackage(), null, "participantPackage", null, 2, -1, SafetyConceptPackageBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(safetyConceptPackageInterfaceEClass, SafetyConceptPackageInterface.class, "SafetyConceptPackageInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSafetyConceptPackageInterface_Implements(), this.getSafetyConceptPackage(), null, "implements", null, 1, 1, SafetyConceptPackageInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(safety_ConceptEClass, Safety_Concept.class, "Safety_Concept", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSafety_Concept_Abstract_level(), this.getABL(), "abstract_level", null, 0, 1, Safety_Concept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSafety_Concept_Asil(), this.getASIL(), "asil", null, 0, 1, Safety_Concept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSafety_Concept_Sil(), this.getSIL(), "sil", null, 0, 1, Safety_Concept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSafety_Concept_Identity(), ecorePackage.getEInt(), "identity", null, 0, 1, Safety_Concept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSafety_Concept_Desc(), ecorePackage.getEString(), "desc", null, 0, 1, Safety_Concept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSafety_Concept_Script(), ecorePackage.getEString(), "script", null, 0, 1, Safety_Concept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSafety_Concept_Satisfied(), ecorePackage.getEBoolean(), "satisfied", null, 0, 1, Safety_Concept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSafety_Concept_Requirement(), theRequirement_Package.getRequirement(), null, "requirement", null, 0, 1, Safety_Concept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requirementRelationshipEClass, RequirementRelationship.class, "RequirementRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequirementRelationship_Label(), ecorePackage.getEString(), "label", null, 0, 1, RequirementRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirementRelationship_Source(), this.getSafety_Concept(), null, "source", null, 0, 1, RequirementRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirementRelationship_Target(), this.getSafety_Concept(), null, "target", null, 0, 1, RequirementRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(asilEEnum, safety_concept.ASIL.class, "ASIL");
		addEEnumLiteral(asilEEnum, safety_concept.ASIL.ASIL_A);
		addEEnumLiteral(asilEEnum, safety_concept.ASIL.ASIL_B);
		addEEnumLiteral(asilEEnum, safety_concept.ASIL.ASIL_C);
		addEEnumLiteral(asilEEnum, safety_concept.ASIL.ASIL_D);

		initEEnum(silEEnum, safety_concept.SIL.class, "SIL");
		addEEnumLiteral(silEEnum, safety_concept.SIL.SIL_1);
		addEEnumLiteral(silEEnum, safety_concept.SIL.SIL_2);
		addEEnumLiteral(silEEnum, safety_concept.SIL.SIL_3);
		addEEnumLiteral(silEEnum, safety_concept.SIL.SIL_4);

		initEEnum(ablEEnum, safety_concept.ABL.class, "ABL");
		addEEnumLiteral(ablEEnum, safety_concept.ABL.FUNCTIONAL);
		addEEnumLiteral(ablEEnum, safety_concept.ABL.TECHNICAL);
		addEEnumLiteral(ablEEnum, safety_concept.ABL.SOFTWARE);
		addEEnumLiteral(ablEEnum, safety_concept.ABL.HARDWARE);

		// Create resource
		createResource(eNS_URI);
	}

} //Safety_concept_PackageImpl
