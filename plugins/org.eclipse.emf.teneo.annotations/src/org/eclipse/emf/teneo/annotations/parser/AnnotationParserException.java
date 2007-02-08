/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: AnnotationParserException.java,v 1.4 2007/02/08 23:12:34 mtaal Exp $
 */

package org.eclipse.emf.teneo.annotations.parser;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Is thrown in the org.eclipse.emf.teneo.annotations.parser package. Takes care
 * of logging the cause.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.4 $
 */

public class AnnotationParserException extends RuntimeException {
	/**
	 * Serial id
	 */
	private static final long serialVersionUID = 4685665979865102829L;

	/**
	 * The constructor, logs the exception also
	 */
	public AnnotationParserException(String msg, Throwable cause) {
		super(msg, cause);

		// and log it, note the logger is recreated to automatically
		// log for subclasses.
		final Log log = LogFactory.getLog(this.getClass());
		log.error(msg, cause);
	}

	/**
	 * The constructor, logs the exception also
	 */
	public AnnotationParserException(String msg) {
		super(msg);

		// and log it, note the logger is recreated to automatically
		// log for subclasses.
		final Log log = LogFactory.getLog(this.getClass());
		log.error(msg, this);
	}
}
