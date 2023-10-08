/**
 */
package mbsa.impl;

import base.Base_Package;

import base.impl.Base_PackageImpl;

import component.Component_Package;

import component.impl.Component_PackageImpl;

import fta.Fta_Package;

import fta.impl.Fta_PackageImpl;

import hazard.Hazard_Package;

import hazard.impl.Hazard_PackageImpl;

import mbsa.MBSAPackage;
import mbsa.Mbsa_Factory;
import mbsa.Mbsa_Package;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import requirement.Requirement_Package;

import requirement.impl.Requirement_PackageImpl;

import safety_concept.Safety_concept_Package;

import safety_concept.impl.Safety_concept_PackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Mbsa_PackageImpl extends EPackageImpl implements Mbsa_Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mbsaPackageEClass = null;

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
	 * @see mbsa.Mbsa_Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Mbsa_PackageImpl() {
		super(eNS_URI, Mbsa_Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Mbsa_Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Mbsa_Package init() {
		if (isInited) return (Mbsa_Package)EPackage.Registry.INSTANCE.getEPackage(Mbsa_Package.eNS_URI);

		// Obtain or create and register package
		Object registeredMbsa_Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		Mbsa_PackageImpl theMbsa_Package = registeredMbsa_Package instanceof Mbsa_PackageImpl ? (Mbsa_PackageImpl)registeredMbsa_Package : new Mbsa_PackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Base_Package.eNS_URI);
		Base_PackageImpl theBase_Package = (Base_PackageImpl)(registeredPackage instanceof Base_PackageImpl ? registeredPackage : Base_Package.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Component_Package.eNS_URI);
		Component_PackageImpl theComponent_Package = (Component_PackageImpl)(registeredPackage instanceof Component_PackageImpl ? registeredPackage : Component_Package.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Requirement_Package.eNS_URI);
		Requirement_PackageImpl theRequirement_Package = (Requirement_PackageImpl)(registeredPackage instanceof Requirement_PackageImpl ? registeredPackage : Requirement_Package.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Hazard_Package.eNS_URI);
		Hazard_PackageImpl theHazard_Package = (Hazard_PackageImpl)(registeredPackage instanceof Hazard_PackageImpl ? registeredPackage : Hazard_Package.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Safety_concept_Package.eNS_URI);
		Safety_concept_PackageImpl theSafety_concept_Package = (Safety_concept_PackageImpl)(registeredPackage instanceof Safety_concept_PackageImpl ? registeredPackage : Safety_concept_Package.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Fta_Package.eNS_URI);
		Fta_PackageImpl theFta_Package = (Fta_PackageImpl)(registeredPackage instanceof Fta_PackageImpl ? registeredPackage : Fta_Package.eINSTANCE);

		// Create package meta-data objects
		theMbsa_Package.createPackageContents();
		theBase_Package.createPackageContents();
		theComponent_Package.createPackageContents();
		theRequirement_Package.createPackageContents();
		theHazard_Package.createPackageContents();
		theSafety_concept_Package.createPackageContents();
		theFta_Package.createPackageContents();

		// Initialize created meta-data
		theMbsa_Package.initializePackageContents();
		theBase_Package.initializePackageContents();
		theComponent_Package.initializePackageContents();
		theRequirement_Package.initializePackageContents();
		theHazard_Package.initializePackageContents();
		theSafety_concept_Package.initializePackageContents();
		theFta_Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMbsa_Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Mbsa_Package.eNS_URI, theMbsa_Package);
		return theMbsa_Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMBSAPackage() {
		return mbsaPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMBSAPackage_MbsaPackages() {
		return (EReference)mbsaPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMBSAPackage_ComponentPackage() {
		return (EReference)mbsaPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMBSAPackage_RequirementPackage() {
		return (EReference)mbsaPackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMBSAPackage_HazardPackage() {
		return (EReference)mbsaPackageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMBSAPackage_SafetyConceptPackage() {
		return (EReference)mbsaPackageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMBSAPackage_FtaPackage() {
		return (EReference)mbsaPackageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Mbsa_Factory getMbsa_Factory() {
		return (Mbsa_Factory)getEFactoryInstance();
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
		mbsaPackageEClass = createEClass(MBSA_PACKAGE);
		createEReference(mbsaPackageEClass, MBSA_PACKAGE__MBSA_PACKAGES);
		createEReference(mbsaPackageEClass, MBSA_PACKAGE__COMPONENT_PACKAGE);
		createEReference(mbsaPackageEClass, MBSA_PACKAGE__REQUIREMENT_PACKAGE);
		createEReference(mbsaPackageEClass, MBSA_PACKAGE__HAZARD_PACKAGE);
		createEReference(mbsaPackageEClass, MBSA_PACKAGE__SAFETY_CONCEPT_PACKAGE);
		createEReference(mbsaPackageEClass, MBSA_PACKAGE__FTA_PACKAGE);
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
		Component_Package theComponent_Package = (Component_Package)EPackage.Registry.INSTANCE.getEPackage(Component_Package.eNS_URI);
		Requirement_Package theRequirement_Package = (Requirement_Package)EPackage.Registry.INSTANCE.getEPackage(Requirement_Package.eNS_URI);
		Hazard_Package theHazard_Package = (Hazard_Package)EPackage.Registry.INSTANCE.getEPackage(Hazard_Package.eNS_URI);
		Safety_concept_Package theSafety_concept_Package = (Safety_concept_Package)EPackage.Registry.INSTANCE.getEPackage(Safety_concept_Package.eNS_URI);
		Fta_Package theFta_Package = (Fta_Package)EPackage.Registry.INSTANCE.getEPackage(Fta_Package.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		mbsaPackageEClass.getESuperTypes().add(theBase_Package.getArtifactElement());

		// Initialize classes and features; add operations and parameters
		initEClass(mbsaPackageEClass, MBSAPackage.class, "MBSAPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMBSAPackage_MbsaPackages(), this.getMBSAPackage(), null, "mbsaPackages", null, 0, -1, MBSAPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMBSAPackage_ComponentPackage(), theComponent_Package.getComponentPackage(), null, "componentPackage", null, 0, -1, MBSAPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMBSAPackage_RequirementPackage(), theRequirement_Package.getRequirementPackage(), null, "requirementPackage", null, 0, -1, MBSAPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMBSAPackage_HazardPackage(), theHazard_Package.getHazardPackage(), null, "hazardPackage", null, 0, -1, MBSAPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMBSAPackage_SafetyConceptPackage(), theSafety_concept_Package.getSafetyConceptPackage(), null, "safetyConceptPackage", null, 0, -1, MBSAPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMBSAPackage_FtaPackage(), theFta_Package.getFTAPackage(), null, "ftaPackage", null, 0, -1, MBSAPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Mbsa_PackageImpl
