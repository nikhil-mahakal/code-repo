package com.techlabs.creational.factory.method.ex1;

public abstract class Page {

	protected String details;

	public Page(String details) {
		this.details = details;
	}
	
	public String getDetails(){
		return details;
	}
	
	public abstract void load();
}
