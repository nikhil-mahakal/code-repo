package com.techlabs.structural.decorator.ex2;

public class SauceSandwichDecorator extends SandwichDecorator{

	public SauceSandwichDecorator(ISandwich iSandwich) {
		super(iSandwich);
		description = "Mayo";
		cost = 10;
	}
}
