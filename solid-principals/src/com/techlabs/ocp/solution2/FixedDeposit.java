package com.techlabs.ocp.solution2;

import com.techlabs.ocp.solution2.festive.rate.IFestiveRate;

public class FixedDeposit {

	private int principal;
	private int years;
	private IFestiveRate festival;

	public FixedDeposit(int principal, int years, IFestiveRate festival) {
		super();
		this.principal = principal;
		this.years = years;
		this.festival = festival;
	}

	public int getPrincipal() {
		return principal;
	}

	public int getYears() {
		return years;
	}

	public String getFestival() {
		return festival.getDescription();
	}

	public double calculateIntrest() {
		return (principal * years * (festival.getRate() / 100));
	}
}
