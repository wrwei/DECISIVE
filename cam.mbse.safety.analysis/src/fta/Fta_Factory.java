/**
 */
package fta;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fta.Fta_Package
 * @generated
 */
public interface Fta_Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Fta_Factory eINSTANCE = fta.impl.Fta_FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>FTA Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FTA Package</em>'.
	 * @generated
	 */
	FTAPackage createFTAPackage();

	/**
	 * Returns a new object of class '<em>FTA Package Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FTA Package Interface</em>'.
	 * @generated
	 */
	FTAPackageInterface createFTAPackageInterface();

	/**
	 * Returns a new object of class '<em>Component Package Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Package Binding</em>'.
	 * @generated
	 */
	ComponentPackageBinding createComponentPackageBinding();

	/**
	 * Returns a new object of class '<em>Gate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gate</em>'.
	 * @generated
	 */
	Gate createGate();

	/**
	 * Returns a new object of class '<em>AND Gate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AND Gate</em>'.
	 * @generated
	 */
	ANDGate createANDGate();

	/**
	 * Returns a new object of class '<em>OR Gate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OR Gate</em>'.
	 * @generated
	 */
	ORGate createORGate();

	/**
	 * Returns a new object of class '<em>Inibit Gate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inibit Gate</em>'.
	 * @generated
	 */
	InibitGate createInibitGate();

	/**
	 * Returns a new object of class '<em>Subtree</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subtree</em>'.
	 * @generated
	 */
	Subtree createSubtree();

	/**
	 * Returns a new object of class '<em>In Triangle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>In Triangle</em>'.
	 * @generated
	 */
	InTriangle createInTriangle();

	/**
	 * Returns a new object of class '<em>Out Triangle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Out Triangle</em>'.
	 * @generated
	 */
	OutTriangle createOutTriangle();

	/**
	 * Returns a new object of class '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event</em>'.
	 * @generated
	 */
	Event createEvent();

	/**
	 * Returns a new object of class '<em>Top Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Top Event</em>'.
	 * @generated
	 */
	TopEvent createTopEvent();

	/**
	 * Returns a new object of class '<em>Conditioning Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conditioning Event</em>'.
	 * @generated
	 */
	ConditioningEvent createConditioningEvent();

	/**
	 * Returns a new object of class '<em>External Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Event</em>'.
	 * @generated
	 */
	ExternalEvent createExternalEvent();

	/**
	 * Returns a new object of class '<em>Basic Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basic Event</em>'.
	 * @generated
	 */
	BasicEvent createBasicEvent();

	/**
	 * Returns a new object of class '<em>Undeveloped Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Undeveloped Event</em>'.
	 * @generated
	 */
	UndevelopedEvent createUndevelopedEvent();

	/**
	 * Returns a new object of class '<em>Intermediate Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intermediate Event</em>'.
	 * @generated
	 */
	IntermediateEvent createIntermediateEvent();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Fta_Package getFta_Package();

} //Fta_Factory
