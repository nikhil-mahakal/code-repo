package com.techlabs.creational.factory.method.ex1;

class PaymentPage extends Page{

	public PaymentPage(String details) {
		super(details);
	}

	@Override
	public void load() {
		System.out.println("Loading..."+details);		
	}

}
