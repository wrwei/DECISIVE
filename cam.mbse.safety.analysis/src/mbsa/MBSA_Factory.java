/**
 */
package mbsa;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see mbsa.Mbsa_Package
 * @generated
 */
public interface Mbsa_Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Mbsa_Factory eINSTANCE = mbsa.impl.Mbsa_FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>MBSA Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MBSA Package</em>'.
	 * @generated
	 */
	MBSAPackage createMBSAPackage();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Mbsa_Package getMbsa_Package();

} //Mbsa_Factory
