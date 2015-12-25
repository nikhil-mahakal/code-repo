package com.techlabs.creational.factory.method.ex1;

class CartPage extends Page{

	public CartPage(String details) {
		super(details);
	}

	@Override
	public void load() {
		System.out.println("Loading..."+details);	
	}

}
