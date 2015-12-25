package com.techlabs.creational.singlton.ex2.test;

import com.techlabs.creational.singlton.ex2.Account;
import com.techlabs.creational.singlton.ex2.AccountFactory;
import com.techlabs.creational.singlton.ex2.AccountFactoryEnum;
import com.techlabs.creational.singlton.ex2.AccountType;

public class TestAccount {
	public static void main(String[] args) {
		test1();
		test2();
	}

	private static void test2() {

		Account account = AccountFactoryEnum.INSTANCE.createAccount(
				AccountType.CA);
		account.setId(101);
		account.setName("nikhil");
		account.setBalance(5000);

		System.out.println(account);
		account.deposit(500);
		System.out.println(account);
		account.withdraw(5400);
		System.out.println(account);
		
		System.out.println("--------------");

		account = AccountFactoryEnum.INSTANCE.createAccount(
				AccountType.SA);
		account.setId(101);
		account.setName("nikhil");
		account.setBalance(5000);

		System.out.println(account);
		account.deposit(500);
		System.out.println(account);
		account.withdraw(5400);
		System.out.println(account);
		
	}

	private static void test1() {
		Account account = AccountFactory.createInstance().createAccount(
				AccountType.CA);
		account.setId(101);
		account.setName("nikhil");
		account.setBalance(5000);

		System.out.println(account);
		account.deposit(500);
		System.out.println(account);
		account.withdraw(5400);
		System.out.println(account);

		System.out.println("--------------");

		account = AccountFactory.createInstance().createAccount(AccountType.SA);
		account.setId(101);
		account.setName("nikhil");
		account.setBalance(5000);

		System.out.println(account);
		account.deposit(500);
		System.out.println(account);
		account.withdraw(5400);
		System.out.println(account);

	}
}
