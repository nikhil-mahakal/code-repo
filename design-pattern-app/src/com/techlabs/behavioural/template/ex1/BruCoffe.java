package com.techlabs.behavioural.template.ex1;

public class BruCoffe extends CoffeTemplate {

	@Override
	protected void addCoffePowder() {

		System.out.println("Adding 100gm of Brue powder");
	}

	@Override
	protected void addSugar() {
		System.out.println("Adding Sugar");

	}

	@Override
	protected void addMilk() {
		System.out.println("Adding 1 ltr of milk");
	}

	@Override
	protected void boilWater() {
		System.out.println("Boiling 1 ltr of water");
	}

}
