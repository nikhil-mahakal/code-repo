package com.techlabs.lsp.solution1.test;

import com.techlabs.lsp.solution1.Rectangle;
import com.techlabs.lsp.solution1.Square;

public class TestLSP {

	public static void main(String[] args) {

		Rectangle rectangle = getRectangleFromFactory();
		rectangle.setWidth(100);
		rectangle.setHeight(50);
		System.out.println("Area is : " + rectangle.calculateArea());
	}

	private static Rectangle getRectangleFromFactory() {
		int option = (int) (Math.random()*2);
		if (option == 1)
			return new Rectangle();
		else
			return new Square();
	}

}
