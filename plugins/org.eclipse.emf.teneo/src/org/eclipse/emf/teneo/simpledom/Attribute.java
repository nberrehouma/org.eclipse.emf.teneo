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
 *   Martin Taal - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: Attribute.java,v 1.5 2007/02/08 23:14:41 mtaal Exp $
 */

package org.eclipse.emf.teneo.simpledom;

/**
 * This simple class is part of the replacement of dom4j.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.5 $
 */
public class Attribute extends Node {

	/** Constructor */
	public Attribute() {
		super();
	}

	/** Constructor */
	public Attribute(String name, String text) {
		setName(name);
		setText(text);
	}

	/** emit me */
	String emitXML() {
		return getName() + "=\"" + getText() + "\"";
	}
}