/**
 * <copyright>
 * </copyright>
 *
 * $Id: ManyToManyValidator.java,v 1.1 2009/07/23 11:16:29 mtaal Exp $
 */
package org.eclipse.emf.teneo.jpa.orm.validation;

import org.eclipse.emf.teneo.jpa.orm.CascadeType;
import org.eclipse.emf.teneo.jpa.orm.FetchType;
import org.eclipse.emf.teneo.jpa.orm.JoinTable;
import org.eclipse.emf.teneo.jpa.orm.MapKey;

/**
 * A sample validator interface for {@link org.eclipse.emf.teneo.jpa.orm.ManyToMany}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ManyToManyValidator {
	boolean validate();

	boolean validateOrderBy(String value);
	boolean validateMapKey(MapKey value);
	boolean validateJoinTable(JoinTable value);
	boolean validateCascade(CascadeType value);
	boolean validateFetch(FetchType value);
	boolean validateMappedBy(String value);
	boolean validateName(String value);
	boolean validateTargetEntity(String value);
}
