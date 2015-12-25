package com.techlabs.creational.enums.ex3;

public enum DirectionType {
	
	EAST("WEST"),WEST("EAST"),NORTH("SOUTH"),SOUTH("NORTH");
	
	String oppositeDirection;
	
	public DirectionType getOppositeDirection(){
		return DirectionType.valueOf(oppositeDirection);
	}

	private DirectionType(String oppositeDirection) {
		this.oppositeDirection=oppositeDirection;
	}
}
