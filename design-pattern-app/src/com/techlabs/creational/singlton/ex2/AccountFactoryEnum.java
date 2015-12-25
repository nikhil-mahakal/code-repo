package com.techlabs.creational.singlton.ex2;

public enum AccountFactoryEnum {
	INSTANCE;

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
