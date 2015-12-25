package com.techlabs.srp.solution2.test;

import com.techlabs.srp.solution2.Invoice;
import com.techlabs.srp.solution2.InvoicePrinter;

public class TestInvoice {

	public static void main(String[] args) {

		Invoice invoice = new Invoice(5000, 4);

		InvoicePrinter invoicePrinter2 = new InvoicePrinter();

		invoicePrinter2.printInvoice(invoice);
	}
}
