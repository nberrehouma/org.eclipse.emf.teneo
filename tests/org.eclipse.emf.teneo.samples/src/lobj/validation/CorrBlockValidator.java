/**
 * <copyright>
 * </copyright>
 *
 * $Id: CorrBlockValidator.java,v 1.1 2007/03/28 13:56:52 mtaal Exp $
 */
package lobj.validation;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link lobj.CorrBlock}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CorrBlockValidator {
	boolean validate();

	boolean validatePresentationBlock(EList value);
	boolean validateTitleMeta(EList value);
	boolean validateId(String value);
}