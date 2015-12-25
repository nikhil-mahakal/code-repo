package com.techlabs.structural.decorator.ex2.test;

import com.techlabs.structural.decorator.ex2.ISandwich;
import com.techlabs.structural.decorator.ex2.MeatSandwichDecorator;
import com.techlabs.structural.decorator.ex2.SimpleSandwich;
import com.techlabs.structural.decorator.ex2.SauceSandwichDecorator;

public class TestSandwich {
	public static void main(String[] args) {

		ISandwich sandwich = new SauceSandwichDecorator(new MeatSandwichDecorator(new SimpleSandwich()));
		
		System.out.println("Your Sandwich \t: "+sandwich.getDescription());
		System.out.println("Cost \t\t: "+sandwich.getCost()+"$");
		
		System.out.println("--------------------");

		sandwich = new SauceSandwichDecorator(new MeatSandwichDecorator(new MeatSandwichDecorator(new SimpleSandwich())));
		
		System.out.println("Your Sandwich \t: "+sandwich.getDescription());
		System.out.println("Cost \t\t: "+sandwich.getCost()+"$");
		
	}
}
