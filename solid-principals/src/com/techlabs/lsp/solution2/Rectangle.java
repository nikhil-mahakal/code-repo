package com.techlabs.lsp.solution2;

public class Rectangle implements IPolygon {

	private int width;
	private int height;
	
	public Rectangle(int width,int height) {

		this.width=width;
		this.height=height;
	}
	
	@Override
	public int calculateArea() {
		return width*height;
	}

}
