package com.techlabs.structural.adapter.ex1.oldvendor;

public class Goods {

	private String name;
	private int quantity;
	private double unitprice;

	public Goods(String name, int quantity, double unitprice) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.unitprice = unitprice;
	}

	public String getName() {
		return name;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getUnitprice() {
		return unitprice;
	}

	public double calculateTotalPrice(){
		return quantity*unitprice;
	}
	
	public double getDiscount(){
		return calculateTotalPrice()*0.40;
	}
}
