package com.techlabs.ocp.solution2.festive.rate;

public class DiwaliRate implements IFestiveRate {

	@Override
	public double getRate() {
		return 10;
	}

	@Override
	public String getDescription() {
		return "Diwali";
	}

}
