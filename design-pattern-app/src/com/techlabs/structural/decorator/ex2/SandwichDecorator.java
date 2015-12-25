package com.techlabs.structural.decorator.ex2;

public abstract class SandwichDecorator implements ISandwich {

	protected ISandwich iSandwich;
	protected String description;
	protected float cost;

	public SandwichDecorator(ISandwich iSandwich) {
		this.iSandwich = iSandwich;
	}
	
	@Override
	public String getDescription() {
		return iSandwich.getDescription()+getFormatedDesc();
	}

	private String getFormatedDesc() {
		return " + "+description;
	}

	@Override
	public float getCost() {
		return iSandwich.getCost()+cost;
	}
	
}