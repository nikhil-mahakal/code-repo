package com.techlabs.creational.singlton.ex1.test;

import com.techlabs.creational.singlton.ex1.Manager;
import com.techlabs.creational.singlton.ex1.ManagerEnum;

public class TestManager {

	public static void main(String[] args) {

		test1();
		test2();
	}

	private static void test2() {

		ManagerEnum boss1 = ManagerEnum.INSTANCE;
		System.out.println(System.identityHashCode(boss1));
		
		ManagerEnum boss2 = ManagerEnum.INSTANCE;
		System.out.println(System.identityHashCode(boss2));
	}

	private static void test1() {
		Manager boss1 = Manager.getManager();
		System.out.println(System.identityHashCode(boss1));

		Manager boss2 = Manager.getManager();
		System.out.println(System.identityHashCode(boss2));		
	}

}