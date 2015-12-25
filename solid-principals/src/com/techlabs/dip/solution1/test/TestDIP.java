package com.techlabs.dip.solution1.test;

import com.techlabs.dip.solution1.LogType;
import com.techlabs.dip.solution1.TaxCalculator;

public class TestDIP {

	public static void main(String[] args) {
		TaxCalculator calculator = new TaxCalculator(26000, 0, LogType.EMAIL);
		System.out.println("Tax : " + calculator.calulateTax());

		System.out.println("------------------------------");

		calculator = new TaxCalculator(26000, 0, LogType.XML);
		System.out.println("Tax : " + calculator.calulateTax());
	}
}
