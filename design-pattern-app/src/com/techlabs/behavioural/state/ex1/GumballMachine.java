package com.techlabs.behavioural.state.ex1;

public class GumballMachine {

	IState soldOutState;
	IState noQuarterState;
	IState hasQuarterState;
	IState soldState;
	IState winnerState;

	IState state = soldOutState;
	int count = 0;

	public GumballMachine(int numberOfBalls) {
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		winnerState = new WinnerState(this);
		this.count = numberOfBalls;
		if (numberOfBalls > 0) {
			state = noQuarterState;
		}
	}

	public IState getWinnerState() {
		return winnerState;
	}

	public void insertQuarter() {

		state.insertQuarter();
	}

	public void ejectQuarter() {

		state.ejectQuarter();
	}

	public void turnCrank() {

		state.turnCrank();
		state.dispense();
	}

	void setState(IState state) {
		this.state = state;
	}

	void releaseBall() {
		System.out.println("A Gumball is rolling out of slot...");
		if (count != 0) {
			count = count - 1;
		}
	}

	public IState getSoldOutState() {
		return soldOutState;
	}

	public IState getNoQuarterState() {
		return noQuarterState;
	}

	public IState getHasQuarterState() {
		return hasQuarterState;
	}

	public IState getSoldState() {
		return soldState;
	}

	public IState getState() {
		return state;
	}

	public int getCount() {
		return count;
	}

	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2004");
		result.append("\nInventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is " + state + "\n");
		return result.toString();
	}

}
