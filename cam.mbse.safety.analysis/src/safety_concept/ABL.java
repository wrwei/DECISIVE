/**
 */
package safety_concept;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ABL</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see safety_concept.Safety_concept_Package#getABL()
 * @model
 * @generated
 */
public enum ABL implements Enumerator {
	/**
	 * The '<em><b>Functional</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUNCTIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	FUNCTIONAL(1, "Functional", "Functional"),

	/**
	 * The '<em><b>Technical</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TECHNICAL_VALUE
	 * @generated
	 * @ordered
	 */
	TECHNICAL(2, "Technical", "Technical"),

	/**
	 * The '<em><b>Software</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOFTWARE_VALUE
	 * @generated
	 * @ordered
	 */
	SOFTWARE(3, "Software", "Software"),

	/**
	 * The '<em><b>Hardware</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HARDWARE_VALUE
	 * @generated
	 * @ordered
	 */
	HARDWARE(4, "Hardware", "Hardware");

	/**
	 * The '<em><b>Functional</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUNCTIONAL
	 * @model name="Functional"
	 * @generated
	 * @ordered
	 */
	public static final int FUNCTIONAL_VALUE = 1;

	/**
	 * The '<em><b>Technical</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TECHNICAL
	 * @model name="Technical"
	 * @generated
	 * @ordered
	 */
	public static final int TECHNICAL_VALUE = 2;

	/**
	 * The '<em><b>Software</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOFTWARE
	 * @model name="Software"
	 * @generated
	 * @ordered
	 */
	public static final int SOFTWARE_VALUE = 3;

	/**
	 * The '<em><b>Hardware</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HARDWARE
	 * @model name="Hardware"
	 * @generated
	 * @ordered
	 */
	public static final int HARDWARE_VALUE = 4;

	/**
	 * An array of all the '<em><b>ABL</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ABL[] VALUES_ARRAY =
		new ABL[] {
			FUNCTIONAL,
			TECHNICAL,
			SOFTWARE,
			HARDWARE,
		};

	/**
	 * A public read-only list of all the '<em><b>ABL</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ABL> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ABL</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ABL get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ABL result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ABL</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ABL getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ABL result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ABL</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ABL get(int value) {
		switch (value) {
			case FUNCTIONAL_VALUE: return FUNCTIONAL;
			case TECHNICAL_VALUE: return TECHNICAL;
			case SOFTWARE_VALUE: return SOFTWARE;
			case HARDWARE_VALUE: return HARDWARE;
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
	private ABL(int value, String name, String literal) {
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
	
} //ABL
