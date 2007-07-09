/**
 * <copyright>
 * </copyright>
 *
 * $Id: DateToCategoryMapEntryValidator.java,v 1.1 2007/07/09 12:55:19 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.emap.validation;

import java.util.Date;

import org.eclipse.emf.teneo.samples.emf.schemaconstructs.emap.Category;

/**
 * A sample validator interface for {@link java.util.Map.Entry}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DateToCategoryMapEntryValidator {
	boolean validate();

	boolean validateTypedKey(Date value);
	boolean validateTypedValue(Category value);
}
