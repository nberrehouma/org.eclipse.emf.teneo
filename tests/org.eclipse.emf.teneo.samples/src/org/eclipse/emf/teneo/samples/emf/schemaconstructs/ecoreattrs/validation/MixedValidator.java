/**
 * <copyright>
 * </copyright>
 *
 * $Id: MixedValidator.java,v 1.1 2007/02/08 23:09:17 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.validation;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * A sample validator interface for {@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.Mixed}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface MixedValidator {
	boolean validate();

	boolean validateMixed(FeatureMap value);
	boolean validateName(String value);
	boolean validateValue(double value);
}
