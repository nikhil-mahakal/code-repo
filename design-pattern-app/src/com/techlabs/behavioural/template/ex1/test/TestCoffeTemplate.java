package com.techlabs.behavioural.template.ex1.test;

import com.techlabs.behavioural.template.ex1.BruCoffe;
import com.techlabs.behavioural.template.ex1.CoffeTemplate;
import com.techlabs.behavioural.template.ex1.NesCoffe;

public class TestCoffeTemplate {
	public static void main(String[] args) {

		CoffeTemplate coffe;
		
		coffe = new BruCoffe();
		coffe.prepareCoffe();
		
		System.out.println("------------");
		
		coffe = new NesCoffe();
		coffe.prepareCoffe();
		
	}
}
