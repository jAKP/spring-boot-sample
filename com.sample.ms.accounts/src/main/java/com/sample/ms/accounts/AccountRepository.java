/**
 * 
 */
package com.sample.ms.accounts;

import java.util.List;

/**
 * @author Alok.Pandey
 *
 */
public interface AccountRepository {
	
	List<Account> getAllAccounts();
	
	Account getAccount(String number);
}
