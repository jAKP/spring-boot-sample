/**
 * 
 */
package com.sample.web;

import java.util.List;

/**
 * @author Alok.Pandey
 *
 */
public interface AccountRepository {

	List<Account> getAllAccounts();

	Account getAccount(String number);
}
