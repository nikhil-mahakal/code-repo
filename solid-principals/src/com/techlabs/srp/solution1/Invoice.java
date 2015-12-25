package com.techlabs.srp.solution1;

public class Invoice {

	private double billAmount;
	private double tax;

	public Invoice(double billAmount, double tax) {
		super();
		this.billAmount = billAmount;
		this.tax = tax;
	}

	public double calculateTax() {

		return billAmount*(tax/100);
	}

	public double calculateTotalBill() {

		return (billAmount)+(billAmount*(tax/100));
	}

	public void printInvoice() {

		System.out.println("---\tINVOICE DETAILS\t---");
		System.out.println("Bill Amount : \t"+billAmount);
		System.out.println("Tax percantage : \t"+tax+"%");
		System.out.println("Tax : \t"+calculateTax());
		System.out.println("Total Bill Amount : \t"+calculateTotalBill());
	}
}
