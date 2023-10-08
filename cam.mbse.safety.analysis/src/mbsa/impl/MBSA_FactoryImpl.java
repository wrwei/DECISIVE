/**
 */
package mbsa.impl;

import mbsa.*;

import org.eclipse.emf.ecore.EClass;
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
public class Mbsa_FactoryImpl extends EFactoryImpl implements Mbsa_Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Mbsa_Factory init() {
		try {
			Mbsa_Factory theMbsa_Factory = (Mbsa_Factory)EPackage.Registry.INSTANCE.getEFactory(Mbsa_Package.eNS_URI);
			if (theMbsa_Factory != null) {
				return theMbsa_Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Mbsa_FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mbsa_FactoryImpl() {
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
			case Mbsa_Package.MBSA_PACKAGE: return createMBSAPackage();
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
	public MBSAPackage createMBSAPackage() {
		MBSAPackageImpl mbsaPackage = new MBSAPackageImpl();
		return mbsaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Mbsa_Package getMbsa_Package() {
		return (Mbsa_Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Mbsa_Package getPackage() {
		return Mbsa_Package.eINSTANCE;
	}

} //Mbsa_FactoryImpl
