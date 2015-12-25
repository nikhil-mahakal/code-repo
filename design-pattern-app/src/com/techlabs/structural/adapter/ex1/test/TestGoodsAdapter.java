package com.techlabs.structural.adapter.ex1.test;

import com.techlabs.structural.adapter.ex1.newvendor.DiscountPrinter;
import com.techlabs.structural.adapter.ex1.newvendor.Invoice;

public class TestGoodsAdapter {

	public static void main(String[] args) {
		DiscountPrinter discountPrinter = new DiscountPrinter();
		discountPrinter.printPDF(new Invoice("Java Book", 500));
		
		System.out.println("---------------");
		
		discountPrinter.printPDF(new GoodsAdapter("C++ Book", 2, 250));
	}
}
