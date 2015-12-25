package com.techlabs.behavioural.observer.ex1;

import java.util.ArrayList;
import java.util.List;

public class Account {

	private double balance;
	private String name;
	private List<IAccountListner> listOfListenrs;

	public Account(double balance, String name) {
		this.balance = balance;
		this.name = name;
		this.listOfListenrs = new ArrayList<IAccountListner>();
	}

	public double getBalance() {
		return balance;
	}

	public String getName() {
		return name;
	}

	public void deposit(double ammount){
		balance=balance+ammount;
		notifyAllAccountListenres();
	}
	
	public void notifyAllAccountListenres(){
		for (IAccountListner temp : listOfListenrs) {
			temp.balanceChanged(this);
			System.out.println("-----------------");
		}
	}
	
	public void addAccountListener(IAccountListner listner){
		listOfListenrs.add(listner);
	}
	
	@Override
	public String toString() {
		return String.format(" Account Holder : %s Balance : %s$",name,balance);
	}
}
