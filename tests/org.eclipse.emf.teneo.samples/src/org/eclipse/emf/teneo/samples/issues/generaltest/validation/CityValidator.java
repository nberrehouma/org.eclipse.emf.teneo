/**
 * <copyright>
 * </copyright>
 *
 * $Id: CityValidator.java,v 1.1 2007/07/04 19:29:56 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.generaltest.validation;


/**
 * A sample validator interface for {@link org.eclipse.emf.teneo.samples.issues.generaltest.City}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CityValidator {
	boolean validate();

	boolean validateName(String value);
}
