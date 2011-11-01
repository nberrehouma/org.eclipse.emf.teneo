/**
 * <copyright>
 * </copyright>
 *
 * $Id: SpecificCustomerValidator.java,v 1.1 2007/11/15 14:48:27 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.validation;


/**
 * A sample validator interface for {@link org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.SpecificCustomer}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SpecificCustomerValidator {
	boolean validate();

	boolean validateSpecificName(String value);
}