package com.techlabs.creational.singlton.ex1;

public enum ManagerEnum {
	INSTANCE;

	private ManagerEnum() {
		System.out.println("Manager in initiated...");
	}
}
