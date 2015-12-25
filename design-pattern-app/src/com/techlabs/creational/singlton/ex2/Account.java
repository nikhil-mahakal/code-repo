package com.techlabs.creational.singlton.ex2;

public abstract class Account {

	private int id;
	private String name;
	protected double balance;
	private AccountType accountType;

	public Account(AccountType accountType) {
		this.accountType = accountType;
	}

	public abstract void withdraw(double ammount);

	public void deposit(double ammount) {
		balance = balance + ammount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	@Override
	public String toString() {
		return String.format("Name : %s \tId : %s \tBalance : %s",name,id,balance);
	}
}
