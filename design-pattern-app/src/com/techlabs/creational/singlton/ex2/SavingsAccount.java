package com.techlabs.creational.singlton.ex2;

public class SavingsAccount extends Account {

	SavingsAccount(AccountType accountType) {
		super(accountType);
	}

	@Override
	public void withdraw(double ammount) {

		if (balance - ammount >= 500) {
			balance = balance - ammount;
			System.out.println("ammount withdrawn.");
		} else {
			System.out.println("Insufficeint balance : " + balance
					+ "$ can not withdraw : " + ammount + "$");
		}

	}

}
