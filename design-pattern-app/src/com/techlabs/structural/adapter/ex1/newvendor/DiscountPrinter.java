package com.techlabs.structural.adapter.ex1.newvendor;

public class DiscountPrinter {

	public void printPDF(IDicountable dicountable){
		System.out.println("Product : "+dicountable.getDescription());
		System.out.println("Discount : "+dicountable.calculateDiscount());
	}
}
