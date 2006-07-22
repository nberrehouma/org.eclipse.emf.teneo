/*
 *	Copyright 2005-2006, Elver.org (http://www.elver.org).
 *
 *	Licensed under the Apache License, Version 2.0 (the "License");
 *	you may not use this file except in compliance with the License.
 *	You may obtain a copy of the License at
 *
 *		http://www.apache.org/licenses/LICENSE-2.0
 *
 *	Unless required by applicable law or agreed to in writing, software
 *	distributed under the License is distributed on an "AS IS" BASIS,
 *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *	See the License for the specific language governing permissions and
 *	limitations under the License.
 */
package org.eclipse.emf.teneo.hibernate.test.emf.sample;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.eclipse.emf.teneo.hibernate.HbConstants;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.eclipse.emf.teneo.hibernate.test.stores.HibernateTestStore;
import org.eclipse.emf.teneo.test.AbstractActionTest;
import org.eclipse.emf.teneo.test.StoreTestException;
import org.eclipse.emf.teneo.test.emf.sample.AccountingAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests import export
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */
public class AccountingTest extends AbstractActionTest {

	private static AccountingAction testAction = new AccountingAction() {

		/** Import/export, from and to */
		protected void imTestExport(File fromFile, TestStore store) {
			try {
				// import
				HibernateTestStore hbTestStore = (HibernateTestStore) store;
				HbDataStore ds = hbTestStore.getEmfDataStore();
				
				ds.importDataStore(new FileInputStream(fromFile), HbConstants.EXCHANGE_FORMAT_XMI);

				// export
				ds.exportDataStore(new ByteArrayOutputStream(), HbConstants.EXCHANGE_FORMAT_XML, null);
			} catch (FileNotFoundException f) {
				throw new StoreTestException("File not found", f);
			}
		}
	};

	public AccountingTest() {
		super(testAction);
	}
}
