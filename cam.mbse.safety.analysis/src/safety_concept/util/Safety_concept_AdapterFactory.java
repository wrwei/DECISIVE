/**
 */
package safety_concept.util;

import base.ArtifactElement;
import base.BaseElement;
import base.Element;
import base.ModelElement;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import safety_concept.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see safety_concept.Safety_concept_Package
 * @generated
 */
public class Safety_concept_AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Safety_concept_Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Safety_concept_AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Safety_concept_Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Safety_concept_Switch<Adapter> modelSwitch =
		new Safety_concept_Switch<Adapter>() {
			@Override
			public Adapter caseConceptElement(ConceptElement object) {
				return createConceptElementAdapter();
			}
			@Override
			public Adapter caseSafetyConceptPackage(SafetyConceptPackage object) {
				return createSafetyConceptPackageAdapter();
			}
			@Override
			public Adapter caseSafetyConceptPackageBinding(SafetyConceptPackageBinding object) {
				return createSafetyConceptPackageBindingAdapter();
			}
			@Override
			public Adapter caseSafetyConceptPackageInterface(SafetyConceptPackageInterface object) {
				return createSafetyConceptPackageInterfaceAdapter();
			}
			@Override
			public Adapter caseSafety_Concept(Safety_Concept object) {
				return createSafety_ConceptAdapter();
			}
			@Override
			public Adapter caseRequirementRelationship(RequirementRelationship object) {
				return createRequirementRelationshipAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseBaseElement(BaseElement object) {
				return createBaseElementAdapter();
			}
			@Override
			public Adapter caseModelElement(ModelElement object) {
				return createModelElementAdapter();
			}
			@Override
			public Adapter caseArtifactElement(ArtifactElement object) {
				return createArtifactElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link safety_concept.ConceptElement <em>Concept Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see safety_concept.ConceptElement
	 * @generated
	 */
	public Adapter createConceptElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link safety_concept.SafetyConceptPackage <em>Safety Concept Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see safety_concept.SafetyConceptPackage
	 * @generated
	 */
	public Adapter createSafetyConceptPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link safety_concept.SafetyConceptPackageBinding <em>Safety Concept Package Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see safety_concept.SafetyConceptPackageBinding
	 * @generated
	 */
	public Adapter createSafetyConceptPackageBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link safety_concept.SafetyConceptPackageInterface <em>Safety Concept Package Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see safety_concept.SafetyConceptPackageInterface
	 * @generated
	 */
	public Adapter createSafetyConceptPackageInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link safety_concept.Safety_Concept <em>Safety Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see safety_concept.Safety_Concept
	 * @generated
	 */
	public Adapter createSafety_ConceptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link safety_concept.RequirementRelationship <em>Requirement Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see safety_concept.RequirementRelationship
	 * @generated
	 */
	public Adapter createRequirementRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link base.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see base.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link base.BaseElement <em>Base Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see base.BaseElement
	 * @generated
	 */
	public Adapter createBaseElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link base.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see base.ModelElement
	 * @generated
	 */
	public Adapter createModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link base.ArtifactElement <em>Artifact Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see base.ArtifactElement
	 * @generated
	 */
	public Adapter createArtifactElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Safety_concept_AdapterFactory
