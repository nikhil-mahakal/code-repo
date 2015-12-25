package com.techlabs.srp.solution1.test;

import com.techlabs.srp.solution1.Invoice;

public class TestInvoice {
	
	public static void main(String[] args) {
		
		Invoice invoice = new Invoice(5000, 2);
		
		invoice.printInvoice();
		
	}

}
