/**
 */
package fta;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FTA Package Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fta.FTAPackageInterface#getImplements <em>Implements</em>}</li>
 * </ul>
 *
 * @see fta.Fta_Package#getFTAPackageInterface()
 * @model
 * @generated
 */
public interface FTAPackageInterface extends FTAPackage {
	/**
	 * Returns the value of the '<em><b>Implements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements</em>' reference.
	 * @see #setImplements(FTAPackage)
	 * @see fta.Fta_Package#getFTAPackageInterface_Implements()
	 * @model required="true"
	 * @generated
	 */
	FTAPackage getImplements();

	/**
	 * Sets the value of the '{@link fta.FTAPackageInterface#getImplements <em>Implements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implements</em>' reference.
	 * @see #getImplements()
	 * @generated
	 */
	void setImplements(FTAPackage value);

} // FTAPackageInterface
