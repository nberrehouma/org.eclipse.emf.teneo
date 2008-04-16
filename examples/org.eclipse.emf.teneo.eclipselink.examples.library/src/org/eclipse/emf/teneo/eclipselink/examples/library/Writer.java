/*******************************************************************************
 * Copyright (c) 2008 Oracle and Geensys.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Oracle and Geensys - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.teneo.eclipselink.examples.library;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Writer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.eclipselink.examples.library.Writer#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.eclipselink.examples.library.Writer#getBooks <em>Books</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.eclipselink.examples.library.Writer#getAddress <em>Address</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.eclipselink.examples.library.Writer#getPublishers <em>Publishers</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.eclipselink.examples.library.Writer#getTypewriters <em>Typewriters</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.eclipselink.examples.library.LibraryPackage#getWriter()
 * @model
 * @generated
 */
public interface Writer extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.LibraryPackage#getWriter_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.eclipselink.examples.library.Writer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Books</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.eclipselink.examples.library.Book}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.eclipselink.examples.library.Book#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Books</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Books</em>' reference list.
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.LibraryPackage#getWriter_Books()
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.Book#getAuthor
	 * @model opposite="author"
	 * @generated
	 */
	EList<Book> getBooks();

	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' containment reference.
	 * @see #setAddress(Address)
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.LibraryPackage#getWriter_Address()
	 * @model containment="true"
	 * @generated
	 */
	Address getAddress();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.eclipselink.examples.library.Writer#getAddress <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' containment reference.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(Address value);

	/**
	 * Returns the value of the '<em><b>Publishers</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.eclipselink.examples.library.Publisher}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.eclipselink.examples.library.Publisher#getWriters <em>Writers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publishers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publishers</em>' reference list.
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.LibraryPackage#getWriter_Publishers()
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.Publisher#getWriters
	 * @model opposite="writers"
	 * @generated
	 */
	EList<Publisher> getPublishers();

	/**
	 * Returns the value of the '<em><b>Typewriters</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.eclipselink.examples.library.TypeWriter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Typewriters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typewriters</em>' reference list.
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.LibraryPackage#getWriter_Typewriters()
	 * @model
	 * @generated
	 */
	EList<TypeWriter> getTypewriters();

} // Writer