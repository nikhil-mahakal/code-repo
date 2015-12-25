package com.techlabs.behavioural.template.ex1;

public class NesCoffe extends CoffeTemplate {

	@Override
	protected void addCoffePowder() {

		System.out.println("Adding 200gm of NesCaffe powder");
	}

	@Override
	protected void addSugar() {
		System.out.println("Adding Sugar");

	}

	@Override
	protected void addMilk() {
		System.out.println("Adding 2 ltr of milk");
	}

	@Override
	protected void boilWater() {
		System.out.println("Boiling 2 ltr of water");
	}

}
