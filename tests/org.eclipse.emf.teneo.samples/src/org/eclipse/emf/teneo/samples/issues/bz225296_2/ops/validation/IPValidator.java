/**
 * <copyright>
 * </copyright>
 *
 * $Id: IPValidator.java,v 1.1 2008/04/06 13:45:43 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.validation;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.Host;
import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IPName;
import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IpType;
import org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.VServer;

/**
 * A sample validator interface for {@link org.eclipse.emf.teneo.samples.issues.bz225296_2.ops.IP}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface IPValidator {
	boolean validate();

	boolean validateName(String value);
	boolean validateIp(String value);
	boolean validateHost(Host value);
	boolean validateType(IpType value);
	boolean validateId(long value);
	boolean validateModified(Date value);
	boolean validateRevision(int value);
	boolean validateShared(boolean value);
	boolean validateIpName(EList<IPName> value);
	boolean validateVserver(EList<VServer> value);
}
