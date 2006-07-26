/**
 * <copyright>
 * </copyright>
 *
 * $Id: PannotationFactory.java,v 1.3 2006/07/26 12:43:35 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pannotation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each non-abstract class of
 * the model. <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage
 * @generated
 */
public interface PannotationFactory extends EFactory {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2005, 2006 Springsite BV (The Netherlands) and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public\nLicense v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n   Martin Taal\n   Davide Marchignoli\n";

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	PannotationFactory eINSTANCE = org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Attribute Override</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Override</em>'.
	 * @generated
	 */
	AttributeOverride createAttributeOverride();

	/**
	 * Returns a new object of class '<em>Attribute Overrides</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Overrides</em>'.
	 * @generated
	 */
	AttributeOverrides createAttributeOverrides();

	/**
	 * Returns a new object of class '<em>Basic</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Basic</em>'.
	 * @generated
	 */
	Basic createBasic();

	/**
	 * Returns a new object of class '<em>Column</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Column</em>'.
	 * @generated
	 */
	Column createColumn();

	/**
	 * Returns a new object of class '<em>Discriminator Column</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Discriminator Column</em>'.
	 * @generated
	 */
	DiscriminatorColumn createDiscriminatorColumn();

	/**
	 * Returns a new object of class '<em>Discriminator Value</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Discriminator Value</em>'.
	 * @generated
	 */
	DiscriminatorValue createDiscriminatorValue();

	/**
	 * Returns a new object of class '<em>Embeddable</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Embeddable</em>'.
	 * @generated
	 */
	Embeddable createEmbeddable();

	/**
	 * Returns a new object of class '<em>Mapped Superclass</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Mapped Superclass</em>'.
	 * @generated
	 */
	MappedSuperclass createMappedSuperclass();

	/**
	 * Returns a new object of class '<em>Embedded</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Embedded</em>'.
	 * @generated
	 */
	Embedded createEmbedded();

	/**
	 * Returns a new object of class '<em>Embedded Id</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Embedded Id</em>'.
	 * @generated
	 */
	EmbeddedId createEmbeddedId();

	/**
	 * Returns a new object of class '<em>Enumerated</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumerated</em>'.
	 * @generated
	 */
	Enumerated createEnumerated();

	/**
	 * Returns a new object of class '<em>Entity</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity</em>'.
	 * @generated
	 */
	Entity createEntity();

	/**
	 * Returns a new object of class '<em>Generated Value</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Generated Value</em>'.
	 * @generated
	 */
	GeneratedValue createGeneratedValue();

	/**
	 * Returns a new object of class '<em>Id</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Id</em>'.
	 * @generated
	 */
	Id createId();

	/**
	 * Returns a new object of class '<em>Id Class</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Id Class</em>'.
	 * @generated
	 */
	IdClass createIdClass();

	/**
	 * Returns a new object of class '<em>Inheritance</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Inheritance</em>'.
	 * @generated
	 */
	Inheritance createInheritance();

	/**
	 * Returns a new object of class '<em>Join Column</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Join Column</em>'.
	 * @generated
	 */
	JoinColumn createJoinColumn();

	/**
	 * Returns a new object of class '<em>Join Columns</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Join Columns</em>'.
	 * @generated
	 */
	JoinColumns createJoinColumns();

	/**
	 * Returns a new object of class '<em>Join Table</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Join Table</em>'.
	 * @generated
	 */
	JoinTable createJoinTable();

	/**
	 * Returns a new object of class '<em>Lob</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Lob</em>'.
	 * @generated
	 */
	Lob createLob();

	/**
	 * Returns a new object of class '<em>Many To Many</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Many To Many</em>'.
	 * @generated
	 */
	ManyToMany createManyToMany();

	/**
	 * Returns a new object of class '<em>Many To One</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Many To One</em>'.
	 * @generated
	 */
	ManyToOne createManyToOne();

	/**
	 * Returns a new object of class '<em>Map Key</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Map Key</em>'.
	 * @generated
	 */
	MapKey createMapKey();

	/**
	 * Returns a new object of class '<em>One To Many</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>One To Many</em>'.
	 * @generated
	 */
	OneToMany createOneToMany();

	/**
	 * Returns a new object of class '<em>One To One</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>One To One</em>'.
	 * @generated
	 */
	OneToOne createOneToOne();

	/**
	 * Returns a new object of class '<em>Order By</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Order By</em>'.
	 * @generated
	 */
	OrderBy createOrderBy();

	/**
	 * Returns a new object of class '<em>Primary Key Join Column</em>'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return a new object of class '<em>Primary Key Join Column</em>'.
	 * @generated
	 */
	PrimaryKeyJoinColumn createPrimaryKeyJoinColumn();

	/**
	 * Returns a new object of class '<em>Primary Key Join Columns</em>'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return a new object of class '<em>Primary Key Join Columns</em>'.
	 * @generated
	 */
	PrimaryKeyJoinColumns createPrimaryKeyJoinColumns();

	/**
	 * Returns a new object of class '<em>Secondary Table</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Secondary Table</em>'.
	 * @generated
	 */
	SecondaryTable createSecondaryTable();

	/**
	 * Returns a new object of class '<em>Secondary Tables</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Secondary Tables</em>'.
	 * @generated
	 */
	SecondaryTables createSecondaryTables();

	/**
	 * Returns a new object of class '<em>Sequence Generator</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence Generator</em>'.
	 * @generated
	 */
	SequenceGenerator createSequenceGenerator();

	/**
	 * Returns a new object of class '<em>Table</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Table</em>'.
	 * @generated
	 */
	Table createTable();

	/**
	 * Returns a new object of class '<em>Table Generator</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Table Generator</em>'.
	 * @generated
	 */
	TableGenerator createTableGenerator();

	/**
	 * Returns a new object of class '<em>Temporal</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Temporal</em>'.
	 * @generated
	 */
	Temporal createTemporal();

	/**
	 * Returns a new object of class '<em>Transient</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Transient</em>'.
	 * @generated
	 */
	Transient createTransient();

	/**
	 * Returns a new object of class '<em>Unique Constraint</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Unique Constraint</em>'.
	 * @generated
	 */
	UniqueConstraint createUniqueConstraint();

	/**
	 * Returns a new object of class '<em>Version</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Version</em>'.
	 * @generated
	 */
	Version createVersion();

	/**
	 * Returns a new object of class '<em>Indexed</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Indexed</em>'.
	 * @generated
	 */
	Indexed createIndexed();

	/**
	 * Returns a new object of class '<em>Unique</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Unique</em>'.
	 * @generated
	 */
	Unique createUnique();

	/**
	 * Returns a new object of class '<em>Columns</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Columns</em>'.
	 * @generated
	 */
	Columns createColumns();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>Type</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Type</em>'.
	 * @generated
	 */
	Type createType();

	/**
	 * Returns a new object of class '<em>Id Bag</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Id Bag</em>'.
	 * @generated
	 */
	IdBag createIdBag();

	/**
	 * Returns a new object of class '<em>Association Override</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Association Override</em>'.
	 * @generated
	 */
	AssociationOverride createAssociationOverride();

	/**
	 * Returns a new object of class '<em>Association Overrides</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Association Overrides</em>'.
	 * @generated
	 */
	AssociationOverrides createAssociationOverrides();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PannotationPackage getPannotationPackage();

} // PannotationFactory
