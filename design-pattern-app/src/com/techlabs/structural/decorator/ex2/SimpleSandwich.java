package com.techlabs.structural.decorator.ex2;

public class SimpleSandwich implements ISandwich {

	String description = "Bread";

	float cost = 25;

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public float getCost() {
		return cost;
	}

}
