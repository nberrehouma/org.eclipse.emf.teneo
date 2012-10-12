/**
 */
package org.eclipse.emf.teneo.samples.issues.nonmandatoryjoincolumn.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.teneo.samples.issues.nonmandatoryjoincolumn.Bar;
import org.eclipse.emf.teneo.samples.issues.nonmandatoryjoincolumn.Foo;
import org.eclipse.emf.teneo.samples.issues.nonmandatoryjoincolumn.NonmandatoryjoincolumnFactory;
import org.eclipse.emf.teneo.samples.issues.nonmandatoryjoincolumn.NonmandatoryjoincolumnPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NonmandatoryjoincolumnPackageImpl extends EPackageImpl implements NonmandatoryjoincolumnPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fooEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass barEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.emf.teneo.samples.issues.nonmandatoryjoincolumn.NonmandatoryjoincolumnPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private NonmandatoryjoincolumnPackageImpl() {
		super(eNS_URI, NonmandatoryjoincolumnFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link NonmandatoryjoincolumnPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static NonmandatoryjoincolumnPackage init() {
		if (isInited) return (NonmandatoryjoincolumnPackage)EPackage.Registry.INSTANCE.getEPackage(NonmandatoryjoincolumnPackage.eNS_URI);

		// Obtain or create and register package
		NonmandatoryjoincolumnPackageImpl theNonmandatoryjoincolumnPackage = (NonmandatoryjoincolumnPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof NonmandatoryjoincolumnPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new NonmandatoryjoincolumnPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theNonmandatoryjoincolumnPackage.createPackageContents();

		// Initialize created meta-data
		theNonmandatoryjoincolumnPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theNonmandatoryjoincolumnPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(NonmandatoryjoincolumnPackage.eNS_URI, theNonmandatoryjoincolumnPackage);
		return theNonmandatoryjoincolumnPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFoo() {
		return fooEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFoo_Bar() {
		return (EReference)fooEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBar() {
		return barEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBar_Name() {
		return (EAttribute)barEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonmandatoryjoincolumnFactory getNonmandatoryjoincolumnFactory() {
		return (NonmandatoryjoincolumnFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		fooEClass = createEClass(FOO);
		createEReference(fooEClass, FOO__BAR);

		barEClass = createEClass(BAR);
		createEAttribute(barEClass, BAR__NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(fooEClass, Foo.class, "Foo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFoo_Bar(), this.getBar(), null, "bar", null, 1, 1, Foo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(barEClass, Bar.class, "Bar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBar_Name(), ecorePackage.getEString(), "name", null, 0, 1, Bar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //NonmandatoryjoincolumnPackageImpl
