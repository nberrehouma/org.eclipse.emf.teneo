/**
 */
package org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>Teneo Audit Object</b></em>
 * '. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditObject#getTeneo_audit_id
 * <em>Teneo audit id</em>}</li>
 * <li>
 * {@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditObject#getTeneo_version
 * <em>Teneo version</em>}</li>
 * <li>
 * {@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditObject#getTeneo_object_id
 * <em>Teneo object id</em>}</li>
 * <li>
 * {@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditObject#getTeneo_start
 * <em>Teneo start</em>}</li>
 * <li>
 * {@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditObject#getTeneo_end
 * <em>Teneo end</em>}</li>
 * <li>
 * {@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditObject#getTeneo_commit_info
 * <em>Teneo commit info</em>}</li>
 * <li>
 * {@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditObject#getTeneo_audit_kind
 * <em>Teneo audit kind</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoauditingPackage#getTeneoAuditObject()
 * @model annotation="teneo.jpa value='@MappedSuperclass'"
 * @generated
 */
public interface TeneoAuditObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Teneo audit id</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Teneo audit id</em>' attribute isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Teneo audit id</em>' attribute.
	 * @see #setTeneo_audit_id(long)
	 * @see org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoauditingPackage#getTeneoAuditObject_Teneo_audit_id()
	 * @model annotation="teneo.jpa value='@Id\n@GeneratedValue'"
	 * @generated
	 */
	long getTeneo_audit_id();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditObject#getTeneo_audit_id
	 * <em>Teneo audit id</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Teneo audit id</em>' attribute.
	 * @see #getTeneo_audit_id()
	 * @generated
	 */
	void setTeneo_audit_id(long value);

	/**
	 * Returns the value of the '<em><b>Teneo version</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Teneo version</em>' attribute isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Teneo version</em>' attribute.
	 * @see #setTeneo_version(long)
	 * @see org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoauditingPackage#getTeneoAuditObject_Teneo_version()
	 * @model annotation="teneo.jpa value='@Version'"
	 * @generated
	 */
	long getTeneo_version();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditObject#getTeneo_version
	 * <em>Teneo version</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Teneo version</em>' attribute.
	 * @see #getTeneo_version()
	 * @generated
	 */
	void setTeneo_version(long value);

	/**
	 * Returns the value of the '<em><b>Teneo object id</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Teneo object id</em>' attribute isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Teneo object id</em>' attribute.
	 * @see #setTeneo_object_id(String)
	 * @see org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoauditingPackage#getTeneoAuditObject_Teneo_object_id()
	 * @model
	 * @generated
	 */
	String getTeneo_object_id();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditObject#getTeneo_object_id
	 * <em>Teneo object id</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Teneo object id</em>' attribute.
	 * @see #getTeneo_object_id()
	 * @generated
	 */
	void setTeneo_object_id(String value);

	/**
	 * Returns the value of the '<em><b>Teneo start</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Teneo start</em>' attribute isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Teneo start</em>' attribute.
	 * @see #setTeneo_start(long)
	 * @see org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoauditingPackage#getTeneoAuditObject_Teneo_start()
	 * @model
	 * @generated
	 */
	long getTeneo_start();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditObject#getTeneo_start
	 * <em>Teneo start</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Teneo start</em>' attribute.
	 * @see #getTeneo_start()
	 * @generated
	 */
	void setTeneo_start(long value);

	/**
	 * Returns the value of the '<em><b>Teneo end</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Teneo end</em>' attribute isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Teneo end</em>' attribute.
	 * @see #setTeneo_end(long)
	 * @see org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoauditingPackage#getTeneoAuditObject_Teneo_end()
	 * @model
	 * @generated
	 */
	long getTeneo_end();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditObject#getTeneo_end
	 * <em>Teneo end</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Teneo end</em>' attribute.
	 * @see #getTeneo_end()
	 * @generated
	 */
	void setTeneo_end(long value);

	/**
	 * Returns the value of the '<em><b>Teneo commit info</b></em>' reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Teneo commit info</em>' reference isn't clear, there really should
	 * be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Teneo commit info</em>' reference.
	 * @see #setTeneo_commit_info(TeneoAuditCommitInfo)
	 * @see org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoauditingPackage#getTeneoAuditObject_Teneo_commit_info()
	 * @model required="true"
	 * @generated
	 */
	TeneoAuditCommitInfo getTeneo_commit_info();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditObject#getTeneo_commit_info
	 * <em>Teneo commit info</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Teneo commit info</em>' reference.
	 * @see #getTeneo_commit_info()
	 * @generated
	 */
	void setTeneo_commit_info(TeneoAuditCommitInfo value);

	/**
	 * Returns the value of the '<em><b>Teneo audit kind</b></em>' attribute. The literals are from
	 * the enumeration
	 * {@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditKind}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Teneo audit kind</em>' attribute isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Teneo audit kind</em>' attribute.
	 * @see org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditKind
	 * @see #setTeneo_audit_kind(TeneoAuditKind)
	 * @see org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoauditingPackage#getTeneoAuditObject_Teneo_audit_kind()
	 * @model required="true"
	 * @generated
	 */
	TeneoAuditKind getTeneo_audit_kind();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditObject#getTeneo_audit_kind
	 * <em>Teneo audit kind</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Teneo audit kind</em>' attribute.
	 * @see org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditKind
	 * @see #getTeneo_audit_kind()
	 * @generated
	 */
	void setTeneo_audit_kind(TeneoAuditKind value);

} // TeneoAuditObject