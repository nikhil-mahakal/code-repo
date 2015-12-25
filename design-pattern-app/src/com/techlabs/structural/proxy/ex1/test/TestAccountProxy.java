package com.techlabs.structural.proxy.ex1.test;

import com.techlabs.structural.proxy.ex1.AccountProxy;

public class TestAccountProxy {
	public static void main(String[] args) {
		AccountProxy accountProxy = new AccountProxy(101, "nikhil", 5000);
		accountProxy.deposit(100);
		System.out.println(accountProxy.getBalance());
		
		accountProxy.withdraw(500);
		System.out.println(accountProxy.getBalance());
		
	}
}
