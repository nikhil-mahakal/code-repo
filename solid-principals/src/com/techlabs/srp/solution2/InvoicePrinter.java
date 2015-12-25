package com.techlabs.srp.solution2;

public class InvoicePrinter {
	
	public void printInvoice(Invoice invoice) {

		System.out.println("---\tINVOICE DETAILS\t---");
		System.out.println("Bill Amount : \t" + invoice.getBillAmount());
		System.out.println("Tax percantage : \t" + invoice.getTax() + "%");
		System.out.println("Tax : \t" + invoice.calculateTax());
		System.out.println("Total Bill Amount : \t" + invoice.calculateTotalBill());
	}

}
