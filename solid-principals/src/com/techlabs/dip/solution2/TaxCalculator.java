package com.techlabs.dip.solution2;

public class TaxCalculator {

	private int income;
	private int rate;
	private IErrorLogger log;

	public TaxCalculator(int income, int rate, IErrorLogger log) {
		this.income = income;
		this.rate = rate;
		this.log = log;
	}

	public int getIncome() {
		return income;
	}

	public int getRate() {
		return rate;
	}

	public IErrorLogger getLog() {
		return log;
	}

	public double calulateTax() {
		try {
			return income / rate;
		} catch (Exception e) {
			log.log(e.getMessage());
		}
			return 0;
	}
}
