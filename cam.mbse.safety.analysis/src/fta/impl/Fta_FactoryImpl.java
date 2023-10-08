/**
 */
package fta.impl;

import fta.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Fta_FactoryImpl extends EFactoryImpl implements Fta_Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Fta_Factory init() {
		try {
			Fta_Factory theFta_Factory = (Fta_Factory)EPackage.Registry.INSTANCE.getEFactory(Fta_Package.eNS_URI);
			if (theFta_Factory != null) {
				return theFta_Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Fta_FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fta_FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Fta_Package.FTA_PACKAGE: return createFTAPackage();
			case Fta_Package.FTA_PACKAGE_INTERFACE: return createFTAPackageInterface();
			case Fta_Package.COMPONENT_PACKAGE_BINDING: return createComponentPackageBinding();
			case Fta_Package.GATE: return createGate();
			case Fta_Package.AND_GATE: return createANDGate();
			case Fta_Package.OR_GATE: return createORGate();
			case Fta_Package.INIBIT_GATE: return createInibitGate();
			case Fta_Package.SUBTREE: return createSubtree();
			case Fta_Package.IN_TRIANGLE: return createInTriangle();
			case Fta_Package.OUT_TRIANGLE: return createOutTriangle();
			case Fta_Package.EVENT: return createEvent();
			case Fta_Package.TOP_EVENT: return createTopEvent();
			case Fta_Package.CONDITIONING_EVENT: return createConditioningEvent();
			case Fta_Package.EXTERNAL_EVENT: return createExternalEvent();
			case Fta_Package.BASIC_EVENT: return createBasicEvent();
			case Fta_Package.UNDEVELOPED_EVENT: return createUndevelopedEvent();
			case Fta_Package.INTERMEDIATE_EVENT: return createIntermediateEvent();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FTAPackage createFTAPackage() {
		FTAPackageImpl ftaPackage = new FTAPackageImpl();
		return ftaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FTAPackageInterface createFTAPackageInterface() {
		FTAPackageInterfaceImpl ftaPackageInterface = new FTAPackageInterfaceImpl();
		return ftaPackageInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentPackageBinding createComponentPackageBinding() {
		ComponentPackageBindingImpl componentPackageBinding = new ComponentPackageBindingImpl();
		return componentPackageBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Gate createGate() {
		GateImpl gate = new GateImpl();
		return gate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ANDGate createANDGate() {
		ANDGateImpl andGate = new ANDGateImpl();
		return andGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ORGate createORGate() {
		ORGateImpl orGate = new ORGateImpl();
		return orGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InibitGate createInibitGate() {
		InibitGateImpl inibitGate = new InibitGateImpl();
		return inibitGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Subtree createSubtree() {
		SubtreeImpl subtree = new SubtreeImpl();
		return subtree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InTriangle createInTriangle() {
		InTriangleImpl inTriangle = new InTriangleImpl();
		return inTriangle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OutTriangle createOutTriangle() {
		OutTriangleImpl outTriangle = new OutTriangleImpl();
		return outTriangle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TopEvent createTopEvent() {
		TopEventImpl topEvent = new TopEventImpl();
		return topEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditioningEvent createConditioningEvent() {
		ConditioningEventImpl conditioningEvent = new ConditioningEventImpl();
		return conditioningEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalEvent createExternalEvent() {
		ExternalEventImpl externalEvent = new ExternalEventImpl();
		return externalEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasicEvent createBasicEvent() {
		BasicEventImpl basicEvent = new BasicEventImpl();
		return basicEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UndevelopedEvent createUndevelopedEvent() {
		UndevelopedEventImpl undevelopedEvent = new UndevelopedEventImpl();
		return undevelopedEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntermediateEvent createIntermediateEvent() {
		IntermediateEventImpl intermediateEvent = new IntermediateEventImpl();
		return intermediateEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fta_Package getFta_Package() {
		return (Fta_Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Fta_Package getPackage() {
		return Fta_Package.eINSTANCE;
	}

} //Fta_FactoryImpl
