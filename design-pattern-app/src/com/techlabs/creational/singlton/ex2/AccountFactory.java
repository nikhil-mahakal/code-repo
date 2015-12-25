package com.techlabs.creational.singlton.ex2;

public class AccountFactory {

	private static AccountFactory accountFactory;

	private AccountFactory() {
	}

	public static AccountFactory createInstance() {
		if (accountFactory == null) {
			accountFactory = new AccountFactory();
		}

		return accountFactory;
	}

	public Account createAccount(AccountType accountType) {
		switch (accountType) {
		case SA:
			return new SavingsAccount(accountType);

		case CA:
			return new CurrentAccount(accountType);

		default:
			return null;
		}
	}
}
