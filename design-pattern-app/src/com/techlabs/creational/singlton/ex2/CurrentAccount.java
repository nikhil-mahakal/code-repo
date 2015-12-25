package com.techlabs.creational.singlton.ex2;

public class CurrentAccount extends Account {

	CurrentAccount(AccountType accountType) {
		super(accountType);
	}

	@Override
	public void withdraw(double ammount) {
		balance = balance - ammount;
		System.out.println("ammount withdrawn.");
	}

}
