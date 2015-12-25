package com.techlabs.behavioural.observer.ex1.test;

import com.techlabs.behavioural.observer.ex1.Account;

public class TestAccount {

	public static void main(String[] args) {
		Account account = new Account(5000, "nikhil");
		account.addAccountListener(new ATMScreen());
		account.addAccountListener(new MobileAppScreen());

		System.out.println(account);

		System.out.println("\nAfter Depositing 100$\n");

		account.deposit(100);
	}
}
