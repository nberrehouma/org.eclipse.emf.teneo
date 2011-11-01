/**
 * <copyright>
 * </copyright>
 *
 * $Id: GlobalAddressValidator.java,v 1.1 2007/02/08 23:09:24 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.epo2.validation;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link org.eclipse.emf.teneo.samples.emf.sample.epo2.GlobalAddress}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface GlobalAddressValidator {
	boolean validate();

	boolean validateLocation(EList<String> value);
}
