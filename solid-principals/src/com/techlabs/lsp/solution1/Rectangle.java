package com.techlabs.lsp.solution1;

public class Rectangle {

	protected int width;
	protected int height;

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int calculateArea(){
		return width*height;
	}
}
