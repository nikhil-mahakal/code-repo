package com.techlabs.isp.solution1;

public class Robot implements IWorker {

	@Override
	public void eat() {
		throw new UnsupportedOperationException("I can't eat. ");
	}

	@Override
	public void work() {
		System.out.println("ROBOT is working");
	}

}
