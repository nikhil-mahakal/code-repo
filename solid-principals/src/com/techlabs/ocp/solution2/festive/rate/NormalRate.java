package com.techlabs.ocp.solution2.festive.rate;

public class NormalRate implements IFestiveRate {

	@Override
	public double getRate() {
		return 8;
	}
	
	@Override
	public String getDescription() {
		return "Normal";
	}


}
