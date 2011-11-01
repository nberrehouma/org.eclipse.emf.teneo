/**
 * <copyright>
 * </copyright>
 *
 * $Id: DWHInstanceValidator.java,v 1.1 2008/04/06 13:45:43 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.validation;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.VServer;

/**
 * A sample validator interface for {@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DWHInstance}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DWHInstanceValidator {
	boolean validate();

	boolean validateId(long value);
	boolean validateName(String value);
	boolean validateEtl(EList<VServer> value);
	boolean validateModified(Date value);
	boolean validateRevision(int value);
	boolean validateDescription(String value);
}
