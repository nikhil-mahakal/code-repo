package com.techlabs.creational.enums.ex2.test;

import com.techlabs.creational.enums.ex2.AnimalType;

public class TestAnimalType {
	public static void main(String[] args) {

		// test1();
		// test2();
		test3();

	}

	private static void test3() {

		AnimalType[] animalTypes = AnimalType.values();
		System.out.println("Animal \t| Mammal");
		System.out.println("--- \t| ---");

		for (AnimalType animalType : animalTypes) {
			System.out.println(animalType + " \t| " + animalType.isMammal());
		}

	}
/*
	private static void test2() {
		AnimalType current = AnimalType.DOG;
		System.out.println("current is mammal : " + current.isMammal());

		AnimalType other = AnimalType.FROG;
		System.out.println("other is mammal : " + other.isMammal());
	}

	private static void test1() {
		AnimalType current = AnimalType.DOG;
		System.out.println(System.identityHashCode(current));

		AnimalType other = AnimalType.FROG;
		System.out.println(System.identityHashCode(other));

		AnimalType other2 = AnimalType.DOG;
		System.out.println(System.identityHashCode(other2));
	}
*/}
