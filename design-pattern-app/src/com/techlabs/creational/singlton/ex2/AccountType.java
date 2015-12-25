package com.techlabs.creational.singlton.ex2;

public enum AccountType {

	SA("Savings Account"), CA("Current Account");

	String description;

	private AccountType(String description) {

		this.description = description;
	}

	@Override
	public String toString() {
		return description;
	}
}
