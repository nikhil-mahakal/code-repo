package com.techlabs.structural.proxy.ex1;

public abstract class Account {

	private int accountNumber;
	private String name;
	protected double balance;

	public Account(int accountNumber, String name, double balance) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}

	public void deposit(int amount) {
		balance += amount;
	}
	
	public void withdraw(int amount){
		balance=balance-amount;
	}
	
	public int getAccountNumber(){
		return accountNumber;
	}
	
	public String getName(){
		return name;
	}
	
	public double getBalance(){
		return balance;
	}
}
