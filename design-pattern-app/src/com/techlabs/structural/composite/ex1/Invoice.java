package com.techlabs.structural.composite.ex1;

import java.util.ArrayList;
import java.util.List;

public class Invoice implements IOrderComponent {

	private String description;
	List<IOrderComponent> orderComponents;

	public Invoice(String description) {
		this.description = description;
		orderComponents = new ArrayList<IOrderComponent>();
	}

	public String getDescription() {
		return description;
	}

	public void addComponent(IOrderComponent component) {
		orderComponents.add(component);
	}

	@Override
	public void displayOrderInfo() {

		System.out.println("\nDisplaying Invoice Details Of : " + description);
		for (IOrderComponent iOrderComponent : orderComponents) {
			iOrderComponent.displayOrderInfo();
		}
	}

}
