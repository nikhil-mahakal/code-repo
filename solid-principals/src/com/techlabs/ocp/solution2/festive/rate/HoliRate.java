package com.techlabs.ocp.solution2.festive.rate;

public class HoliRate implements IFestiveRate {

	@Override
	public double getRate() {
		return 11;
	}

	@Override
	public String getDescription() {
		return "Holi";
	}

}
