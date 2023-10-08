/**
 */
package fta;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Package Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fta.ComponentPackageBinding#getParticipantPackage <em>Participant Package</em>}</li>
 * </ul>
 *
 * @see fta.Fta_Package#getComponentPackageBinding()
 * @model
 * @generated
 */
public interface ComponentPackageBinding extends FTAPackage {
	/**
	 * Returns the value of the '<em><b>Participant Package</b></em>' reference list.
	 * The list contents are of type {@link fta.FTAPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant Package</em>' reference list.
	 * @see fta.Fta_Package#getComponentPackageBinding_ParticipantPackage()
	 * @model lower="2"
	 * @generated
	 */
	EList<FTAPackage> getParticipantPackage();

} // ComponentPackageBinding
