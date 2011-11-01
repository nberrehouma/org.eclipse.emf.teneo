/**
 * <copyright>
 * </copyright>
 *
 * $Id: PresentationBlockValidator.java,v 1.1 2007/03/28 13:56:50 mtaal Exp $
 */
package lobj.validation;

import lobj.Block;

/**
 * A sample validator interface for {@link lobj.PresentationBlock}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface PresentationBlockValidator {
	boolean validate();

	boolean validateLod(int value);
	boolean validateRendering(String value);
	boolean validateBlock(Block value);
	boolean validateId(String value);
}