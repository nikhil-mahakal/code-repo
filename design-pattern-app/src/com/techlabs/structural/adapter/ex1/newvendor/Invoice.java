package com.techlabs.structural.adapter.ex1.newvendor;

public class Invoice implements IDicountable {

	private String productName;
	private double billingAmmount;

	public Invoice(String productName, double billingAmmount) {
		this.productName = productName;
		this.billingAmmount = billingAmmount;
	}

	public String getProductName() {
		return productName;
	}

	public double getBillingAmmount() {
		return billingAmmount;
	}

	@Override
	public String getDescription() {

		return productName;
	}

	@Override
	public double calculateDiscount() {
		return billingAmmount*0.40;
	}

}
