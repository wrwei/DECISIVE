/**
 */
package safety_concept.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import requirement.Requirement;

import safety_concept.ABL;
import safety_concept.ASIL;
import safety_concept.SIL;
import safety_concept.Safety_Concept;
import safety_concept.Safety_concept_Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Safety Concept</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link safety_concept.impl.Safety_ConceptImpl#getAbstract_level <em>Abstract level</em>}</li>
 *   <li>{@link safety_concept.impl.Safety_ConceptImpl#getAsil <em>Asil</em>}</li>
 *   <li>{@link safety_concept.impl.Safety_ConceptImpl#getSil <em>Sil</em>}</li>
 *   <li>{@link safety_concept.impl.Safety_ConceptImpl#getIdentity <em>Identity</em>}</li>
 *   <li>{@link safety_concept.impl.Safety_ConceptImpl#getDesc <em>Desc</em>}</li>
 *   <li>{@link safety_concept.impl.Safety_ConceptImpl#getScript <em>Script</em>}</li>
 *   <li>{@link safety_concept.impl.Safety_ConceptImpl#isSatisfied <em>Satisfied</em>}</li>
 *   <li>{@link safety_concept.impl.Safety_ConceptImpl#getRequirement <em>Requirement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Safety_ConceptImpl extends ConceptElementImpl implements Safety_Concept {
	/**
	 * The default value of the '{@link #getAbstract_level() <em>Abstract level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstract_level()
	 * @generated
	 * @ordered
	 */
	protected static final ABL ABSTRACT_LEVEL_EDEFAULT = ABL.FUNCTIONAL;

	/**
	 * The cached value of the '{@link #getAbstract_level() <em>Abstract level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstract_level()
	 * @generated
	 * @ordered
	 */
	protected ABL abstract_level = ABSTRACT_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getAsil() <em>Asil</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsil()
	 * @generated
	 * @ordered
	 */
	protected static final ASIL ASIL_EDEFAULT = ASIL.ASIL_A;

	/**
	 * The cached value of the '{@link #getAsil() <em>Asil</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsil()
	 * @generated
	 * @ordered
	 */
	protected ASIL asil = ASIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSil() <em>Sil</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSil()
	 * @generated
	 * @ordered
	 */
	protected static final SIL SIL_EDEFAULT = SIL.SIL_1;

	/**
	 * The cached value of the '{@link #getSil() <em>Sil</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSil()
	 * @generated
	 * @ordered
	 */
	protected SIL sil = SIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdentity() <em>Identity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentity()
	 * @generated
	 * @ordered
	 */
	protected static final int IDENTITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIdentity() <em>Identity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentity()
	 * @generated
	 * @ordered
	 */
	protected int identity = IDENTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDesc() <em>Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesc()
	 * @generated
	 * @ordered
	 */
	protected static final String DESC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDesc() <em>Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesc()
	 * @generated
	 * @ordered
	 */
	protected String desc = DESC_EDEFAULT;

	/**
	 * The default value of the '{@link #getScript() <em>Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScript()
	 * @generated
	 * @ordered
	 */
	protected static final String SCRIPT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScript() <em>Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScript()
	 * @generated
	 * @ordered
	 */
	protected String script = SCRIPT_EDEFAULT;

	/**
	 * The default value of the '{@link #isSatisfied() <em>Satisfied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSatisfied()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SATISFIED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSatisfied() <em>Satisfied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSatisfied()
	 * @generated
	 * @ordered
	 */
	protected boolean satisfied = SATISFIED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRequirement() <em>Requirement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirement()
	 * @generated
	 * @ordered
	 */
	protected Requirement requirement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Safety_ConceptImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Safety_concept_Package.Literals.SAFETY_CONCEPT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ABL getAbstract_level() {
		return abstract_level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbstract_level(ABL newAbstract_level) {
		ABL oldAbstract_level = abstract_level;
		abstract_level = newAbstract_level == null ? ABSTRACT_LEVEL_EDEFAULT : newAbstract_level;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Safety_concept_Package.SAFETY_CONCEPT__ABSTRACT_LEVEL, oldAbstract_level, abstract_level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ASIL getAsil() {
		return asil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAsil(ASIL newAsil) {
		ASIL oldAsil = asil;
		asil = newAsil == null ? ASIL_EDEFAULT : newAsil;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Safety_concept_Package.SAFETY_CONCEPT__ASIL, oldAsil, asil));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SIL getSil() {
		return sil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSil(SIL newSil) {
		SIL oldSil = sil;
		sil = newSil == null ? SIL_EDEFAULT : newSil;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Safety_concept_Package.SAFETY_CONCEPT__SIL, oldSil, sil));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getIdentity() {
		return identity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdentity(int newIdentity) {
		int oldIdentity = identity;
		identity = newIdentity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Safety_concept_Package.SAFETY_CONCEPT__IDENTITY, oldIdentity, identity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDesc() {
		return desc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDesc(String newDesc) {
		String oldDesc = desc;
		desc = newDesc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Safety_concept_Package.SAFETY_CONCEPT__DESC, oldDesc, desc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getScript() {
		return script;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScript(String newScript) {
		String oldScript = script;
		script = newScript;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Safety_concept_Package.SAFETY_CONCEPT__SCRIPT, oldScript, script));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSatisfied() {
		return satisfied;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSatisfied(boolean newSatisfied) {
		boolean oldSatisfied = satisfied;
		satisfied = newSatisfied;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Safety_concept_Package.SAFETY_CONCEPT__SATISFIED, oldSatisfied, satisfied));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Requirement getRequirement() {
		if (requirement != null && requirement.eIsProxy()) {
			InternalEObject oldRequirement = (InternalEObject)requirement;
			requirement = (Requirement)eResolveProxy(oldRequirement);
			if (requirement != oldRequirement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Safety_concept_Package.SAFETY_CONCEPT__REQUIREMENT, oldRequirement, requirement));
			}
		}
		return requirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement basicGetRequirement() {
		return requirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequirement(Requirement newRequirement) {
		Requirement oldRequirement = requirement;
		requirement = newRequirement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Safety_concept_Package.SAFETY_CONCEPT__REQUIREMENT, oldRequirement, requirement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Safety_concept_Package.SAFETY_CONCEPT__ABSTRACT_LEVEL:
				return getAbstract_level();
			case Safety_concept_Package.SAFETY_CONCEPT__ASIL:
				return getAsil();
			case Safety_concept_Package.SAFETY_CONCEPT__SIL:
				return getSil();
			case Safety_concept_Package.SAFETY_CONCEPT__IDENTITY:
				return getIdentity();
			case Safety_concept_Package.SAFETY_CONCEPT__DESC:
				return getDesc();
			case Safety_concept_Package.SAFETY_CONCEPT__SCRIPT:
				return getScript();
			case Safety_concept_Package.SAFETY_CONCEPT__SATISFIED:
				return isSatisfied();
			case Safety_concept_Package.SAFETY_CONCEPT__REQUIREMENT:
				if (resolve) return getRequirement();
				return basicGetRequirement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Safety_concept_Package.SAFETY_CONCEPT__ABSTRACT_LEVEL:
				setAbstract_level((ABL)newValue);
				return;
			case Safety_concept_Package.SAFETY_CONCEPT__ASIL:
				setAsil((ASIL)newValue);
				return;
			case Safety_concept_Package.SAFETY_CONCEPT__SIL:
				setSil((SIL)newValue);
				return;
			case Safety_concept_Package.SAFETY_CONCEPT__IDENTITY:
				setIdentity((Integer)newValue);
				return;
			case Safety_concept_Package.SAFETY_CONCEPT__DESC:
				setDesc((String)newValue);
				return;
			case Safety_concept_Package.SAFETY_CONCEPT__SCRIPT:
				setScript((String)newValue);
				return;
			case Safety_concept_Package.SAFETY_CONCEPT__SATISFIED:
				setSatisfied((Boolean)newValue);
				return;
			case Safety_concept_Package.SAFETY_CONCEPT__REQUIREMENT:
				setRequirement((Requirement)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Safety_concept_Package.SAFETY_CONCEPT__ABSTRACT_LEVEL:
				setAbstract_level(ABSTRACT_LEVEL_EDEFAULT);
				return;
			case Safety_concept_Package.SAFETY_CONCEPT__ASIL:
				setAsil(ASIL_EDEFAULT);
				return;
			case Safety_concept_Package.SAFETY_CONCEPT__SIL:
				setSil(SIL_EDEFAULT);
				return;
			case Safety_concept_Package.SAFETY_CONCEPT__IDENTITY:
				setIdentity(IDENTITY_EDEFAULT);
				return;
			case Safety_concept_Package.SAFETY_CONCEPT__DESC:
				setDesc(DESC_EDEFAULT);
				return;
			case Safety_concept_Package.SAFETY_CONCEPT__SCRIPT:
				setScript(SCRIPT_EDEFAULT);
				return;
			case Safety_concept_Package.SAFETY_CONCEPT__SATISFIED:
				setSatisfied(SATISFIED_EDEFAULT);
				return;
			case Safety_concept_Package.SAFETY_CONCEPT__REQUIREMENT:
				setRequirement((Requirement)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Safety_concept_Package.SAFETY_CONCEPT__ABSTRACT_LEVEL:
				return abstract_level != ABSTRACT_LEVEL_EDEFAULT;
			case Safety_concept_Package.SAFETY_CONCEPT__ASIL:
				return asil != ASIL_EDEFAULT;
			case Safety_concept_Package.SAFETY_CONCEPT__SIL:
				return sil != SIL_EDEFAULT;
			case Safety_concept_Package.SAFETY_CONCEPT__IDENTITY:
				return identity != IDENTITY_EDEFAULT;
			case Safety_concept_Package.SAFETY_CONCEPT__DESC:
				return DESC_EDEFAULT == null ? desc != null : !DESC_EDEFAULT.equals(desc);
			case Safety_concept_Package.SAFETY_CONCEPT__SCRIPT:
				return SCRIPT_EDEFAULT == null ? script != null : !SCRIPT_EDEFAULT.equals(script);
			case Safety_concept_Package.SAFETY_CONCEPT__SATISFIED:
				return satisfied != SATISFIED_EDEFAULT;
			case Safety_concept_Package.SAFETY_CONCEPT__REQUIREMENT:
				return requirement != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (abstract_level: ");
		result.append(abstract_level);
		result.append(", asil: ");
		result.append(asil);
		result.append(", sil: ");
		result.append(sil);
		result.append(", identity: ");
		result.append(identity);
		result.append(", desc: ");
		result.append(desc);
		result.append(", script: ");
		result.append(script);
		result.append(", satisfied: ");
		result.append(satisfied);
		result.append(')');
		return result.toString();
	}

} //Safety_ConceptImpl
