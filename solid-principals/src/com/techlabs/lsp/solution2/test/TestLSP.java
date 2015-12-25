package com.techlabs.lsp.solution2.test;

import com.techlabs.lsp.solution2.IPolygon;
import com.techlabs.lsp.solution2.Rectangle;
import com.techlabs.lsp.solution2.Square;

public class TestLSP {

	public static void main(String[] args) {
		IPolygon iPolygon = getPolygonFromFactory();
		System.out.println("Area : " + iPolygon.calculateArea());
	}

	private static IPolygon getPolygonFromFactory() {
		int option = (int) (Math.random()*2);
		if (option == 1)
			return new Rectangle(100, 50);
		else
			return new Square(100);
	}

}
