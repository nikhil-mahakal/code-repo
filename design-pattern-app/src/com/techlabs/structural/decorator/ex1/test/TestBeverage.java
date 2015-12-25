package com.techlabs.structural.decorator.ex1.test;

import com.techlabs.structural.decorator.ex1.Beverage;
import com.techlabs.structural.decorator.ex1.DarkRoast;
import com.techlabs.structural.decorator.ex1.Espresso;
import com.techlabs.structural.decorator.ex1.HouseBlend;
import com.techlabs.structural.decorator.ex1.Mocha;
import com.techlabs.structural.decorator.ex1.Soy;
import com.techlabs.structural.decorator.ex1.Whip;

public class TestBeverage {

	public static void main(String args[]) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " $" + beverage.cost());

		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out
				.println(beverage2.getDescription() + " $" + beverage2.cost());

		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out
				.println(beverage3.getDescription() + " $" + beverage3.cost());
	}

}
