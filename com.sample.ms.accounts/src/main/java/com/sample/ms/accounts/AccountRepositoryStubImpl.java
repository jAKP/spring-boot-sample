package com.sample.ms.accounts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

/**
 * @author Alok.Pandey
 *
 */
@Repository
public class AccountRepositoryStubImpl implements AccountRepository {

	private Map<String, Account> accountsByNumber = new HashMap<String, Account>();

	public AccountRepositoryStubImpl() {
		Account account = new Account(1000l, "property-1", "001");
		accountsByNumber.put("001", account);
		account = new Account(2000l, "property-2", "002");
		accountsByNumber.put("002", account);
		account = new Account(3000l, "property-3", "003");
		accountsByNumber.put("003", account);
		Logger.getLogger(AccountRepositoryStubImpl.class).info("Created StubAccountRepository");
	}

	@Override
	public List<Account> getAllAccounts() {
		return new ArrayList<Account>(accountsByNumber.values());
	}

	@Override
	public Account getAccount(String number) {
		return accountsByNumber.get(number);
	}

}
