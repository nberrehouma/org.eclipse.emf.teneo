/**
 * <copyright>
 * </copyright>
 *
 * $Id: Relation1to1Switch.java,v 1.2 2007/02/08 23:09:24 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.relation.relation1to1.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.teneo.samples.emf.relation.relation1to1.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1to1.Relation1to1Package
 * @generated
 */
public class Relation1to1Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Relation1to1Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation1to1Switch() {
		if (modelPackage == null) {
			modelPackage = Relation1to1Package.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Relation1to1Package.CONTAINED_CHILD_NR: {
				ContainedChildNR containedChildNR = (ContainedChildNR)theEObject;
				T result = caseContainedChildNR(containedChildNR);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Relation1to1Package.CONTAINED_CHILD_R: {
				ContainedChildR containedChildR = (ContainedChildR)theEObject;
				T result = caseContainedChildR(containedChildR);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Relation1to1Package.MAIN: {
				Main main = (Main)theEObject;
				T result = caseMain(main);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Relation1to1Package.NOT_CONTAINED_CHILD_NR: {
				NotContainedChildNR notContainedChildNR = (NotContainedChildNR)theEObject;
				T result = caseNotContainedChildNR(notContainedChildNR);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Relation1to1Package.NOT_CONTAINED_CHILD_NRT: {
				NotContainedChildNRT notContainedChildNRT = (NotContainedChildNRT)theEObject;
				T result = caseNotContainedChildNRT(notContainedChildNRT);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Relation1to1Package.NOT_CONTAINED_CHILD_NRTNR: {
				NotContainedChildNRTNR notContainedChildNRTNR = (NotContainedChildNRTNR)theEObject;
				T result = caseNotContainedChildNRTNR(notContainedChildNRTNR);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Relation1to1Package.NOT_CONTAINED_CHILD_R: {
				NotContainedChildR notContainedChildR = (NotContainedChildR)theEObject;
				T result = caseNotContainedChildR(notContainedChildR);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Relation1to1Package.NOT_CONTAINED_CHILD_RTNR: {
				NotContainedChildRTNR notContainedChildRTNR = (NotContainedChildRTNR)theEObject;
				T result = caseNotContainedChildRTNR(notContainedChildRTNR);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Contained Child NR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Contained Child NR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainedChildNR(ContainedChildNR object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Contained Child R</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Contained Child R</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainedChildR(ContainedChildR object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Main</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Main</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMain(Main object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Not Contained Child NR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Not Contained Child NR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotContainedChildNR(NotContainedChildNR object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Not Contained Child NRT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Not Contained Child NRT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotContainedChildNRT(NotContainedChildNRT object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Not Contained Child NRTNR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Not Contained Child NRTNR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotContainedChildNRTNR(NotContainedChildNRTNR object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Not Contained Child R</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Not Contained Child R</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotContainedChildR(NotContainedChildR object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Not Contained Child RTNR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Not Contained Child RTNR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotContainedChildRTNR(NotContainedChildRTNR object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //Relation1to1Switch
