/**
 * <copyright>
 * </copyright>
 *
 * $Id: FiltersValidator.java,v 1.1 2008/04/23 15:44:26 mtaal Exp $
 */
package org.eclipse.emf.teneo.hibernate.hbannotation.validation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.teneo.hibernate.hbannotation.Filter;

/**
 * A sample validator interface for {@link org.eclipse.emf.teneo.hibernate.hbannotation.Filters}.
 * This doesn't really do anything, and it's not a real EMF artifact. It was generated by the
 * org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can
 * be extended. This can be disabled with -vmargs
 * -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface FiltersValidator {
	boolean validate();

	boolean validateValue(EList<Filter> value);
}
