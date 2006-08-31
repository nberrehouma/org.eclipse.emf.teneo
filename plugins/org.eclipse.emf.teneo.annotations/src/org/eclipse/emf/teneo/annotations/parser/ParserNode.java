/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: ParserNode.java,v 1.2 2006/08/31 22:46:54 mtaal Exp $
 */

package org.eclipse.emf.teneo.annotations.parser;


/**
 * Main class of the nodes parsed by the annotation parser
 * 
 * @author <a href="mailto:mtaal at elver.org">Martin Taal</a>
 */
abstract class ParserNode {
	
	/** The name parsed */
	private String name = "value";

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}
