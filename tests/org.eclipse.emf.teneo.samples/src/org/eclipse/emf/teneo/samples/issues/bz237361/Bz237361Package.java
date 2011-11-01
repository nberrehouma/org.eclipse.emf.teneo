/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bz237361Package.java,v 1.1 2008/08/11 20:40:39 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz237361;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.issues.bz237361.Bz237361Factory
 * @model kind="package"
 * @generated
 */
public interface Bz237361Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bz237361";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/samples/issues/bz237361";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bz237361";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Bz237361Package eINSTANCE = org.eclipse.emf.teneo.samples.issues.bz237361.impl.Bz237361PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz237361.impl.OneImpl <em>One</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz237361.impl.OneImpl
	 * @see org.eclipse.emf.teneo.samples.issues.bz237361.impl.Bz237361PackageImpl#getOne()
	 * @generated
	 */
	int ONE = 0;

	/**
	 * The feature id for the '<em><b>Manies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE__MANIES = 0;

	/**
	 * The number of structural features of the '<em>One</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz237361.impl.ManyImpl <em>Many</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz237361.impl.ManyImpl
	 * @see org.eclipse.emf.teneo.samples.issues.bz237361.impl.Bz237361PackageImpl#getMany()
	 * @generated
	 */
	int MANY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY__NAME = 0;

	/**
	 * The feature id for the '<em><b>One</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY__ONE = 1;

	/**
	 * The number of structural features of the '<em>Many</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.bz237361.One <em>One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>One</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz237361.One
	 * @generated
	 */
	EClass getOne();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.samples.issues.bz237361.One#getManies <em>Manies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Manies</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz237361.One#getManies()
	 * @see #getOne()
	 * @generated
	 */
	EReference getOne_Manies();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.bz237361.Many <em>Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Many</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz237361.Many
	 * @generated
	 */
	EClass getMany();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz237361.Many#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz237361.Many#getName()
	 * @see #getMany()
	 * @generated
	 */
	EAttribute getMany_Name();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.teneo.samples.issues.bz237361.Many#getOne <em>One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>One</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz237361.Many#getOne()
	 * @see #getMany()
	 * @generated
	 */
	EReference getMany_One();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Bz237361Factory getBz237361Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz237361.impl.OneImpl <em>One</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz237361.impl.OneImpl
		 * @see org.eclipse.emf.teneo.samples.issues.bz237361.impl.Bz237361PackageImpl#getOne()
		 * @generated
		 */
		EClass ONE = eINSTANCE.getOne();

		/**
		 * The meta object literal for the '<em><b>Manies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE__MANIES = eINSTANCE.getOne_Manies();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz237361.impl.ManyImpl <em>Many</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz237361.impl.ManyImpl
		 * @see org.eclipse.emf.teneo.samples.issues.bz237361.impl.Bz237361PackageImpl#getMany()
		 * @generated
		 */
		EClass MANY = eINSTANCE.getMany();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANY__NAME = eINSTANCE.getMany_Name();

		/**
		 * The meta object literal for the '<em><b>One</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANY__ONE = eINSTANCE.getMany_One();

	}

} //Bz237361Package