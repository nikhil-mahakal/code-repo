package com.techlabs.srp.solution2;

public class Invoice {

	private double billAmount;
	private double tax;

	public Invoice(double billAmount, double tax) {
		super();
		this.billAmount = billAmount;
		this.tax = tax;
	}

	public double calculateTax() {

		return billAmount * (tax / 100);
	}

	public double calculateTotalBill() {

		return (billAmount) + (billAmount * (tax / 100));
	}

	public double getBillAmount() {
		return billAmount;
	}

	public double getTax() {
		return tax;
	}

}
