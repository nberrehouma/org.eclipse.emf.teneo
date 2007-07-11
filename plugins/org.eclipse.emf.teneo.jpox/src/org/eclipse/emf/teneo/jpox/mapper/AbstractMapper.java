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
 * $Id: AbstractMapper.java,v 1.3 2007/07/11 14:43:06 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.mapper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.teneo.extension.ExtensionPoint;

/**
 * The abstract class for different mappers.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.3 $
 */

public class AbstractMapper implements ExtensionPoint {
	/** The logger for all these exceptions */
	protected static final Log log = LogFactory.getLog(AbstractMapper.class);

	/** The naming handler to handles names of columns */
	protected NamingHandler namingHandler;

	/** The mappingcontext */
	protected MappingContext mappingContext;

	/**
	 * @return the mappingContext
	 */
	public MappingContext getMappingContext() {
		return mappingContext;
	}

	/**
	 * @param mappingContext
	 *            the mappingContext to set
	 */
	public void setMappingContext(MappingContext mappingContext) {
		this.namingHandler = mappingContext.getNamingHandler();
		this.mappingContext = mappingContext;
	}
}