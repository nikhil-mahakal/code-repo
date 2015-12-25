package com.techlabs.dip.solution1;

public class TaxCalculator {

	private int income;
	private int rate;
	private LogType log;

	public TaxCalculator(int income, int rate, LogType log) {
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

	public LogType getLog() {
		return log;
	}

	public double calulateTax() {
		try {
			return income / rate;
		} catch (Exception e) {
			if (log == LogType.EMAIL) {
				EmailErrorLogger emailErrorLogger = new EmailErrorLogger();
				emailErrorLogger.log(e.getMessage());
			} else {
				XmlErrorLogger xmlErrorLogger = new XmlErrorLogger();
				xmlErrorLogger.log(e.getMessage());
			}

			return 0;
		}
	}
}
