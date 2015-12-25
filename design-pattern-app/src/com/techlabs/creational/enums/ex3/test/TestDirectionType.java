package com.techlabs.creational.enums.ex3.test;

import com.techlabs.creational.enums.ex3.DirectionType;

public class TestDirectionType {

	public static void main(String[] args) {

		DirectionType direction = DirectionType.EAST;

		System.out
				.println("Direction : " + direction
						+ " \tOpposite direction : "
						+ direction.getOppositeDirection());

		direction = DirectionType.NORTH;

		System.out
				.println("Direction : " + direction
						+ " \tOpposite direction : "
						+ direction.getOppositeDirection());

	}

}
