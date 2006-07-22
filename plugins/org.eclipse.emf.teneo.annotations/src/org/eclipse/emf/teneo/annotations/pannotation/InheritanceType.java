/**
 * <copyright>
 * </copyright>
 *
 * $Id: InheritanceType.java,v 1.3 2006/07/22 13:10:04 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pannotation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '<em><b>Inheritance Type</b></em>',
 * and utility methods for working with them. <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage#getInheritanceType()
 * @model
 * @generated
 */
public final class InheritanceType extends AbstractEnumerator {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2005, 2006 Springsite BV (The Netherlands) and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public\nLicense v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n   Martin Taal\n   Davide Marchignoli\n";

	/**
	 * The '<em><b>SINGLE TABLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SINGLE TABLE</b></em>' literal object isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SINGLE_TABLE_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SINGLE_TABLE = 0;

	/**
	 * The '<em><b>TABLE PER CLASS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TABLE PER CLASS</b></em>' literal object isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TABLE_PER_CLASS_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TABLE_PER_CLASS = 1;

	/**
	 * The '<em><b>JOINED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>JOINED</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JOINED_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int JOINED = 2;

	/**
	 * The '<em><b>SINGLE TABLE</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #SINGLE_TABLE
	 * @generated
	 * @ordered
	 */
	public static final InheritanceType SINGLE_TABLE_LITERAL = new InheritanceType(SINGLE_TABLE, "SINGLE_TABLE");

	/**
	 * The '<em><b>TABLE PER CLASS</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #TABLE_PER_CLASS
	 * @generated
	 * @ordered
	 */
	public static final InheritanceType TABLE_PER_CLASS_LITERAL = new InheritanceType(TABLE_PER_CLASS, "TABLE_PER_CLASS");

	/**
	 * The '<em><b>JOINED</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #JOINED
	 * @generated
	 * @ordered
	 */
	public static final InheritanceType JOINED_LITERAL = new InheritanceType(JOINED, "JOINED");

	/**
	 * An array of all the '<em><b>Inheritance Type</b></em>' enumerators.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	private static final InheritanceType[] VALUES_ARRAY =
		new InheritanceType[] {
			SINGLE_TABLE_LITERAL,
			TABLE_PER_CLASS_LITERAL,
			JOINED_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Inheritance Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Inheritance Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static InheritanceType get(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InheritanceType result = VALUES_ARRAY[i];
			if (result.toString().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Inheritance Type</b></em>' literal with the specified value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InheritanceType get(int value) {
		switch (value) {
			case SINGLE_TABLE: return SINGLE_TABLE_LITERAL;
			case TABLE_PER_CLASS: return TABLE_PER_CLASS_LITERAL;
			case JOINED: return JOINED_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private InheritanceType(int value, String name) {
		super(value, name);
	}

} // InheritanceType
