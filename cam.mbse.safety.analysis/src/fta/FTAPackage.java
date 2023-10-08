/**
 */
package fta;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FTA Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fta.FTAPackage#getElements <em>Elements</em>}</li>
 *   <li>{@link fta.FTAPackage#getInterface <em>Interface</em>}</li>
 * </ul>
 *
 * @see fta.Fta_Package#getFTAPackage()
 * @model
 * @generated
 */
public interface FTAPackage extends FTAElement {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link fta.FTAElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see fta.Fta_Package#getFTAPackage_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<FTAElement> getElements();

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' reference list.
	 * The list contents are of type {@link fta.FTAPackageInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' reference list.
	 * @see fta.Fta_Package#getFTAPackage_Interface()
	 * @model
	 * @generated
	 */
	EList<FTAPackageInterface> getInterface();

} // FTAPackage
