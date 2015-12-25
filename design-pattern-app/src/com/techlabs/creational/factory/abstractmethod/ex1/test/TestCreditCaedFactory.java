package com.techlabs.creational.factory.abstractmethod.ex1.test;

import com.techlabs.creational.factory.abstractmethod.ex1.CardType;
import com.techlabs.creational.factory.abstractmethod.ex1.CreditCard;
import com.techlabs.creational.factory.abstractmethod.ex1.CreditCardFactory;
import com.techlabs.creational.factory.abstractmethod.ex1.IValidator;

public class TestCreditCaedFactory {
	public static void main(String[] args) {

		CreditCardFactory cardFactory = CreditCardFactory.getFactory(800);

		System.out.println("Card Factory : "
				+ cardFactory.getClass().getSimpleName());

		CreditCard creditCard = cardFactory.getCreditCard(CardType.PLATINUM);

		System.out.println("Credit Card : "
				+ creditCard.getClass().getSimpleName());

		creditCard.setCardNo(11111);

		IValidator validator = cardFactory.getValidator(CardType.PLATINUM);

		System.out.println("Card Validator : "
				+ validator.getClass().getSimpleName());

		if (validator.validate(creditCard)) {
			System.out.println("Card is Valid ");
		} else {
			System.out.println("Card is not valid");
		}
	}
}
