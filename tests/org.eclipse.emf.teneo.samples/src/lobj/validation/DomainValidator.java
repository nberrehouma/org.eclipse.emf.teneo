/**
 * <copyright>
 * </copyright>
 *
 * $Id: DomainValidator.java,v 1.1 2007/03/28 13:56:51 mtaal Exp $
 */
package lobj.validation;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link lobj.Domain}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DomainValidator {
	boolean validate();

	boolean validateName(String value);
	boolean validateDescription(String value);
	boolean validateBlocktypes(EList value);
	boolean validateCreationDate(Date value);
	boolean validateServerURL(String value);
	boolean validateId(String value);
}