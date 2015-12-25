package com.techlabs.creational.factory.method.ex1;

class ItomPage extends Page {

	public ItomPage(String details) {
		super(details);
	}

	@Override
	public void load() {
		System.out.println("Loading..."+details);
	}

}
