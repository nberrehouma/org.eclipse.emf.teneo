/**
 * <copyright>
 * </copyright>
 *
 * $Id: DomainValidator.java,v 1.1 2008/04/06 13:45:43 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.validation;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.DomainSystem;

/**
 * A sample validator interface for {@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Domain}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DomainValidator {
	boolean validate();

	boolean validateName(String value);
	boolean validateSystems(EList<DomainSystem> value);
	boolean validateId(long value);
	boolean validateModified(Date value);
	boolean validateRevision(int value);
}