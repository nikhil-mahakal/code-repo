package com.techlabs.behavioural.observer.ex1.test;

import com.techlabs.behavioural.observer.ex1.Account;
import com.techlabs.behavioural.observer.ex1.IAccountListner;

public class ATMScreen implements IAccountListner {

	@Override
	public void balanceChanged(Account account) {

		System.out.println("Refreshing ATM Screen");
		System.out.println(account);

	}

}
