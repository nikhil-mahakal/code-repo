package com.techlabs.creational.factory.method.ex1;

class CommentPage extends Page{

	public CommentPage(String details) {
		super(details);
	}

	@Override
	public void load() {
		System.out.println("Loading..."+details);		
	}

}
