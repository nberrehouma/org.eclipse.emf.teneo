/**
 * <copyright>
 * </copyright>
 *
 * $Id: EditionValidator.java,v 1.1 2007/03/28 13:56:51 mtaal Exp $
 */
package lobj.validation;

import java.util.Date;

/**
 * A sample validator interface for {@link lobj.Edition}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface EditionValidator {
	boolean validate();

	boolean validateEditionNr(String value);
	boolean validateEditedBy(String value);
	boolean validateVersion(boolean value);
	boolean validateLastVersionNumber(String value);
	boolean validateStatus(String value);
	boolean validateEditionCreationDate(Date value);
	boolean validateId(String value);
}
