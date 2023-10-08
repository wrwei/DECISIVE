/**
 */
package safety_concept.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import safety_concept.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Safety_concept_FactoryImpl extends EFactoryImpl implements Safety_concept_Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Safety_concept_Factory init() {
		try {
			Safety_concept_Factory theSafety_concept_Factory = (Safety_concept_Factory)EPackage.Registry.INSTANCE.getEFactory(Safety_concept_Package.eNS_URI);
			if (theSafety_concept_Factory != null) {
				return theSafety_concept_Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Safety_concept_FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Safety_concept_FactoryImpl() {
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
			case Safety_concept_Package.SAFETY_CONCEPT_PACKAGE: return createSafetyConceptPackage();
			case Safety_concept_Package.SAFETY_CONCEPT_PACKAGE_BINDING: return createSafetyConceptPackageBinding();
			case Safety_concept_Package.SAFETY_CONCEPT_PACKAGE_INTERFACE: return createSafetyConceptPackageInterface();
			case Safety_concept_Package.SAFETY_CONCEPT: return createSafety_Concept();
			case Safety_concept_Package.REQUIREMENT_RELATIONSHIP: return createRequirementRelationship();
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
			case Safety_concept_Package.ASIL:
				return createASILFromString(eDataType, initialValue);
			case Safety_concept_Package.SIL:
				return createSILFromString(eDataType, initialValue);
			case Safety_concept_Package.ABL:
				return createABLFromString(eDataType, initialValue);
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
			case Safety_concept_Package.ASIL:
				return convertASILToString(eDataType, instanceValue);
			case Safety_concept_Package.SIL:
				return convertSILToString(eDataType, instanceValue);
			case Safety_concept_Package.ABL:
				return convertABLToString(eDataType, instanceValue);
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
	public SafetyConceptPackage createSafetyConceptPackage() {
		SafetyConceptPackageImpl safetyConceptPackage = new SafetyConceptPackageImpl();
		return safetyConceptPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SafetyConceptPackageBinding createSafetyConceptPackageBinding() {
		SafetyConceptPackageBindingImpl safetyConceptPackageBinding = new SafetyConceptPackageBindingImpl();
		return safetyConceptPackageBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SafetyConceptPackageInterface createSafetyConceptPackageInterface() {
		SafetyConceptPackageInterfaceImpl safetyConceptPackageInterface = new SafetyConceptPackageInterfaceImpl();
		return safetyConceptPackageInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Safety_Concept createSafety_Concept() {
		Safety_ConceptImpl safety_Concept = new Safety_ConceptImpl();
		return safety_Concept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementRelationship createRequirementRelationship() {
		RequirementRelationshipImpl requirementRelationship = new RequirementRelationshipImpl();
		return requirementRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASIL createASILFromString(EDataType eDataType, String initialValue) {
		ASIL result = ASIL.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertASILToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SIL createSILFromString(EDataType eDataType, String initialValue) {
		SIL result = SIL.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSILToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ABL createABLFromString(EDataType eDataType, String initialValue) {
		ABL result = ABL.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertABLToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Safety_concept_Package getSafety_concept_Package() {
		return (Safety_concept_Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Safety_concept_Package getPackage() {
		return Safety_concept_Package.eINSTANCE;
	}

} //Safety_concept_FactoryImpl
