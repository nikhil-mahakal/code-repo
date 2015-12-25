package com.techlabs.isp.solution1.test;

import com.techlabs.isp.solution1.IWorker;
import com.techlabs.isp.solution1.Manager;
import com.techlabs.isp.solution1.Robot;

public class TestISP {

	public static void main(String[] args) {
		IWorker worker = new Manager();

		worker.eat();
		worker.work();

		worker = new Robot();

		worker.eat();
		worker.work();

	}

}
