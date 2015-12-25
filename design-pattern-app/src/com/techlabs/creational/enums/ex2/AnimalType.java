package com.techlabs.creational.enums.ex2;

public enum AnimalType {

	HUMAN(true), DOG(true), FROG(false);

	boolean mammal;

	public boolean isMammal() {
		return mammal;
	}

	private AnimalType(boolean mammal) {
		this.mammal = mammal;
	}

	
	// public boolean isMammal() {
	//
	// if (this==AnimalType.DOG || this==AnimalType.HUMAN) {
	// return true;
	// }
	// return false;
	// }
}
