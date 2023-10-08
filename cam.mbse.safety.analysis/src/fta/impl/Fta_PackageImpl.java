/**
 */
package fta.impl;

import base.Base_Package;

import base.impl.Base_PackageImpl;

import component.Component_Package;

import component.impl.Component_PackageImpl;

import fta.ANDGate;
import fta.BasicEvent;
import fta.ComponentPackageBinding;
import fta.ConditioningEvent;
import fta.Event;
import fta.ExternalEvent;
import fta.FTAElement;
import fta.FTAPackage;
import fta.FTAPackageInterface;
import fta.Fta_Factory;
import fta.Fta_Package;
import fta.Gate;
import fta.InTriangle;
import fta.InibitGate;
import fta.IntermediateEvent;
import fta.ORGate;
import fta.OutTriangle;
import fta.Subtree;
import fta.TopEvent;
import fta.UndevelopedEvent;

import hazard.Hazard_Package;

import hazard.impl.Hazard_PackageImpl;

import mbsa.Mbsa_Package;

import mbsa.impl.Mbsa_PackageImpl;

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
public class Fta_PackageImpl extends EPackageImpl implements Fta_Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ftaElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ftaPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ftaPackageInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentPackageBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andGateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orGateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inibitGateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subtreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inTriangleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outTriangleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditioningEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass undevelopedEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intermediateEventEClass = null;

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
	 * @see fta.Fta_Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Fta_PackageImpl() {
		super(eNS_URI, Fta_Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Fta_Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Fta_Package init() {
		if (isInited) return (Fta_Package)EPackage.Registry.INSTANCE.getEPackage(Fta_Package.eNS_URI);

		// Obtain or create and register package
		Object registeredFta_Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		Fta_PackageImpl theFta_Package = registeredFta_Package instanceof Fta_PackageImpl ? (Fta_PackageImpl)registeredFta_Package : new Fta_PackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Safety_concept_Package.eNS_URI);
		Safety_concept_PackageImpl theSafety_concept_Package = (Safety_concept_PackageImpl)(registeredPackage instanceof Safety_concept_PackageImpl ? registeredPackage : Safety_concept_Package.eINSTANCE);

		// Create package meta-data objects
		theFta_Package.createPackageContents();
		theMbsa_Package.createPackageContents();
		theBase_Package.createPackageContents();
		theComponent_Package.createPackageContents();
		theRequirement_Package.createPackageContents();
		theHazard_Package.createPackageContents();
		theSafety_concept_Package.createPackageContents();

		// Initialize created meta-data
		theFta_Package.initializePackageContents();
		theMbsa_Package.initializePackageContents();
		theBase_Package.initializePackageContents();
		theComponent_Package.initializePackageContents();
		theRequirement_Package.initializePackageContents();
		theHazard_Package.initializePackageContents();
		theSafety_concept_Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFta_Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Fta_Package.eNS_URI, theFta_Package);
		return theFta_Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFTAElement() {
		return ftaElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFTAPackage() {
		return ftaPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFTAPackage_Elements() {
		return (EReference)ftaPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFTAPackage_Interface() {
		return (EReference)ftaPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFTAPackageInterface() {
		return ftaPackageInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFTAPackageInterface_Implements() {
		return (EReference)ftaPackageInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentPackageBinding() {
		return componentPackageBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentPackageBinding_ParticipantPackage() {
		return (EReference)componentPackageBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGate() {
		return gateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getANDGate() {
		return andGateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getORGate() {
		return orGateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInibitGate() {
		return inibitGateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubtree() {
		return subtreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInTriangle() {
		return inTriangleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOutTriangle() {
		return outTriangleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTopEvent() {
		return topEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConditioningEvent() {
		return conditioningEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExternalEvent() {
		return externalEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBasicEvent() {
		return basicEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUndevelopedEvent() {
		return undevelopedEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIntermediateEvent() {
		return intermediateEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fta_Factory getFta_Factory() {
		return (Fta_Factory)getEFactoryInstance();
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
		ftaElementEClass = createEClass(FTA_ELEMENT);

		ftaPackageEClass = createEClass(FTA_PACKAGE);
		createEReference(ftaPackageEClass, FTA_PACKAGE__ELEMENTS);
		createEReference(ftaPackageEClass, FTA_PACKAGE__INTERFACE);

		ftaPackageInterfaceEClass = createEClass(FTA_PACKAGE_INTERFACE);
		createEReference(ftaPackageInterfaceEClass, FTA_PACKAGE_INTERFACE__IMPLEMENTS);

		componentPackageBindingEClass = createEClass(COMPONENT_PACKAGE_BINDING);
		createEReference(componentPackageBindingEClass, COMPONENT_PACKAGE_BINDING__PARTICIPANT_PACKAGE);

		gateEClass = createEClass(GATE);

		andGateEClass = createEClass(AND_GATE);

		orGateEClass = createEClass(OR_GATE);

		inibitGateEClass = createEClass(INIBIT_GATE);

		subtreeEClass = createEClass(SUBTREE);

		inTriangleEClass = createEClass(IN_TRIANGLE);

		outTriangleEClass = createEClass(OUT_TRIANGLE);

		eventEClass = createEClass(EVENT);

		topEventEClass = createEClass(TOP_EVENT);

		conditioningEventEClass = createEClass(CONDITIONING_EVENT);

		externalEventEClass = createEClass(EXTERNAL_EVENT);

		basicEventEClass = createEClass(BASIC_EVENT);

		undevelopedEventEClass = createEClass(UNDEVELOPED_EVENT);

		intermediateEventEClass = createEClass(INTERMEDIATE_EVENT);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		ftaElementEClass.getESuperTypes().add(theBase_Package.getArtifactElement());
		ftaPackageEClass.getESuperTypes().add(this.getFTAElement());
		ftaPackageInterfaceEClass.getESuperTypes().add(this.getFTAPackage());
		componentPackageBindingEClass.getESuperTypes().add(this.getFTAPackage());
		gateEClass.getESuperTypes().add(this.getFTAElement());
		andGateEClass.getESuperTypes().add(this.getGate());
		orGateEClass.getESuperTypes().add(this.getGate());
		inibitGateEClass.getESuperTypes().add(this.getGate());
		subtreeEClass.getESuperTypes().add(this.getFTAElement());
		inTriangleEClass.getESuperTypes().add(this.getSubtree());
		outTriangleEClass.getESuperTypes().add(this.getSubtree());
		eventEClass.getESuperTypes().add(this.getFTAElement());
		topEventEClass.getESuperTypes().add(this.getEvent());
		conditioningEventEClass.getESuperTypes().add(this.getEvent());
		externalEventEClass.getESuperTypes().add(this.getEvent());
		basicEventEClass.getESuperTypes().add(this.getEvent());
		undevelopedEventEClass.getESuperTypes().add(this.getEvent());
		intermediateEventEClass.getESuperTypes().add(this.getEvent());

		// Initialize classes and features; add operations and parameters
		initEClass(ftaElementEClass, FTAElement.class, "FTAElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ftaPackageEClass, FTAPackage.class, "FTAPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFTAPackage_Elements(), this.getFTAElement(), null, "elements", null, 0, -1, FTAPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFTAPackage_Interface(), this.getFTAPackageInterface(), null, "interface", null, 0, -1, FTAPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ftaPackageInterfaceEClass, FTAPackageInterface.class, "FTAPackageInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFTAPackageInterface_Implements(), this.getFTAPackage(), null, "implements", null, 1, 1, FTAPackageInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentPackageBindingEClass, ComponentPackageBinding.class, "ComponentPackageBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentPackageBinding_ParticipantPackage(), this.getFTAPackage(), null, "participantPackage", null, 2, -1, ComponentPackageBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gateEClass, Gate.class, "Gate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(andGateEClass, ANDGate.class, "ANDGate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orGateEClass, ORGate.class, "ORGate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inibitGateEClass, InibitGate.class, "InibitGate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subtreeEClass, Subtree.class, "Subtree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inTriangleEClass, InTriangle.class, "InTriangle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(outTriangleEClass, OutTriangle.class, "OutTriangle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(topEventEClass, TopEvent.class, "TopEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conditioningEventEClass, ConditioningEvent.class, "ConditioningEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(externalEventEClass, ExternalEvent.class, "ExternalEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(basicEventEClass, BasicEvent.class, "BasicEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(undevelopedEventEClass, UndevelopedEvent.class, "UndevelopedEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(intermediateEventEClass, IntermediateEvent.class, "IntermediateEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //Fta_PackageImpl
