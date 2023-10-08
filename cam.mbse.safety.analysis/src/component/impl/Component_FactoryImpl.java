/**
 */
package component.impl;

import component.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class Component_FactoryImpl extends EFactoryImpl implements Component_Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Component_Factory init() {
		try {
			Component_Factory theComponent_Factory = (Component_Factory)EPackage.Registry.INSTANCE.getEFactory(Component_Package.eNS_URI);
			if (theComponent_Factory != null) {
				return theComponent_Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Component_FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component_FactoryImpl() {
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
			case Component_Package.COMPONENT_PACKAGE: return createComponentPackage();
			case Component_Package.COMPONENT_PACKAGE_INTERFACE: return createComponentPackageInterface();
			case Component_Package.COMPONENT_PACKAGE_BINDING: return createComponentPackageBinding();
			case Component_Package.COMPONENT: return createComponent();
			case Component_Package.DIRECTED_RELATIONSHIP: return createDirectedRelationship();
			case Component_Package.UNDIRECTED_RELATIONSHIP: return createUndirectedRelationship();
			case Component_Package.FORK: return createFork();
			case Component_Package.SWITCH: return createSwitch();
			case Component_Package.INPUT: return createInput();
			case Component_Package.OUTPUT: return createOutput();
			case Component_Package.LPORT: return createLPort();
			case Component_Package.RPORT: return createRPort();
			case Component_Package.FUNCTION: return createFunction();
			case Component_Package.READING: return createReading();
			case Component_Package.FAILURE_MODE: return createFailureMode();
			case Component_Package.SAFETY_MECHANISM: return createSafetyMechanism();
			case Component_Package.COST: return createCost();
			case Component_Package.REGIONAL_EFFECT: return createRegionalEffect();
			case Component_Package.HIGHER_LEVEL_EFFECT: return createHigherLevelEffect();
			case Component_Package.FINAL_EFFECT: return createFinalEffect();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Component_Package.FAILURE_SEVERITY:
				return createFailureSeverityFromString(eDataType, initialValue);
			case Component_Package.COMPONENT_TYPE:
				return createComponentTypeFromString(eDataType, initialValue);
			case Component_Package.TOLERANCE_TYPE:
				return createToleranceTypeFromString(eDataType, initialValue);
			case Component_Package.FAILURE_EFFECT_ENUM:
				return createFailureEffectEnumFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Component_Package.FAILURE_SEVERITY:
				return convertFailureSeverityToString(eDataType, instanceValue);
			case Component_Package.COMPONENT_TYPE:
				return convertComponentTypeToString(eDataType, instanceValue);
			case Component_Package.TOLERANCE_TYPE:
				return convertToleranceTypeToString(eDataType, instanceValue);
			case Component_Package.FAILURE_EFFECT_ENUM:
				return convertFailureEffectEnumToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentPackage createComponentPackage() {
		ComponentPackageImpl componentPackage = new ComponentPackageImpl();
		return componentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentPackageInterface createComponentPackageInterface() {
		ComponentPackageInterfaceImpl componentPackageInterface = new ComponentPackageInterfaceImpl();
		return componentPackageInterface;
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
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DirectedRelationship createDirectedRelationship() {
		DirectedRelationshipImpl directedRelationship = new DirectedRelationshipImpl();
		return directedRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UndirectedRelationship createUndirectedRelationship() {
		UndirectedRelationshipImpl undirectedRelationship = new UndirectedRelationshipImpl();
		return undirectedRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fork createFork() {
		ForkImpl fork = new ForkImpl();
		return fork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Switch createSwitch() {
		SwitchImpl switch_ = new SwitchImpl();
		return switch_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Input createInput() {
		InputImpl input = new InputImpl();
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Output createOutput() {
		OutputImpl output = new OutputImpl();
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LPort createLPort() {
		LPortImpl lPort = new LPortImpl();
		return lPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RPort createRPort() {
		RPortImpl rPort = new RPortImpl();
		return rPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Function createFunction() {
		FunctionImpl function = new FunctionImpl();
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reading createReading() {
		ReadingImpl reading = new ReadingImpl();
		return reading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FailureMode createFailureMode() {
		FailureModeImpl failureMode = new FailureModeImpl();
		return failureMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SafetyMechanism createSafetyMechanism() {
		SafetyMechanismImpl safetyMechanism = new SafetyMechanismImpl();
		return safetyMechanism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cost createCost() {
		CostImpl cost = new CostImpl();
		return cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RegionalEffect createRegionalEffect() {
		RegionalEffectImpl regionalEffect = new RegionalEffectImpl();
		return regionalEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HigherLevelEffect createHigherLevelEffect() {
		HigherLevelEffectImpl higherLevelEffect = new HigherLevelEffectImpl();
		return higherLevelEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinalEffect createFinalEffect() {
		FinalEffectImpl finalEffect = new FinalEffectImpl();
		return finalEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureSeverity createFailureSeverityFromString(EDataType eDataType, String initialValue) {
		FailureSeverity result = FailureSeverity.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFailureSeverityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentType createComponentTypeFromString(EDataType eDataType, String initialValue) {
		ComponentType result = ComponentType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComponentTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToleranceType createToleranceTypeFromString(EDataType eDataType, String initialValue) {
		ToleranceType result = ToleranceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToleranceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureEffectEnum createFailureEffectEnumFromString(EDataType eDataType, String initialValue) {
		FailureEffectEnum result = FailureEffectEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFailureEffectEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Component_Package getComponent_Package() {
		return (Component_Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Component_Package getPackage() {
		return Component_Package.eINSTANCE;
	}

} //Component_FactoryImpl
