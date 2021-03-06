/**
 * <copyright>
 * </copyright>
 *
 * $Id: Child2Impl.java,v 1.3 2007/07/09 12:55:19 mtaal Exp $
 */
package testinheritance.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import testinheritance.Child2;
import testinheritance.ParentOne;
import testinheritance.ParentTwo;
import testinheritance.SomeReference;
import testinheritance.TestinheritancePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Child2</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link testinheritance.impl.Child2Impl#getAnotherProperty <em>Another Property</em>}</li>
 * <li>{@link testinheritance.impl.Child2Impl#getTestId <em>Test Id</em>}</li>
 * <li>{@link testinheritance.impl.Child2Impl#getSomeReference <em>Some Reference</em>}</li>
 * <li>{@link testinheritance.impl.Child2Impl#getAge <em>Age</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class Child2Impl extends ParentZeroImpl implements Child2 {
	/**
	 * The default value of the '{@link #getAnotherProperty() <em>Another Property</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAnotherProperty()
	 * @generated
	 * @ordered
	 */
	protected static final long ANOTHER_PROPERTY_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getAnotherProperty() <em>Another Property</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAnotherProperty()
	 * @generated
	 * @ordered
	 */
	protected long anotherProperty = ANOTHER_PROPERTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestId() <em>Test Id</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getTestId()
	 * @generated
	 * @ordered
	 */
	protected static final long TEST_ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTestId() <em>Test Id</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getTestId()
	 * @generated
	 * @ordered
	 */
	protected long testId = TEST_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSomeReference() <em>Some Reference</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSomeReference()
	 * @generated
	 * @ordered
	 */
	protected SomeReference someReference;

	/**
	 * The default value of the '{@link #getAge() <em>Age</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected static final long AGE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getAge() <em>Age</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected long age = AGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected Child2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestinheritancePackage.Literals.CHILD2;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public long getAnotherProperty() {
		return anotherProperty;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setAnotherProperty(long newAnotherProperty) {
		long oldAnotherProperty = anotherProperty;
		anotherProperty = newAnotherProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TestinheritancePackage.CHILD2__ANOTHER_PROPERTY, oldAnotherProperty, anotherProperty));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public long getTestId() {
		return testId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setTestId(long newTestId) {
		long oldTestId = testId;
		testId = newTestId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestinheritancePackage.CHILD2__TEST_ID,
					oldTestId, testId));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SomeReference getSomeReference() {
		if (someReference != null && someReference.eIsProxy()) {
			InternalEObject oldSomeReference = (InternalEObject) someReference;
			someReference = (SomeReference) eResolveProxy(oldSomeReference);
			if (someReference != oldSomeReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TestinheritancePackage.CHILD2__SOME_REFERENCE, oldSomeReference, someReference));
			}
		}
		return someReference;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SomeReference basicGetSomeReference() {
		return someReference;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSomeReference(SomeReference newSomeReference) {
		SomeReference oldSomeReference = someReference;
		someReference = newSomeReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TestinheritancePackage.CHILD2__SOME_REFERENCE, oldSomeReference, someReference));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public long getAge() {
		return age;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setAge(long newAge) {
		long oldAge = age;
		age = newAge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestinheritancePackage.CHILD2__AGE,
					oldAge, age));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TestinheritancePackage.CHILD2__ANOTHER_PROPERTY:
			return new Long(getAnotherProperty());
		case TestinheritancePackage.CHILD2__TEST_ID:
			return new Long(getTestId());
		case TestinheritancePackage.CHILD2__SOME_REFERENCE:
			if (resolve)
				return getSomeReference();
			return basicGetSomeReference();
		case TestinheritancePackage.CHILD2__AGE:
			return new Long(getAge());
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TestinheritancePackage.CHILD2__ANOTHER_PROPERTY:
			setAnotherProperty(((Long) newValue).longValue());
			return;
		case TestinheritancePackage.CHILD2__TEST_ID:
			setTestId(((Long) newValue).longValue());
			return;
		case TestinheritancePackage.CHILD2__SOME_REFERENCE:
			setSomeReference((SomeReference) newValue);
			return;
		case TestinheritancePackage.CHILD2__AGE:
			setAge(((Long) newValue).longValue());
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case TestinheritancePackage.CHILD2__ANOTHER_PROPERTY:
			setAnotherProperty(ANOTHER_PROPERTY_EDEFAULT);
			return;
		case TestinheritancePackage.CHILD2__TEST_ID:
			setTestId(TEST_ID_EDEFAULT);
			return;
		case TestinheritancePackage.CHILD2__SOME_REFERENCE:
			setSomeReference((SomeReference) null);
			return;
		case TestinheritancePackage.CHILD2__AGE:
			setAge(AGE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case TestinheritancePackage.CHILD2__ANOTHER_PROPERTY:
			return anotherProperty != ANOTHER_PROPERTY_EDEFAULT;
		case TestinheritancePackage.CHILD2__TEST_ID:
			return testId != TEST_ID_EDEFAULT;
		case TestinheritancePackage.CHILD2__SOME_REFERENCE:
			return someReference != null;
		case TestinheritancePackage.CHILD2__AGE:
			return age != AGE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ParentOne.class) {
			switch (derivedFeatureID) {
			case TestinheritancePackage.CHILD2__ANOTHER_PROPERTY:
				return TestinheritancePackage.PARENT_ONE__ANOTHER_PROPERTY;
			default:
				return -1;
			}
		}
		if (baseClass == ParentTwo.class) {
			switch (derivedFeatureID) {
			case TestinheritancePackage.CHILD2__TEST_ID:
				return TestinheritancePackage.PARENT_TWO__TEST_ID;
			case TestinheritancePackage.CHILD2__SOME_REFERENCE:
				return TestinheritancePackage.PARENT_TWO__SOME_REFERENCE;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ParentOne.class) {
			switch (baseFeatureID) {
			case TestinheritancePackage.PARENT_ONE__ANOTHER_PROPERTY:
				return TestinheritancePackage.CHILD2__ANOTHER_PROPERTY;
			default:
				return -1;
			}
		}
		if (baseClass == ParentTwo.class) {
			switch (baseFeatureID) {
			case TestinheritancePackage.PARENT_TWO__TEST_ID:
				return TestinheritancePackage.CHILD2__TEST_ID;
			case TestinheritancePackage.PARENT_TWO__SOME_REFERENCE:
				return TestinheritancePackage.CHILD2__SOME_REFERENCE;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (anotherProperty: ");
		result.append(anotherProperty);
		result.append(", testId: ");
		result.append(testId);
		result.append(", age: ");
		result.append(age);
		result.append(')');
		return result.toString();
	}

} // Child2Impl
