package com.techlabs.dip.solution2.test;

import com.techlabs.dip.solution2.EmailErrorLogger;
import com.techlabs.dip.solution2.TaxCalculator;
import com.techlabs.dip.solution2.XmlErrorLogger;


public class TestDIP {

	public static void main(String[] args) {
		TaxCalculator calculator = new TaxCalculator(26000, 0, new EmailErrorLogger());
		System.out.println("Tax : " + calculator.calulateTax());

		System.out.println("------------------------------");

		calculator = new TaxCalculator(26000, 0,new XmlErrorLogger());
		System.out.println("Tax : " + calculator.calulateTax());
	}
}
