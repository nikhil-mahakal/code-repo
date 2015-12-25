package com.techlabs.structural.composite.ex1.test;

import com.techlabs.structural.composite.ex1.Invoice;
import com.techlabs.structural.composite.ex1.LineItoms;

public class TestInvoice {

	private static Invoice mainInvoice;

	public static void main(String[] args) {
		createInvoice();
		mainInvoice.displayOrderInfo();
	}

	private static void createInvoice() {

		mainInvoice = new Invoice("Main Invoice");

		
		Invoice bookInvoice = new Invoice("Book Invoice");
		
		bookInvoice.addComponent(new LineItoms(101, "c++", 2, 500));
		bookInvoice.addComponent(new LineItoms(101, "java", 1, 600));
		bookInvoice.addComponent(new LineItoms(101, "oracle", 3, 400));
		
		
		Invoice mobileInvoice = new Invoice("Mobile Invoice");

		mobileInvoice.addComponent(new LineItoms(123, "nokia 1100", 1, 5000));
		mobileInvoice.addComponent(new LineItoms(124, "nokia 2320", 2, 2000));
		mobileInvoice.addComponent(new LineItoms(125, "nokia 550", 5, 1000));
		
		
		Invoice smartPhoneInvoice = new Invoice("Smart Phone Invoice");
		smartPhoneInvoice.addComponent(new LineItoms(301, "Iphone 5", 2, 35000));
		smartPhoneInvoice.addComponent(new LineItoms(302, "Iphone 6", 3, 40000));
		smartPhoneInvoice.addComponent(new LineItoms(303, "Iphone 6S", 1, 60000));

		
		mobileInvoice.addComponent(smartPhoneInvoice);
		
		
		mainInvoice.addComponent(bookInvoice);
		mainInvoice.addComponent(mobileInvoice);
		

	}

}
