package com.techlabs.structural.decorator.ex2;

public class MeatSandwichDecorator extends SandwichDecorator{

	public MeatSandwichDecorator(ISandwich iSandwich) {
		super(iSandwich);
		description = "Turky";
		cost = 15;
	}

}
