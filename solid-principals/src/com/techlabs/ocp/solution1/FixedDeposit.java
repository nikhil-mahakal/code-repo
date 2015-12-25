package com.techlabs.ocp.solution1;

public class FixedDeposit {

	private int principal;
	private int years;
	private FestiveType festival;

	public FixedDeposit(int principal, int years, FestiveType festival) {
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

	public FestiveType getFestival() {
		return festival;
	}

	public double calculateIntrest() {

		double rate = 0;

		switch (festival) {
		case DIWALI:
			rate = 10;
			break;

		case NEWYEAR:
			rate = 12;
			break;
		case HOLI:
			rate = 11;
			break;
		case NORMAL:
			rate = 8;
			break;
		}

		return (principal * years * (rate / 100));
	}
}
