package com.techlabs.behavioural.state.ex1.test;

import com.techlabs.behavioural.state.ex1.GumballMachine;

public class TestGumballMachine {

	public static void main(String[] args) {
		GumballMachine gumballMachine = 
				new GumballMachine(10);

			System.out.println(gumballMachine);

			gumballMachine.insertQuarter();
			gumballMachine.turnCrank();
			gumballMachine.insertQuarter();
			gumballMachine.turnCrank();

			System.out.println(gumballMachine);

			gumballMachine.insertQuarter();
			gumballMachine.turnCrank();
			gumballMachine.insertQuarter();
			gumballMachine.turnCrank();

			System.out.println(gumballMachine);

			gumballMachine.insertQuarter();
			gumballMachine.turnCrank();
			gumballMachine.insertQuarter();
			gumballMachine.turnCrank();

			System.out.println(gumballMachine);

			gumballMachine.insertQuarter();
			gumballMachine.turnCrank();
			gumballMachine.insertQuarter();
			gumballMachine.turnCrank();

			System.out.println(gumballMachine);

			gumballMachine.insertQuarter();
			gumballMachine.turnCrank();
			gumballMachine.insertQuarter();
			gumballMachine.turnCrank();

			System.out.println(gumballMachine);
	}
}
