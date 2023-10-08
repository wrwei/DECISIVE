/**
 */
package safety_concept;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>SIL</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see safety_concept.Safety_concept_Package#getSIL()
 * @model
 * @generated
 */
public enum SIL implements Enumerator {
	/**
	 * The '<em><b>SIL 1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIL_1_VALUE
	 * @generated
	 * @ordered
	 */
	SIL_1(1, "SIL_1", "SIL_1"),

	/**
	 * The '<em><b>SIL 2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIL_2_VALUE
	 * @generated
	 * @ordered
	 */
	SIL_2(2, "SIL_2", "SIL_2"),

	/**
	 * The '<em><b>SIL 3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIL_3_VALUE
	 * @generated
	 * @ordered
	 */
	SIL_3(3, "SIL_3", "SIL_3"),

	/**
	 * The '<em><b>SIL 4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIL_4_VALUE
	 * @generated
	 * @ordered
	 */
	SIL_4(4, "SIL_4", "SIL_4");

	/**
	 * The '<em><b>SIL 1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIL_1
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIL_1_VALUE = 1;

	/**
	 * The '<em><b>SIL 2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIL_2
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIL_2_VALUE = 2;

	/**
	 * The '<em><b>SIL 3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIL_3
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIL_3_VALUE = 3;

	/**
	 * The '<em><b>SIL 4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIL_4
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIL_4_VALUE = 4;

	/**
	 * An array of all the '<em><b>SIL</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SIL[] VALUES_ARRAY =
		new SIL[] {
			SIL_1,
			SIL_2,
			SIL_3,
			SIL_4,
		};

	/**
	 * A public read-only list of all the '<em><b>SIL</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SIL> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>SIL</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SIL get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SIL result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SIL</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SIL getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SIL result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SIL</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SIL get(int value) {
		switch (value) {
			case SIL_1_VALUE: return SIL_1;
			case SIL_2_VALUE: return SIL_2;
			case SIL_3_VALUE: return SIL_3;
			case SIL_4_VALUE: return SIL_4;
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
	private SIL(int value, String name, String literal) {
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
	
} //SIL
