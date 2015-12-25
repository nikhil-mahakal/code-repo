package com.techlabs.creational.singlton.ex1;

public class Manager {

	private static Manager temp;

	private Manager() {
		System.out.println("Manager in initiated...");
	}
	
	public static Manager getManager(){
		if (temp==null) {
			temp= new Manager();
		}
		return temp;
	}
}
