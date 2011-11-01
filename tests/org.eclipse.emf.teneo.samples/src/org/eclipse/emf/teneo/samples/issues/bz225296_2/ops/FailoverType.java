/**
 * <copyright>
 * </copyright>
 *
 * $Id: FailoverType.java,v 1.1 2008/04/06 13:45:43 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz225296_2.ops;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Failover Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.FailoverType#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.FailoverType#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.FailoverType#getModified <em>Modified</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.FailoverType#getRevision <em>Revision</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsPackage#getFailoverType()
 * @model annotation="teneo.jpa appinfo='@Table(name=\"ops_failovertype\")'"
 *        annotation="webamg.emf managed='false' user.key='name'"
 * @generated
 */
public interface FailoverType extends EObject {
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
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsPackage#getFailoverType_Name()
	 * @model annotation="teneo.jpa appinfo='@Column(unique=\"true\")'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.FailoverType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(long)
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsPackage#getFailoverType_Id()
	 * @model annotation="teneo.jpa appinfo='@GeneratedValue'"
	 *        annotation="teneo.jpa appinfo='@Id'"
	 * @generated
	 */
	long getId();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.FailoverType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(long value);

	/**
	 * Returns the value of the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modified</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modified</em>' attribute.
	 * @see #setModified(Date)
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsPackage#getFailoverType_Modified()
	 * @model unique="false"
	 *        annotation="teneo.jpa appinfo='@Temporal(TIMESTAMP)'"
	 *        annotation="teneo.jpa appinfo='@Column(columnDefinition=\"timestamp\" insertable=\"false\" updatable=\"false\")'"
	 *        annotation="teneo.hibernate appinfo='@Generated(ALWAYS)'"
	 * @generated
	 */
	Date getModified();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.FailoverType#getModified <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modified</em>' attribute.
	 * @see #getModified()
	 * @generated
	 */
	void setModified(Date value);

	/**
	 * Returns the value of the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revision</em>' attribute.
	 * @see #setRevision(int)
	 * @see org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.OpsPackage#getFailoverType_Revision()
	 * @model unique="false"
	 *        annotation="teneo.jpa appinfo='@Version'"
	 *        annotation="teneo.jpa appinfo='@Column(name=\"e_version\")'"
	 * @generated
	 */
	int getRevision();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.FailoverType#getRevision <em>Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision</em>' attribute.
	 * @see #getRevision()
	 * @generated
	 */
	void setRevision(int value);

} // FailoverType
