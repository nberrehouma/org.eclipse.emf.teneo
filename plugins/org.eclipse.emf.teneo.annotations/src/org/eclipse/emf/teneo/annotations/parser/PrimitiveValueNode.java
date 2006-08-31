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
 * $Id: PrimitiveValueNode.java,v 1.2 2006/08/31 22:46:54 mtaal Exp $
 */

package org.eclipse.emf.teneo.annotations.parser;


/**
 * Simple value node
 * 
 * @author <a href="mailto:mtaal at elver.org">Martin Taal</a>
 */
class PrimitiveValueNode extends ParserNode {

	/** The value */
	private String value;

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		// correct a small mistake in the tokenizer
		if (value != null && value.length() > 1 && value.charAt(0) == '"' && 
				value.charAt(value.length() - 1) == '"') {
			this.value = value.substring(1, value.length() - 1);
		} else {
			this.value = value;
		}
	}
}
