package com.techlabs.behavioural.template.ex1;

public abstract class CoffeTemplate {

	public final void prepareCoffe() {
		boilWater();
		addMilk();
		addSugar();
		addCoffePowder();
	}

	protected abstract void addCoffePowder();

	protected abstract void addSugar();

	protected abstract void addMilk();

	protected abstract void boilWater();
}
