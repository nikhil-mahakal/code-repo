package com.techlabs.behavioural.state.ex1;

public class NoQuarterState implements IState {

	GumballMachine gumballMachine;

	public NoQuarterState(GumballMachine gunballMachine) {

		this.gumballMachine = gunballMachine;
	}

	@Override
	public void insertQuarter() {

		System.out.println("You inserted a Quarter.");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}

	@Override
	public void ejectQuarter() {

		System.out.println("You Haven't inserted a Quarter.");
	}

	@Override
	public void turnCrank() {

		System.out.println("You Turned, but no Quarter.");
	}

	@Override
	public void dispense() {

		System.out.println("You need to pay First");
	}

	@Override
	public String toString() {
		return "waiting for quarter";
	}
}
