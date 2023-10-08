/**
 */
package fta.util;

import base.ArtifactElement;
import base.BaseElement;
import base.Element;
import base.ModelElement;

import fta.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * @see fta.Fta_Package
 * @generated
 */
public class Fta_Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Fta_Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fta_Switch() {
		if (modelPackage == null) {
			modelPackage = Fta_Package.eINSTANCE;
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
			case Fta_Package.FTA_ELEMENT: {
				FTAElement ftaElement = (FTAElement)theEObject;
				T result = caseFTAElement(ftaElement);
				if (result == null) result = caseArtifactElement(ftaElement);
				if (result == null) result = caseModelElement(ftaElement);
				if (result == null) result = caseBaseElement(ftaElement);
				if (result == null) result = caseElement(ftaElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fta_Package.FTA_PACKAGE: {
				FTAPackage ftaPackage = (FTAPackage)theEObject;
				T result = caseFTAPackage(ftaPackage);
				if (result == null) result = caseFTAElement(ftaPackage);
				if (result == null) result = caseArtifactElement(ftaPackage);
				if (result == null) result = caseModelElement(ftaPackage);
				if (result == null) result = caseBaseElement(ftaPackage);
				if (result == null) result = caseElement(ftaPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fta_Package.FTA_PACKAGE_INTERFACE: {
				FTAPackageInterface ftaPackageInterface = (FTAPackageInterface)theEObject;
				T result = caseFTAPackageInterface(ftaPackageInterface);
				if (result == null) result = caseFTAPackage(ftaPackageInterface);
				if (result == null) result = caseFTAElement(ftaPackageInterface);
				if (result == null) result = caseArtifactElement(ftaPackageInterface);
				if (result == null) result = caseModelElement(ftaPackageInterface);
				if (result == null) result = caseBaseElement(ftaPackageInterface);
				if (result == null) result = caseElement(ftaPackageInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fta_Package.COMPONENT_PACKAGE_BINDING: {
				ComponentPackageBinding componentPackageBinding = (ComponentPackageBinding)theEObject;
				T result = caseComponentPackageBinding(componentPackageBinding);
				if (result == null) result = caseFTAPackage(componentPackageBinding);
				if (result == null) result = caseFTAElement(componentPackageBinding);
				if (result == null) result = caseArtifactElement(componentPackageBinding);
				if (result == null) result = caseModelElement(componentPackageBinding);
				if (result == null) result = caseBaseElement(componentPackageBinding);
				if (result == null) result = caseElement(componentPackageBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fta_Package.GATE: {
				Gate gate = (Gate)theEObject;
				T result = caseGate(gate);
				if (result == null) result = caseFTAElement(gate);
				if (result == null) result = caseArtifactElement(gate);
				if (result == null) result = caseModelElement(gate);
				if (result == null) result = caseBaseElement(gate);
				if (result == null) result = caseElement(gate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fta_Package.AND_GATE: {
				ANDGate andGate = (ANDGate)theEObject;
				T result = caseANDGate(andGate);
				if (result == null) result = caseGate(andGate);
				if (result == null) result = caseFTAElement(andGate);
				if (result == null) result = caseArtifactElement(andGate);
				if (result == null) result = caseModelElement(andGate);
				if (result == null) result = caseBaseElement(andGate);
				if (result == null) result = caseElement(andGate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fta_Package.OR_GATE: {
				ORGate orGate = (ORGate)theEObject;
				T result = caseORGate(orGate);
				if (result == null) result = caseGate(orGate);
				if (result == null) result = caseFTAElement(orGate);
				if (result == null) result = caseArtifactElement(orGate);
				if (result == null) result = caseModelElement(orGate);
				if (result == null) result = caseBaseElement(orGate);
				if (result == null) result = caseElement(orGate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fta_Package.INIBIT_GATE: {
				InibitGate inibitGate = (InibitGate)theEObject;
				T result = caseInibitGate(inibitGate);
				if (result == null) result = caseGate(inibitGate);
				if (result == null) result = caseFTAElement(inibitGate);
				if (result == null) result = caseArtifactElement(inibitGate);
				if (result == null) result = caseModelElement(inibitGate);
				if (result == null) result = caseBaseElement(inibitGate);
				if (result == null) result = caseElement(inibitGate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fta_Package.SUBTREE: {
				Subtree subtree = (Subtree)theEObject;
				T result = caseSubtree(subtree);
				if (result == null) result = caseFTAElement(subtree);
				if (result == null) result = caseArtifactElement(subtree);
				if (result == null) result = caseModelElement(subtree);
				if (result == null) result = caseBaseElement(subtree);
				if (result == null) result = caseElement(subtree);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fta_Package.IN_TRIANGLE: {
				InTriangle inTriangle = (InTriangle)theEObject;
				T result = caseInTriangle(inTriangle);
				if (result == null) result = caseSubtree(inTriangle);
				if (result == null) result = caseFTAElement(inTriangle);
				if (result == null) result = caseArtifactElement(inTriangle);
				if (result == null) result = caseModelElement(inTriangle);
				if (result == null) result = caseBaseElement(inTriangle);
				if (result == null) result = caseElement(inTriangle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fta_Package.OUT_TRIANGLE: {
				OutTriangle outTriangle = (OutTriangle)theEObject;
				T result = caseOutTriangle(outTriangle);
				if (result == null) result = caseSubtree(outTriangle);
				if (result == null) result = caseFTAElement(outTriangle);
				if (result == null) result = caseArtifactElement(outTriangle);
				if (result == null) result = caseModelElement(outTriangle);
				if (result == null) result = caseBaseElement(outTriangle);
				if (result == null) result = caseElement(outTriangle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fta_Package.EVENT: {
				Event event = (Event)theEObject;
				T result = caseEvent(event);
				if (result == null) result = caseFTAElement(event);
				if (result == null) result = caseArtifactElement(event);
				if (result == null) result = caseModelElement(event);
				if (result == null) result = caseBaseElement(event);
				if (result == null) result = caseElement(event);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fta_Package.TOP_EVENT: {
				TopEvent topEvent = (TopEvent)theEObject;
				T result = caseTopEvent(topEvent);
				if (result == null) result = caseEvent(topEvent);
				if (result == null) result = caseFTAElement(topEvent);
				if (result == null) result = caseArtifactElement(topEvent);
				if (result == null) result = caseModelElement(topEvent);
				if (result == null) result = caseBaseElement(topEvent);
				if (result == null) result = caseElement(topEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fta_Package.CONDITIONING_EVENT: {
				ConditioningEvent conditioningEvent = (ConditioningEvent)theEObject;
				T result = caseConditioningEvent(conditioningEvent);
				if (result == null) result = caseEvent(conditioningEvent);
				if (result == null) result = caseFTAElement(conditioningEvent);
				if (result == null) result = caseArtifactElement(conditioningEvent);
				if (result == null) result = caseModelElement(conditioningEvent);
				if (result == null) result = caseBaseElement(conditioningEvent);
				if (result == null) result = caseElement(conditioningEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fta_Package.EXTERNAL_EVENT: {
				ExternalEvent externalEvent = (ExternalEvent)theEObject;
				T result = caseExternalEvent(externalEvent);
				if (result == null) result = caseEvent(externalEvent);
				if (result == null) result = caseFTAElement(externalEvent);
				if (result == null) result = caseArtifactElement(externalEvent);
				if (result == null) result = caseModelElement(externalEvent);
				if (result == null) result = caseBaseElement(externalEvent);
				if (result == null) result = caseElement(externalEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fta_Package.BASIC_EVENT: {
				BasicEvent basicEvent = (BasicEvent)theEObject;
				T result = caseBasicEvent(basicEvent);
				if (result == null) result = caseEvent(basicEvent);
				if (result == null) result = caseFTAElement(basicEvent);
				if (result == null) result = caseArtifactElement(basicEvent);
				if (result == null) result = caseModelElement(basicEvent);
				if (result == null) result = caseBaseElement(basicEvent);
				if (result == null) result = caseElement(basicEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fta_Package.UNDEVELOPED_EVENT: {
				UndevelopedEvent undevelopedEvent = (UndevelopedEvent)theEObject;
				T result = caseUndevelopedEvent(undevelopedEvent);
				if (result == null) result = caseEvent(undevelopedEvent);
				if (result == null) result = caseFTAElement(undevelopedEvent);
				if (result == null) result = caseArtifactElement(undevelopedEvent);
				if (result == null) result = caseModelElement(undevelopedEvent);
				if (result == null) result = caseBaseElement(undevelopedEvent);
				if (result == null) result = caseElement(undevelopedEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Fta_Package.INTERMEDIATE_EVENT: {
				IntermediateEvent intermediateEvent = (IntermediateEvent)theEObject;
				T result = caseIntermediateEvent(intermediateEvent);
				if (result == null) result = caseEvent(intermediateEvent);
				if (result == null) result = caseFTAElement(intermediateEvent);
				if (result == null) result = caseArtifactElement(intermediateEvent);
				if (result == null) result = caseModelElement(intermediateEvent);
				if (result == null) result = caseBaseElement(intermediateEvent);
				if (result == null) result = caseElement(intermediateEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FTA Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FTA Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFTAElement(FTAElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FTA Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FTA Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFTAPackage(FTAPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FTA Package Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FTA Package Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFTAPackageInterface(FTAPackageInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Package Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Package Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentPackageBinding(ComponentPackageBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGate(Gate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AND Gate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AND Gate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseANDGate(ANDGate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OR Gate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OR Gate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseORGate(ORGate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inibit Gate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inibit Gate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInibitGate(InibitGate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subtree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subtree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubtree(Subtree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>In Triangle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>In Triangle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInTriangle(InTriangle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Out Triangle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Out Triangle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutTriangle(OutTriangle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Top Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Top Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTopEvent(TopEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditioning Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditioning Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditioningEvent(ConditioningEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalEvent(ExternalEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicEvent(BasicEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Undeveloped Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Undeveloped Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUndevelopedEvent(UndevelopedEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intermediate Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intermediate Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntermediateEvent(IntermediateEvent object) {
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

} //Fta_Switch
