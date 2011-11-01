/**
 * <copyright>
 * </copyright>
 *
 * $Id: AccountingValidator.java,v 1.1 2007/02/08 23:09:18 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.accounting.validation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.teneo.samples.emf.sample.accounting.AccountGroup;
import org.eclipse.emf.teneo.samples.emf.sample.accounting.BalanceAccount;
import org.eclipse.emf.teneo.samples.emf.sample.accounting.JournalGroup;
import org.eclipse.emf.teneo.samples.emf.sample.accounting.Report;
import org.eclipse.emf.teneo.samples.emf.sample.accounting.Vat;

/**
 * A sample validator interface for {@link org.eclipse.emf.teneo.samples.emf.sample.accounting.Accounting}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface AccountingValidator {
	boolean validate();

	boolean validateName(String value);
	boolean validateAccountGroup(EList<AccountGroup> value);
	boolean validateVat(EList<Vat> value);
	boolean validateVatAccount(BalanceAccount value);
	boolean validateReport(Report value);
	boolean validateJournalGroup(EList<JournalGroup> value);
}
