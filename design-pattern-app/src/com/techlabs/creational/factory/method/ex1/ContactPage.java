package com.techlabs.creational.factory.method.ex1;

class ContactPage extends Page{

	public ContactPage(String details) {
		super(details);
	}

	@Override
	public void load() {
		System.out.println("Loading..."+details);		
	}

}
