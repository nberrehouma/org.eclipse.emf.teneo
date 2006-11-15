/**
 * <copyright>
 * </copyright>
 *
 * $Id: Resource.java,v 1.1 2006/11/15 17:18:17 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.mindmap;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.mindmap.Resource#getComments <em>Comments</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.mindmap.Resource#getEmail <em>Email</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.mindmap.Resource#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.mindmap.Resource#getTopics <em>Topics</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.sample.mindmap.MindmapPackage#getResource()
 * @model extendedMetaData="name='Resource' kind='empty'"
 * @generated
 */
public interface Resource extends EObject {
	/**
	 * Returns the value of the '<em><b>Comments</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.sample.mindmap.Thread}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.emf.sample.mindmap.Thread#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.mindmap.MindmapPackage#getResource_Comments()
	 * @see org.eclipse.emf.teneo.samples.emf.sample.mindmap.Thread#getAuthor
	 * @model type="org.eclipse.emf.teneo.samples.emf.sample.mindmap.Thread" opposite="author"
	 *        extendedMetaData="kind='attribute' name='comments'"
	 * @generated
	 */
	EList getComments();

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.mindmap.MindmapPackage#getResource_Email()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='email'"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.mindmap.Resource#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

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
	 * @see org.eclipse.emf.teneo.samples.emf.sample.mindmap.MindmapPackage#getResource_Name()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.mindmap.Resource#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Topics</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.sample.mindmap.Topic}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.emf.sample.mindmap.Topic#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topics</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topics</em>' reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.mindmap.MindmapPackage#getResource_Topics()
	 * @see org.eclipse.emf.teneo.samples.emf.sample.mindmap.Topic#getResources
	 * @model type="org.eclipse.emf.teneo.samples.emf.sample.mindmap.Topic" opposite="resources"
	 *        extendedMetaData="kind='attribute' name='topics'"
	 * @generated
	 */
	EList getTopics();

} // Resource