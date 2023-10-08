/**
 */
package fta.util;

import base.ArtifactElement;
import base.BaseElement;
import base.Element;
import base.ModelElement;

import fta.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fta.Fta_Package
 * @generated
 */
public class Fta_AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Fta_Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fta_AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Fta_Package.eINSTANCE;
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
	protected Fta_Switch<Adapter> modelSwitch =
		new Fta_Switch<Adapter>() {
			@Override
			public Adapter caseFTAElement(FTAElement object) {
				return createFTAElementAdapter();
			}
			@Override
			public Adapter caseFTAPackage(FTAPackage object) {
				return createFTAPackageAdapter();
			}
			@Override
			public Adapter caseFTAPackageInterface(FTAPackageInterface object) {
				return createFTAPackageInterfaceAdapter();
			}
			@Override
			public Adapter caseComponentPackageBinding(ComponentPackageBinding object) {
				return createComponentPackageBindingAdapter();
			}
			@Override
			public Adapter caseGate(Gate object) {
				return createGateAdapter();
			}
			@Override
			public Adapter caseANDGate(ANDGate object) {
				return createANDGateAdapter();
			}
			@Override
			public Adapter caseORGate(ORGate object) {
				return createORGateAdapter();
			}
			@Override
			public Adapter caseInibitGate(InibitGate object) {
				return createInibitGateAdapter();
			}
			@Override
			public Adapter caseSubtree(Subtree object) {
				return createSubtreeAdapter();
			}
			@Override
			public Adapter caseInTriangle(InTriangle object) {
				return createInTriangleAdapter();
			}
			@Override
			public Adapter caseOutTriangle(OutTriangle object) {
				return createOutTriangleAdapter();
			}
			@Override
			public Adapter caseEvent(Event object) {
				return createEventAdapter();
			}
			@Override
			public Adapter caseTopEvent(TopEvent object) {
				return createTopEventAdapter();
			}
			@Override
			public Adapter caseConditioningEvent(ConditioningEvent object) {
				return createConditioningEventAdapter();
			}
			@Override
			public Adapter caseExternalEvent(ExternalEvent object) {
				return createExternalEventAdapter();
			}
			@Override
			public Adapter caseBasicEvent(BasicEvent object) {
				return createBasicEventAdapter();
			}
			@Override
			public Adapter caseUndevelopedEvent(UndevelopedEvent object) {
				return createUndevelopedEventAdapter();
			}
			@Override
			public Adapter caseIntermediateEvent(IntermediateEvent object) {
				return createIntermediateEventAdapter();
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
	 * Creates a new adapter for an object of class '{@link fta.FTAElement <em>FTA Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fta.FTAElement
	 * @generated
	 */
	public Adapter createFTAElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fta.FTAPackage <em>FTA Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fta.FTAPackage
	 * @generated
	 */
	public Adapter createFTAPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fta.FTAPackageInterface <em>FTA Package Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fta.FTAPackageInterface
	 * @generated
	 */
	public Adapter createFTAPackageInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fta.ComponentPackageBinding <em>Component Package Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fta.ComponentPackageBinding
	 * @generated
	 */
	public Adapter createComponentPackageBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fta.Gate <em>Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fta.Gate
	 * @generated
	 */
	public Adapter createGateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fta.ANDGate <em>AND Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fta.ANDGate
	 * @generated
	 */
	public Adapter createANDGateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fta.ORGate <em>OR Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fta.ORGate
	 * @generated
	 */
	public Adapter createORGateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fta.InibitGate <em>Inibit Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fta.InibitGate
	 * @generated
	 */
	public Adapter createInibitGateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fta.Subtree <em>Subtree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fta.Subtree
	 * @generated
	 */
	public Adapter createSubtreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fta.InTriangle <em>In Triangle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fta.InTriangle
	 * @generated
	 */
	public Adapter createInTriangleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fta.OutTriangle <em>Out Triangle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fta.OutTriangle
	 * @generated
	 */
	public Adapter createOutTriangleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fta.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fta.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fta.TopEvent <em>Top Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fta.TopEvent
	 * @generated
	 */
	public Adapter createTopEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fta.ConditioningEvent <em>Conditioning Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fta.ConditioningEvent
	 * @generated
	 */
	public Adapter createConditioningEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fta.ExternalEvent <em>External Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fta.ExternalEvent
	 * @generated
	 */
	public Adapter createExternalEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fta.BasicEvent <em>Basic Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fta.BasicEvent
	 * @generated
	 */
	public Adapter createBasicEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fta.UndevelopedEvent <em>Undeveloped Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fta.UndevelopedEvent
	 * @generated
	 */
	public Adapter createUndevelopedEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fta.IntermediateEvent <em>Intermediate Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fta.IntermediateEvent
	 * @generated
	 */
	public Adapter createIntermediateEventAdapter() {
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

} //Fta_AdapterFactory
