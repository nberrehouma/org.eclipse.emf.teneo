/**
 * <copyright>
 * </copyright>
 *
 * $Id: PAnnotatedEDataTypeValidator.java,v 1.1 2007/02/08 23:12:34 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pamodel.validation;

import org.eclipse.emf.ecore.EDataType;

import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEPackage;

import org.eclipse.emf.teneo.annotations.pannotation.Basic;
import org.eclipse.emf.teneo.annotations.pannotation.Enumerated;
import org.eclipse.emf.teneo.annotations.pannotation.GeneratedValue;
import org.eclipse.emf.teneo.annotations.pannotation.Id;
import org.eclipse.emf.teneo.annotations.pannotation.Lob;
import org.eclipse.emf.teneo.annotations.pannotation.Temporal;
import org.eclipse.emf.teneo.annotations.pannotation.Version;

/**
 * A sample validator interface for {@link org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEDataType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface PAnnotatedEDataTypeValidator {
	boolean validate();

	boolean validateAnnotatedEDataType(EDataType value);
	boolean validateBasic(Basic value);
	boolean validateEnumerated(Enumerated value);
	boolean validateGeneratedValue(GeneratedValue value);
	boolean validateId(Id value);
	boolean validateLob(Lob value);
	boolean validateTemporal(Temporal value);
	boolean validateVersion(Version value);
	boolean validatePaEPackage(PAnnotatedEPackage value);
}
