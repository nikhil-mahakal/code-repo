package com.techlabs.structural.proxy.ex1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AccountProxy extends Account {

	public AccountProxy(int accountNumber, String name, double balance) {
		super(accountNumber, name, balance);
	}

	@Override
	public void deposit(int amount) {
		System.out.println("Before depositing : "+getTime());
		super.deposit(amount);
		System.out.println("After depositing : "+getTime());
	}

	@Override
	public void withdraw(int amount) {
		System.out.println("Before withdraw : "+getTime());
		super.withdraw(amount);
		System.out.println("After withdraw : "+getTime());
	}

	private String getTime() {

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");

		return dateFormat.format(new Date());
	}
}
