package com.techlabs.ocp.solution2.festive.rate;

public class NewYearRate implements IFestiveRate {

	@Override
	public double getRate() {
		return 12;
	}
	
	@Override
	public String getDescription() {
		return "New Year";
	}


}
