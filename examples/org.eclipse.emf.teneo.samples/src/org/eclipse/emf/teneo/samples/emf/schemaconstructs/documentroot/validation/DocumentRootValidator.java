/**
 * <copyright>
 * </copyright>
 *
 * $Id: DocumentRootValidator.java,v 1.1 2009/07/27 22:12:04 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.documentroot.validation;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * A sample validator interface for {@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.documentroot.DocumentRoot}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DocumentRootValidator {
	boolean validate();

	boolean validateMixed(FeatureMap value);
	boolean validateXMLNSPrefixMap(EMap<String, String> value);
	boolean validateXSISchemaLocation(EMap<String, String> value);
	boolean validateOtherTest(String value);
	boolean validateTest(String value);
}