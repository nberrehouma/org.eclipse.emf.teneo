/**
 * <copyright>
 * </copyright>
 *
 * $Id: ChildrenBooksValidator.java,v 1.1 2007/12/13 06:52:44 mtaal Exp $
 */
package com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.validation;

import com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.PublisherDefinition;

/**
 * A sample validator interface for {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.ChildrenBooks}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ChildrenBooksValidator {
	boolean validate();

	boolean validateTitle(String value);
	boolean validateCartoon(String value);
	boolean validatePopup(String value);
	boolean validatePublisherDefinitionRef(PublisherDefinition value);
}
