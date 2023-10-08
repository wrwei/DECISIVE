/**
 */
package mbsa;

import base.ArtifactElement;

import component.ComponentPackage;

import fta.FTAPackage;

import hazard.HazardPackage;

import org.eclipse.emf.common.util.EList;

import requirement.RequirementPackage;

import safety_concept.SafetyConceptPackage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MBSA Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mbsa.MBSAPackage#getMbsaPackages <em>Mbsa Packages</em>}</li>
 *   <li>{@link mbsa.MBSAPackage#getComponentPackage <em>Component Package</em>}</li>
 *   <li>{@link mbsa.MBSAPackage#getRequirementPackage <em>Requirement Package</em>}</li>
 *   <li>{@link mbsa.MBSAPackage#getHazardPackage <em>Hazard Package</em>}</li>
 *   <li>{@link mbsa.MBSAPackage#getSafetyConceptPackage <em>Safety Concept Package</em>}</li>
 *   <li>{@link mbsa.MBSAPackage#getFtaPackage <em>Fta Package</em>}</li>
 * </ul>
 *
 * @see mbsa.Mbsa_Package#getMBSAPackage()
 * @model
 * @generated
 */
public interface MBSAPackage extends ArtifactElement {
	/**
	 * Returns the value of the '<em><b>Mbsa Packages</b></em>' containment reference list.
	 * The list contents are of type {@link mbsa.MBSAPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mbsa Packages</em>' containment reference list.
	 * @see mbsa.Mbsa_Package#getMBSAPackage_MbsaPackages()
	 * @model containment="true"
	 * @generated
	 */
	EList<MBSAPackage> getMbsaPackages();

	/**
	 * Returns the value of the '<em><b>Component Package</b></em>' containment reference list.
	 * The list contents are of type {@link component.ComponentPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Package</em>' containment reference list.
	 * @see mbsa.Mbsa_Package#getMBSAPackage_ComponentPackage()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComponentPackage> getComponentPackage();

	/**
	 * Returns the value of the '<em><b>Requirement Package</b></em>' containment reference list.
	 * The list contents are of type {@link requirement.RequirementPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement Package</em>' containment reference list.
	 * @see mbsa.Mbsa_Package#getMBSAPackage_RequirementPackage()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequirementPackage> getRequirementPackage();

	/**
	 * Returns the value of the '<em><b>Hazard Package</b></em>' containment reference list.
	 * The list contents are of type {@link hazard.HazardPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hazard Package</em>' containment reference list.
	 * @see mbsa.Mbsa_Package#getMBSAPackage_HazardPackage()
	 * @model containment="true"
	 * @generated
	 */
	EList<HazardPackage> getHazardPackage();

	/**
	 * Returns the value of the '<em><b>Safety Concept Package</b></em>' containment reference list.
	 * The list contents are of type {@link safety_concept.SafetyConceptPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Safety Concept Package</em>' containment reference list.
	 * @see mbsa.Mbsa_Package#getMBSAPackage_SafetyConceptPackage()
	 * @model containment="true"
	 * @generated
	 */
	EList<SafetyConceptPackage> getSafetyConceptPackage();

	/**
	 * Returns the value of the '<em><b>Fta Package</b></em>' containment reference list.
	 * The list contents are of type {@link fta.FTAPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fta Package</em>' containment reference list.
	 * @see mbsa.Mbsa_Package#getMBSAPackage_FtaPackage()
	 * @model containment="true"
	 * @generated
	 */
	EList<FTAPackage> getFtaPackage();

} // MBSAPackage
