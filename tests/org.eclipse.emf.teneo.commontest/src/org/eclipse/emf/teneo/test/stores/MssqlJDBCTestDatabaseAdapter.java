/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: MssqlJDBCTestDatabaseAdapter.java,v 1.4 2008/02/28 07:08:13 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.stores;

/**
 * Overrides geturl to add specific ms string: ;DatabaseName=
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.4 $
 */

public class MssqlJDBCTestDatabaseAdapter extends BaseTestDatabaseAdapter {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.teneo.test.stores.TestDatabaseAdapter#getDbUrl()
	 */
	public String getDbUrl() {
		return dbUrl + ";DatabaseName=" + dbName + ";SelectMethod=cursor";
	}
}