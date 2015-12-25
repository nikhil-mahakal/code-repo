package com.techlabs.isp.solution2.test;

import com.techlabs.isp.solution2.IEatable;
import com.techlabs.isp.solution2.IWorkable;
import com.techlabs.isp.solution2.Manager;
import com.techlabs.isp.solution2.Programmer;
import com.techlabs.isp.solution2.Robot;

public class TestISP {
	public static void main(String[] args) {

		System.out.println("--- Working Time ---\n");
		timeToWork();
		System.out.println("\n--- Lunch Time ---\n");
		lunchBreak();
	}

	private static void lunchBreak() {
		IEatable eatingWorker = new Programmer();
		eatingWorker.eat();

		eatingWorker = new Manager();
		eatingWorker.eat();

	}

	private static void timeToWork() {
		IWorkable worker = new Manager();
		worker.work();

		worker = new Robot();
		worker.work();

		worker = new Programmer();
		worker.work();

	}
}
