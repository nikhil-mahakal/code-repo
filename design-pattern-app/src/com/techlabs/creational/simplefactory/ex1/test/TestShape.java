package com.techlabs.creational.simplefactory.ex1.test;

import com.techlabs.creational.simplefactory.ex1.enums.ShapeType;
import com.techlabs.creational.simplefactory.ex1.factory.ShapeFactory;
import com.techlabs.creational.simplefactory.ex1.shapes.IShape;

public class TestShape {

	public static void main(String[] args) {
		IShape shape;

		shape = ShapeFactory.getInstance().createShape(ShapeType.CIRCLE);
		shape.draw();
		System.out.println("Class : "+shape.getClass());
		
		System.out.println("----------");
		
		shape = ShapeFactory.getInstance().createShape(ShapeType.RECTANGLE);
		shape.draw();
		System.out.println("Class : "+shape.getClass());
	}
}
