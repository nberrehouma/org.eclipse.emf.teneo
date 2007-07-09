/**
 * <copyright>
 * </copyright>
 *
 * $Id: BookValidator.java,v 1.1 2007/07/09 12:55:20 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.library.validation;

import org.eclipse.emf.teneo.samples.emf.sample.library.BookCategory;
import org.eclipse.emf.teneo.samples.emf.sample.library.Writer;

/**
 * A sample validator interface for {@link org.eclipse.emf.teneo.samples.emf.sample.library.Book}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface BookValidator {
	boolean validate();

	boolean validateTitle(String value);
	boolean validatePages(int value);
	boolean validateCategory(BookCategory value);
	boolean validateAuthor(Writer value);
}
