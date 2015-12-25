package com.techlabs.creational.factory.abstractmethod.ex1;

public abstract class CreditCardFactory {

	public static CreditCardFactory getFactory(int creditScore) {

		if (creditScore >= 1000)
			return new VisaFactory();

		return new AmericanExchangeFactory();
	}

	public abstract CreditCard getCreditCard(CardType cardType);

	public abstract IValidator getValidator(CardType cardType);
}
