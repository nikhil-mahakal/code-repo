package com.techlabs.structural.composite.ex1;

public class LineItoms implements IOrderComponent {

	private int id;
	private String name;
	private int quantity;
	private double unitprice;

	public LineItoms(int id, String name, int quantity, double price) {
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.unitprice = price;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getPrice() {
		return unitprice;
	}

	@Override
	public void displayOrderInfo() {
		System.out.println("  Id : " + id + " Name : " + name + " Quantity : "
				+ quantity + " Unit price : " + unitprice);
	}

}
