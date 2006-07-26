/**
 * <copyright>
 * </copyright>
 *
 * $Id: PrimaryKeyJoinColumns.java,v 1.3 2006/07/26 12:43:36 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pannotation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Primary Key Join Columns</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pannotation.PrimaryKeyJoinColumns#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage#getPrimaryKeyJoinColumns()
 * @model annotation="http://annotation.elver.org/internal/Target 0='EClass'"
 *        annotation="http://annotation.elver.org/internal/PersistenceMapping ignore='true'"
 * @generated
 */
public interface PrimaryKeyJoinColumns extends PAnnotation {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2005, 2006 Springsite BV (The Netherlands) and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public\nLicense v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n   Martin Taal\n   Davide Marchignoli\n";

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.annotations.pannotation.PrimaryKeyJoinColumn}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference list isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage#getPrimaryKeyJoinColumns_Value()
	 * @model type="org.eclipse.emf.teneo.annotations.pannotation.PrimaryKeyJoinColumn" containment="true" required="true"
	 * @generated
	 */
	EList getValue();

} // PrimaryKeyJoinColumns
