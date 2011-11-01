/**
 * <copyright>
 * </copyright>
 *
 * $Id: GeneratedValueValidator.java,v 1.1 2009/07/23 11:16:28 mtaal Exp $
 */
package org.eclipse.emf.teneo.jpa.orm.validation;

import org.eclipse.emf.teneo.jpa.orm.GenerationType;

/**
 * A sample validator interface for {@link org.eclipse.emf.teneo.jpa.orm.GeneratedValue}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface GeneratedValueValidator {
	boolean validate();

	boolean validateGenerator(String value);
	boolean validateStrategy(GenerationType value);
}
