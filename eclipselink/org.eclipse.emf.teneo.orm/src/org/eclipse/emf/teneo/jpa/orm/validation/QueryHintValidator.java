/**
 * <copyright>
 * </copyright>
 *
 * $Id: QueryHintValidator.java,v 1.1 2009/07/23 11:16:28 mtaal Exp $
 */
package org.eclipse.emf.teneo.jpa.orm.validation;


/**
 * A sample validator interface for {@link org.eclipse.emf.teneo.jpa.orm.QueryHint}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface QueryHintValidator {
	boolean validate();

	boolean validateName(String value);
	boolean validateValue(String value);
}
