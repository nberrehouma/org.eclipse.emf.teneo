/**
 * <copyright>
 * </copyright>
 *
 * $Id: AuthorValidator.java,v 1.1 2007/03/28 13:56:50 mtaal Exp $
 */
package lobj.validation;

import lobj.Address;
import lobj.Person;

/**
 * A sample validator interface for {@link lobj.Author}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface AuthorValidator {
	boolean validate();

	boolean validateCredittype(String value);
	boolean validatePerson(Person value);
	boolean validateAddress(Address value);
	boolean validateEmail(String value);
	boolean validateId(String value);
}