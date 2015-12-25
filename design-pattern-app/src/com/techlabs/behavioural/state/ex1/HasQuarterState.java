package com.techlabs.behavioural.state.ex1;

import java.util.Random;

public class HasQuarterState implements IState {
	Random randomWinner = new Random(System.currentTimeMillis());
	GumballMachine gumballMachine;

	public HasQuarterState(GumballMachine gunballMachine) {

		this.gumballMachine = gunballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("You can't insert another quarter");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Quarter returned");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned...");
		int winner = randomWinner.nextInt(10);
		if ((winner == 0) && (gumballMachine.getCount() > 1)) {
			gumballMachine.setState(gumballMachine.getWinnerState());
		} else {
			gumballMachine.setState(gumballMachine.getSoldState());
		}
	}

	@Override
	public void dispense() {
		System.out.println("No gumball dispensed");
	}

	@Override
	public String toString() {
		return "waiting for turn of crank";
	}
}
