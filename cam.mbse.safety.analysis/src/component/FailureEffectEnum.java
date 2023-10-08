/**
 */
package component;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Failure Effect Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see component.Component_Package#getFailureEffectEnum()
 * @model
 * @generated
 */
public enum FailureEffectEnum implements Enumerator {
	/**
	 * The '<em><b>Loss Of Function</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOSS_OF_FUNCTION_VALUE
	 * @generated
	 * @ordered
	 */
	LOSS_OF_FUNCTION(1, "LossOfFunction", "LossOfFunction"),

	/**
	 * The '<em><b>Uninteded Delivery Of Function</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNINTEDED_DELIVERY_OF_FUNCTION_VALUE
	 * @generated
	 * @ordered
	 */
	UNINTEDED_DELIVERY_OF_FUNCTION(2, "UnintededDeliveryOfFunction", "UnintededDeliveryOfFunction"),

	/**
	 * The '<em><b>Early Deployment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EARLY_DEPLOYMENT_VALUE
	 * @generated
	 * @ordered
	 */
	EARLY_DEPLOYMENT(3, "EarlyDeployment", "EarlyDeployment"),

	/**
	 * The '<em><b>Late Deployment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LATE_DEPLOYMENT_VALUE
	 * @generated
	 * @ordered
	 */
	LATE_DEPLOYMENT(4, "LateDeployment", "LateDeployment"),

	/**
	 * The '<em><b>Provision Value High</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROVISION_VALUE_HIGH_VALUE
	 * @generated
	 * @ordered
	 */
	PROVISION_VALUE_HIGH(5, "ProvisionValueHigh", "ProvisionValueHigh"),

	/**
	 * The '<em><b>Provision Value Low</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROVISION_VALUE_LOW_VALUE
	 * @generated
	 * @ordered
	 */
	PROVISION_VALUE_LOW(4, "ProvisionValueLow", "ProvisionValueLow");

	/**
	 * The '<em><b>Loss Of Function</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOSS_OF_FUNCTION
	 * @model name="LossOfFunction"
	 * @generated
	 * @ordered
	 */
	public static final int LOSS_OF_FUNCTION_VALUE = 1;

	/**
	 * The '<em><b>Uninteded Delivery Of Function</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNINTEDED_DELIVERY_OF_FUNCTION
	 * @model name="UnintededDeliveryOfFunction"
	 * @generated
	 * @ordered
	 */
	public static final int UNINTEDED_DELIVERY_OF_FUNCTION_VALUE = 2;

	/**
	 * The '<em><b>Early Deployment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EARLY_DEPLOYMENT
	 * @model name="EarlyDeployment"
	 * @generated
	 * @ordered
	 */
	public static final int EARLY_DEPLOYMENT_VALUE = 3;

	/**
	 * The '<em><b>Late Deployment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LATE_DEPLOYMENT
	 * @model name="LateDeployment"
	 * @generated
	 * @ordered
	 */
	public static final int LATE_DEPLOYMENT_VALUE = 4;

	/**
	 * The '<em><b>Provision Value High</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROVISION_VALUE_HIGH
	 * @model name="ProvisionValueHigh"
	 * @generated
	 * @ordered
	 */
	public static final int PROVISION_VALUE_HIGH_VALUE = 5;

	/**
	 * The '<em><b>Provision Value Low</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROVISION_VALUE_LOW
	 * @model name="ProvisionValueLow"
	 * @generated
	 * @ordered
	 */
	public static final int PROVISION_VALUE_LOW_VALUE = 4;

	/**
	 * An array of all the '<em><b>Failure Effect Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FailureEffectEnum[] VALUES_ARRAY =
		new FailureEffectEnum[] {
			LOSS_OF_FUNCTION,
			UNINTEDED_DELIVERY_OF_FUNCTION,
			EARLY_DEPLOYMENT,
			LATE_DEPLOYMENT,
			PROVISION_VALUE_HIGH,
			PROVISION_VALUE_LOW,
		};

	/**
	 * A public read-only list of all the '<em><b>Failure Effect Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FailureEffectEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Failure Effect Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FailureEffectEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FailureEffectEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Failure Effect Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FailureEffectEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FailureEffectEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Failure Effect Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FailureEffectEnum get(int value) {
		switch (value) {
			case LOSS_OF_FUNCTION_VALUE: return LOSS_OF_FUNCTION;
			case UNINTEDED_DELIVERY_OF_FUNCTION_VALUE: return UNINTEDED_DELIVERY_OF_FUNCTION;
			case EARLY_DEPLOYMENT_VALUE: return EARLY_DEPLOYMENT;
			case LATE_DEPLOYMENT_VALUE: return LATE_DEPLOYMENT;
			case PROVISION_VALUE_HIGH_VALUE: return PROVISION_VALUE_HIGH;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private FailureEffectEnum(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //FailureEffectEnum
