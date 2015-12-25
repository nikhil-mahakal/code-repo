package com.techlabs.creational.simplefactory.ex1.factory;

import com.techlabs.creational.simplefactory.ex1.enums.ShapeType;
import com.techlabs.creational.simplefactory.ex1.shapes.Circle;
import com.techlabs.creational.simplefactory.ex1.shapes.IShape;
import com.techlabs.creational.simplefactory.ex1.shapes.Rectangle;
import com.techlabs.creational.simplefactory.ex1.shapes.Square;
import com.techlabs.creational.simplefactory.ex1.shapes.Triangle;

public class ShapeFactory {

	private static ShapeFactory temp;

	private ShapeFactory() {

	}

	public static ShapeFactory getInstance() {
		if (temp == null)
			temp = new ShapeFactory();

		return temp;

	}

	public IShape createShape(ShapeType type) {
		switch (type) {
		case CIRCLE:
			return new Circle();
		case RECTANGLE:
			return new Rectangle();
		case SQUAR:
			return new Square();
		case TRIANGLE:
			return new  Triangle();
		default:
			return null;
		}

	}
}
