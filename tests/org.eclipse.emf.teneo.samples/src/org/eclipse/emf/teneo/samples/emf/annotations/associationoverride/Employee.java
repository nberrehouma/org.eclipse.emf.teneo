/**
 * <copyright>
 * </copyright>
 *
 * $Id: Employee.java,v 1.3 2010/02/06 18:17:46 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.associationoverride;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Employee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.associationoverride.Employee#getDepartment <em>Department</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.annotations.associationoverride.AssociationoverridePackage#getEmployee()
 * @model annotation="teneo.jpa appinfo='@AssociationOverride(name=\"address\" joinColumns=@JoinColumn(name=\"employee_address_id\"))'"
 *        extendedMetaData="name='Employee' kind='elementOnly'"
 * @generated
 */
public interface Employee extends Person {
	/**
	 * Returns the value of the '<em><b>Department</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Department</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Department</em>' attribute.
	 * @see #setDepartment(String)
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.associationoverride.AssociationoverridePackage#getEmployee_Department()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='department'"
	 * @generated
	 */
	String getDepartment();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.associationoverride.Employee#getDepartment <em>Department</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Department</em>' attribute.
	 * @see #getDepartment()
	 * @generated
	 */
	void setDepartment(String value);

} // Employee