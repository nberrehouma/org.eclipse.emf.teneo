/**
 * <copyright>
 * </copyright>
 *
 * $Id: ResrcFileValidator.java,v 1.1 2007/03/28 13:56:52 mtaal Exp $
 */
package lobj.validation;

import lobj.AccessControl;
import lobj.ResrcFiletype;
import lobj.ResrcMeta;
import lobj.Source;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link lobj.ResrcFile}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ResrcFileValidator {
	boolean validate();

	boolean validateFile(byte[] value);
	boolean validateFile_tn(byte[] value);
	boolean validateOriginalextension(String value);
	boolean validateFilesize(int value);
	boolean validateResrcHref(String value);
	boolean validateAccesscontrol(AccessControl value);
	boolean validateResrcFiletype(ResrcFiletype value);
	boolean validateSource(Source value);
	boolean validateHypertextContent(EList value);
	boolean validateResrcMeta(ResrcMeta value);
}