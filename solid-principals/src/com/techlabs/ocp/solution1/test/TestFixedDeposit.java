package com.techlabs.ocp.solution1.test;

import com.techlabs.ocp.solution1.FestiveType;
import com.techlabs.ocp.solution1.FixedDeposit;

public class TestFixedDeposit {

	public static void main(String[] args) {

		FixedDeposit deposit = new FixedDeposit(100000, 5, FestiveType.DIWALI);
		System.out.println("Principal : \t" + deposit.getPrincipal());
		System.out.println("Years : \t" + deposit.getYears());
		System.out.println("Festival : \t" + deposit.getFestival());
		System.out.println("Intrest : \t" + deposit.calculateIntrest());
		System.out.println("-----------------");
		System.out.println("Total Amount you get after '" + deposit.getYears()
				+ "' years is '"
				+ (deposit.getPrincipal() + deposit.calculateIntrest()) + "'");
	}

}
