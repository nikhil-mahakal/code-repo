package com.techlabs.creational.factory.method.ex1;

class FirstBlogPage extends Page{

	public FirstBlogPage(String details) {
		super(details);
	}

	@Override
	public void load() {
		System.out.println("Loading..."+details);		
	}

}
