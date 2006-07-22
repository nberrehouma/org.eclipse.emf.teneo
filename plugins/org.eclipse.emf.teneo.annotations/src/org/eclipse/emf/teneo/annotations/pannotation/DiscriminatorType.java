/**
 * <copyright>
 * </copyright>
 *
 * $Id: DiscriminatorType.java,v 1.3 2006/07/22 13:10:04 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pannotation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '<em><b>Discriminator Type</b></em>',
 * and utility methods for working with them. <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage#getDiscriminatorType()
 * @model
 * @generated
 */
public final class DiscriminatorType extends AbstractEnumerator {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2005, 2006 Springsite BV (The Netherlands) and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public\nLicense v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n   Martin Taal\n   Davide Marchignoli\n";

	/**
	 * The '<em><b>STRING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STRING</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STRING_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STRING = 0;

	/**
	 * The '<em><b>CHAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CHAR</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHAR_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CHAR = 1;

	/**
	 * The '<em><b>INTEGER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INTEGER</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTEGER_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER = 2;

	/**
	 * The '<em><b>STRING</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #STRING
	 * @generated
	 * @ordered
	 */
	public static final DiscriminatorType STRING_LITERAL = new DiscriminatorType(STRING, "STRING");

	/**
	 * The '<em><b>CHAR</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #CHAR
	 * @generated
	 * @ordered
	 */
	public static final DiscriminatorType CHAR_LITERAL = new DiscriminatorType(CHAR, "CHAR");

	/**
	 * The '<em><b>INTEGER</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #INTEGER
	 * @generated
	 * @ordered
	 */
	public static final DiscriminatorType INTEGER_LITERAL = new DiscriminatorType(INTEGER, "INTEGER");

	/**
	 * An array of all the '<em><b>Discriminator Type</b></em>' enumerators.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	private static final DiscriminatorType[] VALUES_ARRAY =
		new DiscriminatorType[] {
			STRING_LITERAL,
			CHAR_LITERAL,
			INTEGER_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Discriminator Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Discriminator Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DiscriminatorType get(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DiscriminatorType result = VALUES_ARRAY[i];
			if (result.toString().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Discriminator Type</b></em>' literal with the specified value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DiscriminatorType get(int value) {
		switch (value) {
			case STRING: return STRING_LITERAL;
			case CHAR: return CHAR_LITERAL;
			case INTEGER: return INTEGER_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private DiscriminatorType(int value, String name) {
		super(value, name);
	}
} // DiscriminatorType
