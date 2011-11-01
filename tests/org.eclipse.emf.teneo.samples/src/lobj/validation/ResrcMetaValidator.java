/**
 * <copyright>
 * </copyright>
 *
 * $Id: ResrcMetaValidator.java,v 1.1 2007/03/28 13:56:52 mtaal Exp $
 */
package lobj.validation;

import java.util.Date;

/**
 * A sample validator interface for {@link lobj.ResrcMeta}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ResrcMetaValidator {
	boolean validate();

	boolean validateFilename(String value);
	boolean validateParameters(String value);
	boolean validateHeight(int value);
	boolean validateWidth(int value);
	boolean validateCreationDate(Date value);
	boolean validateLastModified(Date value);
	boolean validateTitle(String value);
	boolean validateDescription(String value);
	boolean validateKeywords(String value);
}