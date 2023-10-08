/**
 */
package safety_concept.util;

import base.ArtifactElement;
import base.BaseElement;
import base.Element;
import base.ModelElement;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import safety_concept.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see safety_concept.Safety_concept_Package
 * @generated
 */
public class Safety_concept_Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Safety_concept_Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Safety_concept_Switch() {
		if (modelPackage == null) {
			modelPackage = Safety_concept_Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Safety_concept_Package.CONCEPT_ELEMENT: {
				ConceptElement conceptElement = (ConceptElement)theEObject;
				T result = caseConceptElement(conceptElement);
				if (result == null) result = caseArtifactElement(conceptElement);
				if (result == null) result = caseModelElement(conceptElement);
				if (result == null) result = caseBaseElement(conceptElement);
				if (result == null) result = caseElement(conceptElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Safety_concept_Package.SAFETY_CONCEPT_PACKAGE: {
				SafetyConceptPackage safetyConceptPackage = (SafetyConceptPackage)theEObject;
				T result = caseSafetyConceptPackage(safetyConceptPackage);
				if (result == null) result = caseConceptElement(safetyConceptPackage);
				if (result == null) result = caseArtifactElement(safetyConceptPackage);
				if (result == null) result = caseModelElement(safetyConceptPackage);
				if (result == null) result = caseBaseElement(safetyConceptPackage);
				if (result == null) result = caseElement(safetyConceptPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Safety_concept_Package.SAFETY_CONCEPT_PACKAGE_BINDING: {
				SafetyConceptPackageBinding safetyConceptPackageBinding = (SafetyConceptPackageBinding)theEObject;
				T result = caseSafetyConceptPackageBinding(safetyConceptPackageBinding);
				if (result == null) result = caseSafetyConceptPackage(safetyConceptPackageBinding);
				if (result == null) result = caseConceptElement(safetyConceptPackageBinding);
				if (result == null) result = caseArtifactElement(safetyConceptPackageBinding);
				if (result == null) result = caseModelElement(safetyConceptPackageBinding);
				if (result == null) result = caseBaseElement(safetyConceptPackageBinding);
				if (result == null) result = caseElement(safetyConceptPackageBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Safety_concept_Package.SAFETY_CONCEPT_PACKAGE_INTERFACE: {
				SafetyConceptPackageInterface safetyConceptPackageInterface = (SafetyConceptPackageInterface)theEObject;
				T result = caseSafetyConceptPackageInterface(safetyConceptPackageInterface);
				if (result == null) result = caseSafetyConceptPackage(safetyConceptPackageInterface);
				if (result == null) result = caseConceptElement(safetyConceptPackageInterface);
				if (result == null) result = caseArtifactElement(safetyConceptPackageInterface);
				if (result == null) result = caseModelElement(safetyConceptPackageInterface);
				if (result == null) result = caseBaseElement(safetyConceptPackageInterface);
				if (result == null) result = caseElement(safetyConceptPackageInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Safety_concept_Package.SAFETY_CONCEPT: {
				Safety_Concept safety_Concept = (Safety_Concept)theEObject;
				T result = caseSafety_Concept(safety_Concept);
				if (result == null) result = caseConceptElement(safety_Concept);
				if (result == null) result = caseArtifactElement(safety_Concept);
				if (result == null) result = caseModelElement(safety_Concept);
				if (result == null) result = caseBaseElement(safety_Concept);
				if (result == null) result = caseElement(safety_Concept);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Safety_concept_Package.REQUIREMENT_RELATIONSHIP: {
				RequirementRelationship requirementRelationship = (RequirementRelationship)theEObject;
				T result = caseRequirementRelationship(requirementRelationship);
				if (result == null) result = caseConceptElement(requirementRelationship);
				if (result == null) result = caseArtifactElement(requirementRelationship);
				if (result == null) result = caseModelElement(requirementRelationship);
				if (result == null) result = caseBaseElement(requirementRelationship);
				if (result == null) result = caseElement(requirementRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptElement(ConceptElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Safety Concept Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Safety Concept Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSafetyConceptPackage(SafetyConceptPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Safety Concept Package Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Safety Concept Package Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSafetyConceptPackageBinding(SafetyConceptPackageBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Safety Concept Package Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Safety Concept Package Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSafetyConceptPackageInterface(SafetyConceptPackageInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Safety Concept</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Safety Concept</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSafety_Concept(Safety_Concept object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirement Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirementRelationship(RequirementRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaseElement(BaseElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtifactElement(ArtifactElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Safety_concept_Switch
