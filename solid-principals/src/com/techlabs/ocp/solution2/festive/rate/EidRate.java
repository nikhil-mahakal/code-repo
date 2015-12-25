package com.techlabs.ocp.solution2.festive.rate;

public class EidRate implements IFestiveRate {

	@Override
	public double getRate() {
		return 13;
	}

	@Override
	public String getDescription() {
		return "EID";
	}

}
